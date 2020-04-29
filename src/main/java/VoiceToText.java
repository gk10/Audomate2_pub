package main.java;

//looking at cloud.google.com/speech-to-text/docs/streaming-recognize
import com.google.api.gax.rpc.ClientStream;
import com.google.api.gax.rpc.ResponseObserver;
import com.google.api.gax.rpc.StreamController;
import com.google.cloud.speech.v1.*;
import com.google.protobuf.ByteString;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;

public class VoiceToText {

	public static String cTrans = "";
	public static String fTrans = "";
	public static boolean check = false;

	public static String newStreaming() {

		cTrans = "";
		fTrans = "";

		TargetDataLine targetDataline = null;
		AudioInputStream audio = null;

		try {
			int sampleRate = 16000;
			AudioFormat format = new AudioFormat(sampleRate, 16, 1, true, false);
			DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);

			targetDataline = (TargetDataLine) AudioSystem.getLine(info);
			targetDataline.open(format);
			targetDataline.start();

			audio = new AudioInputStream(targetDataline);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		try (SpeechClient speechClient = SpeechClient.create()) {

			ResponseObserver<StreamingRecognizeResponse> responseObserver = new ResponseObserver<StreamingRecognizeResponse>() {

				public void onResponse(StreamingRecognizeResponse response) {
					StreamingRecognitionResult result = response.getResultsList().get(0);
					SpeechRecognitionAlternative alternative = result.getAlternativesList().get(0);
					System.out.println(alternative.getTranscript());
					cTrans = alternative.getTranscript();
					cTrans = cTrans.toLowerCase();
					String tmp = cTrans.startsWith(" ") ? cTrans.substring(1) : cTrans;
					//System.out.println("CTRANS: "+ cTrans);
					if ((tmp.substring(0, tmp.indexOf(" ")).compareTo("okay") == 0) || tmp.compareTo("okay") == 0 || tmp.compareTo("Okay") == 0) {
						
						tmp = tmp.substring(5);
						System.out.println(tmp);
						fTrans += tmp + " ";
					}
				}

				@Override
				public void onComplete() {
					// TODO Auto-generated method stub

				}

				@Override
				public void onStart(StreamController controller) {
					// TODO Auto-generated method stub

				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub

				}
			};

			ClientStream<StreamingRecognizeRequest> clientStream = speechClient.streamingRecognizeCallable()
					.splitCall(responseObserver);

			RecognitionConfig recConfig = RecognitionConfig.newBuilder()
					.setEncoding(RecognitionConfig.AudioEncoding.LINEAR16).setLanguageCode("en-US")
					.setSampleRateHertz(16000).build();
			StreamingRecognitionConfig config = StreamingRecognitionConfig.newBuilder().setConfig(recConfig)
					.setSingleUtterance(false).build();

			StreamingRecognizeRequest request = StreamingRecognizeRequest.newBuilder().setStreamingConfig(config)
					.build();

			clientStream.send(request);

			while (true) {
				byte[] data = new byte[1000];
				try {
					audio.read(data);
				} catch (IOException e) {
					System.out.println(e);
				}
				request = StreamingRecognizeRequest.newBuilder().setAudioContent(ByteString.copyFrom(data)).build();
				clientStream.send(request);

				cTrans = cTrans.toLowerCase();
				if (cTrans.contains("stop")) {
					// System.out.println("Final Trans: " + fTrans.substring(0, fTrans.length()
					// -6));
					responseObserver.onComplete();
					clientStream.closeSend();
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return fTrans.substring(0, fTrans.length());
	}
}
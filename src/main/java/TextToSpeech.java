package main.java;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextToSpeech {
	public TextToSpeech(String s) {
		speech(s);
	}

	public void speech(String say) {
		System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
		Voice voice;
		VoiceManager voicem = VoiceManager.getInstance();
		voice = voicem.getVoice("kevin16");
		voice.allocate();
		voice.speak(say);
	}
}

package main.java;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import generate.sources.*;
import generate.sources.AudomateParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) throws Exception {
		Map<String, AudomateParser.TestingContext> vars = new HashMap<String, AudomateParser.TestingContext>();
		Map<String, String> tasks = new HashMap<String, String>();
		ArrayList<String> parts = new ArrayList<String>();
		String machine = "192.168.0.38";
		// Map<String, LangParser.ProgContext> variables = new HashMap<String,
		// LangParser.ProgContext>();
		new VoiceToText();
		while (true) {

			try {
//				String s = VoiceToText.newStreaming();
//				s = s.toLowerCase();
//
//				
//				if(s.substring(s.length()-1).equals(" ")) {
//					s = s.substring(0, s.length() -1);
//				}
//				System.out.println("?"+s);
				Scanner in = new Scanner(System.in);
				String s = in.nextLine();

				CharStream input = CharStreams.fromString(s);
				AudomateLexer lexer = new AudomateLexer(input);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				AudomateParser parser = new AudomateParser(tokens);
				AudomateParser.ProgContext tree = parser.prog();
				String result = new ExpressionVisitor3(vars, tasks, parts, machine).visit(tree);
				System.out.println("=> " + result.toString());
				new TextToSpeech(result.toString());
			} catch (Exception e) {
				System.out.println("An error occured");
				new TextToSpeech("An error occured");
			}
			// in.close();

		}
	}
}

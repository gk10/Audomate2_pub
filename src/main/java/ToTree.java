package main.java;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import generate.sources.AudomateLexer;
import generate.sources.AudomateParser;

public class ToTree {
	String in;
	public ToTree(String s) {
		in = s;
	}
	public AudomateParser.TestingContext toContext(){
		CharStream input = CharStreams.fromString(in);
		AudomateLexer lexer = new AudomateLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		AudomateParser parser = new AudomateParser(tokens);
		AudomateParser.TestingContext tree = parser.testing();
		return tree;
	}
}

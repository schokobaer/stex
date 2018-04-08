package at.andreasfend.stex.parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import at.andreasfend.stex.parser.antlr4.StexgrammarLexer;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser;

public class Parser {
	
	public ParseTree parse(String sourceCode) {
		ANTLRInputStream input = new ANTLRInputStream(sourceCode);
		StexgrammarLexer lexer = new StexgrammarLexer(input);
		CommonTokenStream tokenstream = new CommonTokenStream(lexer);
		StexgrammarParser parser = new StexgrammarParser(tokenstream);
				
		ParseTree tree = parser.program();
				
		return tree;
	}
	
}

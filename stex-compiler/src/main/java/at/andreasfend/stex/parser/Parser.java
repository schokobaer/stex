package at.andreasfend.stex.parser;

import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import at.andreasfend.stex.core.Instruction;
import at.andreasfend.stex.parser.antlr4.StexgrammarLexer;
import at.andreasfend.stex.parser.antlr4.StexgrammarParser;

public class Parser {

	public static void main(String[] args) throws IOException {
		ANTLRInputStream input = new ANTLRFileStream("C:\\Users\\Andreas\\stex\\stex-compiler\\src\\test\\resources\\parsing\\onefunction.stex");
		StexgrammarLexer lexer = new StexgrammarLexer(input);
		CommonTokenStream tokenstream = new CommonTokenStream(lexer);
		StexgrammarParser parser = new StexgrammarParser(tokenstream);
		
		System.out.println();
		
		ParseTree tree = parser.program();
		
		
		List<Instruction> program = new StexVisitor().visit(tree);
		
		for (Instruction instruction : program) {
			System.out.println(instruction);
		}
		
		
	}
	
	public ParseTree parse(String sourceCode) {
		ANTLRInputStream input = new ANTLRInputStream(sourceCode);
		StexgrammarLexer lexer = new StexgrammarLexer(input);
		CommonTokenStream tokenstream = new CommonTokenStream(lexer);
		StexgrammarParser parser = new StexgrammarParser(tokenstream);
				
		ParseTree tree = parser.program();
		
		return tree;
	}
	
}

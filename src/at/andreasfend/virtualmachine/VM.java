package at.andreasfend.virtualmachine;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import at.andreasfend.virtualmachine.lex.Lexer;
import at.andreasfend.virtualmachine.lex.Token;
import at.andreasfend.virtualmachine.parser.Function;
import at.andreasfend.virtualmachine.parser.Parser;

public class VM {

	public static void main(String[] args) {
		args = new String[] { "D:\\Workspace\\VirtualMachine\\res\\program.amf" };
		
		
		
		try {
			String input = new String(Files.readAllBytes(Paths.get(args[0])));
			
			Lexer lexer = new Lexer();
			List<Token> tokens =  lexer.lex(input);
			Parser parser = new Parser();
			List<Function> functions = parser.parse(tokens);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}

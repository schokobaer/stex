package at.andreasfend.stex.parser.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Test;

import at.andreasfend.stex.lexer.Lexer;
import at.andreasfend.stex.lexer.Token;
import at.andreasfend.stex.parser.Parser;
import at.andreasfend.stex.parser.node.Function;

public class SimpleParserTest {

	
	private String read(String source) throws IOException {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(source).getFile());
		return new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
	}
	
	@Test
	public void oneFunction() throws IOException {
		String input = read("parsing/onefunction.stex");
		
		Lexer lexer = new Lexer();
		List<Token> tokens = lexer.analyze(input);
		
		Parser parser = new Parser();
		List<Function> funcs = parser.parse(tokens);
		System.out.println(funcs);
	}
}

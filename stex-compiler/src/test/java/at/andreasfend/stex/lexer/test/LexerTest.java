package at.andreasfend.stex.lexer.test;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Test;

import at.andreasfend.stex.lexer.Lexer;
import at.andreasfend.stex.lexer.Lexical;
import at.andreasfend.stex.lexer.Token;

public class LexerTest {

	private String read(String source) throws IOException {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(source).getFile());
		return new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
	}
	
	private boolean checkTokens(List<Token> result, Lexical[] expected) {
		
		//if(result.size() != expected.length)
		//	return false;
		
		for (int i = 0; i < expected.length; i++) {
			if(result.get(i).getLexical() != expected[i])
				return false;
		}
		
		return true;
	}
	
	@Test
	public void values() {
		String input = "\"Er sagte:\\\"Guten Tag!\\\"\"";
		String number = "([0-9])+(\\.([0-9])+)?";
		String bool = "(true|false)";
		String nil = "null";
		String string = "\\\"([^\\\"]|\\\\\")*\\\"";		
		String pattern = "(" + number + "|" + bool + "|" + nil + "|" + string + ")";
		
		boolean match = input.matches(string);
		
		assertTrue(match);
	}
	
	@Test
	public void stex1() throws IOException {
		String input = read("lexing/keywords.stex");
		
		Lexer lexer = new Lexer();
		List<Token> result = lexer.analyze(input);
		
		Lexical[] expected = { 
				Lexical.ID, Lexical.KlammerAuf, Lexical.ID, Lexical.KlammerZu, Lexical.GKlammerAuf,
				Lexical.VAR, Lexical.ID, Lexical.EQUALS, Lexical.VAL, Lexical.SEMICOLON,
				Lexical.VAR, Lexical.ID, Lexical.EQUALS, Lexical.VAL, Lexical.SEMICOLON,
				Lexical.VAR, Lexical.ID, Lexical.EQUALS, Lexical.EKlammerAuf, Lexical.EKlammerZu, Lexical.SEMICOLON,
				Lexical.VAR, Lexical.ID, Lexical.EQUALS, Lexical.GKlammerAuf,
				Lexical.ID, Lexical.EQUALS, Lexical.VAL, Lexical.KOMMA,
				Lexical.ID, Lexical.EQUALS, Lexical.VAL,
				Lexical.GKlammerZu, Lexical.SEMICOLON,
				Lexical.IF, Lexical.KlammerAuf, Lexical.ID, Lexical.BIGGER, Lexical.ID, Lexical.KlammerZu, Lexical.GKlammerAuf,
				Lexical.ID, Lexical.KlammerAuf, Lexical.VAL, Lexical.KlammerZu, Lexical.SEMICOLON,
				Lexical.GKlammerZu,
				Lexical.WHILE, Lexical.KlammerAuf, Lexical.VAL, Lexical.NOTEQUALS, Lexical.VAL, Lexical.KlammerZu, Lexical.GKlammerAuf,
				Lexical.TRY, Lexical.GKlammerAuf,
				Lexical.GKlammerZu,
				Lexical.CATCH, Lexical.KlammerAuf, Lexical.ID, Lexical.KlammerZu, Lexical.GKlammerAuf,
				Lexical.GKlammerZu, Lexical.GKlammerZu, Lexical.RETURN, Lexical.ID, Lexical.SEMICOLON, Lexical.GKlammerZu
		};
		assertTrue(checkTokens(result, expected));
	}
	
	@Test
	public void lexFloat() throws IOException {
		String input = "var a = 12.34;";
				
		Lexer lexer = new Lexer();
		List<Token> result = lexer.analyze(input);
		
		Lexical[] expected = { Lexical.VAR, Lexical.ID, Lexical.EQUALS, Lexical.VAL, Lexical.SEMICOLON };
		assertTrue(checkTokens(result, expected));
	}
	
	@Test
	public void lexObj() throws IOException {
		String input = "var obj = { };\nobj.alter=12;";
				
		Lexer lexer = new Lexer();
		List<Token> result = lexer.analyze(input);
		
		Lexical[] expected = { Lexical.VAR, Lexical.ID, Lexical.EQUALS, Lexical.GKlammerAuf, Lexical.GKlammerZu,
				Lexical.SEMICOLON, Lexical.ID, Lexical.DOT, Lexical.ID, Lexical.EQUALS, Lexical.VAL, Lexical.SEMICOLON
				};
		assertTrue(checkTokens(result, expected));		
	}
	
	@Test
	public void lexStringVal() throws IOException {
		String input = "var obj = \"Frohe Ostern\";";
				
		Lexer lexer = new Lexer();
		List<Token> result = lexer.analyze(input);
		
		Lexical[] expected = { Lexical.VAR, Lexical.ID, Lexical.EQUALS, Lexical.VAL, Lexical.SEMICOLON };
		assertTrue(checkTokens(result, expected));
	}
	
	@Test
	public void multiWhitespaces() throws IOException {
		String input = "var   obj = { };\n obj.alter=12;";
				
		Lexer lexer = new Lexer();
		List<Token> result = lexer.analyze(input);
		
		Lexical[] expected = { Lexical.VAR, Lexical.ID, Lexical.EQUALS, Lexical.GKlammerAuf, Lexical.GKlammerZu,
				Lexical.SEMICOLON, Lexical.ID, Lexical.DOT, Lexical.ID, Lexical.EQUALS, Lexical.VAL, Lexical.SEMICOLON
				};
		assertTrue(checkTokens(result, expected));
		
		
	}
	
}

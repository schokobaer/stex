package at.andreasfend.virtualmachine.lex;

import java.util.ArrayList;
import java.util.List;

public class Lexer {

	private Lexical[] lexes = Lexical.values();
	
	public List<Token> lex(String input) throws Exception {
		List<Token> tokens = new ArrayList<>();
		
		while(input.length() > 0) {
			Token token = new Token();
						
			int i = 1;
			while(i <= input.length()) {
				String part = input.substring(0, i);
				char letter = input.charAt(i-1);
				
				// Check if letter is a breaker
				if(letter == ' ' || letter == '\n' || letter == '\r' || letter == '\t') {
					if(token.isValid()) {
						token.setValue(part);
						tokens.add(token);
					}
					break;
				}
				
				// Check wich pattern is matching on part
				boolean foundLexical = false;
				boolean foundKeyword = false;
				for (Lexical lexical : lexes) {
					if(part.matches(lexical.getPattern())) {
						foundLexical = true;
						token.setLexical(lexical);
						if(lexical != Lexical.ID && lexical != Lexical.VAL)
							foundKeyword = true;
						break;
					}
				}
				
				if(foundKeyword) {
					token.setValue(part);
					tokens.add(token);
					break;
				}
				
				// No Lexical is matching => Error
				if(!foundLexical) {
					if(!token.isValid())
						throw new Exception("No matching for " + part);
					
					i--;
					part = input.substring(0, i);
					token.setValue(part);
					tokens.add(token);
					break;
				}
				
				i++;
			}
			input = input.substring(i);
		}
		
		return tokens;
	}
	
}

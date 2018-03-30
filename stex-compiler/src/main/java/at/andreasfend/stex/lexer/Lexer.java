package at.andreasfend.stex.lexer;

import java.util.ArrayList;
import java.util.List;

public class Lexer {

	private Lexical[] lexes = Lexical.values();
		
	public List<Token> analyze(String input) {
		List<Token> tokens = new ArrayList<>();
		
		while(input.length() > 0) {
			
			int i = 1;
			while(i <= input.length()) {
				String part = input.substring(0, i);
				char letter = input.charAt(i-1);
				
				// Check if letter is a breaker, then we found a new Token
				if(letter == ' ' || letter == '\n' || letter == '\r' || letter == '\t') {
					if(i == 1)
						break;
					part = input.substring(0, i-1);
					Lexical lexical = matching(part);
					if(lexical != null) {
						Token token = new Token();
						token.setLexical(lexical);
						token.setValue(part);
						tokens.add(token);
						break;
					}
				}
				
				Lexical lexical = matching(part);
				if(lexical == null) {
					part = input.substring(0, i-1);
					lexical = matching(part);
					if(lexical != null && !(lexical == Lexical.VAL && letter == '.')) {	
						Token token = new Token();
						token.setLexical(lexical);
						token.setValue(part);
						tokens.add(token);
						i--;
						break;
					}
				}
				
				i++;
			}

			if(i > input.length())
				break;
			input = input.substring(i);
		}
		
		if(input.length() > 0) {
			Lexical lexical = matching(input);
			if(lexical == null)
				throw new RuntimeException("No matching starting with: " + input);
			Token token = new Token();
			token.setLexical(lexical);
			token.setValue(input);
			tokens.add(token);
		}
		
		return tokens;
	}
	
	private Lexical matching(String input) {
		for (Lexical lexical : lexes) {
			if(input.matches(lexical.getPattern())) {
				return lexical;
			}
		}
		return null;
	}
	
}

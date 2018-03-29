package at.andreasfend.stex.lexer;

public class Token {
	private Lexical lexical;
	private String value;
	private boolean valid = false;
	
	
	public Lexical getLexical() {
		return lexical;
	}
	public void setLexical(Lexical lexical) {
		this.lexical = lexical;
		this.valid = true;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public boolean isValid() {
		return valid;
	}

	
	@Override
	public String toString() {
		return lexical.name();
	}
	
	
}

package at.andreasfend.stex.lexer;

public enum Lexical {

	KlammerAuf("\\("),
	KlammerZu("\\)"),
	GKlammerAuf("\\{"),
	GKlammerZu("\\}"),
	EKlammerAuf("\\["),
	EKlammerZu("\\]"),
	
	VAR("var"),
	CONST("const"),
	IF("if"),
	AND("and"),
	OR("or"),
	WHILE("while"),
	RETURN("return"),
	
	EQUALS("="),
	SEMICOLON(";"),
	KOMMA(","),
	
	PLUS("\\+"),
	MINUS("\\-"),
	MAL("\\*"),
	DIV("/"),
	MOD("%"),
	BIGGER(">"),
	SMALLER("<"),
	NOTEQUALS("!="),
	
	VAL("(([0-9])+(\\.([0-9])+)?|true|false)"),
	ID("([A-Z]|[a-z])+([A-Z]|[a-z]|[0-9])*"),
	;
	
	private String pattern;
	
	Lexical(String pattern) {
		this.pattern = pattern;
	}
	
	public String getPattern() {
		return this.pattern;
	}
}

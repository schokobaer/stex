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
	NOT("not"),
	IN("in"),
	WHILE("while"),
	RETURN("return"),
	TRY("try"),
	CATCH("catch"),
	
	
	EQUALS("="),
	SEMICOLON(";"),
	KOMMA(","),
	DOT("\\."),
	
	PLUS("\\+"),
	MINUS("\\-"),
	MAL("\\*"),
	DIV("/"),
	MOD("%"),
	REF("&"),
	DREF("\\?"),
	BIGGER(">"),
	SMALLER("<"),
	NOTEQUALS("!="),
	
	VAL("(" + "([0-9])+(\\.([0-9])+)?" + // "([0-9])+(\\.([0-9])+)?" 
			"|" + "(true|false)" +
			"|" + "null" +
			"|" + "\\\"([^\\\"]|\\\\\")*\\\"" + ")"),
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

// Generated from Stexgrammar.g4 by ANTLR 4.3

	package at.andreasfend.stex.parser.antlr4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StexgrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__31=1, T__30=2, T__29=3, T__28=4, T__27=5, T__26=6, T__25=7, T__24=8, 
		T__23=9, T__22=10, T__21=11, T__20=12, T__19=13, T__18=14, T__17=15, T__16=16, 
		T__15=17, T__14=18, T__13=19, T__12=20, T__11=21, T__10=22, T__9=23, T__8=24, 
		T__7=25, T__6=26, T__5=27, T__4=28, T__3=29, T__2=30, T__1=31, T__0=32, 
		WHITESPACE=33, VAL=34, ID=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'"
	};
	public static final String[] ruleNames = {
		"T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24", 
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "WHITESPACE", 
		"VAL", "ID"
	};


	public StexgrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Stexgrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00ef\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\6\"\u00ac\n\"\r\"\16\"\u00ad"+
		"\3\"\3\"\3#\6#\u00b3\n#\r#\16#\u00b4\3#\3#\6#\u00b9\n#\r#\16#\u00ba\5"+
		"#\u00bd\n#\3#\6#\u00c0\n#\r#\16#\u00c1\3#\3#\6#\u00c6\n#\r#\16#\u00c7"+
		"\5#\u00ca\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u00d5\n#\3#\3#\3#\3#\3#\3#"+
		"\7#\u00dd\n#\f#\16#\u00e0\13#\3#\5#\u00e3\n#\3$\6$\u00e6\n$\r$\16$\u00e7"+
		"\3$\7$\u00eb\n$\f$\16$\u00ee\13$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\7\5\2\13\f\17\17"+
		"\"\"\3\2\62;\5\2$$))``\4\2C\\c|\5\2\62;C\\c|\u00fc\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2"+
		"\2\7Q\3\2\2\2\tX\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17c\3\2\2\2\21e\3\2\2"+
		"\2\23g\3\2\2\2\25i\3\2\2\2\27l\3\2\2\2\31n\3\2\2\2\33r\3\2\2\2\35t\3\2"+
		"\2\2\37v\3\2\2\2!x\3\2\2\2#z\3\2\2\2%\u0080\3\2\2\2\'\u0084\3\2\2\2)\u0086"+
		"\3\2\2\2+\u0088\3\2\2\2-\u008b\3\2\2\2/\u008d\3\2\2\2\61\u008f\3\2\2\2"+
		"\63\u0092\3\2\2\2\65\u0094\3\2\2\2\67\u0097\3\2\2\29\u009c\3\2\2\2;\u009e"+
		"\3\2\2\2=\u00a2\3\2\2\2?\u00a4\3\2\2\2A\u00a8\3\2\2\2C\u00ab\3\2\2\2E"+
		"\u00e2\3\2\2\2G\u00e5\3\2\2\2IJ\7\61\2\2J\4\3\2\2\2KL\7e\2\2LM\7c\2\2"+
		"MN\7v\2\2NO\7e\2\2OP\7j\2\2P\6\3\2\2\2QR\7t\2\2RS\7g\2\2ST\7v\2\2TU\7"+
		"w\2\2UV\7t\2\2VW\7p\2\2W\b\3\2\2\2XY\7#\2\2YZ\7?\2\2Z\n\3\2\2\2[\\\7="+
		"\2\2\\\f\3\2\2\2]^\7y\2\2^_\7j\2\2_`\7k\2\2`a\7n\2\2ab\7g\2\2b\16\3\2"+
		"\2\2cd\7}\2\2d\20\3\2\2\2ef\7?\2\2f\22\3\2\2\2gh\7\177\2\2h\24\3\2\2\2"+
		"ij\7k\2\2jk\7h\2\2k\26\3\2\2\2lm\7A\2\2m\30\3\2\2\2no\7v\2\2op\7t\2\2"+
		"pq\7{\2\2q\32\3\2\2\2rs\7(\2\2s\34\3\2\2\2tu\7*\2\2u\36\3\2\2\2vw\7,\2"+
		"\2w \3\2\2\2xy\7.\2\2y\"\3\2\2\2z{\7v\2\2{|\7j\2\2|}\7t\2\2}~\7q\2\2~"+
		"\177\7y\2\2\177$\3\2\2\2\u0080\u0081\7x\2\2\u0081\u0082\7c\2\2\u0082\u0083"+
		"\7t\2\2\u0083&\3\2\2\2\u0084\u0085\7]\2\2\u0085(\3\2\2\2\u0086\u0087\7"+
		">\2\2\u0087*\3\2\2\2\u0088\u0089\7?\2\2\u0089\u008a\7?\2\2\u008a,\3\2"+
		"\2\2\u008b\u008c\7_\2\2\u008c.\3\2\2\2\u008d\u008e\7@\2\2\u008e\60\3\2"+
		"\2\2\u008f\u0090\7q\2\2\u0090\u0091\7t\2\2\u0091\62\3\2\2\2\u0092\u0093"+
		"\7\'\2\2\u0093\64\3\2\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2\u0096"+
		"\66\3\2\2\2\u0097\u0098\7g\2\2\u0098\u0099\7n\2\2\u0099\u009a\7u\2\2\u009a"+
		"\u009b\7g\2\2\u009b8\3\2\2\2\u009c\u009d\7+\2\2\u009d:\3\2\2\2\u009e\u009f"+
		"\7c\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7f\2\2\u00a1<\3\2\2\2\u00a2\u00a3"+
		"\7-\2\2\u00a3>\3\2\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7"+
		"\7v\2\2\u00a7@\3\2\2\2\u00a8\u00a9\7/\2\2\u00a9B\3\2\2\2\u00aa\u00ac\t"+
		"\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\"\2\2\u00b0D\3\2\2\2"+
		"\u00b1\u00b3\t\3\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00bc\3\2\2\2\u00b6\u00b8\13\2\2\2"+
		"\u00b7\u00b9\t\3\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00c0\t\3\2\2\u00bf\u00be\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c9\3\2\2\2\u00c3\u00c5\13\2\2\2\u00c4\u00c6\t\3\2\2\u00c5\u00c4\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00e3\3\2"+
		"\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7w\2\2\u00ce\u00d5"+
		"\7g\2\2\u00cf\u00d0\7h\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7n\2\2\u00d2"+
		"\u00d3\7u\2\2\u00d3\u00d5\7g\2\2\u00d4\u00cb\3\2\2\2\u00d4\u00cf\3\2\2"+
		"\2\u00d5\u00e3\3\2\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9"+
		"\7n\2\2\u00d9\u00e3\7n\2\2\u00da\u00de\7$\2\2\u00db\u00dd\t\4\2\2\u00dc"+
		"\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\7$\2\2\u00e2"+
		"\u00b2\3\2\2\2\u00e2\u00d4\3\2\2\2\u00e2\u00d6\3\2\2\2\u00e2\u00da\3\2"+
		"\2\2\u00e3F\3\2\2\2\u00e4\u00e6\t\5\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ec\3\2\2\2\u00e9"+
		"\u00eb\t\6\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00edH\3\2\2\2\u00ee\u00ec\3\2\2\2\22\2\u00ad"+
		"\u00b4\u00ba\u00bc\u00c1\u00c7\u00c9\u00d4\u00dc\u00de\u00e2\u00e5\u00e7"+
		"\u00ea\u00ec\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
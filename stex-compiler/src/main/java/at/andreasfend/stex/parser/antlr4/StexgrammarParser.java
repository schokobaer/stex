// Generated from Stexgrammar.g4 by ANTLR 4.3

	package at.andreasfend.stex.parser.antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StexgrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__32=1, T__31=2, T__30=3, T__29=4, T__28=5, T__27=6, T__26=7, T__25=8, 
		T__24=9, T__23=10, T__22=11, T__21=12, T__20=13, T__19=14, T__18=15, T__17=16, 
		T__16=17, T__15=18, T__14=19, T__13=20, T__12=21, T__11=22, T__10=23, 
		T__9=24, T__8=25, T__7=26, T__6=27, T__5=28, T__4=29, T__3=30, T__2=31, 
		T__1=32, T__0=33, WHITESPACE=34, VAL=35, ID=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'catch'", "'return'", "'!='", "';'", "'while'", "'{'", 
		"'='", "'}'", "'if'", "'?'", "'try'", "'&'", "'('", "'*'", "','", "'.'", 
		"'throw'", "'var'", "'['", "'<'", "'=='", "']'", "'>'", "'or'", "'%'", 
		"'in'", "'else'", "')'", "'and'", "'+'", "'not'", "'-'", "WHITESPACE", 
		"VAL", "ID"
	};
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_paramlist = 2, RULE_statement = 3, 
		RULE_ifstatement = 4, RULE_elseblock = 5, RULE_trystatement = 6, RULE_catchblock = 7, 
		RULE_whilestatement = 8, RULE_throwstatement = 9, RULE_returnstatement = 10, 
		RULE_assignstatement = 11, RULE_varstatement = 12, RULE_expression = 13, 
		RULE_expressionop = 14, RULE_operand = 15, RULE_identifier = 16, RULE_arrayaccess = 17, 
		RULE_object = 18, RULE_objectfield = 19, RULE_array = 20, RULE_functioncall = 21, 
		RULE_functioncallargs = 22, RULE_ref = 23, RULE_deref = 24, RULE_operation = 25, 
		RULE_notoperation = 26, RULE_operationtype = 27, RULE_assignee = 28;
	public static final String[] ruleNames = {
		"program", "function", "paramlist", "statement", "ifstatement", "elseblock", 
		"trystatement", "catchblock", "whilestatement", "throwstatement", "returnstatement", 
		"assignstatement", "varstatement", "expression", "expressionop", "operand", 
		"identifier", "arrayaccess", "object", "objectfield", "array", "functioncall", 
		"functioncallargs", "ref", "deref", "operation", "notoperation", "operationtype", 
		"assignee"
	};

	@Override
	public String getGrammarFileName() { return "Stexgrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StexgrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58); function();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StexgrammarParser.ID, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(ID);
			setState(64); match(T__19);
			setState(65); paramlist();
			setState(66); match(T__4);
			setState(67); match(T__26);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68); statement();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(73); match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamlistContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(StexgrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StexgrammarParser.ID, i);
		}
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterParamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitParamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitParamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paramlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(75); match(ID);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(76); match(T__17);
					setState(77); match(ID);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TrystatementContext trystatement() {
			return getRuleContext(TrystatementContext.class,0);
		}
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public AssignstatementContext assignstatement() {
			return getRuleContext(AssignstatementContext.class,0);
		}
		public ReturnstatementContext returnstatement() {
			return getRuleContext(ReturnstatementContext.class,0);
		}
		public ThrowstatementContext throwstatement() {
			return getRuleContext(ThrowstatementContext.class,0);
		}
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public VarstatementContext varstatement() {
			return getRuleContext(VarstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			switch (_input.LA(1)) {
			case T__23:
				{
				setState(85); ifstatement();
				}
				break;
			case T__21:
				{
				setState(86); trystatement();
				}
				break;
			case T__27:
				{
				setState(87); whilestatement();
				}
				break;
			case T__15:
				{
				setState(88); throwstatement();
				}
				break;
			case T__30:
				{
				setState(89); returnstatement();
				}
				break;
			case T__22:
			case ID:
				{
				setState(90); assignstatement();
				}
				break;
			case T__14:
				{
				setState(91); varstatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstatementContext extends ParserRuleContext {
		public ElseblockContext elseblock() {
			return getRuleContext(ElseblockContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(T__23);
			setState(95); match(T__19);
			setState(96); expression();
			setState(97); match(T__4);
			setState(98); match(T__26);
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99); statement();
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(105);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(104); match(T__24);
				}
			}

			setState(107); elseblock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseblockContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ElseblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterElseblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitElseblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitElseblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseblockContext elseblock() throws RecognitionException {
		ElseblockContext _localctx = new ElseblockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elseblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(T__5);
			setState(110); match(T__26);
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111); statement();
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(116); match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrystatementContext extends ParserRuleContext {
		public CatchblockContext catchblock() {
			return getRuleContext(CatchblockContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TrystatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trystatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterTrystatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitTrystatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitTrystatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrystatementContext trystatement() throws RecognitionException {
		TrystatementContext _localctx = new TrystatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_trystatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(T__21);
			setState(119); match(T__26);
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120); statement();
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(125); match(T__24);
			setState(126); catchblock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchblockContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StexgrammarParser.ID, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public CatchblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterCatchblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitCatchblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitCatchblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchblockContext catchblock() throws RecognitionException {
		CatchblockContext _localctx = new CatchblockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_catchblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(T__31);
			setState(129); match(T__19);
			setState(130); match(ID);
			setState(131); match(T__4);
			setState(132); match(T__26);
			setState(134); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(133); statement();
				}
				}
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(138); match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilestatementContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterWhilestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitWhilestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitWhilestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whilestatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(T__27);
			setState(141); match(T__19);
			setState(142); expression();
			setState(143); match(T__4);
			setState(144); match(T__26);
			setState(146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145); statement();
				}
				}
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(150); match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowstatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterThrowstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitThrowstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitThrowstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowstatementContext throwstatement() throws RecognitionException {
		ThrowstatementContext _localctx = new ThrowstatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_throwstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); match(T__15);
			setState(153); expression();
			setState(154); match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnstatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterReturnstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitReturnstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitReturnstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstatementContext returnstatement() throws RecognitionException {
		ReturnstatementContext _localctx = new ReturnstatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(T__30);
			setState(157); expression();
			setState(158); match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignstatementContext extends ParserRuleContext {
		public AssigneeContext assignee() {
			return getRuleContext(AssigneeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterAssignstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitAssignstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitAssignstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignstatementContext assignstatement() throws RecognitionException {
		AssignstatementContext _localctx = new AssignstatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); assignee();
			setState(161); match(T__25);
			setState(162); expression();
			setState(163); match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarstatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StexgrammarParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterVarstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitVarstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitVarstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarstatementContext varstatement() throws RecognitionException {
		VarstatementContext _localctx = new VarstatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(T__14);
			setState(166); match(ID);
			setState(169);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(167); match(T__25);
				setState(168); expression();
				}
			}

			setState(171); match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ArrayaccessContext arrayaccess() {
			return getRuleContext(ArrayaccessContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(173); functioncall();
				}
				break;

			case 2:
				{
				setState(174); operation();
				}
				break;

			case 3:
				{
				setState(175); operand();
				}
				break;

			case 4:
				{
				setState(176); arrayaccess();
				}
				break;

			case 5:
				{
				setState(177); deref();
				}
				break;

			case 6:
				{
				setState(178); object();
				}
				break;

			case 7:
				{
				setState(179); array();
				}
				break;

			case 8:
				{
				setState(180); ref();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionopContext extends ParserRuleContext {
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public ArrayaccessContext arrayaccess() {
			return getRuleContext(ArrayaccessContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ExpressionopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterExpressionop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitExpressionop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitExpressionop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionopContext expressionop() throws RecognitionException {
		ExpressionopContext _localctx = new ExpressionopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressionop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(183); functioncall();
				}
				break;

			case 2:
				{
				setState(184); operand();
				}
				break;

			case 3:
				{
				setState(185); arrayaccess();
				}
				break;

			case 4:
				{
				setState(186); deref();
				}
				break;

			case 5:
				{
				setState(187); object();
				}
				break;

			case 6:
				{
				setState(188); array();
				}
				break;

			case 7:
				{
				setState(189); ref();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(StexgrammarParser.VAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(192); identifier();
				}
				break;
			case VAL:
				{
				setState(193); match(VAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(StexgrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StexgrammarParser.ID, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); match(ID);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(197); match(T__16);
				setState(198); match(ID);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayaccessContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayaccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayaccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterArrayaccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitArrayaccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitArrayaccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayaccessContext arrayaccess() throws RecognitionException {
		ArrayaccessContext _localctx = new ArrayaccessContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayaccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); identifier();
			setState(205); match(T__13);
			setState(206); expression();
			setState(207); match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public ObjectfieldContext objectfield(int i) {
			return getRuleContext(ObjectfieldContext.class,i);
		}
		public List<ObjectfieldContext> objectfield() {
			return getRuleContexts(ObjectfieldContext.class);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(T__26);
			setState(210); objectfield();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(211); match(T__17);
				setState(212); objectfield();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218); match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectfieldContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StexgrammarParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectfieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectfield; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterObjectfield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitObjectfield(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitObjectfield(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectfieldContext objectfield() throws RecognitionException {
		ObjectfieldContext _localctx = new ObjectfieldContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_objectfield);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); match(ID);
			setState(223);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(221); match(T__25);
				setState(222); expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(T__13);
			setState(234);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__22) | (1L << T__20) | (1L << T__13) | (1L << T__1) | (1L << VAL) | (1L << ID))) != 0)) {
				{
				setState(226); expression();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(227); match(T__17);
					setState(228); expression();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(236); match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctioncallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StexgrammarParser.ID, 0); }
		public FunctioncallargsContext functioncallargs() {
			return getRuleContext(FunctioncallargsContext.class,0);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); match(ID);
			setState(239); match(T__19);
			setState(240); functioncallargs();
			setState(241); match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctioncallargsContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public FunctioncallargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncallargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterFunctioncallargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitFunctioncallargs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitFunctioncallargs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallargsContext functioncallargs() throws RecognitionException {
		FunctioncallargsContext _localctx = new FunctioncallargsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functioncallargs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__22) | (1L << T__20) | (1L << T__13) | (1L << T__1) | (1L << VAL) | (1L << ID))) != 0)) {
				{
				setState(243); expression();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(244); match(T__17);
					setState(245); expression();
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); match(T__20);
			setState(254); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DerefContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterDeref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitDeref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitDeref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerefContext deref() throws RecognitionException {
		DerefContext _localctx = new DerefContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_deref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); match(T__22);
			setState(257); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public ExpressionopContext expressionop() {
			return getRuleContext(ExpressionopContext.class,0);
		}
		public OperationtypeContext operationtype() {
			return getRuleContext(OperationtypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotoperationContext notoperation() {
			return getRuleContext(NotoperationContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_operation);
		try {
			setState(264);
			switch (_input.LA(1)) {
			case T__26:
			case T__22:
			case T__20:
			case T__13:
			case VAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(259); expressionop();
				setState(260); operationtype();
				setState(261); expression();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(263); notoperation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotoperationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotoperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notoperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterNotoperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitNotoperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitNotoperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotoperationContext notoperation() throws RecognitionException {
		NotoperationContext _localctx = new NotoperationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_notoperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); match(T__1);
			setState(267); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationtypeContext extends ParserRuleContext {
		public OperationtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterOperationtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitOperationtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitOperationtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationtypeContext operationtype() throws RecognitionException {
		OperationtypeContext _localctx = new OperationtypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operationtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__29) | (1L << T__18) | (1L << T__12) | (1L << T__11) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__3) | (1L << T__2) | (1L << T__0))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssigneeContext extends ParserRuleContext {
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayaccessContext arrayaccess() {
			return getRuleContext(ArrayaccessContext.class,0);
		}
		public AssigneeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterAssignee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitAssignee(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitAssignee(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigneeContext assignee() throws RecognitionException {
		AssigneeContext _localctx = new AssigneeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assignee);
		try {
			setState(274);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271); deref();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272); identifier();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(273); arrayaccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u0117\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\6\2>\n\2\r\2\16"+
		"\2?\3\3\3\3\3\3\3\3\3\3\3\3\6\3H\n\3\r\3\16\3I\3\3\3\3\3\4\3\4\3\4\7\4"+
		"Q\n\4\f\4\16\4T\13\4\5\4V\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5_\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\6\6g\n\6\r\6\16\6h\3\6\5\6l\n\6\3\6\3\6\3\7\3\7\3"+
		"\7\6\7s\n\7\r\7\16\7t\3\7\3\7\3\b\3\b\3\b\6\b|\n\b\r\b\16\b}\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u0089\n\t\r\t\16\t\u008a\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\6\n\u0095\n\n\r\n\16\n\u0096\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00ac"+
		"\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b8\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c1\n\20\3\21\3\21\5\21\u00c5"+
		"\n\21\3\22\3\22\3\22\7\22\u00ca\n\22\f\22\16\22\u00cd\13\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00d8\n\24\f\24\16\24\u00db\13"+
		"\24\3\24\3\24\3\25\3\25\3\25\5\25\u00e2\n\25\3\26\3\26\3\26\3\26\7\26"+
		"\u00e8\n\26\f\26\16\26\u00eb\13\26\5\26\u00ed\n\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u00f9\n\30\f\30\16\30\u00fc\13\30"+
		"\5\30\u00fe\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u010b\n\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\5\36\u0115\n"+
		"\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:\2\3\t\2\3\3\6\6\21\21\27\30\32\35 !##\u0122\2=\3\2\2\2\4A\3\2"+
		"\2\2\6U\3\2\2\2\b^\3\2\2\2\n`\3\2\2\2\fo\3\2\2\2\16x\3\2\2\2\20\u0082"+
		"\3\2\2\2\22\u008e\3\2\2\2\24\u009a\3\2\2\2\26\u009e\3\2\2\2\30\u00a2\3"+
		"\2\2\2\32\u00a7\3\2\2\2\34\u00b7\3\2\2\2\36\u00c0\3\2\2\2 \u00c4\3\2\2"+
		"\2\"\u00c6\3\2\2\2$\u00ce\3\2\2\2&\u00d3\3\2\2\2(\u00de\3\2\2\2*\u00e3"+
		"\3\2\2\2,\u00f0\3\2\2\2.\u00fd\3\2\2\2\60\u00ff\3\2\2\2\62\u0102\3\2\2"+
		"\2\64\u010a\3\2\2\2\66\u010c\3\2\2\28\u010f\3\2\2\2:\u0114\3\2\2\2<>\5"+
		"\4\3\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2AB\7&\2\2BC\7"+
		"\20\2\2CD\5\6\4\2DE\7\37\2\2EG\7\t\2\2FH\5\b\5\2GF\3\2\2\2HI\3\2\2\2I"+
		"G\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\13\2\2L\5\3\2\2\2MR\7&\2\2NO\7\22\2"+
		"\2OQ\7&\2\2PN\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2"+
		"\2UM\3\2\2\2UV\3\2\2\2V\7\3\2\2\2W_\5\n\6\2X_\5\16\b\2Y_\5\22\n\2Z_\5"+
		"\24\13\2[_\5\26\f\2\\_\5\30\r\2]_\5\32\16\2^W\3\2\2\2^X\3\2\2\2^Y\3\2"+
		"\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\t\3\2\2\2`a\7\f\2\2ab\7"+
		"\20\2\2bc\5\34\17\2cd\7\37\2\2df\7\t\2\2eg\5\b\5\2fe\3\2\2\2gh\3\2\2\2"+
		"hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jl\7\13\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2"+
		"\2mn\5\f\7\2n\13\3\2\2\2op\7\36\2\2pr\7\t\2\2qs\5\b\5\2rq\3\2\2\2st\3"+
		"\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\13\2\2w\r\3\2\2\2xy\7\16\2\2"+
		"y{\7\t\2\2z|\5\b\5\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2"+
		"\2\2\177\u0080\7\13\2\2\u0080\u0081\5\20\t\2\u0081\17\3\2\2\2\u0082\u0083"+
		"\7\4\2\2\u0083\u0084\7\20\2\2\u0084\u0085\7&\2\2\u0085\u0086\7\37\2\2"+
		"\u0086\u0088\7\t\2\2\u0087\u0089\5\b\5\2\u0088\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\7\13\2\2\u008d\21\3\2\2\2\u008e\u008f\7\b\2\2\u008f\u0090\7\20"+
		"\2\2\u0090\u0091\5\34\17\2\u0091\u0092\7\37\2\2\u0092\u0094\7\t\2\2\u0093"+
		"\u0095\5\b\5\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\13\2\2\u0099"+
		"\23\3\2\2\2\u009a\u009b\7\24\2\2\u009b\u009c\5\34\17\2\u009c\u009d\7\7"+
		"\2\2\u009d\25\3\2\2\2\u009e\u009f\7\5\2\2\u009f\u00a0\5\34\17\2\u00a0"+
		"\u00a1\7\7\2\2\u00a1\27\3\2\2\2\u00a2\u00a3\5:\36\2\u00a3\u00a4\7\n\2"+
		"\2\u00a4\u00a5\5\34\17\2\u00a5\u00a6\7\7\2\2\u00a6\31\3\2\2\2\u00a7\u00a8"+
		"\7\25\2\2\u00a8\u00ab\7&\2\2\u00a9\u00aa\7\n\2\2\u00aa\u00ac\5\34\17\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae"+
		"\7\7\2\2\u00ae\33\3\2\2\2\u00af\u00b8\5,\27\2\u00b0\u00b8\5\64\33\2\u00b1"+
		"\u00b8\5 \21\2\u00b2\u00b8\5$\23\2\u00b3\u00b8\5\62\32\2\u00b4\u00b8\5"+
		"&\24\2\u00b5\u00b8\5*\26\2\u00b6\u00b8\5\60\31\2\u00b7\u00af\3\2\2\2\u00b7"+
		"\u00b0\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b3\3\2"+
		"\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\35\3\2\2\2\u00b9\u00c1\5,\27\2\u00ba\u00c1\5 \21\2\u00bb\u00c1\5$\23"+
		"\2\u00bc\u00c1\5\62\32\2\u00bd\u00c1\5&\24\2\u00be\u00c1\5*\26\2\u00bf"+
		"\u00c1\5\60\31\2\u00c0\u00b9\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00bb\3"+
		"\2\2\2\u00c0\u00bc\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\37\3\2\2\2\u00c2\u00c5\5\"\22\2\u00c3\u00c5\7%\2"+
		"\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5!\3\2\2\2\u00c6\u00cb"+
		"\7&\2\2\u00c7\u00c8\7\23\2\2\u00c8\u00ca\7&\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc#\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00ce\u00cf\5\"\22\2\u00cf\u00d0\7\26\2\2\u00d0\u00d1"+
		"\5\34\17\2\u00d1\u00d2\7\31\2\2\u00d2%\3\2\2\2\u00d3\u00d4\7\t\2\2\u00d4"+
		"\u00d9\5(\25\2\u00d5\u00d6\7\22\2\2\u00d6\u00d8\5(\25\2\u00d7\u00d5\3"+
		"\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\13\2\2\u00dd\'\3\2\2"+
		"\2\u00de\u00e1\7&\2\2\u00df\u00e0\7\n\2\2\u00e0\u00e2\5\34\17\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2)\3\2\2\2\u00e3\u00ec\7\26\2\2"+
		"\u00e4\u00e9\5\34\17\2\u00e5\u00e6\7\22\2\2\u00e6\u00e8\5\34\17\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00e4\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7\31\2\2\u00ef+\3\2\2\2"+
		"\u00f0\u00f1\7&\2\2\u00f1\u00f2\7\20\2\2\u00f2\u00f3\5.\30\2\u00f3\u00f4"+
		"\7\37\2\2\u00f4-\3\2\2\2\u00f5\u00fa\5\34\17\2\u00f6\u00f7\7\22\2\2\u00f7"+
		"\u00f9\5\34\17\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3"+
		"\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00f5\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe/\3\2\2\2\u00ff\u0100\7\17\2\2"+
		"\u0100\u0101\5\"\22\2\u0101\61\3\2\2\2\u0102\u0103\7\r\2\2\u0103\u0104"+
		"\5\"\22\2\u0104\63\3\2\2\2\u0105\u0106\5\36\20\2\u0106\u0107\58\35\2\u0107"+
		"\u0108\5\34\17\2\u0108\u010b\3\2\2\2\u0109\u010b\5\66\34\2\u010a\u0105"+
		"\3\2\2\2\u010a\u0109\3\2\2\2\u010b\65\3\2\2\2\u010c\u010d\7\"\2\2\u010d"+
		"\u010e\5\34\17\2\u010e\67\3\2\2\2\u010f\u0110\t\2\2\2\u01109\3\2\2\2\u0111"+
		"\u0115\5\62\32\2\u0112\u0115\5\"\22\2\u0113\u0115\5$\23\2\u0114\u0111"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115;\3\2\2\2\32?IR"+
		"U^hkt}\u008a\u0096\u00ab\u00b7\u00c0\u00c4\u00cb\u00d9\u00e1\u00e9\u00ec"+
		"\u00fa\u00fd\u010a\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
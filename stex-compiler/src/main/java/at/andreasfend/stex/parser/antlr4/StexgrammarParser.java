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
		RULE_program = 0, RULE_functionlist = 1, RULE_function = 2, RULE_paramlist = 3, 
		RULE_statement = 4, RULE_ifstatement = 5, RULE_elseblock = 6, RULE_trystatement = 7, 
		RULE_catchblock = 8, RULE_whilestatement = 9, RULE_throwstatement = 10, 
		RULE_returnstatement = 11, RULE_assignstatement = 12, RULE_varstatement = 13, 
		RULE_expression = 14, RULE_expressionop = 15, RULE_operand = 16, RULE_identifier = 17, 
		RULE_arrayaccess = 18, RULE_object = 19, RULE_objectfield = 20, RULE_array = 21, 
		RULE_functioncall = 22, RULE_functioncallargs = 23, RULE_ref = 24, RULE_deref = 25, 
		RULE_operation = 26, RULE_notoperation = 27, RULE_operationtype = 28, 
		RULE_assignee = 29;
	public static final String[] ruleNames = {
		"program", "functionlist", "function", "paramlist", "statement", "ifstatement", 
		"elseblock", "trystatement", "catchblock", "whilestatement", "throwstatement", 
		"returnstatement", "assignstatement", "varstatement", "expression", "expressionop", 
		"operand", "identifier", "arrayaccess", "object", "objectfield", "array", 
		"functioncall", "functioncallargs", "ref", "deref", "operation", "notoperation", 
		"operationtype", "assignee"
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
		public FunctionlistContext functionlist() {
			return getRuleContext(FunctionlistContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); functionlist();
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

	public static class FunctionlistContext extends ParserRuleContext {
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterFunctionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitFunctionlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitFunctionlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionlistContext functionlist() throws RecognitionException {
		FunctionlistContext _localctx = new FunctionlistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62); function();
				}
				}
				setState(65); 
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
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(ID);
			setState(68); match(T__19);
			setState(69); paramlist();
			setState(70); match(T__4);
			setState(71); match(T__26);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72); statement();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(77); match(T__24);
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
		enterRule(_localctx, 6, RULE_paramlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(79); match(ID);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(80); match(T__17);
					setState(81); match(ID);
					}
					}
					setState(86);
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
		enterRule(_localctx, 8, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			switch (_input.LA(1)) {
			case T__23:
				{
				setState(89); ifstatement();
				}
				break;
			case T__21:
				{
				setState(90); trystatement();
				}
				break;
			case T__27:
				{
				setState(91); whilestatement();
				}
				break;
			case T__15:
				{
				setState(92); throwstatement();
				}
				break;
			case T__30:
				{
				setState(93); returnstatement();
				}
				break;
			case T__22:
			case ID:
				{
				setState(94); assignstatement();
				}
				break;
			case T__14:
				{
				setState(95); varstatement();
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
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseblockContext elseblock() {
			return getRuleContext(ElseblockContext.class,0);
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
		enterRule(_localctx, 10, RULE_ifstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(T__23);
			setState(99); match(T__19);
			setState(100); expression();
			setState(101); match(T__4);
			setState(102); match(T__26);
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103); statement();
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(108); match(T__24);
			setState(110);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(109); elseblock();
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
		enterRule(_localctx, 12, RULE_elseblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(T__5);
			setState(113); match(T__26);
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114); statement();
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(119); match(T__24);
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
		enterRule(_localctx, 14, RULE_trystatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(T__21);
			setState(122); match(T__26);
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123); statement();
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(128); match(T__24);
			setState(129); catchblock();
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
		enterRule(_localctx, 16, RULE_catchblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); match(T__31);
			setState(132); match(T__19);
			setState(133); match(ID);
			setState(134); match(T__4);
			setState(135); match(T__26);
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136); statement();
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(141); match(T__24);
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
		enterRule(_localctx, 18, RULE_whilestatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(T__27);
			setState(144); match(T__19);
			setState(145); expression();
			setState(146); match(T__4);
			setState(147); match(T__26);
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148); statement();
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(153); match(T__24);
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
		enterRule(_localctx, 20, RULE_throwstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(T__15);
			setState(156); expression();
			setState(157); match(T__28);
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
		enterRule(_localctx, 22, RULE_returnstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(T__30);
			setState(161);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__22) | (1L << T__20) | (1L << T__13) | (1L << T__1) | (1L << VAL) | (1L << ID))) != 0)) {
				{
				setState(160); expression();
				}
			}

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
		enterRule(_localctx, 24, RULE_assignstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); assignee();
			setState(166); match(T__25);
			setState(167); expression();
			setState(168); match(T__28);
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
		enterRule(_localctx, 26, RULE_varstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(T__14);
			setState(171); match(ID);
			setState(174);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(172); match(T__25);
				setState(173); expression();
				}
			}

			setState(176); match(T__28);
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
		enterRule(_localctx, 28, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(178); functioncall();
				}
				break;

			case 2:
				{
				setState(179); operation();
				}
				break;

			case 3:
				{
				setState(180); operand();
				}
				break;

			case 4:
				{
				setState(181); arrayaccess();
				}
				break;

			case 5:
				{
				setState(182); deref();
				}
				break;

			case 6:
				{
				setState(183); object();
				}
				break;

			case 7:
				{
				setState(184); array();
				}
				break;

			case 8:
				{
				setState(185); ref();
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
		enterRule(_localctx, 30, RULE_expressionop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(188); functioncall();
				}
				break;

			case 2:
				{
				setState(189); operand();
				}
				break;

			case 3:
				{
				setState(190); arrayaccess();
				}
				break;

			case 4:
				{
				setState(191); deref();
				}
				break;

			case 5:
				{
				setState(192); object();
				}
				break;

			case 6:
				{
				setState(193); array();
				}
				break;

			case 7:
				{
				setState(194); ref();
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
		enterRule(_localctx, 32, RULE_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(197); identifier();
				}
				break;
			case VAL:
				{
				setState(198); match(VAL);
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
		enterRule(_localctx, 34, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(ID);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(202); match(T__16);
				setState(203); match(ID);
				}
				}
				setState(208);
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
		enterRule(_localctx, 36, RULE_arrayaccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); identifier();
			setState(210); match(T__13);
			setState(211); expression();
			setState(212); match(T__10);
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
		enterRule(_localctx, 38, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); match(T__26);
			setState(215); objectfield();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(216); match(T__17);
				setState(217); objectfield();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223); match(T__24);
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
		enterRule(_localctx, 40, RULE_objectfield);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(ID);
			setState(228);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(226); match(T__25);
				setState(227); expression();
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
		enterRule(_localctx, 42, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); match(T__13);
			setState(239);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__22) | (1L << T__20) | (1L << T__13) | (1L << T__1) | (1L << VAL) | (1L << ID))) != 0)) {
				{
				setState(231); expression();
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(232); match(T__17);
					setState(233); expression();
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(241); match(T__10);
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
		enterRule(_localctx, 44, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(ID);
			setState(244); match(T__19);
			setState(245); functioncallargs();
			setState(246); match(T__4);
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
		enterRule(_localctx, 46, RULE_functioncallargs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__22) | (1L << T__20) | (1L << T__13) | (1L << T__1) | (1L << VAL) | (1L << ID))) != 0)) {
				{
				setState(248); expression();
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(249); match(T__17);
					setState(250); expression();
					}
					}
					setState(255);
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
		enterRule(_localctx, 48, RULE_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); match(T__20);
			setState(259); identifier();
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
		enterRule(_localctx, 50, RULE_deref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); match(T__22);
			setState(262); identifier();
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
		enterRule(_localctx, 52, RULE_operation);
		try {
			setState(269);
			switch (_input.LA(1)) {
			case T__26:
			case T__22:
			case T__20:
			case T__13:
			case VAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(264); expressionop();
				setState(265); operationtype();
				setState(266); expression();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(268); notoperation();
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
		enterRule(_localctx, 54, RULE_notoperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); match(T__1);
			setState(272); expression();
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
		enterRule(_localctx, 56, RULE_operationtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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
		enterRule(_localctx, 58, RULE_assignee);
		try {
			setState(279);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276); deref();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277); identifier();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278); arrayaccess();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u011c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\6\3B\n\3\r\3\16\3C\3\4\3\4\3\4\3\4\3\4\3\4\6\4L\n\4\r\4\16\4M\3\4\3"+
		"\4\3\5\3\5\3\5\7\5U\n\5\f\5\16\5X\13\5\5\5Z\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6c\n\6\3\7\3\7\3\7\3\7\3\7\3\7\6\7k\n\7\r\7\16\7l\3\7\3\7\5\7"+
		"q\n\7\3\b\3\b\3\b\6\bv\n\b\r\b\16\bw\3\b\3\b\3\t\3\t\3\t\6\t\177\n\t\r"+
		"\t\16\t\u0080\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u008c\n\n\r\n\16"+
		"\n\u008d\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u0098\n\13\r\13\16"+
		"\13\u0099\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u00a4\n\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00b1\n\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00bd\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00c6\n\21\3\22\3\22\5\22\u00ca\n\22\3\23\3\23\3"+
		"\23\7\23\u00cf\n\23\f\23\16\23\u00d2\13\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\7\25\u00dd\n\25\f\25\16\25\u00e0\13\25\3\25\3\25\3"+
		"\26\3\26\3\26\5\26\u00e7\n\26\3\27\3\27\3\27\3\27\7\27\u00ed\n\27\f\27"+
		"\16\27\u00f0\13\27\5\27\u00f2\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\7\31\u00fe\n\31\f\31\16\31\u0101\13\31\5\31\u0103\n\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u0110\n\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\5\37\u011a\n\37\3\37\2\2 \2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\3\t\2\3"+
		"\3\6\6\21\21\27\30\32\35 !##\u0127\2>\3\2\2\2\4A\3\2\2\2\6E\3\2\2\2\b"+
		"Y\3\2\2\2\nb\3\2\2\2\fd\3\2\2\2\16r\3\2\2\2\20{\3\2\2\2\22\u0085\3\2\2"+
		"\2\24\u0091\3\2\2\2\26\u009d\3\2\2\2\30\u00a1\3\2\2\2\32\u00a7\3\2\2\2"+
		"\34\u00ac\3\2\2\2\36\u00bc\3\2\2\2 \u00c5\3\2\2\2\"\u00c9\3\2\2\2$\u00cb"+
		"\3\2\2\2&\u00d3\3\2\2\2(\u00d8\3\2\2\2*\u00e3\3\2\2\2,\u00e8\3\2\2\2."+
		"\u00f5\3\2\2\2\60\u0102\3\2\2\2\62\u0104\3\2\2\2\64\u0107\3\2\2\2\66\u010f"+
		"\3\2\2\28\u0111\3\2\2\2:\u0114\3\2\2\2<\u0119\3\2\2\2>?\5\4\3\2?\3\3\2"+
		"\2\2@B\5\6\4\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\5\3\2\2\2EF\7"+
		"&\2\2FG\7\20\2\2GH\5\b\5\2HI\7\37\2\2IK\7\t\2\2JL\5\n\6\2KJ\3\2\2\2LM"+
		"\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\13\2\2P\7\3\2\2\2QV\7&\2\2"+
		"RS\7\22\2\2SU\7&\2\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2"+
		"XV\3\2\2\2YQ\3\2\2\2YZ\3\2\2\2Z\t\3\2\2\2[c\5\f\7\2\\c\5\20\t\2]c\5\24"+
		"\13\2^c\5\26\f\2_c\5\30\r\2`c\5\32\16\2ac\5\34\17\2b[\3\2\2\2b\\\3\2\2"+
		"\2b]\3\2\2\2b^\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\13\3\2\2\2de\7\f"+
		"\2\2ef\7\20\2\2fg\5\36\20\2gh\7\37\2\2hj\7\t\2\2ik\5\n\6\2ji\3\2\2\2k"+
		"l\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2np\7\13\2\2oq\5\16\b\2po\3\2\2"+
		"\2pq\3\2\2\2q\r\3\2\2\2rs\7\36\2\2su\7\t\2\2tv\5\n\6\2ut\3\2\2\2vw\3\2"+
		"\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\13\2\2z\17\3\2\2\2{|\7\16\2\2|"+
		"~\7\t\2\2}\177\5\n\6\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\13\2\2\u0083\u0084\5"+
		"\22\n\2\u0084\21\3\2\2\2\u0085\u0086\7\4\2\2\u0086\u0087\7\20\2\2\u0087"+
		"\u0088\7&\2\2\u0088\u0089\7\37\2\2\u0089\u008b\7\t\2\2\u008a\u008c\5\n"+
		"\6\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\13\2\2\u0090\23\3\2\2"+
		"\2\u0091\u0092\7\b\2\2\u0092\u0093\7\20\2\2\u0093\u0094\5\36\20\2\u0094"+
		"\u0095\7\37\2\2\u0095\u0097\7\t\2\2\u0096\u0098\5\n\6\2\u0097\u0096\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\7\13\2\2\u009c\25\3\2\2\2\u009d\u009e\7\24"+
		"\2\2\u009e\u009f\5\36\20\2\u009f\u00a0\7\7\2\2\u00a0\27\3\2\2\2\u00a1"+
		"\u00a3\7\5\2\2\u00a2\u00a4\5\36\20\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3"+
		"\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\7\2\2\u00a6\31\3\2\2\2\u00a7"+
		"\u00a8\5<\37\2\u00a8\u00a9\7\n\2\2\u00a9\u00aa\5\36\20\2\u00aa\u00ab\7"+
		"\7\2\2\u00ab\33\3\2\2\2\u00ac\u00ad\7\25\2\2\u00ad\u00b0\7&\2\2\u00ae"+
		"\u00af\7\n\2\2\u00af\u00b1\5\36\20\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7\7\2\2\u00b3\35\3\2\2\2\u00b4"+
		"\u00bd\5.\30\2\u00b5\u00bd\5\66\34\2\u00b6\u00bd\5\"\22\2\u00b7\u00bd"+
		"\5&\24\2\u00b8\u00bd\5\64\33\2\u00b9\u00bd\5(\25\2\u00ba\u00bd\5,\27\2"+
		"\u00bb\u00bd\5\62\32\2\u00bc\u00b4\3\2\2\2\u00bc\u00b5\3\2\2\2\u00bc\u00b6"+
		"\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\37\3\2\2\2\u00be\u00c6\5.\30"+
		"\2\u00bf\u00c6\5\"\22\2\u00c0\u00c6\5&\24\2\u00c1\u00c6\5\64\33\2\u00c2"+
		"\u00c6\5(\25\2\u00c3\u00c6\5,\27\2\u00c4\u00c6\5\62\32\2\u00c5\u00be\3"+
		"\2\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5"+
		"\u00c2\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6!\3\2\2\2"+
		"\u00c7\u00ca\5$\23\2\u00c8\u00ca\7%\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8"+
		"\3\2\2\2\u00ca#\3\2\2\2\u00cb\u00d0\7&\2\2\u00cc\u00cd\7\23\2\2\u00cd"+
		"\u00cf\7&\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1%\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4"+
		"\5$\23\2\u00d4\u00d5\7\26\2\2\u00d5\u00d6\5\36\20\2\u00d6\u00d7\7\31\2"+
		"\2\u00d7\'\3\2\2\2\u00d8\u00d9\7\t\2\2\u00d9\u00de\5*\26\2\u00da\u00db"+
		"\7\22\2\2\u00db\u00dd\5*\26\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00e2\7\13\2\2\u00e2)\3\2\2\2\u00e3\u00e6\7&\2\2\u00e4"+
		"\u00e5\7\n\2\2\u00e5\u00e7\5\36\20\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3"+
		"\2\2\2\u00e7+\3\2\2\2\u00e8\u00f1\7\26\2\2\u00e9\u00ee\5\36\20\2\u00ea"+
		"\u00eb\7\22\2\2\u00eb\u00ed\5\36\20\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f4\7\31\2\2\u00f4-\3\2\2\2\u00f5\u00f6\7&\2\2\u00f6\u00f7"+
		"\7\20\2\2\u00f7\u00f8\5\60\31\2\u00f8\u00f9\7\37\2\2\u00f9/\3\2\2\2\u00fa"+
		"\u00ff\5\36\20\2\u00fb\u00fc\7\22\2\2\u00fc\u00fe\5\36\20\2\u00fd\u00fb"+
		"\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u00fa\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\61\3\2\2\2\u0104\u0105\7\17\2\2\u0105\u0106\5$\23\2\u0106\63"+
		"\3\2\2\2\u0107\u0108\7\r\2\2\u0108\u0109\5$\23\2\u0109\65\3\2\2\2\u010a"+
		"\u010b\5 \21\2\u010b\u010c\5:\36\2\u010c\u010d\5\36\20\2\u010d\u0110\3"+
		"\2\2\2\u010e\u0110\58\35\2\u010f\u010a\3\2\2\2\u010f\u010e\3\2\2\2\u0110"+
		"\67\3\2\2\2\u0111\u0112\7\"\2\2\u0112\u0113\5\36\20\2\u01139\3\2\2\2\u0114"+
		"\u0115\t\2\2\2\u0115;\3\2\2\2\u0116\u011a\5\64\33\2\u0117\u011a\5$\23"+
		"\2\u0118\u011a\5&\24\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118"+
		"\3\2\2\2\u011a=\3\2\2\2\33CMVYblpw\u0080\u008d\u0099\u00a3\u00b0\u00bc"+
		"\u00c5\u00c9\u00d0\u00de\u00e6\u00ee\u00f1\u00ff\u0102\u010f\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
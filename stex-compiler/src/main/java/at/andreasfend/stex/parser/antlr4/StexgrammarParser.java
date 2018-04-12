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
		T__1=32, T__0=33, WHITESPACE=34, COMMENT=35, NUMBER=36, BOOLEAN=37, NULL=38, 
		STRING=39, ID=40;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'catch'", "'return'", "'!='", "';'", "'while'", "'{'", 
		"'='", "'}'", "'if'", "'?'", "'try'", "'&'", "'('", "'*'", "','", "'.'", 
		"'throw'", "'var'", "'['", "'<'", "'=='", "']'", "'>'", "'or'", "'%'", 
		"'in'", "'else'", "')'", "'and'", "'+'", "'not'", "'-'", "WHITESPACE", 
		"COMMENT", "NUMBER", "BOOLEAN", "'null'", "STRING", "ID"
	};
	public static final int
		RULE_program = 0, RULE_functionlist = 1, RULE_function = 2, RULE_paramlist = 3, 
		RULE_statement = 4, RULE_ifstatement = 5, RULE_elseblock = 6, RULE_trystatement = 7, 
		RULE_catchblock = 8, RULE_whilestatement = 9, RULE_throwstatement = 10, 
		RULE_returnstatement = 11, RULE_assignstatement = 12, RULE_varstatement = 13, 
		RULE_voidfunction = 14, RULE_expression = 15, RULE_expressionop = 16, 
		RULE_operand = 17, RULE_identifier = 18, RULE_value = 19, RULE_arrayaccess = 20, 
		RULE_object = 21, RULE_objectfield = 22, RULE_array = 23, RULE_functioncall = 24, 
		RULE_functioncallargs = 25, RULE_ref = 26, RULE_deref = 27, RULE_operation = 28, 
		RULE_notoperation = 29, RULE_operationtype = 30, RULE_assignee = 31;
	public static final String[] ruleNames = {
		"program", "functionlist", "function", "paramlist", "statement", "ifstatement", 
		"elseblock", "trystatement", "catchblock", "whilestatement", "throwstatement", 
		"returnstatement", "assignstatement", "varstatement", "voidfunction", 
		"expression", "expressionop", "operand", "identifier", "value", "arrayaccess", 
		"object", "objectfield", "array", "functioncall", "functioncallargs", 
		"ref", "deref", "operation", "notoperation", "operationtype", "assignee"
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
			setState(64); functionlist();
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
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66); function();
				}
				}
				setState(69); 
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
			setState(71); match(ID);
			setState(72); match(T__19);
			setState(73); paramlist();
			setState(74); match(T__4);
			setState(75); match(T__26);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76); statement();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(81); match(T__24);
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
			setState(91);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(83); match(ID);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(84); match(T__17);
					setState(85); match(ID);
					}
					}
					setState(90);
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
		public VoidfunctionContext voidfunction() {
			return getRuleContext(VoidfunctionContext.class,0);
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
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(93); ifstatement();
				}
				break;

			case 2:
				{
				setState(94); trystatement();
				}
				break;

			case 3:
				{
				setState(95); whilestatement();
				}
				break;

			case 4:
				{
				setState(96); throwstatement();
				}
				break;

			case 5:
				{
				setState(97); returnstatement();
				}
				break;

			case 6:
				{
				setState(98); assignstatement();
				}
				break;

			case 7:
				{
				setState(99); varstatement();
				}
				break;

			case 8:
				{
				setState(100); voidfunction();
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
			setState(103); match(T__23);
			setState(104); match(T__19);
			setState(105); expression();
			setState(106); match(T__4);
			setState(107); match(T__26);
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108); statement();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(113); match(T__24);
			setState(115);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(114); elseblock();
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
			setState(117); match(T__5);
			setState(118); match(T__26);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119); statement();
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(124); match(T__24);
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
			setState(126); match(T__21);
			setState(127); match(T__26);
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128); statement();
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(133); match(T__24);
			setState(134); catchblock();
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
			setState(136); match(T__31);
			setState(137); match(T__19);
			setState(138); match(ID);
			setState(139); match(T__4);
			setState(140); match(T__26);
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141); statement();
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(146); match(T__24);
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
			setState(148); match(T__27);
			setState(149); match(T__19);
			setState(150); expression();
			setState(151); match(T__4);
			setState(152); match(T__26);
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153); statement();
				}
				}
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(158); match(T__24);
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
			setState(160); match(T__15);
			setState(161); expression();
			setState(162); match(T__28);
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
			setState(164); match(T__30);
			setState(166);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__22) | (1L << T__20) | (1L << T__13) | (1L << T__1) | (1L << NUMBER) | (1L << BOOLEAN) | (1L << NULL) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(165); expression();
				}
			}

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
			setState(170); assignee();
			setState(171); match(T__25);
			setState(172); expression();
			setState(173); match(T__28);
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
			setState(175); match(T__14);
			setState(176); match(ID);
			setState(179);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(177); match(T__25);
				setState(178); expression();
				}
			}

			setState(181); match(T__28);
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

	public static class VoidfunctionContext extends ParserRuleContext {
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public VoidfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterVoidfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitVoidfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitVoidfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidfunctionContext voidfunction() throws RecognitionException {
		VoidfunctionContext _localctx = new VoidfunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_voidfunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); functioncall();
			setState(184); match(T__28);
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
		enterRule(_localctx, 30, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(186); functioncall();
				}
				break;

			case 2:
				{
				setState(187); operation();
				}
				break;

			case 3:
				{
				setState(188); operand();
				}
				break;

			case 4:
				{
				setState(189); arrayaccess();
				}
				break;

			case 5:
				{
				setState(190); deref();
				}
				break;

			case 6:
				{
				setState(191); object();
				}
				break;

			case 7:
				{
				setState(192); array();
				}
				break;

			case 8:
				{
				setState(193); ref();
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
		enterRule(_localctx, 32, RULE_expressionop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(196); functioncall();
				}
				break;

			case 2:
				{
				setState(197); operand();
				}
				break;

			case 3:
				{
				setState(198); arrayaccess();
				}
				break;

			case 4:
				{
				setState(199); deref();
				}
				break;

			case 5:
				{
				setState(200); object();
				}
				break;

			case 6:
				{
				setState(201); array();
				}
				break;

			case 7:
				{
				setState(202); ref();
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(205); identifier();
				}
				break;
			case NUMBER:
			case BOOLEAN:
			case NULL:
			case STRING:
				{
				setState(206); value();
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
		enterRule(_localctx, 36, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(ID);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(210); match(T__16);
				setState(211); match(ID);
				}
				}
				setState(216);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(StexgrammarParser.NULL, 0); }
		public TerminalNode STRING() { return getToken(StexgrammarParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(StexgrammarParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(StexgrammarParser.BOOLEAN, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOLEAN) | (1L << NULL) | (1L << STRING))) != 0)) ) {
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
		enterRule(_localctx, 40, RULE_arrayaccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); identifier();
			setState(220); match(T__13);
			setState(221); expression();
			setState(222); match(T__10);
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
		enterRule(_localctx, 42, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); match(T__26);
			setState(225); objectfield();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(226); match(T__17);
				setState(227); objectfield();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233); match(T__24);
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
		enterRule(_localctx, 44, RULE_objectfield);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); match(ID);
			setState(238);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(236); match(T__25);
				setState(237); expression();
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
		enterRule(_localctx, 46, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); match(T__13);
			setState(249);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__22) | (1L << T__20) | (1L << T__13) | (1L << T__1) | (1L << NUMBER) | (1L << BOOLEAN) | (1L << NULL) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(241); expression();
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(242); match(T__17);
					setState(243); expression();
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(251); match(T__10);
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
		enterRule(_localctx, 48, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); match(ID);
			setState(254); match(T__19);
			setState(255); functioncallargs();
			setState(256); match(T__4);
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
		enterRule(_localctx, 50, RULE_functioncallargs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__22) | (1L << T__20) | (1L << T__13) | (1L << T__1) | (1L << NUMBER) | (1L << BOOLEAN) | (1L << NULL) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(258); expression();
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(259); match(T__17);
					setState(260); expression();
					}
					}
					setState(265);
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
		enterRule(_localctx, 52, RULE_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); match(T__20);
			setState(269); identifier();
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
		enterRule(_localctx, 54, RULE_deref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); match(T__22);
			setState(272); identifier();
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
		enterRule(_localctx, 56, RULE_operation);
		try {
			setState(279);
			switch (_input.LA(1)) {
			case T__26:
			case T__22:
			case T__20:
			case T__13:
			case NUMBER:
			case BOOLEAN:
			case NULL:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(274); expressionop();
				setState(275); operationtype();
				setState(276); expression();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(278); notoperation();
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
		enterRule(_localctx, 58, RULE_notoperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); match(T__1);
			setState(282); expression();
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
		enterRule(_localctx, 60, RULE_operationtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
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
		enterRule(_localctx, 62, RULE_assignee);
		try {
			setState(289);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286); deref();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287); identifier();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288); arrayaccess();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u0126\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\6\3F\n\3\r\3\16\3G\3\4\3\4\3\4\3\4\3\4\3\4\6\4P\n\4\r"+
		"\4\16\4Q\3\4\3\4\3\5\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\5\5^\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6h\n\6\3\7\3\7\3\7\3\7\3\7\3\7\6\7p\n\7\r\7"+
		"\16\7q\3\7\3\7\5\7v\n\7\3\b\3\b\3\b\6\b{\n\b\r\b\16\b|\3\b\3\b\3\t\3\t"+
		"\3\t\6\t\u0084\n\t\r\t\16\t\u0085\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\6\n\u0091\n\n\r\n\16\n\u0092\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\6"+
		"\13\u009d\n\13\r\13\16\13\u009e\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\5\r"+
		"\u00a9\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00b6"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00c5\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ce\n\22\3"+
		"\23\3\23\5\23\u00d2\n\23\3\24\3\24\3\24\7\24\u00d7\n\24\f\24\16\24\u00da"+
		"\13\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00e7"+
		"\n\27\f\27\16\27\u00ea\13\27\3\27\3\27\3\30\3\30\3\30\5\30\u00f1\n\30"+
		"\3\31\3\31\3\31\3\31\7\31\u00f7\n\31\f\31\16\31\u00fa\13\31\5\31\u00fc"+
		"\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u0108\n\33"+
		"\f\33\16\33\u010b\13\33\5\33\u010d\n\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u011a\n\36\3\37\3\37\3\37\3 \3 \3!\3!\3"+
		"!\5!\u0124\n!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@\2\4\3\2&)\t\2\3\3\6\6\21\21\27\30\32\35 !##\u0130\2"+
		"B\3\2\2\2\4E\3\2\2\2\6I\3\2\2\2\b]\3\2\2\2\ng\3\2\2\2\fi\3\2\2\2\16w\3"+
		"\2\2\2\20\u0080\3\2\2\2\22\u008a\3\2\2\2\24\u0096\3\2\2\2\26\u00a2\3\2"+
		"\2\2\30\u00a6\3\2\2\2\32\u00ac\3\2\2\2\34\u00b1\3\2\2\2\36\u00b9\3\2\2"+
		"\2 \u00c4\3\2\2\2\"\u00cd\3\2\2\2$\u00d1\3\2\2\2&\u00d3\3\2\2\2(\u00db"+
		"\3\2\2\2*\u00dd\3\2\2\2,\u00e2\3\2\2\2.\u00ed\3\2\2\2\60\u00f2\3\2\2\2"+
		"\62\u00ff\3\2\2\2\64\u010c\3\2\2\2\66\u010e\3\2\2\28\u0111\3\2\2\2:\u0119"+
		"\3\2\2\2<\u011b\3\2\2\2>\u011e\3\2\2\2@\u0123\3\2\2\2BC\5\4\3\2C\3\3\2"+
		"\2\2DF\5\6\4\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\5\3\2\2\2IJ\7"+
		"*\2\2JK\7\20\2\2KL\5\b\5\2LM\7\37\2\2MO\7\t\2\2NP\5\n\6\2ON\3\2\2\2PQ"+
		"\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\13\2\2T\7\3\2\2\2UZ\7*\2\2"+
		"VW\7\22\2\2WY\7*\2\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2"+
		"\2\\Z\3\2\2\2]U\3\2\2\2]^\3\2\2\2^\t\3\2\2\2_h\5\f\7\2`h\5\20\t\2ah\5"+
		"\24\13\2bh\5\26\f\2ch\5\30\r\2dh\5\32\16\2eh\5\34\17\2fh\5\36\20\2g_\3"+
		"\2\2\2g`\3\2\2\2ga\3\2\2\2gb\3\2\2\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3"+
		"\2\2\2h\13\3\2\2\2ij\7\f\2\2jk\7\20\2\2kl\5 \21\2lm\7\37\2\2mo\7\t\2\2"+
		"np\5\n\6\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\7\13\2"+
		"\2tv\5\16\b\2ut\3\2\2\2uv\3\2\2\2v\r\3\2\2\2wx\7\36\2\2xz\7\t\2\2y{\5"+
		"\n\6\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\13\2\2"+
		"\177\17\3\2\2\2\u0080\u0081\7\16\2\2\u0081\u0083\7\t\2\2\u0082\u0084\5"+
		"\n\6\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\13\2\2\u0088\u0089\5"+
		"\22\n\2\u0089\21\3\2\2\2\u008a\u008b\7\4\2\2\u008b\u008c\7\20\2\2\u008c"+
		"\u008d\7*\2\2\u008d\u008e\7\37\2\2\u008e\u0090\7\t\2\2\u008f\u0091\5\n"+
		"\6\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\13\2\2\u0095\23\3\2\2"+
		"\2\u0096\u0097\7\b\2\2\u0097\u0098\7\20\2\2\u0098\u0099\5 \21\2\u0099"+
		"\u009a\7\37\2\2\u009a\u009c\7\t\2\2\u009b\u009d\5\n\6\2\u009c\u009b\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\7\13\2\2\u00a1\25\3\2\2\2\u00a2\u00a3\7\24"+
		"\2\2\u00a3\u00a4\5 \21\2\u00a4\u00a5\7\7\2\2\u00a5\27\3\2\2\2\u00a6\u00a8"+
		"\7\5\2\2\u00a7\u00a9\5 \21\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\7\7\2\2\u00ab\31\3\2\2\2\u00ac\u00ad\5@!\2"+
		"\u00ad\u00ae\7\n\2\2\u00ae\u00af\5 \21\2\u00af\u00b0\7\7\2\2\u00b0\33"+
		"\3\2\2\2\u00b1\u00b2\7\25\2\2\u00b2\u00b5\7*\2\2\u00b3\u00b4\7\n\2\2\u00b4"+
		"\u00b6\5 \21\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\7\7\2\2\u00b8\35\3\2\2\2\u00b9\u00ba\5\62\32\2\u00ba"+
		"\u00bb\7\7\2\2\u00bb\37\3\2\2\2\u00bc\u00c5\5\62\32\2\u00bd\u00c5\5:\36"+
		"\2\u00be\u00c5\5$\23\2\u00bf\u00c5\5*\26\2\u00c0\u00c5\58\35\2\u00c1\u00c5"+
		"\5,\27\2\u00c2\u00c5\5\60\31\2\u00c3\u00c5\5\66\34\2\u00c4\u00bc\3\2\2"+
		"\2\u00c4\u00bd\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c0"+
		"\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"!\3\2\2\2\u00c6\u00ce\5\62\32\2\u00c7\u00ce\5$\23\2\u00c8\u00ce\5*\26"+
		"\2\u00c9\u00ce\58\35\2\u00ca\u00ce\5,\27\2\u00cb\u00ce\5\60\31\2\u00cc"+
		"\u00ce\5\66\34\2\u00cd\u00c6\3\2\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00c8\3"+
		"\2\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce#\3\2\2\2\u00cf\u00d2\5&\24\2\u00d0\u00d2\5(\25\2"+
		"\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2%\3\2\2\2\u00d3\u00d8\7"+
		"*\2\2\u00d4\u00d5\7\23\2\2\u00d5\u00d7\7*\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\'\3\2\2\2"+
		"\u00da\u00d8\3\2\2\2\u00db\u00dc\t\2\2\2\u00dc)\3\2\2\2\u00dd\u00de\5"+
		"&\24\2\u00de\u00df\7\26\2\2\u00df\u00e0\5 \21\2\u00e0\u00e1\7\31\2\2\u00e1"+
		"+\3\2\2\2\u00e2\u00e3\7\t\2\2\u00e3\u00e8\5.\30\2\u00e4\u00e5\7\22\2\2"+
		"\u00e5\u00e7\5.\30\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\7\13\2\2\u00ec-\3\2\2\2\u00ed\u00f0\7*\2\2\u00ee\u00ef\7\n\2\2"+
		"\u00ef\u00f1\5 \21\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1/\3"+
		"\2\2\2\u00f2\u00fb\7\26\2\2\u00f3\u00f8\5 \21\2\u00f4\u00f5\7\22\2\2\u00f5"+
		"\u00f7\5 \21\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00f3\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\31"+
		"\2\2\u00fe\61\3\2\2\2\u00ff\u0100\7*\2\2\u0100\u0101\7\20\2\2\u0101\u0102"+
		"\5\64\33\2\u0102\u0103\7\37\2\2\u0103\63\3\2\2\2\u0104\u0109\5 \21\2\u0105"+
		"\u0106\7\22\2\2\u0106\u0108\5 \21\2\u0107\u0105\3\2\2\2\u0108\u010b\3"+
		"\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010c\u0104\3\2\2\2\u010c\u010d\3\2\2\2\u010d\65\3\2\2"+
		"\2\u010e\u010f\7\17\2\2\u010f\u0110\5&\24\2\u0110\67\3\2\2\2\u0111\u0112"+
		"\7\r\2\2\u0112\u0113\5&\24\2\u01139\3\2\2\2\u0114\u0115\5\"\22\2\u0115"+
		"\u0116\5> \2\u0116\u0117\5 \21\2\u0117\u011a\3\2\2\2\u0118\u011a\5<\37"+
		"\2\u0119\u0114\3\2\2\2\u0119\u0118\3\2\2\2\u011a;\3\2\2\2\u011b\u011c"+
		"\7\"\2\2\u011c\u011d\5 \21\2\u011d=\3\2\2\2\u011e\u011f\t\3\2\2\u011f"+
		"?\3\2\2\2\u0120\u0124\58\35\2\u0121\u0124\5&\24\2\u0122\u0124\5*\26\2"+
		"\u0123\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124A\3"+
		"\2\2\2\33GQZ]gqu|\u0085\u0092\u009e\u00a8\u00b5\u00c4\u00cd\u00d1\u00d8"+
		"\u00e8\u00f0\u00f8\u00fb\u0109\u010c\u0119\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
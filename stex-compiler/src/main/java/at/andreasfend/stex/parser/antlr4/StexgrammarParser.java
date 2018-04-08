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
		RULE_assignstatement = 11, RULE_varstatement = 12, RULE_initialisation = 13, 
		RULE_expression = 14, RULE_expressionop = 15, RULE_operand = 16, RULE_identifier = 17, 
		RULE_arrayaccess = 18, RULE_object = 19, RULE_objectfield = 20, RULE_array = 21, 
		RULE_functioncall = 22, RULE_functioncallargs = 23, RULE_ref = 24, RULE_deref = 25, 
		RULE_operation = 26, RULE_assignee = 27;
	public static final String[] ruleNames = {
		"program", "function", "paramlist", "statement", "ifstatement", "elseblock", 
		"trystatement", "catchblock", "whilestatement", "throwstatement", "returnstatement", 
		"assignstatement", "varstatement", "initialisation", "expression", "expressionop", 
		"operand", "identifier", "arrayaccess", "object", "objectfield", "array", 
		"functioncall", "functioncallargs", "ref", "deref", "operation", "assignee"
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
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56); function();
				}
				}
				setState(59); 
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
			setState(61); match(ID);
			setState(62); match(T__19);
			setState(63); paramlist();
			setState(64); match(T__4);
			setState(65); match(T__26);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66); statement();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(71); match(T__24);
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
			setState(81);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(73); match(ID);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(74); match(T__17);
					setState(75); match(ID);
					}
					}
					setState(80);
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
			setState(90);
			switch (_input.LA(1)) {
			case T__23:
				{
				setState(83); ifstatement();
				}
				break;
			case T__21:
				{
				setState(84); trystatement();
				}
				break;
			case T__27:
				{
				setState(85); whilestatement();
				}
				break;
			case T__15:
				{
				setState(86); throwstatement();
				}
				break;
			case T__30:
				{
				setState(87); returnstatement();
				}
				break;
			case T__22:
			case ID:
				{
				setState(88); assignstatement();
				}
				break;
			case T__14:
				{
				setState(89); varstatement();
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
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
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
			setState(92); match(T__23);
			setState(93); match(T__19);
			setState(94); operand();
			setState(95); match(T__4);
			setState(96); match(T__26);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97); statement();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(103);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(102); match(T__24);
				}
			}

			setState(105); elseblock();
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
			setState(107); match(T__5);
			setState(108); match(T__26);
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109); statement();
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(114); match(T__24);
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
			setState(116); match(T__21);
			setState(117); match(T__26);
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118); statement();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(123); match(T__24);
			setState(124); catchblock();
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
			setState(126); match(T__31);
			setState(127); match(T__19);
			setState(128); match(ID);
			setState(129); match(T__4);
			setState(130); match(T__26);
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131); statement();
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(136); match(T__24);
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
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
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
			setState(138); match(T__27);
			setState(139); match(T__19);
			setState(140); operand();
			setState(141); match(T__4);
			setState(142); match(T__26);
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143); statement();
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__27) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(148); match(T__24);
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
		public InitialisationContext initialisation() {
			return getRuleContext(InitialisationContext.class,0);
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
			setState(150); match(T__15);
			setState(151); initialisation();
			setState(152); match(T__28);
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
		public InitialisationContext initialisation() {
			return getRuleContext(InitialisationContext.class,0);
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
			setState(154); match(T__30);
			setState(155); initialisation();
			setState(156); match(T__28);
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
		public InitialisationContext initialisation() {
			return getRuleContext(InitialisationContext.class,0);
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
			setState(158); assignee();
			setState(159); match(T__25);
			setState(160); initialisation();
			setState(161); match(T__28);
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
		public InitialisationContext initialisation() {
			return getRuleContext(InitialisationContext.class,0);
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
			setState(163); match(T__14);
			setState(164); match(ID);
			setState(167);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(165); match(T__25);
				setState(166); initialisation();
				}
			}

			setState(169); match(T__28);
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

	public static class InitialisationContext extends ParserRuleContext {
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public InitialisationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialisation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).enterInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StexgrammarListener ) ((StexgrammarListener)listener).exitInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StexgrammarVisitor ) return ((StexgrammarVisitor<? extends T>)visitor).visitInitialisation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialisationContext initialisation() throws RecognitionException {
		InitialisationContext _localctx = new InitialisationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initialisation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			switch (_input.LA(1)) {
			case T__26:
				{
				setState(171); object();
				}
				break;
			case T__13:
				{
				setState(172); array();
				}
				break;
			case T__20:
				{
				setState(173); ref();
				}
				break;
			case T__22:
			case T__1:
			case VAL:
			case ID:
				{
				setState(174); expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
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
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(177); functioncall();
				}
				break;

			case 2:
				{
				setState(178); operation();
				}
				break;

			case 3:
				{
				setState(179); operand();
				}
				break;

			case 4:
				{
				setState(180); arrayaccess();
				}
				break;

			case 5:
				{
				setState(181); deref();
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
		public ArrayaccessContext arrayaccess() {
			return getRuleContext(ArrayaccessContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
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
			setState(188);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(184); functioncall();
				}
				break;

			case 2:
				{
				setState(185); operand();
				}
				break;

			case 3:
				{
				setState(186); arrayaccess();
				}
				break;

			case 4:
				{
				setState(187); deref();
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
			setState(192);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(190); identifier();
				}
				break;
			case VAL:
				{
				setState(191); match(VAL);
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
			setState(194); match(ID);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(195); match(T__16);
				setState(196); match(ID);
				}
				}
				setState(201);
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
			setState(202); identifier();
			setState(203); match(T__13);
			setState(204); expression();
			setState(205); match(T__10);
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
			setState(207); match(T__26);
			setState(208); objectfield();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(209); match(T__17);
				setState(210); objectfield();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216); match(T__24);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); match(ID);
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
			setState(220); match(T__13);
			setState(229);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__1) | (1L << VAL) | (1L << ID))) != 0)) {
				{
				setState(221); expression();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(222); match(T__17);
					setState(223); expression();
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(231); match(T__10);
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
			setState(233); match(ID);
			setState(234); match(T__19);
			setState(235); functioncallargs();
			setState(236); match(T__4);
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
			setState(246);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__1) | (1L << VAL) | (1L << ID))) != 0)) {
				{
				setState(238); expression();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(239); match(T__17);
					setState(240); expression();
					}
					}
					setState(245);
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
			setState(248); match(T__20);
			setState(249); identifier();
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
			setState(251); match(T__22);
			setState(252); identifier();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		int _la;
		try {
			setState(260);
			switch (_input.LA(1)) {
			case T__22:
			case VAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(254); expressionop();
				setState(255);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__29) | (1L << T__18) | (1L << T__12) | (1L << T__11) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__3) | (1L << T__2) | (1L << T__0))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(256); expression();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(258); match(T__1);
				setState(259); expression();
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
		enterRule(_localctx, 54, RULE_assignee);
		try {
			setState(265);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262); deref();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263); identifier();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264); arrayaccess();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u010e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\6\2<\n\2\r\2\16\2=\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\6\3F\n\3\r\3\16\3G\3\3\3\3\3\4\3\4\3\4\7\4O\n\4\f\4"+
		"\16\4R\13\4\5\4T\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\6\6e\n\6\r\6\16\6f\3\6\5\6j\n\6\3\6\3\6\3\7\3\7\3\7\6\7q"+
		"\n\7\r\7\16\7r\3\7\3\7\3\b\3\b\3\b\6\bz\n\b\r\b\16\b{\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\6\t\u0087\n\t\r\t\16\t\u0088\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\6\n\u0093\n\n\r\n\16\n\u0094\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00aa\n"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00b2\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00b9\n\20\3\21\3\21\3\21\3\21\5\21\u00bf\n\21\3\22\3\22\5"+
		"\22\u00c3\n\22\3\23\3\23\3\23\7\23\u00c8\n\23\f\23\16\23\u00cb\13\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00d6\n\25\f\25\16\25"+
		"\u00d9\13\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00e3\n\27\f"+
		"\27\16\27\u00e6\13\27\5\27\u00e8\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\7\31\u00f4\n\31\f\31\16\31\u00f7\13\31\5\31\u00f9\n"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0107"+
		"\n\34\3\35\3\35\3\35\5\35\u010c\n\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\3\t\2\3\3\6\6\21\21\27\30\32"+
		"\35 !##\u0116\2;\3\2\2\2\4?\3\2\2\2\6S\3\2\2\2\b\\\3\2\2\2\n^\3\2\2\2"+
		"\fm\3\2\2\2\16v\3\2\2\2\20\u0080\3\2\2\2\22\u008c\3\2\2\2\24\u0098\3\2"+
		"\2\2\26\u009c\3\2\2\2\30\u00a0\3\2\2\2\32\u00a5\3\2\2\2\34\u00b1\3\2\2"+
		"\2\36\u00b8\3\2\2\2 \u00be\3\2\2\2\"\u00c2\3\2\2\2$\u00c4\3\2\2\2&\u00cc"+
		"\3\2\2\2(\u00d1\3\2\2\2*\u00dc\3\2\2\2,\u00de\3\2\2\2.\u00eb\3\2\2\2\60"+
		"\u00f8\3\2\2\2\62\u00fa\3\2\2\2\64\u00fd\3\2\2\2\66\u0106\3\2\2\28\u010b"+
		"\3\2\2\2:<\5\4\3\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2"+
		"?@\7&\2\2@A\7\20\2\2AB\5\6\4\2BC\7\37\2\2CE\7\t\2\2DF\5\b\5\2ED\3\2\2"+
		"\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\13\2\2J\5\3\2\2\2KP\7&"+
		"\2\2LM\7\22\2\2MO\7&\2\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QT\3\2"+
		"\2\2RP\3\2\2\2SK\3\2\2\2ST\3\2\2\2T\7\3\2\2\2U]\5\n\6\2V]\5\16\b\2W]\5"+
		"\22\n\2X]\5\24\13\2Y]\5\26\f\2Z]\5\30\r\2[]\5\32\16\2\\U\3\2\2\2\\V\3"+
		"\2\2\2\\W\3\2\2\2\\X\3\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]\t\3\2\2"+
		"\2^_\7\f\2\2_`\7\20\2\2`a\5\"\22\2ab\7\37\2\2bd\7\t\2\2ce\5\b\5\2dc\3"+
		"\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hj\7\13\2\2ih\3\2\2\2ij"+
		"\3\2\2\2jk\3\2\2\2kl\5\f\7\2l\13\3\2\2\2mn\7\36\2\2np\7\t\2\2oq\5\b\5"+
		"\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\13\2\2u\r\3\2"+
		"\2\2vw\7\16\2\2wy\7\t\2\2xz\5\b\5\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3"+
		"\2\2\2|}\3\2\2\2}~\7\13\2\2~\177\5\20\t\2\177\17\3\2\2\2\u0080\u0081\7"+
		"\4\2\2\u0081\u0082\7\20\2\2\u0082\u0083\7&\2\2\u0083\u0084\7\37\2\2\u0084"+
		"\u0086\7\t\2\2\u0085\u0087\5\b\5\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\7\13\2\2\u008b\21\3\2\2\2\u008c\u008d\7\b\2\2\u008d\u008e\7\20"+
		"\2\2\u008e\u008f\5\"\22\2\u008f\u0090\7\37\2\2\u0090\u0092\7\t\2\2\u0091"+
		"\u0093\5\b\5\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\13\2\2\u0097"+
		"\23\3\2\2\2\u0098\u0099\7\24\2\2\u0099\u009a\5\34\17\2\u009a\u009b\7\7"+
		"\2\2\u009b\25\3\2\2\2\u009c\u009d\7\5\2\2\u009d\u009e\5\34\17\2\u009e"+
		"\u009f\7\7\2\2\u009f\27\3\2\2\2\u00a0\u00a1\58\35\2\u00a1\u00a2\7\n\2"+
		"\2\u00a2\u00a3\5\34\17\2\u00a3\u00a4\7\7\2\2\u00a4\31\3\2\2\2\u00a5\u00a6"+
		"\7\25\2\2\u00a6\u00a9\7&\2\2\u00a7\u00a8\7\n\2\2\u00a8\u00aa\5\34\17\2"+
		"\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac"+
		"\7\7\2\2\u00ac\33\3\2\2\2\u00ad\u00b2\5(\25\2\u00ae\u00b2\5,\27\2\u00af"+
		"\u00b2\5\62\32\2\u00b0\u00b2\5\36\20\2\u00b1\u00ad\3\2\2\2\u00b1\u00ae"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\35\3\2\2\2\u00b3"+
		"\u00b9\5.\30\2\u00b4\u00b9\5\66\34\2\u00b5\u00b9\5\"\22\2\u00b6\u00b9"+
		"\5&\24\2\u00b7\u00b9\5\64\33\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2\2\2"+
		"\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\37"+
		"\3\2\2\2\u00ba\u00bf\5.\30\2\u00bb\u00bf\5\"\22\2\u00bc\u00bf\5&\24\2"+
		"\u00bd\u00bf\5\64\33\2\u00be\u00ba\3\2\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf!\3\2\2\2\u00c0\u00c3\5$\23\2\u00c1"+
		"\u00c3\7%\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3#\3\2\2\2\u00c4"+
		"\u00c9\7&\2\2\u00c5\u00c6\7\23\2\2\u00c6\u00c8\7&\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"%\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\5$\23\2\u00cd\u00ce\7\26\2\2"+
		"\u00ce\u00cf\5\36\20\2\u00cf\u00d0\7\31\2\2\u00d0\'\3\2\2\2\u00d1\u00d2"+
		"\7\t\2\2\u00d2\u00d7\5*\26\2\u00d3\u00d4\7\22\2\2\u00d4\u00d6\5*\26\2"+
		"\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\13\2\2"+
		"\u00db)\3\2\2\2\u00dc\u00dd\7&\2\2\u00dd+\3\2\2\2\u00de\u00e7\7\26\2\2"+
		"\u00df\u00e4\5\36\20\2\u00e0\u00e1\7\22\2\2\u00e1\u00e3\5\36\20\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7\31\2\2\u00ea-\3\2\2\2"+
		"\u00eb\u00ec\7&\2\2\u00ec\u00ed\7\20\2\2\u00ed\u00ee\5\60\31\2\u00ee\u00ef"+
		"\7\37\2\2\u00ef/\3\2\2\2\u00f0\u00f5\5\36\20\2\u00f1\u00f2\7\22\2\2\u00f2"+
		"\u00f4\5\36\20\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3"+
		"\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00f0\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\61\3\2\2\2\u00fa\u00fb\7\17\2"+
		"\2\u00fb\u00fc\5$\23\2\u00fc\63\3\2\2\2\u00fd\u00fe\7\r\2\2\u00fe\u00ff"+
		"\5$\23\2\u00ff\65\3\2\2\2\u0100\u0101\5 \21\2\u0101\u0102\t\2\2\2\u0102"+
		"\u0103\5\36\20\2\u0103\u0107\3\2\2\2\u0104\u0105\7\"\2\2\u0105\u0107\5"+
		"\36\20\2\u0106\u0100\3\2\2\2\u0106\u0104\3\2\2\2\u0107\67\3\2\2\2\u0108"+
		"\u010c\5\64\33\2\u0109\u010c\5$\23\2\u010a\u010c\5&\24\2\u010b\u0108\3"+
		"\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c9\3\2\2\2\32=GPS\\"+
		"fir{\u0088\u0094\u00a9\u00b1\u00b8\u00be\u00c2\u00c9\u00d7\u00e4\u00e7"+
		"\u00f5\u00f8\u0106\u010b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
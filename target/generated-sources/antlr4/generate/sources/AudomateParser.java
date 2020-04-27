// Generated from generate\sources\Audomate.g4 by ANTLR 4.8
package generate.sources;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AudomateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, Number=37, INT=38, WORD=39, 
		Word=40;
	public static final int
		RULE_prog = 0, RULE_testing = 1, RULE_expr = 2, RULE_lists = 3, RULE_getindex = 4, 
		RULE_commands = 5, RULE_printing = 6, RULE_math = 7, RULE_primitive = 8, 
		RULE_beep = 9, RULE_conditional = 10, RULE_loops = 11, RULE_inequality = 12, 
		RULE_creation = 13, RULE_machine = 14, RULE_createTask = 15, RULE_doTask = 16, 
		RULE_addPart = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "testing", "expr", "lists", "getindex", "commands", "printing", 
			"math", "primitive", "beep", "conditional", "loops", "inequality", "creation", 
			"machine", "createTask", "doTask", "addPart"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "' and '", "'make a list '", "' with '", "'index of '", 
			"' from '", "'the '", "'say '", "'add'", "'multiply'", "' by '", "'divide'", 
			"'subtract'", "'beep'", "'if '", "' is '", "'less'", "' than '", "' do '", 
			"'greater'", "'do'", "' else '", "' times'", "'while'", "'the number '", 
			"'equal'", "' to '", "' than or '", "'value'", "' of '", "'function'", 
			"'describe'", "'run '", "'an '", "' is part of the machine'", "'a '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "Number", "INT", "WORD", "Word"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Audomate.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AudomateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TestingContext testing() {
			return getRuleContext(TestingContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AudomateParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AudomateVisitor ) return ((AudomateVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				testing();
				setState(38);
				match(EOF);
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

	public static class TestingContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TestingContext testing() {
			return getRuleContext(TestingContext.class,0);
		}
		public TestingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testing; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AudomateVisitor ) return ((AudomateVisitor<? extends T>)visitor).visitTesting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestingContext testing() throws RecognitionException {
		TestingContext _localctx = new TestingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_testing);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				expr();
				setState(45);
				match(T__0);
				setState(46);
				testing();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				expr();
				setState(49);
				match(T__1);
				setState(50);
				testing();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(T__0);
				setState(53);
				expr();
				setState(54);
				match(T__0);
				setState(55);
				testing();
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

	public static class ExprContext extends ParserRuleContext {
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public BeepContext beep() {
			return getRuleContext(BeepContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public CreationContext creation() {
			return getRuleContext(CreationContext.class,0);
		}
		public MachineContext machine() {
			return getRuleContext(MachineContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public ListsContext lists() {
			return getRuleContext(ListsContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AudomateVisitor ) return ((AudomateVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				math();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				beep();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				primitive();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				creation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				machine();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(66);
				commands();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(67);
				lists();
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

	public static class ListsContext extends ParserRuleContext {
		public Token name;
		public TestingContext block;
		public TerminalNode WORD() { return getToken(AudomateParser.WORD, 0); }
		public TestingContext testing() {
			return getRuleContext(TestingContext.class,0);
		}
		public GetindexContext getindex() {
			return getRuleContext(GetindexContext.class,0);
		}
		public ListsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lists; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AudomateVisitor ) return ((AudomateVisitor<? extends T>)visitor).visitLists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListsContext lists() throws RecognitionException {
		ListsContext _localctx = new ListsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lists);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(T__2);
				setState(72);
				((ListsContext)_localctx).name = match(WORD);
				setState(73);
				match(T__3);
				setState(74);
				((ListsContext)_localctx).block = testing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				getindex();
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

	public static class GetindexContext extends ParserRuleContext {
		public Token name;
		public ExprContext index;
		public List<TerminalNode> WORD() { return getTokens(AudomateParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(AudomateParser.WORD, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GetindexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getindex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AudomateVisitor ) return ((AudomateVisitor<? extends T>)visitor).visitGetindex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetindexContext getindex() throws RecognitionException {
		GetindexContext _localctx = new GetindexContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_getindex);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__1:
			case T__5:
			case T__10:
			case T__15:
			case T__18:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(T__4);
				setState(80);
				((GetindexContext)_localctx).name = match(WORD);
				setState(81);
				match(T__5);
				setState(82);
				((GetindexContext)_localctx).index = expr();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(T__6);
				setState(84);
				((GetindexContext)_localctx).index = expr();
				setState(85);
				match(T__0);
				setState(86);
				match(WORD);
				setState(87);
				match(T__5);
				setState(88);
				((GetindexContext)_localctx).name = match(WORD);
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

	public static class CommandsContext extends ParserRuleContext {
		public PrintingContext printing() {
			return getRuleContext(PrintingContext.class,0);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AudomateVisitor ) return ((AudomateVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_commands);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				printing();
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

	public static class PrintingContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printing; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AudomateVisitor ) return ((AudomateVisitor<? extends T>)visitor).visitPrinting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintingContext printing() throws RecognitionException {
		PrintingContext _localctx = new PrintingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printing);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__1:
			case T__5:
			case T__10:
			case T__15:
			case T__18:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(T__7);
				setState(98);
				expr();
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

	public static class MathContext extends ParserRuleContext {
		public Token type;
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AudomateVisitor ) return ((AudomateVisitor<? extends T>)visitor).visitMath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_math);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__1:
			case T__5:
			case T__10:
			case T__15:
			case T__18:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				((MathContext)_localctx).type = match(T__8);
				setState(103);
				match(T__0);
				setState(104);
				((MathContext)_localctx).left = expr();
				setState(105);
				match(T__1);
				setState(106);
				((MathContext)_localctx).right = expr();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				((MathContext)_localctx).type = match(T__9);
				setState(109);
				match(T__0);
				setState(110);
				((MathContext)_localctx).left = expr();
				setState(111);
				match(T__10);
				setState(112);
				((MathContext)_localctx).right = expr();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				((MathContext)_localctx).type = match(T__11);
				setState(115);
				match(T__0);
				setState(116);
				((MathContext)_localctx).left = expr();
				setState(117);
				match(T__10);
				setState(118);
				((MathContext)_localctx).right = expr();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				((MathContext)_localctx).type = match(T__12);
				setState(121);
				match(T__0);
				setState(122);
				((MathContext)_localctx).left = expr();
				setState(123);
				match(T__5);
				setState(124);
				((MathContext)_localctx).right = expr();
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

	public static class PrimitiveContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(AudomateParser.Word, 0); }
		public TerminalNode Number() { return getToken(AudomateParser.Number, 0); }
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AudomateVisitor ) return ((AudomateVisitor<? extends T>)visitor).visitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primitive);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__1:
			case T__5:
			case T__10:
			case T__15:
			case T__18:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case Word:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(Word);
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(Number);
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

	public static class BeepContext extends ParserRuleContext {
		public BeepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beep; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AudomateVisitor ) return ((AudomateVisitor<? extends T>)visitor).visitBeep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeepContext beep() throws RecognitionException {
		BeepContext _localctx = new BeepContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_beep);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__1:
			case T__5:
			case T__10:
			case T__15:
			case T__18:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__13);
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

	public static class ConditionalContext extends ParserRuleContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public ExprContext block;
		public ExprContext block2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
		}
		public InequalityContext inequality() {
			return getRuleContext(InequalityContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AudomateVisitor ) return ((AudomateVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditional);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(T__14);
				setState(139);
				((ConditionalContext)_localctx).left = expr();
				setState(140);
				match(T__15);
				setState(141);
				((ConditionalContext)_localctx).op = match(T__16);
				setState(142);
				match(T__17);
				setState(143);
				((ConditionalContext)_localctx).right = expr();
				setState(144);
				match(T__18);
				setState(145);
				((ConditionalContext)_localctx).block = expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(T__14);
				setState(148);
				((ConditionalContext)_localctx).left = expr();
				setState(149);
				match(T__15);
				setState(150);
				((ConditionalContext)_localctx).op = match(T__19);
				setState(151);
				match(T__17);
				setState(152);
				((ConditionalContext)_localctx).right = expr();
				setState(153);
				match(T__18);
				setState(154);
				((ConditionalContext)_localctx).block = expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				match(T__14);
				setState(157);
				((ConditionalContext)_localctx).left = expr();
				setState(158);
				match(T__0);
				setState(159);
				((ConditionalContext)_localctx).op = match(T__20);
				setState(160);
				match(T__0);
				setState(161);
				((ConditionalContext)_localctx).block = expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(T__14);
				setState(164);
				((ConditionalContext)_localctx).left = expr();
				setState(165);
				match(T__0);
				setState(166);
				((ConditionalContext)_localctx).op = match(T__20);
				setState(167);
				match(T__0);
				setState(168);
				((ConditionalContext)_localctx).block = expr();
				setState(169);
				match(T__21);
				setState(170);
				((ConditionalContext)_localctx).block2 = expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				loops();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				inequality();
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

	public static class LoopsContext extends ParserRuleContext {
		public Token type;
		public TestingContext block;
		public TestingContext left;
		public List<TestingContext> testing() {
			return getRuleContexts(TestingContext.class);
		}
		public TestingContext testing(int i) {
			return getRuleContext(TestingContext.class,i);
		}
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AudomateVisitor ) return ((AudomateVisitor<? extends T>)visitor).visitLoops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loops);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__1:
			case T__5:
			case T__10:
			case T__15:
			case T__18:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				((LoopsContext)_localctx).type = match(T__20);
				setState(178);
				match(T__0);
				setState(179);
				((LoopsContext)_localctx).block = testing();
				setState(180);
				match(T__0);
				setState(181);
				((LoopsContext)_localctx).left = testing();
				setState(182);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				((LoopsContext)_localctx).type = match(T__23);
				setState(185);
				match(T__0);
				setState(186);
				((LoopsContext)_localctx).left = testing();
				setState(187);
				match(T__18);
				setState(188);
				((LoopsContext)_localctx).block = testing();
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

	public static class InequalityContext extends ParserRuleContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public Token isEqual;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InequalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inequality; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AudomateVisitor ) return ((AudomateVisitor<? extends T>)visitor).visitInequality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InequalityContext inequality() throws RecognitionException {
		InequalityContext _localctx = new InequalityContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inequality);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(T__24);
				setState(194);
				((InequalityContext)_localctx).left = expr();
				setState(195);
				match(T__15);
				setState(196);
				((InequalityContext)_localctx).op = match(T__16);
				setState(197);
				match(T__17);
				setState(198);
				((InequalityContext)_localctx).right = expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(T__24);
				setState(201);
				((InequalityContext)_localctx).left = expr();
				setState(202);
				match(T__15);
				setState(203);
				((InequalityContext)_localctx).op = match(T__19);
				setState(204);
				match(T__17);
				setState(205);
				((InequalityContext)_localctx).right = expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				match(T__24);
				setState(208);
				((InequalityContext)_localctx).left = expr();
				setState(209);
				match(T__15);
				setState(210);
				((InequalityContext)_localctx).op = match(T__25);
				setState(211);
				match(T__26);
				setState(212);
				((InequalityContext)_localctx).right = expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				match(T__24);
				setState(215);
				((InequalityContext)_localctx).left = expr();
				setState(216);
				match(T__15);
				setState(217);
				((InequalityContext)_localctx).op = match(T__16);
				setState(218);
				match(T__27);
				setState(219);
				((InequalityContext)_localctx).isEqual = match(T__25);
				setState(220);
				match(T__26);
				setState(221);
				((InequalityContext)_localctx).right = expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(223);
				match(T__24);
				setState(224);
				((InequalityContext)_localctx).left = expr();
				setState(225);
				match(T__15);
				setState(226);
				((InequalityContext)_localctx).op = match(T__19);
				setState(227);
				match(T__27);
				setState(228);
				((InequalityContext)_localctx).isEqual = match(T__25);
				setState(229);
				match(T__26);
				setState(230);
				((InequalityContext)_localctx).right = expr();
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

	public static class CreationContext extends ParserRuleContext {
		public Token type;
		public Token name;
		public TestingContext block;
		public Token op;
		public TerminalNode WORD() { return getToken(AudomateParser.WORD, 0); }
		public TestingContext testing() {
			return getRuleContext(TestingContext.class,0);
		}
		public CreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AudomateVisitor ) return ((AudomateVisitor<? extends T>)visitor).visitCreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreationContext creation() throws RecognitionException {
		CreationContext _localctx = new CreationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_creation);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(T__6);
				setState(236);
				((CreationContext)_localctx).type = match(T__28);
				setState(237);
				match(T__29);
				setState(238);
				((CreationContext)_localctx).name = match(WORD);
				setState(239);
				match(T__15);
				setState(240);
				((CreationContext)_localctx).block = testing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(T__6);
				setState(242);
				((CreationContext)_localctx).type = match(T__30);
				setState(243);
				match(T__0);
				setState(244);
				((CreationContext)_localctx).name = match(WORD);
				setState(245);
				match(T__15);
				setState(246);
				((CreationContext)_localctx).block = testing();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				((CreationContext)_localctx).name = match(WORD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				((CreationContext)_localctx).op = match(T__31);
				setState(249);
				match(T__0);
				setState(250);
				((CreationContext)_localctx).name = match(WORD);
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

	public static class MachineContext extends ParserRuleContext {
		public AddPartContext addPart() {
			return getRuleContext(AddPartContext.class,0);
		}
		public DoTaskContext doTask() {
			return getRuleContext(DoTaskContext.class,0);
		}
		public CreateTaskContext createTask() {
			return getRuleContext(CreateTaskContext.class,0);
		}
		public MachineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_machine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AudomateVisitor ) return ((AudomateVisitor<? extends T>)visitor).visitMachine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MachineContext machine() throws RecognitionException {
		MachineContext _localctx = new MachineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_machine);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				addPart();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				doTask();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				createTask();
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

	public static class CreateTaskContext extends ParserRuleContext {
		public Token task;
		public Token action;
		public Token part;
		public ExprContext var;
		public List<TerminalNode> WORD() { return getTokens(AudomateParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(AudomateParser.WORD, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CreateTaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTask; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AudomateVisitor ) return ((AudomateVisitor<? extends T>)visitor).visitCreateTask(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTaskContext createTask() throws RecognitionException {
		CreateTaskContext _localctx = new CreateTaskContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_createTask);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				((CreateTaskContext)_localctx).task = match(WORD);
				setState(261);
				match(T__15);
				setState(262);
				((CreateTaskContext)_localctx).action = match(WORD);
				setState(263);
				match(T__0);
				setState(264);
				((CreateTaskContext)_localctx).part = match(WORD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				((CreateTaskContext)_localctx).task = match(WORD);
				setState(266);
				match(T__15);
				setState(267);
				((CreateTaskContext)_localctx).action = match(WORD);
				setState(268);
				match(T__0);
				setState(269);
				((CreateTaskContext)_localctx).part = match(WORD);
				setState(270);
				match(T__0);
				setState(271);
				((CreateTaskContext)_localctx).var = expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				((CreateTaskContext)_localctx).task = match(WORD);
				setState(273);
				match(T__15);
				setState(274);
				((CreateTaskContext)_localctx).action = match(WORD);
				setState(275);
				match(T__0);
				setState(276);
				((CreateTaskContext)_localctx).part = match(WORD);
				setState(277);
				match(T__0);
				setState(278);
				((CreateTaskContext)_localctx).var = expr();
				setState(279);
				match(T__22);
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

	public static class DoTaskContext extends ParserRuleContext {
		public Token task;
		public TerminalNode WORD() { return getToken(AudomateParser.WORD, 0); }
		public DoTaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doTask; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AudomateVisitor ) return ((AudomateVisitor<? extends T>)visitor).visitDoTask(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoTaskContext doTask() throws RecognitionException {
		DoTaskContext _localctx = new DoTaskContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_doTask);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__1:
			case T__5:
			case T__10:
			case T__15:
			case T__18:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(T__32);
				setState(285);
				((DoTaskContext)_localctx).task = match(WORD);
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

	public static class AddPartContext extends ParserRuleContext {
		public Token part;
		public TerminalNode WORD() { return getToken(AudomateParser.WORD, 0); }
		public AddPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AudomateVisitor ) return ((AudomateVisitor<? extends T>)visitor).visitAddPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddPartContext addPart() throws RecognitionException {
		AddPartContext _localctx = new AddPartContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_addPart);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__1:
			case T__5:
			case T__10:
			case T__15:
			case T__18:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(T__33);
				setState(290);
				((AddPartContext)_localctx).part = match(WORD);
				setState(291);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(T__35);
				setState(293);
				((AddPartContext)_localctx).part = match(WORD);
				setState(294);
				match(T__34);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u012c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\5\2+\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4G\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\7\3\7\5\7a\n\7\3\b\3\b\3\b\5\bf\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0081\n\t\3\n\3\n\3\n\5\n\u0086\n\n"+
		"\3\13\3\13\5\13\u008a\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b1\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c1\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00eb\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00fe\n\17\3\20\3\20\3\20\3\20\5\20\u0104\n\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u011c\n\21\3\22\3\22\3\22\5\22\u0121\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u012a\n\23\3\23\2\2\24\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\2\2\u014d\2*\3\2\2\2\4;\3\2\2"+
		"\2\6F\3\2\2\2\bN\3\2\2\2\n\\\3\2\2\2\f`\3\2\2\2\16e\3\2\2\2\20\u0080\3"+
		"\2\2\2\22\u0085\3\2\2\2\24\u0089\3\2\2\2\26\u00b0\3\2\2\2\30\u00c0\3\2"+
		"\2\2\32\u00ea\3\2\2\2\34\u00fd\3\2\2\2\36\u0103\3\2\2\2 \u011b\3\2\2\2"+
		"\"\u0120\3\2\2\2$\u0129\3\2\2\2&+\3\2\2\2\'(\5\4\3\2()\7\2\2\3)+\3\2\2"+
		"\2*&\3\2\2\2*\'\3\2\2\2+\3\3\2\2\2,<\3\2\2\2-<\5\6\4\2./\5\6\4\2/\60\7"+
		"\3\2\2\60\61\5\4\3\2\61<\3\2\2\2\62\63\5\6\4\2\63\64\7\4\2\2\64\65\5\4"+
		"\3\2\65<\3\2\2\2\66\67\7\3\2\2\678\5\6\4\289\7\3\2\29:\5\4\3\2:<\3\2\2"+
		"\2;,\3\2\2\2;-\3\2\2\2;.\3\2\2\2;\62\3\2\2\2;\66\3\2\2\2<\5\3\2\2\2=G"+
		"\3\2\2\2>G\5\20\t\2?G\5\24\13\2@G\5\26\f\2AG\5\22\n\2BG\5\34\17\2CG\5"+
		"\36\20\2DG\5\f\7\2EG\5\b\5\2F=\3\2\2\2F>\3\2\2\2F?\3\2\2\2F@\3\2\2\2F"+
		"A\3\2\2\2FB\3\2\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2G\7\3\2\2\2HO\3\2\2\2"+
		"IJ\7\5\2\2JK\7)\2\2KL\7\6\2\2LO\5\4\3\2MO\5\n\6\2NH\3\2\2\2NI\3\2\2\2"+
		"NM\3\2\2\2O\t\3\2\2\2P]\3\2\2\2QR\7\7\2\2RS\7)\2\2ST\7\b\2\2T]\5\6\4\2"+
		"UV\7\t\2\2VW\5\6\4\2WX\7\3\2\2XY\7)\2\2YZ\7\b\2\2Z[\7)\2\2[]\3\2\2\2\\"+
		"P\3\2\2\2\\Q\3\2\2\2\\U\3\2\2\2]\13\3\2\2\2^a\3\2\2\2_a\5\16\b\2`^\3\2"+
		"\2\2`_\3\2\2\2a\r\3\2\2\2bf\3\2\2\2cd\7\n\2\2df\5\6\4\2eb\3\2\2\2ec\3"+
		"\2\2\2f\17\3\2\2\2g\u0081\3\2\2\2hi\7\13\2\2ij\7\3\2\2jk\5\6\4\2kl\7\4"+
		"\2\2lm\5\6\4\2m\u0081\3\2\2\2no\7\f\2\2op\7\3\2\2pq\5\6\4\2qr\7\r\2\2"+
		"rs\5\6\4\2s\u0081\3\2\2\2tu\7\16\2\2uv\7\3\2\2vw\5\6\4\2wx\7\r\2\2xy\5"+
		"\6\4\2y\u0081\3\2\2\2z{\7\17\2\2{|\7\3\2\2|}\5\6\4\2}~\7\b\2\2~\177\5"+
		"\6\4\2\177\u0081\3\2\2\2\u0080g\3\2\2\2\u0080h\3\2\2\2\u0080n\3\2\2\2"+
		"\u0080t\3\2\2\2\u0080z\3\2\2\2\u0081\21\3\2\2\2\u0082\u0086\3\2\2\2\u0083"+
		"\u0086\7*\2\2\u0084\u0086\7\'\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0084\3\2\2\2\u0086\23\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u008a"+
		"\7\20\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\25\3\2\2\2\u008b"+
		"\u00b1\3\2\2\2\u008c\u008d\7\21\2\2\u008d\u008e\5\6\4\2\u008e\u008f\7"+
		"\22\2\2\u008f\u0090\7\23\2\2\u0090\u0091\7\24\2\2\u0091\u0092\5\6\4\2"+
		"\u0092\u0093\7\25\2\2\u0093\u0094\5\6\4\2\u0094\u00b1\3\2\2\2\u0095\u0096"+
		"\7\21\2\2\u0096\u0097\5\6\4\2\u0097\u0098\7\22\2\2\u0098\u0099\7\26\2"+
		"\2\u0099\u009a\7\24\2\2\u009a\u009b\5\6\4\2\u009b\u009c\7\25\2\2\u009c"+
		"\u009d\5\6\4\2\u009d\u00b1\3\2\2\2\u009e\u009f\7\21\2\2\u009f\u00a0\5"+
		"\6\4\2\u00a0\u00a1\7\3\2\2\u00a1\u00a2\7\27\2\2\u00a2\u00a3\7\3\2\2\u00a3"+
		"\u00a4\5\6\4\2\u00a4\u00b1\3\2\2\2\u00a5\u00a6\7\21\2\2\u00a6\u00a7\5"+
		"\6\4\2\u00a7\u00a8\7\3\2\2\u00a8\u00a9\7\27\2\2\u00a9\u00aa\7\3\2\2\u00aa"+
		"\u00ab\5\6\4\2\u00ab\u00ac\7\30\2\2\u00ac\u00ad\5\6\4\2\u00ad\u00b1\3"+
		"\2\2\2\u00ae\u00b1\5\30\r\2\u00af\u00b1\5\32\16\2\u00b0\u008b\3\2\2\2"+
		"\u00b0\u008c\3\2\2\2\u00b0\u0095\3\2\2\2\u00b0\u009e\3\2\2\2\u00b0\u00a5"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\27\3\2\2\2\u00b2"+
		"\u00c1\3\2\2\2\u00b3\u00b4\7\27\2\2\u00b4\u00b5\7\3\2\2\u00b5\u00b6\5"+
		"\4\3\2\u00b6\u00b7\7\3\2\2\u00b7\u00b8\5\4\3\2\u00b8\u00b9\7\31\2\2\u00b9"+
		"\u00c1\3\2\2\2\u00ba\u00bb\7\32\2\2\u00bb\u00bc\7\3\2\2\u00bc\u00bd\5"+
		"\4\3\2\u00bd\u00be\7\25\2\2\u00be\u00bf\5\4\3\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00b2\3\2\2\2\u00c0\u00b3\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c1\31\3\2\2"+
		"\2\u00c2\u00eb\3\2\2\2\u00c3\u00c4\7\33\2\2\u00c4\u00c5\5\6\4\2\u00c5"+
		"\u00c6\7\22\2\2\u00c6\u00c7\7\23\2\2\u00c7\u00c8\7\24\2\2\u00c8\u00c9"+
		"\5\6\4\2\u00c9\u00eb\3\2\2\2\u00ca\u00cb\7\33\2\2\u00cb\u00cc\5\6\4\2"+
		"\u00cc\u00cd\7\22\2\2\u00cd\u00ce\7\26\2\2\u00ce\u00cf\7\24\2\2\u00cf"+
		"\u00d0\5\6\4\2\u00d0\u00eb\3\2\2\2\u00d1\u00d2\7\33\2\2\u00d2\u00d3\5"+
		"\6\4\2\u00d3\u00d4\7\22\2\2\u00d4\u00d5\7\34\2\2\u00d5\u00d6\7\35\2\2"+
		"\u00d6\u00d7\5\6\4\2\u00d7\u00eb\3\2\2\2\u00d8\u00d9\7\33\2\2\u00d9\u00da"+
		"\5\6\4\2\u00da\u00db\7\22\2\2\u00db\u00dc\7\23\2\2\u00dc\u00dd\7\36\2"+
		"\2\u00dd\u00de\7\34\2\2\u00de\u00df\7\35\2\2\u00df\u00e0\5\6\4\2\u00e0"+
		"\u00eb\3\2\2\2\u00e1\u00e2\7\33\2\2\u00e2\u00e3\5\6\4\2\u00e3\u00e4\7"+
		"\22\2\2\u00e4\u00e5\7\26\2\2\u00e5\u00e6\7\36\2\2\u00e6\u00e7\7\34\2\2"+
		"\u00e7\u00e8\7\35\2\2\u00e8\u00e9\5\6\4\2\u00e9\u00eb\3\2\2\2\u00ea\u00c2"+
		"\3\2\2\2\u00ea\u00c3\3\2\2\2\u00ea\u00ca\3\2\2\2\u00ea\u00d1\3\2\2\2\u00ea"+
		"\u00d8\3\2\2\2\u00ea\u00e1\3\2\2\2\u00eb\33\3\2\2\2\u00ec\u00fe\3\2\2"+
		"\2\u00ed\u00ee\7\t\2\2\u00ee\u00ef\7\37\2\2\u00ef\u00f0\7 \2\2\u00f0\u00f1"+
		"\7)\2\2\u00f1\u00f2\7\22\2\2\u00f2\u00fe\5\4\3\2\u00f3\u00f4\7\t\2\2\u00f4"+
		"\u00f5\7!\2\2\u00f5\u00f6\7\3\2\2\u00f6\u00f7\7)\2\2\u00f7\u00f8\7\22"+
		"\2\2\u00f8\u00fe\5\4\3\2\u00f9\u00fe\7)\2\2\u00fa\u00fb\7\"\2\2\u00fb"+
		"\u00fc\7\3\2\2\u00fc\u00fe\7)\2\2\u00fd\u00ec\3\2\2\2\u00fd\u00ed\3\2"+
		"\2\2\u00fd\u00f3\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fe"+
		"\35\3\2\2\2\u00ff\u0104\3\2\2\2\u0100\u0104\5$\23\2\u0101\u0104\5\"\22"+
		"\2\u0102\u0104\5 \21\2\u0103\u00ff\3\2\2\2\u0103\u0100\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0103\u0102\3\2\2\2\u0104\37\3\2\2\2\u0105\u011c\3\2\2\2\u0106"+
		"\u0107\7)\2\2\u0107\u0108\7\22\2\2\u0108\u0109\7)\2\2\u0109\u010a\7\3"+
		"\2\2\u010a\u011c\7)\2\2\u010b\u010c\7)\2\2\u010c\u010d\7\22\2\2\u010d"+
		"\u010e\7)\2\2\u010e\u010f\7\3\2\2\u010f\u0110\7)\2\2\u0110\u0111\7\3\2"+
		"\2\u0111\u011c\5\6\4\2\u0112\u0113\7)\2\2\u0113\u0114\7\22\2\2\u0114\u0115"+
		"\7)\2\2\u0115\u0116\7\3\2\2\u0116\u0117\7)\2\2\u0117\u0118\7\3\2\2\u0118"+
		"\u0119\5\6\4\2\u0119\u011a\7\31\2\2\u011a\u011c\3\2\2\2\u011b\u0105\3"+
		"\2\2\2\u011b\u0106\3\2\2\2\u011b\u010b\3\2\2\2\u011b\u0112\3\2\2\2\u011c"+
		"!\3\2\2\2\u011d\u0121\3\2\2\2\u011e\u011f\7#\2\2\u011f\u0121\7)\2\2\u0120"+
		"\u011d\3\2\2\2\u0120\u011e\3\2\2\2\u0121#\3\2\2\2\u0122\u012a\3\2\2\2"+
		"\u0123\u0124\7$\2\2\u0124\u0125\7)\2\2\u0125\u012a\7%\2\2\u0126\u0127"+
		"\7&\2\2\u0127\u0128\7)\2\2\u0128\u012a\7%\2\2\u0129\u0122\3\2\2\2\u0129"+
		"\u0123\3\2\2\2\u0129\u0126\3\2\2\2\u012a%\3\2\2\2\24*;FN\\`e\u0080\u0085"+
		"\u0089\u00b0\u00c0\u00ea\u00fd\u0103\u011b\u0120\u0129";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from generate/sources/Audomate.g4 by ANTLR 4.8
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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, Number=43, INT=44, WORD=45, Word=46;
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
			"' from '", "'the '", "'say '", "'add'", "' + '", "'at'", "'multiply'", 
			"' by '", "'x'", "'divide'", "'subtract'", "'beep'", "'if '", "' then '", 
			"'else'", "'otherwise'", "'if not'", "'do'", "' times'", "'while'", "' do '", 
			"'the number '", "' is '", "'less'", "' than '", "'greater'", "'equal'", 
			"' to '", "' than or '", "'value'", "' of '", "'function'", "'describe'", 
			"'run '", "'an '", "' is part of the machine'", "'a '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "Number", "INT", "WORD", "Word"
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
			case T__9:
			case T__12:
			case T__18:
			case T__23:
			case T__25:
			case T__27:
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
			case T__9:
			case T__12:
			case T__18:
			case T__23:
			case T__25:
			case T__27:
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				((MathContext)_localctx).type = match(T__8);
				setState(109);
				match(T__0);
				setState(110);
				((MathContext)_localctx).left = expr();
				setState(111);
				match(T__9);
				setState(112);
				((MathContext)_localctx).right = expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				((MathContext)_localctx).type = match(T__10);
				setState(115);
				match(T__0);
				setState(116);
				((MathContext)_localctx).left = expr();
				setState(117);
				match(T__1);
				setState(118);
				((MathContext)_localctx).right = expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				((MathContext)_localctx).type = match(T__10);
				setState(121);
				match(T__0);
				setState(122);
				((MathContext)_localctx).left = expr();
				setState(123);
				match(T__9);
				setState(124);
				((MathContext)_localctx).right = expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				((MathContext)_localctx).type = match(T__11);
				setState(127);
				match(T__0);
				setState(128);
				((MathContext)_localctx).left = expr();
				setState(129);
				match(T__12);
				setState(130);
				((MathContext)_localctx).right = expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(132);
				((MathContext)_localctx).type = match(T__11);
				setState(133);
				match(T__0);
				setState(134);
				((MathContext)_localctx).left = expr();
				setState(135);
				match(T__1);
				setState(136);
				((MathContext)_localctx).right = expr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(138);
				((MathContext)_localctx).type = match(T__13);
				setState(139);
				match(T__0);
				setState(140);
				((MathContext)_localctx).left = expr();
				setState(141);
				match(T__12);
				setState(142);
				((MathContext)_localctx).right = expr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(144);
				((MathContext)_localctx).type = match(T__13);
				setState(145);
				match(T__0);
				setState(146);
				((MathContext)_localctx).left = expr();
				setState(147);
				match(T__1);
				setState(148);
				((MathContext)_localctx).right = expr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(150);
				((MathContext)_localctx).type = match(T__14);
				setState(151);
				match(T__0);
				setState(152);
				((MathContext)_localctx).left = expr();
				setState(153);
				match(T__12);
				setState(154);
				((MathContext)_localctx).right = expr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(156);
				((MathContext)_localctx).type = match(T__15);
				setState(157);
				match(T__0);
				setState(158);
				((MathContext)_localctx).left = expr();
				setState(159);
				match(T__5);
				setState(160);
				((MathContext)_localctx).right = expr();
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
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__1:
			case T__5:
			case T__9:
			case T__12:
			case T__18:
			case T__23:
			case T__25:
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case Word:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(Word);
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
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
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__1:
			case T__5:
			case T__9:
			case T__12:
			case T__18:
			case T__23:
			case T__25:
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(T__16);
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
		public TestingContext left;
		public TestingContext block;
		public Token op;
		public TestingContext block2;
		public List<TestingContext> testing() {
			return getRuleContexts(TestingContext.class);
		}
		public TestingContext testing(int i) {
			return getRuleContext(TestingContext.class,i);
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
			setState(208);
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
				setState(174);
				match(T__17);
				setState(175);
				((ConditionalContext)_localctx).left = testing();
				setState(176);
				match(T__18);
				setState(177);
				((ConditionalContext)_localctx).block = testing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(T__17);
				setState(180);
				((ConditionalContext)_localctx).left = testing();
				setState(181);
				match(T__18);
				setState(182);
				((ConditionalContext)_localctx).block = testing();
				setState(183);
				match(T__0);
				setState(184);
				((ConditionalContext)_localctx).op = match(T__19);
				setState(185);
				match(T__0);
				setState(186);
				((ConditionalContext)_localctx).block2 = testing();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(T__17);
				setState(189);
				((ConditionalContext)_localctx).left = testing();
				setState(190);
				match(T__18);
				setState(191);
				((ConditionalContext)_localctx).block = testing();
				setState(192);
				match(T__0);
				setState(193);
				((ConditionalContext)_localctx).op = match(T__20);
				setState(194);
				match(T__0);
				setState(195);
				((ConditionalContext)_localctx).block2 = testing();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				match(T__17);
				setState(198);
				((ConditionalContext)_localctx).left = testing();
				setState(199);
				match(T__18);
				setState(200);
				((ConditionalContext)_localctx).block = testing();
				setState(201);
				match(T__0);
				setState(202);
				((ConditionalContext)_localctx).op = match(T__21);
				setState(203);
				match(T__0);
				setState(204);
				((ConditionalContext)_localctx).block2 = testing();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(206);
				loops();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(207);
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
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__1:
			case T__5:
			case T__9:
			case T__12:
			case T__18:
			case T__23:
			case T__25:
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				((LoopsContext)_localctx).type = match(T__22);
				setState(212);
				match(T__0);
				setState(213);
				((LoopsContext)_localctx).block = testing();
				setState(214);
				match(T__0);
				setState(215);
				((LoopsContext)_localctx).left = testing();
				setState(216);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				((LoopsContext)_localctx).type = match(T__24);
				setState(219);
				match(T__0);
				setState(220);
				((LoopsContext)_localctx).left = testing();
				setState(221);
				match(T__25);
				setState(222);
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
			setState(266);
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
				setState(227);
				match(T__26);
				setState(228);
				((InequalityContext)_localctx).left = expr();
				setState(229);
				match(T__27);
				setState(230);
				((InequalityContext)_localctx).op = match(T__28);
				setState(231);
				match(T__29);
				setState(232);
				((InequalityContext)_localctx).right = expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(T__26);
				setState(235);
				((InequalityContext)_localctx).left = expr();
				setState(236);
				match(T__27);
				setState(237);
				((InequalityContext)_localctx).op = match(T__30);
				setState(238);
				match(T__29);
				setState(239);
				((InequalityContext)_localctx).right = expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				match(T__26);
				setState(242);
				((InequalityContext)_localctx).left = expr();
				setState(243);
				match(T__27);
				setState(244);
				((InequalityContext)_localctx).op = match(T__31);
				setState(245);
				match(T__32);
				setState(246);
				((InequalityContext)_localctx).right = expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				match(T__26);
				setState(249);
				((InequalityContext)_localctx).left = expr();
				setState(250);
				match(T__27);
				setState(251);
				((InequalityContext)_localctx).op = match(T__28);
				setState(252);
				match(T__33);
				setState(253);
				((InequalityContext)_localctx).isEqual = match(T__31);
				setState(254);
				match(T__32);
				setState(255);
				((InequalityContext)_localctx).right = expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				match(T__26);
				setState(258);
				((InequalityContext)_localctx).left = expr();
				setState(259);
				match(T__27);
				setState(260);
				((InequalityContext)_localctx).op = match(T__30);
				setState(261);
				match(T__33);
				setState(262);
				((InequalityContext)_localctx).isEqual = match(T__31);
				setState(263);
				match(T__32);
				setState(264);
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
			setState(285);
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
				setState(269);
				match(T__6);
				setState(270);
				((CreationContext)_localctx).type = match(T__34);
				setState(271);
				match(T__35);
				setState(272);
				((CreationContext)_localctx).name = match(WORD);
				setState(273);
				match(T__27);
				setState(274);
				((CreationContext)_localctx).block = testing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(T__6);
				setState(276);
				((CreationContext)_localctx).type = match(T__36);
				setState(277);
				match(T__0);
				setState(278);
				((CreationContext)_localctx).name = match(WORD);
				setState(279);
				match(T__27);
				setState(280);
				((CreationContext)_localctx).block = testing();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				((CreationContext)_localctx).name = match(WORD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				((CreationContext)_localctx).op = match(T__37);
				setState(283);
				match(T__0);
				setState(284);
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
			setState(291);
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
				setState(288);
				addPart();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				doTask();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
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
			setState(315);
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
				setState(294);
				((CreateTaskContext)_localctx).task = match(WORD);
				setState(295);
				match(T__27);
				setState(296);
				((CreateTaskContext)_localctx).action = match(WORD);
				setState(297);
				match(T__0);
				setState(298);
				((CreateTaskContext)_localctx).part = match(WORD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				((CreateTaskContext)_localctx).task = match(WORD);
				setState(300);
				match(T__27);
				setState(301);
				((CreateTaskContext)_localctx).action = match(WORD);
				setState(302);
				match(T__0);
				setState(303);
				((CreateTaskContext)_localctx).part = match(WORD);
				setState(304);
				match(T__0);
				setState(305);
				((CreateTaskContext)_localctx).var = expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				((CreateTaskContext)_localctx).task = match(WORD);
				setState(307);
				match(T__27);
				setState(308);
				((CreateTaskContext)_localctx).action = match(WORD);
				setState(309);
				match(T__0);
				setState(310);
				((CreateTaskContext)_localctx).part = match(WORD);
				setState(311);
				match(T__0);
				setState(312);
				((CreateTaskContext)_localctx).var = expr();
				setState(313);
				match(T__23);
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
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__1:
			case T__5:
			case T__9:
			case T__12:
			case T__18:
			case T__23:
			case T__25:
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(T__38);
				setState(319);
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
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__1:
			case T__5:
			case T__9:
			case T__12:
			case T__18:
			case T__23:
			case T__25:
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(T__39);
				setState(324);
				((AddPartContext)_localctx).part = match(WORD);
				setState(325);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				match(T__41);
				setState(327);
				((AddPartContext)_localctx).part = match(WORD);
				setState(328);
				match(T__40);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u014e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\5\2+\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4G\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\7\3\7\5\7a\n\7\3\b\3\b\3\b\5\bf\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a5\n\t\3\n\3\n\3\n\5\n\u00aa"+
		"\n\n\3\13\3\13\5\13\u00ae\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d3\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e3\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u010d\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0120\n\17\3\20\3\20\3\20\3\20\5\20\u0126\n\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u013e\n\21\3\22\3\22\3\22\5\22\u0143\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u014c\n\23\3\23\2\2\24\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$\2\2\2\u0175\2*\3\2\2\2\4;\3\2\2\2\6F\3"+
		"\2\2\2\bN\3\2\2\2\n\\\3\2\2\2\f`\3\2\2\2\16e\3\2\2\2\20\u00a4\3\2\2\2"+
		"\22\u00a9\3\2\2\2\24\u00ad\3\2\2\2\26\u00d2\3\2\2\2\30\u00e2\3\2\2\2\32"+
		"\u010c\3\2\2\2\34\u011f\3\2\2\2\36\u0125\3\2\2\2 \u013d\3\2\2\2\"\u0142"+
		"\3\2\2\2$\u014b\3\2\2\2&+\3\2\2\2\'(\5\4\3\2()\7\2\2\3)+\3\2\2\2*&\3\2"+
		"\2\2*\'\3\2\2\2+\3\3\2\2\2,<\3\2\2\2-<\5\6\4\2./\5\6\4\2/\60\7\3\2\2\60"+
		"\61\5\4\3\2\61<\3\2\2\2\62\63\5\6\4\2\63\64\7\4\2\2\64\65\5\4\3\2\65<"+
		"\3\2\2\2\66\67\7\3\2\2\678\5\6\4\289\7\3\2\29:\5\4\3\2:<\3\2\2\2;,\3\2"+
		"\2\2;-\3\2\2\2;.\3\2\2\2;\62\3\2\2\2;\66\3\2\2\2<\5\3\2\2\2=G\3\2\2\2"+
		">G\5\20\t\2?G\5\24\13\2@G\5\26\f\2AG\5\22\n\2BG\5\34\17\2CG\5\36\20\2"+
		"DG\5\f\7\2EG\5\b\5\2F=\3\2\2\2F>\3\2\2\2F?\3\2\2\2F@\3\2\2\2FA\3\2\2\2"+
		"FB\3\2\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2G\7\3\2\2\2HO\3\2\2\2IJ\7\5\2"+
		"\2JK\7/\2\2KL\7\6\2\2LO\5\4\3\2MO\5\n\6\2NH\3\2\2\2NI\3\2\2\2NM\3\2\2"+
		"\2O\t\3\2\2\2P]\3\2\2\2QR\7\7\2\2RS\7/\2\2ST\7\b\2\2T]\5\6\4\2UV\7\t\2"+
		"\2VW\5\6\4\2WX\7\3\2\2XY\7/\2\2YZ\7\b\2\2Z[\7/\2\2[]\3\2\2\2\\P\3\2\2"+
		"\2\\Q\3\2\2\2\\U\3\2\2\2]\13\3\2\2\2^a\3\2\2\2_a\5\16\b\2`^\3\2\2\2`_"+
		"\3\2\2\2a\r\3\2\2\2bf\3\2\2\2cd\7\n\2\2df\5\6\4\2eb\3\2\2\2ec\3\2\2\2"+
		"f\17\3\2\2\2g\u00a5\3\2\2\2hi\7\13\2\2ij\7\3\2\2jk\5\6\4\2kl\7\4\2\2l"+
		"m\5\6\4\2m\u00a5\3\2\2\2no\7\13\2\2op\7\3\2\2pq\5\6\4\2qr\7\f\2\2rs\5"+
		"\6\4\2s\u00a5\3\2\2\2tu\7\r\2\2uv\7\3\2\2vw\5\6\4\2wx\7\4\2\2xy\5\6\4"+
		"\2y\u00a5\3\2\2\2z{\7\r\2\2{|\7\3\2\2|}\5\6\4\2}~\7\f\2\2~\177\5\6\4\2"+
		"\177\u00a5\3\2\2\2\u0080\u0081\7\16\2\2\u0081\u0082\7\3\2\2\u0082\u0083"+
		"\5\6\4\2\u0083\u0084\7\17\2\2\u0084\u0085\5\6\4\2\u0085\u00a5\3\2\2\2"+
		"\u0086\u0087\7\16\2\2\u0087\u0088\7\3\2\2\u0088\u0089\5\6\4\2\u0089\u008a"+
		"\7\4\2\2\u008a\u008b\5\6\4\2\u008b\u00a5\3\2\2\2\u008c\u008d\7\20\2\2"+
		"\u008d\u008e\7\3\2\2\u008e\u008f\5\6\4\2\u008f\u0090\7\17\2\2\u0090\u0091"+
		"\5\6\4\2\u0091\u00a5\3\2\2\2\u0092\u0093\7\20\2\2\u0093\u0094\7\3\2\2"+
		"\u0094\u0095\5\6\4\2\u0095\u0096\7\4\2\2\u0096\u0097\5\6\4\2\u0097\u00a5"+
		"\3\2\2\2\u0098\u0099\7\21\2\2\u0099\u009a\7\3\2\2\u009a\u009b\5\6\4\2"+
		"\u009b\u009c\7\17\2\2\u009c\u009d\5\6\4\2\u009d\u00a5\3\2\2\2\u009e\u009f"+
		"\7\22\2\2\u009f\u00a0\7\3\2\2\u00a0\u00a1\5\6\4\2\u00a1\u00a2\7\b\2\2"+
		"\u00a2\u00a3\5\6\4\2\u00a3\u00a5\3\2\2\2\u00a4g\3\2\2\2\u00a4h\3\2\2\2"+
		"\u00a4n\3\2\2\2\u00a4t\3\2\2\2\u00a4z\3\2\2\2\u00a4\u0080\3\2\2\2\u00a4"+
		"\u0086\3\2\2\2\u00a4\u008c\3\2\2\2\u00a4\u0092\3\2\2\2\u00a4\u0098\3\2"+
		"\2\2\u00a4\u009e\3\2\2\2\u00a5\21\3\2\2\2\u00a6\u00aa\3\2\2\2\u00a7\u00aa"+
		"\7\60\2\2\u00a8\u00aa\7-\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\23\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00ae\7\23\2"+
		"\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\25\3\2\2\2\u00af\u00d3"+
		"\3\2\2\2\u00b0\u00b1\7\24\2\2\u00b1\u00b2\5\4\3\2\u00b2\u00b3\7\25\2\2"+
		"\u00b3\u00b4\5\4\3\2\u00b4\u00d3\3\2\2\2\u00b5\u00b6\7\24\2\2\u00b6\u00b7"+
		"\5\4\3\2\u00b7\u00b8\7\25\2\2\u00b8\u00b9\5\4\3\2\u00b9\u00ba\7\3\2\2"+
		"\u00ba\u00bb\7\26\2\2\u00bb\u00bc\7\3\2\2\u00bc\u00bd\5\4\3\2\u00bd\u00d3"+
		"\3\2\2\2\u00be\u00bf\7\24\2\2\u00bf\u00c0\5\4\3\2\u00c0\u00c1\7\25\2\2"+
		"\u00c1\u00c2\5\4\3\2\u00c2\u00c3\7\3\2\2\u00c3\u00c4\7\27\2\2\u00c4\u00c5"+
		"\7\3\2\2\u00c5\u00c6\5\4\3\2\u00c6\u00d3\3\2\2\2\u00c7\u00c8\7\24\2\2"+
		"\u00c8\u00c9\5\4\3\2\u00c9\u00ca\7\25\2\2\u00ca\u00cb\5\4\3\2\u00cb\u00cc"+
		"\7\3\2\2\u00cc\u00cd\7\30\2\2\u00cd\u00ce\7\3\2\2\u00ce\u00cf\5\4\3\2"+
		"\u00cf\u00d3\3\2\2\2\u00d0\u00d3\5\30\r\2\u00d1\u00d3\5\32\16\2\u00d2"+
		"\u00af\3\2\2\2\u00d2\u00b0\3\2\2\2\u00d2\u00b5\3\2\2\2\u00d2\u00be\3\2"+
		"\2\2\u00d2\u00c7\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\27\3\2\2\2\u00d4\u00e3\3\2\2\2\u00d5\u00d6\7\31\2\2\u00d6\u00d7\7\3\2"+
		"\2\u00d7\u00d8\5\4\3\2\u00d8\u00d9\7\3\2\2\u00d9\u00da\5\4\3\2\u00da\u00db"+
		"\7\32\2\2\u00db\u00e3\3\2\2\2\u00dc\u00dd\7\33\2\2\u00dd\u00de\7\3\2\2"+
		"\u00de\u00df\5\4\3\2\u00df\u00e0\7\34\2\2\u00e0\u00e1\5\4\3\2\u00e1\u00e3"+
		"\3\2\2\2\u00e2\u00d4\3\2\2\2\u00e2\u00d5\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e3"+
		"\31\3\2\2\2\u00e4\u010d\3\2\2\2\u00e5\u00e6\7\35\2\2\u00e6\u00e7\5\6\4"+
		"\2\u00e7\u00e8\7\36\2\2\u00e8\u00e9\7\37\2\2\u00e9\u00ea\7 \2\2\u00ea"+
		"\u00eb\5\6\4\2\u00eb\u010d\3\2\2\2\u00ec\u00ed\7\35\2\2\u00ed\u00ee\5"+
		"\6\4\2\u00ee\u00ef\7\36\2\2\u00ef\u00f0\7!\2\2\u00f0\u00f1\7 \2\2\u00f1"+
		"\u00f2\5\6\4\2\u00f2\u010d\3\2\2\2\u00f3\u00f4\7\35\2\2\u00f4\u00f5\5"+
		"\6\4\2\u00f5\u00f6\7\36\2\2\u00f6\u00f7\7\"\2\2\u00f7\u00f8\7#\2\2\u00f8"+
		"\u00f9\5\6\4\2\u00f9\u010d\3\2\2\2\u00fa\u00fb\7\35\2\2\u00fb\u00fc\5"+
		"\6\4\2\u00fc\u00fd\7\36\2\2\u00fd\u00fe\7\37\2\2\u00fe\u00ff\7$\2\2\u00ff"+
		"\u0100\7\"\2\2\u0100\u0101\7#\2\2\u0101\u0102\5\6\4\2\u0102\u010d\3\2"+
		"\2\2\u0103\u0104\7\35\2\2\u0104\u0105\5\6\4\2\u0105\u0106\7\36\2\2\u0106"+
		"\u0107\7!\2\2\u0107\u0108\7$\2\2\u0108\u0109\7\"\2\2\u0109\u010a\7#\2"+
		"\2\u010a\u010b\5\6\4\2\u010b\u010d\3\2\2\2\u010c\u00e4\3\2\2\2\u010c\u00e5"+
		"\3\2\2\2\u010c\u00ec\3\2\2\2\u010c\u00f3\3\2\2\2\u010c\u00fa\3\2\2\2\u010c"+
		"\u0103\3\2\2\2\u010d\33\3\2\2\2\u010e\u0120\3\2\2\2\u010f\u0110\7\t\2"+
		"\2\u0110\u0111\7%\2\2\u0111\u0112\7&\2\2\u0112\u0113\7/\2\2\u0113\u0114"+
		"\7\36\2\2\u0114\u0120\5\4\3\2\u0115\u0116\7\t\2\2\u0116\u0117\7\'\2\2"+
		"\u0117\u0118\7\3\2\2\u0118\u0119\7/\2\2\u0119\u011a\7\36\2\2\u011a\u0120"+
		"\5\4\3\2\u011b\u0120\7/\2\2\u011c\u011d\7(\2\2\u011d\u011e\7\3\2\2\u011e"+
		"\u0120\7/\2\2\u011f\u010e\3\2\2\2\u011f\u010f\3\2\2\2\u011f\u0115\3\2"+
		"\2\2\u011f\u011b\3\2\2\2\u011f\u011c\3\2\2\2\u0120\35\3\2\2\2\u0121\u0126"+
		"\3\2\2\2\u0122\u0126\5$\23\2\u0123\u0126\5\"\22\2\u0124\u0126\5 \21\2"+
		"\u0125\u0121\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124"+
		"\3\2\2\2\u0126\37\3\2\2\2\u0127\u013e\3\2\2\2\u0128\u0129\7/\2\2\u0129"+
		"\u012a\7\36\2\2\u012a\u012b\7/\2\2\u012b\u012c\7\3\2\2\u012c\u013e\7/"+
		"\2\2\u012d\u012e\7/\2\2\u012e\u012f\7\36\2\2\u012f\u0130\7/\2\2\u0130"+
		"\u0131\7\3\2\2\u0131\u0132\7/\2\2\u0132\u0133\7\3\2\2\u0133\u013e\5\6"+
		"\4\2\u0134\u0135\7/\2\2\u0135\u0136\7\36\2\2\u0136\u0137\7/\2\2\u0137"+
		"\u0138\7\3\2\2\u0138\u0139\7/\2\2\u0139\u013a\7\3\2\2\u013a\u013b\5\6"+
		"\4\2\u013b\u013c\7\32\2\2\u013c\u013e\3\2\2\2\u013d\u0127\3\2\2\2\u013d"+
		"\u0128\3\2\2\2\u013d\u012d\3\2\2\2\u013d\u0134\3\2\2\2\u013e!\3\2\2\2"+
		"\u013f\u0143\3\2\2\2\u0140\u0141\7)\2\2\u0141\u0143\7/\2\2\u0142\u013f"+
		"\3\2\2\2\u0142\u0140\3\2\2\2\u0143#\3\2\2\2\u0144\u014c\3\2\2\2\u0145"+
		"\u0146\7*\2\2\u0146\u0147\7/\2\2\u0147\u014c\7+\2\2\u0148\u0149\7,\2\2"+
		"\u0149\u014a\7/\2\2\u014a\u014c\7+\2\2\u014b\u0144\3\2\2\2\u014b\u0145"+
		"\3\2\2\2\u014b\u0148\3\2\2\2\u014c%\3\2\2\2\24*;FN\\`e\u00a4\u00a9\u00ad"+
		"\u00d2\u00e2\u010c\u011f\u0125\u013d\u0142\u014b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		T__24=25, T__25=26, T__26=27, Number=28, INT=29, WORD=30, Word=31;
	public static final int
		RULE_prog = 0, RULE_testing = 1, RULE_expr = 2, RULE_commands = 3, RULE_printing = 4, 
		RULE_math = 5, RULE_primitive = 6, RULE_beep = 7, RULE_conditional = 8, 
		RULE_loops = 9, RULE_inequality = 10, RULE_creation = 11, RULE_machine = 12, 
		RULE_addPart = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "testing", "expr", "commands", "printing", "math", "primitive", 
			"beep", "conditional", "loops", "inequality", "creation", "machine", 
			"addPart"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'say '", "'add'", "' and '", "'multiply'", "' by '", "'divide'", 
			"'subtract'", "' from '", "'beep'", "'if '", "' is '", "'less'", "' than '", 
			"' do '", "'greater'", "'do'", "' else '", "' times'", "'while'", "'the number '", 
			"' than or '", "'equal'", "' to '", "'an '", "' is part of the machine'", 
			"'a '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "Number", "INT", "WORD", "Word"
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
			setState(32);
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
				setState(29);
				testing();
				setState(30);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
			setState(45);
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
				setState(35);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				expr();
				setState(37);
				match(T__0);
				setState(38);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				match(T__0);
				setState(41);
				expr();
				setState(42);
				match(T__0);
				setState(43);
				expr();
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
			setState(55);
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
				setState(48);
				math();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				beep();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				primitive();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				creation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				machine();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(54);
				commands();
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
		enterRule(_localctx, 6, RULE_commands);
		try {
			setState(59);
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
				setState(58);
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
		enterRule(_localctx, 8, RULE_printing);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__3:
			case T__5:
			case T__8:
			case T__11:
			case T__14:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__1);
				setState(63);
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
		enterRule(_localctx, 10, RULE_math);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__3:
			case T__5:
			case T__8:
			case T__11:
			case T__14:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				((MathContext)_localctx).type = match(T__2);
				setState(68);
				match(T__0);
				setState(69);
				((MathContext)_localctx).left = expr();
				setState(70);
				match(T__3);
				setState(71);
				((MathContext)_localctx).right = expr();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				((MathContext)_localctx).type = match(T__4);
				setState(74);
				match(T__0);
				setState(75);
				((MathContext)_localctx).left = expr();
				setState(76);
				match(T__5);
				setState(77);
				((MathContext)_localctx).right = expr();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				((MathContext)_localctx).type = match(T__6);
				setState(80);
				match(T__0);
				setState(81);
				((MathContext)_localctx).left = expr();
				setState(82);
				match(T__5);
				setState(83);
				((MathContext)_localctx).right = expr();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				((MathContext)_localctx).type = match(T__7);
				setState(86);
				match(T__0);
				setState(87);
				((MathContext)_localctx).left = expr();
				setState(88);
				match(T__8);
				setState(89);
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
		enterRule(_localctx, 12, RULE_primitive);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__3:
			case T__5:
			case T__8:
			case T__11:
			case T__14:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case Word:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(Word);
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
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
		enterRule(_localctx, 14, RULE_beep);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__3:
			case T__5:
			case T__8:
			case T__11:
			case T__14:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(T__9);
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
		enterRule(_localctx, 16, RULE_conditional);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(T__10);
				setState(104);
				((ConditionalContext)_localctx).left = expr();
				setState(105);
				match(T__11);
				setState(106);
				((ConditionalContext)_localctx).op = match(T__12);
				setState(107);
				match(T__13);
				setState(108);
				((ConditionalContext)_localctx).right = expr();
				setState(109);
				match(T__14);
				setState(110);
				((ConditionalContext)_localctx).block = expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(T__10);
				setState(113);
				((ConditionalContext)_localctx).left = expr();
				setState(114);
				match(T__11);
				setState(115);
				((ConditionalContext)_localctx).op = match(T__15);
				setState(116);
				match(T__13);
				setState(117);
				((ConditionalContext)_localctx).right = expr();
				setState(118);
				match(T__14);
				setState(119);
				((ConditionalContext)_localctx).block = expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(T__10);
				setState(122);
				((ConditionalContext)_localctx).left = expr();
				setState(123);
				match(T__0);
				setState(124);
				((ConditionalContext)_localctx).op = match(T__16);
				setState(125);
				match(T__0);
				setState(126);
				((ConditionalContext)_localctx).block = expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				match(T__10);
				setState(129);
				((ConditionalContext)_localctx).left = expr();
				setState(130);
				match(T__0);
				setState(131);
				((ConditionalContext)_localctx).op = match(T__16);
				setState(132);
				match(T__0);
				setState(133);
				((ConditionalContext)_localctx).block = expr();
				setState(134);
				match(T__17);
				setState(135);
				((ConditionalContext)_localctx).block2 = expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(137);
				loops();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(138);
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
		public ExprContext block;
		public ExprContext left;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 18, RULE_loops);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__3:
			case T__5:
			case T__8:
			case T__11:
			case T__14:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				((LoopsContext)_localctx).type = match(T__16);
				setState(143);
				match(T__0);
				setState(144);
				((LoopsContext)_localctx).block = expr();
				setState(145);
				match(T__0);
				setState(146);
				((LoopsContext)_localctx).left = expr();
				setState(147);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				((LoopsContext)_localctx).type = match(T__19);
				setState(150);
				match(T__0);
				setState(151);
				((LoopsContext)_localctx).left = expr();
				setState(152);
				match(T__14);
				setState(153);
				((LoopsContext)_localctx).block = expr();
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
		enterRule(_localctx, 20, RULE_inequality);
		try {
			setState(190);
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
				setState(158);
				match(T__20);
				setState(159);
				((InequalityContext)_localctx).left = expr();
				setState(160);
				match(T__11);
				setState(161);
				((InequalityContext)_localctx).op = match(T__12);
				setState(162);
				match(T__13);
				setState(163);
				((InequalityContext)_localctx).right = expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(T__20);
				setState(166);
				((InequalityContext)_localctx).left = expr();
				setState(167);
				match(T__11);
				setState(168);
				((InequalityContext)_localctx).op = match(T__15);
				setState(169);
				match(T__13);
				setState(170);
				((InequalityContext)_localctx).right = expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(T__20);
				setState(173);
				((InequalityContext)_localctx).left = expr();
				setState(174);
				match(T__11);
				setState(175);
				((InequalityContext)_localctx).op = match(T__12);
				setState(176);
				match(T__21);
				setState(177);
				((InequalityContext)_localctx).isEqual = match(T__22);
				setState(178);
				match(T__23);
				setState(179);
				((InequalityContext)_localctx).right = expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				match(T__20);
				setState(182);
				((InequalityContext)_localctx).left = expr();
				setState(183);
				match(T__11);
				setState(184);
				((InequalityContext)_localctx).op = match(T__15);
				setState(185);
				match(T__21);
				setState(186);
				((InequalityContext)_localctx).isEqual = match(T__22);
				setState(187);
				match(T__23);
				setState(188);
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
		public Token name;
		public ExprContext block;
		public TerminalNode WORD() { return getToken(AudomateParser.WORD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 22, RULE_creation);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				((CreationContext)_localctx).name = match(WORD);
				setState(194);
				match(T__11);
				setState(195);
				((CreationContext)_localctx).block = expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
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
		enterRule(_localctx, 24, RULE_machine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			addPart();
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
		enterRule(_localctx, 26, RULE_addPart);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__3:
			case T__5:
			case T__8:
			case T__11:
			case T__14:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(T__24);
				setState(203);
				((AddPartContext)_localctx).part = match(WORD);
				setState(204);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(T__26);
				setState(206);
				((AddPartContext)_localctx).part = match(WORD);
				setState(207);
				match(T__25);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00d5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\5\2#\n\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\5\6C\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\b\3\b\3\b\5\bc\n\b\3\t\3\t\5\tg\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u008e\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u009e\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c1\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00c8"+
		"\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d3\n\17\3\17"+
		"\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2\u00ea\2\"\3\2\2\2\4"+
		"/\3\2\2\2\69\3\2\2\2\b=\3\2\2\2\nB\3\2\2\2\f]\3\2\2\2\16b\3\2\2\2\20f"+
		"\3\2\2\2\22\u008d\3\2\2\2\24\u009d\3\2\2\2\26\u00c0\3\2\2\2\30\u00c7\3"+
		"\2\2\2\32\u00c9\3\2\2\2\34\u00d2\3\2\2\2\36#\3\2\2\2\37 \5\4\3\2 !\7\2"+
		"\2\3!#\3\2\2\2\"\36\3\2\2\2\"\37\3\2\2\2#\3\3\2\2\2$\60\3\2\2\2%\60\5"+
		"\6\4\2&\'\5\6\4\2\'(\7\3\2\2()\5\6\4\2)\60\3\2\2\2*+\7\3\2\2+,\5\6\4\2"+
		",-\7\3\2\2-.\5\6\4\2.\60\3\2\2\2/$\3\2\2\2/%\3\2\2\2/&\3\2\2\2/*\3\2\2"+
		"\2\60\5\3\2\2\2\61:\3\2\2\2\62:\5\f\7\2\63:\5\20\t\2\64:\5\22\n\2\65:"+
		"\5\16\b\2\66:\5\30\r\2\67:\5\32\16\28:\5\b\5\29\61\3\2\2\29\62\3\2\2\2"+
		"9\63\3\2\2\29\64\3\2\2\29\65\3\2\2\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2"+
		":\7\3\2\2\2;>\3\2\2\2<>\5\n\6\2=;\3\2\2\2=<\3\2\2\2>\t\3\2\2\2?C\3\2\2"+
		"\2@A\7\4\2\2AC\5\6\4\2B?\3\2\2\2B@\3\2\2\2C\13\3\2\2\2D^\3\2\2\2EF\7\5"+
		"\2\2FG\7\3\2\2GH\5\6\4\2HI\7\6\2\2IJ\5\6\4\2J^\3\2\2\2KL\7\7\2\2LM\7\3"+
		"\2\2MN\5\6\4\2NO\7\b\2\2OP\5\6\4\2P^\3\2\2\2QR\7\t\2\2RS\7\3\2\2ST\5\6"+
		"\4\2TU\7\b\2\2UV\5\6\4\2V^\3\2\2\2WX\7\n\2\2XY\7\3\2\2YZ\5\6\4\2Z[\7\13"+
		"\2\2[\\\5\6\4\2\\^\3\2\2\2]D\3\2\2\2]E\3\2\2\2]K\3\2\2\2]Q\3\2\2\2]W\3"+
		"\2\2\2^\r\3\2\2\2_c\3\2\2\2`c\7!\2\2ac\7\36\2\2b_\3\2\2\2b`\3\2\2\2ba"+
		"\3\2\2\2c\17\3\2\2\2dg\3\2\2\2eg\7\f\2\2fd\3\2\2\2fe\3\2\2\2g\21\3\2\2"+
		"\2h\u008e\3\2\2\2ij\7\r\2\2jk\5\6\4\2kl\7\16\2\2lm\7\17\2\2mn\7\20\2\2"+
		"no\5\6\4\2op\7\21\2\2pq\5\6\4\2q\u008e\3\2\2\2rs\7\r\2\2st\5\6\4\2tu\7"+
		"\16\2\2uv\7\22\2\2vw\7\20\2\2wx\5\6\4\2xy\7\21\2\2yz\5\6\4\2z\u008e\3"+
		"\2\2\2{|\7\r\2\2|}\5\6\4\2}~\7\3\2\2~\177\7\23\2\2\177\u0080\7\3\2\2\u0080"+
		"\u0081\5\6\4\2\u0081\u008e\3\2\2\2\u0082\u0083\7\r\2\2\u0083\u0084\5\6"+
		"\4\2\u0084\u0085\7\3\2\2\u0085\u0086\7\23\2\2\u0086\u0087\7\3\2\2\u0087"+
		"\u0088\5\6\4\2\u0088\u0089\7\24\2\2\u0089\u008a\5\6\4\2\u008a\u008e\3"+
		"\2\2\2\u008b\u008e\5\24\13\2\u008c\u008e\5\26\f\2\u008dh\3\2\2\2\u008d"+
		"i\3\2\2\2\u008dr\3\2\2\2\u008d{\3\2\2\2\u008d\u0082\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008c\3\2\2\2\u008e\23\3\2\2\2\u008f\u009e\3\2\2\2\u0090"+
		"\u0091\7\23\2\2\u0091\u0092\7\3\2\2\u0092\u0093\5\6\4\2\u0093\u0094\7"+
		"\3\2\2\u0094\u0095\5\6\4\2\u0095\u0096\7\25\2\2\u0096\u009e\3\2\2\2\u0097"+
		"\u0098\7\26\2\2\u0098\u0099\7\3\2\2\u0099\u009a\5\6\4\2\u009a\u009b\7"+
		"\21\2\2\u009b\u009c\5\6\4\2\u009c\u009e\3\2\2\2\u009d\u008f\3\2\2\2\u009d"+
		"\u0090\3\2\2\2\u009d\u0097\3\2\2\2\u009e\25\3\2\2\2\u009f\u00c1\3\2\2"+
		"\2\u00a0\u00a1\7\27\2\2\u00a1\u00a2\5\6\4\2\u00a2\u00a3\7\16\2\2\u00a3"+
		"\u00a4\7\17\2\2\u00a4\u00a5\7\20\2\2\u00a5\u00a6\5\6\4\2\u00a6\u00c1\3"+
		"\2\2\2\u00a7\u00a8\7\27\2\2\u00a8\u00a9\5\6\4\2\u00a9\u00aa\7\16\2\2\u00aa"+
		"\u00ab\7\22\2\2\u00ab\u00ac\7\20\2\2\u00ac\u00ad\5\6\4\2\u00ad\u00c1\3"+
		"\2\2\2\u00ae\u00af\7\27\2\2\u00af\u00b0\5\6\4\2\u00b0\u00b1\7\16\2\2\u00b1"+
		"\u00b2\7\17\2\2\u00b2\u00b3\7\30\2\2\u00b3\u00b4\7\31\2\2\u00b4\u00b5"+
		"\7\32\2\2\u00b5\u00b6\5\6\4\2\u00b6\u00c1\3\2\2\2\u00b7\u00b8\7\27\2\2"+
		"\u00b8\u00b9\5\6\4\2\u00b9\u00ba\7\16\2\2\u00ba\u00bb\7\22\2\2\u00bb\u00bc"+
		"\7\30\2\2\u00bc\u00bd\7\31\2\2\u00bd\u00be\7\32\2\2\u00be\u00bf\5\6\4"+
		"\2\u00bf\u00c1\3\2\2\2\u00c0\u009f\3\2\2\2\u00c0\u00a0\3\2\2\2\u00c0\u00a7"+
		"\3\2\2\2\u00c0\u00ae\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c1\27\3\2\2\2\u00c2"+
		"\u00c8\3\2\2\2\u00c3\u00c4\7 \2\2\u00c4\u00c5\7\16\2\2\u00c5\u00c8\5\6"+
		"\4\2\u00c6\u00c8\7 \2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\31\3\2\2\2\u00c9\u00ca\5\34\17\2\u00ca\33\3\2\2\2"+
		"\u00cb\u00d3\3\2\2\2\u00cc\u00cd\7\33\2\2\u00cd\u00ce\7 \2\2\u00ce\u00d3"+
		"\7\34\2\2\u00cf\u00d0\7\35\2\2\u00d0\u00d1\7 \2\2\u00d1\u00d3\7\34\2\2"+
		"\u00d2\u00cb\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\35"+
		"\3\2\2\2\17\"/9=B]bf\u008d\u009d\u00c0\u00c7\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
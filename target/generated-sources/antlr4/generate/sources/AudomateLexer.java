// Generated from generate/sources/Audomate.g4 by ANTLR 4.8
package generate.sources;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AudomateLexer extends Lexer {
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
		T__38=39, T__39=40, T__40=41, T__41=42, Number=43, INT=44, WORD=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "Number", "REAL", "INT", "ALL", "WORD"
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
			null, null, null, null, null, null, null, "Number", "INT", "WORD"
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


	public AudomateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Audomate.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u019a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+"+
		"\3,\3,\5,\u017c\n,\3-\7-\u017f\n-\f-\16-\u0182\13-\3-\3-\6-\u0186\n-\r"+
		"-\16-\u0187\3.\3.\3.\7.\u018d\n.\f.\16.\u0190\13.\5.\u0192\n.\3/\3/\3"+
		"\60\6\60\u0197\n\60\r\60\16\60\u0198\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y\2[.]\2_/\3\2\5\3\2\62;\3\2\63;\4\2C\\c|\2\u019d\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2[\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7i\3\2\2\2\tv\3\2\2\2"+
		"\13}\3\2\2\2\r\u0087\3\2\2\2\17\u008e\3\2\2\2\21\u0093\3\2\2\2\23\u0098"+
		"\3\2\2\2\25\u009c\3\2\2\2\27\u00a0\3\2\2\2\31\u00a3\3\2\2\2\33\u00ac\3"+
		"\2\2\2\35\u00b1\3\2\2\2\37\u00b3\3\2\2\2!\u00ba\3\2\2\2#\u00c3\3\2\2\2"+
		"%\u00c8\3\2\2\2\'\u00cc\3\2\2\2)\u00d3\3\2\2\2+\u00d8\3\2\2\2-\u00e2\3"+
		"\2\2\2/\u00e9\3\2\2\2\61\u00ec\3\2\2\2\63\u00f3\3\2\2\2\65\u00f9\3\2\2"+
		"\2\67\u00fe\3\2\2\29\u010a\3\2\2\2;\u010f\3\2\2\2=\u0114\3\2\2\2?\u011b"+
		"\3\2\2\2A\u0123\3\2\2\2C\u0129\3\2\2\2E\u012e\3\2\2\2G\u0138\3\2\2\2I"+
		"\u013e\3\2\2\2K\u0143\3\2\2\2M\u014c\3\2\2\2O\u0155\3\2\2\2Q\u015a\3\2"+
		"\2\2S\u015e\3\2\2\2U\u0176\3\2\2\2W\u017b\3\2\2\2Y\u0180\3\2\2\2[\u0191"+
		"\3\2\2\2]\u0193\3\2\2\2_\u0196\3\2\2\2ab\7\"\2\2b\4\3\2\2\2cd\7\"\2\2"+
		"de\7c\2\2ef\7p\2\2fg\7f\2\2gh\7\"\2\2h\6\3\2\2\2ij\7o\2\2jk\7c\2\2kl\7"+
		"m\2\2lm\7g\2\2mn\7\"\2\2no\7c\2\2op\7\"\2\2pq\7n\2\2qr\7k\2\2rs\7u\2\2"+
		"st\7v\2\2tu\7\"\2\2u\b\3\2\2\2vw\7\"\2\2wx\7y\2\2xy\7k\2\2yz\7v\2\2z{"+
		"\7j\2\2{|\7\"\2\2|\n\3\2\2\2}~\7k\2\2~\177\7p\2\2\177\u0080\7f\2\2\u0080"+
		"\u0081\7g\2\2\u0081\u0082\7z\2\2\u0082\u0083\7\"\2\2\u0083\u0084\7q\2"+
		"\2\u0084\u0085\7h\2\2\u0085\u0086\7\"\2\2\u0086\f\3\2\2\2\u0087\u0088"+
		"\7\"\2\2\u0088\u0089\7h\2\2\u0089\u008a\7t\2\2\u008a\u008b\7q\2\2\u008b"+
		"\u008c\7o\2\2\u008c\u008d\7\"\2\2\u008d\16\3\2\2\2\u008e\u008f\7v\2\2"+
		"\u008f\u0090\7j\2\2\u0090\u0091\7g\2\2\u0091\u0092\7\"\2\2\u0092\20\3"+
		"\2\2\2\u0093\u0094\7u\2\2\u0094\u0095\7c\2\2\u0095\u0096\7{\2\2\u0096"+
		"\u0097\7\"\2\2\u0097\22\3\2\2\2\u0098\u0099\7c\2\2\u0099\u009a\7f\2\2"+
		"\u009a\u009b\7f\2\2\u009b\24\3\2\2\2\u009c\u009d\7\"\2\2\u009d\u009e\7"+
		"-\2\2\u009e\u009f\7\"\2\2\u009f\26\3\2\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2"+
		"\7v\2\2\u00a2\30\3\2\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6"+
		"\7n\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7r\2\2\u00a9"+
		"\u00aa\7n\2\2\u00aa\u00ab\7{\2\2\u00ab\32\3\2\2\2\u00ac\u00ad\7\"\2\2"+
		"\u00ad\u00ae\7d\2\2\u00ae\u00af\7{\2\2\u00af\u00b0\7\"\2\2\u00b0\34\3"+
		"\2\2\2\u00b1\u00b2\7z\2\2\u00b2\36\3\2\2\2\u00b3\u00b4\7f\2\2\u00b4\u00b5"+
		"\7k\2\2\u00b5\u00b6\7x\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7f\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9 \3\2\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7w\2\2\u00bc"+
		"\u00bd\7d\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7c\2\2"+
		"\u00c0\u00c1\7e\2\2\u00c1\u00c2\7v\2\2\u00c2\"\3\2\2\2\u00c3\u00c4\7d"+
		"\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7r\2\2\u00c7$\3"+
		"\2\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7h\2\2\u00ca\u00cb\7\"\2\2\u00cb"+
		"&\3\2\2\2\u00cc\u00cd\7\"\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7j\2\2\u00cf"+
		"\u00d0\7g\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7\"\2\2\u00d2(\3\2\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7g\2\2"+
		"\u00d7*\3\2\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7j\2"+
		"\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7y\2\2\u00de\u00df"+
		"\7k\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7g\2\2\u00e1,\3\2\2\2\u00e2\u00e3"+
		"\7k\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5\7\"\2\2\u00e5\u00e6\7p\2\2\u00e6"+
		"\u00e7\7q\2\2\u00e7\u00e8\7v\2\2\u00e8.\3\2\2\2\u00e9\u00ea\7f\2\2\u00ea"+
		"\u00eb\7q\2\2\u00eb\60\3\2\2\2\u00ec\u00ed\7\"\2\2\u00ed\u00ee\7v\2\2"+
		"\u00ee\u00ef\7k\2\2\u00ef\u00f0\7o\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2"+
		"\7u\2\2\u00f2\62\3\2\2\2\u00f3\u00f4\7y\2\2\u00f4\u00f5\7j\2\2\u00f5\u00f6"+
		"\7k\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7g\2\2\u00f8\64\3\2\2\2\u00f9\u00fa"+
		"\7\"\2\2\u00fa\u00fb\7f\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7\"\2\2\u00fd"+
		"\66\3\2\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7j\2\2\u0100\u0101\7g\2\2\u0101"+
		"\u0102\7\"\2\2\u0102\u0103\7p\2\2\u0103\u0104\7w\2\2\u0104\u0105\7o\2"+
		"\2\u0105\u0106\7d\2\2\u0106\u0107\7g\2\2\u0107\u0108\7t\2\2\u0108\u0109"+
		"\7\"\2\2\u01098\3\2\2\2\u010a\u010b\7\"\2\2\u010b\u010c\7k\2\2\u010c\u010d"+
		"\7u\2\2\u010d\u010e\7\"\2\2\u010e:\3\2\2\2\u010f\u0110\7n\2\2\u0110\u0111"+
		"\7g\2\2\u0111\u0112\7u\2\2\u0112\u0113\7u\2\2\u0113<\3\2\2\2\u0114\u0115"+
		"\7\"\2\2\u0115\u0116\7v\2\2\u0116\u0117\7j\2\2\u0117\u0118\7c\2\2\u0118"+
		"\u0119\7p\2\2\u0119\u011a\7\"\2\2\u011a>\3\2\2\2\u011b\u011c\7i\2\2\u011c"+
		"\u011d\7t\2\2\u011d\u011e\7g\2\2\u011e\u011f\7c\2\2\u011f\u0120\7v\2\2"+
		"\u0120\u0121\7g\2\2\u0121\u0122\7t\2\2\u0122@\3\2\2\2\u0123\u0124\7g\2"+
		"\2\u0124\u0125\7s\2\2\u0125\u0126\7w\2\2\u0126\u0127\7c\2\2\u0127\u0128"+
		"\7n\2\2\u0128B\3\2\2\2\u0129\u012a\7\"\2\2\u012a\u012b\7v\2\2\u012b\u012c"+
		"\7q\2\2\u012c\u012d\7\"\2\2\u012dD\3\2\2\2\u012e\u012f\7\"\2\2\u012f\u0130"+
		"\7v\2\2\u0130\u0131\7j\2\2\u0131\u0132\7c\2\2\u0132\u0133\7p\2\2\u0133"+
		"\u0134\7\"\2\2\u0134\u0135\7q\2\2\u0135\u0136\7t\2\2\u0136\u0137\7\"\2"+
		"\2\u0137F\3\2\2\2\u0138\u0139\7x\2\2\u0139\u013a\7c\2\2\u013a\u013b\7"+
		"n\2\2\u013b\u013c\7w\2\2\u013c\u013d\7g\2\2\u013dH\3\2\2\2\u013e\u013f"+
		"\7\"\2\2\u013f\u0140\7q\2\2\u0140\u0141\7h\2\2\u0141\u0142\7\"\2\2\u0142"+
		"J\3\2\2\2\u0143\u0144\7h\2\2\u0144\u0145\7w\2\2\u0145\u0146\7p\2\2\u0146"+
		"\u0147\7e\2\2\u0147\u0148\7v\2\2\u0148\u0149\7k\2\2\u0149\u014a\7q\2\2"+
		"\u014a\u014b\7p\2\2\u014bL\3\2\2\2\u014c\u014d\7f\2\2\u014d\u014e\7g\2"+
		"\2\u014e\u014f\7u\2\2\u014f\u0150\7e\2\2\u0150\u0151\7t\2\2\u0151\u0152"+
		"\7k\2\2\u0152\u0153\7d\2\2\u0153\u0154\7g\2\2\u0154N\3\2\2\2\u0155\u0156"+
		"\7t\2\2\u0156\u0157\7w\2\2\u0157\u0158\7p\2\2\u0158\u0159\7\"\2\2\u0159"+
		"P\3\2\2\2\u015a\u015b\7c\2\2\u015b\u015c\7p\2\2\u015c\u015d\7\"\2\2\u015d"+
		"R\3\2\2\2\u015e\u015f\7\"\2\2\u015f\u0160\7k\2\2\u0160\u0161\7u\2\2\u0161"+
		"\u0162\7\"\2\2\u0162\u0163\7r\2\2\u0163\u0164\7c\2\2\u0164\u0165\7t\2"+
		"\2\u0165\u0166\7v\2\2\u0166\u0167\7\"\2\2\u0167\u0168\7q\2\2\u0168\u0169"+
		"\7h\2\2\u0169\u016a\7\"\2\2\u016a\u016b\7v\2\2\u016b\u016c\7j\2\2\u016c"+
		"\u016d\7g\2\2\u016d\u016e\7\"\2\2\u016e\u016f\7o\2\2\u016f\u0170\7c\2"+
		"\2\u0170\u0171\7e\2\2\u0171\u0172\7j\2\2\u0172\u0173\7k\2\2\u0173\u0174"+
		"\7p\2\2\u0174\u0175\7g\2\2\u0175T\3\2\2\2\u0176\u0177\7c\2\2\u0177\u0178"+
		"\7\"\2\2\u0178V\3\2\2\2\u0179\u017c\5Y-\2\u017a\u017c\5[.\2\u017b\u0179"+
		"\3\2\2\2\u017b\u017a\3\2\2\2\u017cX\3\2\2\2\u017d\u017f\t\2\2\2\u017e"+
		"\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0185\7\60\2\2\u0184"+
		"\u0186\t\2\2\2\u0185\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0185\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188Z\3\2\2\2\u0189\u0192\7\62\2\2\u018a\u018e"+
		"\t\3\2\2\u018b\u018d\t\2\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2"+
		"\2\2\u0191\u0189\3\2\2\2\u0191\u018a\3\2\2\2\u0192\\\3\2\2\2\u0193\u0194"+
		"\t\4\2\2\u0194^\3\2\2\2\u0195\u0197\5]/\2\u0196\u0195\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199`\3\2\2\2\t\2\u017b"+
		"\u0180\u0187\u018e\u0191\u0198\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
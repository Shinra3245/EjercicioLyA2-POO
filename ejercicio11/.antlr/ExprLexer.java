// Generated from c:/Users/jesus/OneDrive/Escritorio/archiuvos/11 al 15 POO/ejercicio11/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, CLASS=2, STATIC=3, VOID=4, INT=5, LLAVE_I=6, LLAVE_D=7, PAR_I=8, 
		PAR_D=9, CORCHETE_I=10, CORCHETE_D=11, IGUAL=12, MAS=13, PUNTO=14, PUNTO_COMA=15, 
		CADENA=16, NUM=17, ID=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PUBLIC", "CLASS", "STATIC", "VOID", "INT", "LLAVE_I", "LLAVE_D", "PAR_I", 
			"PAR_D", "CORCHETE_I", "CORCHETE_D", "IGUAL", "MAS", "PUNTO", "PUNTO_COMA", 
			"CADENA", "NUM", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'class'", "'static'", "'void'", "'int'", "'{'", "'}'", 
			"'('", "')'", "'['", "']'", "'='", "'+'", "'.'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "CLASS", "STATIC", "VOID", "INT", "LLAVE_I", "LLAVE_D", 
			"PAR_I", "PAR_D", "CORCHETE_I", "CORCHETE_D", "IGUAL", "MAS", "PUNTO", 
			"PUNTO_COMA", "CADENA", "NUM", "ID", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\u0004\u0000\u0013t\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0005\u000f[\b\u000f\n\u000f\f\u000f^\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0004\u0010c\b\u0010\u000b\u0010\f\u0010d\u0001"+
		"\u0011\u0001\u0011\u0005\u0011i\b\u0011\n\u0011\f\u0011l\t\u0011\u0001"+
		"\u0012\u0004\u0012o\b\u0012\u000b\u0012\f\u0012p\u0001\u0012\u0001\u0012"+
		"\u0000\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000"+
		"\u0005\u0003\u0000\n\n\r\r\"\"\u0001\u000009\u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u0003\u0000\t\n\r\r  w\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000"+
		"\u0003.\u0001\u0000\u0000\u0000\u00054\u0001\u0000\u0000\u0000\u0007;"+
		"\u0001\u0000\u0000\u0000\t@\u0001\u0000\u0000\u0000\u000bD\u0001\u0000"+
		"\u0000\u0000\rF\u0001\u0000\u0000\u0000\u000fH\u0001\u0000\u0000\u0000"+
		"\u0011J\u0001\u0000\u0000\u0000\u0013L\u0001\u0000\u0000\u0000\u0015N"+
		"\u0001\u0000\u0000\u0000\u0017P\u0001\u0000\u0000\u0000\u0019R\u0001\u0000"+
		"\u0000\u0000\u001bT\u0001\u0000\u0000\u0000\u001dV\u0001\u0000\u0000\u0000"+
		"\u001fX\u0001\u0000\u0000\u0000!b\u0001\u0000\u0000\u0000#f\u0001\u0000"+
		"\u0000\u0000%n\u0001\u0000\u0000\u0000\'(\u0005p\u0000\u0000()\u0005u"+
		"\u0000\u0000)*\u0005b\u0000\u0000*+\u0005l\u0000\u0000+,\u0005i\u0000"+
		"\u0000,-\u0005c\u0000\u0000-\u0002\u0001\u0000\u0000\u0000./\u0005c\u0000"+
		"\u0000/0\u0005l\u0000\u000001\u0005a\u0000\u000012\u0005s\u0000\u0000"+
		"23\u0005s\u0000\u00003\u0004\u0001\u0000\u0000\u000045\u0005s\u0000\u0000"+
		"56\u0005t\u0000\u000067\u0005a\u0000\u000078\u0005t\u0000\u000089\u0005"+
		"i\u0000\u00009:\u0005c\u0000\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0005"+
		"v\u0000\u0000<=\u0005o\u0000\u0000=>\u0005i\u0000\u0000>?\u0005d\u0000"+
		"\u0000?\b\u0001\u0000\u0000\u0000@A\u0005i\u0000\u0000AB\u0005n\u0000"+
		"\u0000BC\u0005t\u0000\u0000C\n\u0001\u0000\u0000\u0000DE\u0005{\u0000"+
		"\u0000E\f\u0001\u0000\u0000\u0000FG\u0005}\u0000\u0000G\u000e\u0001\u0000"+
		"\u0000\u0000HI\u0005(\u0000\u0000I\u0010\u0001\u0000\u0000\u0000JK\u0005"+
		")\u0000\u0000K\u0012\u0001\u0000\u0000\u0000LM\u0005[\u0000\u0000M\u0014"+
		"\u0001\u0000\u0000\u0000NO\u0005]\u0000\u0000O\u0016\u0001\u0000\u0000"+
		"\u0000PQ\u0005=\u0000\u0000Q\u0018\u0001\u0000\u0000\u0000RS\u0005+\u0000"+
		"\u0000S\u001a\u0001\u0000\u0000\u0000TU\u0005.\u0000\u0000U\u001c\u0001"+
		"\u0000\u0000\u0000VW\u0005;\u0000\u0000W\u001e\u0001\u0000\u0000\u0000"+
		"X\\\u0005\"\u0000\u0000Y[\b\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000"+
		"[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]_\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005\""+
		"\u0000\u0000` \u0001\u0000\u0000\u0000ac\u0007\u0001\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000e\"\u0001\u0000\u0000\u0000fj\u0007\u0002\u0000"+
		"\u0000gi\u0007\u0003\u0000\u0000hg\u0001\u0000\u0000\u0000il\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k$\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mo\u0007\u0004\u0000\u0000"+
		"nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0006\u0012"+
		"\u0000\u0000s&\u0001\u0000\u0000\u0000\u0005\u0000\\djp\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
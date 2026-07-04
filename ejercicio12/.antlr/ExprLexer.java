// Generated from c:/Users/jesus/OneDrive/Escritorio/archiuvos/11 al 15 POO/ejercicio12/Expr.g4 by ANTLR 4.13.1
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
		PUBLIC=1, CLASS=2, STATIC=3, VOID=4, INT=5, IF=6, STRING=7, LLAVE_I=8, 
		LLAVE_D=9, PAR_I=10, PAR_D=11, CORCHETE_I=12, CORCHETE_D=13, MAYOR_IGUAL=14, 
		IGUAL=15, MAS=16, PUNTO=17, PUNTO_COMA=18, CADENA=19, NUM=20, ID=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PUBLIC", "CLASS", "STATIC", "VOID", "INT", "IF", "STRING", "LLAVE_I", 
			"LLAVE_D", "PAR_I", "PAR_D", "CORCHETE_I", "CORCHETE_D", "MAYOR_IGUAL", 
			"IGUAL", "MAS", "PUNTO", "PUNTO_COMA", "CADENA", "NUM", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'class'", "'static'", "'void'", "'int'", "'if'", "'String'", 
			"'{'", "'}'", "'('", "')'", "'['", "']'", "'>='", "'='", "'+'", "'.'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "CLASS", "STATIC", "VOID", "INT", "IF", "STRING", "LLAVE_I", 
			"LLAVE_D", "PAR_I", "PAR_D", "CORCHETE_I", "CORCHETE_D", "MAYOR_IGUAL", 
			"IGUAL", "MAS", "PUNTO", "PUNTO_COMA", "CADENA", "NUM", "ID", "WS"
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
		"\u0004\u0000\u0016\u0087\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0005\u0012n\b\u0012\n\u0012\f\u0012q\t"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013v\b\u0013\u000b"+
		"\u0013\f\u0013w\u0001\u0014\u0001\u0014\u0005\u0014|\b\u0014\n\u0014\f"+
		"\u0014\u007f\t\u0014\u0001\u0015\u0004\u0015\u0082\b\u0015\u000b\u0015"+
		"\f\u0015\u0083\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0005\u0003\u0000"+
		"\n\n\r\r\"\"\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003"+
		"\u0000\t\n\r\r  \u008a\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001"+
		"\u0000\u0000\u0000\u00034\u0001\u0000\u0000\u0000\u0005:\u0001\u0000\u0000"+
		"\u0000\u0007A\u0001\u0000\u0000\u0000\tF\u0001\u0000\u0000\u0000\u000b"+
		"J\u0001\u0000\u0000\u0000\rM\u0001\u0000\u0000\u0000\u000fT\u0001\u0000"+
		"\u0000\u0000\u0011V\u0001\u0000\u0000\u0000\u0013X\u0001\u0000\u0000\u0000"+
		"\u0015Z\u0001\u0000\u0000\u0000\u0017\\\u0001\u0000\u0000\u0000\u0019"+
		"^\u0001\u0000\u0000\u0000\u001b`\u0001\u0000\u0000\u0000\u001dc\u0001"+
		"\u0000\u0000\u0000\u001fe\u0001\u0000\u0000\u0000!g\u0001\u0000\u0000"+
		"\u0000#i\u0001\u0000\u0000\u0000%k\u0001\u0000\u0000\u0000\'u\u0001\u0000"+
		"\u0000\u0000)y\u0001\u0000\u0000\u0000+\u0081\u0001\u0000\u0000\u0000"+
		"-.\u0005p\u0000\u0000./\u0005u\u0000\u0000/0\u0005b\u0000\u000001\u0005"+
		"l\u0000\u000012\u0005i\u0000\u000023\u0005c\u0000\u00003\u0002\u0001\u0000"+
		"\u0000\u000045\u0005c\u0000\u000056\u0005l\u0000\u000067\u0005a\u0000"+
		"\u000078\u0005s\u0000\u000089\u0005s\u0000\u00009\u0004\u0001\u0000\u0000"+
		"\u0000:;\u0005s\u0000\u0000;<\u0005t\u0000\u0000<=\u0005a\u0000\u0000"+
		"=>\u0005t\u0000\u0000>?\u0005i\u0000\u0000?@\u0005c\u0000\u0000@\u0006"+
		"\u0001\u0000\u0000\u0000AB\u0005v\u0000\u0000BC\u0005o\u0000\u0000CD\u0005"+
		"i\u0000\u0000DE\u0005d\u0000\u0000E\b\u0001\u0000\u0000\u0000FG\u0005"+
		"i\u0000\u0000GH\u0005n\u0000\u0000HI\u0005t\u0000\u0000I\n\u0001\u0000"+
		"\u0000\u0000JK\u0005i\u0000\u0000KL\u0005f\u0000\u0000L\f\u0001\u0000"+
		"\u0000\u0000MN\u0005S\u0000\u0000NO\u0005t\u0000\u0000OP\u0005r\u0000"+
		"\u0000PQ\u0005i\u0000\u0000QR\u0005n\u0000\u0000RS\u0005g\u0000\u0000"+
		"S\u000e\u0001\u0000\u0000\u0000TU\u0005{\u0000\u0000U\u0010\u0001\u0000"+
		"\u0000\u0000VW\u0005}\u0000\u0000W\u0012\u0001\u0000\u0000\u0000XY\u0005"+
		"(\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000Z[\u0005)\u0000\u0000[\u0016"+
		"\u0001\u0000\u0000\u0000\\]\u0005[\u0000\u0000]\u0018\u0001\u0000\u0000"+
		"\u0000^_\u0005]\u0000\u0000_\u001a\u0001\u0000\u0000\u0000`a\u0005>\u0000"+
		"\u0000ab\u0005=\u0000\u0000b\u001c\u0001\u0000\u0000\u0000cd\u0005=\u0000"+
		"\u0000d\u001e\u0001\u0000\u0000\u0000ef\u0005+\u0000\u0000f \u0001\u0000"+
		"\u0000\u0000gh\u0005.\u0000\u0000h\"\u0001\u0000\u0000\u0000ij\u0005;"+
		"\u0000\u0000j$\u0001\u0000\u0000\u0000ko\u0005\"\u0000\u0000ln\b\u0000"+
		"\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000rs\u0005\"\u0000\u0000s&\u0001\u0000\u0000\u0000"+
		"tv\u0007\u0001\u0000\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x(\u0001\u0000"+
		"\u0000\u0000y}\u0007\u0002\u0000\u0000z|\u0007\u0003\u0000\u0000{z\u0001"+
		"\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~*\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u0080\u0082\u0007\u0004\u0000\u0000\u0081\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0006\u0015\u0000\u0000\u0086,\u0001\u0000"+
		"\u0000\u0000\u0005\u0000ow}\u0083\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
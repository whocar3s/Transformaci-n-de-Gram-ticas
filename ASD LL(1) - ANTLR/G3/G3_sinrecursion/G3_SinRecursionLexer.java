// Generated from G3_SinRecursion.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class G3_SinRecursionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		UNO=1, DOS=2, TRES=3, CUATRO=4, NEWLINE=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"UNO", "DOS", "TRES", "CUATRO", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'uno'", "'dos'", "'tres'", "'cuatro'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "UNO", "DOS", "TRES", "CUATRO", "NEWLINE"
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


	public G3_SinRecursionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "G3_SinRecursion.g4"; }

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
		"\u0004\u0000\u0005$\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004!\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u0001\u0000\u0000$\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0001\u000b\u0001\u0000\u0000\u0000\u0003\u000f\u0001\u0000\u0000"+
		"\u0000\u0005\u0013\u0001\u0000\u0000\u0000\u0007\u0018\u0001\u0000\u0000"+
		"\u0000\t \u0001\u0000\u0000\u0000\u000b\f\u0005u\u0000\u0000\f\r\u0005"+
		"n\u0000\u0000\r\u000e\u0005o\u0000\u0000\u000e\u0002\u0001\u0000\u0000"+
		"\u0000\u000f\u0010\u0005d\u0000\u0000\u0010\u0011\u0005o\u0000\u0000\u0011"+
		"\u0012\u0005s\u0000\u0000\u0012\u0004\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0005t\u0000\u0000\u0014\u0015\u0005r\u0000\u0000\u0015\u0016\u0005e"+
		"\u0000\u0000\u0016\u0017\u0005s\u0000\u0000\u0017\u0006\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0005c\u0000\u0000\u0019\u001a\u0005u\u0000\u0000\u001a"+
		"\u001b\u0005a\u0000\u0000\u001b\u001c\u0005t\u0000\u0000\u001c\u001d\u0005"+
		"r\u0000\u0000\u001d\u001e\u0005o\u0000\u0000\u001e\b\u0001\u0000\u0000"+
		"\u0000\u001f!\u0005\r\u0000\u0000 \u001f\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0005\n\u0000\u0000#"+
		"\n\u0001\u0000\u0000\u0000\u0002\u0000 \u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
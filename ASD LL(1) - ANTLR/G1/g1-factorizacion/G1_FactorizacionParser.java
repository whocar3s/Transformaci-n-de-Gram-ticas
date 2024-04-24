// Generated from G1_Factorizacion.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class G1_FactorizacionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		UNO=1, DOS=2, TRES=3, CUATRO=4, CINCO=5, SEIS=6, NEWLINE=7;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_s = 2, RULE_a = 3, RULE_b = 4, RULE_c = 5, 
		RULE_d = 6, RULE_e = 7, RULE_bprima = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "s", "a", "b", "c", "d", "e", "bprima"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'uno'", "'dos'", "'tres'", "'cuatro'", "'cinco'", "'seis'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "NEWLINE"
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
	public String getGrammarFileName() { return "G1_Factorizacion.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public G1_FactorizacionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G1_FactorizacionListener ) ((G1_FactorizacionListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G1_FactorizacionListener ) ((G1_FactorizacionListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				stat();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 222L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(G1_FactorizacionParser.NEWLINE, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G1_FactorizacionListener ) ((G1_FactorizacionListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G1_FactorizacionListener ) ((G1_FactorizacionListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				s();
				setState(24);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G1_FactorizacionListener ) ((G1_FactorizacionListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G1_FactorizacionListener ) ((G1_FactorizacionListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(29);
				a();
				setState(30);
				b();
				setState(31);
				c();
				}
				break;
			case 2:
				{
				setState(33);
				d();
				setState(34);
				e();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AContext extends ParserRuleContext {
		public TerminalNode DOS() { return getToken(G1_FactorizacionParser.DOS, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public TerminalNode TRES() { return getToken(G1_FactorizacionParser.TRES, 0); }
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G1_FactorizacionListener ) ((G1_FactorizacionListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G1_FactorizacionListener ) ((G1_FactorizacionListener)listener).exitA(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRES:
			case CUATRO:
			case CINCO:
			case SEIS:
			case NEWLINE:
				{
				}
				break;
			case DOS:
				{
				setState(39);
				match(DOS);
				setState(40);
				b();
				setState(41);
				match(TRES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BContext extends ParserRuleContext {
		public BprimaContext bprima() {
			return getRuleContext(BprimaContext.class,0);
		}
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G1_FactorizacionListener ) ((G1_FactorizacionListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G1_FactorizacionListener ) ((G1_FactorizacionListener)listener).exitB(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(45);
			bprima();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CContext extends ParserRuleContext {
		public TerminalNode SEIS() { return getToken(G1_FactorizacionParser.SEIS, 0); }
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G1_FactorizacionListener ) ((G1_FactorizacionListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G1_FactorizacionListener ) ((G1_FactorizacionListener)listener).exitC(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_c);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CINCO:
			case NEWLINE:
				{
				}
				break;
			case SEIS:
				{
				setState(48);
				match(SEIS);
				setState(49);
				a();
				setState(50);
				b();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DContext extends ParserRuleContext {
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public TerminalNode UNO() { return getToken(G1_FactorizacionParser.UNO, 0); }
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G1_FactorizacionListener ) ((G1_FactorizacionListener)listener).enterD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G1_FactorizacionListener ) ((G1_FactorizacionListener)listener).exitD(this);
		}
	}

	public final DContext d() throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_d);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRES:
			case CUATRO:
				{
				setState(54);
				b();
				}
				break;
			case UNO:
				{
				setState(55);
				match(UNO);
				setState(56);
				a();
				setState(57);
				e();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EContext extends ParserRuleContext {
		public TerminalNode TRES() { return getToken(G1_FactorizacionParser.TRES, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G1_FactorizacionListener ) ((G1_FactorizacionListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G1_FactorizacionListener ) ((G1_FactorizacionListener)listener).exitE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(61);
			match(TRES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BprimaContext extends ParserRuleContext {
		public TerminalNode CUATRO() { return getToken(G1_FactorizacionParser.CUATRO, 0); }
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public TerminalNode CINCO() { return getToken(G1_FactorizacionParser.CINCO, 0); }
		public BprimaContext bprima() {
			return getRuleContext(BprimaContext.class,0);
		}
		public BprimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bprima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G1_FactorizacionListener ) ((G1_FactorizacionListener)listener).enterBprima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G1_FactorizacionListener ) ((G1_FactorizacionListener)listener).exitBprima(this);
		}
	}

	public final BprimaContext bprima() throws RecognitionException {
		BprimaContext _localctx = new BprimaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bprima);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRES:
			case CINCO:
			case SEIS:
			case NEWLINE:
				{
				}
				break;
			case CUATRO:
				{
				setState(64);
				match(CUATRO);
				setState(65);
				c();
				setState(66);
				match(CINCO);
				setState(67);
				bprima();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0007H\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000\u0015"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001c\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002%\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003,\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"5\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006<\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\bF\b\b\u0001\b\u0000\u0000\t\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0000\u0000E\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0002\u001b\u0001\u0000\u0000\u0000\u0004$\u0001\u0000\u0000\u0000"+
		"\u0006+\u0001\u0000\u0000\u0000\b-\u0001\u0000\u0000\u0000\n4\u0001\u0000"+
		"\u0000\u0000\f;\u0001\u0000\u0000\u0000\u000e=\u0001\u0000\u0000\u0000"+
		"\u0010E\u0001\u0000\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013"+
		"\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015"+
		"\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016"+
		"\u0001\u0001\u0000\u0000\u0000\u0017\u0018\u0003\u0004\u0002\u0000\u0018"+
		"\u0019\u0005\u0007\u0000\u0000\u0019\u001c\u0001\u0000\u0000\u0000\u001a"+
		"\u001c\u0005\u0007\u0000\u0000\u001b\u0017\u0001\u0000\u0000\u0000\u001b"+
		"\u001a\u0001\u0000\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0003\u0006\u0003\u0000\u001e\u001f\u0003\b\u0004\u0000\u001f "+
		"\u0003\n\u0005\u0000 %\u0001\u0000\u0000\u0000!\"\u0003\f\u0006\u0000"+
		"\"#\u0003\u000e\u0007\u0000#%\u0001\u0000\u0000\u0000$\u001d\u0001\u0000"+
		"\u0000\u0000$!\u0001\u0000\u0000\u0000%\u0005\u0001\u0000\u0000\u0000"+
		"&,\u0001\u0000\u0000\u0000\'(\u0005\u0002\u0000\u0000()\u0003\b\u0004"+
		"\u0000)*\u0005\u0003\u0000\u0000*,\u0001\u0000\u0000\u0000+&\u0001\u0000"+
		"\u0000\u0000+\'\u0001\u0000\u0000\u0000,\u0007\u0001\u0000\u0000\u0000"+
		"-.\u0003\u0010\b\u0000.\t\u0001\u0000\u0000\u0000/5\u0001\u0000\u0000"+
		"\u000001\u0005\u0006\u0000\u000012\u0003\u0006\u0003\u000023\u0003\b\u0004"+
		"\u000035\u0001\u0000\u0000\u00004/\u0001\u0000\u0000\u000040\u0001\u0000"+
		"\u0000\u00005\u000b\u0001\u0000\u0000\u00006<\u0003\b\u0004\u000078\u0005"+
		"\u0001\u0000\u000089\u0003\u0006\u0003\u00009:\u0003\u000e\u0007\u0000"+
		":<\u0001\u0000\u0000\u0000;6\u0001\u0000\u0000\u0000;7\u0001\u0000\u0000"+
		"\u0000<\r\u0001\u0000\u0000\u0000=>\u0005\u0003\u0000\u0000>\u000f\u0001"+
		"\u0000\u0000\u0000?F\u0001\u0000\u0000\u0000@A\u0005\u0004\u0000\u0000"+
		"AB\u0003\n\u0005\u0000BC\u0005\u0005\u0000\u0000CD\u0003\u0010\b\u0000"+
		"DF\u0001\u0000\u0000\u0000E?\u0001\u0000\u0000\u0000E@\u0001\u0000\u0000"+
		"\u0000F\u0011\u0001\u0000\u0000\u0000\u0007\u0015\u001b$+4;E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
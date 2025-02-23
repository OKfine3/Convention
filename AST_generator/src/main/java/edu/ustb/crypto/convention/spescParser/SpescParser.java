// Generated from D:/laboratory/Convention_lwj/AST_generator/src/main/resources/g4_files/Spesc.g4 by ANTLR 4.13.1
package edu.ustb.crypto.convention.spescParser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SpescParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24,
            T__24 = 25, T__25 = 26, T__26 = 27, T__27 = 28, T__28 = 29, T__29 = 30, T__30 = 31,
            T__31 = 32, T__32 = 33, T__33 = 34, T__34 = 35, T__35 = 36, T__36 = 37, T__37 = 38,
            T__38 = 39, T__39 = 40, T__40 = 41, T__41 = 42, T__42 = 43, T__43 = 44, T__44 = 45,
            T__45 = 46, T__46 = 47, T__47 = 48, T__48 = 49, T__49 = 50, T__50 = 51, T__51 = 52,
            T__52 = 53, T__53 = 54, T__54 = 55, T__55 = 56, T__56 = 57, T__57 = 58, T__58 = 59,
            T__59 = 60, T__60 = 61, T__61 = 62, T__62 = 63, T__63 = 64, T__64 = 65, T__65 = 66,
            T__66 = 67, T__67 = 68, BoolValue = 69, RULE_DATE = 70, PERCENTAGE = 71, COMMENT_TEXT = 72,
            PACKAGE = 73, CONTRACT = 74, CONVENTION = 75, PARTY = 76, GROUP = 77, ASSET = 78,
            INFO = 79, RIGHTINFO = 80, ADDITION = 81, OBLIGATION = 82, RIGHT = 83, SIGNATURE = 84,
            TERM = 85, BIND = 86, CLAUSE = 87, BREACH = 88, PRINT = 89, COLON = 90, SPOT = 91, CAN = 92,
            CANNOT = 93, MUST = 94, WHEN = 95, WHILE = 96, WHERE = 97, ALL = 98, SOME = 99, THIS = 100,
            DID = 101, GRANT = 102, DEPOSIT = 103, WITHDRAW = 104, TRANSFER = 105, NOT = 106,
            OR = 107, AND = 108, FALSE = 109, TRUE = 110, FOR = 111, AFTER = 112, BEFORE = 113,
            BELONG = 114, WITHIN = 115, OF = 116, IMPLEMENT = 117, DECLARATION = 118, DETAILS = 119,
            CONSTRAINT_BY = 120, INCLUDING = 121, UNDER = 122, INDEX = 123, CHINESE = 124, WS = 125,
            RULE_STRING = 126, NUMBER = 127, IDENTIFIER = 128, NOTE = 129, PUNCTUATION = 130,
            ESC = 131, ANY = 132, THE = 133;
    public static final int
            RULE_compilationUnit = 0, RULE_packageDir = 1, RULE_dir = 2, RULE_contractDefinition = 3,
            RULE_contractType = 4, RULE_conventionName = 5, RULE_contractBody = 6,
            RULE_party = 7, RULE_asset = 8, RULE_property = 9, RULE_propertyName = 10,
            RULE_field = 11, RULE_addition = 12, RULE_partyName = 13, RULE_assetName = 14,
            RULE_name = 15, RULE_additionName = 16, RULE_info = 17, RULE_right = 18,
            RULE_term = 19, RULE_generalTerm = 20, RULE_breachTerm = 21, RULE_arbiTerm = 22,
            RULE_generalTermDeclaration = 23, RULE_duty = 24, RULE_breachTermDeclaration = 25,
            RULE_againstDeclaration = 26, RULE_controversy = 27, RULE_institution = 28,
            RULE_signature = 29, RULE_action = 30, RULE_actionName = 31, RULE_parametersList = 32,
		RULE_parameter = 33, RULE_whenStatement = 34, RULE_whileStatement = 35,
		RULE_whereStatement = 36, RULE_predicate = 37, RULE_relationalExpression = 38,
		RULE_logicalOperator = 39, RULE_timeUnit = 40, RULE_orExpression = 41,
		RULE_andExpression = 42, RULE_andChildExpression = 43, RULE_notExpression = 44,
		RULE_timeExpression = 45, RULE_timePeriodExpression = 46, RULE_timePredicate = 47,
		RULE_boundedTimePredicate = 48, RULE_timeConstant = 49, RULE_timeConstantUnit = 50,
		RULE_timePointExpression = 51, RULE_actionEnforcedTimeQuery = 52, RULE_termDuty = 53,
		RULE_actionMultiplicity = 54, RULE_timeQueryOperator = 55, RULE_addTimeConstant = 56,
		RULE_additiveOperator = 57, RULE_timePredicateOperator = 58, RULE_isOrNot = 59,
		RULE_logicalOrExpression = 60, RULE_logicalAndExpression = 61, RULE_childExpression = 62,
		RULE_assignment_expression = 63, RULE_relational_expression = 64, RULE_arithmetic_expression = 65,
		RULE_addSubExpression = 66, RULE_mulDivExpression = 67, RULE_primaryExpression = 68,
		RULE_comparativeRelationExpression = 69, RULE_atomExpression = 70, RULE_constantExpression = 71,
		RULE_rule_STRING = 72, RULE_rule_BOOLEAN = 73, RULE_rule_INTEGER = 74,
            RULE_rule_FLOAT = 75, RULE_rule_DOUBLE = 76, RULE_variableReference = 77,
            RULE_expressions = 78, RULE_relationOperator = 79, RULE_ofOperator = 80,
            RULE_transferOperation = 81, RULE_moneyExpression = 82, RULE_assetExpression = 83,
            RULE_clause = 84, RULE_bindClause = 85, RULE_factorBind = 86, RULE_lo_type = 87,
            RULE_factor = 88, RULE_itemLimitation = 89, RULE_itemLimitationName = 90,
            RULE_generalClause = 91, RULE_clauseDeclaration = 92, RULE_cvDuty = 93,
            RULE_mustFulfilObligation = 94, RULE_canExerciseRight = 95, RULE_breachClause = 96,
            RULE_breachClauseDeclaration = 97, RULE_legalRight = 98, RULE_legalRightDeclaration = 99,
            RULE_rightContent = 100, RULE_rightSubject = 101, RULE_possessTheRight = 102,
            RULE_rightObject = 103, RULE_onTheObject = 104, RULE_lawSource = 105,
            RULE_accordTo = 106, RULE_rightOf = 107, RULE_includingRightName = 108,
            RULE_rightName = 109, RULE_lawName = 110, RULE_rightObjectName = 111,
            RULE_impldeclaration = 112, RULE_value = 113, RULE_index = 114, RULE_decimal = 115,
            RULE_array = 116, RULE_jsonObject = 117, RULE_comment = 118, RULE_date = 119,
            RULE_struct = 120, RULE_type = 121, RULE_structObj = 122, RULE_structArr = 123,
            RULE_keyPair = 124;

    private static String[] makeRuleNames() {
        return new String[]{
                "compilationUnit", "packageDir", "dir", "contractDefinition", "contractType",
                "conventionName", "contractBody", "party", "asset", "property", "propertyName",
                "field", "addition", "partyName", "assetName", "name", "additionName",
                "info", "right", "term", "generalTerm", "breachTerm", "arbiTerm", "generalTermDeclaration",
                "duty", "breachTermDeclaration", "againstDeclaration", "controversy",
                "institution", "signature", "action", "actionName", "parametersList",
                "parameter", "whenStatement", "whileStatement", "whereStatement", "predicate",
                "relationalExpression", "logicalOperator", "timeUnit", "orExpression",
			"andExpression", "andChildExpression", "notExpression", "timeExpression",
			"timePeriodExpression", "timePredicate", "boundedTimePredicate", "timeConstant",
			"timeConstantUnit", "timePointExpression", "actionEnforcedTimeQuery",
			"termDuty", "actionMultiplicity", "timeQueryOperator", "addTimeConstant",
			"additiveOperator", "timePredicateOperator", "isOrNot", "logicalOrExpression",
                "logicalAndExpression", "childExpression", "assignment_expression", "relational_expression",
                "arithmetic_expression", "addSubExpression", "mulDivExpression", "primaryExpression",
                "comparativeRelationExpression", "atomExpression", "constantExpression",
                "rule_STRING", "rule_BOOLEAN", "rule_INTEGER", "rule_FLOAT", "rule_DOUBLE",
                "variableReference", "expressions", "relationOperator", "ofOperator",
                "transferOperation", "moneyExpression", "assetExpression", "clause",
                "bindClause", "factorBind", "lo_type", "factor", "itemLimitation", "itemLimitationName",
                "generalClause", "clauseDeclaration", "cvDuty", "mustFulfilObligation",
                "canExerciseRight", "breachClause", "breachClauseDeclaration", "legalRight",
                "legalRightDeclaration", "rightContent", "rightSubject", "possessTheRight",
                "rightObject", "onTheObject", "lawSource", "accordTo", "rightOf", "includingRightName",
                "rightName", "lawName", "rightObjectName", "impldeclaration", "value",
                "index", "decimal", "array", "jsonObject", "comment", "date", "struct",
                "type", "structObj", "structArr", "keyPair"
        };
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[]{
                null, "','", "'serial'", "'number'", "'0x'", "'{'", "'}'", "'='", "'against'",
                "'and'", "'arbitration term :'", "'administered by'", "'institution'",
                "'printedName'", "'date'", "'('", "')'", "'join'", "'or'", "'||'", "'&&'",
                "'isn't'", "'year'", "'month'", "'day'", "'hour'", "'min'", "'sec'",
                "'th'", "'start'", "'end'", "'+'", "'-'", "'is'", "'*'", "'/'", "'\"'",
                "'\\'", "'''", "'<'", "'<='", "'>'", "'>='", "'!='", "'::'", "'to'",
                "'$'", "'value'", "'IN'", "'NOT_IN'", "'['", "']'", "'fulfil '", "'exercise '",
                "'possess'", "'the'", "'on'", "'object'", "'according'", "'legalRight'",
                "'Enacting Agency'", "'Enactment Date'", "'Implementation Date'", "'Double'",
                "'int'", "'String'", "'Long'", "'Integer'", "'Date'", null, null, null,
                null, "'package'", "'contract'", "'convention'", "'party'", "'group'",
                "'asset'", "'info'", "'rightInfo'", "'addition'", "'obligation'", "'right'",
                "'signature'", "'term'", "'bind'", "'clause'", "'breach'", "'print'",
                "':'", "'.'", "'can'", "'cannot'", "'must'", "'when'", "'while'", "'where'",
                "'all'", "'some'", "'this'", "'did'", "'grant'", "'deposit'", "'withdraw'",
                "'transfer'", "'not'", null, null, "'false'", "'true'", "'for'", "'after'",
                "'before'", "'belongsTo'", "'within'", "'of'", "'implement'", "'declaration'",
                null, "'constraint_by'", "'including'", "'under'"
        };
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, "BoolValue", "RULE_DATE",
                "PERCENTAGE", "COMMENT_TEXT", "PACKAGE", "CONTRACT", "CONVENTION", "PARTY",
                "GROUP", "ASSET", "INFO", "RIGHTINFO", "ADDITION", "OBLIGATION", "RIGHT",
                "SIGNATURE", "TERM", "BIND", "CLAUSE", "BREACH", "PRINT", "COLON", "SPOT",
                "CAN", "CANNOT", "MUST", "WHEN", "WHILE", "WHERE", "ALL", "SOME", "THIS",
                "DID", "GRANT", "DEPOSIT", "WITHDRAW", "TRANSFER", "NOT", "OR", "AND",
                "FALSE", "TRUE", "FOR", "AFTER", "BEFORE", "BELONG", "WITHIN", "OF",
                "IMPLEMENT", "DECLARATION", "DETAILS", "CONSTRAINT_BY", "INCLUDING",
                "UNDER", "INDEX", "CHINESE", "WS", "RULE_STRING", "NUMBER", "IDENTIFIER",
                "NOTE", "PUNCTUATION", "ESC", "ANY", "THE"
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
	public String getGrammarFileName() { return "Spesc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SpescParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public ContractDefinitionContext contractDefinition() {
			return getRuleContext(ContractDefinitionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SpescParser.EOF, 0); }
		public PackageDirContext packageDir() {
			return getRuleContext(PackageDirContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(251);
                _errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
                    setState(250);
                    packageDir();
				}
			}

                setState(253);
                contractDefinition();
                setState(254);
                match(EOF);
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
	public static class PackageDirContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(SpescParser.PACKAGE, 0); }
		public DirContext dir() {
			return getRuleContext(DirContext.class,0);
		}
		public PackageDirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterPackageDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitPackageDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitPackageDir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDirContext packageDir() throws RecognitionException {
		PackageDirContext _localctx = new PackageDirContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDir);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(256);
                match(PACKAGE);
                setState(257);
                dir();
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
	public static class DirContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SpescParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SpescParser.IDENTIFIER, i);
		}
		public List<TerminalNode> SPOT() { return getTokens(SpescParser.SPOT); }
		public TerminalNode SPOT(int i) {
			return getToken(SpescParser.SPOT, i);
		}
		public DirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitDir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirContext dir() throws RecognitionException {
		DirContext _localctx = new DirContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dir);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(263);
                _errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
                        setState(259);
                        match(IDENTIFIER);
                        setState(260);
                        match(SPOT);
					}
					}
				}
                setState(265);
                _errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
                setState(266);
                match(IDENTIFIER);
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
	public static class ContractDefinitionContext extends ParserRuleContext {
		public ContractTypeContext contractType() {
			return getRuleContext(ContractTypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SpescParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SpescParser.IDENTIFIER, i);
		}
		public ContractBodyContext contractBody() {
			return getRuleContext(ContractBodyContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public TerminalNode CONSTRAINT_BY() { return getToken(SpescParser.CONSTRAINT_BY, 0); }
		public List<ConventionNameContext> conventionName() {
			return getRuleContexts(ConventionNameContext.class);
		}
		public ConventionNameContext conventionName(int i) {
			return getRuleContext(ConventionNameContext.class,i);
		}
		public TerminalNode COLON() { return getToken(SpescParser.COLON, 0); }
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterContractDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitContractDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitContractDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(271);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_TEXT) {
				{
				{
                    setState(268);
                    comment();
				}
				}
                setState(273);
                _errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(274);
                contractType();
                setState(275);
                match(IDENTIFIER);
                setState(285);
                _errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT_BY) {
				{
                    setState(276);
                    match(CONSTRAINT_BY);
                    setState(277);
                    conventionName();
                    setState(282);
                    _errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
                        setState(278);
                        match(T__0);
                        setState(279);
                        conventionName();
					}
					}
                    setState(284);
                    _errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

                setState(292);
                _errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
                    setState(287);
                    match(COLON);
                    setState(288);
                    match(T__1);
                    setState(289);
                    match(T__2);
                    setState(290);
                    match(T__3);
                    setState(291);
                    match(IDENTIFIER);
				}
			}

                setState(294);
                match(T__4);
                setState(295);
                contractBody();
                setState(296);
                match(T__5);
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
	public static class ContractTypeContext extends ParserRuleContext {
		public TerminalNode CONTRACT() { return getToken(SpescParser.CONTRACT, 0); }
		public TerminalNode CONVENTION() { return getToken(SpescParser.CONVENTION, 0); }
		public ContractTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterContractType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitContractType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitContractType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractTypeContext contractType() throws RecognitionException {
		ContractTypeContext _localctx = new ContractTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_contractType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(298);
                _la = _input.LA(1);
			if ( !(_la==CONTRACT || _la==CONVENTION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class ConventionNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SpescParser.IDENTIFIER, 0); }
		public ConventionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conventionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterConventionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitConventionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitConventionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConventionNameContext conventionName() throws RecognitionException {
		ConventionNameContext _localctx = new ConventionNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conventionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(300);
                match(IDENTIFIER);
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
	public static class ContractBodyContext extends ParserRuleContext {
		public List<PartyContext> party() {
			return getRuleContexts(PartyContext.class);
		}
		public PartyContext party(int i) {
			return getRuleContext(PartyContext.class,i);
		}
		public List<AssetContext> asset() {
			return getRuleContexts(AssetContext.class);
		}
		public AssetContext asset(int i) {
			return getRuleContext(AssetContext.class,i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<AdditionContext> addition() {
			return getRuleContexts(AdditionContext.class);
		}
		public AdditionContext addition(int i) {
			return getRuleContext(AdditionContext.class,i);
		}
		public List<LegalRightContext> legalRight() {
			return getRuleContexts(LegalRightContext.class);
		}
		public LegalRightContext legalRight(int i) {
			return getRuleContext(LegalRightContext.class,i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public ImpldeclarationContext impldeclaration() {
			return getRuleContext(ImpldeclarationContext.class,0);
		}
		public List<SignatureContext> signature() {
			return getRuleContexts(SignatureContext.class);
		}
		public SignatureContext signature(int i) {
			return getRuleContext(SignatureContext.class,i);
		}
		public ContractBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterContractBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitContractBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitContractBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractBodyContext contractBody() throws RecognitionException {
		ContractBodyContext _localctx = new ContractBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_contractBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(305);
                _errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
                        setState(302);
                        party();
					}
					}
				}
                setState(307);
                _errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
                setState(311);
                _errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
                        setState(308);
                        asset();
					}
					}
				}
                setState(313);
                _errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
                setState(317);
                _errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
                        setState(314);
                        field();
					}
					}
				}
                setState(319);
                _errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
                setState(323);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDITION) {
				{
				{
                    setState(320);
                    addition();
				}
				}
                setState(325);
                _errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(329);
                _errHandler.sync(this);
			_la = _input.LA(1);
                while (_la == T__58) {
                    {
                        {
                            setState(326);
                            legalRight();
                        }
                    }
                    setState(331);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(335);
                _errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
                        setState(332);
                        term();
					}
					}
				}
                setState(337);
                _errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
                setState(341);
                _errHandler.sync(this);
			_la = _input.LA(1);
                while (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 114689L) != 0)) {
                    {
                        {
                            setState(338);
                            clause();
                        }
                    }
                    setState(343);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(345);
                _errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENT) {
				{
                    setState(344);
                    impldeclaration();
				}
			}

                setState(350);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SIGNATURE) {
				{
				{
                    setState(347);
                    signature();
				}
				}
                setState(352);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PartyContext extends ParserRuleContext {
		public TerminalNode PARTY() { return getToken(SpescParser.PARTY, 0); }
		public PartyNameContext partyName() {
			return getRuleContext(PartyNameContext.class,0);
		}
		public TerminalNode GROUP() { return getToken(SpescParser.GROUP, 0); }
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public PartyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_party; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterParty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitParty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitParty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartyContext party() throws RecognitionException {
		PartyContext _localctx = new PartyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_party);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(356);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_TEXT) {
				{
				{
                    setState(353);
                    comment();
				}
				}
                setState(358);
                _errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(382);
                _errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1: {
                setState(359);
                match(PARTY);
                setState(360);
                partyName();
                setState(361);
                match(T__4);
                setState(365);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMENT_TEXT || _la == IDENTIFIER) {
                    {
                        {
                            setState(362);
                            field();
                        }
                    }
                    setState(367);
                    _errHandler.sync(this);
					_la = _input.LA(1);
				}
                setState(368);
                match(T__5);
				}
				break;
			case 2:
				{
                    setState(370);
                    match(PARTY);
                    setState(371);
                    match(GROUP);
                    setState(372);
                    partyName();
                    setState(373);
                    match(T__4);
                    setState(377);
                    _errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT_TEXT || _la==IDENTIFIER) {
					{
					{
                        setState(374);
                        field();
					}
					}
                    setState(379);
                    _errHandler.sync(this);
					_la = _input.LA(1);
				}
                    setState(380);
                    match(T__5);
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
	public static class AssetContext extends ParserRuleContext {
		public TerminalNode ASSET() { return getToken(SpescParser.ASSET, 0); }
		public AssetNameContext assetName() {
			return getRuleContext(AssetNameContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public InfoContext info() {
			return getRuleContext(InfoContext.class,0);
		}
		public RightContext right() {
			return getRuleContext(RightContext.class,0);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public AssetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterAsset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitAsset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitAsset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssetContext asset() throws RecognitionException {
		AssetContext _localctx = new AssetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asset);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(387);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_TEXT) {
				{
				{
                    setState(384);
                    comment();
				}
				}
                setState(389);
                _errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(390);
                match(ASSET);
                setState(391);
                assetName();
                setState(392);
                match(T__4);
                setState(394);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == INFO) {
                    {
                        setState(393);
                        info();
                    }
                }

                setState(397);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == RIGHT) {
                    {
                        setState(396);
                        right();
                    }
                }

                setState(402);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_TEXT || _la==IDENTIFIER) {
				{
                    {
                        setState(399);
                        field();
                    }
                }
                setState(404);
                _errHandler.sync(this);
                _la = _input.LA(1);
            }
                setState(405);
                match(T__5);
                setState(409);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(406);
                                property();
                            }
                        }
				}
                    setState(411);
                    _errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
	public static class PropertyContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode BoolValue() { return getToken(SpescParser.BoolValue, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(413);
                _errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
                    setState(412);
                    match(T__0);
				}
			}

                setState(415);
                propertyName();
                setState(416);
                match(T__6);
			{
                setState(417);
                match(BoolValue);
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
	public static class PropertyNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SpescParser.IDENTIFIER, 0); }
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitPropertyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitPropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_propertyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(419);
                match(IDENTIFIER);
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
	public static class FieldContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SpescParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public JsonObjectContext jsonObject() {
			return getRuleContext(JsonObjectContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(424);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_TEXT) {
				{
				{
                    setState(421);
                    comment();
				}
				}
                setState(426);
                _errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(427);
                name();
                setState(428);
                match(COLON);
                setState(433);
                _errHandler.sync(this);
			switch (_input.LA(1)) {
                case T__62:
                case T__63:
                case T__64:
                case T__65:
                case T__66:
                case T__67: {
                    setState(429);
                    type();
                }
                break;
                case SPOT:
			case FALSE:
			case TRUE:
			case CHINESE:
			case RULE_STRING:
			case NUMBER:
			case IDENTIFIER:
				{
                    setState(430);
                    value();
				}
				break;
			case T__49:
				{
                    setState(431);
                    array();
				}
				break;
			case T__4:
				{
                    setState(432);
                    jsonObject();
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
	public static class AdditionContext extends ParserRuleContext {
		public TerminalNode ADDITION() { return getToken(SpescParser.ADDITION, 0); }
		public AdditionNameContext additionName() {
			return getRuleContext(AdditionNameContext.class,0);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		AdditionContext _localctx = new AdditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_addition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(435);
                match(ADDITION);
                setState(436);
                additionName();
                setState(437);
                match(T__4);
                setState(441);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_TEXT || _la==IDENTIFIER) {
				{
				{
                    setState(438);
                    field();
				}
				}
                setState(443);
                _errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(444);
                match(T__5);
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
	public static class PartyNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SpescParser.IDENTIFIER, 0); }
		public PartyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterPartyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitPartyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitPartyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartyNameContext partyName() throws RecognitionException {
		PartyNameContext _localctx = new PartyNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_partyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(446);
                match(IDENTIFIER);
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
	public static class AssetNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SpescParser.IDENTIFIER, 0); }
		public AssetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assetName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterAssetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitAssetName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitAssetName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssetNameContext assetName() throws RecognitionException {
		AssetNameContext _localctx = new AssetNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(448);
                match(IDENTIFIER);
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
	public static class NameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SpescParser.IDENTIFIER, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(450);
                match(IDENTIFIER);
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
	public static class AdditionNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SpescParser.IDENTIFIER, 0); }
		public AdditionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterAdditionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitAdditionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitAdditionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionNameContext additionName() throws RecognitionException {
		AdditionNameContext _localctx = new AdditionNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_additionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(452);
                match(IDENTIFIER);
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
	public static class InfoContext extends ParserRuleContext {
		public TerminalNode INFO() { return getToken(SpescParser.INFO, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public InfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfoContext info() throws RecognitionException {
		InfoContext _localctx = new InfoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_info);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(454);
                match(INFO);
                setState(455);
                match(T__4);
                setState(456);
                field();
                setState(461);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
                    setState(457);
                    match(T__0);
                    setState(458);
                    field();
				}
				}
                setState(463);
                _errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(464);
                match(T__5);
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
	public static class RightContext extends ParserRuleContext {
		public TerminalNode RIGHT() { return getToken(SpescParser.RIGHT, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public RightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightContext right() throws RecognitionException {
		RightContext _localctx = new RightContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_right);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(466);
                match(RIGHT);
                setState(467);
                match(T__4);
                setState(468);
                field();
                setState(473);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
                    setState(469);
                    match(T__0);
                    setState(470);
                    field();
				}
				}
                setState(475);
                _errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(476);
                match(T__5);
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
	public static class TermContext extends ParserRuleContext {
		public GeneralTermContext generalTerm() {
			return getRuleContext(GeneralTermContext.class,0);
		}
		public BreachTermContext breachTerm() {
			return getRuleContext(BreachTermContext.class,0);
		}
		public ArbiTermContext arbiTerm() {
			return getRuleContext(ArbiTermContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(481);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_TEXT) {
				{
				{
                    setState(478);
                    comment();
				}
				}
                setState(483);
                _errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(487);
                _errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERM:
				{
                    setState(484);
                    generalTerm();
				}
				break;
			case BREACH:
				{
                    setState(485);
                    breachTerm();
				}
				break;
			case T__9:
				{
                    setState(486);
                    arbiTerm();
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
	public static class GeneralTermContext extends ParserRuleContext {
		public GeneralTermDeclarationContext generalTermDeclaration() {
			return getRuleContext(GeneralTermDeclarationContext.class,0);
		}
		public WhenStatementContext whenStatement() {
			return getRuleContext(WhenStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhereStatementContext whereStatement() {
			return getRuleContext(WhereStatementContext.class,0);
		}
		public GeneralTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterGeneralTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitGeneralTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitGeneralTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralTermContext generalTerm() throws RecognitionException {
		GeneralTermContext _localctx = new GeneralTermContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_generalTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(489);
                generalTermDeclaration();
                setState(491);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WHEN) {
                    {
                        setState(490);
                        whenStatement();
                    }
                }

                setState(494);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WHILE) {
                    {
                        setState(493);
                        whileStatement();
                    }
                }

                setState(497);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WHERE) {
                    {
                        setState(496);
                        whereStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreachTermContext extends ParserRuleContext {
		public BreachTermDeclarationContext breachTermDeclaration() {
			return getRuleContext(BreachTermDeclarationContext.class,0);
		}
		public WhenStatementContext whenStatement() {
			return getRuleContext(WhenStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhereStatementContext whereStatement() {
			return getRuleContext(WhereStatementContext.class,0);
		}
		public BreachTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breachTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterBreachTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitBreachTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitBreachTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreachTermContext breachTerm() throws RecognitionException {
		BreachTermContext _localctx = new BreachTermContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_breachTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(499);
                breachTermDeclaration();
                setState(501);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WHEN) {
                    {
                        setState(500);
                        whenStatement();
                    }
                }

                setState(504);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WHILE) {
                    {
                        setState(503);
                        whileStatement();
                    }
                }

                setState(507);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WHERE) {
                    {
                        setState(506);
                        whereStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArbiTermContext extends ParserRuleContext {
		public ControversyContext controversy() {
			return getRuleContext(ControversyContext.class,0);
		}
		public InstitutionContext institution() {
			return getRuleContext(InstitutionContext.class,0);
		}
		public ArbiTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arbiTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterArbiTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitArbiTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitArbiTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArbiTermContext arbiTerm() throws RecognitionException {
		ArbiTermContext _localctx = new ArbiTermContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arbiTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(509);
                controversy();
                setState(510);
                institution();
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
	public static class GeneralTermDeclarationContext extends ParserRuleContext {
		public TerminalNode TERM() { return getToken(SpescParser.TERM, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SpescParser.COLON, 0); }
		public PartyNameContext partyName() {
			return getRuleContext(PartyNameContext.class,0);
		}
		public DutyContext duty() {
			return getRuleContext(DutyContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public GeneralTermDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalTermDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterGeneralTermDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitGeneralTermDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitGeneralTermDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralTermDeclarationContext generalTermDeclaration() throws RecognitionException {
		GeneralTermDeclarationContext _localctx = new GeneralTermDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_generalTermDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(512);
                match(TERM);
                setState(513);
                index();
                setState(514);
                match(COLON);
                setState(515);
                partyName();
                setState(516);
                duty();
                setState(517);
                action();
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
	public static class DutyContext extends ParserRuleContext {
		public Token op;
		public TerminalNode CAN() { return getToken(SpescParser.CAN, 0); }
		public TerminalNode CANNOT() { return getToken(SpescParser.CANNOT, 0); }
		public TerminalNode MUST() { return getToken(SpescParser.MUST, 0); }
		public DutyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterDuty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitDuty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitDuty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DutyContext duty() throws RecognitionException {
		DutyContext _localctx = new DutyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_duty);
		try {
            setState(522);
            _errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAN:
				enterOuterAlt(_localctx, 1);
				{
                    setState(519);
                    ((DutyContext) _localctx).op = match(CAN);
				}
				break;
			case CANNOT:
				enterOuterAlt(_localctx, 2);
				{
                    setState(520);
                    ((DutyContext) _localctx).op = match(CANNOT);
				}
				break;
			case MUST:
				enterOuterAlt(_localctx, 3);
				{
                    setState(521);
                    ((DutyContext) _localctx).op = match(MUST);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreachTermDeclarationContext extends ParserRuleContext {
		public TerminalNode BREACH() { return getToken(SpescParser.BREACH, 0); }
		public TerminalNode TERM() { return getToken(SpescParser.TERM, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SpescParser.COLON, 0); }
		public PartyNameContext partyName() {
			return getRuleContext(PartyNameContext.class,0);
		}
		public DutyContext duty() {
			return getRuleContext(DutyContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public AgainstDeclarationContext againstDeclaration() {
			return getRuleContext(AgainstDeclarationContext.class,0);
		}
		public BreachTermDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breachTermDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterBreachTermDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitBreachTermDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitBreachTermDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreachTermDeclarationContext breachTermDeclaration() throws RecognitionException {
		BreachTermDeclarationContext _localctx = new BreachTermDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_breachTermDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(524);
                match(BREACH);
                setState(525);
                match(TERM);
                setState(526);
                index();
                setState(528);
                _errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
                    setState(527);
                    againstDeclaration();
				}
			}

                setState(530);
                match(COLON);
                setState(531);
                partyName();
                setState(532);
                duty();
                setState(533);
                action();
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
	public static class AgainstDeclarationContext extends ParserRuleContext {
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public TerminalNode TERM() { return getToken(SpescParser.TERM, 0); }
		public List<TerminalNode> CLAUSE() { return getTokens(SpescParser.CLAUSE); }
		public TerminalNode CLAUSE(int i) {
			return getToken(SpescParser.CLAUSE, i);
		}
		public AgainstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_againstDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterAgainstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitAgainstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitAgainstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AgainstDeclarationContext againstDeclaration() throws RecognitionException {
		AgainstDeclarationContext _localctx = new AgainstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_againstDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(535);
                match(T__7);
                setState(536);
                _la = _input.LA(1);
			if ( !(_la==TERM || _la==CLAUSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
                setState(537);
                index();
                setState(543);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
                    setState(538);
                    match(T__8);
                    setState(539);
                    match(CLAUSE);
                    setState(540);
                    index();
				}
				}
                setState(545);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ControversyContext extends ParserRuleContext {
		public ControversyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controversy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterControversy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitControversy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitControversy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControversyContext controversy() throws RecognitionException {
		ControversyContext _localctx = new ControversyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_controversy);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(546);
                match(T__9);
                setState(550);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 41, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(547);
                                matchWildcard();
                            }
                        }
				}
                    setState(552);
                    _errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
                setState(553);
                match(T__10);
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
	public static class InstitutionContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(SpescParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SpescParser.IDENTIFIER, 0); }
		public InstitutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_institution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterInstitution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitInstitution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitInstitution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstitutionContext institution() throws RecognitionException {
		InstitutionContext _localctx = new InstitutionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_institution);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(555);
                match(T__11);
                setState(556);
                match(COLON);
                setState(557);
                match(IDENTIFIER);
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
	public static class SignatureContext extends ParserRuleContext {
		public List<TerminalNode> SIGNATURE() { return getTokens(SpescParser.SIGNATURE); }
		public TerminalNode SIGNATURE(int i) {
			return getToken(SpescParser.SIGNATURE, i);
		}
		public TerminalNode OF() { return getToken(SpescParser.OF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SpescParser.IDENTIFIER, 0); }
		public List<TerminalNode> COLON() { return getTokens(SpescParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SpescParser.COLON, i);
		}
		public TerminalNode PARTY() { return getToken(SpescParser.PARTY, 0); }
		public TerminalNode GROUP() { return getToken(SpescParser.GROUP, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode RULE_DATE() { return getToken(SpescParser.RULE_DATE, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(559);
                match(SIGNATURE);
                setState(560);
                match(OF);
                setState(561);
                _la = _input.LA(1);
			if ( !(_la==PARTY || _la==GROUP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
                setState(562);
                match(IDENTIFIER);
                setState(563);
                match(COLON);
                setState(564);
                match(T__4);
                setState(565);
                match(T__12);
                setState(566);
                match(COLON);
                setState(573);
                _errHandler.sync(this);
			_la = _input.LA(1);
                if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & -6917317921140113345L) != 0) || _la == NUMBER || _la == IDENTIFIER) {
                    {
                        setState(569);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case T__62:
                            case T__63:
                            case T__64:
                            case T__65:
                            case T__66:
                            case T__67: {
                                setState(567);
                                type();
                            }
                            break;
                            case SPOT:
				case FALSE:
				case TRUE:
				case CHINESE:
				case RULE_STRING:
                            case NUMBER:
                            case IDENTIFIER: {
                                setState(568);
                                value();
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                        setState(571);
                        match(T__0);
                    }
                }

                setState(575);
                match(SIGNATURE);
                setState(576);
                match(COLON);
                setState(583);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & -6917317921140113345L) != 0) || _la == NUMBER || _la == IDENTIFIER) {
                    {
                        setState(579);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case T__62:
                            case T__63:
                            case T__64:
                            case T__65:
                            case T__66:
                            case T__67: {
                                setState(577);
                                type();
                            }
                            break;
                            case SPOT:
				case FALSE:
				case TRUE:
				case CHINESE:
				case RULE_STRING:
                            case NUMBER:
                            case IDENTIFIER: {
                                setState(578);
                                value();
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                        setState(581);
                        match(T__0);
                    }
                }

                setState(585);
                match(T__13);
                setState(586);
                match(COLON);
                setState(589);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case T__62:
                    case T__63:
                    case T__64:
                    case T__65:
                    case T__66:
                    case T__67: {
                        setState(587);
                        type();
                    }
                    break;
                    case RULE_DATE:
				{
                    setState(588);
                    match(RULE_DATE);
				}
				break;
			case T__5:
				break;
			default:
				break;
			}
                setState(591);
                match(T__5);
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
	public static class ActionContext extends ParserRuleContext {
		public ActionNameContext actionName() {
			return getRuleContext(ActionNameContext.class,0);
		}
		public ParametersListContext parametersList() {
			return getRuleContext(ParametersListContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(593);
                actionName();
                setState(599);
                _errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
                    setState(594);
                    match(T__14);
                    setState(596);
                    _errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
                        setState(595);
                        parametersList();
					}
				}

                    setState(598);
                    match(T__15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActionNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SpescParser.IDENTIFIER, 0); }
		public ActionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterActionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitActionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitActionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionNameContext actionName() throws RecognitionException {
		ActionNameContext _localctx = new ActionNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_actionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(601);
                match(IDENTIFIER);
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
	public static class ParametersListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterParametersList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitParametersList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitParametersList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersListContext parametersList() throws RecognitionException {
		ParametersListContext _localctx = new ParametersListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parametersList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(603);
                parameter();
                setState(608);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
                    setState(604);
                    match(T__0);
                    setState(605);
                    parameter();
				}
				}
                setState(610);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SpescParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(611);
                match(IDENTIFIER);
                setState(613);
                _errHandler.sync(this);
			_la = _input.LA(1);
                if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 63L) != 0)) {
                    {
                        setState(612);
                        type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhenStatementContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(SpescParser.WHEN, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public WhenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterWhenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitWhenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitWhenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenStatementContext whenStatement() throws RecognitionException {
		WhenStatementContext _localctx = new WhenStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_whenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(615);
                match(WHEN);
                setState(616);
                predicate();
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SpescParser.WHILE, 0); }
		public List<TransferOperationContext> transferOperation() {
			return getRuleContexts(TransferOperationContext.class);
		}
		public TransferOperationContext transferOperation(int i) {
			return getRuleContext(TransferOperationContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(618);
                match(WHILE);
                setState(619);
                transferOperation();
                setState(624);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
                    setState(620);
                    match(T__8);
                    setState(621);
                    transferOperation();
				}
				}
                setState(626);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhereStatementContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SpescParser.WHERE, 0); }
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public WhereStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterWhereStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitWhereStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitWhereStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereStatementContext whereStatement() throws RecognitionException {
		WhereStatementContext _localctx = new WhereStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_whereStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(627);
                match(WHERE);
                setState(642);
                _errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				{
                    setState(629);
                    _errHandler.sync(this);
				_la = _input.LA(1);
                    if (_la == T__14 || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 249108889601L) != 0)) {
                        {
                            setState(628);
                            logicalOrExpression();
                        }
                    }

                    setState(633);
                    _errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
                        setState(631);
                        match(T__16);
                        setState(632);
                        relationalExpression();
					}
				}

				}
				}
				break;
			case 2:
				{
				{
                    setState(636);
                    _errHandler.sync(this);
				_la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 351652577280L) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 6846201758593L) != 0)) {
                        {
                            setState(635);
                            relationalExpression();
                        }
                    }

                    setState(640);
                    _errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
                        setState(638);
                        match(T__16);
                        setState(639);
                        logicalOrExpression();
					}
				}

				}
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
	public static class PredicateContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(644);
                relationalExpression();
                setState(648);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OR || _la == AND) {
                    {
                        setState(645);
                        logicalOperator();
                        setState(646);
                        relationalExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public TimeUnitContext timeUnit() {
			return getRuleContext(TimeUnitContext.class,0);
		}
		public ComparativeRelationExpressionContext comparativeRelationExpression() {
			return getRuleContext(ComparativeRelationExpressionContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_relationalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(652);
                _errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
                    setState(650);
                    timeUnit();
				}
				break;
			case 2:
				{
                    setState(651);
                    comparativeRelationExpression();
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
	public static class LogicalOperatorContext extends ParserRuleContext {
		public Token op;
		public TerminalNode AND() { return getToken(SpescParser.AND, 0); }
		public TerminalNode OR() { return getToken(SpescParser.OR, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_logicalOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(656);
                _errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				{
                    setState(654);
                    ((LogicalOperatorContext) _localctx).op = match(AND);
				}
				break;
			case OR:
				{
                    setState(655);
                    ((LogicalOperatorContext) _localctx).op = match(OR);
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
	public static class TimeUnitContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TimeUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterTimeUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitTimeUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitTimeUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeUnitContext timeUnit() throws RecognitionException {
		TimeUnitContext _localctx = new TimeUnitContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_timeUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(658);
                orExpression();
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
	public static class OrExpressionContext extends ParserRuleContext {
		public Token op;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(660);
                andExpression();
                setState(668);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__18) {
				{
				{
                    setState(663);
                    _errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__17:
					{
                        setState(661);
                        ((OrExpressionContext) _localctx).op = match(T__17);
					}
					break;
				case T__18:
					{
                        setState(662);
                        ((OrExpressionContext) _localctx).op = match(T__18);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
                    setState(665);
                    andExpression();
				}
				}
                setState(670);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends ParserRuleContext {
		public Token op;
		public List<AndChildExpressionContext> andChildExpression() {
			return getRuleContexts(AndChildExpressionContext.class);
		}
		public AndChildExpressionContext andChildExpression(int i) {
			return getRuleContext(AndChildExpressionContext.class,i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(671);
                andChildExpression();
                setState(679);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__19) {
				{
				{
                    setState(674);
                    _errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
                        setState(672);
                        ((AndExpressionContext) _localctx).op = match(T__8);
					}
					break;
				case T__19:
					{
                        setState(673);
                        ((AndExpressionContext) _localctx).op = match(T__19);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
                    setState(676);
                    andChildExpression();
				}
				}
                setState(681);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AndChildExpressionContext extends ParserRuleContext {
		public NotExpressionContext notExpression() {
			return getRuleContext(NotExpressionContext.class,0);
		}
		public TimeExpressionContext timeExpression() {
			return getRuleContext(TimeExpressionContext.class,0);
		}
		public AndChildExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andChildExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterAndChildExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitAndChildExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitAndChildExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndChildExpressionContext andChildExpression() throws RecognitionException {
		AndChildExpressionContext _localctx = new AndChildExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_andChildExpression);
		try {
            setState(684);
            _errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
                    setState(682);
                    notExpression();
				}
				break;
			case T__28:
			case T__29:
			case ALL:
			case SOME:
			case THIS:
			case AFTER:
			case BEFORE:
			case WITHIN:
			case NUMBER:
			case IDENTIFIER:
			case ANY:
			case THE:
				enterOuterAlt(_localctx, 2);
				{
                    setState(683);
                    timeExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends ParserRuleContext {
		public TimeExpressionContext timeExpression() {
			return getRuleContext(TimeExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SpescParser.NOT, 0); }
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_notExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(686);
                _la = _input.LA(1);
			if ( !(_la==T__20 || _la==NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
                setState(687);
                timeExpression();
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
	public static class TimeExpressionContext extends ParserRuleContext {
		public TimePeriodExpressionContext timePeriodExpression() {
			return getRuleContext(TimePeriodExpressionContext.class,0);
		}
		public TimeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterTimeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitTimeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitTimeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeExpressionContext timeExpression() throws RecognitionException {
		TimeExpressionContext _localctx = new TimeExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_timeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(689);
                timePeriodExpression();
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
	public static class TimePeriodExpressionContext extends ParserRuleContext {
		public BoundedTimePredicateContext boundedTimePredicate() {
			return getRuleContext(BoundedTimePredicateContext.class,0);
		}
		public TimePredicateContext timePredicate() {
			return getRuleContext(TimePredicateContext.class,0);
		}
		public TimePeriodExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timePeriodExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterTimePeriodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitTimePeriodExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitTimePeriodExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimePeriodExpressionContext timePeriodExpression() throws RecognitionException {
		TimePeriodExpressionContext _localctx = new TimePeriodExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_timePeriodExpression);
		try {
            setState(693);
            _errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFTER:
			case BEFORE:
			case WITHIN:
				enterOuterAlt(_localctx, 1);
				{
                    setState(691);
                    boundedTimePredicate();
				}
				break;
			case T__28:
			case T__29:
			case ALL:
			case SOME:
			case THIS:
			case NUMBER:
			case IDENTIFIER:
			case ANY:
			case THE:
				enterOuterAlt(_localctx, 2);
				{
                    setState(692);
                    timePredicate();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TimePredicateContext extends ParserRuleContext {
		public List<TimePointExpressionContext> timePointExpression() {
			return getRuleContexts(TimePointExpressionContext.class);
		}
		public TimePointExpressionContext timePointExpression(int i) {
			return getRuleContext(TimePointExpressionContext.class,i);
		}
		public IsOrNotContext isOrNot() {
			return getRuleContext(IsOrNotContext.class,0);
		}
		public TimePredicateOperatorContext timePredicateOperator() {
			return getRuleContext(TimePredicateOperatorContext.class,0);
		}
		public TimePredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timePredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterTimePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitTimePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitTimePredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimePredicateContext timePredicate() throws RecognitionException {
		TimePredicateContext _localctx = new TimePredicateContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_timePredicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(695);
                timePointExpression();
                setState(700);
                _errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20 || _la==T__32) {
				{
                    setState(696);
                    isOrNot();
                    setState(697);
                    timePredicateOperator();
                    setState(698);
                    timePointExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoundedTimePredicateContext extends ParserRuleContext {
		public TimePredicateOperatorContext timePredicateOperator() {
			return getRuleContext(TimePredicateOperatorContext.class,0);
		}
		public TimePointExpressionContext timePointExpression() {
			return getRuleContext(TimePointExpressionContext.class,0);
		}
		public TerminalNode WITHIN() { return getToken(SpescParser.WITHIN, 0); }
		public TimeConstantContext timeConstant() {
			return getRuleContext(TimeConstantContext.class,0);
		}
		public BoundedTimePredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundedTimePredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterBoundedTimePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitBoundedTimePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitBoundedTimePredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundedTimePredicateContext boundedTimePredicate() throws RecognitionException {
		BoundedTimePredicateContext _localctx = new BoundedTimePredicateContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_boundedTimePredicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(704);
                _errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITHIN) {
				{
                    setState(702);
                    match(WITHIN);
                    setState(703);
                    timeConstant();
				}
			}

                setState(706);
                timePredicateOperator();
                setState(707);
                timePointExpression();
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
	public static class TimeConstantContext extends ParserRuleContext {
		public Rule_INTEGERContext rule_INTEGER() {
			return getRuleContext(Rule_INTEGERContext.class,0);
		}
		public TimeConstantUnitContext timeConstantUnit() {
			return getRuleContext(TimeConstantUnitContext.class,0);
		}
		public TimeConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterTimeConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitTimeConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitTimeConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeConstantContext timeConstant() throws RecognitionException {
		TimeConstantContext _localctx = new TimeConstantContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_timeConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(709);
                rule_INTEGER();
                setState(710);
                timeConstantUnit();
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
	public static class TimeConstantUnitContext extends ParserRuleContext {
		public TimeConstantUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeConstantUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterTimeConstantUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitTimeConstantUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitTimeConstantUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeConstantUnitContext timeConstantUnit() throws RecognitionException {
		TimeConstantUnitContext _localctx = new TimeConstantUnitContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_timeConstantUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(712);
                _la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 532676608L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class TimePointExpressionContext extends ParserRuleContext {
		public ActionEnforcedTimeQueryContext actionEnforcedTimeQuery() {
			return getRuleContext(ActionEnforcedTimeQueryContext.class,0);
		}
		public TimeQueryOperatorContext timeQueryOperator() {
			return getRuleContext(TimeQueryOperatorContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TimeConstantContext timeConstant() {
			return getRuleContext(TimeConstantContext.class,0);
		}
		public AddTimeConstantContext addTimeConstant() {
			return getRuleContext(AddTimeConstantContext.class,0);
		}
		public TimePointExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timePointExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterTimePointExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitTimePointExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitTimePointExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimePointExpressionContext timePointExpression() throws RecognitionException {
		TimePointExpressionContext _localctx = new TimePointExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_timePointExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(718);
                _errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
                    setState(714);
                    actionEnforcedTimeQuery();
				}
				break;
			case 2:
				{
                    setState(715);
                    timeQueryOperator();
				}
				break;
			case 3:
				{
                    setState(716);
                    date();
				}
				break;
			case 4:
				{
                    setState(717);
                    timeConstant();
				}
				break;
			}
                setState(721);
                _errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30 || _la==T__31) {
				{
                    setState(720);
                    addTimeConstant();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActionEnforcedTimeQueryContext extends ParserRuleContext {
		public PartyNameContext partyName() {
			return getRuleContext(PartyNameContext.class,0);
		}
		public TermDutyContext termDuty() {
			return getRuleContext(TermDutyContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ActionMultiplicityContext actionMultiplicity() {
			return getRuleContext(ActionMultiplicityContext.class,0);
		}
		public ActionEnforcedTimeQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionEnforcedTimeQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterActionEnforcedTimeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitActionEnforcedTimeQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitActionEnforcedTimeQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionEnforcedTimeQueryContext actionEnforcedTimeQuery() throws RecognitionException {
		ActionEnforcedTimeQueryContext _localctx = new ActionEnforcedTimeQueryContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_actionEnforcedTimeQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(724);
                _errHandler.sync(this);
			_la = _input.LA(1);
                if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 51539607559L) != 0)) {
                    {
                        setState(723);
                        actionMultiplicity();
                    }
                }

                setState(726);
                partyName();
                setState(727);
                termDuty();
                setState(728);
                action();
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
	public static class TermDutyContext extends ParserRuleContext {
		public TerminalNode DID() { return getToken(SpescParser.DID, 0); }
		public TermDutyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termDuty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterTermDuty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitTermDuty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitTermDuty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermDutyContext termDuty() throws RecognitionException {
		TermDutyContext _localctx = new TermDutyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_termDuty);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(730);
                match(DID);
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
	public static class ActionMultiplicityContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SpescParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(SpescParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(SpescParser.SOME, 0); }
		public TerminalNode THIS() { return getToken(SpescParser.THIS, 0); }
		public TerminalNode THE() { return getToken(SpescParser.THE, 0); }
		public ActionMultiplicityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionMultiplicity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterActionMultiplicity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitActionMultiplicity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitActionMultiplicity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionMultiplicityContext actionMultiplicity() throws RecognitionException {
		ActionMultiplicityContext _localctx = new ActionMultiplicityContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_actionMultiplicity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(732);
                _la = _input.LA(1);
                if (!(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 51539607559L) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
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
	public static class TimeQueryOperatorContext extends ParserRuleContext {
		public Token op;
		public TerminalNode OF() { return getToken(SpescParser.OF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SpescParser.IDENTIFIER, 0); }
		public TimeQueryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeQueryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterTimeQueryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitTimeQueryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitTimeQueryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeQueryOperatorContext timeQueryOperator() throws RecognitionException {
		TimeQueryOperatorContext _localctx = new TimeQueryOperatorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_timeQueryOperator);
		try {
            setState(741);
            _errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				{
                    setState(736);
                    _errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__28:
					{
                        setState(734);
                        ((TimeQueryOperatorContext) _localctx).op = match(T__28);
					}
					break;
				case T__29:
					{
                        setState(735);
                        ((TimeQueryOperatorContext) _localctx).op = match(T__29);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
                    setState(738);
                    match(OF);
                    setState(739);
                    match(IDENTIFIER);
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
                    setState(740);
                    match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddTimeConstantContext extends ParserRuleContext {
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public TimeConstantContext timeConstant() {
			return getRuleContext(TimeConstantContext.class,0);
		}
		public AddTimeConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addTimeConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterAddTimeConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitAddTimeConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitAddTimeConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddTimeConstantContext addTimeConstant() throws RecognitionException {
		AddTimeConstantContext _localctx = new AddTimeConstantContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_addTimeConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
                setState(743);
                additiveOperator();
                setState(744);
                timeConstant();
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
	public static class AdditiveOperatorContext extends ParserRuleContext {
		public Token op;
		public AdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterAdditiveOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitAdditiveOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_additiveOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(748);
                _errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				{
                    setState(746);
                    ((AdditiveOperatorContext) _localctx).op = match(T__30);
				}
				break;
			case T__31:
				{
                    setState(747);
                    ((AdditiveOperatorContext) _localctx).op = match(T__31);
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
	public static class TimePredicateOperatorContext extends ParserRuleContext {
		public TerminalNode BEFORE() { return getToken(SpescParser.BEFORE, 0); }
		public TerminalNode AFTER() { return getToken(SpescParser.AFTER, 0); }
		public TimePredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timePredicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterTimePredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitTimePredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitTimePredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimePredicateOperatorContext timePredicateOperator() throws RecognitionException {
		TimePredicateOperatorContext _localctx = new TimePredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_timePredicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(750);
                _la = _input.LA(1);
			if ( !(_la==AFTER || _la==BEFORE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class IsOrNotContext extends ParserRuleContext {
		public IsOrNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isOrNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterIsOrNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitIsOrNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitIsOrNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsOrNotContext isOrNot() throws RecognitionException {
		IsOrNotContext _localctx = new IsOrNotContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_isOrNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(752);
                _la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__32) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(754);
                logicalAndExpression();
                setState(759);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__18) {
				{
				{
                    setState(755);
                    _la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
                    setState(756);
                    logicalAndExpression();
				}
				}
                setState(761);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<ChildExpressionContext> childExpression() {
			return getRuleContexts(ChildExpressionContext.class);
		}
		public ChildExpressionContext childExpression(int i) {
			return getRuleContext(ChildExpressionContext.class,i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(762);
                childExpression();
                setState(767);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__19) {
				{
				{
                    setState(763);
                    _la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
                    setState(764);
                    childExpression();
				}
				}
                setState(769);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChildExpressionContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public ChildExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterChildExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitChildExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitChildExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildExpressionContext childExpression() throws RecognitionException {
		ChildExpressionContext _localctx = new ChildExpressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_childExpression);
		try {
            setState(773);
            _errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(770);
                    assignment_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(771);
                    relational_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
                    setState(772);
                    arithmetic_expression();
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
	public static class Assignment_expressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SpescParser.IDENTIFIER, 0); }
		public ChildExpressionContext childExpression() {
			return getRuleContext(ChildExpressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitAssignment_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitAssignment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(775);
                match(IDENTIFIER);
                setState(776);
                match(T__6);
                setState(777);
                childExpression();
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
	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public RelationOperatorContext relationOperator() {
			return getRuleContext(RelationOperatorContext.class,0);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(779);
                arithmetic_expression();
                setState(783);
                _errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17051022262400L) != 0)) {
				{
                    setState(780);
                    relationOperator();
                    setState(781);
                    arithmetic_expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arithmetic_expressionContext extends ParserRuleContext {
		public AddSubExpressionContext addSubExpression() {
			return getRuleContext(AddSubExpressionContext.class,0);
		}
		public Arithmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterArithmetic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitArithmetic_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitArithmetic_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_expressionContext arithmetic_expression() throws RecognitionException {
		Arithmetic_expressionContext _localctx = new Arithmetic_expressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_arithmetic_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(785);
                addSubExpression();
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
	public static class AddSubExpressionContext extends ParserRuleContext {
		public List<MulDivExpressionContext> mulDivExpression() {
			return getRuleContexts(MulDivExpressionContext.class);
		}
		public MulDivExpressionContext mulDivExpression(int i) {
			return getRuleContext(MulDivExpressionContext.class,i);
		}
		public AddSubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitAddSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubExpressionContext addSubExpression() throws RecognitionException {
		AddSubExpressionContext _localctx = new AddSubExpressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_addSubExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(787);
                mulDivExpression();
                setState(792);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30 || _la==T__31) {
				{
				{
                    setState(788);
                    _la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__31) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
                    setState(789);
                    mulDivExpression();
				}
				}
                setState(794);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExpressionContext extends ParserRuleContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public MulDivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterMulDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitMulDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitMulDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivExpressionContext mulDivExpression() throws RecognitionException {
		MulDivExpressionContext _localctx = new MulDivExpressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_mulDivExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(795);
                primaryExpression();
                setState(800);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33 || _la==T__34) {
				{
				{
                    setState(796);
                    _la = _input.LA(1);
				if ( !(_la==T__33 || _la==T__34) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
                    setState(797);
                    primaryExpression();
				}
				}
                setState(802);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_primaryExpression);
		try {
            setState(808);
            _errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPOT:
			case FALSE:
			case TRUE:
			case CHINESE:
			case RULE_STRING:
			case NUMBER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
                    setState(803);
                    value();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
                    setState(804);
                    match(T__14);
                    setState(805);
                    arithmetic_expression();
                    setState(806);
                    match(T__15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparativeRelationExpressionContext extends ParserRuleContext {
		public List<AtomExpressionContext> atomExpression() {
			return getRuleContexts(AtomExpressionContext.class);
		}
		public AtomExpressionContext atomExpression(int i) {
			return getRuleContext(AtomExpressionContext.class,i);
		}
		public RelationOperatorContext relationOperator() {
			return getRuleContext(RelationOperatorContext.class,0);
		}
		public ComparativeRelationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparativeRelationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterComparativeRelationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitComparativeRelationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitComparativeRelationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparativeRelationExpressionContext comparativeRelationExpression() throws RecognitionException {
		ComparativeRelationExpressionContext _localctx = new ComparativeRelationExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_comparativeRelationExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                {
                    setState(810);
                    atomExpression();
                    setState(814);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17051022262400L) != 0)) {
                        {
                            setState(811);
                            relationOperator();
                            setState(812);
                            atomExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomExpressionContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public AtomExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterAtomExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitAtomExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitAtomExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomExpressionContext atomExpression() throws RecognitionException {
		AtomExpressionContext _localctx = new AtomExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_atomExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(819);
                _errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
                    setState(816);
                    constantExpression();
				}
				break;
			case 2:
				{
                    setState(817);
                    variableReference();
				}
				break;
			case 3:
				{
                    setState(818);
                    expressions(0);
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
	public static class ConstantExpressionContext extends ParserRuleContext {
		public Rule_INTEGERContext rule_INTEGER() {
			return getRuleContext(Rule_INTEGERContext.class,0);
		}
		public Rule_STRINGContext rule_STRING() {
			return getRuleContext(Rule_STRINGContext.class,0);
		}
		public Rule_BOOLEANContext rule_BOOLEAN() {
			return getRuleContext(Rule_BOOLEANContext.class,0);
		}
		public Rule_FLOATContext rule_FLOAT() {
			return getRuleContext(Rule_FLOATContext.class,0);
		}
		public Rule_DOUBLEContext rule_DOUBLE() {
			return getRuleContext(Rule_DOUBLEContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(826);
                _errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
                    setState(821);
                    rule_INTEGER();
				}
				break;
			case 2:
				{
                    setState(822);
                    rule_STRING();
				}
				break;
			case 3:
				{
                    setState(823);
                    rule_BOOLEAN();
				}
				break;
			case 4:
				{
                    setState(824);
                    rule_FLOAT();
				}
				break;
			case 5:
				{
                    setState(825);
                    rule_DOUBLE();
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
	public static class Rule_STRINGContext extends ParserRuleContext {
		public Rule_STRINGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_STRING; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterRule_STRING(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitRule_STRING(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitRule_STRING(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_STRINGContext rule_STRING() throws RecognitionException {
		Rule_STRINGContext _localctx = new Rule_STRINGContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_rule_STRING);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(848);
                _errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				{
                    setState(828);
                    match(T__35);
                    setState(834);
                    _errHandler.sync(this);
				_la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -68719476738L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 63L) != 0)) {
                        {
                            setState(832);
                            _errHandler.sync(this);
                            switch (_input.LA(1)) {
                                case T__36: {
                                    setState(829);
                                    match(T__36);
                                    setState(830);
                                    matchWildcard();
						}
						break;
					case T__0:
					case T__1:
					case T__2:
					case T__3:
					case T__4:
					case T__5:
					case T__6:
					case T__7:
					case T__8:
					case T__9:
					case T__10:
					case T__11:
					case T__12:
					case T__13:
					case T__14:
					case T__15:
					case T__16:
					case T__17:
					case T__18:
					case T__19:
					case T__20:
					case T__21:
					case T__22:
					case T__23:
					case T__24:
					case T__25:
					case T__26:
					case T__27:
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case T__33:
					case T__34:
					case T__37:
					case T__38:
					case T__39:
					case T__40:
					case T__41:
					case T__42:
					case T__43:
					case T__44:
					case T__45:
					case T__46:
					case T__47:
					case T__48:
					case T__49:
					case T__50:
					case T__51:
					case T__52:
					case T__53:
					case T__54:
					case T__55:
					case T__56:
					case T__57:
					case T__58:
					case T__59:
					case T__60:
					case T__61:
					case T__62:
					case T__63:
					case T__64:
					case T__65:
					case T__66:
					case T__67:
					case BoolValue:
					case RULE_DATE:
					case PERCENTAGE:
					case COMMENT_TEXT:
					case PACKAGE:
					case CONTRACT:
					case CONVENTION:
					case PARTY:
					case GROUP:
					case ASSET:
					case INFO:
					case RIGHTINFO:
					case ADDITION:
					case OBLIGATION:
					case RIGHT:
					case SIGNATURE:
					case TERM:
					case BIND:
					case CLAUSE:
					case BREACH:
					case PRINT:
					case COLON:
					case SPOT:
					case CAN:
					case CANNOT:
					case MUST:
					case WHEN:
					case WHILE:
					case WHERE:
					case ALL:
					case SOME:
					case THIS:
					case DID:
					case GRANT:
					case DEPOSIT:
					case WITHDRAW:
					case TRANSFER:
					case NOT:
					case OR:
					case AND:
					case FALSE:
					case TRUE:
					case FOR:
					case AFTER:
					case BEFORE:
					case BELONG:
					case WITHIN:
					case OF:
					case IMPLEMENT:
					case DECLARATION:
					case DETAILS:
					case CONSTRAINT_BY:
					case INCLUDING:
					case UNDER:
					case INDEX:
					case CHINESE:
					case WS:
					case RULE_STRING:
					case NUMBER:
					case IDENTIFIER:
					case NOTE:
					case PUNCTUATION:
					case ESC:
					case ANY:
					case THE:
						{
                            setState(831);
                            _la = _input.LA(1);
						if ( _la <= 0 || (_la==T__35 || _la==T__36) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
                        setState(836);
                        _errHandler.sync(this);
					_la = _input.LA(1);
				}
                    setState(837);
                    match(T__35);
				}
				break;
			case T__37:
				{
                    setState(838);
                    match(T__37);
                    setState(844);
                    _errHandler.sync(this);
				_la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -274877906946L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 63L) != 0)) {
                        {
                            setState(842);
                            _errHandler.sync(this);
                            switch (_input.LA(1)) {
                                case T__36: {
                                    setState(839);
                                    match(T__36);
                                    setState(840);
                                    matchWildcard();
						}
						break;
					case T__0:
					case T__1:
					case T__2:
					case T__3:
					case T__4:
					case T__5:
					case T__6:
					case T__7:
					case T__8:
					case T__9:
					case T__10:
					case T__11:
					case T__12:
					case T__13:
					case T__14:
					case T__15:
					case T__16:
					case T__17:
					case T__18:
					case T__19:
					case T__20:
					case T__21:
					case T__22:
					case T__23:
					case T__24:
					case T__25:
					case T__26:
					case T__27:
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case T__33:
					case T__34:
					case T__35:
					case T__38:
					case T__39:
					case T__40:
					case T__41:
					case T__42:
					case T__43:
					case T__44:
					case T__45:
					case T__46:
					case T__47:
					case T__48:
					case T__49:
					case T__50:
					case T__51:
					case T__52:
					case T__53:
					case T__54:
					case T__55:
					case T__56:
					case T__57:
					case T__58:
					case T__59:
					case T__60:
					case T__61:
					case T__62:
					case T__63:
					case T__64:
					case T__65:
					case T__66:
					case T__67:
					case BoolValue:
					case RULE_DATE:
					case PERCENTAGE:
					case COMMENT_TEXT:
					case PACKAGE:
					case CONTRACT:
					case CONVENTION:
					case PARTY:
					case GROUP:
					case ASSET:
					case INFO:
					case RIGHTINFO:
					case ADDITION:
					case OBLIGATION:
					case RIGHT:
					case SIGNATURE:
					case TERM:
					case BIND:
					case CLAUSE:
					case BREACH:
					case PRINT:
					case COLON:
					case SPOT:
					case CAN:
					case CANNOT:
					case MUST:
					case WHEN:
					case WHILE:
					case WHERE:
					case ALL:
					case SOME:
					case THIS:
					case DID:
					case GRANT:
					case DEPOSIT:
					case WITHDRAW:
					case TRANSFER:
					case NOT:
					case OR:
					case AND:
					case FALSE:
					case TRUE:
					case FOR:
					case AFTER:
					case BEFORE:
					case BELONG:
					case WITHIN:
					case OF:
					case IMPLEMENT:
					case DECLARATION:
					case DETAILS:
					case CONSTRAINT_BY:
					case INCLUDING:
					case UNDER:
					case INDEX:
					case CHINESE:
					case WS:
					case RULE_STRING:
					case NUMBER:
					case IDENTIFIER:
					case NOTE:
					case PUNCTUATION:
					case ESC:
					case ANY:
					case THE:
						{
                            setState(841);
                            _la = _input.LA(1);
						if ( _la <= 0 || (_la==T__36 || _la==T__37) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
                        setState(846);
                        _errHandler.sync(this);
					_la = _input.LA(1);
				}
                    setState(847);
                    match(T__37);
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
	public static class Rule_BOOLEANContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SpescParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SpescParser.FALSE, 0); }
		public Rule_BOOLEANContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_BOOLEAN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterRule_BOOLEAN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitRule_BOOLEAN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitRule_BOOLEAN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_BOOLEANContext rule_BOOLEAN() throws RecognitionException {
		Rule_BOOLEANContext _localctx = new Rule_BOOLEANContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_rule_BOOLEAN);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(850);
                _la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class Rule_INTEGERContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SpescParser.NUMBER, 0); }
		public Rule_INTEGERContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_INTEGER; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterRule_INTEGER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitRule_INTEGER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitRule_INTEGER(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_INTEGERContext rule_INTEGER() throws RecognitionException {
		Rule_INTEGERContext _localctx = new Rule_INTEGERContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_rule_INTEGER);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(852);
                match(NUMBER);
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
	public static class Rule_FLOATContext extends ParserRuleContext {
		public List<Rule_INTEGERContext> rule_INTEGER() {
			return getRuleContexts(Rule_INTEGERContext.class);
		}
		public Rule_INTEGERContext rule_INTEGER(int i) {
			return getRuleContext(Rule_INTEGERContext.class,i);
		}
		public TerminalNode SPOT() { return getToken(SpescParser.SPOT, 0); }
		public Rule_FLOATContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_FLOAT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterRule_FLOAT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitRule_FLOAT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitRule_FLOAT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_FLOATContext rule_FLOAT() throws RecognitionException {
		Rule_FLOATContext _localctx = new Rule_FLOATContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_rule_FLOAT);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(855);
                _errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30 || _la==T__31) {
				{
                    setState(854);
                    _la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__31) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

                setState(864);
                _errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
                    setState(857);
                    rule_INTEGER();
                    setState(858);
                    match(SPOT);
                    setState(860);
                    _errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
                        setState(859);
                        rule_INTEGER();
					}
				}

				}
				break;
			case SPOT:
				{
                    setState(862);
                    match(SPOT);
                    setState(863);
                    rule_INTEGER();
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
	public static class Rule_DOUBLEContext extends ParserRuleContext {
		public List<Rule_INTEGERContext> rule_INTEGER() {
			return getRuleContexts(Rule_INTEGERContext.class);
		}
		public Rule_INTEGERContext rule_INTEGER(int i) {
			return getRuleContext(Rule_INTEGERContext.class,i);
		}
		public TerminalNode SPOT() { return getToken(SpescParser.SPOT, 0); }
		public Rule_DOUBLEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_DOUBLE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterRule_DOUBLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitRule_DOUBLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitRule_DOUBLE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_DOUBLEContext rule_DOUBLE() throws RecognitionException {
		Rule_DOUBLEContext _localctx = new Rule_DOUBLEContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_rule_DOUBLE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(867);
                _errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30 || _la==T__31) {
				{
                    setState(866);
                    _la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__31) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

                setState(876);
                _errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
                    setState(869);
                    rule_INTEGER();
                    setState(870);
                    match(SPOT);
                    setState(872);
                    _errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
                        setState(871);
                        rule_INTEGER();
					}
				}

				}
				break;
			case SPOT:
				{
                    setState(874);
                    match(SPOT);
                    setState(875);
                    rule_INTEGER();
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
	public static class VariableReferenceContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SpescParser.IDENTIFIER, 0); }
		public OfOperatorContext ofOperator() {
			return getRuleContext(OfOperatorContext.class,0);
		}
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(878);
                match(IDENTIFIER);
                setState(882);
                _errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
                    setState(879);
                    ofOperator();
                    setState(880);
                    variableReference();
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
	public static class ExpressionsContext extends ParserRuleContext {
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }

		public ExpressionsContext() { }
		public void copyFrom(ExpressionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueExprContext extends ExpressionsContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueExprContext(ExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitValueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ADDContext extends ExpressionsContext {
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public ADDContext(ExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterADD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitADD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitADD(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarReferenceContext extends ExpressionsContext {
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public VarReferenceContext(ExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterVarReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitVarReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitVarReference(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SUBSTRACTContext extends ExpressionsContext {
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public SUBSTRACTContext(ExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterSUBSTRACT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitSUBSTRACT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitSUBSTRACT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MULTIPLYContext extends ExpressionsContext {
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public MULTIPLYContext(ExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterMULTIPLY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitMULTIPLY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitMULTIPLY(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DIVIDEContext extends ExpressionsContext {
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public DIVIDEContext(ExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterDIVIDE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitDIVIDE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitDIVIDE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		return expressions(0);
	}

	private ExpressionsContext expressions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, _parentState);
		ExpressionsContext _prevctx = _localctx;
		int _startState = 156;
		enterRecursionRule(_localctx, 156, RULE_expressions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(911);
                _errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				_localctx = new VarReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

                    setState(885);
                    variableReference();
				}
				break;
			case 2:
				{
				_localctx = new ValueExprContext(_localctx);
				_ctx = _localctx;
                    _prevctx = _localctx;
                    setState(886);
                    value();
				}
				break;
			case 3:
				{
				_localctx = new MULTIPLYContext(_localctx);
				_ctx = _localctx;
                    _prevctx = _localctx;
                    setState(887);
                    match(T__14);
                    setState(888);
                    expressions(0);
                    setState(889);
                    match(T__33);
                    setState(890);
                    expressions(0);
                    setState(891);
                    match(T__15);
				}
				break;
			case 4:
				{
				_localctx = new DIVIDEContext(_localctx);
				_ctx = _localctx;
                    _prevctx = _localctx;
                    setState(893);
                    match(T__14);
                    setState(894);
                    expressions(0);
                    setState(895);
                    match(T__34);
                    setState(896);
                    expressions(0);
                    setState(897);
                    match(T__15);
				}
				break;
			case 5:
				{
				_localctx = new ADDContext(_localctx);
				_ctx = _localctx;
                    _prevctx = _localctx;
                    setState(899);
                    match(T__14);
                    setState(900);
                    expressions(0);
                    setState(901);
                    match(T__30);
                    setState(902);
                    expressions(0);
                    setState(903);
                    match(T__15);
				}
				break;
			case 6:
				{
				_localctx = new SUBSTRACTContext(_localctx);
				_ctx = _localctx;
                    _prevctx = _localctx;
                    setState(905);
                    match(T__14);
                    setState(906);
                    expressions(0);
                    setState(907);
                    match(T__31);
                    setState(908);
                    expressions(0);
                    setState(909);
                    match(T__15);
				}
				break;
			}
                _ctx.stop = _input.LT(-1);
                setState(927);
                _errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
                        setState(925);
                        _errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
					case 1:
						{
						_localctx = new MULTIPLYContext(new ExpressionsContext(_parentctx, _parentState));
                            pushNewRecursionContext(_localctx, _startState, RULE_expressions);
                            setState(913);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                            setState(914);
                            match(T__33);
                            setState(915);
                            expressions(8);
						}
						break;
					case 2:
						{
						_localctx = new DIVIDEContext(new ExpressionsContext(_parentctx, _parentState));
                            pushNewRecursionContext(_localctx, _startState, RULE_expressions);
                            setState(916);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                            setState(917);
                            match(T__34);
                            setState(918);
                            expressions(6);
						}
						break;
					case 3:
						{
						_localctx = new ADDContext(new ExpressionsContext(_parentctx, _parentState));
                            pushNewRecursionContext(_localctx, _startState, RULE_expressions);
                            setState(919);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                            setState(920);
                            match(T__30);
                            setState(921);
                            expressions(4);
						}
						break;
					case 4:
						{
						_localctx = new SUBSTRACTContext(new ExpressionsContext(_parentctx, _parentState));
                            pushNewRecursionContext(_localctx, _startState, RULE_expressions);
                            setState(922);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                            setState(923);
                            match(T__31);
                            setState(924);
                            expressions(2);
						}
						break;
					}
					}
				}
                setState(929);
                _errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationOperatorContext extends ParserRuleContext {
		public Token op;
		public RelationOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterRelationOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitRelationOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitRelationOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationOperatorContext relationOperator() throws RecognitionException {
		RelationOperatorContext _localctx = new RelationOperatorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_relationOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(938);
                _errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
                    setState(930);
                    ((RelationOperatorContext) _localctx).op = match(T__6);
				}
				break;
			case T__32:
				{
                    setState(931);
                    ((RelationOperatorContext) _localctx).op = match(T__32);
				}
				break;
			case T__38:
				{
                    setState(932);
                    ((RelationOperatorContext) _localctx).op = match(T__38);
				}
				break;
			case T__39:
				{
                    setState(933);
                    ((RelationOperatorContext) _localctx).op = match(T__39);
				}
				break;
			case T__40:
				{
                    setState(934);
                    ((RelationOperatorContext) _localctx).op = match(T__40);
				}
				break;
			case T__41:
				{
                    setState(935);
                    ((RelationOperatorContext) _localctx).op = match(T__41);
				}
				break;
			case T__42:
				{
                    setState(936);
                    ((RelationOperatorContext) _localctx).op = match(T__42);
				}
				break;
			case T__20:
				{
                    setState(937);
                    ((RelationOperatorContext) _localctx).op = match(T__20);
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
	public static class OfOperatorContext extends ParserRuleContext {
		public Token op;
		public OfOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ofOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterOfOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitOfOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitOfOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OfOperatorContext ofOperator() throws RecognitionException {
		OfOperatorContext _localctx = new OfOperatorContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_ofOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
                setState(940);
                ((OfOperatorContext) _localctx).op = match(T__43);
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
	public static class TransferOperationContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(SpescParser.GRANT, 0); }
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SpescParser.IDENTIFIER, 0); }
		public TerminalNode DEPOSIT() { return getToken(SpescParser.DEPOSIT, 0); }
		public MoneyExpressionContext moneyExpression() {
			return getRuleContext(MoneyExpressionContext.class,0);
		}
		public AssetExpressionContext assetExpression() {
			return getRuleContext(AssetExpressionContext.class,0);
		}
		public TerminalNode WITHDRAW() { return getToken(SpescParser.WITHDRAW, 0); }
		public TerminalNode TRANSFER() { return getToken(SpescParser.TRANSFER, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TransferOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transferOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterTransferOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitTransferOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitTransferOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransferOperationContext transferOperation() throws RecognitionException {
		TransferOperationContext _localctx = new TransferOperationContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_transferOperation);
		try {
            setState(965);
            _errHandler.sync(this);
			switch (_input.LA(1)) {
			case GRANT:
				enterOuterAlt(_localctx, 1);
				{
                    setState(942);
                    match(GRANT);
                    setState(943);
                    variableReference();
                    setState(944);
                    match(T__44);
                    setState(945);
                    match(IDENTIFIER);
				}
				break;
			case DEPOSIT:
				enterOuterAlt(_localctx, 2);
				{
                    setState(947);
                    match(DEPOSIT);
                    setState(950);
                    _errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
                        setState(948);
                        moneyExpression();
					}
					break;
				case 2:
					{
                        setState(949);
                        assetExpression();
					}
					break;
				}
				}
				break;
			case WITHDRAW:
				enterOuterAlt(_localctx, 3);
				{
                    setState(952);
                    match(WITHDRAW);
                    setState(955);
                    _errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
                        setState(953);
                        moneyExpression();
					}
					break;
				case 2:
					{
                        setState(954);
                        assetExpression();
					}
					break;
				}
				}
				break;
			case TRANSFER:
				enterOuterAlt(_localctx, 4);
				{
                    setState(957);
                    match(TRANSFER);
                    setState(960);
                    _errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
                        setState(958);
                        moneyExpression();
					}
					break;
				case 2:
					{
                        setState(959);
                        assetExpression();
					}
					break;
				}
                    setState(962);
                    match(T__44);
                    setState(963);
                    name();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MoneyExpressionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SpescParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SpescParser.IDENTIFIER, i);
		}
		public RelationOperatorContext relationOperator() {
			return getRuleContext(RelationOperatorContext.class,0);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public MoneyExpressionContext moneyExpression() {
			return getRuleContext(MoneyExpressionContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public MoneyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moneyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterMoneyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitMoneyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitMoneyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoneyExpressionContext moneyExpression() throws RecognitionException {
		MoneyExpressionContext _localctx = new MoneyExpressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_moneyExpression);
		int _la;
		try {
            setState(987);
            _errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
                    setState(968);
                    _errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__45) {
					{
                        setState(967);
                        match(T__45);
                    }
                }

                    setState(971);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == T__46) {
                        {
                            setState(970);
                            match(T__46);
                        }
                    }

                    setState(974);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == IDENTIFIER) {
                        {
                            setState(973);
                            match(IDENTIFIER);
                        }
                    }

                    setState(979);
                    _errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17051022262400L) != 0)) {
					{
                        setState(976);
                        relationOperator();
                        setState(977);
                        match(IDENTIFIER);
					}
				}

                    setState(984);
                    _errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR || _la==AND) {
					{
                        setState(981);
                        logicalOperator();
                        setState(982);
                        moneyExpression();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(986);
                    expressions(0);
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
	public static class AssetExpressionContext extends ParserRuleContext {
		public TerminalNode OF() { return getToken(SpescParser.OF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SpescParser.IDENTIFIER, 0); }
		public TerminalNode PERCENTAGE() { return getToken(SpescParser.PERCENTAGE, 0); }
		public Rule_FLOATContext rule_FLOAT() {
			return getRuleContext(Rule_FLOATContext.class,0);
		}
		public Rule_DOUBLEContext rule_DOUBLE() {
			return getRuleContext(Rule_DOUBLEContext.class,0);
		}
		public AssetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assetExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterAssetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitAssetExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitAssetExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssetExpressionContext assetExpression() throws RecognitionException {
		AssetExpressionContext _localctx = new AssetExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_assetExpression);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(989);
                match(T__45);
                setState(993);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 110, _ctx)) {
                    case 1: {
                        setState(990);
                        match(PERCENTAGE);
                    }
                    break;
                    case 2: {
                        setState(991);
                        rule_FLOAT();
				}
				break;
			case 3:
				{
                    setState(992);
                    rule_DOUBLE();
				}
				break;
			}
                setState(995);
                match(OF);
                setState(996);
                match(IDENTIFIER);
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
	public static class ClauseContext extends ParserRuleContext {
		public BindClauseContext bindClause() {
			return getRuleContext(BindClauseContext.class,0);
		}
		public GeneralClauseContext generalClause() {
			return getRuleContext(GeneralClauseContext.class,0);
		}
		public BreachClauseContext breachClause() {
			return getRuleContext(BreachClauseContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1001);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_TEXT) {
				{
				{
                    setState(998);
                    comment();
				}
				}
                setState(1003);
                _errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(1007);
                _errHandler.sync(this);
			switch (_input.LA(1)) {
			case BIND:
				{
                    setState(1004);
                    bindClause();
				}
				break;
			case CLAUSE:
				{
                    setState(1005);
                    generalClause();
				}
				break;
			case BREACH:
				{
                    setState(1006);
                    breachClause();
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
	public static class BindClauseContext extends ParserRuleContext {
		public TerminalNode BIND() { return getToken(SpescParser.BIND, 0); }
		public TerminalNode CLAUSE() { return getToken(SpescParser.CLAUSE, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SpescParser.COLON, 0); }
		public List<ChildExpressionContext> childExpression() {
			return getRuleContexts(ChildExpressionContext.class);
		}
		public ChildExpressionContext childExpression(int i) {
			return getRuleContext(ChildExpressionContext.class,i);
		}
		public List<FactorBindContext> factorBind() {
			return getRuleContexts(FactorBindContext.class);
		}
		public FactorBindContext factorBind(int i) {
			return getRuleContext(FactorBindContext.class,i);
		}
		public BindClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterBindClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitBindClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitBindClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindClauseContext bindClause() throws RecognitionException {
		BindClauseContext _localctx = new BindClauseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_bindClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(1009);
                match(BIND);
                setState(1010);
                match(CLAUSE);
                setState(1011);
                index();
                setState(1012);
                match(COLON);
                setState(1016);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 113, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1013);
                                childExpression();
                            }
                        }
				}
                    setState(1018);
                    _errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			}
                setState(1022);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
                    setState(1019);
                    factorBind();
				}
				}
                setState(1024);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorBindContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Lo_typeContext lo_type() {
			return getRuleContext(Lo_typeContext.class,0);
		}
		public ItemLimitationContext itemLimitation() {
			return getRuleContext(ItemLimitationContext.class,0);
		}
		public FactorBindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorBind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterFactorBind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitFactorBind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitFactorBind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorBindContext factorBind() throws RecognitionException {
		FactorBindContext _localctx = new FactorBindContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_factorBind);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1025);
                factor();
                setState(1026);
                lo_type();
                setState(1027);
                itemLimitation();
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
	public static class Lo_typeContext extends ParserRuleContext {
		public Lo_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lo_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterLo_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitLo_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitLo_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lo_typeContext lo_type() throws RecognitionException {
		Lo_typeContext _localctx = new Lo_typeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_lo_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1029);
                _la = _input.LA(1);
			if ( !(_la==T__47 || _la==T__48) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class FactorContext extends ParserRuleContext {
		public PartyNameContext partyName() {
			return getRuleContext(PartyNameContext.class,0);
		}
		public AssetNameContext assetName() {
			return getRuleContext(AssetNameContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_factor);
		try {
            setState(1033);
            _errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(1031);
                    partyName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(1032);
                    assetName();
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
	public static class ItemLimitationContext extends ParserRuleContext {
		public ItemLimitationNameContext itemLimitationName() {
			return getRuleContext(ItemLimitationNameContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SpescParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SpescParser.IDENTIFIER, i);
		}
		public ItemLimitationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemLimitation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterItemLimitation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitItemLimitation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitItemLimitation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemLimitationContext itemLimitation() throws RecognitionException {
		ItemLimitationContext _localctx = new ItemLimitationContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_itemLimitation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1035);
                itemLimitationName();
                setState(1036);
                match(T__6);
                setState(1037);
                match(T__49);
                setState(1038);
                match(IDENTIFIER);
                setState(1043);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
                    setState(1039);
                    match(T__0);
                    setState(1040);
                    match(IDENTIFIER);
				}
				}
                setState(1045);
                _errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(1046);
                match(T__50);
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
	public static class ItemLimitationNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SpescParser.IDENTIFIER, 0); }
		public ItemLimitationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemLimitationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterItemLimitationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitItemLimitationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitItemLimitationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemLimitationNameContext itemLimitationName() throws RecognitionException {
		ItemLimitationNameContext _localctx = new ItemLimitationNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_itemLimitationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1048);
                match(IDENTIFIER);
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
	public static class GeneralClauseContext extends ParserRuleContext {
		public ClauseDeclarationContext clauseDeclaration() {
			return getRuleContext(ClauseDeclarationContext.class,0);
		}
		public WhenStatementContext whenStatement() {
			return getRuleContext(WhenStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhereStatementContext whereStatement() {
			return getRuleContext(WhereStatementContext.class,0);
		}
		public GeneralClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterGeneralClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitGeneralClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitGeneralClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralClauseContext generalClause() throws RecognitionException {
		GeneralClauseContext _localctx = new GeneralClauseContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_generalClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1050);
                clauseDeclaration();
                setState(1052);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WHEN) {
                    {
                        setState(1051);
                        whenStatement();
                    }
                }

                setState(1055);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WHILE) {
                    {
                        setState(1054);
                        whileStatement();
                    }
                }

                setState(1058);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WHERE) {
                    {
                        setState(1057);
                        whereStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClauseDeclarationContext extends ParserRuleContext {
		public TerminalNode CLAUSE() { return getToken(SpescParser.CLAUSE, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SpescParser.COLON, 0); }
		public PartyNameContext partyName() {
			return getRuleContext(PartyNameContext.class,0);
		}
		public CvDutyContext cvDuty() {
			return getRuleContext(CvDutyContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ClauseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauseDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterClauseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitClauseDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitClauseDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseDeclarationContext clauseDeclaration() throws RecognitionException {
		ClauseDeclarationContext _localctx = new ClauseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_clauseDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1060);
                match(CLAUSE);
                setState(1061);
                index();
                setState(1062);
                match(COLON);
                setState(1063);
                partyName();
                setState(1064);
                cvDuty();
                setState(1065);
                action();
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
	public static class CvDutyContext extends ParserRuleContext {
		public CanExerciseRightContext canExerciseRight() {
			return getRuleContext(CanExerciseRightContext.class,0);
		}
		public MustFulfilObligationContext mustFulfilObligation() {
			return getRuleContext(MustFulfilObligationContext.class,0);
		}
		public TerminalNode CANNOT() { return getToken(SpescParser.CANNOT, 0); }
		public CvDutyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvDuty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterCvDuty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitCvDuty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitCvDuty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvDutyContext cvDuty() throws RecognitionException {
		CvDutyContext _localctx = new CvDutyContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_cvDuty);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1070);
                _errHandler.sync(this);
			switch (_input.LA(1)) {
                case CAN:
				{
                    setState(1067);
                    canExerciseRight();
				}
				break;
                case MUST:
				{
                    setState(1068);
                    mustFulfilObligation();
				}
				break;
			case CANNOT:
				{
                    setState(1069);
                    match(CANNOT);
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
	public static class MustFulfilObligationContext extends ParserRuleContext {
        public TerminalNode MUST() {
            return getToken(SpescParser.MUST, 0);
        }

        public TerminalNode OBLIGATION() {
            return getToken(SpescParser.OBLIGATION, 0);
        }
		public MustFulfilObligationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mustFulfilObligation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterMustFulfilObligation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitMustFulfilObligation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitMustFulfilObligation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MustFulfilObligationContext mustFulfilObligation() throws RecognitionException {
		MustFulfilObligationContext _localctx = new MustFulfilObligationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_mustFulfilObligation);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1072);
                match(MUST);
                setState(1073);
                match(T__51);
                setState(1074);
                match(OBLIGATION);
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
	public static class CanExerciseRightContext extends ParserRuleContext {
        public TerminalNode CAN() {
            return getToken(SpescParser.CAN, 0);
        }

        public TerminalNode RIGHT() {
            return getToken(SpescParser.RIGHT, 0);
        }
		public CanExerciseRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canExerciseRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterCanExerciseRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitCanExerciseRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitCanExerciseRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CanExerciseRightContext canExerciseRight() throws RecognitionException {
		CanExerciseRightContext _localctx = new CanExerciseRightContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_canExerciseRight);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1076);
                match(CAN);
                setState(1077);
                match(T__52);
                setState(1078);
                match(RIGHT);
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
	public static class BreachClauseContext extends ParserRuleContext {
		public BreachClauseDeclarationContext breachClauseDeclaration() {
			return getRuleContext(BreachClauseDeclarationContext.class,0);
		}
		public WhenStatementContext whenStatement() {
			return getRuleContext(WhenStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhereStatementContext whereStatement() {
			return getRuleContext(WhereStatementContext.class,0);
		}
		public BreachClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breachClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterBreachClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitBreachClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitBreachClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreachClauseContext breachClause() throws RecognitionException {
		BreachClauseContext _localctx = new BreachClauseContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_breachClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1080);
                breachClauseDeclaration();
                setState(1082);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WHEN) {
                    {
                        setState(1081);
                        whenStatement();
                    }
                }

                setState(1085);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WHILE) {
                    {
                        setState(1084);
                        whileStatement();
                    }
                }

                setState(1088);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WHERE) {
                    {
                        setState(1087);
                        whereStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreachClauseDeclarationContext extends ParserRuleContext {
		public TerminalNode BREACH() { return getToken(SpescParser.BREACH, 0); }
		public TerminalNode CLAUSE() { return getToken(SpescParser.CLAUSE, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SpescParser.COLON, 0); }
		public PartyNameContext partyName() {
			return getRuleContext(PartyNameContext.class,0);
		}
		public CvDutyContext cvDuty() {
			return getRuleContext(CvDutyContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public AgainstDeclarationContext againstDeclaration() {
			return getRuleContext(AgainstDeclarationContext.class,0);
		}
		public BreachClauseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breachClauseDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterBreachClauseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitBreachClauseDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitBreachClauseDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreachClauseDeclarationContext breachClauseDeclaration() throws RecognitionException {
		BreachClauseDeclarationContext _localctx = new BreachClauseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_breachClauseDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1090);
                match(BREACH);
                setState(1091);
                match(CLAUSE);
                setState(1092);
                index();
                setState(1094);
                _errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
                    setState(1093);
                    againstDeclaration();
				}
			}

                setState(1096);
                match(COLON);
                setState(1097);
                partyName();
                setState(1098);
                cvDuty();
                setState(1099);
                action();
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
	public static class LegalRightContext extends ParserRuleContext {
		public LegalRightDeclarationContext legalRightDeclaration() {
			return getRuleContext(LegalRightDeclarationContext.class,0);
		}
		public RightContentContext rightContent() {
			return getRuleContext(RightContentContext.class,0);
		}
		public LegalRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_legalRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterLegalRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitLegalRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitLegalRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LegalRightContext legalRight() throws RecognitionException {
		LegalRightContext _localctx = new LegalRightContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_legalRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1101);
                legalRightDeclaration();
                setState(1102);
                rightContent();
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
	public static class LegalRightDeclarationContext extends ParserRuleContext {
		public RightOfContext rightOf() {
			return getRuleContext(RightOfContext.class,0);
		}
		public RightNameContext rightName() {
			return getRuleContext(RightNameContext.class,0);
		}
		public TerminalNode UNDER() { return getToken(SpescParser.UNDER, 0); }
		public TerminalNode COLON() { return getToken(SpescParser.COLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SpescParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SpescParser.IDENTIFIER, i);
		}
		public LegalRightDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_legalRightDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterLegalRightDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitLegalRightDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitLegalRightDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LegalRightDeclarationContext legalRightDeclaration() throws RecognitionException {
		LegalRightDeclarationContext _localctx = new LegalRightDeclarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_legalRightDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1104);
                rightOf();
                setState(1105);
                rightName();
                setState(1106);
                match(UNDER);
                setState(1108);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(1107);
                            match(IDENTIFIER);
                        }
                    }
                    setState(1110);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ( _la==IDENTIFIER );
                setState(1112);
                match(COLON);
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
	public static class RightContentContext extends ParserRuleContext {
		public RightSubjectContext rightSubject() {
			return getRuleContext(RightSubjectContext.class,0);
		}
		public RightObjectContext rightObject() {
			return getRuleContext(RightObjectContext.class,0);
		}
		public LawSourceContext lawSource() {
			return getRuleContext(LawSourceContext.class,0);
		}
		public RightContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterRightContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitRightContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitRightContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightContentContext rightContent() throws RecognitionException {
		RightContentContext _localctx = new RightContentContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_rightContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1114);
                rightSubject();
                setState(1115);
                rightObject();
                setState(1116);
                lawSource();
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
    public static class RightSubjectContext extends ParserRuleContext {
        public PartyNameContext partyName() {
            return getRuleContext(PartyNameContext.class, 0);
        }

        public PossessTheRightContext possessTheRight() {
            return getRuleContext(PossessTheRightContext.class, 0);
        }

        public TerminalNode INCLUDING() {
            return getToken(SpescParser.INCLUDING, 0);
        }

        public List<IncludingRightNameContext> includingRightName() {
            return getRuleContexts(IncludingRightNameContext.class);
        }

        public IncludingRightNameContext includingRightName(int i) {
            return getRuleContext(IncludingRightNameContext.class, i);
        }

        public RightSubjectContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rightSubject;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SpescListener) ((SpescListener) listener).enterRightSubject(this);
        }

        @Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitRightSubject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitRightSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightSubjectContext rightSubject() throws RecognitionException {
		RightSubjectContext _localctx = new RightSubjectContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_rightSubject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1118);
                partyName();
                setState(1119);
                possessTheRight();
                setState(1132);
                _errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCLUDING) {
                {
                    setState(1120);
                    match(INCLUDING);
                    setState(1121);
                    match(T__49);
                    setState(1122);
                    includingRightName();
                    setState(1127);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__0) {
                        {
                            {
                                setState(1123);
                                match(T__0);
                                setState(1124);
                                includingRightName();
                            }
					}
                        setState(1129);
                        _errHandler.sync(this);
					_la = _input.LA(1);
				}
                    setState(1130);
                    match(T__50);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PossessTheRightContext extends ParserRuleContext {
		public TerminalNode RIGHT() { return getToken(SpescParser.RIGHT, 0); }
		public PossessTheRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_possessTheRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterPossessTheRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitPossessTheRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitPossessTheRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PossessTheRightContext possessTheRight() throws RecognitionException {
		PossessTheRightContext _localctx = new PossessTheRightContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_possessTheRight);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1134);
                match(T__53);
                setState(1135);
                match(T__54);
                setState(1136);
                match(RIGHT);
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
    public static class RightObjectContext extends ParserRuleContext {
        public OnTheObjectContext onTheObject() {
            return getRuleContext(OnTheObjectContext.class, 0);
        }

        public TerminalNode INCLUDING() {
            return getToken(SpescParser.INCLUDING, 0);
        }

        public List<RightObjectNameContext> rightObjectName() {
            return getRuleContexts(RightObjectNameContext.class);
        }

        public RightObjectNameContext rightObjectName(int i) {
            return getRuleContext(RightObjectNameContext.class, i);
        }

        public RightObjectContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rightObject;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SpescListener) ((SpescListener) listener).enterRightObject(this);
        }

        @Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitRightObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitRightObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightObjectContext rightObject() throws RecognitionException {
		RightObjectContext _localctx = new RightObjectContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_rightObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1138);
                onTheObject();
                setState(1139);
                match(INCLUDING);
                setState(1140);
                match(T__49);
                setState(1141);
                rightObjectName();
                setState(1146);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__0) {
                    {
                        {
                            setState(1142);
                            match(T__0);
                            setState(1143);
                            rightObjectName();
                        }
				}
                    setState(1148);
                    _errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(1149);
                match(T__50);
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
	public static class OnTheObjectContext extends ParserRuleContext {
		public OnTheObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onTheObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterOnTheObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitOnTheObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitOnTheObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnTheObjectContext onTheObject() throws RecognitionException {
		OnTheObjectContext _localctx = new OnTheObjectContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_onTheObject);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1151);
                match(T__55);
                setState(1152);
                match(T__54);
                setState(1153);
                match(T__56);
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
	public static class LawSourceContext extends ParserRuleContext {
		public AccordToContext accordTo() {
			return getRuleContext(AccordToContext.class,0);
		}
		public List<LawNameContext> lawName() {
			return getRuleContexts(LawNameContext.class);
		}
		public LawNameContext lawName(int i) {
			return getRuleContext(LawNameContext.class,i);
		}
		public LawSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lawSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterLawSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitLawSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitLawSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LawSourceContext lawSource() throws RecognitionException {
		LawSourceContext _localctx = new LawSourceContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_lawSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1155);
                accordTo();
                setState(1156);
                match(T__49);
                setState(1157);
                lawName();
                setState(1162);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
                    setState(1158);
                    match(T__0);
                    setState(1159);
                    lawName();
				}
				}
                setState(1164);
                _errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(1165);
                match(T__50);
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
	public static class AccordToContext extends ParserRuleContext {
		public AccordToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accordTo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterAccordTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitAccordTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitAccordTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccordToContext accordTo() throws RecognitionException {
		AccordToContext _localctx = new AccordToContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_accordTo);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1167);
                match(T__57);
                setState(1168);
                match(T__44);
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
	public static class RightOfContext extends ParserRuleContext {
		public TerminalNode OF() { return getToken(SpescParser.OF, 0); }
		public RightOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterRightOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitRightOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitRightOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightOfContext rightOf() throws RecognitionException {
		RightOfContext _localctx = new RightOfContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_rightOf);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1170);
                match(T__58);
                setState(1171);
                match(OF);
            }
		} catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IncludingRightNameContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(SpescParser.IDENTIFIER, 0);
        }

        public IncludingRightNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_includingRightName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SpescListener) ((SpescListener) listener).enterIncludingRightName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SpescListener) ((SpescListener) listener).exitIncludingRightName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SpescVisitor)
                return ((SpescVisitor<? extends T>) visitor).visitIncludingRightName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IncludingRightNameContext includingRightName() throws RecognitionException {
        IncludingRightNameContext _localctx = new IncludingRightNameContext(_ctx, getState());
        enterRule(_localctx, 216, RULE_includingRightName);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1173);
                match(IDENTIFIER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RightNameContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(SpescParser.IDENTIFIER, 0);
        }

        public RightNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rightName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterRightName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitRightName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitRightName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightNameContext rightName() throws RecognitionException {
		RightNameContext _localctx = new RightNameContext(_ctx, getState());
        enterRule(_localctx, 218, RULE_rightName);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1175);
                match(IDENTIFIER);
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
	public static class LawNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SpescParser.IDENTIFIER, 0); }
		public LawNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lawName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterLawName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitLawName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitLawName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LawNameContext lawName() throws RecognitionException {
        LawNameContext _localctx = new LawNameContext(_ctx, getState());
        enterRule(_localctx, 220, RULE_lawName);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1177);
                match(IDENTIFIER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RightObjectNameContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(SpescParser.IDENTIFIER, 0);
        }

        public RightObjectNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rightObjectName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SpescListener) ((SpescListener) listener).enterRightObjectName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SpescListener) ((SpescListener) listener).exitRightObjectName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SpescVisitor)
                return ((SpescVisitor<? extends T>) visitor).visitRightObjectName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RightObjectNameContext rightObjectName() throws RecognitionException {
        RightObjectNameContext _localctx = new RightObjectNameContext(_ctx, getState());
        enterRule(_localctx, 222, RULE_rightObjectName);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1179);
                match(IDENTIFIER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImpldeclarationContext extends ParserRuleContext {
		public TerminalNode IMPLEMENT() { return getToken(SpescParser.IMPLEMENT, 0); }
		public TerminalNode DECLARATION() { return getToken(SpescParser.DECLARATION, 0); }
		public List<TerminalNode> COLON() { return getTokens(SpescParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SpescParser.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> RULE_DATE() { return getTokens(SpescParser.RULE_DATE); }
		public TerminalNode RULE_DATE(int i) {
			return getToken(SpescParser.RULE_DATE, i);
		}
		public ImpldeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impldeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterImpldeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitImpldeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitImpldeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpldeclarationContext impldeclaration() throws RecognitionException {
		ImpldeclarationContext _localctx = new ImpldeclarationContext(_ctx, getState());
        enterRule(_localctx, 224, RULE_impldeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1181);
                match(IMPLEMENT);
                setState(1182);
                match(DECLARATION);
                setState(1183);
                match(T__4);
                setState(1184);
                match(T__59);
                setState(1185);
                match(COLON);
                setState(1192);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & -6917317921140113345L) != 0) || _la == NUMBER || _la == IDENTIFIER) {
                    {
                        setState(1188);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case T__62:
                            case T__63:
                            case T__64:
                            case T__65:
                            case T__66:
                            case T__67: {
                                setState(1186);
                                type();
                            }
                            break;
                            case SPOT:
				case FALSE:
				case TRUE:
				case CHINESE:
				case RULE_STRING:
				case NUMBER:
				case IDENTIFIER:
					{
                        setState(1187);
                        value();
					}
                break;
                            default:
                                throw new NoViableAltException(this);
                        }
                        setState(1190);
                        match(T__0);
                    }
                }

                setState(1194);
                match(T__60);
                setState(1195);
                match(COLON);
                setState(1202);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & -6917317921140113217L) != 0) || _la == NUMBER || _la == IDENTIFIER) {
                    {
                        setState(1199);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case T__62:
                            case T__63:
                            case T__64:
                            case T__65:
                            case T__66:
                            case T__67: {
                                setState(1196);
                                type();
                            }
                            break;
                            case SPOT:
				case FALSE:
				case TRUE:
				case CHINESE:
				case RULE_STRING:
				case NUMBER:
				case IDENTIFIER:
					{
                        setState(1197);
                        value();
					}
					break;
				case RULE_DATE:
					{
                        setState(1198);
                        match(RULE_DATE);
                    }
                break;
                            default:
                                throw new NoViableAltException(this);
                        }
                        setState(1201);
                        match(T__0);
                    }
                }

                setState(1204);
                match(T__61);
                setState(1205);
                match(COLON);
                setState(1209);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case T__62:
                    case T__63:
                    case T__64:
                    case T__65:
                    case T__66:
                    case T__67: {
                        setState(1206);
                        type();
                    }
                    break;
                    case SPOT:
			case FALSE:
			case TRUE:
			case CHINESE:
			case RULE_STRING:
			case NUMBER:
			case IDENTIFIER:
				{
                    setState(1207);
                    value();
				}
				break;
			case RULE_DATE:
				{
                    setState(1208);
                    match(RULE_DATE);
				}
				break;
			case T__5:
				break;
			default:
				break;
			}
                setState(1211);
                match(T__5);
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SpescParser.NUMBER, 0); }
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SpescParser.IDENTIFIER, 0); }
		public TerminalNode RULE_STRING() { return getToken(SpescParser.RULE_STRING, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TerminalNode CHINESE() { return getToken(SpescParser.CHINESE, 0); }
		public TerminalNode TRUE() { return getToken(SpescParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SpescParser.FALSE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
        enterRule(_localctx, 226, RULE_value);
		try {
            setState(1221);
            _errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(1213);
                    match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(1214);
                    decimal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
                    setState(1215);
                    match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
                    setState(1216);
                    match(RULE_STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
                    setState(1217);
                    date();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
                    setState(1218);
                    match(CHINESE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
                    setState(1219);
                    match(TRUE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
                    setState(1220);
                    match(FALSE);
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
	public static class IndexContext extends ParserRuleContext {
		public Token op;
		public TerminalNode NUMBER() { return getToken(SpescParser.NUMBER, 0); }
		public TerminalNode INDEX() { return getToken(SpescParser.INDEX, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
        enterRule(_localctx, 228, RULE_index);
		try {
            setState(1225);
            _errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
                    setState(1223);
                    ((IndexContext) _localctx).op = match(NUMBER);
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 2);
				{
                    setState(1224);
                    ((IndexContext) _localctx).op = match(INDEX);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SpescParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SpescParser.NUMBER, i);
		}
		public TerminalNode SPOT() { return getToken(SpescParser.SPOT, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
        enterRule(_localctx, 230, RULE_decimal);
		try {
            setState(1234);
            _errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(1227);
                    match(NUMBER);
                    setState(1228);
                    match(SPOT);
                    setState(1229);
                    match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(1230);
                    match(SPOT);
                    setState(1231);
                    match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
                    setState(1232);
                    match(NUMBER);
                    setState(1233);
                    match(SPOT);
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
	public static class ArrayContext extends ParserRuleContext {
		public List<JsonObjectContext> jsonObject() {
			return getRuleContexts(JsonObjectContext.class);
		}
		public JsonObjectContext jsonObject(int i) {
			return getRuleContext(JsonObjectContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
        enterRule(_localctx, 232, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1236);
                match(T__49);
                setState(1237);
                jsonObject();
                setState(1242);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
                    setState(1238);
                    match(T__0);
                    setState(1239);
                    jsonObject();
				}
				}
                setState(1244);
                _errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(1245);
                match(T__50);
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
	public static class JsonObjectContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public JsonObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterJsonObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitJsonObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitJsonObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonObjectContext jsonObject() throws RecognitionException {
		JsonObjectContext _localctx = new JsonObjectContext(_ctx, getState());
        enterRule(_localctx, 234, RULE_jsonObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1247);
                match(T__4);
                setState(1248);
                field();
                setState(1253);
                _errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
                    setState(1249);
                    match(T__0);
                    setState(1250);
                    field();
				}
				}
                setState(1255);
                _errHandler.sync(this);
				_la = _input.LA(1);
			}
                setState(1256);
                match(T__5);
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
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT_TEXT() { return getToken(SpescParser.COMMENT_TEXT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
        enterRule(_localctx, 236, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1258);
                match(COMMENT_TEXT);
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
	public static class DateContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SpescParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SpescParser.NUMBER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(SpescParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SpescParser.COLON, i);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
        enterRule(_localctx, 238, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1260);
                match(NUMBER);
                setState(1261);
                match(T__31);
                setState(1262);
                match(NUMBER);
                setState(1263);
                match(T__31);
                setState(1264);
                match(NUMBER);
                setState(1265);
                match(NUMBER);
                setState(1266);
                match(COLON);
                setState(1267);
                match(NUMBER);
                setState(1268);
                match(COLON);
                setState(1269);
                match(NUMBER);
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
	public static class StructContext extends ParserRuleContext {
		public TerminalNode RULE_STRING() { return getToken(SpescParser.RULE_STRING, 0); }
		public TerminalNode NUMBER() { return getToken(SpescParser.NUMBER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StructObjContext structObj() {
			return getRuleContext(StructObjContext.class,0);
		}
		public StructArrContext structArr() {
			return getRuleContext(StructArrContext.class,0);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
        enterRule(_localctx, 240, RULE_struct);
		try {
            setState(1276);
            _errHandler.sync(this);
			switch (_input.LA(1)) {
			case RULE_STRING:
				enterOuterAlt(_localctx, 1);
				{
                    setState(1271);
                    match(RULE_STRING);
                }
            break;
                case NUMBER:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1272);
                    match(NUMBER);
                }
                break;
                case T__62:
                case T__63:
                case T__64:
                case T__65:
                case T__66:
                case T__67:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1273);
                    type();
                }
                break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
                    setState(1274);
                    structObj();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 5);
				{
                    setState(1275);
                    structArr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
        enterRule(_localctx, 242, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1278);
                _la = _input.LA(1);
                if (!(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 63L) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
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
	public static class StructObjContext extends ParserRuleContext {
		public List<KeyPairContext> keyPair() {
			return getRuleContexts(KeyPairContext.class);
		}
		public KeyPairContext keyPair(int i) {
			return getRuleContext(KeyPairContext.class,i);
		}
		public StructObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structObj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterStructObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitStructObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitStructObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructObjContext structObj() throws RecognitionException {
		StructObjContext _localctx = new StructObjContext(_ctx, getState());
        enterRule(_localctx, 244, RULE_structObj);
		int _la;
		try {
            setState(1293);
            _errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(1280);
                    match(T__4);
                    setState(1281);
                    keyPair();
                    setState(1286);
                    _errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
                        setState(1282);
                        match(T__0);
                        setState(1283);
                        keyPair();
					}
					}
                    setState(1288);
                    _errHandler.sync(this);
					_la = _input.LA(1);
				}
                    setState(1289);
                    match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(1291);
                    match(T__4);
                    setState(1292);
                    match(T__5);
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
	public static class StructArrContext extends ParserRuleContext {
		public List<StructObjContext> structObj() {
			return getRuleContexts(StructObjContext.class);
		}
		public StructObjContext structObj(int i) {
			return getRuleContext(StructObjContext.class,i);
		}
		public StructArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterStructArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitStructArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitStructArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructArrContext structArr() throws RecognitionException {
		StructArrContext _localctx = new StructArrContext(_ctx, getState());
        enterRule(_localctx, 246, RULE_structArr);
		int _la;
		try {
            setState(1308);
            _errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(1295);
                    match(T__49);
                    setState(1296);
                    structObj();
                    setState(1301);
                    _errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
                        setState(1297);
                        match(T__0);
                        setState(1298);
                        structObj();
					}
					}
                    setState(1303);
                    _errHandler.sync(this);
					_la = _input.LA(1);
				}
                    setState(1304);
                    match(T__50);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(1306);
                    match(T__49);
                    setState(1307);
                    match(T__50);
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
	public static class KeyPairContext extends ParserRuleContext {
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SpescParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(SpescParser.COLON, 0); }
		public TerminalNode RULE_STRING() { return getToken(SpescParser.RULE_STRING, 0); }
		public KeyPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).enterKeyPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpescListener ) ((SpescListener)listener).exitKeyPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpescVisitor ) return ((SpescVisitor<? extends T>)visitor).visitKeyPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyPairContext keyPair() throws RecognitionException {
		KeyPairContext _localctx = new KeyPairContext(_ctx, getState());
        enterRule(_localctx, 248, RULE_keyPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(1314);
                _errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
                    setState(1310);
                    match(IDENTIFIER);
                    setState(1311);
                    match(COLON);
				}
				break;
			case RULE_STRING:
				{
                    setState(1312);
                    match(RULE_STRING);
                    setState(1313);
                    match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
                setState(1316);
                struct();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 78:
			return expressions_sempred((ExpressionsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressions_sempred(ExpressionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
            "\u0004\u0001\u0085\u0527\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001" +
                    "\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004" +
                    "\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007" +
                    "\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b" +
                    "\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007" +
                    "\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007" +
                    "\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007" +
                    "\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007" +
                    "\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007" +
                    "\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007" +
                    "\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007" +
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
                    "E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007" +
                    "J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007" +
                    "O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007" +
                    "T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007" +
                    "Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007" +
                    "^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007" +
                    "c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007" +
                    "h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007" +
                    "m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007" +
                    "r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007" +
                    "w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007" +
                    "|\u0001\u0000\u0003\u0000\u00fc\b\u0000\u0001\u0000\u0001\u0000\u0001" +
                    "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005" +
                    "\u0002\u0106\b\u0002\n\u0002\f\u0002\u0109\t\u0002\u0001\u0002\u0001\u0002" +
                    "\u0001\u0003\u0005\u0003\u010e\b\u0003\n\u0003\f\u0003\u0111\t\u0003\u0001" +
                    "\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005" +
                    "\u0003\u0119\b\u0003\n\u0003\f\u0003\u011c\t\u0003\u0003\u0003\u011e\b" +
                    "\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003" +
                    "\u0003\u0125\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001" +
                    "\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0005\u0006\u0130" +
                    "\b\u0006\n\u0006\f\u0006\u0133\t\u0006\u0001\u0006\u0005\u0006\u0136\b" +
                    "\u0006\n\u0006\f\u0006\u0139\t\u0006\u0001\u0006\u0005\u0006\u013c\b\u0006" +
                    "\n\u0006\f\u0006\u013f\t\u0006\u0001\u0006\u0005\u0006\u0142\b\u0006\n" +
                    "\u0006\f\u0006\u0145\t\u0006\u0001\u0006\u0005\u0006\u0148\b\u0006\n\u0006" +
                    "\f\u0006\u014b\t\u0006\u0001\u0006\u0005\u0006\u014e\b\u0006\n\u0006\f" +
                    "\u0006\u0151\t\u0006\u0001\u0006\u0005\u0006\u0154\b\u0006\n\u0006\f\u0006" +
                    "\u0157\t\u0006\u0001\u0006\u0003\u0006\u015a\b\u0006\u0001\u0006\u0005" +
                    "\u0006\u015d\b\u0006\n\u0006\f\u0006\u0160\t\u0006\u0001\u0007\u0005\u0007" +
                    "\u0163\b\u0007\n\u0007\f\u0007\u0166\t\u0007\u0001\u0007\u0001\u0007\u0001" +
                    "\u0007\u0001\u0007\u0005\u0007\u016c\b\u0007\n\u0007\f\u0007\u016f\t\u0007" +
                    "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007" +
                    "\u0001\u0007\u0005\u0007\u0178\b\u0007\n\u0007\f\u0007\u017b\t\u0007\u0001" +
                    "\u0007\u0001\u0007\u0003\u0007\u017f\b\u0007\u0001\b\u0005\b\u0182\b\b" +
                    "\n\b\f\b\u0185\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u018b\b\b\u0001" +
                    "\b\u0003\b\u018e\b\b\u0001\b\u0005\b\u0191\b\b\n\b\f\b\u0194\t\b\u0001" +
                    "\b\u0001\b\u0005\b\u0198\b\b\n\b\f\b\u019b\t\b\u0001\t\u0003\t\u019e\b" +
                    "\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0005\u000b" +
                    "\u01a7\b\u000b\n\u000b\f\u000b\u01aa\t\u000b\u0001\u000b\u0001\u000b\u0001" +
                    "\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01b2\b\u000b\u0001" +
                    "\f\u0001\f\u0001\f\u0001\f\u0005\f\u01b8\b\f\n\f\f\f\u01bb\t\f\u0001\f" +
                    "\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f" +
                    "\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011" +
                    "\u0001\u0011\u0005\u0011\u01cc\b\u0011\n\u0011\f\u0011\u01cf\t\u0011\u0001" +
                    "\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001" +
                    "\u0012\u0005\u0012\u01d8\b\u0012\n\u0012\f\u0012\u01db\t\u0012\u0001\u0012" +
                    "\u0001\u0012\u0001\u0013\u0005\u0013\u01e0\b\u0013\n\u0013\f\u0013\u01e3" +
                    "\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01e8\b\u0013" +
                    "\u0001\u0014\u0001\u0014\u0003\u0014\u01ec\b\u0014\u0001\u0014\u0003\u0014" +
                    "\u01ef\b\u0014\u0001\u0014\u0003\u0014\u01f2\b\u0014\u0001\u0015\u0001" +
                    "\u0015\u0003\u0015\u01f6\b\u0015\u0001\u0015\u0003\u0015\u01f9\b\u0015" +
                    "\u0001\u0015\u0003\u0015\u01fc\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016" +
                    "\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017" +
                    "\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u020b\b\u0018" +
                    "\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0211\b\u0019" +
                    "\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a" +
                    "\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a" +
                    "\u021e\b\u001a\n\u001a\f\u001a\u0221\t\u001a\u0001\u001b\u0001\u001b\u0005" +
                    "\u001b\u0225\b\u001b\n\u001b\f\u001b\u0228\t\u001b\u0001\u001b\u0001\u001b" +
                    "\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d" +
                    "\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d" +
                    "\u0001\u001d\u0001\u001d\u0003\u001d\u023a\b\u001d\u0001\u001d\u0001\u001d" +
                    "\u0003\u001d\u023e\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d" +
                    "\u0003\u001d\u0244\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0248\b" +
                    "\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u024e" +
                    "\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003" +
                    "\u001e\u0255\b\u001e\u0001\u001e\u0003\u001e\u0258\b\u001e\u0001\u001f" +
                    "\u0001\u001f\u0001 \u0001 \u0001 \u0005 \u025f\b \n \f \u0262\t \u0001" +
                    "!\u0001!\u0003!\u0266\b!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#" +
                    "\u0001#\u0005#\u026f\b#\n#\f#\u0272\t#\u0001$\u0001$\u0003$\u0276\b$\u0001" +
                    "$\u0001$\u0003$\u027a\b$\u0001$\u0003$\u027d\b$\u0001$\u0001$\u0003$\u0281" +
                    "\b$\u0003$\u0283\b$\u0001%\u0001%\u0001%\u0001%\u0003%\u0289\b%\u0001" +
                    "&\u0001&\u0003&\u028d\b&\u0001\'\u0001\'\u0003\'\u0291\b\'\u0001(\u0001" +
                    "(\u0001)\u0001)\u0001)\u0003)\u0298\b)\u0001)\u0005)\u029b\b)\n)\f)\u029e" +
                    "\t)\u0001*\u0001*\u0001*\u0003*\u02a3\b*\u0001*\u0005*\u02a6\b*\n*\f*" +
                    "\u02a9\t*\u0001+\u0001+\u0003+\u02ad\b+\u0001,\u0001,\u0001,\u0001-\u0001" +
                    "-\u0001.\u0001.\u0003.\u02b6\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0003" +
                    "/\u02bd\b/\u00010\u00010\u00030\u02c1\b0\u00010\u00010\u00010\u00011\u0001" +
                    "1\u00011\u00012\u00012\u00013\u00013\u00013\u00013\u00033\u02cf\b3\u0001" +
                    "3\u00033\u02d2\b3\u00014\u00034\u02d5\b4\u00014\u00014\u00014\u00014\u0001" +
                    "5\u00015\u00016\u00016\u00017\u00017\u00037\u02e1\b7\u00017\u00017\u0001" +
                    "7\u00037\u02e6\b7\u00018\u00018\u00018\u00019\u00019\u00039\u02ed\b9\u0001" +
                    ":\u0001:\u0001;\u0001;\u0001<\u0001<\u0001<\u0005<\u02f6\b<\n<\f<\u02f9" +
                    "\t<\u0001=\u0001=\u0001=\u0005=\u02fe\b=\n=\f=\u0301\t=\u0001>\u0001>" +
                    "\u0001>\u0003>\u0306\b>\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001" +
                    "@\u0001@\u0003@\u0310\b@\u0001A\u0001A\u0001B\u0001B\u0001B\u0005B\u0317" +
                    "\bB\nB\fB\u031a\tB\u0001C\u0001C\u0001C\u0005C\u031f\bC\nC\fC\u0322\t" +
                    "C\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u0329\bD\u0001E\u0001E\u0001" +
                    "E\u0001E\u0003E\u032f\bE\u0001F\u0001F\u0001F\u0003F\u0334\bF\u0001G\u0001" +
                    "G\u0001G\u0001G\u0001G\u0003G\u033b\bG\u0001H\u0001H\u0001H\u0001H\u0005" +
                    "H\u0341\bH\nH\fH\u0344\tH\u0001H\u0001H\u0001H\u0001H\u0001H\u0005H\u034b" +
                    "\bH\nH\fH\u034e\tH\u0001H\u0003H\u0351\bH\u0001I\u0001I\u0001J\u0001J" +
                    "\u0001K\u0003K\u0358\bK\u0001K\u0001K\u0001K\u0003K\u035d\bK\u0001K\u0001" +
                    "K\u0003K\u0361\bK\u0001L\u0003L\u0364\bL\u0001L\u0001L\u0001L\u0003L\u0369" +
                    "\bL\u0001L\u0001L\u0003L\u036d\bL\u0001M\u0001M\u0001M\u0001M\u0003M\u0373" +
                    "\bM\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001" +
                    "N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001" +
                    "N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0003N\u0390\bN\u0001" +
                    "N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001" +
                    "N\u0001N\u0005N\u039e\bN\nN\fN\u03a1\tN\u0001O\u0001O\u0001O\u0001O\u0001" +
                    "O\u0001O\u0001O\u0001O\u0003O\u03ab\bO\u0001P\u0001P\u0001Q\u0001Q\u0001" +
                    "Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u03b7\bQ\u0001Q\u0001Q\u0001" +
                    "Q\u0003Q\u03bc\bQ\u0001Q\u0001Q\u0001Q\u0003Q\u03c1\bQ\u0001Q\u0001Q\u0001" +
                    "Q\u0003Q\u03c6\bQ\u0001R\u0003R\u03c9\bR\u0001R\u0003R\u03cc\bR\u0001" +
                    "R\u0003R\u03cf\bR\u0001R\u0001R\u0001R\u0003R\u03d4\bR\u0001R\u0001R\u0001" +
                    "R\u0003R\u03d9\bR\u0001R\u0003R\u03dc\bR\u0001S\u0001S\u0001S\u0001S\u0003" +
                    "S\u03e2\bS\u0001S\u0001S\u0001S\u0001T\u0005T\u03e8\bT\nT\fT\u03eb\tT" +
                    "\u0001T\u0001T\u0001T\u0003T\u03f0\bT\u0001U\u0001U\u0001U\u0001U\u0001" +
                    "U\u0005U\u03f7\bU\nU\fU\u03fa\tU\u0001U\u0005U\u03fd\bU\nU\fU\u0400\t" +
                    "U\u0001V\u0001V\u0001V\u0001V\u0001W\u0001W\u0001X\u0001X\u0003X\u040a" +
                    "\bX\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0005Y\u0412\bY\nY\fY\u0415" +
                    "\tY\u0001Y\u0001Y\u0001Z\u0001Z\u0001[\u0001[\u0003[\u041d\b[\u0001[\u0003" +
                    "[\u0420\b[\u0001[\u0003[\u0423\b[\u0001\\\u0001\\\u0001\\\u0001\\\u0001" +
                    "\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0003]\u042f\b]\u0001^\u0001^" +
                    "\u0001^\u0001^\u0001_\u0001_\u0001_\u0001_\u0001`\u0001`\u0003`\u043b" +
                    "\b`\u0001`\u0003`\u043e\b`\u0001`\u0003`\u0441\b`\u0001a\u0001a\u0001" +
                    "a\u0001a\u0003a\u0447\ba\u0001a\u0001a\u0001a\u0001a\u0001a\u0001b\u0001" +
                    "b\u0001b\u0001c\u0001c\u0001c\u0001c\u0004c\u0455\bc\u000bc\fc\u0456\u0001" +
                    "c\u0001c\u0001d\u0001d\u0001d\u0001d\u0001e\u0001e\u0001e\u0001e\u0001" +
                    "e\u0001e\u0001e\u0005e\u0466\be\ne\fe\u0469\te\u0001e\u0001e\u0003e\u046d" +
                    "\be\u0001f\u0001f\u0001f\u0001f\u0001g\u0001g\u0001g\u0001g\u0001g\u0001" +
                    "g\u0005g\u0479\bg\ng\fg\u047c\tg\u0001g\u0001g\u0001h\u0001h\u0001h\u0001" +
                    "h\u0001i\u0001i\u0001i\u0001i\u0001i\u0005i\u0489\bi\ni\fi\u048c\ti\u0001" +
                    "i\u0001i\u0001j\u0001j\u0001j\u0001k\u0001k\u0001k\u0001l\u0001l\u0001" +
                    "m\u0001m\u0001n\u0001n\u0001o\u0001o\u0001p\u0001p\u0001p\u0001p\u0001" +
                    "p\u0001p\u0001p\u0003p\u04a5\bp\u0001p\u0001p\u0003p\u04a9\bp\u0001p\u0001" +
                    "p\u0001p\u0001p\u0001p\u0003p\u04b0\bp\u0001p\u0003p\u04b3\bp\u0001p\u0001" +
                    "p\u0001p\u0001p\u0001p\u0003p\u04ba\bp\u0001p\u0001p\u0001q\u0001q\u0001" +
                    "q\u0001q\u0001q\u0001q\u0001q\u0001q\u0003q\u04c6\bq\u0001r\u0001r\u0003" +
                    "r\u04ca\br\u0001s\u0001s\u0001s\u0001s\u0001s\u0001s\u0001s\u0003s\u04d3" +
                    "\bs\u0001t\u0001t\u0001t\u0001t\u0005t\u04d9\bt\nt\ft\u04dc\tt\u0001t" +
                    "\u0001t\u0001u\u0001u\u0001u\u0001u\u0005u\u04e4\bu\nu\fu\u04e7\tu\u0001" +
                    "u\u0001u\u0001v\u0001v\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001" +
                    "w\u0001w\u0001w\u0001w\u0001w\u0001x\u0001x\u0001x\u0001x\u0001x\u0003" +
                    "x\u04fd\bx\u0001y\u0001y\u0001z\u0001z\u0001z\u0001z\u0005z\u0505\bz\n" +
                    "z\fz\u0508\tz\u0001z\u0001z\u0001z\u0001z\u0003z\u050e\bz\u0001{\u0001" +
                    "{\u0001{\u0001{\u0005{\u0514\b{\n{\f{\u0517\t{\u0001{\u0001{\u0001{\u0001" +
                    "{\u0003{\u051d\b{\u0001|\u0001|\u0001|\u0001|\u0003|\u0523\b|\u0001|\u0001" +
                    "|\u0001|\u0001\u0226\u0001\u009c}\u0000\u0002\u0004\u0006\b\n\f\u000e" +
                    "\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF" +
                    "HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c" +
                    "\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4" +
                    "\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc" +
                    "\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4" +
                    "\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec" +
                    "\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u0000\u0011\u0001\u0000JK\u0002\u0000" +
                    "UUWW\u0001\u0000LM\u0002\u0000\u0015\u0015jj\u0001\u0000\u0016\u001c\u0002" +
                    "\u0000bd\u0084\u0085\u0001\u0000pq\u0002\u0000\u0015\u0015!!\u0001\u0000" +
                    "\u0012\u0013\u0002\u0000\t\t\u0014\u0014\u0001\u0000\u001f \u0001\u0000" +
                    "\"#\u0001\u0000$%\u0001\u0000%&\u0001\u0000mn\u0001\u000001\u0001\u0000" +
                    "?D\u0565\u0000\u00fb\u0001\u0000\u0000\u0000\u0002\u0100\u0001\u0000\u0000" +
                    "\u0000\u0004\u0107\u0001\u0000\u0000\u0000\u0006\u010f\u0001\u0000\u0000" +
                    "\u0000\b\u012a\u0001\u0000\u0000\u0000\n\u012c\u0001\u0000\u0000\u0000" +
                    "\f\u0131\u0001\u0000\u0000\u0000\u000e\u0164\u0001\u0000\u0000\u0000\u0010" +
                    "\u0183\u0001\u0000\u0000\u0000\u0012\u019d\u0001\u0000\u0000\u0000\u0014" +
                    "\u01a3\u0001\u0000\u0000\u0000\u0016\u01a8\u0001\u0000\u0000\u0000\u0018" +
                    "\u01b3\u0001\u0000\u0000\u0000\u001a\u01be\u0001\u0000\u0000\u0000\u001c" +
                    "\u01c0\u0001\u0000\u0000\u0000\u001e\u01c2\u0001\u0000\u0000\u0000 \u01c4" +
                    "\u0001\u0000\u0000\u0000\"\u01c6\u0001\u0000\u0000\u0000$\u01d2\u0001" +
                    "\u0000\u0000\u0000&\u01e1\u0001\u0000\u0000\u0000(\u01e9\u0001\u0000\u0000" +
                    "\u0000*\u01f3\u0001\u0000\u0000\u0000,\u01fd\u0001\u0000\u0000\u0000." +
                    "\u0200\u0001\u0000\u0000\u00000\u020a\u0001\u0000\u0000\u00002\u020c\u0001" +
                    "\u0000\u0000\u00004\u0217\u0001\u0000\u0000\u00006\u0222\u0001\u0000\u0000" +
                    "\u00008\u022b\u0001\u0000\u0000\u0000:\u022f\u0001\u0000\u0000\u0000<" +
                    "\u0251\u0001\u0000\u0000\u0000>\u0259\u0001\u0000\u0000\u0000@\u025b\u0001" +
                    "\u0000\u0000\u0000B\u0263\u0001\u0000\u0000\u0000D\u0267\u0001\u0000\u0000" +
                    "\u0000F\u026a\u0001\u0000\u0000\u0000H\u0273\u0001\u0000\u0000\u0000J" +
                    "\u0284\u0001\u0000\u0000\u0000L\u028c\u0001\u0000\u0000\u0000N\u0290\u0001" +
                    "\u0000\u0000\u0000P\u0292\u0001\u0000\u0000\u0000R\u0294\u0001\u0000\u0000" +
                    "\u0000T\u029f\u0001\u0000\u0000\u0000V\u02ac\u0001\u0000\u0000\u0000X" +
                    "\u02ae\u0001\u0000\u0000\u0000Z\u02b1\u0001\u0000\u0000\u0000\\\u02b5" +
                    "\u0001\u0000\u0000\u0000^\u02b7\u0001\u0000\u0000\u0000`\u02c0\u0001\u0000" +
                    "\u0000\u0000b\u02c5\u0001\u0000\u0000\u0000d\u02c8\u0001\u0000\u0000\u0000" +
                    "f\u02ce\u0001\u0000\u0000\u0000h\u02d4\u0001\u0000\u0000\u0000j\u02da" +
                    "\u0001\u0000\u0000\u0000l\u02dc\u0001\u0000\u0000\u0000n\u02e5\u0001\u0000" +
                    "\u0000\u0000p\u02e7\u0001\u0000\u0000\u0000r\u02ec\u0001\u0000\u0000\u0000" +
                    "t\u02ee\u0001\u0000\u0000\u0000v\u02f0\u0001\u0000\u0000\u0000x\u02f2" +
                    "\u0001\u0000\u0000\u0000z\u02fa\u0001\u0000\u0000\u0000|\u0305\u0001\u0000" +
                    "\u0000\u0000~\u0307\u0001\u0000\u0000\u0000\u0080\u030b\u0001\u0000\u0000" +
                    "\u0000\u0082\u0311\u0001\u0000\u0000\u0000\u0084\u0313\u0001\u0000\u0000" +
                    "\u0000\u0086\u031b\u0001\u0000\u0000\u0000\u0088\u0328\u0001\u0000\u0000" +
                    "\u0000\u008a\u032a\u0001\u0000\u0000\u0000\u008c\u0333\u0001\u0000\u0000" +
                    "\u0000\u008e\u033a\u0001\u0000\u0000\u0000\u0090\u0350\u0001\u0000\u0000" +
                    "\u0000\u0092\u0352\u0001\u0000\u0000\u0000\u0094\u0354\u0001\u0000\u0000" +
                    "\u0000\u0096\u0357\u0001\u0000\u0000\u0000\u0098\u0363\u0001\u0000\u0000" +
                    "\u0000\u009a\u036e\u0001\u0000\u0000\u0000\u009c\u038f\u0001\u0000\u0000" +
                    "\u0000\u009e\u03aa\u0001\u0000\u0000\u0000\u00a0\u03ac\u0001\u0000\u0000" +
                    "\u0000\u00a2\u03c5\u0001\u0000\u0000\u0000\u00a4\u03db\u0001\u0000\u0000" +
                    "\u0000\u00a6\u03dd\u0001\u0000\u0000\u0000\u00a8\u03e9\u0001\u0000\u0000" +
                    "\u0000\u00aa\u03f1\u0001\u0000\u0000\u0000\u00ac\u0401\u0001\u0000\u0000" +
                    "\u0000\u00ae\u0405\u0001\u0000\u0000\u0000\u00b0\u0409\u0001\u0000\u0000" +
                    "\u0000\u00b2\u040b\u0001\u0000\u0000\u0000\u00b4\u0418\u0001\u0000\u0000" +
                    "\u0000\u00b6\u041a\u0001\u0000\u0000\u0000\u00b8\u0424\u0001\u0000\u0000" +
                    "\u0000\u00ba\u042e\u0001\u0000\u0000\u0000\u00bc\u0430\u0001\u0000\u0000" +
                    "\u0000\u00be\u0434\u0001\u0000\u0000\u0000\u00c0\u0438\u0001\u0000\u0000" +
                    "\u0000\u00c2\u0442\u0001\u0000\u0000\u0000\u00c4\u044d\u0001\u0000\u0000" +
                    "\u0000\u00c6\u0450\u0001\u0000\u0000\u0000\u00c8\u045a\u0001\u0000\u0000" +
                    "\u0000\u00ca\u045e\u0001\u0000\u0000\u0000\u00cc\u046e\u0001\u0000\u0000" +
                    "\u0000\u00ce\u0472\u0001\u0000\u0000\u0000\u00d0\u047f\u0001\u0000\u0000" +
                    "\u0000\u00d2\u0483\u0001\u0000\u0000\u0000\u00d4\u048f\u0001\u0000\u0000" +
                    "\u0000\u00d6\u0492\u0001\u0000\u0000\u0000\u00d8\u0495\u0001\u0000\u0000" +
                    "\u0000\u00da\u0497\u0001\u0000\u0000\u0000\u00dc\u0499\u0001\u0000\u0000" +
                    "\u0000\u00de\u049b\u0001\u0000\u0000\u0000\u00e0\u049d\u0001\u0000\u0000" +
                    "\u0000\u00e2\u04c5\u0001\u0000\u0000\u0000\u00e4\u04c9\u0001\u0000\u0000" +
                    "\u0000\u00e6\u04d2\u0001\u0000\u0000\u0000\u00e8\u04d4\u0001\u0000\u0000" +
                    "\u0000\u00ea\u04df\u0001\u0000\u0000\u0000\u00ec\u04ea\u0001\u0000\u0000" +
                    "\u0000\u00ee\u04ec\u0001\u0000\u0000\u0000\u00f0\u04fc\u0001\u0000\u0000" +
                    "\u0000\u00f2\u04fe\u0001\u0000\u0000\u0000\u00f4\u050d\u0001\u0000\u0000" +
                    "\u0000\u00f6\u051c\u0001\u0000\u0000\u0000\u00f8\u0522\u0001\u0000\u0000" +
                    "\u0000\u00fa\u00fc\u0003\u0002\u0001\u0000\u00fb\u00fa\u0001\u0000\u0000" +
                    "\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000" +
                    "\u0000\u00fd\u00fe\u0003\u0006\u0003\u0000\u00fe\u00ff\u0005\u0000\u0000" +
                    "\u0001\u00ff\u0001\u0001\u0000\u0000\u0000\u0100\u0101\u0005I\u0000\u0000" +
                    "\u0101\u0102\u0003\u0004\u0002\u0000\u0102\u0003\u0001\u0000\u0000\u0000" +
                    "\u0103\u0104\u0005\u0080\u0000\u0000\u0104\u0106\u0005[\u0000\u0000\u0105" +
                    "\u0103\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107" +
                    "\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108" +
                    "\u010a\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a" +
                    "\u010b\u0005\u0080\u0000\u0000\u010b\u0005\u0001\u0000\u0000\u0000\u010c" +
                    "\u010e\u0003\u00ecv\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u0111" +
                    "\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110" +
                    "\u0001\u0000\u0000\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u010f" +
                    "\u0001\u0000\u0000\u0000\u0112\u0113\u0003\b\u0004\u0000\u0113\u011d\u0005" +
                    "\u0080\u0000\u0000\u0114\u0115\u0005x\u0000\u0000\u0115\u011a\u0003\n" +
                    "\u0005\u0000\u0116\u0117\u0005\u0001\u0000\u0000\u0117\u0119\u0003\n\u0005" +
                    "\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000" +
                    "\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000" +
                    "\u0000\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000" +
                    "\u0000\u011d\u0114\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000" +
                    "\u0000\u011e\u0124\u0001\u0000\u0000\u0000\u011f\u0120\u0005Z\u0000\u0000" +
                    "\u0120\u0121\u0005\u0002\u0000\u0000\u0121\u0122\u0005\u0003\u0000\u0000" +
                    "\u0122\u0123\u0005\u0004\u0000\u0000\u0123\u0125\u0005\u0080\u0000\u0000" +
                    "\u0124\u011f\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000" +
                    "\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0005\u0005\u0000\u0000" +
                    "\u0127\u0128\u0003\f\u0006\u0000\u0128\u0129\u0005\u0006\u0000\u0000\u0129" +
                    "\u0007\u0001\u0000\u0000\u0000\u012a\u012b\u0007\u0000\u0000\u0000\u012b" +
                    "\t\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u0080\u0000\u0000\u012d\u000b" +
                    "\u0001\u0000\u0000\u0000\u012e\u0130\u0003\u000e\u0007\u0000\u012f\u012e" +
                    "\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u012f" +
                    "\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0137" +
                    "\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u0136" +
                    "\u0003\u0010\b\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0136\u0139\u0001" +
                    "\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001" +
                    "\u0000\u0000\u0000\u0138\u013d\u0001\u0000\u0000\u0000\u0139\u0137\u0001" +
                    "\u0000\u0000\u0000\u013a\u013c\u0003\u0016\u000b\u0000\u013b\u013a\u0001" +
                    "\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001" +
                    "\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0143\u0001" +
                    "\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0142\u0003" +
                    "\u0018\f\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142\u0145\u0001\u0000" +
                    "\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000" +
                    "\u0000\u0000\u0144\u0149\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000" +
                    "\u0000\u0000\u0146\u0148\u0003\u00c4b\u0000\u0147\u0146\u0001\u0000\u0000" +
                    "\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000" +
                    "\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014f\u0001\u0000\u0000" +
                    "\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u014e\u0003&\u0013\u0000" +
                    "\u014d\u014c\u0001\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000" +
                    "\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000" +
                    "\u0150\u0155\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000" +
                    "\u0152\u0154\u0003\u00a8T\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154" +
                    "\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155" +
                    "\u0156\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157" +
                    "\u0155\u0001\u0000\u0000\u0000\u0158\u015a\u0003\u00e0p\u0000\u0159\u0158" +
                    "\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015e" +
                    "\u0001\u0000\u0000\u0000\u015b\u015d\u0003:\u001d\u0000\u015c\u015b\u0001" +
                    "\u0000\u0000\u0000\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u015c\u0001" +
                    "\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\r\u0001\u0000" +
                    "\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0163\u0003\u00ec" +
                    "v\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000" +
                    "\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000" +
                    "\u0000\u0165\u017e\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000" +
                    "\u0000\u0167\u0168\u0005L\u0000\u0000\u0168\u0169\u0003\u001a\r\u0000" +
                    "\u0169\u016d\u0005\u0005\u0000\u0000\u016a\u016c\u0003\u0016\u000b\u0000" +
                    "\u016b\u016a\u0001\u0000\u0000\u0000\u016c\u016f\u0001\u0000\u0000\u0000" +
                    "\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000" +
                    "\u016e\u0170\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000" +
                    "\u0170\u0171\u0005\u0006\u0000\u0000\u0171\u017f\u0001\u0000\u0000\u0000" +
                    "\u0172\u0173\u0005L\u0000\u0000\u0173\u0174\u0005M\u0000\u0000\u0174\u0175" +
                    "\u0003\u001a\r\u0000\u0175\u0179\u0005\u0005\u0000\u0000\u0176\u0178\u0003" +
                    "\u0016\u000b\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0178\u017b\u0001" +
                    "\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001" +
                    "\u0000\u0000\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b\u0179\u0001" +
                    "\u0000\u0000\u0000\u017c\u017d\u0005\u0006\u0000\u0000\u017d\u017f\u0001" +
                    "\u0000\u0000\u0000\u017e\u0167\u0001\u0000\u0000\u0000\u017e\u0172\u0001" +
                    "\u0000\u0000\u0000\u017f\u000f\u0001\u0000\u0000\u0000\u0180\u0182\u0003" +
                    "\u00ecv\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0182\u0185\u0001\u0000" +
                    "\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000" +
                    "\u0000\u0000\u0184\u0186\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000" +
                    "\u0000\u0000\u0186\u0187\u0005N\u0000\u0000\u0187\u0188\u0003\u001c\u000e" +
                    "\u0000\u0188\u018a\u0005\u0005\u0000\u0000\u0189\u018b\u0003\"\u0011\u0000" +
                    "\u018a\u0189\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000" +
                    "\u018b\u018d\u0001\u0000\u0000\u0000\u018c\u018e\u0003$\u0012\u0000\u018d" +
                    "\u018c\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e" +
                    "\u0192\u0001\u0000\u0000\u0000\u018f\u0191\u0003\u0016\u000b\u0000\u0190" +
                    "\u018f\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000\u0000\u0192" +
                    "\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193" +
                    "\u0195\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195" +
                    "\u0199\u0005\u0006\u0000\u0000\u0196\u0198\u0003\u0012\t\u0000\u0197\u0196" +
                    "\u0001\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197" +
                    "\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u0011" +
                    "\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019e" +
                    "\u0005\u0001\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019d\u019e" +
                    "\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0" +
                    "\u0003\u0014\n\u0000\u01a0\u01a1\u0005\u0007\u0000\u0000\u01a1\u01a2\u0005" +
                    "E\u0000\u0000\u01a2\u0013\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005\u0080" +
                    "\u0000\u0000\u01a4\u0015\u0001\u0000\u0000\u0000\u01a5\u01a7\u0003\u00ec" +
                    "v\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a7\u01aa\u0001\u0000\u0000" +
                    "\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000" +
                    "\u0000\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000" +
                    "\u0000\u01ab\u01ac\u0003\u001e\u000f\u0000\u01ac\u01b1\u0005Z\u0000\u0000" +
                    "\u01ad\u01b2\u0003\u00f2y\u0000\u01ae\u01b2\u0003\u00e2q\u0000\u01af\u01b2" +
                    "\u0003\u00e8t\u0000\u01b0\u01b2\u0003\u00eau\u0000\u01b1\u01ad\u0001\u0000" +
                    "\u0000\u0000\u01b1\u01ae\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000" +
                    "\u0000\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b2\u0017\u0001\u0000" +
                    "\u0000\u0000\u01b3\u01b4\u0005Q\u0000\u0000\u01b4\u01b5\u0003 \u0010\u0000" +
                    "\u01b5\u01b9\u0005\u0005\u0000\u0000\u01b6\u01b8\u0003\u0016\u000b\u0000" +
                    "\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000" +
                    "\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000" +
                    "\u01ba\u01bc\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000" +
                    "\u01bc\u01bd\u0005\u0006\u0000\u0000\u01bd\u0019\u0001\u0000\u0000\u0000" +
                    "\u01be\u01bf\u0005\u0080\u0000\u0000\u01bf\u001b\u0001\u0000\u0000\u0000" +
                    "\u01c0\u01c1\u0005\u0080\u0000\u0000\u01c1\u001d\u0001\u0000\u0000\u0000" +
                    "\u01c2\u01c3\u0005\u0080\u0000\u0000\u01c3\u001f\u0001\u0000\u0000\u0000" +
                    "\u01c4\u01c5\u0005\u0080\u0000\u0000\u01c5!\u0001\u0000\u0000\u0000\u01c6" +
                    "\u01c7\u0005O\u0000\u0000\u01c7\u01c8\u0005\u0005\u0000\u0000\u01c8\u01cd" +
                    "\u0003\u0016\u000b\u0000\u01c9\u01ca\u0005\u0001\u0000\u0000\u01ca\u01cc" +
                    "\u0003\u0016\u000b\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cc\u01cf" +
                    "\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce" +
                    "\u0001\u0000\u0000\u0000\u01ce\u01d0\u0001\u0000\u0000\u0000\u01cf\u01cd" +
                    "\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005\u0006\u0000\u0000\u01d1#\u0001" +
                    "\u0000\u0000\u0000\u01d2\u01d3\u0005S\u0000\u0000\u01d3\u01d4\u0005\u0005" +
                    "\u0000\u0000\u01d4\u01d9\u0003\u0016\u000b\u0000\u01d5\u01d6\u0005\u0001" +
                    "\u0000\u0000\u01d6\u01d8\u0003\u0016\u000b\u0000\u01d7\u01d5\u0001\u0000" +
                    "\u0000\u0000\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000" +
                    "\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01dc\u0001\u0000" +
                    "\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005\u0006" +
                    "\u0000\u0000\u01dd%\u0001\u0000\u0000\u0000\u01de\u01e0\u0003\u00ecv\u0000" +
                    "\u01df\u01de\u0001\u0000\u0000\u0000\u01e0\u01e3\u0001\u0000\u0000\u0000" +
                    "\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000" +
                    "\u01e2\u01e7\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000" +
                    "\u01e4\u01e8\u0003(\u0014\u0000\u01e5\u01e8\u0003*\u0015\u0000\u01e6\u01e8" +
                    "\u0003,\u0016\u0000\u01e7\u01e4\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001" +
                    "\u0000\u0000\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000\u01e8\'\u0001\u0000" +
                    "\u0000\u0000\u01e9\u01eb\u0003.\u0017\u0000\u01ea\u01ec\u0003D\"\u0000" +
                    "\u01eb\u01ea\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000" +
                    "\u01ec\u01ee\u0001\u0000\u0000\u0000\u01ed\u01ef\u0003F#\u0000\u01ee\u01ed" +
                    "\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f1" +
                    "\u0001\u0000\u0000\u0000\u01f0\u01f2\u0003H$\u0000\u01f1\u01f0\u0001\u0000" +
                    "\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2)\u0001\u0000\u0000" +
                    "\u0000\u01f3\u01f5\u00032\u0019\u0000\u01f4\u01f6\u0003D\"\u0000\u01f5" +
                    "\u01f4\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6" +
                    "\u01f8\u0001\u0000\u0000\u0000\u01f7\u01f9\u0003F#\u0000\u01f8\u01f7\u0001" +
                    "\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fb\u0001" +
                    "\u0000\u0000\u0000\u01fa\u01fc\u0003H$\u0000\u01fb\u01fa\u0001\u0000\u0000" +
                    "\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc+\u0001\u0000\u0000\u0000" +
                    "\u01fd\u01fe\u00036\u001b\u0000\u01fe\u01ff\u00038\u001c\u0000\u01ff-" +
                    "\u0001\u0000\u0000\u0000\u0200\u0201\u0005U\u0000\u0000\u0201\u0202\u0003" +
                    "\u00e4r\u0000\u0202\u0203\u0005Z\u0000\u0000\u0203\u0204\u0003\u001a\r" +
                    "\u0000\u0204\u0205\u00030\u0018\u0000\u0205\u0206\u0003<\u001e\u0000\u0206" +
                    "/\u0001\u0000\u0000\u0000\u0207\u020b\u0005\\\u0000\u0000\u0208\u020b" +
                    "\u0005]\u0000\u0000\u0209\u020b\u0005^\u0000\u0000\u020a\u0207\u0001\u0000" +
                    "\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u0209\u0001\u0000" +
                    "\u0000\u0000\u020b1\u0001\u0000\u0000\u0000\u020c\u020d\u0005X\u0000\u0000" +
                    "\u020d\u020e\u0005U\u0000\u0000\u020e\u0210\u0003\u00e4r\u0000\u020f\u0211" +
                    "\u00034\u001a\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0210\u0211\u0001" +
                    "\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0213\u0005" +
                    "Z\u0000\u0000\u0213\u0214\u0003\u001a\r\u0000\u0214\u0215\u00030\u0018" +
                    "\u0000\u0215\u0216\u0003<\u001e\u0000\u02163\u0001\u0000\u0000\u0000\u0217" +
                    "\u0218\u0005\b\u0000\u0000\u0218\u0219\u0007\u0001\u0000\u0000\u0219\u021f" +
                    "\u0003\u00e4r\u0000\u021a\u021b\u0005\t\u0000\u0000\u021b\u021c\u0005" +
                    "W\u0000\u0000\u021c\u021e\u0003\u00e4r\u0000\u021d\u021a\u0001\u0000\u0000" +
                    "\u0000\u021e\u0221\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000" +
                    "\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u02205\u0001\u0000\u0000\u0000" +
                    "\u0221\u021f\u0001\u0000\u0000\u0000\u0222\u0226\u0005\n\u0000\u0000\u0223" +
                    "\u0225\t\u0000\u0000\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0225\u0228" +
                    "\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0226\u0224" +
                    "\u0001\u0000\u0000\u0000\u0227\u0229\u0001\u0000\u0000\u0000\u0228\u0226" +
                    "\u0001\u0000\u0000\u0000\u0229\u022a\u0005\u000b\u0000\u0000\u022a7\u0001" +
                    "\u0000\u0000\u0000\u022b\u022c\u0005\f\u0000\u0000\u022c\u022d\u0005Z" +
                    "\u0000\u0000\u022d\u022e\u0005\u0080\u0000\u0000\u022e9\u0001\u0000\u0000" +
                    "\u0000\u022f\u0230\u0005T\u0000\u0000\u0230\u0231\u0005t\u0000\u0000\u0231" +
                    "\u0232\u0007\u0002\u0000\u0000\u0232\u0233\u0005\u0080\u0000\u0000\u0233" +
                    "\u0234\u0005Z\u0000\u0000\u0234\u0235\u0005\u0005\u0000\u0000\u0235\u0236" +
                    "\u0005\r\u0000\u0000\u0236\u023d\u0005Z\u0000\u0000\u0237\u023a\u0003" +
                    "\u00f2y\u0000\u0238\u023a\u0003\u00e2q\u0000\u0239\u0237\u0001\u0000\u0000" +
                    "\u0000\u0239\u0238\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000" +
                    "\u0000\u023b\u023c\u0005\u0001\u0000\u0000\u023c\u023e\u0001\u0000\u0000" +
                    "\u0000\u023d\u0239\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000" +
                    "\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0240\u0005T\u0000\u0000" +
                    "\u0240\u0247\u0005Z\u0000\u0000\u0241\u0244\u0003\u00f2y\u0000\u0242\u0244" +
                    "\u0003\u00e2q\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0243\u0242\u0001" +
                    "\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245\u0246\u0005" +
                    "\u0001\u0000\u0000\u0246\u0248\u0001\u0000\u0000\u0000\u0247\u0243\u0001" +
                    "\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u0249\u0001" +
                    "\u0000\u0000\u0000\u0249\u024a\u0005\u000e\u0000\u0000\u024a\u024d\u0005" +
                    "Z\u0000\u0000\u024b\u024e\u0003\u00f2y\u0000\u024c\u024e\u0005F\u0000" +
                    "\u0000\u024d\u024b\u0001\u0000\u0000\u0000\u024d\u024c\u0001\u0000\u0000" +
                    "\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000" +
                    "\u0000\u024f\u0250\u0005\u0006\u0000\u0000\u0250;\u0001\u0000\u0000\u0000" +
                    "\u0251\u0257\u0003>\u001f\u0000\u0252\u0254\u0005\u000f\u0000\u0000\u0253" +
                    "\u0255\u0003@ \u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0254\u0255\u0001" +
                    "\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256\u0258\u0005" +
                    "\u0010\u0000\u0000\u0257\u0252\u0001\u0000\u0000\u0000\u0257\u0258\u0001" +
                    "\u0000\u0000\u0000\u0258=\u0001\u0000\u0000\u0000\u0259\u025a\u0005\u0080" +
                    "\u0000\u0000\u025a?\u0001\u0000\u0000\u0000\u025b\u0260\u0003B!\u0000" +
                    "\u025c\u025d\u0005\u0001\u0000\u0000\u025d\u025f\u0003B!\u0000\u025e\u025c" +
                    "\u0001\u0000\u0000\u0000\u025f\u0262\u0001\u0000\u0000\u0000\u0260\u025e" +
                    "\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261A\u0001" +
                    "\u0000\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0263\u0265\u0005" +
                    "\u0080\u0000\u0000\u0264\u0266\u0003\u00f2y\u0000\u0265\u0264\u0001\u0000" +
                    "\u0000\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266C\u0001\u0000\u0000" +
                    "\u0000\u0267\u0268\u0005_\u0000\u0000\u0268\u0269\u0003J%\u0000\u0269" +
                    "E\u0001\u0000\u0000\u0000\u026a\u026b\u0005`\u0000\u0000\u026b\u0270\u0003" +
                    "\u00a2Q\u0000\u026c\u026d\u0005\t\u0000\u0000\u026d\u026f\u0003\u00a2" +
                    "Q\u0000\u026e\u026c\u0001\u0000\u0000\u0000\u026f\u0272\u0001\u0000\u0000" +
                    "\u0000\u0270\u026e\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000" +
                    "\u0000\u0271G\u0001\u0000\u0000\u0000\u0272\u0270\u0001\u0000\u0000\u0000" +
                    "\u0273\u0282\u0005a\u0000\u0000\u0274\u0276\u0003x<\u0000\u0275\u0274" +
                    "\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0279" +
                    "\u0001\u0000\u0000\u0000\u0277\u0278\u0005\u0011\u0000\u0000\u0278\u027a" +
                    "\u0003L&\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000" +
                    "\u0000\u0000\u027a\u0283\u0001\u0000\u0000\u0000\u027b\u027d\u0003L&\u0000" +
                    "\u027c\u027b\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000" +
                    "\u027d\u0280\u0001\u0000\u0000\u0000\u027e\u027f\u0005\u0011\u0000\u0000" +
                    "\u027f\u0281\u0003x<\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0280\u0281" +
                    "\u0001\u0000\u0000\u0000\u0281\u0283\u0001\u0000\u0000\u0000\u0282\u0275" +
                    "\u0001\u0000\u0000\u0000\u0282\u027c\u0001\u0000\u0000\u0000\u0283I\u0001" +
                    "\u0000\u0000\u0000\u0284\u0288\u0003L&\u0000\u0285\u0286\u0003N\'\u0000" +
                    "\u0286\u0287\u0003L&\u0000\u0287\u0289\u0001\u0000\u0000\u0000\u0288\u0285" +
                    "\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289K\u0001" +
                    "\u0000\u0000\u0000\u028a\u028d\u0003P(\u0000\u028b\u028d\u0003\u008aE" +
                    "\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028c\u028b\u0001\u0000\u0000" +
                    "\u0000\u028dM\u0001\u0000\u0000\u0000\u028e\u0291\u0005l\u0000\u0000\u028f" +
                    "\u0291\u0005k\u0000\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0290\u028f" +
                    "\u0001\u0000\u0000\u0000\u0291O\u0001\u0000\u0000\u0000\u0292\u0293\u0003" +
                    "R)\u0000\u0293Q\u0001\u0000\u0000\u0000\u0294\u029c\u0003T*\u0000\u0295" +
                    "\u0298\u0005\u0012\u0000\u0000\u0296\u0298\u0005\u0013\u0000\u0000\u0297" +
                    "\u0295\u0001\u0000\u0000\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0298" +
                    "\u0299\u0001\u0000\u0000\u0000\u0299\u029b\u0003T*\u0000\u029a\u0297\u0001" +
                    "\u0000\u0000\u0000\u029b\u029e\u0001\u0000\u0000\u0000\u029c\u029a\u0001" +
                    "\u0000\u0000\u0000\u029c\u029d\u0001\u0000\u0000\u0000\u029dS\u0001\u0000" +
                    "\u0000\u0000\u029e\u029c\u0001\u0000\u0000\u0000\u029f\u02a7\u0003V+\u0000" +
                    "\u02a0\u02a3\u0005\t\u0000\u0000\u02a1\u02a3\u0005\u0014\u0000\u0000\u02a2" +
                    "\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a1\u0001\u0000\u0000\u0000\u02a3" +
                    "\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a6\u0003V+\u0000\u02a5\u02a2\u0001" +
                    "\u0000\u0000\u0000\u02a6\u02a9\u0001\u0000\u0000\u0000\u02a7\u02a5\u0001" +
                    "\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8U\u0001\u0000" +
                    "\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02aa\u02ad\u0003X,\u0000" +
                    "\u02ab\u02ad\u0003Z-\u0000\u02ac\u02aa\u0001\u0000\u0000\u0000\u02ac\u02ab" +
                    "\u0001\u0000\u0000\u0000\u02adW\u0001\u0000\u0000\u0000\u02ae\u02af\u0007" +
                    "\u0003\u0000\u0000\u02af\u02b0\u0003Z-\u0000\u02b0Y\u0001\u0000\u0000" +
                    "\u0000\u02b1\u02b2\u0003\\.\u0000\u02b2[\u0001\u0000\u0000\u0000\u02b3" +
                    "\u02b6\u0003`0\u0000\u02b4\u02b6\u0003^/\u0000\u02b5\u02b3\u0001\u0000" +
                    "\u0000\u0000\u02b5\u02b4\u0001\u0000\u0000\u0000\u02b6]\u0001\u0000\u0000" +
                    "\u0000\u02b7\u02bc\u0003f3\u0000\u02b8\u02b9\u0003v;\u0000\u02b9\u02ba" +
                    "\u0003t:\u0000\u02ba\u02bb\u0003f3\u0000\u02bb\u02bd\u0001\u0000\u0000" +
                    "\u0000\u02bc\u02b8\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000" +
                    "\u0000\u02bd_\u0001\u0000\u0000\u0000\u02be\u02bf\u0005s\u0000\u0000\u02bf" +
                    "\u02c1\u0003b1\u0000\u02c0\u02be\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001" +
                    "\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02c3\u0003" +
                    "t:\u0000\u02c3\u02c4\u0003f3\u0000\u02c4a\u0001\u0000\u0000\u0000\u02c5" +
                    "\u02c6\u0003\u0094J\u0000\u02c6\u02c7\u0003d2\u0000\u02c7c\u0001\u0000" +
                    "\u0000\u0000\u02c8\u02c9\u0007\u0004\u0000\u0000\u02c9e\u0001\u0000\u0000" +
                    "\u0000\u02ca\u02cf\u0003h4\u0000\u02cb\u02cf\u0003n7\u0000\u02cc\u02cf" +
                    "\u0003\u00eew\u0000\u02cd\u02cf\u0003b1\u0000\u02ce\u02ca\u0001\u0000" +
                    "\u0000\u0000\u02ce\u02cb\u0001\u0000\u0000\u0000\u02ce\u02cc\u0001\u0000" +
                    "\u0000\u0000\u02ce\u02cd\u0001\u0000\u0000\u0000\u02cf\u02d1\u0001\u0000" +
                    "\u0000\u0000\u02d0\u02d2\u0003p8\u0000\u02d1\u02d0\u0001\u0000\u0000\u0000" +
                    "\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2g\u0001\u0000\u0000\u0000\u02d3" +
                    "\u02d5\u0003l6\u0000\u02d4\u02d3\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001" +
                    "\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000\u0000\u02d6\u02d7\u0003" +
                    "\u001a\r\u0000\u02d7\u02d8\u0003j5\u0000\u02d8\u02d9\u0003<\u001e\u0000" +
                    "\u02d9i\u0001\u0000\u0000\u0000\u02da\u02db\u0005e\u0000\u0000\u02dbk" +
                    "\u0001\u0000\u0000\u0000\u02dc\u02dd\u0007\u0005\u0000\u0000\u02ddm\u0001" +
                    "\u0000\u0000\u0000\u02de\u02e1\u0005\u001d\u0000\u0000\u02df\u02e1\u0005" +
                    "\u001e\u0000\u0000\u02e0\u02de\u0001\u0000\u0000\u0000\u02e0\u02df\u0001" +
                    "\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e3\u0005" +
                    "t\u0000\u0000\u02e3\u02e6\u0005\u0080\u0000\u0000\u02e4\u02e6\u0005\u0080" +
                    "\u0000\u0000\u02e5\u02e0\u0001\u0000\u0000\u0000\u02e5\u02e4\u0001\u0000" +
                    "\u0000\u0000\u02e6o\u0001\u0000\u0000\u0000\u02e7\u02e8\u0003r9\u0000" +
                    "\u02e8\u02e9\u0003b1\u0000\u02e9q\u0001\u0000\u0000\u0000\u02ea\u02ed" +
                    "\u0005\u001f\u0000\u0000\u02eb\u02ed\u0005 \u0000\u0000\u02ec\u02ea\u0001" +
                    "\u0000\u0000\u0000\u02ec\u02eb\u0001\u0000\u0000\u0000\u02eds\u0001\u0000" +
                    "\u0000\u0000\u02ee\u02ef\u0007\u0006\u0000\u0000\u02efu\u0001\u0000\u0000" +
                    "\u0000\u02f0\u02f1\u0007\u0007\u0000\u0000\u02f1w\u0001\u0000\u0000\u0000" +
                    "\u02f2\u02f7\u0003z=\u0000\u02f3\u02f4\u0007\b\u0000\u0000\u02f4\u02f6" +
                    "\u0003z=\u0000\u02f5\u02f3\u0001\u0000\u0000\u0000\u02f6\u02f9\u0001\u0000" +
                    "\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000" +
                    "\u0000\u0000\u02f8y\u0001\u0000\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000" +
                    "\u0000\u02fa\u02ff\u0003|>\u0000\u02fb\u02fc\u0007\t\u0000\u0000\u02fc" +
                    "\u02fe\u0003|>\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fe\u0301\u0001" +
                    "\u0000\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000\u02ff\u0300\u0001" +
                    "\u0000\u0000\u0000\u0300{\u0001\u0000\u0000\u0000\u0301\u02ff\u0001\u0000" +
                    "\u0000\u0000\u0302\u0306\u0003~?\u0000\u0303\u0306\u0003\u0080@\u0000" +
                    "\u0304\u0306\u0003\u0082A\u0000\u0305\u0302\u0001\u0000\u0000\u0000\u0305" +
                    "\u0303\u0001\u0000\u0000\u0000\u0305\u0304\u0001\u0000\u0000\u0000\u0306" +
                    "}\u0001\u0000\u0000\u0000\u0307\u0308\u0005\u0080\u0000\u0000\u0308\u0309" +
                    "\u0005\u0007\u0000\u0000\u0309\u030a\u0003|>\u0000\u030a\u007f\u0001\u0000" +
                    "\u0000\u0000\u030b\u030f\u0003\u0082A\u0000\u030c\u030d\u0003\u009eO\u0000" +
                    "\u030d\u030e\u0003\u0082A\u0000\u030e\u0310\u0001\u0000\u0000\u0000\u030f" +
                    "\u030c\u0001\u0000\u0000\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310" +
                    "\u0081\u0001\u0000\u0000\u0000\u0311\u0312\u0003\u0084B\u0000\u0312\u0083" +
                    "\u0001\u0000\u0000\u0000\u0313\u0318\u0003\u0086C\u0000\u0314\u0315\u0007" +
                    "\n\u0000\u0000\u0315\u0317\u0003\u0086C\u0000\u0316\u0314\u0001\u0000" +
                    "\u0000\u0000\u0317\u031a\u0001\u0000\u0000\u0000\u0318\u0316\u0001\u0000" +
                    "\u0000\u0000\u0318\u0319\u0001\u0000\u0000\u0000\u0319\u0085\u0001\u0000" +
                    "\u0000\u0000\u031a\u0318\u0001\u0000\u0000\u0000\u031b\u0320\u0003\u0088" +
                    "D\u0000\u031c\u031d\u0007\u000b\u0000\u0000\u031d\u031f\u0003\u0088D\u0000" +
                    "\u031e\u031c\u0001\u0000\u0000\u0000\u031f\u0322\u0001\u0000\u0000\u0000" +
                    "\u0320\u031e\u0001\u0000\u0000\u0000\u0320\u0321\u0001\u0000\u0000\u0000" +
                    "\u0321\u0087\u0001\u0000\u0000\u0000\u0322\u0320\u0001\u0000\u0000\u0000" +
                    "\u0323\u0329\u0003\u00e2q\u0000\u0324\u0325\u0005\u000f\u0000\u0000\u0325" +
                    "\u0326\u0003\u0082A\u0000\u0326\u0327\u0005\u0010\u0000\u0000\u0327\u0329" +
                    "\u0001\u0000\u0000\u0000\u0328\u0323\u0001\u0000\u0000\u0000\u0328\u0324" +
                    "\u0001\u0000\u0000\u0000\u0329\u0089\u0001\u0000\u0000\u0000\u032a\u032e" +
                    "\u0003\u008cF\u0000\u032b\u032c\u0003\u009eO\u0000\u032c\u032d\u0003\u008c" +
                    "F\u0000\u032d\u032f\u0001\u0000\u0000\u0000\u032e\u032b\u0001\u0000\u0000" +
                    "\u0000\u032e\u032f\u0001\u0000\u0000\u0000\u032f\u008b\u0001\u0000\u0000" +
                    "\u0000\u0330\u0334\u0003\u008eG\u0000\u0331\u0334\u0003\u009aM\u0000\u0332" +
                    "\u0334\u0003\u009cN\u0000\u0333\u0330\u0001\u0000\u0000\u0000\u0333\u0331" +
                    "\u0001\u0000\u0000\u0000\u0333\u0332\u0001\u0000\u0000\u0000\u0334\u008d" +
                    "\u0001\u0000\u0000\u0000\u0335\u033b\u0003\u0094J\u0000\u0336\u033b\u0003" +
                    "\u0090H\u0000\u0337\u033b\u0003\u0092I\u0000\u0338\u033b\u0003\u0096K" +
                    "\u0000\u0339\u033b\u0003\u0098L\u0000\u033a\u0335\u0001\u0000\u0000\u0000" +
                    "\u033a\u0336\u0001\u0000\u0000\u0000\u033a\u0337\u0001\u0000\u0000\u0000" +
                    "\u033a\u0338\u0001\u0000\u0000\u0000\u033a\u0339\u0001\u0000\u0000\u0000" +
                    "\u033b\u008f\u0001\u0000\u0000\u0000\u033c\u0342\u0005$\u0000\u0000\u033d" +
                    "\u033e\u0005%\u0000\u0000\u033e\u0341\t\u0000\u0000\u0000\u033f\u0341" +
                    "\b\f\u0000\u0000\u0340\u033d\u0001\u0000\u0000\u0000\u0340\u033f\u0001" +
                    "\u0000\u0000\u0000\u0341\u0344\u0001\u0000\u0000\u0000\u0342\u0340\u0001" +
                    "\u0000\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000\u0343\u0345\u0001" +
                    "\u0000\u0000\u0000\u0344\u0342\u0001\u0000\u0000\u0000\u0345\u0351\u0005" +
                    "$\u0000\u0000\u0346\u034c\u0005&\u0000\u0000\u0347\u0348\u0005%\u0000" +
                    "\u0000\u0348\u034b\t\u0000\u0000\u0000\u0349\u034b\b\r\u0000\u0000\u034a" +
                    "\u0347\u0001\u0000\u0000\u0000\u034a\u0349\u0001\u0000\u0000\u0000\u034b" +
                    "\u034e\u0001\u0000\u0000\u0000\u034c\u034a\u0001\u0000\u0000\u0000\u034c" +
                    "\u034d\u0001\u0000\u0000\u0000\u034d\u034f\u0001\u0000\u0000\u0000\u034e" +
                    "\u034c\u0001\u0000\u0000\u0000\u034f\u0351\u0005&\u0000\u0000\u0350\u033c" +
                    "\u0001\u0000\u0000\u0000\u0350\u0346\u0001\u0000\u0000\u0000\u0351\u0091" +
                    "\u0001\u0000\u0000\u0000\u0352\u0353\u0007\u000e\u0000\u0000\u0353\u0093" +
                    "\u0001\u0000\u0000\u0000\u0354\u0355\u0005\u007f\u0000\u0000\u0355\u0095" +
                    "\u0001\u0000\u0000\u0000\u0356\u0358\u0007\n\u0000\u0000\u0357\u0356\u0001" +
                    "\u0000\u0000\u0000\u0357\u0358\u0001\u0000\u0000\u0000\u0358\u0360\u0001" +
                    "\u0000\u0000\u0000\u0359\u035a\u0003\u0094J\u0000\u035a\u035c\u0005[\u0000" +
                    "\u0000\u035b\u035d\u0003\u0094J\u0000\u035c\u035b\u0001\u0000\u0000\u0000" +
                    "\u035c\u035d\u0001\u0000\u0000\u0000\u035d\u0361\u0001\u0000\u0000\u0000" +
                    "\u035e\u035f\u0005[\u0000\u0000\u035f\u0361\u0003\u0094J\u0000\u0360\u0359" +
                    "\u0001\u0000\u0000\u0000\u0360\u035e\u0001\u0000\u0000\u0000\u0361\u0097" +
                    "\u0001\u0000\u0000\u0000\u0362\u0364\u0007\n\u0000\u0000\u0363\u0362\u0001" +
                    "\u0000\u0000\u0000\u0363\u0364\u0001\u0000\u0000\u0000\u0364\u036c\u0001" +
                    "\u0000\u0000\u0000\u0365\u0366\u0003\u0094J\u0000\u0366\u0368\u0005[\u0000" +
                    "\u0000\u0367\u0369\u0003\u0094J\u0000\u0368\u0367\u0001\u0000\u0000\u0000" +
                    "\u0368\u0369\u0001\u0000\u0000\u0000\u0369\u036d\u0001\u0000\u0000\u0000" +
                    "\u036a\u036b\u0005[\u0000\u0000\u036b\u036d\u0003\u0094J\u0000\u036c\u0365" +
                    "\u0001\u0000\u0000\u0000\u036c\u036a\u0001\u0000\u0000\u0000\u036d\u0099" +
                    "\u0001\u0000\u0000\u0000\u036e\u0372\u0005\u0080\u0000\u0000\u036f\u0370" +
                    "\u0003\u00a0P\u0000\u0370\u0371\u0003\u009aM\u0000\u0371\u0373\u0001\u0000" +
                    "\u0000\u0000\u0372\u036f\u0001\u0000\u0000\u0000\u0372\u0373\u0001\u0000" +
                    "\u0000\u0000\u0373\u009b\u0001\u0000\u0000\u0000\u0374\u0375\u0006N\uffff" +
                    "\uffff\u0000\u0375\u0390\u0003\u009aM\u0000\u0376\u0390\u0003\u00e2q\u0000" +
                    "\u0377\u0378\u0005\u000f\u0000\u0000\u0378\u0379\u0003\u009cN\u0000\u0379" +
                    "\u037a\u0005\"\u0000\u0000\u037a\u037b\u0003\u009cN\u0000\u037b\u037c" +
                    "\u0005\u0010\u0000\u0000\u037c\u0390\u0001\u0000\u0000\u0000\u037d\u037e" +
                    "\u0005\u000f\u0000\u0000\u037e\u037f\u0003\u009cN\u0000\u037f\u0380\u0005" +
                    "#\u0000\u0000\u0380\u0381\u0003\u009cN\u0000\u0381\u0382\u0005\u0010\u0000" +
                    "\u0000\u0382\u0390\u0001\u0000\u0000\u0000\u0383\u0384\u0005\u000f\u0000" +
                    "\u0000\u0384\u0385\u0003\u009cN\u0000\u0385\u0386\u0005\u001f\u0000\u0000" +
                    "\u0386\u0387\u0003\u009cN\u0000\u0387\u0388\u0005\u0010\u0000\u0000\u0388" +
                    "\u0390\u0001\u0000\u0000\u0000\u0389\u038a\u0005\u000f\u0000\u0000\u038a" +
                    "\u038b\u0003\u009cN\u0000\u038b\u038c\u0005 \u0000\u0000\u038c\u038d\u0003" +
                    "\u009cN\u0000\u038d\u038e\u0005\u0010\u0000\u0000\u038e\u0390\u0001\u0000" +
                    "\u0000\u0000\u038f\u0374\u0001\u0000\u0000\u0000\u038f\u0376\u0001\u0000" +
                    "\u0000\u0000\u038f\u0377\u0001\u0000\u0000\u0000\u038f\u037d\u0001\u0000" +
                    "\u0000\u0000\u038f\u0383\u0001\u0000\u0000\u0000\u038f\u0389\u0001\u0000" +
                    "\u0000\u0000\u0390\u039f\u0001\u0000\u0000\u0000\u0391\u0392\n\u0007\u0000" +
                    "\u0000\u0392\u0393\u0005\"\u0000\u0000\u0393\u039e\u0003\u009cN\b\u0394" +
                    "\u0395\n\u0005\u0000\u0000\u0395\u0396\u0005#\u0000\u0000\u0396\u039e" +
                    "\u0003\u009cN\u0006\u0397\u0398\n\u0003\u0000\u0000\u0398\u0399\u0005" +
                    "\u001f\u0000\u0000\u0399\u039e\u0003\u009cN\u0004\u039a\u039b\n\u0001" +
                    "\u0000\u0000\u039b\u039c\u0005 \u0000\u0000\u039c\u039e\u0003\u009cN\u0002" +
                    "\u039d\u0391\u0001\u0000\u0000\u0000\u039d\u0394\u0001\u0000\u0000\u0000" +
                    "\u039d\u0397\u0001\u0000\u0000\u0000\u039d\u039a\u0001\u0000\u0000\u0000" +
                    "\u039e\u03a1\u0001\u0000\u0000\u0000\u039f\u039d\u0001\u0000\u0000\u0000" +
                    "\u039f\u03a0\u0001\u0000\u0000\u0000\u03a0\u009d\u0001\u0000\u0000\u0000" +
                    "\u03a1\u039f\u0001\u0000\u0000\u0000\u03a2\u03ab\u0005\u0007\u0000\u0000" +
                    "\u03a3\u03ab\u0005!\u0000\u0000\u03a4\u03ab\u0005\'\u0000\u0000\u03a5" +
                    "\u03ab\u0005(\u0000\u0000\u03a6\u03ab\u0005)\u0000\u0000\u03a7\u03ab\u0005" +
                    "*\u0000\u0000\u03a8\u03ab\u0005+\u0000\u0000\u03a9\u03ab\u0005\u0015\u0000" +
                    "\u0000\u03aa\u03a2\u0001\u0000\u0000\u0000\u03aa\u03a3\u0001\u0000\u0000" +
                    "\u0000\u03aa\u03a4\u0001\u0000\u0000\u0000\u03aa\u03a5\u0001\u0000\u0000" +
                    "\u0000\u03aa\u03a6\u0001\u0000\u0000\u0000\u03aa\u03a7\u0001\u0000\u0000" +
                    "\u0000\u03aa\u03a8\u0001\u0000\u0000\u0000\u03aa\u03a9\u0001\u0000\u0000" +
                    "\u0000\u03ab\u009f\u0001\u0000\u0000\u0000\u03ac\u03ad\u0005,\u0000\u0000" +
                    "\u03ad\u00a1\u0001\u0000\u0000\u0000\u03ae\u03af\u0005f\u0000\u0000\u03af" +
                    "\u03b0\u0003\u009aM\u0000\u03b0\u03b1\u0005-\u0000\u0000\u03b1\u03b2\u0005" +
                    "\u0080\u0000\u0000\u03b2\u03c6\u0001\u0000\u0000\u0000\u03b3\u03b6\u0005" +
                    "g\u0000\u0000\u03b4\u03b7\u0003\u00a4R\u0000\u03b5\u03b7\u0003\u00a6S" +
                    "\u0000\u03b6\u03b4\u0001\u0000\u0000\u0000\u03b6\u03b5\u0001\u0000\u0000" +
                    "\u0000\u03b7\u03c6\u0001\u0000\u0000\u0000\u03b8\u03bb\u0005h\u0000\u0000" +
                    "\u03b9\u03bc\u0003\u00a4R\u0000\u03ba\u03bc\u0003\u00a6S\u0000\u03bb\u03b9" +
                    "\u0001\u0000\u0000\u0000\u03bb\u03ba\u0001\u0000\u0000\u0000\u03bc\u03c6" +
                    "\u0001\u0000\u0000\u0000\u03bd\u03c0\u0005i\u0000\u0000\u03be\u03c1\u0003" +
                    "\u00a4R\u0000\u03bf\u03c1\u0003\u00a6S\u0000\u03c0\u03be\u0001\u0000\u0000" +
                    "\u0000\u03c0\u03bf\u0001\u0000\u0000\u0000\u03c1\u03c2\u0001\u0000\u0000" +
                    "\u0000\u03c2\u03c3\u0005-\u0000\u0000\u03c3\u03c4\u0003\u001e\u000f\u0000" +
                    "\u03c4\u03c6\u0001\u0000\u0000\u0000\u03c5\u03ae\u0001\u0000\u0000\u0000" +
                    "\u03c5\u03b3\u0001\u0000\u0000\u0000\u03c5\u03b8\u0001\u0000\u0000\u0000" +
                    "\u03c5\u03bd\u0001\u0000\u0000\u0000\u03c6\u00a3\u0001\u0000\u0000\u0000" +
                    "\u03c7\u03c9\u0005.\u0000\u0000\u03c8\u03c7\u0001\u0000\u0000\u0000\u03c8" +
                    "\u03c9\u0001\u0000\u0000\u0000\u03c9\u03cb\u0001\u0000\u0000\u0000\u03ca" +
                    "\u03cc\u0005/\u0000\u0000\u03cb\u03ca\u0001\u0000\u0000\u0000\u03cb\u03cc" +
                    "\u0001\u0000\u0000\u0000\u03cc\u03ce\u0001\u0000\u0000\u0000\u03cd\u03cf" +
                    "\u0005\u0080\u0000\u0000\u03ce\u03cd\u0001\u0000\u0000\u0000\u03ce\u03cf" +
                    "\u0001\u0000\u0000\u0000\u03cf\u03d3\u0001\u0000\u0000\u0000\u03d0\u03d1" +
                    "\u0003\u009eO\u0000\u03d1\u03d2\u0005\u0080\u0000\u0000\u03d2\u03d4\u0001" +
                    "\u0000\u0000\u0000\u03d3\u03d0\u0001\u0000\u0000\u0000\u03d3\u03d4\u0001" +
                    "\u0000\u0000\u0000\u03d4\u03d8\u0001\u0000\u0000\u0000\u03d5\u03d6\u0003" +
                    "N\'\u0000\u03d6\u03d7\u0003\u00a4R\u0000\u03d7\u03d9\u0001\u0000\u0000" +
                    "\u0000\u03d8\u03d5\u0001\u0000\u0000\u0000\u03d8\u03d9\u0001\u0000\u0000" +
                    "\u0000\u03d9\u03dc\u0001\u0000\u0000\u0000\u03da\u03dc\u0003\u009cN\u0000" +
                    "\u03db\u03c8\u0001\u0000\u0000\u0000\u03db\u03da\u0001\u0000\u0000\u0000" +
                    "\u03dc\u00a5\u0001\u0000\u0000\u0000\u03dd\u03e1\u0005.\u0000\u0000\u03de" +
                    "\u03e2\u0005G\u0000\u0000\u03df\u03e2\u0003\u0096K\u0000\u03e0\u03e2\u0003" +
                    "\u0098L\u0000\u03e1\u03de\u0001\u0000\u0000\u0000\u03e1\u03df\u0001\u0000" +
                    "\u0000\u0000\u03e1\u03e0\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001\u0000" +
                    "\u0000\u0000\u03e3\u03e4\u0005t\u0000\u0000\u03e4\u03e5\u0005\u0080\u0000" +
                    "\u0000\u03e5\u00a7\u0001\u0000\u0000\u0000\u03e6\u03e8\u0003\u00ecv\u0000" +
                    "\u03e7\u03e6\u0001\u0000\u0000\u0000\u03e8\u03eb\u0001\u0000\u0000\u0000" +
                    "\u03e9\u03e7\u0001\u0000\u0000\u0000\u03e9\u03ea\u0001\u0000\u0000\u0000" +
                    "\u03ea\u03ef\u0001\u0000\u0000\u0000\u03eb\u03e9\u0001\u0000\u0000\u0000" +
                    "\u03ec\u03f0\u0003\u00aaU\u0000\u03ed\u03f0\u0003\u00b6[\u0000\u03ee\u03f0" +
                    "\u0003\u00c0`\u0000\u03ef\u03ec\u0001\u0000\u0000\u0000\u03ef\u03ed\u0001" +
                    "\u0000\u0000\u0000\u03ef\u03ee\u0001\u0000\u0000\u0000\u03f0\u00a9\u0001" +
                    "\u0000\u0000\u0000\u03f1\u03f2\u0005V\u0000\u0000\u03f2\u03f3\u0005W\u0000" +
                    "\u0000\u03f3\u03f4\u0003\u00e4r\u0000\u03f4\u03f8\u0005Z\u0000\u0000\u03f5" +
                    "\u03f7\u0003|>\u0000\u03f6\u03f5\u0001\u0000\u0000\u0000\u03f7\u03fa\u0001" +
                    "\u0000\u0000\u0000\u03f8\u03f6\u0001\u0000\u0000\u0000\u03f8\u03f9\u0001" +
                    "\u0000\u0000\u0000\u03f9\u03fe\u0001\u0000\u0000\u0000\u03fa\u03f8\u0001" +
                    "\u0000\u0000\u0000\u03fb\u03fd\u0003\u00acV\u0000\u03fc\u03fb\u0001\u0000" +
                    "\u0000\u0000\u03fd\u0400\u0001\u0000\u0000\u0000\u03fe\u03fc\u0001\u0000" +
                    "\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u00ab\u0001\u0000" +
                    "\u0000\u0000\u0400\u03fe\u0001\u0000\u0000\u0000\u0401\u0402\u0003\u00b0" +
                    "X\u0000\u0402\u0403\u0003\u00aeW\u0000\u0403\u0404\u0003\u00b2Y\u0000" +
                    "\u0404\u00ad\u0001\u0000\u0000\u0000\u0405\u0406\u0007\u000f\u0000\u0000" +
                    "\u0406\u00af\u0001\u0000\u0000\u0000\u0407\u040a\u0003\u001a\r\u0000\u0408" +
                    "\u040a\u0003\u001c\u000e\u0000\u0409\u0407\u0001\u0000\u0000\u0000\u0409" +
                    "\u0408\u0001\u0000\u0000\u0000\u040a\u00b1\u0001\u0000\u0000\u0000\u040b" +
                    "\u040c\u0003\u00b4Z\u0000\u040c\u040d\u0005\u0007\u0000\u0000\u040d\u040e" +
                    "\u00052\u0000\u0000\u040e\u0413\u0005\u0080\u0000\u0000\u040f\u0410\u0005" +
                    "\u0001\u0000\u0000\u0410\u0412\u0005\u0080\u0000\u0000\u0411\u040f\u0001" +
                    "\u0000\u0000\u0000\u0412\u0415\u0001\u0000\u0000\u0000\u0413\u0411\u0001" +
                    "\u0000\u0000\u0000\u0413\u0414\u0001\u0000\u0000\u0000\u0414\u0416\u0001" +
                    "\u0000\u0000\u0000\u0415\u0413\u0001\u0000\u0000\u0000\u0416\u0417\u0005" +
                    "3\u0000\u0000\u0417\u00b3\u0001\u0000\u0000\u0000\u0418\u0419\u0005\u0080" +
                    "\u0000\u0000\u0419\u00b5\u0001\u0000\u0000\u0000\u041a\u041c\u0003\u00b8" +
                    "\\\u0000\u041b\u041d\u0003D\"\u0000\u041c\u041b\u0001\u0000\u0000\u0000" +
                    "\u041c\u041d\u0001\u0000\u0000\u0000\u041d\u041f\u0001\u0000\u0000\u0000" +
                    "\u041e\u0420\u0003F#\u0000\u041f\u041e\u0001\u0000\u0000\u0000\u041f\u0420" +
                    "\u0001\u0000\u0000\u0000\u0420\u0422\u0001\u0000\u0000\u0000\u0421\u0423" +
                    "\u0003H$\u0000\u0422\u0421\u0001\u0000\u0000\u0000\u0422\u0423\u0001\u0000" +
                    "\u0000\u0000\u0423\u00b7\u0001\u0000\u0000\u0000\u0424\u0425\u0005W\u0000" +
                    "\u0000\u0425\u0426\u0003\u00e4r\u0000\u0426\u0427\u0005Z\u0000\u0000\u0427" +
                    "\u0428\u0003\u001a\r\u0000\u0428\u0429\u0003\u00ba]\u0000\u0429\u042a" +
                    "\u0003<\u001e\u0000\u042a\u00b9\u0001\u0000\u0000\u0000\u042b\u042f\u0003" +
                    "\u00be_\u0000\u042c\u042f\u0003\u00bc^\u0000\u042d\u042f\u0005]\u0000" +
                    "\u0000\u042e\u042b\u0001\u0000\u0000\u0000\u042e\u042c\u0001\u0000\u0000" +
                    "\u0000\u042e\u042d\u0001\u0000\u0000\u0000\u042f\u00bb\u0001\u0000\u0000" +
                    "\u0000\u0430\u0431\u0005^\u0000\u0000\u0431\u0432\u00054\u0000\u0000\u0432" +
                    "\u0433\u0005R\u0000\u0000\u0433\u00bd\u0001\u0000\u0000\u0000\u0434\u0435" +
                    "\u0005\\\u0000\u0000\u0435\u0436\u00055\u0000\u0000\u0436\u0437\u0005" +
                    "S\u0000\u0000\u0437\u00bf\u0001\u0000\u0000\u0000\u0438\u043a\u0003\u00c2" +
                    "a\u0000\u0439\u043b\u0003D\"\u0000\u043a\u0439\u0001\u0000\u0000\u0000" +
                    "\u043a\u043b\u0001\u0000\u0000\u0000\u043b\u043d\u0001\u0000\u0000\u0000" +
                    "\u043c\u043e\u0003F#\u0000\u043d\u043c\u0001\u0000\u0000\u0000\u043d\u043e" +
                    "\u0001\u0000\u0000\u0000\u043e\u0440\u0001\u0000\u0000\u0000\u043f\u0441" +
                    "\u0003H$\u0000\u0440\u043f\u0001\u0000\u0000\u0000\u0440\u0441\u0001\u0000" +
                    "\u0000\u0000\u0441\u00c1\u0001\u0000\u0000\u0000\u0442\u0443\u0005X\u0000" +
                    "\u0000\u0443\u0444\u0005W\u0000\u0000\u0444\u0446\u0003\u00e4r\u0000\u0445" +
                    "\u0447\u00034\u001a\u0000\u0446\u0445\u0001\u0000\u0000\u0000\u0446\u0447" +
                    "\u0001\u0000\u0000\u0000\u0447\u0448\u0001\u0000\u0000\u0000\u0448\u0449" +
                    "\u0005Z\u0000\u0000\u0449\u044a\u0003\u001a\r\u0000\u044a\u044b\u0003" +
                    "\u00ba]\u0000\u044b\u044c\u0003<\u001e\u0000\u044c\u00c3\u0001\u0000\u0000" +
                    "\u0000\u044d\u044e\u0003\u00c6c\u0000\u044e\u044f\u0003\u00c8d\u0000\u044f" +
                    "\u00c5\u0001\u0000\u0000\u0000\u0450\u0451\u0003\u00d6k\u0000\u0451\u0452" +
                    "\u0003\u00dam\u0000\u0452\u0454\u0005z\u0000\u0000\u0453\u0455\u0005\u0080" +
                    "\u0000\u0000\u0454\u0453\u0001\u0000\u0000\u0000\u0455\u0456\u0001\u0000" +
                    "\u0000\u0000\u0456\u0454\u0001\u0000\u0000\u0000\u0456\u0457\u0001\u0000" +
                    "\u0000\u0000\u0457\u0458\u0001\u0000\u0000\u0000\u0458\u0459\u0005Z\u0000" +
                    "\u0000\u0459\u00c7\u0001\u0000\u0000\u0000\u045a\u045b\u0003\u00cae\u0000" +
                    "\u045b\u045c\u0003\u00ceg\u0000\u045c\u045d\u0003\u00d2i\u0000\u045d\u00c9" +
                    "\u0001\u0000\u0000\u0000\u045e\u045f\u0003\u001a\r\u0000\u045f\u046c\u0003" +
                    "\u00ccf\u0000\u0460\u0461\u0005y\u0000\u0000\u0461\u0462\u00052\u0000" +
                    "\u0000\u0462\u0467\u0003\u00d8l\u0000\u0463\u0464\u0005\u0001\u0000\u0000" +
                    "\u0464\u0466\u0003\u00d8l\u0000\u0465\u0463\u0001\u0000\u0000\u0000\u0466" +
                    "\u0469\u0001\u0000\u0000\u0000\u0467\u0465\u0001\u0000\u0000\u0000\u0467" +
                    "\u0468\u0001\u0000\u0000\u0000\u0468\u046a\u0001\u0000\u0000\u0000\u0469" +
                    "\u0467\u0001\u0000\u0000\u0000\u046a\u046b\u00053\u0000\u0000\u046b\u046d" +
                    "\u0001\u0000\u0000\u0000\u046c\u0460\u0001\u0000\u0000\u0000\u046c\u046d" +
                    "\u0001\u0000\u0000\u0000\u046d\u00cb\u0001\u0000\u0000\u0000\u046e\u046f" +
                    "\u00056\u0000\u0000\u046f\u0470\u00057\u0000\u0000\u0470\u0471\u0005S" +
                    "\u0000\u0000\u0471\u00cd\u0001\u0000\u0000\u0000\u0472\u0473\u0003\u00d0" +
                    "h\u0000\u0473\u0474\u0005y\u0000\u0000\u0474\u0475\u00052\u0000\u0000" +
                    "\u0475\u047a\u0003\u00deo\u0000\u0476\u0477\u0005\u0001\u0000\u0000\u0477" +
                    "\u0479\u0003\u00deo\u0000\u0478\u0476\u0001\u0000\u0000\u0000\u0479\u047c" +
                    "\u0001\u0000\u0000\u0000\u047a\u0478\u0001\u0000\u0000\u0000\u047a\u047b" +
                    "\u0001\u0000\u0000\u0000\u047b\u047d\u0001\u0000\u0000\u0000\u047c\u047a" +
                    "\u0001\u0000\u0000\u0000\u047d\u047e\u00053\u0000\u0000\u047e\u00cf\u0001" +
                    "\u0000\u0000\u0000\u047f\u0480\u00058\u0000\u0000\u0480\u0481\u00057\u0000" +
                    "\u0000\u0481\u0482\u00059\u0000\u0000\u0482\u00d1\u0001\u0000\u0000\u0000" +
                    "\u0483\u0484\u0003\u00d4j\u0000\u0484\u0485\u00052\u0000\u0000\u0485\u048a" +
                    "\u0003\u00dcn\u0000\u0486\u0487\u0005\u0001\u0000\u0000\u0487\u0489\u0003" +
                    "\u00dcn\u0000\u0488\u0486\u0001\u0000\u0000\u0000\u0489\u048c\u0001\u0000" +
                    "\u0000\u0000\u048a\u0488\u0001\u0000\u0000\u0000\u048a\u048b\u0001\u0000" +
                    "\u0000\u0000\u048b\u048d\u0001\u0000\u0000\u0000\u048c\u048a\u0001\u0000" +
                    "\u0000\u0000\u048d\u048e\u00053\u0000\u0000\u048e\u00d3\u0001\u0000\u0000" +
                    "\u0000\u048f\u0490\u0005:\u0000\u0000\u0490\u0491\u0005-\u0000\u0000\u0491" +
                    "\u00d5\u0001\u0000\u0000\u0000\u0492\u0493\u0005;\u0000\u0000\u0493\u0494" +
                    "\u0005t\u0000\u0000\u0494\u00d7\u0001\u0000\u0000\u0000\u0495\u0496\u0005" +
                    "\u0080\u0000\u0000\u0496\u00d9\u0001\u0000\u0000\u0000\u0497\u0498\u0005" +
                    "\u0080\u0000\u0000\u0498\u00db\u0001\u0000\u0000\u0000\u0499\u049a\u0005" +
                    "\u0080\u0000\u0000\u049a\u00dd\u0001\u0000\u0000\u0000\u049b\u049c\u0005" +
                    "\u0080\u0000\u0000\u049c\u00df\u0001\u0000\u0000\u0000\u049d\u049e\u0005" +
                    "u\u0000\u0000\u049e\u049f\u0005v\u0000\u0000\u049f\u04a0\u0005\u0005\u0000" +
                    "\u0000\u04a0\u04a1\u0005<\u0000\u0000\u04a1\u04a8\u0005Z\u0000\u0000\u04a2" +
                    "\u04a5\u0003\u00f2y\u0000\u04a3\u04a5\u0003\u00e2q\u0000\u04a4\u04a2\u0001" +
                    "\u0000\u0000\u0000\u04a4\u04a3\u0001\u0000\u0000\u0000\u04a5\u04a6\u0001" +
                    "\u0000\u0000\u0000\u04a6\u04a7\u0005\u0001\u0000\u0000\u04a7\u04a9\u0001" +
                    "\u0000\u0000\u0000\u04a8\u04a4\u0001\u0000\u0000\u0000\u04a8\u04a9\u0001" +
                    "\u0000\u0000\u0000\u04a9\u04aa\u0001\u0000\u0000\u0000\u04aa\u04ab\u0005" +
                    "=\u0000\u0000\u04ab\u04b2\u0005Z\u0000\u0000\u04ac\u04b0\u0003\u00f2y" +
                    "\u0000\u04ad\u04b0\u0003\u00e2q\u0000\u04ae\u04b0\u0005F\u0000\u0000\u04af" +
                    "\u04ac\u0001\u0000\u0000\u0000\u04af\u04ad\u0001\u0000\u0000\u0000\u04af" +
                    "\u04ae\u0001\u0000\u0000\u0000\u04b0\u04b1\u0001\u0000\u0000\u0000\u04b1" +
                    "\u04b3\u0005\u0001\u0000\u0000\u04b2\u04af\u0001\u0000\u0000\u0000\u04b2" +
                    "\u04b3\u0001\u0000\u0000\u0000\u04b3\u04b4\u0001\u0000\u0000\u0000\u04b4" +
                    "\u04b5\u0005>\u0000\u0000\u04b5\u04b9\u0005Z\u0000\u0000\u04b6\u04ba\u0003" +
                    "\u00f2y\u0000\u04b7\u04ba\u0003\u00e2q\u0000\u04b8\u04ba\u0005F\u0000" +
                    "\u0000\u04b9\u04b6\u0001\u0000\u0000\u0000\u04b9\u04b7\u0001\u0000\u0000" +
                    "\u0000\u04b9\u04b8\u0001\u0000\u0000\u0000\u04b9\u04ba\u0001\u0000\u0000" +
                    "\u0000\u04ba\u04bb\u0001\u0000\u0000\u0000\u04bb\u04bc\u0005\u0006\u0000" +
                    "\u0000\u04bc\u00e1\u0001\u0000\u0000\u0000\u04bd\u04c6\u0005\u007f\u0000" +
                    "\u0000\u04be\u04c6\u0003\u00e6s\u0000\u04bf\u04c6\u0005\u0080\u0000\u0000" +
                    "\u04c0\u04c6\u0005~\u0000\u0000\u04c1\u04c6\u0003\u00eew\u0000\u04c2\u04c6" +
                    "\u0005|\u0000\u0000\u04c3\u04c6\u0005n\u0000\u0000\u04c4\u04c6\u0005m" +
                    "\u0000\u0000\u04c5\u04bd\u0001\u0000\u0000\u0000\u04c5\u04be\u0001\u0000" +
                    "\u0000\u0000\u04c5\u04bf\u0001\u0000\u0000\u0000\u04c5\u04c0\u0001\u0000" +
                    "\u0000\u0000\u04c5\u04c1\u0001\u0000\u0000\u0000\u04c5\u04c2\u0001\u0000" +
                    "\u0000\u0000\u04c5\u04c3\u0001\u0000\u0000\u0000\u04c5\u04c4\u0001\u0000" +
                    "\u0000\u0000\u04c6\u00e3\u0001\u0000\u0000\u0000\u04c7\u04ca\u0005\u007f" +
                    "\u0000\u0000\u04c8\u04ca\u0005{\u0000\u0000\u04c9\u04c7\u0001\u0000\u0000" +
                    "\u0000\u04c9\u04c8\u0001\u0000\u0000\u0000\u04ca\u00e5\u0001\u0000\u0000" +
                    "\u0000\u04cb\u04cc\u0005\u007f\u0000\u0000\u04cc\u04cd\u0005[\u0000\u0000" +
                    "\u04cd\u04d3\u0005\u007f\u0000\u0000\u04ce\u04cf\u0005[\u0000\u0000\u04cf" +
                    "\u04d3\u0005\u007f\u0000\u0000\u04d0\u04d1\u0005\u007f\u0000\u0000\u04d1" +
                    "\u04d3\u0005[\u0000\u0000\u04d2\u04cb\u0001\u0000\u0000\u0000\u04d2\u04ce" +
                    "\u0001\u0000\u0000\u0000\u04d2\u04d0\u0001\u0000\u0000\u0000\u04d3\u00e7" +
                    "\u0001\u0000\u0000\u0000\u04d4\u04d5\u00052\u0000\u0000\u04d5\u04da\u0003" +
                    "\u00eau\u0000\u04d6\u04d7\u0005\u0001\u0000\u0000\u04d7\u04d9\u0003\u00ea" +
                    "u\u0000\u04d8\u04d6\u0001\u0000\u0000\u0000\u04d9\u04dc\u0001\u0000\u0000" +
                    "\u0000\u04da\u04d8\u0001\u0000\u0000\u0000\u04da\u04db\u0001\u0000\u0000" +
                    "\u0000\u04db\u04dd\u0001\u0000\u0000\u0000\u04dc\u04da\u0001\u0000\u0000" +
                    "\u0000\u04dd\u04de\u00053\u0000\u0000\u04de\u00e9\u0001\u0000\u0000\u0000" +
                    "\u04df\u04e0\u0005\u0005\u0000\u0000\u04e0\u04e5\u0003\u0016\u000b\u0000" +
                    "\u04e1\u04e2\u0005\u0001\u0000\u0000\u04e2\u04e4\u0003\u0016\u000b\u0000" +
                    "\u04e3\u04e1\u0001\u0000\u0000\u0000\u04e4\u04e7\u0001\u0000\u0000\u0000" +
                    "\u04e5\u04e3\u0001\u0000\u0000\u0000\u04e5\u04e6\u0001\u0000\u0000\u0000" +
                    "\u04e6\u04e8\u0001\u0000\u0000\u0000\u04e7\u04e5\u0001\u0000\u0000\u0000" +
                    "\u04e8\u04e9\u0005\u0006\u0000\u0000\u04e9\u00eb\u0001\u0000\u0000\u0000" +
                    "\u04ea\u04eb\u0005H\u0000\u0000\u04eb\u00ed\u0001\u0000\u0000\u0000\u04ec" +
                    "\u04ed\u0005\u007f\u0000\u0000\u04ed\u04ee\u0005 \u0000\u0000\u04ee\u04ef" +
                    "\u0005\u007f\u0000\u0000\u04ef\u04f0\u0005 \u0000\u0000\u04f0\u04f1\u0005" +
                    "\u007f\u0000\u0000\u04f1\u04f2\u0005\u007f\u0000\u0000\u04f2\u04f3\u0005" +
                    "Z\u0000\u0000\u04f3\u04f4\u0005\u007f\u0000\u0000\u04f4\u04f5\u0005Z\u0000" +
                    "\u0000\u04f5\u04f6\u0005\u007f\u0000\u0000\u04f6\u00ef\u0001\u0000\u0000" +
                    "\u0000\u04f7\u04fd\u0005~\u0000\u0000\u04f8\u04fd\u0005\u007f\u0000\u0000" +
                    "\u04f9\u04fd\u0003\u00f2y\u0000\u04fa\u04fd\u0003\u00f4z\u0000\u04fb\u04fd" +
                    "\u0003\u00f6{\u0000\u04fc\u04f7\u0001\u0000\u0000\u0000\u04fc\u04f8\u0001" +
                    "\u0000\u0000\u0000\u04fc\u04f9\u0001\u0000\u0000\u0000\u04fc\u04fa\u0001" +
                    "\u0000\u0000\u0000\u04fc\u04fb\u0001\u0000\u0000\u0000\u04fd\u00f1\u0001" +
                    "\u0000\u0000\u0000\u04fe\u04ff\u0007\u0010\u0000\u0000\u04ff\u00f3\u0001" +
                    "\u0000\u0000\u0000\u0500\u0501\u0005\u0005\u0000\u0000\u0501\u0506\u0003" +
                    "\u00f8|\u0000\u0502\u0503\u0005\u0001\u0000\u0000\u0503\u0505\u0003\u00f8" +
                    "|\u0000\u0504\u0502\u0001\u0000\u0000\u0000\u0505\u0508\u0001\u0000\u0000" +
                    "\u0000\u0506\u0504\u0001\u0000\u0000\u0000\u0506\u0507\u0001\u0000\u0000" +
                    "\u0000\u0507\u0509\u0001\u0000\u0000\u0000\u0508\u0506\u0001\u0000\u0000" +
                    "\u0000\u0509\u050a\u0005\u0006\u0000\u0000\u050a\u050e\u0001\u0000\u0000" +
                    "\u0000\u050b\u050c\u0005\u0005\u0000\u0000\u050c\u050e\u0005\u0006\u0000" +
                    "\u0000\u050d\u0500\u0001\u0000\u0000\u0000\u050d\u050b\u0001\u0000\u0000" +
                    "\u0000\u050e\u00f5\u0001\u0000\u0000\u0000\u050f\u0510\u00052\u0000\u0000" +
                    "\u0510\u0515\u0003\u00f4z\u0000\u0511\u0512\u0005\u0001\u0000\u0000\u0512" +
                    "\u0514\u0003\u00f4z\u0000\u0513\u0511\u0001\u0000\u0000\u0000\u0514\u0517" +
                    "\u0001\u0000\u0000\u0000\u0515\u0513\u0001\u0000\u0000\u0000\u0515\u0516" +
                    "\u0001\u0000\u0000\u0000\u0516\u0518\u0001\u0000\u0000\u0000\u0517\u0515" +
                    "\u0001\u0000\u0000\u0000\u0518\u0519\u00053\u0000\u0000\u0519\u051d\u0001" +
                    "\u0000\u0000\u0000\u051a\u051b\u00052\u0000\u0000\u051b\u051d\u00053\u0000" +
                    "\u0000\u051c\u050f\u0001\u0000\u0000\u0000\u051c\u051a\u0001\u0000\u0000" +
                    "\u0000\u051d\u00f7\u0001\u0000\u0000\u0000\u051e\u051f\u0005\u0080\u0000" +
                    "\u0000\u051f\u0523\u0005Z\u0000\u0000\u0520\u0521\u0005~\u0000\u0000\u0521" +
                    "\u0523\u0005Z\u0000\u0000\u0522\u051e\u0001\u0000\u0000\u0000\u0522\u0520" +
                    "\u0001\u0000\u0000\u0000\u0523\u0524\u0001\u0000\u0000\u0000\u0524\u0525" +
                    "\u0003\u00f0x\u0000\u0525\u00f9\u0001\u0000\u0000\u0000\u0092\u00fb\u0107" +
                    "\u010f\u011a\u011d\u0124\u0131\u0137\u013d\u0143\u0149\u014f\u0155\u0159" +
                    "\u015e\u0164\u016d\u0179\u017e\u0183\u018a\u018d\u0192\u0199\u019d\u01a8" +
                    "\u01b1\u01b9\u01cd\u01d9\u01e1\u01e7\u01eb\u01ee\u01f1\u01f5\u01f8\u01fb" +
                    "\u020a\u0210\u021f\u0226\u0239\u023d\u0243\u0247\u024d\u0254\u0257\u0260" +
                    "\u0265\u0270\u0275\u0279\u027c\u0280\u0282\u0288\u028c\u0290\u0297\u029c" +
                    "\u02a2\u02a7\u02ac\u02b5\u02bc\u02c0\u02ce\u02d1\u02d4\u02e0\u02e5\u02ec" +
                    "\u02f7\u02ff\u0305\u030f\u0318\u0320\u0328\u032e\u0333\u033a\u0340\u0342" +
                    "\u034a\u034c\u0350\u0357\u035c\u0360\u0363\u0368\u036c\u0372\u038f\u039d" +
                    "\u039f\u03aa\u03b6\u03bb\u03c0\u03c5\u03c8\u03cb\u03ce\u03d3\u03d8\u03db" +
                    "\u03e1\u03e9\u03ef\u03f8\u03fe\u0409\u0413\u041c\u041f\u0422\u042e\u043a" +
                    "\u043d\u0440\u0446\u0456\u0467\u046c\u047a\u048a\u04a4\u04a8\u04af\u04b2" +
                    "\u04b9\u04c5\u04c9\u04d2\u04da\u04e5\u04fc\u0506\u050d\u0515\u051c\u0522";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
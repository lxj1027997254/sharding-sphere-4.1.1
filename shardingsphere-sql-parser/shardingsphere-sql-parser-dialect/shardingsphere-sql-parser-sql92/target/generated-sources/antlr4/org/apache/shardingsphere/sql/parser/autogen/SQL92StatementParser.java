// Generated from org\apache\shardingsphere\sql\parser\autogen\SQL92Statement.g4 by ANTLR 4.7.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQL92StatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND_=1, CONCAT_=2, NOT_=3, TILDE_=4, VERTICAL_BAR_=5, AMPERSAND_=6, SIGNED_LEFT_SHIFT_=7, 
		SIGNED_RIGHT_SHIFT_=8, CARET_=9, MOD_=10, COLON_=11, PLUS_=12, MINUS_=13, 
		ASTERISK_=14, SLASH_=15, BACKSLASH_=16, DOT_=17, DOT_ASTERISK_=18, SAFE_EQ_=19, 
		DEQ_=20, EQ_=21, NEQ_=22, GT_=23, GTE_=24, LT_=25, LTE_=26, POUND_=27, 
		LP_=28, RP_=29, LBE_=30, RBE_=31, LBT_=32, RBT_=33, COMMA_=34, DQ_=35, 
		SQ_=36, QUESTION_=37, AT_=38, SEMI_=39, INLINE_COMMENT=40, WS=41, SELECT=42, 
		INSERT=43, UPDATE=44, DELETE=45, CREATE=46, ALTER=47, DROP=48, TRUNCATE=49, 
		SCHEMA=50, GRANT=51, REVOKE=52, ADD=53, SET=54, TABLE=55, COLUMN=56, INDEX=57, 
		CONSTRAINT=58, PRIMARY=59, UNIQUE=60, FOREIGN=61, KEY=62, POSITION=63, 
		PRECISION=64, FUNCTION=65, TRIGGER=66, PROCEDURE=67, VIEW=68, INTO=69, 
		VALUES=70, WITH=71, UNION=72, DISTINCT=73, CASE=74, WHEN=75, CAST=76, 
		TRIM=77, SUBSTRING=78, FROM=79, NATURAL=80, JOIN=81, FULL=82, INNER=83, 
		OUTER=84, LEFT=85, RIGHT=86, CROSS=87, USING=88, WHERE=89, AS=90, ON=91, 
		IF=92, ELSE=93, THEN=94, FOR=95, TO=96, AND=97, OR=98, IS=99, NOT=100, 
		NULL=101, TRUE=102, FALSE=103, EXISTS=104, BETWEEN=105, IN=106, ALL=107, 
		ANY=108, LIKE=109, ORDER=110, GROUP=111, BY=112, ASC=113, DESC=114, HAVING=115, 
		LIMIT=116, OFFSET=117, BEGIN=118, COMMIT=119, ROLLBACK=120, SAVEPOINT=121, 
		BOOLEAN=122, DOUBLE=123, CHAR=124, CHARACTER=125, ARRAY=126, INTERVAL=127, 
		DATE=128, TIME=129, TIMESTAMP=130, LOCALTIME=131, LOCALTIMESTAMP=132, 
		YEAR=133, QUARTER=134, MONTH=135, WEEK=136, DAY=137, HOUR=138, MINUTE=139, 
		SECOND=140, MICROSECOND=141, MAX=142, MIN=143, SUM=144, COUNT=145, AVG=146, 
		DEFAULT=147, CURRENT=148, ENABLE=149, DISABLE=150, CALL=151, INSTANCE=152, 
		PRESERVE=153, DO=154, DEFINER=155, CURRENT_USER=156, SQL=157, CASCADED=158, 
		LOCAL=159, CLOSE=160, OPEN=161, NEXT=162, NAME=163, COLLATION=164, NAMES=165, 
		INTEGER=166, REAL=167, DECIMAL=168, TYPE=169, VARCHAR=170, FLOAT=171, 
		FOR_GENERATOR=172, ADA=173, C92=174, CATALOG_NAME=175, CHARACTER_SET_CATALOG=176, 
		CHARACTER_SET_NAME=177, CHARACTER_SET_SCHEMA=178, CLASS_ORIGIN=179, COBOL=180, 
		COLLATION_CATALOG=181, COLLATION_NAME=182, COLLATION_SCHEMA=183, COLUMN_NAME=184, 
		COMMAND_FUNCTION=185, COMMITTED=186, CONDITION_NUMBER=187, CONNECTION_NAME=188, 
		CONSTRAINT_CATALOG=189, CONSTRAINT_NAME=190, CONSTRAINT_SCHEMA=191, CURSOR_NAME=192, 
		DATA=193, DATETIME_INTERVAL_CODE=194, DATETIME_INTERVAL_PRECISION=195, 
		DYNAMIC_FUNCTION=196, FORTRAN=197, LENGTH=198, MESSAGE_LENGTH=199, MESSAGE_OCTET_LENGTH=200, 
		MESSAGE_TEXT=201, MORE92=202, MUMPS=203, NULLABLE=204, NUMBER=205, PASCAL=206, 
		PLI=207, REPEATABLE=208, RETURNED_LENGTH=209, RETURNED_OCTET_LENGTH=210, 
		RETURNED_SQLSTATE=211, ROW_COUNT=212, SCALE=213, SCHEMA_NAME=214, SERIALIZABLE=215, 
		SERVER_NAME=216, SUBCLASS_ORIGIN=217, TABLE_NAME=218, UNCOMMITTED=219, 
		UNNAMED=220, ABSOLUTE=221, ACTION=222, ALLOCATE=223, ARE=224, ASSERTION=225, 
		AT=226, AUTHORIZATION=227, BIT=228, BIT_LENGTH=229, BOTH=230, CASCADE=231, 
		CATALOG=232, CHAR_LENGTH=233, CHARACTER_LENGTH=234, CHECK=235, COALESCE=236, 
		COLLATE=237, CONNECT=238, CONNECTION=239, CONSTRAINTS=240, CONTINUE=241, 
		CONVERT=242, CORRESPONDING=243, CURRENT_DATE=244, CURRENT_TIME=245, CURRENT_TIMESTAMP=246, 
		CURSOR=247, DEALLOCATE=248, DEC=249, DECLARE=250, DEFERRABLE=251, DEFERRED=252, 
		DESCRIBE=253, DESCRIPTOR=254, DIAGNOSTICS=255, DISCONNECT=256, DOMAIN=257, 
		END=258, END_EXEC=259, ESCAPE=260, EXCEPT=261, EXCEPTION=262, EXEC=263, 
		EXECUTE=264, EXTERNAL=265, EXTRACT=266, FETCH=267, FIRST=268, FOUND=269, 
		GET=270, GLOBAL=271, GO=272, GOTO=273, IDENTITY=274, IMMEDIATE=275, INDICATOR=276, 
		INITIALLY=277, INPUT=278, INSENSITIVE=279, INTERSECT=280, ISOLATION=281, 
		LANGUAGE=282, LAST=283, LEADING=284, LEVEL=285, LOWER=286, MATCH=287, 
		MODULE=288, NATIONAL=289, NCHAR=290, NO=291, NULLIF=292, NUMERIC=293, 
		OCTET_LENGTH=294, OF=295, ONLY=296, OPTION=297, OUTPUT=298, OVERLAPS=299, 
		PAD=300, PARTIAL=301, PREPARE=302, PRIOR=303, PRIVILEGES=304, PUBLIC=305, 
		READ=306, REFERENCES=307, RELATIVE=308, RESTRICT=309, ROWS=310, SCROLL=311, 
		SECTION=312, SESSION=313, SESSION_USER=314, SIZE=315, SMALLINT=316, SOME=317, 
		SPACE=318, SQLCODE=319, SQLERROR=320, SQLSTATE=321, SYSTEM_USER=322, TEMPORARY=323, 
		TIMEZONE_HOUR=324, TIMEZONE_MINUTE=325, TRAILING=326, TRANSACTION=327, 
		TRANSLATE=328, TRANSLATION=329, UNKNOWN=330, UPPER=331, USAGE=332, USER=333, 
		VALUE=334, VARYING=335, WHENEVER=336, WORK=337, WRITE=338, ZONE=339, IDENTIFIER_=340, 
		STRING_=341, NUMBER_=342, HEX_DIGIT_=343, BIT_NUM_=344;
	public static final int
		RULE_execute = 0, RULE_insert = 1, RULE_insertValuesClause = 2, RULE_insertSelectClause = 3, 
		RULE_update = 4, RULE_assignment = 5, RULE_setAssignmentsClause = 6, RULE_assignmentValues = 7, 
		RULE_assignmentValue = 8, RULE_blobValue = 9, RULE_delete = 10, RULE_singleTableClause = 11, 
		RULE_select = 12, RULE_unionClause = 13, RULE_selectClause = 14, RULE_selectSpecification = 15, 
		RULE_duplicateSpecification = 16, RULE_projections = 17, RULE_projection = 18, 
		RULE_alias = 19, RULE_unqualifiedShorthand = 20, RULE_qualifiedShorthand = 21, 
		RULE_fromClause = 22, RULE_tableReferences = 23, RULE_escapedTableReference = 24, 
		RULE_tableReference = 25, RULE_tableFactor = 26, RULE_joinedTable = 27, 
		RULE_joinSpecification = 28, RULE_whereClause = 29, RULE_groupByClause = 30, 
		RULE_havingClause = 31, RULE_limitClause = 32, RULE_limitRowCount = 33, 
		RULE_limitOffset = 34, RULE_subquery = 35, RULE_parameterMarker = 36, 
		RULE_literals = 37, RULE_stringLiterals = 38, RULE_numberLiterals = 39, 
		RULE_dateTimeLiterals = 40, RULE_hexadecimalLiterals = 41, RULE_bitValueLiterals = 42, 
		RULE_booleanLiterals = 43, RULE_nullValueLiterals = 44, RULE_identifier = 45, 
		RULE_unreservedWord = 46, RULE_variable = 47, RULE_schemaName = 48, RULE_tableName = 49, 
		RULE_columnName = 50, RULE_viewName = 51, RULE_owner = 52, RULE_name = 53, 
		RULE_columnNames = 54, RULE_tableNames = 55, RULE_characterSetName_ = 56, 
		RULE_expr = 57, RULE_logicalOperator = 58, RULE_notOperator_ = 59, RULE_booleanPrimary = 60, 
		RULE_comparisonOperator = 61, RULE_predicate = 62, RULE_bitExpr = 63, 
		RULE_simpleExpr = 64, RULE_functionCall = 65, RULE_aggregationFunction = 66, 
		RULE_aggregationFunctionName = 67, RULE_distinct = 68, RULE_specialFunction = 69, 
		RULE_castFunction = 70, RULE_convertFunction = 71, RULE_positionFunction = 72, 
		RULE_substringFunction = 73, RULE_extractFunction = 74, RULE_trimFunction_ = 75, 
		RULE_regularFunction = 76, RULE_regularFunctionName_ = 77, RULE_matchExpression_ = 78, 
		RULE_caseExpression = 79, RULE_caseWhen_ = 80, RULE_caseElse_ = 81, RULE_intervalExpression = 82, 
		RULE_intervalUnit_ = 83, RULE_orderByClause = 84, RULE_orderByItem = 85, 
		RULE_dataType = 86, RULE_dataTypeName = 87, RULE_dataTypeLength = 88, 
		RULE_characterSet_ = 89, RULE_collateClause_ = 90, RULE_ignoredIdentifier_ = 91, 
		RULE_dropBehaviour_ = 92, RULE_createTable = 93, RULE_alterTable = 94, 
		RULE_dropTable = 95, RULE_createDatabase = 96, RULE_dropDatabase = 97, 
		RULE_createView = 98, RULE_dropView = 99, RULE_createTableSpecification_ = 100, 
		RULE_createDefinitionClause = 101, RULE_createDatabaseSpecification_ = 102, 
		RULE_createDefinition = 103, RULE_columnDefinition = 104, RULE_dataTypeOption = 105, 
		RULE_checkConstraintDefinition_ = 106, RULE_referenceDefinition = 107, 
		RULE_referenceOption_ = 108, RULE_keyParts_ = 109, RULE_keyPart_ = 110, 
		RULE_constraintDefinition = 111, RULE_primaryKeyOption = 112, RULE_primaryKey = 113, 
		RULE_uniqueOption_ = 114, RULE_foreignKeyOption = 115, RULE_createLikeClause_ = 116, 
		RULE_alterDefinitionClause = 117, RULE_addColumnSpecification = 118, RULE_modifyColumnSpecification = 119, 
		RULE_dropColumnSpecification = 120, RULE_addConstraintSpecification = 121, 
		RULE_dropConstraintSpecification = 122, RULE_setTransaction = 123, RULE_commit = 124, 
		RULE_rollback = 125, RULE_levelOfIsolation_ = 126, RULE_grant = 127, RULE_revoke = 128, 
		RULE_privilegeClause = 129, RULE_privileges_ = 130, RULE_privilegeType_ = 131, 
		RULE_grantee_ = 132, RULE_onObjectClause = 133, RULE_objectType_ = 134, 
		RULE_privilegeLevel = 135;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "insert", "insertValuesClause", "insertSelectClause", "update", 
			"assignment", "setAssignmentsClause", "assignmentValues", "assignmentValue", 
			"blobValue", "delete", "singleTableClause", "select", "unionClause", 
			"selectClause", "selectSpecification", "duplicateSpecification", "projections", 
			"projection", "alias", "unqualifiedShorthand", "qualifiedShorthand", 
			"fromClause", "tableReferences", "escapedTableReference", "tableReference", 
			"tableFactor", "joinedTable", "joinSpecification", "whereClause", "groupByClause", 
			"havingClause", "limitClause", "limitRowCount", "limitOffset", "subquery", 
			"parameterMarker", "literals", "stringLiterals", "numberLiterals", "dateTimeLiterals", 
			"hexadecimalLiterals", "bitValueLiterals", "booleanLiterals", "nullValueLiterals", 
			"identifier", "unreservedWord", "variable", "schemaName", "tableName", 
			"columnName", "viewName", "owner", "name", "columnNames", "tableNames", 
			"characterSetName_", "expr", "logicalOperator", "notOperator_", "booleanPrimary", 
			"comparisonOperator", "predicate", "bitExpr", "simpleExpr", "functionCall", 
			"aggregationFunction", "aggregationFunctionName", "distinct", "specialFunction", 
			"castFunction", "convertFunction", "positionFunction", "substringFunction", 
			"extractFunction", "trimFunction_", "regularFunction", "regularFunctionName_", 
			"matchExpression_", "caseExpression", "caseWhen_", "caseElse_", "intervalExpression", 
			"intervalUnit_", "orderByClause", "orderByItem", "dataType", "dataTypeName", 
			"dataTypeLength", "characterSet_", "collateClause_", "ignoredIdentifier_", 
			"dropBehaviour_", "createTable", "alterTable", "dropTable", "createDatabase", 
			"dropDatabase", "createView", "dropView", "createTableSpecification_", 
			"createDefinitionClause", "createDatabaseSpecification_", "createDefinition", 
			"columnDefinition", "dataTypeOption", "checkConstraintDefinition_", "referenceDefinition", 
			"referenceOption_", "keyParts_", "keyPart_", "constraintDefinition", 
			"primaryKeyOption", "primaryKey", "uniqueOption_", "foreignKeyOption", 
			"createLikeClause_", "alterDefinitionClause", "addColumnSpecification", 
			"modifyColumnSpecification", "dropColumnSpecification", "addConstraintSpecification", 
			"dropConstraintSpecification", "setTransaction", "commit", "rollback", 
			"levelOfIsolation_", "grant", "revoke", "privilegeClause", "privileges_", 
			"privilegeType_", "grantee_", "onObjectClause", "objectType_", "privilegeLevel"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", 
			"'%'", "':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", "'<=>'", 
			"'=='", "'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "','", "'\"'", "'''", "'?'", "'@'", "';'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND_", "CONCAT_", "NOT_", "TILDE_", "VERTICAL_BAR_", "AMPERSAND_", 
			"SIGNED_LEFT_SHIFT_", "SIGNED_RIGHT_SHIFT_", "CARET_", "MOD_", "COLON_", 
			"PLUS_", "MINUS_", "ASTERISK_", "SLASH_", "BACKSLASH_", "DOT_", "DOT_ASTERISK_", 
			"SAFE_EQ_", "DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", "LT_", "LTE_", "POUND_", 
			"LP_", "RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", 
			"QUESTION_", "AT_", "SEMI_", "INLINE_COMMENT", "WS", "SELECT", "INSERT", 
			"UPDATE", "DELETE", "CREATE", "ALTER", "DROP", "TRUNCATE", "SCHEMA", 
			"GRANT", "REVOKE", "ADD", "SET", "TABLE", "COLUMN", "INDEX", "CONSTRAINT", 
			"PRIMARY", "UNIQUE", "FOREIGN", "KEY", "POSITION", "PRECISION", "FUNCTION", 
			"TRIGGER", "PROCEDURE", "VIEW", "INTO", "VALUES", "WITH", "UNION", "DISTINCT", 
			"CASE", "WHEN", "CAST", "TRIM", "SUBSTRING", "FROM", "NATURAL", "JOIN", 
			"FULL", "INNER", "OUTER", "LEFT", "RIGHT", "CROSS", "USING", "WHERE", 
			"AS", "ON", "IF", "ELSE", "THEN", "FOR", "TO", "AND", "OR", "IS", "NOT", 
			"NULL", "TRUE", "FALSE", "EXISTS", "BETWEEN", "IN", "ALL", "ANY", "LIKE", 
			"ORDER", "GROUP", "BY", "ASC", "DESC", "HAVING", "LIMIT", "OFFSET", "BEGIN", 
			"COMMIT", "ROLLBACK", "SAVEPOINT", "BOOLEAN", "DOUBLE", "CHAR", "CHARACTER", 
			"ARRAY", "INTERVAL", "DATE", "TIME", "TIMESTAMP", "LOCALTIME", "LOCALTIMESTAMP", 
			"YEAR", "QUARTER", "MONTH", "WEEK", "DAY", "HOUR", "MINUTE", "SECOND", 
			"MICROSECOND", "MAX", "MIN", "SUM", "COUNT", "AVG", "DEFAULT", "CURRENT", 
			"ENABLE", "DISABLE", "CALL", "INSTANCE", "PRESERVE", "DO", "DEFINER", 
			"CURRENT_USER", "SQL", "CASCADED", "LOCAL", "CLOSE", "OPEN", "NEXT", 
			"NAME", "COLLATION", "NAMES", "INTEGER", "REAL", "DECIMAL", "TYPE", "VARCHAR", 
			"FLOAT", "FOR_GENERATOR", "ADA", "C92", "CATALOG_NAME", "CHARACTER_SET_CATALOG", 
			"CHARACTER_SET_NAME", "CHARACTER_SET_SCHEMA", "CLASS_ORIGIN", "COBOL", 
			"COLLATION_CATALOG", "COLLATION_NAME", "COLLATION_SCHEMA", "COLUMN_NAME", 
			"COMMAND_FUNCTION", "COMMITTED", "CONDITION_NUMBER", "CONNECTION_NAME", 
			"CONSTRAINT_CATALOG", "CONSTRAINT_NAME", "CONSTRAINT_SCHEMA", "CURSOR_NAME", 
			"DATA", "DATETIME_INTERVAL_CODE", "DATETIME_INTERVAL_PRECISION", "DYNAMIC_FUNCTION", 
			"FORTRAN", "LENGTH", "MESSAGE_LENGTH", "MESSAGE_OCTET_LENGTH", "MESSAGE_TEXT", 
			"MORE92", "MUMPS", "NULLABLE", "NUMBER", "PASCAL", "PLI", "REPEATABLE", 
			"RETURNED_LENGTH", "RETURNED_OCTET_LENGTH", "RETURNED_SQLSTATE", "ROW_COUNT", 
			"SCALE", "SCHEMA_NAME", "SERIALIZABLE", "SERVER_NAME", "SUBCLASS_ORIGIN", 
			"TABLE_NAME", "UNCOMMITTED", "UNNAMED", "ABSOLUTE", "ACTION", "ALLOCATE", 
			"ARE", "ASSERTION", "AT", "AUTHORIZATION", "BIT", "BIT_LENGTH", "BOTH", 
			"CASCADE", "CATALOG", "CHAR_LENGTH", "CHARACTER_LENGTH", "CHECK", "COALESCE", 
			"COLLATE", "CONNECT", "CONNECTION", "CONSTRAINTS", "CONTINUE", "CONVERT", 
			"CORRESPONDING", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", 
			"CURSOR", "DEALLOCATE", "DEC", "DECLARE", "DEFERRABLE", "DEFERRED", "DESCRIBE", 
			"DESCRIPTOR", "DIAGNOSTICS", "DISCONNECT", "DOMAIN", "END", "END_EXEC", 
			"ESCAPE", "EXCEPT", "EXCEPTION", "EXEC", "EXECUTE", "EXTERNAL", "EXTRACT", 
			"FETCH", "FIRST", "FOUND", "GET", "GLOBAL", "GO", "GOTO", "IDENTITY", 
			"IMMEDIATE", "INDICATOR", "INITIALLY", "INPUT", "INSENSITIVE", "INTERSECT", 
			"ISOLATION", "LANGUAGE", "LAST", "LEADING", "LEVEL", "LOWER", "MATCH", 
			"MODULE", "NATIONAL", "NCHAR", "NO", "NULLIF", "NUMERIC", "OCTET_LENGTH", 
			"OF", "ONLY", "OPTION", "OUTPUT", "OVERLAPS", "PAD", "PARTIAL", "PREPARE", 
			"PRIOR", "PRIVILEGES", "PUBLIC", "READ", "REFERENCES", "RELATIVE", "RESTRICT", 
			"ROWS", "SCROLL", "SECTION", "SESSION", "SESSION_USER", "SIZE", "SMALLINT", 
			"SOME", "SPACE", "SQLCODE", "SQLERROR", "SQLSTATE", "SYSTEM_USER", "TEMPORARY", 
			"TIMEZONE_HOUR", "TIMEZONE_MINUTE", "TRAILING", "TRANSACTION", "TRANSLATE", 
			"TRANSLATION", "UNKNOWN", "UPPER", "USAGE", "USER", "VALUE", "VARYING", 
			"WHENEVER", "WORK", "WRITE", "ZONE", "IDENTIFIER_", "STRING_", "NUMBER_", 
			"HEX_DIGIT_", "BIT_NUM_"
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
	public String getGrammarFileName() { return "SQL92Statement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQL92StatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExecuteContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public CreateDatabaseContext createDatabase() {
			return getRuleContext(CreateDatabaseContext.class,0);
		}
		public DropDatabaseContext dropDatabase() {
			return getRuleContext(DropDatabaseContext.class,0);
		}
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public CreateViewContext createView() {
			return getRuleContext(CreateViewContext.class,0);
		}
		public DropViewContext dropView() {
			return getRuleContext(DropViewContext.class,0);
		}
		public SetTransactionContext setTransaction() {
			return getRuleContext(SetTransactionContext.class,0);
		}
		public CommitContext commit() {
			return getRuleContext(CommitContext.class,0);
		}
		public RollbackContext rollback() {
			return getRuleContext(RollbackContext.class,0);
		}
		public GrantContext grant() {
			return getRuleContext(GrantContext.class,0);
		}
		public RevokeContext revoke() {
			return getRuleContext(RevokeContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(SQL92StatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_execute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(272);
				select();
				}
				break;
			case 2:
				{
				setState(273);
				insert();
				}
				break;
			case 3:
				{
				setState(274);
				update();
				}
				break;
			case 4:
				{
				setState(275);
				delete();
				}
				break;
			case 5:
				{
				setState(276);
				createDatabase();
				}
				break;
			case 6:
				{
				setState(277);
				dropDatabase();
				}
				break;
			case 7:
				{
				setState(278);
				createTable();
				}
				break;
			case 8:
				{
				setState(279);
				alterTable();
				}
				break;
			case 9:
				{
				setState(280);
				dropTable();
				}
				break;
			case 10:
				{
				setState(281);
				createView();
				}
				break;
			case 11:
				{
				setState(282);
				dropView();
				}
				break;
			case 12:
				{
				setState(283);
				setTransaction();
				}
				break;
			case 13:
				{
				setState(284);
				commit();
				}
				break;
			case 14:
				{
				setState(285);
				rollback();
				}
				break;
			case 15:
				{
				setState(286);
				grant();
				}
				break;
			case 16:
				{
				setState(287);
				revoke();
				}
				break;
			}
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(290);
				match(SEMI_);
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

	public static class InsertContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SQL92StatementParser.INSERT, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public InsertValuesClauseContext insertValuesClause() {
			return getRuleContext(InsertValuesClauseContext.class,0);
		}
		public InsertSelectClauseContext insertSelectClause() {
			return getRuleContext(InsertSelectClauseContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SQL92StatementParser.INTO, 0); }
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(INSERT);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(294);
				match(INTO);
				}
			}

			setState(297);
			tableName();
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(298);
				insertValuesClause();
				}
				break;
			case 2:
				{
				setState(299);
				insertSelectClause();
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

	public static class InsertValuesClauseContext extends ParserRuleContext {
		public List<AssignmentValuesContext> assignmentValues() {
			return getRuleContexts(AssignmentValuesContext.class);
		}
		public AssignmentValuesContext assignmentValues(int i) {
			return getRuleContext(AssignmentValuesContext.class,i);
		}
		public TerminalNode VALUES() { return getToken(SQL92StatementParser.VALUES, 0); }
		public TerminalNode VALUE() { return getToken(SQL92StatementParser.VALUE, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public InsertValuesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValuesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitInsertValuesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertValuesClauseContext insertValuesClause() throws RecognitionException {
		InsertValuesClauseContext _localctx = new InsertValuesClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insertValuesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_ || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (NAME - 163)) | (1L << (TYPE - 163)) | (1L << (ADA - 163)) | (1L << (C92 - 163)) | (1L << (CATALOG_NAME - 163)) | (1L << (CHARACTER_SET_CATALOG - 163)) | (1L << (CHARACTER_SET_NAME - 163)) | (1L << (CHARACTER_SET_SCHEMA - 163)) | (1L << (CLASS_ORIGIN - 163)) | (1L << (COBOL - 163)) | (1L << (COLLATION_CATALOG - 163)) | (1L << (COLLATION_NAME - 163)) | (1L << (COLLATION_SCHEMA - 163)) | (1L << (COLUMN_NAME - 163)) | (1L << (COMMAND_FUNCTION - 163)) | (1L << (COMMITTED - 163)) | (1L << (CONDITION_NUMBER - 163)) | (1L << (CONNECTION_NAME - 163)) | (1L << (CONSTRAINT_CATALOG - 163)) | (1L << (CONSTRAINT_NAME - 163)) | (1L << (CONSTRAINT_SCHEMA - 163)) | (1L << (CURSOR_NAME - 163)) | (1L << (DATA - 163)) | (1L << (DATETIME_INTERVAL_CODE - 163)) | (1L << (DATETIME_INTERVAL_PRECISION - 163)) | (1L << (DYNAMIC_FUNCTION - 163)) | (1L << (FORTRAN - 163)) | (1L << (LENGTH - 163)) | (1L << (MESSAGE_LENGTH - 163)) | (1L << (MESSAGE_OCTET_LENGTH - 163)) | (1L << (MESSAGE_TEXT - 163)) | (1L << (MORE92 - 163)) | (1L << (MUMPS - 163)) | (1L << (NULLABLE - 163)) | (1L << (NUMBER - 163)) | (1L << (PASCAL - 163)) | (1L << (PLI - 163)) | (1L << (REPEATABLE - 163)) | (1L << (RETURNED_LENGTH - 163)) | (1L << (RETURNED_OCTET_LENGTH - 163)) | (1L << (RETURNED_SQLSTATE - 163)) | (1L << (ROW_COUNT - 163)) | (1L << (SCALE - 163)) | (1L << (SCHEMA_NAME - 163)) | (1L << (SERIALIZABLE - 163)) | (1L << (SERVER_NAME - 163)) | (1L << (SUBCLASS_ORIGIN - 163)) | (1L << (TABLE_NAME - 163)) | (1L << (UNCOMMITTED - 163)) | (1L << (UNNAMED - 163)))) != 0) || _la==IDENTIFIER_) {
				{
				setState(302);
				columnNames();
				}
			}

			setState(305);
			_la = _input.LA(1);
			if ( !(_la==VALUES || _la==VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(306);
			assignmentValues();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(307);
				match(COMMA_);
				setState(308);
				assignmentValues();
				}
				}
				setState(313);
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

	public static class InsertSelectClauseContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public InsertSelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertSelectClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitInsertSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertSelectClauseContext insertSelectClause() throws RecognitionException {
		InsertSelectClauseContext _localctx = new InsertSelectClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_insertSelectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_ || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (NAME - 163)) | (1L << (TYPE - 163)) | (1L << (ADA - 163)) | (1L << (C92 - 163)) | (1L << (CATALOG_NAME - 163)) | (1L << (CHARACTER_SET_CATALOG - 163)) | (1L << (CHARACTER_SET_NAME - 163)) | (1L << (CHARACTER_SET_SCHEMA - 163)) | (1L << (CLASS_ORIGIN - 163)) | (1L << (COBOL - 163)) | (1L << (COLLATION_CATALOG - 163)) | (1L << (COLLATION_NAME - 163)) | (1L << (COLLATION_SCHEMA - 163)) | (1L << (COLUMN_NAME - 163)) | (1L << (COMMAND_FUNCTION - 163)) | (1L << (COMMITTED - 163)) | (1L << (CONDITION_NUMBER - 163)) | (1L << (CONNECTION_NAME - 163)) | (1L << (CONSTRAINT_CATALOG - 163)) | (1L << (CONSTRAINT_NAME - 163)) | (1L << (CONSTRAINT_SCHEMA - 163)) | (1L << (CURSOR_NAME - 163)) | (1L << (DATA - 163)) | (1L << (DATETIME_INTERVAL_CODE - 163)) | (1L << (DATETIME_INTERVAL_PRECISION - 163)) | (1L << (DYNAMIC_FUNCTION - 163)) | (1L << (FORTRAN - 163)) | (1L << (LENGTH - 163)) | (1L << (MESSAGE_LENGTH - 163)) | (1L << (MESSAGE_OCTET_LENGTH - 163)) | (1L << (MESSAGE_TEXT - 163)) | (1L << (MORE92 - 163)) | (1L << (MUMPS - 163)) | (1L << (NULLABLE - 163)) | (1L << (NUMBER - 163)) | (1L << (PASCAL - 163)) | (1L << (PLI - 163)) | (1L << (REPEATABLE - 163)) | (1L << (RETURNED_LENGTH - 163)) | (1L << (RETURNED_OCTET_LENGTH - 163)) | (1L << (RETURNED_SQLSTATE - 163)) | (1L << (ROW_COUNT - 163)) | (1L << (SCALE - 163)) | (1L << (SCHEMA_NAME - 163)) | (1L << (SERIALIZABLE - 163)) | (1L << (SERVER_NAME - 163)) | (1L << (SUBCLASS_ORIGIN - 163)) | (1L << (TABLE_NAME - 163)) | (1L << (UNCOMMITTED - 163)) | (1L << (UNNAMED - 163)))) != 0) || _la==IDENTIFIER_) {
				{
				setState(314);
				columnNames();
				}
			}

			setState(317);
			select();
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

	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(SQL92StatementParser.UPDATE, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public SetAssignmentsClauseContext setAssignmentsClause() {
			return getRuleContext(SetAssignmentsClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(UPDATE);
			setState(320);
			tableReferences();
			setState(321);
			setAssignmentsClause();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(322);
				whereClause();
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

	public static class AssignmentContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(SQL92StatementParser.EQ_, 0); }
		public AssignmentValueContext assignmentValue() {
			return getRuleContext(AssignmentValueContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(SQL92StatementParser.VALUES, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			columnName();
			setState(326);
			match(EQ_);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUES) {
				{
				setState(327);
				match(VALUES);
				}
			}

			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(330);
				match(LP_);
				}
				break;
			}
			setState(333);
			assignmentValue();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(334);
				match(RP_);
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

	public static class SetAssignmentsClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQL92StatementParser.SET, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public SetAssignmentsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAssignmentsClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSetAssignmentsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetAssignmentsClauseContext setAssignmentsClause() throws RecognitionException {
		SetAssignmentsClauseContext _localctx = new SetAssignmentsClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_setAssignmentsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(SET);
			setState(338);
			assignment();
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(339);
				match(COMMA_);
				setState(340);
				assignment();
				}
				}
				setState(345);
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

	public static class AssignmentValuesContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<AssignmentValueContext> assignmentValue() {
			return getRuleContexts(AssignmentValueContext.class);
		}
		public AssignmentValueContext assignmentValue(int i) {
			return getRuleContext(AssignmentValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public AssignmentValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValues; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAssignmentValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValuesContext assignmentValues() throws RecognitionException {
		AssignmentValuesContext _localctx = new AssignmentValuesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignmentValues);
		int _la;
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(LP_);
				setState(347);
				assignmentValue();
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(348);
					match(COMMA_);
					setState(349);
					assignmentValue();
					}
					}
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(355);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(LP_);
				setState(358);
				match(RP_);
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

	public static class AssignmentValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SQL92StatementParser.DEFAULT, 0); }
		public BlobValueContext blobValue() {
			return getRuleContext(BlobValueContext.class,0);
		}
		public AssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAssignmentValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValueContext assignmentValue() throws RecognitionException {
		AssignmentValueContext _localctx = new AssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentValue);
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(DEFAULT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				blobValue();
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

	public static class BlobValueContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(SQL92StatementParser.STRING_, 0); }
		public BlobValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blobValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitBlobValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlobValueContext blobValue() throws RecognitionException {
		BlobValueContext _localctx = new BlobValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blobValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(STRING_);
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

	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SQL92StatementParser.DELETE, 0); }
		public SingleTableClauseContext singleTableClause() {
			return getRuleContext(SingleTableClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(DELETE);
			setState(369);
			singleTableClause();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(370);
				whereClause();
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

	public static class SingleTableClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SQL92StatementParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQL92StatementParser.AS, 0); }
		public SingleTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSingleTableClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableClauseContext singleTableClause() throws RecognitionException {
		SingleTableClauseContext _localctx = new SingleTableClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_singleTableClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(FROM);
			setState(374);
			tableName();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (NAME - 163)) | (1L << (TYPE - 163)) | (1L << (ADA - 163)) | (1L << (C92 - 163)) | (1L << (CATALOG_NAME - 163)) | (1L << (CHARACTER_SET_CATALOG - 163)) | (1L << (CHARACTER_SET_NAME - 163)) | (1L << (CHARACTER_SET_SCHEMA - 163)) | (1L << (CLASS_ORIGIN - 163)) | (1L << (COBOL - 163)) | (1L << (COLLATION_CATALOG - 163)) | (1L << (COLLATION_NAME - 163)) | (1L << (COLLATION_SCHEMA - 163)) | (1L << (COLUMN_NAME - 163)) | (1L << (COMMAND_FUNCTION - 163)) | (1L << (COMMITTED - 163)) | (1L << (CONDITION_NUMBER - 163)) | (1L << (CONNECTION_NAME - 163)) | (1L << (CONSTRAINT_CATALOG - 163)) | (1L << (CONSTRAINT_NAME - 163)) | (1L << (CONSTRAINT_SCHEMA - 163)) | (1L << (CURSOR_NAME - 163)) | (1L << (DATA - 163)) | (1L << (DATETIME_INTERVAL_CODE - 163)) | (1L << (DATETIME_INTERVAL_PRECISION - 163)) | (1L << (DYNAMIC_FUNCTION - 163)) | (1L << (FORTRAN - 163)) | (1L << (LENGTH - 163)) | (1L << (MESSAGE_LENGTH - 163)) | (1L << (MESSAGE_OCTET_LENGTH - 163)) | (1L << (MESSAGE_TEXT - 163)) | (1L << (MORE92 - 163)) | (1L << (MUMPS - 163)) | (1L << (NULLABLE - 163)) | (1L << (NUMBER - 163)) | (1L << (PASCAL - 163)) | (1L << (PLI - 163)) | (1L << (REPEATABLE - 163)) | (1L << (RETURNED_LENGTH - 163)) | (1L << (RETURNED_OCTET_LENGTH - 163)) | (1L << (RETURNED_SQLSTATE - 163)) | (1L << (ROW_COUNT - 163)) | (1L << (SCALE - 163)) | (1L << (SCHEMA_NAME - 163)) | (1L << (SERIALIZABLE - 163)) | (1L << (SERVER_NAME - 163)) | (1L << (SUBCLASS_ORIGIN - 163)) | (1L << (TABLE_NAME - 163)) | (1L << (UNCOMMITTED - 163)) | (1L << (UNNAMED - 163)))) != 0) || _la==IDENTIFIER_ || _la==STRING_) {
				{
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(375);
					match(AS);
					}
				}

				setState(378);
				alias();
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

	public static class SelectContext extends ParserRuleContext {
		public UnionClauseContext unionClause() {
			return getRuleContext(UnionClauseContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			unionClause();
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

	public static class UnionClauseContext extends ParserRuleContext {
		public List<SelectClauseContext> selectClause() {
			return getRuleContexts(SelectClauseContext.class);
		}
		public SelectClauseContext selectClause(int i) {
			return getRuleContext(SelectClauseContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(SQL92StatementParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(SQL92StatementParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(SQL92StatementParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(SQL92StatementParser.ALL, i);
		}
		public UnionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitUnionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionClauseContext unionClause() throws RecognitionException {
		UnionClauseContext _localctx = new UnionClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			selectClause();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(384);
				match(UNION);
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(385);
					match(ALL);
					}
				}

				setState(388);
				selectClause();
				}
				}
				setState(393);
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

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQL92StatementParser.SELECT, 0); }
		public ProjectionsContext projections() {
			return getRuleContext(ProjectionsContext.class,0);
		}
		public List<SelectSpecificationContext> selectSpecification() {
			return getRuleContexts(SelectSpecificationContext.class);
		}
		public SelectSpecificationContext selectSpecification(int i) {
			return getRuleContext(SelectSpecificationContext.class,i);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(SELECT);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DISTINCT || _la==ALL) {
				{
				{
				setState(395);
				selectSpecification();
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
			projections();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(402);
				fromClause();
				}
			}

			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(405);
				whereClause();
				}
			}

			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(408);
				groupByClause();
				}
			}

			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(411);
				havingClause();
				}
			}

			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(414);
				orderByClause();
				}
			}

			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(417);
				limitClause();
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

	public static class SelectSpecificationContext extends ParserRuleContext {
		public DuplicateSpecificationContext duplicateSpecification() {
			return getRuleContext(DuplicateSpecificationContext.class,0);
		}
		public SelectSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSelectSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectSpecificationContext selectSpecification() throws RecognitionException {
		SelectSpecificationContext _localctx = new SelectSpecificationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selectSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			duplicateSpecification();
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

	public static class DuplicateSpecificationContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SQL92StatementParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(SQL92StatementParser.DISTINCT, 0); }
		public DuplicateSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duplicateSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDuplicateSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DuplicateSpecificationContext duplicateSpecification() throws RecognitionException {
		DuplicateSpecificationContext _localctx = new DuplicateSpecificationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_duplicateSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_la = _input.LA(1);
			if ( !(_la==DISTINCT || _la==ALL) ) {
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

	public static class ProjectionsContext extends ParserRuleContext {
		public UnqualifiedShorthandContext unqualifiedShorthand() {
			return getRuleContext(UnqualifiedShorthandContext.class,0);
		}
		public List<ProjectionContext> projection() {
			return getRuleContexts(ProjectionContext.class);
		}
		public ProjectionContext projection(int i) {
			return getRuleContext(ProjectionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public ProjectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projections; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitProjections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionsContext projections() throws RecognitionException {
		ProjectionsContext _localctx = new ProjectionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_projections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK_:
				{
				setState(424);
				unqualifiedShorthand();
				}
				break;
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case POSITION:
			case CASE:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case LOCAL:
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case EXTRACT:
			case GLOBAL:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(425);
				projection();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(428);
				match(COMMA_);
				setState(429);
				projection();
				}
				}
				setState(434);
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

	public static class ProjectionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQL92StatementParser.AS, 0); }
		public QualifiedShorthandContext qualifiedShorthand() {
			return getRuleContext(QualifiedShorthandContext.class,0);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_projection);
		int _la;
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(435);
					columnName();
					}
					break;
				case 2:
					{
					setState(436);
					expr(0);
					}
					break;
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (NAME - 163)) | (1L << (TYPE - 163)) | (1L << (ADA - 163)) | (1L << (C92 - 163)) | (1L << (CATALOG_NAME - 163)) | (1L << (CHARACTER_SET_CATALOG - 163)) | (1L << (CHARACTER_SET_NAME - 163)) | (1L << (CHARACTER_SET_SCHEMA - 163)) | (1L << (CLASS_ORIGIN - 163)) | (1L << (COBOL - 163)) | (1L << (COLLATION_CATALOG - 163)) | (1L << (COLLATION_NAME - 163)) | (1L << (COLLATION_SCHEMA - 163)) | (1L << (COLUMN_NAME - 163)) | (1L << (COMMAND_FUNCTION - 163)) | (1L << (COMMITTED - 163)) | (1L << (CONDITION_NUMBER - 163)) | (1L << (CONNECTION_NAME - 163)) | (1L << (CONSTRAINT_CATALOG - 163)) | (1L << (CONSTRAINT_NAME - 163)) | (1L << (CONSTRAINT_SCHEMA - 163)) | (1L << (CURSOR_NAME - 163)) | (1L << (DATA - 163)) | (1L << (DATETIME_INTERVAL_CODE - 163)) | (1L << (DATETIME_INTERVAL_PRECISION - 163)) | (1L << (DYNAMIC_FUNCTION - 163)) | (1L << (FORTRAN - 163)) | (1L << (LENGTH - 163)) | (1L << (MESSAGE_LENGTH - 163)) | (1L << (MESSAGE_OCTET_LENGTH - 163)) | (1L << (MESSAGE_TEXT - 163)) | (1L << (MORE92 - 163)) | (1L << (MUMPS - 163)) | (1L << (NULLABLE - 163)) | (1L << (NUMBER - 163)) | (1L << (PASCAL - 163)) | (1L << (PLI - 163)) | (1L << (REPEATABLE - 163)) | (1L << (RETURNED_LENGTH - 163)) | (1L << (RETURNED_OCTET_LENGTH - 163)) | (1L << (RETURNED_SQLSTATE - 163)) | (1L << (ROW_COUNT - 163)) | (1L << (SCALE - 163)) | (1L << (SCHEMA_NAME - 163)) | (1L << (SERIALIZABLE - 163)) | (1L << (SERVER_NAME - 163)) | (1L << (SUBCLASS_ORIGIN - 163)) | (1L << (TABLE_NAME - 163)) | (1L << (UNCOMMITTED - 163)) | (1L << (UNNAMED - 163)))) != 0) || _la==IDENTIFIER_ || _la==STRING_) {
					{
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(439);
						match(AS);
						}
					}

					setState(442);
					alias();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				qualifiedShorthand();
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

	public static class AliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQL92StatementParser.STRING_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_alias);
		try {
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				identifier();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(STRING_);
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

	public static class UnqualifiedShorthandContext extends ParserRuleContext {
		public TerminalNode ASTERISK_() { return getToken(SQL92StatementParser.ASTERISK_, 0); }
		public UnqualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedShorthand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitUnqualifiedShorthand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnqualifiedShorthandContext unqualifiedShorthand() throws RecognitionException {
		UnqualifiedShorthandContext _localctx = new UnqualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unqualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(ASTERISK_);
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

	public static class QualifiedShorthandContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT_ASTERISK_() { return getToken(SQL92StatementParser.DOT_ASTERISK_, 0); }
		public QualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedShorthand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitQualifiedShorthand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedShorthandContext qualifiedShorthand() throws RecognitionException {
		QualifiedShorthandContext _localctx = new QualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_qualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			identifier();
			setState(455);
			match(DOT_ASTERISK_);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SQL92StatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(FROM);
			setState(458);
			tableReferences();
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

	public static class TableReferencesContext extends ParserRuleContext {
		public List<EscapedTableReferenceContext> escapedTableReference() {
			return getRuleContexts(EscapedTableReferenceContext.class);
		}
		public EscapedTableReferenceContext escapedTableReference(int i) {
			return getRuleContext(EscapedTableReferenceContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public TableReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferences; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitTableReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferencesContext tableReferences() throws RecognitionException {
		TableReferencesContext _localctx = new TableReferencesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tableReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			escapedTableReference();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(461);
				match(COMMA_);
				setState(462);
				escapedTableReference();
				}
				}
				setState(467);
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

	public static class EscapedTableReferenceContext extends ParserRuleContext {
		public TableReferenceContext tableReference() {
			return getRuleContext(TableReferenceContext.class,0);
		}
		public TerminalNode LBE_() { return getToken(SQL92StatementParser.LBE_, 0); }
		public TerminalNode RBE_() { return getToken(SQL92StatementParser.RBE_, 0); }
		public EscapedTableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escapedTableReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitEscapedTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscapedTableReferenceContext escapedTableReference() throws RecognitionException {
		EscapedTableReferenceContext _localctx = new EscapedTableReferenceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_escapedTableReference);
		try {
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				tableReference();
				}
				break;
			case LBE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(LBE_);
				setState(470);
				tableReference();
				setState(471);
				match(RBE_);
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

	public static class TableReferenceContext extends ParserRuleContext {
		public TableFactorContext tableFactor() {
			return getRuleContext(TableFactorContext.class,0);
		}
		public List<JoinedTableContext> joinedTable() {
			return getRuleContexts(JoinedTableContext.class);
		}
		public JoinedTableContext joinedTable(int i) {
			return getRuleContext(JoinedTableContext.class,i);
		}
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tableReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			tableFactor();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (NATURAL - 80)) | (1L << (JOIN - 80)) | (1L << (INNER - 80)) | (1L << (LEFT - 80)) | (1L << (RIGHT - 80)) | (1L << (CROSS - 80)))) != 0)) {
				{
				{
				setState(476);
				joinedTable();
				}
				}
				setState(481);
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

	public static class TableFactorContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQL92StatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public TableFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFactor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitTableFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFactorContext tableFactor() throws RecognitionException {
		TableFactorContext _localctx = new TableFactorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tableFactor);
		int _la;
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				tableName();
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (NAME - 163)) | (1L << (TYPE - 163)) | (1L << (ADA - 163)) | (1L << (C92 - 163)) | (1L << (CATALOG_NAME - 163)) | (1L << (CHARACTER_SET_CATALOG - 163)) | (1L << (CHARACTER_SET_NAME - 163)) | (1L << (CHARACTER_SET_SCHEMA - 163)) | (1L << (CLASS_ORIGIN - 163)) | (1L << (COBOL - 163)) | (1L << (COLLATION_CATALOG - 163)) | (1L << (COLLATION_NAME - 163)) | (1L << (COLLATION_SCHEMA - 163)) | (1L << (COLUMN_NAME - 163)) | (1L << (COMMAND_FUNCTION - 163)) | (1L << (COMMITTED - 163)) | (1L << (CONDITION_NUMBER - 163)) | (1L << (CONNECTION_NAME - 163)) | (1L << (CONSTRAINT_CATALOG - 163)) | (1L << (CONSTRAINT_NAME - 163)) | (1L << (CONSTRAINT_SCHEMA - 163)) | (1L << (CURSOR_NAME - 163)) | (1L << (DATA - 163)) | (1L << (DATETIME_INTERVAL_CODE - 163)) | (1L << (DATETIME_INTERVAL_PRECISION - 163)) | (1L << (DYNAMIC_FUNCTION - 163)) | (1L << (FORTRAN - 163)) | (1L << (LENGTH - 163)) | (1L << (MESSAGE_LENGTH - 163)) | (1L << (MESSAGE_OCTET_LENGTH - 163)) | (1L << (MESSAGE_TEXT - 163)) | (1L << (MORE92 - 163)) | (1L << (MUMPS - 163)) | (1L << (NULLABLE - 163)) | (1L << (NUMBER - 163)) | (1L << (PASCAL - 163)) | (1L << (PLI - 163)) | (1L << (REPEATABLE - 163)) | (1L << (RETURNED_LENGTH - 163)) | (1L << (RETURNED_OCTET_LENGTH - 163)) | (1L << (RETURNED_SQLSTATE - 163)) | (1L << (ROW_COUNT - 163)) | (1L << (SCALE - 163)) | (1L << (SCHEMA_NAME - 163)) | (1L << (SERIALIZABLE - 163)) | (1L << (SERVER_NAME - 163)) | (1L << (SUBCLASS_ORIGIN - 163)) | (1L << (TABLE_NAME - 163)) | (1L << (UNCOMMITTED - 163)) | (1L << (UNNAMED - 163)))) != 0) || _la==IDENTIFIER_ || _la==STRING_) {
					{
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(483);
						match(AS);
						}
					}

					setState(486);
					alias();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				subquery();
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(490);
					match(AS);
					}
				}

				setState(493);
				alias();
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_ || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (NAME - 163)) | (1L << (TYPE - 163)) | (1L << (ADA - 163)) | (1L << (C92 - 163)) | (1L << (CATALOG_NAME - 163)) | (1L << (CHARACTER_SET_CATALOG - 163)) | (1L << (CHARACTER_SET_NAME - 163)) | (1L << (CHARACTER_SET_SCHEMA - 163)) | (1L << (CLASS_ORIGIN - 163)) | (1L << (COBOL - 163)) | (1L << (COLLATION_CATALOG - 163)) | (1L << (COLLATION_NAME - 163)) | (1L << (COLLATION_SCHEMA - 163)) | (1L << (COLUMN_NAME - 163)) | (1L << (COMMAND_FUNCTION - 163)) | (1L << (COMMITTED - 163)) | (1L << (CONDITION_NUMBER - 163)) | (1L << (CONNECTION_NAME - 163)) | (1L << (CONSTRAINT_CATALOG - 163)) | (1L << (CONSTRAINT_NAME - 163)) | (1L << (CONSTRAINT_SCHEMA - 163)) | (1L << (CURSOR_NAME - 163)) | (1L << (DATA - 163)) | (1L << (DATETIME_INTERVAL_CODE - 163)) | (1L << (DATETIME_INTERVAL_PRECISION - 163)) | (1L << (DYNAMIC_FUNCTION - 163)) | (1L << (FORTRAN - 163)) | (1L << (LENGTH - 163)) | (1L << (MESSAGE_LENGTH - 163)) | (1L << (MESSAGE_OCTET_LENGTH - 163)) | (1L << (MESSAGE_TEXT - 163)) | (1L << (MORE92 - 163)) | (1L << (MUMPS - 163)) | (1L << (NULLABLE - 163)) | (1L << (NUMBER - 163)) | (1L << (PASCAL - 163)) | (1L << (PLI - 163)) | (1L << (REPEATABLE - 163)) | (1L << (RETURNED_LENGTH - 163)) | (1L << (RETURNED_OCTET_LENGTH - 163)) | (1L << (RETURNED_SQLSTATE - 163)) | (1L << (ROW_COUNT - 163)) | (1L << (SCALE - 163)) | (1L << (SCHEMA_NAME - 163)) | (1L << (SERIALIZABLE - 163)) | (1L << (SERVER_NAME - 163)) | (1L << (SUBCLASS_ORIGIN - 163)) | (1L << (TABLE_NAME - 163)) | (1L << (UNCOMMITTED - 163)) | (1L << (UNNAMED - 163)))) != 0) || _la==IDENTIFIER_) {
					{
					setState(494);
					columnNames();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				match(LP_);
				setState(498);
				tableReferences();
				setState(499);
				match(RP_);
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

	public static class JoinedTableContext extends ParserRuleContext {
		public TableFactorContext tableFactor() {
			return getRuleContext(TableFactorContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(SQL92StatementParser.JOIN, 0); }
		public JoinSpecificationContext joinSpecification() {
			return getRuleContext(JoinSpecificationContext.class,0);
		}
		public TerminalNode INNER() { return getToken(SQL92StatementParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SQL92StatementParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SQL92StatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SQL92StatementParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(SQL92StatementParser.OUTER, 0); }
		public TerminalNode NATURAL() { return getToken(SQL92StatementParser.NATURAL, 0); }
		public JoinedTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinedTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitJoinedTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinedTableContext joinedTable() throws RecognitionException {
		JoinedTableContext _localctx = new JoinedTableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_joinedTable);
		int _la;
		try {
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
			case CROSS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(503);
					_la = _input.LA(1);
					if ( !(_la==INNER || _la==CROSS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(506);
				match(JOIN);
				}
				setState(508);
				tableFactor();
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(509);
					joinSpecification();
					}
				}

				}
				break;
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(513);
					match(OUTER);
					}
				}

				setState(516);
				match(JOIN);
				setState(517);
				tableFactor();
				setState(518);
				joinSpecification();
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
				match(NATURAL);
				setState(524);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INNER:
					{
					setState(521);
					match(INNER);
					}
					break;
				case LEFT:
				case RIGHT:
					{
					setState(522);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					{
					setState(523);
					match(OUTER);
					}
					}
					break;
				case JOIN:
					break;
				default:
					break;
				}
				setState(526);
				match(JOIN);
				setState(527);
				tableFactor();
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

	public static class JoinSpecificationContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQL92StatementParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(SQL92StatementParser.USING, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public JoinSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitJoinSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinSpecificationContext joinSpecification() throws RecognitionException {
		JoinSpecificationContext _localctx = new JoinSpecificationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_joinSpecification);
		try {
			setState(534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				match(ON);
				setState(531);
				expr(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				match(USING);
				setState(533);
				columnNames();
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SQL92StatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(WHERE);
			setState(537);
			expr(0);
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(SQL92StatementParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SQL92StatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(GROUP);
			setState(540);
			match(BY);
			setState(541);
			orderByItem();
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(542);
				match(COMMA_);
				setState(543);
				orderByItem();
				}
				}
				setState(548);
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

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SQL92StatementParser.HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(HAVING);
			setState(550);
			expr(0);
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

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(SQL92StatementParser.LIMIT, 0); }
		public LimitRowCountContext limitRowCount() {
			return getRuleContext(LimitRowCountContext.class,0);
		}
		public TerminalNode OFFSET() { return getToken(SQL92StatementParser.OFFSET, 0); }
		public LimitOffsetContext limitOffset() {
			return getRuleContext(LimitOffsetContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQL92StatementParser.COMMA_, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(LIMIT);
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(556);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(553);
					limitOffset();
					setState(554);
					match(COMMA_);
					}
					break;
				}
				setState(558);
				limitRowCount();
				}
				break;
			case 2:
				{
				setState(559);
				limitRowCount();
				setState(560);
				match(OFFSET);
				setState(561);
				limitOffset();
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

	public static class LimitRowCountContext extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public LimitRowCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitRowCount; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitLimitRowCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitRowCountContext limitRowCount() throws RecognitionException {
		LimitRowCountContext _localctx = new LimitRowCountContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_limitRowCount);
		try {
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				numberLiterals();
				}
				break;
			case QUESTION_:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				parameterMarker();
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

	public static class LimitOffsetContext extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public LimitOffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitOffset; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitLimitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitOffsetContext limitOffset() throws RecognitionException {
		LimitOffsetContext _localctx = new LimitOffsetContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_limitOffset);
		try {
			setState(571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				numberLiterals();
				}
				break;
			case QUESTION_:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				parameterMarker();
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

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public UnionClauseContext unionClause() {
			return getRuleContext(UnionClauseContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(LP_);
			setState(574);
			unionClause();
			setState(575);
			match(RP_);
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

	public static class ParameterMarkerContext extends ParserRuleContext {
		public TerminalNode QUESTION_() { return getToken(SQL92StatementParser.QUESTION_, 0); }
		public ParameterMarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterMarker; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitParameterMarker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterMarkerContext parameterMarker() throws RecognitionException {
		ParameterMarkerContext _localctx = new ParameterMarkerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parameterMarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(QUESTION_);
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

	public static class LiteralsContext extends ParserRuleContext {
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public DateTimeLiteralsContext dateTimeLiterals() {
			return getRuleContext(DateTimeLiteralsContext.class,0);
		}
		public HexadecimalLiteralsContext hexadecimalLiterals() {
			return getRuleContext(HexadecimalLiteralsContext.class,0);
		}
		public BitValueLiteralsContext bitValueLiterals() {
			return getRuleContext(BitValueLiteralsContext.class,0);
		}
		public BooleanLiteralsContext booleanLiterals() {
			return getRuleContext(BooleanLiteralsContext.class,0);
		}
		public NullValueLiteralsContext nullValueLiterals() {
			return getRuleContext(NullValueLiteralsContext.class,0);
		}
		public LiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_literals);
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				stringLiterals();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				numberLiterals();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				dateTimeLiterals();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(582);
				hexadecimalLiterals();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(583);
				bitValueLiterals();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(584);
				booleanLiterals();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(585);
				nullValueLiterals();
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

	public static class StringLiteralsContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(SQL92StatementParser.STRING_, 0); }
		public CharacterSetName_Context characterSetName_() {
			return getRuleContext(CharacterSetName_Context.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public StringLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitStringLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralsContext stringLiterals() throws RecognitionException {
		StringLiteralsContext _localctx = new StringLiteralsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_stringLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(588);
				characterSetName_();
				}
			}

			setState(591);
			match(STRING_);
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(592);
				collateClause_();
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

	public static class NumberLiteralsContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(SQL92StatementParser.NUMBER_, 0); }
		public TerminalNode MINUS_() { return getToken(SQL92StatementParser.MINUS_, 0); }
		public NumberLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitNumberLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralsContext numberLiterals() throws RecognitionException {
		NumberLiteralsContext _localctx = new NumberLiteralsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_numberLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS_) {
				{
				setState(595);
				match(MINUS_);
				}
			}

			setState(598);
			match(NUMBER_);
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

	public static class DateTimeLiteralsContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(SQL92StatementParser.STRING_, 0); }
		public TerminalNode DATE() { return getToken(SQL92StatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(SQL92StatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SQL92StatementParser.TIMESTAMP, 0); }
		public TerminalNode LBE_() { return getToken(SQL92StatementParser.LBE_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBE_() { return getToken(SQL92StatementParser.RBE_, 0); }
		public DateTimeLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDateTimeLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateTimeLiteralsContext dateTimeLiterals() throws RecognitionException {
		DateTimeLiteralsContext _localctx = new DateTimeLiteralsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dateTimeLiterals);
		int _la;
		try {
			setState(607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				_la = _input.LA(1);
				if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (DATE - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(601);
				match(STRING_);
				}
				break;
			case LBE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				match(LBE_);
				setState(603);
				identifier();
				setState(604);
				match(STRING_);
				setState(605);
				match(RBE_);
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

	public static class HexadecimalLiteralsContext extends ParserRuleContext {
		public TerminalNode HEX_DIGIT_() { return getToken(SQL92StatementParser.HEX_DIGIT_, 0); }
		public CharacterSetName_Context characterSetName_() {
			return getRuleContext(CharacterSetName_Context.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public HexadecimalLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitHexadecimalLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexadecimalLiteralsContext hexadecimalLiterals() throws RecognitionException {
		HexadecimalLiteralsContext _localctx = new HexadecimalLiteralsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_hexadecimalLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(609);
				characterSetName_();
				}
			}

			setState(612);
			match(HEX_DIGIT_);
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(613);
				collateClause_();
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

	public static class BitValueLiteralsContext extends ParserRuleContext {
		public TerminalNode BIT_NUM_() { return getToken(SQL92StatementParser.BIT_NUM_, 0); }
		public CharacterSetName_Context characterSetName_() {
			return getRuleContext(CharacterSetName_Context.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public BitValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitValueLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitBitValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitValueLiteralsContext bitValueLiterals() throws RecognitionException {
		BitValueLiteralsContext _localctx = new BitValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_bitValueLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(616);
				characterSetName_();
				}
			}

			setState(619);
			match(BIT_NUM_);
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(620);
				collateClause_();
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

	public static class BooleanLiteralsContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SQL92StatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQL92StatementParser.FALSE, 0); }
		public BooleanLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitBooleanLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralsContext booleanLiterals() throws RecognitionException {
		BooleanLiteralsContext _localctx = new BooleanLiteralsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_booleanLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class NullValueLiteralsContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(SQL92StatementParser.NULL, 0); }
		public NullValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullValueLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitNullValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullValueLiteralsContext nullValueLiterals() throws RecognitionException {
		NullValueLiteralsContext _localctx = new NullValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_nullValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(NULL);
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
		public TerminalNode IDENTIFIER_() { return getToken(SQL92StatementParser.IDENTIFIER_, 0); }
		public UnreservedWordContext unreservedWord() {
			return getRuleContext(UnreservedWordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_identifier);
		try {
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				match(IDENTIFIER_);
				}
				break;
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				unreservedWord();
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

	public static class UnreservedWordContext extends ParserRuleContext {
		public TerminalNode ADA() { return getToken(SQL92StatementParser.ADA, 0); }
		public TerminalNode C92() { return getToken(SQL92StatementParser.C92, 0); }
		public TerminalNode CATALOG_NAME() { return getToken(SQL92StatementParser.CATALOG_NAME, 0); }
		public TerminalNode CHARACTER_SET_CATALOG() { return getToken(SQL92StatementParser.CHARACTER_SET_CATALOG, 0); }
		public TerminalNode CHARACTER_SET_NAME() { return getToken(SQL92StatementParser.CHARACTER_SET_NAME, 0); }
		public TerminalNode CHARACTER_SET_SCHEMA() { return getToken(SQL92StatementParser.CHARACTER_SET_SCHEMA, 0); }
		public TerminalNode CLASS_ORIGIN() { return getToken(SQL92StatementParser.CLASS_ORIGIN, 0); }
		public TerminalNode COBOL() { return getToken(SQL92StatementParser.COBOL, 0); }
		public TerminalNode COLLATION_CATALOG() { return getToken(SQL92StatementParser.COLLATION_CATALOG, 0); }
		public TerminalNode COLLATION_NAME() { return getToken(SQL92StatementParser.COLLATION_NAME, 0); }
		public TerminalNode COLLATION_SCHEMA() { return getToken(SQL92StatementParser.COLLATION_SCHEMA, 0); }
		public TerminalNode COLUMN_NAME() { return getToken(SQL92StatementParser.COLUMN_NAME, 0); }
		public TerminalNode COMMAND_FUNCTION() { return getToken(SQL92StatementParser.COMMAND_FUNCTION, 0); }
		public TerminalNode COMMITTED() { return getToken(SQL92StatementParser.COMMITTED, 0); }
		public TerminalNode CONDITION_NUMBER() { return getToken(SQL92StatementParser.CONDITION_NUMBER, 0); }
		public TerminalNode CONNECTION_NAME() { return getToken(SQL92StatementParser.CONNECTION_NAME, 0); }
		public TerminalNode CONSTRAINT_CATALOG() { return getToken(SQL92StatementParser.CONSTRAINT_CATALOG, 0); }
		public TerminalNode CONSTRAINT_NAME() { return getToken(SQL92StatementParser.CONSTRAINT_NAME, 0); }
		public TerminalNode CONSTRAINT_SCHEMA() { return getToken(SQL92StatementParser.CONSTRAINT_SCHEMA, 0); }
		public TerminalNode CURSOR_NAME() { return getToken(SQL92StatementParser.CURSOR_NAME, 0); }
		public TerminalNode DATA() { return getToken(SQL92StatementParser.DATA, 0); }
		public TerminalNode DATETIME_INTERVAL_CODE() { return getToken(SQL92StatementParser.DATETIME_INTERVAL_CODE, 0); }
		public TerminalNode DATETIME_INTERVAL_PRECISION() { return getToken(SQL92StatementParser.DATETIME_INTERVAL_PRECISION, 0); }
		public TerminalNode DYNAMIC_FUNCTION() { return getToken(SQL92StatementParser.DYNAMIC_FUNCTION, 0); }
		public TerminalNode FORTRAN() { return getToken(SQL92StatementParser.FORTRAN, 0); }
		public TerminalNode LENGTH() { return getToken(SQL92StatementParser.LENGTH, 0); }
		public TerminalNode MESSAGE_LENGTH() { return getToken(SQL92StatementParser.MESSAGE_LENGTH, 0); }
		public TerminalNode MESSAGE_OCTET_LENGTH() { return getToken(SQL92StatementParser.MESSAGE_OCTET_LENGTH, 0); }
		public TerminalNode MESSAGE_TEXT() { return getToken(SQL92StatementParser.MESSAGE_TEXT, 0); }
		public TerminalNode MORE92() { return getToken(SQL92StatementParser.MORE92, 0); }
		public TerminalNode MUMPS() { return getToken(SQL92StatementParser.MUMPS, 0); }
		public TerminalNode NAME() { return getToken(SQL92StatementParser.NAME, 0); }
		public TerminalNode NULLABLE() { return getToken(SQL92StatementParser.NULLABLE, 0); }
		public TerminalNode NUMBER() { return getToken(SQL92StatementParser.NUMBER, 0); }
		public TerminalNode PASCAL() { return getToken(SQL92StatementParser.PASCAL, 0); }
		public TerminalNode PLI() { return getToken(SQL92StatementParser.PLI, 0); }
		public TerminalNode REPEATABLE() { return getToken(SQL92StatementParser.REPEATABLE, 0); }
		public TerminalNode RETURNED_LENGTH() { return getToken(SQL92StatementParser.RETURNED_LENGTH, 0); }
		public TerminalNode RETURNED_OCTET_LENGTH() { return getToken(SQL92StatementParser.RETURNED_OCTET_LENGTH, 0); }
		public TerminalNode RETURNED_SQLSTATE() { return getToken(SQL92StatementParser.RETURNED_SQLSTATE, 0); }
		public TerminalNode ROW_COUNT() { return getToken(SQL92StatementParser.ROW_COUNT, 0); }
		public TerminalNode SCALE() { return getToken(SQL92StatementParser.SCALE, 0); }
		public TerminalNode SCHEMA_NAME() { return getToken(SQL92StatementParser.SCHEMA_NAME, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(SQL92StatementParser.SERIALIZABLE, 0); }
		public TerminalNode SERVER_NAME() { return getToken(SQL92StatementParser.SERVER_NAME, 0); }
		public TerminalNode SUBCLASS_ORIGIN() { return getToken(SQL92StatementParser.SUBCLASS_ORIGIN, 0); }
		public TerminalNode TABLE_NAME() { return getToken(SQL92StatementParser.TABLE_NAME, 0); }
		public TerminalNode TYPE() { return getToken(SQL92StatementParser.TYPE, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SQL92StatementParser.UNCOMMITTED, 0); }
		public TerminalNode UNNAMED() { return getToken(SQL92StatementParser.UNNAMED, 0); }
		public UnreservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreservedWord; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitUnreservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnreservedWordContext unreservedWord() throws RecognitionException {
		UnreservedWordContext _localctx = new UnreservedWordContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unreservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			_la = _input.LA(1);
			if ( !(((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (NAME - 163)) | (1L << (TYPE - 163)) | (1L << (ADA - 163)) | (1L << (C92 - 163)) | (1L << (CATALOG_NAME - 163)) | (1L << (CHARACTER_SET_CATALOG - 163)) | (1L << (CHARACTER_SET_NAME - 163)) | (1L << (CHARACTER_SET_SCHEMA - 163)) | (1L << (CLASS_ORIGIN - 163)) | (1L << (COBOL - 163)) | (1L << (COLLATION_CATALOG - 163)) | (1L << (COLLATION_NAME - 163)) | (1L << (COLLATION_SCHEMA - 163)) | (1L << (COLUMN_NAME - 163)) | (1L << (COMMAND_FUNCTION - 163)) | (1L << (COMMITTED - 163)) | (1L << (CONDITION_NUMBER - 163)) | (1L << (CONNECTION_NAME - 163)) | (1L << (CONSTRAINT_CATALOG - 163)) | (1L << (CONSTRAINT_NAME - 163)) | (1L << (CONSTRAINT_SCHEMA - 163)) | (1L << (CURSOR_NAME - 163)) | (1L << (DATA - 163)) | (1L << (DATETIME_INTERVAL_CODE - 163)) | (1L << (DATETIME_INTERVAL_PRECISION - 163)) | (1L << (DYNAMIC_FUNCTION - 163)) | (1L << (FORTRAN - 163)) | (1L << (LENGTH - 163)) | (1L << (MESSAGE_LENGTH - 163)) | (1L << (MESSAGE_OCTET_LENGTH - 163)) | (1L << (MESSAGE_TEXT - 163)) | (1L << (MORE92 - 163)) | (1L << (MUMPS - 163)) | (1L << (NULLABLE - 163)) | (1L << (NUMBER - 163)) | (1L << (PASCAL - 163)) | (1L << (PLI - 163)) | (1L << (REPEATABLE - 163)) | (1L << (RETURNED_LENGTH - 163)) | (1L << (RETURNED_OCTET_LENGTH - 163)) | (1L << (RETURNED_SQLSTATE - 163)) | (1L << (ROW_COUNT - 163)) | (1L << (SCALE - 163)) | (1L << (SCHEMA_NAME - 163)) | (1L << (SERIALIZABLE - 163)) | (1L << (SERVER_NAME - 163)) | (1L << (SUBCLASS_ORIGIN - 163)) | (1L << (TABLE_NAME - 163)) | (1L << (UNCOMMITTED - 163)) | (1L << (UNNAMED - 163)))) != 0)) ) {
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

	public static class VariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> AT_() { return getTokens(SQL92StatementParser.AT_); }
		public TerminalNode AT_(int i) {
			return getToken(SQL92StatementParser.AT_, i);
		}
		public TerminalNode DOT_() { return getToken(SQL92StatementParser.DOT_, 0); }
		public TerminalNode GLOBAL() { return getToken(SQL92StatementParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(SQL92StatementParser.LOCAL, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_) {
				{
				setState(634);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(633);
					match(AT_);
					}
					break;
				}
				setState(636);
				match(AT_);
				}
			}

			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL || _la==GLOBAL) {
				{
				setState(639);
				_la = _input.LA(1);
				if ( !(_la==LOCAL || _la==GLOBAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_) {
				{
				setState(642);
				match(DOT_);
				}
			}

			setState(645);
			identifier();
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

	public static class SchemaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			identifier();
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

	public static class TableNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(SQL92StatementParser.DOT_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(649);
				owner();
				setState(650);
				match(DOT_);
				}
				break;
			}
			setState(654);
			name();
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

	public static class ColumnNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(SQL92StatementParser.DOT_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(656);
				owner();
				setState(657);
				match(DOT_);
				}
				break;
			}
			setState(661);
			name();
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

	public static class ViewNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(SQL92StatementParser.DOT_, 0); }
		public ViewNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitViewName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewNameContext viewName() throws RecognitionException {
		ViewNameContext _localctx = new ViewNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_viewName);
		try {
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(664);
					owner();
					setState(665);
					match(DOT_);
					}
					break;
				}
				setState(669);
				identifier();
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

	public static class OwnerContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OwnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_owner; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitOwner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnerContext owner() throws RecognitionException {
		OwnerContext _localctx = new OwnerContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_owner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			identifier();
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

	public static class NameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			identifier();
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

	public static class ColumnNamesContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitColumnNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_columnNames);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(676);
				match(LP_);
				}
			}

			setState(679);
			columnName();
			setState(684);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(680);
					match(COMMA_);
					setState(681);
					columnName();
					}
					} 
				}
				setState(686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(687);
				match(RP_);
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

	public static class TableNamesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public TableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitTableNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNamesContext tableNames() throws RecognitionException {
		TableNamesContext _localctx = new TableNamesContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_tableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(690);
				match(LP_);
				}
			}

			setState(693);
			tableName();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(694);
				match(COMMA_);
				setState(695);
				tableName();
				}
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(701);
				match(RP_);
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

	public static class CharacterSetName_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQL92StatementParser.IDENTIFIER_, 0); }
		public CharacterSetName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSetName_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCharacterSetName_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterSetName_Context characterSetName_() throws RecognitionException {
		CharacterSetName_Context _localctx = new CharacterSetName_Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_characterSetName_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(IDENTIFIER_);
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
		public NotOperator_Context notOperator_() {
			return getRuleContext(NotOperator_Context.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(707);
				notOperator_();
				setState(708);
				expr(3);
				}
				break;
			case 2:
				{
				setState(710);
				match(LP_);
				setState(711);
				expr(0);
				setState(712);
				match(RP_);
				}
				break;
			case 3:
				{
				setState(714);
				booleanPrimary(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(723);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(717);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(718);
					logicalOperator();
					setState(719);
					expr(5);
					}
					} 
				}
				setState(725);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SQL92StatementParser.OR, 0); }
		public TerminalNode AND() { return getToken(SQL92StatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(SQL92StatementParser.AND_, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			_la = _input.LA(1);
			if ( !(_la==AND_ || _la==AND || _la==OR) ) {
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

	public static class NotOperator_Context extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SQL92StatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(SQL92StatementParser.NOT_, 0); }
		public NotOperator_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOperator_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitNotOperator_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotOperator_Context notOperator_() throws RecognitionException {
		NotOperator_Context _localctx = new NotOperator_Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_notOperator_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			_la = _input.LA(1);
			if ( !(_la==NOT_ || _la==NOT) ) {
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

	public static class BooleanPrimaryContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode IS() { return getToken(SQL92StatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(SQL92StatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQL92StatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SQL92StatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(SQL92StatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SQL92StatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(SQL92StatementParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SQL92StatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(SQL92StatementParser.ANY, 0); }
		public BooleanPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrimary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitBooleanPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanPrimaryContext booleanPrimary() throws RecognitionException {
		return booleanPrimary(0);
	}

	private BooleanPrimaryContext booleanPrimary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanPrimaryContext _localctx = new BooleanPrimaryContext(_ctx, _parentState);
		BooleanPrimaryContext _prevctx = _localctx;
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(731);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(753);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(751);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(733);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(734);
						match(IS);
						setState(736);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(735);
							match(NOT);
							}
						}

						setState(738);
						_la = _input.LA(1);
						if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (NULL - 101)) | (1L << (TRUE - 101)) | (1L << (FALSE - 101)))) != 0) || _la==UNKNOWN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(739);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(740);
						match(SAFE_EQ_);
						setState(741);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(742);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(743);
						comparisonOperator();
						setState(744);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(746);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(747);
						comparisonOperator();
						setState(748);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(749);
						subquery();
						}
						break;
					}
					} 
				}
				setState(755);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(SQL92StatementParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(SQL92StatementParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(SQL92StatementParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(SQL92StatementParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(SQL92StatementParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(SQL92StatementParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ_) | (1L << NEQ_) | (1L << GT_) | (1L << GTE_) | (1L << LT_) | (1L << LTE_))) != 0)) ) {
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

	public static class PredicateContext extends ParserRuleContext {
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(SQL92StatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQL92StatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(SQL92StatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SQL92StatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SQL92StatementParser.LIKE, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SQL92StatementParser.ESCAPE, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_predicate);
		int _la;
		try {
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				bitExpr(0);
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(759);
					match(NOT);
					}
				}

				setState(762);
				match(IN);
				setState(763);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				bitExpr(0);
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(766);
					match(NOT);
					}
				}

				setState(769);
				match(IN);
				setState(770);
				match(LP_);
				setState(771);
				expr(0);
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(772);
					match(COMMA_);
					setState(773);
					expr(0);
					}
					}
					setState(778);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(779);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(781);
				bitExpr(0);
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(782);
					match(NOT);
					}
				}

				setState(785);
				match(BETWEEN);
				setState(786);
				bitExpr(0);
				setState(787);
				match(AND);
				setState(788);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(790);
				bitExpr(0);
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(791);
					match(NOT);
					}
				}

				setState(794);
				match(LIKE);
				setState(795);
				simpleExpr(0);
				setState(798);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(796);
					match(ESCAPE);
					setState(797);
					simpleExpr(0);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(800);
				bitExpr(0);
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

	public static class BitExprContext extends ParserRuleContext {
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode VERTICAL_BAR_() { return getToken(SQL92StatementParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(SQL92StatementParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(SQL92StatementParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(SQL92StatementParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(SQL92StatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(SQL92StatementParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(SQL92StatementParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(SQL92StatementParser.SLASH_, 0); }
		public TerminalNode MOD_() { return getToken(SQL92StatementParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(SQL92StatementParser.CARET_, 0); }
		public IntervalExpressionContext intervalExpression() {
			return getRuleContext(IntervalExpressionContext.class,0);
		}
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitBitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitExprContext bitExpr() throws RecognitionException {
		return bitExpr(0);
	}

	private BitExprContext bitExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitExprContext _localctx = new BitExprContext(_ctx, _parentState);
		BitExprContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(804);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(844);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(842);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(806);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(807);
						match(VERTICAL_BAR_);
						setState(808);
						bitExpr(14);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(809);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(810);
						match(AMPERSAND_);
						setState(811);
						bitExpr(13);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(812);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(813);
						match(SIGNED_LEFT_SHIFT_);
						setState(814);
						bitExpr(12);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(815);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(816);
						match(SIGNED_RIGHT_SHIFT_);
						setState(817);
						bitExpr(11);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(818);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(819);
						match(PLUS_);
						setState(820);
						bitExpr(10);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(821);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(822);
						match(MINUS_);
						setState(823);
						bitExpr(9);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(824);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(825);
						match(ASTERISK_);
						setState(826);
						bitExpr(8);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(827);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(828);
						match(SLASH_);
						setState(829);
						bitExpr(7);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(830);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(831);
						match(MOD_);
						setState(832);
						bitExpr(6);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(833);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(834);
						match(CARET_);
						setState(835);
						bitExpr(5);
						}
						break;
					case 11:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(836);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(837);
						match(PLUS_);
						setState(838);
						intervalExpression();
						}
						break;
					case 12:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(839);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(840);
						match(MINUS_);
						setState(841);
						intervalExpression();
						}
						break;
					}
					} 
				}
				setState(846);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
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

	public static class SimpleExprContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode PLUS_() { return getToken(SQL92StatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(SQL92StatementParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(SQL92StatementParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(SQL92StatementParser.NOT_, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(SQL92StatementParser.EXISTS, 0); }
		public TerminalNode LBE_() { return getToken(SQL92StatementParser.LBE_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBE_() { return getToken(SQL92StatementParser.RBE_, 0); }
		public MatchExpression_Context matchExpression_() {
			return getRuleContext(MatchExpression_Context.class,0);
		}
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public IntervalExpressionContext intervalExpression() {
			return getRuleContext(IntervalExpressionContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(SQL92StatementParser.COLLATE, 0); }
		public TerminalNode STRING_() { return getToken(SQL92StatementParser.STRING_, 0); }
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		return simpleExpr(0);
	}

	private SimpleExprContext simpleExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, _parentState);
		SimpleExprContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_simpleExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(848);
				functionCall();
				}
				break;
			case 2:
				{
				setState(849);
				parameterMarker();
				}
				break;
			case 3:
				{
				setState(850);
				literals();
				}
				break;
			case 4:
				{
				setState(851);
				columnName();
				}
				break;
			case 5:
				{
				setState(852);
				variable();
				}
				break;
			case 6:
				{
				setState(853);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(854);
				simpleExpr(7);
				}
				break;
			case 7:
				{
				setState(855);
				match(LP_);
				setState(856);
				expr(0);
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(857);
					match(COMMA_);
					setState(858);
					expr(0);
					}
					}
					setState(863);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(864);
				match(RP_);
				}
				break;
			case 8:
				{
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS) {
					{
					setState(866);
					match(EXISTS);
					}
				}

				setState(869);
				subquery();
				}
				break;
			case 9:
				{
				setState(870);
				match(LBE_);
				setState(871);
				identifier();
				setState(872);
				expr(0);
				setState(873);
				match(RBE_);
				}
				break;
			case 10:
				{
				setState(875);
				matchExpression_();
				}
				break;
			case 11:
				{
				setState(876);
				caseExpression();
				}
				break;
			case 12:
				{
				setState(877);
				intervalExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(888);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
					setState(880);
					if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
					setState(881);
					match(COLLATE);
					setState(884);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING_:
						{
						setState(882);
						match(STRING_);
						}
						break;
					case NAME:
					case TYPE:
					case ADA:
					case C92:
					case CATALOG_NAME:
					case CHARACTER_SET_CATALOG:
					case CHARACTER_SET_NAME:
					case CHARACTER_SET_SCHEMA:
					case CLASS_ORIGIN:
					case COBOL:
					case COLLATION_CATALOG:
					case COLLATION_NAME:
					case COLLATION_SCHEMA:
					case COLUMN_NAME:
					case COMMAND_FUNCTION:
					case COMMITTED:
					case CONDITION_NUMBER:
					case CONNECTION_NAME:
					case CONSTRAINT_CATALOG:
					case CONSTRAINT_NAME:
					case CONSTRAINT_SCHEMA:
					case CURSOR_NAME:
					case DATA:
					case DATETIME_INTERVAL_CODE:
					case DATETIME_INTERVAL_PRECISION:
					case DYNAMIC_FUNCTION:
					case FORTRAN:
					case LENGTH:
					case MESSAGE_LENGTH:
					case MESSAGE_OCTET_LENGTH:
					case MESSAGE_TEXT:
					case MORE92:
					case MUMPS:
					case NULLABLE:
					case NUMBER:
					case PASCAL:
					case PLI:
					case REPEATABLE:
					case RETURNED_LENGTH:
					case RETURNED_OCTET_LENGTH:
					case RETURNED_SQLSTATE:
					case ROW_COUNT:
					case SCALE:
					case SCHEMA_NAME:
					case SERIALIZABLE:
					case SERVER_NAME:
					case SUBCLASS_ORIGIN:
					case TABLE_NAME:
					case UNCOMMITTED:
					case UNNAMED:
					case IDENTIFIER_:
						{
						setState(883);
						identifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public AggregationFunctionContext aggregationFunction() {
			return getRuleContext(AggregationFunctionContext.class,0);
		}
		public SpecialFunctionContext specialFunction() {
			return getRuleContext(SpecialFunctionContext.class,0);
		}
		public RegularFunctionContext regularFunction() {
			return getRuleContext(RegularFunctionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_functionCall);
		try {
			setState(894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				aggregationFunction();
				}
				break;
			case POSITION:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case CONVERT:
			case EXTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				specialFunction();
				}
				break;
			case IF:
			case INTERVAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case CURRENT_TIMESTAMP:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 3);
				{
				setState(893);
				regularFunction();
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

	public static class AggregationFunctionContext extends ParserRuleContext {
		public AggregationFunctionNameContext aggregationFunctionName() {
			return getRuleContext(AggregationFunctionNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(SQL92StatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAggregationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			aggregationFunctionName();
			setState(897);
			match(LP_);
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(898);
				distinct();
				}
			}

			setState(910);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case POSITION:
			case CASE:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case LOCAL:
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case EXTRACT:
			case GLOBAL:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(901);
				expr(0);
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(902);
					match(COMMA_);
					setState(903);
					expr(0);
					}
					}
					setState(908);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(909);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(912);
			match(RP_);
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

	public static class AggregationFunctionNameContext extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(SQL92StatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(SQL92StatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(SQL92StatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(SQL92StatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(SQL92StatementParser.AVG, 0); }
		public AggregationFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunctionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAggregationFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionNameContext aggregationFunctionName() throws RecognitionException {
		AggregationFunctionNameContext _localctx = new AggregationFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_aggregationFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			_la = _input.LA(1);
			if ( !(((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (MAX - 142)) | (1L << (MIN - 142)) | (1L << (SUM - 142)) | (1L << (COUNT - 142)) | (1L << (AVG - 142)))) != 0)) ) {
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

	public static class DistinctContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SQL92StatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDistinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(DISTINCT);
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

	public static class SpecialFunctionContext extends ParserRuleContext {
		public CastFunctionContext castFunction() {
			return getRuleContext(CastFunctionContext.class,0);
		}
		public ConvertFunctionContext convertFunction() {
			return getRuleContext(ConvertFunctionContext.class,0);
		}
		public PositionFunctionContext positionFunction() {
			return getRuleContext(PositionFunctionContext.class,0);
		}
		public SubstringFunctionContext substringFunction() {
			return getRuleContext(SubstringFunctionContext.class,0);
		}
		public ExtractFunctionContext extractFunction() {
			return getRuleContext(ExtractFunctionContext.class,0);
		}
		public TrimFunction_Context trimFunction_() {
			return getRuleContext(TrimFunction_Context.class,0);
		}
		public SpecialFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSpecialFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialFunctionContext specialFunction() throws RecognitionException {
		SpecialFunctionContext _localctx = new SpecialFunctionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_specialFunction);
		try {
			setState(924);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(918);
				castFunction();
				}
				break;
			case CONVERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(919);
				convertFunction();
				}
				break;
			case POSITION:
				enterOuterAlt(_localctx, 3);
				{
				setState(920);
				positionFunction();
				}
				break;
			case SUBSTRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(921);
				substringFunction();
				}
				break;
			case EXTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(922);
				extractFunction();
				}
				break;
			case TRIM:
				enterOuterAlt(_localctx, 6);
				{
				setState(923);
				trimFunction_();
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

	public static class CastFunctionContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(SQL92StatementParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public TerminalNode AS() { return getToken(SQL92StatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SQL92StatementParser.NULL, 0); }
		public CastFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCastFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastFunctionContext castFunction() throws RecognitionException {
		CastFunctionContext _localctx = new CastFunctionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_castFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(CAST);
			setState(927);
			match(LP_);
			setState(930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(928);
				expr(0);
				}
				break;
			case 2:
				{
				setState(929);
				match(NULL);
				}
				break;
			}
			setState(932);
			match(AS);
			setState(933);
			dataType();
			setState(934);
			match(RP_);
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

	public static class ConvertFunctionContext extends ParserRuleContext {
		public TerminalNode CONVERT() { return getToken(SQL92StatementParser.CONVERT, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(SQL92StatementParser.USING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public ConvertFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convertFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitConvertFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConvertFunctionContext convertFunction() throws RecognitionException {
		ConvertFunctionContext _localctx = new ConvertFunctionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_convertFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(CONVERT);
			setState(937);
			match(LP_);
			setState(938);
			expr(0);
			setState(939);
			match(USING);
			setState(940);
			identifier();
			setState(941);
			match(RP_);
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

	public static class PositionFunctionContext extends ParserRuleContext {
		public TerminalNode POSITION() { return getToken(SQL92StatementParser.POSITION, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(SQL92StatementParser.IN, 0); }
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public PositionFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitPositionFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionFunctionContext positionFunction() throws RecognitionException {
		PositionFunctionContext _localctx = new PositionFunctionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_positionFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			match(POSITION);
			setState(944);
			match(LP_);
			setState(945);
			expr(0);
			setState(946);
			match(IN);
			setState(947);
			expr(0);
			setState(948);
			match(RP_);
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

	public static class SubstringFunctionContext extends ParserRuleContext {
		public TerminalNode SUBSTRING() { return getToken(SQL92StatementParser.SUBSTRING, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQL92StatementParser.FROM, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(SQL92StatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQL92StatementParser.NUMBER_, i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public TerminalNode FOR() { return getToken(SQL92StatementParser.FOR, 0); }
		public SubstringFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substringFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSubstringFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubstringFunctionContext substringFunction() throws RecognitionException {
		SubstringFunctionContext _localctx = new SubstringFunctionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_substringFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			match(SUBSTRING);
			setState(951);
			match(LP_);
			setState(952);
			expr(0);
			setState(953);
			match(FROM);
			setState(954);
			match(NUMBER_);
			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(955);
				match(FOR);
				setState(956);
				match(NUMBER_);
				}
			}

			setState(959);
			match(RP_);
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

	public static class ExtractFunctionContext extends ParserRuleContext {
		public TerminalNode EXTRACT() { return getToken(SQL92StatementParser.EXTRACT, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQL92StatementParser.FROM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public ExtractFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitExtractFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtractFunctionContext extractFunction() throws RecognitionException {
		ExtractFunctionContext _localctx = new ExtractFunctionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_extractFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(EXTRACT);
			setState(962);
			match(LP_);
			setState(963);
			identifier();
			setState(964);
			match(FROM);
			setState(965);
			expr(0);
			setState(966);
			match(RP_);
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

	public static class TrimFunction_Context extends ParserRuleContext {
		public TerminalNode TRIM() { return getToken(SQL92StatementParser.TRIM, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(SQL92StatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(SQL92StatementParser.STRING_, i);
		}
		public TerminalNode FROM() { return getToken(SQL92StatementParser.FROM, 0); }
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public TerminalNode LEADING() { return getToken(SQL92StatementParser.LEADING, 0); }
		public TerminalNode BOTH() { return getToken(SQL92StatementParser.BOTH, 0); }
		public TerminalNode TRAILING() { return getToken(SQL92StatementParser.TRAILING, 0); }
		public TrimFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trimFunction_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitTrimFunction_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrimFunction_Context trimFunction_() throws RecognitionException {
		TrimFunction_Context _localctx = new TrimFunction_Context(_ctx, getState());
		enterRule(_localctx, 150, RULE_trimFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(TRIM);
			setState(969);
			match(LP_);
			setState(970);
			_la = _input.LA(1);
			if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(971);
			match(STRING_);
			setState(972);
			match(FROM);
			setState(973);
			match(STRING_);
			setState(974);
			match(RP_);
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

	public static class RegularFunctionContext extends ParserRuleContext {
		public RegularFunctionName_Context regularFunctionName_() {
			return getRuleContext(RegularFunctionName_Context.class,0);
		}
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(SQL92StatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public RegularFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitRegularFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionContext regularFunction() throws RecognitionException {
		RegularFunctionContext _localctx = new RegularFunctionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_regularFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			regularFunctionName_();
			setState(977);
			match(LP_);
			setState(987);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case POSITION:
			case CASE:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case LOCAL:
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case EXTRACT:
			case GLOBAL:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(978);
				expr(0);
				setState(983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(979);
					match(COMMA_);
					setState(980);
					expr(0);
					}
					}
					setState(985);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(986);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(989);
			match(RP_);
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

	public static class RegularFunctionName_Context extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQL92StatementParser.IF, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SQL92StatementParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(SQL92StatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(SQL92StatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(SQL92StatementParser.INTERVAL, 0); }
		public RegularFunctionName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunctionName_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitRegularFunctionName_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionName_Context regularFunctionName_() throws RecognitionException {
		RegularFunctionName_Context _localctx = new RegularFunctionName_Context(_ctx, getState());
		enterRule(_localctx, 154, RULE_regularFunctionName_);
		try {
			setState(997);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(991);
				identifier();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(992);
				match(IF);
				}
				break;
			case CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(993);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case LOCALTIME:
				enterOuterAlt(_localctx, 4);
				{
				setState(994);
				match(LOCALTIME);
				}
				break;
			case LOCALTIMESTAMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(995);
				match(LOCALTIMESTAMP);
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(996);
				match(INTERVAL);
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

	public static class MatchExpression_Context extends ParserRuleContext {
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(SQL92StatementParser.MATCH, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode PARTIAL() { return getToken(SQL92StatementParser.PARTIAL, 0); }
		public TerminalNode FULL() { return getToken(SQL92StatementParser.FULL, 0); }
		public TerminalNode UNIQUE() { return getToken(SQL92StatementParser.UNIQUE, 0); }
		public MatchExpression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchExpression_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitMatchExpression_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchExpression_Context matchExpression_() throws RecognitionException {
		MatchExpression_Context _localctx = new MatchExpression_Context(_ctx, getState());
		enterRule(_localctx, 156, RULE_matchExpression_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			literals();
			setState(1000);
			match(MATCH);
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(1001);
				match(UNIQUE);
				}
			}

			setState(1004);
			_la = _input.LA(1);
			if ( !(_la==FULL || _la==PARTIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1005);
			subquery();
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

	public static class CaseExpressionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(SQL92StatementParser.CASE, 0); }
		public TerminalNode END() { return getToken(SQL92StatementParser.END, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<CaseWhen_Context> caseWhen_() {
			return getRuleContexts(CaseWhen_Context.class);
		}
		public CaseWhen_Context caseWhen_(int i) {
			return getRuleContext(CaseWhen_Context.class,i);
		}
		public CaseElse_Context caseElse_() {
			return getRuleContext(CaseElse_Context.class,0);
		}
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_caseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			match(CASE);
			setState(1009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_) | (1L << DOT_) | (1L << LP_) | (1L << LBE_) | (1L << QUESTION_) | (1L << AT_) | (1L << POSITION))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (CASE - 74)) | (1L << (CAST - 74)) | (1L << (TRIM - 74)) | (1L << (SUBSTRING - 74)) | (1L << (IF - 74)) | (1L << (NULL - 74)) | (1L << (TRUE - 74)) | (1L << (FALSE - 74)) | (1L << (EXISTS - 74)) | (1L << (INTERVAL - 74)) | (1L << (DATE - 74)) | (1L << (TIME - 74)) | (1L << (TIMESTAMP - 74)) | (1L << (LOCALTIME - 74)) | (1L << (LOCALTIMESTAMP - 74)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (MAX - 142)) | (1L << (MIN - 142)) | (1L << (SUM - 142)) | (1L << (COUNT - 142)) | (1L << (AVG - 142)) | (1L << (LOCAL - 142)) | (1L << (NAME - 142)) | (1L << (TYPE - 142)) | (1L << (ADA - 142)) | (1L << (C92 - 142)) | (1L << (CATALOG_NAME - 142)) | (1L << (CHARACTER_SET_CATALOG - 142)) | (1L << (CHARACTER_SET_NAME - 142)) | (1L << (CHARACTER_SET_SCHEMA - 142)) | (1L << (CLASS_ORIGIN - 142)) | (1L << (COBOL - 142)) | (1L << (COLLATION_CATALOG - 142)) | (1L << (COLLATION_NAME - 142)) | (1L << (COLLATION_SCHEMA - 142)) | (1L << (COLUMN_NAME - 142)) | (1L << (COMMAND_FUNCTION - 142)) | (1L << (COMMITTED - 142)) | (1L << (CONDITION_NUMBER - 142)) | (1L << (CONNECTION_NAME - 142)) | (1L << (CONSTRAINT_CATALOG - 142)) | (1L << (CONSTRAINT_NAME - 142)) | (1L << (CONSTRAINT_SCHEMA - 142)) | (1L << (CURSOR_NAME - 142)) | (1L << (DATA - 142)) | (1L << (DATETIME_INTERVAL_CODE - 142)) | (1L << (DATETIME_INTERVAL_PRECISION - 142)) | (1L << (DYNAMIC_FUNCTION - 142)) | (1L << (FORTRAN - 142)) | (1L << (LENGTH - 142)) | (1L << (MESSAGE_LENGTH - 142)) | (1L << (MESSAGE_OCTET_LENGTH - 142)) | (1L << (MESSAGE_TEXT - 142)) | (1L << (MORE92 - 142)) | (1L << (MUMPS - 142)) | (1L << (NULLABLE - 142)) | (1L << (NUMBER - 142)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (PASCAL - 206)) | (1L << (PLI - 206)) | (1L << (REPEATABLE - 206)) | (1L << (RETURNED_LENGTH - 206)) | (1L << (RETURNED_OCTET_LENGTH - 206)) | (1L << (RETURNED_SQLSTATE - 206)) | (1L << (ROW_COUNT - 206)) | (1L << (SCALE - 206)) | (1L << (SCHEMA_NAME - 206)) | (1L << (SERIALIZABLE - 206)) | (1L << (SERVER_NAME - 206)) | (1L << (SUBCLASS_ORIGIN - 206)) | (1L << (TABLE_NAME - 206)) | (1L << (UNCOMMITTED - 206)) | (1L << (UNNAMED - 206)) | (1L << (CONVERT - 206)) | (1L << (CURRENT_TIMESTAMP - 206)) | (1L << (EXTRACT - 206)))) != 0) || _la==GLOBAL || ((((_la - 340)) & ~0x3f) == 0 && ((1L << (_la - 340)) & ((1L << (IDENTIFIER_ - 340)) | (1L << (STRING_ - 340)) | (1L << (NUMBER_ - 340)) | (1L << (HEX_DIGIT_ - 340)) | (1L << (BIT_NUM_ - 340)))) != 0)) {
				{
				setState(1008);
				simpleExpr(0);
				}
			}

			setState(1012); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1011);
				caseWhen_();
				}
				}
				setState(1014); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1016);
				caseElse_();
				}
			}

			setState(1019);
			match(END);
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

	public static class CaseWhen_Context extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(SQL92StatementParser.WHEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(SQL92StatementParser.THEN, 0); }
		public CaseWhen_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhen_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCaseWhen_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseWhen_Context caseWhen_() throws RecognitionException {
		CaseWhen_Context _localctx = new CaseWhen_Context(_ctx, getState());
		enterRule(_localctx, 160, RULE_caseWhen_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			match(WHEN);
			setState(1022);
			expr(0);
			setState(1023);
			match(THEN);
			setState(1024);
			expr(0);
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

	public static class CaseElse_Context extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(SQL92StatementParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseElse_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseElse_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCaseElse_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseElse_Context caseElse_() throws RecognitionException {
		CaseElse_Context _localctx = new CaseElse_Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_caseElse_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(ELSE);
			setState(1027);
			expr(0);
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

	public static class IntervalExpressionContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SQL92StatementParser.INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IntervalUnit_Context intervalUnit_() {
			return getRuleContext(IntervalUnit_Context.class,0);
		}
		public IntervalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitIntervalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalExpressionContext intervalExpression() throws RecognitionException {
		IntervalExpressionContext _localctx = new IntervalExpressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_intervalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			match(INTERVAL);
			setState(1030);
			expr(0);
			setState(1031);
			intervalUnit_();
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

	public static class IntervalUnit_Context extends ParserRuleContext {
		public TerminalNode MICROSECOND() { return getToken(SQL92StatementParser.MICROSECOND, 0); }
		public TerminalNode SECOND() { return getToken(SQL92StatementParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(SQL92StatementParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(SQL92StatementParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(SQL92StatementParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(SQL92StatementParser.WEEK, 0); }
		public TerminalNode MONTH() { return getToken(SQL92StatementParser.MONTH, 0); }
		public TerminalNode QUARTER() { return getToken(SQL92StatementParser.QUARTER, 0); }
		public TerminalNode YEAR() { return getToken(SQL92StatementParser.YEAR, 0); }
		public IntervalUnit_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalUnit_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitIntervalUnit_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalUnit_Context intervalUnit_() throws RecognitionException {
		IntervalUnit_Context _localctx = new IntervalUnit_Context(_ctx, getState());
		enterRule(_localctx, 166, RULE_intervalUnit_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			_la = _input.LA(1);
			if ( !(((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (YEAR - 133)) | (1L << (QUARTER - 133)) | (1L << (MONTH - 133)) | (1L << (WEEK - 133)) | (1L << (DAY - 133)) | (1L << (HOUR - 133)) | (1L << (MINUTE - 133)) | (1L << (SECOND - 133)) | (1L << (MICROSECOND - 133)))) != 0)) ) {
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SQL92StatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQL92StatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			match(ORDER);
			setState(1036);
			match(BY);
			setState(1037);
			orderByItem();
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1038);
				match(COMMA_);
				setState(1039);
				orderByItem();
				}
				}
				setState(1044);
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

	public static class OrderByItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQL92StatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQL92StatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitOrderByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case IDENTIFIER_:
				{
				setState(1045);
				columnName();
				}
				break;
			case MINUS_:
			case NUMBER_:
				{
				setState(1046);
				numberLiterals();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1049);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public CharacterSet_Context characterSet_() {
			return getRuleContext(CharacterSet_Context.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(SQL92StatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(SQL92StatementParser.STRING_, i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_dataType);
		int _la;
		try {
			setState(1079);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1052);
				dataTypeName();
				setState(1054);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1053);
					dataTypeLength();
					}
				}

				setState(1057);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHAR || _la==CHARACTER) {
					{
					setState(1056);
					characterSet_();
					}
				}

				setState(1060);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1059);
					collateClause_();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1062);
				dataTypeName();
				setState(1063);
				match(LP_);
				setState(1064);
				match(STRING_);
				setState(1069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1065);
					match(COMMA_);
					setState(1066);
					match(STRING_);
					}
					}
					setState(1071);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1072);
				match(RP_);
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHAR || _la==CHARACTER) {
					{
					setState(1073);
					characterSet_();
					}
				}

				setState(1077);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1076);
					collateClause_();
					}
					break;
				}
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

	public static class DataTypeNameContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(SQL92StatementParser.CHARACTER, 0); }
		public TerminalNode VARYING() { return getToken(SQL92StatementParser.VARYING, 0); }
		public TerminalNode NATIONAL() { return getToken(SQL92StatementParser.NATIONAL, 0); }
		public TerminalNode CHAR() { return getToken(SQL92StatementParser.CHAR, 0); }
		public TerminalNode VARCHAR() { return getToken(SQL92StatementParser.VARCHAR, 0); }
		public TerminalNode NCHAR() { return getToken(SQL92StatementParser.NCHAR, 0); }
		public TerminalNode BIT() { return getToken(SQL92StatementParser.BIT, 0); }
		public TerminalNode NUMERIC() { return getToken(SQL92StatementParser.NUMERIC, 0); }
		public TerminalNode DECIMAL() { return getToken(SQL92StatementParser.DECIMAL, 0); }
		public TerminalNode DEC() { return getToken(SQL92StatementParser.DEC, 0); }
		public TerminalNode INTEGER() { return getToken(SQL92StatementParser.INTEGER, 0); }
		public TerminalNode SMALLINT() { return getToken(SQL92StatementParser.SMALLINT, 0); }
		public TerminalNode FLOAT() { return getToken(SQL92StatementParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(SQL92StatementParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(SQL92StatementParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(SQL92StatementParser.PRECISION, 0); }
		public TerminalNode DATE() { return getToken(SQL92StatementParser.DATE, 0); }
		public List<TerminalNode> TIME() { return getTokens(SQL92StatementParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(SQL92StatementParser.TIME, i);
		}
		public TerminalNode TIMESTAMP() { return getToken(SQL92StatementParser.TIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(SQL92StatementParser.INTERVAL, 0); }
		public TerminalNode WITH() { return getToken(SQL92StatementParser.WITH, 0); }
		public TerminalNode ZONE() { return getToken(SQL92StatementParser.ZONE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDataTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeNameContext dataTypeName() throws RecognitionException {
		DataTypeNameContext _localctx = new DataTypeNameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_dataTypeName);
		try {
			setState(1122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1081);
				match(CHARACTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1082);
				match(CHARACTER);
				setState(1083);
				match(VARYING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1084);
				match(NATIONAL);
				setState(1085);
				match(CHARACTER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1086);
				match(NATIONAL);
				setState(1087);
				match(CHARACTER);
				setState(1088);
				match(VARYING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1089);
				match(CHAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1090);
				match(VARCHAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1091);
				match(NCHAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1092);
				match(NATIONAL);
				setState(1093);
				match(CHAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1094);
				match(NATIONAL);
				setState(1095);
				match(CHAR);
				setState(1096);
				match(VARYING);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1097);
				match(BIT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1098);
				match(BIT);
				setState(1099);
				match(VARYING);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1100);
				match(NUMERIC);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1101);
				match(DECIMAL);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1102);
				match(DEC);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1103);
				match(INTEGER);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1104);
				match(SMALLINT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1105);
				match(FLOAT);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1106);
				match(REAL);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1107);
				match(DOUBLE);
				setState(1108);
				match(PRECISION);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1109);
				match(DATE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1110);
				match(TIME);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1111);
				match(TIMESTAMP);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1112);
				match(INTERVAL);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1113);
				match(TIME);
				setState(1114);
				match(WITH);
				setState(1115);
				match(TIME);
				setState(1116);
				match(ZONE);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1117);
				match(TIMESTAMP);
				setState(1118);
				match(WITH);
				setState(1119);
				match(TIME);
				setState(1120);
				match(ZONE);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1121);
				identifier();
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

	public static class DataTypeLengthContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(SQL92StatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQL92StatementParser.NUMBER_, i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(SQL92StatementParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDataTypeLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			match(LP_);
			setState(1125);
			match(NUMBER_);
			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(1126);
				match(COMMA_);
				setState(1127);
				match(NUMBER_);
				}
			}

			setState(1130);
			match(RP_);
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

	public static class CharacterSet_Context extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQL92StatementParser.SET, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(SQL92StatementParser.CHARACTER, 0); }
		public TerminalNode CHAR() { return getToken(SQL92StatementParser.CHAR, 0); }
		public TerminalNode EQ_() { return getToken(SQL92StatementParser.EQ_, 0); }
		public CharacterSet_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSet_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCharacterSet_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterSet_Context characterSet_() throws RecognitionException {
		CharacterSet_Context _localctx = new CharacterSet_Context(_ctx, getState());
		enterRule(_localctx, 178, RULE_characterSet_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			_la = _input.LA(1);
			if ( !(_la==CHAR || _la==CHARACTER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1133);
			match(SET);
			setState(1135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(1134);
				match(EQ_);
				}
			}

			setState(1137);
			ignoredIdentifier_();
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

	public static class CollateClause_Context extends ParserRuleContext {
		public TerminalNode COLLATE() { return getToken(SQL92StatementParser.COLLATE, 0); }
		public TerminalNode STRING_() { return getToken(SQL92StatementParser.STRING_, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode EQ_() { return getToken(SQL92StatementParser.EQ_, 0); }
		public CollateClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCollateClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollateClause_Context collateClause_() throws RecognitionException {
		CollateClause_Context _localctx = new CollateClause_Context(_ctx, getState());
		enterRule(_localctx, 180, RULE_collateClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			match(COLLATE);
			setState(1141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(1140);
				match(EQ_);
				}
			}

			setState(1145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				{
				setState(1143);
				match(STRING_);
				}
				break;
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case IDENTIFIER_:
				{
				setState(1144);
				ignoredIdentifier_();
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

	public static class IgnoredIdentifier_Context extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT_() { return getToken(SQL92StatementParser.DOT_, 0); }
		public IgnoredIdentifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitIgnoredIdentifier_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoredIdentifier_Context ignoredIdentifier_() throws RecognitionException {
		IgnoredIdentifier_Context _localctx = new IgnoredIdentifier_Context(_ctx, getState());
		enterRule(_localctx, 182, RULE_ignoredIdentifier_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			identifier();
			setState(1150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1148);
				match(DOT_);
				setState(1149);
				identifier();
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

	public static class DropBehaviour_Context extends ParserRuleContext {
		public TerminalNode CASCADE() { return getToken(SQL92StatementParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SQL92StatementParser.RESTRICT, 0); }
		public DropBehaviour_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropBehaviour_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDropBehaviour_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropBehaviour_Context dropBehaviour_() throws RecognitionException {
		DropBehaviour_Context _localctx = new DropBehaviour_Context(_ctx, getState());
		enterRule(_localctx, 184, RULE_dropBehaviour_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(1152);
				_la = _input.LA(1);
				if ( !(_la==CASCADE || _la==RESTRICT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQL92StatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQL92StatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public CreateDefinitionClauseContext createDefinitionClause() {
			return getRuleContext(CreateDefinitionClauseContext.class,0);
		}
		public CreateLikeClause_Context createLikeClause_() {
			return getRuleContext(CreateLikeClause_Context.class,0);
		}
		public CreateTableSpecification_Context createTableSpecification_() {
			return getRuleContext(CreateTableSpecification_Context.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			match(CREATE);
			setState(1157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL || _la==GLOBAL) {
				{
				setState(1156);
				createTableSpecification_();
				}
			}

			setState(1159);
			match(TABLE);
			setState(1160);
			tableName();
			setState(1163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1161);
				createDefinitionClause();
				}
				break;
			case 2:
				{
				setState(1162);
				createLikeClause_();
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

	public static class AlterTableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQL92StatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SQL92StatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AlterDefinitionClauseContext alterDefinitionClause() {
			return getRuleContext(AlterDefinitionClauseContext.class,0);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAlterTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_alterTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			match(ALTER);
			setState(1166);
			match(TABLE);
			setState(1167);
			tableName();
			setState(1168);
			alterDefinitionClause();
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

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQL92StatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SQL92StatementParser.TABLE, 0); }
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public DropBehaviour_Context dropBehaviour_() {
			return getRuleContext(DropBehaviour_Context.class,0);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			match(DROP);
			setState(1171);
			match(TABLE);
			setState(1172);
			tableNames();
			setState(1173);
			dropBehaviour_();
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

	public static class CreateDatabaseContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQL92StatementParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(SQL92StatementParser.SCHEMA, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public List<CreateDatabaseSpecification_Context> createDatabaseSpecification_() {
			return getRuleContexts(CreateDatabaseSpecification_Context.class);
		}
		public CreateDatabaseSpecification_Context createDatabaseSpecification_(int i) {
			return getRuleContext(CreateDatabaseSpecification_Context.class,i);
		}
		public CreateDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCreateDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDatabaseContext createDatabase() throws RecognitionException {
		CreateDatabaseContext _localctx = new CreateDatabaseContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_createDatabase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			match(CREATE);
			setState(1176);
			match(SCHEMA);
			setState(1177);
			schemaName();
			setState(1181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT) {
				{
				{
				setState(1178);
				createDatabaseSpecification_();
				}
				}
				setState(1183);
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

	public static class DropDatabaseContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQL92StatementParser.DROP, 0); }
		public TerminalNode SCHEMA() { return getToken(SQL92StatementParser.SCHEMA, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public DropBehaviour_Context dropBehaviour_() {
			return getRuleContext(DropBehaviour_Context.class,0);
		}
		public DropDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDatabase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDropDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropDatabaseContext dropDatabase() throws RecognitionException {
		DropDatabaseContext _localctx = new DropDatabaseContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_dropDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			match(DROP);
			setState(1185);
			match(SCHEMA);
			setState(1186);
			schemaName();
			setState(1187);
			dropBehaviour_();
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

	public static class CreateViewContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQL92StatementParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SQL92StatementParser.VIEW, 0); }
		public ViewNameContext viewName() {
			return getRuleContext(ViewNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQL92StatementParser.AS, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public TerminalNode WITH() { return getToken(SQL92StatementParser.WITH, 0); }
		public TerminalNode CHECK() { return getToken(SQL92StatementParser.CHECK, 0); }
		public TerminalNode OPTION() { return getToken(SQL92StatementParser.OPTION, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public TerminalNode CASCADED() { return getToken(SQL92StatementParser.CASCADED, 0); }
		public TerminalNode LOCAL() { return getToken(SQL92StatementParser.LOCAL, 0); }
		public CreateViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createView; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateViewContext createView() throws RecognitionException {
		CreateViewContext _localctx = new CreateViewContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_createView);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			match(CREATE);
			setState(1190);
			match(VIEW);
			setState(1191);
			viewName();
			setState(1203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1192);
				match(LP_);
				setState(1193);
				identifier();
				setState(1198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1194);
					match(COMMA_);
					setState(1195);
					identifier();
					}
					}
					setState(1200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1201);
				match(RP_);
				}
			}

			setState(1205);
			match(AS);
			setState(1206);
			select();
			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1207);
				match(WITH);
				setState(1209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADED || _la==LOCAL) {
					{
					setState(1208);
					_la = _input.LA(1);
					if ( !(_la==CASCADED || _la==LOCAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1211);
				match(CHECK);
				setState(1212);
				match(OPTION);
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

	public static class DropViewContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQL92StatementParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SQL92StatementParser.VIEW, 0); }
		public ViewNameContext viewName() {
			return getRuleContext(ViewNameContext.class,0);
		}
		public DropBehaviour_Context dropBehaviour_() {
			return getRuleContext(DropBehaviour_Context.class,0);
		}
		public DropViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropView; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropViewContext dropView() throws RecognitionException {
		DropViewContext _localctx = new DropViewContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_dropView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			match(DROP);
			setState(1216);
			match(VIEW);
			setState(1217);
			viewName();
			setState(1218);
			dropBehaviour_();
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

	public static class CreateTableSpecification_Context extends ParserRuleContext {
		public TerminalNode TEMPORARY() { return getToken(SQL92StatementParser.TEMPORARY, 0); }
		public TerminalNode GLOBAL() { return getToken(SQL92StatementParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(SQL92StatementParser.LOCAL, 0); }
		public CreateTableSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableSpecification_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCreateTableSpecification_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableSpecification_Context createTableSpecification_() throws RecognitionException {
		CreateTableSpecification_Context _localctx = new CreateTableSpecification_Context(_ctx, getState());
		enterRule(_localctx, 200, RULE_createTableSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			_la = _input.LA(1);
			if ( !(_la==LOCAL || _la==GLOBAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1221);
			match(TEMPORARY);
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

	public static class CreateDefinitionClauseContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<CreateDefinitionContext> createDefinition() {
			return getRuleContexts(CreateDefinitionContext.class);
		}
		public CreateDefinitionContext createDefinition(int i) {
			return getRuleContext(CreateDefinitionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public CreateDefinitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCreateDefinitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDefinitionClauseContext createDefinitionClause() throws RecognitionException {
		CreateDefinitionClauseContext _localctx = new CreateDefinitionClauseContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_createDefinitionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			match(LP_);
			setState(1224);
			createDefinition();
			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1225);
				match(COMMA_);
				setState(1226);
				createDefinition();
				}
				}
				setState(1231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1232);
			match(RP_);
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

	public static class CreateDatabaseSpecification_Context extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SQL92StatementParser.DEFAULT, 0); }
		public TerminalNode CHARACTER() { return getToken(SQL92StatementParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(SQL92StatementParser.SET, 0); }
		public CharacterSetName_Context characterSetName_() {
			return getRuleContext(CharacterSetName_Context.class,0);
		}
		public TerminalNode EQ_() { return getToken(SQL92StatementParser.EQ_, 0); }
		public CreateDatabaseSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabaseSpecification_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCreateDatabaseSpecification_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDatabaseSpecification_Context createDatabaseSpecification_() throws RecognitionException {
		CreateDatabaseSpecification_Context _localctx = new CreateDatabaseSpecification_Context(_ctx, getState());
		enterRule(_localctx, 204, RULE_createDatabaseSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			match(DEFAULT);
			setState(1235);
			match(CHARACTER);
			setState(1236);
			match(SET);
			setState(1238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(1237);
				match(EQ_);
				}
			}

			setState(1240);
			characterSetName_();
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

	public static class CreateDefinitionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public ConstraintDefinitionContext constraintDefinition() {
			return getRuleContext(ConstraintDefinitionContext.class,0);
		}
		public CheckConstraintDefinition_Context checkConstraintDefinition_() {
			return getRuleContext(CheckConstraintDefinition_Context.class,0);
		}
		public CreateDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCreateDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDefinitionContext createDefinition() throws RecognitionException {
		CreateDefinitionContext _localctx = new CreateDefinitionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_createDefinition);
		try {
			setState(1245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1242);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1243);
				constraintDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1244);
				checkConstraintDefinition_();
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

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<DataTypeOptionContext> dataTypeOption() {
			return getRuleContexts(DataTypeOptionContext.class);
		}
		public DataTypeOptionContext dataTypeOption(int i) {
			return getRuleContext(DataTypeOptionContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			columnName();
			setState(1248);
			dataType();
			setState(1252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTRAINT) | (1L << PRIMARY) | (1L << UNIQUE))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (NOT - 100)) | (1L << (NULL - 100)) | (1L << (DEFAULT - 100)))) != 0) || _la==CHECK || _la==COLLATE || _la==REFERENCES || _la==STRING_) {
				{
				{
				setState(1249);
				dataTypeOption();
				}
				}
				setState(1254);
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

	public static class DataTypeOptionContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQL92StatementParser.UNIQUE, 0); }
		public TerminalNode KEY() { return getToken(SQL92StatementParser.KEY, 0); }
		public TerminalNode NULL() { return getToken(SQL92StatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SQL92StatementParser.NOT, 0); }
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public CheckConstraintDefinition_Context checkConstraintDefinition_() {
			return getRuleContext(CheckConstraintDefinition_Context.class,0);
		}
		public ReferenceDefinitionContext referenceDefinition() {
			return getRuleContext(ReferenceDefinitionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SQL92StatementParser.DEFAULT, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQL92StatementParser.STRING_, 0); }
		public DataTypeOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDataTypeOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeOptionContext dataTypeOption() throws RecognitionException {
		DataTypeOptionContext _localctx = new DataTypeOptionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_dataTypeOption);
		int _la;
		try {
			setState(1273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1255);
				primaryKey();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1256);
				match(UNIQUE);
				setState(1258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(1257);
					match(KEY);
					}
				}

				}
				break;
			case NOT:
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1260);
					match(NOT);
					}
				}

				setState(1263);
				match(NULL);
				}
				break;
			case COLLATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1264);
				collateClause_();
				}
				break;
			case CONSTRAINT:
			case CHECK:
				enterOuterAlt(_localctx, 5);
				{
				setState(1265);
				checkConstraintDefinition_();
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 6);
				{
				setState(1266);
				referenceDefinition();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1267);
				match(DEFAULT);
				setState(1270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1268);
					literals();
					}
					break;
				case 2:
					{
					setState(1269);
					expr(0);
					}
					break;
				}
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 8);
				{
				setState(1272);
				match(STRING_);
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

	public static class CheckConstraintDefinition_Context extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(SQL92StatementParser.CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQL92StatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public CheckConstraintDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkConstraintDefinition_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCheckConstraintDefinition_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckConstraintDefinition_Context checkConstraintDefinition_() throws RecognitionException {
		CheckConstraintDefinition_Context _localctx = new CheckConstraintDefinition_Context(_ctx, getState());
		enterRule(_localctx, 212, RULE_checkConstraintDefinition_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1275);
				match(CONSTRAINT);
				setState(1277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (NAME - 163)) | (1L << (TYPE - 163)) | (1L << (ADA - 163)) | (1L << (C92 - 163)) | (1L << (CATALOG_NAME - 163)) | (1L << (CHARACTER_SET_CATALOG - 163)) | (1L << (CHARACTER_SET_NAME - 163)) | (1L << (CHARACTER_SET_SCHEMA - 163)) | (1L << (CLASS_ORIGIN - 163)) | (1L << (COBOL - 163)) | (1L << (COLLATION_CATALOG - 163)) | (1L << (COLLATION_NAME - 163)) | (1L << (COLLATION_SCHEMA - 163)) | (1L << (COLUMN_NAME - 163)) | (1L << (COMMAND_FUNCTION - 163)) | (1L << (COMMITTED - 163)) | (1L << (CONDITION_NUMBER - 163)) | (1L << (CONNECTION_NAME - 163)) | (1L << (CONSTRAINT_CATALOG - 163)) | (1L << (CONSTRAINT_NAME - 163)) | (1L << (CONSTRAINT_SCHEMA - 163)) | (1L << (CURSOR_NAME - 163)) | (1L << (DATA - 163)) | (1L << (DATETIME_INTERVAL_CODE - 163)) | (1L << (DATETIME_INTERVAL_PRECISION - 163)) | (1L << (DYNAMIC_FUNCTION - 163)) | (1L << (FORTRAN - 163)) | (1L << (LENGTH - 163)) | (1L << (MESSAGE_LENGTH - 163)) | (1L << (MESSAGE_OCTET_LENGTH - 163)) | (1L << (MESSAGE_TEXT - 163)) | (1L << (MORE92 - 163)) | (1L << (MUMPS - 163)) | (1L << (NULLABLE - 163)) | (1L << (NUMBER - 163)) | (1L << (PASCAL - 163)) | (1L << (PLI - 163)) | (1L << (REPEATABLE - 163)) | (1L << (RETURNED_LENGTH - 163)) | (1L << (RETURNED_OCTET_LENGTH - 163)) | (1L << (RETURNED_SQLSTATE - 163)) | (1L << (ROW_COUNT - 163)) | (1L << (SCALE - 163)) | (1L << (SCHEMA_NAME - 163)) | (1L << (SERIALIZABLE - 163)) | (1L << (SERVER_NAME - 163)) | (1L << (SUBCLASS_ORIGIN - 163)) | (1L << (TABLE_NAME - 163)) | (1L << (UNCOMMITTED - 163)) | (1L << (UNNAMED - 163)))) != 0) || _la==IDENTIFIER_) {
					{
					setState(1276);
					ignoredIdentifier_();
					}
				}

				}
			}

			setState(1281);
			match(CHECK);
			setState(1282);
			expr(0);
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

	public static class ReferenceDefinitionContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(SQL92StatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public KeyParts_Context keyParts_() {
			return getRuleContext(KeyParts_Context.class,0);
		}
		public TerminalNode MATCH() { return getToken(SQL92StatementParser.MATCH, 0); }
		public TerminalNode FULL() { return getToken(SQL92StatementParser.FULL, 0); }
		public TerminalNode PARTIAL() { return getToken(SQL92StatementParser.PARTIAL, 0); }
		public TerminalNode UNIQUE() { return getToken(SQL92StatementParser.UNIQUE, 0); }
		public List<TerminalNode> ON() { return getTokens(SQL92StatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SQL92StatementParser.ON, i);
		}
		public List<ReferenceOption_Context> referenceOption_() {
			return getRuleContexts(ReferenceOption_Context.class);
		}
		public ReferenceOption_Context referenceOption_(int i) {
			return getRuleContext(ReferenceOption_Context.class,i);
		}
		public List<TerminalNode> UPDATE() { return getTokens(SQL92StatementParser.UPDATE); }
		public TerminalNode UPDATE(int i) {
			return getToken(SQL92StatementParser.UPDATE, i);
		}
		public List<TerminalNode> DELETE() { return getTokens(SQL92StatementParser.DELETE); }
		public TerminalNode DELETE(int i) {
			return getToken(SQL92StatementParser.DELETE, i);
		}
		public ReferenceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitReferenceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceDefinitionContext referenceDefinition() throws RecognitionException {
		ReferenceDefinitionContext _localctx = new ReferenceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_referenceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			match(REFERENCES);
			setState(1285);
			tableName();
			setState(1286);
			keyParts_();
			setState(1293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1287);
				match(MATCH);
				setState(1288);
				match(FULL);
				}
				break;
			case 2:
				{
				setState(1289);
				match(MATCH);
				setState(1290);
				match(PARTIAL);
				}
				break;
			case 3:
				{
				setState(1291);
				match(MATCH);
				setState(1292);
				match(UNIQUE);
				}
				break;
			}
			setState(1300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ON) {
				{
				{
				setState(1295);
				match(ON);
				setState(1296);
				_la = _input.LA(1);
				if ( !(_la==UPDATE || _la==DELETE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1297);
				referenceOption_();
				}
				}
				setState(1302);
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

	public static class ReferenceOption_Context extends ParserRuleContext {
		public TerminalNode RESTRICT() { return getToken(SQL92StatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SQL92StatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(SQL92StatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(SQL92StatementParser.NULL, 0); }
		public TerminalNode NO() { return getToken(SQL92StatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(SQL92StatementParser.ACTION, 0); }
		public TerminalNode DEFAULT() { return getToken(SQL92StatementParser.DEFAULT, 0); }
		public ReferenceOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceOption_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitReferenceOption_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceOption_Context referenceOption_() throws RecognitionException {
		ReferenceOption_Context _localctx = new ReferenceOption_Context(_ctx, getState());
		enterRule(_localctx, 216, RULE_referenceOption_);
		try {
			setState(1311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1303);
				match(RESTRICT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1304);
				match(CASCADE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1305);
				match(SET);
				setState(1306);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1307);
				match(NO);
				setState(1308);
				match(ACTION);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1309);
				match(SET);
				setState(1310);
				match(DEFAULT);
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

	public static class KeyParts_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public List<KeyPart_Context> keyPart_() {
			return getRuleContexts(KeyPart_Context.class);
		}
		public KeyPart_Context keyPart_(int i) {
			return getRuleContext(KeyPart_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public KeyParts_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyParts_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitKeyParts_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyParts_Context keyParts_() throws RecognitionException {
		KeyParts_Context _localctx = new KeyParts_Context(_ctx, getState());
		enterRule(_localctx, 218, RULE_keyParts_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1313);
			match(LP_);
			setState(1314);
			keyPart_();
			setState(1319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1315);
				match(COMMA_);
				setState(1316);
				keyPart_();
				}
				}
				setState(1321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1322);
			match(RP_);
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

	public static class KeyPart_Context extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQL92StatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQL92StatementParser.DESC, 0); }
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQL92StatementParser.NUMBER_, 0); }
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public KeyPart_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyPart_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitKeyPart_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyPart_Context keyPart_() throws RecognitionException {
		KeyPart_Context _localctx = new KeyPart_Context(_ctx, getState());
		enterRule(_localctx, 220, RULE_keyPart_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1324);
				columnName();
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1325);
					match(LP_);
					setState(1326);
					match(NUMBER_);
					setState(1327);
					match(RP_);
					}
				}

				}
				break;
			case 2:
				{
				setState(1330);
				expr(0);
				}
				break;
			}
			setState(1334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1333);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class ConstraintDefinitionContext extends ParserRuleContext {
		public PrimaryKeyOptionContext primaryKeyOption() {
			return getRuleContext(PrimaryKeyOptionContext.class,0);
		}
		public UniqueOption_Context uniqueOption_() {
			return getRuleContext(UniqueOption_Context.class,0);
		}
		public ForeignKeyOptionContext foreignKeyOption() {
			return getRuleContext(ForeignKeyOptionContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQL92StatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConstraintDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitConstraintDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintDefinitionContext constraintDefinition() throws RecognitionException {
		ConstraintDefinitionContext _localctx = new ConstraintDefinitionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_constraintDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1336);
				match(CONSTRAINT);
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (NAME - 163)) | (1L << (TYPE - 163)) | (1L << (ADA - 163)) | (1L << (C92 - 163)) | (1L << (CATALOG_NAME - 163)) | (1L << (CHARACTER_SET_CATALOG - 163)) | (1L << (CHARACTER_SET_NAME - 163)) | (1L << (CHARACTER_SET_SCHEMA - 163)) | (1L << (CLASS_ORIGIN - 163)) | (1L << (COBOL - 163)) | (1L << (COLLATION_CATALOG - 163)) | (1L << (COLLATION_NAME - 163)) | (1L << (COLLATION_SCHEMA - 163)) | (1L << (COLUMN_NAME - 163)) | (1L << (COMMAND_FUNCTION - 163)) | (1L << (COMMITTED - 163)) | (1L << (CONDITION_NUMBER - 163)) | (1L << (CONNECTION_NAME - 163)) | (1L << (CONSTRAINT_CATALOG - 163)) | (1L << (CONSTRAINT_NAME - 163)) | (1L << (CONSTRAINT_SCHEMA - 163)) | (1L << (CURSOR_NAME - 163)) | (1L << (DATA - 163)) | (1L << (DATETIME_INTERVAL_CODE - 163)) | (1L << (DATETIME_INTERVAL_PRECISION - 163)) | (1L << (DYNAMIC_FUNCTION - 163)) | (1L << (FORTRAN - 163)) | (1L << (LENGTH - 163)) | (1L << (MESSAGE_LENGTH - 163)) | (1L << (MESSAGE_OCTET_LENGTH - 163)) | (1L << (MESSAGE_TEXT - 163)) | (1L << (MORE92 - 163)) | (1L << (MUMPS - 163)) | (1L << (NULLABLE - 163)) | (1L << (NUMBER - 163)) | (1L << (PASCAL - 163)) | (1L << (PLI - 163)) | (1L << (REPEATABLE - 163)) | (1L << (RETURNED_LENGTH - 163)) | (1L << (RETURNED_OCTET_LENGTH - 163)) | (1L << (RETURNED_SQLSTATE - 163)) | (1L << (ROW_COUNT - 163)) | (1L << (SCALE - 163)) | (1L << (SCHEMA_NAME - 163)) | (1L << (SERIALIZABLE - 163)) | (1L << (SERVER_NAME - 163)) | (1L << (SUBCLASS_ORIGIN - 163)) | (1L << (TABLE_NAME - 163)) | (1L << (UNCOMMITTED - 163)) | (1L << (UNNAMED - 163)))) != 0) || _la==IDENTIFIER_) {
					{
					setState(1337);
					ignoredIdentifier_();
					}
				}

				}
			}

			setState(1345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				{
				setState(1342);
				primaryKeyOption();
				}
				break;
			case UNIQUE:
				{
				setState(1343);
				uniqueOption_();
				}
				break;
			case FOREIGN:
				{
				setState(1344);
				foreignKeyOption();
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

	public static class PrimaryKeyOptionContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public PrimaryKeyOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitPrimaryKeyOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyOptionContext primaryKeyOption() throws RecognitionException {
		PrimaryKeyOptionContext _localctx = new PrimaryKeyOptionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_primaryKeyOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			primaryKey();
			setState(1348);
			columnNames();
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

	public static class PrimaryKeyContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(SQL92StatementParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(SQL92StatementParser.KEY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_primaryKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			match(PRIMARY);
			setState(1351);
			match(KEY);
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

	public static class UniqueOption_Context extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(SQL92StatementParser.UNIQUE, 0); }
		public KeyParts_Context keyParts_() {
			return getRuleContext(KeyParts_Context.class,0);
		}
		public UniqueOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueOption_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitUniqueOption_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniqueOption_Context uniqueOption_() throws RecognitionException {
		UniqueOption_Context _localctx = new UniqueOption_Context(_ctx, getState());
		enterRule(_localctx, 228, RULE_uniqueOption_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			match(UNIQUE);
			setState(1354);
			keyParts_();
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

	public static class ForeignKeyOptionContext extends ParserRuleContext {
		public TerminalNode FOREIGN() { return getToken(SQL92StatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(SQL92StatementParser.KEY, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public ReferenceDefinitionContext referenceDefinition() {
			return getRuleContext(ReferenceDefinitionContext.class,0);
		}
		public ForeignKeyOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitForeignKeyOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyOptionContext foreignKeyOption() throws RecognitionException {
		ForeignKeyOptionContext _localctx = new ForeignKeyOptionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_foreignKeyOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			match(FOREIGN);
			setState(1357);
			match(KEY);
			setState(1358);
			columnNames();
			setState(1359);
			referenceDefinition();
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

	public static class CreateLikeClause_Context extends ParserRuleContext {
		public TerminalNode LIKE() { return getToken(SQL92StatementParser.LIKE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQL92StatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQL92StatementParser.RP_, 0); }
		public CreateLikeClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createLikeClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCreateLikeClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateLikeClause_Context createLikeClause_() throws RecognitionException {
		CreateLikeClause_Context _localctx = new CreateLikeClause_Context(_ctx, getState());
		enterRule(_localctx, 232, RULE_createLikeClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1361);
				match(LP_);
				}
			}

			setState(1364);
			match(LIKE);
			setState(1365);
			tableName();
			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(1366);
				match(RP_);
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

	public static class AlterDefinitionClauseContext extends ParserRuleContext {
		public AddColumnSpecificationContext addColumnSpecification() {
			return getRuleContext(AddColumnSpecificationContext.class,0);
		}
		public ModifyColumnSpecificationContext modifyColumnSpecification() {
			return getRuleContext(ModifyColumnSpecificationContext.class,0);
		}
		public DropColumnSpecificationContext dropColumnSpecification() {
			return getRuleContext(DropColumnSpecificationContext.class,0);
		}
		public AddConstraintSpecificationContext addConstraintSpecification() {
			return getRuleContext(AddConstraintSpecificationContext.class,0);
		}
		public DropConstraintSpecificationContext dropConstraintSpecification() {
			return getRuleContext(DropConstraintSpecificationContext.class,0);
		}
		public AlterDefinitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDefinitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAlterDefinitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDefinitionClauseContext alterDefinitionClause() throws RecognitionException {
		AlterDefinitionClauseContext _localctx = new AlterDefinitionClauseContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_alterDefinitionClause);
		try {
			setState(1374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1369);
				addColumnSpecification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1370);
				modifyColumnSpecification();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1371);
				dropColumnSpecification();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1372);
				addConstraintSpecification();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1373);
				dropConstraintSpecification();
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

	public static class AddColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SQL92StatementParser.ADD, 0); }
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SQL92StatementParser.COLUMN, 0); }
		public AddColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumnSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAddColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddColumnSpecificationContext addColumnSpecification() throws RecognitionException {
		AddColumnSpecificationContext _localctx = new AddColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_addColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			match(ADD);
			setState(1378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1377);
				match(COLUMN);
				}
			}

			setState(1380);
			columnDefinition();
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

	public static class ModifyColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQL92StatementParser.ALTER, 0); }
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SQL92StatementParser.COLUMN, 0); }
		public ModifyColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumnSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitModifyColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyColumnSpecificationContext modifyColumnSpecification() throws RecognitionException {
		ModifyColumnSpecificationContext _localctx = new ModifyColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_modifyColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1382);
			match(ALTER);
			setState(1384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1383);
				match(COLUMN);
				}
			}

			setState(1386);
			columnDefinition();
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

	public static class DropColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQL92StatementParser.DROP, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SQL92StatementParser.COLUMN, 0); }
		public DropColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDropColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropColumnSpecificationContext dropColumnSpecification() throws RecognitionException {
		DropColumnSpecificationContext _localctx = new DropColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_dropColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			match(DROP);
			setState(1390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1389);
				match(COLUMN);
				}
			}

			setState(1392);
			columnName();
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

	public static class AddConstraintSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SQL92StatementParser.ADD, 0); }
		public ConstraintDefinitionContext constraintDefinition() {
			return getRuleContext(ConstraintDefinitionContext.class,0);
		}
		public AddConstraintSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraintSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitAddConstraintSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddConstraintSpecificationContext addConstraintSpecification() throws RecognitionException {
		AddConstraintSpecificationContext _localctx = new AddConstraintSpecificationContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_addConstraintSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394);
			match(ADD);
			setState(1395);
			constraintDefinition();
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

	public static class DropConstraintSpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQL92StatementParser.DROP, 0); }
		public ConstraintDefinitionContext constraintDefinition() {
			return getRuleContext(ConstraintDefinitionContext.class,0);
		}
		public DropConstraintSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitDropConstraintSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropConstraintSpecificationContext dropConstraintSpecification() throws RecognitionException {
		DropConstraintSpecificationContext _localctx = new DropConstraintSpecificationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_dropConstraintSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			match(DROP);
			setState(1398);
			constraintDefinition();
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

	public static class SetTransactionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQL92StatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQL92StatementParser.TRANSACTION, 0); }
		public TerminalNode ISOLATION() { return getToken(SQL92StatementParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(SQL92StatementParser.LEVEL, 0); }
		public LevelOfIsolation_Context levelOfIsolation_() {
			return getRuleContext(LevelOfIsolation_Context.class,0);
		}
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitSetTransaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_setTransaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			match(SET);
			setState(1401);
			match(TRANSACTION);
			setState(1402);
			match(ISOLATION);
			setState(1403);
			match(LEVEL);
			setState(1404);
			levelOfIsolation_();
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

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(SQL92StatementParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			match(COMMIT);
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

	public static class RollbackContext extends ParserRuleContext {
		public TerminalNode ROLLBACK() { return getToken(SQL92StatementParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			match(ROLLBACK);
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

	public static class LevelOfIsolation_Context extends ParserRuleContext {
		public TerminalNode READ() { return getToken(SQL92StatementParser.READ, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SQL92StatementParser.UNCOMMITTED, 0); }
		public TerminalNode COMMITTED() { return getToken(SQL92StatementParser.COMMITTED, 0); }
		public TerminalNode REPEATABLE() { return getToken(SQL92StatementParser.REPEATABLE, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(SQL92StatementParser.SERIALIZABLE, 0); }
		public LevelOfIsolation_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelOfIsolation_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitLevelOfIsolation_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelOfIsolation_Context levelOfIsolation_() throws RecognitionException {
		LevelOfIsolation_Context _localctx = new LevelOfIsolation_Context(_ctx, getState());
		enterRule(_localctx, 252, RULE_levelOfIsolation_);
		try {
			setState(1417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1410);
				match(READ);
				setState(1411);
				match(UNCOMMITTED);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1412);
				match(READ);
				setState(1413);
				match(COMMITTED);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1414);
				match(REPEATABLE);
				setState(1415);
				match(READ);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1416);
				match(SERIALIZABLE);
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

	public static class GrantContext extends ParserRuleContext {
		public List<TerminalNode> GRANT() { return getTokens(SQL92StatementParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(SQL92StatementParser.GRANT, i);
		}
		public PrivilegeClauseContext privilegeClause() {
			return getRuleContext(PrivilegeClauseContext.class,0);
		}
		public TerminalNode TO() { return getToken(SQL92StatementParser.TO, 0); }
		public List<Grantee_Context> grantee_() {
			return getRuleContexts(Grantee_Context.class);
		}
		public Grantee_Context grantee_(int i) {
			return getRuleContext(Grantee_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public TerminalNode WITH() { return getToken(SQL92StatementParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(SQL92StatementParser.OPTION, 0); }
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitGrant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_grant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			match(GRANT);
			setState(1420);
			privilegeClause();
			setState(1421);
			match(TO);
			setState(1422);
			grantee_();
			setState(1427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1423);
				match(COMMA_);
				setState(1424);
				grantee_();
				}
				}
				setState(1429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1430);
				match(WITH);
				setState(1431);
				match(GRANT);
				setState(1432);
				match(OPTION);
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

	public static class RevokeContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(SQL92StatementParser.REVOKE, 0); }
		public PrivilegeClauseContext privilegeClause() {
			return getRuleContext(PrivilegeClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQL92StatementParser.FROM, 0); }
		public List<Grantee_Context> grantee_() {
			return getRuleContexts(Grantee_Context.class);
		}
		public Grantee_Context grantee_(int i) {
			return getRuleContext(Grantee_Context.class,i);
		}
		public DropBehaviour_Context dropBehaviour_() {
			return getRuleContext(DropBehaviour_Context.class,0);
		}
		public TerminalNode GRANT() { return getToken(SQL92StatementParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(SQL92StatementParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SQL92StatementParser.FOR, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQL92StatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQL92StatementParser.COMMA_, i);
		}
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitRevoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_revoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
			match(REVOKE);
			setState(1439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GRANT) {
				{
				setState(1436);
				match(GRANT);
				setState(1437);
				match(OPTION);
				setState(1438);
				match(FOR);
				}
			}

			setState(1441);
			privilegeClause();
			setState(1442);
			match(FROM);
			setState(1443);
			grantee_();
			setState(1448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1444);
				match(COMMA_);
				setState(1445);
				grantee_();
				}
				}
				setState(1450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1451);
			dropBehaviour_();
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

	public static class PrivilegeClauseContext extends ParserRuleContext {
		public Privileges_Context privileges_() {
			return getRuleContext(Privileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(SQL92StatementParser.ON, 0); }
		public OnObjectClauseContext onObjectClause() {
			return getRuleContext(OnObjectClauseContext.class,0);
		}
		public PrivilegeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitPrivilegeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeClauseContext privilegeClause() throws RecognitionException {
		PrivilegeClauseContext _localctx = new PrivilegeClauseContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_privilegeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			privileges_();
			setState(1454);
			match(ON);
			setState(1455);
			onObjectClause();
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

	public static class Privileges_Context extends ParserRuleContext {
		public PrivilegeType_Context privilegeType_() {
			return getRuleContext(PrivilegeType_Context.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public Privileges_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privileges_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitPrivileges_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Privileges_Context privileges_() throws RecognitionException {
		Privileges_Context _localctx = new Privileges_Context(_ctx, getState());
		enterRule(_localctx, 260, RULE_privileges_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			privilegeType_();
			setState(1458);
			columnNames();
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

	public static class PrivilegeType_Context extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SQL92StatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SQL92StatementParser.PRIVILEGES, 0); }
		public TerminalNode SELECT() { return getToken(SQL92StatementParser.SELECT, 0); }
		public TerminalNode DELETE() { return getToken(SQL92StatementParser.DELETE, 0); }
		public TerminalNode INSERT() { return getToken(SQL92StatementParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(SQL92StatementParser.UPDATE, 0); }
		public TerminalNode REFERENCES() { return getToken(SQL92StatementParser.REFERENCES, 0); }
		public TerminalNode USAGE() { return getToken(SQL92StatementParser.USAGE, 0); }
		public PrivilegeType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeType_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitPrivilegeType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeType_Context privilegeType_() throws RecognitionException {
		PrivilegeType_Context _localctx = new PrivilegeType_Context(_ctx, getState());
		enterRule(_localctx, 262, RULE_privilegeType_);
		try {
			setState(1468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1460);
				match(ALL);
				setState(1461);
				match(PRIVILEGES);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1462);
				match(SELECT);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1463);
				match(DELETE);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1464);
				match(INSERT);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1465);
				match(UPDATE);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 6);
				{
				setState(1466);
				match(REFERENCES);
				}
				break;
			case USAGE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1467);
				match(USAGE);
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

	public static class Grantee_Context extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(SQL92StatementParser.PUBLIC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Grantee_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantee_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitGrantee_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grantee_Context grantee_() throws RecognitionException {
		Grantee_Context _localctx = new Grantee_Context(_ctx, getState());
		enterRule(_localctx, 264, RULE_grantee_);
		try {
			setState(1472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1470);
				match(PUBLIC);
				}
				break;
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1471);
				identifier();
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

	public static class OnObjectClauseContext extends ParserRuleContext {
		public PrivilegeLevelContext privilegeLevel() {
			return getRuleContext(PrivilegeLevelContext.class,0);
		}
		public ObjectType_Context objectType_() {
			return getRuleContext(ObjectType_Context.class,0);
		}
		public OnObjectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onObjectClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitOnObjectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnObjectClauseContext onObjectClause() throws RecognitionException {
		OnObjectClauseContext _localctx = new OnObjectClauseContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_onObjectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(1474);
				objectType_();
				}
			}

			setState(1477);
			privilegeLevel();
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

	public static class ObjectType_Context extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(SQL92StatementParser.TABLE, 0); }
		public ObjectType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitObjectType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectType_Context objectType_() throws RecognitionException {
		ObjectType_Context _localctx = new ObjectType_Context(_ctx, getState());
		enterRule(_localctx, 268, RULE_objectType_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			match(TABLE);
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

	public static class PrivilegeLevelContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public PrivilegeLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeLevel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQL92StatementVisitor ) return ((SQL92StatementVisitor<? extends T>)visitor).visitPrivilegeLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeLevelContext privilegeLevel() throws RecognitionException {
		PrivilegeLevelContext _localctx = new PrivilegeLevelContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_privilegeLevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481);
			tableName();
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
		case 57:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 60:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 63:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 64:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean booleanPrimary_sempred(BooleanPrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitExpr_sempred(BitExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 6);
		case 13:
			return precpred(_ctx, 5);
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u015a\u05ce\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0123"+
		"\n\2\3\2\5\2\u0126\n\2\3\3\3\3\5\3\u012a\n\3\3\3\3\3\3\3\5\3\u012f\n\3"+
		"\3\4\5\4\u0132\n\4\3\4\3\4\3\4\3\4\7\4\u0138\n\4\f\4\16\4\u013b\13\4\3"+
		"\5\5\5\u013e\n\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u0146\n\6\3\7\3\7\3\7\5\7"+
		"\u014b\n\7\3\7\5\7\u014e\n\7\3\7\3\7\5\7\u0152\n\7\3\b\3\b\3\b\3\b\7\b"+
		"\u0158\n\b\f\b\16\b\u015b\13\b\3\t\3\t\3\t\3\t\7\t\u0161\n\t\f\t\16\t"+
		"\u0164\13\t\3\t\3\t\3\t\3\t\5\t\u016a\n\t\3\n\3\n\3\n\5\n\u016f\n\n\3"+
		"\13\3\13\3\f\3\f\3\f\5\f\u0176\n\f\3\r\3\r\3\r\5\r\u017b\n\r\3\r\5\r\u017e"+
		"\n\r\3\16\3\16\3\17\3\17\3\17\5\17\u0185\n\17\3\17\7\17\u0188\n\17\f\17"+
		"\16\17\u018b\13\17\3\20\3\20\7\20\u018f\n\20\f\20\16\20\u0192\13\20\3"+
		"\20\3\20\5\20\u0196\n\20\3\20\5\20\u0199\n\20\3\20\5\20\u019c\n\20\3\20"+
		"\5\20\u019f\n\20\3\20\5\20\u01a2\n\20\3\20\5\20\u01a5\n\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\5\23\u01ad\n\23\3\23\3\23\7\23\u01b1\n\23\f\23\16\23"+
		"\u01b4\13\23\3\24\3\24\5\24\u01b8\n\24\3\24\5\24\u01bb\n\24\3\24\5\24"+
		"\u01be\n\24\3\24\5\24\u01c1\n\24\3\25\3\25\5\25\u01c5\n\25\3\26\3\26\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u01d2\n\31\f\31\16\31"+
		"\u01d5\13\31\3\32\3\32\3\32\3\32\3\32\5\32\u01dc\n\32\3\33\3\33\7\33\u01e0"+
		"\n\33\f\33\16\33\u01e3\13\33\3\34\3\34\5\34\u01e7\n\34\3\34\5\34\u01ea"+
		"\n\34\3\34\3\34\5\34\u01ee\n\34\3\34\3\34\5\34\u01f2\n\34\3\34\3\34\3"+
		"\34\3\34\5\34\u01f8\n\34\3\35\5\35\u01fb\n\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0201\n\35\3\35\3\35\5\35\u0205\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u020f\n\35\3\35\3\35\5\35\u0213\n\35\3\36\3\36\3\36\3\36"+
		"\5\36\u0219\n\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \7 \u0223\n \f \16 \u0226"+
		"\13 \3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u022f\n\"\3\"\3\"\3\"\3\"\3\"\5\"\u0236"+
		"\n\"\3#\3#\5#\u023a\n#\3$\3$\5$\u023e\n$\3%\3%\3%\3%\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u024d\n\'\3(\5(\u0250\n(\3(\3(\5(\u0254\n(\3)\5)"+
		"\u0257\n)\3)\3)\3*\3*\3*\3*\3*\3*\3*\5*\u0262\n*\3+\5+\u0265\n+\3+\3+"+
		"\5+\u0269\n+\3,\5,\u026c\n,\3,\3,\5,\u0270\n,\3-\3-\3.\3.\3/\3/\5/\u0278"+
		"\n/\3\60\3\60\3\61\5\61\u027d\n\61\3\61\5\61\u0280\n\61\3\61\5\61\u0283"+
		"\n\61\3\61\5\61\u0286\n\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\5\63\u028f"+
		"\n\63\3\63\3\63\3\64\3\64\3\64\5\64\u0296\n\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\5\65\u029e\n\65\3\65\5\65\u02a1\n\65\3\66\3\66\3\67\3\67\38\58\u02a8"+
		"\n8\38\38\38\78\u02ad\n8\f8\168\u02b0\138\38\58\u02b3\n8\39\59\u02b6\n"+
		"9\39\39\39\79\u02bb\n9\f9\169\u02be\139\39\59\u02c1\n9\3:\3:\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\5;\u02ce\n;\3;\3;\3;\3;\7;\u02d4\n;\f;\16;\u02d7\13"+
		";\3<\3<\3=\3=\3>\3>\3>\3>\3>\3>\5>\u02e3\n>\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\7>\u02f2\n>\f>\16>\u02f5\13>\3?\3?\3@\3@\5@\u02fb\n@\3@"+
		"\3@\3@\3@\3@\5@\u0302\n@\3@\3@\3@\3@\3@\7@\u0309\n@\f@\16@\u030c\13@\3"+
		"@\3@\3@\3@\5@\u0312\n@\3@\3@\3@\3@\3@\3@\3@\5@\u031b\n@\3@\3@\3@\3@\5"+
		"@\u0321\n@\3@\5@\u0324\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\7A\u034d\nA\fA\16A\u0350\13A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\7B\u035e\nB\fB\16B\u0361\13B\3B\3B\3B\5B\u0366\nB\3B\3B\3B\3B\3B\3B\3"+
		"B\3B\3B\5B\u0371\nB\3B\3B\3B\3B\5B\u0377\nB\7B\u0379\nB\fB\16B\u037c\13"+
		"B\3C\3C\3C\5C\u0381\nC\3D\3D\3D\5D\u0386\nD\3D\3D\3D\7D\u038b\nD\fD\16"+
		"D\u038e\13D\3D\5D\u0391\nD\3D\3D\3E\3E\3F\3F\3G\3G\3G\3G\3G\3G\5G\u039f"+
		"\nG\3H\3H\3H\3H\5H\u03a5\nH\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J"+
		"\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\5K\u03c0\nK\3K\3K\3L\3L\3L\3L\3L\3L"+
		"\3L\3M\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\7N\u03d8\nN\fN\16N\u03db\13"+
		"N\3N\5N\u03de\nN\3N\3N\3O\3O\3O\3O\3O\3O\5O\u03e8\nO\3P\3P\3P\5P\u03ed"+
		"\nP\3P\3P\3P\3Q\3Q\5Q\u03f4\nQ\3Q\6Q\u03f7\nQ\rQ\16Q\u03f8\3Q\5Q\u03fc"+
		"\nQ\3Q\3Q\3R\3R\3R\3R\3R\3S\3S\3S\3T\3T\3T\3T\3U\3U\3V\3V\3V\3V\3V\7V"+
		"\u0413\nV\fV\16V\u0416\13V\3W\3W\5W\u041a\nW\3W\5W\u041d\nW\3X\3X\5X\u0421"+
		"\nX\3X\5X\u0424\nX\3X\5X\u0427\nX\3X\3X\3X\3X\3X\7X\u042e\nX\fX\16X\u0431"+
		"\13X\3X\3X\5X\u0435\nX\3X\5X\u0438\nX\5X\u043a\nX\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0465\nY\3Z\3Z\3Z\3Z\5Z\u046b\n"+
		"Z\3Z\3Z\3[\3[\3[\5[\u0472\n[\3[\3[\3\\\3\\\5\\\u0478\n\\\3\\\3\\\5\\\u047c"+
		"\n\\\3]\3]\3]\5]\u0481\n]\3^\5^\u0484\n^\3_\3_\5_\u0488\n_\3_\3_\3_\3"+
		"_\5_\u048e\n_\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3b\3b\3b\3b\7b\u049e\nb\f"+
		"b\16b\u04a1\13b\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3d\7d\u04af\nd\fd\16"+
		"d\u04b2\13d\3d\3d\5d\u04b6\nd\3d\3d\3d\3d\5d\u04bc\nd\3d\3d\5d\u04c0\n"+
		"d\3e\3e\3e\3e\3e\3f\3f\3f\3g\3g\3g\3g\7g\u04ce\ng\fg\16g\u04d1\13g\3g"+
		"\3g\3h\3h\3h\3h\5h\u04d9\nh\3h\3h\3i\3i\3i\5i\u04e0\ni\3j\3j\3j\7j\u04e5"+
		"\nj\fj\16j\u04e8\13j\3k\3k\3k\5k\u04ed\nk\3k\5k\u04f0\nk\3k\3k\3k\3k\3"+
		"k\3k\3k\5k\u04f9\nk\3k\5k\u04fc\nk\3l\3l\5l\u0500\nl\5l\u0502\nl\3l\3"+
		"l\3l\3m\3m\3m\3m\3m\3m\3m\3m\3m\5m\u0510\nm\3m\3m\3m\7m\u0515\nm\fm\16"+
		"m\u0518\13m\3n\3n\3n\3n\3n\3n\3n\3n\5n\u0522\nn\3o\3o\3o\3o\7o\u0528\n"+
		"o\fo\16o\u052b\13o\3o\3o\3p\3p\3p\3p\5p\u0533\np\3p\5p\u0536\np\3p\5p"+
		"\u0539\np\3q\3q\5q\u053d\nq\5q\u053f\nq\3q\3q\3q\5q\u0544\nq\3r\3r\3r"+
		"\3s\3s\3s\3t\3t\3t\3u\3u\3u\3u\3u\3v\5v\u0555\nv\3v\3v\3v\5v\u055a\nv"+
		"\3w\3w\3w\3w\3w\5w\u0561\nw\3x\3x\5x\u0565\nx\3x\3x\3y\3y\5y\u056b\ny"+
		"\3y\3y\3z\3z\5z\u0571\nz\3z\3z\3{\3{\3{\3|\3|\3|\3}\3}\3}\3}\3}\3}\3~"+
		"\3~\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\5\u0080\u058c\n\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\7\u0081\u0594\n\u0081\f\u0081\16\u0081\u0597\13\u0081\3\u0081\3\u0081"+
		"\3\u0081\5\u0081\u059c\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082"+
		"\u05a2\n\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\7\u0082\u05a9\n"+
		"\u0082\f\u0082\16\u0082\u05ac\13\u0082\3\u0082\3\u0082\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u05bf\n\u0085\3\u0086\3\u0086"+
		"\5\u0086\u05c3\n\u0086\3\u0087\5\u0087\u05c6\n\u0087\3\u0087\3\u0087\3"+
		"\u0088\3\u0088\3\u0089\3\u0089\3\u0089\2\6tz\u0080\u0082\u008a\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\2\31\4\2HH\u0150\u0150\4\2KKmm\4\2UUYY\3\2WX"+
		"\3\2\u0082\u0084\3\2hi\5\2\u00a5\u00a5\u00ab\u00ab\u00af\u00de\4\2\u00a1"+
		"\u00a1\u0111\u0111\4\2\3\3cd\4\2\5\5ff\4\2gi\u014c\u014c\3\2mn\3\2\27"+
		"\34\4\2\5\6\16\17\3\2\u0090\u0094\5\2\u00e8\u00e8\u011e\u011e\u0148\u0148"+
		"\4\2TT\u012f\u012f\3\2\u0087\u008f\3\2st\3\2~\177\4\2\u00e9\u00e9\u0137"+
		"\u0137\3\2\u00a0\u00a1\3\2./\2\u0658\2\u0122\3\2\2\2\4\u0127\3\2\2\2\6"+
		"\u0131\3\2\2\2\b\u013d\3\2\2\2\n\u0141\3\2\2\2\f\u0147\3\2\2\2\16\u0153"+
		"\3\2\2\2\20\u0169\3\2\2\2\22\u016e\3\2\2\2\24\u0170\3\2\2\2\26\u0172\3"+
		"\2\2\2\30\u0177\3\2\2\2\32\u017f\3\2\2\2\34\u0181\3\2\2\2\36\u018c\3\2"+
		"\2\2 \u01a6\3\2\2\2\"\u01a8\3\2\2\2$\u01ac\3\2\2\2&\u01c0\3\2\2\2(\u01c4"+
		"\3\2\2\2*\u01c6\3\2\2\2,\u01c8\3\2\2\2.\u01cb\3\2\2\2\60\u01ce\3\2\2\2"+
		"\62\u01db\3\2\2\2\64\u01dd\3\2\2\2\66\u01f7\3\2\2\28\u0212\3\2\2\2:\u0218"+
		"\3\2\2\2<\u021a\3\2\2\2>\u021d\3\2\2\2@\u0227\3\2\2\2B\u022a\3\2\2\2D"+
		"\u0239\3\2\2\2F\u023d\3\2\2\2H\u023f\3\2\2\2J\u0243\3\2\2\2L\u024c\3\2"+
		"\2\2N\u024f\3\2\2\2P\u0256\3\2\2\2R\u0261\3\2\2\2T\u0264\3\2\2\2V\u026b"+
		"\3\2\2\2X\u0271\3\2\2\2Z\u0273\3\2\2\2\\\u0277\3\2\2\2^\u0279\3\2\2\2"+
		"`\u027f\3\2\2\2b\u0289\3\2\2\2d\u028e\3\2\2\2f\u0295\3\2\2\2h\u02a0\3"+
		"\2\2\2j\u02a2\3\2\2\2l\u02a4\3\2\2\2n\u02a7\3\2\2\2p\u02b5\3\2\2\2r\u02c2"+
		"\3\2\2\2t\u02cd\3\2\2\2v\u02d8\3\2\2\2x\u02da\3\2\2\2z\u02dc\3\2\2\2|"+
		"\u02f6\3\2\2\2~\u0323\3\2\2\2\u0080\u0325\3\2\2\2\u0082\u0370\3\2\2\2"+
		"\u0084\u0380\3\2\2\2\u0086\u0382\3\2\2\2\u0088\u0394\3\2\2\2\u008a\u0396"+
		"\3\2\2\2\u008c\u039e\3\2\2\2\u008e\u03a0\3\2\2\2\u0090\u03aa\3\2\2\2\u0092"+
		"\u03b1\3\2\2\2\u0094\u03b8\3\2\2\2\u0096\u03c3\3\2\2\2\u0098\u03ca\3\2"+
		"\2\2\u009a\u03d2\3\2\2\2\u009c\u03e7\3\2\2\2\u009e\u03e9\3\2\2\2\u00a0"+
		"\u03f1\3\2\2\2\u00a2\u03ff\3\2\2\2\u00a4\u0404\3\2\2\2\u00a6\u0407\3\2"+
		"\2\2\u00a8\u040b\3\2\2\2\u00aa\u040d\3\2\2\2\u00ac\u0419\3\2\2\2\u00ae"+
		"\u0439\3\2\2\2\u00b0\u0464\3\2\2\2\u00b2\u0466\3\2\2\2\u00b4\u046e\3\2"+
		"\2\2\u00b6\u0475\3\2\2\2\u00b8\u047d\3\2\2\2\u00ba\u0483\3\2\2\2\u00bc"+
		"\u0485\3\2\2\2\u00be\u048f\3\2\2\2\u00c0\u0494\3\2\2\2\u00c2\u0499\3\2"+
		"\2\2\u00c4\u04a2\3\2\2\2\u00c6\u04a7\3\2\2\2\u00c8\u04c1\3\2\2\2\u00ca"+
		"\u04c6\3\2\2\2\u00cc\u04c9\3\2\2\2\u00ce\u04d4\3\2\2\2\u00d0\u04df\3\2"+
		"\2\2\u00d2\u04e1\3\2\2\2\u00d4\u04fb\3\2\2\2\u00d6\u0501\3\2\2\2\u00d8"+
		"\u0506\3\2\2\2\u00da\u0521\3\2\2\2\u00dc\u0523\3\2\2\2\u00de\u0535\3\2"+
		"\2\2\u00e0\u053e\3\2\2\2\u00e2\u0545\3\2\2\2\u00e4\u0548\3\2\2\2\u00e6"+
		"\u054b\3\2\2\2\u00e8\u054e\3\2\2\2\u00ea\u0554\3\2\2\2\u00ec\u0560\3\2"+
		"\2\2\u00ee\u0562\3\2\2\2\u00f0\u0568\3\2\2\2\u00f2\u056e\3\2\2\2\u00f4"+
		"\u0574\3\2\2\2\u00f6\u0577\3\2\2\2\u00f8\u057a\3\2\2\2\u00fa\u0580\3\2"+
		"\2\2\u00fc\u0582\3\2\2\2\u00fe\u058b\3\2\2\2\u0100\u058d\3\2\2\2\u0102"+
		"\u059d\3\2\2\2\u0104\u05af\3\2\2\2\u0106\u05b3\3\2\2\2\u0108\u05be\3\2"+
		"\2\2\u010a\u05c2\3\2\2\2\u010c\u05c5\3\2\2\2\u010e\u05c9\3\2\2\2\u0110"+
		"\u05cb\3\2\2\2\u0112\u0123\5\32\16\2\u0113\u0123\5\4\3\2\u0114\u0123\5"+
		"\n\6\2\u0115\u0123\5\26\f\2\u0116\u0123\5\u00c2b\2\u0117\u0123\5\u00c4"+
		"c\2\u0118\u0123\5\u00bc_\2\u0119\u0123\5\u00be`\2\u011a\u0123\5\u00c0"+
		"a\2\u011b\u0123\5\u00c6d\2\u011c\u0123\5\u00c8e\2\u011d\u0123\5\u00f8"+
		"}\2\u011e\u0123\5\u00fa~\2\u011f\u0123\5\u00fc\177\2\u0120\u0123\5\u0100"+
		"\u0081\2\u0121\u0123\5\u0102\u0082\2\u0122\u0112\3\2\2\2\u0122\u0113\3"+
		"\2\2\2\u0122\u0114\3\2\2\2\u0122\u0115\3\2\2\2\u0122\u0116\3\2\2\2\u0122"+
		"\u0117\3\2\2\2\u0122\u0118\3\2\2\2\u0122\u0119\3\2\2\2\u0122\u011a\3\2"+
		"\2\2\u0122\u011b\3\2\2\2\u0122\u011c\3\2\2\2\u0122\u011d\3\2\2\2\u0122"+
		"\u011e\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2"+
		"\2\2\u0123\u0125\3\2\2\2\u0124\u0126\7)\2\2\u0125\u0124\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\3\3\2\2\2\u0127\u0129\7-\2\2\u0128\u012a\7G\2\2\u0129"+
		"\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012e\5d"+
		"\63\2\u012c\u012f\5\6\4\2\u012d\u012f\5\b\5\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012d\3\2\2\2\u012f\5\3\2\2\2\u0130\u0132\5n8\2\u0131\u0130\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\t\2\2\2\u0134\u0139\5\20"+
		"\t\2\u0135\u0136\7$\2\2\u0136\u0138\5\20\t\2\u0137\u0135\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\7\3\2\2\2"+
		"\u013b\u0139\3\2\2\2\u013c\u013e\5n8\2\u013d\u013c\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\5\32\16\2\u0140\t\3\2\2\2\u0141"+
		"\u0142\7.\2\2\u0142\u0143\5\60\31\2\u0143\u0145\5\16\b\2\u0144\u0146\5"+
		"<\37\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\13\3\2\2\2\u0147"+
		"\u0148\5f\64\2\u0148\u014a\7\27\2\2\u0149\u014b\7H\2\2\u014a\u0149\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014e\7\36\2\2\u014d"+
		"\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\5\22"+
		"\n\2\u0150\u0152\7\37\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\r\3\2\2\2\u0153\u0154\78\2\2\u0154\u0159\5\f\7\2\u0155\u0156\7$\2\2\u0156"+
		"\u0158\5\f\7\2\u0157\u0155\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015a\17\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d"+
		"\7\36\2\2\u015d\u0162\5\22\n\2\u015e\u015f\7$\2\2\u015f\u0161\5\22\n\2"+
		"\u0160\u015e\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\7\37\2\2"+
		"\u0166\u016a\3\2\2\2\u0167\u0168\7\36\2\2\u0168\u016a\7\37\2\2\u0169\u015c"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u016a\21\3\2\2\2\u016b\u016f\5t;\2\u016c"+
		"\u016f\7\u0095\2\2\u016d\u016f\5\24\13\2\u016e\u016b\3\2\2\2\u016e\u016c"+
		"\3\2\2\2\u016e\u016d\3\2\2\2\u016f\23\3\2\2\2\u0170\u0171\7\u0157\2\2"+
		"\u0171\25\3\2\2\2\u0172\u0173\7/\2\2\u0173\u0175\5\30\r\2\u0174\u0176"+
		"\5<\37\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\27\3\2\2\2\u0177"+
		"\u0178\7Q\2\2\u0178\u017d\5d\63\2\u0179\u017b\7\\\2\2\u017a\u0179\3\2"+
		"\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\5(\25\2\u017d"+
		"\u017a\3\2\2\2\u017d\u017e\3\2\2\2\u017e\31\3\2\2\2\u017f\u0180\5\34\17"+
		"\2\u0180\33\3\2\2\2\u0181\u0189\5\36\20\2\u0182\u0184\7J\2\2\u0183\u0185"+
		"\7m\2\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0188\5\36\20\2\u0187\u0182\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3"+
		"\2\2\2\u0189\u018a\3\2\2\2\u018a\35\3\2\2\2\u018b\u0189\3\2\2\2\u018c"+
		"\u0190\7,\2\2\u018d\u018f\5 \21\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2"+
		"\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0193\u0195\5$\23\2\u0194\u0196\5.\30\2\u0195\u0194\3\2"+
		"\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0199\5<\37\2\u0198"+
		"\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u019c\5>"+
		" \2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d"+
		"\u019f\5@!\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2"+
		"\2\u01a0\u01a2\5\u00aaV\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u01a5\5B\"\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\37\3\2\2\2\u01a6\u01a7\5\"\22\2\u01a7!\3\2\2\2\u01a8\u01a9"+
		"\t\3\2\2\u01a9#\3\2\2\2\u01aa\u01ad\5*\26\2\u01ab\u01ad\5&\24\2\u01ac"+
		"\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01b2\3\2\2\2\u01ae\u01af\7$"+
		"\2\2\u01af\u01b1\5&\24\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3%\3\2\2\2\u01b4\u01b2\3\2\2\2"+
		"\u01b5\u01b8\5f\64\2\u01b6\u01b8\5t;\2\u01b7\u01b5\3\2\2\2\u01b7\u01b6"+
		"\3\2\2\2\u01b8\u01bd\3\2\2\2\u01b9\u01bb\7\\\2\2\u01ba\u01b9\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\5(\25\2\u01bd\u01ba\3\2"+
		"\2\2\u01bd\u01be\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01c1\5,\27\2\u01c0"+
		"\u01b7\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1\'\3\2\2\2\u01c2\u01c5\5\\/\2"+
		"\u01c3\u01c5\7\u0157\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5"+
		")\3\2\2\2\u01c6\u01c7\7\20\2\2\u01c7+\3\2\2\2\u01c8\u01c9\5\\/\2\u01c9"+
		"\u01ca\7\24\2\2\u01ca-\3\2\2\2\u01cb\u01cc\7Q\2\2\u01cc\u01cd\5\60\31"+
		"\2\u01cd/\3\2\2\2\u01ce\u01d3\5\62\32\2\u01cf\u01d0\7$\2\2\u01d0\u01d2"+
		"\5\62\32\2\u01d1\u01cf\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2"+
		"\u01d3\u01d4\3\2\2\2\u01d4\61\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01dc"+
		"\5\64\33\2\u01d7\u01d8\7 \2\2\u01d8\u01d9\5\64\33\2\u01d9\u01da\7!\2\2"+
		"\u01da\u01dc\3\2\2\2\u01db\u01d6\3\2\2\2\u01db\u01d7\3\2\2\2\u01dc\63"+
		"\3\2\2\2\u01dd\u01e1\5\66\34\2\u01de\u01e0\58\35\2\u01df\u01de\3\2\2\2"+
		"\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\65"+
		"\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e9\5d\63\2\u01e5\u01e7\7\\\2\2\u01e6"+
		"\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\5("+
		"\25\2\u01e9\u01e6\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01f8\3\2\2\2\u01eb"+
		"\u01ed\5H%\2\u01ec\u01ee\7\\\2\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2"+
		"\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\5(\25\2\u01f0\u01f2\5n8\2\u01f1\u01f0"+
		"\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f8\3\2\2\2\u01f3\u01f4\7\36\2\2"+
		"\u01f4\u01f5\5\60\31\2\u01f5\u01f6\7\37\2\2\u01f6\u01f8\3\2\2\2\u01f7"+
		"\u01e4\3\2\2\2\u01f7\u01eb\3\2\2\2\u01f7\u01f3\3\2\2\2\u01f8\67\3\2\2"+
		"\2\u01f9\u01fb\t\4\2\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fc\u01fd\7S\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\5\66\34\2"+
		"\u01ff\u0201\5:\36\2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0213"+
		"\3\2\2\2\u0202\u0204\t\5\2\2\u0203\u0205\7V\2\2\u0204\u0203\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\7S\2\2\u0207\u0208\5\66"+
		"\34\2\u0208\u0209\5:\36\2\u0209\u0213\3\2\2\2\u020a\u020e\7R\2\2\u020b"+
		"\u020f\7U\2\2\u020c\u020d\t\5\2\2\u020d\u020f\7V\2\2\u020e\u020b\3\2\2"+
		"\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211"+
		"\7S\2\2\u0211\u0213\5\66\34\2\u0212\u01fa\3\2\2\2\u0212\u0202\3\2\2\2"+
		"\u0212\u020a\3\2\2\2\u02139\3\2\2\2\u0214\u0215\7]\2\2\u0215\u0219\5t"+
		";\2\u0216\u0217\7Z\2\2\u0217\u0219\5n8\2\u0218\u0214\3\2\2\2\u0218\u0216"+
		"\3\2\2\2\u0219;\3\2\2\2\u021a\u021b\7[\2\2\u021b\u021c\5t;\2\u021c=\3"+
		"\2\2\2\u021d\u021e\7q\2\2\u021e\u021f\7r\2\2\u021f\u0224\5\u00acW\2\u0220"+
		"\u0221\7$\2\2\u0221\u0223\5\u00acW\2\u0222\u0220\3\2\2\2\u0223\u0226\3"+
		"\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225?\3\2\2\2\u0226\u0224"+
		"\3\2\2\2\u0227\u0228\7u\2\2\u0228\u0229\5t;\2\u0229A\3\2\2\2\u022a\u0235"+
		"\7v\2\2\u022b\u022c\5F$\2\u022c\u022d\7$\2\2\u022d\u022f\3\2\2\2\u022e"+
		"\u022b\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0236\5D"+
		"#\2\u0231\u0232\5D#\2\u0232\u0233\7w\2\2\u0233\u0234\5F$\2\u0234\u0236"+
		"\3\2\2\2\u0235\u022e\3\2\2\2\u0235\u0231\3\2\2\2\u0236C\3\2\2\2\u0237"+
		"\u023a\5P)\2\u0238\u023a\5J&\2\u0239\u0237\3\2\2\2\u0239\u0238\3\2\2\2"+
		"\u023aE\3\2\2\2\u023b\u023e\5P)\2\u023c\u023e\5J&\2\u023d\u023b\3\2\2"+
		"\2\u023d\u023c\3\2\2\2\u023eG\3\2\2\2\u023f\u0240\7\36\2\2\u0240\u0241"+
		"\5\34\17\2\u0241\u0242\7\37\2\2\u0242I\3\2\2\2\u0243\u0244\7\'\2\2\u0244"+
		"K\3\2\2\2\u0245\u024d\5N(\2\u0246\u024d\5P)\2\u0247\u024d\5R*\2\u0248"+
		"\u024d\5T+\2\u0249\u024d\5V,\2\u024a\u024d\5X-\2\u024b\u024d\5Z.\2\u024c"+
		"\u0245\3\2\2\2\u024c\u0246\3\2\2\2\u024c\u0247\3\2\2\2\u024c\u0248\3\2"+
		"\2\2\u024c\u0249\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024b\3\2\2\2\u024d"+
		"M\3\2\2\2\u024e\u0250\5r:\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251\u0253\7\u0157\2\2\u0252\u0254\5\u00b6\\\2\u0253\u0252"+
		"\3\2\2\2\u0253\u0254\3\2\2\2\u0254O\3\2\2\2\u0255\u0257\7\17\2\2\u0256"+
		"\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\7\u0158"+
		"\2\2\u0259Q\3\2\2\2\u025a\u025b\t\6\2\2\u025b\u0262\7\u0157\2\2\u025c"+
		"\u025d\7 \2\2\u025d\u025e\5\\/\2\u025e\u025f\7\u0157\2\2\u025f\u0260\7"+
		"!\2\2\u0260\u0262\3\2\2\2\u0261\u025a\3\2\2\2\u0261\u025c\3\2\2\2\u0262"+
		"S\3\2\2\2\u0263\u0265\5r:\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265"+
		"\u0266\3\2\2\2\u0266\u0268\7\u0159\2\2\u0267\u0269\5\u00b6\\\2\u0268\u0267"+
		"\3\2\2\2\u0268\u0269\3\2\2\2\u0269U\3\2\2\2\u026a\u026c\5r:\2\u026b\u026a"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026f\7\u015a\2"+
		"\2\u026e\u0270\5\u00b6\\\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"W\3\2\2\2\u0271\u0272\t\7\2\2\u0272Y\3\2\2\2\u0273\u0274\7g\2\2\u0274"+
		"[\3\2\2\2\u0275\u0278\7\u0156\2\2\u0276\u0278\5^\60\2\u0277\u0275\3\2"+
		"\2\2\u0277\u0276\3\2\2\2\u0278]\3\2\2\2\u0279\u027a\t\b\2\2\u027a_\3\2"+
		"\2\2\u027b\u027d\7(\2\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u027e\3\2\2\2\u027e\u0280\7(\2\2\u027f\u027c\3\2\2\2\u027f\u0280\3\2"+
		"\2\2\u0280\u0282\3\2\2\2\u0281\u0283\t\t\2\2\u0282\u0281\3\2\2\2\u0282"+
		"\u0283\3\2\2\2\u0283\u0285\3\2\2\2\u0284\u0286\7\23\2\2\u0285\u0284\3"+
		"\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\5\\/\2\u0288"+
		"a\3\2\2\2\u0289\u028a\5\\/\2\u028ac\3\2\2\2\u028b\u028c\5j\66\2\u028c"+
		"\u028d\7\23\2\2\u028d\u028f\3\2\2\2\u028e\u028b\3\2\2\2\u028e\u028f\3"+
		"\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\5l\67\2\u0291e\3\2\2\2\u0292\u0293"+
		"\5j\66\2\u0293\u0294\7\23\2\2\u0294\u0296\3\2\2\2\u0295\u0292\3\2\2\2"+
		"\u0295\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\5l\67\2\u0298g\3"+
		"\2\2\2\u0299\u02a1\5\\/\2\u029a\u029b\5j\66\2\u029b\u029c\7\23\2\2\u029c"+
		"\u029e\3\2\2\2\u029d\u029a\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2"+
		"\2\2\u029f\u02a1\5\\/\2\u02a0\u0299\3\2\2\2\u02a0\u029d\3\2\2\2\u02a1"+
		"i\3\2\2\2\u02a2\u02a3\5\\/\2\u02a3k\3\2\2\2\u02a4\u02a5\5\\/\2\u02a5m"+
		"\3\2\2\2\u02a6\u02a8\7\36\2\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2"+
		"\u02a8\u02a9\3\2\2\2\u02a9\u02ae\5f\64\2\u02aa\u02ab\7$\2\2\u02ab\u02ad"+
		"\5f\64\2\u02ac\u02aa\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b3\7\37"+
		"\2\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3o\3\2\2\2\u02b4\u02b6"+
		"\7\36\2\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\3\2\2\2"+
		"\u02b7\u02bc\5d\63\2\u02b8\u02b9\7$\2\2\u02b9\u02bb\5d\63\2\u02ba\u02b8"+
		"\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd"+
		"\u02c0\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c1\7\37\2\2\u02c0\u02bf\3"+
		"\2\2\2\u02c0\u02c1\3\2\2\2\u02c1q\3\2\2\2\u02c2\u02c3\7\u0156\2\2\u02c3"+
		"s\3\2\2\2\u02c4\u02c5\b;\1\2\u02c5\u02c6\5x=\2\u02c6\u02c7\5t;\5\u02c7"+
		"\u02ce\3\2\2\2\u02c8\u02c9\7\36\2\2\u02c9\u02ca\5t;\2\u02ca\u02cb\7\37"+
		"\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ce\5z>\2\u02cd\u02c4\3\2\2\2\u02cd\u02c8"+
		"\3\2\2\2\u02cd\u02cc\3\2\2\2\u02ce\u02d5\3\2\2\2\u02cf\u02d0\f\6\2\2\u02d0"+
		"\u02d1\5v<\2\u02d1\u02d2\5t;\7\u02d2\u02d4\3\2\2\2\u02d3\u02cf\3\2\2\2"+
		"\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6u\3"+
		"\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02d9\t\n\2\2\u02d9w\3\2\2\2\u02da\u02db"+
		"\t\13\2\2\u02dby\3\2\2\2\u02dc\u02dd\b>\1\2\u02dd\u02de\5~@\2\u02de\u02f3"+
		"\3\2\2\2\u02df\u02e0\f\7\2\2\u02e0\u02e2\7e\2\2\u02e1\u02e3\7f\2\2\u02e2"+
		"\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02f2\t\f"+
		"\2\2\u02e5\u02e6\f\6\2\2\u02e6\u02e7\7\25\2\2\u02e7\u02f2\5~@\2\u02e8"+
		"\u02e9\f\5\2\2\u02e9\u02ea\5|?\2\u02ea\u02eb\5~@\2\u02eb\u02f2\3\2\2\2"+
		"\u02ec\u02ed\f\4\2\2\u02ed\u02ee\5|?\2\u02ee\u02ef\t\r\2\2\u02ef\u02f0"+
		"\5H%\2\u02f0\u02f2\3\2\2\2\u02f1\u02df\3\2\2\2\u02f1\u02e5\3\2\2\2\u02f1"+
		"\u02e8\3\2\2\2\u02f1\u02ec\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2"+
		"\2\2\u02f3\u02f4\3\2\2\2\u02f4{\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02f7"+
		"\t\16\2\2\u02f7}\3\2\2\2\u02f8\u02fa\5\u0080A\2\u02f9\u02fb\7f\2\2\u02fa"+
		"\u02f9\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\7l"+
		"\2\2\u02fd\u02fe\5H%\2\u02fe\u0324\3\2\2\2\u02ff\u0301\5\u0080A\2\u0300"+
		"\u0302\7f\2\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0303\3\2"+
		"\2\2\u0303\u0304\7l\2\2\u0304\u0305\7\36\2\2\u0305\u030a\5t;\2\u0306\u0307"+
		"\7$\2\2\u0307\u0309\5t;\2\u0308\u0306\3\2\2\2\u0309\u030c\3\2\2\2\u030a"+
		"\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030d\3\2\2\2\u030c\u030a\3\2"+
		"\2\2\u030d\u030e\7\37\2\2\u030e\u0324\3\2\2\2\u030f\u0311\5\u0080A\2\u0310"+
		"\u0312\7f\2\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\3\2"+
		"\2\2\u0313\u0314\7k\2\2\u0314\u0315\5\u0080A\2\u0315\u0316\7c\2\2\u0316"+
		"\u0317\5~@\2\u0317\u0324\3\2\2\2\u0318\u031a\5\u0080A\2\u0319\u031b\7"+
		"f\2\2\u031a\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c"+
		"\u031d\7o\2\2\u031d\u0320\5\u0082B\2\u031e\u031f\7\u0106\2\2\u031f\u0321"+
		"\5\u0082B\2\u0320\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0324\3\2\2"+
		"\2\u0322\u0324\5\u0080A\2\u0323\u02f8\3\2\2\2\u0323\u02ff\3\2\2\2\u0323"+
		"\u030f\3\2\2\2\u0323\u0318\3\2\2\2\u0323\u0322\3\2\2\2\u0324\177\3\2\2"+
		"\2\u0325\u0326\bA\1\2\u0326\u0327\5\u0082B\2\u0327\u034e\3\2\2\2\u0328"+
		"\u0329\f\17\2\2\u0329\u032a\7\7\2\2\u032a\u034d\5\u0080A\20\u032b\u032c"+
		"\f\16\2\2\u032c\u032d\7\b\2\2\u032d\u034d\5\u0080A\17\u032e\u032f\f\r"+
		"\2\2\u032f\u0330\7\t\2\2\u0330\u034d\5\u0080A\16\u0331\u0332\f\f\2\2\u0332"+
		"\u0333\7\n\2\2\u0333\u034d\5\u0080A\r\u0334\u0335\f\13\2\2\u0335\u0336"+
		"\7\16\2\2\u0336\u034d\5\u0080A\f\u0337\u0338\f\n\2\2\u0338\u0339\7\17"+
		"\2\2\u0339\u034d\5\u0080A\13\u033a\u033b\f\t\2\2\u033b\u033c\7\20\2\2"+
		"\u033c\u034d\5\u0080A\n\u033d\u033e\f\b\2\2\u033e\u033f\7\21\2\2\u033f"+
		"\u034d\5\u0080A\t\u0340\u0341\f\7\2\2\u0341\u0342\7\f\2\2\u0342\u034d"+
		"\5\u0080A\b\u0343\u0344\f\6\2\2\u0344\u0345\7\13\2\2\u0345\u034d\5\u0080"+
		"A\7\u0346\u0347\f\5\2\2\u0347\u0348\7\16\2\2\u0348\u034d\5\u00a6T\2\u0349"+
		"\u034a\f\4\2\2\u034a\u034b\7\17\2\2\u034b\u034d\5\u00a6T\2\u034c\u0328"+
		"\3\2\2\2\u034c\u032b\3\2\2\2\u034c\u032e\3\2\2\2\u034c\u0331\3\2\2\2\u034c"+
		"\u0334\3\2\2\2\u034c\u0337\3\2\2\2\u034c\u033a\3\2\2\2\u034c\u033d\3\2"+
		"\2\2\u034c\u0340\3\2\2\2\u034c\u0343\3\2\2\2\u034c\u0346\3\2\2\2\u034c"+
		"\u0349\3\2\2\2\u034d\u0350\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2"+
		"\2\2\u034f\u0081\3\2\2\2\u0350\u034e\3\2\2\2\u0351\u0352\bB\1\2\u0352"+
		"\u0371\5\u0084C\2\u0353\u0371\5J&\2\u0354\u0371\5L\'\2\u0355\u0371\5f"+
		"\64\2\u0356\u0371\5`\61\2\u0357\u0358\t\17\2\2\u0358\u0371\5\u0082B\t"+
		"\u0359\u035a\7\36\2\2\u035a\u035f\5t;\2\u035b\u035c\7$\2\2\u035c\u035e"+
		"\5t;\2\u035d\u035b\3\2\2\2\u035e\u0361\3\2\2\2\u035f\u035d\3\2\2\2\u035f"+
		"\u0360\3\2\2\2\u0360\u0362\3\2\2\2\u0361\u035f\3\2\2\2\u0362\u0363\7\37"+
		"\2\2\u0363\u0371\3\2\2\2\u0364\u0366\7j\2\2\u0365\u0364\3\2\2\2\u0365"+
		"\u0366\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0371\5H%\2\u0368\u0369\7 \2"+
		"\2\u0369\u036a\5\\/\2\u036a\u036b\5t;\2\u036b\u036c\7!\2\2\u036c\u0371"+
		"\3\2\2\2\u036d\u0371\5\u009eP\2\u036e\u0371\5\u00a0Q\2\u036f\u0371\5\u00a6"+
		"T\2\u0370\u0351\3\2\2\2\u0370\u0353\3\2\2\2\u0370\u0354\3\2\2\2\u0370"+
		"\u0355\3\2\2\2\u0370\u0356\3\2\2\2\u0370\u0357\3\2\2\2\u0370\u0359\3\2"+
		"\2\2\u0370\u0365\3\2\2\2\u0370\u0368\3\2\2\2\u0370\u036d\3\2\2\2\u0370"+
		"\u036e\3\2\2\2\u0370\u036f\3\2\2\2\u0371\u037a\3\2\2\2\u0372\u0373\f\13"+
		"\2\2\u0373\u0376\7\u00ef\2\2\u0374\u0377\7\u0157\2\2\u0375\u0377\5\\/"+
		"\2\u0376\u0374\3\2\2\2\u0376\u0375\3\2\2\2\u0377\u0379\3\2\2\2\u0378\u0372"+
		"\3\2\2\2\u0379\u037c\3\2\2\2\u037a\u0378\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
		"\u0083\3\2\2\2\u037c\u037a\3\2\2\2\u037d\u0381\5\u0086D\2\u037e\u0381"+
		"\5\u008cG\2\u037f\u0381\5\u009aN\2\u0380\u037d\3\2\2\2\u0380\u037e\3\2"+
		"\2\2\u0380\u037f\3\2\2\2\u0381\u0085\3\2\2\2\u0382\u0383\5\u0088E\2\u0383"+
		"\u0385\7\36\2\2\u0384\u0386\5\u008aF\2\u0385\u0384\3\2\2\2\u0385\u0386"+
		"\3\2\2\2\u0386\u0390\3\2\2\2\u0387\u038c\5t;\2\u0388\u0389\7$\2\2\u0389"+
		"\u038b\5t;\2\u038a\u0388\3\2\2\2\u038b\u038e\3\2\2\2\u038c\u038a\3\2\2"+
		"\2\u038c\u038d\3\2\2\2\u038d\u0391\3\2\2\2\u038e\u038c\3\2\2\2\u038f\u0391"+
		"\7\20\2\2\u0390\u0387\3\2\2\2\u0390\u038f\3\2\2\2\u0390\u0391\3\2\2\2"+
		"\u0391\u0392\3\2\2\2\u0392\u0393\7\37\2\2\u0393\u0087\3\2\2\2\u0394\u0395"+
		"\t\20\2\2\u0395\u0089\3\2\2\2\u0396\u0397\7K\2\2\u0397\u008b\3\2\2\2\u0398"+
		"\u039f\5\u008eH\2\u0399\u039f\5\u0090I\2\u039a\u039f\5\u0092J\2\u039b"+
		"\u039f\5\u0094K\2\u039c\u039f\5\u0096L\2\u039d\u039f\5\u0098M\2\u039e"+
		"\u0398\3\2\2\2\u039e\u0399\3\2\2\2\u039e\u039a\3\2\2\2\u039e\u039b\3\2"+
		"\2\2\u039e\u039c\3\2\2\2\u039e\u039d\3\2\2\2\u039f\u008d\3\2\2\2\u03a0"+
		"\u03a1\7N\2\2\u03a1\u03a4\7\36\2\2\u03a2\u03a5\5t;\2\u03a3\u03a5\7g\2"+
		"\2\u03a4\u03a2\3\2\2\2\u03a4\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7"+
		"\7\\\2\2\u03a7\u03a8\5\u00aeX\2\u03a8\u03a9\7\37\2\2\u03a9\u008f\3\2\2"+
		"\2\u03aa\u03ab\7\u00f4\2\2\u03ab\u03ac\7\36\2\2\u03ac\u03ad\5t;\2\u03ad"+
		"\u03ae\7Z\2\2\u03ae\u03af\5\\/\2\u03af\u03b0\7\37\2\2\u03b0\u0091\3\2"+
		"\2\2\u03b1\u03b2\7A\2\2\u03b2\u03b3\7\36\2\2\u03b3\u03b4\5t;\2\u03b4\u03b5"+
		"\7l\2\2\u03b5\u03b6\5t;\2\u03b6\u03b7\7\37\2\2\u03b7\u0093\3\2\2\2\u03b8"+
		"\u03b9\7P\2\2\u03b9\u03ba\7\36\2\2\u03ba\u03bb\5t;\2\u03bb\u03bc\7Q\2"+
		"\2\u03bc\u03bf\7\u0158\2\2\u03bd\u03be\7a\2\2\u03be\u03c0\7\u0158\2\2"+
		"\u03bf\u03bd\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2"+
		"\7\37\2\2\u03c2\u0095\3\2\2\2\u03c3\u03c4\7\u010c\2\2\u03c4\u03c5\7\36"+
		"\2\2\u03c5\u03c6\5\\/\2\u03c6\u03c7\7Q\2\2\u03c7\u03c8\5t;\2\u03c8\u03c9"+
		"\7\37\2\2\u03c9\u0097\3\2\2\2\u03ca\u03cb\7O\2\2\u03cb\u03cc\7\36\2\2"+
		"\u03cc\u03cd\t\21\2\2\u03cd\u03ce\7\u0157\2\2\u03ce\u03cf\7Q\2\2\u03cf"+
		"\u03d0\7\u0157\2\2\u03d0\u03d1\7\37\2\2\u03d1\u0099\3\2\2\2\u03d2\u03d3"+
		"\5\u009cO\2\u03d3\u03dd\7\36\2\2\u03d4\u03d9\5t;\2\u03d5\u03d6\7$\2\2"+
		"\u03d6\u03d8\5t;\2\u03d7\u03d5\3\2\2\2\u03d8\u03db\3\2\2\2\u03d9\u03d7"+
		"\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03de\3\2\2\2\u03db\u03d9\3\2\2\2\u03dc"+
		"\u03de\7\20\2\2\u03dd\u03d4\3\2\2\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3"+
		"\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e0\7\37\2\2\u03e0\u009b\3\2\2\2\u03e1"+
		"\u03e8\5\\/\2\u03e2\u03e8\7^\2\2\u03e3\u03e8\7\u00f8\2\2\u03e4\u03e8\7"+
		"\u0085\2\2\u03e5\u03e8\7\u0086\2\2\u03e6\u03e8\7\u0081\2\2\u03e7\u03e1"+
		"\3\2\2\2\u03e7\u03e2\3\2\2\2\u03e7\u03e3\3\2\2\2\u03e7\u03e4\3\2\2\2\u03e7"+
		"\u03e5\3\2\2\2\u03e7\u03e6\3\2\2\2\u03e8\u009d\3\2\2\2\u03e9\u03ea\5L"+
		"\'\2\u03ea\u03ec\7\u0121\2\2\u03eb\u03ed\7>\2\2\u03ec\u03eb\3\2\2\2\u03ec"+
		"\u03ed\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\t\22\2\2\u03ef\u03f0\5"+
		"H%\2\u03f0\u009f\3\2\2\2\u03f1\u03f3\7L\2\2\u03f2\u03f4\5\u0082B\2\u03f3"+
		"\u03f2\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03f7\5\u00a2"+
		"R\2\u03f6\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f8"+
		"\u03f9\3\2\2\2\u03f9\u03fb\3\2\2\2\u03fa\u03fc\5\u00a4S\2\u03fb\u03fa"+
		"\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03fe\7\u0104\2"+
		"\2\u03fe\u00a1\3\2\2\2\u03ff\u0400\7M\2\2\u0400\u0401\5t;\2\u0401\u0402"+
		"\7`\2\2\u0402\u0403\5t;\2\u0403\u00a3\3\2\2\2\u0404\u0405\7_\2\2\u0405"+
		"\u0406\5t;\2\u0406\u00a5\3\2\2\2\u0407\u0408\7\u0081\2\2\u0408\u0409\5"+
		"t;\2\u0409\u040a\5\u00a8U\2\u040a\u00a7\3\2\2\2\u040b\u040c\t\23\2\2\u040c"+
		"\u00a9\3\2\2\2\u040d\u040e\7p\2\2\u040e\u040f\7r\2\2\u040f\u0414\5\u00ac"+
		"W\2\u0410\u0411\7$\2\2\u0411\u0413\5\u00acW\2\u0412\u0410\3\2\2\2\u0413"+
		"\u0416\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u00ab\3\2"+
		"\2\2\u0416\u0414\3\2\2\2\u0417\u041a\5f\64\2\u0418\u041a\5P)\2\u0419\u0417"+
		"\3\2\2\2\u0419\u0418\3\2\2\2\u041a\u041c\3\2\2\2\u041b\u041d\t\24\2\2"+
		"\u041c\u041b\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u00ad\3\2\2\2\u041e\u0420"+
		"\5\u00b0Y\2\u041f\u0421\5\u00b2Z\2\u0420\u041f\3\2\2\2\u0420\u0421\3\2"+
		"\2\2\u0421\u0423\3\2\2\2\u0422\u0424\5\u00b4[\2\u0423\u0422\3\2\2\2\u0423"+
		"\u0424\3\2\2\2\u0424\u0426\3\2\2\2\u0425\u0427\5\u00b6\\\2\u0426\u0425"+
		"\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u043a\3\2\2\2\u0428\u0429\5\u00b0Y"+
		"\2\u0429\u042a\7\36\2\2\u042a\u042f\7\u0157\2\2\u042b\u042c\7$\2\2\u042c"+
		"\u042e\7\u0157\2\2\u042d\u042b\3\2\2\2\u042e\u0431\3\2\2\2\u042f\u042d"+
		"\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0432\3\2\2\2\u0431\u042f\3\2\2\2\u0432"+
		"\u0434\7\37\2\2\u0433\u0435\5\u00b4[\2\u0434\u0433\3\2\2\2\u0434\u0435"+
		"\3\2\2\2\u0435\u0437\3\2\2\2\u0436\u0438\5\u00b6\\\2\u0437\u0436\3\2\2"+
		"\2\u0437\u0438\3\2\2\2\u0438\u043a\3\2\2\2\u0439\u041e\3\2\2\2\u0439\u0428"+
		"\3\2\2\2\u043a\u00af\3\2\2\2\u043b\u0465\7\177\2\2\u043c\u043d\7\177\2"+
		"\2\u043d\u0465\7\u0151\2\2\u043e\u043f\7\u0123\2\2\u043f\u0465\7\177\2"+
		"\2\u0440\u0441\7\u0123\2\2\u0441\u0442\7\177\2\2\u0442\u0465\7\u0151\2"+
		"\2\u0443\u0465\7~\2\2\u0444\u0465\7\u00ac\2\2\u0445\u0465\7\u0124\2\2"+
		"\u0446\u0447\7\u0123\2\2\u0447\u0465\7~\2\2\u0448\u0449\7\u0123\2\2\u0449"+
		"\u044a\7~\2\2\u044a\u0465\7\u0151\2\2\u044b\u0465\7\u00e6\2\2\u044c\u044d"+
		"\7\u00e6\2\2\u044d\u0465\7\u0151\2\2\u044e\u0465\7\u0127\2\2\u044f\u0465"+
		"\7\u00aa\2\2\u0450\u0465\7\u00fb\2\2\u0451\u0465\7\u00a8\2\2\u0452\u0465"+
		"\7\u013e\2\2\u0453\u0465\7\u00ad\2\2\u0454\u0465\7\u00a9\2\2\u0455\u0456"+
		"\7}\2\2\u0456\u0465\7B\2\2\u0457\u0465\7\u0082\2\2\u0458\u0465\7\u0083"+
		"\2\2\u0459\u0465\7\u0084\2\2\u045a\u0465\7\u0081\2\2\u045b\u045c\7\u0083"+
		"\2\2\u045c\u045d\7I\2\2\u045d\u045e\7\u0083\2\2\u045e\u0465\7\u0155\2"+
		"\2\u045f\u0460\7\u0084\2\2\u0460\u0461\7I\2\2\u0461\u0462\7\u0083\2\2"+
		"\u0462\u0465\7\u0155\2\2\u0463\u0465\5\\/\2\u0464\u043b\3\2\2\2\u0464"+
		"\u043c\3\2\2\2\u0464\u043e\3\2\2\2\u0464\u0440\3\2\2\2\u0464\u0443\3\2"+
		"\2\2\u0464\u0444\3\2\2\2\u0464\u0445\3\2\2\2\u0464\u0446\3\2\2\2\u0464"+
		"\u0448\3\2\2\2\u0464\u044b\3\2\2\2\u0464\u044c\3\2\2\2\u0464\u044e\3\2"+
		"\2\2\u0464\u044f\3\2\2\2\u0464\u0450\3\2\2\2\u0464\u0451\3\2\2\2\u0464"+
		"\u0452\3\2\2\2\u0464\u0453\3\2\2\2\u0464\u0454\3\2\2\2\u0464\u0455\3\2"+
		"\2\2\u0464\u0457\3\2\2\2\u0464\u0458\3\2\2\2\u0464\u0459\3\2\2\2\u0464"+
		"\u045a\3\2\2\2\u0464\u045b\3\2\2\2\u0464\u045f\3\2\2\2\u0464\u0463\3\2"+
		"\2\2\u0465\u00b1\3\2\2\2\u0466\u0467\7\36\2\2\u0467\u046a\7\u0158\2\2"+
		"\u0468\u0469\7$\2\2\u0469\u046b\7\u0158\2\2\u046a\u0468\3\2\2\2\u046a"+
		"\u046b\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d\7\37\2\2\u046d\u00b3\3"+
		"\2\2\2\u046e\u046f\t\25\2\2\u046f\u0471\78\2\2\u0470\u0472\7\27\2\2\u0471"+
		"\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0474\5\u00b8"+
		"]\2\u0474\u00b5\3\2\2\2\u0475\u0477\7\u00ef\2\2\u0476\u0478\7\27\2\2\u0477"+
		"\u0476\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u047b\3\2\2\2\u0479\u047c\7\u0157"+
		"\2\2\u047a\u047c\5\u00b8]\2\u047b\u0479\3\2\2\2\u047b\u047a\3\2\2\2\u047c"+
		"\u00b7\3\2\2\2\u047d\u0480\5\\/\2\u047e\u047f\7\23\2\2\u047f\u0481\5\\"+
		"/\2\u0480\u047e\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u00b9\3\2\2\2\u0482"+
		"\u0484\t\26\2\2\u0483\u0482\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u00bb\3"+
		"\2\2\2\u0485\u0487\7\60\2\2\u0486\u0488\5\u00caf\2\u0487\u0486\3\2\2\2"+
		"\u0487\u0488\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048a\79\2\2\u048a\u048d"+
		"\5d\63\2\u048b\u048e\5\u00ccg\2\u048c\u048e\5\u00eav\2\u048d\u048b\3\2"+
		"\2\2\u048d\u048c\3\2\2\2\u048e\u00bd\3\2\2\2\u048f\u0490\7\61\2\2\u0490"+
		"\u0491\79\2\2\u0491\u0492\5d\63\2\u0492\u0493\5\u00ecw\2\u0493\u00bf\3"+
		"\2\2\2\u0494\u0495\7\62\2\2\u0495\u0496\79\2\2\u0496\u0497\5p9\2\u0497"+
		"\u0498\5\u00ba^\2\u0498\u00c1\3\2\2\2\u0499\u049a\7\60\2\2\u049a\u049b"+
		"\7\64\2\2\u049b\u049f\5b\62\2\u049c\u049e\5\u00ceh\2\u049d\u049c\3\2\2"+
		"\2\u049e\u04a1\3\2\2\2\u049f\u049d\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u00c3"+
		"\3\2\2\2\u04a1\u049f\3\2\2\2\u04a2\u04a3\7\62\2\2\u04a3\u04a4\7\64\2\2"+
		"\u04a4\u04a5\5b\62\2\u04a5\u04a6\5\u00ba^\2\u04a6\u00c5\3\2\2\2\u04a7"+
		"\u04a8\7\60\2\2\u04a8\u04a9\7F\2\2\u04a9\u04b5\5h\65\2\u04aa\u04ab\7\36"+
		"\2\2\u04ab\u04b0\5\\/\2\u04ac\u04ad\7$\2\2\u04ad\u04af\5\\/\2\u04ae\u04ac"+
		"\3\2\2\2\u04af\u04b2\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1"+
		"\u04b3\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b3\u04b4\7\37\2\2\u04b4\u04b6\3"+
		"\2\2\2\u04b5\u04aa\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7"+
		"\u04b8\7\\\2\2\u04b8\u04bf\5\32\16\2\u04b9\u04bb\7I\2\2\u04ba\u04bc\t"+
		"\27\2\2\u04bb\u04ba\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd"+
		"\u04be\7\u00ed\2\2\u04be\u04c0\7\u012b\2\2\u04bf\u04b9\3\2\2\2\u04bf\u04c0"+
		"\3\2\2\2\u04c0\u00c7\3\2\2\2\u04c1\u04c2\7\62\2\2\u04c2\u04c3\7F\2\2\u04c3"+
		"\u04c4\5h\65\2\u04c4\u04c5\5\u00ba^\2\u04c5\u00c9\3\2\2\2\u04c6\u04c7"+
		"\t\t\2\2\u04c7\u04c8\7\u0145\2\2\u04c8\u00cb\3\2\2\2\u04c9\u04ca\7\36"+
		"\2\2\u04ca\u04cf\5\u00d0i\2\u04cb\u04cc\7$\2\2\u04cc\u04ce\5\u00d0i\2"+
		"\u04cd\u04cb\3\2\2\2\u04ce\u04d1\3\2\2\2\u04cf\u04cd\3\2\2\2\u04cf\u04d0"+
		"\3\2\2\2\u04d0\u04d2\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d2\u04d3\7\37\2\2"+
		"\u04d3\u00cd\3\2\2\2\u04d4\u04d5\7\u0095\2\2\u04d5\u04d6\7\177\2\2\u04d6"+
		"\u04d8\78\2\2\u04d7\u04d9\7\27\2\2\u04d8\u04d7\3\2\2\2\u04d8\u04d9\3\2"+
		"\2\2\u04d9\u04da\3\2\2\2\u04da\u04db\5r:\2\u04db\u00cf\3\2\2\2\u04dc\u04e0"+
		"\5\u00d2j\2\u04dd\u04e0\5\u00e0q\2\u04de\u04e0\5\u00d6l\2\u04df\u04dc"+
		"\3\2\2\2\u04df\u04dd\3\2\2\2\u04df\u04de\3\2\2\2\u04e0\u00d1\3\2\2\2\u04e1"+
		"\u04e2\5f\64\2\u04e2\u04e6\5\u00aeX\2\u04e3\u04e5\5\u00d4k\2\u04e4\u04e3"+
		"\3\2\2\2\u04e5\u04e8\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7"+
		"\u00d3\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e9\u04fc\5\u00e4s\2\u04ea\u04ec"+
		"\7>\2\2\u04eb\u04ed\7@\2\2\u04ec\u04eb\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed"+
		"\u04fc\3\2\2\2\u04ee\u04f0\7f\2\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3\2"+
		"\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04fc\7g\2\2\u04f2\u04fc\5\u00b6\\\2\u04f3"+
		"\u04fc\5\u00d6l\2\u04f4\u04fc\5\u00d8m\2\u04f5\u04f8\7\u0095\2\2\u04f6"+
		"\u04f9\5L\'\2\u04f7\u04f9\5t;\2\u04f8\u04f6\3\2\2\2\u04f8\u04f7\3\2\2"+
		"\2\u04f9\u04fc\3\2\2\2\u04fa\u04fc\7\u0157\2\2\u04fb\u04e9\3\2\2\2\u04fb"+
		"\u04ea\3\2\2\2\u04fb\u04ef\3\2\2\2\u04fb\u04f2\3\2\2\2\u04fb\u04f3\3\2"+
		"\2\2\u04fb\u04f4\3\2\2\2\u04fb\u04f5\3\2\2\2\u04fb\u04fa\3\2\2\2\u04fc"+
		"\u00d5\3\2\2\2\u04fd\u04ff\7<\2\2\u04fe\u0500\5\u00b8]\2\u04ff\u04fe\3"+
		"\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0502\3\2\2\2\u0501\u04fd\3\2\2\2\u0501"+
		"\u0502\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0504\7\u00ed\2\2\u0504\u0505"+
		"\5t;\2\u0505\u00d7\3\2\2\2\u0506\u0507\7\u0135\2\2\u0507\u0508\5d\63\2"+
		"\u0508\u050f\5\u00dco\2\u0509\u050a\7\u0121\2\2\u050a\u0510\7T\2\2\u050b"+
		"\u050c\7\u0121\2\2\u050c\u0510\7\u012f\2\2\u050d\u050e\7\u0121\2\2\u050e"+
		"\u0510\7>\2\2\u050f\u0509\3\2\2\2\u050f\u050b\3\2\2\2\u050f\u050d\3\2"+
		"\2\2\u050f\u0510\3\2\2\2\u0510\u0516\3\2\2\2\u0511\u0512\7]\2\2\u0512"+
		"\u0513\t\30\2\2\u0513\u0515\5\u00dan\2\u0514\u0511\3\2\2\2\u0515\u0518"+
		"\3\2\2\2\u0516\u0514\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u00d9\3\2\2\2\u0518"+
		"\u0516\3\2\2\2\u0519\u0522\7\u0137\2\2\u051a\u0522\7\u00e9\2\2\u051b\u051c"+
		"\78\2\2\u051c\u0522\7g\2\2\u051d\u051e\7\u0125\2\2\u051e\u0522\7\u00e0"+
		"\2\2\u051f\u0520\78\2\2\u0520\u0522\7\u0095\2\2\u0521\u0519\3\2\2\2\u0521"+
		"\u051a\3\2\2\2\u0521\u051b\3\2\2\2\u0521\u051d\3\2\2\2\u0521\u051f\3\2"+
		"\2\2\u0522\u00db\3\2\2\2\u0523\u0524\7\36\2\2\u0524\u0529\5\u00dep\2\u0525"+
		"\u0526\7$\2\2\u0526\u0528\5\u00dep\2\u0527\u0525\3\2\2\2\u0528\u052b\3"+
		"\2\2\2\u0529\u0527\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052c\3\2\2\2\u052b"+
		"\u0529\3\2\2\2\u052c\u052d\7\37\2\2\u052d\u00dd\3\2\2\2\u052e\u0532\5"+
		"f\64\2\u052f\u0530\7\36\2\2\u0530\u0531\7\u0158\2\2\u0531\u0533\7\37\2"+
		"\2\u0532\u052f\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0536\3\2\2\2\u0534\u0536"+
		"\5t;\2\u0535\u052e\3\2\2\2\u0535\u0534\3\2\2\2\u0536\u0538\3\2\2\2\u0537"+
		"\u0539\t\24\2\2\u0538\u0537\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u00df\3"+
		"\2\2\2\u053a\u053c\7<\2\2\u053b\u053d\5\u00b8]\2\u053c\u053b\3\2\2\2\u053c"+
		"\u053d\3\2\2\2\u053d\u053f\3\2\2\2\u053e\u053a\3\2\2\2\u053e\u053f\3\2"+
		"\2\2\u053f\u0543\3\2\2\2\u0540\u0544\5\u00e2r\2\u0541\u0544\5\u00e6t\2"+
		"\u0542\u0544\5\u00e8u\2\u0543\u0540\3\2\2\2\u0543\u0541\3\2\2\2\u0543"+
		"\u0542\3\2\2\2\u0544\u00e1\3\2\2\2\u0545\u0546\5\u00e4s\2\u0546\u0547"+
		"\5n8\2\u0547\u00e3\3\2\2\2\u0548\u0549\7=\2\2\u0549\u054a\7@\2\2\u054a"+
		"\u00e5\3\2\2\2\u054b\u054c\7>\2\2\u054c\u054d\5\u00dco\2\u054d\u00e7\3"+
		"\2\2\2\u054e\u054f\7?\2\2\u054f\u0550\7@\2\2\u0550\u0551\5n8\2\u0551\u0552"+
		"\5\u00d8m\2\u0552\u00e9\3\2\2\2\u0553\u0555\7\36\2\2\u0554\u0553\3\2\2"+
		"\2\u0554\u0555\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0557\7o\2\2\u0557\u0559"+
		"\5d\63\2\u0558\u055a\7\37\2\2\u0559\u0558\3\2\2\2\u0559\u055a\3\2\2\2"+
		"\u055a\u00eb\3\2\2\2\u055b\u0561\5\u00eex\2\u055c\u0561\5\u00f0y\2\u055d"+
		"\u0561\5\u00f2z\2\u055e\u0561\5\u00f4{\2\u055f\u0561\5\u00f6|\2\u0560"+
		"\u055b\3\2\2\2\u0560\u055c\3\2\2\2\u0560\u055d\3\2\2\2\u0560\u055e\3\2"+
		"\2\2\u0560\u055f\3\2\2\2\u0561\u00ed\3\2\2\2\u0562\u0564\7\67\2\2\u0563"+
		"\u0565\7:\2\2\u0564\u0563\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0566\3\2"+
		"\2\2\u0566\u0567\5\u00d2j\2\u0567\u00ef\3\2\2\2\u0568\u056a\7\61\2\2\u0569"+
		"\u056b\7:\2\2\u056a\u0569\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056c\3\2"+
		"\2\2\u056c\u056d\5\u00d2j\2\u056d\u00f1\3\2\2\2\u056e\u0570\7\62\2\2\u056f"+
		"\u0571\7:\2\2\u0570\u056f\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0572\3\2"+
		"\2\2\u0572\u0573\5f\64\2\u0573\u00f3\3\2\2\2\u0574\u0575\7\67\2\2\u0575"+
		"\u0576\5\u00e0q\2\u0576\u00f5\3\2\2\2\u0577\u0578\7\62\2\2\u0578\u0579"+
		"\5\u00e0q\2\u0579\u00f7\3\2\2\2\u057a\u057b\78\2\2\u057b\u057c\7\u0149"+
		"\2\2\u057c\u057d\7\u011b\2\2\u057d\u057e\7\u011f\2\2\u057e\u057f\5\u00fe"+
		"\u0080\2\u057f\u00f9\3\2\2\2\u0580\u0581\7y\2\2\u0581\u00fb\3\2\2\2\u0582"+
		"\u0583\7z\2\2\u0583\u00fd\3\2\2\2\u0584\u0585\7\u0134\2\2\u0585\u058c"+
		"\7\u00dd\2\2\u0586\u0587\7\u0134\2\2\u0587\u058c\7\u00bc\2\2\u0588\u0589"+
		"\7\u00d2\2\2\u0589\u058c\7\u0134\2\2\u058a\u058c\7\u00d9\2\2\u058b\u0584"+
		"\3\2\2\2\u058b\u0586\3\2\2\2\u058b\u0588\3\2\2\2\u058b\u058a\3\2\2\2\u058c"+
		"\u00ff\3\2\2\2\u058d\u058e\7\65\2\2\u058e\u058f\5\u0104\u0083\2\u058f"+
		"\u0590\7b\2\2\u0590\u0595\5\u010a\u0086\2\u0591\u0592\7$\2\2\u0592\u0594"+
		"\5\u010a\u0086\2\u0593\u0591\3\2\2\2\u0594\u0597\3\2\2\2\u0595\u0593\3"+
		"\2\2\2\u0595\u0596\3\2\2\2\u0596\u059b\3\2\2\2\u0597\u0595\3\2\2\2\u0598"+
		"\u0599\7I\2\2\u0599\u059a\7\65\2\2\u059a\u059c\7\u012b\2\2\u059b\u0598"+
		"\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u0101\3\2\2\2\u059d\u05a1\7\66\2\2"+
		"\u059e\u059f\7\65\2\2\u059f\u05a0\7\u012b\2\2\u05a0\u05a2\7a\2\2\u05a1"+
		"\u059e\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a4\5\u0104"+
		"\u0083\2\u05a4\u05a5\7Q\2\2\u05a5\u05aa\5\u010a\u0086\2\u05a6\u05a7\7"+
		"$\2\2\u05a7\u05a9\5\u010a\u0086\2\u05a8\u05a6\3\2\2\2\u05a9\u05ac\3\2"+
		"\2\2\u05aa\u05a8\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ad\3\2\2\2\u05ac"+
		"\u05aa\3\2\2\2\u05ad\u05ae\5\u00ba^\2\u05ae\u0103\3\2\2\2\u05af\u05b0"+
		"\5\u0106\u0084\2\u05b0\u05b1\7]\2\2\u05b1\u05b2\5\u010c\u0087\2\u05b2"+
		"\u0105\3\2\2\2\u05b3\u05b4\5\u0108\u0085\2\u05b4\u05b5\5n8\2\u05b5\u0107"+
		"\3\2\2\2\u05b6\u05b7\7m\2\2\u05b7\u05bf\7\u0132\2\2\u05b8\u05bf\7,\2\2"+
		"\u05b9\u05bf\7/\2\2\u05ba\u05bf\7-\2\2\u05bb\u05bf\7.\2\2\u05bc\u05bf"+
		"\7\u0135\2\2\u05bd\u05bf\7\u014e\2\2\u05be\u05b6\3\2\2\2\u05be\u05b8\3"+
		"\2\2\2\u05be\u05b9\3\2\2\2\u05be\u05ba\3\2\2\2\u05be\u05bb\3\2\2\2\u05be"+
		"\u05bc\3\2\2\2\u05be\u05bd\3\2\2\2\u05bf\u0109\3\2\2\2\u05c0\u05c3\7\u0133"+
		"\2\2\u05c1\u05c3\5\\/\2\u05c2\u05c0\3\2\2\2\u05c2\u05c1\3\2\2\2\u05c3"+
		"\u010b\3\2\2\2\u05c4\u05c6\5\u010e\u0088\2\u05c5\u05c4\3\2\2\2\u05c5\u05c6"+
		"\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c8\5\u0110\u0089\2\u05c8\u010d\3"+
		"\2\2\2\u05c9\u05ca\79\2\2\u05ca\u010f\3\2\2\2\u05cb\u05cc\5d\63\2\u05cc"+
		"\u0111\3\2\2\2\u00aa\u0122\u0125\u0129\u012e\u0131\u0139\u013d\u0145\u014a"+
		"\u014d\u0151\u0159\u0162\u0169\u016e\u0175\u017a\u017d\u0184\u0189\u0190"+
		"\u0195\u0198\u019b\u019e\u01a1\u01a4\u01ac\u01b2\u01b7\u01ba\u01bd\u01c0"+
		"\u01c4\u01d3\u01db\u01e1\u01e6\u01e9\u01ed\u01f1\u01f7\u01fa\u0200\u0204"+
		"\u020e\u0212\u0218\u0224\u022e\u0235\u0239\u023d\u024c\u024f\u0253\u0256"+
		"\u0261\u0264\u0268\u026b\u026f\u0277\u027c\u027f\u0282\u0285\u028e\u0295"+
		"\u029d\u02a0\u02a7\u02ae\u02b2\u02b5\u02bc\u02c0\u02cd\u02d5\u02e2\u02f1"+
		"\u02f3\u02fa\u0301\u030a\u0311\u031a\u0320\u0323\u034c\u034e\u035f\u0365"+
		"\u0370\u0376\u037a\u0380\u0385\u038c\u0390\u039e\u03a4\u03bf\u03d9\u03dd"+
		"\u03e7\u03ec\u03f3\u03f8\u03fb\u0414\u0419\u041c\u0420\u0423\u0426\u042f"+
		"\u0434\u0437\u0439\u0464\u046a\u0471\u0477\u047b\u0480\u0483\u0487\u048d"+
		"\u049f\u04b0\u04b5\u04bb\u04bf\u04cf\u04d8\u04df\u04e6\u04ec\u04ef\u04f8"+
		"\u04fb\u04ff\u0501\u050f\u0516\u0521\u0529\u0532\u0535\u0538\u053c\u053e"+
		"\u0543\u0554\u0559\u0560\u0564\u056a\u0570\u058b\u0595\u059b\u05a1\u05aa"+
		"\u05be\u05c2\u05c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
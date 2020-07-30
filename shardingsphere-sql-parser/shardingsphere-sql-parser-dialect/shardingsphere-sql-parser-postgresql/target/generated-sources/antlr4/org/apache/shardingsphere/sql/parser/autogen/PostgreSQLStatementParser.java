// Generated from org\apache\shardingsphere\sql\parser\autogen\PostgreSQLStatement.g4 by ANTLR 4.7.2
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
public class PostgreSQLStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, AND_=3, OR_=4, NOT_=5, TILDE_=6, VERTICAL_BAR_=7, AMPERSAND_=8, 
		SIGNED_LEFT_SHIFT_=9, SIGNED_RIGHT_SHIFT_=10, CARET_=11, MOD_=12, COLON_=13, 
		PLUS_=14, MINUS_=15, ASTERISK_=16, SLASH_=17, BACKSLASH_=18, DOT_=19, 
		DOT_ASTERISK_=20, SAFE_EQ_=21, DEQ_=22, EQ_=23, NEQ_=24, GT_=25, GTE_=26, 
		LT_=27, LTE_=28, POUND_=29, LP_=30, RP_=31, LBE_=32, RBE_=33, LBT_=34, 
		RBT_=35, COMMA_=36, DQ_=37, SQ_=38, BQ_=39, QUESTION_=40, AT_=41, SEMI_=42, 
		TILDE_TILDE_=43, NOT_TILDE_TILDE_=44, BLOCK_COMMENT=45, INLINE_COMMENT=46, 
		WS=47, SELECT=48, INSERT=49, UPDATE=50, DELETE=51, CREATE=52, ALTER=53, 
		DROP=54, TRUNCATE=55, SCHEMA=56, GRANT=57, REVOKE=58, ADD=59, SET=60, 
		TABLE=61, COLUMN=62, INDEX=63, CONSTRAINT=64, PRIMARY=65, UNIQUE=66, FOREIGN=67, 
		KEY=68, POSITION=69, PRECISION=70, FUNCTION=71, TRIGGER=72, PROCEDURE=73, 
		VIEW=74, INTO=75, VALUES=76, WITH=77, UNION=78, DISTINCT=79, CASE=80, 
		WHEN=81, CAST=82, TRIM=83, SUBSTRING=84, FROM=85, NATURAL=86, JOIN=87, 
		FULL=88, INNER=89, OUTER=90, LEFT=91, RIGHT=92, CROSS=93, USING=94, WHERE=95, 
		AS=96, ON=97, IF=98, ELSE=99, THEN=100, FOR=101, TO=102, AND=103, OR=104, 
		IS=105, NOT=106, NULL=107, TRUE=108, FALSE=109, EXISTS=110, BETWEEN=111, 
		IN=112, ALL=113, ANY=114, LIKE=115, ORDER=116, GROUP=117, BY=118, ASC=119, 
		DESC=120, HAVING=121, LIMIT=122, OFFSET=123, BEGIN=124, COMMIT=125, ROLLBACK=126, 
		SAVEPOINT=127, BOOLEAN=128, DOUBLE=129, CHAR=130, CHARACTER=131, ARRAY=132, 
		INTERVAL=133, DATE=134, TIME=135, TIMESTAMP=136, LOCALTIME=137, LOCALTIMESTAMP=138, 
		YEAR=139, QUARTER=140, MONTH=141, WEEK=142, DAY=143, HOUR=144, MINUTE=145, 
		SECOND=146, MICROSECOND=147, MAX=148, MIN=149, SUM=150, COUNT=151, AVG=152, 
		DEFAULT=153, CURRENT=154, ENABLE=155, DISABLE=156, CALL=157, INSTANCE=158, 
		PRESERVE=159, DO=160, DEFINER=161, CURRENT_USER=162, SQL=163, CASCADED=164, 
		LOCAL=165, CLOSE=166, OPEN=167, NEXT=168, NAME=169, COLLATION=170, NAMES=171, 
		INTEGER=172, REAL=173, DECIMAL=174, TYPE=175, SMALLINT=176, BIGINT=177, 
		NUMERIC=178, TEXT=179, FOR_GENERATOR=180, ADMIN=181, BINARY=182, ESCAPE=183, 
		EXCLUDE=184, MOD=185, PARTITION=186, ROW=187, UNKNOWN=188, ALWAYS=189, 
		CASCADE=190, CHECK=191, GENERATED=192, ISOLATION=193, LEVEL=194, NO=195, 
		OPTION=196, PRIVILEGES=197, READ=198, REFERENCES=199, ROLE=200, ROWS=201, 
		START=202, TRANSACTION=203, USER=204, ACTION=205, CACHE=206, CHARACTERISTICS=207, 
		CLUSTER=208, COLLATE=209, COMMENTS=210, CONCURRENTLY=211, CONNECT=212, 
		CONSTRAINTS=213, CURRENT_TIMESTAMP=214, CYCLE=215, DATA=216, DATABASE=217, 
		DEFAULTS=218, DEFERRABLE=219, DEFERRED=220, DEPENDS=221, DOMAIN=222, EXCLUDING=223, 
		EXECUTE=224, EXTENDED=225, EXTENSION=226, EXTERNAL=227, EXTRACT=228, FILTER=229, 
		FIRST=230, FOLLOWING=231, FORCE=232, GLOBAL=233, IDENTITY=234, IMMEDIATE=235, 
		INCLUDING=236, INCREMENT=237, INDEXES=238, INHERIT=239, INHERITS=240, 
		INITIALLY=241, INCLUDE=242, LANGUAGE=243, LARGE=244, LAST=245, LOGGED=246, 
		MAIN=247, MATCH=248, MAXVALUE=249, MINVALUE=250, NOTHING=251, NULLS=252, 
		OBJECT=253, OIDS=254, ONLY=255, OVER=256, OWNED=257, OWNER=258, PARTIAL=259, 
		PLAIN=260, PRECEDING=261, RANGE=262, RENAME=263, REPLICA=264, RESET=265, 
		RESTART=266, RESTRICT=267, ROUTINE=268, RULE=269, SECURITY=270, SEQUENCE=271, 
		SESSION=272, SESSION_USER=273, SHOW=274, SIMPLE=275, STATISTICS=276, STORAGE=277, 
		TABLESPACE=278, TEMP=279, TEMPORARY=280, UNBOUNDED=281, UNLOGGED=282, 
		USAGE=283, VALID=284, VALIDATE=285, WITHIN=286, WITHOUT=287, ZONE=288, 
		OF=289, UESCAPE=290, GROUPS=291, RECURSIVE=292, INT=293, INT2=294, INT4=295, 
		INT8=296, FLOAT=297, FLOAT4=298, FLOAT8=299, SMALLSERIAL=300, SERIAL=301, 
		BIGSERIAL=302, MONEY=303, VARCHAR=304, BYTEA=305, ENUM=306, POINT=307, 
		LINE=308, LSEG=309, BOX=310, PATH=311, POLYGON=312, CIRCLE=313, CIDR=314, 
		INET=315, MACADDR=316, MACADDR8=317, BIT=318, VARBIT=319, TSVECTOR=320, 
		TSQUERY=321, UUID=322, XML=323, JSON=324, INT4RANGE=325, INT8RANGE=326, 
		NUMRANGE=327, TSRANGE=328, TSTZRANGE=329, DATERANGE=330, IDENTIFIER_=331, 
		STRING_=332, NUMBER_=333, HEX_DIGIT_=334, BIT_NUM_=335;
	public static final int
		RULE_execute = 0, RULE_insert = 1, RULE_insertValuesClause = 2, RULE_insertSelectClause = 3, 
		RULE_update = 4, RULE_updateSpecification_ = 5, RULE_assignment = 6, RULE_setAssignmentsClause = 7, 
		RULE_assignmentValues = 8, RULE_assignmentValue = 9, RULE_delete = 10, 
		RULE_deleteSpecification_ = 11, RULE_singleTableClause = 12, RULE_multipleTablesClause = 13, 
		RULE_multipleTableNames = 14, RULE_select = 15, RULE_unionClause = 16, 
		RULE_selectClause = 17, RULE_duplicateSpecification = 18, RULE_projections = 19, 
		RULE_projection = 20, RULE_alias = 21, RULE_unqualifiedShorthand = 22, 
		RULE_qualifiedShorthand = 23, RULE_fromClause = 24, RULE_tableReferences = 25, 
		RULE_tableReference = 26, RULE_tableFactor = 27, RULE_joinedTable = 28, 
		RULE_joinSpecification = 29, RULE_whereClause = 30, RULE_groupByClause = 31, 
		RULE_havingClause = 32, RULE_limitClause = 33, RULE_limitRowCountSyntax = 34, 
		RULE_limitRowCount = 35, RULE_limitOffsetSyntax = 36, RULE_limitOffset = 37, 
		RULE_subquery = 38, RULE_parameterMarker = 39, RULE_literals = 40, RULE_stringLiterals = 41, 
		RULE_numberLiterals = 42, RULE_hexadecimalLiterals = 43, RULE_bitValueLiterals = 44, 
		RULE_booleanLiterals = 45, RULE_nullValueLiterals = 46, RULE_literalsType_ = 47, 
		RULE_identifier = 48, RULE_unicodeEscapes_ = 49, RULE_uescape_ = 50, RULE_unreservedWord = 51, 
		RULE_schemaName = 52, RULE_tableName = 53, RULE_columnName = 54, RULE_owner = 55, 
		RULE_name = 56, RULE_tableNames = 57, RULE_columnNames = 58, RULE_collationName = 59, 
		RULE_indexName = 60, RULE_primaryKey = 61, RULE_expr = 62, RULE_logicalOperator = 63, 
		RULE_notOperator_ = 64, RULE_booleanPrimary = 65, RULE_comparisonOperator = 66, 
		RULE_predicate = 67, RULE_bitExpr = 68, RULE_simpleExpr = 69, RULE_functionCall = 70, 
		RULE_aggregationFunction = 71, RULE_aggregationFunctionName = 72, RULE_distinct = 73, 
		RULE_filterClause_ = 74, RULE_windowFunction = 75, RULE_windowDefinition_ = 76, 
		RULE_pratitionClause_ = 77, RULE_frameClause_ = 78, RULE_frameStart_ = 79, 
		RULE_frameEnd_ = 80, RULE_frameBetween_ = 81, RULE_specialFunction = 82, 
		RULE_castFunction = 83, RULE_charFunction = 84, RULE_regularFunction = 85, 
		RULE_regularFunctionName_ = 86, RULE_caseExpression = 87, RULE_caseWhen_ = 88, 
		RULE_caseElse_ = 89, RULE_orderByClause = 90, RULE_orderByItem = 91, RULE_dataType = 92, 
		RULE_dataTypeName = 93, RULE_dataTypeLength = 94, RULE_characterSet_ = 95, 
		RULE_collateClause_ = 96, RULE_ignoredIdentifier_ = 97, RULE_ignoredIdentifiers_ = 98, 
		RULE_createTable = 99, RULE_createIndex = 100, RULE_alterTable = 101, 
		RULE_alterIndex = 102, RULE_dropTable = 103, RULE_dropIndex = 104, RULE_truncateTable = 105, 
		RULE_createTableSpecification_ = 106, RULE_tableNotExistClause_ = 107, 
		RULE_createDefinitionClause = 108, RULE_createDefinition = 109, RULE_columnDefinition = 110, 
		RULE_columnConstraint = 111, RULE_constraintClause = 112, RULE_columnConstraintOption = 113, 
		RULE_checkOption = 114, RULE_defaultExpr = 115, RULE_sequenceOptions = 116, 
		RULE_sequenceOption = 117, RULE_indexParameters = 118, RULE_action = 119, 
		RULE_constraintOptionalParam = 120, RULE_likeOption = 121, RULE_tableConstraint = 122, 
		RULE_tableConstraintOption = 123, RULE_inheritClause_ = 124, RULE_createIndexSpecification_ = 125, 
		RULE_concurrentlyClause_ = 126, RULE_indexNotExistClause_ = 127, RULE_onlyClause_ = 128, 
		RULE_tableExistClause_ = 129, RULE_asteriskClause_ = 130, RULE_alterDefinitionClause = 131, 
		RULE_alterIndexDefinitionClause_ = 132, RULE_renameIndexSpecification = 133, 
		RULE_alterIndexDependsOnExtension = 134, RULE_alterIndexSetTableSpace = 135, 
		RULE_tableNamesClause = 136, RULE_tableNameClause = 137, RULE_alterTableActions = 138, 
		RULE_alterTableAction = 139, RULE_addColumnSpecification = 140, RULE_dropColumnSpecification = 141, 
		RULE_columnExistClause_ = 142, RULE_modifyColumnSpecification = 143, RULE_modifyColumn = 144, 
		RULE_alterColumnSetOption = 145, RULE_attributeOptions = 146, RULE_attributeOption = 147, 
		RULE_addConstraintSpecification = 148, RULE_tableConstraintUsingIndex = 149, 
		RULE_storageParameterWithValue = 150, RULE_storageParameter = 151, RULE_renameColumnSpecification = 152, 
		RULE_renameConstraint = 153, RULE_renameTableSpecification_ = 154, RULE_indexExistClause_ = 155, 
		RULE_indexNames = 156, RULE_setTransaction = 157, RULE_beginTransaction = 158, 
		RULE_commit = 159, RULE_rollback = 160, RULE_savepoint = 161, RULE_grant = 162, 
		RULE_revoke = 163, RULE_privilegeClause = 164, RULE_roleClause_ = 165, 
		RULE_optionForClause_ = 166, RULE_privileges_ = 167, RULE_privilegeType_ = 168, 
		RULE_onObjectClause = 169, RULE_createUser = 170, RULE_dropUser = 171, 
		RULE_alterUser = 172, RULE_createRole = 173, RULE_dropRole = 174, RULE_alterRole = 175, 
		RULE_show = 176, RULE_set = 177, RULE_runtimeScope_ = 178, RULE_timeZoneClause_ = 179, 
		RULE_configurationParameterClause = 180, RULE_resetParameter = 181, RULE_call = 182;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "insert", "insertValuesClause", "insertSelectClause", "update", 
			"updateSpecification_", "assignment", "setAssignmentsClause", "assignmentValues", 
			"assignmentValue", "delete", "deleteSpecification_", "singleTableClause", 
			"multipleTablesClause", "multipleTableNames", "select", "unionClause", 
			"selectClause", "duplicateSpecification", "projections", "projection", 
			"alias", "unqualifiedShorthand", "qualifiedShorthand", "fromClause", 
			"tableReferences", "tableReference", "tableFactor", "joinedTable", "joinSpecification", 
			"whereClause", "groupByClause", "havingClause", "limitClause", "limitRowCountSyntax", 
			"limitRowCount", "limitOffsetSyntax", "limitOffset", "subquery", "parameterMarker", 
			"literals", "stringLiterals", "numberLiterals", "hexadecimalLiterals", 
			"bitValueLiterals", "booleanLiterals", "nullValueLiterals", "literalsType_", 
			"identifier", "unicodeEscapes_", "uescape_", "unreservedWord", "schemaName", 
			"tableName", "columnName", "owner", "name", "tableNames", "columnNames", 
			"collationName", "indexName", "primaryKey", "expr", "logicalOperator", 
			"notOperator_", "booleanPrimary", "comparisonOperator", "predicate", 
			"bitExpr", "simpleExpr", "functionCall", "aggregationFunction", "aggregationFunctionName", 
			"distinct", "filterClause_", "windowFunction", "windowDefinition_", "pratitionClause_", 
			"frameClause_", "frameStart_", "frameEnd_", "frameBetween_", "specialFunction", 
			"castFunction", "charFunction", "regularFunction", "regularFunctionName_", 
			"caseExpression", "caseWhen_", "caseElse_", "orderByClause", "orderByItem", 
			"dataType", "dataTypeName", "dataTypeLength", "characterSet_", "collateClause_", 
			"ignoredIdentifier_", "ignoredIdentifiers_", "createTable", "createIndex", 
			"alterTable", "alterIndex", "dropTable", "dropIndex", "truncateTable", 
			"createTableSpecification_", "tableNotExistClause_", "createDefinitionClause", 
			"createDefinition", "columnDefinition", "columnConstraint", "constraintClause", 
			"columnConstraintOption", "checkOption", "defaultExpr", "sequenceOptions", 
			"sequenceOption", "indexParameters", "action", "constraintOptionalParam", 
			"likeOption", "tableConstraint", "tableConstraintOption", "inheritClause_", 
			"createIndexSpecification_", "concurrentlyClause_", "indexNotExistClause_", 
			"onlyClause_", "tableExistClause_", "asteriskClause_", "alterDefinitionClause", 
			"alterIndexDefinitionClause_", "renameIndexSpecification", "alterIndexDependsOnExtension", 
			"alterIndexSetTableSpace", "tableNamesClause", "tableNameClause", "alterTableActions", 
			"alterTableAction", "addColumnSpecification", "dropColumnSpecification", 
			"columnExistClause_", "modifyColumnSpecification", "modifyColumn", "alterColumnSetOption", 
			"attributeOptions", "attributeOption", "addConstraintSpecification", 
			"tableConstraintUsingIndex", "storageParameterWithValue", "storageParameter", 
			"renameColumnSpecification", "renameConstraint", "renameTableSpecification_", 
			"indexExistClause_", "indexNames", "setTransaction", "beginTransaction", 
			"commit", "rollback", "savepoint", "grant", "revoke", "privilegeClause", 
			"roleClause_", "optionForClause_", "privileges_", "privilegeType_", "onObjectClause", 
			"createUser", "dropUser", "alterUser", "createRole", "dropRole", "alterRole", 
			"show", "set", "runtimeScope_", "timeZoneClause_", "configurationParameterClause", 
			"resetParameter", "call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'U'", "'u'", "'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", 
			"'>>'", "'^'", "'%'", "':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", 
			"'.*'", "'<=>'", "'=='", "'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "','", "'\"'", "'''", "'`'", 
			"'?'", "'@'", "';'", "'~~'", "'!~~'", null, null, null, null, null, null, 
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
			null, null, null, null, null, null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "AND_", "OR_", "NOT_", "TILDE_", "VERTICAL_BAR_", "AMPERSAND_", 
			"SIGNED_LEFT_SHIFT_", "SIGNED_RIGHT_SHIFT_", "CARET_", "MOD_", "COLON_", 
			"PLUS_", "MINUS_", "ASTERISK_", "SLASH_", "BACKSLASH_", "DOT_", "DOT_ASTERISK_", 
			"SAFE_EQ_", "DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", "LT_", "LTE_", "POUND_", 
			"LP_", "RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", 
			"BQ_", "QUESTION_", "AT_", "SEMI_", "TILDE_TILDE_", "NOT_TILDE_TILDE_", 
			"BLOCK_COMMENT", "INLINE_COMMENT", "WS", "SELECT", "INSERT", "UPDATE", 
			"DELETE", "CREATE", "ALTER", "DROP", "TRUNCATE", "SCHEMA", "GRANT", "REVOKE", 
			"ADD", "SET", "TABLE", "COLUMN", "INDEX", "CONSTRAINT", "PRIMARY", "UNIQUE", 
			"FOREIGN", "KEY", "POSITION", "PRECISION", "FUNCTION", "TRIGGER", "PROCEDURE", 
			"VIEW", "INTO", "VALUES", "WITH", "UNION", "DISTINCT", "CASE", "WHEN", 
			"CAST", "TRIM", "SUBSTRING", "FROM", "NATURAL", "JOIN", "FULL", "INNER", 
			"OUTER", "LEFT", "RIGHT", "CROSS", "USING", "WHERE", "AS", "ON", "IF", 
			"ELSE", "THEN", "FOR", "TO", "AND", "OR", "IS", "NOT", "NULL", "TRUE", 
			"FALSE", "EXISTS", "BETWEEN", "IN", "ALL", "ANY", "LIKE", "ORDER", "GROUP", 
			"BY", "ASC", "DESC", "HAVING", "LIMIT", "OFFSET", "BEGIN", "COMMIT", 
			"ROLLBACK", "SAVEPOINT", "BOOLEAN", "DOUBLE", "CHAR", "CHARACTER", "ARRAY", 
			"INTERVAL", "DATE", "TIME", "TIMESTAMP", "LOCALTIME", "LOCALTIMESTAMP", 
			"YEAR", "QUARTER", "MONTH", "WEEK", "DAY", "HOUR", "MINUTE", "SECOND", 
			"MICROSECOND", "MAX", "MIN", "SUM", "COUNT", "AVG", "DEFAULT", "CURRENT", 
			"ENABLE", "DISABLE", "CALL", "INSTANCE", "PRESERVE", "DO", "DEFINER", 
			"CURRENT_USER", "SQL", "CASCADED", "LOCAL", "CLOSE", "OPEN", "NEXT", 
			"NAME", "COLLATION", "NAMES", "INTEGER", "REAL", "DECIMAL", "TYPE", "SMALLINT", 
			"BIGINT", "NUMERIC", "TEXT", "FOR_GENERATOR", "ADMIN", "BINARY", "ESCAPE", 
			"EXCLUDE", "MOD", "PARTITION", "ROW", "UNKNOWN", "ALWAYS", "CASCADE", 
			"CHECK", "GENERATED", "ISOLATION", "LEVEL", "NO", "OPTION", "PRIVILEGES", 
			"READ", "REFERENCES", "ROLE", "ROWS", "START", "TRANSACTION", "USER", 
			"ACTION", "CACHE", "CHARACTERISTICS", "CLUSTER", "COLLATE", "COMMENTS", 
			"CONCURRENTLY", "CONNECT", "CONSTRAINTS", "CURRENT_TIMESTAMP", "CYCLE", 
			"DATA", "DATABASE", "DEFAULTS", "DEFERRABLE", "DEFERRED", "DEPENDS", 
			"DOMAIN", "EXCLUDING", "EXECUTE", "EXTENDED", "EXTENSION", "EXTERNAL", 
			"EXTRACT", "FILTER", "FIRST", "FOLLOWING", "FORCE", "GLOBAL", "IDENTITY", 
			"IMMEDIATE", "INCLUDING", "INCREMENT", "INDEXES", "INHERIT", "INHERITS", 
			"INITIALLY", "INCLUDE", "LANGUAGE", "LARGE", "LAST", "LOGGED", "MAIN", 
			"MATCH", "MAXVALUE", "MINVALUE", "NOTHING", "NULLS", "OBJECT", "OIDS", 
			"ONLY", "OVER", "OWNED", "OWNER", "PARTIAL", "PLAIN", "PRECEDING", "RANGE", 
			"RENAME", "REPLICA", "RESET", "RESTART", "RESTRICT", "ROUTINE", "RULE", 
			"SECURITY", "SEQUENCE", "SESSION", "SESSION_USER", "SHOW", "SIMPLE", 
			"STATISTICS", "STORAGE", "TABLESPACE", "TEMP", "TEMPORARY", "UNBOUNDED", 
			"UNLOGGED", "USAGE", "VALID", "VALIDATE", "WITHIN", "WITHOUT", "ZONE", 
			"OF", "UESCAPE", "GROUPS", "RECURSIVE", "INT", "INT2", "INT4", "INT8", 
			"FLOAT", "FLOAT4", "FLOAT8", "SMALLSERIAL", "SERIAL", "BIGSERIAL", "MONEY", 
			"VARCHAR", "BYTEA", "ENUM", "POINT", "LINE", "LSEG", "BOX", "PATH", "POLYGON", 
			"CIRCLE", "CIDR", "INET", "MACADDR", "MACADDR8", "BIT", "VARBIT", "TSVECTOR", 
			"TSQUERY", "UUID", "XML", "JSON", "INT4RANGE", "INT8RANGE", "NUMRANGE", 
			"TSRANGE", "TSTZRANGE", "DATERANGE", "IDENTIFIER_", "STRING_", "NUMBER_", 
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
	public String getGrammarFileName() { return "PostgreSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PostgreSQLStatementParser(TokenStream input) {
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
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public AlterIndexContext alterIndex() {
			return getRuleContext(AlterIndexContext.class,0);
		}
		public DropIndexContext dropIndex() {
			return getRuleContext(DropIndexContext.class,0);
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
		public TruncateTableContext truncateTable() {
			return getRuleContext(TruncateTableContext.class,0);
		}
		public SetTransactionContext setTransaction() {
			return getRuleContext(SetTransactionContext.class,0);
		}
		public BeginTransactionContext beginTransaction() {
			return getRuleContext(BeginTransactionContext.class,0);
		}
		public CommitContext commit() {
			return getRuleContext(CommitContext.class,0);
		}
		public RollbackContext rollback() {
			return getRuleContext(RollbackContext.class,0);
		}
		public SavepointContext savepoint() {
			return getRuleContext(SavepointContext.class,0);
		}
		public GrantContext grant() {
			return getRuleContext(GrantContext.class,0);
		}
		public RevokeContext revoke() {
			return getRuleContext(RevokeContext.class,0);
		}
		public CreateUserContext createUser() {
			return getRuleContext(CreateUserContext.class,0);
		}
		public DropUserContext dropUser() {
			return getRuleContext(DropUserContext.class,0);
		}
		public AlterUserContext alterUser() {
			return getRuleContext(AlterUserContext.class,0);
		}
		public CreateRoleContext createRole() {
			return getRuleContext(CreateRoleContext.class,0);
		}
		public DropRoleContext dropRole() {
			return getRuleContext(DropRoleContext.class,0);
		}
		public AlterRoleContext alterRole() {
			return getRuleContext(AlterRoleContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public ResetParameterContext resetParameter() {
			return getRuleContext(ResetParameterContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(PostgreSQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitExecute(this);
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
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(366);
				select();
				}
				break;
			case 2:
				{
				setState(367);
				insert();
				}
				break;
			case 3:
				{
				setState(368);
				update();
				}
				break;
			case 4:
				{
				setState(369);
				delete();
				}
				break;
			case 5:
				{
				setState(370);
				createIndex();
				}
				break;
			case 6:
				{
				setState(371);
				alterIndex();
				}
				break;
			case 7:
				{
				setState(372);
				dropIndex();
				}
				break;
			case 8:
				{
				setState(373);
				createTable();
				}
				break;
			case 9:
				{
				setState(374);
				alterTable();
				}
				break;
			case 10:
				{
				setState(375);
				dropTable();
				}
				break;
			case 11:
				{
				setState(376);
				truncateTable();
				}
				break;
			case 12:
				{
				setState(377);
				setTransaction();
				}
				break;
			case 13:
				{
				setState(378);
				beginTransaction();
				}
				break;
			case 14:
				{
				setState(379);
				commit();
				}
				break;
			case 15:
				{
				setState(380);
				rollback();
				}
				break;
			case 16:
				{
				setState(381);
				savepoint();
				}
				break;
			case 17:
				{
				setState(382);
				grant();
				}
				break;
			case 18:
				{
				setState(383);
				revoke();
				}
				break;
			case 19:
				{
				setState(384);
				createUser();
				}
				break;
			case 20:
				{
				setState(385);
				dropUser();
				}
				break;
			case 21:
				{
				setState(386);
				alterUser();
				}
				break;
			case 22:
				{
				setState(387);
				createRole();
				}
				break;
			case 23:
				{
				setState(388);
				dropRole();
				}
				break;
			case 24:
				{
				setState(389);
				alterRole();
				}
				break;
			case 25:
				{
				setState(390);
				show();
				}
				break;
			case 26:
				{
				setState(391);
				set();
				}
				break;
			case 27:
				{
				setState(392);
				resetParameter();
				}
				break;
			case 28:
				{
				setState(393);
				call();
				}
				break;
			}
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(396);
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
		public TerminalNode INSERT() { return getToken(PostgreSQLStatementParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(PostgreSQLStatementParser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public InsertValuesClauseContext insertValuesClause() {
			return getRuleContext(InsertValuesClauseContext.class,0);
		}
		public InsertSelectClauseContext insertSelectClause() {
			return getRuleContext(InsertSelectClauseContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitInsert(this);
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
			setState(399);
			match(INSERT);
			setState(400);
			match(INTO);
			setState(401);
			tableName();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << ALTER) | (1L << DROP) | (1L << TRUNCATE) | (1L << SCHEMA) | (1L << REVOKE) | (1L << ADD) | (1L << SET) | (1L << INDEX))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (KEY - 68)) | (1L << (FUNCTION - 68)) | (1L << (TRIGGER - 68)) | (1L << (PROCEDURE - 68)) | (1L << (AS - 68)) | (1L << (IF - 68)) | (1L << (BEGIN - 68)) | (1L << (COMMIT - 68)) | (1L << (ROLLBACK - 68)) | (1L << (SAVEPOINT - 68)) | (1L << (BOOLEAN - 68)) | (1L << (CHAR - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (INTERVAL - 133)) | (1L << (TIME - 133)) | (1L << (TIMESTAMP - 133)) | (1L << (YEAR - 133)) | (1L << (MONTH - 133)) | (1L << (DAY - 133)) | (1L << (HOUR - 133)) | (1L << (MINUTE - 133)) | (1L << (SECOND - 133)) | (1L << (CURRENT - 133)) | (1L << (ENABLE - 133)) | (1L << (DISABLE - 133)) | (1L << (INSTANCE - 133)) | (1L << (PRESERVE - 133)) | (1L << (DEFINER - 133)) | (1L << (SQL - 133)) | (1L << (CASCADED - 133)) | (1L << (LOCAL - 133)) | (1L << (CLOSE - 133)) | (1L << (OPEN - 133)) | (1L << (NEXT - 133)) | (1L << (NAME - 133)) | (1L << (NAMES - 133)) | (1L << (INTEGER - 133)) | (1L << (REAL - 133)) | (1L << (DECIMAL - 133)) | (1L << (TYPE - 133)) | (1L << (ADMIN - 133)) | (1L << (ESCAPE - 133)) | (1L << (EXCLUDE - 133)) | (1L << (PARTITION - 133)) | (1L << (UNKNOWN - 133)) | (1L << (ALWAYS - 133)) | (1L << (CASCADE - 133)) | (1L << (GENERATED - 133)) | (1L << (ISOLATION - 133)) | (1L << (LEVEL - 133)) | (1L << (OPTION - 133)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (PRIVILEGES - 197)) | (1L << (READ - 197)) | (1L << (ROLE - 197)) | (1L << (ROWS - 197)) | (1L << (START - 197)) | (1L << (TRANSACTION - 197)) | (1L << (ACTION - 197)) | (1L << (CACHE - 197)) | (1L << (CHARACTERISTICS - 197)) | (1L << (CLUSTER - 197)) | (1L << (COMMENTS - 197)) | (1L << (CONSTRAINTS - 197)) | (1L << (CYCLE - 197)) | (1L << (DATA - 197)) | (1L << (DATABASE - 197)) | (1L << (DEFAULTS - 197)) | (1L << (DEFERRED - 197)) | (1L << (DEPENDS - 197)) | (1L << (DOMAIN - 197)) | (1L << (EXCLUDING - 197)) | (1L << (EXECUTE - 197)) | (1L << (EXTENDED - 197)) | (1L << (EXTENSION - 197)) | (1L << (EXTERNAL - 197)) | (1L << (EXTRACT - 197)) | (1L << (FILTER - 197)) | (1L << (FIRST - 197)) | (1L << (FOLLOWING - 197)) | (1L << (FORCE - 197)) | (1L << (GLOBAL - 197)) | (1L << (IDENTITY - 197)) | (1L << (IMMEDIATE - 197)) | (1L << (INCLUDING - 197)) | (1L << (INCREMENT - 197)) | (1L << (INDEXES - 197)) | (1L << (INHERIT - 197)) | (1L << (INHERITS - 197)) | (1L << (INCLUDE - 197)) | (1L << (LANGUAGE - 197)) | (1L << (LARGE - 197)) | (1L << (LAST - 197)) | (1L << (LOGGED - 197)) | (1L << (MAIN - 197)) | (1L << (MATCH - 197)) | (1L << (MAXVALUE - 197)) | (1L << (MINVALUE - 197)) | (1L << (NOTHING - 197)) | (1L << (NULLS - 197)) | (1L << (OBJECT - 197)) | (1L << (OIDS - 197)) | (1L << (OVER - 197)) | (1L << (OWNED - 197)) | (1L << (OWNER - 197)) | (1L << (PARTIAL - 197)) | (1L << (PLAIN - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (PRECEDING - 261)) | (1L << (RANGE - 261)) | (1L << (RENAME - 261)) | (1L << (REPLICA - 261)) | (1L << (RESET - 261)) | (1L << (RESTART - 261)) | (1L << (RESTRICT - 261)) | (1L << (ROUTINE - 261)) | (1L << (RULE - 261)) | (1L << (SECURITY - 261)) | (1L << (SEQUENCE - 261)) | (1L << (SESSION - 261)) | (1L << (SHOW - 261)) | (1L << (SIMPLE - 261)) | (1L << (STATISTICS - 261)) | (1L << (STORAGE - 261)) | (1L << (TABLESPACE - 261)) | (1L << (TEMP - 261)) | (1L << (TEMPORARY - 261)) | (1L << (UNBOUNDED - 261)) | (1L << (UNLOGGED - 261)) | (1L << (USAGE - 261)) | (1L << (VALID - 261)) | (1L << (VALIDATE - 261)) | (1L << (WITHIN - 261)) | (1L << (WITHOUT - 261)) | (1L << (ZONE - 261)) | (1L << (OF - 261)) | (1L << (GROUPS - 261)) | (1L << (RECURSIVE - 261)) | (1L << (INT2 - 261)) | (1L << (INT4 - 261)) | (1L << (INT8 - 261)) | (1L << (FLOAT4 - 261)) | (1L << (FLOAT8 - 261)) | (1L << (MACADDR8 - 261)) | (1L << (UUID - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (INT4RANGE - 325)) | (1L << (INT8RANGE - 325)) | (1L << (IDENTIFIER_ - 325)) | (1L << (STRING_ - 325)))) != 0)) {
				{
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(402);
					match(AS);
					}
				}

				setState(405);
				alias();
				}
			}

			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(408);
				insertValuesClause();
				}
				break;
			case 2:
				{
				setState(409);
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
		public TerminalNode VALUES() { return getToken(PostgreSQLStatementParser.VALUES, 0); }
		public List<AssignmentValuesContext> assignmentValues() {
			return getRuleContexts(AssignmentValuesContext.class);
		}
		public AssignmentValuesContext assignmentValues(int i) {
			return getRuleContext(AssignmentValuesContext.class,i);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public InsertValuesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValuesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitInsertValuesClause(this);
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
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(412);
				columnNames();
				}
			}

			setState(415);
			match(VALUES);
			setState(416);
			assignmentValues();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(417);
				match(COMMA_);
				setState(418);
				assignmentValues();
				}
				}
				setState(423);
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
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitInsertSelectClause(this);
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
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(424);
				columnNames();
				}
			}

			setState(427);
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
		public TerminalNode UPDATE() { return getToken(PostgreSQLStatementParser.UPDATE, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public SetAssignmentsClauseContext setAssignmentsClause() {
			return getRuleContext(SetAssignmentsClauseContext.class,0);
		}
		public UpdateSpecification_Context updateSpecification_() {
			return getRuleContext(UpdateSpecification_Context.class,0);
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
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitUpdate(this);
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
			setState(429);
			match(UPDATE);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(430);
				updateSpecification_();
				}
			}

			setState(433);
			tableReferences();
			setState(434);
			setAssignmentsClause();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(435);
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

	public static class UpdateSpecification_Context extends ParserRuleContext {
		public TerminalNode ONLY() { return getToken(PostgreSQLStatementParser.ONLY, 0); }
		public UpdateSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateSpecification_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitUpdateSpecification_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateSpecification_Context updateSpecification_() throws RecognitionException {
		UpdateSpecification_Context _localctx = new UpdateSpecification_Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_updateSpecification_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(ONLY);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public AssignmentValueContext assignmentValue() {
			return getRuleContext(AssignmentValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			columnName();
			setState(441);
			match(EQ_);
			setState(442);
			assignmentValue();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public SetAssignmentsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAssignmentsClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitSetAssignmentsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetAssignmentsClauseContext setAssignmentsClause() throws RecognitionException {
		SetAssignmentsClauseContext _localctx = new SetAssignmentsClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setAssignmentsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(SET);
			setState(445);
			assignment();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(446);
				match(COMMA_);
				setState(447);
				assignment();
				}
				}
				setState(452);
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
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<AssignmentValueContext> assignmentValue() {
			return getRuleContexts(AssignmentValueContext.class);
		}
		public AssignmentValueContext assignmentValue(int i) {
			return getRuleContext(AssignmentValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public AssignmentValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValues; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAssignmentValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValuesContext assignmentValues() throws RecognitionException {
		AssignmentValuesContext _localctx = new AssignmentValuesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentValues);
		int _la;
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				match(LP_);
				setState(454);
				assignmentValue();
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(455);
					match(COMMA_);
					setState(456);
					assignmentValue();
					}
					}
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(462);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(LP_);
				setState(465);
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
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public AssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAssignmentValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValueContext assignmentValue() throws RecognitionException {
		AssignmentValueContext _localctx = new AssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignmentValue);
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case ADMIN:
			case BINARY:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CURRENT_TIMESTAMP:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case INT2:
			case INT4:
			case INT8:
			case FLOAT4:
			case FLOAT8:
			case MACADDR8:
			case UUID:
			case INT4RANGE:
			case INT8RANGE:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				expr(0);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(DEFAULT);
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

	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(PostgreSQLStatementParser.DELETE, 0); }
		public SingleTableClauseContext singleTableClause() {
			return getRuleContext(SingleTableClauseContext.class,0);
		}
		public MultipleTablesClauseContext multipleTablesClause() {
			return getRuleContext(MultipleTablesClauseContext.class,0);
		}
		public DeleteSpecification_Context deleteSpecification_() {
			return getRuleContext(DeleteSpecification_Context.class,0);
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
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitDelete(this);
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
			setState(472);
			match(DELETE);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(473);
				deleteSpecification_();
				}
			}

			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(476);
				singleTableClause();
				}
				break;
			case 2:
				{
				setState(477);
				multipleTablesClause();
				}
				break;
			}
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(480);
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

	public static class DeleteSpecification_Context extends ParserRuleContext {
		public TerminalNode ONLY() { return getToken(PostgreSQLStatementParser.ONLY, 0); }
		public DeleteSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteSpecification_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitDeleteSpecification_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteSpecification_Context deleteSpecification_() throws RecognitionException {
		DeleteSpecification_Context _localctx = new DeleteSpecification_Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_deleteSpecification_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(ONLY);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode FROM() { return getToken(PostgreSQLStatementParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public SingleTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitSingleTableClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableClauseContext singleTableClause() throws RecognitionException {
		SingleTableClauseContext _localctx = new SingleTableClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_singleTableClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(FROM);
			setState(486);
			tableName();
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << ALTER) | (1L << DROP) | (1L << TRUNCATE) | (1L << SCHEMA) | (1L << REVOKE) | (1L << ADD) | (1L << SET) | (1L << INDEX))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (KEY - 68)) | (1L << (FUNCTION - 68)) | (1L << (TRIGGER - 68)) | (1L << (PROCEDURE - 68)) | (1L << (AS - 68)) | (1L << (IF - 68)) | (1L << (BEGIN - 68)) | (1L << (COMMIT - 68)) | (1L << (ROLLBACK - 68)) | (1L << (SAVEPOINT - 68)) | (1L << (BOOLEAN - 68)) | (1L << (CHAR - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (INTERVAL - 133)) | (1L << (TIME - 133)) | (1L << (TIMESTAMP - 133)) | (1L << (YEAR - 133)) | (1L << (MONTH - 133)) | (1L << (DAY - 133)) | (1L << (HOUR - 133)) | (1L << (MINUTE - 133)) | (1L << (SECOND - 133)) | (1L << (CURRENT - 133)) | (1L << (ENABLE - 133)) | (1L << (DISABLE - 133)) | (1L << (INSTANCE - 133)) | (1L << (PRESERVE - 133)) | (1L << (DEFINER - 133)) | (1L << (SQL - 133)) | (1L << (CASCADED - 133)) | (1L << (LOCAL - 133)) | (1L << (CLOSE - 133)) | (1L << (OPEN - 133)) | (1L << (NEXT - 133)) | (1L << (NAME - 133)) | (1L << (NAMES - 133)) | (1L << (INTEGER - 133)) | (1L << (REAL - 133)) | (1L << (DECIMAL - 133)) | (1L << (TYPE - 133)) | (1L << (ADMIN - 133)) | (1L << (ESCAPE - 133)) | (1L << (EXCLUDE - 133)) | (1L << (PARTITION - 133)) | (1L << (UNKNOWN - 133)) | (1L << (ALWAYS - 133)) | (1L << (CASCADE - 133)) | (1L << (GENERATED - 133)) | (1L << (ISOLATION - 133)) | (1L << (LEVEL - 133)) | (1L << (OPTION - 133)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (PRIVILEGES - 197)) | (1L << (READ - 197)) | (1L << (ROLE - 197)) | (1L << (ROWS - 197)) | (1L << (START - 197)) | (1L << (TRANSACTION - 197)) | (1L << (ACTION - 197)) | (1L << (CACHE - 197)) | (1L << (CHARACTERISTICS - 197)) | (1L << (CLUSTER - 197)) | (1L << (COMMENTS - 197)) | (1L << (CONSTRAINTS - 197)) | (1L << (CYCLE - 197)) | (1L << (DATA - 197)) | (1L << (DATABASE - 197)) | (1L << (DEFAULTS - 197)) | (1L << (DEFERRED - 197)) | (1L << (DEPENDS - 197)) | (1L << (DOMAIN - 197)) | (1L << (EXCLUDING - 197)) | (1L << (EXECUTE - 197)) | (1L << (EXTENDED - 197)) | (1L << (EXTENSION - 197)) | (1L << (EXTERNAL - 197)) | (1L << (EXTRACT - 197)) | (1L << (FILTER - 197)) | (1L << (FIRST - 197)) | (1L << (FOLLOWING - 197)) | (1L << (FORCE - 197)) | (1L << (GLOBAL - 197)) | (1L << (IDENTITY - 197)) | (1L << (IMMEDIATE - 197)) | (1L << (INCLUDING - 197)) | (1L << (INCREMENT - 197)) | (1L << (INDEXES - 197)) | (1L << (INHERIT - 197)) | (1L << (INHERITS - 197)) | (1L << (INCLUDE - 197)) | (1L << (LANGUAGE - 197)) | (1L << (LARGE - 197)) | (1L << (LAST - 197)) | (1L << (LOGGED - 197)) | (1L << (MAIN - 197)) | (1L << (MATCH - 197)) | (1L << (MAXVALUE - 197)) | (1L << (MINVALUE - 197)) | (1L << (NOTHING - 197)) | (1L << (NULLS - 197)) | (1L << (OBJECT - 197)) | (1L << (OIDS - 197)) | (1L << (OVER - 197)) | (1L << (OWNED - 197)) | (1L << (OWNER - 197)) | (1L << (PARTIAL - 197)) | (1L << (PLAIN - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (PRECEDING - 261)) | (1L << (RANGE - 261)) | (1L << (RENAME - 261)) | (1L << (REPLICA - 261)) | (1L << (RESET - 261)) | (1L << (RESTART - 261)) | (1L << (RESTRICT - 261)) | (1L << (ROUTINE - 261)) | (1L << (RULE - 261)) | (1L << (SECURITY - 261)) | (1L << (SEQUENCE - 261)) | (1L << (SESSION - 261)) | (1L << (SHOW - 261)) | (1L << (SIMPLE - 261)) | (1L << (STATISTICS - 261)) | (1L << (STORAGE - 261)) | (1L << (TABLESPACE - 261)) | (1L << (TEMP - 261)) | (1L << (TEMPORARY - 261)) | (1L << (UNBOUNDED - 261)) | (1L << (UNLOGGED - 261)) | (1L << (USAGE - 261)) | (1L << (VALID - 261)) | (1L << (VALIDATE - 261)) | (1L << (WITHIN - 261)) | (1L << (WITHOUT - 261)) | (1L << (ZONE - 261)) | (1L << (OF - 261)) | (1L << (GROUPS - 261)) | (1L << (RECURSIVE - 261)) | (1L << (INT2 - 261)) | (1L << (INT4 - 261)) | (1L << (INT8 - 261)) | (1L << (FLOAT4 - 261)) | (1L << (FLOAT8 - 261)) | (1L << (MACADDR8 - 261)) | (1L << (UUID - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (INT4RANGE - 325)) | (1L << (INT8RANGE - 325)) | (1L << (IDENTIFIER_ - 325)) | (1L << (STRING_ - 325)))) != 0)) {
				{
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(487);
					match(AS);
					}
				}

				setState(490);
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

	public static class MultipleTablesClauseContext extends ParserRuleContext {
		public MultipleTableNamesContext multipleTableNames() {
			return getRuleContext(MultipleTableNamesContext.class,0);
		}
		public TerminalNode FROM() { return getToken(PostgreSQLStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public MultipleTablesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTablesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitMultipleTablesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleTablesClauseContext multipleTablesClause() throws RecognitionException {
		MultipleTablesClauseContext _localctx = new MultipleTablesClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multipleTablesClause);
		try {
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case IF:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case ADMIN:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case INT2:
			case INT4:
			case INT8:
			case FLOAT4:
			case FLOAT8:
			case MACADDR8:
			case UUID:
			case INT4RANGE:
			case INT8RANGE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				multipleTableNames();
				setState(494);
				match(FROM);
				setState(495);
				tableReferences();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				match(FROM);
				setState(498);
				multipleTableNames();
				setState(499);
				match(USING);
				setState(500);
				tableReferences();
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

	public static class MultipleTableNamesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public List<TerminalNode> DOT_ASTERISK_() { return getTokens(PostgreSQLStatementParser.DOT_ASTERISK_); }
		public TerminalNode DOT_ASTERISK_(int i) {
			return getToken(PostgreSQLStatementParser.DOT_ASTERISK_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public MultipleTableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTableNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitMultipleTableNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleTableNamesContext multipleTableNames() throws RecognitionException {
		MultipleTableNamesContext _localctx = new MultipleTableNamesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multipleTableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			tableName();
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_ASTERISK_) {
				{
				setState(505);
				match(DOT_ASTERISK_);
				}
			}

			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(508);
				match(COMMA_);
				setState(509);
				tableName();
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT_ASTERISK_) {
					{
					setState(510);
					match(DOT_ASTERISK_);
					}
				}

				}
				}
				setState(517);
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
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
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
		public List<TerminalNode> UNION() { return getTokens(PostgreSQLStatementParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(PostgreSQLStatementParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(PostgreSQLStatementParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(PostgreSQLStatementParser.ALL, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(PostgreSQLStatementParser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(PostgreSQLStatementParser.DISTINCT, i);
		}
		public UnionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitUnionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionClauseContext unionClause() throws RecognitionException {
		UnionClauseContext _localctx = new UnionClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			selectClause();
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(521);
				match(UNION);
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT || _la==ALL) {
					{
					setState(522);
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

				setState(525);
				selectClause();
				}
				}
				setState(530);
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
		public TerminalNode SELECT() { return getToken(PostgreSQLStatementParser.SELECT, 0); }
		public ProjectionsContext projections() {
			return getRuleContext(ProjectionsContext.class,0);
		}
		public DuplicateSpecificationContext duplicateSpecification() {
			return getRuleContext(DuplicateSpecificationContext.class,0);
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
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(SELECT);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(532);
				duplicateSpecification();
				}
			}

			setState(535);
			projections();
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(536);
				fromClause();
				}
			}

			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(539);
				whereClause();
				}
			}

			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(542);
				groupByClause();
				}
			}

			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(545);
				havingClause();
				}
			}

			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(548);
				orderByClause();
				}
			}

			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT || _la==OFFSET) {
				{
				setState(551);
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

	public static class DuplicateSpecificationContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(PostgreSQLStatementParser.DISTINCT, 0); }
		public DuplicateSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duplicateSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitDuplicateSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DuplicateSpecificationContext duplicateSpecification() throws RecognitionException {
		DuplicateSpecificationContext _localctx = new DuplicateSpecificationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_duplicateSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
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
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public ProjectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projections; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitProjections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionsContext projections() throws RecognitionException {
		ProjectionsContext _localctx = new ProjectionsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_projections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK_:
				{
				setState(556);
				unqualifiedShorthand();
				}
				break;
			case T__0:
			case T__1:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case ADMIN:
			case BINARY:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CURRENT_TIMESTAMP:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case INT2:
			case INT4:
			case INT8:
			case FLOAT4:
			case FLOAT8:
			case MACADDR8:
			case UUID:
			case INT4RANGE:
			case INT8RANGE:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(557);
				projection();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(560);
				match(COMMA_);
				setState(561);
				projection();
				}
				}
				setState(566);
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
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public QualifiedShorthandContext qualifiedShorthand() {
			return getRuleContext(QualifiedShorthandContext.class,0);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_projection);
		int _la;
		try {
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(567);
					columnName();
					}
					break;
				case 2:
					{
					setState(568);
					expr(0);
					}
					break;
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << ALTER) | (1L << DROP) | (1L << TRUNCATE) | (1L << SCHEMA) | (1L << REVOKE) | (1L << ADD) | (1L << SET) | (1L << INDEX))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (KEY - 68)) | (1L << (FUNCTION - 68)) | (1L << (TRIGGER - 68)) | (1L << (PROCEDURE - 68)) | (1L << (AS - 68)) | (1L << (IF - 68)) | (1L << (BEGIN - 68)) | (1L << (COMMIT - 68)) | (1L << (ROLLBACK - 68)) | (1L << (SAVEPOINT - 68)) | (1L << (BOOLEAN - 68)) | (1L << (CHAR - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (INTERVAL - 133)) | (1L << (TIME - 133)) | (1L << (TIMESTAMP - 133)) | (1L << (YEAR - 133)) | (1L << (MONTH - 133)) | (1L << (DAY - 133)) | (1L << (HOUR - 133)) | (1L << (MINUTE - 133)) | (1L << (SECOND - 133)) | (1L << (CURRENT - 133)) | (1L << (ENABLE - 133)) | (1L << (DISABLE - 133)) | (1L << (INSTANCE - 133)) | (1L << (PRESERVE - 133)) | (1L << (DEFINER - 133)) | (1L << (SQL - 133)) | (1L << (CASCADED - 133)) | (1L << (LOCAL - 133)) | (1L << (CLOSE - 133)) | (1L << (OPEN - 133)) | (1L << (NEXT - 133)) | (1L << (NAME - 133)) | (1L << (NAMES - 133)) | (1L << (INTEGER - 133)) | (1L << (REAL - 133)) | (1L << (DECIMAL - 133)) | (1L << (TYPE - 133)) | (1L << (ADMIN - 133)) | (1L << (ESCAPE - 133)) | (1L << (EXCLUDE - 133)) | (1L << (PARTITION - 133)) | (1L << (UNKNOWN - 133)) | (1L << (ALWAYS - 133)) | (1L << (CASCADE - 133)) | (1L << (GENERATED - 133)) | (1L << (ISOLATION - 133)) | (1L << (LEVEL - 133)) | (1L << (OPTION - 133)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (PRIVILEGES - 197)) | (1L << (READ - 197)) | (1L << (ROLE - 197)) | (1L << (ROWS - 197)) | (1L << (START - 197)) | (1L << (TRANSACTION - 197)) | (1L << (ACTION - 197)) | (1L << (CACHE - 197)) | (1L << (CHARACTERISTICS - 197)) | (1L << (CLUSTER - 197)) | (1L << (COMMENTS - 197)) | (1L << (CONSTRAINTS - 197)) | (1L << (CYCLE - 197)) | (1L << (DATA - 197)) | (1L << (DATABASE - 197)) | (1L << (DEFAULTS - 197)) | (1L << (DEFERRED - 197)) | (1L << (DEPENDS - 197)) | (1L << (DOMAIN - 197)) | (1L << (EXCLUDING - 197)) | (1L << (EXECUTE - 197)) | (1L << (EXTENDED - 197)) | (1L << (EXTENSION - 197)) | (1L << (EXTERNAL - 197)) | (1L << (EXTRACT - 197)) | (1L << (FILTER - 197)) | (1L << (FIRST - 197)) | (1L << (FOLLOWING - 197)) | (1L << (FORCE - 197)) | (1L << (GLOBAL - 197)) | (1L << (IDENTITY - 197)) | (1L << (IMMEDIATE - 197)) | (1L << (INCLUDING - 197)) | (1L << (INCREMENT - 197)) | (1L << (INDEXES - 197)) | (1L << (INHERIT - 197)) | (1L << (INHERITS - 197)) | (1L << (INCLUDE - 197)) | (1L << (LANGUAGE - 197)) | (1L << (LARGE - 197)) | (1L << (LAST - 197)) | (1L << (LOGGED - 197)) | (1L << (MAIN - 197)) | (1L << (MATCH - 197)) | (1L << (MAXVALUE - 197)) | (1L << (MINVALUE - 197)) | (1L << (NOTHING - 197)) | (1L << (NULLS - 197)) | (1L << (OBJECT - 197)) | (1L << (OIDS - 197)) | (1L << (OVER - 197)) | (1L << (OWNED - 197)) | (1L << (OWNER - 197)) | (1L << (PARTIAL - 197)) | (1L << (PLAIN - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (PRECEDING - 261)) | (1L << (RANGE - 261)) | (1L << (RENAME - 261)) | (1L << (REPLICA - 261)) | (1L << (RESET - 261)) | (1L << (RESTART - 261)) | (1L << (RESTRICT - 261)) | (1L << (ROUTINE - 261)) | (1L << (RULE - 261)) | (1L << (SECURITY - 261)) | (1L << (SEQUENCE - 261)) | (1L << (SESSION - 261)) | (1L << (SHOW - 261)) | (1L << (SIMPLE - 261)) | (1L << (STATISTICS - 261)) | (1L << (STORAGE - 261)) | (1L << (TABLESPACE - 261)) | (1L << (TEMP - 261)) | (1L << (TEMPORARY - 261)) | (1L << (UNBOUNDED - 261)) | (1L << (UNLOGGED - 261)) | (1L << (USAGE - 261)) | (1L << (VALID - 261)) | (1L << (VALIDATE - 261)) | (1L << (WITHIN - 261)) | (1L << (WITHOUT - 261)) | (1L << (ZONE - 261)) | (1L << (OF - 261)) | (1L << (GROUPS - 261)) | (1L << (RECURSIVE - 261)) | (1L << (INT2 - 261)) | (1L << (INT4 - 261)) | (1L << (INT8 - 261)) | (1L << (FLOAT4 - 261)) | (1L << (FLOAT8 - 261)) | (1L << (MACADDR8 - 261)) | (1L << (UUID - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (INT4RANGE - 325)) | (1L << (INT8RANGE - 325)) | (1L << (IDENTIFIER_ - 325)) | (1L << (STRING_ - 325)))) != 0)) {
					{
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(571);
						match(AS);
						}
					}

					setState(574);
					alias();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
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
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_alias);
		try {
			setState(582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case IF:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case ADMIN:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case INT2:
			case INT4:
			case INT8:
			case FLOAT4:
			case FLOAT8:
			case MACADDR8:
			case UUID:
			case INT4RANGE:
			case INT8RANGE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				identifier();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
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
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public UnqualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedShorthand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitUnqualifiedShorthand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnqualifiedShorthandContext unqualifiedShorthand() throws RecognitionException {
		UnqualifiedShorthandContext _localctx = new UnqualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unqualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
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
		public TerminalNode DOT_ASTERISK_() { return getToken(PostgreSQLStatementParser.DOT_ASTERISK_, 0); }
		public QualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedShorthand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitQualifiedShorthand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedShorthandContext qualifiedShorthand() throws RecognitionException {
		QualifiedShorthandContext _localctx = new QualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_qualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			identifier();
			setState(587);
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
		public TerminalNode FROM() { return getToken(PostgreSQLStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(FROM);
			setState(590);
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
		public List<TableReferenceContext> tableReference() {
			return getRuleContexts(TableReferenceContext.class);
		}
		public TableReferenceContext tableReference(int i) {
			return getRuleContext(TableReferenceContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public TableReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferences; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitTableReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferencesContext tableReferences() throws RecognitionException {
		TableReferencesContext _localctx = new TableReferencesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tableReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			tableReference();
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(593);
				match(COMMA_);
				setState(594);
				tableReference();
				}
				}
				setState(599);
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
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tableReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			tableFactor();
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (NATURAL - 86)) | (1L << (JOIN - 86)) | (1L << (FULL - 86)) | (1L << (INNER - 86)) | (1L << (LEFT - 86)) | (1L << (RIGHT - 86)) | (1L << (CROSS - 86)))) != 0)) {
				{
				{
				setState(601);
				joinedTable();
				}
				}
				setState(606);
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
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TableFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFactor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitTableFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFactorContext tableFactor() throws RecognitionException {
		TableFactorContext _localctx = new TableFactorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tableFactor);
		int _la;
		try {
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				tableName();
				setState(612);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(609);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(608);
						match(AS);
						}
					}

					setState(611);
					alias();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				subquery();
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(615);
					match(AS);
					}
				}

				setState(618);
				alias();
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(619);
					columnNames();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(622);
				match(LP_);
				setState(623);
				tableReferences();
				setState(624);
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
		public TerminalNode JOIN() { return getToken(PostgreSQLStatementParser.JOIN, 0); }
		public TerminalNode NATURAL() { return getToken(PostgreSQLStatementParser.NATURAL, 0); }
		public JoinSpecificationContext joinSpecification() {
			return getRuleContext(JoinSpecificationContext.class,0);
		}
		public TerminalNode INNER() { return getToken(PostgreSQLStatementParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(PostgreSQLStatementParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(PostgreSQLStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(PostgreSQLStatementParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLStatementParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(PostgreSQLStatementParser.OUTER, 0); }
		public JoinedTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinedTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitJoinedTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinedTableContext joinedTable() throws RecognitionException {
		JoinedTableContext _localctx = new JoinedTableContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_joinedTable);
		int _la;
		try {
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL) {
					{
					setState(628);
					match(NATURAL);
					}
				}

				{
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(631);
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

				setState(634);
				match(JOIN);
				}
				setState(636);
				tableFactor();
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(637);
					joinSpecification();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL) {
					{
					setState(640);
					match(NATURAL);
					}
				}

				setState(643);
				_la = _input.LA(1);
				if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (FULL - 88)) | (1L << (LEFT - 88)) | (1L << (RIGHT - 88)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(644);
					match(OUTER);
					}
				}

				setState(647);
				match(JOIN);
				setState(648);
				tableFactor();
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(649);
					joinSpecification();
					}
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

	public static class JoinSpecificationContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public JoinSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitJoinSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinSpecificationContext joinSpecification() throws RecognitionException {
		JoinSpecificationContext _localctx = new JoinSpecificationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_joinSpecification);
		try {
			setState(658);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				match(ON);
				setState(655);
				expr(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				match(USING);
				setState(657);
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
		public TerminalNode WHERE() { return getToken(PostgreSQLStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(WHERE);
			setState(661);
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
		public TerminalNode GROUP() { return getToken(PostgreSQLStatementParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(GROUP);
			setState(664);
			match(BY);
			setState(665);
			orderByItem();
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(666);
				match(COMMA_);
				setState(667);
				orderByItem();
				}
				}
				setState(672);
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
		public TerminalNode HAVING() { return getToken(PostgreSQLStatementParser.HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(HAVING);
			setState(674);
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
		public LimitRowCountSyntaxContext limitRowCountSyntax() {
			return getRuleContext(LimitRowCountSyntaxContext.class,0);
		}
		public LimitOffsetSyntaxContext limitOffsetSyntax() {
			return getRuleContext(LimitOffsetSyntaxContext.class,0);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_limitClause);
		int _la;
		try {
			setState(684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				limitRowCountSyntax();
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET) {
					{
					setState(677);
					limitOffsetSyntax();
					}
				}

				}
				break;
			case OFFSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				limitOffsetSyntax();
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(681);
					limitRowCountSyntax();
					}
				}

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

	public static class LimitRowCountSyntaxContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(PostgreSQLStatementParser.LIMIT, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public LimitRowCountContext limitRowCount() {
			return getRuleContext(LimitRowCountContext.class,0);
		}
		public LimitRowCountSyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitRowCountSyntax; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitLimitRowCountSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitRowCountSyntaxContext limitRowCountSyntax() throws RecognitionException {
		LimitRowCountSyntaxContext _localctx = new LimitRowCountSyntaxContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_limitRowCountSyntax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(LIMIT);
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(687);
				match(ALL);
				}
				break;
			case MINUS_:
			case QUESTION_:
			case NUMBER_:
				{
				setState(688);
				limitRowCount();
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
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitLimitRowCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitRowCountContext limitRowCount() throws RecognitionException {
		LimitRowCountContext _localctx = new LimitRowCountContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_limitRowCount);
		try {
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				numberLiterals();
				}
				break;
			case QUESTION_:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
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

	public static class LimitOffsetSyntaxContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(PostgreSQLStatementParser.OFFSET, 0); }
		public LimitOffsetContext limitOffset() {
			return getRuleContext(LimitOffsetContext.class,0);
		}
		public TerminalNode ROW() { return getToken(PostgreSQLStatementParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(PostgreSQLStatementParser.ROWS, 0); }
		public LimitOffsetSyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitOffsetSyntax; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitLimitOffsetSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitOffsetSyntaxContext limitOffsetSyntax() throws RecognitionException {
		LimitOffsetSyntaxContext _localctx = new LimitOffsetSyntaxContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_limitOffsetSyntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(OFFSET);
			setState(696);
			limitOffset();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(697);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
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
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitLimitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitOffsetContext limitOffset() throws RecognitionException {
		LimitOffsetContext _localctx = new LimitOffsetContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_limitOffset);
		try {
			setState(702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				numberLiterals();
				}
				break;
			case QUESTION_:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
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
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public UnionClauseContext unionClause() {
			return getRuleContext(UnionClauseContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(LP_);
			setState(705);
			unionClause();
			setState(706);
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
		public TerminalNode QUESTION_() { return getToken(PostgreSQLStatementParser.QUESTION_, 0); }
		public LiteralsType_Context literalsType_() {
			return getRuleContext(LiteralsType_Context.class,0);
		}
		public ParameterMarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterMarker; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitParameterMarker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterMarkerContext parameterMarker() throws RecognitionException {
		ParameterMarkerContext _localctx = new ParameterMarkerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parameterMarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(QUESTION_);
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(709);
				literalsType_();
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

	public static class LiteralsContext extends ParserRuleContext {
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
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
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_literals);
		try {
			setState(718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				stringLiterals();
				}
				break;
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				numberLiterals();
				}
				break;
			case HEX_DIGIT_:
				enterOuterAlt(_localctx, 3);
				{
				setState(714);
				hexadecimalLiterals();
				}
				break;
			case BIT_NUM_:
				enterOuterAlt(_localctx, 4);
				{
				setState(715);
				bitValueLiterals();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(716);
				booleanLiterals();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(717);
				nullValueLiterals();
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

	public static class StringLiteralsContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public UnicodeEscapes_Context unicodeEscapes_() {
			return getRuleContext(UnicodeEscapes_Context.class,0);
		}
		public LiteralsType_Context literalsType_() {
			return getRuleContext(LiteralsType_Context.class,0);
		}
		public Uescape_Context uescape_() {
			return getRuleContext(Uescape_Context.class,0);
		}
		public StringLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitStringLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralsContext stringLiterals() throws RecognitionException {
		StringLiteralsContext _localctx = new StringLiteralsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_stringLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(720);
				unicodeEscapes_();
				}
			}

			setState(723);
			match(STRING_);
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(724);
				literalsType_();
				}
				break;
			}
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(727);
				uescape_();
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
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public TerminalNode MINUS_() { return getToken(PostgreSQLStatementParser.MINUS_, 0); }
		public LiteralsType_Context literalsType_() {
			return getRuleContext(LiteralsType_Context.class,0);
		}
		public NumberLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitNumberLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralsContext numberLiterals() throws RecognitionException {
		NumberLiteralsContext _localctx = new NumberLiteralsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_numberLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS_) {
				{
				setState(730);
				match(MINUS_);
				}
			}

			setState(733);
			match(NUMBER_);
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(734);
				literalsType_();
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

	public static class HexadecimalLiteralsContext extends ParserRuleContext {
		public TerminalNode HEX_DIGIT_() { return getToken(PostgreSQLStatementParser.HEX_DIGIT_, 0); }
		public HexadecimalLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitHexadecimalLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexadecimalLiteralsContext hexadecimalLiterals() throws RecognitionException {
		HexadecimalLiteralsContext _localctx = new HexadecimalLiteralsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_hexadecimalLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(HEX_DIGIT_);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode BIT_NUM_() { return getToken(PostgreSQLStatementParser.BIT_NUM_, 0); }
		public BitValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitValueLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitBitValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitValueLiteralsContext bitValueLiterals() throws RecognitionException {
		BitValueLiteralsContext _localctx = new BitValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_bitValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(BIT_NUM_);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode TRUE() { return getToken(PostgreSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PostgreSQLStatementParser.FALSE, 0); }
		public BooleanLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitBooleanLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralsContext booleanLiterals() throws RecognitionException {
		BooleanLiteralsContext _localctx = new BooleanLiteralsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_booleanLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
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
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public NullValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullValueLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitNullValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullValueLiteralsContext nullValueLiterals() throws RecognitionException {
		NullValueLiteralsContext _localctx = new NullValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_nullValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
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

	public static class LiteralsType_Context extends ParserRuleContext {
		public List<TerminalNode> COLON_() { return getTokens(PostgreSQLStatementParser.COLON_); }
		public TerminalNode COLON_(int i) {
			return getToken(PostgreSQLStatementParser.COLON_, i);
		}
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public LiteralsType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalsType_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitLiteralsType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralsType_Context literalsType_() throws RecognitionException {
		LiteralsType_Context _localctx = new LiteralsType_Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_literalsType_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(COLON_);
			setState(746);
			match(COLON_);
			setState(747);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public UnicodeEscapes_Context unicodeEscapes_() {
			return getRuleContext(UnicodeEscapes_Context.class,0);
		}
		public Uescape_Context uescape_() {
			return getRuleContext(Uescape_Context.class,0);
		}
		public UnreservedWordContext unreservedWord() {
			return getRuleContext(UnreservedWordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_identifier);
		int _la;
		try {
			setState(757);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==T__1) {
					{
					setState(749);
					unicodeEscapes_();
					}
				}

				setState(752);
				match(IDENTIFIER_);
				setState(754);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(753);
					uescape_();
					}
					break;
				}
				}
				break;
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case IF:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case ADMIN:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case INT2:
			case INT4:
			case INT8:
			case FLOAT4:
			case FLOAT8:
			case MACADDR8:
			case UUID:
			case INT4RANGE:
			case INT8RANGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
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

	public static class UnicodeEscapes_Context extends ParserRuleContext {
		public TerminalNode AMPERSAND_() { return getToken(PostgreSQLStatementParser.AMPERSAND_, 0); }
		public UnicodeEscapes_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unicodeEscapes_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitUnicodeEscapes_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnicodeEscapes_Context unicodeEscapes_() throws RecognitionException {
		UnicodeEscapes_Context _localctx = new UnicodeEscapes_Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_unicodeEscapes_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(760);
			match(AMPERSAND_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Uescape_Context extends ParserRuleContext {
		public TerminalNode UESCAPE() { return getToken(PostgreSQLStatementParser.UESCAPE, 0); }
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public Uescape_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uescape_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitUescape_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Uescape_Context uescape_() throws RecognitionException {
		Uescape_Context _localctx = new Uescape_Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_uescape_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(UESCAPE);
			setState(763);
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

	public static class UnreservedWordContext extends ParserRuleContext {
		public TerminalNode ADMIN() { return getToken(PostgreSQLStatementParser.ADMIN, 0); }
		public TerminalNode ESCAPE() { return getToken(PostgreSQLStatementParser.ESCAPE, 0); }
		public TerminalNode EXCLUDE() { return getToken(PostgreSQLStatementParser.EXCLUDE, 0); }
		public TerminalNode KEY() { return getToken(PostgreSQLStatementParser.KEY, 0); }
		public TerminalNode PARTITION() { return getToken(PostgreSQLStatementParser.PARTITION, 0); }
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode UNKNOWN() { return getToken(PostgreSQLStatementParser.UNKNOWN, 0); }
		public TerminalNode ADD() { return getToken(PostgreSQLStatementParser.ADD, 0); }
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public TerminalNode COMMIT() { return getToken(PostgreSQLStatementParser.COMMIT, 0); }
		public TerminalNode CURRENT() { return getToken(PostgreSQLStatementParser.CURRENT, 0); }
		public TerminalNode DAY() { return getToken(PostgreSQLStatementParser.DAY, 0); }
		public TerminalNode DELETE() { return getToken(PostgreSQLStatementParser.DELETE, 0); }
		public TerminalNode DISABLE() { return getToken(PostgreSQLStatementParser.DISABLE, 0); }
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode ENABLE() { return getToken(PostgreSQLStatementParser.ENABLE, 0); }
		public TerminalNode FUNCTION() { return getToken(PostgreSQLStatementParser.FUNCTION, 0); }
		public TerminalNode GENERATED() { return getToken(PostgreSQLStatementParser.GENERATED, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public TerminalNode ISOLATION() { return getToken(PostgreSQLStatementParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(PostgreSQLStatementParser.LEVEL, 0); }
		public TerminalNode OPTION() { return getToken(PostgreSQLStatementParser.OPTION, 0); }
		public TerminalNode PRIVILEGES() { return getToken(PostgreSQLStatementParser.PRIVILEGES, 0); }
		public TerminalNode READ() { return getToken(PostgreSQLStatementParser.READ, 0); }
		public TerminalNode REVOKE() { return getToken(PostgreSQLStatementParser.REVOKE, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public TerminalNode ROLLBACK() { return getToken(PostgreSQLStatementParser.ROLLBACK, 0); }
		public TerminalNode ROWS() { return getToken(PostgreSQLStatementParser.ROWS, 0); }
		public TerminalNode START() { return getToken(PostgreSQLStatementParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLStatementParser.TRANSACTION, 0); }
		public TerminalNode TRUNCATE() { return getToken(PostgreSQLStatementParser.TRUNCATE, 0); }
		public TerminalNode YEAR() { return getToken(PostgreSQLStatementParser.YEAR, 0); }
		public TerminalNode ACTION() { return getToken(PostgreSQLStatementParser.ACTION, 0); }
		public TerminalNode BEGIN() { return getToken(PostgreSQLStatementParser.BEGIN, 0); }
		public TerminalNode CACHE() { return getToken(PostgreSQLStatementParser.CACHE, 0); }
		public TerminalNode CHARACTERISTICS() { return getToken(PostgreSQLStatementParser.CHARACTERISTICS, 0); }
		public TerminalNode CLUSTER() { return getToken(PostgreSQLStatementParser.CLUSTER, 0); }
		public TerminalNode COMMENTS() { return getToken(PostgreSQLStatementParser.COMMENTS, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(PostgreSQLStatementParser.CONSTRAINTS, 0); }
		public TerminalNode CYCLE() { return getToken(PostgreSQLStatementParser.CYCLE, 0); }
		public TerminalNode DATA() { return getToken(PostgreSQLStatementParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(PostgreSQLStatementParser.DATABASE, 0); }
		public TerminalNode DEFAULTS() { return getToken(PostgreSQLStatementParser.DEFAULTS, 0); }
		public TerminalNode DEFERRED() { return getToken(PostgreSQLStatementParser.DEFERRED, 0); }
		public TerminalNode DEPENDS() { return getToken(PostgreSQLStatementParser.DEPENDS, 0); }
		public TerminalNode DOMAIN() { return getToken(PostgreSQLStatementParser.DOMAIN, 0); }
		public TerminalNode EXCLUDING() { return getToken(PostgreSQLStatementParser.EXCLUDING, 0); }
		public TerminalNode EXECUTE() { return getToken(PostgreSQLStatementParser.EXECUTE, 0); }
		public TerminalNode EXTENDED() { return getToken(PostgreSQLStatementParser.EXTENDED, 0); }
		public TerminalNode EXTENSION() { return getToken(PostgreSQLStatementParser.EXTENSION, 0); }
		public TerminalNode EXTERNAL() { return getToken(PostgreSQLStatementParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(PostgreSQLStatementParser.EXTRACT, 0); }
		public TerminalNode FILTER() { return getToken(PostgreSQLStatementParser.FILTER, 0); }
		public TerminalNode FIRST() { return getToken(PostgreSQLStatementParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(PostgreSQLStatementParser.FOLLOWING, 0); }
		public TerminalNode FORCE() { return getToken(PostgreSQLStatementParser.FORCE, 0); }
		public TerminalNode GLOBAL() { return getToken(PostgreSQLStatementParser.GLOBAL, 0); }
		public TerminalNode HOUR() { return getToken(PostgreSQLStatementParser.HOUR, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode IMMEDIATE() { return getToken(PostgreSQLStatementParser.IMMEDIATE, 0); }
		public TerminalNode INCLUDING() { return getToken(PostgreSQLStatementParser.INCLUDING, 0); }
		public TerminalNode INCREMENT() { return getToken(PostgreSQLStatementParser.INCREMENT, 0); }
		public TerminalNode INDEXES() { return getToken(PostgreSQLStatementParser.INDEXES, 0); }
		public TerminalNode INHERIT() { return getToken(PostgreSQLStatementParser.INHERIT, 0); }
		public TerminalNode INHERITS() { return getToken(PostgreSQLStatementParser.INHERITS, 0); }
		public TerminalNode INCLUDE() { return getToken(PostgreSQLStatementParser.INCLUDE, 0); }
		public TerminalNode INSERT() { return getToken(PostgreSQLStatementParser.INSERT, 0); }
		public TerminalNode LANGUAGE() { return getToken(PostgreSQLStatementParser.LANGUAGE, 0); }
		public TerminalNode LARGE() { return getToken(PostgreSQLStatementParser.LARGE, 0); }
		public TerminalNode LAST() { return getToken(PostgreSQLStatementParser.LAST, 0); }
		public TerminalNode LOCAL() { return getToken(PostgreSQLStatementParser.LOCAL, 0); }
		public TerminalNode LOGGED() { return getToken(PostgreSQLStatementParser.LOGGED, 0); }
		public TerminalNode MAIN() { return getToken(PostgreSQLStatementParser.MAIN, 0); }
		public TerminalNode MATCH() { return getToken(PostgreSQLStatementParser.MATCH, 0); }
		public TerminalNode MAXVALUE() { return getToken(PostgreSQLStatementParser.MAXVALUE, 0); }
		public TerminalNode MINVALUE() { return getToken(PostgreSQLStatementParser.MINVALUE, 0); }
		public TerminalNode MINUTE() { return getToken(PostgreSQLStatementParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(PostgreSQLStatementParser.MONTH, 0); }
		public TerminalNode NOTHING() { return getToken(PostgreSQLStatementParser.NOTHING, 0); }
		public TerminalNode NULLS() { return getToken(PostgreSQLStatementParser.NULLS, 0); }
		public TerminalNode OBJECT() { return getToken(PostgreSQLStatementParser.OBJECT, 0); }
		public TerminalNode OF() { return getToken(PostgreSQLStatementParser.OF, 0); }
		public TerminalNode OIDS() { return getToken(PostgreSQLStatementParser.OIDS, 0); }
		public TerminalNode OVER() { return getToken(PostgreSQLStatementParser.OVER, 0); }
		public TerminalNode OWNED() { return getToken(PostgreSQLStatementParser.OWNED, 0); }
		public TerminalNode OWNER() { return getToken(PostgreSQLStatementParser.OWNER, 0); }
		public TerminalNode PARTIAL() { return getToken(PostgreSQLStatementParser.PARTIAL, 0); }
		public TerminalNode PLAIN() { return getToken(PostgreSQLStatementParser.PLAIN, 0); }
		public TerminalNode PRECEDING() { return getToken(PostgreSQLStatementParser.PRECEDING, 0); }
		public TerminalNode PROCEDURE() { return getToken(PostgreSQLStatementParser.PROCEDURE, 0); }
		public TerminalNode RANGE() { return getToken(PostgreSQLStatementParser.RANGE, 0); }
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public TerminalNode REPLICA() { return getToken(PostgreSQLStatementParser.REPLICA, 0); }
		public TerminalNode RESET() { return getToken(PostgreSQLStatementParser.RESET, 0); }
		public TerminalNode RESTART() { return getToken(PostgreSQLStatementParser.RESTART, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode ROUTINE() { return getToken(PostgreSQLStatementParser.ROUTINE, 0); }
		public TerminalNode RULE() { return getToken(PostgreSQLStatementParser.RULE, 0); }
		public TerminalNode SAVEPOINT() { return getToken(PostgreSQLStatementParser.SAVEPOINT, 0); }
		public TerminalNode SCHEMA() { return getToken(PostgreSQLStatementParser.SCHEMA, 0); }
		public TerminalNode SECOND() { return getToken(PostgreSQLStatementParser.SECOND, 0); }
		public TerminalNode SECURITY() { return getToken(PostgreSQLStatementParser.SECURITY, 0); }
		public TerminalNode SEQUENCE() { return getToken(PostgreSQLStatementParser.SEQUENCE, 0); }
		public TerminalNode SESSION() { return getToken(PostgreSQLStatementParser.SESSION, 0); }
		public TerminalNode SHOW() { return getToken(PostgreSQLStatementParser.SHOW, 0); }
		public TerminalNode SIMPLE() { return getToken(PostgreSQLStatementParser.SIMPLE, 0); }
		public TerminalNode STATISTICS() { return getToken(PostgreSQLStatementParser.STATISTICS, 0); }
		public TerminalNode STORAGE() { return getToken(PostgreSQLStatementParser.STORAGE, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public TerminalNode TEMP() { return getToken(PostgreSQLStatementParser.TEMP, 0); }
		public TerminalNode TEMPORARY() { return getToken(PostgreSQLStatementParser.TEMPORARY, 0); }
		public TerminalNode TRIGGER() { return getToken(PostgreSQLStatementParser.TRIGGER, 0); }
		public TerminalNode TYPE() { return getToken(PostgreSQLStatementParser.TYPE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(PostgreSQLStatementParser.UNBOUNDED, 0); }
		public TerminalNode UNLOGGED() { return getToken(PostgreSQLStatementParser.UNLOGGED, 0); }
		public TerminalNode UPDATE() { return getToken(PostgreSQLStatementParser.UPDATE, 0); }
		public TerminalNode USAGE() { return getToken(PostgreSQLStatementParser.USAGE, 0); }
		public TerminalNode VALID() { return getToken(PostgreSQLStatementParser.VALID, 0); }
		public TerminalNode VALIDATE() { return getToken(PostgreSQLStatementParser.VALIDATE, 0); }
		public TerminalNode WITHIN() { return getToken(PostgreSQLStatementParser.WITHIN, 0); }
		public TerminalNode WITHOUT() { return getToken(PostgreSQLStatementParser.WITHOUT, 0); }
		public TerminalNode ZONE() { return getToken(PostgreSQLStatementParser.ZONE, 0); }
		public TerminalNode GROUPS() { return getToken(PostgreSQLStatementParser.GROUPS, 0); }
		public TerminalNode RECURSIVE() { return getToken(PostgreSQLStatementParser.RECURSIVE, 0); }
		public TerminalNode INSTANCE() { return getToken(PostgreSQLStatementParser.INSTANCE, 0); }
		public TerminalNode DEFINER() { return getToken(PostgreSQLStatementParser.DEFINER, 0); }
		public TerminalNode PRESERVE() { return getToken(PostgreSQLStatementParser.PRESERVE, 0); }
		public TerminalNode SQL() { return getToken(PostgreSQLStatementParser.SQL, 0); }
		public TerminalNode CASCADED() { return getToken(PostgreSQLStatementParser.CASCADED, 0); }
		public TerminalNode CLOSE() { return getToken(PostgreSQLStatementParser.CLOSE, 0); }
		public TerminalNode OPEN() { return getToken(PostgreSQLStatementParser.OPEN, 0); }
		public TerminalNode NEXT() { return getToken(PostgreSQLStatementParser.NEXT, 0); }
		public TerminalNode NAME() { return getToken(PostgreSQLStatementParser.NAME, 0); }
		public TerminalNode NAMES() { return getToken(PostgreSQLStatementParser.NAMES, 0); }
		public TerminalNode INTEGER() { return getToken(PostgreSQLStatementParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(PostgreSQLStatementParser.REAL, 0); }
		public TerminalNode DECIMAL() { return getToken(PostgreSQLStatementParser.DECIMAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(PostgreSQLStatementParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(PostgreSQLStatementParser.CHAR, 0); }
		public TerminalNode TIME() { return getToken(PostgreSQLStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(PostgreSQLStatementParser.TIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(PostgreSQLStatementParser.INTERVAL, 0); }
		public TerminalNode INT2() { return getToken(PostgreSQLStatementParser.INT2, 0); }
		public TerminalNode INT4() { return getToken(PostgreSQLStatementParser.INT4, 0); }
		public TerminalNode INT8() { return getToken(PostgreSQLStatementParser.INT8, 0); }
		public TerminalNode FLOAT4() { return getToken(PostgreSQLStatementParser.FLOAT4, 0); }
		public TerminalNode FLOAT8() { return getToken(PostgreSQLStatementParser.FLOAT8, 0); }
		public TerminalNode MACADDR8() { return getToken(PostgreSQLStatementParser.MACADDR8, 0); }
		public TerminalNode INT4RANGE() { return getToken(PostgreSQLStatementParser.INT4RANGE, 0); }
		public TerminalNode INT8RANGE() { return getToken(PostgreSQLStatementParser.INT8RANGE, 0); }
		public TerminalNode UUID() { return getToken(PostgreSQLStatementParser.UUID, 0); }
		public UnreservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreservedWord; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitUnreservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnreservedWordContext unreservedWord() throws RecognitionException {
		UnreservedWordContext _localctx = new UnreservedWordContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_unreservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			_la = _input.LA(1);
			if ( !(((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (INSERT - 49)) | (1L << (UPDATE - 49)) | (1L << (DELETE - 49)) | (1L << (ALTER - 49)) | (1L << (DROP - 49)) | (1L << (TRUNCATE - 49)) | (1L << (SCHEMA - 49)) | (1L << (REVOKE - 49)) | (1L << (ADD - 49)) | (1L << (SET - 49)) | (1L << (INDEX - 49)) | (1L << (KEY - 49)) | (1L << (FUNCTION - 49)) | (1L << (TRIGGER - 49)) | (1L << (PROCEDURE - 49)) | (1L << (IF - 49)))) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (BEGIN - 124)) | (1L << (COMMIT - 124)) | (1L << (ROLLBACK - 124)) | (1L << (SAVEPOINT - 124)) | (1L << (BOOLEAN - 124)) | (1L << (CHAR - 124)) | (1L << (INTERVAL - 124)) | (1L << (TIME - 124)) | (1L << (TIMESTAMP - 124)) | (1L << (YEAR - 124)) | (1L << (MONTH - 124)) | (1L << (DAY - 124)) | (1L << (HOUR - 124)) | (1L << (MINUTE - 124)) | (1L << (SECOND - 124)) | (1L << (CURRENT - 124)) | (1L << (ENABLE - 124)) | (1L << (DISABLE - 124)) | (1L << (INSTANCE - 124)) | (1L << (PRESERVE - 124)) | (1L << (DEFINER - 124)) | (1L << (SQL - 124)) | (1L << (CASCADED - 124)) | (1L << (LOCAL - 124)) | (1L << (CLOSE - 124)) | (1L << (OPEN - 124)) | (1L << (NEXT - 124)) | (1L << (NAME - 124)) | (1L << (NAMES - 124)) | (1L << (INTEGER - 124)) | (1L << (REAL - 124)) | (1L << (DECIMAL - 124)) | (1L << (TYPE - 124)) | (1L << (ADMIN - 124)) | (1L << (ESCAPE - 124)) | (1L << (EXCLUDE - 124)) | (1L << (PARTITION - 124)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (UNKNOWN - 188)) | (1L << (ALWAYS - 188)) | (1L << (CASCADE - 188)) | (1L << (GENERATED - 188)) | (1L << (ISOLATION - 188)) | (1L << (LEVEL - 188)) | (1L << (OPTION - 188)) | (1L << (PRIVILEGES - 188)) | (1L << (READ - 188)) | (1L << (ROLE - 188)) | (1L << (ROWS - 188)) | (1L << (START - 188)) | (1L << (TRANSACTION - 188)) | (1L << (ACTION - 188)) | (1L << (CACHE - 188)) | (1L << (CHARACTERISTICS - 188)) | (1L << (CLUSTER - 188)) | (1L << (COMMENTS - 188)) | (1L << (CONSTRAINTS - 188)) | (1L << (CYCLE - 188)) | (1L << (DATA - 188)) | (1L << (DATABASE - 188)) | (1L << (DEFAULTS - 188)) | (1L << (DEFERRED - 188)) | (1L << (DEPENDS - 188)) | (1L << (DOMAIN - 188)) | (1L << (EXCLUDING - 188)) | (1L << (EXECUTE - 188)) | (1L << (EXTENDED - 188)) | (1L << (EXTENSION - 188)) | (1L << (EXTERNAL - 188)) | (1L << (EXTRACT - 188)) | (1L << (FILTER - 188)) | (1L << (FIRST - 188)) | (1L << (FOLLOWING - 188)) | (1L << (FORCE - 188)) | (1L << (GLOBAL - 188)) | (1L << (IDENTITY - 188)) | (1L << (IMMEDIATE - 188)) | (1L << (INCLUDING - 188)) | (1L << (INCREMENT - 188)) | (1L << (INDEXES - 188)) | (1L << (INHERIT - 188)) | (1L << (INHERITS - 188)) | (1L << (INCLUDE - 188)) | (1L << (LANGUAGE - 188)) | (1L << (LARGE - 188)) | (1L << (LAST - 188)) | (1L << (LOGGED - 188)) | (1L << (MAIN - 188)) | (1L << (MATCH - 188)) | (1L << (MAXVALUE - 188)) | (1L << (MINVALUE - 188)) | (1L << (NOTHING - 188)))) != 0) || ((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & ((1L << (NULLS - 252)) | (1L << (OBJECT - 252)) | (1L << (OIDS - 252)) | (1L << (OVER - 252)) | (1L << (OWNED - 252)) | (1L << (OWNER - 252)) | (1L << (PARTIAL - 252)) | (1L << (PLAIN - 252)) | (1L << (PRECEDING - 252)) | (1L << (RANGE - 252)) | (1L << (RENAME - 252)) | (1L << (REPLICA - 252)) | (1L << (RESET - 252)) | (1L << (RESTART - 252)) | (1L << (RESTRICT - 252)) | (1L << (ROUTINE - 252)) | (1L << (RULE - 252)) | (1L << (SECURITY - 252)) | (1L << (SEQUENCE - 252)) | (1L << (SESSION - 252)) | (1L << (SHOW - 252)) | (1L << (SIMPLE - 252)) | (1L << (STATISTICS - 252)) | (1L << (STORAGE - 252)) | (1L << (TABLESPACE - 252)) | (1L << (TEMP - 252)) | (1L << (TEMPORARY - 252)) | (1L << (UNBOUNDED - 252)) | (1L << (UNLOGGED - 252)) | (1L << (USAGE - 252)) | (1L << (VALID - 252)) | (1L << (VALIDATE - 252)) | (1L << (WITHIN - 252)) | (1L << (WITHOUT - 252)) | (1L << (ZONE - 252)) | (1L << (OF - 252)) | (1L << (GROUPS - 252)) | (1L << (RECURSIVE - 252)) | (1L << (INT2 - 252)) | (1L << (INT4 - 252)) | (1L << (INT8 - 252)) | (1L << (FLOAT4 - 252)) | (1L << (FLOAT8 - 252)))) != 0) || ((((_la - 317)) & ~0x3f) == 0 && ((1L << (_la - 317)) & ((1L << (MACADDR8 - 317)) | (1L << (UUID - 317)) | (1L << (INT4RANGE - 317)) | (1L << (INT8RANGE - 317)))) != 0)) ) {
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
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
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
		public TerminalNode DOT_() { return getToken(PostgreSQLStatementParser.DOT_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(769);
				owner();
				setState(770);
				match(DOT_);
				}
				break;
			}
			setState(774);
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
		public TerminalNode DOT_() { return getToken(PostgreSQLStatementParser.DOT_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(776);
				owner();
				setState(777);
				match(DOT_);
				}
				break;
			}
			setState(781);
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
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitOwner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnerContext owner() throws RecognitionException {
		OwnerContext _localctx = new OwnerContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_owner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
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
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
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

	public static class TableNamesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitTableNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNamesContext tableNames() throws RecognitionException {
		TableNamesContext _localctx = new TableNamesContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_tableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(787);
				match(LP_);
				}
			}

			setState(790);
			tableName();
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(791);
				match(COMMA_);
				setState(792);
				tableName();
				}
				}
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(798);
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

	public static class ColumnNamesContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitColumnNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(LP_);
			setState(802);
			columnName();
			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(803);
				match(COMMA_);
				setState(804);
				columnName();
				}
				}
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(810);
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

	public static class CollationNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitCollationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_collationName);
		try {
			setState(814);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				match(STRING_);
				}
				break;
			case T__0:
			case T__1:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case IF:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case ADMIN:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case INT2:
			case INT4:
			case INT8:
			case FLOAT4:
			case FLOAT8:
			case MACADDR8:
			case UUID:
			case INT4RANGE:
			case INT8RANGE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(813);
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

	public static class IndexNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitIndexName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
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

	public static class PrimaryKeyContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(PostgreSQLStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(PostgreSQLStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(818);
				match(PRIMARY);
				}
			}

			setState(821);
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
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
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
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(824);
				notOperator_();
				setState(825);
				expr(3);
				}
				break;
			case 2:
				{
				setState(827);
				match(LP_);
				setState(828);
				expr(0);
				setState(829);
				match(RP_);
				}
				break;
			case 3:
				{
				setState(831);
				booleanPrimary(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(840);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(834);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(835);
					logicalOperator();
					setState(836);
					expr(5);
					}
					} 
				}
				setState(842);
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

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(PostgreSQLStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(PostgreSQLStatementParser.OR_, 0); }
		public TerminalNode AND() { return getToken(PostgreSQLStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(PostgreSQLStatementParser.AND_, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			_la = _input.LA(1);
			if ( !(_la==AND_ || _la==OR_ || _la==AND || _la==OR) ) {
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
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(PostgreSQLStatementParser.NOT_, 0); }
		public NotOperator_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOperator_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitNotOperator_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotOperator_Context notOperator_() throws RecognitionException {
		NotOperator_Context _localctx = new NotOperator_Context(_ctx, getState());
		enterRule(_localctx, 128, RULE_notOperator_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
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
		public TerminalNode IS() { return getToken(PostgreSQLStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(PostgreSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PostgreSQLStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(PostgreSQLStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(PostgreSQLStatementParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(PostgreSQLStatementParser.ANY, 0); }
		public BooleanPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrimary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitBooleanPrimary(this);
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
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(848);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(870);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(868);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(850);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(851);
						match(IS);
						setState(853);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(852);
							match(NOT);
							}
						}

						setState(855);
						_la = _input.LA(1);
						if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (NULL - 107)) | (1L << (TRUE - 107)) | (1L << (FALSE - 107)))) != 0) || _la==UNKNOWN) ) {
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
						setState(856);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(857);
						match(SAFE_EQ_);
						setState(858);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(859);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(860);
						comparisonOperator();
						setState(861);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(863);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(864);
						comparisonOperator();
						setState(865);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(866);
						subquery();
						}
						break;
					}
					} 
				}
				setState(872);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(PostgreSQLStatementParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(PostgreSQLStatementParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(PostgreSQLStatementParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(PostgreSQLStatementParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(PostgreSQLStatementParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
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
		public TerminalNode IN() { return getToken(PostgreSQLStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(PostgreSQLStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(PostgreSQLStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(PostgreSQLStatementParser.LIKE, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(PostgreSQLStatementParser.ESCAPE, 0); }
		public TerminalNode TILDE_TILDE_() { return getToken(PostgreSQLStatementParser.TILDE_TILDE_, 0); }
		public TerminalNode NOT_TILDE_TILDE_() { return getToken(PostgreSQLStatementParser.NOT_TILDE_TILDE_, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_predicate);
		int _la;
		try {
			setState(925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(875);
				bitExpr(0);
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(876);
					match(NOT);
					}
				}

				setState(879);
				match(IN);
				setState(880);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(882);
				bitExpr(0);
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(883);
					match(NOT);
					}
				}

				setState(886);
				match(IN);
				setState(887);
				match(LP_);
				setState(888);
				expr(0);
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(889);
					match(COMMA_);
					setState(890);
					expr(0);
					}
					}
					setState(895);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(896);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(898);
				bitExpr(0);
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(899);
					match(NOT);
					}
				}

				setState(902);
				match(BETWEEN);
				setState(903);
				bitExpr(0);
				setState(904);
				match(AND);
				setState(905);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(907);
				bitExpr(0);
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(908);
					match(NOT);
					}
				}

				setState(911);
				match(LIKE);
				setState(912);
				simpleExpr(0);
				setState(915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(913);
					match(ESCAPE);
					setState(914);
					simpleExpr(0);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(917);
				bitExpr(0);
				setState(918);
				_la = _input.LA(1);
				if ( !(_la==TILDE_TILDE_ || _la==NOT_TILDE_TILDE_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(919);
				simpleExpr(0);
				setState(922);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(920);
					match(ESCAPE);
					setState(921);
					simpleExpr(0);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(924);
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
		public TerminalNode VERTICAL_BAR_() { return getToken(PostgreSQLStatementParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(PostgreSQLStatementParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(PostgreSQLStatementParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(PostgreSQLStatementParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(PostgreSQLStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(PostgreSQLStatementParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(PostgreSQLStatementParser.SLASH_, 0); }
		public TerminalNode MOD_() { return getToken(PostgreSQLStatementParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(PostgreSQLStatementParser.CARET_, 0); }
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitBitExpr(this);
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
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(928);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(962);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(960);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(930);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(931);
						match(VERTICAL_BAR_);
						setState(932);
						bitExpr(12);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(933);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(934);
						match(AMPERSAND_);
						setState(935);
						bitExpr(11);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(936);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(937);
						match(SIGNED_LEFT_SHIFT_);
						setState(938);
						bitExpr(10);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(939);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(940);
						match(SIGNED_RIGHT_SHIFT_);
						setState(941);
						bitExpr(9);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(942);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(943);
						match(PLUS_);
						setState(944);
						bitExpr(8);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(945);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(946);
						match(MINUS_);
						setState(947);
						bitExpr(7);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(948);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(949);
						match(ASTERISK_);
						setState(950);
						bitExpr(6);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(951);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(952);
						match(SLASH_);
						setState(953);
						bitExpr(5);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(954);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(955);
						match(MOD_);
						setState(956);
						bitExpr(4);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(957);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(958);
						match(CARET_);
						setState(959);
						bitExpr(3);
						}
						break;
					}
					} 
				}
				setState(964);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode PLUS_() { return getToken(PostgreSQLStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(PostgreSQLStatementParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(PostgreSQLStatementParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(PostgreSQLStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(PostgreSQLStatementParser.BINARY, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TerminalNode ROW() { return getToken(PostgreSQLStatementParser.ROW, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TerminalNode LBE_() { return getToken(PostgreSQLStatementParser.LBE_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBE_() { return getToken(PostgreSQLStatementParser.RBE_, 0); }
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public TerminalNode CURRENT_USER() { return getToken(PostgreSQLStatementParser.CURRENT_USER, 0); }
		public TerminalNode OR_() { return getToken(PostgreSQLStatementParser.OR_, 0); }
		public TerminalNode COLLATE() { return getToken(PostgreSQLStatementParser.COLLATE, 0); }
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitSimpleExpr(this);
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
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_simpleExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(966);
				functionCall();
				}
				break;
			case 2:
				{
				setState(967);
				parameterMarker();
				}
				break;
			case 3:
				{
				setState(968);
				literals();
				}
				break;
			case 4:
				{
				setState(969);
				columnName();
				}
				break;
			case 5:
				{
				setState(970);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_))) != 0) || _la==BINARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(971);
				simpleExpr(6);
				}
				break;
			case 6:
				{
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(972);
					match(ROW);
					}
				}

				setState(975);
				match(LP_);
				setState(976);
				expr(0);
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(977);
					match(COMMA_);
					setState(978);
					expr(0);
					}
					}
					setState(983);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(984);
				match(RP_);
				}
				break;
			case 7:
				{
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS) {
					{
					setState(986);
					match(EXISTS);
					}
				}

				setState(989);
				subquery();
				}
				break;
			case 8:
				{
				setState(990);
				match(LBE_);
				setState(991);
				identifier();
				setState(992);
				expr(0);
				setState(993);
				match(RBE_);
				}
				break;
			case 9:
				{
				setState(995);
				caseExpression();
				}
				break;
			case 10:
				{
				setState(996);
				match(CURRENT_USER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1010);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1008);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(999);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1000);
						match(OR_);
						setState(1001);
						simpleExpr(8);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1002);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1003);
						match(COLLATE);
						setState(1006);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case STRING_:
							{
							setState(1004);
							match(STRING_);
							}
							break;
						case T__0:
						case T__1:
						case INSERT:
						case UPDATE:
						case DELETE:
						case ALTER:
						case DROP:
						case TRUNCATE:
						case SCHEMA:
						case REVOKE:
						case ADD:
						case SET:
						case INDEX:
						case KEY:
						case FUNCTION:
						case TRIGGER:
						case PROCEDURE:
						case IF:
						case BEGIN:
						case COMMIT:
						case ROLLBACK:
						case SAVEPOINT:
						case BOOLEAN:
						case CHAR:
						case INTERVAL:
						case TIME:
						case TIMESTAMP:
						case YEAR:
						case MONTH:
						case DAY:
						case HOUR:
						case MINUTE:
						case SECOND:
						case CURRENT:
						case ENABLE:
						case DISABLE:
						case INSTANCE:
						case PRESERVE:
						case DEFINER:
						case SQL:
						case CASCADED:
						case LOCAL:
						case CLOSE:
						case OPEN:
						case NEXT:
						case NAME:
						case NAMES:
						case INTEGER:
						case REAL:
						case DECIMAL:
						case TYPE:
						case ADMIN:
						case ESCAPE:
						case EXCLUDE:
						case PARTITION:
						case UNKNOWN:
						case ALWAYS:
						case CASCADE:
						case GENERATED:
						case ISOLATION:
						case LEVEL:
						case OPTION:
						case PRIVILEGES:
						case READ:
						case ROLE:
						case ROWS:
						case START:
						case TRANSACTION:
						case ACTION:
						case CACHE:
						case CHARACTERISTICS:
						case CLUSTER:
						case COMMENTS:
						case CONSTRAINTS:
						case CYCLE:
						case DATA:
						case DATABASE:
						case DEFAULTS:
						case DEFERRED:
						case DEPENDS:
						case DOMAIN:
						case EXCLUDING:
						case EXECUTE:
						case EXTENDED:
						case EXTENSION:
						case EXTERNAL:
						case EXTRACT:
						case FILTER:
						case FIRST:
						case FOLLOWING:
						case FORCE:
						case GLOBAL:
						case IDENTITY:
						case IMMEDIATE:
						case INCLUDING:
						case INCREMENT:
						case INDEXES:
						case INHERIT:
						case INHERITS:
						case INCLUDE:
						case LANGUAGE:
						case LARGE:
						case LAST:
						case LOGGED:
						case MAIN:
						case MATCH:
						case MAXVALUE:
						case MINVALUE:
						case NOTHING:
						case NULLS:
						case OBJECT:
						case OIDS:
						case OVER:
						case OWNED:
						case OWNER:
						case PARTIAL:
						case PLAIN:
						case PRECEDING:
						case RANGE:
						case RENAME:
						case REPLICA:
						case RESET:
						case RESTART:
						case RESTRICT:
						case ROUTINE:
						case RULE:
						case SECURITY:
						case SEQUENCE:
						case SESSION:
						case SHOW:
						case SIMPLE:
						case STATISTICS:
						case STORAGE:
						case TABLESPACE:
						case TEMP:
						case TEMPORARY:
						case UNBOUNDED:
						case UNLOGGED:
						case USAGE:
						case VALID:
						case VALIDATE:
						case WITHIN:
						case WITHOUT:
						case ZONE:
						case OF:
						case GROUPS:
						case RECURSIVE:
						case INT2:
						case INT4:
						case INT8:
						case FLOAT4:
						case FLOAT8:
						case MACADDR8:
						case UUID:
						case INT4RANGE:
						case INT8RANGE:
						case IDENTIFIER_:
							{
							setState(1005);
							identifier();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(1012);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
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
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_functionCall);
		try {
			setState(1016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1013);
				aggregationFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				specialFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1015);
				regularFunction();
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

	public static class AggregationFunctionContext extends ParserRuleContext {
		public AggregationFunctionNameContext aggregationFunctionName() {
			return getRuleContext(AggregationFunctionNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public FilterClause_Context filterClause_() {
			return getRuleContext(FilterClause_Context.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAggregationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			aggregationFunctionName();
			setState(1019);
			match(LP_);
			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1020);
				distinct();
				}
			}

			setState(1032);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case ADMIN:
			case BINARY:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CURRENT_TIMESTAMP:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case INT2:
			case INT4:
			case INT8:
			case FLOAT4:
			case FLOAT8:
			case MACADDR8:
			case UUID:
			case INT4RANGE:
			case INT8RANGE:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1023);
				expr(0);
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1024);
					match(COMMA_);
					setState(1025);
					expr(0);
					}
					}
					setState(1030);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1031);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1034);
			match(RP_);
			setState(1036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1035);
				filterClause_();
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

	public static class AggregationFunctionNameContext extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(PostgreSQLStatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(PostgreSQLStatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(PostgreSQLStatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(PostgreSQLStatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(PostgreSQLStatementParser.AVG, 0); }
		public AggregationFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunctionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAggregationFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionNameContext aggregationFunctionName() throws RecognitionException {
		AggregationFunctionNameContext _localctx = new AggregationFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_aggregationFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			_la = _input.LA(1);
			if ( !(((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (MAX - 148)) | (1L << (MIN - 148)) | (1L << (SUM - 148)) | (1L << (COUNT - 148)) | (1L << (AVG - 148)))) != 0)) ) {
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
		public TerminalNode DISTINCT() { return getToken(PostgreSQLStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitDistinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
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

	public static class FilterClause_Context extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(PostgreSQLStatementParser.FILTER, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode WHERE() { return getToken(PostgreSQLStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public FilterClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitFilterClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterClause_Context filterClause_() throws RecognitionException {
		FilterClause_Context _localctx = new FilterClause_Context(_ctx, getState());
		enterRule(_localctx, 148, RULE_filterClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			match(FILTER);
			setState(1043);
			match(LP_);
			setState(1044);
			match(WHERE);
			setState(1045);
			expr(0);
			setState(1046);
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

	public static class WindowFunctionContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public FilterClause_Context filterClause_() {
			return getRuleContext(FilterClause_Context.class,0);
		}
		public TerminalNode OVER() { return getToken(PostgreSQLStatementParser.OVER, 0); }
		public WindowDefinition_Context windowDefinition_() {
			return getRuleContext(WindowDefinition_Context.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public WindowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitWindowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFunctionContext windowFunction() throws RecognitionException {
		WindowFunctionContext _localctx = new WindowFunctionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_windowFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			identifier();
			setState(1049);
			match(LP_);
			setState(1050);
			expr(0);
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1051);
				match(COMMA_);
				setState(1052);
				expr(0);
				}
				}
				setState(1057);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1058);
			match(RP_);
			setState(1059);
			filterClause_();
			setState(1060);
			match(OVER);
			setState(1062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1061);
				identifier();
				}
				break;
			}
			setState(1064);
			windowDefinition_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowDefinition_Context extends ParserRuleContext {
		public PratitionClause_Context pratitionClause_() {
			return getRuleContext(PratitionClause_Context.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public FrameClause_Context frameClause_() {
			return getRuleContext(FrameClause_Context.class,0);
		}
		public WindowDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowDefinition_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitWindowDefinition_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowDefinition_Context windowDefinition_() throws RecognitionException {
		WindowDefinition_Context _localctx = new WindowDefinition_Context(_ctx, getState());
		enterRule(_localctx, 152, RULE_windowDefinition_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1066);
				pratitionClause_();
				}
				break;
			}
			setState(1070);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1069);
				orderByClause();
				}
				break;
			}
			setState(1073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1072);
				frameClause_();
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

	public static class PratitionClause_Context extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(PostgreSQLStatementParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public PratitionClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pratitionClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitPratitionClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PratitionClause_Context pratitionClause_() throws RecognitionException {
		PratitionClause_Context _localctx = new PratitionClause_Context(_ctx, getState());
		enterRule(_localctx, 154, RULE_pratitionClause_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			match(PARTITION);
			setState(1076);
			match(BY);
			setState(1077);
			expr(0);
			setState(1082);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1078);
					match(COMMA_);
					setState(1079);
					expr(0);
					}
					} 
				}
				setState(1084);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
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

	public static class FrameClause_Context extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(PostgreSQLStatementParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(PostgreSQLStatementParser.ROWS, 0); }
		public TerminalNode GROUPS() { return getToken(PostgreSQLStatementParser.GROUPS, 0); }
		public FrameStart_Context frameStart_() {
			return getRuleContext(FrameStart_Context.class,0);
		}
		public FrameBetween_Context frameBetween_() {
			return getRuleContext(FrameBetween_Context.class,0);
		}
		public FrameClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitFrameClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameClause_Context frameClause_() throws RecognitionException {
		FrameClause_Context _localctx = new FrameClause_Context(_ctx, getState());
		enterRule(_localctx, 156, RULE_frameClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			_la = _input.LA(1);
			if ( !(_la==ROWS || _la==RANGE || _la==GROUPS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1088);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case ADMIN:
			case BINARY:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CURRENT_TIMESTAMP:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case INT2:
			case INT4:
			case INT8:
			case FLOAT4:
			case FLOAT8:
			case MACADDR8:
			case UUID:
			case INT4RANGE:
			case INT8RANGE:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1086);
				frameStart_();
				}
				break;
			case BETWEEN:
				{
				setState(1087);
				frameBetween_();
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

	public static class FrameStart_Context extends ParserRuleContext {
		public TerminalNode CURRENT() { return getToken(PostgreSQLStatementParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(PostgreSQLStatementParser.ROW, 0); }
		public TerminalNode UNBOUNDED() { return getToken(PostgreSQLStatementParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(PostgreSQLStatementParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(PostgreSQLStatementParser.FOLLOWING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FrameStart_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameStart_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitFrameStart_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameStart_Context frameStart_() throws RecognitionException {
		FrameStart_Context _localctx = new FrameStart_Context(_ctx, getState());
		enterRule(_localctx, 158, RULE_frameStart_);
		try {
			setState(1102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1090);
				match(CURRENT);
				setState(1091);
				match(ROW);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092);
				match(UNBOUNDED);
				setState(1093);
				match(PRECEDING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1094);
				match(UNBOUNDED);
				setState(1095);
				match(FOLLOWING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1096);
				expr(0);
				setState(1097);
				match(PRECEDING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1099);
				expr(0);
				setState(1100);
				match(FOLLOWING);
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

	public static class FrameEnd_Context extends ParserRuleContext {
		public FrameStart_Context frameStart_() {
			return getRuleContext(FrameStart_Context.class,0);
		}
		public FrameEnd_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameEnd_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitFrameEnd_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameEnd_Context frameEnd_() throws RecognitionException {
		FrameEnd_Context _localctx = new FrameEnd_Context(_ctx, getState());
		enterRule(_localctx, 160, RULE_frameEnd_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			frameStart_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBetween_Context extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(PostgreSQLStatementParser.BETWEEN, 0); }
		public FrameStart_Context frameStart_() {
			return getRuleContext(FrameStart_Context.class,0);
		}
		public TerminalNode AND() { return getToken(PostgreSQLStatementParser.AND, 0); }
		public FrameEnd_Context frameEnd_() {
			return getRuleContext(FrameEnd_Context.class,0);
		}
		public FrameBetween_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBetween_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitFrameBetween_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBetween_Context frameBetween_() throws RecognitionException {
		FrameBetween_Context _localctx = new FrameBetween_Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_frameBetween_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			match(BETWEEN);
			setState(1107);
			frameStart_();
			setState(1108);
			match(AND);
			setState(1109);
			frameEnd_();
			}
		}
		catch (RecognitionException re) {
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
		public WindowFunctionContext windowFunction() {
			return getRuleContext(WindowFunctionContext.class,0);
		}
		public CastFunctionContext castFunction() {
			return getRuleContext(CastFunctionContext.class,0);
		}
		public CharFunctionContext charFunction() {
			return getRuleContext(CharFunctionContext.class,0);
		}
		public SpecialFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitSpecialFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialFunctionContext specialFunction() throws RecognitionException {
		SpecialFunctionContext _localctx = new SpecialFunctionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_specialFunction);
		try {
			setState(1114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1111);
				windowFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1112);
				castFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1113);
				charFunction();
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

	public static class CastFunctionContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(PostgreSQLStatementParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public CastFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitCastFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastFunctionContext castFunction() throws RecognitionException {
		CastFunctionContext _localctx = new CastFunctionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_castFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			match(CAST);
			setState(1117);
			match(LP_);
			setState(1118);
			expr(0);
			setState(1119);
			match(AS);
			setState(1120);
			dataType();
			setState(1121);
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

	public static class CharFunctionContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(PostgreSQLStatementParser.CHAR, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public CharFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitCharFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharFunctionContext charFunction() throws RecognitionException {
		CharFunctionContext _localctx = new CharFunctionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_charFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			match(CHAR);
			setState(1124);
			match(LP_);
			setState(1125);
			expr(0);
			setState(1130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1126);
				match(COMMA_);
				setState(1127);
				expr(0);
				}
				}
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1133);
				match(USING);
				setState(1134);
				ignoredIdentifier_();
				}
			}

			setState(1137);
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
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public RegularFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitRegularFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionContext regularFunction() throws RecognitionException {
		RegularFunctionContext _localctx = new RegularFunctionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_regularFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			regularFunctionName_();
			setState(1140);
			match(LP_);
			setState(1150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case ADMIN:
			case BINARY:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CURRENT_TIMESTAMP:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case INT2:
			case INT4:
			case INT8:
			case FLOAT4:
			case FLOAT8:
			case MACADDR8:
			case UUID:
			case INT4RANGE:
			case INT8RANGE:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1141);
				expr(0);
				setState(1146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1142);
					match(COMMA_);
					setState(1143);
					expr(0);
					}
					}
					setState(1148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1149);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1152);
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
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(PostgreSQLStatementParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(PostgreSQLStatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(PostgreSQLStatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(PostgreSQLStatementParser.INTERVAL, 0); }
		public RegularFunctionName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunctionName_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitRegularFunctionName_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionName_Context regularFunctionName_() throws RecognitionException {
		RegularFunctionName_Context _localctx = new RegularFunctionName_Context(_ctx, getState());
		enterRule(_localctx, 172, RULE_regularFunctionName_);
		try {
			setState(1160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1154);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1155);
				match(IF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1156);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1157);
				match(LOCALTIME);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1158);
				match(LOCALTIMESTAMP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1159);
				match(INTERVAL);
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

	public static class CaseExpressionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(PostgreSQLStatementParser.CASE, 0); }
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
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_caseExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			match(CASE);
			setState(1164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_) | (1L << LP_) | (1L << LBE_) | (1L << QUESTION_) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << ALTER) | (1L << DROP) | (1L << TRUNCATE) | (1L << SCHEMA) | (1L << REVOKE) | (1L << ADD) | (1L << SET) | (1L << INDEX))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (KEY - 68)) | (1L << (FUNCTION - 68)) | (1L << (TRIGGER - 68)) | (1L << (PROCEDURE - 68)) | (1L << (CASE - 68)) | (1L << (CAST - 68)) | (1L << (IF - 68)) | (1L << (NULL - 68)) | (1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (EXISTS - 68)) | (1L << (BEGIN - 68)) | (1L << (COMMIT - 68)) | (1L << (ROLLBACK - 68)) | (1L << (SAVEPOINT - 68)) | (1L << (BOOLEAN - 68)) | (1L << (CHAR - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (INTERVAL - 133)) | (1L << (TIME - 133)) | (1L << (TIMESTAMP - 133)) | (1L << (LOCALTIME - 133)) | (1L << (LOCALTIMESTAMP - 133)) | (1L << (YEAR - 133)) | (1L << (MONTH - 133)) | (1L << (DAY - 133)) | (1L << (HOUR - 133)) | (1L << (MINUTE - 133)) | (1L << (SECOND - 133)) | (1L << (MAX - 133)) | (1L << (MIN - 133)) | (1L << (SUM - 133)) | (1L << (COUNT - 133)) | (1L << (AVG - 133)) | (1L << (CURRENT - 133)) | (1L << (ENABLE - 133)) | (1L << (DISABLE - 133)) | (1L << (INSTANCE - 133)) | (1L << (PRESERVE - 133)) | (1L << (DEFINER - 133)) | (1L << (CURRENT_USER - 133)) | (1L << (SQL - 133)) | (1L << (CASCADED - 133)) | (1L << (LOCAL - 133)) | (1L << (CLOSE - 133)) | (1L << (OPEN - 133)) | (1L << (NEXT - 133)) | (1L << (NAME - 133)) | (1L << (NAMES - 133)) | (1L << (INTEGER - 133)) | (1L << (REAL - 133)) | (1L << (DECIMAL - 133)) | (1L << (TYPE - 133)) | (1L << (ADMIN - 133)) | (1L << (BINARY - 133)) | (1L << (ESCAPE - 133)) | (1L << (EXCLUDE - 133)) | (1L << (PARTITION - 133)) | (1L << (ROW - 133)) | (1L << (UNKNOWN - 133)) | (1L << (ALWAYS - 133)) | (1L << (CASCADE - 133)) | (1L << (GENERATED - 133)) | (1L << (ISOLATION - 133)) | (1L << (LEVEL - 133)) | (1L << (OPTION - 133)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (PRIVILEGES - 197)) | (1L << (READ - 197)) | (1L << (ROLE - 197)) | (1L << (ROWS - 197)) | (1L << (START - 197)) | (1L << (TRANSACTION - 197)) | (1L << (ACTION - 197)) | (1L << (CACHE - 197)) | (1L << (CHARACTERISTICS - 197)) | (1L << (CLUSTER - 197)) | (1L << (COMMENTS - 197)) | (1L << (CONSTRAINTS - 197)) | (1L << (CURRENT_TIMESTAMP - 197)) | (1L << (CYCLE - 197)) | (1L << (DATA - 197)) | (1L << (DATABASE - 197)) | (1L << (DEFAULTS - 197)) | (1L << (DEFERRED - 197)) | (1L << (DEPENDS - 197)) | (1L << (DOMAIN - 197)) | (1L << (EXCLUDING - 197)) | (1L << (EXECUTE - 197)) | (1L << (EXTENDED - 197)) | (1L << (EXTENSION - 197)) | (1L << (EXTERNAL - 197)) | (1L << (EXTRACT - 197)) | (1L << (FILTER - 197)) | (1L << (FIRST - 197)) | (1L << (FOLLOWING - 197)) | (1L << (FORCE - 197)) | (1L << (GLOBAL - 197)) | (1L << (IDENTITY - 197)) | (1L << (IMMEDIATE - 197)) | (1L << (INCLUDING - 197)) | (1L << (INCREMENT - 197)) | (1L << (INDEXES - 197)) | (1L << (INHERIT - 197)) | (1L << (INHERITS - 197)) | (1L << (INCLUDE - 197)) | (1L << (LANGUAGE - 197)) | (1L << (LARGE - 197)) | (1L << (LAST - 197)) | (1L << (LOGGED - 197)) | (1L << (MAIN - 197)) | (1L << (MATCH - 197)) | (1L << (MAXVALUE - 197)) | (1L << (MINVALUE - 197)) | (1L << (NOTHING - 197)) | (1L << (NULLS - 197)) | (1L << (OBJECT - 197)) | (1L << (OIDS - 197)) | (1L << (OVER - 197)) | (1L << (OWNED - 197)) | (1L << (OWNER - 197)) | (1L << (PARTIAL - 197)) | (1L << (PLAIN - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (PRECEDING - 261)) | (1L << (RANGE - 261)) | (1L << (RENAME - 261)) | (1L << (REPLICA - 261)) | (1L << (RESET - 261)) | (1L << (RESTART - 261)) | (1L << (RESTRICT - 261)) | (1L << (ROUTINE - 261)) | (1L << (RULE - 261)) | (1L << (SECURITY - 261)) | (1L << (SEQUENCE - 261)) | (1L << (SESSION - 261)) | (1L << (SHOW - 261)) | (1L << (SIMPLE - 261)) | (1L << (STATISTICS - 261)) | (1L << (STORAGE - 261)) | (1L << (TABLESPACE - 261)) | (1L << (TEMP - 261)) | (1L << (TEMPORARY - 261)) | (1L << (UNBOUNDED - 261)) | (1L << (UNLOGGED - 261)) | (1L << (USAGE - 261)) | (1L << (VALID - 261)) | (1L << (VALIDATE - 261)) | (1L << (WITHIN - 261)) | (1L << (WITHOUT - 261)) | (1L << (ZONE - 261)) | (1L << (OF - 261)) | (1L << (GROUPS - 261)) | (1L << (RECURSIVE - 261)) | (1L << (INT2 - 261)) | (1L << (INT4 - 261)) | (1L << (INT8 - 261)) | (1L << (FLOAT4 - 261)) | (1L << (FLOAT8 - 261)) | (1L << (MACADDR8 - 261)) | (1L << (UUID - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (INT4RANGE - 325)) | (1L << (INT8RANGE - 325)) | (1L << (IDENTIFIER_ - 325)) | (1L << (STRING_ - 325)) | (1L << (NUMBER_ - 325)) | (1L << (HEX_DIGIT_ - 325)) | (1L << (BIT_NUM_ - 325)))) != 0)) {
				{
				setState(1163);
				simpleExpr(0);
				}
			}

			setState(1167); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1166);
					caseWhen_();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1169); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1171);
				caseElse_();
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

	public static class CaseWhen_Context extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(PostgreSQLStatementParser.WHEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(PostgreSQLStatementParser.THEN, 0); }
		public CaseWhen_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhen_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitCaseWhen_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseWhen_Context caseWhen_() throws RecognitionException {
		CaseWhen_Context _localctx = new CaseWhen_Context(_ctx, getState());
		enterRule(_localctx, 176, RULE_caseWhen_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			match(WHEN);
			setState(1175);
			expr(0);
			setState(1176);
			match(THEN);
			setState(1177);
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
		public TerminalNode ELSE() { return getToken(PostgreSQLStatementParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseElse_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseElse_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitCaseElse_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseElse_Context caseElse_() throws RecognitionException {
		CaseElse_Context _localctx = new CaseElse_Context(_ctx, getState());
		enterRule(_localctx, 178, RULE_caseElse_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			match(ELSE);
			setState(1180);
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(PostgreSQLStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_orderByClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			match(ORDER);
			setState(1183);
			match(BY);
			setState(1184);
			orderByItem();
			setState(1189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1185);
					match(COMMA_);
					setState(1186);
					orderByItem();
					}
					} 
				}
				setState(1191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(PostgreSQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(PostgreSQLStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitOrderByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1192);
				columnName();
				}
				break;
			case 2:
				{
				setState(1193);
				numberLiterals();
				}
				break;
			case 3:
				{
				setState(1194);
				expr(0);
				}
				break;
			}
			setState(1198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1197);
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
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(PostgreSQLStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(PostgreSQLStatementParser.STRING_, i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_dataType);
		int _la;
		try {
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1200);
				dataTypeName();
				setState(1202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1201);
					dataTypeLength();
					}
				}

				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHAR || _la==CHARACTER) {
					{
					setState(1204);
					characterSet_();
					}
				}

				setState(1208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1207);
					collateClause_();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1210);
				dataTypeName();
				setState(1211);
				match(LP_);
				setState(1212);
				match(STRING_);
				setState(1217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1213);
					match(COMMA_);
					setState(1214);
					match(STRING_);
					}
					}
					setState(1219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1220);
				match(RP_);
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHAR || _la==CHARACTER) {
					{
					setState(1221);
					characterSet_();
					}
				}

				setState(1225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1224);
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
		public TerminalNode INT() { return getToken(PostgreSQLStatementParser.INT, 0); }
		public TerminalNode INT2() { return getToken(PostgreSQLStatementParser.INT2, 0); }
		public TerminalNode INT4() { return getToken(PostgreSQLStatementParser.INT4, 0); }
		public TerminalNode INT8() { return getToken(PostgreSQLStatementParser.INT8, 0); }
		public TerminalNode SMALLINT() { return getToken(PostgreSQLStatementParser.SMALLINT, 0); }
		public TerminalNode INTEGER() { return getToken(PostgreSQLStatementParser.INTEGER, 0); }
		public TerminalNode BIGINT() { return getToken(PostgreSQLStatementParser.BIGINT, 0); }
		public TerminalNode DECIMAL() { return getToken(PostgreSQLStatementParser.DECIMAL, 0); }
		public TerminalNode NUMERIC() { return getToken(PostgreSQLStatementParser.NUMERIC, 0); }
		public TerminalNode REAL() { return getToken(PostgreSQLStatementParser.REAL, 0); }
		public TerminalNode FLOAT() { return getToken(PostgreSQLStatementParser.FLOAT, 0); }
		public TerminalNode FLOAT4() { return getToken(PostgreSQLStatementParser.FLOAT4, 0); }
		public TerminalNode FLOAT8() { return getToken(PostgreSQLStatementParser.FLOAT8, 0); }
		public TerminalNode DOUBLE() { return getToken(PostgreSQLStatementParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(PostgreSQLStatementParser.PRECISION, 0); }
		public TerminalNode SMALLSERIAL() { return getToken(PostgreSQLStatementParser.SMALLSERIAL, 0); }
		public TerminalNode SERIAL() { return getToken(PostgreSQLStatementParser.SERIAL, 0); }
		public TerminalNode BIGSERIAL() { return getToken(PostgreSQLStatementParser.BIGSERIAL, 0); }
		public TerminalNode MONEY() { return getToken(PostgreSQLStatementParser.MONEY, 0); }
		public TerminalNode VARCHAR() { return getToken(PostgreSQLStatementParser.VARCHAR, 0); }
		public TerminalNode CHARACTER() { return getToken(PostgreSQLStatementParser.CHARACTER, 0); }
		public TerminalNode CHAR() { return getToken(PostgreSQLStatementParser.CHAR, 0); }
		public TerminalNode TEXT() { return getToken(PostgreSQLStatementParser.TEXT, 0); }
		public TerminalNode NAME() { return getToken(PostgreSQLStatementParser.NAME, 0); }
		public TerminalNode BYTEA() { return getToken(PostgreSQLStatementParser.BYTEA, 0); }
		public TerminalNode TIMESTAMP() { return getToken(PostgreSQLStatementParser.TIMESTAMP, 0); }
		public TerminalNode DATE() { return getToken(PostgreSQLStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(PostgreSQLStatementParser.TIME, 0); }
		public TerminalNode INTERVAL() { return getToken(PostgreSQLStatementParser.INTERVAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(PostgreSQLStatementParser.BOOLEAN, 0); }
		public TerminalNode ENUM() { return getToken(PostgreSQLStatementParser.ENUM, 0); }
		public TerminalNode POINT() { return getToken(PostgreSQLStatementParser.POINT, 0); }
		public TerminalNode LINE() { return getToken(PostgreSQLStatementParser.LINE, 0); }
		public TerminalNode LSEG() { return getToken(PostgreSQLStatementParser.LSEG, 0); }
		public TerminalNode BOX() { return getToken(PostgreSQLStatementParser.BOX, 0); }
		public TerminalNode PATH() { return getToken(PostgreSQLStatementParser.PATH, 0); }
		public TerminalNode POLYGON() { return getToken(PostgreSQLStatementParser.POLYGON, 0); }
		public TerminalNode CIRCLE() { return getToken(PostgreSQLStatementParser.CIRCLE, 0); }
		public TerminalNode CIDR() { return getToken(PostgreSQLStatementParser.CIDR, 0); }
		public TerminalNode INET() { return getToken(PostgreSQLStatementParser.INET, 0); }
		public TerminalNode MACADDR() { return getToken(PostgreSQLStatementParser.MACADDR, 0); }
		public TerminalNode MACADDR8() { return getToken(PostgreSQLStatementParser.MACADDR8, 0); }
		public TerminalNode BIT() { return getToken(PostgreSQLStatementParser.BIT, 0); }
		public TerminalNode VARBIT() { return getToken(PostgreSQLStatementParser.VARBIT, 0); }
		public TerminalNode TSVECTOR() { return getToken(PostgreSQLStatementParser.TSVECTOR, 0); }
		public TerminalNode TSQUERY() { return getToken(PostgreSQLStatementParser.TSQUERY, 0); }
		public TerminalNode UUID() { return getToken(PostgreSQLStatementParser.UUID, 0); }
		public TerminalNode XML() { return getToken(PostgreSQLStatementParser.XML, 0); }
		public TerminalNode JSON() { return getToken(PostgreSQLStatementParser.JSON, 0); }
		public TerminalNode INT4RANGE() { return getToken(PostgreSQLStatementParser.INT4RANGE, 0); }
		public TerminalNode INT8RANGE() { return getToken(PostgreSQLStatementParser.INT8RANGE, 0); }
		public TerminalNode NUMRANGE() { return getToken(PostgreSQLStatementParser.NUMRANGE, 0); }
		public TerminalNode TSRANGE() { return getToken(PostgreSQLStatementParser.TSRANGE, 0); }
		public TerminalNode TSTZRANGE() { return getToken(PostgreSQLStatementParser.TSTZRANGE, 0); }
		public TerminalNode DATERANGE() { return getToken(PostgreSQLStatementParser.DATERANGE, 0); }
		public TerminalNode ARRAY() { return getToken(PostgreSQLStatementParser.ARRAY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitDataTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeNameContext dataTypeName() throws RecognitionException {
		DataTypeNameContext _localctx = new DataTypeNameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_dataTypeName);
		try {
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1229);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1230);
				match(INT2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1231);
				match(INT4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1232);
				match(INT8);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1233);
				match(SMALLINT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1234);
				match(INTEGER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1235);
				match(BIGINT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1236);
				match(DECIMAL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1237);
				match(NUMERIC);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1238);
				match(REAL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1239);
				match(FLOAT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1240);
				match(FLOAT4);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1241);
				match(FLOAT8);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1242);
				match(DOUBLE);
				setState(1243);
				match(PRECISION);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1244);
				match(SMALLSERIAL);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1245);
				match(SERIAL);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1246);
				match(BIGSERIAL);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1247);
				match(MONEY);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1248);
				match(VARCHAR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1249);
				match(CHARACTER);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1250);
				match(CHAR);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1251);
				match(TEXT);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1252);
				match(NAME);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1253);
				match(BYTEA);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1254);
				match(TIMESTAMP);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1255);
				match(DATE);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1256);
				match(TIME);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1257);
				match(INTERVAL);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1258);
				match(BOOLEAN);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1259);
				match(ENUM);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1260);
				match(POINT);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1261);
				match(LINE);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1262);
				match(LSEG);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1263);
				match(BOX);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1264);
				match(PATH);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1265);
				match(POLYGON);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1266);
				match(CIRCLE);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1267);
				match(CIDR);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1268);
				match(INET);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1269);
				match(MACADDR);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1270);
				match(MACADDR8);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1271);
				match(BIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1272);
				match(VARBIT);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1273);
				match(TSVECTOR);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(1274);
				match(TSQUERY);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(1275);
				match(UUID);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(1276);
				match(XML);
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(1277);
				match(JSON);
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(1278);
				match(INT4RANGE);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(1279);
				match(INT8RANGE);
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(1280);
				match(NUMRANGE);
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(1281);
				match(TSRANGE);
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(1282);
				match(TSTZRANGE);
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(1283);
				match(DATERANGE);
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(1284);
				match(ARRAY);
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(1285);
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
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(PostgreSQLStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(PostgreSQLStatementParser.NUMBER_, i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(PostgreSQLStatementParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitDataTypeLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(LP_);
			setState(1289);
			match(NUMBER_);
			setState(1292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(1290);
				match(COMMA_);
				setState(1291);
				match(NUMBER_);
				}
			}

			setState(1294);
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
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(PostgreSQLStatementParser.CHARACTER, 0); }
		public TerminalNode CHAR() { return getToken(PostgreSQLStatementParser.CHAR, 0); }
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public CharacterSet_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSet_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitCharacterSet_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterSet_Context characterSet_() throws RecognitionException {
		CharacterSet_Context _localctx = new CharacterSet_Context(_ctx, getState());
		enterRule(_localctx, 190, RULE_characterSet_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			_la = _input.LA(1);
			if ( !(_la==CHAR || _la==CHARACTER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1297);
			match(SET);
			setState(1299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(1298);
				match(EQ_);
				}
			}

			setState(1301);
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
		public TerminalNode COLLATE() { return getToken(PostgreSQLStatementParser.COLLATE, 0); }
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public CollateClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitCollateClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollateClause_Context collateClause_() throws RecognitionException {
		CollateClause_Context _localctx = new CollateClause_Context(_ctx, getState());
		enterRule(_localctx, 192, RULE_collateClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			match(COLLATE);
			setState(1305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(1304);
				match(EQ_);
				}
			}

			setState(1309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				{
				setState(1307);
				match(STRING_);
				}
				break;
			case T__0:
			case T__1:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case IF:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case ADMIN:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case INT2:
			case INT4:
			case INT8:
			case FLOAT4:
			case FLOAT8:
			case MACADDR8:
			case UUID:
			case INT4RANGE:
			case INT8RANGE:
			case IDENTIFIER_:
				{
				setState(1308);
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
		public TerminalNode DOT_() { return getToken(PostgreSQLStatementParser.DOT_, 0); }
		public IgnoredIdentifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitIgnoredIdentifier_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoredIdentifier_Context ignoredIdentifier_() throws RecognitionException {
		IgnoredIdentifier_Context _localctx = new IgnoredIdentifier_Context(_ctx, getState());
		enterRule(_localctx, 194, RULE_ignoredIdentifier_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			identifier();
			setState(1314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_) {
				{
				setState(1312);
				match(DOT_);
				setState(1313);
				identifier();
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

	public static class IgnoredIdentifiers_Context extends ParserRuleContext {
		public List<IgnoredIdentifier_Context> ignoredIdentifier_() {
			return getRuleContexts(IgnoredIdentifier_Context.class);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_(int i) {
			return getRuleContext(IgnoredIdentifier_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public IgnoredIdentifiers_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifiers_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitIgnoredIdentifiers_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoredIdentifiers_Context ignoredIdentifiers_() throws RecognitionException {
		IgnoredIdentifiers_Context _localctx = new IgnoredIdentifiers_Context(_ctx, getState());
		enterRule(_localctx, 196, RULE_ignoredIdentifiers_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			ignoredIdentifier_();
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1317);
				match(COMMA_);
				setState(1318);
				ignoredIdentifier_();
				}
				}
				setState(1323);
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

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public CreateTableSpecification_Context createTableSpecification_() {
			return getRuleContext(CreateTableSpecification_Context.class,0);
		}
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TableNotExistClause_Context tableNotExistClause_() {
			return getRuleContext(TableNotExistClause_Context.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public CreateDefinitionClauseContext createDefinitionClause() {
			return getRuleContext(CreateDefinitionClauseContext.class,0);
		}
		public InheritClause_Context inheritClause_() {
			return getRuleContext(InheritClause_Context.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_createTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			match(CREATE);
			setState(1325);
			createTableSpecification_();
			setState(1326);
			match(TABLE);
			setState(1327);
			tableNotExistClause_();
			setState(1328);
			tableName();
			setState(1329);
			createDefinitionClause();
			setState(1330);
			inheritClause_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateIndexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public CreateIndexSpecification_Context createIndexSpecification_() {
			return getRuleContext(CreateIndexSpecification_Context.class,0);
		}
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public ConcurrentlyClause_Context concurrentlyClause_() {
			return getRuleContext(ConcurrentlyClause_Context.class,0);
		}
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public OnlyClause_Context onlyClause_() {
			return getRuleContext(OnlyClause_Context.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IndexNotExistClause_Context indexNotExistClause_() {
			return getRuleContext(IndexNotExistClause_Context.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitCreateIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_createIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
			match(CREATE);
			setState(1333);
			createIndexSpecification_();
			setState(1334);
			match(INDEX);
			setState(1335);
			concurrentlyClause_();
			setState(1339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << ALTER) | (1L << DROP) | (1L << TRUNCATE) | (1L << SCHEMA) | (1L << REVOKE) | (1L << ADD) | (1L << SET) | (1L << INDEX))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (KEY - 68)) | (1L << (FUNCTION - 68)) | (1L << (TRIGGER - 68)) | (1L << (PROCEDURE - 68)) | (1L << (IF - 68)) | (1L << (BEGIN - 68)) | (1L << (COMMIT - 68)) | (1L << (ROLLBACK - 68)) | (1L << (SAVEPOINT - 68)) | (1L << (BOOLEAN - 68)) | (1L << (CHAR - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (INTERVAL - 133)) | (1L << (TIME - 133)) | (1L << (TIMESTAMP - 133)) | (1L << (YEAR - 133)) | (1L << (MONTH - 133)) | (1L << (DAY - 133)) | (1L << (HOUR - 133)) | (1L << (MINUTE - 133)) | (1L << (SECOND - 133)) | (1L << (CURRENT - 133)) | (1L << (ENABLE - 133)) | (1L << (DISABLE - 133)) | (1L << (INSTANCE - 133)) | (1L << (PRESERVE - 133)) | (1L << (DEFINER - 133)) | (1L << (SQL - 133)) | (1L << (CASCADED - 133)) | (1L << (LOCAL - 133)) | (1L << (CLOSE - 133)) | (1L << (OPEN - 133)) | (1L << (NEXT - 133)) | (1L << (NAME - 133)) | (1L << (NAMES - 133)) | (1L << (INTEGER - 133)) | (1L << (REAL - 133)) | (1L << (DECIMAL - 133)) | (1L << (TYPE - 133)) | (1L << (ADMIN - 133)) | (1L << (ESCAPE - 133)) | (1L << (EXCLUDE - 133)) | (1L << (PARTITION - 133)) | (1L << (UNKNOWN - 133)) | (1L << (ALWAYS - 133)) | (1L << (CASCADE - 133)) | (1L << (GENERATED - 133)) | (1L << (ISOLATION - 133)) | (1L << (LEVEL - 133)) | (1L << (OPTION - 133)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (PRIVILEGES - 197)) | (1L << (READ - 197)) | (1L << (ROLE - 197)) | (1L << (ROWS - 197)) | (1L << (START - 197)) | (1L << (TRANSACTION - 197)) | (1L << (ACTION - 197)) | (1L << (CACHE - 197)) | (1L << (CHARACTERISTICS - 197)) | (1L << (CLUSTER - 197)) | (1L << (COMMENTS - 197)) | (1L << (CONSTRAINTS - 197)) | (1L << (CYCLE - 197)) | (1L << (DATA - 197)) | (1L << (DATABASE - 197)) | (1L << (DEFAULTS - 197)) | (1L << (DEFERRED - 197)) | (1L << (DEPENDS - 197)) | (1L << (DOMAIN - 197)) | (1L << (EXCLUDING - 197)) | (1L << (EXECUTE - 197)) | (1L << (EXTENDED - 197)) | (1L << (EXTENSION - 197)) | (1L << (EXTERNAL - 197)) | (1L << (EXTRACT - 197)) | (1L << (FILTER - 197)) | (1L << (FIRST - 197)) | (1L << (FOLLOWING - 197)) | (1L << (FORCE - 197)) | (1L << (GLOBAL - 197)) | (1L << (IDENTITY - 197)) | (1L << (IMMEDIATE - 197)) | (1L << (INCLUDING - 197)) | (1L << (INCREMENT - 197)) | (1L << (INDEXES - 197)) | (1L << (INHERIT - 197)) | (1L << (INHERITS - 197)) | (1L << (INCLUDE - 197)) | (1L << (LANGUAGE - 197)) | (1L << (LARGE - 197)) | (1L << (LAST - 197)) | (1L << (LOGGED - 197)) | (1L << (MAIN - 197)) | (1L << (MATCH - 197)) | (1L << (MAXVALUE - 197)) | (1L << (MINVALUE - 197)) | (1L << (NOTHING - 197)) | (1L << (NULLS - 197)) | (1L << (OBJECT - 197)) | (1L << (OIDS - 197)) | (1L << (OVER - 197)) | (1L << (OWNED - 197)) | (1L << (OWNER - 197)) | (1L << (PARTIAL - 197)) | (1L << (PLAIN - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (PRECEDING - 261)) | (1L << (RANGE - 261)) | (1L << (RENAME - 261)) | (1L << (REPLICA - 261)) | (1L << (RESET - 261)) | (1L << (RESTART - 261)) | (1L << (RESTRICT - 261)) | (1L << (ROUTINE - 261)) | (1L << (RULE - 261)) | (1L << (SECURITY - 261)) | (1L << (SEQUENCE - 261)) | (1L << (SESSION - 261)) | (1L << (SHOW - 261)) | (1L << (SIMPLE - 261)) | (1L << (STATISTICS - 261)) | (1L << (STORAGE - 261)) | (1L << (TABLESPACE - 261)) | (1L << (TEMP - 261)) | (1L << (TEMPORARY - 261)) | (1L << (UNBOUNDED - 261)) | (1L << (UNLOGGED - 261)) | (1L << (USAGE - 261)) | (1L << (VALID - 261)) | (1L << (VALIDATE - 261)) | (1L << (WITHIN - 261)) | (1L << (WITHOUT - 261)) | (1L << (ZONE - 261)) | (1L << (OF - 261)) | (1L << (GROUPS - 261)) | (1L << (RECURSIVE - 261)) | (1L << (INT2 - 261)) | (1L << (INT4 - 261)) | (1L << (INT8 - 261)) | (1L << (FLOAT4 - 261)) | (1L << (FLOAT8 - 261)) | (1L << (MACADDR8 - 261)) | (1L << (UUID - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (INT4RANGE - 325)) | (1L << (INT8RANGE - 325)) | (1L << (IDENTIFIER_ - 325)))) != 0)) {
				{
				setState(1336);
				indexNotExistClause_();
				setState(1337);
				indexName();
				}
			}

			setState(1341);
			match(ON);
			setState(1342);
			onlyClause_();
			setState(1343);
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

	public static class AlterTableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TableExistClause_Context tableExistClause_() {
			return getRuleContext(TableExistClause_Context.class,0);
		}
		public OnlyClause_Context onlyClause_() {
			return getRuleContext(OnlyClause_Context.class,0);
		}
		public TableNameClauseContext tableNameClause() {
			return getRuleContext(TableNameClauseContext.class,0);
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
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAlterTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_alterTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			match(ALTER);
			setState(1346);
			match(TABLE);
			setState(1347);
			tableExistClause_();
			setState(1348);
			onlyClause_();
			setState(1349);
			tableNameClause();
			setState(1350);
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

	public static class AlterIndexContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public IndexExistClause_Context indexExistClause_() {
			return getRuleContext(IndexExistClause_Context.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public AlterIndexDefinitionClause_Context alterIndexDefinitionClause_() {
			return getRuleContext(AlterIndexDefinitionClause_Context.class,0);
		}
		public AlterIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAlterIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterIndexContext alterIndex() throws RecognitionException {
		AlterIndexContext _localctx = new AlterIndexContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_alterIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			match(ALTER);
			setState(1353);
			match(INDEX);
			setState(1354);
			indexExistClause_();
			setState(1355);
			indexName();
			setState(1356);
			alterIndexDefinitionClause_();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TableExistClause_Context tableExistClause_() {
			return getRuleContext(TableExistClause_Context.class,0);
		}
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			match(DROP);
			setState(1359);
			match(TABLE);
			setState(1360);
			tableExistClause_();
			setState(1361);
			tableNames();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropIndexContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public ConcurrentlyClause_Context concurrentlyClause_() {
			return getRuleContext(ConcurrentlyClause_Context.class,0);
		}
		public IndexExistClause_Context indexExistClause_() {
			return getRuleContext(IndexExistClause_Context.class,0);
		}
		public IndexNamesContext indexNames() {
			return getRuleContext(IndexNamesContext.class,0);
		}
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitDropIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_dropIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			match(DROP);
			setState(1364);
			match(INDEX);
			setState(1365);
			concurrentlyClause_();
			setState(1366);
			indexExistClause_();
			setState(1367);
			indexNames();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TruncateTableContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(PostgreSQLStatementParser.TRUNCATE, 0); }
		public OnlyClause_Context onlyClause_() {
			return getRuleContext(OnlyClause_Context.class,0);
		}
		public TableNamesClauseContext tableNamesClause() {
			return getRuleContext(TableNamesClauseContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TruncateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncateTableContext truncateTable() throws RecognitionException {
		TruncateTableContext _localctx = new TruncateTableContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_truncateTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			match(TRUNCATE);
			setState(1371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(1370);
				match(TABLE);
				}
			}

			setState(1373);
			onlyClause_();
			setState(1374);
			tableNamesClause();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode UNLOGGED() { return getToken(PostgreSQLStatementParser.UNLOGGED, 0); }
		public TerminalNode TEMPORARY() { return getToken(PostgreSQLStatementParser.TEMPORARY, 0); }
		public TerminalNode TEMP() { return getToken(PostgreSQLStatementParser.TEMP, 0); }
		public TerminalNode GLOBAL() { return getToken(PostgreSQLStatementParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(PostgreSQLStatementParser.LOCAL, 0); }
		public CreateTableSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableSpecification_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitCreateTableSpecification_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableSpecification_Context createTableSpecification_() throws RecognitionException {
		CreateTableSpecification_Context _localctx = new CreateTableSpecification_Context(_ctx, getState());
		enterRule(_localctx, 212, RULE_createTableSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOCAL:
			case GLOBAL:
			case TEMP:
			case TEMPORARY:
				{
				setState(1377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL || _la==GLOBAL) {
					{
					setState(1376);
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

				setState(1379);
				_la = _input.LA(1);
				if ( !(_la==TEMP || _la==TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case UNLOGGED:
				{
				setState(1380);
				match(UNLOGGED);
				}
				break;
			case TABLE:
				break;
			default:
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

	public static class TableNotExistClause_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TableNotExistClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNotExistClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitTableNotExistClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNotExistClause_Context tableNotExistClause_() throws RecognitionException {
		TableNotExistClause_Context _localctx = new TableNotExistClause_Context(_ctx, getState());
		enterRule(_localctx, 214, RULE_tableNotExistClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1383);
				match(IF);
				setState(1384);
				match(NOT);
				setState(1385);
				match(EXISTS);
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

	public static class CreateDefinitionClauseContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<CreateDefinitionContext> createDefinition() {
			return getRuleContexts(CreateDefinitionContext.class);
		}
		public CreateDefinitionContext createDefinition(int i) {
			return getRuleContext(CreateDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public CreateDefinitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitCreateDefinitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDefinitionClauseContext createDefinitionClause() throws RecognitionException {
		CreateDefinitionClauseContext _localctx = new CreateDefinitionClauseContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_createDefinitionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			match(LP_);
			setState(1397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << ALTER) | (1L << DROP) | (1L << TRUNCATE) | (1L << SCHEMA) | (1L << REVOKE) | (1L << ADD) | (1L << SET) | (1L << INDEX))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONSTRAINT - 64)) | (1L << (PRIMARY - 64)) | (1L << (UNIQUE - 64)) | (1L << (FOREIGN - 64)) | (1L << (KEY - 64)) | (1L << (FUNCTION - 64)) | (1L << (TRIGGER - 64)) | (1L << (PROCEDURE - 64)) | (1L << (IF - 64)) | (1L << (LIKE - 64)) | (1L << (BEGIN - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (SAVEPOINT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (BOOLEAN - 128)) | (1L << (CHAR - 128)) | (1L << (INTERVAL - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (YEAR - 128)) | (1L << (MONTH - 128)) | (1L << (DAY - 128)) | (1L << (HOUR - 128)) | (1L << (MINUTE - 128)) | (1L << (SECOND - 128)) | (1L << (CURRENT - 128)) | (1L << (ENABLE - 128)) | (1L << (DISABLE - 128)) | (1L << (INSTANCE - 128)) | (1L << (PRESERVE - 128)) | (1L << (DEFINER - 128)) | (1L << (SQL - 128)) | (1L << (CASCADED - 128)) | (1L << (LOCAL - 128)) | (1L << (CLOSE - 128)) | (1L << (OPEN - 128)) | (1L << (NEXT - 128)) | (1L << (NAME - 128)) | (1L << (NAMES - 128)) | (1L << (INTEGER - 128)) | (1L << (REAL - 128)) | (1L << (DECIMAL - 128)) | (1L << (TYPE - 128)) | (1L << (ADMIN - 128)) | (1L << (ESCAPE - 128)) | (1L << (EXCLUDE - 128)) | (1L << (PARTITION - 128)) | (1L << (UNKNOWN - 128)) | (1L << (ALWAYS - 128)) | (1L << (CASCADE - 128)) | (1L << (CHECK - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (GENERATED - 192)) | (1L << (ISOLATION - 192)) | (1L << (LEVEL - 192)) | (1L << (OPTION - 192)) | (1L << (PRIVILEGES - 192)) | (1L << (READ - 192)) | (1L << (ROLE - 192)) | (1L << (ROWS - 192)) | (1L << (START - 192)) | (1L << (TRANSACTION - 192)) | (1L << (ACTION - 192)) | (1L << (CACHE - 192)) | (1L << (CHARACTERISTICS - 192)) | (1L << (CLUSTER - 192)) | (1L << (COMMENTS - 192)) | (1L << (CONSTRAINTS - 192)) | (1L << (CYCLE - 192)) | (1L << (DATA - 192)) | (1L << (DATABASE - 192)) | (1L << (DEFAULTS - 192)) | (1L << (DEFERRED - 192)) | (1L << (DEPENDS - 192)) | (1L << (DOMAIN - 192)) | (1L << (EXCLUDING - 192)) | (1L << (EXECUTE - 192)) | (1L << (EXTENDED - 192)) | (1L << (EXTENSION - 192)) | (1L << (EXTERNAL - 192)) | (1L << (EXTRACT - 192)) | (1L << (FILTER - 192)) | (1L << (FIRST - 192)) | (1L << (FOLLOWING - 192)) | (1L << (FORCE - 192)) | (1L << (GLOBAL - 192)) | (1L << (IDENTITY - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (INCLUDING - 192)) | (1L << (INCREMENT - 192)) | (1L << (INDEXES - 192)) | (1L << (INHERIT - 192)) | (1L << (INHERITS - 192)) | (1L << (INCLUDE - 192)) | (1L << (LANGUAGE - 192)) | (1L << (LARGE - 192)) | (1L << (LAST - 192)) | (1L << (LOGGED - 192)) | (1L << (MAIN - 192)) | (1L << (MATCH - 192)) | (1L << (MAXVALUE - 192)) | (1L << (MINVALUE - 192)) | (1L << (NOTHING - 192)) | (1L << (NULLS - 192)) | (1L << (OBJECT - 192)) | (1L << (OIDS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (OVER - 256)) | (1L << (OWNED - 256)) | (1L << (OWNER - 256)) | (1L << (PARTIAL - 256)) | (1L << (PLAIN - 256)) | (1L << (PRECEDING - 256)) | (1L << (RANGE - 256)) | (1L << (RENAME - 256)) | (1L << (REPLICA - 256)) | (1L << (RESET - 256)) | (1L << (RESTART - 256)) | (1L << (RESTRICT - 256)) | (1L << (ROUTINE - 256)) | (1L << (RULE - 256)) | (1L << (SECURITY - 256)) | (1L << (SEQUENCE - 256)) | (1L << (SESSION - 256)) | (1L << (SHOW - 256)) | (1L << (SIMPLE - 256)) | (1L << (STATISTICS - 256)) | (1L << (STORAGE - 256)) | (1L << (TABLESPACE - 256)) | (1L << (TEMP - 256)) | (1L << (TEMPORARY - 256)) | (1L << (UNBOUNDED - 256)) | (1L << (UNLOGGED - 256)) | (1L << (USAGE - 256)) | (1L << (VALID - 256)) | (1L << (VALIDATE - 256)) | (1L << (WITHIN - 256)) | (1L << (WITHOUT - 256)) | (1L << (ZONE - 256)) | (1L << (OF - 256)) | (1L << (GROUPS - 256)) | (1L << (RECURSIVE - 256)) | (1L << (INT2 - 256)) | (1L << (INT4 - 256)) | (1L << (INT8 - 256)) | (1L << (FLOAT4 - 256)) | (1L << (FLOAT8 - 256)) | (1L << (MACADDR8 - 256)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (UUID - 322)) | (1L << (INT4RANGE - 322)) | (1L << (INT8RANGE - 322)) | (1L << (IDENTIFIER_ - 322)))) != 0)) {
				{
				setState(1389);
				createDefinition();
				setState(1394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1390);
					match(COMMA_);
					setState(1391);
					createDefinition();
					}
					}
					setState(1396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1399);
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

	public static class CreateDefinitionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(PostgreSQLStatementParser.LIKE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<LikeOptionContext> likeOption() {
			return getRuleContexts(LikeOptionContext.class);
		}
		public LikeOptionContext likeOption(int i) {
			return getRuleContext(LikeOptionContext.class,i);
		}
		public CreateDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitCreateDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDefinitionContext createDefinition() throws RecognitionException {
		CreateDefinitionContext _localctx = new CreateDefinitionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_createDefinition);
		int _la;
		try {
			setState(1411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1401);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1402);
				tableConstraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1403);
				match(LIKE);
				setState(1404);
				tableName();
				setState(1408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EXCLUDING || _la==INCLUDING) {
					{
					{
					setState(1405);
					likeOption();
					}
					}
					setState(1410);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			columnName();
			setState(1414);
			dataType();
			setState(1416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(1415);
				collateClause_();
				}
			}

			setState(1421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONSTRAINT - 64)) | (1L << (PRIMARY - 64)) | (1L << (UNIQUE - 64)) | (1L << (KEY - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (DEFAULT - 153)) | (1L << (CHECK - 153)) | (1L << (GENERATED - 153)) | (1L << (REFERENCES - 153)))) != 0)) {
				{
				{
				setState(1418);
				columnConstraint();
				}
				}
				setState(1423);
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

	public static class ColumnConstraintContext extends ParserRuleContext {
		public ColumnConstraintOptionContext columnConstraintOption() {
			return getRuleContext(ColumnConstraintOptionContext.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public ConstraintClauseContext constraintClause() {
			return getRuleContext(ConstraintClauseContext.class,0);
		}
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitColumnConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_columnConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1424);
				constraintClause();
				}
			}

			setState(1427);
			columnConstraintOption();
			setState(1428);
			constraintOptionalParam();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintClauseContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitConstraintClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintClauseContext constraintClause() throws RecognitionException {
		ConstraintClauseContext _localctx = new ConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_constraintClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			match(CONSTRAINT);
			setState(1431);
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

	public static class ColumnConstraintOptionContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public CheckOptionContext checkOption() {
			return getRuleContext(CheckOptionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public DefaultExprContext defaultExpr() {
			return getRuleContext(DefaultExprContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(PostgreSQLStatementParser.GENERATED, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public SequenceOptionsContext sequenceOptions() {
			return getRuleContext(SequenceOptionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public IndexParametersContext indexParameters() {
			return getRuleContext(IndexParametersContext.class,0);
		}
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode REFERENCES() { return getToken(PostgreSQLStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(PostgreSQLStatementParser.MATCH, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLStatementParser.FULL, 0); }
		public TerminalNode PARTIAL() { return getToken(PostgreSQLStatementParser.PARTIAL, 0); }
		public TerminalNode SIMPLE() { return getToken(PostgreSQLStatementParser.SIMPLE, 0); }
		public List<TerminalNode> ON() { return getTokens(PostgreSQLStatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(PostgreSQLStatementParser.ON, i);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public List<TerminalNode> DELETE() { return getTokens(PostgreSQLStatementParser.DELETE); }
		public TerminalNode DELETE(int i) {
			return getToken(PostgreSQLStatementParser.DELETE, i);
		}
		public List<TerminalNode> UPDATE() { return getTokens(PostgreSQLStatementParser.UPDATE); }
		public TerminalNode UPDATE(int i) {
			return getToken(PostgreSQLStatementParser.UPDATE, i);
		}
		public ColumnConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraintOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitColumnConstraintOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnConstraintOptionContext columnConstraintOption() throws RecognitionException {
		ColumnConstraintOptionContext _localctx = new ColumnConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_columnConstraintOption);
		int _la;
		try {
			setState(1480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1433);
					match(NOT);
					}
				}

				setState(1436);
				match(NULL);
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 2);
				{
				setState(1437);
				checkOption();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1438);
				match(DEFAULT);
				setState(1439);
				defaultExpr();
				}
				break;
			case GENERATED:
				enterOuterAlt(_localctx, 4);
				{
				setState(1440);
				match(GENERATED);
				setState(1444);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALWAYS:
					{
					setState(1441);
					match(ALWAYS);
					}
					break;
				case BY:
					{
					setState(1442);
					match(BY);
					setState(1443);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1446);
				match(AS);
				setState(1447);
				match(IDENTITY);
				setState(1452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1448);
					match(LP_);
					setState(1449);
					sequenceOptions();
					setState(1450);
					match(RP_);
					}
				}

				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1454);
				match(UNIQUE);
				setState(1455);
				indexParameters();
				}
				break;
			case PRIMARY:
			case KEY:
				enterOuterAlt(_localctx, 6);
				{
				setState(1456);
				primaryKey();
				setState(1457);
				indexParameters();
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 7);
				{
				setState(1459);
				match(REFERENCES);
				setState(1460);
				tableName();
				setState(1462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1461);
					columnNames();
					}
				}

				setState(1470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1464);
					match(MATCH);
					setState(1465);
					match(FULL);
					}
					break;
				case 2:
					{
					setState(1466);
					match(MATCH);
					setState(1467);
					match(PARTIAL);
					}
					break;
				case 3:
					{
					setState(1468);
					match(MATCH);
					setState(1469);
					match(SIMPLE);
					}
					break;
				}
				setState(1477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ON) {
					{
					{
					setState(1472);
					match(ON);
					setState(1473);
					_la = _input.LA(1);
					if ( !(_la==UPDATE || _la==DELETE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1474);
					action();
					}
					}
					setState(1479);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class CheckOptionContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(PostgreSQLStatementParser.CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode INHERIT() { return getToken(PostgreSQLStatementParser.INHERIT, 0); }
		public CheckOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitCheckOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckOptionContext checkOption() throws RecognitionException {
		CheckOptionContext _localctx = new CheckOptionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_checkOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1482);
			match(CHECK);
			setState(1483);
			expr(0);
			setState(1486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NO) {
				{
				setState(1484);
				match(NO);
				setState(1485);
				match(INHERIT);
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

	public static class DefaultExprContext extends ParserRuleContext {
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(PostgreSQLStatementParser.CURRENT_TIMESTAMP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefaultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitDefaultExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultExprContext defaultExpr() throws RecognitionException {
		DefaultExprContext _localctx = new DefaultExprContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_defaultExpr);
		try {
			setState(1490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1488);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1489);
				expr(0);
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

	public static class SequenceOptionsContext extends ParserRuleContext {
		public List<SequenceOptionContext> sequenceOption() {
			return getRuleContexts(SequenceOptionContext.class);
		}
		public SequenceOptionContext sequenceOption(int i) {
			return getRuleContext(SequenceOptionContext.class,i);
		}
		public SequenceOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceOptions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitSequenceOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceOptionsContext sequenceOptions() throws RecognitionException {
		SequenceOptionsContext _localctx = new SequenceOptionsContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_sequenceOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1492);
				sequenceOption();
				}
				}
				setState(1495); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (NO - 195)) | (1L << (START - 195)) | (1L << (CACHE - 195)) | (1L << (CYCLE - 195)) | (1L << (INCREMENT - 195)) | (1L << (MAXVALUE - 195)) | (1L << (MINVALUE - 195)) | (1L << (OWNED - 195)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceOptionContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(PostgreSQLStatementParser.START, 0); }
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public TerminalNode INCREMENT() { return getToken(PostgreSQLStatementParser.INCREMENT, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public TerminalNode MAXVALUE() { return getToken(PostgreSQLStatementParser.MAXVALUE, 0); }
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode MINVALUE() { return getToken(PostgreSQLStatementParser.MINVALUE, 0); }
		public TerminalNode CYCLE() { return getToken(PostgreSQLStatementParser.CYCLE, 0); }
		public TerminalNode CACHE() { return getToken(PostgreSQLStatementParser.CACHE, 0); }
		public TerminalNode OWNED() { return getToken(PostgreSQLStatementParser.OWNED, 0); }
		public SequenceOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitSequenceOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceOptionContext sequenceOption() throws RecognitionException {
		SequenceOptionContext _localctx = new SequenceOptionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_sequenceOption);
		int _la;
		try {
			setState(1522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1497);
				match(START);
				setState(1499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1498);
					match(WITH);
					}
				}

				setState(1501);
				match(NUMBER_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1502);
				match(INCREMENT);
				setState(1504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(1503);
					match(BY);
					}
				}

				setState(1506);
				match(NUMBER_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1507);
				match(MAXVALUE);
				setState(1508);
				match(NUMBER_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1509);
				match(NO);
				setState(1510);
				match(MAXVALUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1511);
				match(MINVALUE);
				setState(1512);
				match(NUMBER_);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1513);
				match(NO);
				setState(1514);
				match(MINVALUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1515);
				match(CYCLE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1516);
				match(NO);
				setState(1517);
				match(CYCLE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1518);
				match(CACHE);
				setState(1519);
				match(NUMBER_);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1520);
				match(OWNED);
				setState(1521);
				match(BY);
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

	public static class IndexParametersContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode INCLUDE() { return getToken(PostgreSQLStatementParser.INCLUDE, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public IndexParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitIndexParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexParametersContext indexParameters() throws RecognitionException {
		IndexParametersContext _localctx = new IndexParametersContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_indexParameters);
		int _la;
		try {
			setState(1533);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case RP_:
			case COMMA_:
			case SEMI_:
			case CONSTRAINT:
			case PRIMARY:
			case UNIQUE:
			case KEY:
			case USING:
			case NOT:
			case NULL:
			case DEFAULT:
			case CHECK:
			case GENERATED:
			case REFERENCES:
			case DEFERRABLE:
			case INITIALLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1524);
					match(USING);
					setState(1525);
					match(INDEX);
					setState(1526);
					match(TABLESPACE);
					setState(1527);
					ignoredIdentifier_();
					}
				}

				}
				break;
			case INCLUDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1530);
				match(INCLUDE);
				setState(1531);
				columnNames();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 3);
				{
				setState(1532);
				match(WITH);
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

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(PostgreSQLStatementParser.ACTION, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_action);
		int _la;
		try {
			setState(1541);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1535);
				match(NO);
				setState(1536);
				match(ACTION);
				}
				break;
			case RESTRICT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1537);
				match(RESTRICT);
				}
				break;
			case CASCADE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1538);
				match(CASCADE);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(1539);
				match(SET);
				setState(1540);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==DEFAULT) ) {
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
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintOptionalParamContext extends ParserRuleContext {
		public TerminalNode DEFERRABLE() { return getToken(PostgreSQLStatementParser.DEFERRABLE, 0); }
		public TerminalNode INITIALLY() { return getToken(PostgreSQLStatementParser.INITIALLY, 0); }
		public TerminalNode DEFERRED() { return getToken(PostgreSQLStatementParser.DEFERRED, 0); }
		public TerminalNode IMMEDIATE() { return getToken(PostgreSQLStatementParser.IMMEDIATE, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public ConstraintOptionalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintOptionalParam; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitConstraintOptionalParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintOptionalParamContext constraintOptionalParam() throws RecognitionException {
		ConstraintOptionalParamContext _localctx = new ConstraintOptionalParamContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_constraintOptionalParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1543);
					match(NOT);
					}
				}

				setState(1546);
				match(DEFERRABLE);
				}
				break;
			}
			setState(1551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIALLY) {
				{
				setState(1549);
				match(INITIALLY);
				setState(1550);
				_la = _input.LA(1);
				if ( !(_la==DEFERRED || _la==IMMEDIATE) ) {
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

	public static class LikeOptionContext extends ParserRuleContext {
		public TerminalNode INCLUDING() { return getToken(PostgreSQLStatementParser.INCLUDING, 0); }
		public TerminalNode EXCLUDING() { return getToken(PostgreSQLStatementParser.EXCLUDING, 0); }
		public TerminalNode COMMENTS() { return getToken(PostgreSQLStatementParser.COMMENTS, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(PostgreSQLStatementParser.CONSTRAINTS, 0); }
		public TerminalNode DEFAULTS() { return getToken(PostgreSQLStatementParser.DEFAULTS, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode INDEXES() { return getToken(PostgreSQLStatementParser.INDEXES, 0); }
		public TerminalNode STATISTICS() { return getToken(PostgreSQLStatementParser.STATISTICS, 0); }
		public TerminalNode STORAGE() { return getToken(PostgreSQLStatementParser.STORAGE, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public LikeOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitLikeOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeOptionContext likeOption() throws RecognitionException {
		LikeOptionContext _localctx = new LikeOptionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_likeOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			_la = _input.LA(1);
			if ( !(_la==EXCLUDING || _la==INCLUDING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1554);
			_la = _input.LA(1);
			if ( !(_la==ALL || ((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & ((1L << (COMMENTS - 210)) | (1L << (CONSTRAINTS - 210)) | (1L << (DEFAULTS - 210)) | (1L << (IDENTITY - 210)) | (1L << (INDEXES - 210)))) != 0) || _la==STATISTICS || _la==STORAGE) ) {
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

	public static class TableConstraintContext extends ParserRuleContext {
		public TableConstraintOptionContext tableConstraintOption() {
			return getRuleContext(TableConstraintOptionContext.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public ConstraintClauseContext constraintClause() {
			return getRuleContext(ConstraintClauseContext.class,0);
		}
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitTableConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_tableConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1556);
				constraintClause();
				}
			}

			setState(1559);
			tableConstraintOption();
			setState(1560);
			constraintOptionalParam();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableConstraintOptionContext extends ParserRuleContext {
		public CheckOptionContext checkOption() {
			return getRuleContext(CheckOptionContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public IndexParametersContext indexParameters() {
			return getRuleContext(IndexParametersContext.class,0);
		}
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode EXCLUDE() { return getToken(PostgreSQLStatementParser.EXCLUDE, 0); }
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(PostgreSQLStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(PostgreSQLStatementParser.KEY, 0); }
		public TerminalNode REFERENCES() { return getToken(PostgreSQLStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(PostgreSQLStatementParser.MATCH, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLStatementParser.FULL, 0); }
		public TerminalNode PARTIAL() { return getToken(PostgreSQLStatementParser.PARTIAL, 0); }
		public TerminalNode SIMPLE() { return getToken(PostgreSQLStatementParser.SIMPLE, 0); }
		public List<TerminalNode> ON() { return getTokens(PostgreSQLStatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(PostgreSQLStatementParser.ON, i);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public List<TerminalNode> DELETE() { return getTokens(PostgreSQLStatementParser.DELETE); }
		public TerminalNode DELETE(int i) {
			return getToken(PostgreSQLStatementParser.DELETE, i);
		}
		public List<TerminalNode> UPDATE() { return getTokens(PostgreSQLStatementParser.UPDATE); }
		public TerminalNode UPDATE(int i) {
			return getToken(PostgreSQLStatementParser.UPDATE, i);
		}
		public TableConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraintOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitTableConstraintOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableConstraintOptionContext tableConstraintOption() throws RecognitionException {
		TableConstraintOptionContext _localctx = new TableConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_tableConstraintOption);
		int _la;
		try {
			setState(1600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHECK:
				enterOuterAlt(_localctx, 1);
				{
				setState(1562);
				checkOption();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1563);
				match(UNIQUE);
				setState(1564);
				columnNames();
				setState(1565);
				indexParameters();
				}
				break;
			case PRIMARY:
			case KEY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1567);
				primaryKey();
				setState(1568);
				columnNames();
				setState(1569);
				indexParameters();
				}
				break;
			case EXCLUDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1571);
				match(EXCLUDE);
				setState(1574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1572);
					match(USING);
					setState(1573);
					ignoredIdentifier_();
					}
				}

				}
				break;
			case FOREIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(1576);
				match(FOREIGN);
				setState(1577);
				match(KEY);
				setState(1578);
				columnNames();
				setState(1579);
				match(REFERENCES);
				setState(1580);
				tableName();
				setState(1582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1581);
					columnNames();
					}
				}

				setState(1590);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1584);
					match(MATCH);
					setState(1585);
					match(FULL);
					}
					break;
				case 2:
					{
					setState(1586);
					match(MATCH);
					setState(1587);
					match(PARTIAL);
					}
					break;
				case 3:
					{
					setState(1588);
					match(MATCH);
					setState(1589);
					match(SIMPLE);
					}
					break;
				}
				setState(1597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ON) {
					{
					{
					setState(1592);
					match(ON);
					setState(1593);
					_la = _input.LA(1);
					if ( !(_la==UPDATE || _la==DELETE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1594);
					action();
					}
					}
					setState(1599);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class InheritClause_Context extends ParserRuleContext {
		public TerminalNode INHERITS() { return getToken(PostgreSQLStatementParser.INHERITS, 0); }
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public InheritClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitInheritClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritClause_Context inheritClause_() throws RecognitionException {
		InheritClause_Context _localctx = new InheritClause_Context(_ctx, getState());
		enterRule(_localctx, 248, RULE_inheritClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(1602);
				match(INHERITS);
				setState(1603);
				tableNames();
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

	public static class CreateIndexSpecification_Context extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public CreateIndexSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexSpecification_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitCreateIndexSpecification_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexSpecification_Context createIndexSpecification_() throws RecognitionException {
		CreateIndexSpecification_Context _localctx = new CreateIndexSpecification_Context(_ctx, getState());
		enterRule(_localctx, 250, RULE_createIndexSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(1606);
				match(UNIQUE);
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

	public static class ConcurrentlyClause_Context extends ParserRuleContext {
		public TerminalNode CONCURRENTLY() { return getToken(PostgreSQLStatementParser.CONCURRENTLY, 0); }
		public ConcurrentlyClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrentlyClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitConcurrentlyClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcurrentlyClause_Context concurrentlyClause_() throws RecognitionException {
		ConcurrentlyClause_Context _localctx = new ConcurrentlyClause_Context(_ctx, getState());
		enterRule(_localctx, 252, RULE_concurrentlyClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONCURRENTLY) {
				{
				setState(1609);
				match(CONCURRENTLY);
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

	public static class IndexNotExistClause_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public IndexNotExistClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexNotExistClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitIndexNotExistClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexNotExistClause_Context indexNotExistClause_() throws RecognitionException {
		IndexNotExistClause_Context _localctx = new IndexNotExistClause_Context(_ctx, getState());
		enterRule(_localctx, 254, RULE_indexNotExistClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1612);
				match(IF);
				setState(1613);
				match(NOT);
				setState(1614);
				match(EXISTS);
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

	public static class OnlyClause_Context extends ParserRuleContext {
		public TerminalNode ONLY() { return getToken(PostgreSQLStatementParser.ONLY, 0); }
		public OnlyClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onlyClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitOnlyClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnlyClause_Context onlyClause_() throws RecognitionException {
		OnlyClause_Context _localctx = new OnlyClause_Context(_ctx, getState());
		enterRule(_localctx, 256, RULE_onlyClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(1617);
				match(ONLY);
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

	public static class TableExistClause_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TableExistClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExistClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitTableExistClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableExistClause_Context tableExistClause_() throws RecognitionException {
		TableExistClause_Context _localctx = new TableExistClause_Context(_ctx, getState());
		enterRule(_localctx, 258, RULE_tableExistClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1620);
				match(IF);
				setState(1621);
				match(EXISTS);
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

	public static class AsteriskClause_Context extends ParserRuleContext {
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public AsteriskClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asteriskClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAsteriskClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsteriskClause_Context asteriskClause_() throws RecognitionException {
		AsteriskClause_Context _localctx = new AsteriskClause_Context(_ctx, getState());
		enterRule(_localctx, 260, RULE_asteriskClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASTERISK_) {
				{
				setState(1624);
				match(ASTERISK_);
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
		public AlterTableActionsContext alterTableActions() {
			return getRuleContext(AlterTableActionsContext.class,0);
		}
		public RenameColumnSpecificationContext renameColumnSpecification() {
			return getRuleContext(RenameColumnSpecificationContext.class,0);
		}
		public RenameConstraintContext renameConstraint() {
			return getRuleContext(RenameConstraintContext.class,0);
		}
		public RenameTableSpecification_Context renameTableSpecification_() {
			return getRuleContext(RenameTableSpecification_Context.class,0);
		}
		public AlterDefinitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDefinitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAlterDefinitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDefinitionClauseContext alterDefinitionClause() throws RecognitionException {
		AlterDefinitionClauseContext _localctx = new AlterDefinitionClauseContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_alterDefinitionClause);
		try {
			setState(1631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1627);
				alterTableActions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1628);
				renameColumnSpecification();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1629);
				renameConstraint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1630);
				renameTableSpecification_();
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

	public static class AlterIndexDefinitionClause_Context extends ParserRuleContext {
		public RenameIndexSpecificationContext renameIndexSpecification() {
			return getRuleContext(RenameIndexSpecificationContext.class,0);
		}
		public AlterIndexDependsOnExtensionContext alterIndexDependsOnExtension() {
			return getRuleContext(AlterIndexDependsOnExtensionContext.class,0);
		}
		public AlterIndexSetTableSpaceContext alterIndexSetTableSpace() {
			return getRuleContext(AlterIndexSetTableSpaceContext.class,0);
		}
		public AlterIndexDefinitionClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndexDefinitionClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAlterIndexDefinitionClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterIndexDefinitionClause_Context alterIndexDefinitionClause_() throws RecognitionException {
		AlterIndexDefinitionClause_Context _localctx = new AlterIndexDefinitionClause_Context(_ctx, getState());
		enterRule(_localctx, 264, RULE_alterIndexDefinitionClause_);
		try {
			setState(1636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1633);
				renameIndexSpecification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1634);
				alterIndexDependsOnExtension();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1635);
				alterIndexSetTableSpace();
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

	public static class RenameIndexSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public RenameIndexSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameIndexSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitRenameIndexSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameIndexSpecificationContext renameIndexSpecification() throws RecognitionException {
		RenameIndexSpecificationContext _localctx = new RenameIndexSpecificationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_renameIndexSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638);
			match(RENAME);
			setState(1639);
			match(TO);
			setState(1640);
			indexName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterIndexDependsOnExtensionContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode DEPENDS() { return getToken(PostgreSQLStatementParser.DEPENDS, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public TerminalNode EXTENSION() { return getToken(PostgreSQLStatementParser.EXTENSION, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public AlterIndexDependsOnExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndexDependsOnExtension; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAlterIndexDependsOnExtension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterIndexDependsOnExtensionContext alterIndexDependsOnExtension() throws RecognitionException {
		AlterIndexDependsOnExtensionContext _localctx = new AlterIndexDependsOnExtensionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_alterIndexDependsOnExtension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			match(ALTER);
			setState(1643);
			match(INDEX);
			setState(1644);
			indexName();
			setState(1645);
			match(DEPENDS);
			setState(1646);
			match(ON);
			setState(1647);
			match(EXTENSION);
			setState(1648);
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

	public static class AlterIndexSetTableSpaceContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode IN() { return getToken(PostgreSQLStatementParser.IN, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode OWNED() { return getToken(PostgreSQLStatementParser.OWNED, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public AlterIndexSetTableSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndexSetTableSpace; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAlterIndexSetTableSpace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterIndexSetTableSpaceContext alterIndexSetTableSpace() throws RecognitionException {
		AlterIndexSetTableSpaceContext _localctx = new AlterIndexSetTableSpaceContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_alterIndexSetTableSpace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
			match(ALTER);
			setState(1651);
			match(INDEX);
			setState(1652);
			match(ALL);
			setState(1653);
			match(IN);
			setState(1654);
			match(TABLESPACE);
			setState(1655);
			indexName();
			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OWNED) {
				{
				setState(1656);
				match(OWNED);
				setState(1657);
				match(BY);
				setState(1658);
				ignoredIdentifiers_();
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

	public static class TableNamesClauseContext extends ParserRuleContext {
		public List<TableNameClauseContext> tableNameClause() {
			return getRuleContexts(TableNameClauseContext.class);
		}
		public TableNameClauseContext tableNameClause(int i) {
			return getRuleContext(TableNameClauseContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public TableNamesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNamesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitTableNamesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNamesClauseContext tableNamesClause() throws RecognitionException {
		TableNamesClauseContext _localctx = new TableNamesClauseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_tableNamesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
			tableNameClause();
			setState(1666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1662);
				match(COMMA_);
				setState(1663);
				tableNameClause();
				}
				}
				setState(1668);
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

	public static class TableNameClauseContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public TableNameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNameClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitTableNameClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameClauseContext tableNameClause() throws RecognitionException {
		TableNameClauseContext _localctx = new TableNameClauseContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_tableNameClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			tableName();
			setState(1671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASTERISK_) {
				{
				setState(1670);
				match(ASTERISK_);
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

	public static class AlterTableActionsContext extends ParserRuleContext {
		public List<AlterTableActionContext> alterTableAction() {
			return getRuleContexts(AlterTableActionContext.class);
		}
		public AlterTableActionContext alterTableAction(int i) {
			return getRuleContext(AlterTableActionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public AlterTableActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableActions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAlterTableActions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableActionsContext alterTableActions() throws RecognitionException {
		AlterTableActionsContext _localctx = new AlterTableActionsContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_alterTableActions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			alterTableAction();
			setState(1678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1674);
				match(COMMA_);
				setState(1675);
				alterTableAction();
				}
				}
				setState(1680);
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

	public static class AlterTableActionContext extends ParserRuleContext {
		public AddColumnSpecificationContext addColumnSpecification() {
			return getRuleContext(AddColumnSpecificationContext.class,0);
		}
		public DropColumnSpecificationContext dropColumnSpecification() {
			return getRuleContext(DropColumnSpecificationContext.class,0);
		}
		public ModifyColumnSpecificationContext modifyColumnSpecification() {
			return getRuleContext(ModifyColumnSpecificationContext.class,0);
		}
		public AddConstraintSpecificationContext addConstraintSpecification() {
			return getRuleContext(AddConstraintSpecificationContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public TerminalNode VALIDATE() { return getToken(PostgreSQLStatementParser.VALIDATE, 0); }
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public IndexExistClause_Context indexExistClause_() {
			return getRuleContext(IndexExistClause_Context.class,0);
		}
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public TerminalNode TRIGGER() { return getToken(PostgreSQLStatementParser.TRIGGER, 0); }
		public TerminalNode DISABLE() { return getToken(PostgreSQLStatementParser.DISABLE, 0); }
		public TerminalNode ENABLE() { return getToken(PostgreSQLStatementParser.ENABLE, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public TerminalNode REPLICA() { return getToken(PostgreSQLStatementParser.REPLICA, 0); }
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode RULE() { return getToken(PostgreSQLStatementParser.RULE, 0); }
		public TerminalNode ROW() { return getToken(PostgreSQLStatementParser.ROW, 0); }
		public TerminalNode LEVEL() { return getToken(PostgreSQLStatementParser.LEVEL, 0); }
		public TerminalNode SECURITY() { return getToken(PostgreSQLStatementParser.SECURITY, 0); }
		public TerminalNode FORCE() { return getToken(PostgreSQLStatementParser.FORCE, 0); }
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode CLUSTER() { return getToken(PostgreSQLStatementParser.CLUSTER, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode WITHOUT() { return getToken(PostgreSQLStatementParser.WITHOUT, 0); }
		public TerminalNode OIDS() { return getToken(PostgreSQLStatementParser.OIDS, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public TerminalNode LOGGED() { return getToken(PostgreSQLStatementParser.LOGGED, 0); }
		public TerminalNode UNLOGGED() { return getToken(PostgreSQLStatementParser.UNLOGGED, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<StorageParameterWithValueContext> storageParameterWithValue() {
			return getRuleContexts(StorageParameterWithValueContext.class);
		}
		public StorageParameterWithValueContext storageParameterWithValue(int i) {
			return getRuleContext(StorageParameterWithValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public TerminalNode RESET() { return getToken(PostgreSQLStatementParser.RESET, 0); }
		public List<StorageParameterContext> storageParameter() {
			return getRuleContexts(StorageParameterContext.class);
		}
		public StorageParameterContext storageParameter(int i) {
			return getRuleContext(StorageParameterContext.class,i);
		}
		public TerminalNode INHERIT() { return getToken(PostgreSQLStatementParser.INHERIT, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode OF() { return getToken(PostgreSQLStatementParser.OF, 0); }
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode OWNER() { return getToken(PostgreSQLStatementParser.OWNER, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public TerminalNode CURRENT_USER() { return getToken(PostgreSQLStatementParser.CURRENT_USER, 0); }
		public TerminalNode SESSION_USER() { return getToken(PostgreSQLStatementParser.SESSION_USER, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLStatementParser.FULL, 0); }
		public TerminalNode NOTHING() { return getToken(PostgreSQLStatementParser.NOTHING, 0); }
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public AlterTableActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableAction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAlterTableAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableActionContext alterTableAction() throws RecognitionException {
		AlterTableActionContext _localctx = new AlterTableActionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_alterTableAction);
		int _la;
		try {
			setState(1793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1681);
				addColumnSpecification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1682);
				dropColumnSpecification();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1683);
				modifyColumnSpecification();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1684);
				addConstraintSpecification();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1685);
				match(ALTER);
				setState(1686);
				match(CONSTRAINT);
				setState(1687);
				ignoredIdentifier_();
				setState(1688);
				constraintOptionalParam();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1690);
				match(VALIDATE);
				setState(1691);
				match(CONSTRAINT);
				setState(1692);
				ignoredIdentifier_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1693);
				match(DROP);
				setState(1694);
				match(CONSTRAINT);
				setState(1695);
				indexExistClause_();
				setState(1696);
				ignoredIdentifier_();
				setState(1698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(1697);
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
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1700);
				_la = _input.LA(1);
				if ( !(_la==ENABLE || _la==DISABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1701);
				match(TRIGGER);
				setState(1705);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case INSERT:
				case UPDATE:
				case DELETE:
				case ALTER:
				case DROP:
				case TRUNCATE:
				case SCHEMA:
				case REVOKE:
				case ADD:
				case SET:
				case INDEX:
				case KEY:
				case FUNCTION:
				case TRIGGER:
				case PROCEDURE:
				case IF:
				case BEGIN:
				case COMMIT:
				case ROLLBACK:
				case SAVEPOINT:
				case BOOLEAN:
				case CHAR:
				case INTERVAL:
				case TIME:
				case TIMESTAMP:
				case YEAR:
				case MONTH:
				case DAY:
				case HOUR:
				case MINUTE:
				case SECOND:
				case CURRENT:
				case ENABLE:
				case DISABLE:
				case INSTANCE:
				case PRESERVE:
				case DEFINER:
				case SQL:
				case CASCADED:
				case LOCAL:
				case CLOSE:
				case OPEN:
				case NEXT:
				case NAME:
				case NAMES:
				case INTEGER:
				case REAL:
				case DECIMAL:
				case TYPE:
				case ADMIN:
				case ESCAPE:
				case EXCLUDE:
				case PARTITION:
				case UNKNOWN:
				case ALWAYS:
				case CASCADE:
				case GENERATED:
				case ISOLATION:
				case LEVEL:
				case OPTION:
				case PRIVILEGES:
				case READ:
				case ROLE:
				case ROWS:
				case START:
				case TRANSACTION:
				case ACTION:
				case CACHE:
				case CHARACTERISTICS:
				case CLUSTER:
				case COMMENTS:
				case CONSTRAINTS:
				case CYCLE:
				case DATA:
				case DATABASE:
				case DEFAULTS:
				case DEFERRED:
				case DEPENDS:
				case DOMAIN:
				case EXCLUDING:
				case EXECUTE:
				case EXTENDED:
				case EXTENSION:
				case EXTERNAL:
				case EXTRACT:
				case FILTER:
				case FIRST:
				case FOLLOWING:
				case FORCE:
				case GLOBAL:
				case IDENTITY:
				case IMMEDIATE:
				case INCLUDING:
				case INCREMENT:
				case INDEXES:
				case INHERIT:
				case INHERITS:
				case INCLUDE:
				case LANGUAGE:
				case LARGE:
				case LAST:
				case LOGGED:
				case MAIN:
				case MATCH:
				case MAXVALUE:
				case MINVALUE:
				case NOTHING:
				case NULLS:
				case OBJECT:
				case OIDS:
				case OVER:
				case OWNED:
				case OWNER:
				case PARTIAL:
				case PLAIN:
				case PRECEDING:
				case RANGE:
				case RENAME:
				case REPLICA:
				case RESET:
				case RESTART:
				case RESTRICT:
				case ROUTINE:
				case RULE:
				case SECURITY:
				case SEQUENCE:
				case SESSION:
				case SHOW:
				case SIMPLE:
				case STATISTICS:
				case STORAGE:
				case TABLESPACE:
				case TEMP:
				case TEMPORARY:
				case UNBOUNDED:
				case UNLOGGED:
				case USAGE:
				case VALID:
				case VALIDATE:
				case WITHIN:
				case WITHOUT:
				case ZONE:
				case OF:
				case GROUPS:
				case RECURSIVE:
				case INT2:
				case INT4:
				case INT8:
				case FLOAT4:
				case FLOAT8:
				case MACADDR8:
				case UUID:
				case INT4RANGE:
				case INT8RANGE:
				case IDENTIFIER_:
					{
					setState(1702);
					ignoredIdentifier_();
					}
					break;
				case ALL:
					{
					setState(1703);
					match(ALL);
					}
					break;
				case USER:
					{
					setState(1704);
					match(USER);
					}
					break;
				case EOF:
				case COMMA_:
				case SEMI_:
					break;
				default:
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1707);
				match(ENABLE);
				setState(1708);
				_la = _input.LA(1);
				if ( !(_la==ALWAYS || _la==REPLICA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1709);
				match(TRIGGER);
				setState(1710);
				ignoredIdentifier_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1711);
				_la = _input.LA(1);
				if ( !(_la==ENABLE || _la==DISABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1712);
				match(RULE);
				setState(1713);
				ignoredIdentifier_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1714);
				match(ENABLE);
				setState(1715);
				_la = _input.LA(1);
				if ( !(_la==ALWAYS || _la==REPLICA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1716);
				match(RULE);
				setState(1717);
				ignoredIdentifier_();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1724);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DISABLE:
					{
					setState(1718);
					match(DISABLE);
					}
					break;
				case ENABLE:
					{
					setState(1719);
					match(ENABLE);
					}
					break;
				case NO:
				case FORCE:
					{
					{
					setState(1721);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(1720);
						match(NO);
						}
					}

					setState(1723);
					match(FORCE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1726);
				match(ROW);
				setState(1727);
				match(LEVEL);
				setState(1728);
				match(SECURITY);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1729);
				match(CLUSTER);
				setState(1730);
				match(ON);
				setState(1731);
				indexName();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1732);
				match(SET);
				setState(1733);
				match(WITHOUT);
				setState(1734);
				match(CLUSTER);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1735);
				match(SET);
				setState(1736);
				_la = _input.LA(1);
				if ( !(_la==WITH || _la==WITHOUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1737);
				match(OIDS);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1738);
				match(SET);
				setState(1739);
				match(TABLESPACE);
				setState(1740);
				ignoredIdentifier_();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1741);
				match(SET);
				setState(1742);
				_la = _input.LA(1);
				if ( !(_la==LOGGED || _la==UNLOGGED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1743);
				match(SET);
				setState(1744);
				match(LP_);
				setState(1745);
				storageParameterWithValue();
				setState(1750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1746);
					match(COMMA_);
					setState(1747);
					storageParameterWithValue();
					}
					}
					setState(1752);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1753);
				match(RP_);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1755);
				match(RESET);
				setState(1756);
				match(LP_);
				setState(1757);
				storageParameter();
				setState(1762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1758);
					match(COMMA_);
					setState(1759);
					storageParameter();
					}
					}
					setState(1764);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1765);
				match(RP_);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1767);
				match(INHERIT);
				setState(1768);
				tableName();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1769);
				match(NO);
				setState(1770);
				match(INHERIT);
				setState(1771);
				tableName();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1772);
				match(OF);
				setState(1773);
				dataTypeName();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1774);
				match(NOT);
				setState(1775);
				match(OF);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1776);
				match(OWNER);
				setState(1777);
				match(TO);
				setState(1781);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case INSERT:
				case UPDATE:
				case DELETE:
				case ALTER:
				case DROP:
				case TRUNCATE:
				case SCHEMA:
				case REVOKE:
				case ADD:
				case SET:
				case INDEX:
				case KEY:
				case FUNCTION:
				case TRIGGER:
				case PROCEDURE:
				case IF:
				case BEGIN:
				case COMMIT:
				case ROLLBACK:
				case SAVEPOINT:
				case BOOLEAN:
				case CHAR:
				case INTERVAL:
				case TIME:
				case TIMESTAMP:
				case YEAR:
				case MONTH:
				case DAY:
				case HOUR:
				case MINUTE:
				case SECOND:
				case CURRENT:
				case ENABLE:
				case DISABLE:
				case INSTANCE:
				case PRESERVE:
				case DEFINER:
				case SQL:
				case CASCADED:
				case LOCAL:
				case CLOSE:
				case OPEN:
				case NEXT:
				case NAME:
				case NAMES:
				case INTEGER:
				case REAL:
				case DECIMAL:
				case TYPE:
				case ADMIN:
				case ESCAPE:
				case EXCLUDE:
				case PARTITION:
				case UNKNOWN:
				case ALWAYS:
				case CASCADE:
				case GENERATED:
				case ISOLATION:
				case LEVEL:
				case OPTION:
				case PRIVILEGES:
				case READ:
				case ROLE:
				case ROWS:
				case START:
				case TRANSACTION:
				case ACTION:
				case CACHE:
				case CHARACTERISTICS:
				case CLUSTER:
				case COMMENTS:
				case CONSTRAINTS:
				case CYCLE:
				case DATA:
				case DATABASE:
				case DEFAULTS:
				case DEFERRED:
				case DEPENDS:
				case DOMAIN:
				case EXCLUDING:
				case EXECUTE:
				case EXTENDED:
				case EXTENSION:
				case EXTERNAL:
				case EXTRACT:
				case FILTER:
				case FIRST:
				case FOLLOWING:
				case FORCE:
				case GLOBAL:
				case IDENTITY:
				case IMMEDIATE:
				case INCLUDING:
				case INCREMENT:
				case INDEXES:
				case INHERIT:
				case INHERITS:
				case INCLUDE:
				case LANGUAGE:
				case LARGE:
				case LAST:
				case LOGGED:
				case MAIN:
				case MATCH:
				case MAXVALUE:
				case MINVALUE:
				case NOTHING:
				case NULLS:
				case OBJECT:
				case OIDS:
				case OVER:
				case OWNED:
				case OWNER:
				case PARTIAL:
				case PLAIN:
				case PRECEDING:
				case RANGE:
				case RENAME:
				case REPLICA:
				case RESET:
				case RESTART:
				case RESTRICT:
				case ROUTINE:
				case RULE:
				case SECURITY:
				case SEQUENCE:
				case SESSION:
				case SHOW:
				case SIMPLE:
				case STATISTICS:
				case STORAGE:
				case TABLESPACE:
				case TEMP:
				case TEMPORARY:
				case UNBOUNDED:
				case UNLOGGED:
				case USAGE:
				case VALID:
				case VALIDATE:
				case WITHIN:
				case WITHOUT:
				case ZONE:
				case OF:
				case GROUPS:
				case RECURSIVE:
				case INT2:
				case INT4:
				case INT8:
				case FLOAT4:
				case FLOAT8:
				case MACADDR8:
				case UUID:
				case INT4RANGE:
				case INT8RANGE:
				case IDENTIFIER_:
					{
					setState(1778);
					ignoredIdentifier_();
					}
					break;
				case CURRENT_USER:
					{
					setState(1779);
					match(CURRENT_USER);
					}
					break;
				case SESSION_USER:
					{
					setState(1780);
					match(SESSION_USER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1783);
				match(REPLICA);
				setState(1784);
				match(IDENTITY);
				setState(1791);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFAULT:
					{
					setState(1785);
					match(DEFAULT);
					}
					break;
				case USING:
					{
					{
					setState(1786);
					match(USING);
					setState(1787);
					match(INDEX);
					setState(1788);
					indexName();
					}
					}
					break;
				case FULL:
					{
					setState(1789);
					match(FULL);
					}
					break;
				case NOTHING:
					{
					setState(1790);
					match(NOTHING);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class AddColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(PostgreSQLStatementParser.ADD, 0); }
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public AddColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumnSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAddColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddColumnSpecificationContext addColumnSpecification() throws RecognitionException {
		AddColumnSpecificationContext _localctx = new AddColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_addColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1795);
			match(ADD);
			setState(1797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1796);
				match(COLUMN);
				}
			}

			setState(1802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1799);
				match(IF);
				setState(1800);
				match(NOT);
				setState(1801);
				match(EXISTS);
				}
				break;
			}
			setState(1804);
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
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public ColumnExistClause_Context columnExistClause_() {
			return getRuleContext(ColumnExistClause_Context.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public DropColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitDropColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropColumnSpecificationContext dropColumnSpecification() throws RecognitionException {
		DropColumnSpecificationContext _localctx = new DropColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_dropColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			match(DROP);
			setState(1808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1807);
				match(COLUMN);
				}
			}

			setState(1810);
			columnExistClause_();
			setState(1811);
			columnName();
			setState(1813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(1812);
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

	public static class ColumnExistClause_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public ColumnExistClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnExistClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitColumnExistClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnExistClause_Context columnExistClause_() throws RecognitionException {
		ColumnExistClause_Context _localctx = new ColumnExistClause_Context(_ctx, getState());
		enterRule(_localctx, 284, RULE_columnExistClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1815);
				match(IF);
				setState(1816);
				match(EXISTS);
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

	public static class ModifyColumnSpecificationContext extends ParserRuleContext {
		public ModifyColumnContext modifyColumn() {
			return getRuleContext(ModifyColumnContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(PostgreSQLStatementParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode DATA() { return getToken(PostgreSQLStatementParser.DATA, 0); }
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode ADD() { return getToken(PostgreSQLStatementParser.ADD, 0); }
		public TerminalNode GENERATED() { return getToken(PostgreSQLStatementParser.GENERATED, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public SequenceOptionsContext sequenceOptions() {
			return getRuleContext(SequenceOptionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public List<AlterColumnSetOptionContext> alterColumnSetOption() {
			return getRuleContexts(AlterColumnSetOptionContext.class);
		}
		public AlterColumnSetOptionContext alterColumnSetOption(int i) {
			return getRuleContext(AlterColumnSetOptionContext.class,i);
		}
		public ColumnExistClause_Context columnExistClause_() {
			return getRuleContext(ColumnExistClause_Context.class,0);
		}
		public TerminalNode STATISTICS() { return getToken(PostgreSQLStatementParser.STATISTICS, 0); }
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public AttributeOptionsContext attributeOptions() {
			return getRuleContext(AttributeOptionsContext.class,0);
		}
		public TerminalNode RESET() { return getToken(PostgreSQLStatementParser.RESET, 0); }
		public TerminalNode STORAGE() { return getToken(PostgreSQLStatementParser.STORAGE, 0); }
		public TerminalNode PLAIN() { return getToken(PostgreSQLStatementParser.PLAIN, 0); }
		public TerminalNode EXTERNAL() { return getToken(PostgreSQLStatementParser.EXTERNAL, 0); }
		public TerminalNode EXTENDED() { return getToken(PostgreSQLStatementParser.EXTENDED, 0); }
		public TerminalNode MAIN() { return getToken(PostgreSQLStatementParser.MAIN, 0); }
		public ModifyColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumnSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitModifyColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyColumnSpecificationContext modifyColumnSpecification() throws RecognitionException {
		ModifyColumnSpecificationContext _localctx = new ModifyColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_modifyColumnSpecification);
		int _la;
		try {
			setState(1898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1819);
				modifyColumn();
				setState(1822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET) {
					{
					setState(1820);
					match(SET);
					setState(1821);
					match(DATA);
					}
				}

				setState(1824);
				match(TYPE);
				setState(1825);
				dataType();
				setState(1827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(1826);
					collateClause_();
					}
				}

				setState(1831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1829);
					match(USING);
					setState(1830);
					simpleExpr(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1833);
				modifyColumn();
				setState(1834);
				match(SET);
				setState(1835);
				match(DEFAULT);
				setState(1836);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1838);
				modifyColumn();
				setState(1839);
				match(DROP);
				setState(1840);
				match(DEFAULT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1842);
				modifyColumn();
				setState(1843);
				_la = _input.LA(1);
				if ( !(_la==DROP || _la==SET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1844);
				match(NOT);
				setState(1845);
				match(NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1847);
				modifyColumn();
				setState(1848);
				match(ADD);
				setState(1849);
				match(GENERATED);
				setState(1853);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALWAYS:
					{
					setState(1850);
					match(ALWAYS);
					}
					break;
				case BY:
					{
					{
					setState(1851);
					match(BY);
					setState(1852);
					match(DEFAULT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1855);
				match(AS);
				setState(1856);
				match(IDENTITY);
				setState(1861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1857);
					match(LP_);
					setState(1858);
					sequenceOptions();
					setState(1859);
					match(RP_);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1863);
				modifyColumn();
				setState(1864);
				alterColumnSetOption();
				setState(1868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SET || _la==RESTART) {
					{
					{
					setState(1865);
					alterColumnSetOption();
					}
					}
					setState(1870);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1871);
				modifyColumn();
				setState(1872);
				match(DROP);
				setState(1873);
				match(IDENTITY);
				setState(1874);
				columnExistClause_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1876);
				modifyColumn();
				setState(1877);
				match(SET);
				setState(1878);
				match(STATISTICS);
				setState(1879);
				match(NUMBER_);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1881);
				modifyColumn();
				setState(1882);
				match(SET);
				setState(1883);
				match(LP_);
				setState(1884);
				attributeOptions();
				setState(1885);
				match(RP_);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1887);
				modifyColumn();
				setState(1888);
				match(RESET);
				setState(1889);
				match(LP_);
				setState(1890);
				attributeOptions();
				setState(1891);
				match(RP_);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1893);
				modifyColumn();
				setState(1894);
				match(SET);
				setState(1895);
				match(STORAGE);
				setState(1896);
				_la = _input.LA(1);
				if ( !(((((_la - 225)) & ~0x3f) == 0 && ((1L << (_la - 225)) & ((1L << (EXTENDED - 225)) | (1L << (EXTERNAL - 225)) | (1L << (MAIN - 225)) | (1L << (PLAIN - 225)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class ModifyColumnContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public ModifyColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitModifyColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyColumnContext modifyColumn() throws RecognitionException {
		ModifyColumnContext _localctx = new ModifyColumnContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_modifyColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			match(ALTER);
			setState(1902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1901);
				match(COLUMN);
				}
			}

			setState(1904);
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

	public static class AlterColumnSetOptionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode GENERATED() { return getToken(PostgreSQLStatementParser.GENERATED, 0); }
		public SequenceOptionContext sequenceOption() {
			return getRuleContext(SequenceOptionContext.class,0);
		}
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public TerminalNode RESTART() { return getToken(PostgreSQLStatementParser.RESTART, 0); }
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public AlterColumnSetOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnSetOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAlterColumnSetOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterColumnSetOptionContext alterColumnSetOption() throws RecognitionException {
		AlterColumnSetOptionContext _localctx = new AlterColumnSetOptionContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_alterColumnSetOption);
		int _la;
		try {
			setState(1923);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1906);
				match(SET);
				setState(1914);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GENERATED:
					{
					setState(1907);
					match(GENERATED);
					setState(1911);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ALWAYS:
						{
						setState(1908);
						match(ALWAYS);
						}
						break;
					case BY:
						{
						setState(1909);
						match(BY);
						setState(1910);
						match(DEFAULT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case NO:
				case START:
				case CACHE:
				case CYCLE:
				case INCREMENT:
				case MAXVALUE:
				case MINVALUE:
				case OWNED:
					{
					setState(1913);
					sequenceOption();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case RESTART:
				enterOuterAlt(_localctx, 2);
				{
				setState(1916);
				match(RESTART);
				setState(1921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH || _la==NUMBER_) {
					{
					setState(1918);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(1917);
						match(WITH);
						}
					}

					setState(1920);
					match(NUMBER_);
					}
				}

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

	public static class AttributeOptionsContext extends ParserRuleContext {
		public List<AttributeOptionContext> attributeOption() {
			return getRuleContexts(AttributeOptionContext.class);
		}
		public AttributeOptionContext attributeOption(int i) {
			return getRuleContext(AttributeOptionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public AttributeOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeOptions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAttributeOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeOptionsContext attributeOptions() throws RecognitionException {
		AttributeOptionsContext _localctx = new AttributeOptionsContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_attributeOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			attributeOption();
			setState(1930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1926);
				match(COMMA_);
				setState(1927);
				attributeOption();
				}
				}
				setState(1932);
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

	public static class AttributeOptionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public AttributeOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAttributeOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeOptionContext attributeOption() throws RecognitionException {
		AttributeOptionContext _localctx = new AttributeOptionContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_attributeOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1933);
			match(IDENTIFIER_);
			setState(1934);
			match(EQ_);
			setState(1935);
			simpleExpr(0);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ADD() { return getToken(PostgreSQLStatementParser.ADD, 0); }
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TableConstraintUsingIndexContext tableConstraintUsingIndex() {
			return getRuleContext(TableConstraintUsingIndexContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode VALID() { return getToken(PostgreSQLStatementParser.VALID, 0); }
		public AddConstraintSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraintSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAddConstraintSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddConstraintSpecificationContext addConstraintSpecification() throws RecognitionException {
		AddConstraintSpecificationContext _localctx = new AddConstraintSpecificationContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_addConstraintSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1937);
			match(ADD);
			setState(1944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1938);
				tableConstraint();
				setState(1941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1939);
					match(NOT);
					setState(1940);
					match(VALID);
					}
				}

				}
				break;
			case 2:
				{
				setState(1943);
				tableConstraintUsingIndex();
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

	public static class TableConstraintUsingIndexContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TableConstraintUsingIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraintUsingIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitTableConstraintUsingIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableConstraintUsingIndexContext tableConstraintUsingIndex() throws RecognitionException {
		TableConstraintUsingIndexContext _localctx = new TableConstraintUsingIndexContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_tableConstraintUsingIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1946);
				match(CONSTRAINT);
				setState(1947);
				ignoredIdentifier_();
				}
			}

			setState(1952);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIQUE:
				{
				setState(1950);
				match(UNIQUE);
				}
				break;
			case PRIMARY:
			case KEY:
				{
				setState(1951);
				primaryKey();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1954);
			match(USING);
			setState(1955);
			match(INDEX);
			setState(1956);
			indexName();
			setState(1957);
			constraintOptionalParam();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageParameterWithValueContext extends ParserRuleContext {
		public StorageParameterContext storageParameter() {
			return getRuleContext(StorageParameterContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public StorageParameterWithValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageParameterWithValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitStorageParameterWithValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageParameterWithValueContext storageParameterWithValue() throws RecognitionException {
		StorageParameterWithValueContext _localctx = new StorageParameterWithValueContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_storageParameterWithValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
			storageParameter();
			setState(1960);
			match(EQ_);
			setState(1961);
			simpleExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public StorageParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitStorageParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageParameterContext storageParameter() throws RecognitionException {
		StorageParameterContext _localctx = new StorageParameterContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_storageParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1963);
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

	public static class RenameColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public RenameColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameColumnSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitRenameColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameColumnSpecificationContext renameColumnSpecification() throws RecognitionException {
		RenameColumnSpecificationContext _localctx = new RenameColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_renameColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			match(RENAME);
			setState(1967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1966);
				match(COLUMN);
				}
			}

			setState(1969);
			columnName();
			setState(1970);
			match(TO);
			setState(1971);
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

	public static class RenameConstraintContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public List<IgnoredIdentifier_Context> ignoredIdentifier_() {
			return getRuleContexts(IgnoredIdentifier_Context.class);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_(int i) {
			return getRuleContext(IgnoredIdentifier_Context.class,i);
		}
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public RenameConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitRenameConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameConstraintContext renameConstraint() throws RecognitionException {
		RenameConstraintContext _localctx = new RenameConstraintContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_renameConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1973);
			match(RENAME);
			setState(1974);
			match(CONSTRAINT);
			setState(1975);
			ignoredIdentifier_();
			setState(1976);
			match(TO);
			setState(1977);
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

	public static class RenameTableSpecification_Context extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RenameTableSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameTableSpecification_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitRenameTableSpecification_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameTableSpecification_Context renameTableSpecification_() throws RecognitionException {
		RenameTableSpecification_Context _localctx = new RenameTableSpecification_Context(_ctx, getState());
		enterRule(_localctx, 308, RULE_renameTableSpecification_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1979);
			match(RENAME);
			setState(1980);
			match(TO);
			setState(1981);
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

	public static class IndexExistClause_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public IndexExistClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexExistClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitIndexExistClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexExistClause_Context indexExistClause_() throws RecognitionException {
		IndexExistClause_Context _localctx = new IndexExistClause_Context(_ctx, getState());
		enterRule(_localctx, 310, RULE_indexExistClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(1983);
				match(IF);
				setState(1984);
				match(EXISTS);
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

	public static class IndexNamesContext extends ParserRuleContext {
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public IndexNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitIndexNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexNamesContext indexNames() throws RecognitionException {
		IndexNamesContext _localctx = new IndexNamesContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_indexNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1987);
			indexName();
			setState(1992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1988);
				match(COMMA_);
				setState(1989);
				indexName();
				}
				}
				setState(1994);
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

	public static class SetTransactionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLStatementParser.TRANSACTION, 0); }
		public TerminalNode SESSION() { return getToken(PostgreSQLStatementParser.SESSION, 0); }
		public TerminalNode CHARACTERISTICS() { return getToken(PostgreSQLStatementParser.CHARACTERISTICS, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitSetTransaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_setTransaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
			match(SET);
			setState(1999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SESSION) {
				{
				setState(1996);
				match(SESSION);
				setState(1997);
				match(CHARACTERISTICS);
				setState(1998);
				match(AS);
				}
			}

			setState(2001);
			match(TRANSACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeginTransactionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PostgreSQLStatementParser.BEGIN, 0); }
		public TerminalNode START() { return getToken(PostgreSQLStatementParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLStatementParser.TRANSACTION, 0); }
		public BeginTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginTransaction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitBeginTransaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginTransactionContext beginTransaction() throws RecognitionException {
		BeginTransactionContext _localctx = new BeginTransactionContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_beginTransaction);
		try {
			setState(2006);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2003);
				match(BEGIN);
				}
				break;
			case START:
				enterOuterAlt(_localctx, 2);
				{
				setState(2004);
				match(START);
				setState(2005);
				match(TRANSACTION);
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

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(PostgreSQLStatementParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2008);
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
		public TerminalNode ROLLBACK() { return getToken(PostgreSQLStatementParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2010);
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

	public static class SavepointContext extends ParserRuleContext {
		public TerminalNode SAVEPOINT() { return getToken(PostgreSQLStatementParser.SAVEPOINT, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitSavepoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_savepoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2012);
			match(SAVEPOINT);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode GRANT() { return getToken(PostgreSQLStatementParser.GRANT, 0); }
		public PrivilegeClauseContext privilegeClause() {
			return getRuleContext(PrivilegeClauseContext.class,0);
		}
		public RoleClause_Context roleClause_() {
			return getRuleContext(RoleClause_Context.class,0);
		}
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitGrant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_grant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2014);
			match(GRANT);
			setState(2017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(2015);
				privilegeClause();
				}
				break;
			case 2:
				{
				setState(2016);
				roleClause_();
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

	public static class RevokeContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(PostgreSQLStatementParser.REVOKE, 0); }
		public PrivilegeClauseContext privilegeClause() {
			return getRuleContext(PrivilegeClauseContext.class,0);
		}
		public RoleClause_Context roleClause_() {
			return getRuleContext(RoleClause_Context.class,0);
		}
		public OptionForClause_Context optionForClause_() {
			return getRuleContext(OptionForClause_Context.class,0);
		}
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitRevoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_revoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2019);
			match(REVOKE);
			setState(2021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(2020);
				optionForClause_();
				}
				break;
			}
			setState(2025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(2023);
				privilegeClause();
				}
				break;
			case 2:
				{
				setState(2024);
				roleClause_();
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

	public static class PrivilegeClauseContext extends ParserRuleContext {
		public Privileges_Context privileges_() {
			return getRuleContext(Privileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public OnObjectClauseContext onObjectClause() {
			return getRuleContext(OnObjectClauseContext.class,0);
		}
		public PrivilegeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitPrivilegeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeClauseContext privilegeClause() throws RecognitionException {
		PrivilegeClauseContext _localctx = new PrivilegeClauseContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_privilegeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2027);
			privileges_();
			setState(2028);
			match(ON);
			setState(2029);
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

	public static class RoleClause_Context extends ParserRuleContext {
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public RoleClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitRoleClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoleClause_Context roleClause_() throws RecognitionException {
		RoleClause_Context _localctx = new RoleClause_Context(_ctx, getState());
		enterRule(_localctx, 330, RULE_roleClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2031);
			ignoredIdentifiers_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionForClause_Context extends ParserRuleContext {
		public TerminalNode OPTION() { return getToken(PostgreSQLStatementParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(PostgreSQLStatementParser.FOR, 0); }
		public TerminalNode GRANT() { return getToken(PostgreSQLStatementParser.GRANT, 0); }
		public TerminalNode ADMIN() { return getToken(PostgreSQLStatementParser.ADMIN, 0); }
		public OptionForClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionForClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitOptionForClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionForClause_Context optionForClause_() throws RecognitionException {
		OptionForClause_Context _localctx = new OptionForClause_Context(_ctx, getState());
		enterRule(_localctx, 332, RULE_optionForClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2033);
			_la = _input.LA(1);
			if ( !(_la==GRANT || _la==ADMIN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2034);
			match(OPTION);
			setState(2035);
			match(FOR);
			}
		}
		catch (RecognitionException re) {
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
		public List<PrivilegeType_Context> privilegeType_() {
			return getRuleContexts(PrivilegeType_Context.class);
		}
		public PrivilegeType_Context privilegeType_(int i) {
			return getRuleContext(PrivilegeType_Context.class,i);
		}
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public Privileges_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privileges_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitPrivileges_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Privileges_Context privileges_() throws RecognitionException {
		Privileges_Context _localctx = new Privileges_Context(_ctx, getState());
		enterRule(_localctx, 334, RULE_privileges_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2037);
			privilegeType_();
			setState(2039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2038);
				columnNames();
				}
			}

			setState(2048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2041);
				match(COMMA_);
				setState(2042);
				privilegeType_();
				setState(2044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2043);
					columnNames();
					}
				}

				}
				}
				setState(2050);
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

	public static class PrivilegeType_Context extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(PostgreSQLStatementParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(PostgreSQLStatementParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(PostgreSQLStatementParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(PostgreSQLStatementParser.DELETE, 0); }
		public TerminalNode TRUNCATE() { return getToken(PostgreSQLStatementParser.TRUNCATE, 0); }
		public TerminalNode REFERENCES() { return getToken(PostgreSQLStatementParser.REFERENCES, 0); }
		public TerminalNode TRIGGER() { return getToken(PostgreSQLStatementParser.TRIGGER, 0); }
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode CONNECT() { return getToken(PostgreSQLStatementParser.CONNECT, 0); }
		public TerminalNode TEMPORARY() { return getToken(PostgreSQLStatementParser.TEMPORARY, 0); }
		public TerminalNode TEMP() { return getToken(PostgreSQLStatementParser.TEMP, 0); }
		public TerminalNode EXECUTE() { return getToken(PostgreSQLStatementParser.EXECUTE, 0); }
		public TerminalNode USAGE() { return getToken(PostgreSQLStatementParser.USAGE, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(PostgreSQLStatementParser.PRIVILEGES, 0); }
		public PrivilegeType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeType_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitPrivilegeType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeType_Context privilegeType_() throws RecognitionException {
		PrivilegeType_Context _localctx = new PrivilegeType_Context(_ctx, getState());
		enterRule(_localctx, 336, RULE_privilegeType_);
		int _la;
		try {
			setState(2068);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2051);
				match(SELECT);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2052);
				match(INSERT);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2053);
				match(UPDATE);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2054);
				match(DELETE);
				}
				break;
			case TRUNCATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2055);
				match(TRUNCATE);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 6);
				{
				setState(2056);
				match(REFERENCES);
				}
				break;
			case TRIGGER:
				enterOuterAlt(_localctx, 7);
				{
				setState(2057);
				match(TRIGGER);
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2058);
				match(CREATE);
				}
				break;
			case CONNECT:
				enterOuterAlt(_localctx, 9);
				{
				setState(2059);
				match(CONNECT);
				}
				break;
			case TEMPORARY:
				enterOuterAlt(_localctx, 10);
				{
				setState(2060);
				match(TEMPORARY);
				}
				break;
			case TEMP:
				enterOuterAlt(_localctx, 11);
				{
				setState(2061);
				match(TEMP);
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 12);
				{
				setState(2062);
				match(EXECUTE);
				}
				break;
			case USAGE:
				enterOuterAlt(_localctx, 13);
				{
				setState(2063);
				match(USAGE);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 14);
				{
				setState(2064);
				match(ALL);
				setState(2066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(2065);
					match(PRIVILEGES);
					}
				}

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
		public TerminalNode DATABASE() { return getToken(PostgreSQLStatementParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(PostgreSQLStatementParser.SCHEMA, 0); }
		public TerminalNode DOMAIN() { return getToken(PostgreSQLStatementParser.DOMAIN, 0); }
		public TerminalNode FOREIGN() { return getToken(PostgreSQLStatementParser.FOREIGN, 0); }
		public TerminalNode FUNCTION() { return getToken(PostgreSQLStatementParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(PostgreSQLStatementParser.PROCEDURE, 0); }
		public TerminalNode ROUTINE() { return getToken(PostgreSQLStatementParser.ROUTINE, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode LANGUAGE() { return getToken(PostgreSQLStatementParser.LANGUAGE, 0); }
		public TerminalNode LARGE() { return getToken(PostgreSQLStatementParser.LARGE, 0); }
		public TerminalNode OBJECT() { return getToken(PostgreSQLStatementParser.OBJECT, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public TerminalNode TYPE() { return getToken(PostgreSQLStatementParser.TYPE, 0); }
		public TerminalNode SEQUENCE() { return getToken(PostgreSQLStatementParser.SEQUENCE, 0); }
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public OnObjectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onObjectClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitOnObjectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnObjectClauseContext onObjectClause() throws RecognitionException {
		OnObjectClauseContext _localctx = new OnObjectClauseContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_onObjectClause);
		int _la;
		try {
			setState(2088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2070);
				match(DATABASE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2071);
				match(SCHEMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2072);
				match(DOMAIN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2073);
				match(FOREIGN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2074);
				match(FUNCTION);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2075);
				match(PROCEDURE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2076);
				match(ROUTINE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2077);
				match(ALL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2078);
				match(LANGUAGE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2079);
				match(LARGE);
				setState(2080);
				match(OBJECT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2081);
				match(TABLESPACE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2082);
				match(TYPE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2083);
				match(SEQUENCE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(2084);
					match(TABLE);
					}
				}

				setState(2087);
				tableNames();
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

	public static class CreateUserContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitCreateUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_createUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2090);
			match(CREATE);
			setState(2091);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropUserContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitDropUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_dropUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2093);
			match(DROP);
			setState(2094);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterUserContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAlterUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_alterUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2096);
			match(ALTER);
			setState(2097);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateRoleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitCreateRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_createRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2099);
			match(CREATE);
			setState(2100);
			match(ROLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropRoleContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitDropRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_dropRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2102);
			match(DROP);
			setState(2103);
			match(ROLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterRoleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public AlterRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRole; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitAlterRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterRoleContext alterRole() throws RecognitionException {
		AlterRoleContext _localctx = new AlterRoleContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_alterRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2105);
			match(ALTER);
			setState(2106);
			match(ROLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(PostgreSQLStatementParser.SHOW, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLStatementParser.TRANSACTION, 0); }
		public TerminalNode ISOLATION() { return getToken(PostgreSQLStatementParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(PostgreSQLStatementParser.LEVEL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitShow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2108);
			match(SHOW);
			setState(2114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(2109);
				match(ALL);
				}
				break;
			case 2:
				{
				setState(2110);
				match(TRANSACTION);
				setState(2111);
				match(ISOLATION);
				setState(2112);
				match(LEVEL);
				}
				break;
			case 3:
				{
				setState(2113);
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

	public static class SetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TimeZoneClause_Context timeZoneClause_() {
			return getRuleContext(TimeZoneClause_Context.class,0);
		}
		public ConfigurationParameterClauseContext configurationParameterClause() {
			return getRuleContext(ConfigurationParameterClauseContext.class,0);
		}
		public RuntimeScope_Context runtimeScope_() {
			return getRuleContext(RuntimeScope_Context.class,0);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2116);
			match(SET);
			setState(2118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(2117);
				runtimeScope_();
				}
				break;
			}
			setState(2122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(2120);
				timeZoneClause_();
				}
				break;
			case 2:
				{
				setState(2121);
				configurationParameterClause();
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

	public static class RuntimeScope_Context extends ParserRuleContext {
		public TerminalNode SESSION() { return getToken(PostgreSQLStatementParser.SESSION, 0); }
		public TerminalNode LOCAL() { return getToken(PostgreSQLStatementParser.LOCAL, 0); }
		public RuntimeScope_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runtimeScope_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitRuntimeScope_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuntimeScope_Context runtimeScope_() throws RecognitionException {
		RuntimeScope_Context _localctx = new RuntimeScope_Context(_ctx, getState());
		enterRule(_localctx, 356, RULE_runtimeScope_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2124);
			_la = _input.LA(1);
			if ( !(_la==LOCAL || _la==SESSION) ) {
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

	public static class TimeZoneClause_Context extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(PostgreSQLStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(PostgreSQLStatementParser.ZONE, 0); }
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(PostgreSQLStatementParser.LOCAL, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public TimeZoneClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitTimeZoneClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeZoneClause_Context timeZoneClause_() throws RecognitionException {
		TimeZoneClause_Context _localctx = new TimeZoneClause_Context(_ctx, getState());
		enterRule(_localctx, 358, RULE_timeZoneClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2126);
			match(TIME);
			setState(2127);
			match(ZONE);
			setState(2131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS_:
			case NUMBER_:
				{
				setState(2128);
				numberLiterals();
				}
				break;
			case LOCAL:
				{
				setState(2129);
				match(LOCAL);
				}
				break;
			case DEFAULT:
				{
				setState(2130);
				match(DEFAULT);
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

	public static class ConfigurationParameterClauseContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public ConfigurationParameterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configurationParameterClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitConfigurationParameterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigurationParameterClauseContext configurationParameterClause() throws RecognitionException {
		ConfigurationParameterClauseContext _localctx = new ConfigurationParameterClauseContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_configurationParameterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2133);
			identifier();
			setState(2134);
			_la = _input.LA(1);
			if ( !(_la==EQ_ || _la==TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case IF:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case ADMIN:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case INT2:
			case INT4:
			case INT8:
			case FLOAT4:
			case FLOAT8:
			case MACADDR8:
			case UUID:
			case INT4RANGE:
			case INT8RANGE:
			case IDENTIFIER_:
				{
				setState(2135);
				identifier();
				}
				break;
			case STRING_:
				{
				setState(2136);
				match(STRING_);
				}
				break;
			case DEFAULT:
				{
				setState(2137);
				match(DEFAULT);
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

	public static class ResetParameterContext extends ParserRuleContext {
		public TerminalNode RESET() { return getToken(PostgreSQLStatementParser.RESET, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ResetParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resetParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitResetParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResetParameterContext resetParameter() throws RecognitionException {
		ResetParameterContext _localctx = new ResetParameterContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_resetParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2140);
			match(RESET);
			setState(2143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(2141);
				match(ALL);
				}
				break;
			case T__0:
			case T__1:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case IF:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case ADMIN:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case INT2:
			case INT4:
			case INT8:
			case FLOAT4:
			case FLOAT8:
			case MACADDR8:
			case UUID:
			case INT4RANGE:
			case INT8RANGE:
			case IDENTIFIER_:
				{
				setState(2142);
				identifier();
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(PostgreSQLStatementParser.CALL, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLStatementVisitor ) return ((PostgreSQLStatementVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2145);
			match(CALL);
			}
		}
		catch (RecognitionException re) {
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
		case 62:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 65:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 68:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 69:
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
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 7);
		case 16:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0151\u0866\4\2\t"+
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
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2\u018d\n\2\3\2\5\2\u0190\n\2\3\3\3\3\3\3\3\3\5\3\u0196\n\3\3\3"+
		"\5\3\u0199\n\3\3\3\3\3\5\3\u019d\n\3\3\4\5\4\u01a0\n\4\3\4\3\4\3\4\3\4"+
		"\7\4\u01a6\n\4\f\4\16\4\u01a9\13\4\3\5\5\5\u01ac\n\5\3\5\3\5\3\6\3\6\5"+
		"\6\u01b2\n\6\3\6\3\6\3\6\5\6\u01b7\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\7\t\u01c3\n\t\f\t\16\t\u01c6\13\t\3\n\3\n\3\n\3\n\7\n\u01cc\n"+
		"\n\f\n\16\n\u01cf\13\n\3\n\3\n\3\n\3\n\5\n\u01d5\n\n\3\13\3\13\5\13\u01d9"+
		"\n\13\3\f\3\f\5\f\u01dd\n\f\3\f\3\f\5\f\u01e1\n\f\3\f\5\f\u01e4\n\f\3"+
		"\r\3\r\3\16\3\16\3\16\5\16\u01eb\n\16\3\16\5\16\u01ee\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u01f9\n\17\3\20\3\20\5\20\u01fd"+
		"\n\20\3\20\3\20\3\20\5\20\u0202\n\20\7\20\u0204\n\20\f\20\16\20\u0207"+
		"\13\20\3\21\3\21\3\22\3\22\3\22\5\22\u020e\n\22\3\22\7\22\u0211\n\22\f"+
		"\22\16\22\u0214\13\22\3\23\3\23\5\23\u0218\n\23\3\23\3\23\5\23\u021c\n"+
		"\23\3\23\5\23\u021f\n\23\3\23\5\23\u0222\n\23\3\23\5\23\u0225\n\23\3\23"+
		"\5\23\u0228\n\23\3\23\5\23\u022b\n\23\3\24\3\24\3\25\3\25\5\25\u0231\n"+
		"\25\3\25\3\25\7\25\u0235\n\25\f\25\16\25\u0238\13\25\3\26\3\26\5\26\u023c"+
		"\n\26\3\26\5\26\u023f\n\26\3\26\5\26\u0242\n\26\3\26\5\26\u0245\n\26\3"+
		"\27\3\27\5\27\u0249\n\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\7\33\u0256\n\33\f\33\16\33\u0259\13\33\3\34\3\34\7\34\u025d"+
		"\n\34\f\34\16\34\u0260\13\34\3\35\3\35\5\35\u0264\n\35\3\35\5\35\u0267"+
		"\n\35\3\35\3\35\5\35\u026b\n\35\3\35\3\35\5\35\u026f\n\35\3\35\3\35\3"+
		"\35\3\35\5\35\u0275\n\35\3\36\5\36\u0278\n\36\3\36\5\36\u027b\n\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0281\n\36\3\36\5\36\u0284\n\36\3\36\3\36\5\36\u0288"+
		"\n\36\3\36\3\36\3\36\5\36\u028d\n\36\5\36\u028f\n\36\3\37\3\37\3\37\3"+
		"\37\5\37\u0295\n\37\3 \3 \3 \3!\3!\3!\3!\3!\7!\u029f\n!\f!\16!\u02a2\13"+
		"!\3\"\3\"\3\"\3#\3#\5#\u02a9\n#\3#\3#\5#\u02ad\n#\5#\u02af\n#\3$\3$\3"+
		"$\5$\u02b4\n$\3%\3%\5%\u02b8\n%\3&\3&\3&\5&\u02bd\n&\3\'\3\'\5\'\u02c1"+
		"\n\'\3(\3(\3(\3(\3)\3)\5)\u02c9\n)\3*\3*\3*\3*\3*\3*\5*\u02d1\n*\3+\5"+
		"+\u02d4\n+\3+\3+\5+\u02d8\n+\3+\5+\u02db\n+\3,\5,\u02de\n,\3,\3,\5,\u02e2"+
		"\n,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\62\5\62\u02f1\n"+
		"\62\3\62\3\62\5\62\u02f5\n\62\3\62\5\62\u02f8\n\62\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\5\67\u0307\n\67\3\67\3\67"+
		"\38\38\38\58\u030e\n8\38\38\39\39\3:\3:\3;\5;\u0317\n;\3;\3;\3;\7;\u031c"+
		"\n;\f;\16;\u031f\13;\3;\5;\u0322\n;\3<\3<\3<\3<\7<\u0328\n<\f<\16<\u032b"+
		"\13<\3<\3<\3=\3=\5=\u0331\n=\3>\3>\3?\5?\u0336\n?\3?\3?\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\5@\u0343\n@\3@\3@\3@\3@\7@\u0349\n@\f@\16@\u034c\13@\3A"+
		"\3A\3B\3B\3C\3C\3C\3C\3C\3C\5C\u0358\nC\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\3C\7C\u0367\nC\fC\16C\u036a\13C\3D\3D\3E\3E\5E\u0370\nE\3E\3E\3"+
		"E\3E\3E\5E\u0377\nE\3E\3E\3E\3E\3E\7E\u037e\nE\fE\16E\u0381\13E\3E\3E"+
		"\3E\3E\5E\u0387\nE\3E\3E\3E\3E\3E\3E\3E\5E\u0390\nE\3E\3E\3E\3E\5E\u0396"+
		"\nE\3E\3E\3E\3E\3E\5E\u039d\nE\3E\5E\u03a0\nE\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\7F\u03c3\nF\fF\16F\u03c6\13F\3G\3G\3G\3G\3G\3G\3G\3G\5G\u03d0\n"+
		"G\3G\3G\3G\3G\7G\u03d6\nG\fG\16G\u03d9\13G\3G\3G\3G\5G\u03de\nG\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\5G\u03e8\nG\3G\3G\3G\3G\3G\3G\3G\5G\u03f1\nG\7G\u03f3"+
		"\nG\fG\16G\u03f6\13G\3H\3H\3H\5H\u03fb\nH\3I\3I\3I\5I\u0400\nI\3I\3I\3"+
		"I\7I\u0405\nI\fI\16I\u0408\13I\3I\5I\u040b\nI\3I\3I\5I\u040f\nI\3J\3J"+
		"\3K\3K\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\7M\u0420\nM\fM\16M\u0423\13M\3"+
		"M\3M\3M\3M\5M\u0429\nM\3M\3M\3N\5N\u042e\nN\3N\5N\u0431\nN\3N\5N\u0434"+
		"\nN\3O\3O\3O\3O\3O\7O\u043b\nO\fO\16O\u043e\13O\3P\3P\3P\5P\u0443\nP\3"+
		"Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0451\nQ\3R\3R\3S\3S\3S\3S\3S\3"+
		"T\3T\3T\5T\u045d\nT\3U\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\7V\u046b\nV\f"+
		"V\16V\u046e\13V\3V\3V\5V\u0472\nV\3V\3V\3W\3W\3W\3W\3W\7W\u047b\nW\fW"+
		"\16W\u047e\13W\3W\5W\u0481\nW\3W\3W\3X\3X\3X\3X\3X\3X\5X\u048b\nX\3Y\3"+
		"Y\5Y\u048f\nY\3Y\6Y\u0492\nY\rY\16Y\u0493\3Y\5Y\u0497\nY\3Z\3Z\3Z\3Z\3"+
		"Z\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\7\\\u04a6\n\\\f\\\16\\\u04a9\13\\\3]\3"+
		"]\3]\5]\u04ae\n]\3]\5]\u04b1\n]\3^\3^\5^\u04b5\n^\3^\5^\u04b8\n^\3^\5"+
		"^\u04bb\n^\3^\3^\3^\3^\3^\7^\u04c2\n^\f^\16^\u04c5\13^\3^\3^\5^\u04c9"+
		"\n^\3^\5^\u04cc\n^\5^\u04ce\n^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u0509"+
		"\n_\3`\3`\3`\3`\5`\u050f\n`\3`\3`\3a\3a\3a\5a\u0516\na\3a\3a\3b\3b\5b"+
		"\u051c\nb\3b\3b\5b\u0520\nb\3c\3c\3c\5c\u0525\nc\3d\3d\3d\7d\u052a\nd"+
		"\fd\16d\u052d\13d\3e\3e\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\3f\3f\3f\5f\u053e"+
		"\nf\3f\3f\3f\3f\3g\3g\3g\3g\3g\3g\3g\3h\3h\3h\3h\3h\3h\3i\3i\3i\3i\3i"+
		"\3j\3j\3j\3j\3j\3j\3k\3k\5k\u055e\nk\3k\3k\3k\3l\5l\u0564\nl\3l\3l\5l"+
		"\u0568\nl\3m\3m\3m\5m\u056d\nm\3n\3n\3n\3n\7n\u0573\nn\fn\16n\u0576\13"+
		"n\5n\u0578\nn\3n\3n\3o\3o\3o\3o\3o\7o\u0581\no\fo\16o\u0584\13o\5o\u0586"+
		"\no\3p\3p\3p\5p\u058b\np\3p\7p\u058e\np\fp\16p\u0591\13p\3q\5q\u0594\n"+
		"q\3q\3q\3q\3r\3r\3r\3s\5s\u059d\ns\3s\3s\3s\3s\3s\3s\3s\3s\5s\u05a7\n"+
		"s\3s\3s\3s\3s\3s\3s\5s\u05af\ns\3s\3s\3s\3s\3s\3s\3s\3s\5s\u05b9\ns\3"+
		"s\3s\3s\3s\3s\3s\5s\u05c1\ns\3s\3s\3s\7s\u05c6\ns\fs\16s\u05c9\13s\5s"+
		"\u05cb\ns\3t\3t\3t\3t\5t\u05d1\nt\3u\3u\5u\u05d5\nu\3v\6v\u05d8\nv\rv"+
		"\16v\u05d9\3w\3w\5w\u05de\nw\3w\3w\3w\5w\u05e3\nw\3w\3w\3w\3w\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\3w\3w\5w\u05f5\nw\3x\3x\3x\3x\5x\u05fb\nx\3x\3"+
		"x\3x\5x\u0600\nx\3y\3y\3y\3y\3y\3y\5y\u0608\ny\3z\5z\u060b\nz\3z\5z\u060e"+
		"\nz\3z\3z\5z\u0612\nz\3{\3{\3{\3|\5|\u0618\n|\3|\3|\3|\3}\3}\3}\3}\3}"+
		"\3}\3}\3}\3}\3}\3}\3}\5}\u0629\n}\3}\3}\3}\3}\3}\3}\5}\u0631\n}\3}\3}"+
		"\3}\3}\3}\3}\5}\u0639\n}\3}\3}\3}\7}\u063e\n}\f}\16}\u0641\13}\5}\u0643"+
		"\n}\3~\3~\5~\u0647\n~\3\177\5\177\u064a\n\177\3\u0080\5\u0080\u064d\n"+
		"\u0080\3\u0081\3\u0081\3\u0081\5\u0081\u0652\n\u0081\3\u0082\5\u0082\u0655"+
		"\n\u0082\3\u0083\3\u0083\5\u0083\u0659\n\u0083\3\u0084\5\u0084\u065c\n"+
		"\u0084\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0662\n\u0085\3\u0086\3"+
		"\u0086\3\u0086\5\u0086\u0667\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3"+
		"\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089"+
		"\u067e\n\u0089\3\u008a\3\u008a\3\u008a\7\u008a\u0683\n\u008a\f\u008a\16"+
		"\u008a\u0686\13\u008a\3\u008b\3\u008b\5\u008b\u068a\n\u008b\3\u008c\3"+
		"\u008c\3\u008c\7\u008c\u068f\n\u008c\f\u008c\16\u008c\u0692\13\u008c\3"+
		"\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d"+
		"\u06a5\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u06ac\n"+
		"\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u06bc\n\u008d"+
		"\3\u008d\5\u008d\u06bf\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d"+
		"\u06d7\n\u008d\f\u008d\16\u008d\u06da\13\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d\u06e3\n\u008d\f\u008d\16\u008d"+
		"\u06e6\13\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\5\u008d\u06f8\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\5\u008d\u0702\n\u008d\5\u008d\u0704\n\u008d\3\u008e\3"+
		"\u008e\5\u008e\u0708\n\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u070d\n\u008e"+
		"\3\u008e\3\u008e\3\u008f\3\u008f\5\u008f\u0713\n\u008f\3\u008f\3\u008f"+
		"\3\u008f\5\u008f\u0718\n\u008f\3\u0090\3\u0090\5\u0090\u071c\n\u0090\3"+
		"\u0091\3\u0091\3\u0091\5\u0091\u0721\n\u0091\3\u0091\3\u0091\3\u0091\5"+
		"\u0091\u0726\n\u0091\3\u0091\3\u0091\5\u0091\u072a\n\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\5\u0091\u0740\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\5\u0091\u0748\n\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u074d\n\u0091\f"+
		"\u0091\16\u0091\u0750\13\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u076d\n\u0091\3\u0092\3\u0092"+
		"\5\u0092\u0771\n\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\5\u0093\u077a\n\u0093\3\u0093\5\u0093\u077d\n\u0093\3\u0093\3"+
		"\u0093\5\u0093\u0781\n\u0093\3\u0093\5\u0093\u0784\n\u0093\5\u0093\u0786"+
		"\n\u0093\3\u0094\3\u0094\3\u0094\7\u0094\u078b\n\u0094\f\u0094\16\u0094"+
		"\u078e\13\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\5\u0096\u0798\n\u0096\3\u0096\5\u0096\u079b\n\u0096\3\u0097\3"+
		"\u0097\5\u0097\u079f\n\u0097\3\u0097\3\u0097\5\u0097\u07a3\n\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099"+
		"\3\u0099\3\u009a\3\u009a\5\u009a\u07b2\n\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009d\3\u009d\5\u009d\u07c4\n\u009d\3\u009e\3\u009e"+
		"\3\u009e\7\u009e\u07c9\n\u009e\f\u009e\16\u009e\u07cc\13\u009e\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\5\u009f\u07d2\n\u009f\3\u009f\3\u009f\3\u00a0"+
		"\3\u00a0\3\u00a0\5\u00a0\u07d9\n\u00a0\3\u00a1\3\u00a1\3\u00a2\3\u00a2"+
		"\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u07e4\n\u00a4\3\u00a5"+
		"\3\u00a5\5\u00a5\u07e8\n\u00a5\3\u00a5\3\u00a5\5\u00a5\u07ec\n\u00a5\3"+
		"\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a9\3\u00a9\5\u00a9\u07fa\n\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\5\u00a9\u07ff\n\u00a9\7\u00a9\u0801\n\u00a9\f\u00a9\16\u00a9\u0804\13"+
		"\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0815"+
		"\n\u00aa\5\u00aa\u0817\n\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\5\u00ab\u0828\n\u00ab\3\u00ab\5\u00ab\u082b\n\u00ab\3\u00ac\3"+
		"\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00af"+
		"\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0845\n\u00b2\3\u00b3"+
		"\3\u00b3\5\u00b3\u0849\n\u00b3\3\u00b3\3\u00b3\5\u00b3\u084d\n\u00b3\3"+
		"\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0856\n"+
		"\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u085d\n\u00b6\3"+
		"\u00b7\3\u00b7\3\u00b7\5\u00b7\u0862\n\u00b7\3\u00b8\3\u00b8\3\u00b8\2"+
		"\6~\u0084\u008a\u008c\u00b9\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\2%\4\2QQss\4\2"+
		"[[__\4\2ZZ]^\4\2\u00bd\u00bd\u00cb\u00cb\3\2no\3\2\3\4*\2\63\65\67:<>"+
		"AAFFIKdd~\u0082\u0084\u0084\u0087\u0087\u0089\u008a\u008d\u008d\u008f"+
		"\u008f\u0091\u0094\u009c\u009e\u00a0\u00a1\u00a3\u00a3\u00a5\u00ab\u00ad"+
		"\u00b1\u00b7\u00b7\u00b9\u00ba\u00bc\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cd\u00cf\u00d2\u00d4\u00d4\u00d7\u00d7\u00d9\u00dc\u00de"+
		"\u00f2\u00f4\u0100\u0102\u0112\u0114\u0123\u0125\u0126\u0128\u012a\u012c"+
		"\u012d\u013f\u013f\u0144\u0144\u0147\u0148\4\2\5\6ij\4\2\7\7ll\4\2mo\u00be"+
		"\u00be\3\2st\3\2\31\36\3\2-.\5\2\7\b\20\21\u00b8\u00b8\3\2\u0096\u009a"+
		"\5\2\u00cb\u00cb\u0108\u0108\u0125\u0125\3\2yz\3\2\u0084\u0085\4\2\u00a7"+
		"\u00a7\u00eb\u00eb\3\2\u0119\u011a\3\2\64\65\4\2mm\u009b\u009b\4\2\u00de"+
		"\u00de\u00ed\u00ed\4\2\u00e1\u00e1\u00ee\u00ee\t\2ss\u00d4\u00d4\u00d7"+
		"\u00d7\u00dc\u00dc\u00ec\u00ec\u00f0\u00f0\u0116\u0117\4\2\u00c0\u00c0"+
		"\u010d\u010d\3\2\u009d\u009e\4\2\u00bf\u00bf\u010a\u010a\4\2OO\u0121\u0121"+
		"\4\2\u00f8\u00f8\u011c\u011c\4\288>>\6\2\u00e3\u00e3\u00e5\u00e5\u00f9"+
		"\u00f9\u0106\u0106\4\2;;\u00b7\u00b7\4\2\u00a7\u00a7\u0112\u0112\4\2\31"+
		"\31hh\2\u0977\2\u018c\3\2\2\2\4\u0191\3\2\2\2\6\u019f\3\2\2\2\b\u01ab"+
		"\3\2\2\2\n\u01af\3\2\2\2\f\u01b8\3\2\2\2\16\u01ba\3\2\2\2\20\u01be\3\2"+
		"\2\2\22\u01d4\3\2\2\2\24\u01d8\3\2\2\2\26\u01da\3\2\2\2\30\u01e5\3\2\2"+
		"\2\32\u01e7\3\2\2\2\34\u01f8\3\2\2\2\36\u01fa\3\2\2\2 \u0208\3\2\2\2\""+
		"\u020a\3\2\2\2$\u0215\3\2\2\2&\u022c\3\2\2\2(\u0230\3\2\2\2*\u0244\3\2"+
		"\2\2,\u0248\3\2\2\2.\u024a\3\2\2\2\60\u024c\3\2\2\2\62\u024f\3\2\2\2\64"+
		"\u0252\3\2\2\2\66\u025a\3\2\2\28\u0274\3\2\2\2:\u028e\3\2\2\2<\u0294\3"+
		"\2\2\2>\u0296\3\2\2\2@\u0299\3\2\2\2B\u02a3\3\2\2\2D\u02ae\3\2\2\2F\u02b0"+
		"\3\2\2\2H\u02b7\3\2\2\2J\u02b9\3\2\2\2L\u02c0\3\2\2\2N\u02c2\3\2\2\2P"+
		"\u02c6\3\2\2\2R\u02d0\3\2\2\2T\u02d3\3\2\2\2V\u02dd\3\2\2\2X\u02e3\3\2"+
		"\2\2Z\u02e5\3\2\2\2\\\u02e7\3\2\2\2^\u02e9\3\2\2\2`\u02eb\3\2\2\2b\u02f7"+
		"\3\2\2\2d\u02f9\3\2\2\2f\u02fc\3\2\2\2h\u02ff\3\2\2\2j\u0301\3\2\2\2l"+
		"\u0306\3\2\2\2n\u030d\3\2\2\2p\u0311\3\2\2\2r\u0313\3\2\2\2t\u0316\3\2"+
		"\2\2v\u0323\3\2\2\2x\u0330\3\2\2\2z\u0332\3\2\2\2|\u0335\3\2\2\2~\u0342"+
		"\3\2\2\2\u0080\u034d\3\2\2\2\u0082\u034f\3\2\2\2\u0084\u0351\3\2\2\2\u0086"+
		"\u036b\3\2\2\2\u0088\u039f\3\2\2\2\u008a\u03a1\3\2\2\2\u008c\u03e7\3\2"+
		"\2\2\u008e\u03fa\3\2\2\2\u0090\u03fc\3\2\2\2\u0092\u0410\3\2\2\2\u0094"+
		"\u0412\3\2\2\2\u0096\u0414\3\2\2\2\u0098\u041a\3\2\2\2\u009a\u042d\3\2"+
		"\2\2\u009c\u0435\3\2\2\2\u009e\u043f\3\2\2\2\u00a0\u0450\3\2\2\2\u00a2"+
		"\u0452\3\2\2\2\u00a4\u0454\3\2\2\2\u00a6\u045c\3\2\2\2\u00a8\u045e\3\2"+
		"\2\2\u00aa\u0465\3\2\2\2\u00ac\u0475\3\2\2\2\u00ae\u048a\3\2\2\2\u00b0"+
		"\u048c\3\2\2\2\u00b2\u0498\3\2\2\2\u00b4\u049d\3\2\2\2\u00b6\u04a0\3\2"+
		"\2\2\u00b8\u04ad\3\2\2\2\u00ba\u04cd\3\2\2\2\u00bc\u0508\3\2\2\2\u00be"+
		"\u050a\3\2\2\2\u00c0\u0512\3\2\2\2\u00c2\u0519\3\2\2\2\u00c4\u0521\3\2"+
		"\2\2\u00c6\u0526\3\2\2\2\u00c8\u052e\3\2\2\2\u00ca\u0536\3\2\2\2\u00cc"+
		"\u0543\3\2\2\2\u00ce\u054a\3\2\2\2\u00d0\u0550\3\2\2\2\u00d2\u0555\3\2"+
		"\2\2\u00d4\u055b\3\2\2\2\u00d6\u0567\3\2\2\2\u00d8\u056c\3\2\2\2\u00da"+
		"\u056e\3\2\2\2\u00dc\u0585\3\2\2\2\u00de\u0587\3\2\2\2\u00e0\u0593\3\2"+
		"\2\2\u00e2\u0598\3\2\2\2\u00e4\u05ca\3\2\2\2\u00e6\u05cc\3\2\2\2\u00e8"+
		"\u05d4\3\2\2\2\u00ea\u05d7\3\2\2\2\u00ec\u05f4\3\2\2\2\u00ee\u05ff\3\2"+
		"\2\2\u00f0\u0607\3\2\2\2\u00f2\u060d\3\2\2\2\u00f4\u0613\3\2\2\2\u00f6"+
		"\u0617\3\2\2\2\u00f8\u0642\3\2\2\2\u00fa\u0646\3\2\2\2\u00fc\u0649\3\2"+
		"\2\2\u00fe\u064c\3\2\2\2\u0100\u0651\3\2\2\2\u0102\u0654\3\2\2\2\u0104"+
		"\u0658\3\2\2\2\u0106\u065b\3\2\2\2\u0108\u0661\3\2\2\2\u010a\u0666\3\2"+
		"\2\2\u010c\u0668\3\2\2\2\u010e\u066c\3\2\2\2\u0110\u0674\3\2\2\2\u0112"+
		"\u067f\3\2\2\2\u0114\u0687\3\2\2\2\u0116\u068b\3\2\2\2\u0118\u0703\3\2"+
		"\2\2\u011a\u0705\3\2\2\2\u011c\u0710\3\2\2\2\u011e\u071b\3\2\2\2\u0120"+
		"\u076c\3\2\2\2\u0122\u076e\3\2\2\2\u0124\u0785\3\2\2\2\u0126\u0787\3\2"+
		"\2\2\u0128\u078f\3\2\2\2\u012a\u0793\3\2\2\2\u012c\u079e\3\2\2\2\u012e"+
		"\u07a9\3\2\2\2\u0130\u07ad\3\2\2\2\u0132\u07af\3\2\2\2\u0134\u07b7\3\2"+
		"\2\2\u0136\u07bd\3\2\2\2\u0138\u07c3\3\2\2\2\u013a\u07c5\3\2\2\2\u013c"+
		"\u07cd\3\2\2\2\u013e\u07d8\3\2\2\2\u0140\u07da\3\2\2\2\u0142\u07dc\3\2"+
		"\2\2\u0144\u07de\3\2\2\2\u0146\u07e0\3\2\2\2\u0148\u07e5\3\2\2\2\u014a"+
		"\u07ed\3\2\2\2\u014c\u07f1\3\2\2\2\u014e\u07f3\3\2\2\2\u0150\u07f7\3\2"+
		"\2\2\u0152\u0816\3\2\2\2\u0154\u082a\3\2\2\2\u0156\u082c\3\2\2\2\u0158"+
		"\u082f\3\2\2\2\u015a\u0832\3\2\2\2\u015c\u0835\3\2\2\2\u015e\u0838\3\2"+
		"\2\2\u0160\u083b\3\2\2\2\u0162\u083e\3\2\2\2\u0164\u0846\3\2\2\2\u0166"+
		"\u084e\3\2\2\2\u0168\u0850\3\2\2\2\u016a\u0857\3\2\2\2\u016c\u085e\3\2"+
		"\2\2\u016e\u0863\3\2\2\2\u0170\u018d\5 \21\2\u0171\u018d\5\4\3\2\u0172"+
		"\u018d\5\n\6\2\u0173\u018d\5\26\f\2\u0174\u018d\5\u00caf\2\u0175\u018d"+
		"\5\u00ceh\2\u0176\u018d\5\u00d2j\2\u0177\u018d\5\u00c8e\2\u0178\u018d"+
		"\5\u00ccg\2\u0179\u018d\5\u00d0i\2\u017a\u018d\5\u00d4k\2\u017b\u018d"+
		"\5\u013c\u009f\2\u017c\u018d\5\u013e\u00a0\2\u017d\u018d\5\u0140\u00a1"+
		"\2\u017e\u018d\5\u0142\u00a2\2\u017f\u018d\5\u0144\u00a3\2\u0180\u018d"+
		"\5\u0146\u00a4\2\u0181\u018d\5\u0148\u00a5\2\u0182\u018d\5\u0156\u00ac"+
		"\2\u0183\u018d\5\u0158\u00ad\2\u0184\u018d\5\u015a\u00ae\2\u0185\u018d"+
		"\5\u015c\u00af\2\u0186\u018d\5\u015e\u00b0\2\u0187\u018d\5\u0160\u00b1"+
		"\2\u0188\u018d\5\u0162\u00b2\2\u0189\u018d\5\u0164\u00b3\2\u018a\u018d"+
		"\5\u016c\u00b7\2\u018b\u018d\5\u016e\u00b8\2\u018c\u0170\3\2\2\2\u018c"+
		"\u0171\3\2\2\2\u018c\u0172\3\2\2\2\u018c\u0173\3\2\2\2\u018c\u0174\3\2"+
		"\2\2\u018c\u0175\3\2\2\2\u018c\u0176\3\2\2\2\u018c\u0177\3\2\2\2\u018c"+
		"\u0178\3\2\2\2\u018c\u0179\3\2\2\2\u018c\u017a\3\2\2\2\u018c\u017b\3\2"+
		"\2\2\u018c\u017c\3\2\2\2\u018c\u017d\3\2\2\2\u018c\u017e\3\2\2\2\u018c"+
		"\u017f\3\2\2\2\u018c\u0180\3\2\2\2\u018c\u0181\3\2\2\2\u018c\u0182\3\2"+
		"\2\2\u018c\u0183\3\2\2\2\u018c\u0184\3\2\2\2\u018c\u0185\3\2\2\2\u018c"+
		"\u0186\3\2\2\2\u018c\u0187\3\2\2\2\u018c\u0188\3\2\2\2\u018c\u0189\3\2"+
		"\2\2\u018c\u018a\3\2\2\2\u018c\u018b\3\2\2\2\u018d\u018f\3\2\2\2\u018e"+
		"\u0190\7,\2\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\3\3\2\2\2"+
		"\u0191\u0192\7\63\2\2\u0192\u0193\7M\2\2\u0193\u0198\5l\67\2\u0194\u0196"+
		"\7b\2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0199\5,\27\2\u0198\u0195\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019c\3\2"+
		"\2\2\u019a\u019d\5\6\4\2\u019b\u019d\5\b\5\2\u019c\u019a\3\2\2\2\u019c"+
		"\u019b\3\2\2\2\u019d\5\3\2\2\2\u019e\u01a0\5v<\2\u019f\u019e\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\7N\2\2\u01a2\u01a7\5\22"+
		"\n\2\u01a3\u01a4\7&\2\2\u01a4\u01a6\5\22\n\2\u01a5\u01a3\3\2\2\2\u01a6"+
		"\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\7\3\2\2\2"+
		"\u01a9\u01a7\3\2\2\2\u01aa\u01ac\5v<\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\5 \21\2\u01ae\t\3\2\2\2\u01af"+
		"\u01b1\7\64\2\2\u01b0\u01b2\5\f\7\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3"+
		"\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\5\64\33\2\u01b4\u01b6\5\20\t\2"+
		"\u01b5\u01b7\5> \2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\13\3"+
		"\2\2\2\u01b8\u01b9\7\u0101\2\2\u01b9\r\3\2\2\2\u01ba\u01bb\5n8\2\u01bb"+
		"\u01bc\7\31\2\2\u01bc\u01bd\5\24\13\2\u01bd\17\3\2\2\2\u01be\u01bf\7>"+
		"\2\2\u01bf\u01c4\5\16\b\2\u01c0\u01c1\7&\2\2\u01c1\u01c3\5\16\b\2\u01c2"+
		"\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5\21\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\7 \2\2\u01c8\u01cd"+
		"\5\24\13\2\u01c9\u01ca\7&\2\2\u01ca\u01cc\5\24\13\2\u01cb\u01c9\3\2\2"+
		"\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0"+
		"\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d1\7!\2\2\u01d1\u01d5\3\2\2\2\u01d2"+
		"\u01d3\7 \2\2\u01d3\u01d5\7!\2\2\u01d4\u01c7\3\2\2\2\u01d4\u01d2\3\2\2"+
		"\2\u01d5\23\3\2\2\2\u01d6\u01d9\5~@\2\u01d7\u01d9\7\u009b\2\2\u01d8\u01d6"+
		"\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9\25\3\2\2\2\u01da\u01dc\7\65\2\2\u01db"+
		"\u01dd\5\30\r\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e0\3"+
		"\2\2\2\u01de\u01e1\5\32\16\2\u01df\u01e1\5\34\17\2\u01e0\u01de\3\2\2\2"+
		"\u01e0\u01df\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e4\5> \2\u01e3\u01e2"+
		"\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\27\3\2\2\2\u01e5\u01e6\7\u0101\2\2"+
		"\u01e6\31\3\2\2\2\u01e7\u01e8\7W\2\2\u01e8\u01ed\5l\67\2\u01e9\u01eb\7"+
		"b\2\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ee\5,\27\2\u01ed\u01ea\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\33\3\2\2"+
		"\2\u01ef\u01f0\5\36\20\2\u01f0\u01f1\7W\2\2\u01f1\u01f2\5\64\33\2\u01f2"+
		"\u01f9\3\2\2\2\u01f3\u01f4\7W\2\2\u01f4\u01f5\5\36\20\2\u01f5\u01f6\7"+
		"`\2\2\u01f6\u01f7\5\64\33\2\u01f7\u01f9\3\2\2\2\u01f8\u01ef\3\2\2\2\u01f8"+
		"\u01f3\3\2\2\2\u01f9\35\3\2\2\2\u01fa\u01fc\5l\67\2\u01fb\u01fd\7\26\2"+
		"\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0205\3\2\2\2\u01fe\u01ff"+
		"\7&\2\2\u01ff\u0201\5l\67\2\u0200\u0202\7\26\2\2\u0201\u0200\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u01fe\3\2\2\2\u0204\u0207\3\2"+
		"\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\37\3\2\2\2\u0207\u0205"+
		"\3\2\2\2\u0208\u0209\5\"\22\2\u0209!\3\2\2\2\u020a\u0212\5$\23\2\u020b"+
		"\u020d\7P\2\2\u020c\u020e\t\2\2\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u020f\3\2\2\2\u020f\u0211\5$\23\2\u0210\u020b\3\2\2\2\u0211"+
		"\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213#\3\2\2\2"+
		"\u0214\u0212\3\2\2\2\u0215\u0217\7\62\2\2\u0216\u0218\5&\24\2\u0217\u0216"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\5(\25\2\u021a"+
		"\u021c\5\62\32\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3"+
		"\2\2\2\u021d\u021f\5> \2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\u0221\3\2\2\2\u0220\u0222\5@!\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2\2"+
		"\2\u0222\u0224\3\2\2\2\u0223\u0225\5B\"\2\u0224\u0223\3\2\2\2\u0224\u0225"+
		"\3\2\2\2\u0225\u0227\3\2\2\2\u0226\u0228\5\u00b6\\\2\u0227\u0226\3\2\2"+
		"\2\u0227\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229\u022b\5D#\2\u022a\u0229"+
		"\3\2\2\2\u022a\u022b\3\2\2\2\u022b%\3\2\2\2\u022c\u022d\t\2\2\2\u022d"+
		"\'\3\2\2\2\u022e\u0231\5.\30\2\u022f\u0231\5*\26\2\u0230\u022e\3\2\2\2"+
		"\u0230\u022f\3\2\2\2\u0231\u0236\3\2\2\2\u0232\u0233\7&\2\2\u0233\u0235"+
		"\5*\26\2\u0234\u0232\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237)\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023c\5n8\2\u023a"+
		"\u023c\5~@\2\u023b\u0239\3\2\2\2\u023b\u023a\3\2\2\2\u023c\u0241\3\2\2"+
		"\2\u023d\u023f\7b\2\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240"+
		"\3\2\2\2\u0240\u0242\5,\27\2\u0241\u023e\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"\u0245\3\2\2\2\u0243\u0245\5\60\31\2\u0244\u023b\3\2\2\2\u0244\u0243\3"+
		"\2\2\2\u0245+\3\2\2\2\u0246\u0249\5b\62\2\u0247\u0249\7\u014e\2\2\u0248"+
		"\u0246\3\2\2\2\u0248\u0247\3\2\2\2\u0249-\3\2\2\2\u024a\u024b\7\22\2\2"+
		"\u024b/\3\2\2\2\u024c\u024d\5b\62\2\u024d\u024e\7\26\2\2\u024e\61\3\2"+
		"\2\2\u024f\u0250\7W\2\2\u0250\u0251\5\64\33\2\u0251\63\3\2\2\2\u0252\u0257"+
		"\5\66\34\2\u0253\u0254\7&\2\2\u0254\u0256\5\66\34\2\u0255\u0253\3\2\2"+
		"\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\65"+
		"\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025e\58\35\2\u025b\u025d\5:\36\2\u025c"+
		"\u025b\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2"+
		"\2\2\u025f\67\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0266\5l\67\2\u0262\u0264"+
		"\7b\2\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\3\2\2\2\u0265"+
		"\u0267\5,\27\2\u0266\u0263\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0275\3\2"+
		"\2\2\u0268\u026a\5N(\2\u0269\u026b\7b\2\2\u026a\u0269\3\2\2\2\u026a\u026b"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e\5,\27\2\u026d\u026f\5v<\2\u026e"+
		"\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0275\3\2\2\2\u0270\u0271\7 "+
		"\2\2\u0271\u0272\5\64\33\2\u0272\u0273\7!\2\2\u0273\u0275\3\2\2\2\u0274"+
		"\u0261\3\2\2\2\u0274\u0268\3\2\2\2\u0274\u0270\3\2\2\2\u02759\3\2\2\2"+
		"\u0276\u0278\7X\2\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027a"+
		"\3\2\2\2\u0279\u027b\t\3\2\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027c\u027d\7Y\2\2\u027d\u027e\3\2\2\2\u027e\u0280\58\35"+
		"\2\u027f\u0281\5<\37\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u028f"+
		"\3\2\2\2\u0282\u0284\7X\2\2\u0283\u0282\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\u0287\t\4\2\2\u0286\u0288\7\\\2\2\u0287\u0286\3\2"+
		"\2\2\u0287\u0288\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\7Y\2\2\u028a"+
		"\u028c\58\35\2\u028b\u028d\5<\37\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2"+
		"\2\2\u028d\u028f\3\2\2\2\u028e\u0277\3\2\2\2\u028e\u0283\3\2\2\2\u028f"+
		";\3\2\2\2\u0290\u0291\7c\2\2\u0291\u0295\5~@\2\u0292\u0293\7`\2\2\u0293"+
		"\u0295\5v<\2\u0294\u0290\3\2\2\2\u0294\u0292\3\2\2\2\u0295=\3\2\2\2\u0296"+
		"\u0297\7a\2\2\u0297\u0298\5~@\2\u0298?\3\2\2\2\u0299\u029a\7w\2\2\u029a"+
		"\u029b\7x\2\2\u029b\u02a0\5\u00b8]\2\u029c\u029d\7&\2\2\u029d\u029f\5"+
		"\u00b8]\2\u029e\u029c\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2"+
		"\u02a0\u02a1\3\2\2\2\u02a1A\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a4\7"+
		"{\2\2\u02a4\u02a5\5~@\2\u02a5C\3\2\2\2\u02a6\u02a8\5F$\2\u02a7\u02a9\5"+
		"J&\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02af\3\2\2\2\u02aa"+
		"\u02ac\5J&\2\u02ab\u02ad\5F$\2\u02ac\u02ab\3\2\2\2\u02ac\u02ad\3\2\2\2"+
		"\u02ad\u02af\3\2\2\2\u02ae\u02a6\3\2\2\2\u02ae\u02aa\3\2\2\2\u02afE\3"+
		"\2\2\2\u02b0\u02b3\7|\2\2\u02b1\u02b4\7s\2\2\u02b2\u02b4\5H%\2\u02b3\u02b1"+
		"\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4G\3\2\2\2\u02b5\u02b8\5V,\2\u02b6\u02b8"+
		"\5P)\2\u02b7\u02b5\3\2\2\2\u02b7\u02b6\3\2\2\2\u02b8I\3\2\2\2\u02b9\u02ba"+
		"\7}\2\2\u02ba\u02bc\5L\'\2\u02bb\u02bd\t\5\2\2\u02bc\u02bb\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bdK\3\2\2\2\u02be\u02c1\5V,\2\u02bf\u02c1\5P)\2\u02c0"+
		"\u02be\3\2\2\2\u02c0\u02bf\3\2\2\2\u02c1M\3\2\2\2\u02c2\u02c3\7 \2\2\u02c3"+
		"\u02c4\5\"\22\2\u02c4\u02c5\7!\2\2\u02c5O\3\2\2\2\u02c6\u02c8\7*\2\2\u02c7"+
		"\u02c9\5`\61\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9Q\3\2\2\2"+
		"\u02ca\u02d1\5T+\2\u02cb\u02d1\5V,\2\u02cc\u02d1\5X-\2\u02cd\u02d1\5Z"+
		".\2\u02ce\u02d1\5\\/\2\u02cf\u02d1\5^\60\2\u02d0\u02ca\3\2\2\2\u02d0\u02cb"+
		"\3\2\2\2\u02d0\u02cc\3\2\2\2\u02d0\u02cd\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0"+
		"\u02cf\3\2\2\2\u02d1S\3\2\2\2\u02d2\u02d4\5d\63\2\u02d3\u02d2\3\2\2\2"+
		"\u02d3\u02d4\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d7\7\u014e\2\2\u02d6"+
		"\u02d8\5`\61\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2"+
		"\2\2\u02d9\u02db\5f\64\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db"+
		"U\3\2\2\2\u02dc\u02de\7\21\2\2\u02dd\u02dc\3\2\2\2\u02dd\u02de\3\2\2\2"+
		"\u02de\u02df\3\2\2\2\u02df\u02e1\7\u014f\2\2\u02e0\u02e2\5`\61\2\u02e1"+
		"\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2W\3\2\2\2\u02e3\u02e4\7\u0150"+
		"\2\2\u02e4Y\3\2\2\2\u02e5\u02e6\7\u0151\2\2\u02e6[\3\2\2\2\u02e7\u02e8"+
		"\t\6\2\2\u02e8]\3\2\2\2\u02e9\u02ea\7m\2\2\u02ea_\3\2\2\2\u02eb\u02ec"+
		"\7\17\2\2\u02ec\u02ed\7\17\2\2\u02ed\u02ee\7\u014d\2\2\u02eea\3\2\2\2"+
		"\u02ef\u02f1\5d\63\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2"+
		"\3\2\2\2\u02f2\u02f4\7\u014d\2\2\u02f3\u02f5\5f\64\2\u02f4\u02f3\3\2\2"+
		"\2\u02f4\u02f5\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f8\5h\65\2\u02f7\u02f0"+
		"\3\2\2\2\u02f7\u02f6\3\2\2\2\u02f8c\3\2\2\2\u02f9\u02fa\t\7\2\2\u02fa"+
		"\u02fb\7\n\2\2\u02fbe\3\2\2\2\u02fc\u02fd\7\u0124\2\2\u02fd\u02fe\7\u014e"+
		"\2\2\u02feg\3\2\2\2\u02ff\u0300\t\b\2\2\u0300i\3\2\2\2\u0301\u0302\5b"+
		"\62\2\u0302k\3\2\2\2\u0303\u0304\5p9\2\u0304\u0305\7\25\2\2\u0305\u0307"+
		"\3\2\2\2\u0306\u0303\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u0309\5r:\2\u0309m\3\2\2\2\u030a\u030b\5p9\2\u030b\u030c\7\25\2\2\u030c"+
		"\u030e\3\2\2\2\u030d\u030a\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030f\3\2"+
		"\2\2\u030f\u0310\5r:\2\u0310o\3\2\2\2\u0311\u0312\5b\62\2\u0312q\3\2\2"+
		"\2\u0313\u0314\5b\62\2\u0314s\3\2\2\2\u0315\u0317\7 \2\2\u0316\u0315\3"+
		"\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031d\5l\67\2\u0319"+
		"\u031a\7&\2\2\u031a\u031c\5l\67\2\u031b\u0319\3\2\2\2\u031c\u031f\3\2"+
		"\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0321\3\2\2\2\u031f"+
		"\u031d\3\2\2\2\u0320\u0322\7!\2\2\u0321\u0320\3\2\2\2\u0321\u0322\3\2"+
		"\2\2\u0322u\3\2\2\2\u0323\u0324\7 \2\2\u0324\u0329\5n8\2\u0325\u0326\7"+
		"&\2\2\u0326\u0328\5n8\2\u0327\u0325\3\2\2\2\u0328\u032b\3\2\2\2\u0329"+
		"\u0327\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032c\3\2\2\2\u032b\u0329\3\2"+
		"\2\2\u032c\u032d\7!\2\2\u032dw\3\2\2\2\u032e\u0331\7\u014e\2\2\u032f\u0331"+
		"\5b\62\2\u0330\u032e\3\2\2\2\u0330\u032f\3\2\2\2\u0331y\3\2\2\2\u0332"+
		"\u0333\5b\62\2\u0333{\3\2\2\2\u0334\u0336\7C\2\2\u0335\u0334\3\2\2\2\u0335"+
		"\u0336\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338\7F\2\2\u0338}\3\2\2\2\u0339"+
		"\u033a\b@\1\2\u033a\u033b\5\u0082B\2\u033b\u033c\5~@\5\u033c\u0343\3\2"+
		"\2\2\u033d\u033e\7 \2\2\u033e\u033f\5~@\2\u033f\u0340\7!\2\2\u0340\u0343"+
		"\3\2\2\2\u0341\u0343\5\u0084C\2\u0342\u0339\3\2\2\2\u0342\u033d\3\2\2"+
		"\2\u0342\u0341\3\2\2\2\u0343\u034a\3\2\2\2\u0344\u0345\f\6\2\2\u0345\u0346"+
		"\5\u0080A\2\u0346\u0347\5~@\7\u0347\u0349\3\2\2\2\u0348\u0344\3\2\2\2"+
		"\u0349\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\177"+
		"\3\2\2\2\u034c\u034a\3\2\2\2\u034d\u034e\t\t\2\2\u034e\u0081\3\2\2\2\u034f"+
		"\u0350\t\n\2\2\u0350\u0083\3\2\2\2\u0351\u0352\bC\1\2\u0352\u0353\5\u0088"+
		"E\2\u0353\u0368\3\2\2\2\u0354\u0355\f\7\2\2\u0355\u0357\7k\2\2\u0356\u0358"+
		"\7l\2\2\u0357\u0356\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\3\2\2\2\u0359"+
		"\u0367\t\13\2\2\u035a\u035b\f\6\2\2\u035b\u035c\7\27\2\2\u035c\u0367\5"+
		"\u0088E\2\u035d\u035e\f\5\2\2\u035e\u035f\5\u0086D\2\u035f\u0360\5\u0088"+
		"E\2\u0360\u0367\3\2\2\2\u0361\u0362\f\4\2\2\u0362\u0363\5\u0086D\2\u0363"+
		"\u0364\t\f\2\2\u0364\u0365\5N(\2\u0365\u0367\3\2\2\2\u0366\u0354\3\2\2"+
		"\2\u0366\u035a\3\2\2\2\u0366\u035d\3\2\2\2\u0366\u0361\3\2\2\2\u0367\u036a"+
		"\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u0085\3\2\2\2\u036a"+
		"\u0368\3\2\2\2\u036b\u036c\t\r\2\2\u036c\u0087\3\2\2\2\u036d\u036f\5\u008a"+
		"F\2\u036e\u0370\7l\2\2\u036f\u036e\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0371"+
		"\3\2\2\2\u0371\u0372\7r\2\2\u0372\u0373\5N(\2\u0373\u03a0\3\2\2\2\u0374"+
		"\u0376\5\u008aF\2\u0375\u0377\7l\2\2\u0376\u0375\3\2\2\2\u0376\u0377\3"+
		"\2\2\2\u0377\u0378\3\2\2\2\u0378\u0379\7r\2\2\u0379\u037a\7 \2\2\u037a"+
		"\u037f\5~@\2\u037b\u037c\7&\2\2\u037c\u037e\5~@\2\u037d\u037b\3\2\2\2"+
		"\u037e\u0381\3\2\2\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0382"+
		"\3\2\2\2\u0381\u037f\3\2\2\2\u0382\u0383\7!\2\2\u0383\u03a0\3\2\2\2\u0384"+
		"\u0386\5\u008aF\2\u0385\u0387\7l\2\2\u0386\u0385\3\2\2\2\u0386\u0387\3"+
		"\2\2\2\u0387\u0388\3\2\2\2\u0388\u0389\7q\2\2\u0389\u038a\5\u008aF\2\u038a"+
		"\u038b\7i\2\2\u038b\u038c\5\u0088E\2\u038c\u03a0\3\2\2\2\u038d\u038f\5"+
		"\u008aF\2\u038e\u0390\7l\2\2\u038f\u038e\3\2\2\2\u038f\u0390\3\2\2\2\u0390"+
		"\u0391\3\2\2\2\u0391\u0392\7u\2\2\u0392\u0395\5\u008cG\2\u0393\u0394\7"+
		"\u00b9\2\2\u0394\u0396\5\u008cG\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2"+
		"\2\2\u0396\u03a0\3\2\2\2\u0397\u0398\5\u008aF\2\u0398\u0399\t\16\2\2\u0399"+
		"\u039c\5\u008cG\2\u039a\u039b\7\u00b9\2\2\u039b\u039d\5\u008cG\2\u039c"+
		"\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u03a0\3\2\2\2\u039e\u03a0\5\u008a"+
		"F\2\u039f\u036d\3\2\2\2\u039f\u0374\3\2\2\2\u039f\u0384\3\2\2\2\u039f"+
		"\u038d\3\2\2\2\u039f\u0397\3\2\2\2\u039f\u039e\3\2\2\2\u03a0\u0089\3\2"+
		"\2\2\u03a1\u03a2\bF\1\2\u03a2\u03a3\5\u008cG\2\u03a3\u03c4\3\2\2\2\u03a4"+
		"\u03a5\f\r\2\2\u03a5\u03a6\7\t\2\2\u03a6\u03c3\5\u008aF\16\u03a7\u03a8"+
		"\f\f\2\2\u03a8\u03a9\7\n\2\2\u03a9\u03c3\5\u008aF\r\u03aa\u03ab\f\13\2"+
		"\2\u03ab\u03ac\7\13\2\2\u03ac\u03c3\5\u008aF\f\u03ad\u03ae\f\n\2\2\u03ae"+
		"\u03af\7\f\2\2\u03af\u03c3\5\u008aF\13\u03b0\u03b1\f\t\2\2\u03b1\u03b2"+
		"\7\20\2\2\u03b2\u03c3\5\u008aF\n\u03b3\u03b4\f\b\2\2\u03b4\u03b5\7\21"+
		"\2\2\u03b5\u03c3\5\u008aF\t\u03b6\u03b7\f\7\2\2\u03b7\u03b8\7\22\2\2\u03b8"+
		"\u03c3\5\u008aF\b\u03b9\u03ba\f\6\2\2\u03ba\u03bb\7\23\2\2\u03bb\u03c3"+
		"\5\u008aF\7\u03bc\u03bd\f\5\2\2\u03bd\u03be\7\16\2\2\u03be\u03c3\5\u008a"+
		"F\6\u03bf\u03c0\f\4\2\2\u03c0\u03c1\7\r\2\2\u03c1\u03c3\5\u008aF\5\u03c2"+
		"\u03a4\3\2\2\2\u03c2\u03a7\3\2\2\2\u03c2\u03aa\3\2\2\2\u03c2\u03ad\3\2"+
		"\2\2\u03c2\u03b0\3\2\2\2\u03c2\u03b3\3\2\2\2\u03c2\u03b6\3\2\2\2\u03c2"+
		"\u03b9\3\2\2\2\u03c2\u03bc\3\2\2\2\u03c2\u03bf\3\2\2\2\u03c3\u03c6\3\2"+
		"\2\2\u03c4\u03c2\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u008b\3\2\2\2\u03c6"+
		"\u03c4\3\2\2\2\u03c7\u03c8\bG\1\2\u03c8\u03e8\5\u008eH\2\u03c9\u03e8\5"+
		"P)\2\u03ca\u03e8\5R*\2\u03cb\u03e8\5n8\2\u03cc\u03cd\t\17\2\2\u03cd\u03e8"+
		"\5\u008cG\b\u03ce\u03d0\7\u00bd\2\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3"+
		"\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d2\7 \2\2\u03d2\u03d7\5~@\2\u03d3"+
		"\u03d4\7&\2\2\u03d4\u03d6\5~@\2\u03d5\u03d3\3\2\2\2\u03d6\u03d9\3\2\2"+
		"\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da\3\2\2\2\u03d9\u03d7"+
		"\3\2\2\2\u03da\u03db\7!\2\2\u03db\u03e8\3\2\2\2\u03dc\u03de\7p\2\2\u03dd"+
		"\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e8\5N"+
		"(\2\u03e0\u03e1\7\"\2\2\u03e1\u03e2\5b\62\2\u03e2\u03e3\5~@\2\u03e3\u03e4"+
		"\7#\2\2\u03e4\u03e8\3\2\2\2\u03e5\u03e8\5\u00b0Y\2\u03e6\u03e8\7\u00a4"+
		"\2\2\u03e7\u03c7\3\2\2\2\u03e7\u03c9\3\2\2\2\u03e7\u03ca\3\2\2\2\u03e7"+
		"\u03cb\3\2\2\2\u03e7\u03cc\3\2\2\2\u03e7\u03cf\3\2\2\2\u03e7\u03dd\3\2"+
		"\2\2\u03e7\u03e0\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e6\3\2\2\2\u03e8"+
		"\u03f4\3\2\2\2\u03e9\u03ea\f\t\2\2\u03ea\u03eb\7\6\2\2\u03eb\u03f3\5\u008c"+
		"G\n\u03ec\u03ed\f\n\2\2\u03ed\u03f0\7\u00d3\2\2\u03ee\u03f1\7\u014e\2"+
		"\2\u03ef\u03f1\5b\62\2\u03f0\u03ee\3\2\2\2\u03f0\u03ef\3\2\2\2\u03f1\u03f3"+
		"\3\2\2\2\u03f2\u03e9\3\2\2\2\u03f2\u03ec\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4"+
		"\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u008d\3\2\2\2\u03f6\u03f4\3\2"+
		"\2\2\u03f7\u03fb\5\u0090I\2\u03f8\u03fb\5\u00a6T\2\u03f9\u03fb\5\u00ac"+
		"W\2\u03fa\u03f7\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03f9\3\2\2\2\u03fb"+
		"\u008f\3\2\2\2\u03fc\u03fd\5\u0092J\2\u03fd\u03ff\7 \2\2\u03fe\u0400\5"+
		"\u0094K\2\u03ff\u03fe\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u040a\3\2\2\2"+
		"\u0401\u0406\5~@\2\u0402\u0403\7&\2\2\u0403\u0405\5~@\2\u0404\u0402\3"+
		"\2\2\2\u0405\u0408\3\2\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407"+
		"\u040b\3\2\2\2\u0408\u0406\3\2\2\2\u0409\u040b\7\22\2\2\u040a\u0401\3"+
		"\2\2\2\u040a\u0409\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040c\3\2\2\2\u040c"+
		"\u040e\7!\2\2\u040d\u040f\5\u0096L\2\u040e\u040d\3\2\2\2\u040e\u040f\3"+
		"\2\2\2\u040f\u0091\3\2\2\2\u0410\u0411\t\20\2\2\u0411\u0093\3\2\2\2\u0412"+
		"\u0413\7Q\2\2\u0413\u0095\3\2\2\2\u0414\u0415\7\u00e7\2\2\u0415\u0416"+
		"\7 \2\2\u0416\u0417\7a\2\2\u0417\u0418\5~@\2\u0418\u0419\7!\2\2\u0419"+
		"\u0097\3\2\2\2\u041a\u041b\5b\62\2\u041b\u041c\7 \2\2\u041c\u0421\5~@"+
		"\2\u041d\u041e\7&\2\2\u041e\u0420\5~@\2\u041f\u041d\3\2\2\2\u0420\u0423"+
		"\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0424\3\2\2\2\u0423"+
		"\u0421\3\2\2\2\u0424\u0425\7!\2\2\u0425\u0426\5\u0096L\2\u0426\u0428\7"+
		"\u0102\2\2\u0427\u0429\5b\62\2\u0428\u0427\3\2\2\2\u0428\u0429\3\2\2\2"+
		"\u0429\u042a\3\2\2\2\u042a\u042b\5\u009aN\2\u042b\u0099\3\2\2\2\u042c"+
		"\u042e\5\u009cO\2\u042d\u042c\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u0430"+
		"\3\2\2\2\u042f\u0431\5\u00b6\\\2\u0430\u042f\3\2\2\2\u0430\u0431\3\2\2"+
		"\2\u0431\u0433\3\2\2\2\u0432\u0434\5\u009eP\2\u0433\u0432\3\2\2\2\u0433"+
		"\u0434\3\2\2\2\u0434\u009b\3\2\2\2\u0435\u0436\7\u00bc\2\2\u0436\u0437"+
		"\7x\2\2\u0437\u043c\5~@\2\u0438\u0439\7&\2\2\u0439\u043b\5~@\2\u043a\u0438"+
		"\3\2\2\2\u043b\u043e\3\2\2\2\u043c\u043a\3\2\2\2\u043c\u043d\3\2\2\2\u043d"+
		"\u009d\3\2\2\2\u043e\u043c\3\2\2\2\u043f\u0442\t\21\2\2\u0440\u0443\5"+
		"\u00a0Q\2\u0441\u0443\5\u00a4S\2\u0442\u0440\3\2\2\2\u0442\u0441\3\2\2"+
		"\2\u0443\u009f\3\2\2\2\u0444\u0445\7\u009c\2\2\u0445\u0451\7\u00bd\2\2"+
		"\u0446\u0447\7\u011b\2\2\u0447\u0451\7\u0107\2\2\u0448\u0449\7\u011b\2"+
		"\2\u0449\u0451\7\u00e9\2\2\u044a\u044b\5~@\2\u044b\u044c\7\u0107\2\2\u044c"+
		"\u0451\3\2\2\2\u044d\u044e\5~@\2\u044e\u044f\7\u00e9\2\2\u044f\u0451\3"+
		"\2\2\2\u0450\u0444\3\2\2\2\u0450\u0446\3\2\2\2\u0450\u0448\3\2\2\2\u0450"+
		"\u044a\3\2\2\2\u0450\u044d\3\2\2\2\u0451\u00a1\3\2\2\2\u0452\u0453\5\u00a0"+
		"Q\2\u0453\u00a3\3\2\2\2\u0454\u0455\7q\2\2\u0455\u0456\5\u00a0Q\2\u0456"+
		"\u0457\7i\2\2\u0457\u0458\5\u00a2R\2\u0458\u00a5\3\2\2\2\u0459\u045d\5"+
		"\u0098M\2\u045a\u045d\5\u00a8U\2\u045b\u045d\5\u00aaV\2\u045c\u0459\3"+
		"\2\2\2\u045c\u045a\3\2\2\2\u045c\u045b\3\2\2\2\u045d\u00a7\3\2\2\2\u045e"+
		"\u045f\7T\2\2\u045f\u0460\7 \2\2\u0460\u0461\5~@\2\u0461\u0462\7b\2\2"+
		"\u0462\u0463\5\u00ba^\2\u0463\u0464\7!\2\2\u0464\u00a9\3\2\2\2\u0465\u0466"+
		"\7\u0084\2\2\u0466\u0467\7 \2\2\u0467\u046c\5~@\2\u0468\u0469\7&\2\2\u0469"+
		"\u046b\5~@\2\u046a\u0468\3\2\2\2\u046b\u046e\3\2\2\2\u046c\u046a\3\2\2"+
		"\2\u046c\u046d\3\2\2\2\u046d\u0471\3\2\2\2\u046e\u046c\3\2\2\2\u046f\u0470"+
		"\7`\2\2\u0470\u0472\5\u00c4c\2\u0471\u046f\3\2\2\2\u0471\u0472\3\2\2\2"+
		"\u0472\u0473\3\2\2\2\u0473\u0474\7!\2\2\u0474\u00ab\3\2\2\2\u0475\u0476"+
		"\5\u00aeX\2\u0476\u0480\7 \2\2\u0477\u047c\5~@\2\u0478\u0479\7&\2\2\u0479"+
		"\u047b\5~@\2\u047a\u0478\3\2\2\2\u047b\u047e\3\2\2\2\u047c\u047a\3\2\2"+
		"\2\u047c\u047d\3\2\2\2\u047d\u0481\3\2\2\2\u047e\u047c\3\2\2\2\u047f\u0481"+
		"\7\22\2\2\u0480\u0477\3\2\2\2\u0480\u047f\3\2\2\2\u0480\u0481\3\2\2\2"+
		"\u0481\u0482\3\2\2\2\u0482\u0483\7!\2\2\u0483\u00ad\3\2\2\2\u0484\u048b"+
		"\5b\62\2\u0485\u048b\7d\2\2\u0486\u048b\7\u00d8\2\2\u0487\u048b\7\u008b"+
		"\2\2\u0488\u048b\7\u008c\2\2\u0489\u048b\7\u0087\2\2\u048a\u0484\3\2\2"+
		"\2\u048a\u0485\3\2\2\2\u048a\u0486\3\2\2\2\u048a\u0487\3\2\2\2\u048a\u0488"+
		"\3\2\2\2\u048a\u0489\3\2\2\2\u048b\u00af\3\2\2\2\u048c\u048e\7R\2\2\u048d"+
		"\u048f\5\u008cG\2\u048e\u048d\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0491"+
		"\3\2\2\2\u0490\u0492\5\u00b2Z\2\u0491\u0490\3\2\2\2\u0492\u0493\3\2\2"+
		"\2\u0493\u0491\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0496\3\2\2\2\u0495\u0497"+
		"\5\u00b4[\2\u0496\u0495\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u00b1\3\2\2"+
		"\2\u0498\u0499\7S\2\2\u0499\u049a\5~@\2\u049a\u049b\7f\2\2\u049b\u049c"+
		"\5~@\2\u049c\u00b3\3\2\2\2\u049d\u049e\7e\2\2\u049e\u049f\5~@\2\u049f"+
		"\u00b5\3\2\2\2\u04a0\u04a1\7v\2\2\u04a1\u04a2\7x\2\2\u04a2\u04a7\5\u00b8"+
		"]\2\u04a3\u04a4\7&\2\2\u04a4\u04a6\5\u00b8]\2\u04a5\u04a3\3\2\2\2\u04a6"+
		"\u04a9\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u00b7\3\2"+
		"\2\2\u04a9\u04a7\3\2\2\2\u04aa\u04ae\5n8\2\u04ab\u04ae\5V,\2\u04ac\u04ae"+
		"\5~@\2\u04ad\u04aa\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad\u04ac\3\2\2\2\u04ae"+
		"\u04b0\3\2\2\2\u04af\u04b1\t\22\2\2\u04b0\u04af\3\2\2\2\u04b0\u04b1\3"+
		"\2\2\2\u04b1\u00b9\3\2\2\2\u04b2\u04b4\5\u00bc_\2\u04b3\u04b5\5\u00be"+
		"`\2\u04b4\u04b3\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b7\3\2\2\2\u04b6"+
		"\u04b8\5\u00c0a\2\u04b7\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04ba"+
		"\3\2\2\2\u04b9\u04bb\5\u00c2b\2\u04ba\u04b9\3\2\2\2\u04ba\u04bb\3\2\2"+
		"\2\u04bb\u04ce\3\2\2\2\u04bc\u04bd\5\u00bc_\2\u04bd\u04be\7 \2\2\u04be"+
		"\u04c3\7\u014e\2\2\u04bf\u04c0\7&\2\2\u04c0\u04c2\7\u014e\2\2\u04c1\u04bf"+
		"\3\2\2\2\u04c2\u04c5\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4"+
		"\u04c6\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c6\u04c8\7!\2\2\u04c7\u04c9\5\u00c0"+
		"a\2\u04c8\u04c7\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04cb\3\2\2\2\u04ca"+
		"\u04cc\5\u00c2b\2\u04cb\u04ca\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04ce"+
		"\3\2\2\2\u04cd\u04b2\3\2\2\2\u04cd\u04bc\3\2\2\2\u04ce\u00bb\3\2\2\2\u04cf"+
		"\u0509\7\u0127\2\2\u04d0\u0509\7\u0128\2\2\u04d1\u0509\7\u0129\2\2\u04d2"+
		"\u0509\7\u012a\2\2\u04d3\u0509\7\u00b2\2\2\u04d4\u0509\7\u00ae\2\2\u04d5"+
		"\u0509\7\u00b3\2\2\u04d6\u0509\7\u00b0\2\2\u04d7\u0509\7\u00b4\2\2\u04d8"+
		"\u0509\7\u00af\2\2\u04d9\u0509\7\u012b\2\2\u04da\u0509\7\u012c\2\2\u04db"+
		"\u0509\7\u012d\2\2\u04dc\u04dd\7\u0083\2\2\u04dd\u0509\7H\2\2\u04de\u0509"+
		"\7\u012e\2\2\u04df\u0509\7\u012f\2\2\u04e0\u0509\7\u0130\2\2\u04e1\u0509"+
		"\7\u0131\2\2\u04e2\u0509\7\u0132\2\2\u04e3\u0509\7\u0085\2\2\u04e4\u0509"+
		"\7\u0084\2\2\u04e5\u0509\7\u00b5\2\2\u04e6\u0509\7\u00ab\2\2\u04e7\u0509"+
		"\7\u0133\2\2\u04e8\u0509\7\u008a\2\2\u04e9\u0509\7\u0088\2\2\u04ea\u0509"+
		"\7\u0089\2\2\u04eb\u0509\7\u0087\2\2\u04ec\u0509\7\u0082\2\2\u04ed\u0509"+
		"\7\u0134\2\2\u04ee\u0509\7\u0135\2\2\u04ef\u0509\7\u0136\2\2\u04f0\u0509"+
		"\7\u0137\2\2\u04f1\u0509\7\u0138\2\2\u04f2\u0509\7\u0139\2\2\u04f3\u0509"+
		"\7\u013a\2\2\u04f4\u0509\7\u013b\2\2\u04f5\u0509\7\u013c\2\2\u04f6\u0509"+
		"\7\u013d\2\2\u04f7\u0509\7\u013e\2\2\u04f8\u0509\7\u013f\2\2\u04f9\u0509"+
		"\7\u0140\2\2\u04fa\u0509\7\u0141\2\2\u04fb\u0509\7\u0142\2\2\u04fc\u0509"+
		"\7\u0143\2\2\u04fd\u0509\7\u0144\2\2\u04fe\u0509\7\u0145\2\2\u04ff\u0509"+
		"\7\u0146\2\2\u0500\u0509\7\u0147\2\2\u0501\u0509\7\u0148\2\2\u0502\u0509"+
		"\7\u0149\2\2\u0503\u0509\7\u014a\2\2\u0504\u0509\7\u014b\2\2\u0505\u0509"+
		"\7\u014c\2\2\u0506\u0509\7\u0086\2\2\u0507\u0509\5b\62\2\u0508\u04cf\3"+
		"\2\2\2\u0508\u04d0\3\2\2\2\u0508\u04d1\3\2\2\2\u0508\u04d2\3\2\2\2\u0508"+
		"\u04d3\3\2\2\2\u0508\u04d4\3\2\2\2\u0508\u04d5\3\2\2\2\u0508\u04d6\3\2"+
		"\2\2\u0508\u04d7\3\2\2\2\u0508\u04d8\3\2\2\2\u0508\u04d9\3\2\2\2\u0508"+
		"\u04da\3\2\2\2\u0508\u04db\3\2\2\2\u0508\u04dc\3\2\2\2\u0508\u04de\3\2"+
		"\2\2\u0508\u04df\3\2\2\2\u0508\u04e0\3\2\2\2\u0508\u04e1\3\2\2\2\u0508"+
		"\u04e2\3\2\2\2\u0508\u04e3\3\2\2\2\u0508\u04e4\3\2\2\2\u0508\u04e5\3\2"+
		"\2\2\u0508\u04e6\3\2\2\2\u0508\u04e7\3\2\2\2\u0508\u04e8\3\2\2\2\u0508"+
		"\u04e9\3\2\2\2\u0508\u04ea\3\2\2\2\u0508\u04eb\3\2\2\2\u0508\u04ec\3\2"+
		"\2\2\u0508\u04ed\3\2\2\2\u0508\u04ee\3\2\2\2\u0508\u04ef\3\2\2\2\u0508"+
		"\u04f0\3\2\2\2\u0508\u04f1\3\2\2\2\u0508\u04f2\3\2\2\2\u0508\u04f3\3\2"+
		"\2\2\u0508\u04f4\3\2\2\2\u0508\u04f5\3\2\2\2\u0508\u04f6\3\2\2\2\u0508"+
		"\u04f7\3\2\2\2\u0508\u04f8\3\2\2\2\u0508\u04f9\3\2\2\2\u0508\u04fa\3\2"+
		"\2\2\u0508\u04fb\3\2\2\2\u0508\u04fc\3\2\2\2\u0508\u04fd\3\2\2\2\u0508"+
		"\u04fe\3\2\2\2\u0508\u04ff\3\2\2\2\u0508\u0500\3\2\2\2\u0508\u0501\3\2"+
		"\2\2\u0508\u0502\3\2\2\2\u0508\u0503\3\2\2\2\u0508\u0504\3\2\2\2\u0508"+
		"\u0505\3\2\2\2\u0508\u0506\3\2\2\2\u0508\u0507\3\2\2\2\u0509\u00bd\3\2"+
		"\2\2\u050a\u050b\7 \2\2\u050b\u050e\7\u014f\2\2\u050c\u050d\7&\2\2\u050d"+
		"\u050f\7\u014f\2\2\u050e\u050c\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0510"+
		"\3\2\2\2\u0510\u0511\7!\2\2\u0511\u00bf\3\2\2\2\u0512\u0513\t\23\2\2\u0513"+
		"\u0515\7>\2\2\u0514\u0516\7\31\2\2\u0515\u0514\3\2\2\2\u0515\u0516\3\2"+
		"\2\2\u0516\u0517\3\2\2\2\u0517\u0518\5\u00c4c\2\u0518\u00c1\3\2\2\2\u0519"+
		"\u051b\7\u00d3\2\2\u051a\u051c\7\31\2\2\u051b\u051a\3\2\2\2\u051b\u051c"+
		"\3\2\2\2\u051c\u051f\3\2\2\2\u051d\u0520\7\u014e\2\2\u051e\u0520\5\u00c4"+
		"c\2\u051f\u051d\3\2\2\2\u051f\u051e\3\2\2\2\u0520\u00c3\3\2\2\2\u0521"+
		"\u0524\5b\62\2\u0522\u0523\7\25\2\2\u0523\u0525\5b\62\2\u0524\u0522\3"+
		"\2\2\2\u0524\u0525\3\2\2\2\u0525\u00c5\3\2\2\2\u0526\u052b\5\u00c4c\2"+
		"\u0527\u0528\7&\2\2\u0528\u052a\5\u00c4c\2\u0529\u0527\3\2\2\2\u052a\u052d"+
		"\3\2\2\2\u052b\u0529\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u00c7\3\2\2\2\u052d"+
		"\u052b\3\2\2\2\u052e\u052f\7\66\2\2\u052f\u0530\5\u00d6l\2\u0530\u0531"+
		"\7?\2\2\u0531\u0532\5\u00d8m\2\u0532\u0533\5l\67\2\u0533\u0534\5\u00da"+
		"n\2\u0534\u0535\5\u00fa~\2\u0535\u00c9\3\2\2\2\u0536\u0537\7\66\2\2\u0537"+
		"\u0538\5\u00fc\177\2\u0538\u0539\7A\2\2\u0539\u053d\5\u00fe\u0080\2\u053a"+
		"\u053b\5\u0100\u0081\2\u053b\u053c\5z>\2\u053c\u053e\3\2\2\2\u053d\u053a"+
		"\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0540\7c\2\2\u0540"+
		"\u0541\5\u0102\u0082\2\u0541\u0542\5l\67\2\u0542\u00cb\3\2\2\2\u0543\u0544"+
		"\7\67\2\2\u0544\u0545\7?\2\2\u0545\u0546\5\u0104\u0083\2\u0546\u0547\5"+
		"\u0102\u0082\2\u0547\u0548\5\u0114\u008b\2\u0548\u0549\5\u0108\u0085\2"+
		"\u0549\u00cd\3\2\2\2\u054a\u054b\7\67\2\2\u054b\u054c\7A\2\2\u054c\u054d"+
		"\5\u0138\u009d\2\u054d\u054e\5z>\2\u054e\u054f\5\u010a\u0086\2\u054f\u00cf"+
		"\3\2\2\2\u0550\u0551\78\2\2\u0551\u0552\7?\2\2\u0552\u0553\5\u0104\u0083"+
		"\2\u0553\u0554\5t;\2\u0554\u00d1\3\2\2\2\u0555\u0556\78\2\2\u0556\u0557"+
		"\7A\2\2\u0557\u0558\5\u00fe\u0080\2\u0558\u0559\5\u0138\u009d\2\u0559"+
		"\u055a\5\u013a\u009e\2\u055a\u00d3\3\2\2\2\u055b\u055d\79\2\2\u055c\u055e"+
		"\7?\2\2\u055d\u055c\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055f\3\2\2\2\u055f"+
		"\u0560\5\u0102\u0082\2\u0560\u0561\5\u0112\u008a\2\u0561\u00d5\3\2\2\2"+
		"\u0562\u0564\t\24\2\2\u0563\u0562\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0565"+
		"\3\2\2\2\u0565\u0568\t\25\2\2\u0566\u0568\7\u011c\2\2\u0567\u0563\3\2"+
		"\2\2\u0567\u0566\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u00d7\3\2\2\2\u0569"+
		"\u056a\7d\2\2\u056a\u056b\7l\2\2\u056b\u056d\7p\2\2\u056c\u0569\3\2\2"+
		"\2\u056c\u056d\3\2\2\2\u056d\u00d9\3\2\2\2\u056e\u0577\7 \2\2\u056f\u0574"+
		"\5\u00dco\2\u0570\u0571\7&\2\2\u0571\u0573\5\u00dco\2\u0572\u0570\3\2"+
		"\2\2\u0573\u0576\3\2\2\2\u0574\u0572\3\2\2\2\u0574\u0575\3\2\2\2\u0575"+
		"\u0578\3\2\2\2\u0576\u0574\3\2\2\2\u0577\u056f\3\2\2\2\u0577\u0578\3\2"+
		"\2\2\u0578\u0579\3\2\2\2\u0579\u057a\7!\2\2\u057a\u00db\3\2\2\2\u057b"+
		"\u0586\5\u00dep\2\u057c\u0586\5\u00f6|\2\u057d\u057e\7u\2\2\u057e\u0582"+
		"\5l\67\2\u057f\u0581\5\u00f4{\2\u0580\u057f\3\2\2\2\u0581\u0584\3\2\2"+
		"\2\u0582\u0580\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0586\3\2\2\2\u0584\u0582"+
		"\3\2\2\2\u0585\u057b\3\2\2\2\u0585\u057c\3\2\2\2\u0585\u057d\3\2\2\2\u0586"+
		"\u00dd\3\2\2\2\u0587\u0588\5n8\2\u0588\u058a\5\u00ba^\2\u0589\u058b\5"+
		"\u00c2b\2\u058a\u0589\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058f\3\2\2\2"+
		"\u058c\u058e\5\u00e0q\2\u058d\u058c\3\2\2\2\u058e\u0591\3\2\2\2\u058f"+
		"\u058d\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u00df\3\2\2\2\u0591\u058f\3\2"+
		"\2\2\u0592\u0594\5\u00e2r\2\u0593\u0592\3\2\2\2\u0593\u0594\3\2\2\2\u0594"+
		"\u0595\3\2\2\2\u0595\u0596\5\u00e4s\2\u0596\u0597\5\u00f2z\2\u0597\u00e1"+
		"\3\2\2\2\u0598\u0599\7B\2\2\u0599\u059a\5\u00c4c\2\u059a\u00e3\3\2\2\2"+
		"\u059b\u059d\7l\2\2\u059c\u059b\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059e"+
		"\3\2\2\2\u059e\u05cb\7m\2\2\u059f\u05cb\5\u00e6t\2\u05a0\u05a1\7\u009b"+
		"\2\2\u05a1\u05cb\5\u00e8u\2\u05a2\u05a6\7\u00c2\2\2\u05a3\u05a7\7\u00bf"+
		"\2\2\u05a4\u05a5\7x\2\2\u05a5\u05a7\7\u009b\2\2\u05a6\u05a3\3\2\2\2\u05a6"+
		"\u05a4\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05a9\7b\2\2\u05a9\u05ae\7\u00ec"+
		"\2\2\u05aa\u05ab\7 \2\2\u05ab\u05ac\5\u00eav\2\u05ac\u05ad\7!\2\2\u05ad"+
		"\u05af\3\2\2\2\u05ae\u05aa\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05cb\3\2"+
		"\2\2\u05b0\u05b1\7D\2\2\u05b1\u05cb\5\u00eex\2\u05b2\u05b3\5|?\2\u05b3"+
		"\u05b4\5\u00eex\2\u05b4\u05cb\3\2\2\2\u05b5\u05b6\7\u00c9\2\2\u05b6\u05b8"+
		"\5l\67\2\u05b7\u05b9\5v<\2\u05b8\u05b7\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9"+
		"\u05c0\3\2\2\2\u05ba\u05bb\7\u00fa\2\2\u05bb\u05c1\7Z\2\2\u05bc\u05bd"+
		"\7\u00fa\2\2\u05bd\u05c1\7\u0105\2\2\u05be\u05bf\7\u00fa\2\2\u05bf\u05c1"+
		"\7\u0115\2\2\u05c0\u05ba\3\2\2\2\u05c0\u05bc\3\2\2\2\u05c0\u05be\3\2\2"+
		"\2\u05c0\u05c1\3\2\2\2\u05c1\u05c7\3\2\2\2\u05c2\u05c3\7c\2\2\u05c3\u05c4"+
		"\t\26\2\2\u05c4\u05c6\5\u00f0y\2\u05c5\u05c2\3\2\2\2\u05c6\u05c9\3\2\2"+
		"\2\u05c7\u05c5\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05cb\3\2\2\2\u05c9\u05c7"+
		"\3\2\2\2\u05ca\u059c\3\2\2\2\u05ca\u059f\3\2\2\2\u05ca\u05a0\3\2\2\2\u05ca"+
		"\u05a2\3\2\2\2\u05ca\u05b0\3\2\2\2\u05ca\u05b2\3\2\2\2\u05ca\u05b5\3\2"+
		"\2\2\u05cb\u00e5\3\2\2\2\u05cc\u05cd\7\u00c1\2\2\u05cd\u05d0\5~@\2\u05ce"+
		"\u05cf\7\u00c5\2\2\u05cf\u05d1\7\u00f1\2\2\u05d0\u05ce\3\2\2\2\u05d0\u05d1"+
		"\3\2\2\2\u05d1\u00e7\3\2\2\2\u05d2\u05d5\7\u00d8\2\2\u05d3\u05d5\5~@\2"+
		"\u05d4\u05d2\3\2\2\2\u05d4\u05d3\3\2\2\2\u05d5\u00e9\3\2\2\2\u05d6\u05d8"+
		"\5\u00ecw\2\u05d7\u05d6\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05d7\3\2\2"+
		"\2\u05d9\u05da\3\2\2\2\u05da\u00eb\3\2\2\2\u05db\u05dd\7\u00cc\2\2\u05dc"+
		"\u05de\7O\2\2\u05dd\u05dc\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05df\3\2"+
		"\2\2\u05df\u05f5\7\u014f\2\2\u05e0\u05e2\7\u00ef\2\2\u05e1\u05e3\7x\2"+
		"\2\u05e2\u05e1\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05f5"+
		"\7\u014f\2\2\u05e5\u05e6\7\u00fb\2\2\u05e6\u05f5\7\u014f\2\2\u05e7\u05e8"+
		"\7\u00c5\2\2\u05e8\u05f5\7\u00fb\2\2\u05e9\u05ea\7\u00fc\2\2\u05ea\u05f5"+
		"\7\u014f\2\2\u05eb\u05ec\7\u00c5\2\2\u05ec\u05f5\7\u00fc\2\2\u05ed\u05f5"+
		"\7\u00d9\2\2\u05ee\u05ef\7\u00c5\2\2\u05ef\u05f5\7\u00d9\2\2\u05f0\u05f1"+
		"\7\u00d0\2\2\u05f1\u05f5\7\u014f\2\2\u05f2\u05f3\7\u0103\2\2\u05f3\u05f5"+
		"\7x\2\2\u05f4\u05db\3\2\2\2\u05f4\u05e0\3\2\2\2\u05f4\u05e5\3\2\2\2\u05f4"+
		"\u05e7\3\2\2\2\u05f4\u05e9\3\2\2\2\u05f4\u05eb\3\2\2\2\u05f4\u05ed\3\2"+
		"\2\2\u05f4\u05ee\3\2\2\2\u05f4\u05f0\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f5"+
		"\u00ed\3\2\2\2\u05f6\u05f7\7`\2\2\u05f7\u05f8\7A\2\2\u05f8\u05f9\7\u0118"+
		"\2\2\u05f9\u05fb\5\u00c4c\2\u05fa\u05f6\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb"+
		"\u0600\3\2\2\2\u05fc\u05fd\7\u00f4\2\2\u05fd\u0600\5v<\2\u05fe\u0600\7"+
		"O\2\2\u05ff\u05fa\3\2\2\2\u05ff\u05fc\3\2\2\2\u05ff\u05fe\3\2\2\2\u0600"+
		"\u00ef\3\2\2\2\u0601\u0602\7\u00c5\2\2\u0602\u0608\7\u00cf\2\2\u0603\u0608"+
		"\7\u010d\2\2\u0604\u0608\7\u00c0\2\2\u0605\u0606\7>\2\2\u0606\u0608\t"+
		"\27\2\2\u0607\u0601\3\2\2\2\u0607\u0603\3\2\2\2\u0607\u0604\3\2\2\2\u0607"+
		"\u0605\3\2\2\2\u0608\u00f1\3\2\2\2\u0609\u060b\7l\2\2\u060a\u0609\3\2"+
		"\2\2\u060a\u060b\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060e\7\u00dd\2\2\u060d"+
		"\u060a\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u0611\3\2\2\2\u060f\u0610\7\u00f3"+
		"\2\2\u0610\u0612\t\30\2\2\u0611\u060f\3\2\2\2\u0611\u0612\3\2\2\2\u0612"+
		"\u00f3\3\2\2\2\u0613\u0614\t\31\2\2\u0614\u0615\t\32\2\2\u0615\u00f5\3"+
		"\2\2\2\u0616\u0618\5\u00e2r\2\u0617\u0616\3\2\2\2\u0617\u0618\3\2\2\2"+
		"\u0618\u0619\3\2\2\2\u0619\u061a\5\u00f8}\2\u061a\u061b\5\u00f2z\2\u061b"+
		"\u00f7\3\2\2\2\u061c\u0643\5\u00e6t\2\u061d\u061e\7D\2\2\u061e\u061f\5"+
		"v<\2\u061f\u0620\5\u00eex\2\u0620\u0643\3\2\2\2\u0621\u0622\5|?\2\u0622"+
		"\u0623\5v<\2\u0623\u0624\5\u00eex\2\u0624\u0643\3\2\2\2\u0625\u0628\7"+
		"\u00ba\2\2\u0626\u0627\7`\2\2\u0627\u0629\5\u00c4c\2\u0628\u0626\3\2\2"+
		"\2\u0628\u0629\3\2\2\2\u0629\u0643\3\2\2\2\u062a\u062b\7E\2\2\u062b\u062c"+
		"\7F\2\2\u062c\u062d\5v<\2\u062d\u062e\7\u00c9\2\2\u062e\u0630\5l\67\2"+
		"\u062f\u0631\5v<\2\u0630\u062f\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0638"+
		"\3\2\2\2\u0632\u0633\7\u00fa\2\2\u0633\u0639\7Z\2\2\u0634\u0635\7\u00fa"+
		"\2\2\u0635\u0639\7\u0105\2\2\u0636\u0637\7\u00fa\2\2\u0637\u0639\7\u0115"+
		"\2\2\u0638\u0632\3\2\2\2\u0638\u0634\3\2\2\2\u0638\u0636\3\2\2\2\u0638"+
		"\u0639\3\2\2\2\u0639\u063f\3\2\2\2\u063a\u063b\7c\2\2\u063b\u063c\t\26"+
		"\2\2\u063c\u063e\5\u00f0y\2\u063d\u063a\3\2\2\2\u063e\u0641\3\2\2\2\u063f"+
		"\u063d\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u0643\3\2\2\2\u0641\u063f\3\2"+
		"\2\2\u0642\u061c\3\2\2\2\u0642\u061d\3\2\2\2\u0642\u0621\3\2\2\2\u0642"+
		"\u0625\3\2\2\2\u0642\u062a\3\2\2\2\u0643\u00f9\3\2\2\2\u0644\u0645\7\u00f2"+
		"\2\2\u0645\u0647\5t;\2\u0646\u0644\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u00fb"+
		"\3\2\2\2\u0648\u064a\7D\2\2\u0649\u0648\3\2\2\2\u0649\u064a\3\2\2\2\u064a"+
		"\u00fd\3\2\2\2\u064b\u064d\7\u00d5\2\2\u064c\u064b\3\2\2\2\u064c\u064d"+
		"\3\2\2\2\u064d\u00ff\3\2\2\2\u064e\u064f\7d\2\2\u064f\u0650\7l\2\2\u0650"+
		"\u0652\7p\2\2\u0651\u064e\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0101\3\2"+
		"\2\2\u0653\u0655\7\u0101\2\2\u0654\u0653\3\2\2\2\u0654\u0655\3\2\2\2\u0655"+
		"\u0103\3\2\2\2\u0656\u0657\7d\2\2\u0657\u0659\7p\2\2\u0658\u0656\3\2\2"+
		"\2\u0658\u0659\3\2\2\2\u0659\u0105\3\2\2\2\u065a\u065c\7\22\2\2\u065b"+
		"\u065a\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u0107\3\2\2\2\u065d\u0662\5\u0116"+
		"\u008c\2\u065e\u0662\5\u0132\u009a\2\u065f\u0662\5\u0134\u009b\2\u0660"+
		"\u0662\5\u0136\u009c\2\u0661\u065d\3\2\2\2\u0661\u065e\3\2\2\2\u0661\u065f"+
		"\3\2\2\2\u0661\u0660\3\2\2\2\u0662\u0109\3\2\2\2\u0663\u0667\5\u010c\u0087"+
		"\2\u0664\u0667\5\u010e\u0088\2\u0665\u0667\5\u0110\u0089\2\u0666\u0663"+
		"\3\2\2\2\u0666\u0664\3\2\2\2\u0666\u0665\3\2\2\2\u0667\u010b\3\2\2\2\u0668"+
		"\u0669\7\u0109\2\2\u0669\u066a\7h\2\2\u066a\u066b\5z>\2\u066b\u010d\3"+
		"\2\2\2\u066c\u066d\7\67\2\2\u066d\u066e\7A\2\2\u066e\u066f\5z>\2\u066f"+
		"\u0670\7\u00df\2\2\u0670\u0671\7c\2\2\u0671\u0672\7\u00e4\2\2\u0672\u0673"+
		"\5\u00c4c\2\u0673\u010f\3\2\2\2\u0674\u0675\7\67\2\2\u0675\u0676\7A\2"+
		"\2\u0676\u0677\7s\2\2\u0677\u0678\7r\2\2\u0678\u0679\7\u0118\2\2\u0679"+
		"\u067d\5z>\2\u067a\u067b\7\u0103\2\2\u067b\u067c\7x\2\2\u067c\u067e\5"+
		"\u00c6d\2\u067d\u067a\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0111\3\2\2\2"+
		"\u067f\u0684\5\u0114\u008b\2\u0680\u0681\7&\2\2\u0681\u0683\5\u0114\u008b"+
		"\2\u0682\u0680\3\2\2\2\u0683\u0686\3\2\2\2\u0684\u0682\3\2\2\2\u0684\u0685"+
		"\3\2\2\2\u0685\u0113\3\2\2\2\u0686\u0684\3\2\2\2\u0687\u0689\5l\67\2\u0688"+
		"\u068a\7\22\2\2\u0689\u0688\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u0115\3"+
		"\2\2\2\u068b\u0690\5\u0118\u008d\2\u068c\u068d\7&\2\2\u068d\u068f\5\u0118"+
		"\u008d\2\u068e\u068c\3\2\2\2\u068f\u0692\3\2\2\2\u0690\u068e\3\2\2\2\u0690"+
		"\u0691\3\2\2\2\u0691\u0117\3\2\2\2\u0692\u0690\3\2\2\2\u0693\u0704\5\u011a"+
		"\u008e\2\u0694\u0704\5\u011c\u008f\2\u0695\u0704\5\u0120\u0091\2\u0696"+
		"\u0704\5\u012a\u0096\2\u0697\u0698\7\67\2\2\u0698\u0699\7B\2\2\u0699\u069a"+
		"\5\u00c4c\2\u069a\u069b\5\u00f2z\2\u069b\u0704\3\2\2\2\u069c\u069d\7\u011f"+
		"\2\2\u069d\u069e\7B\2\2\u069e\u0704\5\u00c4c\2\u069f\u06a0\78\2\2\u06a0"+
		"\u06a1\7B\2\2\u06a1\u06a2\5\u0138\u009d\2\u06a2\u06a4\5\u00c4c\2\u06a3"+
		"\u06a5\t\33\2\2\u06a4\u06a3\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u0704\3"+
		"\2\2\2\u06a6\u06a7\t\34\2\2\u06a7\u06ab\7J\2\2\u06a8\u06ac\5\u00c4c\2"+
		"\u06a9\u06ac\7s\2\2\u06aa\u06ac\7\u00ce\2\2\u06ab\u06a8\3\2\2\2\u06ab"+
		"\u06a9\3\2\2\2\u06ab\u06aa\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u0704\3\2"+
		"\2\2\u06ad\u06ae\7\u009d\2\2\u06ae\u06af\t\35\2\2\u06af\u06b0\7J\2\2\u06b0"+
		"\u0704\5\u00c4c\2\u06b1\u06b2\t\34\2\2\u06b2\u06b3\7\u010f\2\2\u06b3\u0704"+
		"\5\u00c4c\2\u06b4\u06b5\7\u009d\2\2\u06b5\u06b6\t\35\2\2\u06b6\u06b7\7"+
		"\u010f\2\2\u06b7\u0704\5\u00c4c\2\u06b8\u06bf\7\u009e\2\2\u06b9\u06bf"+
		"\7\u009d\2\2\u06ba\u06bc\7\u00c5\2\2\u06bb\u06ba\3\2\2\2\u06bb\u06bc\3"+
		"\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u06bf\7\u00ea\2\2\u06be\u06b8\3\2\2\2"+
		"\u06be\u06b9\3\2\2\2\u06be\u06bb\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c1"+
		"\7\u00bd\2\2\u06c1\u06c2\7\u00c4\2\2\u06c2\u0704\7\u0110\2\2\u06c3\u06c4"+
		"\7\u00d2\2\2\u06c4\u06c5\7c\2\2\u06c5\u0704\5z>\2\u06c6\u06c7\7>\2\2\u06c7"+
		"\u06c8\7\u0121\2\2\u06c8\u0704\7\u00d2\2\2\u06c9\u06ca\7>\2\2\u06ca\u06cb"+
		"\t\36\2\2\u06cb\u0704\7\u0100\2\2\u06cc\u06cd\7>\2\2\u06cd\u06ce\7\u0118"+
		"\2\2\u06ce\u0704\5\u00c4c\2\u06cf\u06d0\7>\2\2\u06d0\u0704\t\37\2\2\u06d1"+
		"\u06d2\7>\2\2\u06d2\u06d3\7 \2\2\u06d3\u06d8\5\u012e\u0098\2\u06d4\u06d5"+
		"\7&\2\2\u06d5\u06d7\5\u012e\u0098\2\u06d6\u06d4\3\2\2\2\u06d7\u06da\3"+
		"\2\2\2\u06d8\u06d6\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06db\3\2\2\2\u06da"+
		"\u06d8\3\2\2\2\u06db\u06dc\7!\2\2\u06dc\u0704\3\2\2\2\u06dd\u06de\7\u010b"+
		"\2\2\u06de\u06df\7 \2\2\u06df\u06e4\5\u0130\u0099\2\u06e0\u06e1\7&\2\2"+
		"\u06e1\u06e3\5\u0130\u0099\2\u06e2\u06e0\3\2\2\2\u06e3\u06e6\3\2\2\2\u06e4"+
		"\u06e2\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06e7\3\2\2\2\u06e6\u06e4\3\2"+
		"\2\2\u06e7\u06e8\7!\2\2\u06e8\u0704\3\2\2\2\u06e9\u06ea\7\u00f1\2\2\u06ea"+
		"\u0704\5l\67\2\u06eb\u06ec\7\u00c5\2\2\u06ec\u06ed\7\u00f1\2\2\u06ed\u0704"+
		"\5l\67\2\u06ee\u06ef\7\u0123\2\2\u06ef\u0704\5\u00bc_\2\u06f0\u06f1\7"+
		"l\2\2\u06f1\u0704\7\u0123\2\2\u06f2\u06f3\7\u0104\2\2\u06f3\u06f7\7h\2"+
		"\2\u06f4\u06f8\5\u00c4c\2\u06f5\u06f8\7\u00a4\2\2\u06f6\u06f8\7\u0113"+
		"\2\2\u06f7\u06f4\3\2\2\2\u06f7\u06f5\3\2\2\2\u06f7\u06f6\3\2\2\2\u06f8"+
		"\u0704\3\2\2\2\u06f9\u06fa\7\u010a\2\2\u06fa\u0701\7\u00ec\2\2\u06fb\u0702"+
		"\7\u009b\2\2\u06fc\u06fd\7`\2\2\u06fd\u06fe\7A\2\2\u06fe\u0702\5z>\2\u06ff"+
		"\u0702\7Z\2\2\u0700\u0702\7\u00fd\2\2\u0701\u06fb\3\2\2\2\u0701\u06fc"+
		"\3\2\2\2\u0701\u06ff\3\2\2\2\u0701\u0700\3\2\2\2\u0702\u0704\3\2\2\2\u0703"+
		"\u0693\3\2\2\2\u0703\u0694\3\2\2\2\u0703\u0695\3\2\2\2\u0703\u0696\3\2"+
		"\2\2\u0703\u0697\3\2\2\2\u0703\u069c\3\2\2\2\u0703\u069f\3\2\2\2\u0703"+
		"\u06a6\3\2\2\2\u0703\u06ad\3\2\2\2\u0703\u06b1\3\2\2\2\u0703\u06b4\3\2"+
		"\2\2\u0703\u06be\3\2\2\2\u0703\u06c3\3\2\2\2\u0703\u06c6\3\2\2\2\u0703"+
		"\u06c9\3\2\2\2\u0703\u06cc\3\2\2\2\u0703\u06cf\3\2\2\2\u0703\u06d1\3\2"+
		"\2\2\u0703\u06dd\3\2\2\2\u0703\u06e9\3\2\2\2\u0703\u06eb\3\2\2\2\u0703"+
		"\u06ee\3\2\2\2\u0703\u06f0\3\2\2\2\u0703\u06f2\3\2\2\2\u0703\u06f9\3\2"+
		"\2\2\u0704\u0119\3\2\2\2\u0705\u0707\7=\2\2\u0706\u0708\7@\2\2\u0707\u0706"+
		"\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u070c\3\2\2\2\u0709\u070a\7d\2\2\u070a"+
		"\u070b\7l\2\2\u070b\u070d\7p\2\2\u070c\u0709\3\2\2\2\u070c\u070d\3\2\2"+
		"\2\u070d\u070e\3\2\2\2\u070e\u070f\5\u00dep\2\u070f\u011b\3\2\2\2\u0710"+
		"\u0712\78\2\2\u0711\u0713\7@\2\2\u0712\u0711\3\2\2\2\u0712\u0713\3\2\2"+
		"\2\u0713\u0714\3\2\2\2\u0714\u0715\5\u011e\u0090\2\u0715\u0717\5n8\2\u0716"+
		"\u0718\t\33\2\2\u0717\u0716\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u011d\3"+
		"\2\2\2\u0719\u071a\7d\2\2\u071a\u071c\7p\2\2\u071b\u0719\3\2\2\2\u071b"+
		"\u071c\3\2\2\2\u071c\u011f\3\2\2\2\u071d\u0720\5\u0122\u0092\2\u071e\u071f"+
		"\7>\2\2\u071f\u0721\7\u00da\2\2\u0720\u071e\3\2\2\2\u0720\u0721\3\2\2"+
		"\2\u0721\u0722\3\2\2\2\u0722\u0723\7\u00b1\2\2\u0723\u0725\5\u00ba^\2"+
		"\u0724\u0726\5\u00c2b\2\u0725\u0724\3\2\2\2\u0725\u0726\3\2\2\2\u0726"+
		"\u0729\3\2\2\2\u0727\u0728\7`\2\2\u0728\u072a\5\u008cG\2\u0729\u0727\3"+
		"\2\2\2\u0729\u072a\3\2\2\2\u072a\u076d\3\2\2\2\u072b\u072c\5\u0122\u0092"+
		"\2\u072c\u072d\7>\2\2\u072d\u072e\7\u009b\2\2\u072e\u072f\5~@\2\u072f"+
		"\u076d\3\2\2\2\u0730\u0731\5\u0122\u0092\2\u0731\u0732\78\2\2\u0732\u0733"+
		"\7\u009b\2\2\u0733\u076d\3\2\2\2\u0734\u0735\5\u0122\u0092\2\u0735\u0736"+
		"\t \2\2\u0736\u0737\7l\2\2\u0737\u0738\7m\2\2\u0738\u076d\3\2\2\2\u0739"+
		"\u073a\5\u0122\u0092\2\u073a\u073b\7=\2\2\u073b\u073f\7\u00c2\2\2\u073c"+
		"\u0740\7\u00bf\2\2\u073d\u073e\7x\2\2\u073e\u0740\7\u009b\2\2\u073f\u073c"+
		"\3\2\2\2\u073f\u073d\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0742\7b\2\2\u0742"+
		"\u0747\7\u00ec\2\2\u0743\u0744\7 \2\2\u0744\u0745\5\u00eav\2\u0745\u0746"+
		"\7!\2\2\u0746\u0748\3\2\2\2\u0747\u0743\3\2\2\2\u0747\u0748\3\2\2\2\u0748"+
		"\u076d\3\2\2\2\u0749\u074a\5\u0122\u0092\2\u074a\u074e\5\u0124\u0093\2"+
		"\u074b\u074d\5\u0124\u0093\2\u074c\u074b\3\2\2\2\u074d\u0750\3\2\2\2\u074e"+
		"\u074c\3\2\2\2\u074e\u074f\3\2\2\2\u074f\u076d\3\2\2\2\u0750\u074e\3\2"+
		"\2\2\u0751\u0752\5\u0122\u0092\2\u0752\u0753\78\2\2\u0753\u0754\7\u00ec"+
		"\2\2\u0754\u0755\5\u011e\u0090\2\u0755\u076d\3\2\2\2\u0756\u0757\5\u0122"+
		"\u0092\2\u0757\u0758\7>\2\2\u0758\u0759\7\u0116\2\2\u0759\u075a\7\u014f"+
		"\2\2\u075a\u076d\3\2\2\2\u075b\u075c\5\u0122\u0092\2\u075c\u075d\7>\2"+
		"\2\u075d\u075e\7 \2\2\u075e\u075f\5\u0126\u0094\2\u075f\u0760\7!\2\2\u0760"+
		"\u076d\3\2\2\2\u0761\u0762\5\u0122\u0092\2\u0762\u0763\7\u010b\2\2\u0763"+
		"\u0764\7 \2\2\u0764\u0765\5\u0126\u0094\2\u0765\u0766\7!\2\2\u0766\u076d"+
		"\3\2\2\2\u0767\u0768\5\u0122\u0092\2\u0768\u0769\7>\2\2\u0769\u076a\7"+
		"\u0117\2\2\u076a\u076b\t!\2\2\u076b\u076d\3\2\2\2\u076c\u071d\3\2\2\2"+
		"\u076c\u072b\3\2\2\2\u076c\u0730\3\2\2\2\u076c\u0734\3\2\2\2\u076c\u0739"+
		"\3\2\2\2\u076c\u0749\3\2\2\2\u076c\u0751\3\2\2\2\u076c\u0756\3\2\2\2\u076c"+
		"\u075b\3\2\2\2\u076c\u0761\3\2\2\2\u076c\u0767\3\2\2\2\u076d\u0121\3\2"+
		"\2\2\u076e\u0770\7\67\2\2\u076f\u0771\7@\2\2\u0770\u076f\3\2\2\2\u0770"+
		"\u0771\3\2\2\2\u0771\u0772\3\2\2\2\u0772\u0773\5n8\2\u0773\u0123\3\2\2"+
		"\2\u0774\u077c\7>\2\2\u0775\u0779\7\u00c2\2\2\u0776\u077a\7\u00bf\2\2"+
		"\u0777\u0778\7x\2\2\u0778\u077a\7\u009b\2\2\u0779\u0776\3\2\2\2\u0779"+
		"\u0777\3\2\2\2\u077a\u077d\3\2\2\2\u077b\u077d\5\u00ecw\2\u077c\u0775"+
		"\3\2\2\2\u077c\u077b\3\2\2\2\u077d\u0786\3\2\2\2\u077e\u0783\7\u010c\2"+
		"\2\u077f\u0781\7O\2\2\u0780\u077f\3\2\2\2\u0780\u0781\3\2\2\2\u0781\u0782"+
		"\3\2\2\2\u0782\u0784\7\u014f\2\2\u0783\u0780\3\2\2\2\u0783\u0784\3\2\2"+
		"\2\u0784\u0786\3\2\2\2\u0785\u0774\3\2\2\2\u0785\u077e\3\2\2\2\u0786\u0125"+
		"\3\2\2\2\u0787\u078c\5\u0128\u0095\2\u0788\u0789\7&\2\2\u0789\u078b\5"+
		"\u0128\u0095\2\u078a\u0788\3\2\2\2\u078b\u078e\3\2\2\2\u078c\u078a\3\2"+
		"\2\2\u078c\u078d\3\2\2\2\u078d\u0127\3\2\2\2\u078e\u078c\3\2\2\2\u078f"+
		"\u0790\7\u014d\2\2\u0790\u0791\7\31\2\2\u0791\u0792\5\u008cG\2\u0792\u0129"+
		"\3\2\2\2\u0793\u079a\7=\2\2\u0794\u0797\5\u00f6|\2\u0795\u0796\7l\2\2"+
		"\u0796\u0798\7\u011e\2\2\u0797\u0795\3\2\2\2\u0797\u0798\3\2\2\2\u0798"+
		"\u079b\3\2\2\2\u0799\u079b\5\u012c\u0097\2\u079a\u0794\3\2\2\2\u079a\u0799"+
		"\3\2\2\2\u079b\u012b\3\2\2\2\u079c\u079d\7B\2\2\u079d\u079f\5\u00c4c\2"+
		"\u079e\u079c\3\2\2\2\u079e\u079f\3\2\2\2\u079f\u07a2\3\2\2\2\u07a0\u07a3"+
		"\7D\2\2\u07a1\u07a3\5|?\2\u07a2\u07a0\3\2\2\2\u07a2\u07a1\3\2\2\2\u07a3"+
		"\u07a4\3\2\2\2\u07a4\u07a5\7`\2\2\u07a5\u07a6\7A\2\2\u07a6\u07a7\5z>\2"+
		"\u07a7\u07a8\5\u00f2z\2\u07a8\u012d\3\2\2\2\u07a9\u07aa\5\u0130\u0099"+
		"\2\u07aa\u07ab\7\31\2\2\u07ab\u07ac\5\u008cG\2\u07ac\u012f\3\2\2\2\u07ad"+
		"\u07ae\7\u014d\2\2\u07ae\u0131\3\2\2\2\u07af\u07b1\7\u0109\2\2\u07b0\u07b2"+
		"\7@\2\2\u07b1\u07b0\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3"+
		"\u07b4\5n8\2\u07b4\u07b5\7h\2\2\u07b5\u07b6\5n8\2\u07b6\u0133\3\2\2\2"+
		"\u07b7\u07b8\7\u0109\2\2\u07b8\u07b9\7B\2\2\u07b9\u07ba\5\u00c4c\2\u07ba"+
		"\u07bb\7h\2\2\u07bb\u07bc\5\u00c4c\2\u07bc\u0135\3\2\2\2\u07bd\u07be\7"+
		"\u0109\2\2\u07be\u07bf\7h\2\2\u07bf\u07c0\5b\62\2\u07c0\u0137\3\2\2\2"+
		"\u07c1\u07c2\7d\2\2\u07c2\u07c4\7p\2\2\u07c3\u07c1\3\2\2\2\u07c3\u07c4"+
		"\3\2\2\2\u07c4\u0139\3\2\2\2\u07c5\u07ca\5z>\2\u07c6\u07c7\7&\2\2\u07c7"+
		"\u07c9\5z>\2\u07c8\u07c6\3\2\2\2\u07c9\u07cc\3\2\2\2\u07ca\u07c8\3\2\2"+
		"\2\u07ca\u07cb\3\2\2\2\u07cb\u013b\3\2\2\2\u07cc\u07ca\3\2\2\2\u07cd\u07d1"+
		"\7>\2\2\u07ce\u07cf\7\u0112\2\2\u07cf\u07d0\7\u00d1\2\2\u07d0\u07d2\7"+
		"b\2\2\u07d1\u07ce\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3"+
		"\u07d4\7\u00cd\2\2\u07d4\u013d\3\2\2\2\u07d5\u07d9\7~\2\2\u07d6\u07d7"+
		"\7\u00cc\2\2\u07d7\u07d9\7\u00cd\2\2\u07d8\u07d5\3\2\2\2\u07d8\u07d6\3"+
		"\2\2\2\u07d9\u013f\3\2\2\2\u07da\u07db\7\177\2\2\u07db\u0141\3\2\2\2\u07dc"+
		"\u07dd\7\u0080\2\2\u07dd\u0143\3\2\2\2\u07de\u07df\7\u0081\2\2\u07df\u0145"+
		"\3\2\2\2\u07e0\u07e3\7;\2\2\u07e1\u07e4\5\u014a\u00a6\2\u07e2\u07e4\5"+
		"\u014c\u00a7\2\u07e3\u07e1\3\2\2\2\u07e3\u07e2\3\2\2\2\u07e4\u0147\3\2"+
		"\2\2\u07e5\u07e7\7<\2\2\u07e6\u07e8\5\u014e\u00a8\2\u07e7\u07e6\3\2\2"+
		"\2\u07e7\u07e8\3\2\2\2\u07e8\u07eb\3\2\2\2\u07e9\u07ec\5\u014a\u00a6\2"+
		"\u07ea\u07ec\5\u014c\u00a7\2\u07eb\u07e9\3\2\2\2\u07eb\u07ea\3\2\2\2\u07ec"+
		"\u0149\3\2\2\2\u07ed\u07ee\5\u0150\u00a9\2\u07ee\u07ef\7c\2\2\u07ef\u07f0"+
		"\5\u0154\u00ab\2\u07f0\u014b\3\2\2\2\u07f1\u07f2\5\u00c6d\2\u07f2\u014d"+
		"\3\2\2\2\u07f3\u07f4\t\"\2\2\u07f4\u07f5\7\u00c6\2\2\u07f5\u07f6\7g\2"+
		"\2\u07f6\u014f\3\2\2\2\u07f7\u07f9\5\u0152\u00aa\2\u07f8\u07fa\5v<\2\u07f9"+
		"\u07f8\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u0802\3\2\2\2\u07fb\u07fc\7&"+
		"\2\2\u07fc\u07fe\5\u0152\u00aa\2\u07fd\u07ff\5v<\2\u07fe\u07fd\3\2\2\2"+
		"\u07fe\u07ff\3\2\2\2\u07ff\u0801\3\2\2\2\u0800\u07fb\3\2\2\2\u0801\u0804"+
		"\3\2\2\2\u0802\u0800\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0151\3\2\2\2\u0804"+
		"\u0802\3\2\2\2\u0805\u0817\7\62\2\2\u0806\u0817\7\63\2\2\u0807\u0817\7"+
		"\64\2\2\u0808\u0817\7\65\2\2\u0809\u0817\79\2\2\u080a\u0817\7\u00c9\2"+
		"\2\u080b\u0817\7J\2\2\u080c\u0817\7\66\2\2\u080d\u0817\7\u00d6\2\2\u080e"+
		"\u0817\7\u011a\2\2\u080f\u0817\7\u0119\2\2\u0810\u0817\7\u00e2\2\2\u0811"+
		"\u0817\7\u011d\2\2\u0812\u0814\7s\2\2\u0813\u0815\7\u00c7\2\2\u0814\u0813"+
		"\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u0817\3\2\2\2\u0816\u0805\3\2\2\2\u0816"+
		"\u0806\3\2\2\2\u0816\u0807\3\2\2\2\u0816\u0808\3\2\2\2\u0816\u0809\3\2"+
		"\2\2\u0816\u080a\3\2\2\2\u0816\u080b\3\2\2\2\u0816\u080c\3\2\2\2\u0816"+
		"\u080d\3\2\2\2\u0816\u080e\3\2\2\2\u0816\u080f\3\2\2\2\u0816\u0810\3\2"+
		"\2\2\u0816\u0811\3\2\2\2\u0816\u0812\3\2\2\2\u0817\u0153\3\2\2\2\u0818"+
		"\u082b\7\u00db\2\2\u0819\u082b\7:\2\2\u081a\u082b\7\u00e0\2\2\u081b\u082b"+
		"\7E\2\2\u081c\u082b\7I\2\2\u081d\u082b\7K\2\2\u081e\u082b\7\u010e\2\2"+
		"\u081f\u082b\7s\2\2\u0820\u082b\7\u00f5\2\2\u0821\u0822\7\u00f6\2\2\u0822"+
		"\u082b\7\u00ff\2\2\u0823\u082b\7\u0118\2\2\u0824\u082b\7\u00b1\2\2\u0825"+
		"\u082b\7\u0111\2\2\u0826\u0828\7?\2\2\u0827\u0826\3\2\2\2\u0827\u0828"+
		"\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u082b\5t;\2\u082a\u0818\3\2\2\2\u082a"+
		"\u0819\3\2\2\2\u082a\u081a\3\2\2\2\u082a\u081b\3\2\2\2\u082a\u081c\3\2"+
		"\2\2\u082a\u081d\3\2\2\2\u082a\u081e\3\2\2\2\u082a\u081f\3\2\2\2\u082a"+
		"\u0820\3\2\2\2\u082a\u0821\3\2\2\2\u082a\u0823\3\2\2\2\u082a\u0824\3\2"+
		"\2\2\u082a\u0825\3\2\2\2\u082a\u0827\3\2\2\2\u082b\u0155\3\2\2\2\u082c"+
		"\u082d\7\66\2\2\u082d\u082e\7\u00ce\2\2\u082e\u0157\3\2\2\2\u082f\u0830"+
		"\78\2\2\u0830\u0831\7\u00ce\2\2\u0831\u0159\3\2\2\2\u0832\u0833\7\67\2"+
		"\2\u0833\u0834\7\u00ce\2\2\u0834\u015b\3\2\2\2\u0835\u0836\7\66\2\2\u0836"+
		"\u0837\7\u00ca\2\2\u0837\u015d\3\2\2\2\u0838\u0839\78\2\2\u0839\u083a"+
		"\7\u00ca\2\2\u083a\u015f\3\2\2\2\u083b\u083c\7\67\2\2\u083c\u083d\7\u00ca"+
		"\2\2\u083d\u0161\3\2\2\2\u083e\u0844\7\u0114\2\2\u083f\u0845\7s\2\2\u0840"+
		"\u0841\7\u00cd\2\2\u0841\u0842\7\u00c3\2\2\u0842\u0845\7\u00c4\2\2\u0843"+
		"\u0845\5b\62\2\u0844\u083f\3\2\2\2\u0844\u0840\3\2\2\2\u0844\u0843\3\2"+
		"\2\2\u0845\u0163\3\2\2\2\u0846\u0848\7>\2\2\u0847\u0849\5\u0166\u00b4"+
		"\2\u0848\u0847\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u084c\3\2\2\2\u084a\u084d"+
		"\5\u0168\u00b5\2\u084b\u084d\5\u016a\u00b6\2\u084c\u084a\3\2\2\2\u084c"+
		"\u084b\3\2\2\2\u084d\u0165\3\2\2\2\u084e\u084f\t#\2\2\u084f\u0167\3\2"+
		"\2\2\u0850\u0851\7\u0089\2\2\u0851\u0855\7\u0122\2\2\u0852\u0856\5V,\2"+
		"\u0853\u0856\7\u00a7\2\2\u0854\u0856\7\u009b\2\2\u0855\u0852\3\2\2\2\u0855"+
		"\u0853\3\2\2\2\u0855\u0854\3\2\2\2\u0856\u0169\3\2\2\2\u0857\u0858\5b"+
		"\62\2\u0858\u085c\t$\2\2\u0859\u085d\5b\62\2\u085a\u085d\7\u014e\2\2\u085b"+
		"\u085d\7\u009b\2\2\u085c\u0859\3\2\2\2\u085c\u085a\3\2\2\2\u085c\u085b"+
		"\3\2\2\2\u085d\u016b\3\2\2\2\u085e\u0861\7\u010b\2\2\u085f\u0862\7s\2"+
		"\2\u0860\u0862\5b\62\2\u0861\u085f\3\2\2\2\u0861\u0860\3\2\2\2\u0862\u016d"+
		"\3\2\2\2\u0863\u0864\7\u009f\2\2\u0864\u016f\3\2\2\2\u00f6\u018c\u018f"+
		"\u0195\u0198\u019c\u019f\u01a7\u01ab\u01b1\u01b6\u01c4\u01cd\u01d4\u01d8"+
		"\u01dc\u01e0\u01e3\u01ea\u01ed\u01f8\u01fc\u0201\u0205\u020d\u0212\u0217"+
		"\u021b\u021e\u0221\u0224\u0227\u022a\u0230\u0236\u023b\u023e\u0241\u0244"+
		"\u0248\u0257\u025e\u0263\u0266\u026a\u026e\u0274\u0277\u027a\u0280\u0283"+
		"\u0287\u028c\u028e\u0294\u02a0\u02a8\u02ac\u02ae\u02b3\u02b7\u02bc\u02c0"+
		"\u02c8\u02d0\u02d3\u02d7\u02da\u02dd\u02e1\u02f0\u02f4\u02f7\u0306\u030d"+
		"\u0316\u031d\u0321\u0329\u0330\u0335\u0342\u034a\u0357\u0366\u0368\u036f"+
		"\u0376\u037f\u0386\u038f\u0395\u039c\u039f\u03c2\u03c4\u03cf\u03d7\u03dd"+
		"\u03e7\u03f0\u03f2\u03f4\u03fa\u03ff\u0406\u040a\u040e\u0421\u0428\u042d"+
		"\u0430\u0433\u043c\u0442\u0450\u045c\u046c\u0471\u047c\u0480\u048a\u048e"+
		"\u0493\u0496\u04a7\u04ad\u04b0\u04b4\u04b7\u04ba\u04c3\u04c8\u04cb\u04cd"+
		"\u0508\u050e\u0515\u051b\u051f\u0524\u052b\u053d\u055d\u0563\u0567\u056c"+
		"\u0574\u0577\u0582\u0585\u058a\u058f\u0593\u059c\u05a6\u05ae\u05b8\u05c0"+
		"\u05c7\u05ca\u05d0\u05d4\u05d9\u05dd\u05e2\u05f4\u05fa\u05ff\u0607\u060a"+
		"\u060d\u0611\u0617\u0628\u0630\u0638\u063f\u0642\u0646\u0649\u064c\u0651"+
		"\u0654\u0658\u065b\u0661\u0666\u067d\u0684\u0689\u0690\u06a4\u06ab\u06bb"+
		"\u06be\u06d8\u06e4\u06f7\u0701\u0703\u0707\u070c\u0712\u0717\u071b\u0720"+
		"\u0725\u0729\u073f\u0747\u074e\u076c\u0770\u0779\u077c\u0780\u0783\u0785"+
		"\u078c\u0797\u079a\u079e\u07a2\u07b1\u07c3\u07ca\u07d1\u07d8\u07e3\u07e7"+
		"\u07eb\u07f9\u07fe\u0802\u0814\u0816\u0827\u082a\u0844\u0848\u084c\u0855"+
		"\u085c\u0861";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
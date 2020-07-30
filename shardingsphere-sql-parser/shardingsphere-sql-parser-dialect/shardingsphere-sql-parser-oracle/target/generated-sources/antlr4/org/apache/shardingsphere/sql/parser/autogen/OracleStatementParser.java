// Generated from org\apache\shardingsphere\sql\parser\autogen\OracleStatement.g4 by ANTLR 4.7.2
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
public class OracleStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, AND_=2, OR_=3, NOT_=4, TILDE_=5, VERTICAL_BAR_=6, AMPERSAND_=7, 
		SIGNED_LEFT_SHIFT_=8, SIGNED_RIGHT_SHIFT_=9, CARET_=10, MOD_=11, COLON_=12, 
		PLUS_=13, MINUS_=14, ASTERISK_=15, SLASH_=16, BACKSLASH_=17, DOT_=18, 
		DOT_ASTERISK_=19, SAFE_EQ_=20, DEQ_=21, EQ_=22, NEQ_=23, GT_=24, GTE_=25, 
		LT_=26, LTE_=27, POUND_=28, LP_=29, RP_=30, LBE_=31, RBE_=32, LBT_=33, 
		RBT_=34, COMMA_=35, DQ_=36, SQ_=37, BQ_=38, QUESTION_=39, AT_=40, SEMI_=41, 
		BLOCK_COMMENT=42, INLINE_COMMENT=43, WS=44, SELECT=45, INSERT=46, UPDATE=47, 
		DELETE=48, CREATE=49, ALTER=50, DROP=51, TRUNCATE=52, SCHEMA=53, GRANT=54, 
		REVOKE=55, ADD=56, SET=57, TABLE=58, COLUMN=59, INDEX=60, CONSTRAINT=61, 
		PRIMARY=62, UNIQUE=63, FOREIGN=64, KEY=65, POSITION=66, PRECISION=67, 
		FUNCTION=68, TRIGGER=69, PROCEDURE=70, VIEW=71, INTO=72, VALUES=73, WITH=74, 
		UNION=75, DISTINCT=76, CASE=77, WHEN=78, CAST=79, TRIM=80, SUBSTRING=81, 
		FROM=82, NATURAL=83, JOIN=84, FULL=85, INNER=86, OUTER=87, LEFT=88, RIGHT=89, 
		CROSS=90, USING=91, WHERE=92, AS=93, ON=94, IF=95, ELSE=96, THEN=97, FOR=98, 
		TO=99, AND=100, OR=101, IS=102, NOT=103, NULL=104, TRUE=105, FALSE=106, 
		EXISTS=107, BETWEEN=108, IN=109, ALL=110, ANY=111, LIKE=112, ORDER=113, 
		GROUP=114, BY=115, ASC=116, DESC=117, HAVING=118, LIMIT=119, OFFSET=120, 
		BEGIN=121, COMMIT=122, ROLLBACK=123, SAVEPOINT=124, BOOLEAN=125, DOUBLE=126, 
		CHAR=127, CHARACTER=128, ARRAY=129, INTERVAL=130, DATE=131, TIME=132, 
		TIMESTAMP=133, LOCALTIME=134, LOCALTIMESTAMP=135, YEAR=136, QUARTER=137, 
		MONTH=138, WEEK=139, DAY=140, HOUR=141, MINUTE=142, SECOND=143, MICROSECOND=144, 
		MAX=145, MIN=146, SUM=147, COUNT=148, AVG=149, DEFAULT=150, CURRENT=151, 
		ENABLE=152, DISABLE=153, CALL=154, INSTANCE=155, PRESERVE=156, DO=157, 
		DEFINER=158, CURRENT_USER=159, SQL=160, CASCADED=161, LOCAL=162, CLOSE=163, 
		OPEN=164, NEXT=165, NAME=166, COLLATION=167, NAMES=168, INTEGER=169, REAL=170, 
		DECIMAL=171, TYPE=172, INT=173, SMALLINT=174, NUMERIC=175, FLOAT=176, 
		FOR_GENERATOR=177, BINARY=178, ESCAPE=179, MOD=180, XOR=181, ROW=182, 
		ROWS=183, UNKNOWN=184, ALWAYS=185, CASCADE=186, CHECK=187, GENERATED=188, 
		PRIVILEGES=189, READ=190, WRITE=191, REFERENCES=192, START=193, TRANSACTION=194, 
		USER=195, ROLE=196, VISIBLE=197, INVISIBLE=198, EXECUTE=199, USE=200, 
		DEBUG=201, UNDER=202, FLASHBACK=203, ARCHIVE=204, REFRESH=205, QUERY=206, 
		REWRITE=207, KEEP=208, SEQUENCE=209, INHERIT=210, TRANSLATE=211, MERGE=212, 
		AT=213, BITMAP=214, CACHE=215, NOCACHE=216, CHECKPOINT=217, CONNECT=218, 
		CONSTRAINTS=219, CYCLE=220, NOCYCLE=221, DBTIMEZONE=222, ENCRYPT=223, 
		DECRYPT=224, DEFERRABLE=225, DEFERRED=226, DIRECTORY=227, EDITION=228, 
		ELEMENT=229, END=230, EXCEPTIONS=231, FORCE=232, GLOBAL=233, IDENTIFIED=234, 
		IDENTITY=235, IMMEDIATE=236, INCREMENT=237, INITIALLY=238, INVALIDATE=239, 
		JAVA=240, LEVELS=241, MAXVALUE=242, MINVALUE=243, NOMAXVALUE=244, NOMINVALUE=245, 
		MINING=246, MODEL=247, MODIFY=248, NATIONAL=249, NEW=250, NOORDER=251, 
		NORELY=252, OF=253, ONLY=254, PRIOR=255, PROFILE=256, REF=257, REKEY=258, 
		RELY=259, RENAME=260, REPLACE=261, RESOURCE=262, ROWID=263, SALT=264, 
		SCOPE=265, SORT=266, SOURCE=267, SUBSTITUTABLE=268, TABLESPACE=269, TEMPORARY=270, 
		TRANSLATION=271, TREAT=272, NO=273, UNUSED=274, VALIDATE=275, NOVALIDATE=276, 
		VALUE=277, VARYING=278, VIRTUAL=279, ZONE=280, PUBLIC=281, SESSION=282, 
		COMMENT=283, LOCK=284, ADVISOR=285, ADMINISTER=286, TUNING=287, MANAGE=288, 
		MANAGEMENT=289, OBJECT=290, CLUSTER=291, CONTEXT=292, EXEMPT=293, REDACTION=294, 
		POLICY=295, DATABASE=296, SYSTEM=297, AUDIT=298, LINK=299, ANALYZE=300, 
		DICTIONARY=301, DIMENSION=302, INDEXTYPE=303, EXTERNAL=304, JOB=305, CLASS=306, 
		PROGRAM=307, SCHEDULER=308, LIBRARY=309, LOGMINING=310, MATERIALIZED=311, 
		CUBE=312, MEASURE=313, FOLDER=314, BUILD=315, PROCESS=316, OPERATOR=317, 
		OUTLINE=318, PLUGGABLE=319, CONTAINER=320, SEGMENT=321, RESTRICTED=322, 
		COST=323, SYNONYM=324, BACKUP=325, UNLIMITED=326, BECOME=327, CHANGE=328, 
		NOTIFICATION=329, ACCESS=330, PRIVILEGE=331, PURGE=332, RESUMABLE=333, 
		SYSGUID=334, SYSBACKUP=335, SYSDBA=336, SYSDG=337, SYSKM=338, SYSOPER=339, 
		DBA_RECYCLEBIN=340, FIRST=341, NCHAR=342, RAW=343, VARCHAR=344, VARCHAR2=345, 
		NVARCHAR2=346, LONG=347, BLOB=348, CLOB=349, NCLOB=350, BINARY_FLOAT=351, 
		BINARY_DOUBLE=352, PLS_INTEGER=353, BINARY_INTEGER=354, NUMBER=355, NATURALN=356, 
		POSITIVE=357, POSITIVEN=358, SIGNTYPE=359, SIMPLE_INTEGER=360, BFILE=361, 
		MLSLABEL=362, UROWID=363, JSON=364, DEC=365, IDENTIFIER_=366, STRING_=367, 
		NUMBER_=368, HEX_DIGIT_=369, BIT_NUM_=370;
	public static final int
		RULE_execute = 0, RULE_insert = 1, RULE_insertSingleTable = 2, RULE_insertMultiTable = 3, 
		RULE_multiTableElement = 4, RULE_conditionalInsertClause = 5, RULE_conditionalInsertWhenPart = 6, 
		RULE_conditionalInsertElsePart = 7, RULE_insertIntoClause = 8, RULE_insertValuesClause = 9, 
		RULE_update = 10, RULE_updateSpecification_ = 11, RULE_assignment = 12, 
		RULE_setAssignmentsClause = 13, RULE_assignmentValues = 14, RULE_assignmentValue = 15, 
		RULE_delete = 16, RULE_deleteSpecification_ = 17, RULE_singleTableClause = 18, 
		RULE_multipleTablesClause = 19, RULE_multipleTableNames = 20, RULE_select = 21, 
		RULE_unionClause = 22, RULE_selectClause = 23, RULE_duplicateSpecification = 24, 
		RULE_projections = 25, RULE_projection = 26, RULE_alias = 27, RULE_unqualifiedShorthand = 28, 
		RULE_qualifiedShorthand = 29, RULE_fromClause = 30, RULE_tableReferences = 31, 
		RULE_tableReference = 32, RULE_tableFactor = 33, RULE_joinedTable = 34, 
		RULE_joinSpecification = 35, RULE_whereClause = 36, RULE_groupByClause = 37, 
		RULE_havingClause = 38, RULE_subquery = 39, RULE_parameterMarker = 40, 
		RULE_literals = 41, RULE_stringLiterals = 42, RULE_numberLiterals = 43, 
		RULE_dateTimeLiterals = 44, RULE_hexadecimalLiterals = 45, RULE_bitValueLiterals = 46, 
		RULE_booleanLiterals = 47, RULE_nullValueLiterals = 48, RULE_identifier = 49, 
		RULE_unreservedWord = 50, RULE_schemaName = 51, RULE_tableName = 52, RULE_columnName = 53, 
		RULE_owner = 54, RULE_name = 55, RULE_columnNames = 56, RULE_tableNames = 57, 
		RULE_indexName = 58, RULE_oracleId = 59, RULE_collationName = 60, RULE_dataTypeLength = 61, 
		RULE_primaryKey = 62, RULE_exprs = 63, RULE_exprList = 64, RULE_expr = 65, 
		RULE_logicalOperator = 66, RULE_notOperator_ = 67, RULE_booleanPrimary = 68, 
		RULE_comparisonOperator = 69, RULE_predicate = 70, RULE_bitExpr = 71, 
		RULE_simpleExpr = 72, RULE_functionCall = 73, RULE_aggregationFunction = 74, 
		RULE_aggregationFunctionName = 75, RULE_distinct = 76, RULE_specialFunction = 77, 
		RULE_castFunction = 78, RULE_charFunction = 79, RULE_regularFunction = 80, 
		RULE_regularFunctionName_ = 81, RULE_caseExpression = 82, RULE_caseWhen_ = 83, 
		RULE_caseElse_ = 84, RULE_orderByClause = 85, RULE_orderByItem = 86, RULE_attributeName = 87, 
		RULE_indexTypeName = 88, RULE_simpleExprs = 89, RULE_lobItem = 90, RULE_lobItems = 91, 
		RULE_lobItemList = 92, RULE_dataType = 93, RULE_specialDatatype = 94, 
		RULE_dataTypeName = 95, RULE_datetimeTypeSuffix = 96, RULE_treatFunction = 97, 
		RULE_privateExprOfDb = 98, RULE_caseExpr = 99, RULE_simpleCaseExpr = 100, 
		RULE_searchedCaseExpr = 101, RULE_elseClause = 102, RULE_intervalExpression = 103, 
		RULE_objectAccessExpression = 104, RULE_constructorExpr = 105, RULE_ignoredIdentifier_ = 106, 
		RULE_ignoredIdentifiers_ = 107, RULE_matchNone = 108, RULE_createTable = 109, 
		RULE_createIndex = 110, RULE_alterTable = 111, RULE_alterIndex = 112, 
		RULE_dropTable = 113, RULE_dropIndex = 114, RULE_truncateTable = 115, 
		RULE_createTableSpecification_ = 116, RULE_tablespaceClauseWithParen = 117, 
		RULE_tablespaceClause = 118, RULE_domainIndexClause = 119, RULE_createDefinitionClause = 120, 
		RULE_relationalProperties = 121, RULE_relationalProperty = 122, RULE_columnDefinition = 123, 
		RULE_visibleClause_ = 124, RULE_defaultNullClause_ = 125, RULE_identityClause = 126, 
		RULE_identifyOptions = 127, RULE_identityOption = 128, RULE_encryptionSpecification_ = 129, 
		RULE_inlineConstraint = 130, RULE_referencesClause = 131, RULE_constraintState = 132, 
		RULE_notDeferrable = 133, RULE_initiallyClause = 134, RULE_exceptionsClause = 135, 
		RULE_usingIndexClause = 136, RULE_createIndexClause_ = 137, RULE_inlineRefConstraint = 138, 
		RULE_virtualColumnDefinition = 139, RULE_outOfLineConstraint = 140, RULE_outOfLineRefConstraint = 141, 
		RULE_createIndexSpecification_ = 142, RULE_tableIndexClause = 143, RULE_indexExpressions_ = 144, 
		RULE_indexExpression_ = 145, RULE_bitmapJoinIndexClause_ = 146, RULE_columnSortsClause_ = 147, 
		RULE_columnSortClause_ = 148, RULE_createIndexDefinitionClause = 149, 
		RULE_tableAlias = 150, RULE_alterDefinitionClause = 151, RULE_alterTableProperties = 152, 
		RULE_renameTableSpecification_ = 153, RULE_columnClauses = 154, RULE_operateColumnClause = 155, 
		RULE_addColumnSpecification = 156, RULE_columnOrVirtualDefinitions = 157, 
		RULE_columnOrVirtualDefinition = 158, RULE_columnProperties = 159, RULE_columnProperty = 160, 
		RULE_objectTypeColProperties = 161, RULE_substitutableColumnClause = 162, 
		RULE_modifyColumnSpecification = 163, RULE_modifyColProperties = 164, 
		RULE_modifyColSubstitutable = 165, RULE_dropColumnClause = 166, RULE_dropColumnSpecification = 167, 
		RULE_columnOrColumnList = 168, RULE_cascadeOrInvalidate = 169, RULE_checkpointNumber = 170, 
		RULE_renameColumnClause = 171, RULE_constraintClauses = 172, RULE_addConstraintSpecification = 173, 
		RULE_modifyConstraintClause = 174, RULE_constraintWithName = 175, RULE_constraintOption = 176, 
		RULE_constraintPrimaryOrUnique = 177, RULE_renameConstraintClause = 178, 
		RULE_dropConstraintClause = 179, RULE_alterExternalTable = 180, RULE_objectProperties = 181, 
		RULE_objectProperty = 182, RULE_renameIndexClause_ = 183, RULE_setTransaction = 184, 
		RULE_commit = 185, RULE_rollback = 186, RULE_savepoint = 187, RULE_grant = 188, 
		RULE_revoke = 189, RULE_objectPrivilegeClause = 190, RULE_systemPrivilegeClause_ = 191, 
		RULE_roleClause_ = 192, RULE_objectPrivileges_ = 193, RULE_objectPrivilegeType_ = 194, 
		RULE_onObjectClause = 195, RULE_systemPrivilege_ = 196, RULE_systemPrivilegeOperation_ = 197, 
		RULE_advisorFrameworkSystemPrivilege_ = 198, RULE_clustersSystemPrivilege_ = 199, 
		RULE_contextsSystemPrivilege_ = 200, RULE_dataRedactionSystemPrivilege_ = 201, 
		RULE_databaseSystemPrivilege_ = 202, RULE_databaseLinksSystemPrivilege_ = 203, 
		RULE_debuggingSystemPrivilege_ = 204, RULE_dictionariesSystemPrivilege_ = 205, 
		RULE_dimensionsSystemPrivilege_ = 206, RULE_directoriesSystemPrivilege_ = 207, 
		RULE_editionsSystemPrivilege_ = 208, RULE_flashbackDataArchivesPrivilege_ = 209, 
		RULE_indexesSystemPrivilege_ = 210, RULE_indexTypesSystemPrivilege_ = 211, 
		RULE_jobSchedulerObjectsSystemPrivilege_ = 212, RULE_keyManagementFrameworkSystemPrivilege_ = 213, 
		RULE_librariesFrameworkSystemPrivilege_ = 214, RULE_logminerFrameworkSystemPrivilege_ = 215, 
		RULE_materizlizedViewsSystemPrivilege_ = 216, RULE_miningModelsSystemPrivilege_ = 217, 
		RULE_olapCubesSystemPrivilege_ = 218, RULE_olapCubeMeasureFoldersSystemPrivilege_ = 219, 
		RULE_olapCubeDiminsionsSystemPrivilege_ = 220, RULE_olapCubeBuildProcessesSystemPrivilege_ = 221, 
		RULE_operatorsSystemPrivilege_ = 222, RULE_outlinesSystemPrivilege_ = 223, 
		RULE_planManagementSystemPrivilege_ = 224, RULE_pluggableDatabasesSystemPrivilege_ = 225, 
		RULE_proceduresSystemPrivilege_ = 226, RULE_profilesSystemPrivilege_ = 227, 
		RULE_rolesSystemPrivilege_ = 228, RULE_rollbackSegmentsSystemPrivilege_ = 229, 
		RULE_sequencesSystemPrivilege_ = 230, RULE_sessionsSystemPrivilege_ = 231, 
		RULE_sqlTranslationProfilesSystemPrivilege_ = 232, RULE_synonymsSystemPrivilege_ = 233, 
		RULE_tablesSystemPrivilege_ = 234, RULE_tablespacesSystemPrivilege_ = 235, 
		RULE_triggersSystemPrivilege_ = 236, RULE_typesSystemPrivilege_ = 237, 
		RULE_usersSystemPrivilege_ = 238, RULE_viewsSystemPrivilege_ = 239, RULE_miscellaneousSystemPrivilege_ = 240, 
		RULE_createUser = 241, RULE_dropUser = 242, RULE_alterUser = 243, RULE_createRole = 244, 
		RULE_dropRole = 245, RULE_alterRole = 246, RULE_call = 247;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "insert", "insertSingleTable", "insertMultiTable", "multiTableElement", 
			"conditionalInsertClause", "conditionalInsertWhenPart", "conditionalInsertElsePart", 
			"insertIntoClause", "insertValuesClause", "update", "updateSpecification_", 
			"assignment", "setAssignmentsClause", "assignmentValues", "assignmentValue", 
			"delete", "deleteSpecification_", "singleTableClause", "multipleTablesClause", 
			"multipleTableNames", "select", "unionClause", "selectClause", "duplicateSpecification", 
			"projections", "projection", "alias", "unqualifiedShorthand", "qualifiedShorthand", 
			"fromClause", "tableReferences", "tableReference", "tableFactor", "joinedTable", 
			"joinSpecification", "whereClause", "groupByClause", "havingClause", 
			"subquery", "parameterMarker", "literals", "stringLiterals", "numberLiterals", 
			"dateTimeLiterals", "hexadecimalLiterals", "bitValueLiterals", "booleanLiterals", 
			"nullValueLiterals", "identifier", "unreservedWord", "schemaName", "tableName", 
			"columnName", "owner", "name", "columnNames", "tableNames", "indexName", 
			"oracleId", "collationName", "dataTypeLength", "primaryKey", "exprs", 
			"exprList", "expr", "logicalOperator", "notOperator_", "booleanPrimary", 
			"comparisonOperator", "predicate", "bitExpr", "simpleExpr", "functionCall", 
			"aggregationFunction", "aggregationFunctionName", "distinct", "specialFunction", 
			"castFunction", "charFunction", "regularFunction", "regularFunctionName_", 
			"caseExpression", "caseWhen_", "caseElse_", "orderByClause", "orderByItem", 
			"attributeName", "indexTypeName", "simpleExprs", "lobItem", "lobItems", 
			"lobItemList", "dataType", "specialDatatype", "dataTypeName", "datetimeTypeSuffix", 
			"treatFunction", "privateExprOfDb", "caseExpr", "simpleCaseExpr", "searchedCaseExpr", 
			"elseClause", "intervalExpression", "objectAccessExpression", "constructorExpr", 
			"ignoredIdentifier_", "ignoredIdentifiers_", "matchNone", "createTable", 
			"createIndex", "alterTable", "alterIndex", "dropTable", "dropIndex", 
			"truncateTable", "createTableSpecification_", "tablespaceClauseWithParen", 
			"tablespaceClause", "domainIndexClause", "createDefinitionClause", "relationalProperties", 
			"relationalProperty", "columnDefinition", "visibleClause_", "defaultNullClause_", 
			"identityClause", "identifyOptions", "identityOption", "encryptionSpecification_", 
			"inlineConstraint", "referencesClause", "constraintState", "notDeferrable", 
			"initiallyClause", "exceptionsClause", "usingIndexClause", "createIndexClause_", 
			"inlineRefConstraint", "virtualColumnDefinition", "outOfLineConstraint", 
			"outOfLineRefConstraint", "createIndexSpecification_", "tableIndexClause", 
			"indexExpressions_", "indexExpression_", "bitmapJoinIndexClause_", "columnSortsClause_", 
			"columnSortClause_", "createIndexDefinitionClause", "tableAlias", "alterDefinitionClause", 
			"alterTableProperties", "renameTableSpecification_", "columnClauses", 
			"operateColumnClause", "addColumnSpecification", "columnOrVirtualDefinitions", 
			"columnOrVirtualDefinition", "columnProperties", "columnProperty", "objectTypeColProperties", 
			"substitutableColumnClause", "modifyColumnSpecification", "modifyColProperties", 
			"modifyColSubstitutable", "dropColumnClause", "dropColumnSpecification", 
			"columnOrColumnList", "cascadeOrInvalidate", "checkpointNumber", "renameColumnClause", 
			"constraintClauses", "addConstraintSpecification", "modifyConstraintClause", 
			"constraintWithName", "constraintOption", "constraintPrimaryOrUnique", 
			"renameConstraintClause", "dropConstraintClause", "alterExternalTable", 
			"objectProperties", "objectProperty", "renameIndexClause_", "setTransaction", 
			"commit", "rollback", "savepoint", "grant", "revoke", "objectPrivilegeClause", 
			"systemPrivilegeClause_", "roleClause_", "objectPrivileges_", "objectPrivilegeType_", 
			"onObjectClause", "systemPrivilege_", "systemPrivilegeOperation_", "advisorFrameworkSystemPrivilege_", 
			"clustersSystemPrivilege_", "contextsSystemPrivilege_", "dataRedactionSystemPrivilege_", 
			"databaseSystemPrivilege_", "databaseLinksSystemPrivilege_", "debuggingSystemPrivilege_", 
			"dictionariesSystemPrivilege_", "dimensionsSystemPrivilege_", "directoriesSystemPrivilege_", 
			"editionsSystemPrivilege_", "flashbackDataArchivesPrivilege_", "indexesSystemPrivilege_", 
			"indexTypesSystemPrivilege_", "jobSchedulerObjectsSystemPrivilege_", 
			"keyManagementFrameworkSystemPrivilege_", "librariesFrameworkSystemPrivilege_", 
			"logminerFrameworkSystemPrivilege_", "materizlizedViewsSystemPrivilege_", 
			"miningModelsSystemPrivilege_", "olapCubesSystemPrivilege_", "olapCubeMeasureFoldersSystemPrivilege_", 
			"olapCubeDiminsionsSystemPrivilege_", "olapCubeBuildProcessesSystemPrivilege_", 
			"operatorsSystemPrivilege_", "outlinesSystemPrivilege_", "planManagementSystemPrivilege_", 
			"pluggableDatabasesSystemPrivilege_", "proceduresSystemPrivilege_", "profilesSystemPrivilege_", 
			"rolesSystemPrivilege_", "rollbackSegmentsSystemPrivilege_", "sequencesSystemPrivilege_", 
			"sessionsSystemPrivilege_", "sqlTranslationProfilesSystemPrivilege_", 
			"synonymsSystemPrivilege_", "tablesSystemPrivilege_", "tablespacesSystemPrivilege_", 
			"triggersSystemPrivilege_", "typesSystemPrivilege_", "usersSystemPrivilege_", 
			"viewsSystemPrivilege_", "miscellaneousSystemPrivilege_", "createUser", 
			"dropUser", "alterUser", "createRole", "dropRole", "alterRole", "call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Default does not match anything'", "'&&'", "'||'", "'!'", "'~'", 
			"'|'", "'&'", "'<<'", "'>>'", "'^'", "'%'", "':'", "'+'", "'-'", "'*'", 
			"'/'", "'\\'", "'.'", "'.*'", "'<=>'", "'=='", "'='", null, "'>'", "'>='", 
			"'<'", "'<='", "'#'", "'('", "')'", "'{'", "'}'", "'['", "']'", "','", 
			"'\"'", "'''", "'`'", "'?'", "'@'", "';'", null, null, null, null, null, 
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
			null, null, null, null, null, null, null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "AND_", "OR_", "NOT_", "TILDE_", "VERTICAL_BAR_", "AMPERSAND_", 
			"SIGNED_LEFT_SHIFT_", "SIGNED_RIGHT_SHIFT_", "CARET_", "MOD_", "COLON_", 
			"PLUS_", "MINUS_", "ASTERISK_", "SLASH_", "BACKSLASH_", "DOT_", "DOT_ASTERISK_", 
			"SAFE_EQ_", "DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", "LT_", "LTE_", "POUND_", 
			"LP_", "RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", 
			"BQ_", "QUESTION_", "AT_", "SEMI_", "BLOCK_COMMENT", "INLINE_COMMENT", 
			"WS", "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "ALTER", "DROP", 
			"TRUNCATE", "SCHEMA", "GRANT", "REVOKE", "ADD", "SET", "TABLE", "COLUMN", 
			"INDEX", "CONSTRAINT", "PRIMARY", "UNIQUE", "FOREIGN", "KEY", "POSITION", 
			"PRECISION", "FUNCTION", "TRIGGER", "PROCEDURE", "VIEW", "INTO", "VALUES", 
			"WITH", "UNION", "DISTINCT", "CASE", "WHEN", "CAST", "TRIM", "SUBSTRING", 
			"FROM", "NATURAL", "JOIN", "FULL", "INNER", "OUTER", "LEFT", "RIGHT", 
			"CROSS", "USING", "WHERE", "AS", "ON", "IF", "ELSE", "THEN", "FOR", "TO", 
			"AND", "OR", "IS", "NOT", "NULL", "TRUE", "FALSE", "EXISTS", "BETWEEN", 
			"IN", "ALL", "ANY", "LIKE", "ORDER", "GROUP", "BY", "ASC", "DESC", "HAVING", 
			"LIMIT", "OFFSET", "BEGIN", "COMMIT", "ROLLBACK", "SAVEPOINT", "BOOLEAN", 
			"DOUBLE", "CHAR", "CHARACTER", "ARRAY", "INTERVAL", "DATE", "TIME", "TIMESTAMP", 
			"LOCALTIME", "LOCALTIMESTAMP", "YEAR", "QUARTER", "MONTH", "WEEK", "DAY", 
			"HOUR", "MINUTE", "SECOND", "MICROSECOND", "MAX", "MIN", "SUM", "COUNT", 
			"AVG", "DEFAULT", "CURRENT", "ENABLE", "DISABLE", "CALL", "INSTANCE", 
			"PRESERVE", "DO", "DEFINER", "CURRENT_USER", "SQL", "CASCADED", "LOCAL", 
			"CLOSE", "OPEN", "NEXT", "NAME", "COLLATION", "NAMES", "INTEGER", "REAL", 
			"DECIMAL", "TYPE", "INT", "SMALLINT", "NUMERIC", "FLOAT", "FOR_GENERATOR", 
			"BINARY", "ESCAPE", "MOD", "XOR", "ROW", "ROWS", "UNKNOWN", "ALWAYS", 
			"CASCADE", "CHECK", "GENERATED", "PRIVILEGES", "READ", "WRITE", "REFERENCES", 
			"START", "TRANSACTION", "USER", "ROLE", "VISIBLE", "INVISIBLE", "EXECUTE", 
			"USE", "DEBUG", "UNDER", "FLASHBACK", "ARCHIVE", "REFRESH", "QUERY", 
			"REWRITE", "KEEP", "SEQUENCE", "INHERIT", "TRANSLATE", "MERGE", "AT", 
			"BITMAP", "CACHE", "NOCACHE", "CHECKPOINT", "CONNECT", "CONSTRAINTS", 
			"CYCLE", "NOCYCLE", "DBTIMEZONE", "ENCRYPT", "DECRYPT", "DEFERRABLE", 
			"DEFERRED", "DIRECTORY", "EDITION", "ELEMENT", "END", "EXCEPTIONS", "FORCE", 
			"GLOBAL", "IDENTIFIED", "IDENTITY", "IMMEDIATE", "INCREMENT", "INITIALLY", 
			"INVALIDATE", "JAVA", "LEVELS", "MAXVALUE", "MINVALUE", "NOMAXVALUE", 
			"NOMINVALUE", "MINING", "MODEL", "MODIFY", "NATIONAL", "NEW", "NOORDER", 
			"NORELY", "OF", "ONLY", "PRIOR", "PROFILE", "REF", "REKEY", "RELY", "RENAME", 
			"REPLACE", "RESOURCE", "ROWID", "SALT", "SCOPE", "SORT", "SOURCE", "SUBSTITUTABLE", 
			"TABLESPACE", "TEMPORARY", "TRANSLATION", "TREAT", "NO", "UNUSED", "VALIDATE", 
			"NOVALIDATE", "VALUE", "VARYING", "VIRTUAL", "ZONE", "PUBLIC", "SESSION", 
			"COMMENT", "LOCK", "ADVISOR", "ADMINISTER", "TUNING", "MANAGE", "MANAGEMENT", 
			"OBJECT", "CLUSTER", "CONTEXT", "EXEMPT", "REDACTION", "POLICY", "DATABASE", 
			"SYSTEM", "AUDIT", "LINK", "ANALYZE", "DICTIONARY", "DIMENSION", "INDEXTYPE", 
			"EXTERNAL", "JOB", "CLASS", "PROGRAM", "SCHEDULER", "LIBRARY", "LOGMINING", 
			"MATERIALIZED", "CUBE", "MEASURE", "FOLDER", "BUILD", "PROCESS", "OPERATOR", 
			"OUTLINE", "PLUGGABLE", "CONTAINER", "SEGMENT", "RESTRICTED", "COST", 
			"SYNONYM", "BACKUP", "UNLIMITED", "BECOME", "CHANGE", "NOTIFICATION", 
			"ACCESS", "PRIVILEGE", "PURGE", "RESUMABLE", "SYSGUID", "SYSBACKUP", 
			"SYSDBA", "SYSDG", "SYSKM", "SYSOPER", "DBA_RECYCLEBIN", "FIRST", "NCHAR", 
			"RAW", "VARCHAR", "VARCHAR2", "NVARCHAR2", "LONG", "BLOB", "CLOB", "NCLOB", 
			"BINARY_FLOAT", "BINARY_DOUBLE", "PLS_INTEGER", "BINARY_INTEGER", "NUMBER", 
			"NATURALN", "POSITIVE", "POSITIVEN", "SIGNTYPE", "SIMPLE_INTEGER", "BFILE", 
			"MLSLABEL", "UROWID", "JSON", "DEC", "IDENTIFIER_", "STRING_", "NUMBER_", 
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
	public String getGrammarFileName() { return "OracleStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OracleStatementParser(TokenStream input) {
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
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public DropIndexContext dropIndex() {
			return getRuleContext(DropIndexContext.class,0);
		}
		public AlterIndexContext alterIndex() {
			return getRuleContext(AlterIndexContext.class,0);
		}
		public CommitContext commit() {
			return getRuleContext(CommitContext.class,0);
		}
		public RollbackContext rollback() {
			return getRuleContext(RollbackContext.class,0);
		}
		public SetTransactionContext setTransaction() {
			return getRuleContext(SetTransactionContext.class,0);
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
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(OracleStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitExecute(this);
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
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(496);
				select();
				}
				break;
			case 2:
				{
				setState(497);
				insert();
				}
				break;
			case 3:
				{
				setState(498);
				update();
				}
				break;
			case 4:
				{
				setState(499);
				delete();
				}
				break;
			case 5:
				{
				setState(500);
				createTable();
				}
				break;
			case 6:
				{
				setState(501);
				alterTable();
				}
				break;
			case 7:
				{
				setState(502);
				dropTable();
				}
				break;
			case 8:
				{
				setState(503);
				truncateTable();
				}
				break;
			case 9:
				{
				setState(504);
				createIndex();
				}
				break;
			case 10:
				{
				setState(505);
				dropIndex();
				}
				break;
			case 11:
				{
				setState(506);
				alterIndex();
				}
				break;
			case 12:
				{
				setState(507);
				commit();
				}
				break;
			case 13:
				{
				setState(508);
				rollback();
				}
				break;
			case 14:
				{
				setState(509);
				setTransaction();
				}
				break;
			case 15:
				{
				setState(510);
				savepoint();
				}
				break;
			case 16:
				{
				setState(511);
				grant();
				}
				break;
			case 17:
				{
				setState(512);
				revoke();
				}
				break;
			case 18:
				{
				setState(513);
				createUser();
				}
				break;
			case 19:
				{
				setState(514);
				dropUser();
				}
				break;
			case 20:
				{
				setState(515);
				alterUser();
				}
				break;
			case 21:
				{
				setState(516);
				createRole();
				}
				break;
			case 22:
				{
				setState(517);
				dropRole();
				}
				break;
			case 23:
				{
				setState(518);
				alterRole();
				}
				break;
			case 24:
				{
				setState(519);
				call();
				}
				break;
			}
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(522);
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
		public TerminalNode INSERT() { return getToken(OracleStatementParser.INSERT, 0); }
		public InsertSingleTableContext insertSingleTable() {
			return getRuleContext(InsertSingleTableContext.class,0);
		}
		public InsertMultiTableContext insertMultiTable() {
			return getRuleContext(InsertMultiTableContext.class,0);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_insert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(INSERT);
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTO:
				{
				setState(526);
				insertSingleTable();
				}
				break;
			case WHEN:
			case ALL:
			case FIRST:
				{
				setState(527);
				insertMultiTable();
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

	public static class InsertSingleTableContext extends ParserRuleContext {
		public InsertIntoClauseContext insertIntoClause() {
			return getRuleContext(InsertIntoClauseContext.class,0);
		}
		public InsertValuesClauseContext insertValuesClause() {
			return getRuleContext(InsertValuesClauseContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public InsertSingleTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertSingleTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitInsertSingleTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertSingleTableContext insertSingleTable() throws RecognitionException {
		InsertSingleTableContext _localctx = new InsertSingleTableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insertSingleTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			insertIntoClause();
			setState(533);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case VALUES:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case IDENTIFIER_:
				{
				setState(531);
				insertValuesClause();
				}
				break;
			case SELECT:
				{
				setState(532);
				select();
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

	public static class InsertMultiTableContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public ConditionalInsertClauseContext conditionalInsertClause() {
			return getRuleContext(ConditionalInsertClauseContext.class,0);
		}
		public List<MultiTableElementContext> multiTableElement() {
			return getRuleContexts(MultiTableElementContext.class);
		}
		public MultiTableElementContext multiTableElement(int i) {
			return getRuleContext(MultiTableElementContext.class,i);
		}
		public InsertMultiTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertMultiTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitInsertMultiTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertMultiTableContext insertMultiTable() throws RecognitionException {
		InsertMultiTableContext _localctx = new InsertMultiTableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_insertMultiTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(535);
				match(ALL);
				setState(537); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(536);
					multiTableElement();
					}
					}
					setState(539); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INTO );
				}
				break;
			case 2:
				{
				setState(541);
				conditionalInsertClause();
				}
				break;
			}
			setState(544);
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

	public static class MultiTableElementContext extends ParserRuleContext {
		public InsertIntoClauseContext insertIntoClause() {
			return getRuleContext(InsertIntoClauseContext.class,0);
		}
		public InsertValuesClauseContext insertValuesClause() {
			return getRuleContext(InsertValuesClauseContext.class,0);
		}
		public MultiTableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiTableElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitMultiTableElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiTableElementContext multiTableElement() throws RecognitionException {
		MultiTableElementContext _localctx = new MultiTableElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multiTableElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			insertIntoClause();
			setState(547);
			insertValuesClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalInsertClauseContext extends ParserRuleContext {
		public List<ConditionalInsertWhenPartContext> conditionalInsertWhenPart() {
			return getRuleContexts(ConditionalInsertWhenPartContext.class);
		}
		public ConditionalInsertWhenPartContext conditionalInsertWhenPart(int i) {
			return getRuleContext(ConditionalInsertWhenPartContext.class,i);
		}
		public ConditionalInsertElsePartContext conditionalInsertElsePart() {
			return getRuleContext(ConditionalInsertElsePartContext.class,0);
		}
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode FIRST() { return getToken(OracleStatementParser.FIRST, 0); }
		public ConditionalInsertClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalInsertClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitConditionalInsertClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalInsertClauseContext conditionalInsertClause() throws RecognitionException {
		ConditionalInsertClauseContext _localctx = new ConditionalInsertClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditionalInsertClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL || _la==FIRST) {
				{
				setState(549);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==FIRST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(553); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(552);
				conditionalInsertWhenPart();
				}
				}
				setState(555); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(557);
				conditionalInsertElsePart();
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

	public static class ConditionalInsertWhenPartContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(OracleStatementParser.WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(OracleStatementParser.THEN, 0); }
		public List<MultiTableElementContext> multiTableElement() {
			return getRuleContexts(MultiTableElementContext.class);
		}
		public MultiTableElementContext multiTableElement(int i) {
			return getRuleContext(MultiTableElementContext.class,i);
		}
		public ConditionalInsertWhenPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalInsertWhenPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitConditionalInsertWhenPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalInsertWhenPartContext conditionalInsertWhenPart() throws RecognitionException {
		ConditionalInsertWhenPartContext _localctx = new ConditionalInsertWhenPartContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditionalInsertWhenPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(WHEN);
			setState(561);
			expr(0);
			setState(562);
			match(THEN);
			setState(564); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(563);
				multiTableElement();
				}
				}
				setState(566); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INTO );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalInsertElsePartContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(OracleStatementParser.ELSE, 0); }
		public List<MultiTableElementContext> multiTableElement() {
			return getRuleContexts(MultiTableElementContext.class);
		}
		public MultiTableElementContext multiTableElement(int i) {
			return getRuleContext(MultiTableElementContext.class,i);
		}
		public ConditionalInsertElsePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalInsertElsePart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitConditionalInsertElsePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalInsertElsePartContext conditionalInsertElsePart() throws RecognitionException {
		ConditionalInsertElsePartContext _localctx = new ConditionalInsertElsePartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conditionalInsertElsePart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(ELSE);
			setState(570); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(569);
				multiTableElement();
				}
				}
				setState(572); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INTO );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertIntoClauseContext extends ParserRuleContext {
		public TerminalNode INTO() { return getToken(OracleStatementParser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public InsertIntoClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertIntoClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitInsertIntoClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoClauseContext insertIntoClause() throws RecognitionException {
		InsertIntoClauseContext _localctx = new InsertIntoClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_insertIntoClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(INTO);
			setState(575);
			tableName();
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(576);
					match(AS);
					}
				}

				setState(579);
				alias();
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
		public TerminalNode VALUES() { return getToken(OracleStatementParser.VALUES, 0); }
		public List<AssignmentValuesContext> assignmentValues() {
			return getRuleContexts(AssignmentValuesContext.class);
		}
		public AssignmentValuesContext assignmentValues(int i) {
			return getRuleContext(AssignmentValuesContext.class,i);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public InsertValuesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValuesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitInsertValuesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertValuesClauseContext insertValuesClause() throws RecognitionException {
		InsertValuesClauseContext _localctx = new InsertValuesClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_insertValuesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LP_) | (1L << TRUNCATE) | (1L << SCHEMA))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (FUNCTION - 68)) | (1L << (PROCEDURE - 68)) | (1L << (CASE - 68)) | (1L << (WHEN - 68)) | (1L << (CAST - 68)) | (1L << (TRIM - 68)) | (1L << (SUBSTRING - 68)) | (1L << (NATURAL - 68)) | (1L << (JOIN - 68)) | (1L << (FULL - 68)) | (1L << (INNER - 68)) | (1L << (OUTER - 68)) | (1L << (LEFT - 68)) | (1L << (RIGHT - 68)) | (1L << (CROSS - 68)) | (1L << (USING - 68)) | (1L << (IF - 68)) | (1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (LIMIT - 68)) | (1L << (OFFSET - 68)) | (1L << (BEGIN - 68)) | (1L << (COMMIT - 68)) | (1L << (ROLLBACK - 68)) | (1L << (SAVEPOINT - 68)) | (1L << (BOOLEAN - 68)) | (1L << (DOUBLE - 68)) | (1L << (CHARACTER - 68)) | (1L << (ARRAY - 68)) | (1L << (INTERVAL - 68)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (TIME - 132)) | (1L << (TIMESTAMP - 132)) | (1L << (LOCALTIME - 132)) | (1L << (LOCALTIMESTAMP - 132)) | (1L << (YEAR - 132)) | (1L << (QUARTER - 132)) | (1L << (MONTH - 132)) | (1L << (WEEK - 132)) | (1L << (DAY - 132)) | (1L << (HOUR - 132)) | (1L << (MINUTE - 132)) | (1L << (SECOND - 132)) | (1L << (MICROSECOND - 132)) | (1L << (MAX - 132)) | (1L << (MIN - 132)) | (1L << (SUM - 132)) | (1L << (COUNT - 132)) | (1L << (AVG - 132)) | (1L << (ENABLE - 132)) | (1L << (DISABLE - 132)) | (1L << (PRESERVE - 132)) | (1L << (DO - 132)) | (1L << (DEFINER - 132)) | (1L << (CURRENT_USER - 132)) | (1L << (SQL - 132)) | (1L << (CASCADED - 132)) | (1L << (LOCAL - 132)) | (1L << (CLOSE - 132)) | (1L << (OPEN - 132)) | (1L << (NEXT - 132)) | (1L << (NAME - 132)) | (1L << (COLLATION - 132)) | (1L << (NAMES - 132)) | (1L << (INTEGER - 132)) | (1L << (REAL - 132)) | (1L << (DECIMAL - 132)) | (1L << (TYPE - 132)) | (1L << (BINARY - 132)) | (1L << (ESCAPE - 132)) | (1L << (MOD - 132)) | (1L << (XOR - 132)) | (1L << (UNKNOWN - 132)) | (1L << (ALWAYS - 132)) | (1L << (CASCADE - 132)) | (1L << (GENERATED - 132)) | (1L << (PRIVILEGES - 132)) | (1L << (READ - 132)) | (1L << (WRITE - 132)) | (1L << (REFERENCES - 132)) | (1L << (TRANSACTION - 132)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (ROLE - 196)) | (1L << (VISIBLE - 196)) | (1L << (INVISIBLE - 196)) | (1L << (EXECUTE - 196)) | (1L << (USE - 196)) | (1L << (DEBUG - 196)) | (1L << (UNDER - 196)) | (1L << (FLASHBACK - 196)) | (1L << (ARCHIVE - 196)) | (1L << (REFRESH - 196)) | (1L << (QUERY - 196)) | (1L << (REWRITE - 196)) | (1L << (KEEP - 196)) | (1L << (SEQUENCE - 196)) | (1L << (INHERIT - 196)) | (1L << (TRANSLATE - 196)) | (1L << (MERGE - 196)) | (1L << (AT - 196)) | (1L << (BITMAP - 196)) | (1L << (CACHE - 196)) | (1L << (NOCACHE - 196)) | (1L << (CHECKPOINT - 196)) | (1L << (CONNECT - 196)) | (1L << (CONSTRAINTS - 196)) | (1L << (CYCLE - 196)) | (1L << (NOCYCLE - 196)) | (1L << (DBTIMEZONE - 196)) | (1L << (ENCRYPT - 196)) | (1L << (DECRYPT - 196)) | (1L << (DEFERRABLE - 196)) | (1L << (DEFERRED - 196)) | (1L << (EDITION - 196)) | (1L << (ELEMENT - 196)) | (1L << (END - 196)) | (1L << (EXCEPTIONS - 196)) | (1L << (FORCE - 196)) | (1L << (GLOBAL - 196)) | (1L << (IDENTITY - 196)) | (1L << (INITIALLY - 196)) | (1L << (INVALIDATE - 196)) | (1L << (JAVA - 196)) | (1L << (LEVELS - 196)) | (1L << (MAXVALUE - 196)) | (1L << (MINVALUE - 196)) | (1L << (NOMAXVALUE - 196)) | (1L << (NOMINVALUE - 196)) | (1L << (MINING - 196)) | (1L << (MODEL - 196)) | (1L << (NATIONAL - 196)) | (1L << (NEW - 196)) | (1L << (NOORDER - 196)) | (1L << (NORELY - 196)) | (1L << (ONLY - 196)) | (1L << (PROFILE - 196)) | (1L << (REF - 196)) | (1L << (REKEY - 196)) | (1L << (RELY - 196)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPLACE - 261)) | (1L << (SALT - 261)) | (1L << (SCOPE - 261)) | (1L << (SORT - 261)) | (1L << (SOURCE - 261)) | (1L << (SUBSTITUTABLE - 261)) | (1L << (TABLESPACE - 261)) | (1L << (TEMPORARY - 261)) | (1L << (TRANSLATION - 261)) | (1L << (TREAT - 261)) | (1L << (NO - 261)) | (1L << (UNUSED - 261)) | (1L << (NOVALIDATE - 261)) | (1L << (VALUE - 261)) | (1L << (VARYING - 261)) | (1L << (VIRTUAL - 261)) | (1L << (ZONE - 261)) | (1L << (ADVISOR - 261)) | (1L << (ADMINISTER - 261)) | (1L << (TUNING - 261)) | (1L << (MANAGE - 261)) | (1L << (MANAGEMENT - 261)) | (1L << (OBJECT - 261)) | (1L << (CLUSTER - 261)) | (1L << (CONTEXT - 261)) | (1L << (EXEMPT - 261)) | (1L << (REDACTION - 261)) | (1L << (POLICY - 261)) | (1L << (DATABASE - 261)) | (1L << (SYSTEM - 261)) | (1L << (AUDIT - 261)) | (1L << (LINK - 261)) | (1L << (ANALYZE - 261)) | (1L << (DICTIONARY - 261)) | (1L << (DIMENSION - 261)) | (1L << (INDEXTYPE - 261)) | (1L << (EXTERNAL - 261)) | (1L << (JOB - 261)) | (1L << (CLASS - 261)) | (1L << (PROGRAM - 261)) | (1L << (SCHEDULER - 261)) | (1L << (LIBRARY - 261)) | (1L << (LOGMINING - 261)) | (1L << (MATERIALIZED - 261)) | (1L << (CUBE - 261)) | (1L << (MEASURE - 261)) | (1L << (FOLDER - 261)) | (1L << (BUILD - 261)) | (1L << (PROCESS - 261)) | (1L << (OPERATOR - 261)) | (1L << (OUTLINE - 261)) | (1L << (PLUGGABLE - 261)) | (1L << (CONTAINER - 261)) | (1L << (SEGMENT - 261)) | (1L << (RESTRICTED - 261)) | (1L << (COST - 261)) | (1L << (SYNONYM - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (BACKUP - 325)) | (1L << (UNLIMITED - 325)) | (1L << (BECOME - 325)) | (1L << (CHANGE - 325)) | (1L << (NOTIFICATION - 325)) | (1L << (ACCESS - 325)) | (1L << (PRIVILEGE - 325)) | (1L << (PURGE - 325)) | (1L << (RESUMABLE - 325)) | (1L << (SYSGUID - 325)) | (1L << (SYSBACKUP - 325)) | (1L << (SYSDBA - 325)) | (1L << (SYSDG - 325)) | (1L << (SYSKM - 325)) | (1L << (SYSOPER - 325)) | (1L << (DBA_RECYCLEBIN - 325)) | (1L << (FIRST - 325)) | (1L << (IDENTIFIER_ - 325)))) != 0)) {
				{
				setState(582);
				columnNames();
				}
			}

			setState(585);
			match(VALUES);
			setState(586);
			assignmentValues();
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(587);
				match(COMMA_);
				setState(588);
				assignmentValues();
				}
				}
				setState(593);
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

	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(OracleStatementParser.UPDATE, 0); }
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
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(UPDATE);
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(595);
				updateSpecification_();
				}
				break;
			}
			setState(598);
			tableReferences();
			setState(599);
			setAssignmentsClause();
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(600);
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
		public TerminalNode ONLY() { return getToken(OracleStatementParser.ONLY, 0); }
		public UpdateSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateSpecification_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitUpdateSpecification_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateSpecification_Context updateSpecification_() throws RecognitionException {
		UpdateSpecification_Context _localctx = new UpdateSpecification_Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_updateSpecification_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
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
		public TerminalNode EQ_() { return getToken(OracleStatementParser.EQ_, 0); }
		public AssignmentValueContext assignmentValue() {
			return getRuleContext(AssignmentValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			columnName();
			setState(606);
			match(EQ_);
			setState(607);
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
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public SetAssignmentsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAssignmentsClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSetAssignmentsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetAssignmentsClauseContext setAssignmentsClause() throws RecognitionException {
		SetAssignmentsClauseContext _localctx = new SetAssignmentsClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_setAssignmentsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(SET);
			setState(610);
			assignment();
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(611);
				match(COMMA_);
				setState(612);
				assignment();
				}
				}
				setState(617);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<AssignmentValueContext> assignmentValue() {
			return getRuleContexts(AssignmentValueContext.class);
		}
		public AssignmentValueContext assignmentValue(int i) {
			return getRuleContext(AssignmentValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public AssignmentValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValues; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAssignmentValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValuesContext assignmentValues() throws RecognitionException {
		AssignmentValuesContext _localctx = new AssignmentValuesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignmentValues);
		int _la;
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				match(LP_);
				setState(619);
				assignmentValue();
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(620);
					match(COMMA_);
					setState(621);
					assignmentValue();
					}
					}
					setState(626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(627);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				match(LP_);
				setState(630);
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
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public AssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAssignmentValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValueContext assignmentValue() throws RecognitionException {
		AssignmentValueContext _localctx = new AssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignmentValue);
		try {
			setState(635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHAR:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				expr(0);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
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
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
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
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(DELETE);
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(638);
				deleteSpecification_();
				}
				break;
			}
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(641);
				singleTableClause();
				}
				break;
			case 2:
				{
				setState(642);
				multipleTablesClause();
				}
				break;
			}
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(645);
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
		public TerminalNode ONLY() { return getToken(OracleStatementParser.ONLY, 0); }
		public DeleteSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteSpecification_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDeleteSpecification_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteSpecification_Context deleteSpecification_() throws RecognitionException {
		DeleteSpecification_Context _localctx = new DeleteSpecification_Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_deleteSpecification_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
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
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(OracleStatementParser.FROM, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public SingleTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSingleTableClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableClauseContext singleTableClause() throws RecognitionException {
		SingleTableClauseContext _localctx = new SingleTableClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_singleTableClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(650);
				match(FROM);
				}
			}

			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(653);
				match(LP_);
				}
			}

			setState(656);
			tableName();
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(657);
				match(RP_);
				}
			}

			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (SCHEMA - 52)) | (1L << (FUNCTION - 52)) | (1L << (PROCEDURE - 52)) | (1L << (CASE - 52)) | (1L << (WHEN - 52)) | (1L << (CAST - 52)) | (1L << (TRIM - 52)) | (1L << (SUBSTRING - 52)) | (1L << (NATURAL - 52)) | (1L << (JOIN - 52)) | (1L << (FULL - 52)) | (1L << (INNER - 52)) | (1L << (OUTER - 52)) | (1L << (LEFT - 52)) | (1L << (RIGHT - 52)) | (1L << (CROSS - 52)) | (1L << (USING - 52)) | (1L << (AS - 52)) | (1L << (IF - 52)) | (1L << (TRUE - 52)) | (1L << (FALSE - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (BEGIN - 119)) | (1L << (COMMIT - 119)) | (1L << (ROLLBACK - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (DOUBLE - 119)) | (1L << (CHARACTER - 119)) | (1L << (ARRAY - 119)) | (1L << (INTERVAL - 119)) | (1L << (TIME - 119)) | (1L << (TIMESTAMP - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (YEAR - 119)) | (1L << (QUARTER - 119)) | (1L << (MONTH - 119)) | (1L << (WEEK - 119)) | (1L << (DAY - 119)) | (1L << (HOUR - 119)) | (1L << (MINUTE - 119)) | (1L << (SECOND - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (PRESERVE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (CURRENT_USER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (CLOSE - 119)) | (1L << (OPEN - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (COLLATION - 119)) | (1L << (NAMES - 119)) | (1L << (INTEGER - 119)) | (1L << (REAL - 119)) | (1L << (DECIMAL - 119)) | (1L << (TYPE - 119)) | (1L << (BINARY - 119)) | (1L << (ESCAPE - 119)) | (1L << (MOD - 119)) | (1L << (XOR - 119)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (UNKNOWN - 184)) | (1L << (ALWAYS - 184)) | (1L << (CASCADE - 184)) | (1L << (GENERATED - 184)) | (1L << (PRIVILEGES - 184)) | (1L << (READ - 184)) | (1L << (WRITE - 184)) | (1L << (REFERENCES - 184)) | (1L << (TRANSACTION - 184)) | (1L << (ROLE - 184)) | (1L << (VISIBLE - 184)) | (1L << (INVISIBLE - 184)) | (1L << (EXECUTE - 184)) | (1L << (USE - 184)) | (1L << (DEBUG - 184)) | (1L << (UNDER - 184)) | (1L << (FLASHBACK - 184)) | (1L << (ARCHIVE - 184)) | (1L << (REFRESH - 184)) | (1L << (QUERY - 184)) | (1L << (REWRITE - 184)) | (1L << (KEEP - 184)) | (1L << (SEQUENCE - 184)) | (1L << (INHERIT - 184)) | (1L << (TRANSLATE - 184)) | (1L << (MERGE - 184)) | (1L << (AT - 184)) | (1L << (BITMAP - 184)) | (1L << (CACHE - 184)) | (1L << (NOCACHE - 184)) | (1L << (CHECKPOINT - 184)) | (1L << (CONNECT - 184)) | (1L << (CONSTRAINTS - 184)) | (1L << (CYCLE - 184)) | (1L << (NOCYCLE - 184)) | (1L << (DBTIMEZONE - 184)) | (1L << (ENCRYPT - 184)) | (1L << (DECRYPT - 184)) | (1L << (DEFERRABLE - 184)) | (1L << (DEFERRED - 184)) | (1L << (EDITION - 184)) | (1L << (ELEMENT - 184)) | (1L << (END - 184)) | (1L << (EXCEPTIONS - 184)) | (1L << (FORCE - 184)) | (1L << (GLOBAL - 184)) | (1L << (IDENTITY - 184)) | (1L << (INITIALLY - 184)) | (1L << (INVALIDATE - 184)) | (1L << (JAVA - 184)) | (1L << (LEVELS - 184)) | (1L << (MAXVALUE - 184)) | (1L << (MINVALUE - 184)) | (1L << (NOMAXVALUE - 184)) | (1L << (NOMINVALUE - 184)) | (1L << (MINING - 184)) | (1L << (MODEL - 184)))) != 0) || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (NATIONAL - 249)) | (1L << (NEW - 249)) | (1L << (NOORDER - 249)) | (1L << (NORELY - 249)) | (1L << (ONLY - 249)) | (1L << (PROFILE - 249)) | (1L << (REF - 249)) | (1L << (REKEY - 249)) | (1L << (RELY - 249)) | (1L << (REPLACE - 249)) | (1L << (SALT - 249)) | (1L << (SCOPE - 249)) | (1L << (SORT - 249)) | (1L << (SOURCE - 249)) | (1L << (SUBSTITUTABLE - 249)) | (1L << (TABLESPACE - 249)) | (1L << (TEMPORARY - 249)) | (1L << (TRANSLATION - 249)) | (1L << (TREAT - 249)) | (1L << (NO - 249)) | (1L << (UNUSED - 249)) | (1L << (NOVALIDATE - 249)) | (1L << (VALUE - 249)) | (1L << (VARYING - 249)) | (1L << (VIRTUAL - 249)) | (1L << (ZONE - 249)) | (1L << (ADVISOR - 249)) | (1L << (ADMINISTER - 249)) | (1L << (TUNING - 249)) | (1L << (MANAGE - 249)) | (1L << (MANAGEMENT - 249)) | (1L << (OBJECT - 249)) | (1L << (CLUSTER - 249)) | (1L << (CONTEXT - 249)) | (1L << (EXEMPT - 249)) | (1L << (REDACTION - 249)) | (1L << (POLICY - 249)) | (1L << (DATABASE - 249)) | (1L << (SYSTEM - 249)) | (1L << (AUDIT - 249)) | (1L << (LINK - 249)) | (1L << (ANALYZE - 249)) | (1L << (DICTIONARY - 249)) | (1L << (DIMENSION - 249)) | (1L << (INDEXTYPE - 249)) | (1L << (EXTERNAL - 249)) | (1L << (JOB - 249)) | (1L << (CLASS - 249)) | (1L << (PROGRAM - 249)) | (1L << (SCHEDULER - 249)) | (1L << (LIBRARY - 249)) | (1L << (LOGMINING - 249)) | (1L << (MATERIALIZED - 249)) | (1L << (CUBE - 249)))) != 0) || ((((_la - 313)) & ~0x3f) == 0 && ((1L << (_la - 313)) & ((1L << (MEASURE - 313)) | (1L << (FOLDER - 313)) | (1L << (BUILD - 313)) | (1L << (PROCESS - 313)) | (1L << (OPERATOR - 313)) | (1L << (OUTLINE - 313)) | (1L << (PLUGGABLE - 313)) | (1L << (CONTAINER - 313)) | (1L << (SEGMENT - 313)) | (1L << (RESTRICTED - 313)) | (1L << (COST - 313)) | (1L << (SYNONYM - 313)) | (1L << (BACKUP - 313)) | (1L << (UNLIMITED - 313)) | (1L << (BECOME - 313)) | (1L << (CHANGE - 313)) | (1L << (NOTIFICATION - 313)) | (1L << (ACCESS - 313)) | (1L << (PRIVILEGE - 313)) | (1L << (PURGE - 313)) | (1L << (RESUMABLE - 313)) | (1L << (SYSGUID - 313)) | (1L << (SYSBACKUP - 313)) | (1L << (SYSDBA - 313)) | (1L << (SYSDG - 313)) | (1L << (SYSKM - 313)) | (1L << (SYSOPER - 313)) | (1L << (DBA_RECYCLEBIN - 313)) | (1L << (FIRST - 313)) | (1L << (IDENTIFIER_ - 313)) | (1L << (STRING_ - 313)))) != 0)) {
				{
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(660);
					match(AS);
					}
				}

				setState(663);
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
		public TerminalNode FROM() { return getToken(OracleStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public MultipleTablesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTablesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitMultipleTablesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleTablesClauseContext multipleTablesClause() throws RecognitionException {
		MultipleTablesClauseContext _localctx = new MultipleTablesClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multipleTablesClause);
		try {
			setState(675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(666);
				multipleTableNames();
				setState(667);
				match(FROM);
				setState(668);
				tableReferences();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				match(FROM);
				setState(671);
				multipleTableNames();
				setState(672);
				match(USING);
				setState(673);
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
		public List<TerminalNode> DOT_ASTERISK_() { return getTokens(OracleStatementParser.DOT_ASTERISK_); }
		public TerminalNode DOT_ASTERISK_(int i) {
			return getToken(OracleStatementParser.DOT_ASTERISK_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public MultipleTableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTableNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitMultipleTableNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleTableNamesContext multipleTableNames() throws RecognitionException {
		MultipleTableNamesContext _localctx = new MultipleTableNamesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multipleTableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			tableName();
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_ASTERISK_) {
				{
				setState(678);
				match(DOT_ASTERISK_);
				}
			}

			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(681);
				match(COMMA_);
				setState(682);
				tableName();
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT_ASTERISK_) {
					{
					setState(683);
					match(DOT_ASTERISK_);
					}
				}

				}
				}
				setState(690);
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
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
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
		public List<TerminalNode> UNION() { return getTokens(OracleStatementParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(OracleStatementParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(OracleStatementParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(OracleStatementParser.ALL, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(OracleStatementParser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(OracleStatementParser.DISTINCT, i);
		}
		public UnionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitUnionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionClauseContext unionClause() throws RecognitionException {
		UnionClauseContext _localctx = new UnionClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			selectClause();
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(694);
				match(UNION);
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT || _la==ALL) {
					{
					setState(695);
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

				setState(698);
				selectClause();
				}
				}
				setState(703);
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
		public TerminalNode SELECT() { return getToken(OracleStatementParser.SELECT, 0); }
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
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(SELECT);
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(705);
				duplicateSpecification();
				}
			}

			setState(708);
			projections();
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(709);
				fromClause();
				}
			}

			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(712);
				whereClause();
				}
			}

			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(715);
				groupByClause();
				}
			}

			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(718);
				havingClause();
				}
			}

			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(721);
				orderByClause();
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
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(OracleStatementParser.DISTINCT, 0); }
		public DuplicateSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duplicateSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDuplicateSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DuplicateSpecificationContext duplicateSpecification() throws RecognitionException {
		DuplicateSpecificationContext _localctx = new DuplicateSpecificationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_duplicateSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
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
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ProjectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projections; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitProjections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionsContext projections() throws RecognitionException {
		ProjectionsContext _localctx = new ProjectionsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_projections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK_:
				{
				setState(726);
				unqualifiedShorthand();
				}
				break;
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHAR:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(727);
				projection();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(730);
				match(COMMA_);
				setState(731);
				projection();
				}
				}
				setState(736);
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
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public QualifiedShorthandContext qualifiedShorthand() {
			return getRuleContext(QualifiedShorthandContext.class,0);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_projection);
		int _la;
		try {
			setState(748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(737);
					columnName();
					}
					break;
				case 2:
					{
					setState(738);
					expr(0);
					}
					break;
				}
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (SCHEMA - 52)) | (1L << (FUNCTION - 52)) | (1L << (PROCEDURE - 52)) | (1L << (CASE - 52)) | (1L << (WHEN - 52)) | (1L << (CAST - 52)) | (1L << (TRIM - 52)) | (1L << (SUBSTRING - 52)) | (1L << (NATURAL - 52)) | (1L << (JOIN - 52)) | (1L << (FULL - 52)) | (1L << (INNER - 52)) | (1L << (OUTER - 52)) | (1L << (LEFT - 52)) | (1L << (RIGHT - 52)) | (1L << (CROSS - 52)) | (1L << (USING - 52)) | (1L << (AS - 52)) | (1L << (IF - 52)) | (1L << (TRUE - 52)) | (1L << (FALSE - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (BEGIN - 119)) | (1L << (COMMIT - 119)) | (1L << (ROLLBACK - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (DOUBLE - 119)) | (1L << (CHARACTER - 119)) | (1L << (ARRAY - 119)) | (1L << (INTERVAL - 119)) | (1L << (TIME - 119)) | (1L << (TIMESTAMP - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (YEAR - 119)) | (1L << (QUARTER - 119)) | (1L << (MONTH - 119)) | (1L << (WEEK - 119)) | (1L << (DAY - 119)) | (1L << (HOUR - 119)) | (1L << (MINUTE - 119)) | (1L << (SECOND - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (PRESERVE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (CURRENT_USER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (CLOSE - 119)) | (1L << (OPEN - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (COLLATION - 119)) | (1L << (NAMES - 119)) | (1L << (INTEGER - 119)) | (1L << (REAL - 119)) | (1L << (DECIMAL - 119)) | (1L << (TYPE - 119)) | (1L << (BINARY - 119)) | (1L << (ESCAPE - 119)) | (1L << (MOD - 119)) | (1L << (XOR - 119)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (UNKNOWN - 184)) | (1L << (ALWAYS - 184)) | (1L << (CASCADE - 184)) | (1L << (GENERATED - 184)) | (1L << (PRIVILEGES - 184)) | (1L << (READ - 184)) | (1L << (WRITE - 184)) | (1L << (REFERENCES - 184)) | (1L << (TRANSACTION - 184)) | (1L << (ROLE - 184)) | (1L << (VISIBLE - 184)) | (1L << (INVISIBLE - 184)) | (1L << (EXECUTE - 184)) | (1L << (USE - 184)) | (1L << (DEBUG - 184)) | (1L << (UNDER - 184)) | (1L << (FLASHBACK - 184)) | (1L << (ARCHIVE - 184)) | (1L << (REFRESH - 184)) | (1L << (QUERY - 184)) | (1L << (REWRITE - 184)) | (1L << (KEEP - 184)) | (1L << (SEQUENCE - 184)) | (1L << (INHERIT - 184)) | (1L << (TRANSLATE - 184)) | (1L << (MERGE - 184)) | (1L << (AT - 184)) | (1L << (BITMAP - 184)) | (1L << (CACHE - 184)) | (1L << (NOCACHE - 184)) | (1L << (CHECKPOINT - 184)) | (1L << (CONNECT - 184)) | (1L << (CONSTRAINTS - 184)) | (1L << (CYCLE - 184)) | (1L << (NOCYCLE - 184)) | (1L << (DBTIMEZONE - 184)) | (1L << (ENCRYPT - 184)) | (1L << (DECRYPT - 184)) | (1L << (DEFERRABLE - 184)) | (1L << (DEFERRED - 184)) | (1L << (EDITION - 184)) | (1L << (ELEMENT - 184)) | (1L << (END - 184)) | (1L << (EXCEPTIONS - 184)) | (1L << (FORCE - 184)) | (1L << (GLOBAL - 184)) | (1L << (IDENTITY - 184)) | (1L << (INITIALLY - 184)) | (1L << (INVALIDATE - 184)) | (1L << (JAVA - 184)) | (1L << (LEVELS - 184)) | (1L << (MAXVALUE - 184)) | (1L << (MINVALUE - 184)) | (1L << (NOMAXVALUE - 184)) | (1L << (NOMINVALUE - 184)) | (1L << (MINING - 184)) | (1L << (MODEL - 184)))) != 0) || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (NATIONAL - 249)) | (1L << (NEW - 249)) | (1L << (NOORDER - 249)) | (1L << (NORELY - 249)) | (1L << (ONLY - 249)) | (1L << (PROFILE - 249)) | (1L << (REF - 249)) | (1L << (REKEY - 249)) | (1L << (RELY - 249)) | (1L << (REPLACE - 249)) | (1L << (SALT - 249)) | (1L << (SCOPE - 249)) | (1L << (SORT - 249)) | (1L << (SOURCE - 249)) | (1L << (SUBSTITUTABLE - 249)) | (1L << (TABLESPACE - 249)) | (1L << (TEMPORARY - 249)) | (1L << (TRANSLATION - 249)) | (1L << (TREAT - 249)) | (1L << (NO - 249)) | (1L << (UNUSED - 249)) | (1L << (NOVALIDATE - 249)) | (1L << (VALUE - 249)) | (1L << (VARYING - 249)) | (1L << (VIRTUAL - 249)) | (1L << (ZONE - 249)) | (1L << (ADVISOR - 249)) | (1L << (ADMINISTER - 249)) | (1L << (TUNING - 249)) | (1L << (MANAGE - 249)) | (1L << (MANAGEMENT - 249)) | (1L << (OBJECT - 249)) | (1L << (CLUSTER - 249)) | (1L << (CONTEXT - 249)) | (1L << (EXEMPT - 249)) | (1L << (REDACTION - 249)) | (1L << (POLICY - 249)) | (1L << (DATABASE - 249)) | (1L << (SYSTEM - 249)) | (1L << (AUDIT - 249)) | (1L << (LINK - 249)) | (1L << (ANALYZE - 249)) | (1L << (DICTIONARY - 249)) | (1L << (DIMENSION - 249)) | (1L << (INDEXTYPE - 249)) | (1L << (EXTERNAL - 249)) | (1L << (JOB - 249)) | (1L << (CLASS - 249)) | (1L << (PROGRAM - 249)) | (1L << (SCHEDULER - 249)) | (1L << (LIBRARY - 249)) | (1L << (LOGMINING - 249)) | (1L << (MATERIALIZED - 249)) | (1L << (CUBE - 249)))) != 0) || ((((_la - 313)) & ~0x3f) == 0 && ((1L << (_la - 313)) & ((1L << (MEASURE - 313)) | (1L << (FOLDER - 313)) | (1L << (BUILD - 313)) | (1L << (PROCESS - 313)) | (1L << (OPERATOR - 313)) | (1L << (OUTLINE - 313)) | (1L << (PLUGGABLE - 313)) | (1L << (CONTAINER - 313)) | (1L << (SEGMENT - 313)) | (1L << (RESTRICTED - 313)) | (1L << (COST - 313)) | (1L << (SYNONYM - 313)) | (1L << (BACKUP - 313)) | (1L << (UNLIMITED - 313)) | (1L << (BECOME - 313)) | (1L << (CHANGE - 313)) | (1L << (NOTIFICATION - 313)) | (1L << (ACCESS - 313)) | (1L << (PRIVILEGE - 313)) | (1L << (PURGE - 313)) | (1L << (RESUMABLE - 313)) | (1L << (SYSGUID - 313)) | (1L << (SYSBACKUP - 313)) | (1L << (SYSDBA - 313)) | (1L << (SYSDG - 313)) | (1L << (SYSKM - 313)) | (1L << (SYSOPER - 313)) | (1L << (DBA_RECYCLEBIN - 313)) | (1L << (FIRST - 313)) | (1L << (IDENTIFIER_ - 313)) | (1L << (STRING_ - 313)))) != 0)) {
					{
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(741);
						match(AS);
						}
					}

					setState(744);
					alias();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(747);
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
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_alias);
		try {
			setState(752);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				identifier();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(751);
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
		public TerminalNode ASTERISK_() { return getToken(OracleStatementParser.ASTERISK_, 0); }
		public UnqualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedShorthand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitUnqualifiedShorthand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnqualifiedShorthandContext unqualifiedShorthand() throws RecognitionException {
		UnqualifiedShorthandContext _localctx = new UnqualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unqualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
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
		public TerminalNode DOT_ASTERISK_() { return getToken(OracleStatementParser.DOT_ASTERISK_, 0); }
		public QualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedShorthand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitQualifiedShorthand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedShorthandContext qualifiedShorthand() throws RecognitionException {
		QualifiedShorthandContext _localctx = new QualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_qualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			identifier();
			setState(757);
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
		public TerminalNode FROM() { return getToken(OracleStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(FROM);
			setState(760);
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
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TableReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferences; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTableReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferencesContext tableReferences() throws RecognitionException {
		TableReferencesContext _localctx = new TableReferencesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tableReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			tableReference();
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(763);
				match(COMMA_);
				setState(764);
				tableReference();
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
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tableReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			tableFactor();
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (NATURAL - 83)) | (1L << (JOIN - 83)) | (1L << (FULL - 83)) | (1L << (INNER - 83)) | (1L << (LEFT - 83)) | (1L << (RIGHT - 83)) | (1L << (CROSS - 83)))) != 0)) {
				{
				{
				setState(771);
				joinedTable();
				}
				}
				setState(776);
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
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TableFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFactor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTableFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFactorContext tableFactor() throws RecognitionException {
		TableFactorContext _localctx = new TableFactorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tableFactor);
		int _la;
		try {
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				tableName();
				setState(782);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(779);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(778);
						match(AS);
						}
					}

					setState(781);
					alias();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				subquery();
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(785);
					match(AS);
					}
				}

				setState(788);
				alias();
				setState(790);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(789);
					columnNames();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(792);
				match(LP_);
				setState(793);
				tableReferences();
				setState(794);
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
		public TerminalNode JOIN() { return getToken(OracleStatementParser.JOIN, 0); }
		public TerminalNode NATURAL() { return getToken(OracleStatementParser.NATURAL, 0); }
		public JoinSpecificationContext joinSpecification() {
			return getRuleContext(JoinSpecificationContext.class,0);
		}
		public TerminalNode INNER() { return getToken(OracleStatementParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(OracleStatementParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(OracleStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(OracleStatementParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(OracleStatementParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(OracleStatementParser.OUTER, 0); }
		public JoinedTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinedTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitJoinedTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinedTableContext joinedTable() throws RecognitionException {
		JoinedTableContext _localctx = new JoinedTableContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_joinedTable);
		int _la;
		try {
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL) {
					{
					setState(798);
					match(NATURAL);
					}
				}

				{
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(801);
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

				setState(804);
				match(JOIN);
				}
				setState(806);
				tableFactor();
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(807);
					joinSpecification();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL) {
					{
					setState(810);
					match(NATURAL);
					}
				}

				setState(813);
				_la = _input.LA(1);
				if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (FULL - 85)) | (1L << (LEFT - 85)) | (1L << (RIGHT - 85)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(814);
					match(OUTER);
					}
				}

				setState(817);
				match(JOIN);
				setState(818);
				tableFactor();
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(819);
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
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public JoinSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitJoinSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinSpecificationContext joinSpecification() throws RecognitionException {
		JoinSpecificationContext _localctx = new JoinSpecificationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_joinSpecification);
		try {
			setState(828);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(824);
				match(ON);
				setState(825);
				expr(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(826);
				match(USING);
				setState(827);
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
		public TerminalNode WHERE() { return getToken(OracleStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(WHERE);
			setState(831);
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
		public TerminalNode GROUP() { return getToken(OracleStatementParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(GROUP);
			setState(834);
			match(BY);
			setState(835);
			orderByItem();
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(836);
				match(COMMA_);
				setState(837);
				orderByItem();
				}
				}
				setState(842);
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
		public TerminalNode HAVING() { return getToken(OracleStatementParser.HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(HAVING);
			setState(844);
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

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public UnionClauseContext unionClause() {
			return getRuleContext(UnionClauseContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(LP_);
			setState(847);
			unionClause();
			setState(848);
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
		public TerminalNode QUESTION_() { return getToken(OracleStatementParser.QUESTION_, 0); }
		public ParameterMarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterMarker; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitParameterMarker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterMarkerContext parameterMarker() throws RecognitionException {
		ParameterMarkerContext _localctx = new ParameterMarkerContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parameterMarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
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
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_literals);
		try {
			setState(859);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				stringLiterals();
				}
				break;
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				numberLiterals();
				}
				break;
			case LBE_:
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(854);
				dateTimeLiterals();
				}
				break;
			case HEX_DIGIT_:
				enterOuterAlt(_localctx, 4);
				{
				setState(855);
				hexadecimalLiterals();
				}
				break;
			case BIT_NUM_:
				enterOuterAlt(_localctx, 5);
				{
				setState(856);
				bitValueLiterals();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(857);
				booleanLiterals();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(858);
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
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public StringLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitStringLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralsContext stringLiterals() throws RecognitionException {
		StringLiteralsContext _localctx = new StringLiteralsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_stringLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
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

	public static class NumberLiteralsContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public TerminalNode MINUS_() { return getToken(OracleStatementParser.MINUS_, 0); }
		public NumberLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitNumberLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralsContext numberLiterals() throws RecognitionException {
		NumberLiteralsContext _localctx = new NumberLiteralsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_numberLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS_) {
				{
				setState(863);
				match(MINUS_);
				}
			}

			setState(866);
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
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public TerminalNode DATE() { return getToken(OracleStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(OracleStatementParser.TIMESTAMP, 0); }
		public TerminalNode LBE_() { return getToken(OracleStatementParser.LBE_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBE_() { return getToken(OracleStatementParser.RBE_, 0); }
		public DateTimeLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDateTimeLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateTimeLiteralsContext dateTimeLiterals() throws RecognitionException {
		DateTimeLiteralsContext _localctx = new DateTimeLiteralsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dateTimeLiterals);
		int _la;
		try {
			setState(875);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				_la = _input.LA(1);
				if ( !(((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (DATE - 131)) | (1L << (TIME - 131)) | (1L << (TIMESTAMP - 131)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(869);
				match(STRING_);
				}
				break;
			case LBE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(870);
				match(LBE_);
				setState(871);
				identifier();
				setState(872);
				match(STRING_);
				setState(873);
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
		public TerminalNode HEX_DIGIT_() { return getToken(OracleStatementParser.HEX_DIGIT_, 0); }
		public HexadecimalLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitHexadecimalLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexadecimalLiteralsContext hexadecimalLiterals() throws RecognitionException {
		HexadecimalLiteralsContext _localctx = new HexadecimalLiteralsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_hexadecimalLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
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
		public TerminalNode BIT_NUM_() { return getToken(OracleStatementParser.BIT_NUM_, 0); }
		public BitValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitValueLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitBitValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitValueLiteralsContext bitValueLiterals() throws RecognitionException {
		BitValueLiteralsContext _localctx = new BitValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_bitValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
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
		public TerminalNode TRUE() { return getToken(OracleStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OracleStatementParser.FALSE, 0); }
		public BooleanLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitBooleanLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralsContext booleanLiterals() throws RecognitionException {
		BooleanLiteralsContext _localctx = new BooleanLiteralsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_booleanLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
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
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public NullValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullValueLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitNullValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullValueLiteralsContext nullValueLiterals() throws RecognitionException {
		NullValueLiteralsContext _localctx = new NullValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_nullValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
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
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public UnreservedWordContext unreservedWord() {
			return getRuleContext(UnreservedWordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_identifier);
		try {
			setState(887);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				match(IDENTIFIER_);
				}
				break;
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
				enterOuterAlt(_localctx, 2);
				{
				setState(886);
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
		public TerminalNode TRUNCATE() { return getToken(OracleStatementParser.TRUNCATE, 0); }
		public TerminalNode FUNCTION() { return getToken(OracleStatementParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(OracleStatementParser.PROCEDURE, 0); }
		public TerminalNode CASE() { return getToken(OracleStatementParser.CASE, 0); }
		public TerminalNode WHEN() { return getToken(OracleStatementParser.WHEN, 0); }
		public TerminalNode CAST() { return getToken(OracleStatementParser.CAST, 0); }
		public TerminalNode TRIM() { return getToken(OracleStatementParser.TRIM, 0); }
		public TerminalNode SUBSTRING() { return getToken(OracleStatementParser.SUBSTRING, 0); }
		public TerminalNode NATURAL() { return getToken(OracleStatementParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(OracleStatementParser.JOIN, 0); }
		public TerminalNode FULL() { return getToken(OracleStatementParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(OracleStatementParser.INNER, 0); }
		public TerminalNode OUTER() { return getToken(OracleStatementParser.OUTER, 0); }
		public TerminalNode LEFT() { return getToken(OracleStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(OracleStatementParser.RIGHT, 0); }
		public TerminalNode CROSS() { return getToken(OracleStatementParser.CROSS, 0); }
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public TerminalNode IF() { return getToken(OracleStatementParser.IF, 0); }
		public TerminalNode TRUE() { return getToken(OracleStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OracleStatementParser.FALSE, 0); }
		public TerminalNode LIMIT() { return getToken(OracleStatementParser.LIMIT, 0); }
		public TerminalNode OFFSET() { return getToken(OracleStatementParser.OFFSET, 0); }
		public TerminalNode BEGIN() { return getToken(OracleStatementParser.BEGIN, 0); }
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(OracleStatementParser.ROLLBACK, 0); }
		public TerminalNode SAVEPOINT() { return getToken(OracleStatementParser.SAVEPOINT, 0); }
		public TerminalNode BOOLEAN() { return getToken(OracleStatementParser.BOOLEAN, 0); }
		public TerminalNode DOUBLE() { return getToken(OracleStatementParser.DOUBLE, 0); }
		public TerminalNode CHARACTER() { return getToken(OracleStatementParser.CHARACTER, 0); }
		public TerminalNode ARRAY() { return getToken(OracleStatementParser.ARRAY, 0); }
		public TerminalNode INTERVAL() { return getToken(OracleStatementParser.INTERVAL, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(OracleStatementParser.TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(OracleStatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(OracleStatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode YEAR() { return getToken(OracleStatementParser.YEAR, 0); }
		public TerminalNode QUARTER() { return getToken(OracleStatementParser.QUARTER, 0); }
		public TerminalNode MONTH() { return getToken(OracleStatementParser.MONTH, 0); }
		public TerminalNode WEEK() { return getToken(OracleStatementParser.WEEK, 0); }
		public TerminalNode DAY() { return getToken(OracleStatementParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(OracleStatementParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(OracleStatementParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(OracleStatementParser.SECOND, 0); }
		public TerminalNode MICROSECOND() { return getToken(OracleStatementParser.MICROSECOND, 0); }
		public TerminalNode MAX() { return getToken(OracleStatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(OracleStatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(OracleStatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(OracleStatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(OracleStatementParser.AVG, 0); }
		public TerminalNode ENABLE() { return getToken(OracleStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(OracleStatementParser.DISABLE, 0); }
		public TerminalNode BINARY() { return getToken(OracleStatementParser.BINARY, 0); }
		public TerminalNode ESCAPE() { return getToken(OracleStatementParser.ESCAPE, 0); }
		public TerminalNode MOD() { return getToken(OracleStatementParser.MOD, 0); }
		public TerminalNode UNKNOWN() { return getToken(OracleStatementParser.UNKNOWN, 0); }
		public TerminalNode XOR() { return getToken(OracleStatementParser.XOR, 0); }
		public TerminalNode ALWAYS() { return getToken(OracleStatementParser.ALWAYS, 0); }
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode GENERATED() { return getToken(OracleStatementParser.GENERATED, 0); }
		public TerminalNode PRIVILEGES() { return getToken(OracleStatementParser.PRIVILEGES, 0); }
		public TerminalNode READ() { return getToken(OracleStatementParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(OracleStatementParser.WRITE, 0); }
		public TerminalNode REFERENCES() { return getToken(OracleStatementParser.REFERENCES, 0); }
		public TerminalNode TRANSACTION() { return getToken(OracleStatementParser.TRANSACTION, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public TerminalNode VISIBLE() { return getToken(OracleStatementParser.VISIBLE, 0); }
		public TerminalNode INVISIBLE() { return getToken(OracleStatementParser.INVISIBLE, 0); }
		public TerminalNode EXECUTE() { return getToken(OracleStatementParser.EXECUTE, 0); }
		public TerminalNode USE() { return getToken(OracleStatementParser.USE, 0); }
		public TerminalNode DEBUG() { return getToken(OracleStatementParser.DEBUG, 0); }
		public TerminalNode UNDER() { return getToken(OracleStatementParser.UNDER, 0); }
		public TerminalNode FLASHBACK() { return getToken(OracleStatementParser.FLASHBACK, 0); }
		public TerminalNode ARCHIVE() { return getToken(OracleStatementParser.ARCHIVE, 0); }
		public TerminalNode REFRESH() { return getToken(OracleStatementParser.REFRESH, 0); }
		public TerminalNode QUERY() { return getToken(OracleStatementParser.QUERY, 0); }
		public TerminalNode REWRITE() { return getToken(OracleStatementParser.REWRITE, 0); }
		public TerminalNode KEEP() { return getToken(OracleStatementParser.KEEP, 0); }
		public TerminalNode SEQUENCE() { return getToken(OracleStatementParser.SEQUENCE, 0); }
		public TerminalNode INHERIT() { return getToken(OracleStatementParser.INHERIT, 0); }
		public TerminalNode TRANSLATE() { return getToken(OracleStatementParser.TRANSLATE, 0); }
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode MERGE() { return getToken(OracleStatementParser.MERGE, 0); }
		public TerminalNode AT() { return getToken(OracleStatementParser.AT, 0); }
		public TerminalNode BITMAP() { return getToken(OracleStatementParser.BITMAP, 0); }
		public TerminalNode CACHE() { return getToken(OracleStatementParser.CACHE, 0); }
		public TerminalNode CHECKPOINT() { return getToken(OracleStatementParser.CHECKPOINT, 0); }
		public TerminalNode CONNECT() { return getToken(OracleStatementParser.CONNECT, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(OracleStatementParser.CONSTRAINTS, 0); }
		public TerminalNode CYCLE() { return getToken(OracleStatementParser.CYCLE, 0); }
		public TerminalNode DBTIMEZONE() { return getToken(OracleStatementParser.DBTIMEZONE, 0); }
		public TerminalNode ENCRYPT() { return getToken(OracleStatementParser.ENCRYPT, 0); }
		public TerminalNode DECRYPT() { return getToken(OracleStatementParser.DECRYPT, 0); }
		public TerminalNode DEFERRABLE() { return getToken(OracleStatementParser.DEFERRABLE, 0); }
		public TerminalNode DEFERRED() { return getToken(OracleStatementParser.DEFERRED, 0); }
		public TerminalNode EDITION() { return getToken(OracleStatementParser.EDITION, 0); }
		public TerminalNode ELEMENT() { return getToken(OracleStatementParser.ELEMENT, 0); }
		public TerminalNode END() { return getToken(OracleStatementParser.END, 0); }
		public TerminalNode EXCEPTIONS() { return getToken(OracleStatementParser.EXCEPTIONS, 0); }
		public TerminalNode FORCE() { return getToken(OracleStatementParser.FORCE, 0); }
		public TerminalNode GLOBAL() { return getToken(OracleStatementParser.GLOBAL, 0); }
		public TerminalNode IDENTITY() { return getToken(OracleStatementParser.IDENTITY, 0); }
		public TerminalNode INITIALLY() { return getToken(OracleStatementParser.INITIALLY, 0); }
		public TerminalNode INVALIDATE() { return getToken(OracleStatementParser.INVALIDATE, 0); }
		public TerminalNode JAVA() { return getToken(OracleStatementParser.JAVA, 0); }
		public TerminalNode LEVELS() { return getToken(OracleStatementParser.LEVELS, 0); }
		public TerminalNode LOCAL() { return getToken(OracleStatementParser.LOCAL, 0); }
		public TerminalNode MAXVALUE() { return getToken(OracleStatementParser.MAXVALUE, 0); }
		public TerminalNode MINVALUE() { return getToken(OracleStatementParser.MINVALUE, 0); }
		public TerminalNode NOMAXVALUE() { return getToken(OracleStatementParser.NOMAXVALUE, 0); }
		public TerminalNode NOMINVALUE() { return getToken(OracleStatementParser.NOMINVALUE, 0); }
		public TerminalNode MINING() { return getToken(OracleStatementParser.MINING, 0); }
		public TerminalNode MODEL() { return getToken(OracleStatementParser.MODEL, 0); }
		public TerminalNode NATIONAL() { return getToken(OracleStatementParser.NATIONAL, 0); }
		public TerminalNode NEW() { return getToken(OracleStatementParser.NEW, 0); }
		public TerminalNode NOCACHE() { return getToken(OracleStatementParser.NOCACHE, 0); }
		public TerminalNode NOCYCLE() { return getToken(OracleStatementParser.NOCYCLE, 0); }
		public TerminalNode NOORDER() { return getToken(OracleStatementParser.NOORDER, 0); }
		public TerminalNode NORELY() { return getToken(OracleStatementParser.NORELY, 0); }
		public TerminalNode NOVALIDATE() { return getToken(OracleStatementParser.NOVALIDATE, 0); }
		public TerminalNode ONLY() { return getToken(OracleStatementParser.ONLY, 0); }
		public TerminalNode PRESERVE() { return getToken(OracleStatementParser.PRESERVE, 0); }
		public TerminalNode PROFILE() { return getToken(OracleStatementParser.PROFILE, 0); }
		public TerminalNode REF() { return getToken(OracleStatementParser.REF, 0); }
		public TerminalNode REKEY() { return getToken(OracleStatementParser.REKEY, 0); }
		public TerminalNode RELY() { return getToken(OracleStatementParser.RELY, 0); }
		public TerminalNode REPLACE() { return getToken(OracleStatementParser.REPLACE, 0); }
		public TerminalNode SOURCE() { return getToken(OracleStatementParser.SOURCE, 0); }
		public TerminalNode SALT() { return getToken(OracleStatementParser.SALT, 0); }
		public TerminalNode SCOPE() { return getToken(OracleStatementParser.SCOPE, 0); }
		public TerminalNode SORT() { return getToken(OracleStatementParser.SORT, 0); }
		public TerminalNode SUBSTITUTABLE() { return getToken(OracleStatementParser.SUBSTITUTABLE, 0); }
		public TerminalNode TABLESPACE() { return getToken(OracleStatementParser.TABLESPACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(OracleStatementParser.TEMPORARY, 0); }
		public TerminalNode TRANSLATION() { return getToken(OracleStatementParser.TRANSLATION, 0); }
		public TerminalNode TREAT() { return getToken(OracleStatementParser.TREAT, 0); }
		public TerminalNode NO() { return getToken(OracleStatementParser.NO, 0); }
		public TerminalNode TYPE() { return getToken(OracleStatementParser.TYPE, 0); }
		public TerminalNode UNUSED() { return getToken(OracleStatementParser.UNUSED, 0); }
		public TerminalNode VALUE() { return getToken(OracleStatementParser.VALUE, 0); }
		public TerminalNode VARYING() { return getToken(OracleStatementParser.VARYING, 0); }
		public TerminalNode VIRTUAL() { return getToken(OracleStatementParser.VIRTUAL, 0); }
		public TerminalNode ZONE() { return getToken(OracleStatementParser.ZONE, 0); }
		public TerminalNode ADVISOR() { return getToken(OracleStatementParser.ADVISOR, 0); }
		public TerminalNode ADMINISTER() { return getToken(OracleStatementParser.ADMINISTER, 0); }
		public TerminalNode TUNING() { return getToken(OracleStatementParser.TUNING, 0); }
		public TerminalNode MANAGE() { return getToken(OracleStatementParser.MANAGE, 0); }
		public TerminalNode MANAGEMENT() { return getToken(OracleStatementParser.MANAGEMENT, 0); }
		public TerminalNode OBJECT() { return getToken(OracleStatementParser.OBJECT, 0); }
		public TerminalNode CLUSTER() { return getToken(OracleStatementParser.CLUSTER, 0); }
		public TerminalNode CONTEXT() { return getToken(OracleStatementParser.CONTEXT, 0); }
		public TerminalNode EXEMPT() { return getToken(OracleStatementParser.EXEMPT, 0); }
		public TerminalNode REDACTION() { return getToken(OracleStatementParser.REDACTION, 0); }
		public TerminalNode POLICY() { return getToken(OracleStatementParser.POLICY, 0); }
		public TerminalNode DATABASE() { return getToken(OracleStatementParser.DATABASE, 0); }
		public TerminalNode SYSTEM() { return getToken(OracleStatementParser.SYSTEM, 0); }
		public TerminalNode AUDIT() { return getToken(OracleStatementParser.AUDIT, 0); }
		public TerminalNode LINK() { return getToken(OracleStatementParser.LINK, 0); }
		public TerminalNode ANALYZE() { return getToken(OracleStatementParser.ANALYZE, 0); }
		public TerminalNode DICTIONARY() { return getToken(OracleStatementParser.DICTIONARY, 0); }
		public TerminalNode DIMENSION() { return getToken(OracleStatementParser.DIMENSION, 0); }
		public TerminalNode INDEXTYPE() { return getToken(OracleStatementParser.INDEXTYPE, 0); }
		public TerminalNode EXTERNAL() { return getToken(OracleStatementParser.EXTERNAL, 0); }
		public TerminalNode JOB() { return getToken(OracleStatementParser.JOB, 0); }
		public TerminalNode CLASS() { return getToken(OracleStatementParser.CLASS, 0); }
		public TerminalNode PROGRAM() { return getToken(OracleStatementParser.PROGRAM, 0); }
		public TerminalNode SCHEDULER() { return getToken(OracleStatementParser.SCHEDULER, 0); }
		public TerminalNode LIBRARY() { return getToken(OracleStatementParser.LIBRARY, 0); }
		public TerminalNode LOGMINING() { return getToken(OracleStatementParser.LOGMINING, 0); }
		public TerminalNode MATERIALIZED() { return getToken(OracleStatementParser.MATERIALIZED, 0); }
		public TerminalNode CUBE() { return getToken(OracleStatementParser.CUBE, 0); }
		public TerminalNode MEASURE() { return getToken(OracleStatementParser.MEASURE, 0); }
		public TerminalNode FOLDER() { return getToken(OracleStatementParser.FOLDER, 0); }
		public TerminalNode BUILD() { return getToken(OracleStatementParser.BUILD, 0); }
		public TerminalNode PROCESS() { return getToken(OracleStatementParser.PROCESS, 0); }
		public TerminalNode OPERATOR() { return getToken(OracleStatementParser.OPERATOR, 0); }
		public TerminalNode OUTLINE() { return getToken(OracleStatementParser.OUTLINE, 0); }
		public TerminalNode PLUGGABLE() { return getToken(OracleStatementParser.PLUGGABLE, 0); }
		public TerminalNode CONTAINER() { return getToken(OracleStatementParser.CONTAINER, 0); }
		public TerminalNode SEGMENT() { return getToken(OracleStatementParser.SEGMENT, 0); }
		public TerminalNode RESTRICTED() { return getToken(OracleStatementParser.RESTRICTED, 0); }
		public TerminalNode COST() { return getToken(OracleStatementParser.COST, 0); }
		public TerminalNode SYNONYM() { return getToken(OracleStatementParser.SYNONYM, 0); }
		public TerminalNode BACKUP() { return getToken(OracleStatementParser.BACKUP, 0); }
		public TerminalNode UNLIMITED() { return getToken(OracleStatementParser.UNLIMITED, 0); }
		public TerminalNode BECOME() { return getToken(OracleStatementParser.BECOME, 0); }
		public TerminalNode CHANGE() { return getToken(OracleStatementParser.CHANGE, 0); }
		public TerminalNode NOTIFICATION() { return getToken(OracleStatementParser.NOTIFICATION, 0); }
		public TerminalNode ACCESS() { return getToken(OracleStatementParser.ACCESS, 0); }
		public TerminalNode PRIVILEGE() { return getToken(OracleStatementParser.PRIVILEGE, 0); }
		public TerminalNode PURGE() { return getToken(OracleStatementParser.PURGE, 0); }
		public TerminalNode RESUMABLE() { return getToken(OracleStatementParser.RESUMABLE, 0); }
		public TerminalNode SYSGUID() { return getToken(OracleStatementParser.SYSGUID, 0); }
		public TerminalNode SYSBACKUP() { return getToken(OracleStatementParser.SYSBACKUP, 0); }
		public TerminalNode SYSDBA() { return getToken(OracleStatementParser.SYSDBA, 0); }
		public TerminalNode SYSDG() { return getToken(OracleStatementParser.SYSDG, 0); }
		public TerminalNode SYSKM() { return getToken(OracleStatementParser.SYSKM, 0); }
		public TerminalNode SYSOPER() { return getToken(OracleStatementParser.SYSOPER, 0); }
		public TerminalNode DBA_RECYCLEBIN() { return getToken(OracleStatementParser.DBA_RECYCLEBIN, 0); }
		public TerminalNode SCHEMA() { return getToken(OracleStatementParser.SCHEMA, 0); }
		public TerminalNode DO() { return getToken(OracleStatementParser.DO, 0); }
		public TerminalNode DEFINER() { return getToken(OracleStatementParser.DEFINER, 0); }
		public TerminalNode CURRENT_USER() { return getToken(OracleStatementParser.CURRENT_USER, 0); }
		public TerminalNode CASCADED() { return getToken(OracleStatementParser.CASCADED, 0); }
		public TerminalNode CLOSE() { return getToken(OracleStatementParser.CLOSE, 0); }
		public TerminalNode OPEN() { return getToken(OracleStatementParser.OPEN, 0); }
		public TerminalNode NEXT() { return getToken(OracleStatementParser.NEXT, 0); }
		public TerminalNode NAME() { return getToken(OracleStatementParser.NAME, 0); }
		public TerminalNode NAMES() { return getToken(OracleStatementParser.NAMES, 0); }
		public TerminalNode INTEGER() { return getToken(OracleStatementParser.INTEGER, 0); }
		public TerminalNode COLLATION() { return getToken(OracleStatementParser.COLLATION, 0); }
		public TerminalNode REAL() { return getToken(OracleStatementParser.REAL, 0); }
		public TerminalNode DECIMAL() { return getToken(OracleStatementParser.DECIMAL, 0); }
		public TerminalNode FIRST() { return getToken(OracleStatementParser.FIRST, 0); }
		public UnreservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreservedWord; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitUnreservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnreservedWordContext unreservedWord() throws RecognitionException {
		UnreservedWordContext _localctx = new UnreservedWordContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_unreservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (SCHEMA - 52)) | (1L << (FUNCTION - 52)) | (1L << (PROCEDURE - 52)) | (1L << (CASE - 52)) | (1L << (WHEN - 52)) | (1L << (CAST - 52)) | (1L << (TRIM - 52)) | (1L << (SUBSTRING - 52)) | (1L << (NATURAL - 52)) | (1L << (JOIN - 52)) | (1L << (FULL - 52)) | (1L << (INNER - 52)) | (1L << (OUTER - 52)) | (1L << (LEFT - 52)) | (1L << (RIGHT - 52)) | (1L << (CROSS - 52)) | (1L << (USING - 52)) | (1L << (IF - 52)) | (1L << (TRUE - 52)) | (1L << (FALSE - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (BEGIN - 119)) | (1L << (COMMIT - 119)) | (1L << (ROLLBACK - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (DOUBLE - 119)) | (1L << (CHARACTER - 119)) | (1L << (ARRAY - 119)) | (1L << (INTERVAL - 119)) | (1L << (TIME - 119)) | (1L << (TIMESTAMP - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (YEAR - 119)) | (1L << (QUARTER - 119)) | (1L << (MONTH - 119)) | (1L << (WEEK - 119)) | (1L << (DAY - 119)) | (1L << (HOUR - 119)) | (1L << (MINUTE - 119)) | (1L << (SECOND - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (PRESERVE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (CURRENT_USER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (CLOSE - 119)) | (1L << (OPEN - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (COLLATION - 119)) | (1L << (NAMES - 119)) | (1L << (INTEGER - 119)) | (1L << (REAL - 119)) | (1L << (DECIMAL - 119)) | (1L << (TYPE - 119)) | (1L << (BINARY - 119)) | (1L << (ESCAPE - 119)) | (1L << (MOD - 119)) | (1L << (XOR - 119)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (UNKNOWN - 184)) | (1L << (ALWAYS - 184)) | (1L << (CASCADE - 184)) | (1L << (GENERATED - 184)) | (1L << (PRIVILEGES - 184)) | (1L << (READ - 184)) | (1L << (WRITE - 184)) | (1L << (REFERENCES - 184)) | (1L << (TRANSACTION - 184)) | (1L << (ROLE - 184)) | (1L << (VISIBLE - 184)) | (1L << (INVISIBLE - 184)) | (1L << (EXECUTE - 184)) | (1L << (USE - 184)) | (1L << (DEBUG - 184)) | (1L << (UNDER - 184)) | (1L << (FLASHBACK - 184)) | (1L << (ARCHIVE - 184)) | (1L << (REFRESH - 184)) | (1L << (QUERY - 184)) | (1L << (REWRITE - 184)) | (1L << (KEEP - 184)) | (1L << (SEQUENCE - 184)) | (1L << (INHERIT - 184)) | (1L << (TRANSLATE - 184)) | (1L << (MERGE - 184)) | (1L << (AT - 184)) | (1L << (BITMAP - 184)) | (1L << (CACHE - 184)) | (1L << (NOCACHE - 184)) | (1L << (CHECKPOINT - 184)) | (1L << (CONNECT - 184)) | (1L << (CONSTRAINTS - 184)) | (1L << (CYCLE - 184)) | (1L << (NOCYCLE - 184)) | (1L << (DBTIMEZONE - 184)) | (1L << (ENCRYPT - 184)) | (1L << (DECRYPT - 184)) | (1L << (DEFERRABLE - 184)) | (1L << (DEFERRED - 184)) | (1L << (EDITION - 184)) | (1L << (ELEMENT - 184)) | (1L << (END - 184)) | (1L << (EXCEPTIONS - 184)) | (1L << (FORCE - 184)) | (1L << (GLOBAL - 184)) | (1L << (IDENTITY - 184)) | (1L << (INITIALLY - 184)) | (1L << (INVALIDATE - 184)) | (1L << (JAVA - 184)) | (1L << (LEVELS - 184)) | (1L << (MAXVALUE - 184)) | (1L << (MINVALUE - 184)) | (1L << (NOMAXVALUE - 184)) | (1L << (NOMINVALUE - 184)) | (1L << (MINING - 184)) | (1L << (MODEL - 184)))) != 0) || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (NATIONAL - 249)) | (1L << (NEW - 249)) | (1L << (NOORDER - 249)) | (1L << (NORELY - 249)) | (1L << (ONLY - 249)) | (1L << (PROFILE - 249)) | (1L << (REF - 249)) | (1L << (REKEY - 249)) | (1L << (RELY - 249)) | (1L << (REPLACE - 249)) | (1L << (SALT - 249)) | (1L << (SCOPE - 249)) | (1L << (SORT - 249)) | (1L << (SOURCE - 249)) | (1L << (SUBSTITUTABLE - 249)) | (1L << (TABLESPACE - 249)) | (1L << (TEMPORARY - 249)) | (1L << (TRANSLATION - 249)) | (1L << (TREAT - 249)) | (1L << (NO - 249)) | (1L << (UNUSED - 249)) | (1L << (NOVALIDATE - 249)) | (1L << (VALUE - 249)) | (1L << (VARYING - 249)) | (1L << (VIRTUAL - 249)) | (1L << (ZONE - 249)) | (1L << (ADVISOR - 249)) | (1L << (ADMINISTER - 249)) | (1L << (TUNING - 249)) | (1L << (MANAGE - 249)) | (1L << (MANAGEMENT - 249)) | (1L << (OBJECT - 249)) | (1L << (CLUSTER - 249)) | (1L << (CONTEXT - 249)) | (1L << (EXEMPT - 249)) | (1L << (REDACTION - 249)) | (1L << (POLICY - 249)) | (1L << (DATABASE - 249)) | (1L << (SYSTEM - 249)) | (1L << (AUDIT - 249)) | (1L << (LINK - 249)) | (1L << (ANALYZE - 249)) | (1L << (DICTIONARY - 249)) | (1L << (DIMENSION - 249)) | (1L << (INDEXTYPE - 249)) | (1L << (EXTERNAL - 249)) | (1L << (JOB - 249)) | (1L << (CLASS - 249)) | (1L << (PROGRAM - 249)) | (1L << (SCHEDULER - 249)) | (1L << (LIBRARY - 249)) | (1L << (LOGMINING - 249)) | (1L << (MATERIALIZED - 249)) | (1L << (CUBE - 249)))) != 0) || ((((_la - 313)) & ~0x3f) == 0 && ((1L << (_la - 313)) & ((1L << (MEASURE - 313)) | (1L << (FOLDER - 313)) | (1L << (BUILD - 313)) | (1L << (PROCESS - 313)) | (1L << (OPERATOR - 313)) | (1L << (OUTLINE - 313)) | (1L << (PLUGGABLE - 313)) | (1L << (CONTAINER - 313)) | (1L << (SEGMENT - 313)) | (1L << (RESTRICTED - 313)) | (1L << (COST - 313)) | (1L << (SYNONYM - 313)) | (1L << (BACKUP - 313)) | (1L << (UNLIMITED - 313)) | (1L << (BECOME - 313)) | (1L << (CHANGE - 313)) | (1L << (NOTIFICATION - 313)) | (1L << (ACCESS - 313)) | (1L << (PRIVILEGE - 313)) | (1L << (PURGE - 313)) | (1L << (RESUMABLE - 313)) | (1L << (SYSGUID - 313)) | (1L << (SYSBACKUP - 313)) | (1L << (SYSDBA - 313)) | (1L << (SYSDG - 313)) | (1L << (SYSKM - 313)) | (1L << (SYSOPER - 313)) | (1L << (DBA_RECYCLEBIN - 313)) | (1L << (FIRST - 313)))) != 0)) ) {
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
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
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
		public TerminalNode DOT_() { return getToken(OracleStatementParser.DOT_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(893);
				owner();
				setState(894);
				match(DOT_);
				}
				break;
			}
			setState(898);
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
		public TerminalNode DOT_() { return getToken(OracleStatementParser.DOT_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(900);
				owner();
				setState(901);
				match(DOT_);
				}
				break;
			}
			setState(905);
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
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOwner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnerContext owner() throws RecognitionException {
		OwnerContext _localctx = new OwnerContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_owner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
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
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_columnNames);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(911);
				match(LP_);
				}
			}

			setState(914);
			columnName();
			setState(919);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(915);
					match(COMMA_);
					setState(916);
					columnName();
					}
					} 
				}
				setState(921);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(922);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTableNames(this);
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
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(925);
				match(LP_);
				}
			}

			setState(928);
			tableName();
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(929);
				match(COMMA_);
				setState(930);
				tableName();
				}
				}
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(936);
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
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIndexName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
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

	public static class OracleIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(OracleStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(OracleStatementParser.STRING_, i);
		}
		public List<TerminalNode> DOT_() { return getTokens(OracleStatementParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(OracleStatementParser.DOT_, i);
		}
		public OracleIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oracleId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOracleId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OracleIdContext oracleId() throws RecognitionException {
		OracleIdContext _localctx = new OracleIdContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_oracleId);
		try {
			int _alt;
			setState(950);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				match(IDENTIFIER_);
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(946);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(942);
						match(STRING_);
						setState(943);
						match(DOT_);
						}
						} 
					}
					setState(948);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				setState(949);
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

	public static class CollationNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCollationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_collationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER_ || _la==STRING_) ) {
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

	public static class DataTypeLengthContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(OracleStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(OracleStatementParser.NUMBER_, i);
		}
		public TerminalNode COMMA_() { return getToken(OracleStatementParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDataTypeLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(LP_);
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER_) {
				{
				setState(955);
				match(NUMBER_);
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(956);
					match(COMMA_);
					setState(957);
					match(NUMBER_);
					}
				}

				}
			}

			setState(962);
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

	public static class PrimaryKeyContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(OracleStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(964);
				match(PRIMARY);
				}
			}

			setState(967);
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

	public static class ExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			expr(0);
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(970);
				match(COMMA_);
				setState(971);
				expr(0);
				}
				}
				setState(976);
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

	public static class ExprListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_exprList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			match(LP_);
			setState(978);
			exprs();
			setState(979);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
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
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(982);
				notOperator_();
				setState(983);
				expr(3);
				}
				break;
			case 2:
				{
				setState(985);
				match(LP_);
				setState(986);
				expr(0);
				setState(987);
				match(RP_);
				}
				break;
			case 3:
				{
				setState(989);
				booleanPrimary(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(998);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(992);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(993);
					logicalOperator();
					setState(994);
					expr(5);
					}
					} 
				}
				setState(1000);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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
		public TerminalNode OR() { return getToken(OracleStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(OracleStatementParser.OR_, 0); }
		public TerminalNode AND() { return getToken(OracleStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(OracleStatementParser.AND_, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
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
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(OracleStatementParser.NOT_, 0); }
		public NotOperator_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOperator_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitNotOperator_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotOperator_Context notOperator_() throws RecognitionException {
		NotOperator_Context _localctx = new NotOperator_Context(_ctx, getState());
		enterRule(_localctx, 134, RULE_notOperator_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
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
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(OracleStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OracleStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(OracleStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(OracleStatementParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public BooleanPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrimary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitBooleanPrimary(this);
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
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1006);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(1028);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1026);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1008);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1009);
						match(IS);
						setState(1011);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1010);
							match(NOT);
							}
						}

						setState(1013);
						_la = _input.LA(1);
						if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (NULL - 104)) | (1L << (TRUE - 104)) | (1L << (FALSE - 104)))) != 0) || _la==UNKNOWN) ) {
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
						setState(1014);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1015);
						match(SAFE_EQ_);
						setState(1016);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1017);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1018);
						comparisonOperator();
						setState(1019);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1021);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1022);
						comparisonOperator();
						setState(1023);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1024);
						subquery();
						}
						break;
					}
					} 
				}
				setState(1030);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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
		public TerminalNode EQ_() { return getToken(OracleStatementParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(OracleStatementParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(OracleStatementParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(OracleStatementParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(OracleStatementParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(OracleStatementParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
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
		public TerminalNode IN() { return getToken(OracleStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(OracleStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(OracleStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(OracleStatementParser.LIKE, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(OracleStatementParser.ESCAPE, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_predicate);
		int _la;
		try {
			setState(1076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033);
				bitExpr(0);
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1034);
					match(NOT);
					}
				}

				setState(1037);
				match(IN);
				setState(1038);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1040);
				bitExpr(0);
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1041);
					match(NOT);
					}
				}

				setState(1044);
				match(IN);
				setState(1045);
				match(LP_);
				setState(1046);
				expr(0);
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1047);
					match(COMMA_);
					setState(1048);
					expr(0);
					}
					}
					setState(1053);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1054);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1056);
				bitExpr(0);
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1057);
					match(NOT);
					}
				}

				setState(1060);
				match(BETWEEN);
				setState(1061);
				bitExpr(0);
				setState(1062);
				match(AND);
				setState(1063);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1065);
				bitExpr(0);
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1066);
					match(NOT);
					}
				}

				setState(1069);
				match(LIKE);
				setState(1070);
				simpleExpr(0);
				setState(1073);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(1071);
					match(ESCAPE);
					setState(1072);
					simpleExpr(0);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1075);
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
		public TerminalNode VERTICAL_BAR_() { return getToken(OracleStatementParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(OracleStatementParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(OracleStatementParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(OracleStatementParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(OracleStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(OracleStatementParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(OracleStatementParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(OracleStatementParser.SLASH_, 0); }
		public TerminalNode MOD_() { return getToken(OracleStatementParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(OracleStatementParser.CARET_, 0); }
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitBitExpr(this);
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
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1079);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1081);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1082);
						match(VERTICAL_BAR_);
						setState(1083);
						bitExpr(12);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1084);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1085);
						match(AMPERSAND_);
						setState(1086);
						bitExpr(11);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1087);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1088);
						match(SIGNED_LEFT_SHIFT_);
						setState(1089);
						bitExpr(10);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1090);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1091);
						match(SIGNED_RIGHT_SHIFT_);
						setState(1092);
						bitExpr(9);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1093);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1094);
						match(PLUS_);
						setState(1095);
						bitExpr(8);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1096);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1097);
						match(MINUS_);
						setState(1098);
						bitExpr(7);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1099);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1100);
						match(ASTERISK_);
						setState(1101);
						bitExpr(6);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1102);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1103);
						match(SLASH_);
						setState(1104);
						bitExpr(5);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1105);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1106);
						match(MOD_);
						setState(1107);
						bitExpr(4);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1108);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1109);
						match(CARET_);
						setState(1110);
						bitExpr(3);
						}
						break;
					}
					} 
				}
				setState(1115);
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
		public TerminalNode PLUS_() { return getToken(OracleStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(OracleStatementParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(OracleStatementParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(OracleStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(OracleStatementParser.BINARY, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode ROW() { return getToken(OracleStatementParser.ROW, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(OracleStatementParser.EXISTS, 0); }
		public TerminalNode LBE_() { return getToken(OracleStatementParser.LBE_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBE_() { return getToken(OracleStatementParser.RBE_, 0); }
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public PrivateExprOfDbContext privateExprOfDb() {
			return getRuleContext(PrivateExprOfDbContext.class,0);
		}
		public TerminalNode OR_() { return getToken(OracleStatementParser.OR_, 0); }
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSimpleExpr(this);
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
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_simpleExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(1117);
				functionCall();
				}
				break;
			case 2:
				{
				setState(1118);
				parameterMarker();
				}
				break;
			case 3:
				{
				setState(1119);
				literals();
				}
				break;
			case 4:
				{
				setState(1120);
				columnName();
				}
				break;
			case 5:
				{
				setState(1121);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_))) != 0) || _la==BINARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1122);
				simpleExpr(6);
				}
				break;
			case 6:
				{
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1123);
					match(ROW);
					}
				}

				setState(1126);
				match(LP_);
				setState(1127);
				expr(0);
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1128);
					match(COMMA_);
					setState(1129);
					expr(0);
					}
					}
					setState(1134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1135);
				match(RP_);
				}
				break;
			case 7:
				{
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS) {
					{
					setState(1137);
					match(EXISTS);
					}
				}

				setState(1140);
				subquery();
				}
				break;
			case 8:
				{
				setState(1141);
				match(LBE_);
				setState(1142);
				identifier();
				setState(1143);
				expr(0);
				setState(1144);
				match(RBE_);
				}
				break;
			case 9:
				{
				setState(1146);
				caseExpression();
				}
				break;
			case 10:
				{
				setState(1147);
				privateExprOfDb();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
					setState(1150);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(1151);
					match(OR_);
					setState(1152);
					simpleExpr(8);
					}
					} 
				}
				setState(1157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_functionCall);
		try {
			setState(1161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1158);
				aggregationFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1159);
				specialFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1160);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(OracleStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAggregationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			aggregationFunctionName();
			setState(1164);
			match(LP_);
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1165);
				distinct();
				}
			}

			setState(1177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHAR:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1168);
				expr(0);
				setState(1173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1169);
					match(COMMA_);
					setState(1170);
					expr(0);
					}
					}
					setState(1175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1176);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1179);
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
		public TerminalNode MAX() { return getToken(OracleStatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(OracleStatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(OracleStatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(OracleStatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(OracleStatementParser.AVG, 0); }
		public AggregationFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunctionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAggregationFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionNameContext aggregationFunctionName() throws RecognitionException {
		AggregationFunctionNameContext _localctx = new AggregationFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_aggregationFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			_la = _input.LA(1);
			if ( !(((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (MAX - 145)) | (1L << (MIN - 145)) | (1L << (SUM - 145)) | (1L << (COUNT - 145)) | (1L << (AVG - 145)))) != 0)) ) {
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
		public TerminalNode DISTINCT() { return getToken(OracleStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDistinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
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
		public CharFunctionContext charFunction() {
			return getRuleContext(CharFunctionContext.class,0);
		}
		public SpecialFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSpecialFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialFunctionContext specialFunction() throws RecognitionException {
		SpecialFunctionContext _localctx = new SpecialFunctionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_specialFunction);
		try {
			setState(1187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1185);
				castFunction();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1186);
				charFunction();
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
		public TerminalNode CAST() { return getToken(OracleStatementParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public CastFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCastFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastFunctionContext castFunction() throws RecognitionException {
		CastFunctionContext _localctx = new CastFunctionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_castFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			match(CAST);
			setState(1190);
			match(LP_);
			setState(1191);
			expr(0);
			setState(1192);
			match(AS);
			setState(1193);
			dataType();
			setState(1194);
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
		public TerminalNode CHAR() { return getToken(OracleStatementParser.CHAR, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public CharFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCharFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharFunctionContext charFunction() throws RecognitionException {
		CharFunctionContext _localctx = new CharFunctionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_charFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			match(CHAR);
			setState(1197);
			match(LP_);
			setState(1198);
			expr(0);
			setState(1203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1199);
				match(COMMA_);
				setState(1200);
				expr(0);
				}
				}
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1206);
				match(USING);
				setState(1207);
				ignoredIdentifier_();
				}
			}

			setState(1210);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(OracleStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public RegularFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRegularFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionContext regularFunction() throws RecognitionException {
		RegularFunctionContext _localctx = new RegularFunctionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_regularFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			regularFunctionName_();
			setState(1213);
			match(LP_);
			setState(1223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHAR:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1214);
				expr(0);
				setState(1219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1215);
					match(COMMA_);
					setState(1216);
					expr(0);
					}
					}
					setState(1221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1222);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1225);
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
		public TerminalNode IF() { return getToken(OracleStatementParser.IF, 0); }
		public TerminalNode LOCALTIME() { return getToken(OracleStatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(OracleStatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(OracleStatementParser.INTERVAL, 0); }
		public RegularFunctionName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunctionName_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRegularFunctionName_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionName_Context regularFunctionName_() throws RecognitionException {
		RegularFunctionName_Context _localctx = new RegularFunctionName_Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_regularFunctionName_);
		try {
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1227);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1228);
				match(IF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1229);
				match(LOCALTIME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1230);
				match(LOCALTIMESTAMP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1231);
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
		public TerminalNode CASE() { return getToken(OracleStatementParser.CASE, 0); }
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
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_caseExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			match(CASE);
			setState(1236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1235);
				simpleExpr(0);
				}
				break;
			}
			setState(1239); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1238);
					caseWhen_();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1241); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1243);
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
		public TerminalNode WHEN() { return getToken(OracleStatementParser.WHEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(OracleStatementParser.THEN, 0); }
		public CaseWhen_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhen_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCaseWhen_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseWhen_Context caseWhen_() throws RecognitionException {
		CaseWhen_Context _localctx = new CaseWhen_Context(_ctx, getState());
		enterRule(_localctx, 166, RULE_caseWhen_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			match(WHEN);
			setState(1247);
			expr(0);
			setState(1248);
			match(THEN);
			setState(1249);
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
		public TerminalNode ELSE() { return getToken(OracleStatementParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseElse_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseElse_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCaseElse_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseElse_Context caseElse_() throws RecognitionException {
		CaseElse_Context _localctx = new CaseElse_Context(_ctx, getState());
		enterRule(_localctx, 168, RULE_caseElse_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			match(ELSE);
			setState(1252);
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
		public TerminalNode ORDER() { return getToken(OracleStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			match(ORDER);
			setState(1255);
			match(BY);
			setState(1256);
			orderByItem();
			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1257);
				match(COMMA_);
				setState(1258);
				orderByItem();
				}
				}
				setState(1263);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(OracleStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOrderByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1264);
				columnName();
				}
				break;
			case 2:
				{
				setState(1265);
				numberLiterals();
				}
				break;
			case 3:
				{
				setState(1266);
				expr(0);
				}
				break;
			}
			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1269);
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

	public static class AttributeNameContext extends ParserRuleContext {
		public OracleIdContext oracleId() {
			return getRuleContext(OracleIdContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			oracleId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexTypeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public IndexTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexTypeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIndexTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexTypeNameContext indexTypeName() throws RecognitionException {
		IndexTypeNameContext _localctx = new IndexTypeNameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_indexTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
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

	public static class SimpleExprsContext extends ParserRuleContext {
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public SimpleExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExprs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSimpleExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExprsContext simpleExprs() throws RecognitionException {
		SimpleExprsContext _localctx = new SimpleExprsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_simpleExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			simpleExpr(0);
			setState(1281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1277);
				match(COMMA_);
				setState(1278);
				simpleExpr(0);
				}
				}
				setState(1283);
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

	public static class LobItemContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public LobItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitLobItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LobItemContext lobItem() throws RecognitionException {
		LobItemContext _localctx = new LobItemContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_lobItem);
		try {
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1284);
				attributeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1285);
				columnName();
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

	public static class LobItemsContext extends ParserRuleContext {
		public List<LobItemContext> lobItem() {
			return getRuleContexts(LobItemContext.class);
		}
		public LobItemContext lobItem(int i) {
			return getRuleContext(LobItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public LobItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItems; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitLobItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LobItemsContext lobItems() throws RecognitionException {
		LobItemsContext _localctx = new LobItemsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_lobItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			lobItem();
			setState(1293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1289);
				match(COMMA_);
				setState(1290);
				lobItem();
				}
				}
				setState(1295);
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

	public static class LobItemListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public LobItemsContext lobItems() {
			return getRuleContext(LobItemsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public LobItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItemList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitLobItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LobItemListContext lobItemList() throws RecognitionException {
		LobItemListContext _localctx = new LobItemListContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_lobItemList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			match(LP_);
			setState(1297);
			lobItems();
			setState(1298);
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public SpecialDatatypeContext specialDatatype() {
			return getRuleContext(SpecialDatatypeContext.class,0);
		}
		public DatetimeTypeSuffixContext datetimeTypeSuffix() {
			return getRuleContext(DatetimeTypeSuffixContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_dataType);
		int _la;
		try {
			setState(1311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1300);
				dataTypeName();
				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1301);
					dataTypeLength();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1304);
				specialDatatype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1305);
				dataTypeName();
				setState(1307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1306);
					dataTypeLength();
					}
				}

				setState(1309);
				datetimeTypeSuffix();
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

	public static class SpecialDatatypeContext extends ParserRuleContext {
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public TerminalNode CHAR() { return getToken(OracleStatementParser.CHAR, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode NATIONAL() { return getToken(OracleStatementParser.NATIONAL, 0); }
		public TerminalNode VARYING() { return getToken(OracleStatementParser.VARYING, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public SpecialDatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialDatatype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSpecialDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialDatatypeContext specialDatatype() throws RecognitionException {
		SpecialDatatypeContext _localctx = new SpecialDatatypeContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_specialDatatype);
		int _la;
		try {
			setState(1336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1313);
				dataTypeName();
				{
				setState(1314);
				match(LP_);
				setState(1315);
				match(NUMBER_);
				setState(1316);
				match(CHAR);
				setState(1317);
				match(RP_);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1319);
				match(NATIONAL);
				setState(1320);
				dataTypeName();
				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARYING) {
					{
					setState(1321);
					match(VARYING);
					}
				}

				setState(1324);
				match(LP_);
				setState(1325);
				match(NUMBER_);
				setState(1326);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1328);
				dataTypeName();
				setState(1330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1329);
					match(LP_);
					}
				}

				setState(1332);
				columnName();
				setState(1334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1333);
					match(RP_);
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
		public TerminalNode CHAR() { return getToken(OracleStatementParser.CHAR, 0); }
		public TerminalNode NCHAR() { return getToken(OracleStatementParser.NCHAR, 0); }
		public TerminalNode RAW() { return getToken(OracleStatementParser.RAW, 0); }
		public TerminalNode VARCHAR() { return getToken(OracleStatementParser.VARCHAR, 0); }
		public TerminalNode VARCHAR2() { return getToken(OracleStatementParser.VARCHAR2, 0); }
		public TerminalNode NVARCHAR2() { return getToken(OracleStatementParser.NVARCHAR2, 0); }
		public TerminalNode LONG() { return getToken(OracleStatementParser.LONG, 0); }
		public TerminalNode BLOB() { return getToken(OracleStatementParser.BLOB, 0); }
		public TerminalNode CLOB() { return getToken(OracleStatementParser.CLOB, 0); }
		public TerminalNode NCLOB() { return getToken(OracleStatementParser.NCLOB, 0); }
		public TerminalNode BINARY_FLOAT() { return getToken(OracleStatementParser.BINARY_FLOAT, 0); }
		public TerminalNode BINARY_DOUBLE() { return getToken(OracleStatementParser.BINARY_DOUBLE, 0); }
		public TerminalNode BOOLEAN() { return getToken(OracleStatementParser.BOOLEAN, 0); }
		public TerminalNode PLS_INTEGER() { return getToken(OracleStatementParser.PLS_INTEGER, 0); }
		public TerminalNode BINARY_INTEGER() { return getToken(OracleStatementParser.BINARY_INTEGER, 0); }
		public TerminalNode INTEGER() { return getToken(OracleStatementParser.INTEGER, 0); }
		public TerminalNode NUMBER() { return getToken(OracleStatementParser.NUMBER, 0); }
		public TerminalNode NATURAL() { return getToken(OracleStatementParser.NATURAL, 0); }
		public TerminalNode NATURALN() { return getToken(OracleStatementParser.NATURALN, 0); }
		public TerminalNode POSITIVE() { return getToken(OracleStatementParser.POSITIVE, 0); }
		public TerminalNode POSITIVEN() { return getToken(OracleStatementParser.POSITIVEN, 0); }
		public TerminalNode SIGNTYPE() { return getToken(OracleStatementParser.SIGNTYPE, 0); }
		public TerminalNode SIMPLE_INTEGER() { return getToken(OracleStatementParser.SIMPLE_INTEGER, 0); }
		public TerminalNode BFILE() { return getToken(OracleStatementParser.BFILE, 0); }
		public TerminalNode MLSLABEL() { return getToken(OracleStatementParser.MLSLABEL, 0); }
		public TerminalNode UROWID() { return getToken(OracleStatementParser.UROWID, 0); }
		public TerminalNode DATE() { return getToken(OracleStatementParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(OracleStatementParser.TIMESTAMP, 0); }
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(OracleStatementParser.ZONE, 0); }
		public TerminalNode LOCAL() { return getToken(OracleStatementParser.LOCAL, 0); }
		public TerminalNode INTERVAL() { return getToken(OracleStatementParser.INTERVAL, 0); }
		public TerminalNode DAY() { return getToken(OracleStatementParser.DAY, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public TerminalNode SECOND() { return getToken(OracleStatementParser.SECOND, 0); }
		public TerminalNode YEAR() { return getToken(OracleStatementParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(OracleStatementParser.MONTH, 0); }
		public TerminalNode JSON() { return getToken(OracleStatementParser.JSON, 0); }
		public TerminalNode FLOAT() { return getToken(OracleStatementParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(OracleStatementParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(OracleStatementParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(OracleStatementParser.PRECISION, 0); }
		public TerminalNode INT() { return getToken(OracleStatementParser.INT, 0); }
		public TerminalNode SMALLINT() { return getToken(OracleStatementParser.SMALLINT, 0); }
		public TerminalNode DECIMAL() { return getToken(OracleStatementParser.DECIMAL, 0); }
		public TerminalNode NUMERIC() { return getToken(OracleStatementParser.NUMERIC, 0); }
		public TerminalNode DEC() { return getToken(OracleStatementParser.DEC, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public DataTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDataTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeNameContext dataTypeName() throws RecognitionException {
		DataTypeNameContext _localctx = new DataTypeNameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_dataTypeName);
		try {
			setState(1396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1338);
				match(CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1339);
				match(NCHAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1340);
				match(RAW);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1341);
				match(VARCHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1342);
				match(VARCHAR2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1343);
				match(NVARCHAR2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1344);
				match(LONG);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1345);
				match(LONG);
				setState(1346);
				match(RAW);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1347);
				match(BLOB);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1348);
				match(CLOB);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1349);
				match(NCLOB);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1350);
				match(BINARY_FLOAT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1351);
				match(BINARY_DOUBLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1352);
				match(BOOLEAN);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1353);
				match(PLS_INTEGER);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1354);
				match(BINARY_INTEGER);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1355);
				match(INTEGER);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1356);
				match(NUMBER);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1357);
				match(NATURAL);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1358);
				match(NATURALN);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1359);
				match(POSITIVE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1360);
				match(POSITIVEN);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1361);
				match(SIGNTYPE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1362);
				match(SIMPLE_INTEGER);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1363);
				match(BFILE);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1364);
				match(MLSLABEL);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1365);
				match(UROWID);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1366);
				match(DATE);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1367);
				match(TIMESTAMP);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1368);
				match(TIMESTAMP);
				setState(1369);
				match(WITH);
				setState(1370);
				match(TIME);
				setState(1371);
				match(ZONE);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1372);
				match(TIMESTAMP);
				setState(1373);
				match(WITH);
				setState(1374);
				match(LOCAL);
				setState(1375);
				match(TIME);
				setState(1376);
				match(ZONE);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1377);
				match(INTERVAL);
				setState(1378);
				match(DAY);
				setState(1379);
				match(TO);
				setState(1380);
				match(SECOND);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1381);
				match(INTERVAL);
				setState(1382);
				match(YEAR);
				setState(1383);
				match(TO);
				setState(1384);
				match(MONTH);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1385);
				match(JSON);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1386);
				match(FLOAT);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1387);
				match(REAL);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1388);
				match(DOUBLE);
				setState(1389);
				match(PRECISION);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1390);
				match(INT);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1391);
				match(SMALLINT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1392);
				match(DECIMAL);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1393);
				match(NUMERIC);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1394);
				match(DEC);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1395);
				match(IDENTIFIER_);
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

	public static class DatetimeTypeSuffixContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(OracleStatementParser.ZONE, 0); }
		public TerminalNode LOCAL() { return getToken(OracleStatementParser.LOCAL, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public TerminalNode MONTH() { return getToken(OracleStatementParser.MONTH, 0); }
		public TerminalNode SECOND() { return getToken(OracleStatementParser.SECOND, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public DatetimeTypeSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetimeTypeSuffix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDatetimeTypeSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatetimeTypeSuffixContext datetimeTypeSuffix() throws RecognitionException {
		DatetimeTypeSuffixContext _localctx = new DatetimeTypeSuffixContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_datetimeTypeSuffix);
		int _la;
		try {
			setState(1415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1398);
					match(WITH);
					setState(1400);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LOCAL) {
						{
						setState(1399);
						match(LOCAL);
						}
					}

					setState(1402);
					match(TIME);
					setState(1403);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1406);
				match(TO);
				setState(1407);
				match(MONTH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1408);
				match(TO);
				setState(1409);
				match(SECOND);
				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1410);
					match(LP_);
					setState(1411);
					match(NUMBER_);
					setState(1412);
					match(RP_);
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

	public static class TreatFunctionContext extends ParserRuleContext {
		public TerminalNode TREAT() { return getToken(OracleStatementParser.TREAT, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode REF() { return getToken(OracleStatementParser.REF, 0); }
		public TreatFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treatFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTreatFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TreatFunctionContext treatFunction() throws RecognitionException {
		TreatFunctionContext _localctx = new TreatFunctionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_treatFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			match(TREAT);
			setState(1418);
			match(LP_);
			setState(1419);
			expr(0);
			setState(1420);
			match(AS);
			setState(1422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF) {
				{
				setState(1421);
				match(REF);
				}
			}

			setState(1424);
			dataTypeName();
			setState(1425);
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

	public static class PrivateExprOfDbContext extends ParserRuleContext {
		public TreatFunctionContext treatFunction() {
			return getRuleContext(TreatFunctionContext.class,0);
		}
		public CaseExprContext caseExpr() {
			return getRuleContext(CaseExprContext.class,0);
		}
		public IntervalExpressionContext intervalExpression() {
			return getRuleContext(IntervalExpressionContext.class,0);
		}
		public ObjectAccessExpressionContext objectAccessExpression() {
			return getRuleContext(ObjectAccessExpressionContext.class,0);
		}
		public ConstructorExprContext constructorExpr() {
			return getRuleContext(ConstructorExprContext.class,0);
		}
		public PrivateExprOfDbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateExprOfDb; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitPrivateExprOfDb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivateExprOfDbContext privateExprOfDb() throws RecognitionException {
		PrivateExprOfDbContext _localctx = new PrivateExprOfDbContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_privateExprOfDb);
		try {
			setState(1432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1427);
				treatFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1428);
				caseExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1429);
				intervalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1430);
				objectAccessExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1431);
				constructorExpr();
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

	public static class CaseExprContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(OracleStatementParser.CASE, 0); }
		public TerminalNode END() { return getToken(OracleStatementParser.END, 0); }
		public SimpleCaseExprContext simpleCaseExpr() {
			return getRuleContext(SimpleCaseExprContext.class,0);
		}
		public SearchedCaseExprContext searchedCaseExpr() {
			return getRuleContext(SearchedCaseExprContext.class,0);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public CaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExprContext caseExpr() throws RecognitionException {
		CaseExprContext _localctx = new CaseExprContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_caseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			match(CASE);
			setState(1437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1435);
				simpleCaseExpr();
				}
				break;
			case 2:
				{
				setState(1436);
				searchedCaseExpr();
				}
				break;
			}
			setState(1440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1439);
				elseClause();
				}
			}

			setState(1442);
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

	public static class SimpleCaseExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<SearchedCaseExprContext> searchedCaseExpr() {
			return getRuleContexts(SearchedCaseExprContext.class);
		}
		public SearchedCaseExprContext searchedCaseExpr(int i) {
			return getRuleContext(SearchedCaseExprContext.class,i);
		}
		public SimpleCaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCaseExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSimpleCaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleCaseExprContext simpleCaseExpr() throws RecognitionException {
		SimpleCaseExprContext _localctx = new SimpleCaseExprContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_simpleCaseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			expr(0);
			setState(1446); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1445);
				searchedCaseExpr();
				}
				}
				setState(1448); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchedCaseExprContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(OracleStatementParser.WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(OracleStatementParser.THEN, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public SearchedCaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchedCaseExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSearchedCaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchedCaseExprContext searchedCaseExpr() throws RecognitionException {
		SearchedCaseExprContext _localctx = new SearchedCaseExprContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_searchedCaseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			match(WHEN);
			setState(1451);
			expr(0);
			setState(1452);
			match(THEN);
			setState(1453);
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

	public static class ElseClauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(OracleStatementParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitElseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_elseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			match(ELSE);
			setState(1456);
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
		public List<TerminalNode> LP_() { return getTokens(OracleStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(OracleStatementParser.LP_, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS_() { return getToken(OracleStatementParser.MINUS_, 0); }
		public List<TerminalNode> RP_() { return getTokens(OracleStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(OracleStatementParser.RP_, i);
		}
		public TerminalNode DAY() { return getToken(OracleStatementParser.DAY, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public TerminalNode SECOND() { return getToken(OracleStatementParser.SECOND, 0); }
		public TerminalNode YEAR() { return getToken(OracleStatementParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(OracleStatementParser.MONTH, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(OracleStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(OracleStatementParser.NUMBER_, i);
		}
		public IntervalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIntervalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalExpressionContext intervalExpression() throws RecognitionException {
		IntervalExpressionContext _localctx = new IntervalExpressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_intervalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			match(LP_);
			setState(1459);
			expr(0);
			setState(1460);
			match(MINUS_);
			setState(1461);
			expr(0);
			setState(1462);
			match(RP_);
			setState(1484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DAY:
				{
				setState(1463);
				match(DAY);
				setState(1467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1464);
					match(LP_);
					setState(1465);
					match(NUMBER_);
					setState(1466);
					match(RP_);
					}
				}

				setState(1469);
				match(TO);
				setState(1470);
				match(SECOND);
				setState(1474);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1471);
					match(LP_);
					setState(1472);
					match(NUMBER_);
					setState(1473);
					match(RP_);
					}
					break;
				}
				}
				break;
			case YEAR:
				{
				setState(1476);
				match(YEAR);
				setState(1480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1477);
					match(LP_);
					setState(1478);
					match(NUMBER_);
					setState(1479);
					match(RP_);
					}
				}

				setState(1482);
				match(TO);
				setState(1483);
				match(MONTH);
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

	public static class ObjectAccessExpressionContext extends ParserRuleContext {
		public List<TerminalNode> DOT_() { return getTokens(OracleStatementParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(OracleStatementParser.DOT_, i);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TreatFunctionContext treatFunction() {
			return getRuleContext(TreatFunctionContext.class,0);
		}
		public List<AttributeNameContext> attributeName() {
			return getRuleContexts(AttributeNameContext.class);
		}
		public AttributeNameContext attributeName(int i) {
			return getRuleContext(AttributeNameContext.class,i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ObjectAccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectAccessExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitObjectAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectAccessExpressionContext objectAccessExpression() throws RecognitionException {
		ObjectAccessExpressionContext _localctx = new ObjectAccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_objectAccessExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				{
				setState(1486);
				match(LP_);
				setState(1487);
				simpleExpr(0);
				setState(1488);
				match(RP_);
				}
				break;
			case TREAT:
				{
				setState(1490);
				treatFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1493);
			match(DOT_);
			setState(1507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1494);
				attributeName();
				setState(1499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1495);
						match(DOT_);
						setState(1496);
						attributeName();
						}
						} 
					}
					setState(1501);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				}
				setState(1504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1502);
					match(DOT_);
					setState(1503);
					functionCall();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1506);
				functionCall();
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

	public static class ConstructorExprContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(OracleStatementParser.NEW, 0); }
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ConstructorExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitConstructorExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorExprContext constructorExpr() throws RecognitionException {
		ConstructorExprContext _localctx = new ConstructorExprContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_constructorExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			match(NEW);
			setState(1510);
			dataTypeName();
			setState(1511);
			exprList();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public IgnoredIdentifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIgnoredIdentifier_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoredIdentifier_Context ignoredIdentifier_() throws RecognitionException {
		IgnoredIdentifier_Context _localctx = new IgnoredIdentifier_Context(_ctx, getState());
		enterRule(_localctx, 212, RULE_ignoredIdentifier_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513);
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

	public static class IgnoredIdentifiers_Context extends ParserRuleContext {
		public List<IgnoredIdentifier_Context> ignoredIdentifier_() {
			return getRuleContexts(IgnoredIdentifier_Context.class);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_(int i) {
			return getRuleContext(IgnoredIdentifier_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public IgnoredIdentifiers_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifiers_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIgnoredIdentifiers_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoredIdentifiers_Context ignoredIdentifiers_() throws RecognitionException {
		IgnoredIdentifiers_Context _localctx = new IgnoredIdentifiers_Context(_ctx, getState());
		enterRule(_localctx, 214, RULE_ignoredIdentifiers_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			ignoredIdentifier_();
			setState(1520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1516);
				match(COMMA_);
				setState(1517);
				ignoredIdentifier_();
				}
				}
				setState(1522);
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

	public static class MatchNoneContext extends ParserRuleContext {
		public MatchNoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchNone; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitMatchNone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchNoneContext matchNone() throws RecognitionException {
		MatchNoneContext _localctx = new MatchNoneContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_matchNone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public CreateTableSpecification_Context createTableSpecification_() {
			return getRuleContext(CreateTableSpecification_Context.class,0);
		}
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public CreateDefinitionClauseContext createDefinitionClause() {
			return getRuleContext(CreateDefinitionClauseContext.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_createTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			match(CREATE);
			setState(1526);
			createTableSpecification_();
			setState(1527);
			match(TABLE);
			setState(1528);
			tableName();
			setState(1529);
			createDefinitionClause();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public CreateIndexSpecification_Context createIndexSpecification_() {
			return getRuleContext(CreateIndexSpecification_Context.class,0);
		}
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public CreateIndexDefinitionClauseContext createIndexDefinitionClause() {
			return getRuleContext(CreateIndexDefinitionClauseContext.class,0);
		}
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCreateIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_createIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			match(CREATE);
			setState(1532);
			createIndexSpecification_();
			setState(1533);
			match(INDEX);
			setState(1534);
			indexName();
			setState(1535);
			match(ON);
			setState(1536);
			createIndexDefinitionClause();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
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
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAlterTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_alterTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1538);
			match(ALTER);
			setState(1539);
			match(TABLE);
			setState(1540);
			tableName();
			setState(1541);
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
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public RenameIndexClause_Context renameIndexClause_() {
			return getRuleContext(RenameIndexClause_Context.class,0);
		}
		public AlterIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAlterIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterIndexContext alterIndex() throws RecognitionException {
		AlterIndexContext _localctx = new AlterIndexContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_alterIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			match(ALTER);
			setState(1544);
			match(INDEX);
			setState(1545);
			indexName();
			setState(1546);
			renameIndexClause_();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1548);
			match(DROP);
			setState(1549);
			match(TABLE);
			setState(1550);
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

	public static class DropIndexContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDropIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_dropIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			match(DROP);
			setState(1553);
			match(INDEX);
			setState(1554);
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

	public static class TruncateTableContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(OracleStatementParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TruncateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncateTableContext truncateTable() throws RecognitionException {
		TruncateTableContext _localctx = new TruncateTableContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_truncateTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			match(TRUNCATE);
			setState(1557);
			match(TABLE);
			setState(1558);
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

	public static class CreateTableSpecification_Context extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(OracleStatementParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(OracleStatementParser.TEMPORARY, 0); }
		public CreateTableSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableSpecification_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCreateTableSpecification_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableSpecification_Context createTableSpecification_() throws RecognitionException {
		CreateTableSpecification_Context _localctx = new CreateTableSpecification_Context(_ctx, getState());
		enterRule(_localctx, 232, RULE_createTableSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(1560);
				match(GLOBAL);
				setState(1561);
				match(TEMPORARY);
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

	public static class TablespaceClauseWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TablespaceClauseContext tablespaceClause() {
			return getRuleContext(TablespaceClauseContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TablespaceClauseWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceClauseWithParen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTablespaceClauseWithParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablespaceClauseWithParenContext tablespaceClauseWithParen() throws RecognitionException {
		TablespaceClauseWithParenContext _localctx = new TablespaceClauseWithParenContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_tablespaceClauseWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			match(LP_);
			setState(1565);
			tablespaceClause();
			setState(1566);
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

	public static class TablespaceClauseContext extends ParserRuleContext {
		public TerminalNode TABLESPACE() { return getToken(OracleStatementParser.TABLESPACE, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TablespaceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTablespaceClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablespaceClauseContext tablespaceClause() throws RecognitionException {
		TablespaceClauseContext _localctx = new TablespaceClauseContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_tablespaceClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			match(TABLESPACE);
			setState(1569);
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

	public static class DomainIndexClauseContext extends ParserRuleContext {
		public IndexTypeNameContext indexTypeName() {
			return getRuleContext(IndexTypeNameContext.class,0);
		}
		public DomainIndexClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainIndexClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDomainIndexClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DomainIndexClauseContext domainIndexClause() throws RecognitionException {
		DomainIndexClauseContext _localctx = new DomainIndexClauseContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_domainIndexClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			indexTypeName();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public RelationalPropertiesContext relationalProperties() {
			return getRuleContext(RelationalPropertiesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public TerminalNode ROWS() { return getToken(OracleStatementParser.ROWS, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode PRESERVE() { return getToken(OracleStatementParser.PRESERVE, 0); }
		public CreateDefinitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCreateDefinitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDefinitionClauseContext createDefinitionClause() throws RecognitionException {
		CreateDefinitionClauseContext _localctx = new CreateDefinitionClauseContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_createDefinitionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1573);
				match(LP_);
				setState(1574);
				relationalProperties();
				setState(1575);
				match(RP_);
				}
			}

			setState(1583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1579);
				match(ON);
				setState(1580);
				match(COMMIT);
				setState(1581);
				_la = _input.LA(1);
				if ( !(_la==DELETE || _la==PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1582);
				match(ROWS);
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

	public static class RelationalPropertiesContext extends ParserRuleContext {
		public List<RelationalPropertyContext> relationalProperty() {
			return getRuleContexts(RelationalPropertyContext.class);
		}
		public RelationalPropertyContext relationalProperty(int i) {
			return getRuleContext(RelationalPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public RelationalPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalProperties; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRelationalProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalPropertiesContext relationalProperties() throws RecognitionException {
		RelationalPropertiesContext _localctx = new RelationalPropertiesContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_relationalProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			relationalProperty();
			setState(1590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1586);
				match(COMMA_);
				setState(1587);
				relationalProperty();
				}
				}
				setState(1592);
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

	public static class RelationalPropertyContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public VirtualColumnDefinitionContext virtualColumnDefinition() {
			return getRuleContext(VirtualColumnDefinitionContext.class,0);
		}
		public OutOfLineConstraintContext outOfLineConstraint() {
			return getRuleContext(OutOfLineConstraintContext.class,0);
		}
		public OutOfLineRefConstraintContext outOfLineRefConstraint() {
			return getRuleContext(OutOfLineRefConstraintContext.class,0);
		}
		public RelationalPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRelationalProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalPropertyContext relationalProperty() throws RecognitionException {
		RelationalPropertyContext _localctx = new RelationalPropertyContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_relationalProperty);
		try {
			setState(1597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1593);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1594);
				virtualColumnDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1595);
				outOfLineConstraint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1596);
				outOfLineRefConstraint();
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
		public VisibleClause_Context visibleClause_() {
			return getRuleContext(VisibleClause_Context.class,0);
		}
		public TerminalNode SORT() { return getToken(OracleStatementParser.SORT, 0); }
		public DefaultNullClause_Context defaultNullClause_() {
			return getRuleContext(DefaultNullClause_Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentityClauseContext identityClause() {
			return getRuleContext(IdentityClauseContext.class,0);
		}
		public TerminalNode ENCRYPT() { return getToken(OracleStatementParser.ENCRYPT, 0); }
		public EncryptionSpecification_Context encryptionSpecification_() {
			return getRuleContext(EncryptionSpecification_Context.class,0);
		}
		public InlineRefConstraintContext inlineRefConstraint() {
			return getRuleContext(InlineRefConstraintContext.class,0);
		}
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1599);
			columnName();
			setState(1600);
			dataType();
			setState(1602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(1601);
				match(SORT);
				}
			}

			setState(1604);
			visibleClause_();
			setState(1609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(1605);
				defaultNullClause_();
				setState(1606);
				expr(0);
				}
				break;
			case GENERATED:
				{
				setState(1608);
				identityClause();
				}
				break;
			case EOF:
			case RP_:
			case COMMA_:
			case SEMI_:
			case DROP:
			case ADD:
			case SET:
			case COLUMN:
			case CONSTRAINT:
			case PRIMARY:
			case UNIQUE:
			case KEY:
			case WITH:
			case NOT:
			case NULL:
			case CHECK:
			case REFERENCES:
			case ENCRYPT:
			case MODIFY:
			case SCOPE:
				break;
			default:
				break;
			}
			setState(1613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENCRYPT) {
				{
				setState(1611);
				match(ENCRYPT);
				setState(1612);
				encryptionSpecification_();
				}
			}

			setState(1621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1616); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1615);
					inlineConstraint();
					}
					}
					setState(1618); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (KEY - 61)) | (1L << (NOT - 61)) | (1L << (NULL - 61)))) != 0) || _la==CHECK || _la==REFERENCES );
				}
				break;
			case 2:
				{
				setState(1620);
				inlineRefConstraint();
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

	public static class VisibleClause_Context extends ParserRuleContext {
		public TerminalNode VISIBLE() { return getToken(OracleStatementParser.VISIBLE, 0); }
		public TerminalNode INVISIBLE() { return getToken(OracleStatementParser.INVISIBLE, 0); }
		public VisibleClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibleClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitVisibleClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibleClause_Context visibleClause_() throws RecognitionException {
		VisibleClause_Context _localctx = new VisibleClause_Context(_ctx, getState());
		enterRule(_localctx, 248, RULE_visibleClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VISIBLE || _la==INVISIBLE) {
				{
				setState(1623);
				_la = _input.LA(1);
				if ( !(_la==VISIBLE || _la==INVISIBLE) ) {
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

	public static class DefaultNullClause_Context extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public DefaultNullClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultNullClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDefaultNullClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultNullClause_Context defaultNullClause_() throws RecognitionException {
		DefaultNullClause_Context _localctx = new DefaultNullClause_Context(_ctx, getState());
		enterRule(_localctx, 250, RULE_defaultNullClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			match(DEFAULT);
			setState(1629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1627);
				match(ON);
				setState(1628);
				match(NULL);
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

	public static class IdentityClauseContext extends ParserRuleContext {
		public TerminalNode GENERATED() { return getToken(OracleStatementParser.GENERATED, 0); }
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public TerminalNode IDENTITY() { return getToken(OracleStatementParser.IDENTITY, 0); }
		public IdentifyOptionsContext identifyOptions() {
			return getRuleContext(IdentifyOptionsContext.class,0);
		}
		public TerminalNode ALWAYS() { return getToken(OracleStatementParser.ALWAYS, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public IdentityClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIdentityClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentityClauseContext identityClause() throws RecognitionException {
		IdentityClauseContext _localctx = new IdentityClauseContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_identityClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			match(GENERATED);
			setState(1639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALWAYS:
				{
				setState(1632);
				match(ALWAYS);
				}
				break;
			case BY:
				{
				setState(1633);
				match(BY);
				setState(1634);
				match(DEFAULT);
				setState(1637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1635);
					match(ON);
					setState(1636);
					match(NULL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1641);
			match(AS);
			setState(1642);
			match(IDENTITY);
			setState(1643);
			identifyOptions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifyOptionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<IdentityOptionContext> identityOption() {
			return getRuleContexts(IdentityOptionContext.class);
		}
		public IdentityOptionContext identityOption(int i) {
			return getRuleContext(IdentityOptionContext.class,i);
		}
		public IdentifyOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifyOptions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIdentifyOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifyOptionsContext identifyOptions() throws RecognitionException {
		IdentifyOptionsContext _localctx = new IdentifyOptionsContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_identifyOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1645);
				match(LP_);
				}
			}

			setState(1653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (START - 193)) | (1L << (CACHE - 193)) | (1L << (NOCACHE - 193)) | (1L << (CYCLE - 193)) | (1L << (NOCYCLE - 193)) | (1L << (INCREMENT - 193)) | (1L << (MAXVALUE - 193)) | (1L << (MINVALUE - 193)) | (1L << (NOMAXVALUE - 193)) | (1L << (NOMINVALUE - 193)) | (1L << (NOORDER - 193)))) != 0)) {
				{
				setState(1649); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1648);
					identityOption();
					}
					}
					setState(1651); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ORDER || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (START - 193)) | (1L << (CACHE - 193)) | (1L << (NOCACHE - 193)) | (1L << (CYCLE - 193)) | (1L << (NOCYCLE - 193)) | (1L << (INCREMENT - 193)) | (1L << (MAXVALUE - 193)) | (1L << (MINVALUE - 193)) | (1L << (NOMAXVALUE - 193)) | (1L << (NOMINVALUE - 193)) | (1L << (NOORDER - 193)))) != 0) );
				}
			}

			setState(1656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1655);
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

	public static class IdentityOptionContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(OracleStatementParser.START, 0); }
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public TerminalNode LIMIT() { return getToken(OracleStatementParser.LIMIT, 0); }
		public TerminalNode VALUE() { return getToken(OracleStatementParser.VALUE, 0); }
		public TerminalNode INCREMENT() { return getToken(OracleStatementParser.INCREMENT, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode MAXVALUE() { return getToken(OracleStatementParser.MAXVALUE, 0); }
		public TerminalNode NOMAXVALUE() { return getToken(OracleStatementParser.NOMAXVALUE, 0); }
		public TerminalNode MINVALUE() { return getToken(OracleStatementParser.MINVALUE, 0); }
		public TerminalNode NOMINVALUE() { return getToken(OracleStatementParser.NOMINVALUE, 0); }
		public TerminalNode CYCLE() { return getToken(OracleStatementParser.CYCLE, 0); }
		public TerminalNode NOCYCLE() { return getToken(OracleStatementParser.NOCYCLE, 0); }
		public TerminalNode CACHE() { return getToken(OracleStatementParser.CACHE, 0); }
		public TerminalNode NOCACHE() { return getToken(OracleStatementParser.NOCACHE, 0); }
		public TerminalNode ORDER() { return getToken(OracleStatementParser.ORDER, 0); }
		public TerminalNode NOORDER() { return getToken(OracleStatementParser.NOORDER, 0); }
		public IdentityOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIdentityOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentityOptionContext identityOption() throws RecognitionException {
		IdentityOptionContext _localctx = new IdentityOptionContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_identityOption);
		try {
			setState(1681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START:
				enterOuterAlt(_localctx, 1);
				{
				setState(1658);
				match(START);
				setState(1659);
				match(WITH);
				setState(1663);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER_:
					{
					setState(1660);
					match(NUMBER_);
					}
					break;
				case LIMIT:
					{
					setState(1661);
					match(LIMIT);
					setState(1662);
					match(VALUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case INCREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1665);
				match(INCREMENT);
				setState(1666);
				match(BY);
				setState(1667);
				match(NUMBER_);
				}
				break;
			case MAXVALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1668);
				match(MAXVALUE);
				setState(1669);
				match(NUMBER_);
				}
				break;
			case NOMAXVALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1670);
				match(NOMAXVALUE);
				}
				break;
			case MINVALUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1671);
				match(MINVALUE);
				setState(1672);
				match(NUMBER_);
				}
				break;
			case NOMINVALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1673);
				match(NOMINVALUE);
				}
				break;
			case CYCLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1674);
				match(CYCLE);
				}
				break;
			case NOCYCLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1675);
				match(NOCYCLE);
				}
				break;
			case CACHE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1676);
				match(CACHE);
				setState(1677);
				match(NUMBER_);
				}
				break;
			case NOCACHE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1678);
				match(NOCACHE);
				}
				break;
			case ORDER:
				enterOuterAlt(_localctx, 11);
				{
				setState(1679);
				match(ORDER);
				}
				break;
			case NOORDER:
				enterOuterAlt(_localctx, 12);
				{
				setState(1680);
				match(NOORDER);
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

	public static class EncryptionSpecification_Context extends ParserRuleContext {
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public List<TerminalNode> STRING_() { return getTokens(OracleStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(OracleStatementParser.STRING_, i);
		}
		public TerminalNode IDENTIFIED() { return getToken(OracleStatementParser.IDENTIFIED, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode SALT() { return getToken(OracleStatementParser.SALT, 0); }
		public TerminalNode NO() { return getToken(OracleStatementParser.NO, 0); }
		public EncryptionSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encryptionSpecification_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitEncryptionSpecification_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncryptionSpecification_Context encryptionSpecification_() throws RecognitionException {
		EncryptionSpecification_Context _localctx = new EncryptionSpecification_Context(_ctx, getState());
		enterRule(_localctx, 258, RULE_encryptionSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1683);
				match(USING);
				setState(1684);
				match(STRING_);
				}
			}

			setState(1690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIED) {
				{
				setState(1687);
				match(IDENTIFIED);
				setState(1688);
				match(BY);
				setState(1689);
				match(STRING_);
				}
			}

			setState(1693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_) {
				{
				setState(1692);
				match(STRING_);
				}
			}

			setState(1699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SALT || _la==NO) {
				{
				setState(1696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(1695);
					match(NO);
					}
				}

				setState(1698);
				match(SALT);
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

	public static class InlineConstraintContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(OracleStatementParser.CHECK, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public InlineConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitInlineConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineConstraintContext inlineConstraint() throws RecognitionException {
		InlineConstraintContext _localctx = new InlineConstraintContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_inlineConstraint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1701);
				match(CONSTRAINT);
				setState(1702);
				ignoredIdentifier_();
				}
			}

			setState(1717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case NULL:
				{
				setState(1706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1705);
					match(NOT);
					}
				}

				setState(1708);
				match(NULL);
				}
				break;
			case UNIQUE:
				{
				setState(1709);
				match(UNIQUE);
				}
				break;
			case PRIMARY:
			case KEY:
				{
				setState(1710);
				primaryKey();
				}
				break;
			case REFERENCES:
				{
				setState(1711);
				referencesClause();
				}
				break;
			case CHECK:
				{
				setState(1712);
				match(CHECK);
				setState(1713);
				match(LP_);
				setState(1714);
				expr(0);
				setState(1715);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1722);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1719);
					constraintState();
					}
					} 
				}
				setState(1724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
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

	public static class ReferencesClauseContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(OracleStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public ReferencesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitReferencesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferencesClauseContext referencesClause() throws RecognitionException {
		ReferencesClauseContext _localctx = new ReferencesClauseContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_referencesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			match(REFERENCES);
			setState(1726);
			tableName();
			setState(1728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1727);
				columnNames();
				}
				break;
			}
			setState(1737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1730);
				match(ON);
				setState(1731);
				match(DELETE);
				setState(1735);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASCADE:
					{
					setState(1732);
					match(CASCADE);
					}
					break;
				case SET:
					{
					setState(1733);
					match(SET);
					setState(1734);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class ConstraintStateContext extends ParserRuleContext {
		public NotDeferrableContext notDeferrable() {
			return getRuleContext(NotDeferrableContext.class,0);
		}
		public InitiallyClauseContext initiallyClause() {
			return getRuleContext(InitiallyClauseContext.class,0);
		}
		public TerminalNode RELY() { return getToken(OracleStatementParser.RELY, 0); }
		public TerminalNode NORELY() { return getToken(OracleStatementParser.NORELY, 0); }
		public UsingIndexClauseContext usingIndexClause() {
			return getRuleContext(UsingIndexClauseContext.class,0);
		}
		public TerminalNode ENABLE() { return getToken(OracleStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(OracleStatementParser.DISABLE, 0); }
		public TerminalNode VALIDATE() { return getToken(OracleStatementParser.VALIDATE, 0); }
		public TerminalNode NOVALIDATE() { return getToken(OracleStatementParser.NOVALIDATE, 0); }
		public ExceptionsClauseContext exceptionsClause() {
			return getRuleContext(ExceptionsClauseContext.class,0);
		}
		public ConstraintStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintState; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitConstraintState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintStateContext constraintState() throws RecognitionException {
		ConstraintStateContext _localctx = new ConstraintStateContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_constraintState);
		try {
			setState(1749);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case DEFERRABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1739);
				notDeferrable();
				}
				break;
			case INITIALLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1740);
				initiallyClause();
				}
				break;
			case RELY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1741);
				match(RELY);
				}
				break;
			case NORELY:
				enterOuterAlt(_localctx, 4);
				{
				setState(1742);
				match(NORELY);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 5);
				{
				setState(1743);
				usingIndexClause();
				}
				break;
			case ENABLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1744);
				match(ENABLE);
				}
				break;
			case DISABLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1745);
				match(DISABLE);
				}
				break;
			case VALIDATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1746);
				match(VALIDATE);
				}
				break;
			case NOVALIDATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1747);
				match(NOVALIDATE);
				}
				break;
			case EXCEPTIONS:
				enterOuterAlt(_localctx, 10);
				{
				setState(1748);
				exceptionsClause();
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

	public static class NotDeferrableContext extends ParserRuleContext {
		public TerminalNode DEFERRABLE() { return getToken(OracleStatementParser.DEFERRABLE, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public NotDeferrableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notDeferrable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitNotDeferrable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotDeferrableContext notDeferrable() throws RecognitionException {
		NotDeferrableContext _localctx = new NotDeferrableContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_notDeferrable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1751);
				match(NOT);
				}
			}

			setState(1754);
			match(DEFERRABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitiallyClauseContext extends ParserRuleContext {
		public TerminalNode INITIALLY() { return getToken(OracleStatementParser.INITIALLY, 0); }
		public TerminalNode IMMEDIATE() { return getToken(OracleStatementParser.IMMEDIATE, 0); }
		public TerminalNode DEFERRED() { return getToken(OracleStatementParser.DEFERRED, 0); }
		public InitiallyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initiallyClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitInitiallyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitiallyClauseContext initiallyClause() throws RecognitionException {
		InitiallyClauseContext _localctx = new InitiallyClauseContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_initiallyClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1756);
			match(INITIALLY);
			setState(1757);
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
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionsClauseContext extends ParserRuleContext {
		public TerminalNode EXCEPTIONS() { return getToken(OracleStatementParser.EXCEPTIONS, 0); }
		public TerminalNode INTO() { return getToken(OracleStatementParser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ExceptionsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionsClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitExceptionsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionsClauseContext exceptionsClause() throws RecognitionException {
		ExceptionsClauseContext _localctx = new ExceptionsClauseContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_exceptionsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			match(EXCEPTIONS);
			setState(1760);
			match(INTO);
			setState(1761);
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

	public static class UsingIndexClauseContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public CreateIndexClause_Context createIndexClause_() {
			return getRuleContext(CreateIndexClause_Context.class,0);
		}
		public UsingIndexClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingIndexClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitUsingIndexClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingIndexClauseContext usingIndexClause() throws RecognitionException {
		UsingIndexClauseContext _localctx = new UsingIndexClauseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_usingIndexClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			match(USING);
			setState(1764);
			match(INDEX);
			setState(1767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1765);
				indexName();
				}
				break;
			case 2:
				{
				setState(1766);
				createIndexClause_();
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

	public static class CreateIndexClause_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public CreateIndexClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCreateIndexClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexClause_Context createIndexClause_() throws RecognitionException {
		CreateIndexClause_Context _localctx = new CreateIndexClause_Context(_ctx, getState());
		enterRule(_localctx, 274, RULE_createIndexClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1769);
			match(LP_);
			setState(1770);
			createIndex();
			setState(1771);
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

	public static class InlineRefConstraintContext extends ParserRuleContext {
		public TerminalNode SCOPE() { return getToken(OracleStatementParser.SCOPE, 0); }
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode ROWID() { return getToken(OracleStatementParser.ROWID, 0); }
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public InlineRefConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineRefConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitInlineRefConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineRefConstraintContext inlineRefConstraint() throws RecognitionException {
		InlineRefConstraintContext _localctx = new InlineRefConstraintContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_inlineRefConstraint);
		int _la;
		try {
			setState(1789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1773);
				match(SCOPE);
				setState(1774);
				match(IS);
				setState(1775);
				tableName();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1776);
				match(WITH);
				setState(1777);
				match(ROWID);
				}
				break;
			case CONSTRAINT:
			case REFERENCES:
				enterOuterAlt(_localctx, 3);
				{
				setState(1780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1778);
					match(CONSTRAINT);
					setState(1779);
					ignoredIdentifier_();
					}
				}

				setState(1782);
				referencesClause();
				setState(1786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (USING - 91)) | (1L << (NOT - 91)) | (1L << (ENABLE - 91)) | (1L << (DISABLE - 91)))) != 0) || ((((_la - 225)) & ~0x3f) == 0 && ((1L << (_la - 225)) & ((1L << (DEFERRABLE - 225)) | (1L << (EXCEPTIONS - 225)) | (1L << (INITIALLY - 225)) | (1L << (NORELY - 225)) | (1L << (RELY - 225)) | (1L << (VALIDATE - 225)) | (1L << (NOVALIDATE - 225)))) != 0)) {
					{
					{
					setState(1783);
					constraintState();
					}
					}
					setState(1788);
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

	public static class VirtualColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(OracleStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(OracleStatementParser.ALWAYS, 0); }
		public TerminalNode VIRTUAL() { return getToken(OracleStatementParser.VIRTUAL, 0); }
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public VirtualColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtualColumnDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitVirtualColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VirtualColumnDefinitionContext virtualColumnDefinition() throws RecognitionException {
		VirtualColumnDefinitionContext _localctx = new VirtualColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_virtualColumnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1791);
			columnName();
			setState(1793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (NATURAL - 83)) | (1L << (BOOLEAN - 83)) | (1L << (DOUBLE - 83)) | (1L << (CHAR - 83)) | (1L << (INTERVAL - 83)) | (1L << (DATE - 83)) | (1L << (TIMESTAMP - 83)))) != 0) || ((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & ((1L << (INTEGER - 169)) | (1L << (REAL - 169)) | (1L << (DECIMAL - 169)) | (1L << (INT - 169)) | (1L << (SMALLINT - 169)) | (1L << (NUMERIC - 169)) | (1L << (FLOAT - 169)))) != 0) || _la==NATIONAL || ((((_la - 342)) & ~0x3f) == 0 && ((1L << (_la - 342)) & ((1L << (NCHAR - 342)) | (1L << (RAW - 342)) | (1L << (VARCHAR - 342)) | (1L << (VARCHAR2 - 342)) | (1L << (NVARCHAR2 - 342)) | (1L << (LONG - 342)) | (1L << (BLOB - 342)) | (1L << (CLOB - 342)) | (1L << (NCLOB - 342)) | (1L << (BINARY_FLOAT - 342)) | (1L << (BINARY_DOUBLE - 342)) | (1L << (PLS_INTEGER - 342)) | (1L << (BINARY_INTEGER - 342)) | (1L << (NUMBER - 342)) | (1L << (NATURALN - 342)) | (1L << (POSITIVE - 342)) | (1L << (POSITIVEN - 342)) | (1L << (SIGNTYPE - 342)) | (1L << (SIMPLE_INTEGER - 342)) | (1L << (BFILE - 342)) | (1L << (MLSLABEL - 342)) | (1L << (UROWID - 342)) | (1L << (JSON - 342)) | (1L << (DEC - 342)) | (1L << (IDENTIFIER_ - 342)))) != 0)) {
				{
				setState(1792);
				dataType();
				}
			}

			setState(1797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GENERATED) {
				{
				setState(1795);
				match(GENERATED);
				setState(1796);
				match(ALWAYS);
				}
			}

			setState(1799);
			match(AS);
			setState(1800);
			match(LP_);
			setState(1801);
			expr(0);
			setState(1802);
			match(RP_);
			setState(1804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(1803);
				match(VIRTUAL);
				}
			}

			setState(1809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (KEY - 61)) | (1L << (NOT - 61)) | (1L << (NULL - 61)))) != 0) || _la==CHECK || _la==REFERENCES) {
				{
				{
				setState(1806);
				inlineConstraint();
				}
				}
				setState(1811);
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

	public static class OutOfLineConstraintContext extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(OracleStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(OracleStatementParser.CHECK, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public OutOfLineConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outOfLineConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOutOfLineConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutOfLineConstraintContext outOfLineConstraint() throws RecognitionException {
		OutOfLineConstraintContext _localctx = new OutOfLineConstraintContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_outOfLineConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1812);
				match(CONSTRAINT);
				setState(1813);
				ignoredIdentifier_();
				}
			}

			setState(1831);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIQUE:
				{
				setState(1816);
				match(UNIQUE);
				setState(1817);
				columnNames();
				}
				break;
			case PRIMARY:
			case KEY:
				{
				setState(1818);
				primaryKey();
				setState(1819);
				columnNames();
				}
				break;
			case FOREIGN:
				{
				setState(1821);
				match(FOREIGN);
				setState(1822);
				match(KEY);
				setState(1823);
				columnNames();
				setState(1824);
				referencesClause();
				}
				break;
			case CHECK:
				{
				setState(1826);
				match(CHECK);
				setState(1827);
				match(LP_);
				setState(1828);
				expr(0);
				setState(1829);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (USING - 91)) | (1L << (NOT - 91)) | (1L << (ENABLE - 91)) | (1L << (DISABLE - 91)))) != 0) || ((((_la - 225)) & ~0x3f) == 0 && ((1L << (_la - 225)) & ((1L << (DEFERRABLE - 225)) | (1L << (EXCEPTIONS - 225)) | (1L << (INITIALLY - 225)) | (1L << (NORELY - 225)) | (1L << (RELY - 225)) | (1L << (VALIDATE - 225)) | (1L << (NOVALIDATE - 225)))) != 0)) {
				{
				{
				setState(1833);
				constraintState();
				}
				}
				setState(1838);
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

	public static class OutOfLineRefConstraintContext extends ParserRuleContext {
		public TerminalNode SCOPE() { return getToken(OracleStatementParser.SCOPE, 0); }
		public TerminalNode FOR() { return getToken(OracleStatementParser.FOR, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public LobItemContext lobItem() {
			return getRuleContext(LobItemContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode REF() { return getToken(OracleStatementParser.REF, 0); }
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode ROWID() { return getToken(OracleStatementParser.ROWID, 0); }
		public TerminalNode FOREIGN() { return getToken(OracleStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public LobItemListContext lobItemList() {
			return getRuleContext(LobItemListContext.class,0);
		}
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public OutOfLineRefConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outOfLineRefConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOutOfLineRefConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutOfLineRefConstraintContext outOfLineRefConstraint() throws RecognitionException {
		OutOfLineRefConstraintContext _localctx = new OutOfLineRefConstraintContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_outOfLineRefConstraint);
		int _la;
		try {
			setState(1868);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1839);
				match(SCOPE);
				setState(1840);
				match(FOR);
				setState(1841);
				match(LP_);
				setState(1842);
				lobItem();
				setState(1843);
				match(RP_);
				setState(1844);
				match(IS);
				setState(1845);
				tableName();
				}
				break;
			case REF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1847);
				match(REF);
				setState(1848);
				match(LP_);
				setState(1849);
				lobItem();
				setState(1850);
				match(RP_);
				setState(1851);
				match(WITH);
				setState(1852);
				match(ROWID);
				}
				break;
			case CONSTRAINT:
			case FOREIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1854);
					match(CONSTRAINT);
					setState(1855);
					ignoredIdentifier_();
					}
				}

				setState(1858);
				match(FOREIGN);
				setState(1859);
				match(KEY);
				setState(1860);
				lobItemList();
				setState(1861);
				referencesClause();
				setState(1865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (USING - 91)) | (1L << (NOT - 91)) | (1L << (ENABLE - 91)) | (1L << (DISABLE - 91)))) != 0) || ((((_la - 225)) & ~0x3f) == 0 && ((1L << (_la - 225)) & ((1L << (DEFERRABLE - 225)) | (1L << (EXCEPTIONS - 225)) | (1L << (INITIALLY - 225)) | (1L << (NORELY - 225)) | (1L << (RELY - 225)) | (1L << (VALIDATE - 225)) | (1L << (NOVALIDATE - 225)))) != 0)) {
					{
					{
					setState(1862);
					constraintState();
					}
					}
					setState(1867);
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

	public static class CreateIndexSpecification_Context extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public TerminalNode BITMAP() { return getToken(OracleStatementParser.BITMAP, 0); }
		public CreateIndexSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexSpecification_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCreateIndexSpecification_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexSpecification_Context createIndexSpecification_() throws RecognitionException {
		CreateIndexSpecification_Context _localctx = new CreateIndexSpecification_Context(_ctx, getState());
		enterRule(_localctx, 284, RULE_createIndexSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE || _la==BITMAP) {
				{
				setState(1870);
				_la = _input.LA(1);
				if ( !(_la==UNIQUE || _la==BITMAP) ) {
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

	public static class TableIndexClauseContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IndexExpressions_Context indexExpressions_() {
			return getRuleContext(IndexExpressions_Context.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TableIndexClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIndexClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTableIndexClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIndexClauseContext tableIndexClause() throws RecognitionException {
		TableIndexClauseContext _localctx = new TableIndexClauseContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_tableIndexClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1873);
			tableName();
			setState(1875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (SCHEMA - 52)) | (1L << (FUNCTION - 52)) | (1L << (PROCEDURE - 52)) | (1L << (CASE - 52)) | (1L << (WHEN - 52)) | (1L << (CAST - 52)) | (1L << (TRIM - 52)) | (1L << (SUBSTRING - 52)) | (1L << (NATURAL - 52)) | (1L << (JOIN - 52)) | (1L << (FULL - 52)) | (1L << (INNER - 52)) | (1L << (OUTER - 52)) | (1L << (LEFT - 52)) | (1L << (RIGHT - 52)) | (1L << (CROSS - 52)) | (1L << (USING - 52)) | (1L << (IF - 52)) | (1L << (TRUE - 52)) | (1L << (FALSE - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (BEGIN - 119)) | (1L << (COMMIT - 119)) | (1L << (ROLLBACK - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (DOUBLE - 119)) | (1L << (CHARACTER - 119)) | (1L << (ARRAY - 119)) | (1L << (INTERVAL - 119)) | (1L << (TIME - 119)) | (1L << (TIMESTAMP - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (YEAR - 119)) | (1L << (QUARTER - 119)) | (1L << (MONTH - 119)) | (1L << (WEEK - 119)) | (1L << (DAY - 119)) | (1L << (HOUR - 119)) | (1L << (MINUTE - 119)) | (1L << (SECOND - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (PRESERVE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (CURRENT_USER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (CLOSE - 119)) | (1L << (OPEN - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (COLLATION - 119)) | (1L << (NAMES - 119)) | (1L << (INTEGER - 119)) | (1L << (REAL - 119)) | (1L << (DECIMAL - 119)) | (1L << (TYPE - 119)) | (1L << (BINARY - 119)) | (1L << (ESCAPE - 119)) | (1L << (MOD - 119)) | (1L << (XOR - 119)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (UNKNOWN - 184)) | (1L << (ALWAYS - 184)) | (1L << (CASCADE - 184)) | (1L << (GENERATED - 184)) | (1L << (PRIVILEGES - 184)) | (1L << (READ - 184)) | (1L << (WRITE - 184)) | (1L << (REFERENCES - 184)) | (1L << (TRANSACTION - 184)) | (1L << (ROLE - 184)) | (1L << (VISIBLE - 184)) | (1L << (INVISIBLE - 184)) | (1L << (EXECUTE - 184)) | (1L << (USE - 184)) | (1L << (DEBUG - 184)) | (1L << (UNDER - 184)) | (1L << (FLASHBACK - 184)) | (1L << (ARCHIVE - 184)) | (1L << (REFRESH - 184)) | (1L << (QUERY - 184)) | (1L << (REWRITE - 184)) | (1L << (KEEP - 184)) | (1L << (SEQUENCE - 184)) | (1L << (INHERIT - 184)) | (1L << (TRANSLATE - 184)) | (1L << (MERGE - 184)) | (1L << (AT - 184)) | (1L << (BITMAP - 184)) | (1L << (CACHE - 184)) | (1L << (NOCACHE - 184)) | (1L << (CHECKPOINT - 184)) | (1L << (CONNECT - 184)) | (1L << (CONSTRAINTS - 184)) | (1L << (CYCLE - 184)) | (1L << (NOCYCLE - 184)) | (1L << (DBTIMEZONE - 184)) | (1L << (ENCRYPT - 184)) | (1L << (DECRYPT - 184)) | (1L << (DEFERRABLE - 184)) | (1L << (DEFERRED - 184)) | (1L << (EDITION - 184)) | (1L << (ELEMENT - 184)) | (1L << (END - 184)) | (1L << (EXCEPTIONS - 184)) | (1L << (FORCE - 184)) | (1L << (GLOBAL - 184)) | (1L << (IDENTITY - 184)) | (1L << (INITIALLY - 184)) | (1L << (INVALIDATE - 184)) | (1L << (JAVA - 184)) | (1L << (LEVELS - 184)) | (1L << (MAXVALUE - 184)) | (1L << (MINVALUE - 184)) | (1L << (NOMAXVALUE - 184)) | (1L << (NOMINVALUE - 184)) | (1L << (MINING - 184)) | (1L << (MODEL - 184)))) != 0) || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (NATIONAL - 249)) | (1L << (NEW - 249)) | (1L << (NOORDER - 249)) | (1L << (NORELY - 249)) | (1L << (ONLY - 249)) | (1L << (PROFILE - 249)) | (1L << (REF - 249)) | (1L << (REKEY - 249)) | (1L << (RELY - 249)) | (1L << (REPLACE - 249)) | (1L << (SALT - 249)) | (1L << (SCOPE - 249)) | (1L << (SORT - 249)) | (1L << (SOURCE - 249)) | (1L << (SUBSTITUTABLE - 249)) | (1L << (TABLESPACE - 249)) | (1L << (TEMPORARY - 249)) | (1L << (TRANSLATION - 249)) | (1L << (TREAT - 249)) | (1L << (NO - 249)) | (1L << (UNUSED - 249)) | (1L << (NOVALIDATE - 249)) | (1L << (VALUE - 249)) | (1L << (VARYING - 249)) | (1L << (VIRTUAL - 249)) | (1L << (ZONE - 249)) | (1L << (ADVISOR - 249)) | (1L << (ADMINISTER - 249)) | (1L << (TUNING - 249)) | (1L << (MANAGE - 249)) | (1L << (MANAGEMENT - 249)) | (1L << (OBJECT - 249)) | (1L << (CLUSTER - 249)) | (1L << (CONTEXT - 249)) | (1L << (EXEMPT - 249)) | (1L << (REDACTION - 249)) | (1L << (POLICY - 249)) | (1L << (DATABASE - 249)) | (1L << (SYSTEM - 249)) | (1L << (AUDIT - 249)) | (1L << (LINK - 249)) | (1L << (ANALYZE - 249)) | (1L << (DICTIONARY - 249)) | (1L << (DIMENSION - 249)) | (1L << (INDEXTYPE - 249)) | (1L << (EXTERNAL - 249)) | (1L << (JOB - 249)) | (1L << (CLASS - 249)) | (1L << (PROGRAM - 249)) | (1L << (SCHEDULER - 249)) | (1L << (LIBRARY - 249)) | (1L << (LOGMINING - 249)) | (1L << (MATERIALIZED - 249)) | (1L << (CUBE - 249)))) != 0) || ((((_la - 313)) & ~0x3f) == 0 && ((1L << (_la - 313)) & ((1L << (MEASURE - 313)) | (1L << (FOLDER - 313)) | (1L << (BUILD - 313)) | (1L << (PROCESS - 313)) | (1L << (OPERATOR - 313)) | (1L << (OUTLINE - 313)) | (1L << (PLUGGABLE - 313)) | (1L << (CONTAINER - 313)) | (1L << (SEGMENT - 313)) | (1L << (RESTRICTED - 313)) | (1L << (COST - 313)) | (1L << (SYNONYM - 313)) | (1L << (BACKUP - 313)) | (1L << (UNLIMITED - 313)) | (1L << (BECOME - 313)) | (1L << (CHANGE - 313)) | (1L << (NOTIFICATION - 313)) | (1L << (ACCESS - 313)) | (1L << (PRIVILEGE - 313)) | (1L << (PURGE - 313)) | (1L << (RESUMABLE - 313)) | (1L << (SYSGUID - 313)) | (1L << (SYSBACKUP - 313)) | (1L << (SYSDBA - 313)) | (1L << (SYSDG - 313)) | (1L << (SYSKM - 313)) | (1L << (SYSOPER - 313)) | (1L << (DBA_RECYCLEBIN - 313)) | (1L << (FIRST - 313)) | (1L << (IDENTIFIER_ - 313)) | (1L << (STRING_ - 313)))) != 0)) {
				{
				setState(1874);
				alias();
				}
			}

			setState(1877);
			indexExpressions_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexExpressions_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<IndexExpression_Context> indexExpression_() {
			return getRuleContexts(IndexExpression_Context.class);
		}
		public IndexExpression_Context indexExpression_(int i) {
			return getRuleContext(IndexExpression_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public IndexExpressions_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexExpressions_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIndexExpressions_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexExpressions_Context indexExpressions_() throws RecognitionException {
		IndexExpressions_Context _localctx = new IndexExpressions_Context(_ctx, getState());
		enterRule(_localctx, 288, RULE_indexExpressions_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1879);
			match(LP_);
			setState(1880);
			indexExpression_();
			setState(1885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1881);
				match(COMMA_);
				setState(1882);
				indexExpression_();
				}
				}
				setState(1887);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1888);
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

	public static class IndexExpression_Context extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(OracleStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleStatementParser.DESC, 0); }
		public IndexExpression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexExpression_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIndexExpression_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexExpression_Context indexExpression_() throws RecognitionException {
		IndexExpression_Context _localctx = new IndexExpression_Context(_ctx, getState());
		enterRule(_localctx, 290, RULE_indexExpression_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1890);
				columnName();
				}
				break;
			case 2:
				{
				setState(1891);
				expr(0);
				}
				break;
			}
			setState(1895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1894);
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

	public static class BitmapJoinIndexClause_Context extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnSortsClause_Context columnSortsClause_() {
			return getRuleContext(ColumnSortsClause_Context.class,0);
		}
		public TerminalNode FROM() { return getToken(OracleStatementParser.FROM, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(OracleStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BitmapJoinIndexClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitmapJoinIndexClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitBitmapJoinIndexClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitmapJoinIndexClause_Context bitmapJoinIndexClause_() throws RecognitionException {
		BitmapJoinIndexClause_Context _localctx = new BitmapJoinIndexClause_Context(_ctx, getState());
		enterRule(_localctx, 292, RULE_bitmapJoinIndexClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1897);
			tableName();
			setState(1898);
			columnSortsClause_();
			setState(1899);
			match(FROM);
			setState(1900);
			tableAlias();
			setState(1901);
			match(WHERE);
			setState(1902);
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

	public static class ColumnSortsClause_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ColumnSortClause_Context> columnSortClause_() {
			return getRuleContexts(ColumnSortClause_Context.class);
		}
		public ColumnSortClause_Context columnSortClause_(int i) {
			return getRuleContext(ColumnSortClause_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ColumnSortsClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnSortsClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnSortsClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnSortsClause_Context columnSortsClause_() throws RecognitionException {
		ColumnSortsClause_Context _localctx = new ColumnSortsClause_Context(_ctx, getState());
		enterRule(_localctx, 294, RULE_columnSortsClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1904);
			match(LP_);
			setState(1905);
			columnSortClause_();
			setState(1910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1906);
				match(COMMA_);
				setState(1907);
				columnSortClause_();
				}
				}
				setState(1912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1913);
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

	public static class ColumnSortClause_Context extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode ASC() { return getToken(OracleStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleStatementParser.DESC, 0); }
		public ColumnSortClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnSortClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnSortClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnSortClause_Context columnSortClause_() throws RecognitionException {
		ColumnSortClause_Context _localctx = new ColumnSortClause_Context(_ctx, getState());
		enterRule(_localctx, 296, RULE_columnSortClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1915);
				tableName();
				}
				break;
			case 2:
				{
				setState(1916);
				alias();
				}
				break;
			}
			setState(1919);
			columnName();
			setState(1921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1920);
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

	public static class CreateIndexDefinitionClauseContext extends ParserRuleContext {
		public TableIndexClauseContext tableIndexClause() {
			return getRuleContext(TableIndexClauseContext.class,0);
		}
		public BitmapJoinIndexClause_Context bitmapJoinIndexClause_() {
			return getRuleContext(BitmapJoinIndexClause_Context.class,0);
		}
		public CreateIndexDefinitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexDefinitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCreateIndexDefinitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexDefinitionClauseContext createIndexDefinitionClause() throws RecognitionException {
		CreateIndexDefinitionClauseContext _localctx = new CreateIndexDefinitionClauseContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_createIndexDefinitionClause);
		try {
			setState(1925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1923);
				tableIndexClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1924);
				bitmapJoinIndexClause_();
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

	public static class TableAliasContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public List<AliasContext> alias() {
			return getRuleContexts(AliasContext.class);
		}
		public AliasContext alias(int i) {
			return getRuleContext(AliasContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_tableAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1927);
			tableName();
			setState(1929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (SCHEMA - 52)) | (1L << (FUNCTION - 52)) | (1L << (PROCEDURE - 52)) | (1L << (CASE - 52)) | (1L << (WHEN - 52)) | (1L << (CAST - 52)) | (1L << (TRIM - 52)) | (1L << (SUBSTRING - 52)) | (1L << (NATURAL - 52)) | (1L << (JOIN - 52)) | (1L << (FULL - 52)) | (1L << (INNER - 52)) | (1L << (OUTER - 52)) | (1L << (LEFT - 52)) | (1L << (RIGHT - 52)) | (1L << (CROSS - 52)) | (1L << (USING - 52)) | (1L << (IF - 52)) | (1L << (TRUE - 52)) | (1L << (FALSE - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (BEGIN - 119)) | (1L << (COMMIT - 119)) | (1L << (ROLLBACK - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (DOUBLE - 119)) | (1L << (CHARACTER - 119)) | (1L << (ARRAY - 119)) | (1L << (INTERVAL - 119)) | (1L << (TIME - 119)) | (1L << (TIMESTAMP - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (YEAR - 119)) | (1L << (QUARTER - 119)) | (1L << (MONTH - 119)) | (1L << (WEEK - 119)) | (1L << (DAY - 119)) | (1L << (HOUR - 119)) | (1L << (MINUTE - 119)) | (1L << (SECOND - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (PRESERVE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (CURRENT_USER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (CLOSE - 119)) | (1L << (OPEN - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (COLLATION - 119)) | (1L << (NAMES - 119)) | (1L << (INTEGER - 119)) | (1L << (REAL - 119)) | (1L << (DECIMAL - 119)) | (1L << (TYPE - 119)) | (1L << (BINARY - 119)) | (1L << (ESCAPE - 119)) | (1L << (MOD - 119)) | (1L << (XOR - 119)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (UNKNOWN - 184)) | (1L << (ALWAYS - 184)) | (1L << (CASCADE - 184)) | (1L << (GENERATED - 184)) | (1L << (PRIVILEGES - 184)) | (1L << (READ - 184)) | (1L << (WRITE - 184)) | (1L << (REFERENCES - 184)) | (1L << (TRANSACTION - 184)) | (1L << (ROLE - 184)) | (1L << (VISIBLE - 184)) | (1L << (INVISIBLE - 184)) | (1L << (EXECUTE - 184)) | (1L << (USE - 184)) | (1L << (DEBUG - 184)) | (1L << (UNDER - 184)) | (1L << (FLASHBACK - 184)) | (1L << (ARCHIVE - 184)) | (1L << (REFRESH - 184)) | (1L << (QUERY - 184)) | (1L << (REWRITE - 184)) | (1L << (KEEP - 184)) | (1L << (SEQUENCE - 184)) | (1L << (INHERIT - 184)) | (1L << (TRANSLATE - 184)) | (1L << (MERGE - 184)) | (1L << (AT - 184)) | (1L << (BITMAP - 184)) | (1L << (CACHE - 184)) | (1L << (NOCACHE - 184)) | (1L << (CHECKPOINT - 184)) | (1L << (CONNECT - 184)) | (1L << (CONSTRAINTS - 184)) | (1L << (CYCLE - 184)) | (1L << (NOCYCLE - 184)) | (1L << (DBTIMEZONE - 184)) | (1L << (ENCRYPT - 184)) | (1L << (DECRYPT - 184)) | (1L << (DEFERRABLE - 184)) | (1L << (DEFERRED - 184)) | (1L << (EDITION - 184)) | (1L << (ELEMENT - 184)) | (1L << (END - 184)) | (1L << (EXCEPTIONS - 184)) | (1L << (FORCE - 184)) | (1L << (GLOBAL - 184)) | (1L << (IDENTITY - 184)) | (1L << (INITIALLY - 184)) | (1L << (INVALIDATE - 184)) | (1L << (JAVA - 184)) | (1L << (LEVELS - 184)) | (1L << (MAXVALUE - 184)) | (1L << (MINVALUE - 184)) | (1L << (NOMAXVALUE - 184)) | (1L << (NOMINVALUE - 184)) | (1L << (MINING - 184)) | (1L << (MODEL - 184)))) != 0) || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (NATIONAL - 249)) | (1L << (NEW - 249)) | (1L << (NOORDER - 249)) | (1L << (NORELY - 249)) | (1L << (ONLY - 249)) | (1L << (PROFILE - 249)) | (1L << (REF - 249)) | (1L << (REKEY - 249)) | (1L << (RELY - 249)) | (1L << (REPLACE - 249)) | (1L << (SALT - 249)) | (1L << (SCOPE - 249)) | (1L << (SORT - 249)) | (1L << (SOURCE - 249)) | (1L << (SUBSTITUTABLE - 249)) | (1L << (TABLESPACE - 249)) | (1L << (TEMPORARY - 249)) | (1L << (TRANSLATION - 249)) | (1L << (TREAT - 249)) | (1L << (NO - 249)) | (1L << (UNUSED - 249)) | (1L << (NOVALIDATE - 249)) | (1L << (VALUE - 249)) | (1L << (VARYING - 249)) | (1L << (VIRTUAL - 249)) | (1L << (ZONE - 249)) | (1L << (ADVISOR - 249)) | (1L << (ADMINISTER - 249)) | (1L << (TUNING - 249)) | (1L << (MANAGE - 249)) | (1L << (MANAGEMENT - 249)) | (1L << (OBJECT - 249)) | (1L << (CLUSTER - 249)) | (1L << (CONTEXT - 249)) | (1L << (EXEMPT - 249)) | (1L << (REDACTION - 249)) | (1L << (POLICY - 249)) | (1L << (DATABASE - 249)) | (1L << (SYSTEM - 249)) | (1L << (AUDIT - 249)) | (1L << (LINK - 249)) | (1L << (ANALYZE - 249)) | (1L << (DICTIONARY - 249)) | (1L << (DIMENSION - 249)) | (1L << (INDEXTYPE - 249)) | (1L << (EXTERNAL - 249)) | (1L << (JOB - 249)) | (1L << (CLASS - 249)) | (1L << (PROGRAM - 249)) | (1L << (SCHEDULER - 249)) | (1L << (LIBRARY - 249)) | (1L << (LOGMINING - 249)) | (1L << (MATERIALIZED - 249)) | (1L << (CUBE - 249)))) != 0) || ((((_la - 313)) & ~0x3f) == 0 && ((1L << (_la - 313)) & ((1L << (MEASURE - 313)) | (1L << (FOLDER - 313)) | (1L << (BUILD - 313)) | (1L << (PROCESS - 313)) | (1L << (OPERATOR - 313)) | (1L << (OUTLINE - 313)) | (1L << (PLUGGABLE - 313)) | (1L << (CONTAINER - 313)) | (1L << (SEGMENT - 313)) | (1L << (RESTRICTED - 313)) | (1L << (COST - 313)) | (1L << (SYNONYM - 313)) | (1L << (BACKUP - 313)) | (1L << (UNLIMITED - 313)) | (1L << (BECOME - 313)) | (1L << (CHANGE - 313)) | (1L << (NOTIFICATION - 313)) | (1L << (ACCESS - 313)) | (1L << (PRIVILEGE - 313)) | (1L << (PURGE - 313)) | (1L << (RESUMABLE - 313)) | (1L << (SYSGUID - 313)) | (1L << (SYSBACKUP - 313)) | (1L << (SYSDBA - 313)) | (1L << (SYSDG - 313)) | (1L << (SYSKM - 313)) | (1L << (SYSOPER - 313)) | (1L << (DBA_RECYCLEBIN - 313)) | (1L << (FIRST - 313)) | (1L << (IDENTIFIER_ - 313)) | (1L << (STRING_ - 313)))) != 0)) {
				{
				setState(1928);
				alias();
				}
			}

			setState(1938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1931);
				match(COMMA_);
				setState(1932);
				tableName();
				setState(1934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (SCHEMA - 52)) | (1L << (FUNCTION - 52)) | (1L << (PROCEDURE - 52)) | (1L << (CASE - 52)) | (1L << (WHEN - 52)) | (1L << (CAST - 52)) | (1L << (TRIM - 52)) | (1L << (SUBSTRING - 52)) | (1L << (NATURAL - 52)) | (1L << (JOIN - 52)) | (1L << (FULL - 52)) | (1L << (INNER - 52)) | (1L << (OUTER - 52)) | (1L << (LEFT - 52)) | (1L << (RIGHT - 52)) | (1L << (CROSS - 52)) | (1L << (USING - 52)) | (1L << (IF - 52)) | (1L << (TRUE - 52)) | (1L << (FALSE - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (BEGIN - 119)) | (1L << (COMMIT - 119)) | (1L << (ROLLBACK - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (DOUBLE - 119)) | (1L << (CHARACTER - 119)) | (1L << (ARRAY - 119)) | (1L << (INTERVAL - 119)) | (1L << (TIME - 119)) | (1L << (TIMESTAMP - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (YEAR - 119)) | (1L << (QUARTER - 119)) | (1L << (MONTH - 119)) | (1L << (WEEK - 119)) | (1L << (DAY - 119)) | (1L << (HOUR - 119)) | (1L << (MINUTE - 119)) | (1L << (SECOND - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (PRESERVE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (CURRENT_USER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (CLOSE - 119)) | (1L << (OPEN - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (COLLATION - 119)) | (1L << (NAMES - 119)) | (1L << (INTEGER - 119)) | (1L << (REAL - 119)) | (1L << (DECIMAL - 119)) | (1L << (TYPE - 119)) | (1L << (BINARY - 119)) | (1L << (ESCAPE - 119)) | (1L << (MOD - 119)) | (1L << (XOR - 119)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (UNKNOWN - 184)) | (1L << (ALWAYS - 184)) | (1L << (CASCADE - 184)) | (1L << (GENERATED - 184)) | (1L << (PRIVILEGES - 184)) | (1L << (READ - 184)) | (1L << (WRITE - 184)) | (1L << (REFERENCES - 184)) | (1L << (TRANSACTION - 184)) | (1L << (ROLE - 184)) | (1L << (VISIBLE - 184)) | (1L << (INVISIBLE - 184)) | (1L << (EXECUTE - 184)) | (1L << (USE - 184)) | (1L << (DEBUG - 184)) | (1L << (UNDER - 184)) | (1L << (FLASHBACK - 184)) | (1L << (ARCHIVE - 184)) | (1L << (REFRESH - 184)) | (1L << (QUERY - 184)) | (1L << (REWRITE - 184)) | (1L << (KEEP - 184)) | (1L << (SEQUENCE - 184)) | (1L << (INHERIT - 184)) | (1L << (TRANSLATE - 184)) | (1L << (MERGE - 184)) | (1L << (AT - 184)) | (1L << (BITMAP - 184)) | (1L << (CACHE - 184)) | (1L << (NOCACHE - 184)) | (1L << (CHECKPOINT - 184)) | (1L << (CONNECT - 184)) | (1L << (CONSTRAINTS - 184)) | (1L << (CYCLE - 184)) | (1L << (NOCYCLE - 184)) | (1L << (DBTIMEZONE - 184)) | (1L << (ENCRYPT - 184)) | (1L << (DECRYPT - 184)) | (1L << (DEFERRABLE - 184)) | (1L << (DEFERRED - 184)) | (1L << (EDITION - 184)) | (1L << (ELEMENT - 184)) | (1L << (END - 184)) | (1L << (EXCEPTIONS - 184)) | (1L << (FORCE - 184)) | (1L << (GLOBAL - 184)) | (1L << (IDENTITY - 184)) | (1L << (INITIALLY - 184)) | (1L << (INVALIDATE - 184)) | (1L << (JAVA - 184)) | (1L << (LEVELS - 184)) | (1L << (MAXVALUE - 184)) | (1L << (MINVALUE - 184)) | (1L << (NOMAXVALUE - 184)) | (1L << (NOMINVALUE - 184)) | (1L << (MINING - 184)) | (1L << (MODEL - 184)))) != 0) || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (NATIONAL - 249)) | (1L << (NEW - 249)) | (1L << (NOORDER - 249)) | (1L << (NORELY - 249)) | (1L << (ONLY - 249)) | (1L << (PROFILE - 249)) | (1L << (REF - 249)) | (1L << (REKEY - 249)) | (1L << (RELY - 249)) | (1L << (REPLACE - 249)) | (1L << (SALT - 249)) | (1L << (SCOPE - 249)) | (1L << (SORT - 249)) | (1L << (SOURCE - 249)) | (1L << (SUBSTITUTABLE - 249)) | (1L << (TABLESPACE - 249)) | (1L << (TEMPORARY - 249)) | (1L << (TRANSLATION - 249)) | (1L << (TREAT - 249)) | (1L << (NO - 249)) | (1L << (UNUSED - 249)) | (1L << (NOVALIDATE - 249)) | (1L << (VALUE - 249)) | (1L << (VARYING - 249)) | (1L << (VIRTUAL - 249)) | (1L << (ZONE - 249)) | (1L << (ADVISOR - 249)) | (1L << (ADMINISTER - 249)) | (1L << (TUNING - 249)) | (1L << (MANAGE - 249)) | (1L << (MANAGEMENT - 249)) | (1L << (OBJECT - 249)) | (1L << (CLUSTER - 249)) | (1L << (CONTEXT - 249)) | (1L << (EXEMPT - 249)) | (1L << (REDACTION - 249)) | (1L << (POLICY - 249)) | (1L << (DATABASE - 249)) | (1L << (SYSTEM - 249)) | (1L << (AUDIT - 249)) | (1L << (LINK - 249)) | (1L << (ANALYZE - 249)) | (1L << (DICTIONARY - 249)) | (1L << (DIMENSION - 249)) | (1L << (INDEXTYPE - 249)) | (1L << (EXTERNAL - 249)) | (1L << (JOB - 249)) | (1L << (CLASS - 249)) | (1L << (PROGRAM - 249)) | (1L << (SCHEDULER - 249)) | (1L << (LIBRARY - 249)) | (1L << (LOGMINING - 249)) | (1L << (MATERIALIZED - 249)) | (1L << (CUBE - 249)))) != 0) || ((((_la - 313)) & ~0x3f) == 0 && ((1L << (_la - 313)) & ((1L << (MEASURE - 313)) | (1L << (FOLDER - 313)) | (1L << (BUILD - 313)) | (1L << (PROCESS - 313)) | (1L << (OPERATOR - 313)) | (1L << (OUTLINE - 313)) | (1L << (PLUGGABLE - 313)) | (1L << (CONTAINER - 313)) | (1L << (SEGMENT - 313)) | (1L << (RESTRICTED - 313)) | (1L << (COST - 313)) | (1L << (SYNONYM - 313)) | (1L << (BACKUP - 313)) | (1L << (UNLIMITED - 313)) | (1L << (BECOME - 313)) | (1L << (CHANGE - 313)) | (1L << (NOTIFICATION - 313)) | (1L << (ACCESS - 313)) | (1L << (PRIVILEGE - 313)) | (1L << (PURGE - 313)) | (1L << (RESUMABLE - 313)) | (1L << (SYSGUID - 313)) | (1L << (SYSBACKUP - 313)) | (1L << (SYSDBA - 313)) | (1L << (SYSDG - 313)) | (1L << (SYSKM - 313)) | (1L << (SYSOPER - 313)) | (1L << (DBA_RECYCLEBIN - 313)) | (1L << (FIRST - 313)) | (1L << (IDENTIFIER_ - 313)) | (1L << (STRING_ - 313)))) != 0)) {
					{
					setState(1933);
					alias();
					}
				}

				}
				}
				setState(1940);
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

	public static class AlterDefinitionClauseContext extends ParserRuleContext {
		public AlterTablePropertiesContext alterTableProperties() {
			return getRuleContext(AlterTablePropertiesContext.class,0);
		}
		public ColumnClausesContext columnClauses() {
			return getRuleContext(ColumnClausesContext.class,0);
		}
		public ConstraintClausesContext constraintClauses() {
			return getRuleContext(ConstraintClausesContext.class,0);
		}
		public AlterExternalTableContext alterExternalTable() {
			return getRuleContext(AlterExternalTableContext.class,0);
		}
		public AlterDefinitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDefinitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAlterDefinitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDefinitionClauseContext alterDefinitionClause() throws RecognitionException {
		AlterDefinitionClauseContext _localctx = new AlterDefinitionClauseContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_alterDefinitionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1941);
				alterTableProperties();
				}
				break;
			case 2:
				{
				setState(1942);
				columnClauses();
				}
				break;
			case 3:
				{
				setState(1943);
				constraintClauses();
				}
				break;
			case 4:
				{
				setState(1944);
				alterExternalTable();
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

	public static class AlterTablePropertiesContext extends ParserRuleContext {
		public RenameTableSpecification_Context renameTableSpecification_() {
			return getRuleContext(RenameTableSpecification_Context.class,0);
		}
		public TerminalNode REKEY() { return getToken(OracleStatementParser.REKEY, 0); }
		public EncryptionSpecification_Context encryptionSpecification_() {
			return getRuleContext(EncryptionSpecification_Context.class,0);
		}
		public AlterTablePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableProperties; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAlterTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTablePropertiesContext alterTableProperties() throws RecognitionException {
		AlterTablePropertiesContext _localctx = new AlterTablePropertiesContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_alterTableProperties);
		try {
			setState(1950);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1947);
				renameTableSpecification_();
				}
				break;
			case REKEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1948);
				match(REKEY);
				setState(1949);
				encryptionSpecification_();
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

	public static class RenameTableSpecification_Context extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RenameTableSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameTableSpecification_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRenameTableSpecification_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameTableSpecification_Context renameTableSpecification_() throws RecognitionException {
		RenameTableSpecification_Context _localctx = new RenameTableSpecification_Context(_ctx, getState());
		enterRule(_localctx, 306, RULE_renameTableSpecification_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1952);
			match(RENAME);
			setState(1953);
			match(TO);
			setState(1954);
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

	public static class ColumnClausesContext extends ParserRuleContext {
		public List<OperateColumnClauseContext> operateColumnClause() {
			return getRuleContexts(OperateColumnClauseContext.class);
		}
		public OperateColumnClauseContext operateColumnClause(int i) {
			return getRuleContext(OperateColumnClauseContext.class,i);
		}
		public RenameColumnClauseContext renameColumnClause() {
			return getRuleContext(RenameColumnClauseContext.class,0);
		}
		public ColumnClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnClauses; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnClausesContext columnClauses() throws RecognitionException {
		ColumnClausesContext _localctx = new ColumnClausesContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_columnClauses);
		int _la;
		try {
			setState(1962);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DROP:
			case ADD:
			case SET:
			case MODIFY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1957); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1956);
					operateColumnClause();
					}
					}
					setState(1959); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DROP) | (1L << ADD) | (1L << SET))) != 0) || _la==MODIFY );
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(1961);
				renameColumnClause();
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

	public static class OperateColumnClauseContext extends ParserRuleContext {
		public AddColumnSpecificationContext addColumnSpecification() {
			return getRuleContext(AddColumnSpecificationContext.class,0);
		}
		public ModifyColumnSpecificationContext modifyColumnSpecification() {
			return getRuleContext(ModifyColumnSpecificationContext.class,0);
		}
		public DropColumnClauseContext dropColumnClause() {
			return getRuleContext(DropColumnClauseContext.class,0);
		}
		public OperateColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operateColumnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOperateColumnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperateColumnClauseContext operateColumnClause() throws RecognitionException {
		OperateColumnClauseContext _localctx = new OperateColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_operateColumnClause);
		try {
			setState(1967);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1964);
				addColumnSpecification();
				}
				break;
			case MODIFY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1965);
				modifyColumnSpecification();
				}
				break;
			case DROP:
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(1966);
				dropColumnClause();
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

	public static class AddColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(OracleStatementParser.ADD, 0); }
		public ColumnOrVirtualDefinitionsContext columnOrVirtualDefinitions() {
			return getRuleContext(ColumnOrVirtualDefinitionsContext.class,0);
		}
		public ColumnPropertiesContext columnProperties() {
			return getRuleContext(ColumnPropertiesContext.class,0);
		}
		public AddColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumnSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAddColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddColumnSpecificationContext addColumnSpecification() throws RecognitionException {
		AddColumnSpecificationContext _localctx = new AddColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_addColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1969);
			match(ADD);
			setState(1970);
			columnOrVirtualDefinitions();
			setState(1972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1971);
				columnProperties();
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

	public static class ColumnOrVirtualDefinitionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ColumnOrVirtualDefinitionContext> columnOrVirtualDefinition() {
			return getRuleContexts(ColumnOrVirtualDefinitionContext.class);
		}
		public ColumnOrVirtualDefinitionContext columnOrVirtualDefinition(int i) {
			return getRuleContext(ColumnOrVirtualDefinitionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ColumnOrVirtualDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOrVirtualDefinitions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnOrVirtualDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnOrVirtualDefinitionsContext columnOrVirtualDefinitions() throws RecognitionException {
		ColumnOrVirtualDefinitionsContext _localctx = new ColumnOrVirtualDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_columnOrVirtualDefinitions);
		int _la;
		try {
			setState(1986);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1974);
				match(LP_);
				setState(1975);
				columnOrVirtualDefinition();
				setState(1980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1976);
					match(COMMA_);
					setState(1977);
					columnOrVirtualDefinition();
					}
					}
					setState(1982);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1983);
				match(RP_);
				}
				break;
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1985);
				columnOrVirtualDefinition();
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

	public static class ColumnOrVirtualDefinitionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public VirtualColumnDefinitionContext virtualColumnDefinition() {
			return getRuleContext(VirtualColumnDefinitionContext.class,0);
		}
		public ColumnOrVirtualDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOrVirtualDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnOrVirtualDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnOrVirtualDefinitionContext columnOrVirtualDefinition() throws RecognitionException {
		ColumnOrVirtualDefinitionContext _localctx = new ColumnOrVirtualDefinitionContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_columnOrVirtualDefinition);
		try {
			setState(1990);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1988);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1989);
				virtualColumnDefinition();
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

	public static class ColumnPropertiesContext extends ParserRuleContext {
		public List<ColumnPropertyContext> columnProperty() {
			return getRuleContexts(ColumnPropertyContext.class);
		}
		public ColumnPropertyContext columnProperty(int i) {
			return getRuleContext(ColumnPropertyContext.class,i);
		}
		public ColumnPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnProperties; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnPropertiesContext columnProperties() throws RecognitionException {
		ColumnPropertiesContext _localctx = new ColumnPropertiesContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_columnProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1993); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1992);
				columnProperty();
				}
				}
				setState(1995); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLUMN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnPropertyContext extends ParserRuleContext {
		public ObjectTypeColPropertiesContext objectTypeColProperties() {
			return getRuleContext(ObjectTypeColPropertiesContext.class,0);
		}
		public ColumnPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnPropertyContext columnProperty() throws RecognitionException {
		ColumnPropertyContext _localctx = new ColumnPropertyContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_columnProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			objectTypeColProperties();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectTypeColPropertiesContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public SubstitutableColumnClauseContext substitutableColumnClause() {
			return getRuleContext(SubstitutableColumnClauseContext.class,0);
		}
		public ObjectTypeColPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectTypeColProperties; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitObjectTypeColProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeColPropertiesContext objectTypeColProperties() throws RecognitionException {
		ObjectTypeColPropertiesContext _localctx = new ObjectTypeColPropertiesContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_objectTypeColProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1999);
			match(COLUMN);
			setState(2000);
			columnName();
			setState(2001);
			substitutableColumnClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubstitutableColumnClauseContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TerminalNode OF() { return getToken(OracleStatementParser.OF, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode ELEMENT() { return getToken(OracleStatementParser.ELEMENT, 0); }
		public TerminalNode TYPE() { return getToken(OracleStatementParser.TYPE, 0); }
		public TerminalNode ONLY() { return getToken(OracleStatementParser.ONLY, 0); }
		public TerminalNode SUBSTITUTABLE() { return getToken(OracleStatementParser.SUBSTITUTABLE, 0); }
		public TerminalNode AT() { return getToken(OracleStatementParser.AT, 0); }
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode LEVELS() { return getToken(OracleStatementParser.LEVELS, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public SubstitutableColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substitutableColumnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSubstitutableColumnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubstitutableColumnClauseContext substitutableColumnClause() throws RecognitionException {
		SubstitutableColumnClauseContext _localctx = new SubstitutableColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_substitutableColumnClause);
		int _la;
		try {
			setState(2025);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IS:
			case ELEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2004);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELEMENT) {
					{
					setState(2003);
					match(ELEMENT);
					}
				}

				setState(2006);
				match(IS);
				setState(2007);
				match(OF);
				setState(2009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(2008);
					match(TYPE);
					}
				}

				setState(2011);
				match(LP_);
				setState(2013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ONLY) {
					{
					setState(2012);
					match(ONLY);
					}
				}

				setState(2015);
				dataTypeName();
				setState(2016);
				match(RP_);
				}
				break;
			case NOT:
			case SUBSTITUTABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2018);
					match(NOT);
					}
				}

				setState(2021);
				match(SUBSTITUTABLE);
				setState(2022);
				match(AT);
				setState(2023);
				match(ALL);
				setState(2024);
				match(LEVELS);
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

	public static class ModifyColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode MODIFY() { return getToken(OracleStatementParser.MODIFY, 0); }
		public List<ModifyColPropertiesContext> modifyColProperties() {
			return getRuleContexts(ModifyColPropertiesContext.class);
		}
		public ModifyColPropertiesContext modifyColProperties(int i) {
			return getRuleContext(ModifyColPropertiesContext.class,i);
		}
		public ModifyColSubstitutableContext modifyColSubstitutable() {
			return getRuleContext(ModifyColSubstitutableContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public ModifyColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumnSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitModifyColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyColumnSpecificationContext modifyColumnSpecification() throws RecognitionException {
		ModifyColumnSpecificationContext _localctx = new ModifyColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_modifyColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2027);
			match(MODIFY);
			setState(2043);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case IDENTIFIER_:
				{
				setState(2029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2028);
					match(LP_);
					}
				}

				setState(2031);
				modifyColProperties();
				setState(2036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2032);
					match(COMMA_);
					setState(2033);
					modifyColProperties();
					}
					}
					setState(2038);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2040);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RP_) {
					{
					setState(2039);
					match(RP_);
					}
				}

				}
				break;
			case COLUMN:
				{
				setState(2042);
				modifyColSubstitutable();
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

	public static class ModifyColPropertiesContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENCRYPT() { return getToken(OracleStatementParser.ENCRYPT, 0); }
		public EncryptionSpecification_Context encryptionSpecification_() {
			return getRuleContext(EncryptionSpecification_Context.class,0);
		}
		public TerminalNode DECRYPT() { return getToken(OracleStatementParser.DECRYPT, 0); }
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public ModifyColPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColProperties; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitModifyColProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyColPropertiesContext modifyColProperties() throws RecognitionException {
		ModifyColPropertiesContext _localctx = new ModifyColPropertiesContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_modifyColProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2045);
			columnName();
			setState(2047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (NATURAL - 83)) | (1L << (BOOLEAN - 83)) | (1L << (DOUBLE - 83)) | (1L << (CHAR - 83)) | (1L << (INTERVAL - 83)) | (1L << (DATE - 83)) | (1L << (TIMESTAMP - 83)))) != 0) || ((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & ((1L << (INTEGER - 169)) | (1L << (REAL - 169)) | (1L << (DECIMAL - 169)) | (1L << (INT - 169)) | (1L << (SMALLINT - 169)) | (1L << (NUMERIC - 169)) | (1L << (FLOAT - 169)))) != 0) || _la==NATIONAL || ((((_la - 342)) & ~0x3f) == 0 && ((1L << (_la - 342)) & ((1L << (NCHAR - 342)) | (1L << (RAW - 342)) | (1L << (VARCHAR - 342)) | (1L << (VARCHAR2 - 342)) | (1L << (NVARCHAR2 - 342)) | (1L << (LONG - 342)) | (1L << (BLOB - 342)) | (1L << (CLOB - 342)) | (1L << (NCLOB - 342)) | (1L << (BINARY_FLOAT - 342)) | (1L << (BINARY_DOUBLE - 342)) | (1L << (PLS_INTEGER - 342)) | (1L << (BINARY_INTEGER - 342)) | (1L << (NUMBER - 342)) | (1L << (NATURALN - 342)) | (1L << (POSITIVE - 342)) | (1L << (POSITIVEN - 342)) | (1L << (SIGNTYPE - 342)) | (1L << (SIMPLE_INTEGER - 342)) | (1L << (BFILE - 342)) | (1L << (MLSLABEL - 342)) | (1L << (UROWID - 342)) | (1L << (JSON - 342)) | (1L << (DEC - 342)) | (1L << (IDENTIFIER_ - 342)))) != 0)) {
				{
				setState(2046);
				dataType();
				}
			}

			setState(2051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(2049);
				match(DEFAULT);
				setState(2050);
				expr(0);
				}
			}

			setState(2056);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENCRYPT:
				{
				setState(2053);
				match(ENCRYPT);
				setState(2054);
				encryptionSpecification_();
				}
				break;
			case DECRYPT:
				{
				setState(2055);
				match(DECRYPT);
				}
				break;
			case EOF:
			case RP_:
			case COMMA_:
			case SEMI_:
			case DROP:
			case ADD:
			case SET:
			case CONSTRAINT:
			case PRIMARY:
			case UNIQUE:
			case KEY:
			case NOT:
			case NULL:
			case CHECK:
			case REFERENCES:
			case MODIFY:
				break;
			default:
				break;
			}
			setState(2061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (KEY - 61)) | (1L << (NOT - 61)) | (1L << (NULL - 61)))) != 0) || _la==CHECK || _la==REFERENCES) {
				{
				{
				setState(2058);
				inlineConstraint();
				}
				}
				setState(2063);
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

	public static class ModifyColSubstitutableContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode SUBSTITUTABLE() { return getToken(OracleStatementParser.SUBSTITUTABLE, 0); }
		public TerminalNode AT() { return getToken(OracleStatementParser.AT, 0); }
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode LEVELS() { return getToken(OracleStatementParser.LEVELS, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode FORCE() { return getToken(OracleStatementParser.FORCE, 0); }
		public ModifyColSubstitutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColSubstitutable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitModifyColSubstitutable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyColSubstitutableContext modifyColSubstitutable() throws RecognitionException {
		ModifyColSubstitutableContext _localctx = new ModifyColSubstitutableContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_modifyColSubstitutable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2064);
			match(COLUMN);
			setState(2065);
			columnName();
			setState(2067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2066);
				match(NOT);
				}
			}

			setState(2069);
			match(SUBSTITUTABLE);
			setState(2070);
			match(AT);
			setState(2071);
			match(ALL);
			setState(2072);
			match(LEVELS);
			setState(2074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORCE) {
				{
				setState(2073);
				match(FORCE);
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

	public static class DropColumnClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode UNUSED() { return getToken(OracleStatementParser.UNUSED, 0); }
		public ColumnOrColumnListContext columnOrColumnList() {
			return getRuleContext(ColumnOrColumnListContext.class,0);
		}
		public List<CascadeOrInvalidateContext> cascadeOrInvalidate() {
			return getRuleContexts(CascadeOrInvalidateContext.class);
		}
		public CascadeOrInvalidateContext cascadeOrInvalidate(int i) {
			return getRuleContext(CascadeOrInvalidateContext.class,i);
		}
		public DropColumnSpecificationContext dropColumnSpecification() {
			return getRuleContext(DropColumnSpecificationContext.class,0);
		}
		public DropColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDropColumnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropColumnClauseContext dropColumnClause() throws RecognitionException {
		DropColumnClauseContext _localctx = new DropColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_dropColumnClause);
		int _la;
		try {
			setState(2086);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(2076);
				match(SET);
				setState(2077);
				match(UNUSED);
				setState(2078);
				columnOrColumnList();
				setState(2082);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASCADE || _la==INVALIDATE) {
					{
					{
					setState(2079);
					cascadeOrInvalidate();
					}
					}
					setState(2084);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(2085);
				dropColumnSpecification();
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

	public static class DropColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public ColumnOrColumnListContext columnOrColumnList() {
			return getRuleContext(ColumnOrColumnListContext.class,0);
		}
		public List<CascadeOrInvalidateContext> cascadeOrInvalidate() {
			return getRuleContexts(CascadeOrInvalidateContext.class);
		}
		public CascadeOrInvalidateContext cascadeOrInvalidate(int i) {
			return getRuleContext(CascadeOrInvalidateContext.class,i);
		}
		public CheckpointNumberContext checkpointNumber() {
			return getRuleContext(CheckpointNumberContext.class,0);
		}
		public DropColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDropColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropColumnSpecificationContext dropColumnSpecification() throws RecognitionException {
		DropColumnSpecificationContext _localctx = new DropColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_dropColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2088);
			match(DROP);
			setState(2089);
			columnOrColumnList();
			setState(2093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASCADE || _la==INVALIDATE) {
				{
				{
				setState(2090);
				cascadeOrInvalidate();
				}
				}
				setState(2095);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHECKPOINT) {
				{
				setState(2096);
				checkpointNumber();
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

	public static class ColumnOrColumnListContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ColumnOrColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOrColumnList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnOrColumnList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnOrColumnListContext columnOrColumnList() throws RecognitionException {
		ColumnOrColumnListContext _localctx = new ColumnOrColumnListContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_columnOrColumnList);
		int _la;
		try {
			setState(2112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLUMN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2099);
				match(COLUMN);
				setState(2100);
				columnName();
				}
				break;
			case LP_:
				enterOuterAlt(_localctx, 2);
				{
				setState(2101);
				match(LP_);
				setState(2102);
				columnName();
				setState(2107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2103);
					match(COMMA_);
					setState(2104);
					columnName();
					}
					}
					setState(2109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2110);
				match(RP_);
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

	public static class CascadeOrInvalidateContext extends ParserRuleContext {
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(OracleStatementParser.CONSTRAINTS, 0); }
		public TerminalNode INVALIDATE() { return getToken(OracleStatementParser.INVALIDATE, 0); }
		public CascadeOrInvalidateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cascadeOrInvalidate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCascadeOrInvalidate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CascadeOrInvalidateContext cascadeOrInvalidate() throws RecognitionException {
		CascadeOrInvalidateContext _localctx = new CascadeOrInvalidateContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_cascadeOrInvalidate);
		try {
			setState(2117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASCADE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2114);
				match(CASCADE);
				setState(2115);
				match(CONSTRAINTS);
				}
				break;
			case INVALIDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2116);
				match(INVALIDATE);
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

	public static class CheckpointNumberContext extends ParserRuleContext {
		public TerminalNode CHECKPOINT() { return getToken(OracleStatementParser.CHECKPOINT, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public CheckpointNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkpointNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCheckpointNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckpointNumberContext checkpointNumber() throws RecognitionException {
		CheckpointNumberContext _localctx = new CheckpointNumberContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_checkpointNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2119);
			match(CHECKPOINT);
			setState(2120);
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

	public static class RenameColumnClauseContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public RenameColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameColumnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRenameColumnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameColumnClauseContext renameColumnClause() throws RecognitionException {
		RenameColumnClauseContext _localctx = new RenameColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_renameColumnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2122);
			match(RENAME);
			setState(2123);
			match(COLUMN);
			setState(2124);
			columnName();
			setState(2125);
			match(TO);
			setState(2126);
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

	public static class ConstraintClausesContext extends ParserRuleContext {
		public AddConstraintSpecificationContext addConstraintSpecification() {
			return getRuleContext(AddConstraintSpecificationContext.class,0);
		}
		public ModifyConstraintClauseContext modifyConstraintClause() {
			return getRuleContext(ModifyConstraintClauseContext.class,0);
		}
		public RenameConstraintClauseContext renameConstraintClause() {
			return getRuleContext(RenameConstraintClauseContext.class,0);
		}
		public List<DropConstraintClauseContext> dropConstraintClause() {
			return getRuleContexts(DropConstraintClauseContext.class);
		}
		public DropConstraintClauseContext dropConstraintClause(int i) {
			return getRuleContext(DropConstraintClauseContext.class,i);
		}
		public ConstraintClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintClauses; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitConstraintClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintClausesContext constraintClauses() throws RecognitionException {
		ConstraintClausesContext _localctx = new ConstraintClausesContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_constraintClauses);
		int _la;
		try {
			setState(2136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(2128);
				addConstraintSpecification();
				}
				break;
			case MODIFY:
				enterOuterAlt(_localctx, 2);
				{
				setState(2129);
				modifyConstraintClause();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(2130);
				renameConstraintClause();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 4);
				{
				setState(2132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2131);
					dropConstraintClause();
					}
					}
					setState(2134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DROP );
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

	public static class AddConstraintSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(OracleStatementParser.ADD, 0); }
		public OutOfLineRefConstraintContext outOfLineRefConstraint() {
			return getRuleContext(OutOfLineRefConstraintContext.class,0);
		}
		public List<OutOfLineConstraintContext> outOfLineConstraint() {
			return getRuleContexts(OutOfLineConstraintContext.class);
		}
		public OutOfLineConstraintContext outOfLineConstraint(int i) {
			return getRuleContext(OutOfLineConstraintContext.class,i);
		}
		public AddConstraintSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraintSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAddConstraintSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddConstraintSpecificationContext addConstraintSpecification() throws RecognitionException {
		AddConstraintSpecificationContext _localctx = new AddConstraintSpecificationContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_addConstraintSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2138);
			match(ADD);
			setState(2145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(2140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2139);
					outOfLineConstraint();
					}
					}
					setState(2142); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (FOREIGN - 61)) | (1L << (KEY - 61)))) != 0) || _la==CHECK );
				}
				break;
			case 2:
				{
				setState(2144);
				outOfLineRefConstraint();
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

	public static class ModifyConstraintClauseContext extends ParserRuleContext {
		public TerminalNode MODIFY() { return getToken(OracleStatementParser.MODIFY, 0); }
		public ConstraintOptionContext constraintOption() {
			return getRuleContext(ConstraintOptionContext.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public ModifyConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyConstraintClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitModifyConstraintClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyConstraintClauseContext modifyConstraintClause() throws RecognitionException {
		ModifyConstraintClauseContext _localctx = new ModifyConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_modifyConstraintClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2147);
			match(MODIFY);
			setState(2148);
			constraintOption();
			setState(2150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2149);
				constraintState();
				}
				}
				setState(2152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (USING - 91)) | (1L << (NOT - 91)) | (1L << (ENABLE - 91)) | (1L << (DISABLE - 91)))) != 0) || ((((_la - 225)) & ~0x3f) == 0 && ((1L << (_la - 225)) & ((1L << (DEFERRABLE - 225)) | (1L << (EXCEPTIONS - 225)) | (1L << (INITIALLY - 225)) | (1L << (NORELY - 225)) | (1L << (RELY - 225)) | (1L << (VALIDATE - 225)) | (1L << (NOVALIDATE - 225)))) != 0) );
			setState(2155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE) {
				{
				setState(2154);
				match(CASCADE);
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

	public static class ConstraintWithNameContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConstraintWithNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintWithName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitConstraintWithName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintWithNameContext constraintWithName() throws RecognitionException {
		ConstraintWithNameContext _localctx = new ConstraintWithNameContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_constraintWithName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2157);
			match(CONSTRAINT);
			setState(2158);
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

	public static class ConstraintOptionContext extends ParserRuleContext {
		public ConstraintWithNameContext constraintWithName() {
			return getRuleContext(ConstraintWithNameContext.class,0);
		}
		public ConstraintPrimaryOrUniqueContext constraintPrimaryOrUnique() {
			return getRuleContext(ConstraintPrimaryOrUniqueContext.class,0);
		}
		public ConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitConstraintOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintOptionContext constraintOption() throws RecognitionException {
		ConstraintOptionContext _localctx = new ConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_constraintOption);
		try {
			setState(2162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2160);
				constraintWithName();
				}
				break;
			case PRIMARY:
			case UNIQUE:
			case KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(2161);
				constraintPrimaryOrUnique();
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

	public static class ConstraintPrimaryOrUniqueContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public ConstraintPrimaryOrUniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintPrimaryOrUnique; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitConstraintPrimaryOrUnique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintPrimaryOrUniqueContext constraintPrimaryOrUnique() throws RecognitionException {
		ConstraintPrimaryOrUniqueContext _localctx = new ConstraintPrimaryOrUniqueContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_constraintPrimaryOrUnique);
		try {
			setState(2167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(2164);
				primaryKey();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2165);
				match(UNIQUE);
				setState(2166);
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

	public static class RenameConstraintClauseContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public ConstraintWithNameContext constraintWithName() {
			return getRuleContext(ConstraintWithNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public RenameConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameConstraintClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRenameConstraintClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameConstraintClauseContext renameConstraintClause() throws RecognitionException {
		RenameConstraintClauseContext _localctx = new RenameConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_renameConstraintClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2169);
			match(RENAME);
			setState(2170);
			constraintWithName();
			setState(2171);
			match(TO);
			setState(2172);
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

	public static class DropConstraintClauseContext extends ParserRuleContext {
		public List<TerminalNode> DROP() { return getTokens(OracleStatementParser.DROP); }
		public TerminalNode DROP(int i) {
			return getToken(OracleStatementParser.DROP, i);
		}
		public ConstraintPrimaryOrUniqueContext constraintPrimaryOrUnique() {
			return getRuleContext(ConstraintPrimaryOrUniqueContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public TerminalNode KEEP() { return getToken(OracleStatementParser.KEEP, 0); }
		public DropConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDropConstraintClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropConstraintClauseContext dropConstraintClause() throws RecognitionException {
		DropConstraintClauseContext _localctx = new DropConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_dropConstraintClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2174);
			match(DROP);
			setState(2188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case UNIQUE:
			case KEY:
				{
				setState(2175);
				constraintPrimaryOrUnique();
				setState(2177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE) {
					{
					setState(2176);
					match(CASCADE);
					}
				}

				setState(2181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(2179);
					_la = _input.LA(1);
					if ( !(_la==DROP || _la==KEEP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2180);
					match(INDEX);
					}
					break;
				}
				}
				break;
			case CONSTRAINT:
				{
				{
				setState(2183);
				match(CONSTRAINT);
				setState(2184);
				ignoredIdentifier_();
				setState(2186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE) {
					{
					setState(2185);
					match(CASCADE);
					}
				}

				}
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

	public static class AlterExternalTableContext extends ParserRuleContext {
		public List<AddColumnSpecificationContext> addColumnSpecification() {
			return getRuleContexts(AddColumnSpecificationContext.class);
		}
		public AddColumnSpecificationContext addColumnSpecification(int i) {
			return getRuleContext(AddColumnSpecificationContext.class,i);
		}
		public List<ModifyColumnSpecificationContext> modifyColumnSpecification() {
			return getRuleContexts(ModifyColumnSpecificationContext.class);
		}
		public ModifyColumnSpecificationContext modifyColumnSpecification(int i) {
			return getRuleContext(ModifyColumnSpecificationContext.class,i);
		}
		public List<DropColumnSpecificationContext> dropColumnSpecification() {
			return getRuleContexts(DropColumnSpecificationContext.class);
		}
		public DropColumnSpecificationContext dropColumnSpecification(int i) {
			return getRuleContext(DropColumnSpecificationContext.class,i);
		}
		public AlterExternalTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterExternalTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAlterExternalTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterExternalTableContext alterExternalTable() throws RecognitionException {
		AlterExternalTableContext _localctx = new AlterExternalTableContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_alterExternalTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2193); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(2193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(2190);
					addColumnSpecification();
					}
					break;
				case MODIFY:
					{
					setState(2191);
					modifyColumnSpecification();
					}
					break;
				case DROP:
					{
					setState(2192);
					dropColumnSpecification();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DROP || _la==ADD || _la==MODIFY );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectPropertiesContext extends ParserRuleContext {
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ObjectPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperties; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitObjectProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertiesContext objectProperties() throws RecognitionException {
		ObjectPropertiesContext _localctx = new ObjectPropertiesContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_objectProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2197);
			objectProperty();
			setState(2202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2198);
				match(COMMA_);
				setState(2199);
				objectProperty();
				}
				}
				setState(2204);
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

	public static class ObjectPropertyContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public InlineRefConstraintContext inlineRefConstraint() {
			return getRuleContext(InlineRefConstraintContext.class,0);
		}
		public OutOfLineConstraintContext outOfLineConstraint() {
			return getRuleContext(OutOfLineConstraintContext.class,0);
		}
		public OutOfLineRefConstraintContext outOfLineRefConstraint() {
			return getRuleContext(OutOfLineRefConstraintContext.class,0);
		}
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitObjectProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_objectProperty);
		int _la;
		try {
			setState(2226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(2205);
					columnName();
					}
					break;
				case 2:
					{
					setState(2206);
					attributeName();
					}
					break;
				}
				setState(2211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2209);
					match(DEFAULT);
					setState(2210);
					expr(0);
					}
				}

				setState(2222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
				case 1:
					{
					setState(2216);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (KEY - 61)) | (1L << (NOT - 61)) | (1L << (NULL - 61)))) != 0) || _la==CHECK || _la==REFERENCES) {
						{
						{
						setState(2213);
						inlineConstraint();
						}
						}
						setState(2218);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(2220);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CONSTRAINT || _la==WITH || _la==REFERENCES || _la==SCOPE) {
						{
						setState(2219);
						inlineRefConstraint();
						}
					}

					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2224);
				outOfLineConstraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2225);
				outOfLineRefConstraint();
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

	public static class RenameIndexClause_Context extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public RenameIndexClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameIndexClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRenameIndexClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameIndexClause_Context renameIndexClause_() throws RecognitionException {
		RenameIndexClause_Context _localctx = new RenameIndexClause_Context(_ctx, getState());
		enterRule(_localctx, 366, RULE_renameIndexClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RENAME) {
				{
				setState(2228);
				match(RENAME);
				setState(2229);
				match(TO);
				setState(2230);
				indexName();
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

	public static class SetTransactionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(OracleStatementParser.TRANSACTION, 0); }
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSetTransaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_setTransaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2233);
			match(SET);
			setState(2234);
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

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2236);
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
		public TerminalNode ROLLBACK() { return getToken(OracleStatementParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2238);
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
		public TerminalNode SAVEPOINT() { return getToken(OracleStatementParser.SAVEPOINT, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSavepoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_savepoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2240);
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
		public TerminalNode GRANT() { return getToken(OracleStatementParser.GRANT, 0); }
		public ObjectPrivilegeClauseContext objectPrivilegeClause() {
			return getRuleContext(ObjectPrivilegeClauseContext.class,0);
		}
		public SystemPrivilegeClause_Context systemPrivilegeClause_() {
			return getRuleContext(SystemPrivilegeClause_Context.class,0);
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
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitGrant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_grant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2242);
			match(GRANT);
			setState(2246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(2243);
				objectPrivilegeClause();
				}
				break;
			case 2:
				{
				setState(2244);
				systemPrivilegeClause_();
				}
				break;
			case 3:
				{
				setState(2245);
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
		public TerminalNode REVOKE() { return getToken(OracleStatementParser.REVOKE, 0); }
		public ObjectPrivilegeClauseContext objectPrivilegeClause() {
			return getRuleContext(ObjectPrivilegeClauseContext.class,0);
		}
		public SystemPrivilegeClause_Context systemPrivilegeClause_() {
			return getRuleContext(SystemPrivilegeClause_Context.class,0);
		}
		public RoleClause_Context roleClause_() {
			return getRuleContext(RoleClause_Context.class,0);
		}
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRevoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_revoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2248);
			match(REVOKE);
			setState(2252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(2249);
				objectPrivilegeClause();
				}
				break;
			case 2:
				{
				setState(2250);
				systemPrivilegeClause_();
				}
				break;
			case 3:
				{
				setState(2251);
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

	public static class ObjectPrivilegeClauseContext extends ParserRuleContext {
		public ObjectPrivileges_Context objectPrivileges_() {
			return getRuleContext(ObjectPrivileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public OnObjectClauseContext onObjectClause() {
			return getRuleContext(OnObjectClauseContext.class,0);
		}
		public ObjectPrivilegeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPrivilegeClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitObjectPrivilegeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPrivilegeClauseContext objectPrivilegeClause() throws RecognitionException {
		ObjectPrivilegeClauseContext _localctx = new ObjectPrivilegeClauseContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_objectPrivilegeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2254);
			objectPrivileges_();
			setState(2255);
			match(ON);
			setState(2256);
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

	public static class SystemPrivilegeClause_Context extends ParserRuleContext {
		public SystemPrivilege_Context systemPrivilege_() {
			return getRuleContext(SystemPrivilege_Context.class,0);
		}
		public SystemPrivilegeClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemPrivilegeClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSystemPrivilegeClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemPrivilegeClause_Context systemPrivilegeClause_() throws RecognitionException {
		SystemPrivilegeClause_Context _localctx = new SystemPrivilegeClause_Context(_ctx, getState());
		enterRule(_localctx, 382, RULE_systemPrivilegeClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2258);
			systemPrivilege_();
			}
		}
		catch (RecognitionException re) {
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
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRoleClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoleClause_Context roleClause_() throws RecognitionException {
		RoleClause_Context _localctx = new RoleClause_Context(_ctx, getState());
		enterRule(_localctx, 384, RULE_roleClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2260);
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

	public static class ObjectPrivileges_Context extends ParserRuleContext {
		public List<ObjectPrivilegeType_Context> objectPrivilegeType_() {
			return getRuleContexts(ObjectPrivilegeType_Context.class);
		}
		public ObjectPrivilegeType_Context objectPrivilegeType_(int i) {
			return getRuleContext(ObjectPrivilegeType_Context.class,i);
		}
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ObjectPrivileges_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPrivileges_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitObjectPrivileges_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPrivileges_Context objectPrivileges_() throws RecognitionException {
		ObjectPrivileges_Context _localctx = new ObjectPrivileges_Context(_ctx, getState());
		enterRule(_localctx, 386, RULE_objectPrivileges_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2262);
			objectPrivilegeType_();
			setState(2264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LP_) | (1L << TRUNCATE) | (1L << SCHEMA))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (FUNCTION - 68)) | (1L << (PROCEDURE - 68)) | (1L << (CASE - 68)) | (1L << (WHEN - 68)) | (1L << (CAST - 68)) | (1L << (TRIM - 68)) | (1L << (SUBSTRING - 68)) | (1L << (NATURAL - 68)) | (1L << (JOIN - 68)) | (1L << (FULL - 68)) | (1L << (INNER - 68)) | (1L << (OUTER - 68)) | (1L << (LEFT - 68)) | (1L << (RIGHT - 68)) | (1L << (CROSS - 68)) | (1L << (USING - 68)) | (1L << (IF - 68)) | (1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (LIMIT - 68)) | (1L << (OFFSET - 68)) | (1L << (BEGIN - 68)) | (1L << (COMMIT - 68)) | (1L << (ROLLBACK - 68)) | (1L << (SAVEPOINT - 68)) | (1L << (BOOLEAN - 68)) | (1L << (DOUBLE - 68)) | (1L << (CHARACTER - 68)) | (1L << (ARRAY - 68)) | (1L << (INTERVAL - 68)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (TIME - 132)) | (1L << (TIMESTAMP - 132)) | (1L << (LOCALTIME - 132)) | (1L << (LOCALTIMESTAMP - 132)) | (1L << (YEAR - 132)) | (1L << (QUARTER - 132)) | (1L << (MONTH - 132)) | (1L << (WEEK - 132)) | (1L << (DAY - 132)) | (1L << (HOUR - 132)) | (1L << (MINUTE - 132)) | (1L << (SECOND - 132)) | (1L << (MICROSECOND - 132)) | (1L << (MAX - 132)) | (1L << (MIN - 132)) | (1L << (SUM - 132)) | (1L << (COUNT - 132)) | (1L << (AVG - 132)) | (1L << (ENABLE - 132)) | (1L << (DISABLE - 132)) | (1L << (PRESERVE - 132)) | (1L << (DO - 132)) | (1L << (DEFINER - 132)) | (1L << (CURRENT_USER - 132)) | (1L << (SQL - 132)) | (1L << (CASCADED - 132)) | (1L << (LOCAL - 132)) | (1L << (CLOSE - 132)) | (1L << (OPEN - 132)) | (1L << (NEXT - 132)) | (1L << (NAME - 132)) | (1L << (COLLATION - 132)) | (1L << (NAMES - 132)) | (1L << (INTEGER - 132)) | (1L << (REAL - 132)) | (1L << (DECIMAL - 132)) | (1L << (TYPE - 132)) | (1L << (BINARY - 132)) | (1L << (ESCAPE - 132)) | (1L << (MOD - 132)) | (1L << (XOR - 132)) | (1L << (UNKNOWN - 132)) | (1L << (ALWAYS - 132)) | (1L << (CASCADE - 132)) | (1L << (GENERATED - 132)) | (1L << (PRIVILEGES - 132)) | (1L << (READ - 132)) | (1L << (WRITE - 132)) | (1L << (REFERENCES - 132)) | (1L << (TRANSACTION - 132)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (ROLE - 196)) | (1L << (VISIBLE - 196)) | (1L << (INVISIBLE - 196)) | (1L << (EXECUTE - 196)) | (1L << (USE - 196)) | (1L << (DEBUG - 196)) | (1L << (UNDER - 196)) | (1L << (FLASHBACK - 196)) | (1L << (ARCHIVE - 196)) | (1L << (REFRESH - 196)) | (1L << (QUERY - 196)) | (1L << (REWRITE - 196)) | (1L << (KEEP - 196)) | (1L << (SEQUENCE - 196)) | (1L << (INHERIT - 196)) | (1L << (TRANSLATE - 196)) | (1L << (MERGE - 196)) | (1L << (AT - 196)) | (1L << (BITMAP - 196)) | (1L << (CACHE - 196)) | (1L << (NOCACHE - 196)) | (1L << (CHECKPOINT - 196)) | (1L << (CONNECT - 196)) | (1L << (CONSTRAINTS - 196)) | (1L << (CYCLE - 196)) | (1L << (NOCYCLE - 196)) | (1L << (DBTIMEZONE - 196)) | (1L << (ENCRYPT - 196)) | (1L << (DECRYPT - 196)) | (1L << (DEFERRABLE - 196)) | (1L << (DEFERRED - 196)) | (1L << (EDITION - 196)) | (1L << (ELEMENT - 196)) | (1L << (END - 196)) | (1L << (EXCEPTIONS - 196)) | (1L << (FORCE - 196)) | (1L << (GLOBAL - 196)) | (1L << (IDENTITY - 196)) | (1L << (INITIALLY - 196)) | (1L << (INVALIDATE - 196)) | (1L << (JAVA - 196)) | (1L << (LEVELS - 196)) | (1L << (MAXVALUE - 196)) | (1L << (MINVALUE - 196)) | (1L << (NOMAXVALUE - 196)) | (1L << (NOMINVALUE - 196)) | (1L << (MINING - 196)) | (1L << (MODEL - 196)) | (1L << (NATIONAL - 196)) | (1L << (NEW - 196)) | (1L << (NOORDER - 196)) | (1L << (NORELY - 196)) | (1L << (ONLY - 196)) | (1L << (PROFILE - 196)) | (1L << (REF - 196)) | (1L << (REKEY - 196)) | (1L << (RELY - 196)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPLACE - 261)) | (1L << (SALT - 261)) | (1L << (SCOPE - 261)) | (1L << (SORT - 261)) | (1L << (SOURCE - 261)) | (1L << (SUBSTITUTABLE - 261)) | (1L << (TABLESPACE - 261)) | (1L << (TEMPORARY - 261)) | (1L << (TRANSLATION - 261)) | (1L << (TREAT - 261)) | (1L << (NO - 261)) | (1L << (UNUSED - 261)) | (1L << (NOVALIDATE - 261)) | (1L << (VALUE - 261)) | (1L << (VARYING - 261)) | (1L << (VIRTUAL - 261)) | (1L << (ZONE - 261)) | (1L << (ADVISOR - 261)) | (1L << (ADMINISTER - 261)) | (1L << (TUNING - 261)) | (1L << (MANAGE - 261)) | (1L << (MANAGEMENT - 261)) | (1L << (OBJECT - 261)) | (1L << (CLUSTER - 261)) | (1L << (CONTEXT - 261)) | (1L << (EXEMPT - 261)) | (1L << (REDACTION - 261)) | (1L << (POLICY - 261)) | (1L << (DATABASE - 261)) | (1L << (SYSTEM - 261)) | (1L << (AUDIT - 261)) | (1L << (LINK - 261)) | (1L << (ANALYZE - 261)) | (1L << (DICTIONARY - 261)) | (1L << (DIMENSION - 261)) | (1L << (INDEXTYPE - 261)) | (1L << (EXTERNAL - 261)) | (1L << (JOB - 261)) | (1L << (CLASS - 261)) | (1L << (PROGRAM - 261)) | (1L << (SCHEDULER - 261)) | (1L << (LIBRARY - 261)) | (1L << (LOGMINING - 261)) | (1L << (MATERIALIZED - 261)) | (1L << (CUBE - 261)) | (1L << (MEASURE - 261)) | (1L << (FOLDER - 261)) | (1L << (BUILD - 261)) | (1L << (PROCESS - 261)) | (1L << (OPERATOR - 261)) | (1L << (OUTLINE - 261)) | (1L << (PLUGGABLE - 261)) | (1L << (CONTAINER - 261)) | (1L << (SEGMENT - 261)) | (1L << (RESTRICTED - 261)) | (1L << (COST - 261)) | (1L << (SYNONYM - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (BACKUP - 325)) | (1L << (UNLIMITED - 325)) | (1L << (BECOME - 325)) | (1L << (CHANGE - 325)) | (1L << (NOTIFICATION - 325)) | (1L << (ACCESS - 325)) | (1L << (PRIVILEGE - 325)) | (1L << (PURGE - 325)) | (1L << (RESUMABLE - 325)) | (1L << (SYSGUID - 325)) | (1L << (SYSBACKUP - 325)) | (1L << (SYSDBA - 325)) | (1L << (SYSDG - 325)) | (1L << (SYSKM - 325)) | (1L << (SYSOPER - 325)) | (1L << (DBA_RECYCLEBIN - 325)) | (1L << (FIRST - 325)) | (1L << (IDENTIFIER_ - 325)))) != 0)) {
				{
				setState(2263);
				columnNames();
				}
			}

			setState(2273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2266);
				match(COMMA_);
				setState(2267);
				objectPrivilegeType_();
				setState(2269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LP_) | (1L << TRUNCATE) | (1L << SCHEMA))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (FUNCTION - 68)) | (1L << (PROCEDURE - 68)) | (1L << (CASE - 68)) | (1L << (WHEN - 68)) | (1L << (CAST - 68)) | (1L << (TRIM - 68)) | (1L << (SUBSTRING - 68)) | (1L << (NATURAL - 68)) | (1L << (JOIN - 68)) | (1L << (FULL - 68)) | (1L << (INNER - 68)) | (1L << (OUTER - 68)) | (1L << (LEFT - 68)) | (1L << (RIGHT - 68)) | (1L << (CROSS - 68)) | (1L << (USING - 68)) | (1L << (IF - 68)) | (1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (LIMIT - 68)) | (1L << (OFFSET - 68)) | (1L << (BEGIN - 68)) | (1L << (COMMIT - 68)) | (1L << (ROLLBACK - 68)) | (1L << (SAVEPOINT - 68)) | (1L << (BOOLEAN - 68)) | (1L << (DOUBLE - 68)) | (1L << (CHARACTER - 68)) | (1L << (ARRAY - 68)) | (1L << (INTERVAL - 68)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (TIME - 132)) | (1L << (TIMESTAMP - 132)) | (1L << (LOCALTIME - 132)) | (1L << (LOCALTIMESTAMP - 132)) | (1L << (YEAR - 132)) | (1L << (QUARTER - 132)) | (1L << (MONTH - 132)) | (1L << (WEEK - 132)) | (1L << (DAY - 132)) | (1L << (HOUR - 132)) | (1L << (MINUTE - 132)) | (1L << (SECOND - 132)) | (1L << (MICROSECOND - 132)) | (1L << (MAX - 132)) | (1L << (MIN - 132)) | (1L << (SUM - 132)) | (1L << (COUNT - 132)) | (1L << (AVG - 132)) | (1L << (ENABLE - 132)) | (1L << (DISABLE - 132)) | (1L << (PRESERVE - 132)) | (1L << (DO - 132)) | (1L << (DEFINER - 132)) | (1L << (CURRENT_USER - 132)) | (1L << (SQL - 132)) | (1L << (CASCADED - 132)) | (1L << (LOCAL - 132)) | (1L << (CLOSE - 132)) | (1L << (OPEN - 132)) | (1L << (NEXT - 132)) | (1L << (NAME - 132)) | (1L << (COLLATION - 132)) | (1L << (NAMES - 132)) | (1L << (INTEGER - 132)) | (1L << (REAL - 132)) | (1L << (DECIMAL - 132)) | (1L << (TYPE - 132)) | (1L << (BINARY - 132)) | (1L << (ESCAPE - 132)) | (1L << (MOD - 132)) | (1L << (XOR - 132)) | (1L << (UNKNOWN - 132)) | (1L << (ALWAYS - 132)) | (1L << (CASCADE - 132)) | (1L << (GENERATED - 132)) | (1L << (PRIVILEGES - 132)) | (1L << (READ - 132)) | (1L << (WRITE - 132)) | (1L << (REFERENCES - 132)) | (1L << (TRANSACTION - 132)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (ROLE - 196)) | (1L << (VISIBLE - 196)) | (1L << (INVISIBLE - 196)) | (1L << (EXECUTE - 196)) | (1L << (USE - 196)) | (1L << (DEBUG - 196)) | (1L << (UNDER - 196)) | (1L << (FLASHBACK - 196)) | (1L << (ARCHIVE - 196)) | (1L << (REFRESH - 196)) | (1L << (QUERY - 196)) | (1L << (REWRITE - 196)) | (1L << (KEEP - 196)) | (1L << (SEQUENCE - 196)) | (1L << (INHERIT - 196)) | (1L << (TRANSLATE - 196)) | (1L << (MERGE - 196)) | (1L << (AT - 196)) | (1L << (BITMAP - 196)) | (1L << (CACHE - 196)) | (1L << (NOCACHE - 196)) | (1L << (CHECKPOINT - 196)) | (1L << (CONNECT - 196)) | (1L << (CONSTRAINTS - 196)) | (1L << (CYCLE - 196)) | (1L << (NOCYCLE - 196)) | (1L << (DBTIMEZONE - 196)) | (1L << (ENCRYPT - 196)) | (1L << (DECRYPT - 196)) | (1L << (DEFERRABLE - 196)) | (1L << (DEFERRED - 196)) | (1L << (EDITION - 196)) | (1L << (ELEMENT - 196)) | (1L << (END - 196)) | (1L << (EXCEPTIONS - 196)) | (1L << (FORCE - 196)) | (1L << (GLOBAL - 196)) | (1L << (IDENTITY - 196)) | (1L << (INITIALLY - 196)) | (1L << (INVALIDATE - 196)) | (1L << (JAVA - 196)) | (1L << (LEVELS - 196)) | (1L << (MAXVALUE - 196)) | (1L << (MINVALUE - 196)) | (1L << (NOMAXVALUE - 196)) | (1L << (NOMINVALUE - 196)) | (1L << (MINING - 196)) | (1L << (MODEL - 196)) | (1L << (NATIONAL - 196)) | (1L << (NEW - 196)) | (1L << (NOORDER - 196)) | (1L << (NORELY - 196)) | (1L << (ONLY - 196)) | (1L << (PROFILE - 196)) | (1L << (REF - 196)) | (1L << (REKEY - 196)) | (1L << (RELY - 196)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPLACE - 261)) | (1L << (SALT - 261)) | (1L << (SCOPE - 261)) | (1L << (SORT - 261)) | (1L << (SOURCE - 261)) | (1L << (SUBSTITUTABLE - 261)) | (1L << (TABLESPACE - 261)) | (1L << (TEMPORARY - 261)) | (1L << (TRANSLATION - 261)) | (1L << (TREAT - 261)) | (1L << (NO - 261)) | (1L << (UNUSED - 261)) | (1L << (NOVALIDATE - 261)) | (1L << (VALUE - 261)) | (1L << (VARYING - 261)) | (1L << (VIRTUAL - 261)) | (1L << (ZONE - 261)) | (1L << (ADVISOR - 261)) | (1L << (ADMINISTER - 261)) | (1L << (TUNING - 261)) | (1L << (MANAGE - 261)) | (1L << (MANAGEMENT - 261)) | (1L << (OBJECT - 261)) | (1L << (CLUSTER - 261)) | (1L << (CONTEXT - 261)) | (1L << (EXEMPT - 261)) | (1L << (REDACTION - 261)) | (1L << (POLICY - 261)) | (1L << (DATABASE - 261)) | (1L << (SYSTEM - 261)) | (1L << (AUDIT - 261)) | (1L << (LINK - 261)) | (1L << (ANALYZE - 261)) | (1L << (DICTIONARY - 261)) | (1L << (DIMENSION - 261)) | (1L << (INDEXTYPE - 261)) | (1L << (EXTERNAL - 261)) | (1L << (JOB - 261)) | (1L << (CLASS - 261)) | (1L << (PROGRAM - 261)) | (1L << (SCHEDULER - 261)) | (1L << (LIBRARY - 261)) | (1L << (LOGMINING - 261)) | (1L << (MATERIALIZED - 261)) | (1L << (CUBE - 261)) | (1L << (MEASURE - 261)) | (1L << (FOLDER - 261)) | (1L << (BUILD - 261)) | (1L << (PROCESS - 261)) | (1L << (OPERATOR - 261)) | (1L << (OUTLINE - 261)) | (1L << (PLUGGABLE - 261)) | (1L << (CONTAINER - 261)) | (1L << (SEGMENT - 261)) | (1L << (RESTRICTED - 261)) | (1L << (COST - 261)) | (1L << (SYNONYM - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (BACKUP - 325)) | (1L << (UNLIMITED - 325)) | (1L << (BECOME - 325)) | (1L << (CHANGE - 325)) | (1L << (NOTIFICATION - 325)) | (1L << (ACCESS - 325)) | (1L << (PRIVILEGE - 325)) | (1L << (PURGE - 325)) | (1L << (RESUMABLE - 325)) | (1L << (SYSGUID - 325)) | (1L << (SYSBACKUP - 325)) | (1L << (SYSDBA - 325)) | (1L << (SYSDG - 325)) | (1L << (SYSKM - 325)) | (1L << (SYSOPER - 325)) | (1L << (DBA_RECYCLEBIN - 325)) | (1L << (FIRST - 325)) | (1L << (IDENTIFIER_ - 325)))) != 0)) {
					{
					setState(2268);
					columnNames();
					}
				}

				}
				}
				setState(2275);
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

	public static class ObjectPrivilegeType_Context extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(OracleStatementParser.PRIVILEGES, 0); }
		public TerminalNode SELECT() { return getToken(OracleStatementParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(OracleStatementParser.INSERT, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(OracleStatementParser.UPDATE, 0); }
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode READ() { return getToken(OracleStatementParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(OracleStatementParser.WRITE, 0); }
		public TerminalNode EXECUTE() { return getToken(OracleStatementParser.EXECUTE, 0); }
		public TerminalNode USE() { return getToken(OracleStatementParser.USE, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public TerminalNode REFERENCES() { return getToken(OracleStatementParser.REFERENCES, 0); }
		public TerminalNode DEBUG() { return getToken(OracleStatementParser.DEBUG, 0); }
		public TerminalNode UNDER() { return getToken(OracleStatementParser.UNDER, 0); }
		public TerminalNode FLASHBACK() { return getToken(OracleStatementParser.FLASHBACK, 0); }
		public TerminalNode ARCHIVE() { return getToken(OracleStatementParser.ARCHIVE, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public TerminalNode REFRESH() { return getToken(OracleStatementParser.REFRESH, 0); }
		public TerminalNode QUERY() { return getToken(OracleStatementParser.QUERY, 0); }
		public TerminalNode REWRITE() { return getToken(OracleStatementParser.REWRITE, 0); }
		public TerminalNode KEEP() { return getToken(OracleStatementParser.KEEP, 0); }
		public TerminalNode SEQUENCE() { return getToken(OracleStatementParser.SEQUENCE, 0); }
		public TerminalNode INHERIT() { return getToken(OracleStatementParser.INHERIT, 0); }
		public TerminalNode TRANSLATE() { return getToken(OracleStatementParser.TRANSLATE, 0); }
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode MERGE() { return getToken(OracleStatementParser.MERGE, 0); }
		public TerminalNode VIEW() { return getToken(OracleStatementParser.VIEW, 0); }
		public ObjectPrivilegeType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPrivilegeType_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitObjectPrivilegeType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPrivilegeType_Context objectPrivilegeType_() throws RecognitionException {
		ObjectPrivilegeType_Context _localctx = new ObjectPrivilegeType_Context(_ctx, getState());
		enterRule(_localctx, 388, RULE_objectPrivilegeType_);
		try {
			setState(2308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2276);
				match(ALL);
				setState(2278);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
				case 1:
					{
					setState(2277);
					match(PRIVILEGES);
					}
					break;
				}
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2280);
				match(SELECT);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2281);
				match(INSERT);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2282);
				match(DELETE);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2283);
				match(UPDATE);
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(2284);
				match(ALTER);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 7);
				{
				setState(2285);
				match(READ);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2286);
				match(WRITE);
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2287);
				match(EXECUTE);
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 10);
				{
				setState(2288);
				match(USE);
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 11);
				{
				setState(2289);
				match(INDEX);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 12);
				{
				setState(2290);
				match(REFERENCES);
				}
				break;
			case DEBUG:
				enterOuterAlt(_localctx, 13);
				{
				setState(2291);
				match(DEBUG);
				}
				break;
			case UNDER:
				enterOuterAlt(_localctx, 14);
				{
				setState(2292);
				match(UNDER);
				}
				break;
			case FLASHBACK:
				enterOuterAlt(_localctx, 15);
				{
				setState(2293);
				match(FLASHBACK);
				setState(2294);
				match(ARCHIVE);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 16);
				{
				setState(2295);
				match(ON);
				setState(2296);
				match(COMMIT);
				setState(2297);
				match(REFRESH);
				}
				break;
			case QUERY:
				enterOuterAlt(_localctx, 17);
				{
				setState(2298);
				match(QUERY);
				setState(2299);
				match(REWRITE);
				}
				break;
			case KEEP:
				enterOuterAlt(_localctx, 18);
				{
				setState(2300);
				match(KEEP);
				setState(2301);
				match(SEQUENCE);
				}
				break;
			case INHERIT:
				enterOuterAlt(_localctx, 19);
				{
				setState(2302);
				match(INHERIT);
				setState(2303);
				match(PRIVILEGES);
				}
				break;
			case TRANSLATE:
				enterOuterAlt(_localctx, 20);
				{
				setState(2304);
				match(TRANSLATE);
				setState(2305);
				match(SQL);
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 21);
				{
				setState(2306);
				match(MERGE);
				setState(2307);
				match(VIEW);
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
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public TerminalNode DIRECTORY() { return getToken(OracleStatementParser.DIRECTORY, 0); }
		public TerminalNode EDITION() { return getToken(OracleStatementParser.EDITION, 0); }
		public TerminalNode MINING() { return getToken(OracleStatementParser.MINING, 0); }
		public TerminalNode MODEL() { return getToken(OracleStatementParser.MODEL, 0); }
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode TRANSLATION() { return getToken(OracleStatementParser.TRANSLATION, 0); }
		public TerminalNode PROFILE() { return getToken(OracleStatementParser.PROFILE, 0); }
		public TerminalNode JAVA() { return getToken(OracleStatementParser.JAVA, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SOURCE() { return getToken(OracleStatementParser.SOURCE, 0); }
		public TerminalNode RESOURCE() { return getToken(OracleStatementParser.RESOURCE, 0); }
		public OnObjectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onObjectClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOnObjectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnObjectClauseContext onObjectClause() throws RecognitionException {
		OnObjectClauseContext _localctx = new OnObjectClauseContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_onObjectClause);
		int _la;
		try {
			setState(2322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2310);
				match(USER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2311);
				match(DIRECTORY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2312);
				match(EDITION);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2313);
				match(MINING);
				setState(2314);
				match(MODEL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2315);
				match(SQL);
				setState(2316);
				match(TRANSLATION);
				setState(2317);
				match(PROFILE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2318);
				match(JAVA);
				setState(2319);
				_la = _input.LA(1);
				if ( !(_la==RESOURCE || _la==SOURCE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2320);
				tableName();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2321);
				tableName();
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

	public static class SystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(OracleStatementParser.PRIVILEGES, 0); }
		public AdvisorFrameworkSystemPrivilege_Context advisorFrameworkSystemPrivilege_() {
			return getRuleContext(AdvisorFrameworkSystemPrivilege_Context.class,0);
		}
		public ClustersSystemPrivilege_Context clustersSystemPrivilege_() {
			return getRuleContext(ClustersSystemPrivilege_Context.class,0);
		}
		public ContextsSystemPrivilege_Context contextsSystemPrivilege_() {
			return getRuleContext(ContextsSystemPrivilege_Context.class,0);
		}
		public DataRedactionSystemPrivilege_Context dataRedactionSystemPrivilege_() {
			return getRuleContext(DataRedactionSystemPrivilege_Context.class,0);
		}
		public DatabaseSystemPrivilege_Context databaseSystemPrivilege_() {
			return getRuleContext(DatabaseSystemPrivilege_Context.class,0);
		}
		public DatabaseLinksSystemPrivilege_Context databaseLinksSystemPrivilege_() {
			return getRuleContext(DatabaseLinksSystemPrivilege_Context.class,0);
		}
		public DebuggingSystemPrivilege_Context debuggingSystemPrivilege_() {
			return getRuleContext(DebuggingSystemPrivilege_Context.class,0);
		}
		public DictionariesSystemPrivilege_Context dictionariesSystemPrivilege_() {
			return getRuleContext(DictionariesSystemPrivilege_Context.class,0);
		}
		public DimensionsSystemPrivilege_Context dimensionsSystemPrivilege_() {
			return getRuleContext(DimensionsSystemPrivilege_Context.class,0);
		}
		public DirectoriesSystemPrivilege_Context directoriesSystemPrivilege_() {
			return getRuleContext(DirectoriesSystemPrivilege_Context.class,0);
		}
		public EditionsSystemPrivilege_Context editionsSystemPrivilege_() {
			return getRuleContext(EditionsSystemPrivilege_Context.class,0);
		}
		public FlashbackDataArchivesPrivilege_Context flashbackDataArchivesPrivilege_() {
			return getRuleContext(FlashbackDataArchivesPrivilege_Context.class,0);
		}
		public IndexesSystemPrivilege_Context indexesSystemPrivilege_() {
			return getRuleContext(IndexesSystemPrivilege_Context.class,0);
		}
		public IndexTypesSystemPrivilege_Context indexTypesSystemPrivilege_() {
			return getRuleContext(IndexTypesSystemPrivilege_Context.class,0);
		}
		public JobSchedulerObjectsSystemPrivilege_Context jobSchedulerObjectsSystemPrivilege_() {
			return getRuleContext(JobSchedulerObjectsSystemPrivilege_Context.class,0);
		}
		public KeyManagementFrameworkSystemPrivilege_Context keyManagementFrameworkSystemPrivilege_() {
			return getRuleContext(KeyManagementFrameworkSystemPrivilege_Context.class,0);
		}
		public LibrariesFrameworkSystemPrivilege_Context librariesFrameworkSystemPrivilege_() {
			return getRuleContext(LibrariesFrameworkSystemPrivilege_Context.class,0);
		}
		public LogminerFrameworkSystemPrivilege_Context logminerFrameworkSystemPrivilege_() {
			return getRuleContext(LogminerFrameworkSystemPrivilege_Context.class,0);
		}
		public MaterizlizedViewsSystemPrivilege_Context materizlizedViewsSystemPrivilege_() {
			return getRuleContext(MaterizlizedViewsSystemPrivilege_Context.class,0);
		}
		public MiningModelsSystemPrivilege_Context miningModelsSystemPrivilege_() {
			return getRuleContext(MiningModelsSystemPrivilege_Context.class,0);
		}
		public OlapCubesSystemPrivilege_Context olapCubesSystemPrivilege_() {
			return getRuleContext(OlapCubesSystemPrivilege_Context.class,0);
		}
		public OlapCubeMeasureFoldersSystemPrivilege_Context olapCubeMeasureFoldersSystemPrivilege_() {
			return getRuleContext(OlapCubeMeasureFoldersSystemPrivilege_Context.class,0);
		}
		public OlapCubeDiminsionsSystemPrivilege_Context olapCubeDiminsionsSystemPrivilege_() {
			return getRuleContext(OlapCubeDiminsionsSystemPrivilege_Context.class,0);
		}
		public OlapCubeBuildProcessesSystemPrivilege_Context olapCubeBuildProcessesSystemPrivilege_() {
			return getRuleContext(OlapCubeBuildProcessesSystemPrivilege_Context.class,0);
		}
		public OperatorsSystemPrivilege_Context operatorsSystemPrivilege_() {
			return getRuleContext(OperatorsSystemPrivilege_Context.class,0);
		}
		public OutlinesSystemPrivilege_Context outlinesSystemPrivilege_() {
			return getRuleContext(OutlinesSystemPrivilege_Context.class,0);
		}
		public PlanManagementSystemPrivilege_Context planManagementSystemPrivilege_() {
			return getRuleContext(PlanManagementSystemPrivilege_Context.class,0);
		}
		public PluggableDatabasesSystemPrivilege_Context pluggableDatabasesSystemPrivilege_() {
			return getRuleContext(PluggableDatabasesSystemPrivilege_Context.class,0);
		}
		public ProceduresSystemPrivilege_Context proceduresSystemPrivilege_() {
			return getRuleContext(ProceduresSystemPrivilege_Context.class,0);
		}
		public ProfilesSystemPrivilege_Context profilesSystemPrivilege_() {
			return getRuleContext(ProfilesSystemPrivilege_Context.class,0);
		}
		public RolesSystemPrivilege_Context rolesSystemPrivilege_() {
			return getRuleContext(RolesSystemPrivilege_Context.class,0);
		}
		public RollbackSegmentsSystemPrivilege_Context rollbackSegmentsSystemPrivilege_() {
			return getRuleContext(RollbackSegmentsSystemPrivilege_Context.class,0);
		}
		public SequencesSystemPrivilege_Context sequencesSystemPrivilege_() {
			return getRuleContext(SequencesSystemPrivilege_Context.class,0);
		}
		public SessionsSystemPrivilege_Context sessionsSystemPrivilege_() {
			return getRuleContext(SessionsSystemPrivilege_Context.class,0);
		}
		public SqlTranslationProfilesSystemPrivilege_Context sqlTranslationProfilesSystemPrivilege_() {
			return getRuleContext(SqlTranslationProfilesSystemPrivilege_Context.class,0);
		}
		public SynonymsSystemPrivilege_Context synonymsSystemPrivilege_() {
			return getRuleContext(SynonymsSystemPrivilege_Context.class,0);
		}
		public TablesSystemPrivilege_Context tablesSystemPrivilege_() {
			return getRuleContext(TablesSystemPrivilege_Context.class,0);
		}
		public TablespacesSystemPrivilege_Context tablespacesSystemPrivilege_() {
			return getRuleContext(TablespacesSystemPrivilege_Context.class,0);
		}
		public TriggersSystemPrivilege_Context triggersSystemPrivilege_() {
			return getRuleContext(TriggersSystemPrivilege_Context.class,0);
		}
		public TypesSystemPrivilege_Context typesSystemPrivilege_() {
			return getRuleContext(TypesSystemPrivilege_Context.class,0);
		}
		public UsersSystemPrivilege_Context usersSystemPrivilege_() {
			return getRuleContext(UsersSystemPrivilege_Context.class,0);
		}
		public ViewsSystemPrivilege_Context viewsSystemPrivilege_() {
			return getRuleContext(ViewsSystemPrivilege_Context.class,0);
		}
		public MiscellaneousSystemPrivilege_Context miscellaneousSystemPrivilege_() {
			return getRuleContext(MiscellaneousSystemPrivilege_Context.class,0);
		}
		public SystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemPrivilege_Context systemPrivilege_() throws RecognitionException {
		SystemPrivilege_Context _localctx = new SystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 392, RULE_systemPrivilege_);
		try {
			setState(2369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2324);
				match(ALL);
				setState(2325);
				match(PRIVILEGES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2326);
				advisorFrameworkSystemPrivilege_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2327);
				clustersSystemPrivilege_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2328);
				contextsSystemPrivilege_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2329);
				dataRedactionSystemPrivilege_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2330);
				databaseSystemPrivilege_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2331);
				databaseLinksSystemPrivilege_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2332);
				debuggingSystemPrivilege_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2333);
				dictionariesSystemPrivilege_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2334);
				dimensionsSystemPrivilege_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2335);
				directoriesSystemPrivilege_();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2336);
				editionsSystemPrivilege_();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2337);
				flashbackDataArchivesPrivilege_();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2338);
				indexesSystemPrivilege_();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2339);
				indexTypesSystemPrivilege_();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2340);
				jobSchedulerObjectsSystemPrivilege_();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2341);
				keyManagementFrameworkSystemPrivilege_();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2342);
				librariesFrameworkSystemPrivilege_();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2343);
				logminerFrameworkSystemPrivilege_();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2344);
				materizlizedViewsSystemPrivilege_();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2345);
				miningModelsSystemPrivilege_();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2346);
				olapCubesSystemPrivilege_();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2347);
				olapCubeMeasureFoldersSystemPrivilege_();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2348);
				olapCubeDiminsionsSystemPrivilege_();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2349);
				olapCubeBuildProcessesSystemPrivilege_();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2350);
				operatorsSystemPrivilege_();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2351);
				outlinesSystemPrivilege_();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2352);
				planManagementSystemPrivilege_();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2353);
				pluggableDatabasesSystemPrivilege_();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2354);
				proceduresSystemPrivilege_();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2355);
				profilesSystemPrivilege_();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2356);
				rolesSystemPrivilege_();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2357);
				rollbackSegmentsSystemPrivilege_();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2358);
				sequencesSystemPrivilege_();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2359);
				sessionsSystemPrivilege_();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2360);
				sqlTranslationProfilesSystemPrivilege_();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2361);
				synonymsSystemPrivilege_();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2362);
				tablesSystemPrivilege_();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2363);
				tablespacesSystemPrivilege_();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2364);
				triggersSystemPrivilege_();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2365);
				typesSystemPrivilege_();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2366);
				usersSystemPrivilege_();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(2367);
				viewsSystemPrivilege_();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(2368);
				miscellaneousSystemPrivilege_();
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

	public static class SystemPrivilegeOperation_Context extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode SELECT() { return getToken(OracleStatementParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(OracleStatementParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(OracleStatementParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode EXECUTE() { return getToken(OracleStatementParser.EXECUTE, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public SystemPrivilegeOperation_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemPrivilegeOperation_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSystemPrivilegeOperation_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemPrivilegeOperation_Context systemPrivilegeOperation_() throws RecognitionException {
		SystemPrivilegeOperation_Context _localctx = new SystemPrivilegeOperation_Context(_ctx, getState());
		enterRule(_localctx, 394, RULE_systemPrivilegeOperation_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2371);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << CREATE) | (1L << ALTER) | (1L << DROP))) != 0) || _la==EXECUTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANY) {
				{
				setState(2372);
				match(ANY);
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

	public static class AdvisorFrameworkSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode PROFILE() { return getToken(OracleStatementParser.PROFILE, 0); }
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode ADVISOR() { return getToken(OracleStatementParser.ADVISOR, 0); }
		public TerminalNode ADMINISTER() { return getToken(OracleStatementParser.ADMINISTER, 0); }
		public TerminalNode TUNING() { return getToken(OracleStatementParser.TUNING, 0); }
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode MANAGEMENT() { return getToken(OracleStatementParser.MANAGEMENT, 0); }
		public TerminalNode OBJECT() { return getToken(OracleStatementParser.OBJECT, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public AdvisorFrameworkSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_advisorFrameworkSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAdvisorFrameworkSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdvisorFrameworkSystemPrivilege_Context advisorFrameworkSystemPrivilege_() throws RecognitionException {
		AdvisorFrameworkSystemPrivilege_Context _localctx = new AdvisorFrameworkSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 396, RULE_advisorFrameworkSystemPrivilege_);
		int _la;
		try {
			setState(2392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case SQL:
			case EXECUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << CREATE) | (1L << ALTER) | (1L << DROP))) != 0) || _la==EXECUTE) {
					{
					setState(2375);
					systemPrivilegeOperation_();
					}
				}

				setState(2378);
				match(SQL);
				setState(2379);
				match(PROFILE);
				}
				break;
			case ADVISOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2380);
				match(ADVISOR);
				}
				break;
			case ADMINISTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2381);
				match(ADMINISTER);
				setState(2383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ANY) {
					{
					setState(2382);
					match(ANY);
					}
				}

				setState(2385);
				match(SQL);
				setState(2390);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TUNING:
					{
					setState(2386);
					match(TUNING);
					setState(2387);
					match(SET);
					}
					break;
				case MANAGEMENT:
					{
					setState(2388);
					match(MANAGEMENT);
					setState(2389);
					match(OBJECT);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class ClustersSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode CLUSTER() { return getToken(OracleStatementParser.CLUSTER, 0); }
		public ClustersSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clustersSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitClustersSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClustersSystemPrivilege_Context clustersSystemPrivilege_() throws RecognitionException {
		ClustersSystemPrivilege_Context _localctx = new ClustersSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 398, RULE_clustersSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2394);
			systemPrivilegeOperation_();
			setState(2395);
			match(CLUSTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContextsSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode CONTEXT() { return getToken(OracleStatementParser.CONTEXT, 0); }
		public ContextsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextsSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitContextsSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContextsSystemPrivilege_Context contextsSystemPrivilege_() throws RecognitionException {
		ContextsSystemPrivilege_Context _localctx = new ContextsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 400, RULE_contextsSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2397);
			systemPrivilegeOperation_();
			setState(2398);
			match(CONTEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataRedactionSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode EXEMPT() { return getToken(OracleStatementParser.EXEMPT, 0); }
		public TerminalNode REDACTION() { return getToken(OracleStatementParser.REDACTION, 0); }
		public TerminalNode POLICY() { return getToken(OracleStatementParser.POLICY, 0); }
		public DataRedactionSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataRedactionSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDataRedactionSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataRedactionSystemPrivilege_Context dataRedactionSystemPrivilege_() throws RecognitionException {
		DataRedactionSystemPrivilege_Context _localctx = new DataRedactionSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 402, RULE_dataRedactionSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2400);
			match(EXEMPT);
			setState(2401);
			match(REDACTION);
			setState(2402);
			match(POLICY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(OracleStatementParser.DATABASE, 0); }
		public TerminalNode SYSTEM() { return getToken(OracleStatementParser.SYSTEM, 0); }
		public TerminalNode AUDIT() { return getToken(OracleStatementParser.AUDIT, 0); }
		public DatabaseSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDatabaseSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseSystemPrivilege_Context databaseSystemPrivilege_() throws RecognitionException {
		DatabaseSystemPrivilege_Context _localctx = new DatabaseSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 404, RULE_databaseSystemPrivilege_);
		int _la;
		try {
			setState(2408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2404);
				match(ALTER);
				setState(2405);
				_la = _input.LA(1);
				if ( !(_la==DATABASE || _la==SYSTEM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case AUDIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2406);
				match(AUDIT);
				setState(2407);
				match(SYSTEM);
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

	public static class DatabaseLinksSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode DATABASE() { return getToken(OracleStatementParser.DATABASE, 0); }
		public TerminalNode LINK() { return getToken(OracleStatementParser.LINK, 0); }
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode PUBLIC() { return getToken(OracleStatementParser.PUBLIC, 0); }
		public DatabaseLinksSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseLinksSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDatabaseLinksSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseLinksSystemPrivilege_Context databaseLinksSystemPrivilege_() throws RecognitionException {
		DatabaseLinksSystemPrivilege_Context _localctx = new DatabaseLinksSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 406, RULE_databaseLinksSystemPrivilege_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2410);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << ALTER) | (1L << DROP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC) {
				{
				setState(2411);
				match(PUBLIC);
				}
			}

			setState(2414);
			match(DATABASE);
			setState(2415);
			match(LINK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DebuggingSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode DEBUG() { return getToken(OracleStatementParser.DEBUG, 0); }
		public TerminalNode CONNECT() { return getToken(OracleStatementParser.CONNECT, 0); }
		public TerminalNode SESSION() { return getToken(OracleStatementParser.SESSION, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode PROCEDURE() { return getToken(OracleStatementParser.PROCEDURE, 0); }
		public DebuggingSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debuggingSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDebuggingSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebuggingSystemPrivilege_Context debuggingSystemPrivilege_() throws RecognitionException {
		DebuggingSystemPrivilege_Context _localctx = new DebuggingSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 408, RULE_debuggingSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2417);
			match(DEBUG);
			setState(2422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONNECT:
				{
				setState(2418);
				match(CONNECT);
				setState(2419);
				match(SESSION);
				}
				break;
			case ANY:
				{
				setState(2420);
				match(ANY);
				setState(2421);
				match(PROCEDURE);
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

	public static class DictionariesSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode ANALYZE() { return getToken(OracleStatementParser.ANALYZE, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode DICTIONARY() { return getToken(OracleStatementParser.DICTIONARY, 0); }
		public DictionariesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionariesSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDictionariesSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionariesSystemPrivilege_Context dictionariesSystemPrivilege_() throws RecognitionException {
		DictionariesSystemPrivilege_Context _localctx = new DictionariesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 410, RULE_dictionariesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2424);
			match(ANALYZE);
			setState(2425);
			match(ANY);
			setState(2426);
			match(DICTIONARY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionsSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode DIMENSION() { return getToken(OracleStatementParser.DIMENSION, 0); }
		public DimensionsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionsSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDimensionsSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionsSystemPrivilege_Context dimensionsSystemPrivilege_() throws RecognitionException {
		DimensionsSystemPrivilege_Context _localctx = new DimensionsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 412, RULE_dimensionsSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2428);
			systemPrivilegeOperation_();
			setState(2429);
			match(DIMENSION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectoriesSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode DIRECTORY() { return getToken(OracleStatementParser.DIRECTORY, 0); }
		public DirectoriesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directoriesSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDirectoriesSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectoriesSystemPrivilege_Context directoriesSystemPrivilege_() throws RecognitionException {
		DirectoriesSystemPrivilege_Context _localctx = new DirectoriesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 414, RULE_directoriesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2431);
			systemPrivilegeOperation_();
			setState(2432);
			match(DIRECTORY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EditionsSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode EDITION() { return getToken(OracleStatementParser.EDITION, 0); }
		public EditionsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_editionsSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitEditionsSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EditionsSystemPrivilege_Context editionsSystemPrivilege_() throws RecognitionException {
		EditionsSystemPrivilege_Context _localctx = new EditionsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 416, RULE_editionsSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2434);
			systemPrivilegeOperation_();
			setState(2435);
			match(EDITION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlashbackDataArchivesPrivilege_Context extends ParserRuleContext {
		public TerminalNode FLASHBACK() { return getToken(OracleStatementParser.FLASHBACK, 0); }
		public TerminalNode ARCHIVE() { return getToken(OracleStatementParser.ARCHIVE, 0); }
		public TerminalNode ADMINISTER() { return getToken(OracleStatementParser.ADMINISTER, 0); }
		public FlashbackDataArchivesPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flashbackDataArchivesPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitFlashbackDataArchivesPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlashbackDataArchivesPrivilege_Context flashbackDataArchivesPrivilege_() throws RecognitionException {
		FlashbackDataArchivesPrivilege_Context _localctx = new FlashbackDataArchivesPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 418, RULE_flashbackDataArchivesPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2437);
			match(FLASHBACK);
			setState(2438);
			match(ARCHIVE);
			setState(2439);
			match(ADMINISTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexesSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexesSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIndexesSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexesSystemPrivilege_Context indexesSystemPrivilege_() throws RecognitionException {
		IndexesSystemPrivilege_Context _localctx = new IndexesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 420, RULE_indexesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2441);
			systemPrivilegeOperation_();
			setState(2442);
			match(INDEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexTypesSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode INDEXTYPE() { return getToken(OracleStatementParser.INDEXTYPE, 0); }
		public IndexTypesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexTypesSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIndexTypesSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexTypesSystemPrivilege_Context indexTypesSystemPrivilege_() throws RecognitionException {
		IndexTypesSystemPrivilege_Context _localctx = new IndexTypesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 422, RULE_indexTypesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2444);
			systemPrivilegeOperation_();
			setState(2445);
			match(INDEXTYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JobSchedulerObjectsSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode JOB() { return getToken(OracleStatementParser.JOB, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode EXTERNAL() { return getToken(OracleStatementParser.EXTERNAL, 0); }
		public TerminalNode EXECUTE() { return getToken(OracleStatementParser.EXECUTE, 0); }
		public TerminalNode CLASS() { return getToken(OracleStatementParser.CLASS, 0); }
		public TerminalNode PROGRAM() { return getToken(OracleStatementParser.PROGRAM, 0); }
		public TerminalNode MANAGE() { return getToken(OracleStatementParser.MANAGE, 0); }
		public TerminalNode SCHEDULER() { return getToken(OracleStatementParser.SCHEDULER, 0); }
		public JobSchedulerObjectsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobSchedulerObjectsSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitJobSchedulerObjectsSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JobSchedulerObjectsSystemPrivilege_Context jobSchedulerObjectsSystemPrivilege_() throws RecognitionException {
		JobSchedulerObjectsSystemPrivilege_Context _localctx = new JobSchedulerObjectsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 424, RULE_jobSchedulerObjectsSystemPrivilege_);
		int _la;
		try {
			setState(2457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2447);
				match(CREATE);
				setState(2449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ANY || _la==EXTERNAL) {
					{
					setState(2448);
					_la = _input.LA(1);
					if ( !(_la==ANY || _la==EXTERNAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2451);
				match(JOB);
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2452);
				match(EXECUTE);
				setState(2453);
				match(ANY);
				setState(2454);
				_la = _input.LA(1);
				if ( !(_la==CLASS || _la==PROGRAM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case MANAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2455);
				match(MANAGE);
				setState(2456);
				match(SCHEDULER);
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

	public static class KeyManagementFrameworkSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode ADMINISTER() { return getToken(OracleStatementParser.ADMINISTER, 0); }
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public TerminalNode MANAGEMENT() { return getToken(OracleStatementParser.MANAGEMENT, 0); }
		public KeyManagementFrameworkSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyManagementFrameworkSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitKeyManagementFrameworkSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyManagementFrameworkSystemPrivilege_Context keyManagementFrameworkSystemPrivilege_() throws RecognitionException {
		KeyManagementFrameworkSystemPrivilege_Context _localctx = new KeyManagementFrameworkSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 426, RULE_keyManagementFrameworkSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2459);
			match(ADMINISTER);
			setState(2460);
			match(KEY);
			setState(2461);
			match(MANAGEMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibrariesFrameworkSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode LIBRARY() { return getToken(OracleStatementParser.LIBRARY, 0); }
		public LibrariesFrameworkSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_librariesFrameworkSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitLibrariesFrameworkSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibrariesFrameworkSystemPrivilege_Context librariesFrameworkSystemPrivilege_() throws RecognitionException {
		LibrariesFrameworkSystemPrivilege_Context _localctx = new LibrariesFrameworkSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 428, RULE_librariesFrameworkSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2463);
			systemPrivilegeOperation_();
			setState(2464);
			match(LIBRARY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogminerFrameworkSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode LOGMINING() { return getToken(OracleStatementParser.LOGMINING, 0); }
		public LogminerFrameworkSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logminerFrameworkSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitLogminerFrameworkSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogminerFrameworkSystemPrivilege_Context logminerFrameworkSystemPrivilege_() throws RecognitionException {
		LogminerFrameworkSystemPrivilege_Context _localctx = new LogminerFrameworkSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 430, RULE_logminerFrameworkSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2466);
			match(LOGMINING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaterizlizedViewsSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode MATERIALIZED() { return getToken(OracleStatementParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(OracleStatementParser.VIEW, 0); }
		public TerminalNode QUERY() { return getToken(OracleStatementParser.QUERY, 0); }
		public TerminalNode REWRITE() { return getToken(OracleStatementParser.REWRITE, 0); }
		public TerminalNode GLOBAL() { return getToken(OracleStatementParser.GLOBAL, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public TerminalNode REFRESH() { return getToken(OracleStatementParser.REFRESH, 0); }
		public TerminalNode FLASHBACK() { return getToken(OracleStatementParser.FLASHBACK, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public MaterizlizedViewsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materizlizedViewsSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitMaterizlizedViewsSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaterizlizedViewsSystemPrivilege_Context materizlizedViewsSystemPrivilege_() throws RecognitionException {
		MaterizlizedViewsSystemPrivilege_Context _localctx = new MaterizlizedViewsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 432, RULE_materizlizedViewsSystemPrivilege_);
		int _la;
		try {
			setState(2483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2468);
				systemPrivilegeOperation_();
				setState(2469);
				match(MATERIALIZED);
				setState(2470);
				match(VIEW);
				}
				break;
			case QUERY:
			case GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(2472);
					match(GLOBAL);
					}
				}

				setState(2475);
				match(QUERY);
				setState(2476);
				match(REWRITE);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 3);
				{
				setState(2477);
				match(ON);
				setState(2478);
				match(COMMIT);
				setState(2479);
				match(REFRESH);
				}
				break;
			case FLASHBACK:
				enterOuterAlt(_localctx, 4);
				{
				setState(2480);
				match(FLASHBACK);
				setState(2481);
				match(ANY);
				setState(2482);
				match(TABLE);
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

	public static class MiningModelsSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode MINING() { return getToken(OracleStatementParser.MINING, 0); }
		public TerminalNode MODEL() { return getToken(OracleStatementParser.MODEL, 0); }
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode COMMENT() { return getToken(OracleStatementParser.COMMENT, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public MiningModelsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_miningModelsSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitMiningModelsSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MiningModelsSystemPrivilege_Context miningModelsSystemPrivilege_() throws RecognitionException {
		MiningModelsSystemPrivilege_Context _localctx = new MiningModelsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 434, RULE_miningModelsSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				{
				setState(2485);
				systemPrivilegeOperation_();
				}
				break;
			case COMMENT:
				{
				setState(2486);
				match(COMMENT);
				setState(2487);
				match(ANY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2490);
			match(MINING);
			setState(2491);
			match(MODEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OlapCubesSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode CUBE() { return getToken(OracleStatementParser.CUBE, 0); }
		public OlapCubesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olapCubesSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOlapCubesSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OlapCubesSystemPrivilege_Context olapCubesSystemPrivilege_() throws RecognitionException {
		OlapCubesSystemPrivilege_Context _localctx = new OlapCubesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 436, RULE_olapCubesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2493);
			systemPrivilegeOperation_();
			setState(2494);
			match(CUBE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OlapCubeMeasureFoldersSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode MEASURE() { return getToken(OracleStatementParser.MEASURE, 0); }
		public TerminalNode FOLDER() { return getToken(OracleStatementParser.FOLDER, 0); }
		public OlapCubeMeasureFoldersSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olapCubeMeasureFoldersSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOlapCubeMeasureFoldersSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OlapCubeMeasureFoldersSystemPrivilege_Context olapCubeMeasureFoldersSystemPrivilege_() throws RecognitionException {
		OlapCubeMeasureFoldersSystemPrivilege_Context _localctx = new OlapCubeMeasureFoldersSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 438, RULE_olapCubeMeasureFoldersSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2496);
			systemPrivilegeOperation_();
			setState(2497);
			match(MEASURE);
			setState(2498);
			match(FOLDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OlapCubeDiminsionsSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode CUBE() { return getToken(OracleStatementParser.CUBE, 0); }
		public TerminalNode DIMENSION() { return getToken(OracleStatementParser.DIMENSION, 0); }
		public OlapCubeDiminsionsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olapCubeDiminsionsSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOlapCubeDiminsionsSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OlapCubeDiminsionsSystemPrivilege_Context olapCubeDiminsionsSystemPrivilege_() throws RecognitionException {
		OlapCubeDiminsionsSystemPrivilege_Context _localctx = new OlapCubeDiminsionsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 440, RULE_olapCubeDiminsionsSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2500);
			systemPrivilegeOperation_();
			setState(2501);
			match(CUBE);
			setState(2502);
			match(DIMENSION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OlapCubeBuildProcessesSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode CUBE() { return getToken(OracleStatementParser.CUBE, 0); }
		public TerminalNode BUILD() { return getToken(OracleStatementParser.BUILD, 0); }
		public TerminalNode PROCESS() { return getToken(OracleStatementParser.PROCESS, 0); }
		public OlapCubeBuildProcessesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olapCubeBuildProcessesSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOlapCubeBuildProcessesSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OlapCubeBuildProcessesSystemPrivilege_Context olapCubeBuildProcessesSystemPrivilege_() throws RecognitionException {
		OlapCubeBuildProcessesSystemPrivilege_Context _localctx = new OlapCubeBuildProcessesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 442, RULE_olapCubeBuildProcessesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2504);
			systemPrivilegeOperation_();
			setState(2505);
			match(CUBE);
			setState(2506);
			match(BUILD);
			setState(2507);
			match(PROCESS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorsSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(OracleStatementParser.OPERATOR, 0); }
		public OperatorsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorsSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOperatorsSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorsSystemPrivilege_Context operatorsSystemPrivilege_() throws RecognitionException {
		OperatorsSystemPrivilege_Context _localctx = new OperatorsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 444, RULE_operatorsSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2509);
			systemPrivilegeOperation_();
			setState(2510);
			match(OPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutlinesSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode OUTLINE() { return getToken(OracleStatementParser.OUTLINE, 0); }
		public OutlinesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outlinesSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOutlinesSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutlinesSystemPrivilege_Context outlinesSystemPrivilege_() throws RecognitionException {
		OutlinesSystemPrivilege_Context _localctx = new OutlinesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 446, RULE_outlinesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2512);
			systemPrivilegeOperation_();
			setState(2513);
			match(OUTLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlanManagementSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode ADMINISTER() { return getToken(OracleStatementParser.ADMINISTER, 0); }
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode MANAGEMENT() { return getToken(OracleStatementParser.MANAGEMENT, 0); }
		public TerminalNode OBJECT() { return getToken(OracleStatementParser.OBJECT, 0); }
		public PlanManagementSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_planManagementSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitPlanManagementSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlanManagementSystemPrivilege_Context planManagementSystemPrivilege_() throws RecognitionException {
		PlanManagementSystemPrivilege_Context _localctx = new PlanManagementSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 448, RULE_planManagementSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2515);
			match(ADMINISTER);
			setState(2516);
			match(SQL);
			setState(2517);
			match(MANAGEMENT);
			setState(2518);
			match(OBJECT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PluggableDatabasesSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode PLUGGABLE() { return getToken(OracleStatementParser.PLUGGABLE, 0); }
		public TerminalNode DATABASE() { return getToken(OracleStatementParser.DATABASE, 0); }
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode CONTAINER() { return getToken(OracleStatementParser.CONTAINER, 0); }
		public PluggableDatabasesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pluggableDatabasesSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitPluggableDatabasesSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluggableDatabasesSystemPrivilege_Context pluggableDatabasesSystemPrivilege_() throws RecognitionException {
		PluggableDatabasesSystemPrivilege_Context _localctx = new PluggableDatabasesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 450, RULE_pluggableDatabasesSystemPrivilege_);
		try {
			setState(2525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2520);
				match(CREATE);
				setState(2521);
				match(PLUGGABLE);
				setState(2522);
				match(DATABASE);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(2523);
				match(SET);
				setState(2524);
				match(CONTAINER);
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

	public static class ProceduresSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode PROCEDURE() { return getToken(OracleStatementParser.PROCEDURE, 0); }
		public ProceduresSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proceduresSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitProceduresSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProceduresSystemPrivilege_Context proceduresSystemPrivilege_() throws RecognitionException {
		ProceduresSystemPrivilege_Context _localctx = new ProceduresSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 452, RULE_proceduresSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2527);
			systemPrivilegeOperation_();
			setState(2528);
			match(PROCEDURE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProfilesSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode PROFILE() { return getToken(OracleStatementParser.PROFILE, 0); }
		public ProfilesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_profilesSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitProfilesSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProfilesSystemPrivilege_Context profilesSystemPrivilege_() throws RecognitionException {
		ProfilesSystemPrivilege_Context _localctx = new ProfilesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 454, RULE_profilesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2530);
			systemPrivilegeOperation_();
			setState(2531);
			match(PROFILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RolesSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode GRANT() { return getToken(OracleStatementParser.GRANT, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public RolesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rolesSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRolesSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RolesSystemPrivilege_Context rolesSystemPrivilege_() throws RecognitionException {
		RolesSystemPrivilege_Context _localctx = new RolesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 456, RULE_rolesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				{
				setState(2533);
				systemPrivilegeOperation_();
				}
				break;
			case GRANT:
				{
				setState(2534);
				match(GRANT);
				setState(2535);
				match(ANY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2538);
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

	public static class RollbackSegmentsSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode ROLLBACK() { return getToken(OracleStatementParser.ROLLBACK, 0); }
		public TerminalNode SEGMENT() { return getToken(OracleStatementParser.SEGMENT, 0); }
		public RollbackSegmentsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollbackSegmentsSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRollbackSegmentsSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollbackSegmentsSystemPrivilege_Context rollbackSegmentsSystemPrivilege_() throws RecognitionException {
		RollbackSegmentsSystemPrivilege_Context _localctx = new RollbackSegmentsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 458, RULE_rollbackSegmentsSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2540);
			systemPrivilegeOperation_();
			setState(2541);
			match(ROLLBACK);
			setState(2542);
			match(SEGMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequencesSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode SEQUENCE() { return getToken(OracleStatementParser.SEQUENCE, 0); }
		public SequencesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequencesSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSequencesSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequencesSystemPrivilege_Context sequencesSystemPrivilege_() throws RecognitionException {
		SequencesSystemPrivilege_Context _localctx = new SequencesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 460, RULE_sequencesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2544);
			systemPrivilegeOperation_();
			setState(2545);
			match(SEQUENCE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SessionsSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode SESSION() { return getToken(OracleStatementParser.SESSION, 0); }
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode RESTRICTED() { return getToken(OracleStatementParser.RESTRICTED, 0); }
		public TerminalNode RESOURCE() { return getToken(OracleStatementParser.RESOURCE, 0); }
		public TerminalNode COST() { return getToken(OracleStatementParser.COST, 0); }
		public SessionsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sessionsSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSessionsSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SessionsSystemPrivilege_Context sessionsSystemPrivilege_() throws RecognitionException {
		SessionsSystemPrivilege_Context _localctx = new SessionsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 462, RULE_sessionsSystemPrivilege_);
		int _la;
		try {
			setState(2552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2547);
				_la = _input.LA(1);
				if ( !(_la==CREATE || _la==ALTER || _la==RESTRICTED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2548);
				match(SESSION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2549);
				match(ALTER);
				setState(2550);
				match(RESOURCE);
				setState(2551);
				match(COST);
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

	public static class SqlTranslationProfilesSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode TRANSLATION() { return getToken(OracleStatementParser.TRANSLATION, 0); }
		public TerminalNode PROFILE() { return getToken(OracleStatementParser.PROFILE, 0); }
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode USE() { return getToken(OracleStatementParser.USE, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode TRANSLATE() { return getToken(OracleStatementParser.TRANSLATE, 0); }
		public SqlTranslationProfilesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlTranslationProfilesSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSqlTranslationProfilesSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlTranslationProfilesSystemPrivilege_Context sqlTranslationProfilesSystemPrivilege_() throws RecognitionException {
		SqlTranslationProfilesSystemPrivilege_Context _localctx = new SqlTranslationProfilesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 464, RULE_sqlTranslationProfilesSystemPrivilege_);
		try {
			setState(2565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2557);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
				case INSERT:
				case UPDATE:
				case DELETE:
				case CREATE:
				case ALTER:
				case DROP:
				case EXECUTE:
					{
					setState(2554);
					systemPrivilegeOperation_();
					}
					break;
				case USE:
					{
					setState(2555);
					match(USE);
					setState(2556);
					match(ANY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2559);
				match(SQL);
				setState(2560);
				match(TRANSLATION);
				setState(2561);
				match(PROFILE);
				}
				break;
			case TRANSLATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2562);
				match(TRANSLATE);
				setState(2563);
				match(ANY);
				setState(2564);
				match(SQL);
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

	public static class SynonymsSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode SYNONYM() { return getToken(OracleStatementParser.SYNONYM, 0); }
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode PUBLIC() { return getToken(OracleStatementParser.PUBLIC, 0); }
		public SynonymsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synonymsSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSynonymsSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynonymsSystemPrivilege_Context synonymsSystemPrivilege_() throws RecognitionException {
		SynonymsSystemPrivilege_Context _localctx = new SynonymsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 466, RULE_synonymsSystemPrivilege_);
		try {
			setState(2573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2567);
				systemPrivilegeOperation_();
				setState(2568);
				match(SYNONYM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2570);
				match(DROP);
				setState(2571);
				match(PUBLIC);
				setState(2572);
				match(SYNONYM);
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

	public static class TablesSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode BACKUP() { return getToken(OracleStatementParser.BACKUP, 0); }
		public TerminalNode LOCK() { return getToken(OracleStatementParser.LOCK, 0); }
		public TerminalNode READ() { return getToken(OracleStatementParser.READ, 0); }
		public TerminalNode FLASHBACK() { return getToken(OracleStatementParser.FLASHBACK, 0); }
		public TablesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablesSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTablesSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablesSystemPrivilege_Context tablesSystemPrivilege_() throws RecognitionException {
		TablesSystemPrivilege_Context _localctx = new TablesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 468, RULE_tablesSystemPrivilege_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				{
				setState(2575);
				systemPrivilegeOperation_();
				}
				break;
			case READ:
			case FLASHBACK:
			case LOCK:
			case BACKUP:
				{
				setState(2576);
				_la = _input.LA(1);
				if ( !(_la==READ || _la==FLASHBACK || _la==LOCK || _la==BACKUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2577);
				match(ANY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2580);
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

	public static class TablespacesSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode TABLESPACE() { return getToken(OracleStatementParser.TABLESPACE, 0); }
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode MANAGE() { return getToken(OracleStatementParser.MANAGE, 0); }
		public TerminalNode UNLIMITED() { return getToken(OracleStatementParser.UNLIMITED, 0); }
		public TablespacesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespacesSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTablespacesSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablespacesSystemPrivilege_Context tablespacesSystemPrivilege_() throws RecognitionException {
		TablespacesSystemPrivilege_Context _localctx = new TablespacesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 470, RULE_tablespacesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				{
				setState(2582);
				systemPrivilegeOperation_();
				}
				break;
			case MANAGE:
				{
				setState(2583);
				match(MANAGE);
				}
				break;
			case UNLIMITED:
				{
				setState(2584);
				match(UNLIMITED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2587);
			match(TABLESPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TriggersSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode TRIGGER() { return getToken(OracleStatementParser.TRIGGER, 0); }
		public TerminalNode ADMINISTER() { return getToken(OracleStatementParser.ADMINISTER, 0); }
		public TerminalNode DATABASE() { return getToken(OracleStatementParser.DATABASE, 0); }
		public TriggersSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggersSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTriggersSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriggersSystemPrivilege_Context triggersSystemPrivilege_() throws RecognitionException {
		TriggersSystemPrivilege_Context _localctx = new TriggersSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 472, RULE_triggersSystemPrivilege_);
		try {
			setState(2595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2589);
				systemPrivilegeOperation_();
				setState(2590);
				match(TRIGGER);
				}
				break;
			case ADMINISTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2592);
				match(ADMINISTER);
				setState(2593);
				match(DATABASE);
				setState(2594);
				match(TRIGGER);
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

	public static class TypesSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(OracleStatementParser.TYPE, 0); }
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode UNDER() { return getToken(OracleStatementParser.UNDER, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TypesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTypesSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesSystemPrivilege_Context typesSystemPrivilege_() throws RecognitionException {
		TypesSystemPrivilege_Context _localctx = new TypesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 474, RULE_typesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				{
				setState(2597);
				systemPrivilegeOperation_();
				}
				break;
			case UNDER:
				{
				setState(2598);
				match(UNDER);
				setState(2599);
				match(ANY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2602);
			match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsersSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public UsersSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usersSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitUsersSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsersSystemPrivilege_Context usersSystemPrivilege_() throws RecognitionException {
		UsersSystemPrivilege_Context _localctx = new UsersSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 476, RULE_usersSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2604);
			systemPrivilegeOperation_();
			setState(2605);
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

	public static class ViewsSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode VIEW() { return getToken(OracleStatementParser.VIEW, 0); }
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode UNDER() { return getToken(OracleStatementParser.UNDER, 0); }
		public TerminalNode MERGE() { return getToken(OracleStatementParser.MERGE, 0); }
		public ViewsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewsSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitViewsSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewsSystemPrivilege_Context viewsSystemPrivilege_() throws RecognitionException {
		ViewsSystemPrivilege_Context _localctx = new ViewsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 478, RULE_viewsSystemPrivilege_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				{
				setState(2607);
				systemPrivilegeOperation_();
				}
				break;
			case UNDER:
			case MERGE:
				{
				setState(2608);
				_la = _input.LA(1);
				if ( !(_la==UNDER || _la==MERGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2609);
				match(ANY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2612);
			match(VIEW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MiscellaneousSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode ANALYZE() { return getToken(OracleStatementParser.ANALYZE, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode AUDIT() { return getToken(OracleStatementParser.AUDIT, 0); }
		public TerminalNode BECOME() { return getToken(OracleStatementParser.BECOME, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public TerminalNode CHANGE() { return getToken(OracleStatementParser.CHANGE, 0); }
		public TerminalNode NOTIFICATION() { return getToken(OracleStatementParser.NOTIFICATION, 0); }
		public TerminalNode COMMENT() { return getToken(OracleStatementParser.COMMENT, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TerminalNode EXEMPT() { return getToken(OracleStatementParser.EXEMPT, 0); }
		public TerminalNode ACCESS() { return getToken(OracleStatementParser.ACCESS, 0); }
		public TerminalNode POLICY() { return getToken(OracleStatementParser.POLICY, 0); }
		public TerminalNode FORCE() { return getToken(OracleStatementParser.FORCE, 0); }
		public TerminalNode TRANSACTION() { return getToken(OracleStatementParser.TRANSACTION, 0); }
		public TerminalNode GRANT() { return getToken(OracleStatementParser.GRANT, 0); }
		public TerminalNode PRIVILEGE() { return getToken(OracleStatementParser.PRIVILEGE, 0); }
		public TerminalNode OBJECT() { return getToken(OracleStatementParser.OBJECT, 0); }
		public TerminalNode INHERIT() { return getToken(OracleStatementParser.INHERIT, 0); }
		public TerminalNode PRIVILEGES() { return getToken(OracleStatementParser.PRIVILEGES, 0); }
		public TerminalNode KEEP() { return getToken(OracleStatementParser.KEEP, 0); }
		public TerminalNode DATE() { return getToken(OracleStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode SYSGUID() { return getToken(OracleStatementParser.SYSGUID, 0); }
		public TerminalNode PURGE() { return getToken(OracleStatementParser.PURGE, 0); }
		public TerminalNode DBA_RECYCLEBIN() { return getToken(OracleStatementParser.DBA_RECYCLEBIN, 0); }
		public TerminalNode RESUMABLE() { return getToken(OracleStatementParser.RESUMABLE, 0); }
		public TerminalNode SELECT() { return getToken(OracleStatementParser.SELECT, 0); }
		public TerminalNode DICTIONARY() { return getToken(OracleStatementParser.DICTIONARY, 0); }
		public TerminalNode SYSBACKUP() { return getToken(OracleStatementParser.SYSBACKUP, 0); }
		public TerminalNode SYSDBA() { return getToken(OracleStatementParser.SYSDBA, 0); }
		public TerminalNode SYSDG() { return getToken(OracleStatementParser.SYSDG, 0); }
		public TerminalNode SYSKM() { return getToken(OracleStatementParser.SYSKM, 0); }
		public TerminalNode SYSOPER() { return getToken(OracleStatementParser.SYSOPER, 0); }
		public MiscellaneousSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_miscellaneousSystemPrivilege_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitMiscellaneousSystemPrivilege_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MiscellaneousSystemPrivilege_Context miscellaneousSystemPrivilege_() throws RecognitionException {
		MiscellaneousSystemPrivilege_Context _localctx = new MiscellaneousSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 480, RULE_miscellaneousSystemPrivilege_);
		int _la;
		try {
			setState(2658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2614);
				match(ANALYZE);
				setState(2615);
				match(ANY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2616);
				match(AUDIT);
				setState(2617);
				match(ANY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2618);
				match(BECOME);
				setState(2619);
				match(USER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2620);
				match(CHANGE);
				setState(2621);
				match(NOTIFICATION);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2622);
				match(COMMENT);
				setState(2623);
				match(ANY);
				setState(2624);
				match(TABLE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2625);
				match(EXEMPT);
				setState(2626);
				match(ACCESS);
				setState(2627);
				match(POLICY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2628);
				match(FORCE);
				setState(2630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ANY) {
					{
					setState(2629);
					match(ANY);
					}
				}

				setState(2632);
				match(TRANSACTION);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2633);
				match(GRANT);
				setState(2634);
				match(ANY);
				setState(2636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OBJECT) {
					{
					setState(2635);
					match(OBJECT);
					}
				}

				setState(2638);
				match(PRIVILEGE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2639);
				match(INHERIT);
				setState(2640);
				match(ANY);
				setState(2641);
				match(PRIVILEGES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2642);
				match(KEEP);
				setState(2643);
				match(DATE);
				setState(2644);
				match(TIME);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2645);
				match(KEEP);
				setState(2646);
				match(SYSGUID);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2647);
				match(PURGE);
				setState(2648);
				match(DBA_RECYCLEBIN);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2649);
				match(RESUMABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2650);
				match(SELECT);
				setState(2651);
				match(ANY);
				setState(2652);
				_la = _input.LA(1);
				if ( !(_la==TRANSACTION || _la==DICTIONARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2653);
				match(SYSBACKUP);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2654);
				match(SYSDBA);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2655);
				match(SYSDG);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2656);
				match(SYSKM);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2657);
				match(SYSOPER);
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
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCreateUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_createUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2660);
			match(CREATE);
			setState(2661);
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
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDropUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_dropUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2663);
			match(DROP);
			setState(2664);
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
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAlterUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_alterUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2666);
			match(ALTER);
			setState(2667);
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
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCreateRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_createRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2669);
			match(CREATE);
			setState(2670);
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
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDropRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_dropRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2672);
			match(DROP);
			setState(2673);
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
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public AlterRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRole; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAlterRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterRoleContext alterRole() throws RecognitionException {
		AlterRoleContext _localctx = new AlterRoleContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_alterRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2675);
			match(ALTER);
			setState(2676);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(OracleStatementParser.CALL, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2678);
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
		case 65:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 68:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 71:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 72:
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
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0174\u0a7b\4\2\t"+
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
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2\u020b\n\2\3\2\5\2\u020e\n\2\3\3\3\3\3\3\5\3\u0213"+
		"\n\3\3\4\3\4\3\4\5\4\u0218\n\4\3\5\3\5\6\5\u021c\n\5\r\5\16\5\u021d\3"+
		"\5\5\5\u0221\n\5\3\5\3\5\3\6\3\6\3\6\3\7\5\7\u0229\n\7\3\7\6\7\u022c\n"+
		"\7\r\7\16\7\u022d\3\7\5\7\u0231\n\7\3\b\3\b\3\b\3\b\6\b\u0237\n\b\r\b"+
		"\16\b\u0238\3\t\3\t\6\t\u023d\n\t\r\t\16\t\u023e\3\n\3\n\3\n\5\n\u0244"+
		"\n\n\3\n\5\n\u0247\n\n\3\13\5\13\u024a\n\13\3\13\3\13\3\13\3\13\7\13\u0250"+
		"\n\13\f\13\16\13\u0253\13\13\3\f\3\f\5\f\u0257\n\f\3\f\3\f\3\f\5\f\u025c"+
		"\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u0268\n\17\f"+
		"\17\16\17\u026b\13\17\3\20\3\20\3\20\3\20\7\20\u0271\n\20\f\20\16\20\u0274"+
		"\13\20\3\20\3\20\3\20\3\20\5\20\u027a\n\20\3\21\3\21\5\21\u027e\n\21\3"+
		"\22\3\22\5\22\u0282\n\22\3\22\3\22\5\22\u0286\n\22\3\22\5\22\u0289\n\22"+
		"\3\23\3\23\3\24\5\24\u028e\n\24\3\24\5\24\u0291\n\24\3\24\3\24\5\24\u0295"+
		"\n\24\3\24\5\24\u0298\n\24\3\24\5\24\u029b\n\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u02a6\n\25\3\26\3\26\5\26\u02aa\n\26\3\26"+
		"\3\26\3\26\5\26\u02af\n\26\7\26\u02b1\n\26\f\26\16\26\u02b4\13\26\3\27"+
		"\3\27\3\30\3\30\3\30\5\30\u02bb\n\30\3\30\7\30\u02be\n\30\f\30\16\30\u02c1"+
		"\13\30\3\31\3\31\5\31\u02c5\n\31\3\31\3\31\5\31\u02c9\n\31\3\31\5\31\u02cc"+
		"\n\31\3\31\5\31\u02cf\n\31\3\31\5\31\u02d2\n\31\3\31\5\31\u02d5\n\31\3"+
		"\32\3\32\3\33\3\33\5\33\u02db\n\33\3\33\3\33\7\33\u02df\n\33\f\33\16\33"+
		"\u02e2\13\33\3\34\3\34\5\34\u02e6\n\34\3\34\5\34\u02e9\n\34\3\34\5\34"+
		"\u02ec\n\34\3\34\5\34\u02ef\n\34\3\35\3\35\5\35\u02f3\n\35\3\36\3\36\3"+
		"\37\3\37\3\37\3 \3 \3 \3!\3!\3!\7!\u0300\n!\f!\16!\u0303\13!\3\"\3\"\7"+
		"\"\u0307\n\"\f\"\16\"\u030a\13\"\3#\3#\5#\u030e\n#\3#\5#\u0311\n#\3#\3"+
		"#\5#\u0315\n#\3#\3#\5#\u0319\n#\3#\3#\3#\3#\5#\u031f\n#\3$\5$\u0322\n"+
		"$\3$\5$\u0325\n$\3$\3$\3$\3$\5$\u032b\n$\3$\5$\u032e\n$\3$\3$\5$\u0332"+
		"\n$\3$\3$\3$\5$\u0337\n$\5$\u0339\n$\3%\3%\3%\3%\5%\u033f\n%\3&\3&\3&"+
		"\3\'\3\'\3\'\3\'\3\'\7\'\u0349\n\'\f\'\16\'\u034c\13\'\3(\3(\3(\3)\3)"+
		"\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\5+\u035e\n+\3,\3,\3-\5-\u0363\n-\3-"+
		"\3-\3.\3.\3.\3.\3.\3.\3.\5.\u036e\n.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\5\63\u037a\n\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\5\66"+
		"\u0383\n\66\3\66\3\66\3\67\3\67\3\67\5\67\u038a\n\67\3\67\3\67\38\38\3"+
		"9\39\3:\5:\u0393\n:\3:\3:\3:\7:\u0398\n:\f:\16:\u039b\13:\3:\5:\u039e"+
		"\n:\3;\5;\u03a1\n;\3;\3;\3;\7;\u03a6\n;\f;\16;\u03a9\13;\3;\5;\u03ac\n"+
		";\3<\3<\3=\3=\3=\7=\u03b3\n=\f=\16=\u03b6\13=\3=\5=\u03b9\n=\3>\3>\3?"+
		"\3?\3?\3?\5?\u03c1\n?\5?\u03c3\n?\3?\3?\3@\5@\u03c8\n@\3@\3@\3A\3A\3A"+
		"\7A\u03cf\nA\fA\16A\u03d2\13A\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\5"+
		"C\u03e1\nC\3C\3C\3C\3C\7C\u03e7\nC\fC\16C\u03ea\13C\3D\3D\3E\3E\3F\3F"+
		"\3F\3F\3F\3F\5F\u03f6\nF\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\7F\u0405"+
		"\nF\fF\16F\u0408\13F\3G\3G\3H\3H\5H\u040e\nH\3H\3H\3H\3H\3H\5H\u0415\n"+
		"H\3H\3H\3H\3H\3H\7H\u041c\nH\fH\16H\u041f\13H\3H\3H\3H\3H\5H\u0425\nH"+
		"\3H\3H\3H\3H\3H\3H\3H\5H\u042e\nH\3H\3H\3H\3H\5H\u0434\nH\3H\5H\u0437"+
		"\nH\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\7I\u045a\nI\fI\16I\u045d\13I\3J\3J\3"+
		"J\3J\3J\3J\3J\3J\5J\u0467\nJ\3J\3J\3J\3J\7J\u046d\nJ\fJ\16J\u0470\13J"+
		"\3J\3J\3J\5J\u0475\nJ\3J\3J\3J\3J\3J\3J\3J\3J\5J\u047f\nJ\3J\3J\3J\7J"+
		"\u0484\nJ\fJ\16J\u0487\13J\3K\3K\3K\5K\u048c\nK\3L\3L\3L\5L\u0491\nL\3"+
		"L\3L\3L\7L\u0496\nL\fL\16L\u0499\13L\3L\5L\u049c\nL\3L\3L\3M\3M\3N\3N"+
		"\3O\3O\5O\u04a6\nO\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\7Q\u04b4\nQ\fQ"+
		"\16Q\u04b7\13Q\3Q\3Q\5Q\u04bb\nQ\3Q\3Q\3R\3R\3R\3R\3R\7R\u04c4\nR\fR\16"+
		"R\u04c7\13R\3R\5R\u04ca\nR\3R\3R\3S\3S\3S\3S\3S\5S\u04d3\nS\3T\3T\5T\u04d7"+
		"\nT\3T\6T\u04da\nT\rT\16T\u04db\3T\5T\u04df\nT\3U\3U\3U\3U\3U\3V\3V\3"+
		"V\3W\3W\3W\3W\3W\7W\u04ee\nW\fW\16W\u04f1\13W\3X\3X\3X\5X\u04f6\nX\3X"+
		"\5X\u04f9\nX\3Y\3Y\3Z\3Z\3[\3[\3[\7[\u0502\n[\f[\16[\u0505\13[\3\\\3\\"+
		"\5\\\u0509\n\\\3]\3]\3]\7]\u050e\n]\f]\16]\u0511\13]\3^\3^\3^\3^\3_\3"+
		"_\5_\u0519\n_\3_\3_\3_\5_\u051e\n_\3_\3_\5_\u0522\n_\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\5`\u052d\n`\3`\3`\3`\3`\3`\3`\5`\u0535\n`\3`\3`\5`\u0539\n"+
		"`\5`\u053b\n`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u0577\na\3b\3b\5"+
		"b\u057b\nb\3b\3b\5b\u057f\nb\3b\3b\3b\3b\3b\3b\3b\5b\u0588\nb\5b\u058a"+
		"\nb\3c\3c\3c\3c\3c\5c\u0591\nc\3c\3c\3c\3d\3d\3d\3d\3d\5d\u059b\nd\3e"+
		"\3e\3e\5e\u05a0\ne\3e\5e\u05a3\ne\3e\3e\3f\3f\6f\u05a9\nf\rf\16f\u05aa"+
		"\3g\3g\3g\3g\3g\3h\3h\3h\3i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u05be\ni\3i\3i"+
		"\3i\3i\3i\5i\u05c5\ni\3i\3i\3i\3i\5i\u05cb\ni\3i\3i\5i\u05cf\ni\3j\3j"+
		"\3j\3j\3j\5j\u05d6\nj\3j\3j\3j\3j\7j\u05dc\nj\fj\16j\u05df\13j\3j\3j\5"+
		"j\u05e3\nj\3j\5j\u05e6\nj\3k\3k\3k\3k\3l\3l\3m\3m\3m\7m\u05f1\nm\fm\16"+
		"m\u05f4\13m\3n\3n\3o\3o\3o\3o\3o\3o\3p\3p\3p\3p\3p\3p\3p\3q\3q\3q\3q\3"+
		"q\3r\3r\3r\3r\3r\3s\3s\3s\3s\3t\3t\3t\3t\3u\3u\3u\3u\3v\3v\5v\u061d\n"+
		"v\3w\3w\3w\3w\3x\3x\3x\3y\3y\3z\3z\3z\3z\5z\u062c\nz\3z\3z\3z\3z\5z\u0632"+
		"\nz\3{\3{\3{\7{\u0637\n{\f{\16{\u063a\13{\3|\3|\3|\3|\5|\u0640\n|\3}\3"+
		"}\3}\5}\u0645\n}\3}\3}\3}\3}\3}\5}\u064c\n}\3}\3}\5}\u0650\n}\3}\6}\u0653"+
		"\n}\r}\16}\u0654\3}\5}\u0658\n}\3~\5~\u065b\n~\3\177\3\177\3\177\5\177"+
		"\u0660\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0668"+
		"\n\u0080\5\u0080\u066a\n\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081"+
		"\5\u0081\u0671\n\u0081\3\u0081\6\u0081\u0674\n\u0081\r\u0081\16\u0081"+
		"\u0675\5\u0081\u0678\n\u0081\3\u0081\5\u0081\u067b\n\u0081\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\5\u0082\u0682\n\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u0694\n\u0082\3\u0083\3\u0083"+
		"\5\u0083\u0698\n\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u069d\n\u0083\3"+
		"\u0083\5\u0083\u06a0\n\u0083\3\u0083\5\u0083\u06a3\n\u0083\3\u0083\5\u0083"+
		"\u06a6\n\u0083\3\u0084\3\u0084\5\u0084\u06aa\n\u0084\3\u0084\5\u0084\u06ad"+
		"\n\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\5\u0084\u06b8\n\u0084\3\u0084\7\u0084\u06bb\n\u0084\f\u0084\16"+
		"\u0084\u06be\13\u0084\3\u0085\3\u0085\3\u0085\5\u0085\u06c3\n\u0085\3"+
		"\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u06ca\n\u0085\5\u0085\u06cc"+
		"\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\5\u0086\u06d8\n\u0086\3\u0087\5\u0087\u06db\n\u0087\3"+
		"\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u06ea\n\u008a\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\5\u008c\u06f7\n\u008c\3\u008c\3\u008c\7\u008c\u06fb\n\u008c\f\u008c\16"+
		"\u008c\u06fe\13\u008c\5\u008c\u0700\n\u008c\3\u008d\3\u008d\5\u008d\u0704"+
		"\n\u008d\3\u008d\3\u008d\5\u008d\u0708\n\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\5\u008d\u070f\n\u008d\3\u008d\7\u008d\u0712\n\u008d\f"+
		"\u008d\16\u008d\u0715\13\u008d\3\u008e\3\u008e\5\u008e\u0719\n\u008e\3"+
		"\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u072a\n\u008e"+
		"\3\u008e\7\u008e\u072d\n\u008e\f\u008e\16\u008e\u0730\13\u008e\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u0743"+
		"\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\7\u008f\u074a\n\u008f"+
		"\f\u008f\16\u008f\u074d\13\u008f\5\u008f\u074f\n\u008f\3\u0090\5\u0090"+
		"\u0752\n\u0090\3\u0091\3\u0091\5\u0091\u0756\n\u0091\3\u0091\3\u0091\3"+
		"\u0092\3\u0092\3\u0092\3\u0092\7\u0092\u075e\n\u0092\f\u0092\16\u0092"+
		"\u0761\13\u0092\3\u0092\3\u0092\3\u0093\3\u0093\5\u0093\u0767\n\u0093"+
		"\3\u0093\5\u0093\u076a\n\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\7\u0095\u0777\n\u0095"+
		"\f\u0095\16\u0095\u077a\13\u0095\3\u0095\3\u0095\3\u0096\3\u0096\5\u0096"+
		"\u0780\n\u0096\3\u0096\3\u0096\5\u0096\u0784\n\u0096\3\u0097\3\u0097\5"+
		"\u0097\u0788\n\u0097\3\u0098\3\u0098\5\u0098\u078c\n\u0098\3\u0098\3\u0098"+
		"\3\u0098\5\u0098\u0791\n\u0098\7\u0098\u0793\n\u0098\f\u0098\16\u0098"+
		"\u0796\13\u0098\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u079c\n\u0099"+
		"\3\u009a\3\u009a\3\u009a\5\u009a\u07a1\n\u009a\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009c\6\u009c\u07a8\n\u009c\r\u009c\16\u009c\u07a9\3\u009c"+
		"\5\u009c\u07ad\n\u009c\3\u009d\3\u009d\3\u009d\5\u009d\u07b2\n\u009d\3"+
		"\u009e\3\u009e\3\u009e\5\u009e\u07b7\n\u009e\3\u009f\3\u009f\3\u009f\3"+
		"\u009f\7\u009f\u07bd\n\u009f\f\u009f\16\u009f\u07c0\13\u009f\3\u009f\3"+
		"\u009f\3\u009f\5\u009f\u07c5\n\u009f\3\u00a0\3\u00a0\5\u00a0\u07c9\n\u00a0"+
		"\3\u00a1\6\u00a1\u07cc\n\u00a1\r\u00a1\16\u00a1\u07cd\3\u00a2\3\u00a2"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a4\5\u00a4\u07d7\n\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\5\u00a4\u07dc\n\u00a4\3\u00a4\3\u00a4\5\u00a4\u07e0\n"+
		"\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u07e6\n\u00a4\3\u00a4\3"+
		"\u00a4\3\u00a4\3\u00a4\5\u00a4\u07ec\n\u00a4\3\u00a5\3\u00a5\5\u00a5\u07f0"+
		"\n\u00a5\3\u00a5\3\u00a5\3\u00a5\7\u00a5\u07f5\n\u00a5\f\u00a5\16\u00a5"+
		"\u07f8\13\u00a5\3\u00a5\5\u00a5\u07fb\n\u00a5\3\u00a5\5\u00a5\u07fe\n"+
		"\u00a5\3\u00a6\3\u00a6\5\u00a6\u0802\n\u00a6\3\u00a6\3\u00a6\5\u00a6\u0806"+
		"\n\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u080b\n\u00a6\3\u00a6\7\u00a6"+
		"\u080e\n\u00a6\f\u00a6\16\u00a6\u0811\13\u00a6\3\u00a7\3\u00a7\3\u00a7"+
		"\5\u00a7\u0816\n\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7"+
		"\u081d\n\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\7\u00a8\u0823\n\u00a8\f"+
		"\u00a8\16\u00a8\u0826\13\u00a8\3\u00a8\5\u00a8\u0829\n\u00a8\3\u00a9\3"+
		"\u00a9\3\u00a9\7\u00a9\u082e\n\u00a9\f\u00a9\16\u00a9\u0831\13\u00a9\3"+
		"\u00a9\5\u00a9\u0834\n\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3"+
		"\u00aa\7\u00aa\u083c\n\u00aa\f\u00aa\16\u00aa\u083f\13\u00aa\3\u00aa\3"+
		"\u00aa\5\u00aa\u0843\n\u00aa\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0848\n\u00ab"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\6\u00ae\u0857\n\u00ae\r\u00ae\16\u00ae"+
		"\u0858\5\u00ae\u085b\n\u00ae\3\u00af\3\u00af\6\u00af\u085f\n\u00af\r\u00af"+
		"\16\u00af\u0860\3\u00af\5\u00af\u0864\n\u00af\3\u00b0\3\u00b0\3\u00b0"+
		"\6\u00b0\u0869\n\u00b0\r\u00b0\16\u00b0\u086a\3\u00b0\5\u00b0\u086e\n"+
		"\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\5\u00b2\u0875\n\u00b2\3"+
		"\u00b3\3\u00b3\3\u00b3\5\u00b3\u087a\n\u00b3\3\u00b4\3\u00b4\3\u00b4\3"+
		"\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0884\n\u00b5\3\u00b5\3"+
		"\u00b5\5\u00b5\u0888\n\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u088d\n\u00b5"+
		"\5\u00b5\u088f\n\u00b5\3\u00b6\3\u00b6\3\u00b6\6\u00b6\u0894\n\u00b6\r"+
		"\u00b6\16\u00b6\u0895\3\u00b7\3\u00b7\3\u00b7\7\u00b7\u089b\n\u00b7\f"+
		"\u00b7\16\u00b7\u089e\13\u00b7\3\u00b8\3\u00b8\5\u00b8\u08a2\n\u00b8\3"+
		"\u00b8\3\u00b8\5\u00b8\u08a6\n\u00b8\3\u00b8\7\u00b8\u08a9\n\u00b8\f\u00b8"+
		"\16\u00b8\u08ac\13\u00b8\3\u00b8\5\u00b8\u08af\n\u00b8\5\u00b8\u08b1\n"+
		"\u00b8\3\u00b8\3\u00b8\5\u00b8\u08b5\n\u00b8\3\u00b9\3\u00b9\3\u00b9\5"+
		"\u00b9\u08ba\n\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bc\3"+
		"\u00bc\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u08c9\n"+
		"\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u08cf\n\u00bf\3\u00c0\3"+
		"\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c3\3\u00c3"+
		"\5\u00c3\u08db\n\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u08e0\n\u00c3\7"+
		"\u00c3\u08e2\n\u00c3\f\u00c3\16\u00c3\u08e5\13\u00c3\3\u00c4\3\u00c4\5"+
		"\u00c4\u08e9\n\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3"+
		"\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0907\n\u00c4\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\5\u00c5\u0915\n\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0944\n\u00c6\3\u00c7\3\u00c7"+
		"\5\u00c7\u0948\n\u00c7\3\u00c8\5\u00c8\u094b\n\u00c8\3\u00c8\3\u00c8\3"+
		"\u00c8\3\u00c8\3\u00c8\5\u00c8\u0952\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3"+
		"\u00c8\3\u00c8\5\u00c8\u0959\n\u00c8\5\u00c8\u095b\n\u00c8\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u096b\n\u00cc\3\u00cd\3\u00cd\5\u00cd"+
		"\u096f\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\5\u00ce\u0979\n\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d3"+
		"\3\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d6\3\u00d6\5\u00d6\u0994\n\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\5\u00d6\u099c\n\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\5\u00da\u09ac\n\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\5\u00da\u09b6\n\u00da\3\u00db\3\u00db\3\u00db"+
		"\5\u00db\u09bb\n\u00db\3\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\5\u00e3\u09e0\n\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e6\3\u00e6\3\u00e6\5\u00e6\u09eb\n\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e9"+
		"\3\u00e9\3\u00e9\3\u00e9\3\u00e9\5\u00e9\u09fb\n\u00e9\3\u00ea\3\u00ea"+
		"\3\u00ea\5\u00ea\u0a00\n\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea"+
		"\3\u00ea\5\u00ea\u0a08\n\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb"+
		"\3\u00eb\5\u00eb\u0a10\n\u00eb\3\u00ec\3\u00ec\3\u00ec\5\u00ec\u0a15\n"+
		"\u00ec\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ed\5\u00ed\u0a1c\n\u00ed\3"+
		"\u00ed\3\u00ed\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee"+
		"\u0a26\n\u00ee\3\u00ef\3\u00ef\3\u00ef\5\u00ef\u0a2b\n\u00ef\3\u00ef\3"+
		"\u00ef\3\u00f0\3\u00f0\3\u00f0\3\u00f1\3\u00f1\3\u00f1\5\u00f1\u0a35\n"+
		"\u00f1\3\u00f1\3\u00f1\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2"+
		"\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2"+
		"\3\u00f2\5\u00f2\u0a49\n\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\5\u00f2"+
		"\u0a4f\n\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2"+
		"\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2"+
		"\3\u00f2\3\u00f2\3\u00f2\3\u00f2\5\u00f2\u0a65\n\u00f2\3\u00f3\3\u00f3"+
		"\3\u00f3\3\u00f4\3\u00f4\3\u00f4\3\u00f5\3\u00f5\3\u00f5\3\u00f6\3\u00f6"+
		"\3\u00f6\3\u00f7\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f8\3\u00f9\3\u00f9"+
		"\3\u00f9\2\6\u0084\u008a\u0090\u0092\u00fa\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e"+
		"\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126"+
		"\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e"+
		"\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156"+
		"\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e"+
		"\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186"+
		"\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e"+
		"\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6"+
		"\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce"+
		"\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6"+
		"\u01e8\u01ea\u01ec\u01ee\u01f0\2!\4\2pp\u0157\u0157\4\2NNpp\4\2XX\\\\"+
		"\4\2WWZ[\3\2\u0085\u0087\3\2kl\35\2\66\67FFHHOSU]aakly\u0080\u0082\u0084"+
		"\u0086\u0097\u009a\u009b\u009e\u00ae\u00b4\u00b7\u00ba\u00bc\u00be\u00c2"+
		"\u00c4\u00c4\u00c6\u00e4\u00e6\u00eb\u00ed\u00ed\u00f0\u00f9\u00fb\u00fe"+
		"\u0100\u0100\u0102\u0105\u0107\u0107\u010a\u0114\u0116\u011a\u011f\u0157"+
		"\3\2\u0170\u0171\4\2\4\5fg\4\2\6\6ii\4\2jl\u00ba\u00ba\3\2pq\3\2\30\35"+
		"\5\2\6\7\17\20\u00b4\u00b4\3\2\u0093\u0097\3\2vw\4\2\62\62\u009e\u009e"+
		"\3\2\u00c7\u00c8\4\2\u00e4\u00e4\u00ee\u00ee\4\2AA\u00d8\u00d8\4\2\65"+
		"\65\u00d2\u00d2\4\2\u0108\u0108\u010d\u010d\4\2/\65\u00c9\u00c9\3\2\u012a"+
		"\u012b\3\2\63\65\4\2qq\u0132\u0132\3\2\u0134\u0135\4\2\63\64\u0144\u0144"+
		"\6\2\u00c0\u00c0\u00cd\u00cd\u011e\u011e\u0147\u0147\4\2\u00cc\u00cc\u00d6"+
		"\u00d6\4\2\u00c4\u00c4\u012f\u012f\2\u0b94\2\u020a\3\2\2\2\4\u020f\3\2"+
		"\2\2\6\u0214\3\2\2\2\b\u0220\3\2\2\2\n\u0224\3\2\2\2\f\u0228\3\2\2\2\16"+
		"\u0232\3\2\2\2\20\u023a\3\2\2\2\22\u0240\3\2\2\2\24\u0249\3\2\2\2\26\u0254"+
		"\3\2\2\2\30\u025d\3\2\2\2\32\u025f\3\2\2\2\34\u0263\3\2\2\2\36\u0279\3"+
		"\2\2\2 \u027d\3\2\2\2\"\u027f\3\2\2\2$\u028a\3\2\2\2&\u028d\3\2\2\2(\u02a5"+
		"\3\2\2\2*\u02a7\3\2\2\2,\u02b5\3\2\2\2.\u02b7\3\2\2\2\60\u02c2\3\2\2\2"+
		"\62\u02d6\3\2\2\2\64\u02da\3\2\2\2\66\u02ee\3\2\2\28\u02f2\3\2\2\2:\u02f4"+
		"\3\2\2\2<\u02f6\3\2\2\2>\u02f9\3\2\2\2@\u02fc\3\2\2\2B\u0304\3\2\2\2D"+
		"\u031e\3\2\2\2F\u0338\3\2\2\2H\u033e\3\2\2\2J\u0340\3\2\2\2L\u0343\3\2"+
		"\2\2N\u034d\3\2\2\2P\u0350\3\2\2\2R\u0354\3\2\2\2T\u035d\3\2\2\2V\u035f"+
		"\3\2\2\2X\u0362\3\2\2\2Z\u036d\3\2\2\2\\\u036f\3\2\2\2^\u0371\3\2\2\2"+
		"`\u0373\3\2\2\2b\u0375\3\2\2\2d\u0379\3\2\2\2f\u037b\3\2\2\2h\u037d\3"+
		"\2\2\2j\u0382\3\2\2\2l\u0389\3\2\2\2n\u038d\3\2\2\2p\u038f\3\2\2\2r\u0392"+
		"\3\2\2\2t\u03a0\3\2\2\2v\u03ad\3\2\2\2x\u03b8\3\2\2\2z\u03ba\3\2\2\2|"+
		"\u03bc\3\2\2\2~\u03c7\3\2\2\2\u0080\u03cb\3\2\2\2\u0082\u03d3\3\2\2\2"+
		"\u0084\u03e0\3\2\2\2\u0086\u03eb\3\2\2\2\u0088\u03ed\3\2\2\2\u008a\u03ef"+
		"\3\2\2\2\u008c\u0409\3\2\2\2\u008e\u0436\3\2\2\2\u0090\u0438\3\2\2\2\u0092"+
		"\u047e\3\2\2\2\u0094\u048b\3\2\2\2\u0096\u048d\3\2\2\2\u0098\u049f\3\2"+
		"\2\2\u009a\u04a1\3\2\2\2\u009c\u04a5\3\2\2\2\u009e\u04a7\3\2\2\2\u00a0"+
		"\u04ae\3\2\2\2\u00a2\u04be\3\2\2\2\u00a4\u04d2\3\2\2\2\u00a6\u04d4\3\2"+
		"\2\2\u00a8\u04e0\3\2\2\2\u00aa\u04e5\3\2\2\2\u00ac\u04e8\3\2\2\2\u00ae"+
		"\u04f5\3\2\2\2\u00b0\u04fa\3\2\2\2\u00b2\u04fc\3\2\2\2\u00b4\u04fe\3\2"+
		"\2\2\u00b6\u0508\3\2\2\2\u00b8\u050a\3\2\2\2\u00ba\u0512\3\2\2\2\u00bc"+
		"\u0521\3\2\2\2\u00be\u053a\3\2\2\2\u00c0\u0576\3\2\2\2\u00c2\u0589\3\2"+
		"\2\2\u00c4\u058b\3\2\2\2\u00c6\u059a\3\2\2\2\u00c8\u059c\3\2\2\2\u00ca"+
		"\u05a6\3\2\2\2\u00cc\u05ac\3\2\2\2\u00ce\u05b1\3\2\2\2\u00d0\u05b4\3\2"+
		"\2\2\u00d2\u05d5\3\2\2\2\u00d4\u05e7\3\2\2\2\u00d6\u05eb\3\2\2\2\u00d8"+
		"\u05ed\3\2\2\2\u00da\u05f5\3\2\2\2\u00dc\u05f7\3\2\2\2\u00de\u05fd\3\2"+
		"\2\2\u00e0\u0604\3\2\2\2\u00e2\u0609\3\2\2\2\u00e4\u060e\3\2\2\2\u00e6"+
		"\u0612\3\2\2\2\u00e8\u0616\3\2\2\2\u00ea\u061c\3\2\2\2\u00ec\u061e\3\2"+
		"\2\2\u00ee\u0622\3\2\2\2\u00f0\u0625\3\2\2\2\u00f2\u062b\3\2\2\2\u00f4"+
		"\u0633\3\2\2\2\u00f6\u063f\3\2\2\2\u00f8\u0641\3\2\2\2\u00fa\u065a\3\2"+
		"\2\2\u00fc\u065c\3\2\2\2\u00fe\u0661\3\2\2\2\u0100\u0670\3\2\2\2\u0102"+
		"\u0693\3\2\2\2\u0104\u0697\3\2\2\2\u0106\u06a9\3\2\2\2\u0108\u06bf\3\2"+
		"\2\2\u010a\u06d7\3\2\2\2\u010c\u06da\3\2\2\2\u010e\u06de\3\2\2\2\u0110"+
		"\u06e1\3\2\2\2\u0112\u06e5\3\2\2\2\u0114\u06eb\3\2\2\2\u0116\u06ff\3\2"+
		"\2\2\u0118\u0701\3\2\2\2\u011a\u0718\3\2\2\2\u011c\u074e\3\2\2\2\u011e"+
		"\u0751\3\2\2\2\u0120\u0753\3\2\2\2\u0122\u0759\3\2\2\2\u0124\u0766\3\2"+
		"\2\2\u0126\u076b\3\2\2\2\u0128\u0772\3\2\2\2\u012a\u077f\3\2\2\2\u012c"+
		"\u0787\3\2\2\2\u012e\u0789\3\2\2\2\u0130\u079b\3\2\2\2\u0132\u07a0\3\2"+
		"\2\2\u0134\u07a2\3\2\2\2\u0136\u07ac\3\2\2\2\u0138\u07b1\3\2\2\2\u013a"+
		"\u07b3\3\2\2\2\u013c\u07c4\3\2\2\2\u013e\u07c8\3\2\2\2\u0140\u07cb\3\2"+
		"\2\2\u0142\u07cf\3\2\2\2\u0144\u07d1\3\2\2\2\u0146\u07eb\3\2\2\2\u0148"+
		"\u07ed\3\2\2\2\u014a\u07ff\3\2\2\2\u014c\u0812\3\2\2\2\u014e\u0828\3\2"+
		"\2\2\u0150\u082a\3\2\2\2\u0152\u0842\3\2\2\2\u0154\u0847\3\2\2\2\u0156"+
		"\u0849\3\2\2\2\u0158\u084c\3\2\2\2\u015a\u085a\3\2\2\2\u015c\u085c\3\2"+
		"\2\2\u015e\u0865\3\2\2\2\u0160\u086f\3\2\2\2\u0162\u0874\3\2\2\2\u0164"+
		"\u0879\3\2\2\2\u0166\u087b\3\2\2\2\u0168\u0880\3\2\2\2\u016a\u0893\3\2"+
		"\2\2\u016c\u0897\3\2\2\2\u016e\u08b4\3\2\2\2\u0170\u08b9\3\2\2\2\u0172"+
		"\u08bb\3\2\2\2\u0174\u08be\3\2\2\2\u0176\u08c0\3\2\2\2\u0178\u08c2\3\2"+
		"\2\2\u017a\u08c4\3\2\2\2\u017c\u08ca\3\2\2\2\u017e\u08d0\3\2\2\2\u0180"+
		"\u08d4\3\2\2\2\u0182\u08d6\3\2\2\2\u0184\u08d8\3\2\2\2\u0186\u0906\3\2"+
		"\2\2\u0188\u0914\3\2\2\2\u018a\u0943\3\2\2\2\u018c\u0945\3\2\2\2\u018e"+
		"\u095a\3\2\2\2\u0190\u095c\3\2\2\2\u0192\u095f\3\2\2\2\u0194\u0962\3\2"+
		"\2\2\u0196\u096a\3\2\2\2\u0198\u096c\3\2\2\2\u019a\u0973\3\2\2\2\u019c"+
		"\u097a\3\2\2\2\u019e\u097e\3\2\2\2\u01a0\u0981\3\2\2\2\u01a2\u0984\3\2"+
		"\2\2\u01a4\u0987\3\2\2\2\u01a6\u098b\3\2\2\2\u01a8\u098e\3\2\2\2\u01aa"+
		"\u099b\3\2\2\2\u01ac\u099d\3\2\2\2\u01ae\u09a1\3\2\2\2\u01b0\u09a4\3\2"+
		"\2\2\u01b2\u09b5\3\2\2\2\u01b4\u09ba\3\2\2\2\u01b6\u09bf\3\2\2\2\u01b8"+
		"\u09c2\3\2\2\2\u01ba\u09c6\3\2\2\2\u01bc\u09ca\3\2\2\2\u01be\u09cf\3\2"+
		"\2\2\u01c0\u09d2\3\2\2\2\u01c2\u09d5\3\2\2\2\u01c4\u09df\3\2\2\2\u01c6"+
		"\u09e1\3\2\2\2\u01c8\u09e4\3\2\2\2\u01ca\u09ea\3\2\2\2\u01cc\u09ee\3\2"+
		"\2\2\u01ce\u09f2\3\2\2\2\u01d0\u09fa\3\2\2\2\u01d2\u0a07\3\2\2\2\u01d4"+
		"\u0a0f\3\2\2\2\u01d6\u0a14\3\2\2\2\u01d8\u0a1b\3\2\2\2\u01da\u0a25\3\2"+
		"\2\2\u01dc\u0a2a\3\2\2\2\u01de\u0a2e\3\2\2\2\u01e0\u0a34\3\2\2\2\u01e2"+
		"\u0a64\3\2\2\2\u01e4\u0a66\3\2\2\2\u01e6\u0a69\3\2\2\2\u01e8\u0a6c\3\2"+
		"\2\2\u01ea\u0a6f\3\2\2\2\u01ec\u0a72\3\2\2\2\u01ee\u0a75\3\2\2\2\u01f0"+
		"\u0a78\3\2\2\2\u01f2\u020b\5,\27\2\u01f3\u020b\5\4\3\2\u01f4\u020b\5\26"+
		"\f\2\u01f5\u020b\5\"\22\2\u01f6\u020b\5\u00dco\2\u01f7\u020b\5\u00e0q"+
		"\2\u01f8\u020b\5\u00e4s\2\u01f9\u020b\5\u00e8u\2\u01fa\u020b\5\u00dep"+
		"\2\u01fb\u020b\5\u00e6t\2\u01fc\u020b\5\u00e2r\2\u01fd\u020b\5\u0174\u00bb"+
		"\2\u01fe\u020b\5\u0176\u00bc\2\u01ff\u020b\5\u0172\u00ba\2\u0200\u020b"+
		"\5\u0178\u00bd\2\u0201\u020b\5\u017a\u00be\2\u0202\u020b\5\u017c\u00bf"+
		"\2\u0203\u020b\5\u01e4\u00f3\2\u0204\u020b\5\u01e6\u00f4\2\u0205\u020b"+
		"\5\u01e8\u00f5\2\u0206\u020b\5\u01ea\u00f6\2\u0207\u020b\5\u01ec\u00f7"+
		"\2\u0208\u020b\5\u01ee\u00f8\2\u0209\u020b\5\u01f0\u00f9\2\u020a\u01f2"+
		"\3\2\2\2\u020a\u01f3\3\2\2\2\u020a\u01f4\3\2\2\2\u020a\u01f5\3\2\2\2\u020a"+
		"\u01f6\3\2\2\2\u020a\u01f7\3\2\2\2\u020a\u01f8\3\2\2\2\u020a\u01f9\3\2"+
		"\2\2\u020a\u01fa\3\2\2\2\u020a\u01fb\3\2\2\2\u020a\u01fc\3\2\2\2\u020a"+
		"\u01fd\3\2\2\2\u020a\u01fe\3\2\2\2\u020a\u01ff\3\2\2\2\u020a\u0200\3\2"+
		"\2\2\u020a\u0201\3\2\2\2\u020a\u0202\3\2\2\2\u020a\u0203\3\2\2\2\u020a"+
		"\u0204\3\2\2\2\u020a\u0205\3\2\2\2\u020a\u0206\3\2\2\2\u020a\u0207\3\2"+
		"\2\2\u020a\u0208\3\2\2\2\u020a\u0209\3\2\2\2\u020b\u020d\3\2\2\2\u020c"+
		"\u020e\7+\2\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e\3\3\2\2\2"+
		"\u020f\u0212\7\60\2\2\u0210\u0213\5\6\4\2\u0211\u0213\5\b\5\2\u0212\u0210"+
		"\3\2\2\2\u0212\u0211\3\2\2\2\u0213\5\3\2\2\2\u0214\u0217\5\22\n\2\u0215"+
		"\u0218\5\24\13\2\u0216\u0218\5,\27\2\u0217\u0215\3\2\2\2\u0217\u0216\3"+
		"\2\2\2\u0218\7\3\2\2\2\u0219\u021b\7p\2\2\u021a\u021c\5\n\6\2\u021b\u021a"+
		"\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u0221\3\2\2\2\u021f\u0221\5\f\7\2\u0220\u0219\3\2\2\2\u0220\u021f\3\2"+
		"\2\2\u0221\u0222\3\2\2\2\u0222\u0223\5,\27\2\u0223\t\3\2\2\2\u0224\u0225"+
		"\5\22\n\2\u0225\u0226\5\24\13\2\u0226\13\3\2\2\2\u0227\u0229\t\2\2\2\u0228"+
		"\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u022c\5\16"+
		"\b\2\u022b\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022b\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u0231\5\20\t\2\u0230\u022f\3"+
		"\2\2\2\u0230\u0231\3\2\2\2\u0231\r\3\2\2\2\u0232\u0233\7P\2\2\u0233\u0234"+
		"\5\u0084C\2\u0234\u0236\7c\2\2\u0235\u0237\5\n\6\2\u0236\u0235\3\2\2\2"+
		"\u0237\u0238\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\17"+
		"\3\2\2\2\u023a\u023c\7b\2\2\u023b\u023d\5\n\6\2\u023c\u023b\3\2\2\2\u023d"+
		"\u023e\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\21\3\2\2"+
		"\2\u0240\u0241\7J\2\2\u0241\u0246\5j\66\2\u0242\u0244\7_\2\2\u0243\u0242"+
		"\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\58\35\2\u0246"+
		"\u0243\3\2\2\2\u0246\u0247\3\2\2\2\u0247\23\3\2\2\2\u0248\u024a\5r:\2"+
		"\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c"+
		"\7K\2\2\u024c\u0251\5\36\20\2\u024d\u024e\7%\2\2\u024e\u0250\5\36\20\2"+
		"\u024f\u024d\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252"+
		"\3\2\2\2\u0252\25\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0256\7\61\2\2\u0255"+
		"\u0257\5\30\r\2\u0256\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\3"+
		"\2\2\2\u0258\u0259\5@!\2\u0259\u025b\5\34\17\2\u025a\u025c\5J&\2\u025b"+
		"\u025a\3\2\2\2\u025b\u025c\3\2\2\2\u025c\27\3\2\2\2\u025d\u025e\7\u0100"+
		"\2\2\u025e\31\3\2\2\2\u025f\u0260\5l\67\2\u0260\u0261\7\30\2\2\u0261\u0262"+
		"\5 \21\2\u0262\33\3\2\2\2\u0263\u0264\7;\2\2\u0264\u0269\5\32\16\2\u0265"+
		"\u0266\7%\2\2\u0266\u0268\5\32\16\2\u0267\u0265\3\2\2\2\u0268\u026b\3"+
		"\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\35\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026c\u026d\7\37\2\2\u026d\u0272\5 \21\2\u026e\u026f\7"+
		"%\2\2\u026f\u0271\5 \21\2\u0270\u026e\3\2\2\2\u0271\u0274\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\3\2\2\2\u0274\u0272\3\2"+
		"\2\2\u0275\u0276\7 \2\2\u0276\u027a\3\2\2\2\u0277\u0278\7\37\2\2\u0278"+
		"\u027a\7 \2\2\u0279\u026c\3\2\2\2\u0279\u0277\3\2\2\2\u027a\37\3\2\2\2"+
		"\u027b\u027e\5\u0084C\2\u027c\u027e\7\u0098\2\2\u027d\u027b\3\2\2\2\u027d"+
		"\u027c\3\2\2\2\u027e!\3\2\2\2\u027f\u0281\7\62\2\2\u0280\u0282\5$\23\2"+
		"\u0281\u0280\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0286"+
		"\5&\24\2\u0284\u0286\5(\25\2\u0285\u0283\3\2\2\2\u0285\u0284\3\2\2\2\u0286"+
		"\u0288\3\2\2\2\u0287\u0289\5J&\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2"+
		"\2\u0289#\3\2\2\2\u028a\u028b\7\u0100\2\2\u028b%\3\2\2\2\u028c\u028e\7"+
		"T\2\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0290\3\2\2\2\u028f"+
		"\u0291\7\37\2\2\u0290\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3"+
		"\2\2\2\u0292\u0294\5j\66\2\u0293\u0295\7 \2\2\u0294\u0293\3\2\2\2\u0294"+
		"\u0295\3\2\2\2\u0295\u029a\3\2\2\2\u0296\u0298\7_\2\2\u0297\u0296\3\2"+
		"\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029b\58\35\2\u029a"+
		"\u0297\3\2\2\2\u029a\u029b\3\2\2\2\u029b\'\3\2\2\2\u029c\u029d\5*\26\2"+
		"\u029d\u029e\7T\2\2\u029e\u029f\5@!\2\u029f\u02a6\3\2\2\2\u02a0\u02a1"+
		"\7T\2\2\u02a1\u02a2\5*\26\2\u02a2\u02a3\7]\2\2\u02a3\u02a4\5@!\2\u02a4"+
		"\u02a6\3\2\2\2\u02a5\u029c\3\2\2\2\u02a5\u02a0\3\2\2\2\u02a6)\3\2\2\2"+
		"\u02a7\u02a9\5j\66\2\u02a8\u02aa\7\25\2\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa"+
		"\3\2\2\2\u02aa\u02b2\3\2\2\2\u02ab\u02ac\7%\2\2\u02ac\u02ae\5j\66\2\u02ad"+
		"\u02af\7\25\2\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b1\3"+
		"\2\2\2\u02b0\u02ab\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2"+
		"\u02b3\3\2\2\2\u02b3+\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b6\5.\30\2"+
		"\u02b6-\3\2\2\2\u02b7\u02bf\5\60\31\2\u02b8\u02ba\7M\2\2\u02b9\u02bb\t"+
		"\3\2\2\u02ba\u02b9\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc"+
		"\u02be\5\60\31\2\u02bd\u02b8\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3"+
		"\2\2\2\u02bf\u02c0\3\2\2\2\u02c0/\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c4"+
		"\7/\2\2\u02c3\u02c5\5\62\32\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2"+
		"\u02c5\u02c6\3\2\2\2\u02c6\u02c8\5\64\33\2\u02c7\u02c9\5> \2\u02c8\u02c7"+
		"\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02cc\5J&\2\u02cb"+
		"\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02cf\5L"+
		"\'\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0"+
		"\u02d2\5N(\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d4\3\2\2"+
		"\2\u02d3\u02d5\5\u00acW\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5"+
		"\61\3\2\2\2\u02d6\u02d7\t\3\2\2\u02d7\63\3\2\2\2\u02d8\u02db\5:\36\2\u02d9"+
		"\u02db\5\66\34\2\u02da\u02d8\3\2\2\2\u02da\u02d9\3\2\2\2\u02db\u02e0\3"+
		"\2\2\2\u02dc\u02dd\7%\2\2\u02dd\u02df\5\66\34\2\u02de\u02dc\3\2\2\2\u02df"+
		"\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\65\3\2\2"+
		"\2\u02e2\u02e0\3\2\2\2\u02e3\u02e6\5l\67\2\u02e4\u02e6\5\u0084C\2\u02e5"+
		"\u02e3\3\2\2\2\u02e5\u02e4\3\2\2\2\u02e6\u02eb\3\2\2\2\u02e7\u02e9\7_"+
		"\2\2\u02e8\u02e7\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u02ec\58\35\2\u02eb\u02e8\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ef\3\2"+
		"\2\2\u02ed\u02ef\5<\37\2\u02ee\u02e5\3\2\2\2\u02ee\u02ed\3\2\2\2\u02ef"+
		"\67\3\2\2\2\u02f0\u02f3\5d\63\2\u02f1\u02f3\7\u0171\2\2\u02f2\u02f0\3"+
		"\2\2\2\u02f2\u02f1\3\2\2\2\u02f39\3\2\2\2\u02f4\u02f5\7\21\2\2\u02f5;"+
		"\3\2\2\2\u02f6\u02f7\5d\63\2\u02f7\u02f8\7\25\2\2\u02f8=\3\2\2\2\u02f9"+
		"\u02fa\7T\2\2\u02fa\u02fb\5@!\2\u02fb?\3\2\2\2\u02fc\u0301\5B\"\2\u02fd"+
		"\u02fe\7%\2\2\u02fe\u0300\5B\"\2\u02ff\u02fd\3\2\2\2\u0300\u0303\3\2\2"+
		"\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302A\3\2\2\2\u0303\u0301"+
		"\3\2\2\2\u0304\u0308\5D#\2\u0305\u0307\5F$\2\u0306\u0305\3\2\2\2\u0307"+
		"\u030a\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309C\3\2\2\2"+
		"\u030a\u0308\3\2\2\2\u030b\u0310\5j\66\2\u030c\u030e\7_\2\2\u030d\u030c"+
		"\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0311\58\35\2\u0310"+
		"\u030d\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u031f\3\2\2\2\u0312\u0314\5P"+
		")\2\u0313\u0315\7_\2\2\u0314\u0313\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316"+
		"\3\2\2\2\u0316\u0318\58\35\2\u0317\u0319\5r:\2\u0318\u0317\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\u031f\3\2\2\2\u031a\u031b\7\37\2\2\u031b\u031c\5"+
		"@!\2\u031c\u031d\7 \2\2\u031d\u031f\3\2\2\2\u031e\u030b\3\2\2\2\u031e"+
		"\u0312\3\2\2\2\u031e\u031a\3\2\2\2\u031fE\3\2\2\2\u0320\u0322\7U\2\2\u0321"+
		"\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0324\3\2\2\2\u0323\u0325\t\4"+
		"\2\2\u0324\u0323\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\u0327\7V\2\2\u0327\u0328\3\2\2\2\u0328\u032a\5D#\2\u0329\u032b\5H%\2"+
		"\u032a\u0329\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u0339\3\2\2\2\u032c\u032e"+
		"\7U\2\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\3\2\2\2\u032f"+
		"\u0331\t\5\2\2\u0330\u0332\7Y\2\2\u0331\u0330\3\2\2\2\u0331\u0332\3\2"+
		"\2\2\u0332\u0333\3\2\2\2\u0333\u0334\7V\2\2\u0334\u0336\5D#\2\u0335\u0337"+
		"\5H%\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0339\3\2\2\2\u0338"+
		"\u0321\3\2\2\2\u0338\u032d\3\2\2\2\u0339G\3\2\2\2\u033a\u033b\7`\2\2\u033b"+
		"\u033f\5\u0084C\2\u033c\u033d\7]\2\2\u033d\u033f\5r:\2\u033e\u033a\3\2"+
		"\2\2\u033e\u033c\3\2\2\2\u033fI\3\2\2\2\u0340\u0341\7^\2\2\u0341\u0342"+
		"\5\u0084C\2\u0342K\3\2\2\2\u0343\u0344\7t\2\2\u0344\u0345\7u\2\2\u0345"+
		"\u034a\5\u00aeX\2\u0346\u0347\7%\2\2\u0347\u0349\5\u00aeX\2\u0348\u0346"+
		"\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b"+
		"M\3\2\2\2\u034c\u034a\3\2\2\2\u034d\u034e\7x\2\2\u034e\u034f\5\u0084C"+
		"\2\u034fO\3\2\2\2\u0350\u0351\7\37\2\2\u0351\u0352\5.\30\2\u0352\u0353"+
		"\7 \2\2\u0353Q\3\2\2\2\u0354\u0355\7)\2\2\u0355S\3\2\2\2\u0356\u035e\5"+
		"V,\2\u0357\u035e\5X-\2\u0358\u035e\5Z.\2\u0359\u035e\5\\/\2\u035a\u035e"+
		"\5^\60\2\u035b\u035e\5`\61\2\u035c\u035e\5b\62\2\u035d\u0356\3\2\2\2\u035d"+
		"\u0357\3\2\2\2\u035d\u0358\3\2\2\2\u035d\u0359\3\2\2\2\u035d\u035a\3\2"+
		"\2\2\u035d\u035b\3\2\2\2\u035d\u035c\3\2\2\2\u035eU\3\2\2\2\u035f\u0360"+
		"\7\u0171\2\2\u0360W\3\2\2\2\u0361\u0363\7\20\2\2\u0362\u0361\3\2\2\2\u0362"+
		"\u0363\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\7\u0172\2\2\u0365Y\3\2"+
		"\2\2\u0366\u0367\t\6\2\2\u0367\u036e\7\u0171\2\2\u0368\u0369\7!\2\2\u0369"+
		"\u036a\5d\63\2\u036a\u036b\7\u0171\2\2\u036b\u036c\7\"\2\2\u036c\u036e"+
		"\3\2\2\2\u036d\u0366\3\2\2\2\u036d\u0368\3\2\2\2\u036e[\3\2\2\2\u036f"+
		"\u0370\7\u0173\2\2\u0370]\3\2\2\2\u0371\u0372\7\u0174\2\2\u0372_\3\2\2"+
		"\2\u0373\u0374\t\7\2\2\u0374a\3\2\2\2\u0375\u0376\7j\2\2\u0376c\3\2\2"+
		"\2\u0377\u037a\7\u0170\2\2\u0378\u037a\5f\64\2\u0379\u0377\3\2\2\2\u0379"+
		"\u0378\3\2\2\2\u037ae\3\2\2\2\u037b\u037c\t\b\2\2\u037cg\3\2\2\2\u037d"+
		"\u037e\5d\63\2\u037ei\3\2\2\2\u037f\u0380\5n8\2\u0380\u0381\7\24\2\2\u0381"+
		"\u0383\3\2\2\2\u0382\u037f\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0384\3\2"+
		"\2\2\u0384\u0385\5p9\2\u0385k\3\2\2\2\u0386\u0387\5n8\2\u0387\u0388\7"+
		"\24\2\2\u0388\u038a\3\2\2\2\u0389\u0386\3\2\2\2\u0389\u038a\3\2\2\2\u038a"+
		"\u038b\3\2\2\2\u038b\u038c\5p9\2\u038cm\3\2\2\2\u038d\u038e\5d\63\2\u038e"+
		"o\3\2\2\2\u038f\u0390\5d\63\2\u0390q\3\2\2\2\u0391\u0393\7\37\2\2\u0392"+
		"\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0399\5l"+
		"\67\2\u0395\u0396\7%\2\2\u0396\u0398\5l\67\2\u0397\u0395\3\2\2\2\u0398"+
		"\u039b\3\2\2\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039d\3\2"+
		"\2\2\u039b\u0399\3\2\2\2\u039c\u039e\7 \2\2\u039d\u039c\3\2\2\2\u039d"+
		"\u039e\3\2\2\2\u039es\3\2\2\2\u039f\u03a1\7\37\2\2\u03a0\u039f\3\2\2\2"+
		"\u03a0\u03a1\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a7\5j\66\2\u03a3\u03a4"+
		"\7%\2\2\u03a4\u03a6\5j\66\2\u03a5\u03a3\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7"+
		"\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9\u03a7\3\2"+
		"\2\2\u03aa\u03ac\7 \2\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac"+
		"u\3\2\2\2\u03ad\u03ae\5d\63\2\u03aew\3\2\2\2\u03af\u03b9\7\u0170\2\2\u03b0"+
		"\u03b1\7\u0171\2\2\u03b1\u03b3\7\24\2\2\u03b2\u03b0\3\2\2\2\u03b3\u03b6"+
		"\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b7\3\2\2\2\u03b6"+
		"\u03b4\3\2\2\2\u03b7\u03b9\7\u0171\2\2\u03b8\u03af\3\2\2\2\u03b8\u03b4"+
		"\3\2\2\2\u03b9y\3\2\2\2\u03ba\u03bb\t\t\2\2\u03bb{\3\2\2\2\u03bc\u03c2"+
		"\7\37\2\2\u03bd\u03c0\7\u0172\2\2\u03be\u03bf\7%\2\2\u03bf\u03c1\7\u0172"+
		"\2\2\u03c0\u03be\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c3\3\2\2\2\u03c2"+
		"\u03bd\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5\7 "+
		"\2\2\u03c5}\3\2\2\2\u03c6\u03c8\7@\2\2\u03c7\u03c6\3\2\2\2\u03c7\u03c8"+
		"\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03ca\7C\2\2\u03ca\177\3\2\2\2\u03cb"+
		"\u03d0\5\u0084C\2\u03cc\u03cd\7%\2\2\u03cd\u03cf\5\u0084C\2\u03ce\u03cc"+
		"\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"+
		"\u0081\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3\u03d4\7\37\2\2\u03d4\u03d5\5"+
		"\u0080A\2\u03d5\u03d6\7 \2\2\u03d6\u0083\3\2\2\2\u03d7\u03d8\bC\1\2\u03d8"+
		"\u03d9\5\u0088E\2\u03d9\u03da\5\u0084C\5\u03da\u03e1\3\2\2\2\u03db\u03dc"+
		"\7\37\2\2\u03dc\u03dd\5\u0084C\2\u03dd\u03de\7 \2\2\u03de\u03e1\3\2\2"+
		"\2\u03df\u03e1\5\u008aF\2\u03e0\u03d7\3\2\2\2\u03e0\u03db\3\2\2\2\u03e0"+
		"\u03df\3\2\2\2\u03e1\u03e8\3\2\2\2\u03e2\u03e3\f\6\2\2\u03e3\u03e4\5\u0086"+
		"D\2\u03e4\u03e5\5\u0084C\7\u03e5\u03e7\3\2\2\2\u03e6\u03e2\3\2\2\2\u03e7"+
		"\u03ea\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u0085\3\2"+
		"\2\2\u03ea\u03e8\3\2\2\2\u03eb\u03ec\t\n\2\2\u03ec\u0087\3\2\2\2\u03ed"+
		"\u03ee\t\13\2\2\u03ee\u0089\3\2\2\2\u03ef\u03f0\bF\1\2\u03f0\u03f1\5\u008e"+
		"H\2\u03f1\u0406\3\2\2\2\u03f2\u03f3\f\7\2\2\u03f3\u03f5\7h\2\2\u03f4\u03f6"+
		"\7i\2\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7"+
		"\u0405\t\f\2\2\u03f8\u03f9\f\6\2\2\u03f9\u03fa\7\26\2\2\u03fa\u0405\5"+
		"\u008eH\2\u03fb\u03fc\f\5\2\2\u03fc\u03fd\5\u008cG\2\u03fd\u03fe\5\u008e"+
		"H\2\u03fe\u0405\3\2\2\2\u03ff\u0400\f\4\2\2\u0400\u0401\5\u008cG\2\u0401"+
		"\u0402\t\r\2\2\u0402\u0403\5P)\2\u0403\u0405\3\2\2\2\u0404\u03f2\3\2\2"+
		"\2\u0404\u03f8\3\2\2\2\u0404\u03fb\3\2\2\2\u0404\u03ff\3\2\2\2\u0405\u0408"+
		"\3\2\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u008b\3\2\2\2\u0408"+
		"\u0406\3\2\2\2\u0409\u040a\t\16\2\2\u040a\u008d\3\2\2\2\u040b\u040d\5"+
		"\u0090I\2\u040c\u040e\7i\2\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e"+
		"\u040f\3\2\2\2\u040f\u0410\7o\2\2\u0410\u0411\5P)\2\u0411\u0437\3\2\2"+
		"\2\u0412\u0414\5\u0090I\2\u0413\u0415\7i\2\2\u0414\u0413\3\2\2\2\u0414"+
		"\u0415\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0417\7o\2\2\u0417\u0418\7\37"+
		"\2\2\u0418\u041d\5\u0084C\2\u0419\u041a\7%\2\2\u041a\u041c\5\u0084C\2"+
		"\u041b\u0419\3\2\2\2\u041c\u041f\3\2\2\2\u041d\u041b\3\2\2\2\u041d\u041e"+
		"\3\2\2\2\u041e\u0420\3\2\2\2\u041f\u041d\3\2\2\2\u0420\u0421\7 \2\2\u0421"+
		"\u0437\3\2\2\2\u0422\u0424\5\u0090I\2\u0423\u0425\7i\2\2\u0424\u0423\3"+
		"\2\2\2\u0424\u0425\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0427\7n\2\2\u0427"+
		"\u0428\5\u0090I\2\u0428\u0429\7f\2\2\u0429\u042a\5\u008eH\2\u042a\u0437"+
		"\3\2\2\2\u042b\u042d\5\u0090I\2\u042c\u042e\7i\2\2\u042d\u042c\3\2\2\2"+
		"\u042d\u042e\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0430\7r\2\2\u0430\u0433"+
		"\5\u0092J\2\u0431\u0432\7\u00b5\2\2\u0432\u0434\5\u0092J\2\u0433\u0431"+
		"\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0437\3\2\2\2\u0435\u0437\5\u0090I"+
		"\2\u0436\u040b\3\2\2\2\u0436\u0412\3\2\2\2\u0436\u0422\3\2\2\2\u0436\u042b"+
		"\3\2\2\2\u0436\u0435\3\2\2\2\u0437\u008f\3\2\2\2\u0438\u0439\bI\1\2\u0439"+
		"\u043a\5\u0092J\2\u043a\u045b\3\2\2\2\u043b\u043c\f\r\2\2\u043c\u043d"+
		"\7\b\2\2\u043d\u045a\5\u0090I\16\u043e\u043f\f\f\2\2\u043f\u0440\7\t\2"+
		"\2\u0440\u045a\5\u0090I\r\u0441\u0442\f\13\2\2\u0442\u0443\7\n\2\2\u0443"+
		"\u045a\5\u0090I\f\u0444\u0445\f\n\2\2\u0445\u0446\7\13\2\2\u0446\u045a"+
		"\5\u0090I\13\u0447\u0448\f\t\2\2\u0448\u0449\7\17\2\2\u0449\u045a\5\u0090"+
		"I\n\u044a\u044b\f\b\2\2\u044b\u044c\7\20\2\2\u044c\u045a\5\u0090I\t\u044d"+
		"\u044e\f\7\2\2\u044e\u044f\7\21\2\2\u044f\u045a\5\u0090I\b\u0450\u0451"+
		"\f\6\2\2\u0451\u0452\7\22\2\2\u0452\u045a\5\u0090I\7\u0453\u0454\f\5\2"+
		"\2\u0454\u0455\7\r\2\2\u0455\u045a\5\u0090I\6\u0456\u0457\f\4\2\2\u0457"+
		"\u0458\7\f\2\2\u0458\u045a\5\u0090I\5\u0459\u043b\3\2\2\2\u0459\u043e"+
		"\3\2\2\2\u0459\u0441\3\2\2\2\u0459\u0444\3\2\2\2\u0459\u0447\3\2\2\2\u0459"+
		"\u044a\3\2\2\2\u0459\u044d\3\2\2\2\u0459\u0450\3\2\2\2\u0459\u0453\3\2"+
		"\2\2\u0459\u0456\3\2\2\2\u045a\u045d\3\2\2\2\u045b\u0459\3\2\2\2\u045b"+
		"\u045c\3\2\2\2\u045c\u0091\3\2\2\2\u045d\u045b\3\2\2\2\u045e\u045f\bJ"+
		"\1\2\u045f\u047f\5\u0094K\2\u0460\u047f\5R*\2\u0461\u047f\5T+\2\u0462"+
		"\u047f\5l\67\2\u0463\u0464\t\17\2\2\u0464\u047f\5\u0092J\b\u0465\u0467"+
		"\7\u00b8\2\2\u0466\u0465\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0468\3\2\2"+
		"\2\u0468\u0469\7\37\2\2\u0469\u046e\5\u0084C\2\u046a\u046b\7%\2\2\u046b"+
		"\u046d\5\u0084C\2\u046c\u046a\3\2\2\2\u046d\u0470\3\2\2\2\u046e\u046c"+
		"\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0471\3\2\2\2\u0470\u046e\3\2\2\2\u0471"+
		"\u0472\7 \2\2\u0472\u047f\3\2\2\2\u0473\u0475\7m\2\2\u0474\u0473\3\2\2"+
		"\2\u0474\u0475\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u047f\5P)\2\u0477\u0478"+
		"\7!\2\2\u0478\u0479\5d\63\2\u0479\u047a\5\u0084C\2\u047a\u047b\7\"\2\2"+
		"\u047b\u047f\3\2\2\2\u047c\u047f\5\u00a6T\2\u047d\u047f\5\u00c6d\2\u047e"+
		"\u045e\3\2\2\2\u047e\u0460\3\2\2\2\u047e\u0461\3\2\2\2\u047e\u0462\3\2"+
		"\2\2\u047e\u0463\3\2\2\2\u047e\u0466\3\2\2\2\u047e\u0474\3\2\2\2\u047e"+
		"\u0477\3\2\2\2\u047e\u047c\3\2\2\2\u047e\u047d\3\2\2\2\u047f\u0485\3\2"+
		"\2\2\u0480\u0481\f\t\2\2\u0481\u0482\7\5\2\2\u0482\u0484\5\u0092J\n\u0483"+
		"\u0480\3\2\2\2\u0484\u0487\3\2\2\2\u0485\u0483\3\2\2\2\u0485\u0486\3\2"+
		"\2\2\u0486\u0093\3\2\2\2\u0487\u0485\3\2\2\2\u0488\u048c\5\u0096L\2\u0489"+
		"\u048c\5\u009cO\2\u048a\u048c\5\u00a2R\2\u048b\u0488\3\2\2\2\u048b\u0489"+
		"\3\2\2\2\u048b\u048a\3\2\2\2\u048c\u0095\3\2\2\2\u048d\u048e\5\u0098M"+
		"\2\u048e\u0490\7\37\2\2\u048f\u0491\5\u009aN\2\u0490\u048f\3\2\2\2\u0490"+
		"\u0491\3\2\2\2\u0491\u049b\3\2\2\2\u0492\u0497\5\u0084C\2\u0493\u0494"+
		"\7%\2\2\u0494\u0496\5\u0084C\2\u0495\u0493\3\2\2\2\u0496\u0499\3\2\2\2"+
		"\u0497\u0495\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u049c\3\2\2\2\u0499\u0497"+
		"\3\2\2\2\u049a\u049c\7\21\2\2\u049b\u0492\3\2\2\2\u049b\u049a\3\2\2\2"+
		"\u049b\u049c\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\7 \2\2\u049e\u0097"+
		"\3\2\2\2\u049f\u04a0\t\20\2\2\u04a0\u0099\3\2\2\2\u04a1\u04a2\7N\2\2\u04a2"+
		"\u009b\3\2\2\2\u04a3\u04a6\5\u009eP\2\u04a4\u04a6\5\u00a0Q\2\u04a5\u04a3"+
		"\3\2\2\2\u04a5\u04a4\3\2\2\2\u04a6\u009d\3\2\2\2\u04a7\u04a8\7Q\2\2\u04a8"+
		"\u04a9\7\37\2\2\u04a9\u04aa\5\u0084C\2\u04aa\u04ab\7_\2\2\u04ab\u04ac"+
		"\5\u00bc_\2\u04ac\u04ad\7 \2\2\u04ad\u009f\3\2\2\2\u04ae\u04af\7\u0081"+
		"\2\2\u04af\u04b0\7\37\2\2\u04b0\u04b5\5\u0084C\2\u04b1\u04b2\7%\2\2\u04b2"+
		"\u04b4\5\u0084C\2\u04b3\u04b1\3\2\2\2\u04b4\u04b7\3\2\2\2\u04b5\u04b3"+
		"\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04ba\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b8"+
		"\u04b9\7]\2\2\u04b9\u04bb\5\u00d6l\2\u04ba\u04b8\3\2\2\2\u04ba\u04bb\3"+
		"\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd\7 \2\2\u04bd\u00a1\3\2\2\2\u04be"+
		"\u04bf\5\u00a4S\2\u04bf\u04c9\7\37\2\2\u04c0\u04c5\5\u0084C\2\u04c1\u04c2"+
		"\7%\2\2\u04c2\u04c4\5\u0084C\2\u04c3\u04c1\3\2\2\2\u04c4\u04c7\3\2\2\2"+
		"\u04c5\u04c3\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04ca\3\2\2\2\u04c7\u04c5"+
		"\3\2\2\2\u04c8\u04ca\7\21\2\2\u04c9\u04c0\3\2\2\2\u04c9\u04c8\3\2\2\2"+
		"\u04c9\u04ca\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc\7 \2\2\u04cc\u00a3"+
		"\3\2\2\2\u04cd\u04d3\5d\63\2\u04ce\u04d3\7a\2\2\u04cf\u04d3\7\u0088\2"+
		"\2\u04d0\u04d3\7\u0089\2\2\u04d1\u04d3\7\u0084\2\2\u04d2\u04cd\3\2\2\2"+
		"\u04d2\u04ce\3\2\2\2\u04d2\u04cf\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d2\u04d1"+
		"\3\2\2\2\u04d3\u00a5\3\2\2\2\u04d4\u04d6\7O\2\2\u04d5\u04d7\5\u0092J\2"+
		"\u04d6\u04d5\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d9\3\2\2\2\u04d8\u04da"+
		"\5\u00a8U\2\u04d9\u04d8\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04d9\3\2\2"+
		"\2\u04db\u04dc\3\2\2\2\u04dc\u04de\3\2\2\2\u04dd\u04df\5\u00aaV\2\u04de"+
		"\u04dd\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u00a7\3\2\2\2\u04e0\u04e1\7P"+
		"\2\2\u04e1\u04e2\5\u0084C\2\u04e2\u04e3\7c\2\2\u04e3\u04e4\5\u0084C\2"+
		"\u04e4\u00a9\3\2\2\2\u04e5\u04e6\7b\2\2\u04e6\u04e7\5\u0084C\2\u04e7\u00ab"+
		"\3\2\2\2\u04e8\u04e9\7s\2\2\u04e9\u04ea\7u\2\2\u04ea\u04ef\5\u00aeX\2"+
		"\u04eb\u04ec\7%\2\2\u04ec\u04ee\5\u00aeX\2\u04ed\u04eb\3\2\2\2\u04ee\u04f1"+
		"\3\2\2\2\u04ef\u04ed\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u00ad\3\2\2\2\u04f1"+
		"\u04ef\3\2\2\2\u04f2\u04f6\5l\67\2\u04f3\u04f6\5X-\2\u04f4\u04f6\5\u0084"+
		"C\2\u04f5\u04f2\3\2\2\2\u04f5\u04f3\3\2\2\2\u04f5\u04f4\3\2\2\2\u04f6"+
		"\u04f8\3\2\2\2\u04f7\u04f9\t\21\2\2\u04f8\u04f7\3\2\2\2\u04f8\u04f9\3"+
		"\2\2\2\u04f9\u00af\3\2\2\2\u04fa\u04fb\5x=\2\u04fb\u00b1\3\2\2\2\u04fc"+
		"\u04fd\7\u0170\2\2\u04fd\u00b3\3\2\2\2\u04fe\u0503\5\u0092J\2\u04ff\u0500"+
		"\7%\2\2\u0500\u0502\5\u0092J\2\u0501\u04ff\3\2\2\2\u0502\u0505\3\2\2\2"+
		"\u0503\u0501\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u00b5\3\2\2\2\u0505\u0503"+
		"\3\2\2\2\u0506\u0509\5\u00b0Y\2\u0507\u0509\5l\67\2\u0508\u0506\3\2\2"+
		"\2\u0508\u0507\3\2\2\2\u0509\u00b7\3\2\2\2\u050a\u050f\5\u00b6\\\2\u050b"+
		"\u050c\7%\2\2\u050c\u050e\5\u00b6\\\2\u050d\u050b\3\2\2\2\u050e\u0511"+
		"\3\2\2\2\u050f\u050d\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u00b9\3\2\2\2\u0511"+
		"\u050f\3\2\2\2\u0512\u0513\7\37\2\2\u0513\u0514\5\u00b8]\2\u0514\u0515"+
		"\7 \2\2\u0515\u00bb\3\2\2\2\u0516\u0518\5\u00c0a\2\u0517\u0519\5|?\2\u0518"+
		"\u0517\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u0522\3\2\2\2\u051a\u0522\5\u00be"+
		"`\2\u051b\u051d\5\u00c0a\2\u051c\u051e\5|?\2\u051d\u051c\3\2\2\2\u051d"+
		"\u051e\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0520\5\u00c2b\2\u0520\u0522"+
		"\3\2\2\2\u0521\u0516\3\2\2\2\u0521\u051a\3\2\2\2\u0521\u051b\3\2\2\2\u0522"+
		"\u00bd\3\2\2\2\u0523\u0524\5\u00c0a\2\u0524\u0525\7\37\2\2\u0525\u0526"+
		"\7\u0172\2\2\u0526\u0527\7\u0081\2\2\u0527\u0528\7 \2\2\u0528\u053b\3"+
		"\2\2\2\u0529\u052a\7\u00fb\2\2\u052a\u052c\5\u00c0a\2\u052b\u052d\7\u0118"+
		"\2\2\u052c\u052b\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052e\3\2\2\2\u052e"+
		"\u052f\7\37\2\2\u052f\u0530\7\u0172\2\2\u0530\u0531\7 \2\2\u0531\u053b"+
		"\3\2\2\2\u0532\u0534\5\u00c0a\2\u0533\u0535\7\37\2\2\u0534\u0533\3\2\2"+
		"\2\u0534\u0535\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0538\5l\67\2\u0537\u0539"+
		"\7 \2\2\u0538\u0537\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053b\3\2\2\2\u053a"+
		"\u0523\3\2\2\2\u053a\u0529\3\2\2\2\u053a\u0532\3\2\2\2\u053b\u00bf\3\2"+
		"\2\2\u053c\u0577\7\u0081\2\2\u053d\u0577\7\u0158\2\2\u053e\u0577\7\u0159"+
		"\2\2\u053f\u0577\7\u015a\2\2\u0540\u0577\7\u015b\2\2\u0541\u0577\7\u015c"+
		"\2\2\u0542\u0577\7\u015d\2\2\u0543\u0544\7\u015d\2\2\u0544\u0577\7\u0159"+
		"\2\2\u0545\u0577\7\u015e\2\2\u0546\u0577\7\u015f\2\2\u0547\u0577\7\u0160"+
		"\2\2\u0548\u0577\7\u0161\2\2\u0549\u0577\7\u0162\2\2\u054a\u0577\7\177"+
		"\2\2\u054b\u0577\7\u0163\2\2\u054c\u0577\7\u0164\2\2\u054d\u0577\7\u00ab"+
		"\2\2\u054e\u0577\7\u0165\2\2\u054f\u0577\7U\2\2\u0550\u0577\7\u0166\2"+
		"\2\u0551\u0577\7\u0167\2\2\u0552\u0577\7\u0168\2\2\u0553\u0577\7\u0169"+
		"\2\2\u0554\u0577\7\u016a\2\2\u0555\u0577\7\u016b\2\2\u0556\u0577\7\u016c"+
		"\2\2\u0557\u0577\7\u016d\2\2\u0558\u0577\7\u0085\2\2\u0559\u0577\7\u0087"+
		"\2\2\u055a\u055b\7\u0087\2\2\u055b\u055c\7L\2\2\u055c\u055d\7\u0086\2"+
		"\2\u055d\u0577\7\u011a\2\2\u055e\u055f\7\u0087\2\2\u055f\u0560\7L\2\2"+
		"\u0560\u0561\7\u00a4\2\2\u0561\u0562\7\u0086\2\2\u0562\u0577\7\u011a\2"+
		"\2\u0563\u0564\7\u0084\2\2\u0564\u0565\7\u008e\2\2\u0565\u0566\7e\2\2"+
		"\u0566\u0577\7\u0091\2\2\u0567\u0568\7\u0084\2\2\u0568\u0569\7\u008a\2"+
		"\2\u0569\u056a\7e\2\2\u056a\u0577\7\u008c\2\2\u056b\u0577\7\u016e\2\2"+
		"\u056c\u0577\7\u00b2\2\2\u056d\u0577\7\u00ac\2\2\u056e\u056f\7\u0080\2"+
		"\2\u056f\u0577\7E\2\2\u0570\u0577\7\u00af\2\2\u0571\u0577\7\u00b0\2\2"+
		"\u0572\u0577\7\u00ad\2\2\u0573\u0577\7\u00b1\2\2\u0574\u0577\7\u016f\2"+
		"\2\u0575\u0577\7\u0170\2\2\u0576\u053c\3\2\2\2\u0576\u053d\3\2\2\2\u0576"+
		"\u053e\3\2\2\2\u0576\u053f\3\2\2\2\u0576\u0540\3\2\2\2\u0576\u0541\3\2"+
		"\2\2\u0576\u0542\3\2\2\2\u0576\u0543\3\2\2\2\u0576\u0545\3\2\2\2\u0576"+
		"\u0546\3\2\2\2\u0576\u0547\3\2\2\2\u0576\u0548\3\2\2\2\u0576\u0549\3\2"+
		"\2\2\u0576\u054a\3\2\2\2\u0576\u054b\3\2\2\2\u0576\u054c\3\2\2\2\u0576"+
		"\u054d\3\2\2\2\u0576\u054e\3\2\2\2\u0576\u054f\3\2\2\2\u0576\u0550\3\2"+
		"\2\2\u0576\u0551\3\2\2\2\u0576\u0552\3\2\2\2\u0576\u0553\3\2\2\2\u0576"+
		"\u0554\3\2\2\2\u0576\u0555\3\2\2\2\u0576\u0556\3\2\2\2\u0576\u0557\3\2"+
		"\2\2\u0576\u0558\3\2\2\2\u0576\u0559\3\2\2\2\u0576\u055a\3\2\2\2\u0576"+
		"\u055e\3\2\2\2\u0576\u0563\3\2\2\2\u0576\u0567\3\2\2\2\u0576\u056b\3\2"+
		"\2\2\u0576\u056c\3\2\2\2\u0576\u056d\3\2\2\2\u0576\u056e\3\2\2\2\u0576"+
		"\u0570\3\2\2\2\u0576\u0571\3\2\2\2\u0576\u0572\3\2\2\2\u0576\u0573\3\2"+
		"\2\2\u0576\u0574\3\2\2\2\u0576\u0575\3\2\2\2\u0577\u00c1\3\2\2\2\u0578"+
		"\u057a\7L\2\2\u0579\u057b\7\u00a4\2\2\u057a\u0579\3\2\2\2\u057a\u057b"+
		"\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u057d\7\u0086\2\2\u057d\u057f\7\u011a"+
		"\2\2\u057e\u0578\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u058a\3\2\2\2\u0580"+
		"\u0581\7e\2\2\u0581\u058a\7\u008c\2\2\u0582\u0583\7e\2\2\u0583\u0587\7"+
		"\u0091\2\2\u0584\u0585\7\37\2\2\u0585\u0586\7\u0172\2\2\u0586\u0588\7"+
		" \2\2\u0587\u0584\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u058a\3\2\2\2\u0589"+
		"\u057e\3\2\2\2\u0589\u0580\3\2\2\2\u0589\u0582\3\2\2\2\u058a\u00c3\3\2"+
		"\2\2\u058b\u058c\7\u0112\2\2\u058c\u058d\7\37\2\2\u058d\u058e\5\u0084"+
		"C\2\u058e\u0590\7_\2\2\u058f\u0591\7\u0103\2\2\u0590\u058f\3\2\2\2\u0590"+
		"\u0591\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0593\5\u00c0a\2\u0593\u0594"+
		"\7 \2\2\u0594\u00c5\3\2\2\2\u0595\u059b\5\u00c4c\2\u0596\u059b\5\u00c8"+
		"e\2\u0597\u059b\5\u00d0i\2\u0598\u059b\5\u00d2j\2\u0599\u059b\5\u00d4"+
		"k\2\u059a\u0595\3\2\2\2\u059a\u0596\3\2\2\2\u059a\u0597\3\2\2\2\u059a"+
		"\u0598\3\2\2\2\u059a\u0599\3\2\2\2\u059b\u00c7\3\2\2\2\u059c\u059f\7O"+
		"\2\2\u059d\u05a0\5\u00caf\2\u059e\u05a0\5\u00ccg\2\u059f\u059d\3\2\2\2"+
		"\u059f\u059e\3\2\2\2\u05a0\u05a2\3\2\2\2\u05a1\u05a3\5\u00ceh\2\u05a2"+
		"\u05a1\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a5\7\u00e8"+
		"\2\2\u05a5\u00c9\3\2\2\2\u05a6\u05a8\5\u0084C\2\u05a7\u05a9\5\u00ccg\2"+
		"\u05a8\u05a7\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05a8\3\2\2\2\u05aa\u05ab"+
		"\3\2\2\2\u05ab\u00cb\3\2\2\2\u05ac\u05ad\7P\2\2\u05ad\u05ae\5\u0084C\2"+
		"\u05ae\u05af\7c\2\2\u05af\u05b0\5\u0092J\2\u05b0\u00cd\3\2\2\2\u05b1\u05b2"+
		"\7b\2\2\u05b2\u05b3\5\u0084C\2\u05b3\u00cf\3\2\2\2\u05b4\u05b5\7\37\2"+
		"\2\u05b5\u05b6\5\u0084C\2\u05b6\u05b7\7\20\2\2\u05b7\u05b8\5\u0084C\2"+
		"\u05b8\u05ce\7 \2\2\u05b9\u05bd\7\u008e\2\2\u05ba\u05bb\7\37\2\2\u05bb"+
		"\u05bc\7\u0172\2\2\u05bc\u05be\7 \2\2\u05bd\u05ba\3\2\2\2\u05bd\u05be"+
		"\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c0\7e\2\2\u05c0\u05c4\7\u0091\2"+
		"\2\u05c1\u05c2\7\37\2\2\u05c2\u05c3\7\u0172\2\2\u05c3\u05c5\7 \2\2\u05c4"+
		"\u05c1\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05cf\3\2\2\2\u05c6\u05ca\7\u008a"+
		"\2\2\u05c7\u05c8\7\37\2\2\u05c8\u05c9\7\u0172\2\2\u05c9\u05cb\7 \2\2\u05ca"+
		"\u05c7\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd\7e"+
		"\2\2\u05cd\u05cf\7\u008c\2\2\u05ce\u05b9\3\2\2\2\u05ce\u05c6\3\2\2\2\u05cf"+
		"\u00d1\3\2\2\2\u05d0\u05d1\7\37\2\2\u05d1\u05d2\5\u0092J\2\u05d2\u05d3"+
		"\7 \2\2\u05d3\u05d6\3\2\2\2\u05d4\u05d6\5\u00c4c\2\u05d5\u05d0\3\2\2\2"+
		"\u05d5\u05d4\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05e5\7\24\2\2\u05d8\u05dd"+
		"\5\u00b0Y\2\u05d9\u05da\7\24\2\2\u05da\u05dc\5\u00b0Y\2\u05db\u05d9\3"+
		"\2\2\2\u05dc\u05df\3\2\2\2\u05dd\u05db\3\2\2\2\u05dd\u05de\3\2\2\2\u05de"+
		"\u05e2\3\2\2\2\u05df\u05dd\3\2\2\2\u05e0\u05e1\7\24\2\2\u05e1\u05e3\5"+
		"\u0094K\2\u05e2\u05e0\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e6\3\2\2\2"+
		"\u05e4\u05e6\5\u0094K\2\u05e5\u05d8\3\2\2\2\u05e5\u05e4\3\2\2\2\u05e6"+
		"\u00d3\3\2\2\2\u05e7\u05e8\7\u00fc\2\2\u05e8\u05e9\5\u00c0a\2\u05e9\u05ea"+
		"\5\u0082B\2\u05ea\u00d5\3\2\2\2\u05eb\u05ec\7\u0170\2\2\u05ec\u00d7\3"+
		"\2\2\2\u05ed\u05f2\5\u00d6l\2\u05ee\u05ef\7%\2\2\u05ef\u05f1\5\u00d6l"+
		"\2\u05f0\u05ee\3\2\2\2\u05f1\u05f4\3\2\2\2\u05f2\u05f0\3\2\2\2\u05f2\u05f3"+
		"\3\2\2\2\u05f3\u00d9\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f5\u05f6\7\3\2\2\u05f6"+
		"\u00db\3\2\2\2\u05f7\u05f8\7\63\2\2\u05f8\u05f9\5\u00eav\2\u05f9\u05fa"+
		"\7<\2\2\u05fa\u05fb\5j\66\2\u05fb\u05fc\5\u00f2z\2\u05fc\u00dd\3\2\2\2"+
		"\u05fd\u05fe\7\63\2\2\u05fe\u05ff\5\u011e\u0090\2\u05ff\u0600\7>\2\2\u0600"+
		"\u0601\5v<\2\u0601\u0602\7`\2\2\u0602\u0603\5\u012c\u0097\2\u0603\u00df"+
		"\3\2\2\2\u0604\u0605\7\64\2\2\u0605\u0606\7<\2\2\u0606\u0607\5j\66\2\u0607"+
		"\u0608\5\u0130\u0099\2\u0608\u00e1\3\2\2\2\u0609\u060a\7\64\2\2\u060a"+
		"\u060b\7>\2\2\u060b\u060c\5v<\2\u060c\u060d\5\u0170\u00b9\2\u060d\u00e3"+
		"\3\2\2\2\u060e\u060f\7\65\2\2\u060f\u0610\7<\2\2\u0610\u0611\5j\66\2\u0611"+
		"\u00e5\3\2\2\2\u0612\u0613\7\65\2\2\u0613\u0614\7>\2\2\u0614\u0615\5v"+
		"<\2\u0615\u00e7\3\2\2\2\u0616\u0617\7\66\2\2\u0617\u0618\7<\2\2\u0618"+
		"\u0619\5j\66\2\u0619\u00e9\3\2\2\2\u061a\u061b\7\u00eb\2\2\u061b\u061d"+
		"\7\u0110\2\2\u061c\u061a\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u00eb\3\2\2"+
		"\2\u061e\u061f\7\37\2\2\u061f\u0620\5\u00eex\2\u0620\u0621\7 \2\2\u0621"+
		"\u00ed\3\2\2\2\u0622\u0623\7\u010f\2\2\u0623\u0624\5\u00d6l\2\u0624\u00ef"+
		"\3\2\2\2\u0625\u0626\5\u00b2Z\2\u0626\u00f1\3\2\2\2\u0627\u0628\7\37\2"+
		"\2\u0628\u0629\5\u00f4{\2\u0629\u062a\7 \2\2\u062a\u062c\3\2\2\2\u062b"+
		"\u0627\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u0631\3\2\2\2\u062d\u062e\7`"+
		"\2\2\u062e\u062f\7|\2\2\u062f\u0630\t\22\2\2\u0630\u0632\7\u00b9\2\2\u0631"+
		"\u062d\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u00f3\3\2\2\2\u0633\u0638\5\u00f6"+
		"|\2\u0634\u0635\7%\2\2\u0635\u0637\5\u00f6|\2\u0636\u0634\3\2\2\2\u0637"+
		"\u063a\3\2\2\2\u0638\u0636\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u00f5\3\2"+
		"\2\2\u063a\u0638\3\2\2\2\u063b\u0640\5\u00f8}\2\u063c\u0640\5\u0118\u008d"+
		"\2\u063d\u0640\5\u011a\u008e\2\u063e\u0640\5\u011c\u008f\2\u063f\u063b"+
		"\3\2\2\2\u063f\u063c\3\2\2\2\u063f\u063d\3\2\2\2\u063f\u063e\3\2\2\2\u0640"+
		"\u00f7\3\2\2\2\u0641\u0642\5l\67\2\u0642\u0644\5\u00bc_\2\u0643\u0645"+
		"\7\u010c\2\2\u0644\u0643\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0646\3\2\2"+
		"\2\u0646\u064b\5\u00fa~\2\u0647\u0648\5\u00fc\177\2\u0648\u0649\5\u0084"+
		"C\2\u0649\u064c\3\2\2\2\u064a\u064c\5\u00fe\u0080\2\u064b\u0647\3\2\2"+
		"\2\u064b\u064a\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064f\3\2\2\2\u064d\u064e"+
		"\7\u00e1\2\2\u064e\u0650\5\u0104\u0083\2\u064f\u064d\3\2\2\2\u064f\u0650"+
		"\3\2\2\2\u0650\u0657\3\2\2\2\u0651\u0653\5\u0106\u0084\2\u0652\u0651\3"+
		"\2\2\2\u0653\u0654\3\2\2\2\u0654\u0652\3\2\2\2\u0654\u0655\3\2\2\2\u0655"+
		"\u0658\3\2\2\2\u0656\u0658\5\u0116\u008c\2\u0657\u0652\3\2\2\2\u0657\u0656"+
		"\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u00f9\3\2\2\2\u0659\u065b\t\23\2\2"+
		"\u065a\u0659\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u00fb\3\2\2\2\u065c\u065f"+
		"\7\u0098\2\2\u065d\u065e\7`\2\2\u065e\u0660\7j\2\2\u065f\u065d\3\2\2\2"+
		"\u065f\u0660\3\2\2\2\u0660\u00fd\3\2\2\2\u0661\u0669\7\u00be\2\2\u0662"+
		"\u066a\7\u00bb\2\2\u0663\u0664\7u\2\2\u0664\u0667\7\u0098\2\2\u0665\u0666"+
		"\7`\2\2\u0666\u0668\7j\2\2\u0667\u0665\3\2\2\2\u0667\u0668\3\2\2\2\u0668"+
		"\u066a\3\2\2\2\u0669\u0662\3\2\2\2\u0669\u0663\3\2\2\2\u066a\u066b\3\2"+
		"\2\2\u066b\u066c\7_\2\2\u066c\u066d\7\u00ed\2\2\u066d\u066e\5\u0100\u0081"+
		"\2\u066e\u00ff\3\2\2\2\u066f\u0671\7\37\2\2\u0670\u066f\3\2\2\2\u0670"+
		"\u0671\3\2\2\2\u0671\u0677\3\2\2\2\u0672\u0674\5\u0102\u0082\2\u0673\u0672"+
		"\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0673\3\2\2\2\u0675\u0676\3\2\2\2\u0676"+
		"\u0678\3\2\2\2\u0677\u0673\3\2\2\2\u0677\u0678\3\2\2\2\u0678\u067a\3\2"+
		"\2\2\u0679\u067b\7 \2\2\u067a\u0679\3\2\2\2\u067a\u067b\3\2\2\2\u067b"+
		"\u0101\3\2\2\2\u067c\u067d\7\u00c3\2\2\u067d\u0681\7L\2\2\u067e\u0682"+
		"\7\u0172\2\2\u067f\u0680\7y\2\2\u0680\u0682\7\u0117\2\2\u0681\u067e\3"+
		"\2\2\2\u0681\u067f\3\2\2\2\u0682\u0694\3\2\2\2\u0683\u0684\7\u00ef\2\2"+
		"\u0684\u0685\7u\2\2\u0685\u0694\7\u0172\2\2\u0686\u0687\7\u00f4\2\2\u0687"+
		"\u0694\7\u0172\2\2\u0688\u0694\7\u00f6\2\2\u0689\u068a\7\u00f5\2\2\u068a"+
		"\u0694\7\u0172\2\2\u068b\u0694\7\u00f7\2\2\u068c\u0694\7\u00de\2\2\u068d"+
		"\u0694\7\u00df\2\2\u068e\u068f\7\u00d9\2\2\u068f\u0694\7\u0172\2\2\u0690"+
		"\u0694\7\u00da\2\2\u0691\u0694\7s\2\2\u0692\u0694\7\u00fd\2\2\u0693\u067c"+
		"\3\2\2\2\u0693\u0683\3\2\2\2\u0693\u0686\3\2\2\2\u0693\u0688\3\2\2\2\u0693"+
		"\u0689\3\2\2\2\u0693\u068b\3\2\2\2\u0693\u068c\3\2\2\2\u0693\u068d\3\2"+
		"\2\2\u0693\u068e\3\2\2\2\u0693\u0690\3\2\2\2\u0693\u0691\3\2\2\2\u0693"+
		"\u0692\3\2\2\2\u0694\u0103\3\2\2\2\u0695\u0696\7]\2\2\u0696\u0698\7\u0171"+
		"\2\2\u0697\u0695\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u069c\3\2\2\2\u0699"+
		"\u069a\7\u00ec\2\2\u069a\u069b\7u\2\2\u069b\u069d\7\u0171\2\2\u069c\u0699"+
		"\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069f\3\2\2\2\u069e\u06a0\7\u0171\2"+
		"\2\u069f\u069e\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a5\3\2\2\2\u06a1\u06a3"+
		"\7\u0113\2\2\u06a2\u06a1\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a4\3\2\2"+
		"\2\u06a4\u06a6\7\u010a\2\2\u06a5\u06a2\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6"+
		"\u0105\3\2\2\2\u06a7\u06a8\7?\2\2\u06a8\u06aa\5\u00d6l\2\u06a9\u06a7\3"+
		"\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06b7\3\2\2\2\u06ab\u06ad\7i\2\2\u06ac"+
		"\u06ab\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06b8\7j"+
		"\2\2\u06af\u06b8\7A\2\2\u06b0\u06b8\5~@\2\u06b1\u06b8\5\u0108\u0085\2"+
		"\u06b2\u06b3\7\u00bd\2\2\u06b3\u06b4\7\37\2\2\u06b4\u06b5\5\u0084C\2\u06b5"+
		"\u06b6\7 \2\2\u06b6\u06b8\3\2\2\2\u06b7\u06ac\3\2\2\2\u06b7\u06af\3\2"+
		"\2\2\u06b7\u06b0\3\2\2\2\u06b7\u06b1\3\2\2\2\u06b7\u06b2\3\2\2\2\u06b8"+
		"\u06bc\3\2\2\2\u06b9\u06bb\5\u010a\u0086\2\u06ba\u06b9\3\2\2\2\u06bb\u06be"+
		"\3\2\2\2\u06bc\u06ba\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u0107\3\2\2\2\u06be"+
		"\u06bc\3\2\2\2\u06bf\u06c0\7\u00c2\2\2\u06c0\u06c2\5j\66\2\u06c1\u06c3"+
		"\5r:\2\u06c2\u06c1\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06cb\3\2\2\2\u06c4"+
		"\u06c5\7`\2\2\u06c5\u06c9\7\62\2\2\u06c6\u06ca\7\u00bc\2\2\u06c7\u06c8"+
		"\7;\2\2\u06c8\u06ca\7j\2\2\u06c9\u06c6\3\2\2\2\u06c9\u06c7\3\2\2\2\u06ca"+
		"\u06cc\3\2\2\2\u06cb\u06c4\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u0109\3\2"+
		"\2\2\u06cd\u06d8\5\u010c\u0087\2\u06ce\u06d8\5\u010e\u0088\2\u06cf\u06d8"+
		"\7\u0105\2\2\u06d0\u06d8\7\u00fe\2\2\u06d1\u06d8\5\u0112\u008a\2\u06d2"+
		"\u06d8\7\u009a\2\2\u06d3\u06d8\7\u009b\2\2\u06d4\u06d8\7\u0115\2\2\u06d5"+
		"\u06d8\7\u0116\2\2\u06d6\u06d8\5\u0110\u0089\2\u06d7\u06cd\3\2\2\2\u06d7"+
		"\u06ce\3\2\2\2\u06d7\u06cf\3\2\2\2\u06d7\u06d0\3\2\2\2\u06d7\u06d1\3\2"+
		"\2\2\u06d7\u06d2\3\2\2\2\u06d7\u06d3\3\2\2\2\u06d7\u06d4\3\2\2\2\u06d7"+
		"\u06d5\3\2\2\2\u06d7\u06d6\3\2\2\2\u06d8\u010b\3\2\2\2\u06d9\u06db\7i"+
		"\2\2\u06da\u06d9\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc"+
		"\u06dd\7\u00e3\2\2\u06dd\u010d\3\2\2\2\u06de\u06df\7\u00f0\2\2\u06df\u06e0"+
		"\t\24\2\2\u06e0\u010f\3\2\2\2\u06e1\u06e2\7\u00e9\2\2\u06e2\u06e3\7J\2"+
		"\2\u06e3\u06e4\5j\66\2\u06e4\u0111\3\2\2\2\u06e5\u06e6\7]\2\2\u06e6\u06e9"+
		"\7>\2\2\u06e7\u06ea\5v<\2\u06e8\u06ea\5\u0114\u008b\2\u06e9\u06e7\3\2"+
		"\2\2\u06e9\u06e8\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u0113\3\2\2\2\u06eb"+
		"\u06ec\7\37\2\2\u06ec\u06ed\5\u00dep\2\u06ed\u06ee\7 \2\2\u06ee\u0115"+
		"\3\2\2\2\u06ef\u06f0\7\u010b\2\2\u06f0\u06f1\7h\2\2\u06f1\u0700\5j\66"+
		"\2\u06f2\u06f3\7L\2\2\u06f3\u0700\7\u0109\2\2\u06f4\u06f5\7?\2\2\u06f5"+
		"\u06f7\5\u00d6l\2\u06f6\u06f4\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7\u06f8"+
		"\3\2\2\2\u06f8\u06fc\5\u0108\u0085\2\u06f9\u06fb\5\u010a\u0086\2\u06fa"+
		"\u06f9\3\2\2\2\u06fb\u06fe\3\2\2\2\u06fc\u06fa\3\2\2\2\u06fc\u06fd\3\2"+
		"\2\2\u06fd\u0700\3\2\2\2\u06fe\u06fc\3\2\2\2\u06ff\u06ef\3\2\2\2\u06ff"+
		"\u06f2\3\2\2\2\u06ff\u06f6\3\2\2\2\u0700\u0117\3\2\2\2\u0701\u0703\5l"+
		"\67\2\u0702\u0704\5\u00bc_\2\u0703\u0702\3\2\2\2\u0703\u0704\3\2\2\2\u0704"+
		"\u0707\3\2\2\2\u0705\u0706\7\u00be\2\2\u0706\u0708\7\u00bb\2\2\u0707\u0705"+
		"\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u070a\7_\2\2\u070a"+
		"\u070b\7\37\2\2\u070b\u070c\5\u0084C\2\u070c\u070e\7 \2\2\u070d\u070f"+
		"\7\u0119\2\2\u070e\u070d\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0713\3\2\2"+
		"\2\u0710\u0712\5\u0106\u0084\2\u0711\u0710\3\2\2\2\u0712\u0715\3\2\2\2"+
		"\u0713\u0711\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u0119\3\2\2\2\u0715\u0713"+
		"\3\2\2\2\u0716\u0717\7?\2\2\u0717\u0719\5\u00d6l\2\u0718\u0716\3\2\2\2"+
		"\u0718\u0719\3\2\2\2\u0719\u0729\3\2\2\2\u071a\u071b\7A\2\2\u071b\u072a"+
		"\5r:\2\u071c\u071d\5~@\2\u071d\u071e\5r:\2\u071e\u072a\3\2\2\2\u071f\u0720"+
		"\7B\2\2\u0720\u0721\7C\2\2\u0721\u0722\5r:\2\u0722\u0723\5\u0108\u0085"+
		"\2\u0723\u072a\3\2\2\2\u0724\u0725\7\u00bd\2\2\u0725\u0726\7\37\2\2\u0726"+
		"\u0727\5\u0084C\2\u0727\u0728\7 \2\2\u0728\u072a\3\2\2\2\u0729\u071a\3"+
		"\2\2\2\u0729\u071c\3\2\2\2\u0729\u071f\3\2\2\2\u0729\u0724\3\2\2\2\u072a"+
		"\u072e\3\2\2\2\u072b\u072d\5\u010a\u0086\2\u072c\u072b\3\2\2\2\u072d\u0730"+
		"\3\2\2\2\u072e\u072c\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u011b\3\2\2\2\u0730"+
		"\u072e\3\2\2\2\u0731\u0732\7\u010b\2\2\u0732\u0733\7d\2\2\u0733\u0734"+
		"\7\37\2\2\u0734\u0735\5\u00b6\\\2\u0735\u0736\7 \2\2\u0736\u0737\7h\2"+
		"\2\u0737\u0738\5j\66\2\u0738\u074f\3\2\2\2\u0739\u073a\7\u0103\2\2\u073a"+
		"\u073b\7\37\2\2\u073b\u073c\5\u00b6\\\2\u073c\u073d\7 \2\2\u073d\u073e"+
		"\7L\2\2\u073e\u073f\7\u0109\2\2\u073f\u074f\3\2\2\2\u0740\u0741\7?\2\2"+
		"\u0741\u0743\5\u00d6l\2\u0742\u0740\3\2\2\2\u0742\u0743\3\2\2\2\u0743"+
		"\u0744\3\2\2\2\u0744\u0745\7B\2\2\u0745\u0746\7C\2\2\u0746\u0747\5\u00ba"+
		"^\2\u0747\u074b\5\u0108\u0085\2\u0748\u074a\5\u010a\u0086\2\u0749\u0748"+
		"\3\2\2\2\u074a\u074d\3\2\2\2\u074b\u0749\3\2\2\2\u074b\u074c\3\2\2\2\u074c"+
		"\u074f\3\2\2\2\u074d\u074b\3\2\2\2\u074e\u0731\3\2\2\2\u074e\u0739\3\2"+
		"\2\2\u074e\u0742\3\2\2\2\u074f\u011d\3\2\2\2\u0750\u0752\t\25\2\2\u0751"+
		"\u0750\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u011f\3\2\2\2\u0753\u0755\5j"+
		"\66\2\u0754\u0756\58\35\2\u0755\u0754\3\2\2\2\u0755\u0756\3\2\2\2\u0756"+
		"\u0757\3\2\2\2\u0757\u0758\5\u0122\u0092\2\u0758\u0121\3\2\2\2\u0759\u075a"+
		"\7\37\2\2\u075a\u075f\5\u0124\u0093\2\u075b\u075c\7%\2\2\u075c\u075e\5"+
		"\u0124\u0093\2\u075d\u075b\3\2\2\2\u075e\u0761\3\2\2\2\u075f\u075d\3\2"+
		"\2\2\u075f\u0760\3\2\2\2\u0760\u0762\3\2\2\2\u0761\u075f\3\2\2\2\u0762"+
		"\u0763\7 \2\2\u0763\u0123\3\2\2\2\u0764\u0767\5l\67\2\u0765\u0767\5\u0084"+
		"C\2\u0766\u0764\3\2\2\2\u0766\u0765\3\2\2\2\u0767\u0769\3\2\2\2\u0768"+
		"\u076a\t\21\2\2\u0769\u0768\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u0125\3"+
		"\2\2\2\u076b\u076c\5j\66\2\u076c\u076d\5\u0128\u0095\2\u076d\u076e\7T"+
		"\2\2\u076e\u076f\5\u012e\u0098\2\u076f\u0770\7^\2\2\u0770\u0771\5\u0084"+
		"C\2\u0771\u0127\3\2\2\2\u0772\u0773\7\37\2\2\u0773\u0778\5\u012a\u0096"+
		"\2\u0774\u0775\7%\2\2\u0775\u0777\5\u012a\u0096\2\u0776\u0774\3\2\2\2"+
		"\u0777\u077a\3\2\2\2\u0778\u0776\3\2\2\2\u0778\u0779\3\2\2\2\u0779\u077b"+
		"\3\2\2\2\u077a\u0778\3\2\2\2\u077b\u077c\7 \2\2\u077c\u0129\3\2\2\2\u077d"+
		"\u0780\5j\66\2\u077e\u0780\58\35\2\u077f\u077d\3\2\2\2\u077f\u077e\3\2"+
		"\2\2\u077f\u0780\3\2\2\2\u0780\u0781\3\2\2\2\u0781\u0783\5l\67\2\u0782"+
		"\u0784\t\21\2\2\u0783\u0782\3\2\2\2\u0783\u0784\3\2\2\2\u0784\u012b\3"+
		"\2\2\2\u0785\u0788\5\u0120\u0091\2\u0786\u0788\5\u0126\u0094\2\u0787\u0785"+
		"\3\2\2\2\u0787\u0786\3\2\2\2\u0788\u012d\3\2\2\2\u0789\u078b\5j\66\2\u078a"+
		"\u078c\58\35\2\u078b\u078a\3\2\2\2\u078b\u078c\3\2\2\2\u078c\u0794\3\2"+
		"\2\2\u078d\u078e\7%\2\2\u078e\u0790\5j\66\2\u078f\u0791\58\35\2\u0790"+
		"\u078f\3\2\2\2\u0790\u0791\3\2\2\2\u0791\u0793\3\2\2\2\u0792\u078d\3\2"+
		"\2\2\u0793\u0796\3\2\2\2\u0794\u0792\3\2\2\2\u0794\u0795\3\2\2\2\u0795"+
		"\u012f\3\2\2\2\u0796\u0794\3\2\2\2\u0797\u079c\5\u0132\u009a\2\u0798\u079c"+
		"\5\u0136\u009c\2\u0799\u079c\5\u015a\u00ae\2\u079a\u079c\5\u016a\u00b6"+
		"\2\u079b\u0797\3\2\2\2\u079b\u0798\3\2\2\2\u079b\u0799\3\2\2\2\u079b\u079a"+
		"\3\2\2\2\u079b\u079c\3\2\2\2\u079c\u0131\3\2\2\2\u079d\u07a1\5\u0134\u009b"+
		"\2\u079e\u079f\7\u0104\2\2\u079f\u07a1\5\u0104\u0083\2\u07a0\u079d\3\2"+
		"\2\2\u07a0\u079e\3\2\2\2\u07a1\u0133\3\2\2\2\u07a2\u07a3\7\u0106\2\2\u07a3"+
		"\u07a4\7e\2\2\u07a4\u07a5\5d\63\2\u07a5\u0135\3\2\2\2\u07a6\u07a8\5\u0138"+
		"\u009d\2\u07a7\u07a6\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07a7\3\2\2\2\u07a9"+
		"\u07aa\3\2\2\2\u07aa\u07ad\3\2\2\2\u07ab\u07ad\5\u0158\u00ad\2\u07ac\u07a7"+
		"\3\2\2\2\u07ac\u07ab\3\2\2\2\u07ad\u0137\3\2\2\2\u07ae\u07b2\5\u013a\u009e"+
		"\2\u07af\u07b2\5\u0148\u00a5\2\u07b0\u07b2\5\u014e\u00a8\2\u07b1\u07ae"+
		"\3\2\2\2\u07b1\u07af\3\2\2\2\u07b1\u07b0\3\2\2\2\u07b2\u0139\3\2\2\2\u07b3"+
		"\u07b4\7:\2\2\u07b4\u07b6\5\u013c\u009f\2\u07b5\u07b7\5\u0140\u00a1\2"+
		"\u07b6\u07b5\3\2\2\2\u07b6\u07b7\3\2\2\2\u07b7\u013b\3\2\2\2\u07b8\u07b9"+
		"\7\37\2\2\u07b9\u07be\5\u013e\u00a0\2\u07ba\u07bb\7%\2\2\u07bb\u07bd\5"+
		"\u013e\u00a0\2\u07bc\u07ba\3\2\2\2\u07bd\u07c0\3\2\2\2\u07be\u07bc\3\2"+
		"\2\2\u07be\u07bf\3\2\2\2\u07bf\u07c1\3\2\2\2\u07c0\u07be\3\2\2\2\u07c1"+
		"\u07c2\7 \2\2\u07c2\u07c5\3\2\2\2\u07c3\u07c5\5\u013e\u00a0\2\u07c4\u07b8"+
		"\3\2\2\2\u07c4\u07c3\3\2\2\2\u07c5\u013d\3\2\2\2\u07c6\u07c9\5\u00f8}"+
		"\2\u07c7\u07c9\5\u0118\u008d\2\u07c8\u07c6\3\2\2\2\u07c8\u07c7\3\2\2\2"+
		"\u07c9\u013f\3\2\2\2\u07ca\u07cc\5\u0142\u00a2\2\u07cb\u07ca\3\2\2\2\u07cc"+
		"\u07cd\3\2\2\2\u07cd\u07cb\3\2\2\2\u07cd\u07ce\3\2\2\2\u07ce\u0141\3\2"+
		"\2\2\u07cf\u07d0\5\u0144\u00a3\2\u07d0\u0143\3\2\2\2\u07d1\u07d2\7=\2"+
		"\2\u07d2\u07d3\5l\67\2\u07d3\u07d4\5\u0146\u00a4\2\u07d4\u0145\3\2\2\2"+
		"\u07d5\u07d7\7\u00e7\2\2\u07d6\u07d5\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7"+
		"\u07d8\3\2\2\2\u07d8\u07d9\7h\2\2\u07d9\u07db\7\u00ff\2\2\u07da\u07dc"+
		"\7\u00ae\2\2\u07db\u07da\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07dd\3\2\2"+
		"\2\u07dd\u07df\7\37\2\2\u07de\u07e0\7\u0100\2\2\u07df\u07de\3\2\2\2\u07df"+
		"\u07e0\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e2\5\u00c0a\2\u07e2\u07e3"+
		"\7 \2\2\u07e3\u07ec\3\2\2\2\u07e4\u07e6\7i\2\2\u07e5\u07e4\3\2\2\2\u07e5"+
		"\u07e6\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07e8\7\u010e\2\2\u07e8\u07e9"+
		"\7\u00d7\2\2\u07e9\u07ea\7p\2\2\u07ea\u07ec\7\u00f3\2\2\u07eb\u07d6\3"+
		"\2\2\2\u07eb\u07e5\3\2\2\2\u07ec\u0147\3\2\2\2\u07ed\u07fd\7\u00fa\2\2"+
		"\u07ee\u07f0\7\37\2\2\u07ef\u07ee\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f1"+
		"\3\2\2\2\u07f1\u07f6\5\u014a\u00a6\2\u07f2\u07f3\7%\2\2\u07f3\u07f5\5"+
		"\u014a\u00a6\2\u07f4\u07f2\3\2\2\2\u07f5\u07f8\3\2\2\2\u07f6\u07f4\3\2"+
		"\2\2\u07f6\u07f7\3\2\2\2\u07f7\u07fa\3\2\2\2\u07f8\u07f6\3\2\2\2\u07f9"+
		"\u07fb\7 \2\2\u07fa\u07f9\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb\u07fe\3\2"+
		"\2\2\u07fc\u07fe\5\u014c\u00a7\2\u07fd\u07ef\3\2\2\2\u07fd\u07fc\3\2\2"+
		"\2\u07fe\u0149\3\2\2\2\u07ff\u0801\5l\67\2\u0800\u0802\5\u00bc_\2\u0801"+
		"\u0800\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u0805\3\2\2\2\u0803\u0804\7\u0098"+
		"\2\2\u0804\u0806\5\u0084C\2\u0805\u0803\3\2\2\2\u0805\u0806\3\2\2\2\u0806"+
		"\u080a\3\2\2\2\u0807\u0808\7\u00e1\2\2\u0808\u080b\5\u0104\u0083\2\u0809"+
		"\u080b\7\u00e2\2\2\u080a\u0807\3\2\2\2\u080a\u0809\3\2\2\2\u080a\u080b"+
		"\3\2\2\2\u080b\u080f\3\2\2\2\u080c\u080e\5\u0106\u0084\2\u080d\u080c\3"+
		"\2\2\2\u080e\u0811\3\2\2\2\u080f\u080d\3\2\2\2\u080f\u0810\3\2\2\2\u0810"+
		"\u014b\3\2\2\2\u0811\u080f\3\2\2\2\u0812\u0813\7=\2\2\u0813\u0815\5l\67"+
		"\2\u0814\u0816\7i\2\2\u0815\u0814\3\2\2\2\u0815\u0816\3\2\2\2\u0816\u0817"+
		"\3\2\2\2\u0817\u0818\7\u010e\2\2\u0818\u0819\7\u00d7\2\2\u0819\u081a\7"+
		"p\2\2\u081a\u081c\7\u00f3\2\2\u081b\u081d\7\u00ea\2\2\u081c\u081b\3\2"+
		"\2\2\u081c\u081d\3\2\2\2\u081d\u014d\3\2\2\2\u081e\u081f\7;\2\2\u081f"+
		"\u0820\7\u0114\2\2\u0820\u0824\5\u0152\u00aa\2\u0821\u0823\5\u0154\u00ab"+
		"\2\u0822\u0821\3\2\2\2\u0823\u0826\3\2\2\2\u0824\u0822\3\2\2\2\u0824\u0825"+
		"\3\2\2\2\u0825\u0829\3\2\2\2\u0826\u0824\3\2\2\2\u0827\u0829\5\u0150\u00a9"+
		"\2\u0828\u081e\3\2\2\2\u0828\u0827\3\2\2\2\u0829\u014f\3\2\2\2\u082a\u082b"+
		"\7\65\2\2\u082b\u082f\5\u0152\u00aa\2\u082c\u082e\5\u0154\u00ab\2\u082d"+
		"\u082c\3\2\2\2\u082e\u0831\3\2\2\2\u082f\u082d\3\2\2\2\u082f\u0830\3\2"+
		"\2\2\u0830\u0833\3\2\2\2\u0831\u082f\3\2\2\2\u0832\u0834\5\u0156\u00ac"+
		"\2\u0833\u0832\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0151\3\2\2\2\u0835\u0836"+
		"\7=\2\2\u0836\u0843\5l\67\2\u0837\u0838\7\37\2\2\u0838\u083d\5l\67\2\u0839"+
		"\u083a\7%\2\2\u083a\u083c\5l\67\2\u083b\u0839\3\2\2\2\u083c\u083f\3\2"+
		"\2\2\u083d\u083b\3\2\2\2\u083d\u083e\3\2\2\2\u083e\u0840\3\2\2\2\u083f"+
		"\u083d\3\2\2\2\u0840\u0841\7 \2\2\u0841\u0843\3\2\2\2\u0842\u0835\3\2"+
		"\2\2\u0842\u0837\3\2\2\2\u0843\u0153\3\2\2\2\u0844\u0845\7\u00bc\2\2\u0845"+
		"\u0848\7\u00dd\2\2\u0846\u0848\7\u00f1\2\2\u0847\u0844\3\2\2\2\u0847\u0846"+
		"\3\2\2\2\u0848\u0155\3\2\2\2\u0849\u084a\7\u00db\2\2\u084a\u084b\7\u0172"+
		"\2\2\u084b\u0157\3\2\2\2\u084c\u084d\7\u0106\2\2\u084d\u084e\7=\2\2\u084e"+
		"\u084f\5l\67\2\u084f\u0850\7e\2\2\u0850\u0851\5l\67\2\u0851\u0159\3\2"+
		"\2\2\u0852\u085b\5\u015c\u00af\2\u0853\u085b\5\u015e\u00b0\2\u0854\u085b"+
		"\5\u0166\u00b4\2\u0855\u0857\5\u0168\u00b5\2\u0856\u0855\3\2\2\2\u0857"+
		"\u0858\3\2\2\2\u0858\u0856\3\2\2\2\u0858\u0859\3\2\2\2\u0859\u085b\3\2"+
		"\2\2\u085a\u0852\3\2\2\2\u085a\u0853\3\2\2\2\u085a\u0854\3\2\2\2\u085a"+
		"\u0856\3\2\2\2\u085b\u015b\3\2\2\2\u085c\u0863\7:\2\2\u085d\u085f\5\u011a"+
		"\u008e\2\u085e\u085d\3\2\2\2\u085f\u0860\3\2\2\2\u0860\u085e\3\2\2\2\u0860"+
		"\u0861\3\2\2\2\u0861\u0864\3\2\2\2\u0862\u0864\5\u011c\u008f\2\u0863\u085e"+
		"\3\2\2\2\u0863\u0862\3\2\2\2\u0864\u015d\3\2\2\2\u0865\u0866\7\u00fa\2"+
		"\2\u0866\u0868\5\u0162\u00b2\2\u0867\u0869\5\u010a\u0086\2\u0868\u0867"+
		"\3\2\2\2\u0869\u086a\3\2\2\2\u086a\u0868\3\2\2\2\u086a\u086b\3\2\2\2\u086b"+
		"\u086d\3\2\2\2\u086c\u086e\7\u00bc\2\2\u086d\u086c\3\2\2\2\u086d\u086e"+
		"\3\2\2\2\u086e\u015f\3\2\2\2\u086f\u0870\7?\2\2\u0870\u0871\5\u00d6l\2"+
		"\u0871\u0161\3\2\2\2\u0872\u0875\5\u0160\u00b1\2\u0873\u0875\5\u0164\u00b3"+
		"\2\u0874\u0872\3\2\2\2\u0874\u0873\3\2\2\2\u0875\u0163\3\2\2\2\u0876\u087a"+
		"\5~@\2\u0877\u0878\7A\2\2\u0878\u087a\5r:\2\u0879\u0876\3\2\2\2\u0879"+
		"\u0877\3\2\2\2\u087a\u0165\3\2\2\2\u087b\u087c\7\u0106\2\2\u087c\u087d"+
		"\5\u0160\u00b1\2\u087d\u087e\7e\2\2\u087e\u087f\5\u00d6l\2\u087f\u0167"+
		"\3\2\2\2\u0880\u088e\7\65\2\2\u0881\u0883\5\u0164\u00b3\2\u0882\u0884"+
		"\7\u00bc\2\2\u0883\u0882\3\2\2\2\u0883\u0884\3\2\2\2\u0884\u0887\3\2\2"+
		"\2\u0885\u0886\t\26\2\2\u0886\u0888\7>\2\2\u0887\u0885\3\2\2\2\u0887\u0888"+
		"\3\2\2\2\u0888\u088f\3\2\2\2\u0889\u088a\7?\2\2\u088a\u088c\5\u00d6l\2"+
		"\u088b\u088d\7\u00bc\2\2\u088c\u088b\3\2\2\2\u088c\u088d\3\2\2\2\u088d"+
		"\u088f\3\2\2\2\u088e\u0881\3\2\2\2\u088e\u0889\3\2\2\2\u088f\u0169\3\2"+
		"\2\2\u0890\u0894\5\u013a\u009e\2\u0891\u0894\5\u0148\u00a5\2\u0892\u0894"+
		"\5\u0150\u00a9\2\u0893\u0890\3\2\2\2\u0893\u0891\3\2\2\2\u0893\u0892\3"+
		"\2\2\2\u0894\u0895\3\2\2\2\u0895\u0893\3\2\2\2\u0895\u0896\3\2\2\2\u0896"+
		"\u016b\3\2\2\2\u0897\u089c\5\u016e\u00b8\2\u0898\u0899\7%\2\2\u0899\u089b"+
		"\5\u016e\u00b8\2\u089a\u0898\3\2\2\2\u089b\u089e\3\2\2\2\u089c\u089a\3"+
		"\2\2\2\u089c\u089d\3\2\2\2\u089d\u016d\3\2\2\2\u089e\u089c\3\2\2\2\u089f"+
		"\u08a2\5l\67\2\u08a0\u08a2\5\u00b0Y\2\u08a1\u089f\3\2\2\2\u08a1\u08a0"+
		"\3\2\2\2\u08a2\u08a5\3\2\2\2\u08a3\u08a4\7\u0098\2\2\u08a4\u08a6\5\u0084"+
		"C\2\u08a5\u08a3\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08b0\3\2\2\2\u08a7"+
		"\u08a9\5\u0106\u0084\2\u08a8\u08a7\3\2\2\2\u08a9\u08ac\3\2\2\2\u08aa\u08a8"+
		"\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08b1\3\2\2\2\u08ac\u08aa\3\2\2\2\u08ad"+
		"\u08af\5\u0116\u008c\2\u08ae\u08ad\3\2\2\2\u08ae\u08af\3\2\2\2\u08af\u08b1"+
		"\3\2\2\2\u08b0\u08aa\3\2\2\2\u08b0\u08ae\3\2\2\2\u08b1\u08b5\3\2\2\2\u08b2"+
		"\u08b5\5\u011a\u008e\2\u08b3\u08b5\5\u011c\u008f\2\u08b4\u08a1\3\2\2\2"+
		"\u08b4\u08b2\3\2\2\2\u08b4\u08b3\3\2\2\2\u08b5\u016f\3\2\2\2\u08b6\u08b7"+
		"\7\u0106\2\2\u08b7\u08b8\7e\2\2\u08b8\u08ba\5v<\2\u08b9\u08b6\3\2\2\2"+
		"\u08b9\u08ba\3\2\2\2\u08ba\u0171\3\2\2\2\u08bb\u08bc\7;\2\2\u08bc\u08bd"+
		"\7\u00c4\2\2\u08bd\u0173\3\2\2\2\u08be\u08bf\7|\2\2\u08bf\u0175\3\2\2"+
		"\2\u08c0\u08c1\7}\2\2\u08c1\u0177\3\2\2\2\u08c2\u08c3\7~\2\2\u08c3\u0179"+
		"\3\2\2\2\u08c4\u08c8\78\2\2\u08c5\u08c9\5\u017e\u00c0\2\u08c6\u08c9\5"+
		"\u0180\u00c1\2\u08c7\u08c9\5\u0182\u00c2\2\u08c8\u08c5\3\2\2\2\u08c8\u08c6"+
		"\3\2\2\2\u08c8\u08c7\3\2\2\2\u08c9\u017b\3\2\2\2\u08ca\u08ce\79\2\2\u08cb"+
		"\u08cf\5\u017e\u00c0\2\u08cc\u08cf\5\u0180\u00c1\2\u08cd\u08cf\5\u0182"+
		"\u00c2\2\u08ce\u08cb\3\2\2\2\u08ce\u08cc\3\2\2\2\u08ce\u08cd\3\2\2\2\u08cf"+
		"\u017d\3\2\2\2\u08d0\u08d1\5\u0184\u00c3\2\u08d1\u08d2\7`\2\2\u08d2\u08d3"+
		"\5\u0188\u00c5\2\u08d3\u017f\3\2\2\2\u08d4\u08d5\5\u018a\u00c6\2\u08d5"+
		"\u0181\3\2\2\2\u08d6\u08d7\5\u00d8m\2\u08d7\u0183\3\2\2\2\u08d8\u08da"+
		"\5\u0186\u00c4\2\u08d9\u08db\5r:\2\u08da\u08d9\3\2\2\2\u08da\u08db\3\2"+
		"\2\2\u08db\u08e3\3\2\2\2\u08dc\u08dd\7%\2\2\u08dd\u08df\5\u0186\u00c4"+
		"\2\u08de\u08e0\5r:\2\u08df\u08de\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u08e2"+
		"\3\2\2\2\u08e1\u08dc\3\2\2\2\u08e2\u08e5\3\2\2\2\u08e3\u08e1\3\2\2\2\u08e3"+
		"\u08e4\3\2\2\2\u08e4\u0185\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e6\u08e8\7p"+
		"\2\2\u08e7\u08e9\7\u00bf\2\2\u08e8\u08e7\3\2\2\2\u08e8\u08e9\3\2\2\2\u08e9"+
		"\u0907\3\2\2\2\u08ea\u0907\7/\2\2\u08eb\u0907\7\60\2\2\u08ec\u0907\7\62"+
		"\2\2\u08ed\u0907\7\61\2\2\u08ee\u0907\7\64\2\2\u08ef\u0907\7\u00c0\2\2"+
		"\u08f0\u0907\7\u00c1\2\2\u08f1\u0907\7\u00c9\2\2\u08f2\u0907\7\u00ca\2"+
		"\2\u08f3\u0907\7>\2\2\u08f4\u0907\7\u00c2\2\2\u08f5\u0907\7\u00cb\2\2"+
		"\u08f6\u0907\7\u00cc\2\2\u08f7\u08f8\7\u00cd\2\2\u08f8\u0907\7\u00ce\2"+
		"\2\u08f9\u08fa\7`\2\2\u08fa\u08fb\7|\2\2\u08fb\u0907\7\u00cf\2\2\u08fc"+
		"\u08fd\7\u00d0\2\2\u08fd\u0907\7\u00d1\2\2\u08fe\u08ff\7\u00d2\2\2\u08ff"+
		"\u0907\7\u00d3\2\2\u0900\u0901\7\u00d4\2\2\u0901\u0907\7\u00bf\2\2\u0902"+
		"\u0903\7\u00d5\2\2\u0903\u0907\7\u00a2\2\2\u0904\u0905\7\u00d6\2\2\u0905"+
		"\u0907\7I\2\2\u0906\u08e6\3\2\2\2\u0906\u08ea\3\2\2\2\u0906\u08eb\3\2"+
		"\2\2\u0906\u08ec\3\2\2\2\u0906\u08ed\3\2\2\2\u0906\u08ee\3\2\2\2\u0906"+
		"\u08ef\3\2\2\2\u0906\u08f0\3\2\2\2\u0906\u08f1\3\2\2\2\u0906\u08f2\3\2"+
		"\2\2\u0906\u08f3\3\2\2\2\u0906\u08f4\3\2\2\2\u0906\u08f5\3\2\2\2\u0906"+
		"\u08f6\3\2\2\2\u0906\u08f7\3\2\2\2\u0906\u08f9\3\2\2\2\u0906\u08fc\3\2"+
		"\2\2\u0906\u08fe\3\2\2\2\u0906\u0900\3\2\2\2\u0906\u0902\3\2\2\2\u0906"+
		"\u0904\3\2\2\2\u0907\u0187\3\2\2\2\u0908\u0915\7\u00c5\2\2\u0909\u0915"+
		"\7\u00e5\2\2\u090a\u0915\7\u00e6\2\2\u090b\u090c\7\u00f8\2\2\u090c\u0915"+
		"\7\u00f9\2\2\u090d\u090e\7\u00a2\2\2\u090e\u090f\7\u0111\2\2\u090f\u0915"+
		"\7\u0102\2\2\u0910\u0911\7\u00f2\2\2\u0911\u0912\t\27\2\2\u0912\u0915"+
		"\5j\66\2\u0913\u0915\5j\66\2\u0914\u0908\3\2\2\2\u0914\u0909\3\2\2\2\u0914"+
		"\u090a\3\2\2\2\u0914\u090b\3\2\2\2\u0914\u090d\3\2\2\2\u0914\u0910\3\2"+
		"\2\2\u0914\u0913\3\2\2\2\u0915\u0189\3\2\2\2\u0916\u0917\7p\2\2\u0917"+
		"\u0944\7\u00bf\2\2\u0918\u0944\5\u018e\u00c8\2\u0919\u0944\5\u0190\u00c9"+
		"\2\u091a\u0944\5\u0192\u00ca\2\u091b\u0944\5\u0194\u00cb\2\u091c\u0944"+
		"\5\u0196\u00cc\2\u091d\u0944\5\u0198\u00cd\2\u091e\u0944\5\u019a\u00ce"+
		"\2\u091f\u0944\5\u019c\u00cf\2\u0920\u0944\5\u019e\u00d0\2\u0921\u0944"+
		"\5\u01a0\u00d1\2\u0922\u0944\5\u01a2\u00d2\2\u0923\u0944\5\u01a4\u00d3"+
		"\2\u0924\u0944\5\u01a6\u00d4\2\u0925\u0944\5\u01a8\u00d5\2\u0926\u0944"+
		"\5\u01aa\u00d6\2\u0927\u0944\5\u01ac\u00d7\2\u0928\u0944\5\u01ae\u00d8"+
		"\2\u0929\u0944\5\u01b0\u00d9\2\u092a\u0944\5\u01b2\u00da\2\u092b\u0944"+
		"\5\u01b4\u00db\2\u092c\u0944\5\u01b6\u00dc\2\u092d\u0944\5\u01b8\u00dd"+
		"\2\u092e\u0944\5\u01ba\u00de\2\u092f\u0944\5\u01bc\u00df\2\u0930\u0944"+
		"\5\u01be\u00e0\2\u0931\u0944\5\u01c0\u00e1\2\u0932\u0944\5\u01c2\u00e2"+
		"\2\u0933\u0944\5\u01c4\u00e3\2\u0934\u0944\5\u01c6\u00e4\2\u0935\u0944"+
		"\5\u01c8\u00e5\2\u0936\u0944\5\u01ca\u00e6\2\u0937\u0944\5\u01cc\u00e7"+
		"\2\u0938\u0944\5\u01ce\u00e8\2\u0939\u0944\5\u01d0\u00e9\2\u093a\u0944"+
		"\5\u01d2\u00ea\2\u093b\u0944\5\u01d4\u00eb\2\u093c\u0944\5\u01d6\u00ec"+
		"\2\u093d\u0944\5\u01d8\u00ed\2\u093e\u0944\5\u01da\u00ee\2\u093f\u0944"+
		"\5\u01dc\u00ef\2\u0940\u0944\5\u01de\u00f0\2\u0941\u0944\5\u01e0\u00f1"+
		"\2\u0942\u0944\5\u01e2\u00f2\2\u0943\u0916\3\2\2\2\u0943\u0918\3\2\2\2"+
		"\u0943\u0919\3\2\2\2\u0943\u091a\3\2\2\2\u0943\u091b\3\2\2\2\u0943\u091c"+
		"\3\2\2\2\u0943\u091d\3\2\2\2\u0943\u091e\3\2\2\2\u0943\u091f\3\2\2\2\u0943"+
		"\u0920\3\2\2\2\u0943\u0921\3\2\2\2\u0943\u0922\3\2\2\2\u0943\u0923\3\2"+
		"\2\2\u0943\u0924\3\2\2\2\u0943\u0925\3\2\2\2\u0943\u0926\3\2\2\2\u0943"+
		"\u0927\3\2\2\2\u0943\u0928\3\2\2\2\u0943\u0929\3\2\2\2\u0943\u092a\3\2"+
		"\2\2\u0943\u092b\3\2\2\2\u0943\u092c\3\2\2\2\u0943\u092d\3\2\2\2\u0943"+
		"\u092e\3\2\2\2\u0943\u092f\3\2\2\2\u0943\u0930\3\2\2\2\u0943\u0931\3\2"+
		"\2\2\u0943\u0932\3\2\2\2\u0943\u0933\3\2\2\2\u0943\u0934\3\2\2\2\u0943"+
		"\u0935\3\2\2\2\u0943\u0936\3\2\2\2\u0943\u0937\3\2\2\2\u0943\u0938\3\2"+
		"\2\2\u0943\u0939\3\2\2\2\u0943\u093a\3\2\2\2\u0943\u093b\3\2\2\2\u0943"+
		"\u093c\3\2\2\2\u0943\u093d\3\2\2\2\u0943\u093e\3\2\2\2\u0943\u093f\3\2"+
		"\2\2\u0943\u0940\3\2\2\2\u0943\u0941\3\2\2\2\u0943\u0942\3\2\2\2\u0944"+
		"\u018b\3\2\2\2\u0945\u0947\t\30\2\2\u0946\u0948\7q\2\2\u0947\u0946\3\2";
	private static final String _serializedATNSegment1 =
		"\2\2\u0947\u0948\3\2\2\2\u0948\u018d\3\2\2\2\u0949\u094b\5\u018c\u00c7"+
		"\2\u094a\u0949\3\2\2\2\u094a\u094b\3\2\2\2\u094b\u094c\3\2\2\2\u094c\u094d"+
		"\7\u00a2\2\2\u094d\u095b\7\u0102\2\2\u094e\u095b\7\u011f\2\2\u094f\u0951"+
		"\7\u0120\2\2\u0950\u0952\7q\2\2\u0951\u0950\3\2\2\2\u0951\u0952\3\2\2"+
		"\2\u0952\u0953\3\2\2\2\u0953\u0958\7\u00a2\2\2\u0954\u0955\7\u0121\2\2"+
		"\u0955\u0959\7;\2\2\u0956\u0957\7\u0123\2\2\u0957\u0959\7\u0124\2\2\u0958"+
		"\u0954\3\2\2\2\u0958\u0956\3\2\2\2\u0959\u095b\3\2\2\2\u095a\u094a\3\2"+
		"\2\2\u095a\u094e\3\2\2\2\u095a\u094f\3\2\2\2\u095b\u018f\3\2\2\2\u095c"+
		"\u095d\5\u018c\u00c7\2\u095d\u095e\7\u0125\2\2\u095e\u0191\3\2\2\2\u095f"+
		"\u0960\5\u018c\u00c7\2\u0960\u0961\7\u0126\2\2\u0961\u0193\3\2\2\2\u0962"+
		"\u0963\7\u0127\2\2\u0963\u0964\7\u0128\2\2\u0964\u0965\7\u0129\2\2\u0965"+
		"\u0195\3\2\2\2\u0966\u0967\7\64\2\2\u0967\u096b\t\31\2\2\u0968\u0969\7"+
		"\u012c\2\2\u0969\u096b\7\u012b\2\2\u096a\u0966\3\2\2\2\u096a\u0968\3\2"+
		"\2\2\u096b\u0197\3\2\2\2\u096c\u096e\t\32\2\2\u096d\u096f\7\u011b\2\2"+
		"\u096e\u096d\3\2\2\2\u096e\u096f\3\2\2\2\u096f\u0970\3\2\2\2\u0970\u0971"+
		"\7\u012a\2\2\u0971\u0972\7\u012d\2\2\u0972\u0199\3\2\2\2\u0973\u0978\7"+
		"\u00cb\2\2\u0974\u0975\7\u00dc\2\2\u0975\u0979\7\u011c\2\2\u0976\u0977"+
		"\7q\2\2\u0977\u0979\7H\2\2\u0978\u0974\3\2\2\2\u0978\u0976\3\2\2\2\u0979"+
		"\u019b\3\2\2\2\u097a\u097b\7\u012e\2\2\u097b\u097c\7q\2\2\u097c\u097d"+
		"\7\u012f\2\2\u097d\u019d\3\2\2\2\u097e\u097f\5\u018c\u00c7\2\u097f\u0980"+
		"\7\u0130\2\2\u0980\u019f\3\2\2\2\u0981\u0982\5\u018c\u00c7\2\u0982\u0983"+
		"\7\u00e5\2\2\u0983\u01a1\3\2\2\2\u0984\u0985\5\u018c\u00c7\2\u0985\u0986"+
		"\7\u00e6\2\2\u0986\u01a3\3\2\2\2\u0987\u0988\7\u00cd\2\2\u0988\u0989\7"+
		"\u00ce\2\2\u0989\u098a\7\u0120\2\2\u098a\u01a5\3\2\2\2\u098b\u098c\5\u018c"+
		"\u00c7\2\u098c\u098d\7>\2\2\u098d\u01a7\3\2\2\2\u098e\u098f\5\u018c\u00c7"+
		"\2\u098f\u0990\7\u0131\2\2\u0990\u01a9\3\2\2\2\u0991\u0993\7\63\2\2\u0992"+
		"\u0994\t\33\2\2\u0993\u0992\3\2\2\2\u0993\u0994\3\2\2\2\u0994\u0995\3"+
		"\2\2\2\u0995\u099c\7\u0133\2\2\u0996\u0997\7\u00c9\2\2\u0997\u0998\7q"+
		"\2\2\u0998\u099c\t\34\2\2\u0999\u099a\7\u0122\2\2\u099a\u099c\7\u0136"+
		"\2\2\u099b\u0991\3\2\2\2\u099b\u0996\3\2\2\2\u099b\u0999\3\2\2\2\u099c"+
		"\u01ab\3\2\2\2\u099d\u099e\7\u0120\2\2\u099e\u099f\7C\2\2\u099f\u09a0"+
		"\7\u0123\2\2\u09a0\u01ad\3\2\2\2\u09a1\u09a2\5\u018c\u00c7\2\u09a2\u09a3"+
		"\7\u0137\2\2\u09a3\u01af\3\2\2\2\u09a4\u09a5\7\u0138\2\2\u09a5\u01b1\3"+
		"\2\2\2\u09a6\u09a7\5\u018c\u00c7\2\u09a7\u09a8\7\u0139\2\2\u09a8\u09a9"+
		"\7I\2\2\u09a9\u09b6\3\2\2\2\u09aa\u09ac\7\u00eb\2\2\u09ab\u09aa\3\2\2"+
		"\2\u09ab\u09ac\3\2\2\2\u09ac\u09ad\3\2\2\2\u09ad\u09ae\7\u00d0\2\2\u09ae"+
		"\u09b6\7\u00d1\2\2\u09af\u09b0\7`\2\2\u09b0\u09b1\7|\2\2\u09b1\u09b6\7"+
		"\u00cf\2\2\u09b2\u09b3\7\u00cd\2\2\u09b3\u09b4\7q\2\2\u09b4\u09b6\7<\2"+
		"\2\u09b5\u09a6\3\2\2\2\u09b5\u09ab\3\2\2\2\u09b5\u09af\3\2\2\2\u09b5\u09b2"+
		"\3\2\2\2\u09b6\u01b3\3\2\2\2\u09b7\u09bb\5\u018c\u00c7\2\u09b8\u09b9\7"+
		"\u011d\2\2\u09b9\u09bb\7q\2\2\u09ba\u09b7\3\2\2\2\u09ba\u09b8\3\2\2\2"+
		"\u09bb\u09bc\3\2\2\2\u09bc\u09bd\7\u00f8\2\2\u09bd\u09be\7\u00f9\2\2\u09be"+
		"\u01b5\3\2\2\2\u09bf\u09c0\5\u018c\u00c7\2\u09c0\u09c1\7\u013a\2\2\u09c1"+
		"\u01b7\3\2\2\2\u09c2\u09c3\5\u018c\u00c7\2\u09c3\u09c4\7\u013b\2\2\u09c4"+
		"\u09c5\7\u013c\2\2\u09c5\u01b9\3\2\2\2\u09c6\u09c7\5\u018c\u00c7\2\u09c7"+
		"\u09c8\7\u013a\2\2\u09c8\u09c9\7\u0130\2\2\u09c9\u01bb\3\2\2\2\u09ca\u09cb"+
		"\5\u018c\u00c7\2\u09cb\u09cc\7\u013a\2\2\u09cc\u09cd\7\u013d\2\2\u09cd"+
		"\u09ce\7\u013e\2\2\u09ce\u01bd\3\2\2\2\u09cf\u09d0\5\u018c\u00c7\2\u09d0"+
		"\u09d1\7\u013f\2\2\u09d1\u01bf\3\2\2\2\u09d2\u09d3\5\u018c\u00c7\2\u09d3"+
		"\u09d4\7\u0140\2\2\u09d4\u01c1\3\2\2\2\u09d5\u09d6\7\u0120\2\2\u09d6\u09d7"+
		"\7\u00a2\2\2\u09d7\u09d8\7\u0123\2\2\u09d8\u09d9\7\u0124\2\2\u09d9\u01c3"+
		"\3\2\2\2\u09da\u09db\7\63\2\2\u09db\u09dc\7\u0141\2\2\u09dc\u09e0\7\u012a"+
		"\2\2\u09dd\u09de\7;\2\2\u09de\u09e0\7\u0142\2\2\u09df\u09da\3\2\2\2\u09df"+
		"\u09dd\3\2\2\2\u09e0\u01c5\3\2\2\2\u09e1\u09e2\5\u018c\u00c7\2\u09e2\u09e3"+
		"\7H\2\2\u09e3\u01c7\3\2\2\2\u09e4\u09e5\5\u018c\u00c7\2\u09e5\u09e6\7"+
		"\u0102\2\2\u09e6\u01c9\3\2\2\2\u09e7\u09eb\5\u018c\u00c7\2\u09e8\u09e9"+
		"\78\2\2\u09e9\u09eb\7q\2\2\u09ea\u09e7\3\2\2\2\u09ea\u09e8\3\2\2\2\u09eb"+
		"\u09ec\3\2\2\2\u09ec\u09ed\7\u00c6\2\2\u09ed\u01cb\3\2\2\2\u09ee\u09ef"+
		"\5\u018c\u00c7\2\u09ef\u09f0\7}\2\2\u09f0\u09f1\7\u0143\2\2\u09f1\u01cd"+
		"\3\2\2\2\u09f2\u09f3\5\u018c\u00c7\2\u09f3\u09f4\7\u00d3\2\2\u09f4\u01cf"+
		"\3\2\2\2\u09f5\u09f6\t\35\2\2\u09f6\u09fb\7\u011c\2\2\u09f7\u09f8\7\64"+
		"\2\2\u09f8\u09f9\7\u0108\2\2\u09f9\u09fb\7\u0145\2\2\u09fa\u09f5\3\2\2"+
		"\2\u09fa\u09f7\3\2\2\2\u09fb\u01d1\3\2\2\2\u09fc\u0a00\5\u018c\u00c7\2"+
		"\u09fd\u09fe\7\u00ca\2\2\u09fe\u0a00\7q\2\2\u09ff\u09fc\3\2\2\2\u09ff"+
		"\u09fd\3\2\2\2\u0a00\u0a01\3\2\2\2\u0a01\u0a02\7\u00a2\2\2\u0a02\u0a03"+
		"\7\u0111\2\2\u0a03\u0a08\7\u0102\2\2\u0a04\u0a05\7\u00d5\2\2\u0a05\u0a06"+
		"\7q\2\2\u0a06\u0a08\7\u00a2\2\2\u0a07\u09ff\3\2\2\2\u0a07\u0a04\3\2\2"+
		"\2\u0a08\u01d3\3\2\2\2\u0a09\u0a0a\5\u018c\u00c7\2\u0a0a\u0a0b\7\u0146"+
		"\2\2\u0a0b\u0a10\3\2\2\2\u0a0c\u0a0d\7\65\2\2\u0a0d\u0a0e\7\u011b\2\2"+
		"\u0a0e\u0a10\7\u0146\2\2\u0a0f\u0a09\3\2\2\2\u0a0f\u0a0c\3\2\2\2\u0a10"+
		"\u01d5\3\2\2\2\u0a11\u0a15\5\u018c\u00c7\2\u0a12\u0a13\t\36\2\2\u0a13"+
		"\u0a15\7q\2\2\u0a14\u0a11\3\2\2\2\u0a14\u0a12\3\2\2\2\u0a15\u0a16\3\2"+
		"\2\2\u0a16\u0a17\7<\2\2\u0a17\u01d7\3\2\2\2\u0a18\u0a1c\5\u018c\u00c7"+
		"\2\u0a19\u0a1c\7\u0122\2\2\u0a1a\u0a1c\7\u0148\2\2\u0a1b\u0a18\3\2\2\2"+
		"\u0a1b\u0a19\3\2\2\2\u0a1b\u0a1a\3\2\2\2\u0a1c\u0a1d\3\2\2\2\u0a1d\u0a1e"+
		"\7\u010f\2\2\u0a1e\u01d9\3\2\2\2\u0a1f\u0a20\5\u018c\u00c7\2\u0a20\u0a21"+
		"\7G\2\2\u0a21\u0a26\3\2\2\2\u0a22\u0a23\7\u0120\2\2\u0a23\u0a24\7\u012a"+
		"\2\2\u0a24\u0a26\7G\2\2\u0a25\u0a1f\3\2\2\2\u0a25\u0a22\3\2\2\2\u0a26"+
		"\u01db\3\2\2\2\u0a27\u0a2b\5\u018c\u00c7\2\u0a28\u0a29\7\u00cc\2\2\u0a29"+
		"\u0a2b\7q\2\2\u0a2a\u0a27\3\2\2\2\u0a2a\u0a28\3\2\2\2\u0a2b\u0a2c\3\2"+
		"\2\2\u0a2c\u0a2d\7\u00ae\2\2\u0a2d\u01dd\3\2\2\2\u0a2e\u0a2f\5\u018c\u00c7"+
		"\2\u0a2f\u0a30\7\u00c5\2\2\u0a30\u01df\3\2\2\2\u0a31\u0a35\5\u018c\u00c7"+
		"\2\u0a32\u0a33\t\37\2\2\u0a33\u0a35\7q\2\2\u0a34\u0a31\3\2\2\2\u0a34\u0a32"+
		"\3\2\2\2\u0a35\u0a36\3\2\2\2\u0a36\u0a37\7I\2\2\u0a37\u01e1\3\2\2\2\u0a38"+
		"\u0a39\7\u012e\2\2\u0a39\u0a65\7q\2\2\u0a3a\u0a3b\7\u012c\2\2\u0a3b\u0a65"+
		"\7q\2\2\u0a3c\u0a3d\7\u0149\2\2\u0a3d\u0a65\7\u00c5\2\2\u0a3e\u0a3f\7"+
		"\u014a\2\2\u0a3f\u0a65\7\u014b\2\2\u0a40\u0a41\7\u011d\2\2\u0a41\u0a42"+
		"\7q\2\2\u0a42\u0a65\7<\2\2\u0a43\u0a44\7\u0127\2\2\u0a44\u0a45\7\u014c"+
		"\2\2\u0a45\u0a65\7\u0129\2\2\u0a46\u0a48\7\u00ea\2\2\u0a47\u0a49\7q\2"+
		"\2\u0a48\u0a47\3\2\2\2\u0a48\u0a49\3\2\2\2\u0a49\u0a4a\3\2\2\2\u0a4a\u0a65"+
		"\7\u00c4\2\2\u0a4b\u0a4c\78\2\2\u0a4c\u0a4e\7q\2\2\u0a4d\u0a4f\7\u0124"+
		"\2\2\u0a4e\u0a4d\3\2\2\2\u0a4e\u0a4f\3\2\2\2\u0a4f\u0a50\3\2\2\2\u0a50"+
		"\u0a65\7\u014d\2\2\u0a51\u0a52\7\u00d4\2\2\u0a52\u0a53\7q\2\2\u0a53\u0a65"+
		"\7\u00bf\2\2\u0a54\u0a55\7\u00d2\2\2\u0a55\u0a56\7\u0085\2\2\u0a56\u0a65"+
		"\7\u0086\2\2\u0a57\u0a58\7\u00d2\2\2\u0a58\u0a65\7\u0150\2\2\u0a59\u0a5a"+
		"\7\u014e\2\2\u0a5a\u0a65\7\u0156\2\2\u0a5b\u0a65\7\u014f\2\2\u0a5c\u0a5d"+
		"\7/\2\2\u0a5d\u0a5e\7q\2\2\u0a5e\u0a65\t \2\2\u0a5f\u0a65\7\u0151\2\2"+
		"\u0a60\u0a65\7\u0152\2\2\u0a61\u0a65\7\u0153\2\2\u0a62\u0a65\7\u0154\2"+
		"\2\u0a63\u0a65\7\u0155\2\2\u0a64\u0a38\3\2\2\2\u0a64\u0a3a\3\2\2\2\u0a64"+
		"\u0a3c\3\2\2\2\u0a64\u0a3e\3\2\2\2\u0a64\u0a40\3\2\2\2\u0a64\u0a43\3\2"+
		"\2\2\u0a64\u0a46\3\2\2\2\u0a64\u0a4b\3\2\2\2\u0a64\u0a51\3\2\2\2\u0a64"+
		"\u0a54\3\2\2\2\u0a64\u0a57\3\2\2\2\u0a64\u0a59\3\2\2\2\u0a64\u0a5b\3\2"+
		"\2\2\u0a64\u0a5c\3\2\2\2\u0a64\u0a5f\3\2\2\2\u0a64\u0a60\3\2\2\2\u0a64"+
		"\u0a61\3\2\2\2\u0a64\u0a62\3\2\2\2\u0a64\u0a63\3\2\2\2\u0a65\u01e3\3\2"+
		"\2\2\u0a66\u0a67\7\63\2\2\u0a67\u0a68\7\u00c5\2\2\u0a68\u01e5\3\2\2\2"+
		"\u0a69\u0a6a\7\65\2\2\u0a6a\u0a6b\7\u00c5\2\2\u0a6b\u01e7\3\2\2\2\u0a6c"+
		"\u0a6d\7\64\2\2\u0a6d\u0a6e\7\u00c5\2\2\u0a6e\u01e9\3\2\2\2\u0a6f\u0a70"+
		"\7\63\2\2\u0a70\u0a71\7\u00c6\2\2\u0a71\u01eb\3\2\2\2\u0a72\u0a73\7\65"+
		"\2\2\u0a73\u0a74\7\u00c6\2\2\u0a74\u01ed\3\2\2\2\u0a75\u0a76\7\64\2\2"+
		"\u0a76\u0a77\7\u00c6\2\2\u0a77\u01ef\3\2\2\2\u0a78\u0a79\7\u009c\2\2\u0a79"+
		"\u01f1\3\2\2\2\u012a\u020a\u020d\u0212\u0217\u021d\u0220\u0228\u022d\u0230"+
		"\u0238\u023e\u0243\u0246\u0249\u0251\u0256\u025b\u0269\u0272\u0279\u027d"+
		"\u0281\u0285\u0288\u028d\u0290\u0294\u0297\u029a\u02a5\u02a9\u02ae\u02b2"+
		"\u02ba\u02bf\u02c4\u02c8\u02cb\u02ce\u02d1\u02d4\u02da\u02e0\u02e5\u02e8"+
		"\u02eb\u02ee\u02f2\u0301\u0308\u030d\u0310\u0314\u0318\u031e\u0321\u0324"+
		"\u032a\u032d\u0331\u0336\u0338\u033e\u034a\u035d\u0362\u036d\u0379\u0382"+
		"\u0389\u0392\u0399\u039d\u03a0\u03a7\u03ab\u03b4\u03b8\u03c0\u03c2\u03c7"+
		"\u03d0\u03e0\u03e8\u03f5\u0404\u0406\u040d\u0414\u041d\u0424\u042d\u0433"+
		"\u0436\u0459\u045b\u0466\u046e\u0474\u047e\u0485\u048b\u0490\u0497\u049b"+
		"\u04a5\u04b5\u04ba\u04c5\u04c9\u04d2\u04d6\u04db\u04de\u04ef\u04f5\u04f8"+
		"\u0503\u0508\u050f\u0518\u051d\u0521\u052c\u0534\u0538\u053a\u0576\u057a"+
		"\u057e\u0587\u0589\u0590\u059a\u059f\u05a2\u05aa\u05bd\u05c4\u05ca\u05ce"+
		"\u05d5\u05dd\u05e2\u05e5\u05f2\u061c\u062b\u0631\u0638\u063f\u0644\u064b"+
		"\u064f\u0654\u0657\u065a\u065f\u0667\u0669\u0670\u0675\u0677\u067a\u0681"+
		"\u0693\u0697\u069c\u069f\u06a2\u06a5\u06a9\u06ac\u06b7\u06bc\u06c2\u06c9"+
		"\u06cb\u06d7\u06da\u06e9\u06f6\u06fc\u06ff\u0703\u0707\u070e\u0713\u0718"+
		"\u0729\u072e\u0742\u074b\u074e\u0751\u0755\u075f\u0766\u0769\u0778\u077f"+
		"\u0783\u0787\u078b\u0790\u0794\u079b\u07a0\u07a9\u07ac\u07b1\u07b6\u07be"+
		"\u07c4\u07c8\u07cd\u07d6\u07db\u07df\u07e5\u07eb\u07ef\u07f6\u07fa\u07fd"+
		"\u0801\u0805\u080a\u080f\u0815\u081c\u0824\u0828\u082f\u0833\u083d\u0842"+
		"\u0847\u0858\u085a\u0860\u0863\u086a\u086d\u0874\u0879\u0883\u0887\u088c"+
		"\u088e\u0893\u0895\u089c\u08a1\u08a5\u08aa\u08ae\u08b0\u08b4\u08b9\u08c8"+
		"\u08ce\u08da\u08df\u08e3\u08e8\u0906\u0914\u0943\u0947\u094a\u0951\u0958"+
		"\u095a\u096a\u096e\u0978\u0993\u099b\u09ab\u09b5\u09ba\u09df\u09ea\u09fa"+
		"\u09ff\u0a07\u0a0f\u0a14\u0a1b\u0a25\u0a2a\u0a34\u0a48\u0a4e\u0a64";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
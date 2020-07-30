// Generated from org\apache\shardingsphere\sql\parser\autogen\SQLServerStatement.g4 by ANTLR 4.7.2
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
public class SQLServerStatementParser extends Parser {
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
		DECIMAL=171, TYPE=172, BIT=173, SMALLINT=174, INT=175, TINYINT=176, NUMERIC=177, 
		FLOAT=178, BIGINT=179, TEXT=180, VARCHAR=181, FOR_GENERATOR=182, BINARY=183, 
		ESCAPE=184, HIDDEN_=185, MOD=186, PARTITION=187, PARTITIONS=188, TOP=189, 
		ROW=190, ROWS=191, UNKNOWN=192, XOR=193, ALWAYS=194, CASCADE=195, CHECK=196, 
		GENERATED=197, NO=198, OPTION=199, PRIVILEGES=200, REFERENCES=201, USER=202, 
		ROLE=203, START=204, TRANSACTION=205, ACTION=206, ALGORITHM=207, AUTO=208, 
		BLOCKERS=209, CLUSTERED=210, NONCLUSTERED=211, COLLATE=212, COLUMNSTORE=213, 
		CONTENT=214, CONVERT=215, DATABASE=216, YEARS=217, MONTHS=218, WEEKS=219, 
		DAYS=220, MINUTES=221, DENY=222, DETERMINISTIC=223, DISTRIBUTION=224, 
		DOCUMENT=225, DURABILITY=226, ENCRYPTED=227, END=228, FILESTREAM=229, 
		FILETABLE=230, FILLFACTOR=231, FOLLOWING=232, HASH=233, HEAP=234, IDENTITY=235, 
		INBOUND=236, OUTBOUND=237, UNBOUNDED=238, INFINITE=239, LOGIN=240, MASKED=241, 
		MAXDOP=242, MOVE=243, NOCHECK=244, NONE=245, OBJECT=246, OFF=247, ONLINE=248, 
		OVER=249, PAGE=250, PAUSED=251, PERIOD=252, PERSISTED=253, PRECEDING=254, 
		RANDOMIZED=255, RANGE=256, REBUILD=257, REPLICATE=258, REPLICATION=259, 
		RESUMABLE=260, ROWGUIDCOL=261, SAVE=262, SELF=263, SPARSE=264, SWITCH=265, 
		TRAN=266, TRANCOUNT=267, ZONE=268, EXECUTE=269, SESSION=270, CONNECT=271, 
		CONNECTION=272, CATALOG=273, CONTROL=274, TAKE=275, OWNERSHIP=276, DEFINITION=277, 
		APPLICATION=278, ASSEMBLY=279, SYMMETRIC=280, ASYMMETRIC=281, SERVER=282, 
		RECEIVE=283, CHANGE=284, TRACE=285, TRACKING=286, RESOURCES=287, SETTINGS=288, 
		STATE=289, AVAILABILITY=290, CREDENTIAL=291, ENDPOINT=292, EVENT=293, 
		NOTIFICATION=294, LINKED=295, AUDIT=296, DDL=297, XML=298, IMPERSONATE=299, 
		SECURABLES=300, AUTHENTICATE=301, EXTERNAL=302, ACCESS=303, ADMINISTER=304, 
		BULK=305, OPERATIONS=306, UNSAFE=307, SHUTDOWN=308, SCOPED=309, CONFIGURATION=310, 
		DATASPACE=311, SERVICE=312, CERTIFICATE=313, CONTRACT=314, ENCRYPTION=315, 
		MASTER=316, DATA=317, SOURCE=318, FILE=319, FORMAT=320, LIBRARY=321, FULLTEXT=322, 
		MASK=323, UNMASK=324, MESSAGE=325, REMOTE=326, BINDING=327, ROUTE=328, 
		SECURITY=329, POLICY=330, AGGREGATE=331, QUEUE=332, RULE=333, SYNONYM=334, 
		COLLECTION=335, SCRIPT=336, KILL=337, BACKUP=338, LOG=339, SHOWPLAN=340, 
		SUBSCRIBE=341, QUERY=342, NOTIFICATIONS=343, CHECKPOINT=344, SEQUENCE=345, 
		ABORT_AFTER_WAIT=346, ALLOW_PAGE_LOCKS=347, ALLOW_ROW_LOCKS=348, ALL_SPARSE_COLUMNS=349, 
		BUCKET_COUNT=350, COLUMNSTORE_ARCHIVE=351, COLUMN_ENCRYPTION_KEY=352, 
		COLUMN_SET=353, COMPRESSION_DELAY=354, DATABASE_DEAULT=355, DATA_COMPRESSION=356, 
		DATA_CONSISTENCY_CHECK=357, ENCRYPTION_TYPE=358, SYSTEM_TIME=359, SYSTEM_VERSIONING=360, 
		TEXTIMAGE_ON=361, WAIT_AT_LOW_PRIORITY=362, STATISTICS_INCREMENTAL=363, 
		STATISTICS_NORECOMPUTE=364, ROUND_ROBIN=365, SCHEMA_AND_DATA=366, SCHEMA_ONLY=367, 
		SORT_IN_TEMPDB=368, IGNORE_DUP_KEY=369, IMPLICIT_TRANSACTIONS=370, MAX_DURATION=371, 
		MEMORY_OPTIMIZED=372, MIGRATION_STATE=373, PAD_INDEX=374, REMOTE_DATA_ARCHIVE=375, 
		FILESTREAM_ON=376, FILETABLE_COLLATE_FILENAME=377, FILETABLE_DIRECTORY=378, 
		FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME=379, FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME=380, 
		FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME=381, FILTER_PREDICATE=382, HISTORY_RETENTION_PERIOD=383, 
		HISTORY_TABLE=384, LOCK_ESCALATION=385, DROP_EXISTING=386, ROW_NUMBER=387, 
		FETCH=388, FIRST=389, ONLY=390, MONEY=391, SMALLMONEY=392, DATETIMEOFFSET=393, 
		DATETIME=394, DATETIME2=395, SMALLDATETIME=396, NCHAR=397, NVARCHAR=398, 
		NTEXT=399, VARBINARY=400, IMAGE=401, SQL_VARIANT=402, UNIQUEIDENTIFIER=403, 
		HIERARCHYID=404, GEOMETRY=405, GEOGRAPHY=406, IDENTIFIER_=407, STRING_=408, 
		NUMBER_=409, HEX_DIGIT_=410, BIT_NUM_=411;
	public static final int
		RULE_execute = 0, RULE_insert = 1, RULE_insertValuesClause = 2, RULE_insertSelectClause = 3, 
		RULE_update = 4, RULE_assignment = 5, RULE_setAssignmentsClause = 6, RULE_assignmentValues = 7, 
		RULE_assignmentValue = 8, RULE_delete = 9, RULE_singleTableClause = 10, 
		RULE_multipleTablesClause = 11, RULE_multipleTableNames = 12, RULE_select = 13, 
		RULE_unionClause = 14, RULE_selectClause = 15, RULE_duplicateSpecification = 16, 
		RULE_projections = 17, RULE_projection = 18, RULE_top = 19, RULE_alias = 20, 
		RULE_unqualifiedShorthand = 21, RULE_qualifiedShorthand = 22, RULE_fromClause = 23, 
		RULE_tableReferences = 24, RULE_tableReference = 25, RULE_tableFactor = 26, 
		RULE_joinedTable = 27, RULE_joinSpecification = 28, RULE_whereClause = 29, 
		RULE_groupByClause = 30, RULE_havingClause = 31, RULE_subquery = 32, RULE_parameterMarker = 33, 
		RULE_literals = 34, RULE_stringLiterals = 35, RULE_numberLiterals = 36, 
		RULE_dateTimeLiterals = 37, RULE_hexadecimalLiterals = 38, RULE_bitValueLiterals = 39, 
		RULE_booleanLiterals = 40, RULE_nullValueLiterals = 41, RULE_identifier = 42, 
		RULE_unreservedWord = 43, RULE_schemaName = 44, RULE_tableName = 45, RULE_columnName = 46, 
		RULE_owner = 47, RULE_name = 48, RULE_columnNames = 49, RULE_tableNames = 50, 
		RULE_indexName = 51, RULE_collationName = 52, RULE_dataTypeLength = 53, 
		RULE_primaryKey = 54, RULE_expr = 55, RULE_logicalOperator = 56, RULE_notOperator_ = 57, 
		RULE_booleanPrimary = 58, RULE_comparisonOperator = 59, RULE_predicate = 60, 
		RULE_bitExpr = 61, RULE_simpleExpr = 62, RULE_functionCall = 63, RULE_aggregationFunction = 64, 
		RULE_aggregationFunctionName = 65, RULE_distinct = 66, RULE_specialFunction = 67, 
		RULE_castFunction = 68, RULE_charFunction = 69, RULE_regularFunction = 70, 
		RULE_regularFunctionName_ = 71, RULE_caseExpression = 72, RULE_caseWhen_ = 73, 
		RULE_caseElse_ = 74, RULE_privateExprOfDb = 75, RULE_orderByClause = 76, 
		RULE_orderByItem = 77, RULE_dataType = 78, RULE_dataTypeName = 79, RULE_atTimeZoneExpr = 80, 
		RULE_castExpr = 81, RULE_convertExpr = 82, RULE_windowedFunction = 83, 
		RULE_overClause = 84, RULE_partitionByClause = 85, RULE_rowRangeClause = 86, 
		RULE_windowFrameExtent = 87, RULE_windowFrameBetween = 88, RULE_windowFrameBound = 89, 
		RULE_windowFramePreceding = 90, RULE_windowFrameFollowing = 91, RULE_columnNameWithSort = 92, 
		RULE_indexOption = 93, RULE_compressionOption = 94, RULE_eqTime = 95, 
		RULE_eqOnOffOption = 96, RULE_eqKey = 97, RULE_eqOnOff = 98, RULE_onPartitionClause = 99, 
		RULE_partitionExpressions = 100, RULE_partitionExpression = 101, RULE_numberRange = 102, 
		RULE_lowPriorityLockWait = 103, RULE_onLowPriorLockWait = 104, RULE_ignoredIdentifier_ = 105, 
		RULE_ignoredIdentifiers_ = 106, RULE_matchNone = 107, RULE_createTable = 108, 
		RULE_createIndex = 109, RULE_alterTable = 110, RULE_alterIndex = 111, 
		RULE_dropTable = 112, RULE_dropIndex = 113, RULE_truncateTable = 114, 
		RULE_fileTableClause_ = 115, RULE_createDefinitionClause = 116, RULE_createTableDefinitions = 117, 
		RULE_createTableDefinition = 118, RULE_columnDefinition = 119, RULE_columnDefinitionOption = 120, 
		RULE_encryptedOptions_ = 121, RULE_columnConstraint = 122, RULE_primaryKeyConstraint = 123, 
		RULE_diskTablePrimaryKeyConstraintOption = 124, RULE_clusterOption_ = 125, 
		RULE_primaryKeyWithClause = 126, RULE_primaryKeyOnClause = 127, RULE_onSchemaColumn = 128, 
		RULE_onFileGroup = 129, RULE_onString = 130, RULE_memoryTablePrimaryKeyConstraintOption = 131, 
		RULE_withBucket = 132, RULE_columnForeignKeyConstraint = 133, RULE_foreignKeyOnAction = 134, 
		RULE_foreignKeyOn = 135, RULE_checkConstraint = 136, RULE_columnIndex = 137, 
		RULE_withIndexOption_ = 138, RULE_indexOnClause = 139, RULE_onDefault = 140, 
		RULE_fileStreamOn_ = 141, RULE_columnConstraints = 142, RULE_computedColumnDefinition = 143, 
		RULE_columnSetDefinition = 144, RULE_tableConstraint = 145, RULE_tablePrimaryConstraint = 146, 
		RULE_primaryKeyUnique = 147, RULE_diskTablePrimaryConstraintOption = 148, 
		RULE_memoryTablePrimaryConstraintOption = 149, RULE_hashWithBucket = 150, 
		RULE_tableForeignKeyConstraint = 151, RULE_tableIndex = 152, RULE_indexNameOption_ = 153, 
		RULE_indexOptions_ = 154, RULE_periodClause = 155, RULE_partitionScheme_ = 156, 
		RULE_fileGroup_ = 157, RULE_tableOptions = 158, RULE_tableOption = 159, 
		RULE_tableStretchOptions = 160, RULE_tableStretchOption = 161, RULE_migrationState_ = 162, 
		RULE_tableOperationOption = 163, RULE_distributionOption = 164, RULE_dataWareHouseTableOption = 165, 
		RULE_dataWareHousePartitionOption = 166, RULE_createIndexSpecification_ = 167, 
		RULE_alterDefinitionClause = 168, RULE_addColumnSpecification = 169, RULE_modifyColumnSpecification = 170, 
		RULE_alterColumnOperation = 171, RULE_alterColumnAddOptions = 172, RULE_alterColumnAddOption = 173, 
		RULE_constraintForColumn = 174, RULE_columnNameWithSortsWithParen = 175, 
		RULE_generatedColumnNamesClause = 176, RULE_generatedColumnNameClause = 177, 
		RULE_generatedColumnName = 178, RULE_alterDrop = 179, RULE_alterTableDropConstraint = 180, 
		RULE_dropConstraintName = 181, RULE_dropConstraintWithClause = 182, RULE_dropConstraintOption = 183, 
		RULE_onOffOption_ = 184, RULE_dropColumnSpecification = 185, RULE_dropIndexSpecification = 186, 
		RULE_alterCheckConstraint = 187, RULE_alterTrigger = 188, RULE_alterSwitch = 189, 
		RULE_alterSet = 190, RULE_setFileStreamClause = 191, RULE_setSystemVersionClause = 192, 
		RULE_alterSetOnClause = 193, RULE_dataConsistencyCheckClause_ = 194, RULE_historyRetentionPeriodClause_ = 195, 
		RULE_historyRetentionPeriod = 196, RULE_alterTableTableIndex = 197, RULE_indexWithName = 198, 
		RULE_indexNonClusterClause = 199, RULE_alterTableIndexOnClause = 200, 
		RULE_indexClusterClause = 201, RULE_alterTableOption = 202, RULE_onHistoryTableClause = 203, 
		RULE_ifExist_ = 204, RULE_setTransaction = 205, RULE_setImplicitTransactions = 206, 
		RULE_implicitTransactionsValue = 207, RULE_beginTransaction = 208, RULE_commit = 209, 
		RULE_rollback = 210, RULE_savepoint = 211, RULE_grant = 212, RULE_revoke = 213, 
		RULE_deny = 214, RULE_classPrivilegesClause = 215, RULE_classTypePrivilegesClause = 216, 
		RULE_optionForClause_ = 217, RULE_classPrivileges_ = 218, RULE_onClassClause = 219, 
		RULE_classTypePrivileges_ = 220, RULE_onClassTypeClause = 221, RULE_privilegeType_ = 222, 
		RULE_basicPermission_ = 223, RULE_objectPermission_ = 224, RULE_serverPermission_ = 225, 
		RULE_serverPrincipalPermission_ = 226, RULE_databasePermission_ = 227, 
		RULE_databasePrincipalPermission_ = 228, RULE_schemaPermission_ = 229, 
		RULE_serviceBrokerPermission_ = 230, RULE_endpointPermission_ = 231, RULE_certificatePermission_ = 232, 
		RULE_symmetricKeyPermission_ = 233, RULE_asymmetricKeyPermission_ = 234, 
		RULE_assemblyPermission_ = 235, RULE_availabilityGroupPermission_ = 236, 
		RULE_fullTextPermission_ = 237, RULE_class_ = 238, RULE_classType_ = 239, 
		RULE_roleClause_ = 240, RULE_createUser = 241, RULE_dropUser = 242, RULE_alterUser = 243, 
		RULE_createRole = 244, RULE_dropRole = 245, RULE_alterRole = 246, RULE_createLogin = 247, 
		RULE_dropLogin = 248, RULE_alterLogin = 249, RULE_call = 250;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "insert", "insertValuesClause", "insertSelectClause", "update", 
			"assignment", "setAssignmentsClause", "assignmentValues", "assignmentValue", 
			"delete", "singleTableClause", "multipleTablesClause", "multipleTableNames", 
			"select", "unionClause", "selectClause", "duplicateSpecification", "projections", 
			"projection", "top", "alias", "unqualifiedShorthand", "qualifiedShorthand", 
			"fromClause", "tableReferences", "tableReference", "tableFactor", "joinedTable", 
			"joinSpecification", "whereClause", "groupByClause", "havingClause", 
			"subquery", "parameterMarker", "literals", "stringLiterals", "numberLiterals", 
			"dateTimeLiterals", "hexadecimalLiterals", "bitValueLiterals", "booleanLiterals", 
			"nullValueLiterals", "identifier", "unreservedWord", "schemaName", "tableName", 
			"columnName", "owner", "name", "columnNames", "tableNames", "indexName", 
			"collationName", "dataTypeLength", "primaryKey", "expr", "logicalOperator", 
			"notOperator_", "booleanPrimary", "comparisonOperator", "predicate", 
			"bitExpr", "simpleExpr", "functionCall", "aggregationFunction", "aggregationFunctionName", 
			"distinct", "specialFunction", "castFunction", "charFunction", "regularFunction", 
			"regularFunctionName_", "caseExpression", "caseWhen_", "caseElse_", "privateExprOfDb", 
			"orderByClause", "orderByItem", "dataType", "dataTypeName", "atTimeZoneExpr", 
			"castExpr", "convertExpr", "windowedFunction", "overClause", "partitionByClause", 
			"rowRangeClause", "windowFrameExtent", "windowFrameBetween", "windowFrameBound", 
			"windowFramePreceding", "windowFrameFollowing", "columnNameWithSort", 
			"indexOption", "compressionOption", "eqTime", "eqOnOffOption", "eqKey", 
			"eqOnOff", "onPartitionClause", "partitionExpressions", "partitionExpression", 
			"numberRange", "lowPriorityLockWait", "onLowPriorLockWait", "ignoredIdentifier_", 
			"ignoredIdentifiers_", "matchNone", "createTable", "createIndex", "alterTable", 
			"alterIndex", "dropTable", "dropIndex", "truncateTable", "fileTableClause_", 
			"createDefinitionClause", "createTableDefinitions", "createTableDefinition", 
			"columnDefinition", "columnDefinitionOption", "encryptedOptions_", "columnConstraint", 
			"primaryKeyConstraint", "diskTablePrimaryKeyConstraintOption", "clusterOption_", 
			"primaryKeyWithClause", "primaryKeyOnClause", "onSchemaColumn", "onFileGroup", 
			"onString", "memoryTablePrimaryKeyConstraintOption", "withBucket", "columnForeignKeyConstraint", 
			"foreignKeyOnAction", "foreignKeyOn", "checkConstraint", "columnIndex", 
			"withIndexOption_", "indexOnClause", "onDefault", "fileStreamOn_", "columnConstraints", 
			"computedColumnDefinition", "columnSetDefinition", "tableConstraint", 
			"tablePrimaryConstraint", "primaryKeyUnique", "diskTablePrimaryConstraintOption", 
			"memoryTablePrimaryConstraintOption", "hashWithBucket", "tableForeignKeyConstraint", 
			"tableIndex", "indexNameOption_", "indexOptions_", "periodClause", "partitionScheme_", 
			"fileGroup_", "tableOptions", "tableOption", "tableStretchOptions", "tableStretchOption", 
			"migrationState_", "tableOperationOption", "distributionOption", "dataWareHouseTableOption", 
			"dataWareHousePartitionOption", "createIndexSpecification_", "alterDefinitionClause", 
			"addColumnSpecification", "modifyColumnSpecification", "alterColumnOperation", 
			"alterColumnAddOptions", "alterColumnAddOption", "constraintForColumn", 
			"columnNameWithSortsWithParen", "generatedColumnNamesClause", "generatedColumnNameClause", 
			"generatedColumnName", "alterDrop", "alterTableDropConstraint", "dropConstraintName", 
			"dropConstraintWithClause", "dropConstraintOption", "onOffOption_", "dropColumnSpecification", 
			"dropIndexSpecification", "alterCheckConstraint", "alterTrigger", "alterSwitch", 
			"alterSet", "setFileStreamClause", "setSystemVersionClause", "alterSetOnClause", 
			"dataConsistencyCheckClause_", "historyRetentionPeriodClause_", "historyRetentionPeriod", 
			"alterTableTableIndex", "indexWithName", "indexNonClusterClause", "alterTableIndexOnClause", 
			"indexClusterClause", "alterTableOption", "onHistoryTableClause", "ifExist_", 
			"setTransaction", "setImplicitTransactions", "implicitTransactionsValue", 
			"beginTransaction", "commit", "rollback", "savepoint", "grant", "revoke", 
			"deny", "classPrivilegesClause", "classTypePrivilegesClause", "optionForClause_", 
			"classPrivileges_", "onClassClause", "classTypePrivileges_", "onClassTypeClause", 
			"privilegeType_", "basicPermission_", "objectPermission_", "serverPermission_", 
			"serverPrincipalPermission_", "databasePermission_", "databasePrincipalPermission_", 
			"schemaPermission_", "serviceBrokerPermission_", "endpointPermission_", 
			"certificatePermission_", "symmetricKeyPermission_", "asymmetricKeyPermission_", 
			"assemblyPermission_", "availabilityGroupPermission_", "fullTextPermission_", 
			"class_", "classType_", "roleClause_", "createUser", "dropUser", "alterUser", 
			"createRole", "dropRole", "alterRole", "createLogin", "dropLogin", "alterLogin", 
			"call"
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
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
			"DECIMAL", "TYPE", "BIT", "SMALLINT", "INT", "TINYINT", "NUMERIC", "FLOAT", 
			"BIGINT", "TEXT", "VARCHAR", "FOR_GENERATOR", "BINARY", "ESCAPE", "HIDDEN_", 
			"MOD", "PARTITION", "PARTITIONS", "TOP", "ROW", "ROWS", "UNKNOWN", "XOR", 
			"ALWAYS", "CASCADE", "CHECK", "GENERATED", "NO", "OPTION", "PRIVILEGES", 
			"REFERENCES", "USER", "ROLE", "START", "TRANSACTION", "ACTION", "ALGORITHM", 
			"AUTO", "BLOCKERS", "CLUSTERED", "NONCLUSTERED", "COLLATE", "COLUMNSTORE", 
			"CONTENT", "CONVERT", "DATABASE", "YEARS", "MONTHS", "WEEKS", "DAYS", 
			"MINUTES", "DENY", "DETERMINISTIC", "DISTRIBUTION", "DOCUMENT", "DURABILITY", 
			"ENCRYPTED", "END", "FILESTREAM", "FILETABLE", "FILLFACTOR", "FOLLOWING", 
			"HASH", "HEAP", "IDENTITY", "INBOUND", "OUTBOUND", "UNBOUNDED", "INFINITE", 
			"LOGIN", "MASKED", "MAXDOP", "MOVE", "NOCHECK", "NONE", "OBJECT", "OFF", 
			"ONLINE", "OVER", "PAGE", "PAUSED", "PERIOD", "PERSISTED", "PRECEDING", 
			"RANDOMIZED", "RANGE", "REBUILD", "REPLICATE", "REPLICATION", "RESUMABLE", 
			"ROWGUIDCOL", "SAVE", "SELF", "SPARSE", "SWITCH", "TRAN", "TRANCOUNT", 
			"ZONE", "EXECUTE", "SESSION", "CONNECT", "CONNECTION", "CATALOG", "CONTROL", 
			"TAKE", "OWNERSHIP", "DEFINITION", "APPLICATION", "ASSEMBLY", "SYMMETRIC", 
			"ASYMMETRIC", "SERVER", "RECEIVE", "CHANGE", "TRACE", "TRACKING", "RESOURCES", 
			"SETTINGS", "STATE", "AVAILABILITY", "CREDENTIAL", "ENDPOINT", "EVENT", 
			"NOTIFICATION", "LINKED", "AUDIT", "DDL", "XML", "IMPERSONATE", "SECURABLES", 
			"AUTHENTICATE", "EXTERNAL", "ACCESS", "ADMINISTER", "BULK", "OPERATIONS", 
			"UNSAFE", "SHUTDOWN", "SCOPED", "CONFIGURATION", "DATASPACE", "SERVICE", 
			"CERTIFICATE", "CONTRACT", "ENCRYPTION", "MASTER", "DATA", "SOURCE", 
			"FILE", "FORMAT", "LIBRARY", "FULLTEXT", "MASK", "UNMASK", "MESSAGE", 
			"REMOTE", "BINDING", "ROUTE", "SECURITY", "POLICY", "AGGREGATE", "QUEUE", 
			"RULE", "SYNONYM", "COLLECTION", "SCRIPT", "KILL", "BACKUP", "LOG", "SHOWPLAN", 
			"SUBSCRIBE", "QUERY", "NOTIFICATIONS", "CHECKPOINT", "SEQUENCE", "ABORT_AFTER_WAIT", 
			"ALLOW_PAGE_LOCKS", "ALLOW_ROW_LOCKS", "ALL_SPARSE_COLUMNS", "BUCKET_COUNT", 
			"COLUMNSTORE_ARCHIVE", "COLUMN_ENCRYPTION_KEY", "COLUMN_SET", "COMPRESSION_DELAY", 
			"DATABASE_DEAULT", "DATA_COMPRESSION", "DATA_CONSISTENCY_CHECK", "ENCRYPTION_TYPE", 
			"SYSTEM_TIME", "SYSTEM_VERSIONING", "TEXTIMAGE_ON", "WAIT_AT_LOW_PRIORITY", 
			"STATISTICS_INCREMENTAL", "STATISTICS_NORECOMPUTE", "ROUND_ROBIN", "SCHEMA_AND_DATA", 
			"SCHEMA_ONLY", "SORT_IN_TEMPDB", "IGNORE_DUP_KEY", "IMPLICIT_TRANSACTIONS", 
			"MAX_DURATION", "MEMORY_OPTIMIZED", "MIGRATION_STATE", "PAD_INDEX", "REMOTE_DATA_ARCHIVE", 
			"FILESTREAM_ON", "FILETABLE_COLLATE_FILENAME", "FILETABLE_DIRECTORY", 
			"FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME", "FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME", 
			"FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME", "FILTER_PREDICATE", "HISTORY_RETENTION_PERIOD", 
			"HISTORY_TABLE", "LOCK_ESCALATION", "DROP_EXISTING", "ROW_NUMBER", "FETCH", 
			"FIRST", "ONLY", "MONEY", "SMALLMONEY", "DATETIMEOFFSET", "DATETIME", 
			"DATETIME2", "SMALLDATETIME", "NCHAR", "NVARCHAR", "NTEXT", "VARBINARY", 
			"IMAGE", "SQL_VARIANT", "UNIQUEIDENTIFIER", "HIERARCHYID", "GEOMETRY", 
			"GEOGRAPHY", "IDENTIFIER_", "STRING_", "NUMBER_", "HEX_DIGIT_", "BIT_NUM_"
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
	public String getGrammarFileName() { return "SQLServerStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLServerStatementParser(TokenStream input) {
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
		public SetImplicitTransactionsContext setImplicitTransactions() {
			return getRuleContext(SetImplicitTransactionsContext.class,0);
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
		public DenyContext deny() {
			return getRuleContext(DenyContext.class,0);
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
		public CreateLoginContext createLogin() {
			return getRuleContext(CreateLoginContext.class,0);
		}
		public DropLoginContext dropLogin() {
			return getRuleContext(DropLoginContext.class,0);
		}
		public AlterLoginContext alterLogin() {
			return getRuleContext(AlterLoginContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(SQLServerStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitExecute(this);
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
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(502);
				select();
				}
				break;
			case 2:
				{
				setState(503);
				insert();
				}
				break;
			case 3:
				{
				setState(504);
				update();
				}
				break;
			case 4:
				{
				setState(505);
				delete();
				}
				break;
			case 5:
				{
				setState(506);
				createIndex();
				}
				break;
			case 6:
				{
				setState(507);
				alterIndex();
				}
				break;
			case 7:
				{
				setState(508);
				dropIndex();
				}
				break;
			case 8:
				{
				setState(509);
				createTable();
				}
				break;
			case 9:
				{
				setState(510);
				alterTable();
				}
				break;
			case 10:
				{
				setState(511);
				dropTable();
				}
				break;
			case 11:
				{
				setState(512);
				truncateTable();
				}
				break;
			case 12:
				{
				setState(513);
				setTransaction();
				}
				break;
			case 13:
				{
				setState(514);
				beginTransaction();
				}
				break;
			case 14:
				{
				setState(515);
				setImplicitTransactions();
				}
				break;
			case 15:
				{
				setState(516);
				commit();
				}
				break;
			case 16:
				{
				setState(517);
				rollback();
				}
				break;
			case 17:
				{
				setState(518);
				savepoint();
				}
				break;
			case 18:
				{
				setState(519);
				grant();
				}
				break;
			case 19:
				{
				setState(520);
				revoke();
				}
				break;
			case 20:
				{
				setState(521);
				deny();
				}
				break;
			case 21:
				{
				setState(522);
				createUser();
				}
				break;
			case 22:
				{
				setState(523);
				dropUser();
				}
				break;
			case 23:
				{
				setState(524);
				alterUser();
				}
				break;
			case 24:
				{
				setState(525);
				createRole();
				}
				break;
			case 25:
				{
				setState(526);
				dropRole();
				}
				break;
			case 26:
				{
				setState(527);
				alterRole();
				}
				break;
			case 27:
				{
				setState(528);
				createLogin();
				}
				break;
			case 28:
				{
				setState(529);
				dropLogin();
				}
				break;
			case 29:
				{
				setState(530);
				alterLogin();
				}
				break;
			case 30:
				{
				setState(531);
				call();
				}
				break;
			}
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(534);
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
		public TerminalNode INSERT() { return getToken(SQLServerStatementParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SQLServerStatementParser.INTO, 0); }
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
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitInsert(this);
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
			setState(537);
			match(INSERT);
			setState(538);
			match(INTO);
			setState(539);
			tableName();
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (FUNCTION - 52)) | (1L << (TRIGGER - 52)) | (1L << (AS - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (ARRAY - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (QUARTER - 119)) | (1L << (WEEK - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (INSTANCE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (INTEGER - 119)) | (1L << (TYPE - 119)))) != 0) || ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (BINARY - 183)) | (1L << (HIDDEN_ - 183)) | (1L << (MOD - 183)) | (1L << (PARTITION - 183)) | (1L << (PARTITIONS - 183)) | (1L << (TOP - 183)) | (1L << (ROW - 183)) | (1L << (XOR - 183)) | (1L << (ALWAYS - 183)) | (1L << (ROLE - 183)) | (1L << (START - 183)) | (1L << (ALGORITHM - 183)) | (1L << (AUTO - 183)) | (1L << (BLOCKERS - 183)) | (1L << (CLUSTERED - 183)) | (1L << (NONCLUSTERED - 183)) | (1L << (COLUMNSTORE - 183)) | (1L << (CONTENT - 183)) | (1L << (DATABASE - 183)) | (1L << (YEARS - 183)) | (1L << (MONTHS - 183)) | (1L << (WEEKS - 183)) | (1L << (DAYS - 183)) | (1L << (MINUTES - 183)) | (1L << (DENY - 183)) | (1L << (DETERMINISTIC - 183)) | (1L << (DISTRIBUTION - 183)) | (1L << (DOCUMENT - 183)) | (1L << (DURABILITY - 183)) | (1L << (ENCRYPTED - 183)) | (1L << (FILESTREAM - 183)) | (1L << (FILETABLE - 183)) | (1L << (FILLFACTOR - 183)) | (1L << (FOLLOWING - 183)) | (1L << (HASH - 183)) | (1L << (HEAP - 183)) | (1L << (INBOUND - 183)) | (1L << (OUTBOUND - 183)) | (1L << (UNBOUNDED - 183)) | (1L << (INFINITE - 183)) | (1L << (LOGIN - 183)) | (1L << (MASKED - 183)) | (1L << (MAXDOP - 183)) | (1L << (MOVE - 183)) | (1L << (NOCHECK - 183)) | (1L << (OBJECT - 183)))) != 0) || ((((_la - 247)) & ~0x3f) == 0 && ((1L << (_la - 247)) & ((1L << (OFF - 247)) | (1L << (ONLINE - 247)) | (1L << (OVER - 247)) | (1L << (PAGE - 247)) | (1L << (PAUSED - 247)) | (1L << (PERIOD - 247)) | (1L << (PERSISTED - 247)) | (1L << (PRECEDING - 247)) | (1L << (RANDOMIZED - 247)) | (1L << (RANGE - 247)) | (1L << (REBUILD - 247)) | (1L << (REPLICATE - 247)) | (1L << (REPLICATION - 247)) | (1L << (RESUMABLE - 247)) | (1L << (ROWGUIDCOL - 247)) | (1L << (SAVE - 247)) | (1L << (SELF - 247)) | (1L << (SPARSE - 247)) | (1L << (SWITCH - 247)) | (1L << (TRAN - 247)) | (1L << (TRANCOUNT - 247)) | (1L << (CONTROL - 247)) | (1L << (TAKE - 247)) | (1L << (OWNERSHIP - 247)) | (1L << (DEFINITION - 247)) | (1L << (APPLICATION - 247)) | (1L << (ASSEMBLY - 247)) | (1L << (SYMMETRIC - 247)) | (1L << (ASYMMETRIC - 247)) | (1L << (SERVER - 247)) | (1L << (RECEIVE - 247)) | (1L << (CHANGE - 247)) | (1L << (TRACE - 247)) | (1L << (TRACKING - 247)) | (1L << (RESOURCES - 247)) | (1L << (SETTINGS - 247)) | (1L << (STATE - 247)) | (1L << (AVAILABILITY - 247)) | (1L << (CREDENTIAL - 247)) | (1L << (ENDPOINT - 247)) | (1L << (EVENT - 247)) | (1L << (NOTIFICATION - 247)) | (1L << (LINKED - 247)) | (1L << (AUDIT - 247)) | (1L << (DDL - 247)) | (1L << (XML - 247)) | (1L << (IMPERSONATE - 247)) | (1L << (SECURABLES - 247)) | (1L << (AUTHENTICATE - 247)) | (1L << (EXTERNAL - 247)) | (1L << (ACCESS - 247)) | (1L << (ADMINISTER - 247)) | (1L << (BULK - 247)) | (1L << (OPERATIONS - 247)) | (1L << (UNSAFE - 247)) | (1L << (SHUTDOWN - 247)) | (1L << (SCOPED - 247)) | (1L << (CONFIGURATION - 247)))) != 0) || ((((_la - 311)) & ~0x3f) == 0 && ((1L << (_la - 311)) & ((1L << (DATASPACE - 311)) | (1L << (SERVICE - 311)) | (1L << (CERTIFICATE - 311)) | (1L << (CONTRACT - 311)) | (1L << (ENCRYPTION - 311)) | (1L << (MASTER - 311)) | (1L << (DATA - 311)) | (1L << (SOURCE - 311)) | (1L << (FILE - 311)) | (1L << (FORMAT - 311)) | (1L << (LIBRARY - 311)) | (1L << (FULLTEXT - 311)) | (1L << (MASK - 311)) | (1L << (UNMASK - 311)) | (1L << (MESSAGE - 311)) | (1L << (REMOTE - 311)) | (1L << (BINDING - 311)) | (1L << (ROUTE - 311)) | (1L << (SECURITY - 311)) | (1L << (POLICY - 311)) | (1L << (AGGREGATE - 311)) | (1L << (QUEUE - 311)) | (1L << (RULE - 311)) | (1L << (SYNONYM - 311)) | (1L << (COLLECTION - 311)) | (1L << (SCRIPT - 311)) | (1L << (KILL - 311)) | (1L << (BACKUP - 311)) | (1L << (LOG - 311)) | (1L << (SHOWPLAN - 311)) | (1L << (SUBSCRIBE - 311)) | (1L << (QUERY - 311)) | (1L << (NOTIFICATIONS - 311)) | (1L << (CHECKPOINT - 311)) | (1L << (SEQUENCE - 311)) | (1L << (ABORT_AFTER_WAIT - 311)) | (1L << (ALLOW_PAGE_LOCKS - 311)) | (1L << (ALLOW_ROW_LOCKS - 311)) | (1L << (ALL_SPARSE_COLUMNS - 311)) | (1L << (BUCKET_COUNT - 311)) | (1L << (COLUMNSTORE_ARCHIVE - 311)) | (1L << (COLUMN_ENCRYPTION_KEY - 311)) | (1L << (COLUMN_SET - 311)) | (1L << (COMPRESSION_DELAY - 311)) | (1L << (DATABASE_DEAULT - 311)) | (1L << (DATA_COMPRESSION - 311)) | (1L << (DATA_CONSISTENCY_CHECK - 311)) | (1L << (ENCRYPTION_TYPE - 311)) | (1L << (SYSTEM_TIME - 311)) | (1L << (SYSTEM_VERSIONING - 311)) | (1L << (TEXTIMAGE_ON - 311)) | (1L << (WAIT_AT_LOW_PRIORITY - 311)) | (1L << (STATISTICS_INCREMENTAL - 311)) | (1L << (STATISTICS_NORECOMPUTE - 311)) | (1L << (ROUND_ROBIN - 311)) | (1L << (SCHEMA_AND_DATA - 311)) | (1L << (SCHEMA_ONLY - 311)) | (1L << (SORT_IN_TEMPDB - 311)) | (1L << (IGNORE_DUP_KEY - 311)) | (1L << (IMPLICIT_TRANSACTIONS - 311)) | (1L << (MAX_DURATION - 311)) | (1L << (MEMORY_OPTIMIZED - 311)) | (1L << (MIGRATION_STATE - 311)) | (1L << (PAD_INDEX - 311)))) != 0) || ((((_la - 375)) & ~0x3f) == 0 && ((1L << (_la - 375)) & ((1L << (REMOTE_DATA_ARCHIVE - 375)) | (1L << (FILESTREAM_ON - 375)) | (1L << (FILETABLE_COLLATE_FILENAME - 375)) | (1L << (FILETABLE_DIRECTORY - 375)) | (1L << (FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME - 375)) | (1L << (FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME - 375)) | (1L << (FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME - 375)) | (1L << (FILTER_PREDICATE - 375)) | (1L << (HISTORY_RETENTION_PERIOD - 375)) | (1L << (HISTORY_TABLE - 375)) | (1L << (LOCK_ESCALATION - 375)) | (1L << (DROP_EXISTING - 375)) | (1L << (ROW_NUMBER - 375)) | (1L << (FIRST - 375)) | (1L << (DATETIME2 - 375)) | (1L << (IDENTIFIER_ - 375)) | (1L << (STRING_ - 375)))) != 0)) {
				{
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(540);
					match(AS);
					}
				}

				setState(543);
				alias();
				}
			}

			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(546);
				insertValuesClause();
				}
				break;
			case 2:
				{
				setState(547);
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
		public TerminalNode VALUES() { return getToken(SQLServerStatementParser.VALUES, 0); }
		public List<AssignmentValuesContext> assignmentValues() {
			return getRuleContexts(AssignmentValuesContext.class);
		}
		public AssignmentValuesContext assignmentValues(int i) {
			return getRuleContext(AssignmentValuesContext.class,i);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public InsertValuesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValuesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitInsertValuesClause(this);
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
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(550);
				columnNames();
				}
			}

			setState(553);
			match(VALUES);
			setState(554);
			assignmentValues();
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(555);
				match(COMMA_);
				setState(556);
				assignmentValues();
				}
				}
				setState(561);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitInsertSelectClause(this);
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
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(562);
				columnNames();
				}
			}

			setState(565);
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
		public TerminalNode UPDATE() { return getToken(SQLServerStatementParser.UPDATE, 0); }
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitUpdate(this);
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
			setState(567);
			match(UPDATE);
			setState(568);
			tableReferences();
			setState(569);
			setAssignmentsClause();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(570);
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
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public AssignmentValueContext assignmentValue() {
			return getRuleContext(AssignmentValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			columnName();
			setState(574);
			match(EQ_);
			setState(575);
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
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public SetAssignmentsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAssignmentsClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSetAssignmentsClause(this);
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
			setState(577);
			match(SET);
			setState(578);
			assignment();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(579);
				match(COMMA_);
				setState(580);
				assignment();
				}
				}
				setState(585);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<AssignmentValueContext> assignmentValue() {
			return getRuleContexts(AssignmentValueContext.class);
		}
		public AssignmentValueContext assignmentValue(int i) {
			return getRuleContext(AssignmentValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public AssignmentValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValues; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAssignmentValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValuesContext assignmentValues() throws RecognitionException {
		AssignmentValuesContext _localctx = new AssignmentValuesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignmentValues);
		int _la;
		try {
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				match(LP_);
				setState(587);
				assignmentValue();
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(588);
					match(COMMA_);
					setState(589);
					assignmentValue();
					}
					}
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(595);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				match(LP_);
				setState(598);
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
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public AssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAssignmentValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValueContext assignmentValue() throws RecognitionException {
		AssignmentValueContext _localctx = new AssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentValue);
		try {
			setState(603);
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
			case FUNCTION:
			case TRIGGER:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case INTEGER:
			case TYPE:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case CONVERT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case FIRST:
			case DATETIME2:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				expr(0);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
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
		public TerminalNode DELETE() { return getToken(SQLServerStatementParser.DELETE, 0); }
		public SingleTableClauseContext singleTableClause() {
			return getRuleContext(SingleTableClauseContext.class,0);
		}
		public MultipleTablesClauseContext multipleTablesClause() {
			return getRuleContext(MultipleTablesClauseContext.class,0);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(DELETE);
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(606);
				singleTableClause();
				}
				break;
			case 2:
				{
				setState(607);
				multipleTablesClause();
				}
				break;
			}
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(610);
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
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLServerStatementParser.FROM, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public SingleTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSingleTableClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableClauseContext singleTableClause() throws RecognitionException {
		SingleTableClauseContext _localctx = new SingleTableClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_singleTableClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(613);
				match(FROM);
				}
			}

			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(616);
				match(LP_);
				}
			}

			setState(619);
			tableName();
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(620);
				match(RP_);
				}
			}

			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (FUNCTION - 52)) | (1L << (TRIGGER - 52)) | (1L << (AS - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (ARRAY - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (QUARTER - 119)) | (1L << (WEEK - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (INSTANCE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (INTEGER - 119)) | (1L << (TYPE - 119)))) != 0) || ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (BINARY - 183)) | (1L << (HIDDEN_ - 183)) | (1L << (MOD - 183)) | (1L << (PARTITION - 183)) | (1L << (PARTITIONS - 183)) | (1L << (TOP - 183)) | (1L << (ROW - 183)) | (1L << (XOR - 183)) | (1L << (ALWAYS - 183)) | (1L << (ROLE - 183)) | (1L << (START - 183)) | (1L << (ALGORITHM - 183)) | (1L << (AUTO - 183)) | (1L << (BLOCKERS - 183)) | (1L << (CLUSTERED - 183)) | (1L << (NONCLUSTERED - 183)) | (1L << (COLUMNSTORE - 183)) | (1L << (CONTENT - 183)) | (1L << (DATABASE - 183)) | (1L << (YEARS - 183)) | (1L << (MONTHS - 183)) | (1L << (WEEKS - 183)) | (1L << (DAYS - 183)) | (1L << (MINUTES - 183)) | (1L << (DENY - 183)) | (1L << (DETERMINISTIC - 183)) | (1L << (DISTRIBUTION - 183)) | (1L << (DOCUMENT - 183)) | (1L << (DURABILITY - 183)) | (1L << (ENCRYPTED - 183)) | (1L << (FILESTREAM - 183)) | (1L << (FILETABLE - 183)) | (1L << (FILLFACTOR - 183)) | (1L << (FOLLOWING - 183)) | (1L << (HASH - 183)) | (1L << (HEAP - 183)) | (1L << (INBOUND - 183)) | (1L << (OUTBOUND - 183)) | (1L << (UNBOUNDED - 183)) | (1L << (INFINITE - 183)) | (1L << (LOGIN - 183)) | (1L << (MASKED - 183)) | (1L << (MAXDOP - 183)) | (1L << (MOVE - 183)) | (1L << (NOCHECK - 183)) | (1L << (OBJECT - 183)))) != 0) || ((((_la - 247)) & ~0x3f) == 0 && ((1L << (_la - 247)) & ((1L << (OFF - 247)) | (1L << (ONLINE - 247)) | (1L << (OVER - 247)) | (1L << (PAGE - 247)) | (1L << (PAUSED - 247)) | (1L << (PERIOD - 247)) | (1L << (PERSISTED - 247)) | (1L << (PRECEDING - 247)) | (1L << (RANDOMIZED - 247)) | (1L << (RANGE - 247)) | (1L << (REBUILD - 247)) | (1L << (REPLICATE - 247)) | (1L << (REPLICATION - 247)) | (1L << (RESUMABLE - 247)) | (1L << (ROWGUIDCOL - 247)) | (1L << (SAVE - 247)) | (1L << (SELF - 247)) | (1L << (SPARSE - 247)) | (1L << (SWITCH - 247)) | (1L << (TRAN - 247)) | (1L << (TRANCOUNT - 247)) | (1L << (CONTROL - 247)) | (1L << (TAKE - 247)) | (1L << (OWNERSHIP - 247)) | (1L << (DEFINITION - 247)) | (1L << (APPLICATION - 247)) | (1L << (ASSEMBLY - 247)) | (1L << (SYMMETRIC - 247)) | (1L << (ASYMMETRIC - 247)) | (1L << (SERVER - 247)) | (1L << (RECEIVE - 247)) | (1L << (CHANGE - 247)) | (1L << (TRACE - 247)) | (1L << (TRACKING - 247)) | (1L << (RESOURCES - 247)) | (1L << (SETTINGS - 247)) | (1L << (STATE - 247)) | (1L << (AVAILABILITY - 247)) | (1L << (CREDENTIAL - 247)) | (1L << (ENDPOINT - 247)) | (1L << (EVENT - 247)) | (1L << (NOTIFICATION - 247)) | (1L << (LINKED - 247)) | (1L << (AUDIT - 247)) | (1L << (DDL - 247)) | (1L << (XML - 247)) | (1L << (IMPERSONATE - 247)) | (1L << (SECURABLES - 247)) | (1L << (AUTHENTICATE - 247)) | (1L << (EXTERNAL - 247)) | (1L << (ACCESS - 247)) | (1L << (ADMINISTER - 247)) | (1L << (BULK - 247)) | (1L << (OPERATIONS - 247)) | (1L << (UNSAFE - 247)) | (1L << (SHUTDOWN - 247)) | (1L << (SCOPED - 247)) | (1L << (CONFIGURATION - 247)))) != 0) || ((((_la - 311)) & ~0x3f) == 0 && ((1L << (_la - 311)) & ((1L << (DATASPACE - 311)) | (1L << (SERVICE - 311)) | (1L << (CERTIFICATE - 311)) | (1L << (CONTRACT - 311)) | (1L << (ENCRYPTION - 311)) | (1L << (MASTER - 311)) | (1L << (DATA - 311)) | (1L << (SOURCE - 311)) | (1L << (FILE - 311)) | (1L << (FORMAT - 311)) | (1L << (LIBRARY - 311)) | (1L << (FULLTEXT - 311)) | (1L << (MASK - 311)) | (1L << (UNMASK - 311)) | (1L << (MESSAGE - 311)) | (1L << (REMOTE - 311)) | (1L << (BINDING - 311)) | (1L << (ROUTE - 311)) | (1L << (SECURITY - 311)) | (1L << (POLICY - 311)) | (1L << (AGGREGATE - 311)) | (1L << (QUEUE - 311)) | (1L << (RULE - 311)) | (1L << (SYNONYM - 311)) | (1L << (COLLECTION - 311)) | (1L << (SCRIPT - 311)) | (1L << (KILL - 311)) | (1L << (BACKUP - 311)) | (1L << (LOG - 311)) | (1L << (SHOWPLAN - 311)) | (1L << (SUBSCRIBE - 311)) | (1L << (QUERY - 311)) | (1L << (NOTIFICATIONS - 311)) | (1L << (CHECKPOINT - 311)) | (1L << (SEQUENCE - 311)) | (1L << (ABORT_AFTER_WAIT - 311)) | (1L << (ALLOW_PAGE_LOCKS - 311)) | (1L << (ALLOW_ROW_LOCKS - 311)) | (1L << (ALL_SPARSE_COLUMNS - 311)) | (1L << (BUCKET_COUNT - 311)) | (1L << (COLUMNSTORE_ARCHIVE - 311)) | (1L << (COLUMN_ENCRYPTION_KEY - 311)) | (1L << (COLUMN_SET - 311)) | (1L << (COMPRESSION_DELAY - 311)) | (1L << (DATABASE_DEAULT - 311)) | (1L << (DATA_COMPRESSION - 311)) | (1L << (DATA_CONSISTENCY_CHECK - 311)) | (1L << (ENCRYPTION_TYPE - 311)) | (1L << (SYSTEM_TIME - 311)) | (1L << (SYSTEM_VERSIONING - 311)) | (1L << (TEXTIMAGE_ON - 311)) | (1L << (WAIT_AT_LOW_PRIORITY - 311)) | (1L << (STATISTICS_INCREMENTAL - 311)) | (1L << (STATISTICS_NORECOMPUTE - 311)) | (1L << (ROUND_ROBIN - 311)) | (1L << (SCHEMA_AND_DATA - 311)) | (1L << (SCHEMA_ONLY - 311)) | (1L << (SORT_IN_TEMPDB - 311)) | (1L << (IGNORE_DUP_KEY - 311)) | (1L << (IMPLICIT_TRANSACTIONS - 311)) | (1L << (MAX_DURATION - 311)) | (1L << (MEMORY_OPTIMIZED - 311)) | (1L << (MIGRATION_STATE - 311)) | (1L << (PAD_INDEX - 311)))) != 0) || ((((_la - 375)) & ~0x3f) == 0 && ((1L << (_la - 375)) & ((1L << (REMOTE_DATA_ARCHIVE - 375)) | (1L << (FILESTREAM_ON - 375)) | (1L << (FILETABLE_COLLATE_FILENAME - 375)) | (1L << (FILETABLE_DIRECTORY - 375)) | (1L << (FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME - 375)) | (1L << (FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME - 375)) | (1L << (FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME - 375)) | (1L << (FILTER_PREDICATE - 375)) | (1L << (HISTORY_RETENTION_PERIOD - 375)) | (1L << (HISTORY_TABLE - 375)) | (1L << (LOCK_ESCALATION - 375)) | (1L << (DROP_EXISTING - 375)) | (1L << (ROW_NUMBER - 375)) | (1L << (FIRST - 375)) | (1L << (DATETIME2 - 375)) | (1L << (IDENTIFIER_ - 375)) | (1L << (STRING_ - 375)))) != 0)) {
				{
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(623);
					match(AS);
					}
				}

				setState(626);
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
		public TerminalNode FROM() { return getToken(SQLServerStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode USING() { return getToken(SQLServerStatementParser.USING, 0); }
		public MultipleTablesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTablesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitMultipleTablesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleTablesClauseContext multipleTablesClause() throws RecognitionException {
		MultipleTablesClauseContext _localctx = new MultipleTablesClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multipleTablesClause);
		try {
			setState(638);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case FUNCTION:
			case TRIGGER:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case ARRAY:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case INTEGER:
			case TYPE:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case FIRST:
			case DATETIME2:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				multipleTableNames();
				setState(630);
				match(FROM);
				setState(631);
				tableReferences();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				match(FROM);
				setState(634);
				multipleTableNames();
				setState(635);
				match(USING);
				setState(636);
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
		public List<TerminalNode> DOT_ASTERISK_() { return getTokens(SQLServerStatementParser.DOT_ASTERISK_); }
		public TerminalNode DOT_ASTERISK_(int i) {
			return getToken(SQLServerStatementParser.DOT_ASTERISK_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public MultipleTableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTableNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitMultipleTableNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleTableNamesContext multipleTableNames() throws RecognitionException {
		MultipleTableNamesContext _localctx = new MultipleTableNamesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multipleTableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			tableName();
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_ASTERISK_) {
				{
				setState(641);
				match(DOT_ASTERISK_);
				}
			}

			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(644);
				match(COMMA_);
				setState(645);
				tableName();
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT_ASTERISK_) {
					{
					setState(646);
					match(DOT_ASTERISK_);
					}
				}

				}
				}
				setState(653);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
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
		public List<TerminalNode> UNION() { return getTokens(SQLServerStatementParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(SQLServerStatementParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(SQLServerStatementParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(SQLServerStatementParser.ALL, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(SQLServerStatementParser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(SQLServerStatementParser.DISTINCT, i);
		}
		public UnionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitUnionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionClauseContext unionClause() throws RecognitionException {
		UnionClauseContext _localctx = new UnionClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			selectClause();
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(657);
				match(UNION);
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT || _la==ALL) {
					{
					setState(658);
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

				setState(661);
				selectClause();
				}
				}
				setState(666);
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
		public TerminalNode SELECT() { return getToken(SQLServerStatementParser.SELECT, 0); }
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(SELECT);
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(668);
				duplicateSpecification();
				}
			}

			setState(671);
			projections();
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(672);
				fromClause();
				}
			}

			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(675);
				whereClause();
				}
			}

			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(678);
				groupByClause();
				}
			}

			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(681);
				havingClause();
				}
			}

			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(684);
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
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(SQLServerStatementParser.DISTINCT, 0); }
		public DuplicateSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duplicateSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDuplicateSpecification(this);
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
			setState(687);
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
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ProjectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projections; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitProjections(this);
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
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK_:
				{
				setState(689);
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
			case FUNCTION:
			case TRIGGER:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case INTEGER:
			case TYPE:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case CONVERT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case FIRST:
			case DATETIME2:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(690);
				projection();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(693);
				match(COMMA_);
				setState(694);
				projection();
				}
				}
				setState(699);
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
		public TopContext top() {
			return getRuleContext(TopContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public QualifiedShorthandContext qualifiedShorthand() {
			return getRuleContext(QualifiedShorthandContext.class,0);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_projection);
		int _la;
		try {
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(700);
					top();
					}
					break;
				case 2:
					{
					setState(701);
					columnName();
					}
					break;
				case 3:
					{
					setState(702);
					expr(0);
					}
					break;
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (FUNCTION - 52)) | (1L << (TRIGGER - 52)) | (1L << (AS - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (ARRAY - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (QUARTER - 119)) | (1L << (WEEK - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (INSTANCE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (INTEGER - 119)) | (1L << (TYPE - 119)))) != 0) || ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (BINARY - 183)) | (1L << (HIDDEN_ - 183)) | (1L << (MOD - 183)) | (1L << (PARTITION - 183)) | (1L << (PARTITIONS - 183)) | (1L << (TOP - 183)) | (1L << (ROW - 183)) | (1L << (XOR - 183)) | (1L << (ALWAYS - 183)) | (1L << (ROLE - 183)) | (1L << (START - 183)) | (1L << (ALGORITHM - 183)) | (1L << (AUTO - 183)) | (1L << (BLOCKERS - 183)) | (1L << (CLUSTERED - 183)) | (1L << (NONCLUSTERED - 183)) | (1L << (COLUMNSTORE - 183)) | (1L << (CONTENT - 183)) | (1L << (DATABASE - 183)) | (1L << (YEARS - 183)) | (1L << (MONTHS - 183)) | (1L << (WEEKS - 183)) | (1L << (DAYS - 183)) | (1L << (MINUTES - 183)) | (1L << (DENY - 183)) | (1L << (DETERMINISTIC - 183)) | (1L << (DISTRIBUTION - 183)) | (1L << (DOCUMENT - 183)) | (1L << (DURABILITY - 183)) | (1L << (ENCRYPTED - 183)) | (1L << (FILESTREAM - 183)) | (1L << (FILETABLE - 183)) | (1L << (FILLFACTOR - 183)) | (1L << (FOLLOWING - 183)) | (1L << (HASH - 183)) | (1L << (HEAP - 183)) | (1L << (INBOUND - 183)) | (1L << (OUTBOUND - 183)) | (1L << (UNBOUNDED - 183)) | (1L << (INFINITE - 183)) | (1L << (LOGIN - 183)) | (1L << (MASKED - 183)) | (1L << (MAXDOP - 183)) | (1L << (MOVE - 183)) | (1L << (NOCHECK - 183)) | (1L << (OBJECT - 183)))) != 0) || ((((_la - 247)) & ~0x3f) == 0 && ((1L << (_la - 247)) & ((1L << (OFF - 247)) | (1L << (ONLINE - 247)) | (1L << (OVER - 247)) | (1L << (PAGE - 247)) | (1L << (PAUSED - 247)) | (1L << (PERIOD - 247)) | (1L << (PERSISTED - 247)) | (1L << (PRECEDING - 247)) | (1L << (RANDOMIZED - 247)) | (1L << (RANGE - 247)) | (1L << (REBUILD - 247)) | (1L << (REPLICATE - 247)) | (1L << (REPLICATION - 247)) | (1L << (RESUMABLE - 247)) | (1L << (ROWGUIDCOL - 247)) | (1L << (SAVE - 247)) | (1L << (SELF - 247)) | (1L << (SPARSE - 247)) | (1L << (SWITCH - 247)) | (1L << (TRAN - 247)) | (1L << (TRANCOUNT - 247)) | (1L << (CONTROL - 247)) | (1L << (TAKE - 247)) | (1L << (OWNERSHIP - 247)) | (1L << (DEFINITION - 247)) | (1L << (APPLICATION - 247)) | (1L << (ASSEMBLY - 247)) | (1L << (SYMMETRIC - 247)) | (1L << (ASYMMETRIC - 247)) | (1L << (SERVER - 247)) | (1L << (RECEIVE - 247)) | (1L << (CHANGE - 247)) | (1L << (TRACE - 247)) | (1L << (TRACKING - 247)) | (1L << (RESOURCES - 247)) | (1L << (SETTINGS - 247)) | (1L << (STATE - 247)) | (1L << (AVAILABILITY - 247)) | (1L << (CREDENTIAL - 247)) | (1L << (ENDPOINT - 247)) | (1L << (EVENT - 247)) | (1L << (NOTIFICATION - 247)) | (1L << (LINKED - 247)) | (1L << (AUDIT - 247)) | (1L << (DDL - 247)) | (1L << (XML - 247)) | (1L << (IMPERSONATE - 247)) | (1L << (SECURABLES - 247)) | (1L << (AUTHENTICATE - 247)) | (1L << (EXTERNAL - 247)) | (1L << (ACCESS - 247)) | (1L << (ADMINISTER - 247)) | (1L << (BULK - 247)) | (1L << (OPERATIONS - 247)) | (1L << (UNSAFE - 247)) | (1L << (SHUTDOWN - 247)) | (1L << (SCOPED - 247)) | (1L << (CONFIGURATION - 247)))) != 0) || ((((_la - 311)) & ~0x3f) == 0 && ((1L << (_la - 311)) & ((1L << (DATASPACE - 311)) | (1L << (SERVICE - 311)) | (1L << (CERTIFICATE - 311)) | (1L << (CONTRACT - 311)) | (1L << (ENCRYPTION - 311)) | (1L << (MASTER - 311)) | (1L << (DATA - 311)) | (1L << (SOURCE - 311)) | (1L << (FILE - 311)) | (1L << (FORMAT - 311)) | (1L << (LIBRARY - 311)) | (1L << (FULLTEXT - 311)) | (1L << (MASK - 311)) | (1L << (UNMASK - 311)) | (1L << (MESSAGE - 311)) | (1L << (REMOTE - 311)) | (1L << (BINDING - 311)) | (1L << (ROUTE - 311)) | (1L << (SECURITY - 311)) | (1L << (POLICY - 311)) | (1L << (AGGREGATE - 311)) | (1L << (QUEUE - 311)) | (1L << (RULE - 311)) | (1L << (SYNONYM - 311)) | (1L << (COLLECTION - 311)) | (1L << (SCRIPT - 311)) | (1L << (KILL - 311)) | (1L << (BACKUP - 311)) | (1L << (LOG - 311)) | (1L << (SHOWPLAN - 311)) | (1L << (SUBSCRIBE - 311)) | (1L << (QUERY - 311)) | (1L << (NOTIFICATIONS - 311)) | (1L << (CHECKPOINT - 311)) | (1L << (SEQUENCE - 311)) | (1L << (ABORT_AFTER_WAIT - 311)) | (1L << (ALLOW_PAGE_LOCKS - 311)) | (1L << (ALLOW_ROW_LOCKS - 311)) | (1L << (ALL_SPARSE_COLUMNS - 311)) | (1L << (BUCKET_COUNT - 311)) | (1L << (COLUMNSTORE_ARCHIVE - 311)) | (1L << (COLUMN_ENCRYPTION_KEY - 311)) | (1L << (COLUMN_SET - 311)) | (1L << (COMPRESSION_DELAY - 311)) | (1L << (DATABASE_DEAULT - 311)) | (1L << (DATA_COMPRESSION - 311)) | (1L << (DATA_CONSISTENCY_CHECK - 311)) | (1L << (ENCRYPTION_TYPE - 311)) | (1L << (SYSTEM_TIME - 311)) | (1L << (SYSTEM_VERSIONING - 311)) | (1L << (TEXTIMAGE_ON - 311)) | (1L << (WAIT_AT_LOW_PRIORITY - 311)) | (1L << (STATISTICS_INCREMENTAL - 311)) | (1L << (STATISTICS_NORECOMPUTE - 311)) | (1L << (ROUND_ROBIN - 311)) | (1L << (SCHEMA_AND_DATA - 311)) | (1L << (SCHEMA_ONLY - 311)) | (1L << (SORT_IN_TEMPDB - 311)) | (1L << (IGNORE_DUP_KEY - 311)) | (1L << (IMPLICIT_TRANSACTIONS - 311)) | (1L << (MAX_DURATION - 311)) | (1L << (MEMORY_OPTIMIZED - 311)) | (1L << (MIGRATION_STATE - 311)) | (1L << (PAD_INDEX - 311)))) != 0) || ((((_la - 375)) & ~0x3f) == 0 && ((1L << (_la - 375)) & ((1L << (REMOTE_DATA_ARCHIVE - 375)) | (1L << (FILESTREAM_ON - 375)) | (1L << (FILETABLE_COLLATE_FILENAME - 375)) | (1L << (FILETABLE_DIRECTORY - 375)) | (1L << (FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME - 375)) | (1L << (FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME - 375)) | (1L << (FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME - 375)) | (1L << (FILTER_PREDICATE - 375)) | (1L << (HISTORY_RETENTION_PERIOD - 375)) | (1L << (HISTORY_TABLE - 375)) | (1L << (LOCK_ESCALATION - 375)) | (1L << (DROP_EXISTING - 375)) | (1L << (ROW_NUMBER - 375)) | (1L << (FIRST - 375)) | (1L << (DATETIME2 - 375)) | (1L << (IDENTIFIER_ - 375)) | (1L << (STRING_ - 375)))) != 0)) {
					{
					setState(706);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(705);
						match(AS);
						}
					}

					setState(708);
					alias();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
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

	public static class TopContext extends ParserRuleContext {
		public TerminalNode TOP() { return getToken(SQLServerStatementParser.TOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ROW_NUMBER() { return getToken(SQLServerStatementParser.ROW_NUMBER, 0); }
		public List<TerminalNode> LP_() { return getTokens(SQLServerStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(SQLServerStatementParser.LP_, i);
		}
		public List<TerminalNode> RP_() { return getTokens(SQLServerStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(SQLServerStatementParser.RP_, i);
		}
		public TerminalNode OVER() { return getToken(SQLServerStatementParser.OVER, 0); }
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public TopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopContext top() throws RecognitionException {
		TopContext _localctx = new TopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_top);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(TOP);
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(715);
				match(LP_);
				}
				break;
			}
			setState(718);
			expr(0);
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(719);
				match(RP_);
				}
			}

			setState(722);
			match(ROW_NUMBER);
			setState(723);
			match(LP_);
			setState(724);
			match(RP_);
			setState(725);
			match(OVER);
			setState(726);
			match(LP_);
			setState(727);
			orderByClause();
			setState(728);
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

	public static class AliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_alias);
		try {
			setState(732);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case FUNCTION:
			case TRIGGER:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case ARRAY:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case INTEGER:
			case TYPE:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case FIRST:
			case DATETIME2:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				identifier();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
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
		public TerminalNode ASTERISK_() { return getToken(SQLServerStatementParser.ASTERISK_, 0); }
		public UnqualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedShorthand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitUnqualifiedShorthand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnqualifiedShorthandContext unqualifiedShorthand() throws RecognitionException {
		UnqualifiedShorthandContext _localctx = new UnqualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unqualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
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
		public TerminalNode DOT_ASTERISK_() { return getToken(SQLServerStatementParser.DOT_ASTERISK_, 0); }
		public QualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedShorthand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitQualifiedShorthand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedShorthandContext qualifiedShorthand() throws RecognitionException {
		QualifiedShorthandContext _localctx = new QualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_qualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			identifier();
			setState(737);
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
		public TerminalNode FROM() { return getToken(SQLServerStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(FROM);
			setState(740);
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
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TableReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferences; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferencesContext tableReferences() throws RecognitionException {
		TableReferencesContext _localctx = new TableReferencesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tableReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			tableReference();
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(743);
				match(COMMA_);
				setState(744);
				tableReference();
				}
				}
				setState(749);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableReference(this);
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
			setState(750);
			tableFactor();
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (NATURAL - 83)) | (1L << (JOIN - 83)) | (1L << (FULL - 83)) | (1L << (INNER - 83)) | (1L << (LEFT - 83)) | (1L << (RIGHT - 83)) | (1L << (CROSS - 83)))) != 0)) {
				{
				{
				setState(751);
				joinedTable();
				}
				}
				setState(756);
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
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TableFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFactor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFactorContext tableFactor() throws RecognitionException {
		TableFactorContext _localctx = new TableFactorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tableFactor);
		int _la;
		try {
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				tableName();
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (FUNCTION - 52)) | (1L << (TRIGGER - 52)) | (1L << (AS - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (ARRAY - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (QUARTER - 119)) | (1L << (WEEK - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (INSTANCE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (INTEGER - 119)) | (1L << (TYPE - 119)))) != 0) || ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (BINARY - 183)) | (1L << (HIDDEN_ - 183)) | (1L << (MOD - 183)) | (1L << (PARTITION - 183)) | (1L << (PARTITIONS - 183)) | (1L << (TOP - 183)) | (1L << (ROW - 183)) | (1L << (XOR - 183)) | (1L << (ALWAYS - 183)) | (1L << (ROLE - 183)) | (1L << (START - 183)) | (1L << (ALGORITHM - 183)) | (1L << (AUTO - 183)) | (1L << (BLOCKERS - 183)) | (1L << (CLUSTERED - 183)) | (1L << (NONCLUSTERED - 183)) | (1L << (COLUMNSTORE - 183)) | (1L << (CONTENT - 183)) | (1L << (DATABASE - 183)) | (1L << (YEARS - 183)) | (1L << (MONTHS - 183)) | (1L << (WEEKS - 183)) | (1L << (DAYS - 183)) | (1L << (MINUTES - 183)) | (1L << (DENY - 183)) | (1L << (DETERMINISTIC - 183)) | (1L << (DISTRIBUTION - 183)) | (1L << (DOCUMENT - 183)) | (1L << (DURABILITY - 183)) | (1L << (ENCRYPTED - 183)) | (1L << (FILESTREAM - 183)) | (1L << (FILETABLE - 183)) | (1L << (FILLFACTOR - 183)) | (1L << (FOLLOWING - 183)) | (1L << (HASH - 183)) | (1L << (HEAP - 183)) | (1L << (INBOUND - 183)) | (1L << (OUTBOUND - 183)) | (1L << (UNBOUNDED - 183)) | (1L << (INFINITE - 183)) | (1L << (LOGIN - 183)) | (1L << (MASKED - 183)) | (1L << (MAXDOP - 183)) | (1L << (MOVE - 183)) | (1L << (NOCHECK - 183)) | (1L << (OBJECT - 183)))) != 0) || ((((_la - 247)) & ~0x3f) == 0 && ((1L << (_la - 247)) & ((1L << (OFF - 247)) | (1L << (ONLINE - 247)) | (1L << (OVER - 247)) | (1L << (PAGE - 247)) | (1L << (PAUSED - 247)) | (1L << (PERIOD - 247)) | (1L << (PERSISTED - 247)) | (1L << (PRECEDING - 247)) | (1L << (RANDOMIZED - 247)) | (1L << (RANGE - 247)) | (1L << (REBUILD - 247)) | (1L << (REPLICATE - 247)) | (1L << (REPLICATION - 247)) | (1L << (RESUMABLE - 247)) | (1L << (ROWGUIDCOL - 247)) | (1L << (SAVE - 247)) | (1L << (SELF - 247)) | (1L << (SPARSE - 247)) | (1L << (SWITCH - 247)) | (1L << (TRAN - 247)) | (1L << (TRANCOUNT - 247)) | (1L << (CONTROL - 247)) | (1L << (TAKE - 247)) | (1L << (OWNERSHIP - 247)) | (1L << (DEFINITION - 247)) | (1L << (APPLICATION - 247)) | (1L << (ASSEMBLY - 247)) | (1L << (SYMMETRIC - 247)) | (1L << (ASYMMETRIC - 247)) | (1L << (SERVER - 247)) | (1L << (RECEIVE - 247)) | (1L << (CHANGE - 247)) | (1L << (TRACE - 247)) | (1L << (TRACKING - 247)) | (1L << (RESOURCES - 247)) | (1L << (SETTINGS - 247)) | (1L << (STATE - 247)) | (1L << (AVAILABILITY - 247)) | (1L << (CREDENTIAL - 247)) | (1L << (ENDPOINT - 247)) | (1L << (EVENT - 247)) | (1L << (NOTIFICATION - 247)) | (1L << (LINKED - 247)) | (1L << (AUDIT - 247)) | (1L << (DDL - 247)) | (1L << (XML - 247)) | (1L << (IMPERSONATE - 247)) | (1L << (SECURABLES - 247)) | (1L << (AUTHENTICATE - 247)) | (1L << (EXTERNAL - 247)) | (1L << (ACCESS - 247)) | (1L << (ADMINISTER - 247)) | (1L << (BULK - 247)) | (1L << (OPERATIONS - 247)) | (1L << (UNSAFE - 247)) | (1L << (SHUTDOWN - 247)) | (1L << (SCOPED - 247)) | (1L << (CONFIGURATION - 247)))) != 0) || ((((_la - 311)) & ~0x3f) == 0 && ((1L << (_la - 311)) & ((1L << (DATASPACE - 311)) | (1L << (SERVICE - 311)) | (1L << (CERTIFICATE - 311)) | (1L << (CONTRACT - 311)) | (1L << (ENCRYPTION - 311)) | (1L << (MASTER - 311)) | (1L << (DATA - 311)) | (1L << (SOURCE - 311)) | (1L << (FILE - 311)) | (1L << (FORMAT - 311)) | (1L << (LIBRARY - 311)) | (1L << (FULLTEXT - 311)) | (1L << (MASK - 311)) | (1L << (UNMASK - 311)) | (1L << (MESSAGE - 311)) | (1L << (REMOTE - 311)) | (1L << (BINDING - 311)) | (1L << (ROUTE - 311)) | (1L << (SECURITY - 311)) | (1L << (POLICY - 311)) | (1L << (AGGREGATE - 311)) | (1L << (QUEUE - 311)) | (1L << (RULE - 311)) | (1L << (SYNONYM - 311)) | (1L << (COLLECTION - 311)) | (1L << (SCRIPT - 311)) | (1L << (KILL - 311)) | (1L << (BACKUP - 311)) | (1L << (LOG - 311)) | (1L << (SHOWPLAN - 311)) | (1L << (SUBSCRIBE - 311)) | (1L << (QUERY - 311)) | (1L << (NOTIFICATIONS - 311)) | (1L << (CHECKPOINT - 311)) | (1L << (SEQUENCE - 311)) | (1L << (ABORT_AFTER_WAIT - 311)) | (1L << (ALLOW_PAGE_LOCKS - 311)) | (1L << (ALLOW_ROW_LOCKS - 311)) | (1L << (ALL_SPARSE_COLUMNS - 311)) | (1L << (BUCKET_COUNT - 311)) | (1L << (COLUMNSTORE_ARCHIVE - 311)) | (1L << (COLUMN_ENCRYPTION_KEY - 311)) | (1L << (COLUMN_SET - 311)) | (1L << (COMPRESSION_DELAY - 311)) | (1L << (DATABASE_DEAULT - 311)) | (1L << (DATA_COMPRESSION - 311)) | (1L << (DATA_CONSISTENCY_CHECK - 311)) | (1L << (ENCRYPTION_TYPE - 311)) | (1L << (SYSTEM_TIME - 311)) | (1L << (SYSTEM_VERSIONING - 311)) | (1L << (TEXTIMAGE_ON - 311)) | (1L << (WAIT_AT_LOW_PRIORITY - 311)) | (1L << (STATISTICS_INCREMENTAL - 311)) | (1L << (STATISTICS_NORECOMPUTE - 311)) | (1L << (ROUND_ROBIN - 311)) | (1L << (SCHEMA_AND_DATA - 311)) | (1L << (SCHEMA_ONLY - 311)) | (1L << (SORT_IN_TEMPDB - 311)) | (1L << (IGNORE_DUP_KEY - 311)) | (1L << (IMPLICIT_TRANSACTIONS - 311)) | (1L << (MAX_DURATION - 311)) | (1L << (MEMORY_OPTIMIZED - 311)) | (1L << (MIGRATION_STATE - 311)) | (1L << (PAD_INDEX - 311)))) != 0) || ((((_la - 375)) & ~0x3f) == 0 && ((1L << (_la - 375)) & ((1L << (REMOTE_DATA_ARCHIVE - 375)) | (1L << (FILESTREAM_ON - 375)) | (1L << (FILETABLE_COLLATE_FILENAME - 375)) | (1L << (FILETABLE_DIRECTORY - 375)) | (1L << (FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME - 375)) | (1L << (FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME - 375)) | (1L << (FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME - 375)) | (1L << (FILTER_PREDICATE - 375)) | (1L << (HISTORY_RETENTION_PERIOD - 375)) | (1L << (HISTORY_TABLE - 375)) | (1L << (LOCK_ESCALATION - 375)) | (1L << (DROP_EXISTING - 375)) | (1L << (ROW_NUMBER - 375)) | (1L << (FIRST - 375)) | (1L << (DATETIME2 - 375)) | (1L << (IDENTIFIER_ - 375)) | (1L << (STRING_ - 375)))) != 0)) {
					{
					setState(759);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(758);
						match(AS);
						}
					}

					setState(761);
					alias();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				subquery();
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(765);
					match(AS);
					}
				}

				setState(768);
				alias();
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(769);
					columnNames();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(772);
				match(LP_);
				setState(773);
				tableReferences();
				setState(774);
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
		public TerminalNode JOIN() { return getToken(SQLServerStatementParser.JOIN, 0); }
		public TerminalNode NATURAL() { return getToken(SQLServerStatementParser.NATURAL, 0); }
		public JoinSpecificationContext joinSpecification() {
			return getRuleContext(JoinSpecificationContext.class,0);
		}
		public TerminalNode INNER() { return getToken(SQLServerStatementParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SQLServerStatementParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SQLServerStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SQLServerStatementParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SQLServerStatementParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(SQLServerStatementParser.OUTER, 0); }
		public JoinedTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinedTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitJoinedTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinedTableContext joinedTable() throws RecognitionException {
		JoinedTableContext _localctx = new JoinedTableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_joinedTable);
		int _la;
		try {
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL) {
					{
					setState(778);
					match(NATURAL);
					}
				}

				{
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(781);
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

				setState(784);
				match(JOIN);
				}
				setState(786);
				tableFactor();
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(787);
					joinSpecification();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL) {
					{
					setState(790);
					match(NATURAL);
					}
				}

				setState(793);
				_la = _input.LA(1);
				if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (FULL - 85)) | (1L << (LEFT - 85)) | (1L << (RIGHT - 85)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(794);
					match(OUTER);
					}
				}

				setState(797);
				match(JOIN);
				setState(798);
				tableFactor();
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(799);
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
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(SQLServerStatementParser.USING, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public JoinSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitJoinSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinSpecificationContext joinSpecification() throws RecognitionException {
		JoinSpecificationContext _localctx = new JoinSpecificationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_joinSpecification);
		try {
			setState(808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				match(ON);
				setState(805);
				expr(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				match(USING);
				setState(807);
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
		public TerminalNode WHERE() { return getToken(SQLServerStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(WHERE);
			setState(811);
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
		public TerminalNode GROUP() { return getToken(SQLServerStatementParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SQLServerStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitGroupByClause(this);
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
			setState(813);
			match(GROUP);
			setState(814);
			match(BY);
			setState(815);
			orderByItem();
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(816);
				match(COMMA_);
				setState(817);
				orderByItem();
				}
				}
				setState(822);
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
		public TerminalNode HAVING() { return getToken(SQLServerStatementParser.HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(HAVING);
			setState(824);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public UnionClauseContext unionClause() {
			return getRuleContext(UnionClauseContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(LP_);
			setState(827);
			unionClause();
			setState(828);
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
		public TerminalNode QUESTION_() { return getToken(SQLServerStatementParser.QUESTION_, 0); }
		public ParameterMarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterMarker; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitParameterMarker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterMarkerContext parameterMarker() throws RecognitionException {
		ParameterMarkerContext _localctx = new ParameterMarkerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parameterMarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_literals);
		try {
			setState(839);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				stringLiterals();
				}
				break;
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				numberLiterals();
				}
				break;
			case LBE_:
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(834);
				dateTimeLiterals();
				}
				break;
			case HEX_DIGIT_:
				enterOuterAlt(_localctx, 4);
				{
				setState(835);
				hexadecimalLiterals();
				}
				break;
			case BIT_NUM_:
				enterOuterAlt(_localctx, 5);
				{
				setState(836);
				bitValueLiterals();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(837);
				booleanLiterals();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(838);
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
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public StringLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitStringLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralsContext stringLiterals() throws RecognitionException {
		StringLiteralsContext _localctx = new StringLiteralsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_stringLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
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
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode MINUS_() { return getToken(SQLServerStatementParser.MINUS_, 0); }
		public NumberLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitNumberLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralsContext numberLiterals() throws RecognitionException {
		NumberLiteralsContext _localctx = new NumberLiteralsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_numberLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS_) {
				{
				setState(843);
				match(MINUS_);
				}
			}

			setState(846);
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
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public TerminalNode DATE() { return getToken(SQLServerStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(SQLServerStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SQLServerStatementParser.TIMESTAMP, 0); }
		public TerminalNode LBE_() { return getToken(SQLServerStatementParser.LBE_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBE_() { return getToken(SQLServerStatementParser.RBE_, 0); }
		public DateTimeLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDateTimeLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateTimeLiteralsContext dateTimeLiterals() throws RecognitionException {
		DateTimeLiteralsContext _localctx = new DateTimeLiteralsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_dateTimeLiterals);
		int _la;
		try {
			setState(855);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				_la = _input.LA(1);
				if ( !(((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (DATE - 131)) | (1L << (TIME - 131)) | (1L << (TIMESTAMP - 131)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(849);
				match(STRING_);
				}
				break;
			case LBE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(850);
				match(LBE_);
				setState(851);
				identifier();
				setState(852);
				match(STRING_);
				setState(853);
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
		public TerminalNode HEX_DIGIT_() { return getToken(SQLServerStatementParser.HEX_DIGIT_, 0); }
		public HexadecimalLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitHexadecimalLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexadecimalLiteralsContext hexadecimalLiterals() throws RecognitionException {
		HexadecimalLiteralsContext _localctx = new HexadecimalLiteralsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_hexadecimalLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
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
		public TerminalNode BIT_NUM_() { return getToken(SQLServerStatementParser.BIT_NUM_, 0); }
		public BitValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitValueLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitBitValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitValueLiteralsContext bitValueLiterals() throws RecognitionException {
		BitValueLiteralsContext _localctx = new BitValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_bitValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
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
		public TerminalNode TRUE() { return getToken(SQLServerStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLServerStatementParser.FALSE, 0); }
		public BooleanLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitBooleanLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralsContext booleanLiterals() throws RecognitionException {
		BooleanLiteralsContext _localctx = new BooleanLiteralsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_booleanLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
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
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public NullValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullValueLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitNullValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullValueLiteralsContext nullValueLiterals() throws RecognitionException {
		NullValueLiteralsContext _localctx = new NullValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_nullValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
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
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public UnreservedWordContext unreservedWord() {
			return getRuleContext(UnreservedWordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_identifier);
		try {
			setState(867);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				match(IDENTIFIER_);
				}
				break;
			case TRUNCATE:
			case FUNCTION:
			case TRIGGER:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case ARRAY:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case INTEGER:
			case TYPE:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case FIRST:
			case DATETIME2:
				enterOuterAlt(_localctx, 2);
				{
				setState(866);
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
		public TerminalNode TRUNCATE() { return getToken(SQLServerStatementParser.TRUNCATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SQLServerStatementParser.FUNCTION, 0); }
		public TerminalNode TRIGGER() { return getToken(SQLServerStatementParser.TRIGGER, 0); }
		public TerminalNode LIMIT() { return getToken(SQLServerStatementParser.LIMIT, 0); }
		public TerminalNode OFFSET() { return getToken(SQLServerStatementParser.OFFSET, 0); }
		public TerminalNode SAVEPOINT() { return getToken(SQLServerStatementParser.SAVEPOINT, 0); }
		public TerminalNode BOOLEAN() { return getToken(SQLServerStatementParser.BOOLEAN, 0); }
		public TerminalNode ARRAY() { return getToken(SQLServerStatementParser.ARRAY, 0); }
		public TerminalNode LOCALTIME() { return getToken(SQLServerStatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(SQLServerStatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode QUARTER() { return getToken(SQLServerStatementParser.QUARTER, 0); }
		public TerminalNode WEEK() { return getToken(SQLServerStatementParser.WEEK, 0); }
		public TerminalNode MICROSECOND() { return getToken(SQLServerStatementParser.MICROSECOND, 0); }
		public TerminalNode ENABLE() { return getToken(SQLServerStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(SQLServerStatementParser.DISABLE, 0); }
		public TerminalNode BINARY() { return getToken(SQLServerStatementParser.BINARY, 0); }
		public TerminalNode HIDDEN_() { return getToken(SQLServerStatementParser.HIDDEN_, 0); }
		public TerminalNode MOD() { return getToken(SQLServerStatementParser.MOD, 0); }
		public TerminalNode PARTITION() { return getToken(SQLServerStatementParser.PARTITION, 0); }
		public TerminalNode TOP() { return getToken(SQLServerStatementParser.TOP, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode XOR() { return getToken(SQLServerStatementParser.XOR, 0); }
		public TerminalNode ALWAYS() { return getToken(SQLServerStatementParser.ALWAYS, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public TerminalNode START() { return getToken(SQLServerStatementParser.START, 0); }
		public TerminalNode ALGORITHM() { return getToken(SQLServerStatementParser.ALGORITHM, 0); }
		public TerminalNode AUTO() { return getToken(SQLServerStatementParser.AUTO, 0); }
		public TerminalNode BLOCKERS() { return getToken(SQLServerStatementParser.BLOCKERS, 0); }
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode CONTENT() { return getToken(SQLServerStatementParser.CONTENT, 0); }
		public TerminalNode DATABASE() { return getToken(SQLServerStatementParser.DATABASE, 0); }
		public TerminalNode DAYS() { return getToken(SQLServerStatementParser.DAYS, 0); }
		public TerminalNode DENY() { return getToken(SQLServerStatementParser.DENY, 0); }
		public TerminalNode DETERMINISTIC() { return getToken(SQLServerStatementParser.DETERMINISTIC, 0); }
		public TerminalNode DISTRIBUTION() { return getToken(SQLServerStatementParser.DISTRIBUTION, 0); }
		public TerminalNode DOCUMENT() { return getToken(SQLServerStatementParser.DOCUMENT, 0); }
		public TerminalNode DURABILITY() { return getToken(SQLServerStatementParser.DURABILITY, 0); }
		public TerminalNode ENCRYPTED() { return getToken(SQLServerStatementParser.ENCRYPTED, 0); }
		public TerminalNode FILESTREAM() { return getToken(SQLServerStatementParser.FILESTREAM, 0); }
		public TerminalNode FILETABLE() { return getToken(SQLServerStatementParser.FILETABLE, 0); }
		public TerminalNode FOLLOWING() { return getToken(SQLServerStatementParser.FOLLOWING, 0); }
		public TerminalNode HASH() { return getToken(SQLServerStatementParser.HASH, 0); }
		public TerminalNode HEAP() { return getToken(SQLServerStatementParser.HEAP, 0); }
		public TerminalNode INBOUND() { return getToken(SQLServerStatementParser.INBOUND, 0); }
		public TerminalNode INFINITE() { return getToken(SQLServerStatementParser.INFINITE, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public TerminalNode MASKED() { return getToken(SQLServerStatementParser.MASKED, 0); }
		public TerminalNode MAXDOP() { return getToken(SQLServerStatementParser.MAXDOP, 0); }
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public TerminalNode MONTHS() { return getToken(SQLServerStatementParser.MONTHS, 0); }
		public TerminalNode MOVE() { return getToken(SQLServerStatementParser.MOVE, 0); }
		public TerminalNode NOCHECK() { return getToken(SQLServerStatementParser.NOCHECK, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public TerminalNode OBJECT() { return getToken(SQLServerStatementParser.OBJECT, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public TerminalNode ONLINE() { return getToken(SQLServerStatementParser.ONLINE, 0); }
		public TerminalNode OUTBOUND() { return getToken(SQLServerStatementParser.OUTBOUND, 0); }
		public TerminalNode OVER() { return getToken(SQLServerStatementParser.OVER, 0); }
		public TerminalNode PAGE() { return getToken(SQLServerStatementParser.PAGE, 0); }
		public TerminalNode PARTITIONS() { return getToken(SQLServerStatementParser.PARTITIONS, 0); }
		public TerminalNode PAUSED() { return getToken(SQLServerStatementParser.PAUSED, 0); }
		public TerminalNode PERIOD() { return getToken(SQLServerStatementParser.PERIOD, 0); }
		public TerminalNode PERSISTED() { return getToken(SQLServerStatementParser.PERSISTED, 0); }
		public TerminalNode PRECEDING() { return getToken(SQLServerStatementParser.PRECEDING, 0); }
		public TerminalNode RANDOMIZED() { return getToken(SQLServerStatementParser.RANDOMIZED, 0); }
		public TerminalNode RANGE() { return getToken(SQLServerStatementParser.RANGE, 0); }
		public TerminalNode REBUILD() { return getToken(SQLServerStatementParser.REBUILD, 0); }
		public TerminalNode REPLICATE() { return getToken(SQLServerStatementParser.REPLICATE, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public TerminalNode RESUMABLE() { return getToken(SQLServerStatementParser.RESUMABLE, 0); }
		public TerminalNode ROWGUIDCOL() { return getToken(SQLServerStatementParser.ROWGUIDCOL, 0); }
		public TerminalNode SAVE() { return getToken(SQLServerStatementParser.SAVE, 0); }
		public TerminalNode SELF() { return getToken(SQLServerStatementParser.SELF, 0); }
		public TerminalNode SPARSE() { return getToken(SQLServerStatementParser.SPARSE, 0); }
		public TerminalNode SWITCH() { return getToken(SQLServerStatementParser.SWITCH, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public TerminalNode TRANCOUNT() { return getToken(SQLServerStatementParser.TRANCOUNT, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SQLServerStatementParser.UNBOUNDED, 0); }
		public TerminalNode YEARS() { return getToken(SQLServerStatementParser.YEARS, 0); }
		public TerminalNode WEEKS() { return getToken(SQLServerStatementParser.WEEKS, 0); }
		public TerminalNode ABORT_AFTER_WAIT() { return getToken(SQLServerStatementParser.ABORT_AFTER_WAIT, 0); }
		public TerminalNode ALLOW_PAGE_LOCKS() { return getToken(SQLServerStatementParser.ALLOW_PAGE_LOCKS, 0); }
		public TerminalNode ALLOW_ROW_LOCKS() { return getToken(SQLServerStatementParser.ALLOW_ROW_LOCKS, 0); }
		public TerminalNode ALL_SPARSE_COLUMNS() { return getToken(SQLServerStatementParser.ALL_SPARSE_COLUMNS, 0); }
		public TerminalNode BUCKET_COUNT() { return getToken(SQLServerStatementParser.BUCKET_COUNT, 0); }
		public TerminalNode COLUMNSTORE_ARCHIVE() { return getToken(SQLServerStatementParser.COLUMNSTORE_ARCHIVE, 0); }
		public TerminalNode COLUMN_ENCRYPTION_KEY() { return getToken(SQLServerStatementParser.COLUMN_ENCRYPTION_KEY, 0); }
		public TerminalNode COLUMN_SET() { return getToken(SQLServerStatementParser.COLUMN_SET, 0); }
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public TerminalNode DATABASE_DEAULT() { return getToken(SQLServerStatementParser.DATABASE_DEAULT, 0); }
		public TerminalNode DATA_COMPRESSION() { return getToken(SQLServerStatementParser.DATA_COMPRESSION, 0); }
		public TerminalNode DATA_CONSISTENCY_CHECK() { return getToken(SQLServerStatementParser.DATA_CONSISTENCY_CHECK, 0); }
		public TerminalNode ENCRYPTION_TYPE() { return getToken(SQLServerStatementParser.ENCRYPTION_TYPE, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SQLServerStatementParser.SYSTEM_TIME, 0); }
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public TerminalNode TEXTIMAGE_ON() { return getToken(SQLServerStatementParser.TEXTIMAGE_ON, 0); }
		public TerminalNode WAIT_AT_LOW_PRIORITY() { return getToken(SQLServerStatementParser.WAIT_AT_LOW_PRIORITY, 0); }
		public TerminalNode STATISTICS_INCREMENTAL() { return getToken(SQLServerStatementParser.STATISTICS_INCREMENTAL, 0); }
		public TerminalNode STATISTICS_NORECOMPUTE() { return getToken(SQLServerStatementParser.STATISTICS_NORECOMPUTE, 0); }
		public TerminalNode ROUND_ROBIN() { return getToken(SQLServerStatementParser.ROUND_ROBIN, 0); }
		public TerminalNode SCHEMA_AND_DATA() { return getToken(SQLServerStatementParser.SCHEMA_AND_DATA, 0); }
		public TerminalNode SCHEMA_ONLY() { return getToken(SQLServerStatementParser.SCHEMA_ONLY, 0); }
		public TerminalNode SORT_IN_TEMPDB() { return getToken(SQLServerStatementParser.SORT_IN_TEMPDB, 0); }
		public TerminalNode IGNORE_DUP_KEY() { return getToken(SQLServerStatementParser.IGNORE_DUP_KEY, 0); }
		public TerminalNode IMPLICIT_TRANSACTIONS() { return getToken(SQLServerStatementParser.IMPLICIT_TRANSACTIONS, 0); }
		public TerminalNode MAX_DURATION() { return getToken(SQLServerStatementParser.MAX_DURATION, 0); }
		public TerminalNode MEMORY_OPTIMIZED() { return getToken(SQLServerStatementParser.MEMORY_OPTIMIZED, 0); }
		public TerminalNode MIGRATION_STATE() { return getToken(SQLServerStatementParser.MIGRATION_STATE, 0); }
		public TerminalNode PAD_INDEX() { return getToken(SQLServerStatementParser.PAD_INDEX, 0); }
		public TerminalNode REMOTE_DATA_ARCHIVE() { return getToken(SQLServerStatementParser.REMOTE_DATA_ARCHIVE, 0); }
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public TerminalNode FILETABLE_COLLATE_FILENAME() { return getToken(SQLServerStatementParser.FILETABLE_COLLATE_FILENAME, 0); }
		public TerminalNode FILETABLE_DIRECTORY() { return getToken(SQLServerStatementParser.FILETABLE_DIRECTORY, 0); }
		public TerminalNode FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME, 0); }
		public TerminalNode FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME, 0); }
		public TerminalNode FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME, 0); }
		public TerminalNode FILLFACTOR() { return getToken(SQLServerStatementParser.FILLFACTOR, 0); }
		public TerminalNode FILTER_PREDICATE() { return getToken(SQLServerStatementParser.FILTER_PREDICATE, 0); }
		public TerminalNode HISTORY_RETENTION_PERIOD() { return getToken(SQLServerStatementParser.HISTORY_RETENTION_PERIOD, 0); }
		public TerminalNode HISTORY_TABLE() { return getToken(SQLServerStatementParser.HISTORY_TABLE, 0); }
		public TerminalNode LOCK_ESCALATION() { return getToken(SQLServerStatementParser.LOCK_ESCALATION, 0); }
		public TerminalNode DROP_EXISTING() { return getToken(SQLServerStatementParser.DROP_EXISTING, 0); }
		public TerminalNode ROW_NUMBER() { return getToken(SQLServerStatementParser.ROW_NUMBER, 0); }
		public TerminalNode CONTROL() { return getToken(SQLServerStatementParser.CONTROL, 0); }
		public TerminalNode TAKE() { return getToken(SQLServerStatementParser.TAKE, 0); }
		public TerminalNode OWNERSHIP() { return getToken(SQLServerStatementParser.OWNERSHIP, 0); }
		public TerminalNode DEFINITION() { return getToken(SQLServerStatementParser.DEFINITION, 0); }
		public TerminalNode APPLICATION() { return getToken(SQLServerStatementParser.APPLICATION, 0); }
		public TerminalNode ASSEMBLY() { return getToken(SQLServerStatementParser.ASSEMBLY, 0); }
		public TerminalNode SYMMETRIC() { return getToken(SQLServerStatementParser.SYMMETRIC, 0); }
		public TerminalNode ASYMMETRIC() { return getToken(SQLServerStatementParser.ASYMMETRIC, 0); }
		public TerminalNode SERVER() { return getToken(SQLServerStatementParser.SERVER, 0); }
		public TerminalNode RECEIVE() { return getToken(SQLServerStatementParser.RECEIVE, 0); }
		public TerminalNode CHANGE() { return getToken(SQLServerStatementParser.CHANGE, 0); }
		public TerminalNode TRACE() { return getToken(SQLServerStatementParser.TRACE, 0); }
		public TerminalNode TRACKING() { return getToken(SQLServerStatementParser.TRACKING, 0); }
		public TerminalNode RESOURCES() { return getToken(SQLServerStatementParser.RESOURCES, 0); }
		public TerminalNode SETTINGS() { return getToken(SQLServerStatementParser.SETTINGS, 0); }
		public TerminalNode STATE() { return getToken(SQLServerStatementParser.STATE, 0); }
		public TerminalNode AVAILABILITY() { return getToken(SQLServerStatementParser.AVAILABILITY, 0); }
		public TerminalNode CREDENTIAL() { return getToken(SQLServerStatementParser.CREDENTIAL, 0); }
		public TerminalNode ENDPOINT() { return getToken(SQLServerStatementParser.ENDPOINT, 0); }
		public TerminalNode EVENT() { return getToken(SQLServerStatementParser.EVENT, 0); }
		public TerminalNode NOTIFICATION() { return getToken(SQLServerStatementParser.NOTIFICATION, 0); }
		public TerminalNode LINKED() { return getToken(SQLServerStatementParser.LINKED, 0); }
		public TerminalNode AUDIT() { return getToken(SQLServerStatementParser.AUDIT, 0); }
		public TerminalNode DDL() { return getToken(SQLServerStatementParser.DDL, 0); }
		public TerminalNode SQL() { return getToken(SQLServerStatementParser.SQL, 0); }
		public TerminalNode XML() { return getToken(SQLServerStatementParser.XML, 0); }
		public TerminalNode IMPERSONATE() { return getToken(SQLServerStatementParser.IMPERSONATE, 0); }
		public TerminalNode SECURABLES() { return getToken(SQLServerStatementParser.SECURABLES, 0); }
		public TerminalNode AUTHENTICATE() { return getToken(SQLServerStatementParser.AUTHENTICATE, 0); }
		public TerminalNode EXTERNAL() { return getToken(SQLServerStatementParser.EXTERNAL, 0); }
		public TerminalNode ACCESS() { return getToken(SQLServerStatementParser.ACCESS, 0); }
		public TerminalNode ADMINISTER() { return getToken(SQLServerStatementParser.ADMINISTER, 0); }
		public TerminalNode BULK() { return getToken(SQLServerStatementParser.BULK, 0); }
		public TerminalNode OPERATIONS() { return getToken(SQLServerStatementParser.OPERATIONS, 0); }
		public TerminalNode UNSAFE() { return getToken(SQLServerStatementParser.UNSAFE, 0); }
		public TerminalNode SHUTDOWN() { return getToken(SQLServerStatementParser.SHUTDOWN, 0); }
		public TerminalNode SCOPED() { return getToken(SQLServerStatementParser.SCOPED, 0); }
		public TerminalNode CONFIGURATION() { return getToken(SQLServerStatementParser.CONFIGURATION, 0); }
		public TerminalNode DATASPACE() { return getToken(SQLServerStatementParser.DATASPACE, 0); }
		public TerminalNode SERVICE() { return getToken(SQLServerStatementParser.SERVICE, 0); }
		public TerminalNode CERTIFICATE() { return getToken(SQLServerStatementParser.CERTIFICATE, 0); }
		public TerminalNode CONTRACT() { return getToken(SQLServerStatementParser.CONTRACT, 0); }
		public TerminalNode ENCRYPTION() { return getToken(SQLServerStatementParser.ENCRYPTION, 0); }
		public TerminalNode MASTER() { return getToken(SQLServerStatementParser.MASTER, 0); }
		public TerminalNode DATA() { return getToken(SQLServerStatementParser.DATA, 0); }
		public TerminalNode SOURCE() { return getToken(SQLServerStatementParser.SOURCE, 0); }
		public TerminalNode FILE() { return getToken(SQLServerStatementParser.FILE, 0); }
		public TerminalNode FORMAT() { return getToken(SQLServerStatementParser.FORMAT, 0); }
		public TerminalNode LIBRARY() { return getToken(SQLServerStatementParser.LIBRARY, 0); }
		public TerminalNode FULLTEXT() { return getToken(SQLServerStatementParser.FULLTEXT, 0); }
		public TerminalNode MASK() { return getToken(SQLServerStatementParser.MASK, 0); }
		public TerminalNode UNMASK() { return getToken(SQLServerStatementParser.UNMASK, 0); }
		public TerminalNode MESSAGE() { return getToken(SQLServerStatementParser.MESSAGE, 0); }
		public TerminalNode TYPE() { return getToken(SQLServerStatementParser.TYPE, 0); }
		public TerminalNode REMOTE() { return getToken(SQLServerStatementParser.REMOTE, 0); }
		public TerminalNode BINDING() { return getToken(SQLServerStatementParser.BINDING, 0); }
		public TerminalNode ROUTE() { return getToken(SQLServerStatementParser.ROUTE, 0); }
		public TerminalNode SECURITY() { return getToken(SQLServerStatementParser.SECURITY, 0); }
		public TerminalNode POLICY() { return getToken(SQLServerStatementParser.POLICY, 0); }
		public TerminalNode AGGREGATE() { return getToken(SQLServerStatementParser.AGGREGATE, 0); }
		public TerminalNode QUEUE() { return getToken(SQLServerStatementParser.QUEUE, 0); }
		public TerminalNode RULE() { return getToken(SQLServerStatementParser.RULE, 0); }
		public TerminalNode SYNONYM() { return getToken(SQLServerStatementParser.SYNONYM, 0); }
		public TerminalNode COLLECTION() { return getToken(SQLServerStatementParser.COLLECTION, 0); }
		public TerminalNode SCRIPT() { return getToken(SQLServerStatementParser.SCRIPT, 0); }
		public TerminalNode KILL() { return getToken(SQLServerStatementParser.KILL, 0); }
		public TerminalNode BACKUP() { return getToken(SQLServerStatementParser.BACKUP, 0); }
		public TerminalNode LOG() { return getToken(SQLServerStatementParser.LOG, 0); }
		public TerminalNode SHOWPLAN() { return getToken(SQLServerStatementParser.SHOWPLAN, 0); }
		public TerminalNode SUBSCRIBE() { return getToken(SQLServerStatementParser.SUBSCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SQLServerStatementParser.QUERY, 0); }
		public TerminalNode NOTIFICATIONS() { return getToken(SQLServerStatementParser.NOTIFICATIONS, 0); }
		public TerminalNode CHECKPOINT() { return getToken(SQLServerStatementParser.CHECKPOINT, 0); }
		public TerminalNode SEQUENCE() { return getToken(SQLServerStatementParser.SEQUENCE, 0); }
		public TerminalNode INSTANCE() { return getToken(SQLServerStatementParser.INSTANCE, 0); }
		public TerminalNode DO() { return getToken(SQLServerStatementParser.DO, 0); }
		public TerminalNode DEFINER() { return getToken(SQLServerStatementParser.DEFINER, 0); }
		public TerminalNode LOCAL() { return getToken(SQLServerStatementParser.LOCAL, 0); }
		public TerminalNode CASCADED() { return getToken(SQLServerStatementParser.CASCADED, 0); }
		public TerminalNode NEXT() { return getToken(SQLServerStatementParser.NEXT, 0); }
		public TerminalNode NAME() { return getToken(SQLServerStatementParser.NAME, 0); }
		public TerminalNode INTEGER() { return getToken(SQLServerStatementParser.INTEGER, 0); }
		public TerminalNode MAX() { return getToken(SQLServerStatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(SQLServerStatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(SQLServerStatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(SQLServerStatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(SQLServerStatementParser.AVG, 0); }
		public TerminalNode FIRST() { return getToken(SQLServerStatementParser.FIRST, 0); }
		public TerminalNode DATETIME2() { return getToken(SQLServerStatementParser.DATETIME2, 0); }
		public UnreservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreservedWord; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitUnreservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnreservedWordContext unreservedWord() throws RecognitionException {
		UnreservedWordContext _localctx = new UnreservedWordContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_unreservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (FUNCTION - 52)) | (1L << (TRIGGER - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (ARRAY - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (QUARTER - 119)) | (1L << (WEEK - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (INSTANCE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (INTEGER - 119)) | (1L << (TYPE - 119)))) != 0) || ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (BINARY - 183)) | (1L << (HIDDEN_ - 183)) | (1L << (MOD - 183)) | (1L << (PARTITION - 183)) | (1L << (PARTITIONS - 183)) | (1L << (TOP - 183)) | (1L << (ROW - 183)) | (1L << (XOR - 183)) | (1L << (ALWAYS - 183)) | (1L << (ROLE - 183)) | (1L << (START - 183)) | (1L << (ALGORITHM - 183)) | (1L << (AUTO - 183)) | (1L << (BLOCKERS - 183)) | (1L << (CLUSTERED - 183)) | (1L << (NONCLUSTERED - 183)) | (1L << (COLUMNSTORE - 183)) | (1L << (CONTENT - 183)) | (1L << (DATABASE - 183)) | (1L << (YEARS - 183)) | (1L << (MONTHS - 183)) | (1L << (WEEKS - 183)) | (1L << (DAYS - 183)) | (1L << (MINUTES - 183)) | (1L << (DENY - 183)) | (1L << (DETERMINISTIC - 183)) | (1L << (DISTRIBUTION - 183)) | (1L << (DOCUMENT - 183)) | (1L << (DURABILITY - 183)) | (1L << (ENCRYPTED - 183)) | (1L << (FILESTREAM - 183)) | (1L << (FILETABLE - 183)) | (1L << (FILLFACTOR - 183)) | (1L << (FOLLOWING - 183)) | (1L << (HASH - 183)) | (1L << (HEAP - 183)) | (1L << (INBOUND - 183)) | (1L << (OUTBOUND - 183)) | (1L << (UNBOUNDED - 183)) | (1L << (INFINITE - 183)) | (1L << (LOGIN - 183)) | (1L << (MASKED - 183)) | (1L << (MAXDOP - 183)) | (1L << (MOVE - 183)) | (1L << (NOCHECK - 183)) | (1L << (OBJECT - 183)))) != 0) || ((((_la - 247)) & ~0x3f) == 0 && ((1L << (_la - 247)) & ((1L << (OFF - 247)) | (1L << (ONLINE - 247)) | (1L << (OVER - 247)) | (1L << (PAGE - 247)) | (1L << (PAUSED - 247)) | (1L << (PERIOD - 247)) | (1L << (PERSISTED - 247)) | (1L << (PRECEDING - 247)) | (1L << (RANDOMIZED - 247)) | (1L << (RANGE - 247)) | (1L << (REBUILD - 247)) | (1L << (REPLICATE - 247)) | (1L << (REPLICATION - 247)) | (1L << (RESUMABLE - 247)) | (1L << (ROWGUIDCOL - 247)) | (1L << (SAVE - 247)) | (1L << (SELF - 247)) | (1L << (SPARSE - 247)) | (1L << (SWITCH - 247)) | (1L << (TRAN - 247)) | (1L << (TRANCOUNT - 247)) | (1L << (CONTROL - 247)) | (1L << (TAKE - 247)) | (1L << (OWNERSHIP - 247)) | (1L << (DEFINITION - 247)) | (1L << (APPLICATION - 247)) | (1L << (ASSEMBLY - 247)) | (1L << (SYMMETRIC - 247)) | (1L << (ASYMMETRIC - 247)) | (1L << (SERVER - 247)) | (1L << (RECEIVE - 247)) | (1L << (CHANGE - 247)) | (1L << (TRACE - 247)) | (1L << (TRACKING - 247)) | (1L << (RESOURCES - 247)) | (1L << (SETTINGS - 247)) | (1L << (STATE - 247)) | (1L << (AVAILABILITY - 247)) | (1L << (CREDENTIAL - 247)) | (1L << (ENDPOINT - 247)) | (1L << (EVENT - 247)) | (1L << (NOTIFICATION - 247)) | (1L << (LINKED - 247)) | (1L << (AUDIT - 247)) | (1L << (DDL - 247)) | (1L << (XML - 247)) | (1L << (IMPERSONATE - 247)) | (1L << (SECURABLES - 247)) | (1L << (AUTHENTICATE - 247)) | (1L << (EXTERNAL - 247)) | (1L << (ACCESS - 247)) | (1L << (ADMINISTER - 247)) | (1L << (BULK - 247)) | (1L << (OPERATIONS - 247)) | (1L << (UNSAFE - 247)) | (1L << (SHUTDOWN - 247)) | (1L << (SCOPED - 247)) | (1L << (CONFIGURATION - 247)))) != 0) || ((((_la - 311)) & ~0x3f) == 0 && ((1L << (_la - 311)) & ((1L << (DATASPACE - 311)) | (1L << (SERVICE - 311)) | (1L << (CERTIFICATE - 311)) | (1L << (CONTRACT - 311)) | (1L << (ENCRYPTION - 311)) | (1L << (MASTER - 311)) | (1L << (DATA - 311)) | (1L << (SOURCE - 311)) | (1L << (FILE - 311)) | (1L << (FORMAT - 311)) | (1L << (LIBRARY - 311)) | (1L << (FULLTEXT - 311)) | (1L << (MASK - 311)) | (1L << (UNMASK - 311)) | (1L << (MESSAGE - 311)) | (1L << (REMOTE - 311)) | (1L << (BINDING - 311)) | (1L << (ROUTE - 311)) | (1L << (SECURITY - 311)) | (1L << (POLICY - 311)) | (1L << (AGGREGATE - 311)) | (1L << (QUEUE - 311)) | (1L << (RULE - 311)) | (1L << (SYNONYM - 311)) | (1L << (COLLECTION - 311)) | (1L << (SCRIPT - 311)) | (1L << (KILL - 311)) | (1L << (BACKUP - 311)) | (1L << (LOG - 311)) | (1L << (SHOWPLAN - 311)) | (1L << (SUBSCRIBE - 311)) | (1L << (QUERY - 311)) | (1L << (NOTIFICATIONS - 311)) | (1L << (CHECKPOINT - 311)) | (1L << (SEQUENCE - 311)) | (1L << (ABORT_AFTER_WAIT - 311)) | (1L << (ALLOW_PAGE_LOCKS - 311)) | (1L << (ALLOW_ROW_LOCKS - 311)) | (1L << (ALL_SPARSE_COLUMNS - 311)) | (1L << (BUCKET_COUNT - 311)) | (1L << (COLUMNSTORE_ARCHIVE - 311)) | (1L << (COLUMN_ENCRYPTION_KEY - 311)) | (1L << (COLUMN_SET - 311)) | (1L << (COMPRESSION_DELAY - 311)) | (1L << (DATABASE_DEAULT - 311)) | (1L << (DATA_COMPRESSION - 311)) | (1L << (DATA_CONSISTENCY_CHECK - 311)) | (1L << (ENCRYPTION_TYPE - 311)) | (1L << (SYSTEM_TIME - 311)) | (1L << (SYSTEM_VERSIONING - 311)) | (1L << (TEXTIMAGE_ON - 311)) | (1L << (WAIT_AT_LOW_PRIORITY - 311)) | (1L << (STATISTICS_INCREMENTAL - 311)) | (1L << (STATISTICS_NORECOMPUTE - 311)) | (1L << (ROUND_ROBIN - 311)) | (1L << (SCHEMA_AND_DATA - 311)) | (1L << (SCHEMA_ONLY - 311)) | (1L << (SORT_IN_TEMPDB - 311)) | (1L << (IGNORE_DUP_KEY - 311)) | (1L << (IMPLICIT_TRANSACTIONS - 311)) | (1L << (MAX_DURATION - 311)) | (1L << (MEMORY_OPTIMIZED - 311)) | (1L << (MIGRATION_STATE - 311)) | (1L << (PAD_INDEX - 311)))) != 0) || ((((_la - 375)) & ~0x3f) == 0 && ((1L << (_la - 375)) & ((1L << (REMOTE_DATA_ARCHIVE - 375)) | (1L << (FILESTREAM_ON - 375)) | (1L << (FILETABLE_COLLATE_FILENAME - 375)) | (1L << (FILETABLE_DIRECTORY - 375)) | (1L << (FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME - 375)) | (1L << (FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME - 375)) | (1L << (FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME - 375)) | (1L << (FILTER_PREDICATE - 375)) | (1L << (HISTORY_RETENTION_PERIOD - 375)) | (1L << (HISTORY_TABLE - 375)) | (1L << (LOCK_ESCALATION - 375)) | (1L << (DROP_EXISTING - 375)) | (1L << (ROW_NUMBER - 375)) | (1L << (FIRST - 375)) | (1L << (DATETIME2 - 375)))) != 0)) ) {
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
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
		public TerminalNode DOT_() { return getToken(SQLServerStatementParser.DOT_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(873);
				owner();
				setState(874);
				match(DOT_);
				}
				break;
			}
			setState(878);
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
		public TerminalNode DOT_() { return getToken(SQLServerStatementParser.DOT_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(880);
				owner();
				setState(881);
				match(DOT_);
				}
				break;
			}
			setState(885);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOwner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnerContext owner() throws RecognitionException {
		OwnerContext _localctx = new OwnerContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_owner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ColumnNameWithSortContext> columnNameWithSort() {
			return getRuleContexts(ColumnNameWithSortContext.class);
		}
		public ColumnNameWithSortContext columnNameWithSort(int i) {
			return getRuleContext(ColumnNameWithSortContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(LP_);
			setState(892);
			columnNameWithSort();
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(893);
				match(COMMA_);
				setState(894);
				columnNameWithSort();
				}
				}
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(900);
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

	public static class TableNamesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNamesContext tableNames() throws RecognitionException {
		TableNamesContext _localctx = new TableNamesContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_tableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(902);
				match(LP_);
				}
			}

			setState(905);
			tableName();
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(906);
				match(COMMA_);
				setState(907);
				tableName();
				}
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(913);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIndexName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
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

	public static class CollationNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCollationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_collationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(SQLServerStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQLServerStatementParser.NUMBER_, i);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDataTypeLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			match(LP_);
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER_) {
				{
				setState(921);
				match(NUMBER_);
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(922);
					match(COMMA_);
					setState(923);
					match(NUMBER_);
					}
				}

				}
			}

			setState(928);
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
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(SQLServerStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(930);
				match(PRIMARY);
				}
			}

			setState(933);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(936);
				notOperator_();
				setState(937);
				expr(3);
				}
				break;
			case 2:
				{
				setState(939);
				match(LP_);
				setState(940);
				expr(0);
				setState(941);
				match(RP_);
				}
				break;
			case 3:
				{
				setState(943);
				booleanPrimary(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(952);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(946);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(947);
					logicalOperator();
					setState(948);
					expr(5);
					}
					} 
				}
				setState(954);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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
		public TerminalNode OR() { return getToken(SQLServerStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(SQLServerStatementParser.OR_, 0); }
		public TerminalNode AND() { return getToken(SQLServerStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(SQLServerStatementParser.AND_, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
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
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(SQLServerStatementParser.NOT_, 0); }
		public NotOperator_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOperator_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitNotOperator_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotOperator_Context notOperator_() throws RecognitionException {
		NotOperator_Context _localctx = new NotOperator_Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_notOperator_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
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
		public TerminalNode IS() { return getToken(SQLServerStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(SQLServerStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLServerStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SQLServerStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(SQLServerStatementParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public BooleanPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrimary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitBooleanPrimary(this);
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(960);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(982);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(980);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(962);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(963);
						match(IS);
						setState(965);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(964);
							match(NOT);
							}
						}

						setState(967);
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
						setState(968);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(969);
						match(SAFE_EQ_);
						setState(970);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(971);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(972);
						comparisonOperator();
						setState(973);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(975);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(976);
						comparisonOperator();
						setState(977);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(978);
						subquery();
						}
						break;
					}
					} 
				}
				setState(984);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(SQLServerStatementParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(SQLServerStatementParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(SQLServerStatementParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(SQLServerStatementParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(SQLServerStatementParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
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
		public TerminalNode IN() { return getToken(SQLServerStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(SQLServerStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SQLServerStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SQLServerStatementParser.LIKE, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SQLServerStatementParser.ESCAPE, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_predicate);
		int _la;
		try {
			setState(1030);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(987);
				bitExpr(0);
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(988);
					match(NOT);
					}
				}

				setState(991);
				match(IN);
				setState(992);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				bitExpr(0);
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(995);
					match(NOT);
					}
				}

				setState(998);
				match(IN);
				setState(999);
				match(LP_);
				setState(1000);
				expr(0);
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1001);
					match(COMMA_);
					setState(1002);
					expr(0);
					}
					}
					setState(1007);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1008);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1010);
				bitExpr(0);
				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1011);
					match(NOT);
					}
				}

				setState(1014);
				match(BETWEEN);
				setState(1015);
				bitExpr(0);
				setState(1016);
				match(AND);
				setState(1017);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1019);
				bitExpr(0);
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1020);
					match(NOT);
					}
				}

				setState(1023);
				match(LIKE);
				setState(1024);
				simpleExpr(0);
				setState(1027);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(1025);
					match(ESCAPE);
					setState(1026);
					simpleExpr(0);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1029);
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
		public TerminalNode VERTICAL_BAR_() { return getToken(SQLServerStatementParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(SQLServerStatementParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(SQLServerStatementParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(SQLServerStatementParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(SQLServerStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(SQLServerStatementParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(SQLServerStatementParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(SQLServerStatementParser.SLASH_, 0); }
		public TerminalNode MOD_() { return getToken(SQLServerStatementParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(SQLServerStatementParser.CARET_, 0); }
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitBitExpr(this);
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
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1033);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1067);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1065);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1035);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1036);
						match(VERTICAL_BAR_);
						setState(1037);
						bitExpr(12);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1038);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1039);
						match(AMPERSAND_);
						setState(1040);
						bitExpr(11);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1041);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1042);
						match(SIGNED_LEFT_SHIFT_);
						setState(1043);
						bitExpr(10);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1044);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1045);
						match(SIGNED_RIGHT_SHIFT_);
						setState(1046);
						bitExpr(9);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1047);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1048);
						match(PLUS_);
						setState(1049);
						bitExpr(8);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1050);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1051);
						match(MINUS_);
						setState(1052);
						bitExpr(7);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1053);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1054);
						match(ASTERISK_);
						setState(1055);
						bitExpr(6);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1056);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1057);
						match(SLASH_);
						setState(1058);
						bitExpr(5);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1059);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1060);
						match(MOD_);
						setState(1061);
						bitExpr(4);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1062);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1063);
						match(CARET_);
						setState(1064);
						bitExpr(3);
						}
						break;
					}
					} 
				}
				setState(1069);
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
		public TerminalNode PLUS_() { return getToken(SQLServerStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(SQLServerStatementParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(SQLServerStatementParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(SQLServerStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(SQLServerStatementParser.BINARY, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public TerminalNode LBE_() { return getToken(SQLServerStatementParser.LBE_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBE_() { return getToken(SQLServerStatementParser.RBE_, 0); }
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public PrivateExprOfDbContext privateExprOfDb() {
			return getRuleContext(PrivateExprOfDbContext.class,0);
		}
		public TerminalNode OR_() { return getToken(SQLServerStatementParser.OR_, 0); }
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSimpleExpr(this);
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
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_simpleExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(1071);
				functionCall();
				}
				break;
			case 2:
				{
				setState(1072);
				parameterMarker();
				}
				break;
			case 3:
				{
				setState(1073);
				literals();
				}
				break;
			case 4:
				{
				setState(1074);
				columnName();
				}
				break;
			case 5:
				{
				setState(1075);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_))) != 0) || _la==BINARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1076);
				simpleExpr(6);
				}
				break;
			case 6:
				{
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1077);
					match(ROW);
					}
				}

				setState(1080);
				match(LP_);
				setState(1081);
				expr(0);
				setState(1086);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1082);
					match(COMMA_);
					setState(1083);
					expr(0);
					}
					}
					setState(1088);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1089);
				match(RP_);
				}
				break;
			case 7:
				{
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS) {
					{
					setState(1091);
					match(EXISTS);
					}
				}

				setState(1094);
				subquery();
				}
				break;
			case 8:
				{
				setState(1095);
				match(LBE_);
				setState(1096);
				identifier();
				setState(1097);
				expr(0);
				setState(1098);
				match(RBE_);
				}
				break;
			case 9:
				{
				setState(1100);
				caseExpression();
				}
				break;
			case 10:
				{
				setState(1101);
				privateExprOfDb();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
					setState(1104);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(1105);
					match(OR_);
					setState(1106);
					simpleExpr(8);
					}
					} 
				}
				setState(1111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_functionCall);
		try {
			setState(1115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1112);
				aggregationFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1113);
				specialFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1114);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(SQLServerStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAggregationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			aggregationFunctionName();
			setState(1118);
			match(LP_);
			setState(1120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1119);
				distinct();
				}
			}

			setState(1131);
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
			case FUNCTION:
			case TRIGGER:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case INTEGER:
			case TYPE:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case CONVERT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case FIRST:
			case DATETIME2:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1122);
				expr(0);
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1123);
					match(COMMA_);
					setState(1124);
					expr(0);
					}
					}
					setState(1129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1130);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1133);
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
		public TerminalNode MAX() { return getToken(SQLServerStatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(SQLServerStatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(SQLServerStatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(SQLServerStatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(SQLServerStatementParser.AVG, 0); }
		public AggregationFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunctionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAggregationFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionNameContext aggregationFunctionName() throws RecognitionException {
		AggregationFunctionNameContext _localctx = new AggregationFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_aggregationFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
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
		public TerminalNode DISTINCT() { return getToken(SQLServerStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDistinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSpecialFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialFunctionContext specialFunction() throws RecognitionException {
		SpecialFunctionContext _localctx = new SpecialFunctionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_specialFunction);
		try {
			setState(1141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1139);
				castFunction();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1140);
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
		public TerminalNode CAST() { return getToken(SQLServerStatementParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public CastFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCastFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastFunctionContext castFunction() throws RecognitionException {
		CastFunctionContext _localctx = new CastFunctionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_castFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			match(CAST);
			setState(1144);
			match(LP_);
			setState(1145);
			expr(0);
			setState(1146);
			match(AS);
			setState(1147);
			dataType();
			setState(1148);
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
		public TerminalNode CHAR() { return getToken(SQLServerStatementParser.CHAR, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode USING() { return getToken(SQLServerStatementParser.USING, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public CharFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCharFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharFunctionContext charFunction() throws RecognitionException {
		CharFunctionContext _localctx = new CharFunctionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_charFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			match(CHAR);
			setState(1151);
			match(LP_);
			setState(1152);
			expr(0);
			setState(1157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1153);
				match(COMMA_);
				setState(1154);
				expr(0);
				}
				}
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1160);
				match(USING);
				setState(1161);
				ignoredIdentifier_();
				}
			}

			setState(1164);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(SQLServerStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public RegularFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitRegularFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionContext regularFunction() throws RecognitionException {
		RegularFunctionContext _localctx = new RegularFunctionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_regularFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			regularFunctionName_();
			setState(1167);
			match(LP_);
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
			case FUNCTION:
			case TRIGGER:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case INTEGER:
			case TYPE:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case CONVERT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case FIRST:
			case DATETIME2:
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

	public static class RegularFunctionName_Context extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public TerminalNode LOCALTIME() { return getToken(SQLServerStatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(SQLServerStatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(SQLServerStatementParser.INTERVAL, 0); }
		public RegularFunctionName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunctionName_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitRegularFunctionName_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionName_Context regularFunctionName_() throws RecognitionException {
		RegularFunctionName_Context _localctx = new RegularFunctionName_Context(_ctx, getState());
		enterRule(_localctx, 142, RULE_regularFunctionName_);
		try {
			setState(1186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1181);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1182);
				match(IF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1183);
				match(LOCALTIME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1184);
				match(LOCALTIMESTAMP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1185);
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
		public TerminalNode CASE() { return getToken(SQLServerStatementParser.CASE, 0); }
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_caseExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			match(CASE);
			setState(1190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_) | (1L << LP_) | (1L << LBE_) | (1L << QUESTION_) | (1L << TRUNCATE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (FUNCTION - 68)) | (1L << (TRIGGER - 68)) | (1L << (CASE - 68)) | (1L << (CAST - 68)) | (1L << (IF - 68)) | (1L << (NULL - 68)) | (1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (EXISTS - 68)) | (1L << (LIMIT - 68)) | (1L << (OFFSET - 68)) | (1L << (SAVEPOINT - 68)) | (1L << (BOOLEAN - 68)) | (1L << (CHAR - 68)) | (1L << (ARRAY - 68)) | (1L << (INTERVAL - 68)) | (1L << (DATE - 68)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (TIME - 132)) | (1L << (TIMESTAMP - 132)) | (1L << (LOCALTIME - 132)) | (1L << (LOCALTIMESTAMP - 132)) | (1L << (QUARTER - 132)) | (1L << (WEEK - 132)) | (1L << (MICROSECOND - 132)) | (1L << (MAX - 132)) | (1L << (MIN - 132)) | (1L << (SUM - 132)) | (1L << (COUNT - 132)) | (1L << (AVG - 132)) | (1L << (ENABLE - 132)) | (1L << (DISABLE - 132)) | (1L << (INSTANCE - 132)) | (1L << (DO - 132)) | (1L << (DEFINER - 132)) | (1L << (SQL - 132)) | (1L << (CASCADED - 132)) | (1L << (LOCAL - 132)) | (1L << (NEXT - 132)) | (1L << (NAME - 132)) | (1L << (INTEGER - 132)) | (1L << (TYPE - 132)) | (1L << (BINARY - 132)) | (1L << (HIDDEN_ - 132)) | (1L << (MOD - 132)) | (1L << (PARTITION - 132)) | (1L << (PARTITIONS - 132)) | (1L << (TOP - 132)) | (1L << (ROW - 132)) | (1L << (XOR - 132)) | (1L << (ALWAYS - 132)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (ROLE - 203)) | (1L << (START - 203)) | (1L << (ALGORITHM - 203)) | (1L << (AUTO - 203)) | (1L << (BLOCKERS - 203)) | (1L << (CLUSTERED - 203)) | (1L << (NONCLUSTERED - 203)) | (1L << (COLUMNSTORE - 203)) | (1L << (CONTENT - 203)) | (1L << (CONVERT - 203)) | (1L << (DATABASE - 203)) | (1L << (YEARS - 203)) | (1L << (MONTHS - 203)) | (1L << (WEEKS - 203)) | (1L << (DAYS - 203)) | (1L << (MINUTES - 203)) | (1L << (DENY - 203)) | (1L << (DETERMINISTIC - 203)) | (1L << (DISTRIBUTION - 203)) | (1L << (DOCUMENT - 203)) | (1L << (DURABILITY - 203)) | (1L << (ENCRYPTED - 203)) | (1L << (FILESTREAM - 203)) | (1L << (FILETABLE - 203)) | (1L << (FILLFACTOR - 203)) | (1L << (FOLLOWING - 203)) | (1L << (HASH - 203)) | (1L << (HEAP - 203)) | (1L << (INBOUND - 203)) | (1L << (OUTBOUND - 203)) | (1L << (UNBOUNDED - 203)) | (1L << (INFINITE - 203)) | (1L << (LOGIN - 203)) | (1L << (MASKED - 203)) | (1L << (MAXDOP - 203)) | (1L << (MOVE - 203)) | (1L << (NOCHECK - 203)) | (1L << (OBJECT - 203)) | (1L << (OFF - 203)) | (1L << (ONLINE - 203)) | (1L << (OVER - 203)) | (1L << (PAGE - 203)) | (1L << (PAUSED - 203)) | (1L << (PERIOD - 203)) | (1L << (PERSISTED - 203)) | (1L << (PRECEDING - 203)) | (1L << (RANDOMIZED - 203)) | (1L << (RANGE - 203)) | (1L << (REBUILD - 203)) | (1L << (REPLICATE - 203)) | (1L << (REPLICATION - 203)) | (1L << (RESUMABLE - 203)) | (1L << (ROWGUIDCOL - 203)) | (1L << (SAVE - 203)) | (1L << (SELF - 203)) | (1L << (SPARSE - 203)) | (1L << (SWITCH - 203)) | (1L << (TRAN - 203)))) != 0) || ((((_la - 267)) & ~0x3f) == 0 && ((1L << (_la - 267)) & ((1L << (TRANCOUNT - 267)) | (1L << (CONTROL - 267)) | (1L << (TAKE - 267)) | (1L << (OWNERSHIP - 267)) | (1L << (DEFINITION - 267)) | (1L << (APPLICATION - 267)) | (1L << (ASSEMBLY - 267)) | (1L << (SYMMETRIC - 267)) | (1L << (ASYMMETRIC - 267)) | (1L << (SERVER - 267)) | (1L << (RECEIVE - 267)) | (1L << (CHANGE - 267)) | (1L << (TRACE - 267)) | (1L << (TRACKING - 267)) | (1L << (RESOURCES - 267)) | (1L << (SETTINGS - 267)) | (1L << (STATE - 267)) | (1L << (AVAILABILITY - 267)) | (1L << (CREDENTIAL - 267)) | (1L << (ENDPOINT - 267)) | (1L << (EVENT - 267)) | (1L << (NOTIFICATION - 267)) | (1L << (LINKED - 267)) | (1L << (AUDIT - 267)) | (1L << (DDL - 267)) | (1L << (XML - 267)) | (1L << (IMPERSONATE - 267)) | (1L << (SECURABLES - 267)) | (1L << (AUTHENTICATE - 267)) | (1L << (EXTERNAL - 267)) | (1L << (ACCESS - 267)) | (1L << (ADMINISTER - 267)) | (1L << (BULK - 267)) | (1L << (OPERATIONS - 267)) | (1L << (UNSAFE - 267)) | (1L << (SHUTDOWN - 267)) | (1L << (SCOPED - 267)) | (1L << (CONFIGURATION - 267)) | (1L << (DATASPACE - 267)) | (1L << (SERVICE - 267)) | (1L << (CERTIFICATE - 267)) | (1L << (CONTRACT - 267)) | (1L << (ENCRYPTION - 267)) | (1L << (MASTER - 267)) | (1L << (DATA - 267)) | (1L << (SOURCE - 267)) | (1L << (FILE - 267)) | (1L << (FORMAT - 267)) | (1L << (LIBRARY - 267)) | (1L << (FULLTEXT - 267)) | (1L << (MASK - 267)) | (1L << (UNMASK - 267)) | (1L << (MESSAGE - 267)) | (1L << (REMOTE - 267)) | (1L << (BINDING - 267)) | (1L << (ROUTE - 267)) | (1L << (SECURITY - 267)) | (1L << (POLICY - 267)))) != 0) || ((((_la - 331)) & ~0x3f) == 0 && ((1L << (_la - 331)) & ((1L << (AGGREGATE - 331)) | (1L << (QUEUE - 331)) | (1L << (RULE - 331)) | (1L << (SYNONYM - 331)) | (1L << (COLLECTION - 331)) | (1L << (SCRIPT - 331)) | (1L << (KILL - 331)) | (1L << (BACKUP - 331)) | (1L << (LOG - 331)) | (1L << (SHOWPLAN - 331)) | (1L << (SUBSCRIBE - 331)) | (1L << (QUERY - 331)) | (1L << (NOTIFICATIONS - 331)) | (1L << (CHECKPOINT - 331)) | (1L << (SEQUENCE - 331)) | (1L << (ABORT_AFTER_WAIT - 331)) | (1L << (ALLOW_PAGE_LOCKS - 331)) | (1L << (ALLOW_ROW_LOCKS - 331)) | (1L << (ALL_SPARSE_COLUMNS - 331)) | (1L << (BUCKET_COUNT - 331)) | (1L << (COLUMNSTORE_ARCHIVE - 331)) | (1L << (COLUMN_ENCRYPTION_KEY - 331)) | (1L << (COLUMN_SET - 331)) | (1L << (COMPRESSION_DELAY - 331)) | (1L << (DATABASE_DEAULT - 331)) | (1L << (DATA_COMPRESSION - 331)) | (1L << (DATA_CONSISTENCY_CHECK - 331)) | (1L << (ENCRYPTION_TYPE - 331)) | (1L << (SYSTEM_TIME - 331)) | (1L << (SYSTEM_VERSIONING - 331)) | (1L << (TEXTIMAGE_ON - 331)) | (1L << (WAIT_AT_LOW_PRIORITY - 331)) | (1L << (STATISTICS_INCREMENTAL - 331)) | (1L << (STATISTICS_NORECOMPUTE - 331)) | (1L << (ROUND_ROBIN - 331)) | (1L << (SCHEMA_AND_DATA - 331)) | (1L << (SCHEMA_ONLY - 331)) | (1L << (SORT_IN_TEMPDB - 331)) | (1L << (IGNORE_DUP_KEY - 331)) | (1L << (IMPLICIT_TRANSACTIONS - 331)) | (1L << (MAX_DURATION - 331)) | (1L << (MEMORY_OPTIMIZED - 331)) | (1L << (MIGRATION_STATE - 331)) | (1L << (PAD_INDEX - 331)) | (1L << (REMOTE_DATA_ARCHIVE - 331)) | (1L << (FILESTREAM_ON - 331)) | (1L << (FILETABLE_COLLATE_FILENAME - 331)) | (1L << (FILETABLE_DIRECTORY - 331)) | (1L << (FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME - 331)) | (1L << (FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME - 331)) | (1L << (FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME - 331)) | (1L << (FILTER_PREDICATE - 331)) | (1L << (HISTORY_RETENTION_PERIOD - 331)) | (1L << (HISTORY_TABLE - 331)) | (1L << (LOCK_ESCALATION - 331)) | (1L << (DROP_EXISTING - 331)) | (1L << (ROW_NUMBER - 331)) | (1L << (FIRST - 331)))) != 0) || ((((_la - 395)) & ~0x3f) == 0 && ((1L << (_la - 395)) & ((1L << (DATETIME2 - 395)) | (1L << (IDENTIFIER_ - 395)) | (1L << (STRING_ - 395)) | (1L << (NUMBER_ - 395)) | (1L << (HEX_DIGIT_ - 395)) | (1L << (BIT_NUM_ - 395)))) != 0)) {
				{
				setState(1189);
				simpleExpr(0);
				}
			}

			setState(1193); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1192);
					caseWhen_();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1195); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1197);
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
		public TerminalNode WHEN() { return getToken(SQLServerStatementParser.WHEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(SQLServerStatementParser.THEN, 0); }
		public CaseWhen_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhen_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCaseWhen_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseWhen_Context caseWhen_() throws RecognitionException {
		CaseWhen_Context _localctx = new CaseWhen_Context(_ctx, getState());
		enterRule(_localctx, 146, RULE_caseWhen_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			match(WHEN);
			setState(1201);
			expr(0);
			setState(1202);
			match(THEN);
			setState(1203);
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
		public TerminalNode ELSE() { return getToken(SQLServerStatementParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseElse_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseElse_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCaseElse_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseElse_Context caseElse_() throws RecognitionException {
		CaseElse_Context _localctx = new CaseElse_Context(_ctx, getState());
		enterRule(_localctx, 148, RULE_caseElse_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			match(ELSE);
			setState(1206);
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

	public static class PrivateExprOfDbContext extends ParserRuleContext {
		public WindowedFunctionContext windowedFunction() {
			return getRuleContext(WindowedFunctionContext.class,0);
		}
		public AtTimeZoneExprContext atTimeZoneExpr() {
			return getRuleContext(AtTimeZoneExprContext.class,0);
		}
		public CastExprContext castExpr() {
			return getRuleContext(CastExprContext.class,0);
		}
		public ConvertExprContext convertExpr() {
			return getRuleContext(ConvertExprContext.class,0);
		}
		public PrivateExprOfDbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateExprOfDb; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPrivateExprOfDb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivateExprOfDbContext privateExprOfDb() throws RecognitionException {
		PrivateExprOfDbContext _localctx = new PrivateExprOfDbContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_privateExprOfDb);
		try {
			setState(1212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1208);
				windowedFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1209);
				atTimeZoneExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1210);
				castExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1211);
				convertExpr();
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SQLServerStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLServerStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode OFFSET() { return getToken(SQLServerStatementParser.OFFSET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ROW() { return getTokens(SQLServerStatementParser.ROW); }
		public TerminalNode ROW(int i) {
			return getToken(SQLServerStatementParser.ROW, i);
		}
		public List<TerminalNode> ROWS() { return getTokens(SQLServerStatementParser.ROWS); }
		public TerminalNode ROWS(int i) {
			return getToken(SQLServerStatementParser.ROWS, i);
		}
		public TerminalNode FETCH() { return getToken(SQLServerStatementParser.FETCH, 0); }
		public TerminalNode ONLY() { return getToken(SQLServerStatementParser.ONLY, 0); }
		public TerminalNode FIRST() { return getToken(SQLServerStatementParser.FIRST, 0); }
		public TerminalNode NEXT() { return getToken(SQLServerStatementParser.NEXT, 0); }
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(ORDER);
			setState(1215);
			match(BY);
			setState(1216);
			orderByItem();
			setState(1221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1217);
				match(COMMA_);
				setState(1218);
				orderByItem();
				}
				}
				setState(1223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(1224);
				match(OFFSET);
				setState(1225);
				expr(0);
				setState(1226);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FETCH) {
					{
					setState(1227);
					match(FETCH);
					setState(1228);
					_la = _input.LA(1);
					if ( !(_la==NEXT || _la==FIRST) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1229);
					expr(0);
					setState(1230);
					_la = _input.LA(1);
					if ( !(_la==ROW || _la==ROWS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1231);
					match(ONLY);
					}
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
		public TerminalNode ASC() { return getToken(SQLServerStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLServerStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOrderByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1237);
				columnName();
				}
				break;
			case 2:
				{
				setState(1238);
				numberLiterals();
				}
				break;
			case 3:
				{
				setState(1239);
				expr(0);
				}
				break;
			}
			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1242);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode MAX() { return getToken(SQLServerStatementParser.MAX, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode CONTENT() { return getToken(SQLServerStatementParser.CONTENT, 0); }
		public TerminalNode DOCUMENT() { return getToken(SQLServerStatementParser.DOCUMENT, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			dataTypeName();
			setState(1257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1246);
				dataTypeLength();
				}
				break;
			case 2:
				{
				setState(1247);
				match(LP_);
				setState(1248);
				match(MAX);
				setState(1249);
				match(RP_);
				}
				break;
			case 3:
				{
				setState(1250);
				match(LP_);
				setState(1252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONTENT || _la==DOCUMENT) {
					{
					setState(1251);
					_la = _input.LA(1);
					if ( !(_la==CONTENT || _la==DOCUMENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1254);
				ignoredIdentifier_();
				setState(1255);
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

	public static class DataTypeNameContext extends ParserRuleContext {
		public TerminalNode BIGINT() { return getToken(SQLServerStatementParser.BIGINT, 0); }
		public TerminalNode NUMERIC() { return getToken(SQLServerStatementParser.NUMERIC, 0); }
		public TerminalNode BIT() { return getToken(SQLServerStatementParser.BIT, 0); }
		public TerminalNode SMALLINT() { return getToken(SQLServerStatementParser.SMALLINT, 0); }
		public TerminalNode DECIMAL() { return getToken(SQLServerStatementParser.DECIMAL, 0); }
		public TerminalNode SMALLMONEY() { return getToken(SQLServerStatementParser.SMALLMONEY, 0); }
		public TerminalNode INT() { return getToken(SQLServerStatementParser.INT, 0); }
		public TerminalNode TINYINT() { return getToken(SQLServerStatementParser.TINYINT, 0); }
		public TerminalNode MONEY() { return getToken(SQLServerStatementParser.MONEY, 0); }
		public TerminalNode FLOAT() { return getToken(SQLServerStatementParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(SQLServerStatementParser.REAL, 0); }
		public TerminalNode DATE() { return getToken(SQLServerStatementParser.DATE, 0); }
		public TerminalNode DATETIMEOFFSET() { return getToken(SQLServerStatementParser.DATETIMEOFFSET, 0); }
		public TerminalNode SMALLDATETIME() { return getToken(SQLServerStatementParser.SMALLDATETIME, 0); }
		public TerminalNode DATETIME() { return getToken(SQLServerStatementParser.DATETIME, 0); }
		public TerminalNode DATETIME2() { return getToken(SQLServerStatementParser.DATETIME2, 0); }
		public TerminalNode TIME() { return getToken(SQLServerStatementParser.TIME, 0); }
		public TerminalNode CHAR() { return getToken(SQLServerStatementParser.CHAR, 0); }
		public TerminalNode VARCHAR() { return getToken(SQLServerStatementParser.VARCHAR, 0); }
		public TerminalNode TEXT() { return getToken(SQLServerStatementParser.TEXT, 0); }
		public TerminalNode NCHAR() { return getToken(SQLServerStatementParser.NCHAR, 0); }
		public TerminalNode NVARCHAR() { return getToken(SQLServerStatementParser.NVARCHAR, 0); }
		public TerminalNode NTEXT() { return getToken(SQLServerStatementParser.NTEXT, 0); }
		public TerminalNode BINARY() { return getToken(SQLServerStatementParser.BINARY, 0); }
		public TerminalNode VARBINARY() { return getToken(SQLServerStatementParser.VARBINARY, 0); }
		public TerminalNode IMAGE() { return getToken(SQLServerStatementParser.IMAGE, 0); }
		public TerminalNode SQL_VARIANT() { return getToken(SQLServerStatementParser.SQL_VARIANT, 0); }
		public TerminalNode XML() { return getToken(SQLServerStatementParser.XML, 0); }
		public TerminalNode UNIQUEIDENTIFIER() { return getToken(SQLServerStatementParser.UNIQUEIDENTIFIER, 0); }
		public TerminalNode HIERARCHYID() { return getToken(SQLServerStatementParser.HIERARCHYID, 0); }
		public TerminalNode GEOMETRY() { return getToken(SQLServerStatementParser.GEOMETRY, 0); }
		public TerminalNode GEOGRAPHY() { return getToken(SQLServerStatementParser.GEOGRAPHY, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public DataTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDataTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeNameContext dataTypeName() throws RecognitionException {
		DataTypeNameContext _localctx = new DataTypeNameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_dataTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			_la = _input.LA(1);
			if ( !(((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (CHAR - 127)) | (1L << (DATE - 127)) | (1L << (TIME - 127)) | (1L << (REAL - 127)) | (1L << (DECIMAL - 127)) | (1L << (BIT - 127)) | (1L << (SMALLINT - 127)) | (1L << (INT - 127)) | (1L << (TINYINT - 127)) | (1L << (NUMERIC - 127)) | (1L << (FLOAT - 127)) | (1L << (BIGINT - 127)) | (1L << (TEXT - 127)) | (1L << (VARCHAR - 127)) | (1L << (BINARY - 127)))) != 0) || _la==XML || ((((_la - 391)) & ~0x3f) == 0 && ((1L << (_la - 391)) & ((1L << (MONEY - 391)) | (1L << (SMALLMONEY - 391)) | (1L << (DATETIMEOFFSET - 391)) | (1L << (DATETIME - 391)) | (1L << (DATETIME2 - 391)) | (1L << (SMALLDATETIME - 391)) | (1L << (NCHAR - 391)) | (1L << (NVARCHAR - 391)) | (1L << (NTEXT - 391)) | (1L << (VARBINARY - 391)) | (1L << (IMAGE - 391)) | (1L << (SQL_VARIANT - 391)) | (1L << (UNIQUEIDENTIFIER - 391)) | (1L << (HIERARCHYID - 391)) | (1L << (GEOMETRY - 391)) | (1L << (GEOGRAPHY - 391)) | (1L << (IDENTIFIER_ - 391)))) != 0)) ) {
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

	public static class AtTimeZoneExprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode TIME() { return getToken(SQLServerStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SQLServerStatementParser.ZONE, 0); }
		public AtTimeZoneExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atTimeZoneExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAtTimeZoneExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtTimeZoneExprContext atTimeZoneExpr() throws RecognitionException {
		AtTimeZoneExprContext _localctx = new AtTimeZoneExprContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_atTimeZoneExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			match(IDENTIFIER_);
			setState(1265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1262);
				match(WITH);
				setState(1263);
				match(TIME);
				setState(1264);
				match(ZONE);
				}
			}

			setState(1267);
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

	public static class CastExprContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(SQLServerStatementParser.CAST, 0); }
		public List<TerminalNode> LP_() { return getTokens(SQLServerStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(SQLServerStatementParser.LP_, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> RP_() { return getTokens(SQLServerStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(SQLServerStatementParser.RP_, i);
		}
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public CastExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExprContext castExpr() throws RecognitionException {
		CastExprContext _localctx = new CastExprContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_castExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			match(CAST);
			setState(1270);
			match(LP_);
			setState(1271);
			expr(0);
			setState(1272);
			match(AS);
			setState(1273);
			dataType();
			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1274);
				match(LP_);
				setState(1275);
				match(NUMBER_);
				setState(1276);
				match(RP_);
				}
			}

			setState(1279);
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

	public static class ConvertExprContext extends ParserRuleContext {
		public TerminalNode CONVERT() { return getToken(SQLServerStatementParser.CONVERT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(SQLServerStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQLServerStatementParser.NUMBER_, i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public ConvertExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convertExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitConvertExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConvertExprContext convertExpr() throws RecognitionException {
		ConvertExprContext _localctx = new ConvertExprContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_convertExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			match(CONVERT);
			{
			setState(1282);
			dataType();
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1283);
				match(LP_);
				setState(1284);
				match(NUMBER_);
				setState(1285);
				match(RP_);
				}
			}

			setState(1288);
			match(COMMA_);
			setState(1289);
			expr(0);
			setState(1292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1290);
				match(COMMA_);
				setState(1291);
				match(NUMBER_);
				}
				break;
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

	public static class WindowedFunctionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public OverClauseContext overClause() {
			return getRuleContext(OverClauseContext.class,0);
		}
		public WindowedFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowedFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitWindowedFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowedFunctionContext windowedFunction() throws RecognitionException {
		WindowedFunctionContext _localctx = new WindowedFunctionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_windowedFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			functionCall();
			setState(1295);
			overClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OverClauseContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(SQLServerStatementParser.OVER, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public PartitionByClauseContext partitionByClause() {
			return getRuleContext(PartitionByClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public RowRangeClauseContext rowRangeClause() {
			return getRuleContext(RowRangeClauseContext.class,0);
		}
		public OverClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOverClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverClauseContext overClause() throws RecognitionException {
		OverClauseContext _localctx = new OverClauseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_overClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			match(OVER);
			setState(1298);
			match(LP_);
			setState(1300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1299);
				partitionByClause();
				}
			}

			setState(1303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1302);
				orderByClause();
				}
			}

			setState(1306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROWS || _la==RANGE) {
				{
				setState(1305);
				rowRangeClause();
				}
			}

			setState(1308);
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

	public static class PartitionByClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SQLServerStatementParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(SQLServerStatementParser.BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public PartitionByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPartitionByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionByClauseContext partitionByClause() throws RecognitionException {
		PartitionByClauseContext _localctx = new PartitionByClauseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_partitionByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			match(PARTITION);
			setState(1311);
			match(BY);
			setState(1312);
			expr(0);
			setState(1317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1313);
				match(COMMA_);
				setState(1314);
				expr(0);
				}
				}
				setState(1319);
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

	public static class RowRangeClauseContext extends ParserRuleContext {
		public WindowFrameExtentContext windowFrameExtent() {
			return getRuleContext(WindowFrameExtentContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SQLServerStatementParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(SQLServerStatementParser.RANGE, 0); }
		public RowRangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowRangeClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitRowRangeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowRangeClauseContext rowRangeClause() throws RecognitionException {
		RowRangeClauseContext _localctx = new RowRangeClauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_rowRangeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			_la = _input.LA(1);
			if ( !(_la==ROWS || _la==RANGE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1321);
			windowFrameExtent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameExtentContext extends ParserRuleContext {
		public WindowFramePrecedingContext windowFramePreceding() {
			return getRuleContext(WindowFramePrecedingContext.class,0);
		}
		public WindowFrameBetweenContext windowFrameBetween() {
			return getRuleContext(WindowFrameBetweenContext.class,0);
		}
		public WindowFrameExtentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameExtent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitWindowFrameExtent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameExtentContext windowFrameExtent() throws RecognitionException {
		WindowFrameExtentContext _localctx = new WindowFrameExtentContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_windowFrameExtent);
		try {
			setState(1325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURRENT:
			case UNBOUNDED:
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1323);
				windowFramePreceding();
				}
				break;
			case BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1324);
				windowFrameBetween();
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

	public static class WindowFrameBetweenContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(SQLServerStatementParser.BETWEEN, 0); }
		public List<WindowFrameBoundContext> windowFrameBound() {
			return getRuleContexts(WindowFrameBoundContext.class);
		}
		public WindowFrameBoundContext windowFrameBound(int i) {
			return getRuleContext(WindowFrameBoundContext.class,i);
		}
		public TerminalNode AND() { return getToken(SQLServerStatementParser.AND, 0); }
		public WindowFrameBetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameBetween; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitWindowFrameBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameBetweenContext windowFrameBetween() throws RecognitionException {
		WindowFrameBetweenContext _localctx = new WindowFrameBetweenContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_windowFrameBetween);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			match(BETWEEN);
			setState(1328);
			windowFrameBound();
			setState(1329);
			match(AND);
			setState(1330);
			windowFrameBound();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameBoundContext extends ParserRuleContext {
		public WindowFramePrecedingContext windowFramePreceding() {
			return getRuleContext(WindowFramePrecedingContext.class,0);
		}
		public WindowFrameFollowingContext windowFrameFollowing() {
			return getRuleContext(WindowFrameFollowingContext.class,0);
		}
		public WindowFrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameBound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitWindowFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameBoundContext windowFrameBound() throws RecognitionException {
		WindowFrameBoundContext _localctx = new WindowFrameBoundContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_windowFrameBound);
		try {
			setState(1334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1332);
				windowFramePreceding();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1333);
				windowFrameFollowing();
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

	public static class WindowFramePrecedingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(SQLServerStatementParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SQLServerStatementParser.PRECEDING, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode CURRENT() { return getToken(SQLServerStatementParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public WindowFramePrecedingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFramePreceding; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitWindowFramePreceding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFramePrecedingContext windowFramePreceding() throws RecognitionException {
		WindowFramePrecedingContext _localctx = new WindowFramePrecedingContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_windowFramePreceding);
		try {
			setState(1342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1336);
				match(UNBOUNDED);
				setState(1337);
				match(PRECEDING);
				}
				break;
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1338);
				match(NUMBER_);
				setState(1339);
				match(PRECEDING);
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1340);
				match(CURRENT);
				setState(1341);
				match(ROW);
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

	public static class WindowFrameFollowingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(SQLServerStatementParser.UNBOUNDED, 0); }
		public TerminalNode FOLLOWING() { return getToken(SQLServerStatementParser.FOLLOWING, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode CURRENT() { return getToken(SQLServerStatementParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public WindowFrameFollowingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameFollowing; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitWindowFrameFollowing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameFollowingContext windowFrameFollowing() throws RecognitionException {
		WindowFrameFollowingContext _localctx = new WindowFrameFollowingContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_windowFrameFollowing);
		try {
			setState(1350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1344);
				match(UNBOUNDED);
				setState(1345);
				match(FOLLOWING);
				}
				break;
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1346);
				match(NUMBER_);
				setState(1347);
				match(FOLLOWING);
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1348);
				match(CURRENT);
				setState(1349);
				match(ROW);
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

	public static class ColumnNameWithSortContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQLServerStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLServerStatementParser.DESC, 0); }
		public ColumnNameWithSortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameWithSort; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnNameWithSort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameWithSortContext columnNameWithSort() throws RecognitionException {
		ColumnNameWithSortContext _localctx = new ColumnNameWithSortContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_columnNameWithSort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			columnName();
			setState(1354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1353);
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

	public static class IndexOptionContext extends ParserRuleContext {
		public TerminalNode FILLFACTOR() { return getToken(SQLServerStatementParser.FILLFACTOR, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public EqOnOffOptionContext eqOnOffOption() {
			return getRuleContext(EqOnOffOptionContext.class,0);
		}
		public EqTimeContext eqTime() {
			return getRuleContext(EqTimeContext.class,0);
		}
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public TerminalNode MAX_DURATION() { return getToken(SQLServerStatementParser.MAX_DURATION, 0); }
		public TerminalNode MAXDOP() { return getToken(SQLServerStatementParser.MAXDOP, 0); }
		public CompressionOptionContext compressionOption() {
			return getRuleContext(CompressionOptionContext.class,0);
		}
		public OnPartitionClauseContext onPartitionClause() {
			return getRuleContext(OnPartitionClauseContext.class,0);
		}
		public IndexOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIndexOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexOptionContext indexOption() throws RecognitionException {
		IndexOptionContext _localctx = new IndexOptionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_indexOption);
		int _la;
		try {
			setState(1369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1356);
				match(FILLFACTOR);
				setState(1357);
				match(EQ_);
				setState(1358);
				match(NUMBER_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1359);
				eqOnOffOption();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1360);
				_la = _input.LA(1);
				if ( !(_la==COMPRESSION_DELAY || _la==MAX_DURATION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1361);
				eqTime();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1362);
				match(MAXDOP);
				setState(1363);
				match(EQ_);
				setState(1364);
				match(NUMBER_);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1365);
				compressionOption();
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1366);
					onPartitionClause();
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

	public static class CompressionOptionContext extends ParserRuleContext {
		public TerminalNode DATA_COMPRESSION() { return getToken(SQLServerStatementParser.DATA_COMPRESSION, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NONE() { return getToken(SQLServerStatementParser.NONE, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode PAGE() { return getToken(SQLServerStatementParser.PAGE, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode COLUMNSTORE_ARCHIVE() { return getToken(SQLServerStatementParser.COLUMNSTORE_ARCHIVE, 0); }
		public CompressionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compressionOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCompressionOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompressionOptionContext compressionOption() throws RecognitionException {
		CompressionOptionContext _localctx = new CompressionOptionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_compressionOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			match(DATA_COMPRESSION);
			setState(1372);
			match(EQ_);
			setState(1373);
			_la = _input.LA(1);
			if ( !(((((_la - 190)) & ~0x3f) == 0 && ((1L << (_la - 190)) & ((1L << (ROW - 190)) | (1L << (COLUMNSTORE - 190)) | (1L << (NONE - 190)) | (1L << (PAGE - 190)))) != 0) || _la==COLUMNSTORE_ARCHIVE) ) {
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

	public static class EqTimeContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public EqTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqTime; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitEqTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqTimeContext eqTime() throws RecognitionException {
		EqTimeContext _localctx = new EqTimeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_eqTime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			match(EQ_);
			setState(1376);
			match(NUMBER_);
			setState(1378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUTES) {
				{
				setState(1377);
				match(MINUTES);
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

	public static class EqOnOffOptionContext extends ParserRuleContext {
		public EqKeyContext eqKey() {
			return getRuleContext(EqKeyContext.class,0);
		}
		public EqOnOffContext eqOnOff() {
			return getRuleContext(EqOnOffContext.class,0);
		}
		public EqOnOffOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOnOffOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitEqOnOffOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqOnOffOptionContext eqOnOffOption() throws RecognitionException {
		EqOnOffOptionContext _localctx = new EqOnOffOptionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_eqOnOffOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			eqKey();
			setState(1381);
			eqOnOff();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqKeyContext extends ParserRuleContext {
		public TerminalNode PAD_INDEX() { return getToken(SQLServerStatementParser.PAD_INDEX, 0); }
		public TerminalNode SORT_IN_TEMPDB() { return getToken(SQLServerStatementParser.SORT_IN_TEMPDB, 0); }
		public TerminalNode IGNORE_DUP_KEY() { return getToken(SQLServerStatementParser.IGNORE_DUP_KEY, 0); }
		public TerminalNode STATISTICS_NORECOMPUTE() { return getToken(SQLServerStatementParser.STATISTICS_NORECOMPUTE, 0); }
		public TerminalNode STATISTICS_INCREMENTAL() { return getToken(SQLServerStatementParser.STATISTICS_INCREMENTAL, 0); }
		public TerminalNode DROP_EXISTING() { return getToken(SQLServerStatementParser.DROP_EXISTING, 0); }
		public TerminalNode ONLINE() { return getToken(SQLServerStatementParser.ONLINE, 0); }
		public TerminalNode RESUMABLE() { return getToken(SQLServerStatementParser.RESUMABLE, 0); }
		public TerminalNode ALLOW_ROW_LOCKS() { return getToken(SQLServerStatementParser.ALLOW_ROW_LOCKS, 0); }
		public TerminalNode ALLOW_PAGE_LOCKS() { return getToken(SQLServerStatementParser.ALLOW_PAGE_LOCKS, 0); }
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public EqKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqKey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitEqKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqKeyContext eqKey() throws RecognitionException {
		EqKeyContext _localctx = new EqKeyContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_eqKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			_la = _input.LA(1);
			if ( !(_la==ONLINE || _la==RESUMABLE || ((((_la - 347)) & ~0x3f) == 0 && ((1L << (_la - 347)) & ((1L << (ALLOW_PAGE_LOCKS - 347)) | (1L << (ALLOW_ROW_LOCKS - 347)) | (1L << (COMPRESSION_DELAY - 347)) | (1L << (STATISTICS_INCREMENTAL - 347)) | (1L << (STATISTICS_NORECOMPUTE - 347)) | (1L << (SORT_IN_TEMPDB - 347)) | (1L << (IGNORE_DUP_KEY - 347)) | (1L << (PAD_INDEX - 347)) | (1L << (DROP_EXISTING - 347)))) != 0)) ) {
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

	public static class EqOnOffContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public EqOnOffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOnOff; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitEqOnOff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqOnOffContext eqOnOff() throws RecognitionException {
		EqOnOffContext _localctx = new EqOnOffContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_eqOnOff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			match(EQ_);
			setState(1386);
			_la = _input.LA(1);
			if ( !(_la==ON || _la==OFF) ) {
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

	public static class OnPartitionClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode PARTITIONS() { return getToken(SQLServerStatementParser.PARTITIONS, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public PartitionExpressionsContext partitionExpressions() {
			return getRuleContext(PartitionExpressionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public OnPartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onPartitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnPartitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnPartitionClauseContext onPartitionClause() throws RecognitionException {
		OnPartitionClauseContext _localctx = new OnPartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_onPartitionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			match(ON);
			setState(1389);
			match(PARTITIONS);
			setState(1390);
			match(LP_);
			setState(1391);
			partitionExpressions();
			setState(1392);
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

	public static class PartitionExpressionsContext extends ParserRuleContext {
		public List<PartitionExpressionContext> partitionExpression() {
			return getRuleContexts(PartitionExpressionContext.class);
		}
		public PartitionExpressionContext partitionExpression(int i) {
			return getRuleContext(PartitionExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public PartitionExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionExpressions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPartitionExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionExpressionsContext partitionExpressions() throws RecognitionException {
		PartitionExpressionsContext _localctx = new PartitionExpressionsContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_partitionExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394);
			partitionExpression();
			setState(1399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1395);
				match(COMMA_);
				setState(1396);
				partitionExpression();
				}
				}
				setState(1401);
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

	public static class PartitionExpressionContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public NumberRangeContext numberRange() {
			return getRuleContext(NumberRangeContext.class,0);
		}
		public PartitionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPartitionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionExpressionContext partitionExpression() throws RecognitionException {
		PartitionExpressionContext _localctx = new PartitionExpressionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_partitionExpression);
		try {
			setState(1404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1402);
				match(NUMBER_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1403);
				numberRange();
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

	public static class NumberRangeContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER_() { return getTokens(SQLServerStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQLServerStatementParser.NUMBER_, i);
		}
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public NumberRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberRange; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitNumberRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberRangeContext numberRange() throws RecognitionException {
		NumberRangeContext _localctx = new NumberRangeContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_numberRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			match(NUMBER_);
			setState(1407);
			match(TO);
			setState(1408);
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

	public static class LowPriorityLockWaitContext extends ParserRuleContext {
		public TerminalNode WAIT_AT_LOW_PRIORITY() { return getToken(SQLServerStatementParser.WAIT_AT_LOW_PRIORITY, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode MAX_DURATION() { return getToken(SQLServerStatementParser.MAX_DURATION, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode ABORT_AFTER_WAIT() { return getToken(SQLServerStatementParser.ABORT_AFTER_WAIT, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode NONE() { return getToken(SQLServerStatementParser.NONE, 0); }
		public TerminalNode SELF() { return getToken(SQLServerStatementParser.SELF, 0); }
		public TerminalNode BLOCKERS() { return getToken(SQLServerStatementParser.BLOCKERS, 0); }
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public LowPriorityLockWaitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowPriorityLockWait; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitLowPriorityLockWait(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowPriorityLockWaitContext lowPriorityLockWait() throws RecognitionException {
		LowPriorityLockWaitContext _localctx = new LowPriorityLockWaitContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_lowPriorityLockWait);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			match(WAIT_AT_LOW_PRIORITY);
			setState(1411);
			match(LP_);
			setState(1412);
			match(MAX_DURATION);
			setState(1413);
			match(EQ_);
			setState(1414);
			match(NUMBER_);
			setState(1416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUTES) {
				{
				setState(1415);
				match(MINUTES);
				}
			}

			setState(1418);
			match(COMMA_);
			setState(1419);
			match(ABORT_AFTER_WAIT);
			setState(1420);
			match(EQ_);
			setState(1421);
			_la = _input.LA(1);
			if ( !(((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & ((1L << (BLOCKERS - 209)) | (1L << (NONE - 209)) | (1L << (SELF - 209)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1422);
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

	public static class OnLowPriorLockWaitContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public LowPriorityLockWaitContext lowPriorityLockWait() {
			return getRuleContext(LowPriorityLockWaitContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public OnLowPriorLockWaitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onLowPriorLockWait; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnLowPriorLockWait(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnLowPriorLockWaitContext onLowPriorLockWait() throws RecognitionException {
		OnLowPriorLockWaitContext _localctx = new OnLowPriorLockWaitContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_onLowPriorLockWait);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			match(ON);
			setState(1429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1425);
				match(LP_);
				setState(1426);
				lowPriorityLockWait();
				setState(1427);
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

	public static class IgnoredIdentifier_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public IgnoredIdentifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIgnoredIdentifier_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoredIdentifier_Context ignoredIdentifier_() throws RecognitionException {
		IgnoredIdentifier_Context _localctx = new IgnoredIdentifier_Context(_ctx, getState());
		enterRule(_localctx, 210, RULE_ignoredIdentifier_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
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
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public IgnoredIdentifiers_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifiers_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIgnoredIdentifiers_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoredIdentifiers_Context ignoredIdentifiers_() throws RecognitionException {
		IgnoredIdentifiers_Context _localctx = new IgnoredIdentifiers_Context(_ctx, getState());
		enterRule(_localctx, 212, RULE_ignoredIdentifiers_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			ignoredIdentifier_();
			setState(1438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1434);
					match(COMMA_);
					setState(1435);
					ignoredIdentifier_();
					}
					} 
				}
				setState(1440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitMatchNone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchNoneContext matchNone() throws RecognitionException {
		MatchNoneContext _localctx = new MatchNoneContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_matchNone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
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
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public FileTableClause_Context fileTableClause_() {
			return getRuleContext(FileTableClause_Context.class,0);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_createTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			match(CREATE);
			setState(1444);
			match(TABLE);
			setState(1445);
			tableName();
			setState(1446);
			fileTableClause_();
			setState(1447);
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
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public CreateIndexSpecification_Context createIndexSpecification_() {
			return getRuleContext(CreateIndexSpecification_Context.class,0);
		}
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCreateIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_createIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			match(CREATE);
			setState(1450);
			createIndexSpecification_();
			setState(1451);
			match(INDEX);
			setState(1452);
			indexName();
			setState(1453);
			match(ON);
			setState(1454);
			tableName();
			setState(1455);
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

	public static class AlterTableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<AlterDefinitionClauseContext> alterDefinitionClause() {
			return getRuleContexts(AlterDefinitionClauseContext.class);
		}
		public AlterDefinitionClauseContext alterDefinitionClause(int i) {
			return getRuleContext(AlterDefinitionClauseContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_alterTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			match(ALTER);
			setState(1458);
			match(TABLE);
			setState(1459);
			tableName();
			setState(1460);
			alterDefinitionClause();
			setState(1465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1461);
				match(COMMA_);
				setState(1462);
				alterDefinitionClause();
				}
				}
				setState(1467);
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

	public static class AlterIndexContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public AlterIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterIndexContext alterIndex() throws RecognitionException {
		AlterIndexContext _localctx = new AlterIndexContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_alterIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			match(ALTER);
			setState(1469);
			match(INDEX);
			setState(1472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case FUNCTION:
			case TRIGGER:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case ARRAY:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case INTEGER:
			case TYPE:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case FIRST:
			case DATETIME2:
			case IDENTIFIER_:
				{
				setState(1470);
				indexName();
				}
				break;
			case ALL:
				{
				setState(1471);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1474);
			match(ON);
			setState(1475);
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

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public IfExist_Context ifExist_() {
			return getRuleContext(IfExist_Context.class,0);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_dropTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			match(DROP);
			setState(1478);
			match(TABLE);
			setState(1480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1479);
				ifExist_();
				}
			}

			setState(1482);
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
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IfExist_Context ifExist_() {
			return getRuleContext(IfExist_Context.class,0);
		}
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_dropIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			match(DROP);
			setState(1485);
			match(INDEX);
			setState(1487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1486);
				ifExist_();
				}
			}

			setState(1489);
			indexName();
			setState(1490);
			match(ON);
			setState(1491);
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

	public static class TruncateTableContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(SQLServerStatementParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TruncateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncateTableContext truncateTable() throws RecognitionException {
		TruncateTableContext _localctx = new TruncateTableContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_truncateTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			match(TRUNCATE);
			setState(1494);
			match(TABLE);
			setState(1495);
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

	public static class FileTableClause_Context extends ParserRuleContext {
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public TerminalNode FILETABLE() { return getToken(SQLServerStatementParser.FILETABLE, 0); }
		public FileTableClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileTableClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitFileTableClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileTableClause_Context fileTableClause_() throws RecognitionException {
		FileTableClause_Context _localctx = new FileTableClause_Context(_ctx, getState());
		enterRule(_localctx, 230, RULE_fileTableClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1497);
				match(AS);
				setState(1498);
				match(FILETABLE);
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

	public static class CreateDefinitionClauseContext extends ParserRuleContext {
		public CreateTableDefinitionsContext createTableDefinitions() {
			return getRuleContext(CreateTableDefinitionsContext.class,0);
		}
		public PartitionScheme_Context partitionScheme_() {
			return getRuleContext(PartitionScheme_Context.class,0);
		}
		public FileGroup_Context fileGroup_() {
			return getRuleContext(FileGroup_Context.class,0);
		}
		public CreateDefinitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCreateDefinitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDefinitionClauseContext createDefinitionClause() throws RecognitionException {
		CreateDefinitionClauseContext _localctx = new CreateDefinitionClauseContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_createDefinitionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501);
			createTableDefinitions();
			setState(1502);
			partitionScheme_();
			setState(1503);
			fileGroup_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableDefinitionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<CreateTableDefinitionContext> createTableDefinition() {
			return getRuleContexts(CreateTableDefinitionContext.class);
		}
		public CreateTableDefinitionContext createTableDefinition(int i) {
			return getRuleContext(CreateTableDefinitionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public PeriodClauseContext periodClause() {
			return getRuleContext(PeriodClauseContext.class,0);
		}
		public CreateTableDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableDefinitions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCreateTableDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableDefinitionsContext createTableDefinitions() throws RecognitionException {
		CreateTableDefinitionsContext _localctx = new CreateTableDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_createTableDefinitions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
			match(LP_);
			setState(1506);
			createTableDefinition();
			setState(1511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1507);
					match(COMMA_);
					setState(1508);
					createTableDefinition();
					}
					} 
				}
				setState(1513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(1514);
				match(COMMA_);
				setState(1515);
				periodClause();
				}
			}

			setState(1518);
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

	public static class CreateTableDefinitionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public ComputedColumnDefinitionContext computedColumnDefinition() {
			return getRuleContext(ComputedColumnDefinitionContext.class,0);
		}
		public ColumnSetDefinitionContext columnSetDefinition() {
			return getRuleContext(ColumnSetDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TableIndexContext tableIndex() {
			return getRuleContext(TableIndexContext.class,0);
		}
		public CreateTableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCreateTableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableDefinitionContext createTableDefinition() throws RecognitionException {
		CreateTableDefinitionContext _localctx = new CreateTableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_createTableDefinition);
		try {
			setState(1525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1520);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1521);
				computedColumnDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1522);
				columnSetDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1523);
				tableConstraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1524);
				tableIndex();
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
		public ColumnConstraintsContext columnConstraints() {
			return getRuleContext(ColumnConstraintsContext.class,0);
		}
		public List<ColumnDefinitionOptionContext> columnDefinitionOption() {
			return getRuleContexts(ColumnDefinitionOptionContext.class);
		}
		public ColumnDefinitionOptionContext columnDefinitionOption(int i) {
			return getRuleContext(ColumnDefinitionOptionContext.class,i);
		}
		public ColumnIndexContext columnIndex() {
			return getRuleContext(ColumnIndexContext.class,0);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_columnDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			columnName();
			setState(1528);
			dataType();
			setState(1532);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1529);
					columnDefinitionOption();
					}
					} 
				}
				setState(1534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			}
			setState(1535);
			columnConstraints();
			setState(1537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEX) {
				{
				setState(1536);
				columnIndex();
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

	public static class ColumnDefinitionOptionContext extends ParserRuleContext {
		public TerminalNode FILESTREAM() { return getToken(SQLServerStatementParser.FILESTREAM, 0); }
		public TerminalNode COLLATE() { return getToken(SQLServerStatementParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode SPARSE() { return getToken(SQLServerStatementParser.SPARSE, 0); }
		public TerminalNode MASKED() { return getToken(SQLServerStatementParser.MASKED, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode FUNCTION() { return getToken(SQLServerStatementParser.FUNCTION, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode IDENTITY() { return getToken(SQLServerStatementParser.IDENTITY, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(SQLServerStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQLServerStatementParser.NUMBER_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public TerminalNode GENERATED() { return getToken(SQLServerStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(SQLServerStatementParser.ALWAYS, 0); }
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode START() { return getToken(SQLServerStatementParser.START, 0); }
		public TerminalNode END() { return getToken(SQLServerStatementParser.END, 0); }
		public TerminalNode HIDDEN_() { return getToken(SQLServerStatementParser.HIDDEN_, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode ROWGUIDCOL() { return getToken(SQLServerStatementParser.ROWGUIDCOL, 0); }
		public TerminalNode ENCRYPTED() { return getToken(SQLServerStatementParser.ENCRYPTED, 0); }
		public EncryptedOptions_Context encryptedOptions_() {
			return getRuleContext(EncryptedOptions_Context.class,0);
		}
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ColumnIndexContext columnIndex() {
			return getRuleContext(ColumnIndexContext.class,0);
		}
		public ColumnDefinitionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinitionOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnDefinitionOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionOptionContext columnDefinitionOption() throws RecognitionException {
		ColumnDefinitionOptionContext _localctx = new ColumnDefinitionOptionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_columnDefinitionOption);
		int _la;
		try {
			int _alt;
			setState(1592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1539);
				match(FILESTREAM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1540);
				match(COLLATE);
				setState(1541);
				collationName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1542);
				match(SPARSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1543);
				match(MASKED);
				setState(1544);
				match(WITH);
				setState(1545);
				match(LP_);
				setState(1546);
				match(FUNCTION);
				setState(1547);
				match(EQ_);
				setState(1548);
				match(STRING_);
				setState(1549);
				match(RP_);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1550);
					match(CONSTRAINT);
					setState(1551);
					ignoredIdentifier_();
					}
				}

				setState(1554);
				match(DEFAULT);
				setState(1555);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1556);
				match(IDENTITY);
				setState(1562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1557);
					match(LP_);
					setState(1558);
					match(NUMBER_);
					setState(1559);
					match(COMMA_);
					setState(1560);
					match(NUMBER_);
					setState(1561);
					match(RP_);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1564);
				match(NOT);
				setState(1565);
				match(FOR);
				setState(1566);
				match(REPLICATION);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1567);
				match(GENERATED);
				setState(1568);
				match(ALWAYS);
				setState(1569);
				match(AS);
				setState(1570);
				match(ROW);
				setState(1571);
				_la = _input.LA(1);
				if ( !(_la==START || _la==END) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HIDDEN_) {
					{
					setState(1572);
					match(HIDDEN_);
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1575);
					match(NOT);
					}
				}

				setState(1578);
				match(NULL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1579);
				match(ROWGUIDCOL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1580);
				match(ENCRYPTED);
				setState(1581);
				match(WITH);
				setState(1582);
				encryptedOptions_();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1583);
				columnConstraint();
				setState(1588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1584);
						match(COMMA_);
						setState(1585);
						columnConstraint();
						}
						} 
					}
					setState(1590);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1591);
				columnIndex();
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

	public static class EncryptedOptions_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode COLUMN_ENCRYPTION_KEY() { return getToken(SQLServerStatementParser.COLUMN_ENCRYPTION_KEY, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode ENCRYPTION_TYPE() { return getToken(SQLServerStatementParser.ENCRYPTION_TYPE, 0); }
		public TerminalNode ALGORITHM() { return getToken(SQLServerStatementParser.ALGORITHM, 0); }
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode DETERMINISTIC() { return getToken(SQLServerStatementParser.DETERMINISTIC, 0); }
		public TerminalNode RANDOMIZED() { return getToken(SQLServerStatementParser.RANDOMIZED, 0); }
		public EncryptedOptions_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encryptedOptions_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitEncryptedOptions_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncryptedOptions_Context encryptedOptions_() throws RecognitionException {
		EncryptedOptions_Context _localctx = new EncryptedOptions_Context(_ctx, getState());
		enterRule(_localctx, 242, RULE_encryptedOptions_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			match(LP_);
			setState(1595);
			match(COLUMN_ENCRYPTION_KEY);
			setState(1596);
			match(EQ_);
			setState(1597);
			ignoredIdentifier_();
			setState(1598);
			match(COMMA_);
			setState(1599);
			match(ENCRYPTION_TYPE);
			setState(1600);
			match(EQ_);
			setState(1601);
			_la = _input.LA(1);
			if ( !(_la==DETERMINISTIC || _la==RANDOMIZED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1602);
			match(COMMA_);
			setState(1603);
			match(ALGORITHM);
			setState(1604);
			match(EQ_);
			setState(1605);
			match(STRING_);
			setState(1606);
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

	public static class ColumnConstraintContext extends ParserRuleContext {
		public PrimaryKeyConstraintContext primaryKeyConstraint() {
			return getRuleContext(PrimaryKeyConstraintContext.class,0);
		}
		public ColumnForeignKeyConstraintContext columnForeignKeyConstraint() {
			return getRuleContext(ColumnForeignKeyConstraintContext.class,0);
		}
		public CheckConstraintContext checkConstraint() {
			return getRuleContext(CheckConstraintContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_columnConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1608);
				match(CONSTRAINT);
				setState(1609);
				ignoredIdentifier_();
				}
			}

			setState(1615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case UNIQUE:
			case KEY:
				{
				setState(1612);
				primaryKeyConstraint();
				}
				break;
			case FOREIGN:
			case REFERENCES:
				{
				setState(1613);
				columnForeignKeyConstraint();
				}
				break;
			case CHECK:
				{
				setState(1614);
				checkConstraint();
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

	public static class PrimaryKeyConstraintContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQLServerStatementParser.UNIQUE, 0); }
		public DiskTablePrimaryKeyConstraintOptionContext diskTablePrimaryKeyConstraintOption() {
			return getRuleContext(DiskTablePrimaryKeyConstraintOptionContext.class,0);
		}
		public MemoryTablePrimaryKeyConstraintOptionContext memoryTablePrimaryKeyConstraintOption() {
			return getRuleContext(MemoryTablePrimaryKeyConstraintOptionContext.class,0);
		}
		public PrimaryKeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPrimaryKeyConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyConstraintContext primaryKeyConstraint() throws RecognitionException {
		PrimaryKeyConstraintContext _localctx = new PrimaryKeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_primaryKeyConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case KEY:
				{
				setState(1617);
				primaryKey();
				}
				break;
			case UNIQUE:
				{
				setState(1618);
				match(UNIQUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1621);
				diskTablePrimaryKeyConstraintOption();
				}
				break;
			case 2:
				{
				setState(1622);
				memoryTablePrimaryKeyConstraintOption();
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

	public static class DiskTablePrimaryKeyConstraintOptionContext extends ParserRuleContext {
		public ClusterOption_Context clusterOption_() {
			return getRuleContext(ClusterOption_Context.class,0);
		}
		public PrimaryKeyWithClauseContext primaryKeyWithClause() {
			return getRuleContext(PrimaryKeyWithClauseContext.class,0);
		}
		public PrimaryKeyOnClauseContext primaryKeyOnClause() {
			return getRuleContext(PrimaryKeyOnClauseContext.class,0);
		}
		public DiskTablePrimaryKeyConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diskTablePrimaryKeyConstraintOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDiskTablePrimaryKeyConstraintOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiskTablePrimaryKeyConstraintOptionContext diskTablePrimaryKeyConstraintOption() throws RecognitionException {
		DiskTablePrimaryKeyConstraintOptionContext _localctx = new DiskTablePrimaryKeyConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_diskTablePrimaryKeyConstraintOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(1625);
				clusterOption_();
				}
			}

			setState(1629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1628);
				primaryKeyWithClause();
				}
			}

			setState(1632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1631);
				primaryKeyOnClause();
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

	public static class ClusterOption_Context extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public ClusterOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusterOption_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitClusterOption_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClusterOption_Context clusterOption_() throws RecognitionException {
		ClusterOption_Context _localctx = new ClusterOption_Context(_ctx, getState());
		enterRule(_localctx, 250, RULE_clusterOption_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			_la = _input.LA(1);
			if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
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

	public static class PrimaryKeyWithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode FILLFACTOR() { return getToken(SQLServerStatementParser.FILLFACTOR, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<IndexOptionContext> indexOption() {
			return getRuleContexts(IndexOptionContext.class);
		}
		public IndexOptionContext indexOption(int i) {
			return getRuleContext(IndexOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public PrimaryKeyWithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyWithClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPrimaryKeyWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyWithClauseContext primaryKeyWithClause() throws RecognitionException {
		PrimaryKeyWithClauseContext _localctx = new PrimaryKeyWithClauseContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_primaryKeyWithClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
			match(WITH);
			setState(1651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILLFACTOR:
				{
				setState(1637);
				match(FILLFACTOR);
				setState(1638);
				match(EQ_);
				setState(1639);
				match(NUMBER_);
				}
				break;
			case LP_:
				{
				setState(1640);
				match(LP_);
				setState(1641);
				indexOption();
				setState(1646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1642);
					match(COMMA_);
					setState(1643);
					indexOption();
					}
					}
					setState(1648);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1649);
				match(RP_);
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

	public static class PrimaryKeyOnClauseContext extends ParserRuleContext {
		public OnSchemaColumnContext onSchemaColumn() {
			return getRuleContext(OnSchemaColumnContext.class,0);
		}
		public OnFileGroupContext onFileGroup() {
			return getRuleContext(OnFileGroupContext.class,0);
		}
		public OnStringContext onString() {
			return getRuleContext(OnStringContext.class,0);
		}
		public PrimaryKeyOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyOnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPrimaryKeyOnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyOnClauseContext primaryKeyOnClause() throws RecognitionException {
		PrimaryKeyOnClauseContext _localctx = new PrimaryKeyOnClauseContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_primaryKeyOnClause);
		try {
			setState(1656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1653);
				onSchemaColumn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1654);
				onFileGroup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1655);
				onString();
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

	public static class OnSchemaColumnContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public OnSchemaColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onSchemaColumn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnSchemaColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnSchemaColumnContext onSchemaColumn() throws RecognitionException {
		OnSchemaColumnContext _localctx = new OnSchemaColumnContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_onSchemaColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1658);
			match(ON);
			setState(1659);
			schemaName();
			setState(1660);
			match(LP_);
			setState(1661);
			columnName();
			setState(1662);
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

	public static class OnFileGroupContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public OnFileGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onFileGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnFileGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnFileGroupContext onFileGroup() throws RecognitionException {
		OnFileGroupContext _localctx = new OnFileGroupContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_onFileGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664);
			match(ON);
			setState(1665);
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

	public static class OnStringContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public OnStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onString; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnStringContext onString() throws RecognitionException {
		OnStringContext _localctx = new OnStringContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_onString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
			match(ON);
			setState(1668);
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

	public static class MemoryTablePrimaryKeyConstraintOptionContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public WithBucketContext withBucket() {
			return getRuleContext(WithBucketContext.class,0);
		}
		public MemoryTablePrimaryKeyConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryTablePrimaryKeyConstraintOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitMemoryTablePrimaryKeyConstraintOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemoryTablePrimaryKeyConstraintOptionContext memoryTablePrimaryKeyConstraintOption() throws RecognitionException {
		MemoryTablePrimaryKeyConstraintOptionContext _localctx = new MemoryTablePrimaryKeyConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_memoryTablePrimaryKeyConstraintOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			match(CLUSTERED);
			setState(1672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1671);
				withBucket();
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

	public static class WithBucketContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode BUCKET_COUNT() { return getToken(SQLServerStatementParser.BUCKET_COUNT, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public WithBucketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withBucket; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitWithBucket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithBucketContext withBucket() throws RecognitionException {
		WithBucketContext _localctx = new WithBucketContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_withBucket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
			match(WITH);
			setState(1675);
			match(LP_);
			setState(1676);
			match(BUCKET_COUNT);
			setState(1677);
			match(EQ_);
			setState(1678);
			match(NUMBER_);
			setState(1679);
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

	public static class ColumnForeignKeyConstraintContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(SQLServerStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode FOREIGN() { return getToken(SQLServerStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public List<ForeignKeyOnActionContext> foreignKeyOnAction() {
			return getRuleContexts(ForeignKeyOnActionContext.class);
		}
		public ForeignKeyOnActionContext foreignKeyOnAction(int i) {
			return getRuleContext(ForeignKeyOnActionContext.class,i);
		}
		public ColumnForeignKeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnForeignKeyConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnForeignKeyConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnForeignKeyConstraintContext columnForeignKeyConstraint() throws RecognitionException {
		ColumnForeignKeyConstraintContext _localctx = new ColumnForeignKeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_columnForeignKeyConstraint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOREIGN) {
				{
				setState(1681);
				match(FOREIGN);
				setState(1682);
				match(KEY);
				}
			}

			setState(1685);
			match(REFERENCES);
			setState(1686);
			tableName();
			setState(1687);
			match(LP_);
			setState(1688);
			columnName();
			setState(1689);
			match(RP_);
			setState(1693);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1690);
					foreignKeyOnAction();
					}
					} 
				}
				setState(1695);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
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

	public static class ForeignKeyOnActionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public ForeignKeyOnContext foreignKeyOn() {
			return getRuleContext(ForeignKeyOnContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(SQLServerStatementParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SQLServerStatementParser.UPDATE, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public ForeignKeyOnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOnAction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitForeignKeyOnAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyOnActionContext foreignKeyOnAction() throws RecognitionException {
		ForeignKeyOnActionContext _localctx = new ForeignKeyOnActionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_foreignKeyOnAction);
		int _la;
		try {
			setState(1702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1696);
				match(ON);
				setState(1697);
				_la = _input.LA(1);
				if ( !(_la==UPDATE || _la==DELETE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1698);
				foreignKeyOn();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1699);
				match(NOT);
				setState(1700);
				match(FOR);
				setState(1701);
				match(REPLICATION);
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

	public static class ForeignKeyOnContext extends ParserRuleContext {
		public TerminalNode NO() { return getToken(SQLServerStatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(SQLServerStatementParser.ACTION, 0); }
		public TerminalNode CASCADE() { return getToken(SQLServerStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public ForeignKeyOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitForeignKeyOn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyOnContext foreignKeyOn() throws RecognitionException {
		ForeignKeyOnContext _localctx = new ForeignKeyOnContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_foreignKeyOn);
		int _la;
		try {
			setState(1709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1704);
				match(NO);
				setState(1705);
				match(ACTION);
				}
				break;
			case CASCADE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1706);
				match(CASCADE);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(1707);
				match(SET);
				setState(1708);
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

	public static class CheckConstraintContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(SQLServerStatementParser.CHECK, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public CheckConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCheckConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckConstraintContext checkConstraint() throws RecognitionException {
		CheckConstraintContext _localctx = new CheckConstraintContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_checkConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1711);
			match(CHECK);
			setState(1715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1712);
				match(NOT);
				setState(1713);
				match(FOR);
				setState(1714);
				match(REPLICATION);
				}
			}

			setState(1717);
			match(LP_);
			setState(1718);
			expr(0);
			setState(1719);
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

	public static class ColumnIndexContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public ClusterOption_Context clusterOption_() {
			return getRuleContext(ClusterOption_Context.class,0);
		}
		public WithIndexOption_Context withIndexOption_() {
			return getRuleContext(WithIndexOption_Context.class,0);
		}
		public IndexOnClauseContext indexOnClause() {
			return getRuleContext(IndexOnClauseContext.class,0);
		}
		public FileStreamOn_Context fileStreamOn_() {
			return getRuleContext(FileStreamOn_Context.class,0);
		}
		public ColumnIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnIndexContext columnIndex() throws RecognitionException {
		ColumnIndexContext _localctx = new ColumnIndexContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_columnIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1721);
			match(INDEX);
			setState(1722);
			indexName();
			setState(1724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(1723);
				clusterOption_();
				}
			}

			setState(1727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1726);
				withIndexOption_();
				}
			}

			setState(1730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1729);
				indexOnClause();
				}
			}

			setState(1733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILESTREAM_ON) {
				{
				setState(1732);
				fileStreamOn_();
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

	public static class WithIndexOption_Context extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<IndexOptionContext> indexOption() {
			return getRuleContexts(IndexOptionContext.class);
		}
		public IndexOptionContext indexOption(int i) {
			return getRuleContext(IndexOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public WithIndexOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withIndexOption_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitWithIndexOption_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithIndexOption_Context withIndexOption_() throws RecognitionException {
		WithIndexOption_Context _localctx = new WithIndexOption_Context(_ctx, getState());
		enterRule(_localctx, 276, RULE_withIndexOption_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1735);
			match(WITH);
			setState(1736);
			match(LP_);
			setState(1737);
			indexOption();
			setState(1742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1738);
				match(COMMA_);
				setState(1739);
				indexOption();
				}
				}
				setState(1744);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1745);
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

	public static class IndexOnClauseContext extends ParserRuleContext {
		public OnSchemaColumnContext onSchemaColumn() {
			return getRuleContext(OnSchemaColumnContext.class,0);
		}
		public OnFileGroupContext onFileGroup() {
			return getRuleContext(OnFileGroupContext.class,0);
		}
		public OnDefaultContext onDefault() {
			return getRuleContext(OnDefaultContext.class,0);
		}
		public IndexOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIndexOnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexOnClauseContext indexOnClause() throws RecognitionException {
		IndexOnClauseContext _localctx = new IndexOnClauseContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_indexOnClause);
		try {
			setState(1750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1747);
				onSchemaColumn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1748);
				onFileGroup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1749);
				onDefault();
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

	public static class OnDefaultContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public OnDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onDefault; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnDefaultContext onDefault() throws RecognitionException {
		OnDefaultContext _localctx = new OnDefaultContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_onDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			match(ON);
			setState(1753);
			match(DEFAULT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileStreamOn_Context extends ParserRuleContext {
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public FileStreamOn_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileStreamOn_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitFileStreamOn_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileStreamOn_Context fileStreamOn_() throws RecognitionException {
		FileStreamOn_Context _localctx = new FileStreamOn_Context(_ctx, getState());
		enterRule(_localctx, 282, RULE_fileStreamOn_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			match(FILESTREAM_ON);
			setState(1759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1756);
				ignoredIdentifier_();
				}
				break;
			case 2:
				{
				setState(1757);
				schemaName();
				}
				break;
			case 3:
				{
				setState(1758);
				match(STRING_);
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

	public static class ColumnConstraintsContext extends ParserRuleContext {
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ColumnConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraints; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnConstraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnConstraintsContext columnConstraints() throws RecognitionException {
		ColumnConstraintsContext _localctx = new ColumnConstraintsContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_columnConstraints);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (FOREIGN - 61)) | (1L << (KEY - 61)))) != 0) || _la==CHECK || _la==REFERENCES) {
				{
				setState(1761);
				columnConstraint();
				setState(1766);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1762);
						match(COMMA_);
						setState(1763);
						columnConstraint();
						}
						} 
					}
					setState(1768);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
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

	public static class ComputedColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PERSISTED() { return getToken(SQLServerStatementParser.PERSISTED, 0); }
		public ColumnConstraintContext columnConstraint() {
			return getRuleContext(ColumnConstraintContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public ComputedColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computedColumnDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitComputedColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputedColumnDefinitionContext computedColumnDefinition() throws RecognitionException {
		ComputedColumnDefinitionContext _localctx = new ComputedColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_computedColumnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			columnName();
			setState(1772);
			match(AS);
			setState(1773);
			expr(0);
			setState(1779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERSISTED) {
				{
				setState(1774);
				match(PERSISTED);
				setState(1777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1775);
					match(NOT);
					setState(1776);
					match(NULL);
					}
				}

				}
			}

			setState(1782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (FOREIGN - 61)) | (1L << (KEY - 61)))) != 0) || _la==CHECK || _la==REFERENCES) {
				{
				setState(1781);
				columnConstraint();
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

	public static class ColumnSetDefinitionContext extends ParserRuleContext {
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public TerminalNode COLUMN_SET() { return getToken(SQLServerStatementParser.COLUMN_SET, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode ALL_SPARSE_COLUMNS() { return getToken(SQLServerStatementParser.ALL_SPARSE_COLUMNS, 0); }
		public ColumnSetDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnSetDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnSetDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnSetDefinitionContext columnSetDefinition() throws RecognitionException {
		ColumnSetDefinitionContext _localctx = new ColumnSetDefinitionContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_columnSetDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
			ignoredIdentifier_();
			setState(1785);
			match(IDENTIFIER_);
			setState(1786);
			match(COLUMN_SET);
			setState(1787);
			match(FOR);
			setState(1788);
			match(ALL_SPARSE_COLUMNS);
			}
		}
		catch (RecognitionException re) {
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
		public TablePrimaryConstraintContext tablePrimaryConstraint() {
			return getRuleContext(TablePrimaryConstraintContext.class,0);
		}
		public TableForeignKeyConstraintContext tableForeignKeyConstraint() {
			return getRuleContext(TableForeignKeyConstraintContext.class,0);
		}
		public CheckConstraintContext checkConstraint() {
			return getRuleContext(CheckConstraintContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_tableConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1790);
				match(CONSTRAINT);
				setState(1791);
				ignoredIdentifier_();
				}
			}

			setState(1797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case UNIQUE:
			case KEY:
				{
				setState(1794);
				tablePrimaryConstraint();
				}
				break;
			case LP_:
			case FOREIGN:
				{
				setState(1795);
				tableForeignKeyConstraint();
				}
				break;
			case CHECK:
				{
				setState(1796);
				checkConstraint();
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

	public static class TablePrimaryConstraintContext extends ParserRuleContext {
		public PrimaryKeyUniqueContext primaryKeyUnique() {
			return getRuleContext(PrimaryKeyUniqueContext.class,0);
		}
		public DiskTablePrimaryConstraintOptionContext diskTablePrimaryConstraintOption() {
			return getRuleContext(DiskTablePrimaryConstraintOptionContext.class,0);
		}
		public MemoryTablePrimaryConstraintOptionContext memoryTablePrimaryConstraintOption() {
			return getRuleContext(MemoryTablePrimaryConstraintOptionContext.class,0);
		}
		public TablePrimaryConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePrimaryConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTablePrimaryConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePrimaryConstraintContext tablePrimaryConstraint() throws RecognitionException {
		TablePrimaryConstraintContext _localctx = new TablePrimaryConstraintContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_tablePrimaryConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			primaryKeyUnique();
			setState(1802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1800);
				diskTablePrimaryConstraintOption();
				}
				break;
			case 2:
				{
				setState(1801);
				memoryTablePrimaryConstraintOption();
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

	public static class PrimaryKeyUniqueContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQLServerStatementParser.UNIQUE, 0); }
		public PrimaryKeyUniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyUnique; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPrimaryKeyUnique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyUniqueContext primaryKeyUnique() throws RecognitionException {
		PrimaryKeyUniqueContext _localctx = new PrimaryKeyUniqueContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_primaryKeyUnique);
		try {
			setState(1806);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1804);
				primaryKey();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1805);
				match(UNIQUE);
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

	public static class DiskTablePrimaryConstraintOptionContext extends ParserRuleContext {
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public ClusterOption_Context clusterOption_() {
			return getRuleContext(ClusterOption_Context.class,0);
		}
		public PrimaryKeyWithClauseContext primaryKeyWithClause() {
			return getRuleContext(PrimaryKeyWithClauseContext.class,0);
		}
		public PrimaryKeyOnClauseContext primaryKeyOnClause() {
			return getRuleContext(PrimaryKeyOnClauseContext.class,0);
		}
		public DiskTablePrimaryConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diskTablePrimaryConstraintOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDiskTablePrimaryConstraintOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiskTablePrimaryConstraintOptionContext diskTablePrimaryConstraintOption() throws RecognitionException {
		DiskTablePrimaryConstraintOptionContext _localctx = new DiskTablePrimaryConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_diskTablePrimaryConstraintOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(1808);
				clusterOption_();
				}
			}

			setState(1811);
			columnNames();
			setState(1813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1812);
				primaryKeyWithClause();
				}
			}

			setState(1816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1815);
				primaryKeyOnClause();
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

	public static class MemoryTablePrimaryConstraintOptionContext extends ParserRuleContext {
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public HashWithBucketContext hashWithBucket() {
			return getRuleContext(HashWithBucketContext.class,0);
		}
		public MemoryTablePrimaryConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryTablePrimaryConstraintOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitMemoryTablePrimaryConstraintOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemoryTablePrimaryConstraintOptionContext memoryTablePrimaryConstraintOption() throws RecognitionException {
		MemoryTablePrimaryConstraintOptionContext _localctx = new MemoryTablePrimaryConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_memoryTablePrimaryConstraintOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			match(NONCLUSTERED);
			setState(1821);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				{
				setState(1819);
				columnNames();
				}
				break;
			case HASH:
				{
				setState(1820);
				hashWithBucket();
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

	public static class HashWithBucketContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(SQLServerStatementParser.HASH, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public WithBucketContext withBucket() {
			return getRuleContext(WithBucketContext.class,0);
		}
		public HashWithBucketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashWithBucket; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitHashWithBucket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashWithBucketContext hashWithBucket() throws RecognitionException {
		HashWithBucketContext _localctx = new HashWithBucketContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_hashWithBucket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1823);
			match(HASH);
			setState(1824);
			columnNames();
			setState(1825);
			withBucket();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableForeignKeyConstraintContext extends ParserRuleContext {
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public TerminalNode REFERENCES() { return getToken(SQLServerStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(SQLServerStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public List<ForeignKeyOnActionContext> foreignKeyOnAction() {
			return getRuleContexts(ForeignKeyOnActionContext.class);
		}
		public ForeignKeyOnActionContext foreignKeyOnAction(int i) {
			return getRuleContext(ForeignKeyOnActionContext.class,i);
		}
		public TableForeignKeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableForeignKeyConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableForeignKeyConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableForeignKeyConstraintContext tableForeignKeyConstraint() throws RecognitionException {
		TableForeignKeyConstraintContext _localctx = new TableForeignKeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_tableForeignKeyConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOREIGN) {
				{
				setState(1827);
				match(FOREIGN);
				setState(1828);
				match(KEY);
				}
			}

			setState(1831);
			columnNames();
			setState(1832);
			match(REFERENCES);
			setState(1833);
			tableName();
			setState(1834);
			columnNames();
			setState(1838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ON || _la==NOT) {
				{
				{
				setState(1835);
				foreignKeyOnAction();
				}
				}
				setState(1840);
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

	public static class TableIndexContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public IndexNameOption_Context indexNameOption_() {
			return getRuleContext(IndexNameOption_Context.class,0);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public IndexOptions_Context indexOptions_() {
			return getRuleContext(IndexOptions_Context.class,0);
		}
		public IndexOnClauseContext indexOnClause() {
			return getRuleContext(IndexOnClauseContext.class,0);
		}
		public FileStreamOn_Context fileStreamOn_() {
			return getRuleContext(FileStreamOn_Context.class,0);
		}
		public TableIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIndexContext tableIndex() throws RecognitionException {
		TableIndexContext _localctx = new TableIndexContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_tableIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1841);
			match(INDEX);
			setState(1842);
			indexName();
			setState(1843);
			indexNameOption_();
			setState(1846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1844);
				match(WITH);
				setState(1845);
				indexOptions_();
				}
			}

			setState(1849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1848);
				indexOnClause();
				}
			}

			setState(1852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILESTREAM_ON) {
				{
				setState(1851);
				fileStreamOn_();
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

	public static class IndexNameOption_Context extends ParserRuleContext {
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public ClusterOption_Context clusterOption_() {
			return getRuleContext(ClusterOption_Context.class,0);
		}
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public IndexNameOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexNameOption_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIndexNameOption_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexNameOption_Context indexNameOption_() throws RecognitionException {
		IndexNameOption_Context _localctx = new IndexNameOption_Context(_ctx, getState());
		enterRule(_localctx, 306, RULE_indexNameOption_);
		int _la;
		try {
			setState(1865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(1854);
					clusterOption_();
					}
				}

				setState(1857);
				columnNames();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1858);
				match(CLUSTERED);
				setState(1859);
				match(COLUMNSTORE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NONCLUSTERED) {
					{
					setState(1860);
					match(NONCLUSTERED);
					}
				}

				setState(1863);
				match(COLUMNSTORE);
				setState(1864);
				columnNames();
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

	public static class IndexOptions_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<IndexOptionContext> indexOption() {
			return getRuleContexts(IndexOptionContext.class);
		}
		public IndexOptionContext indexOption(int i) {
			return getRuleContext(IndexOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public IndexOptions_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOptions_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIndexOptions_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexOptions_Context indexOptions_() throws RecognitionException {
		IndexOptions_Context _localctx = new IndexOptions_Context(_ctx, getState());
		enterRule(_localctx, 308, RULE_indexOptions_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
			match(LP_);
			setState(1868);
			indexOption();
			setState(1873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1869);
				match(COMMA_);
				setState(1870);
				indexOption();
				}
				}
				setState(1875);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1876);
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

	public static class PeriodClauseContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(SQLServerStatementParser.PERIOD, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SQLServerStatementParser.SYSTEM_TIME, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public PeriodClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_periodClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPeriodClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeriodClauseContext periodClause() throws RecognitionException {
		PeriodClauseContext _localctx = new PeriodClauseContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_periodClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1878);
			match(PERIOD);
			setState(1879);
			match(FOR);
			setState(1880);
			match(SYSTEM_TIME);
			setState(1881);
			match(LP_);
			setState(1882);
			columnName();
			setState(1883);
			match(COMMA_);
			setState(1884);
			columnName();
			setState(1885);
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

	public static class PartitionScheme_Context extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public PartitionScheme_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionScheme_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPartitionScheme_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionScheme_Context partitionScheme_() throws RecognitionException {
		PartitionScheme_Context _localctx = new PartitionScheme_Context(_ctx, getState());
		enterRule(_localctx, 312, RULE_partitionScheme_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1887);
				match(ON);
				setState(1895);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1888);
					schemaName();
					setState(1889);
					match(LP_);
					setState(1890);
					columnName();
					setState(1891);
					match(RP_);
					}
					break;
				case 2:
					{
					setState(1893);
					ignoredIdentifier_();
					}
					break;
				case 3:
					{
					setState(1894);
					match(STRING_);
					}
					break;
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

	public static class FileGroup_Context extends ParserRuleContext {
		public TerminalNode TEXTIMAGE_ON() { return getToken(SQLServerStatementParser.TEXTIMAGE_ON, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TableOptionsContext tableOptions() {
			return getRuleContext(TableOptionsContext.class,0);
		}
		public List<IgnoredIdentifier_Context> ignoredIdentifier_() {
			return getRuleContexts(IgnoredIdentifier_Context.class);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_(int i) {
			return getRuleContext(IgnoredIdentifier_Context.class,i);
		}
		public List<TerminalNode> STRING_() { return getTokens(SQLServerStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(SQLServerStatementParser.STRING_, i);
		}
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public FileGroup_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileGroup_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitFileGroup_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileGroup_Context fileGroup_() throws RecognitionException {
		FileGroup_Context _localctx = new FileGroup_Context(_ctx, getState());
		enterRule(_localctx, 314, RULE_fileGroup_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXTIMAGE_ON) {
				{
				setState(1899);
				match(TEXTIMAGE_ON);
				setState(1902);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER_:
					{
					setState(1900);
					ignoredIdentifier_();
					}
					break;
				case STRING_:
					{
					setState(1901);
					match(STRING_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(1913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILESTREAM_ON || _la==IDENTIFIER_) {
				{
				setState(1911);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FILESTREAM_ON:
					{
					setState(1906);
					match(FILESTREAM_ON);
					{
					setState(1907);
					schemaName();
					}
					}
					break;
				case IDENTIFIER_:
					{
					setState(1908);
					ignoredIdentifier_();
					setState(1909);
					match(STRING_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(1917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1915);
				match(WITH);
				setState(1916);
				tableOptions();
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

	public static class TableOptionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<TableOptionContext> tableOption() {
			return getRuleContexts(TableOptionContext.class);
		}
		public TableOptionContext tableOption(int i) {
			return getRuleContext(TableOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TableOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOptions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableOptionsContext tableOptions() throws RecognitionException {
		TableOptionsContext _localctx = new TableOptionsContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_tableOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1919);
			match(LP_);
			setState(1920);
			tableOption();
			setState(1925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1921);
				match(COMMA_);
				setState(1922);
				tableOption();
				}
				}
				setState(1927);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1928);
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

	public static class TableOptionContext extends ParserRuleContext {
		public TerminalNode DATA_COMPRESSION() { return getToken(SQLServerStatementParser.DATA_COMPRESSION, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NONE() { return getToken(SQLServerStatementParser.NONE, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode PAGE() { return getToken(SQLServerStatementParser.PAGE, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode PARTITIONS() { return getToken(SQLServerStatementParser.PARTITIONS, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public PartitionExpressionsContext partitionExpressions() {
			return getRuleContext(PartitionExpressionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode FILETABLE_DIRECTORY() { return getToken(SQLServerStatementParser.FILETABLE_DIRECTORY, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode FILETABLE_COLLATE_FILENAME() { return getToken(SQLServerStatementParser.FILETABLE_COLLATE_FILENAME, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode DATABASE_DEAULT() { return getToken(SQLServerStatementParser.DATABASE_DEAULT, 0); }
		public TerminalNode FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME, 0); }
		public TerminalNode FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME, 0); }
		public TerminalNode FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME, 0); }
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public OnHistoryTableClauseContext onHistoryTableClause() {
			return getRuleContext(OnHistoryTableClauseContext.class,0);
		}
		public TerminalNode REMOTE_DATA_ARCHIVE() { return getToken(SQLServerStatementParser.REMOTE_DATA_ARCHIVE, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public MigrationState_Context migrationState_() {
			return getRuleContext(MigrationState_Context.class,0);
		}
		public TableStretchOptionsContext tableStretchOptions() {
			return getRuleContext(TableStretchOptionsContext.class,0);
		}
		public TableOperationOptionContext tableOperationOption() {
			return getRuleContext(TableOperationOptionContext.class,0);
		}
		public DistributionOptionContext distributionOption() {
			return getRuleContext(DistributionOptionContext.class,0);
		}
		public DataWareHouseTableOptionContext dataWareHouseTableOption() {
			return getRuleContext(DataWareHouseTableOptionContext.class,0);
		}
		public TableOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableOptionContext tableOption() throws RecognitionException {
		TableOptionContext _localctx = new TableOptionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_tableOption);
		int _la;
		try {
			setState(1978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1930);
				match(DATA_COMPRESSION);
				setState(1931);
				match(EQ_);
				setState(1932);
				_la = _input.LA(1);
				if ( !(((((_la - 190)) & ~0x3f) == 0 && ((1L << (_la - 190)) & ((1L << (ROW - 190)) | (1L << (NONE - 190)) | (1L << (PAGE - 190)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1933);
					match(ON);
					setState(1934);
					match(PARTITIONS);
					setState(1935);
					match(LP_);
					setState(1936);
					partitionExpressions();
					setState(1937);
					match(RP_);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1941);
				match(FILETABLE_DIRECTORY);
				setState(1942);
				match(EQ_);
				setState(1943);
				ignoredIdentifier_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1944);
				match(FILETABLE_COLLATE_FILENAME);
				setState(1945);
				match(EQ_);
				setState(1948);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER_:
				case STRING_:
					{
					setState(1946);
					collationName();
					}
					break;
				case DATABASE_DEAULT:
					{
					setState(1947);
					match(DATABASE_DEAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1950);
				match(FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME);
				setState(1951);
				match(EQ_);
				setState(1952);
				ignoredIdentifier_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1953);
				match(FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME);
				setState(1954);
				match(EQ_);
				setState(1955);
				ignoredIdentifier_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1956);
				match(FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME);
				setState(1957);
				match(EQ_);
				setState(1958);
				ignoredIdentifier_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1959);
				match(SYSTEM_VERSIONING);
				setState(1960);
				match(EQ_);
				setState(1961);
				match(ON);
				setState(1963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1962);
					onHistoryTableClause();
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1965);
				match(REMOTE_DATA_ARCHIVE);
				setState(1966);
				match(EQ_);
				setState(1973);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ON:
					{
					setState(1967);
					match(ON);
					setState(1969);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LP_) {
						{
						setState(1968);
						tableStretchOptions();
						}
					}

					}
					break;
				case OFF:
					{
					setState(1971);
					match(OFF);
					setState(1972);
					migrationState_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1975);
				tableOperationOption();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1976);
				distributionOption();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1977);
				dataWareHouseTableOption();
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

	public static class TableStretchOptionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<TableStretchOptionsContext> tableStretchOptions() {
			return getRuleContexts(TableStretchOptionsContext.class);
		}
		public TableStretchOptionsContext tableStretchOptions(int i) {
			return getRuleContext(TableStretchOptionsContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TableStretchOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableStretchOptions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableStretchOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableStretchOptionsContext tableStretchOptions() throws RecognitionException {
		TableStretchOptionsContext _localctx = new TableStretchOptionsContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_tableStretchOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1980);
			match(LP_);
			setState(1981);
			tableStretchOptions();
			setState(1986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1982);
				match(COMMA_);
				setState(1983);
				tableStretchOptions();
				}
				}
				setState(1988);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1989);
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

	public static class TableStretchOptionContext extends ParserRuleContext {
		public TerminalNode MIGRATION_STATE() { return getToken(SQLServerStatementParser.MIGRATION_STATE, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TerminalNode OUTBOUND() { return getToken(SQLServerStatementParser.OUTBOUND, 0); }
		public TerminalNode INBOUND() { return getToken(SQLServerStatementParser.INBOUND, 0); }
		public TerminalNode PAUSED() { return getToken(SQLServerStatementParser.PAUSED, 0); }
		public TerminalNode FILTER_PREDICATE() { return getToken(SQLServerStatementParser.FILTER_PREDICATE, 0); }
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TableStretchOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableStretchOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableStretchOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableStretchOptionContext tableStretchOption() throws RecognitionException {
		TableStretchOptionContext _localctx = new TableStretchOptionContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_tableStretchOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILTER_PREDICATE) {
				{
				setState(1991);
				match(FILTER_PREDICATE);
				setState(1992);
				match(EQ_);
				setState(1995);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NULL:
					{
					setState(1993);
					match(NULL);
					}
					break;
				case TRUNCATE:
				case FUNCTION:
				case TRIGGER:
				case CAST:
				case IF:
				case LIMIT:
				case OFFSET:
				case SAVEPOINT:
				case BOOLEAN:
				case CHAR:
				case ARRAY:
				case INTERVAL:
				case LOCALTIME:
				case LOCALTIMESTAMP:
				case QUARTER:
				case WEEK:
				case MICROSECOND:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case ENABLE:
				case DISABLE:
				case INSTANCE:
				case DO:
				case DEFINER:
				case SQL:
				case CASCADED:
				case LOCAL:
				case NEXT:
				case NAME:
				case INTEGER:
				case TYPE:
				case BINARY:
				case HIDDEN_:
				case MOD:
				case PARTITION:
				case PARTITIONS:
				case TOP:
				case ROW:
				case XOR:
				case ALWAYS:
				case ROLE:
				case START:
				case ALGORITHM:
				case AUTO:
				case BLOCKERS:
				case CLUSTERED:
				case NONCLUSTERED:
				case COLUMNSTORE:
				case CONTENT:
				case DATABASE:
				case YEARS:
				case MONTHS:
				case WEEKS:
				case DAYS:
				case MINUTES:
				case DENY:
				case DETERMINISTIC:
				case DISTRIBUTION:
				case DOCUMENT:
				case DURABILITY:
				case ENCRYPTED:
				case FILESTREAM:
				case FILETABLE:
				case FILLFACTOR:
				case FOLLOWING:
				case HASH:
				case HEAP:
				case INBOUND:
				case OUTBOUND:
				case UNBOUNDED:
				case INFINITE:
				case LOGIN:
				case MASKED:
				case MAXDOP:
				case MOVE:
				case NOCHECK:
				case OBJECT:
				case OFF:
				case ONLINE:
				case OVER:
				case PAGE:
				case PAUSED:
				case PERIOD:
				case PERSISTED:
				case PRECEDING:
				case RANDOMIZED:
				case RANGE:
				case REBUILD:
				case REPLICATE:
				case REPLICATION:
				case RESUMABLE:
				case ROWGUIDCOL:
				case SAVE:
				case SELF:
				case SPARSE:
				case SWITCH:
				case TRAN:
				case TRANCOUNT:
				case CONTROL:
				case TAKE:
				case OWNERSHIP:
				case DEFINITION:
				case APPLICATION:
				case ASSEMBLY:
				case SYMMETRIC:
				case ASYMMETRIC:
				case SERVER:
				case RECEIVE:
				case CHANGE:
				case TRACE:
				case TRACKING:
				case RESOURCES:
				case SETTINGS:
				case STATE:
				case AVAILABILITY:
				case CREDENTIAL:
				case ENDPOINT:
				case EVENT:
				case NOTIFICATION:
				case LINKED:
				case AUDIT:
				case DDL:
				case XML:
				case IMPERSONATE:
				case SECURABLES:
				case AUTHENTICATE:
				case EXTERNAL:
				case ACCESS:
				case ADMINISTER:
				case BULK:
				case OPERATIONS:
				case UNSAFE:
				case SHUTDOWN:
				case SCOPED:
				case CONFIGURATION:
				case DATASPACE:
				case SERVICE:
				case CERTIFICATE:
				case CONTRACT:
				case ENCRYPTION:
				case MASTER:
				case DATA:
				case SOURCE:
				case FILE:
				case FORMAT:
				case LIBRARY:
				case FULLTEXT:
				case MASK:
				case UNMASK:
				case MESSAGE:
				case REMOTE:
				case BINDING:
				case ROUTE:
				case SECURITY:
				case POLICY:
				case AGGREGATE:
				case QUEUE:
				case RULE:
				case SYNONYM:
				case COLLECTION:
				case SCRIPT:
				case KILL:
				case BACKUP:
				case LOG:
				case SHOWPLAN:
				case SUBSCRIBE:
				case QUERY:
				case NOTIFICATIONS:
				case CHECKPOINT:
				case SEQUENCE:
				case ABORT_AFTER_WAIT:
				case ALLOW_PAGE_LOCKS:
				case ALLOW_ROW_LOCKS:
				case ALL_SPARSE_COLUMNS:
				case BUCKET_COUNT:
				case COLUMNSTORE_ARCHIVE:
				case COLUMN_ENCRYPTION_KEY:
				case COLUMN_SET:
				case COMPRESSION_DELAY:
				case DATABASE_DEAULT:
				case DATA_COMPRESSION:
				case DATA_CONSISTENCY_CHECK:
				case ENCRYPTION_TYPE:
				case SYSTEM_TIME:
				case SYSTEM_VERSIONING:
				case TEXTIMAGE_ON:
				case WAIT_AT_LOW_PRIORITY:
				case STATISTICS_INCREMENTAL:
				case STATISTICS_NORECOMPUTE:
				case ROUND_ROBIN:
				case SCHEMA_AND_DATA:
				case SCHEMA_ONLY:
				case SORT_IN_TEMPDB:
				case IGNORE_DUP_KEY:
				case IMPLICIT_TRANSACTIONS:
				case MAX_DURATION:
				case MEMORY_OPTIMIZED:
				case MIGRATION_STATE:
				case PAD_INDEX:
				case REMOTE_DATA_ARCHIVE:
				case FILESTREAM_ON:
				case FILETABLE_COLLATE_FILENAME:
				case FILETABLE_DIRECTORY:
				case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
				case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
				case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
				case FILTER_PREDICATE:
				case HISTORY_RETENTION_PERIOD:
				case HISTORY_TABLE:
				case LOCK_ESCALATION:
				case DROP_EXISTING:
				case ROW_NUMBER:
				case FIRST:
				case DATETIME2:
				case IDENTIFIER_:
					{
					setState(1994);
					functionCall();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1997);
				match(COMMA_);
				}
			}

			setState(2000);
			match(MIGRATION_STATE);
			setState(2001);
			match(EQ_);
			setState(2002);
			_la = _input.LA(1);
			if ( !(((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & ((1L << (INBOUND - 236)) | (1L << (OUTBOUND - 236)) | (1L << (PAUSED - 236)))) != 0)) ) {
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

	public static class MigrationState_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode MIGRATION_STATE() { return getToken(SQLServerStatementParser.MIGRATION_STATE, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode PAUSED() { return getToken(SQLServerStatementParser.PAUSED, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public MigrationState_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_migrationState_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitMigrationState_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MigrationState_Context migrationState_() throws RecognitionException {
		MigrationState_Context _localctx = new MigrationState_Context(_ctx, getState());
		enterRule(_localctx, 324, RULE_migrationState_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2004);
			match(LP_);
			setState(2005);
			match(MIGRATION_STATE);
			setState(2006);
			match(EQ_);
			setState(2007);
			match(PAUSED);
			setState(2008);
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

	public static class TableOperationOptionContext extends ParserRuleContext {
		public TerminalNode MEMORY_OPTIMIZED() { return getToken(SQLServerStatementParser.MEMORY_OPTIMIZED, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode DURABILITY() { return getToken(SQLServerStatementParser.DURABILITY, 0); }
		public TerminalNode SCHEMA_ONLY() { return getToken(SQLServerStatementParser.SCHEMA_ONLY, 0); }
		public TerminalNode SCHEMA_AND_DATA() { return getToken(SQLServerStatementParser.SCHEMA_AND_DATA, 0); }
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public OnHistoryTableClauseContext onHistoryTableClause() {
			return getRuleContext(OnHistoryTableClauseContext.class,0);
		}
		public TableOperationOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOperationOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableOperationOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableOperationOptionContext tableOperationOption() throws RecognitionException {
		TableOperationOptionContext _localctx = new TableOperationOptionContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_tableOperationOption);
		int _la;
		try {
			setState(2022);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MEMORY_OPTIMIZED:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2010);
				match(MEMORY_OPTIMIZED);
				setState(2011);
				match(EQ_);
				setState(2012);
				match(ON);
				}
				}
				break;
			case DURABILITY:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2013);
				match(DURABILITY);
				setState(2014);
				match(EQ_);
				setState(2015);
				_la = _input.LA(1);
				if ( !(_la==SCHEMA_AND_DATA || _la==SCHEMA_ONLY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case SYSTEM_VERSIONING:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(2016);
				match(SYSTEM_VERSIONING);
				setState(2017);
				match(EQ_);
				setState(2018);
				match(ON);
				setState(2020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2019);
					onHistoryTableClause();
					}
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

	public static class DistributionOptionContext extends ParserRuleContext {
		public TerminalNode DISTRIBUTION() { return getToken(SQLServerStatementParser.DISTRIBUTION, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode HASH() { return getToken(SQLServerStatementParser.HASH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode ROUND_ROBIN() { return getToken(SQLServerStatementParser.ROUND_ROBIN, 0); }
		public TerminalNode REPLICATE() { return getToken(SQLServerStatementParser.REPLICATE, 0); }
		public DistributionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distributionOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDistributionOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistributionOptionContext distributionOption() throws RecognitionException {
		DistributionOptionContext _localctx = new DistributionOptionContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_distributionOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2024);
			match(DISTRIBUTION);
			setState(2025);
			match(EQ_);
			setState(2033);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				{
				setState(2026);
				match(HASH);
				setState(2027);
				match(LP_);
				setState(2028);
				columnName();
				setState(2029);
				match(RP_);
				}
				break;
			case ROUND_ROBIN:
				{
				setState(2031);
				match(ROUND_ROBIN);
				}
				break;
			case REPLICATE:
				{
				setState(2032);
				match(REPLICATE);
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

	public static class DataWareHouseTableOptionContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public TerminalNode HEAP() { return getToken(SQLServerStatementParser.HEAP, 0); }
		public DataWareHousePartitionOptionContext dataWareHousePartitionOption() {
			return getRuleContext(DataWareHousePartitionOptionContext.class,0);
		}
		public DataWareHouseTableOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataWareHouseTableOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDataWareHouseTableOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataWareHouseTableOptionContext dataWareHouseTableOption() throws RecognitionException {
		DataWareHouseTableOptionContext _localctx = new DataWareHouseTableOptionContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_dataWareHouseTableOption);
		try {
			setState(2040);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLUSTERED:
				enterOuterAlt(_localctx, 1);
				{
				setState(2035);
				match(CLUSTERED);
				setState(2036);
				match(COLUMNSTORE);
				setState(2037);
				match(INDEX);
				}
				break;
			case HEAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(2038);
				match(HEAP);
				}
				break;
			case PARTITION:
				enterOuterAlt(_localctx, 3);
				{
				setState(2039);
				dataWareHousePartitionOption();
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

	public static class DataWareHousePartitionOptionContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SQLServerStatementParser.PARTITION, 0); }
		public List<TerminalNode> LP_() { return getTokens(SQLServerStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(SQLServerStatementParser.LP_, i);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(SQLServerStatementParser.RANGE, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode VALUES() { return getToken(SQLServerStatementParser.VALUES, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public List<TerminalNode> RP_() { return getTokens(SQLServerStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(SQLServerStatementParser.RP_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode LEFT() { return getToken(SQLServerStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SQLServerStatementParser.RIGHT, 0); }
		public DataWareHousePartitionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataWareHousePartitionOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDataWareHousePartitionOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataWareHousePartitionOptionContext dataWareHousePartitionOption() throws RecognitionException {
		DataWareHousePartitionOptionContext _localctx = new DataWareHousePartitionOptionContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_dataWareHousePartitionOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2042);
			match(PARTITION);
			setState(2043);
			match(LP_);
			setState(2044);
			columnName();
			setState(2045);
			match(RANGE);
			setState(2047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT || _la==RIGHT) {
				{
				setState(2046);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2049);
			match(FOR);
			setState(2050);
			match(VALUES);
			setState(2051);
			match(LP_);
			setState(2052);
			simpleExpr(0);
			setState(2057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2053);
				match(COMMA_);
				setState(2054);
				simpleExpr(0);
				}
				}
				setState(2059);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2060);
			match(RP_);
			setState(2061);
			match(RP_);
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
		public TerminalNode UNIQUE() { return getToken(SQLServerStatementParser.UNIQUE, 0); }
		public ClusterOption_Context clusterOption_() {
			return getRuleContext(ClusterOption_Context.class,0);
		}
		public CreateIndexSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexSpecification_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCreateIndexSpecification_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexSpecification_Context createIndexSpecification_() throws RecognitionException {
		CreateIndexSpecification_Context _localctx = new CreateIndexSpecification_Context(_ctx, getState());
		enterRule(_localctx, 334, RULE_createIndexSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(2063);
				match(UNIQUE);
				}
			}

			setState(2067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(2066);
				clusterOption_();
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
		public AlterDropContext alterDrop() {
			return getRuleContext(AlterDropContext.class,0);
		}
		public AlterCheckConstraintContext alterCheckConstraint() {
			return getRuleContext(AlterCheckConstraintContext.class,0);
		}
		public AlterTriggerContext alterTrigger() {
			return getRuleContext(AlterTriggerContext.class,0);
		}
		public AlterSwitchContext alterSwitch() {
			return getRuleContext(AlterSwitchContext.class,0);
		}
		public AlterSetContext alterSet() {
			return getRuleContext(AlterSetContext.class,0);
		}
		public AlterTableOptionContext alterTableOption() {
			return getRuleContext(AlterTableOptionContext.class,0);
		}
		public TerminalNode REBUILD() { return getToken(SQLServerStatementParser.REBUILD, 0); }
		public AlterDefinitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDefinitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterDefinitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDefinitionClauseContext alterDefinitionClause() throws RecognitionException {
		AlterDefinitionClauseContext _localctx = new AlterDefinitionClauseContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_alterDefinitionClause);
		try {
			setState(2078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2069);
				addColumnSpecification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2070);
				modifyColumnSpecification();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2071);
				alterDrop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2072);
				alterCheckConstraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2073);
				alterTrigger();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2074);
				alterSwitch();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2075);
				alterSet();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2076);
				alterTableOption();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2077);
				match(REBUILD);
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
		public TerminalNode ADD() { return getToken(SQLServerStatementParser.ADD, 0); }
		public AlterColumnAddOptionsContext alterColumnAddOptions() {
			return getRuleContext(AlterColumnAddOptionsContext.class,0);
		}
		public GeneratedColumnNamesClauseContext generatedColumnNamesClause() {
			return getRuleContext(GeneratedColumnNamesClauseContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode CHECK() { return getToken(SQLServerStatementParser.CHECK, 0); }
		public TerminalNode NOCHECK() { return getToken(SQLServerStatementParser.NOCHECK, 0); }
		public AddColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumnSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAddColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddColumnSpecificationContext addColumnSpecification() throws RecognitionException {
		AddColumnSpecificationContext _localctx = new AddColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_addColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2080);
				match(WITH);
				setState(2081);
				_la = _input.LA(1);
				if ( !(_la==CHECK || _la==NOCHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2084);
			match(ADD);
			setState(2087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(2085);
				alterColumnAddOptions();
				}
				break;
			case 2:
				{
				setState(2086);
				generatedColumnNamesClause();
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
		public AlterColumnOperationContext alterColumnOperation() {
			return getRuleContext(AlterColumnOperationContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(SQLServerStatementParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode SPARSE() { return getToken(SQLServerStatementParser.SPARSE, 0); }
		public ModifyColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumnSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitModifyColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyColumnSpecificationContext modifyColumnSpecification() throws RecognitionException {
		ModifyColumnSpecificationContext _localctx = new ModifyColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_modifyColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2089);
			alterColumnOperation();
			setState(2090);
			dataType();
			setState(2093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(2091);
				match(COLLATE);
				setState(2092);
				collationName();
				}
			}

			setState(2098);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				{
				setState(2095);
				match(NULL);
				}
				break;
			case NOT:
				{
				setState(2096);
				match(NOT);
				setState(2097);
				match(NULL);
				}
				break;
			case EOF:
			case COMMA_:
			case SEMI_:
			case SPARSE:
				break;
			default:
				break;
			}
			setState(2101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPARSE) {
				{
				setState(2100);
				match(SPARSE);
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

	public static class AlterColumnOperationContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode COLUMN() { return getToken(SQLServerStatementParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public AlterColumnOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnOperation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterColumnOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterColumnOperationContext alterColumnOperation() throws RecognitionException {
		AlterColumnOperationContext _localctx = new AlterColumnOperationContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_alterColumnOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2103);
			match(ALTER);
			setState(2104);
			match(COLUMN);
			setState(2105);
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

	public static class AlterColumnAddOptionsContext extends ParserRuleContext {
		public List<AlterColumnAddOptionContext> alterColumnAddOption() {
			return getRuleContexts(AlterColumnAddOptionContext.class);
		}
		public AlterColumnAddOptionContext alterColumnAddOption(int i) {
			return getRuleContext(AlterColumnAddOptionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public AlterColumnAddOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAddOptions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterColumnAddOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterColumnAddOptionsContext alterColumnAddOptions() throws RecognitionException {
		AlterColumnAddOptionsContext _localctx = new AlterColumnAddOptionsContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_alterColumnAddOptions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2107);
			alterColumnAddOption();
			setState(2112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2108);
					match(COMMA_);
					setState(2109);
					alterColumnAddOption();
					}
					} 
				}
				setState(2114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
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

	public static class AlterColumnAddOptionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public ComputedColumnDefinitionContext computedColumnDefinition() {
			return getRuleContext(ComputedColumnDefinitionContext.class,0);
		}
		public ColumnSetDefinitionContext columnSetDefinition() {
			return getRuleContext(ColumnSetDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public AlterTableTableIndexContext alterTableTableIndex() {
			return getRuleContext(AlterTableTableIndexContext.class,0);
		}
		public ConstraintForColumnContext constraintForColumn() {
			return getRuleContext(ConstraintForColumnContext.class,0);
		}
		public AlterColumnAddOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAddOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterColumnAddOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterColumnAddOptionContext alterColumnAddOption() throws RecognitionException {
		AlterColumnAddOptionContext _localctx = new AlterColumnAddOptionContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_alterColumnAddOption);
		try {
			setState(2121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2115);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2116);
				computedColumnDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2117);
				columnSetDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2118);
				tableConstraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2119);
				alterTableTableIndex();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2120);
				constraintForColumn();
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

	public static class ConstraintForColumnContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConstraintForColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintForColumn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitConstraintForColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintForColumnContext constraintForColumn() throws RecognitionException {
		ConstraintForColumnContext _localctx = new ConstraintForColumnContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_constraintForColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(2123);
				match(CONSTRAINT);
				setState(2124);
				ignoredIdentifier_();
				}
			}

			setState(2127);
			match(DEFAULT);
			setState(2128);
			simpleExpr(0);
			setState(2129);
			match(FOR);
			setState(2130);
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

	public static class ColumnNameWithSortsWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ColumnNameWithSortContext> columnNameWithSort() {
			return getRuleContexts(ColumnNameWithSortContext.class);
		}
		public ColumnNameWithSortContext columnNameWithSort(int i) {
			return getRuleContext(ColumnNameWithSortContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ColumnNameWithSortsWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameWithSortsWithParen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnNameWithSortsWithParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameWithSortsWithParenContext columnNameWithSortsWithParen() throws RecognitionException {
		ColumnNameWithSortsWithParenContext _localctx = new ColumnNameWithSortsWithParenContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_columnNameWithSortsWithParen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2132);
			match(LP_);
			setState(2133);
			columnNameWithSort();
			setState(2138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2134);
				match(COMMA_);
				setState(2135);
				columnNameWithSort();
				}
				}
				setState(2140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2141);
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

	public static class GeneratedColumnNamesClauseContext extends ParserRuleContext {
		public GeneratedColumnNameClauseContext generatedColumnNameClause() {
			return getRuleContext(GeneratedColumnNameClauseContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public PeriodClauseContext periodClause() {
			return getRuleContext(PeriodClauseContext.class,0);
		}
		public GeneratedColumnNamesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatedColumnNamesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitGeneratedColumnNamesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneratedColumnNamesClauseContext generatedColumnNamesClause() throws RecognitionException {
		GeneratedColumnNamesClauseContext _localctx = new GeneratedColumnNamesClauseContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_generatedColumnNamesClause);
		try {
			setState(2151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2143);
				generatedColumnNameClause();
				setState(2144);
				match(COMMA_);
				setState(2145);
				periodClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2147);
				periodClause();
				setState(2148);
				match(COMMA_);
				setState(2149);
				generatedColumnNameClause();
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

	public static class GeneratedColumnNameClauseContext extends ParserRuleContext {
		public List<GeneratedColumnNameContext> generatedColumnName() {
			return getRuleContexts(GeneratedColumnNameContext.class);
		}
		public GeneratedColumnNameContext generatedColumnName(int i) {
			return getRuleContext(GeneratedColumnNameContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode VALUES() { return getToken(SQLServerStatementParser.VALUES, 0); }
		public GeneratedColumnNameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatedColumnNameClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitGeneratedColumnNameClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneratedColumnNameClauseContext generatedColumnNameClause() throws RecognitionException {
		GeneratedColumnNameClauseContext _localctx = new GeneratedColumnNameClauseContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_generatedColumnNameClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2153);
			generatedColumnName();
			setState(2154);
			match(DEFAULT);
			setState(2155);
			simpleExpr(0);
			setState(2158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2156);
				match(WITH);
				setState(2157);
				match(VALUES);
				}
			}

			setState(2160);
			match(COMMA_);
			setState(2161);
			generatedColumnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratedColumnNameContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(SQLServerStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(SQLServerStatementParser.ALWAYS, 0); }
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode HIDDEN_() { return getToken(SQLServerStatementParser.HIDDEN_, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode START() { return getToken(SQLServerStatementParser.START, 0); }
		public TerminalNode END() { return getToken(SQLServerStatementParser.END, 0); }
		public GeneratedColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatedColumnName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitGeneratedColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneratedColumnNameContext generatedColumnName() throws RecognitionException {
		GeneratedColumnNameContext _localctx = new GeneratedColumnNameContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_generatedColumnName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2163);
			columnName();
			setState(2164);
			dataTypeName();
			setState(2165);
			match(GENERATED);
			setState(2166);
			match(ALWAYS);
			setState(2167);
			match(AS);
			setState(2168);
			match(ROW);
			setState(2170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START || _la==END) {
				{
				setState(2169);
				_la = _input.LA(1);
				if ( !(_la==START || _la==END) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HIDDEN_) {
				{
				setState(2172);
				match(HIDDEN_);
				}
			}

			setState(2177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2175);
				match(NOT);
				setState(2176);
				match(NULL);
				}
			}

			setState(2181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(2179);
				match(CONSTRAINT);
				setState(2180);
				ignoredIdentifier_();
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

	public static class AlterDropContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public AlterTableDropConstraintContext alterTableDropConstraint() {
			return getRuleContext(AlterTableDropConstraintContext.class,0);
		}
		public DropColumnSpecificationContext dropColumnSpecification() {
			return getRuleContext(DropColumnSpecificationContext.class,0);
		}
		public DropIndexSpecificationContext dropIndexSpecification() {
			return getRuleContext(DropIndexSpecificationContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(SQLServerStatementParser.PERIOD, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SQLServerStatementParser.SYSTEM_TIME, 0); }
		public AlterDropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDrop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterDrop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDropContext alterDrop() throws RecognitionException {
		AlterDropContext _localctx = new AlterDropContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_alterDrop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2183);
			match(DROP);
			setState(2190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
			case IF:
			case IDENTIFIER_:
				{
				setState(2184);
				alterTableDropConstraint();
				}
				break;
			case COLUMN:
				{
				setState(2185);
				dropColumnSpecification();
				}
				break;
			case INDEX:
				{
				setState(2186);
				dropIndexSpecification();
				}
				break;
			case PERIOD:
				{
				setState(2187);
				match(PERIOD);
				setState(2188);
				match(FOR);
				setState(2189);
				match(SYSTEM_TIME);
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

	public static class AlterTableDropConstraintContext extends ParserRuleContext {
		public List<DropConstraintNameContext> dropConstraintName() {
			return getRuleContexts(DropConstraintNameContext.class);
		}
		public DropConstraintNameContext dropConstraintName(int i) {
			return getRuleContext(DropConstraintNameContext.class,i);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IfExist_Context ifExist_() {
			return getRuleContext(IfExist_Context.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public AlterTableDropConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableDropConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterTableDropConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableDropConstraintContext alterTableDropConstraint() throws RecognitionException {
		AlterTableDropConstraintContext _localctx = new AlterTableDropConstraintContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_alterTableDropConstraint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(2192);
				match(CONSTRAINT);
				}
			}

			setState(2196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2195);
				ifExist_();
				}
			}

			setState(2198);
			dropConstraintName();
			setState(2203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2199);
					match(COMMA_);
					setState(2200);
					dropConstraintName();
					}
					} 
				}
				setState(2205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
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

	public static class DropConstraintNameContext extends ParserRuleContext {
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public DropConstraintWithClauseContext dropConstraintWithClause() {
			return getRuleContext(DropConstraintWithClauseContext.class,0);
		}
		public DropConstraintNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropConstraintName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropConstraintNameContext dropConstraintName() throws RecognitionException {
		DropConstraintNameContext _localctx = new DropConstraintNameContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_dropConstraintName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2206);
			ignoredIdentifier_();
			setState(2208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2207);
				dropConstraintWithClause();
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

	public static class DropConstraintWithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<DropConstraintOptionContext> dropConstraintOption() {
			return getRuleContexts(DropConstraintOptionContext.class);
		}
		public DropConstraintOptionContext dropConstraintOption(int i) {
			return getRuleContext(DropConstraintOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public DropConstraintWithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintWithClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropConstraintWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropConstraintWithClauseContext dropConstraintWithClause() throws RecognitionException {
		DropConstraintWithClauseContext _localctx = new DropConstraintWithClauseContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_dropConstraintWithClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2210);
			match(WITH);
			setState(2211);
			match(LP_);
			setState(2212);
			dropConstraintOption();
			setState(2217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2213);
				match(COMMA_);
				setState(2214);
				dropConstraintOption();
				}
				}
				setState(2219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2220);
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

	public static class DropConstraintOptionContext extends ParserRuleContext {
		public TerminalNode MAXDOP() { return getToken(SQLServerStatementParser.MAXDOP, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode ONLINE() { return getToken(SQLServerStatementParser.ONLINE, 0); }
		public OnOffOption_Context onOffOption_() {
			return getRuleContext(OnOffOption_Context.class,0);
		}
		public TerminalNode MOVE() { return getToken(SQLServerStatementParser.MOVE, 0); }
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public DropConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropConstraintOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropConstraintOptionContext dropConstraintOption() throws RecognitionException {
		DropConstraintOptionContext _localctx = new DropConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_dropConstraintOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAXDOP:
				{
				setState(2222);
				match(MAXDOP);
				setState(2223);
				match(EQ_);
				setState(2224);
				match(NUMBER_);
				}
				break;
			case ONLINE:
				{
				setState(2225);
				match(ONLINE);
				setState(2226);
				match(EQ_);
				setState(2227);
				onOffOption_();
				}
				break;
			case MOVE:
				{
				setState(2228);
				match(MOVE);
				setState(2229);
				match(TO);
				setState(2237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(2230);
					schemaName();
					setState(2231);
					match(LP_);
					setState(2232);
					columnName();
					setState(2233);
					match(RP_);
					}
					break;
				case 2:
					{
					setState(2235);
					ignoredIdentifier_();
					}
					break;
				case 3:
					{
					setState(2236);
					match(STRING_);
					}
					break;
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

	public static class OnOffOption_Context extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public OnOffOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onOffOption_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnOffOption_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnOffOption_Context onOffOption_() throws RecognitionException {
		OnOffOption_Context _localctx = new OnOffOption_Context(_ctx, getState());
		enterRule(_localctx, 368, RULE_onOffOption_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2241);
			_la = _input.LA(1);
			if ( !(_la==ON || _la==OFF) ) {
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

	public static class DropColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(SQLServerStatementParser.COLUMN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public IfExist_Context ifExist_() {
			return getRuleContext(IfExist_Context.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public DropColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropColumnSpecificationContext dropColumnSpecification() throws RecognitionException {
		DropColumnSpecificationContext _localctx = new DropColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_dropColumnSpecification);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2243);
			match(COLUMN);
			setState(2245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2244);
				ifExist_();
				}
			}

			setState(2247);
			columnName();
			setState(2252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2248);
					match(COMMA_);
					setState(2249);
					columnName();
					}
					} 
				}
				setState(2254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
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

	public static class DropIndexSpecificationContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public IfExist_Context ifExist_() {
			return getRuleContext(IfExist_Context.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public DropIndexSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndexSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropIndexSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropIndexSpecificationContext dropIndexSpecification() throws RecognitionException {
		DropIndexSpecificationContext _localctx = new DropIndexSpecificationContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_dropIndexSpecification);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2255);
			match(INDEX);
			setState(2257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2256);
				ifExist_();
				}
			}

			setState(2259);
			indexName();
			setState(2264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2260);
					match(COMMA_);
					setState(2261);
					indexName();
					}
					} 
				}
				setState(2266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
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

	public static class AlterCheckConstraintContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public TerminalNode CHECK() { return getToken(SQLServerStatementParser.CHECK, 0); }
		public TerminalNode NOCHECK() { return getToken(SQLServerStatementParser.NOCHECK, 0); }
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public AlterCheckConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterCheckConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterCheckConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterCheckConstraintContext alterCheckConstraint() throws RecognitionException {
		AlterCheckConstraintContext _localctx = new AlterCheckConstraintContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_alterCheckConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2267);
				match(WITH);
				}
			}

			setState(2270);
			_la = _input.LA(1);
			if ( !(_la==CHECK || _la==NOCHECK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2271);
			match(CONSTRAINT);
			setState(2274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(2272);
				match(ALL);
				}
				break;
			case IDENTIFIER_:
				{
				setState(2273);
				ignoredIdentifiers_();
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

	public static class AlterTriggerContext extends ParserRuleContext {
		public TerminalNode TRIGGER() { return getToken(SQLServerStatementParser.TRIGGER, 0); }
		public TerminalNode ENABLE() { return getToken(SQLServerStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(SQLServerStatementParser.DISABLE, 0); }
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public AlterTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTrigger; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterTrigger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTriggerContext alterTrigger() throws RecognitionException {
		AlterTriggerContext _localctx = new AlterTriggerContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_alterTrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2276);
			_la = _input.LA(1);
			if ( !(_la==ENABLE || _la==DISABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2277);
			match(TRIGGER);
			setState(2280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(2278);
				match(ALL);
				}
				break;
			case IDENTIFIER_:
				{
				setState(2279);
				ignoredIdentifiers_();
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

	public static class AlterSwitchContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(SQLServerStatementParser.SWITCH, 0); }
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<TerminalNode> PARTITION() { return getTokens(SQLServerStatementParser.PARTITION); }
		public TerminalNode PARTITION(int i) {
			return getToken(SQLServerStatementParser.PARTITION, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public LowPriorityLockWaitContext lowPriorityLockWait() {
			return getRuleContext(LowPriorityLockWaitContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public AlterSwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSwitch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterSwitchContext alterSwitch() throws RecognitionException {
		AlterSwitchContext _localctx = new AlterSwitchContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_alterSwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2282);
			match(SWITCH);
			setState(2285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(2283);
				match(PARTITION);
				setState(2284);
				expr(0);
				}
			}

			setState(2287);
			match(TO);
			setState(2288);
			tableName();
			setState(2291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(2289);
				match(PARTITION);
				setState(2290);
				expr(0);
				}
			}

			setState(2298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2293);
				match(WITH);
				setState(2294);
				match(LP_);
				setState(2295);
				lowPriorityLockWait();
				setState(2296);
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

	public static class AlterSetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public SetFileStreamClauseContext setFileStreamClause() {
			return getRuleContext(SetFileStreamClauseContext.class,0);
		}
		public SetSystemVersionClauseContext setSystemVersionClause() {
			return getRuleContext(SetSystemVersionClauseContext.class,0);
		}
		public AlterSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterSetContext alterSet() throws RecognitionException {
		AlterSetContext _localctx = new AlterSetContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_alterSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2300);
			match(SET);
			setState(2301);
			match(LP_);
			setState(2304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILESTREAM_ON:
				{
				setState(2302);
				setFileStreamClause();
				}
				break;
			case SYSTEM_VERSIONING:
				{
				setState(2303);
				setSystemVersionClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2306);
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

	public static class SetFileStreamClauseContext extends ParserRuleContext {
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public SetFileStreamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setFileStreamClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSetFileStreamClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetFileStreamClauseContext setFileStreamClause() throws RecognitionException {
		SetFileStreamClauseContext _localctx = new SetFileStreamClauseContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_setFileStreamClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2308);
			match(FILESTREAM_ON);
			setState(2309);
			match(EQ_);
			setState(2313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(2310);
				schemaName();
				}
				break;
			case 2:
				{
				setState(2311);
				ignoredIdentifier_();
				}
				break;
			case 3:
				{
				setState(2312);
				match(STRING_);
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

	public static class SetSystemVersionClauseContext extends ParserRuleContext {
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public AlterSetOnClauseContext alterSetOnClause() {
			return getRuleContext(AlterSetOnClauseContext.class,0);
		}
		public SetSystemVersionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setSystemVersionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSetSystemVersionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetSystemVersionClauseContext setSystemVersionClause() throws RecognitionException {
		SetSystemVersionClauseContext _localctx = new SetSystemVersionClauseContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_setSystemVersionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2315);
			match(SYSTEM_VERSIONING);
			setState(2316);
			match(EQ_);
			setState(2322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OFF:
				{
				setState(2317);
				match(OFF);
				}
				break;
			case ON:
				{
				setState(2318);
				match(ON);
				setState(2320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2319);
					alterSetOnClause();
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

	public static class AlterSetOnClauseContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode HISTORY_TABLE() { return getToken(SQLServerStatementParser.HISTORY_TABLE, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public DataConsistencyCheckClause_Context dataConsistencyCheckClause_() {
			return getRuleContext(DataConsistencyCheckClause_Context.class,0);
		}
		public HistoryRetentionPeriodClause_Context historyRetentionPeriodClause_() {
			return getRuleContext(HistoryRetentionPeriodClause_Context.class,0);
		}
		public AlterSetOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSetOnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterSetOnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterSetOnClauseContext alterSetOnClause() throws RecognitionException {
		AlterSetOnClauseContext _localctx = new AlterSetOnClauseContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_alterSetOnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2324);
			match(LP_);
			setState(2328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HISTORY_TABLE) {
				{
				setState(2325);
				match(HISTORY_TABLE);
				setState(2326);
				match(EQ_);
				setState(2327);
				tableName();
				}
			}

			setState(2331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(2330);
				dataConsistencyCheckClause_();
				}
				break;
			}
			setState(2334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_ || _la==HISTORY_RETENTION_PERIOD) {
				{
				setState(2333);
				historyRetentionPeriodClause_();
				}
			}

			setState(2336);
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

	public static class DataConsistencyCheckClause_Context extends ParserRuleContext {
		public TerminalNode DATA_CONSISTENCY_CHECK() { return getToken(SQLServerStatementParser.DATA_CONSISTENCY_CHECK, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public OnOffOption_Context onOffOption_() {
			return getRuleContext(OnOffOption_Context.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public DataConsistencyCheckClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataConsistencyCheckClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDataConsistencyCheckClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataConsistencyCheckClause_Context dataConsistencyCheckClause_() throws RecognitionException {
		DataConsistencyCheckClause_Context _localctx = new DataConsistencyCheckClause_Context(_ctx, getState());
		enterRule(_localctx, 388, RULE_dataConsistencyCheckClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(2338);
				match(COMMA_);
				}
			}

			setState(2341);
			match(DATA_CONSISTENCY_CHECK);
			setState(2342);
			match(EQ_);
			setState(2343);
			onOffOption_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HistoryRetentionPeriodClause_Context extends ParserRuleContext {
		public TerminalNode HISTORY_RETENTION_PERIOD() { return getToken(SQLServerStatementParser.HISTORY_RETENTION_PERIOD, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public HistoryRetentionPeriodContext historyRetentionPeriod() {
			return getRuleContext(HistoryRetentionPeriodContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public HistoryRetentionPeriodClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_historyRetentionPeriodClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitHistoryRetentionPeriodClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HistoryRetentionPeriodClause_Context historyRetentionPeriodClause_() throws RecognitionException {
		HistoryRetentionPeriodClause_Context _localctx = new HistoryRetentionPeriodClause_Context(_ctx, getState());
		enterRule(_localctx, 390, RULE_historyRetentionPeriodClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(2345);
				match(COMMA_);
				}
			}

			setState(2348);
			match(HISTORY_RETENTION_PERIOD);
			setState(2349);
			match(EQ_);
			setState(2350);
			historyRetentionPeriod();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HistoryRetentionPeriodContext extends ParserRuleContext {
		public TerminalNode INFINITE() { return getToken(SQLServerStatementParser.INFINITE, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode DAY() { return getToken(SQLServerStatementParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SQLServerStatementParser.DAYS, 0); }
		public TerminalNode WEEK() { return getToken(SQLServerStatementParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SQLServerStatementParser.WEEKS, 0); }
		public TerminalNode MONTH() { return getToken(SQLServerStatementParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SQLServerStatementParser.MONTHS, 0); }
		public TerminalNode YEAR() { return getToken(SQLServerStatementParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SQLServerStatementParser.YEARS, 0); }
		public HistoryRetentionPeriodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_historyRetentionPeriod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitHistoryRetentionPeriod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HistoryRetentionPeriodContext historyRetentionPeriod() throws RecognitionException {
		HistoryRetentionPeriodContext _localctx = new HistoryRetentionPeriodContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_historyRetentionPeriod);
		int _la;
		try {
			setState(2355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INFINITE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2352);
				match(INFINITE);
				}
				break;
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2353);
				match(NUMBER_);
				setState(2354);
				_la = _input.LA(1);
				if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (YEAR - 136)) | (1L << (MONTH - 136)) | (1L << (WEEK - 136)) | (1L << (DAY - 136)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (YEARS - 217)) | (1L << (MONTHS - 217)) | (1L << (WEEKS - 217)) | (1L << (DAYS - 217)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class AlterTableTableIndexContext extends ParserRuleContext {
		public IndexWithNameContext indexWithName() {
			return getRuleContext(IndexWithNameContext.class,0);
		}
		public IndexNonClusterClauseContext indexNonClusterClause() {
			return getRuleContext(IndexNonClusterClauseContext.class,0);
		}
		public IndexClusterClauseContext indexClusterClause() {
			return getRuleContext(IndexClusterClauseContext.class,0);
		}
		public AlterTableTableIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableTableIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterTableTableIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableTableIndexContext alterTableTableIndex() throws RecognitionException {
		AlterTableTableIndexContext _localctx = new AlterTableTableIndexContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_alterTableTableIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2357);
			indexWithName();
			setState(2360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONCLUSTERED:
				{
				setState(2358);
				indexNonClusterClause();
				}
				break;
			case CLUSTERED:
				{
				setState(2359);
				indexClusterClause();
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

	public static class IndexWithNameContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public IndexWithNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexWithName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIndexWithName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexWithNameContext indexWithName() throws RecognitionException {
		IndexWithNameContext _localctx = new IndexWithNameContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_indexWithName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2362);
			match(INDEX);
			setState(2363);
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

	public static class IndexNonClusterClauseContext extends ParserRuleContext {
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public HashWithBucketContext hashWithBucket() {
			return getRuleContext(HashWithBucketContext.class,0);
		}
		public ColumnNameWithSortsWithParenContext columnNameWithSortsWithParen() {
			return getRuleContext(ColumnNameWithSortsWithParenContext.class,0);
		}
		public AlterTableIndexOnClauseContext alterTableIndexOnClause() {
			return getRuleContext(AlterTableIndexOnClauseContext.class,0);
		}
		public IndexNonClusterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexNonClusterClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIndexNonClusterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexNonClusterClauseContext indexNonClusterClause() throws RecognitionException {
		IndexNonClusterClauseContext _localctx = new IndexNonClusterClauseContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_indexNonClusterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2365);
			match(NONCLUSTERED);
			setState(2371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				{
				setState(2366);
				hashWithBucket();
				}
				break;
			case LP_:
				{
				setState(2367);
				columnNameWithSortsWithParen();
				setState(2369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON || _la==DEFAULT) {
					{
					setState(2368);
					alterTableIndexOnClause();
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

	public static class AlterTableIndexOnClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public AlterTableIndexOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableIndexOnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterTableIndexOnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableIndexOnClauseContext alterTableIndexOnClause() throws RecognitionException {
		AlterTableIndexOnClauseContext _localctx = new AlterTableIndexOnClauseContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_alterTableIndexOnClause);
		try {
			setState(2376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2373);
				match(ON);
				setState(2374);
				ignoredIdentifier_();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2375);
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

	public static class IndexClusterClauseContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public IndexOnClauseContext indexOnClause() {
			return getRuleContext(IndexOnClauseContext.class,0);
		}
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public IndexClusterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexClusterClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIndexClusterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexClusterClauseContext indexClusterClause() throws RecognitionException {
		IndexClusterClauseContext _localctx = new IndexClusterClauseContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_indexClusterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2378);
			match(CLUSTERED);
			setState(2379);
			match(COLUMNSTORE);
			setState(2387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2380);
				match(WITH);
				setState(2381);
				match(COMPRESSION_DELAY);
				setState(2382);
				match(EQ_);
				setState(2383);
				match(NUMBER_);
				setState(2385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUTES) {
					{
					setState(2384);
					match(MINUTES);
					}
				}

				}
			}

			setState(2390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2389);
				indexOnClause();
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

	public static class AlterTableOptionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode LOCK_ESCALATION() { return getToken(SQLServerStatementParser.LOCK_ESCALATION, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode AUTO() { return getToken(SQLServerStatementParser.AUTO, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TerminalNode DISABLE() { return getToken(SQLServerStatementParser.DISABLE, 0); }
		public TerminalNode MEMORY_OPTIMIZED() { return getToken(SQLServerStatementParser.MEMORY_OPTIMIZED, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode DURABILITY() { return getToken(SQLServerStatementParser.DURABILITY, 0); }
		public TerminalNode SCHEMA_ONLY() { return getToken(SQLServerStatementParser.SCHEMA_ONLY, 0); }
		public TerminalNode SCHEMA_AND_DATA() { return getToken(SQLServerStatementParser.SCHEMA_AND_DATA, 0); }
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public OnHistoryTableClauseContext onHistoryTableClause() {
			return getRuleContext(OnHistoryTableClauseContext.class,0);
		}
		public AlterTableOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterTableOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableOptionContext alterTableOption() throws RecognitionException {
		AlterTableOptionContext _localctx = new AlterTableOptionContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_alterTableOption);
		int _la;
		try {
			setState(2410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(2392);
				match(SET);
				setState(2393);
				match(LP_);
				setState(2394);
				match(LOCK_ESCALATION);
				setState(2395);
				match(EQ_);
				setState(2396);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==DISABLE || _la==AUTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2397);
				match(RP_);
				}
				break;
			case MEMORY_OPTIMIZED:
				enterOuterAlt(_localctx, 2);
				{
				setState(2398);
				match(MEMORY_OPTIMIZED);
				setState(2399);
				match(EQ_);
				setState(2400);
				match(ON);
				}
				break;
			case DURABILITY:
				enterOuterAlt(_localctx, 3);
				{
				setState(2401);
				match(DURABILITY);
				setState(2402);
				match(EQ_);
				setState(2403);
				_la = _input.LA(1);
				if ( !(_la==SCHEMA_AND_DATA || _la==SCHEMA_ONLY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SYSTEM_VERSIONING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2404);
				match(SYSTEM_VERSIONING);
				setState(2405);
				match(EQ_);
				setState(2406);
				match(ON);
				setState(2408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2407);
					onHistoryTableClause();
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

	public static class OnHistoryTableClauseContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode HISTORY_TABLE() { return getToken(SQLServerStatementParser.HISTORY_TABLE, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode DATA_CONSISTENCY_CHECK() { return getToken(SQLServerStatementParser.DATA_CONSISTENCY_CHECK, 0); }
		public OnOffOption_Context onOffOption_() {
			return getRuleContext(OnOffOption_Context.class,0);
		}
		public OnHistoryTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onHistoryTableClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnHistoryTableClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnHistoryTableClauseContext onHistoryTableClause() throws RecognitionException {
		OnHistoryTableClauseContext _localctx = new OnHistoryTableClauseContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_onHistoryTableClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2412);
			match(LP_);
			setState(2413);
			match(HISTORY_TABLE);
			setState(2414);
			match(EQ_);
			setState(2415);
			tableName();
			setState(2420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(2416);
				match(COMMA_);
				setState(2417);
				match(DATA_CONSISTENCY_CHECK);
				setState(2418);
				match(EQ_);
				setState(2419);
				onOffOption_();
				}
			}

			setState(2422);
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

	public static class IfExist_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public IfExist_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExist_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIfExist_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExist_Context ifExist_() throws RecognitionException {
		IfExist_Context _localctx = new IfExist_Context(_ctx, getState());
		enterRule(_localctx, 408, RULE_ifExist_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2424);
			match(IF);
			setState(2425);
			match(EXISTS);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQLServerStatementParser.TRANSACTION, 0); }
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSetTransaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_setTransaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2427);
			match(SET);
			setState(2428);
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

	public static class SetImplicitTransactionsContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode IMPLICIT_TRANSACTIONS() { return getToken(SQLServerStatementParser.IMPLICIT_TRANSACTIONS, 0); }
		public ImplicitTransactionsValueContext implicitTransactionsValue() {
			return getRuleContext(ImplicitTransactionsValueContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public List<TerminalNode> AT_() { return getTokens(SQLServerStatementParser.AT_); }
		public TerminalNode AT_(int i) {
			return getToken(SQLServerStatementParser.AT_, i);
		}
		public TerminalNode TRANCOUNT() { return getToken(SQLServerStatementParser.TRANCOUNT, 0); }
		public TerminalNode GT_() { return getToken(SQLServerStatementParser.GT_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode COMMIT() { return getToken(SQLServerStatementParser.COMMIT, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public SetImplicitTransactionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setImplicitTransactions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSetImplicitTransactions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetImplicitTransactionsContext setImplicitTransactions() throws RecognitionException {
		SetImplicitTransactionsContext _localctx = new SetImplicitTransactionsContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_setImplicitTransactions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2430);
				match(IF);
				setState(2431);
				match(AT_);
				setState(2432);
				match(AT_);
				setState(2433);
				match(TRANCOUNT);
				setState(2434);
				match(GT_);
				setState(2435);
				match(NUMBER_);
				setState(2436);
				match(COMMIT);
				setState(2437);
				match(TRAN);
				}
			}

			setState(2440);
			match(SET);
			setState(2441);
			match(IMPLICIT_TRANSACTIONS);
			setState(2442);
			implicitTransactionsValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplicitTransactionsValueContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public ImplicitTransactionsValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitTransactionsValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitImplicitTransactionsValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicitTransactionsValueContext implicitTransactionsValue() throws RecognitionException {
		ImplicitTransactionsValueContext _localctx = new ImplicitTransactionsValueContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_implicitTransactionsValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2444);
			_la = _input.LA(1);
			if ( !(_la==ON || _la==OFF) ) {
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

	public static class BeginTransactionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(SQLServerStatementParser.BEGIN, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQLServerStatementParser.TRANSACTION, 0); }
		public BeginTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginTransaction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitBeginTransaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginTransactionContext beginTransaction() throws RecognitionException {
		BeginTransactionContext _localctx = new BeginTransactionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_beginTransaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2446);
			match(BEGIN);
			setState(2447);
			_la = _input.LA(1);
			if ( !(_la==TRANSACTION || _la==TRAN) ) {
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

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(SQLServerStatementParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2449);
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
		public TerminalNode ROLLBACK() { return getToken(SQLServerStatementParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2451);
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
		public TerminalNode SAVE() { return getToken(SQLServerStatementParser.SAVE, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQLServerStatementParser.TRANSACTION, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSavepoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_savepoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2453);
			match(SAVE);
			setState(2454);
			_la = _input.LA(1);
			if ( !(_la==TRANSACTION || _la==TRAN) ) {
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

	public static class GrantContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(SQLServerStatementParser.GRANT, 0); }
		public ClassPrivilegesClauseContext classPrivilegesClause() {
			return getRuleContext(ClassPrivilegesClauseContext.class,0);
		}
		public ClassTypePrivilegesClauseContext classTypePrivilegesClause() {
			return getRuleContext(ClassTypePrivilegesClauseContext.class,0);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitGrant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_grant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2456);
			match(GRANT);
			setState(2460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				{
				setState(2457);
				classPrivilegesClause();
				}
				break;
			case 2:
				{
				setState(2458);
				classTypePrivilegesClause();
				}
				break;
			case 3:
				{
				setState(2459);
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
		public TerminalNode REVOKE() { return getToken(SQLServerStatementParser.REVOKE, 0); }
		public ClassPrivilegesClauseContext classPrivilegesClause() {
			return getRuleContext(ClassPrivilegesClauseContext.class,0);
		}
		public ClassTypePrivilegesClauseContext classTypePrivilegesClause() {
			return getRuleContext(ClassTypePrivilegesClauseContext.class,0);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitRevoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_revoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2462);
			match(REVOKE);
			setState(2469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				setState(2464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANT) {
					{
					setState(2463);
					optionForClause_();
					}
				}

				setState(2466);
				classPrivilegesClause();
				}
				break;
			case 2:
				{
				setState(2467);
				classTypePrivilegesClause();
				}
				break;
			case 3:
				{
				setState(2468);
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

	public static class DenyContext extends ParserRuleContext {
		public TerminalNode DENY() { return getToken(SQLServerStatementParser.DENY, 0); }
		public ClassPrivilegesClauseContext classPrivilegesClause() {
			return getRuleContext(ClassPrivilegesClauseContext.class,0);
		}
		public ClassTypePrivilegesClauseContext classTypePrivilegesClause() {
			return getRuleContext(ClassTypePrivilegesClauseContext.class,0);
		}
		public DenyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deny; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDeny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DenyContext deny() throws RecognitionException {
		DenyContext _localctx = new DenyContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_deny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2471);
			match(DENY);
			setState(2474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(2472);
				classPrivilegesClause();
				}
				break;
			case 2:
				{
				setState(2473);
				classTypePrivilegesClause();
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

	public static class ClassPrivilegesClauseContext extends ParserRuleContext {
		public ClassPrivileges_Context classPrivileges_() {
			return getRuleContext(ClassPrivileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public OnClassClauseContext onClassClause() {
			return getRuleContext(OnClassClauseContext.class,0);
		}
		public ClassPrivilegesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classPrivilegesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitClassPrivilegesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassPrivilegesClauseContext classPrivilegesClause() throws RecognitionException {
		ClassPrivilegesClauseContext _localctx = new ClassPrivilegesClauseContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_classPrivilegesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2476);
			classPrivileges_();
			setState(2479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2477);
				match(ON);
				setState(2478);
				onClassClause();
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

	public static class ClassTypePrivilegesClauseContext extends ParserRuleContext {
		public ClassTypePrivileges_Context classTypePrivileges_() {
			return getRuleContext(ClassTypePrivileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public OnClassTypeClauseContext onClassTypeClause() {
			return getRuleContext(OnClassTypeClauseContext.class,0);
		}
		public ClassTypePrivilegesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTypePrivilegesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitClassTypePrivilegesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypePrivilegesClauseContext classTypePrivilegesClause() throws RecognitionException {
		ClassTypePrivilegesClauseContext _localctx = new ClassTypePrivilegesClauseContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_classTypePrivilegesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2481);
			classTypePrivileges_();
			setState(2484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2482);
				match(ON);
				setState(2483);
				onClassTypeClause();
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

	public static class OptionForClause_Context extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(SQLServerStatementParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(SQLServerStatementParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public OptionForClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionForClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOptionForClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionForClause_Context optionForClause_() throws RecognitionException {
		OptionForClause_Context _localctx = new OptionForClause_Context(_ctx, getState());
		enterRule(_localctx, 434, RULE_optionForClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2486);
			match(GRANT);
			setState(2487);
			match(OPTION);
			setState(2488);
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

	public static class ClassPrivileges_Context extends ParserRuleContext {
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
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ClassPrivileges_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classPrivileges_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitClassPrivileges_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassPrivileges_Context classPrivileges_() throws RecognitionException {
		ClassPrivileges_Context _localctx = new ClassPrivileges_Context(_ctx, getState());
		enterRule(_localctx, 436, RULE_classPrivileges_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2490);
			privilegeType_();
			setState(2492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2491);
				columnNames();
				}
			}

			setState(2501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2494);
				match(COMMA_);
				setState(2495);
				privilegeType_();
				setState(2497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2496);
					columnNames();
					}
				}

				}
				}
				setState(2503);
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

	public static class OnClassClauseContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public Class_Context class_() {
			return getRuleContext(Class_Context.class,0);
		}
		public OnClassClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onClassClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnClassClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnClassClauseContext onClassClause() throws RecognitionException {
		OnClassClauseContext _localctx = new OnClassClauseContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_onClassClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				{
				setState(2504);
				class_();
				}
				break;
			}
			setState(2507);
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

	public static class ClassTypePrivileges_Context extends ParserRuleContext {
		public List<PrivilegeType_Context> privilegeType_() {
			return getRuleContexts(PrivilegeType_Context.class);
		}
		public PrivilegeType_Context privilegeType_(int i) {
			return getRuleContext(PrivilegeType_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ClassTypePrivileges_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTypePrivileges_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitClassTypePrivileges_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypePrivileges_Context classTypePrivileges_() throws RecognitionException {
		ClassTypePrivileges_Context _localctx = new ClassTypePrivileges_Context(_ctx, getState());
		enterRule(_localctx, 440, RULE_classTypePrivileges_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2509);
			privilegeType_();
			setState(2514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2510);
				match(COMMA_);
				setState(2511);
				privilegeType_();
				}
				}
				setState(2516);
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

	public static class OnClassTypeClauseContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ClassType_Context classType_() {
			return getRuleContext(ClassType_Context.class,0);
		}
		public OnClassTypeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onClassTypeClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnClassTypeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnClassTypeClauseContext onClassTypeClause() throws RecognitionException {
		OnClassTypeClauseContext _localctx = new OnClassTypeClauseContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_onClassTypeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				setState(2517);
				classType_();
				}
				break;
			}
			setState(2520);
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

	public static class PrivilegeType_Context extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SQLServerStatementParser.PRIVILEGES, 0); }
		public BasicPermission_Context basicPermission_() {
			return getRuleContext(BasicPermission_Context.class,0);
		}
		public ObjectPermission_Context objectPermission_() {
			return getRuleContext(ObjectPermission_Context.class,0);
		}
		public ServerPermission_Context serverPermission_() {
			return getRuleContext(ServerPermission_Context.class,0);
		}
		public ServerPrincipalPermission_Context serverPrincipalPermission_() {
			return getRuleContext(ServerPrincipalPermission_Context.class,0);
		}
		public DatabasePermission_Context databasePermission_() {
			return getRuleContext(DatabasePermission_Context.class,0);
		}
		public DatabasePrincipalPermission_Context databasePrincipalPermission_() {
			return getRuleContext(DatabasePrincipalPermission_Context.class,0);
		}
		public SchemaPermission_Context schemaPermission_() {
			return getRuleContext(SchemaPermission_Context.class,0);
		}
		public ServiceBrokerPermission_Context serviceBrokerPermission_() {
			return getRuleContext(ServiceBrokerPermission_Context.class,0);
		}
		public EndpointPermission_Context endpointPermission_() {
			return getRuleContext(EndpointPermission_Context.class,0);
		}
		public CertificatePermission_Context certificatePermission_() {
			return getRuleContext(CertificatePermission_Context.class,0);
		}
		public SymmetricKeyPermission_Context symmetricKeyPermission_() {
			return getRuleContext(SymmetricKeyPermission_Context.class,0);
		}
		public AsymmetricKeyPermission_Context asymmetricKeyPermission_() {
			return getRuleContext(AsymmetricKeyPermission_Context.class,0);
		}
		public AssemblyPermission_Context assemblyPermission_() {
			return getRuleContext(AssemblyPermission_Context.class,0);
		}
		public AvailabilityGroupPermission_Context availabilityGroupPermission_() {
			return getRuleContext(AvailabilityGroupPermission_Context.class,0);
		}
		public FullTextPermission_Context fullTextPermission_() {
			return getRuleContext(FullTextPermission_Context.class,0);
		}
		public PrivilegeType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeType_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPrivilegeType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeType_Context privilegeType_() throws RecognitionException {
		PrivilegeType_Context _localctx = new PrivilegeType_Context(_ctx, getState());
		enterRule(_localctx, 444, RULE_privilegeType_);
		int _la;
		try {
			setState(2541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2522);
				match(ALL);
				setState(2524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(2523);
					match(PRIVILEGES);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2526);
				basicPermission_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2527);
				objectPermission_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2528);
				serverPermission_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2529);
				serverPrincipalPermission_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2530);
				databasePermission_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2531);
				databasePrincipalPermission_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2532);
				schemaPermission_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2533);
				serviceBrokerPermission_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2534);
				endpointPermission_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2535);
				certificatePermission_();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2536);
				symmetricKeyPermission_();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2537);
				asymmetricKeyPermission_();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2538);
				assemblyPermission_();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2539);
				availabilityGroupPermission_();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2540);
				fullTextPermission_();
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

	public static class BasicPermission_Context extends ParserRuleContext {
		public TerminalNode CONTROL() { return getToken(SQLServerStatementParser.CONTROL, 0); }
		public TerminalNode SERVER() { return getToken(SQLServerStatementParser.SERVER, 0); }
		public TerminalNode TAKE() { return getToken(SQLServerStatementParser.TAKE, 0); }
		public TerminalNode OWNERSHIP() { return getToken(SQLServerStatementParser.OWNERSHIP, 0); }
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SQLServerStatementParser.VIEW, 0); }
		public TerminalNode DEFINITION() { return getToken(SQLServerStatementParser.DEFINITION, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode REFERENCES() { return getToken(SQLServerStatementParser.REFERENCES, 0); }
		public TerminalNode SELECT() { return getToken(SQLServerStatementParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(SQLServerStatementParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(SQLServerStatementParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(SQLServerStatementParser.DELETE, 0); }
		public TerminalNode EXECUTE() { return getToken(SQLServerStatementParser.EXECUTE, 0); }
		public TerminalNode RECEIVE() { return getToken(SQLServerStatementParser.RECEIVE, 0); }
		public BasicPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicPermission_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitBasicPermission_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicPermission_Context basicPermission_() throws RecognitionException {
		BasicPermission_Context _localctx = new BasicPermission_Context(_ctx, getState());
		enterRule(_localctx, 446, RULE_basicPermission_);
		int _la;
		try {
			setState(2562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTROL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2543);
				match(CONTROL);
				setState(2545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SERVER) {
					{
					setState(2544);
					match(SERVER);
					}
				}

				}
				break;
			case TAKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2547);
				match(TAKE);
				setState(2548);
				match(OWNERSHIP);
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2549);
				match(ALTER);
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(2550);
				match(VIEW);
				setState(2552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ANY) {
					{
					setState(2551);
					match(ANY);
					}
				}

				setState(2554);
				match(DEFINITION);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(2555);
				match(REFERENCES);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 6);
				{
				setState(2556);
				match(SELECT);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 7);
				{
				setState(2557);
				match(INSERT);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2558);
				match(UPDATE);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2559);
				match(DELETE);
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 10);
				{
				setState(2560);
				match(EXECUTE);
				}
				break;
			case RECEIVE:
				enterOuterAlt(_localctx, 11);
				{
				setState(2561);
				match(RECEIVE);
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

	public static class ObjectPermission_Context extends ParserRuleContext {
		public TerminalNode VIEW() { return getToken(SQLServerStatementParser.VIEW, 0); }
		public TerminalNode CHANGE() { return getToken(SQLServerStatementParser.CHANGE, 0); }
		public TerminalNode TRACKING() { return getToken(SQLServerStatementParser.TRACKING, 0); }
		public ObjectPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPermission_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitObjectPermission_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPermission_Context objectPermission_() throws RecognitionException {
		ObjectPermission_Context _localctx = new ObjectPermission_Context(_ctx, getState());
		enterRule(_localctx, 448, RULE_objectPermission_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2564);
			match(VIEW);
			setState(2565);
			match(CHANGE);
			setState(2566);
			match(TRACKING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ServerPermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode RESOURCES() { return getToken(SQLServerStatementParser.RESOURCES, 0); }
		public TerminalNode SETTINGS() { return getToken(SQLServerStatementParser.SETTINGS, 0); }
		public TerminalNode TRACE() { return getToken(SQLServerStatementParser.TRACE, 0); }
		public TerminalNode SERVER() { return getToken(SQLServerStatementParser.SERVER, 0); }
		public TerminalNode STATE() { return getToken(SQLServerStatementParser.STATE, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode AVAILABILITY() { return getToken(SQLServerStatementParser.AVAILABILITY, 0); }
		public TerminalNode GROUP() { return getToken(SQLServerStatementParser.GROUP, 0); }
		public TerminalNode CONNECTION() { return getToken(SQLServerStatementParser.CONNECTION, 0); }
		public TerminalNode CREDENTIAL() { return getToken(SQLServerStatementParser.CREDENTIAL, 0); }
		public TerminalNode DATABASE() { return getToken(SQLServerStatementParser.DATABASE, 0); }
		public TerminalNode ENDPOINT() { return getToken(SQLServerStatementParser.ENDPOINT, 0); }
		public TerminalNode EVENT() { return getToken(SQLServerStatementParser.EVENT, 0); }
		public TerminalNode NOTIFICATION() { return getToken(SQLServerStatementParser.NOTIFICATION, 0); }
		public TerminalNode SESSION() { return getToken(SQLServerStatementParser.SESSION, 0); }
		public TerminalNode LINKED() { return getToken(SQLServerStatementParser.LINKED, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public TerminalNode AUDIT() { return getToken(SQLServerStatementParser.AUDIT, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode DDL() { return getToken(SQLServerStatementParser.DDL, 0); }
		public TerminalNode VIEW() { return getToken(SQLServerStatementParser.VIEW, 0); }
		public TerminalNode DEFINITION() { return getToken(SQLServerStatementParser.DEFINITION, 0); }
		public TerminalNode CONNECT() { return getToken(SQLServerStatementParser.CONNECT, 0); }
		public TerminalNode SQL() { return getToken(SQLServerStatementParser.SQL, 0); }
		public TerminalNode IMPERSONATE() { return getToken(SQLServerStatementParser.IMPERSONATE, 0); }
		public TerminalNode SELECT() { return getToken(SQLServerStatementParser.SELECT, 0); }
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public TerminalNode SECURABLES() { return getToken(SQLServerStatementParser.SECURABLES, 0); }
		public TerminalNode AUTHENTICATE() { return getToken(SQLServerStatementParser.AUTHENTICATE, 0); }
		public TerminalNode EXTERNAL() { return getToken(SQLServerStatementParser.EXTERNAL, 0); }
		public TerminalNode ACCESS() { return getToken(SQLServerStatementParser.ACCESS, 0); }
		public TerminalNode ASSEMBLY() { return getToken(SQLServerStatementParser.ASSEMBLY, 0); }
		public TerminalNode ADMINISTER() { return getToken(SQLServerStatementParser.ADMINISTER, 0); }
		public TerminalNode BULK() { return getToken(SQLServerStatementParser.BULK, 0); }
		public TerminalNode OPERATIONS() { return getToken(SQLServerStatementParser.OPERATIONS, 0); }
		public TerminalNode UNSAFE() { return getToken(SQLServerStatementParser.UNSAFE, 0); }
		public TerminalNode SHUTDOWN() { return getToken(SQLServerStatementParser.SHUTDOWN, 0); }
		public ServerPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverPermission_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitServerPermission_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServerPermission_Context serverPermission_() throws RecognitionException {
		ServerPermission_Context _localctx = new ServerPermission_Context(_ctx, getState());
		enterRule(_localctx, 450, RULE_serverPermission_);
		int _la;
		try {
			setState(2643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2568);
				match(ALTER);
				setState(2574);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RESOURCES:
					{
					setState(2569);
					match(RESOURCES);
					}
					break;
				case SETTINGS:
					{
					setState(2570);
					match(SETTINGS);
					}
					break;
				case TRACE:
					{
					setState(2571);
					match(TRACE);
					}
					break;
				case SERVER:
					{
					setState(2572);
					match(SERVER);
					setState(2573);
					match(STATE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2576);
				match(ALTER);
				setState(2577);
				match(ANY);
				setState(2595);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2578);
					match(AVAILABILITY);
					setState(2579);
					match(GROUP);
					}
					break;
				case 2:
					{
					setState(2580);
					match(CONNECTION);
					}
					break;
				case 3:
					{
					setState(2581);
					match(CREDENTIAL);
					}
					break;
				case 4:
					{
					setState(2582);
					match(DATABASE);
					}
					break;
				case 5:
					{
					setState(2583);
					match(ENDPOINT);
					}
					break;
				case 6:
					{
					setState(2584);
					match(EVENT);
					setState(2585);
					match(NOTIFICATION);
					}
					break;
				case 7:
					{
					setState(2586);
					match(EVENT);
					setState(2587);
					match(SESSION);
					}
					break;
				case 8:
					{
					setState(2588);
					match(LINKED);
					setState(2589);
					match(SERVER);
					}
					break;
				case 9:
					{
					setState(2590);
					match(LOGIN);
					}
					break;
				case 10:
					{
					setState(2591);
					match(SERVER);
					setState(2592);
					match(AUDIT);
					}
					break;
				case 11:
					{
					setState(2593);
					match(SERVER);
					setState(2594);
					match(ROLE);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2597);
				match(CREATE);
				setState(2609);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AVAILABILITY:
					{
					setState(2598);
					match(AVAILABILITY);
					setState(2599);
					match(GROUP);
					}
					break;
				case DDL:
					{
					setState(2600);
					match(DDL);
					setState(2601);
					match(EVENT);
					setState(2602);
					match(NOTIFICATION);
					}
					break;
				case ENDPOINT:
					{
					setState(2603);
					match(ENDPOINT);
					}
					break;
				case SERVER:
					{
					setState(2604);
					match(SERVER);
					setState(2605);
					match(ROLE);
					}
					break;
				case TRACE:
					{
					setState(2606);
					match(TRACE);
					setState(2607);
					match(EVENT);
					setState(2608);
					match(NOTIFICATION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2611);
				match(CREATE);
				setState(2612);
				match(ANY);
				setState(2613);
				match(DATABASE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2614);
				match(VIEW);
				setState(2615);
				match(SERVER);
				setState(2616);
				match(STATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2617);
				match(VIEW);
				setState(2618);
				match(ANY);
				setState(2619);
				_la = _input.LA(1);
				if ( !(_la==DATABASE || _la==DEFINITION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2620);
				match(CONNECT);
				setState(2621);
				match(ANY);
				setState(2622);
				match(DATABASE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2623);
				match(CONNECT);
				setState(2624);
				match(SQL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2625);
				match(IMPERSONATE);
				setState(2626);
				match(ANY);
				setState(2627);
				match(LOGIN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2628);
				match(SELECT);
				setState(2629);
				match(ALL);
				setState(2630);
				match(USER);
				setState(2631);
				match(SECURABLES);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2632);
				match(AUTHENTICATE);
				setState(2633);
				match(SERVER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2634);
				match(EXTERNAL);
				setState(2635);
				match(ACCESS);
				setState(2636);
				match(ASSEMBLY);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2637);
				match(ADMINISTER);
				setState(2638);
				match(BULK);
				setState(2639);
				match(OPERATIONS);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2640);
				match(UNSAFE);
				setState(2641);
				match(ASSEMBLY);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2642);
				match(SHUTDOWN);
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

	public static class ServerPrincipalPermission_Context extends ParserRuleContext {
		public TerminalNode IMPERSONATE() { return getToken(SQLServerStatementParser.IMPERSONATE, 0); }
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public TerminalNode SERVER() { return getToken(SQLServerStatementParser.SERVER, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public ServerPrincipalPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverPrincipalPermission_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitServerPrincipalPermission_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServerPrincipalPermission_Context serverPrincipalPermission_() throws RecognitionException {
		ServerPrincipalPermission_Context _localctx = new ServerPrincipalPermission_Context(_ctx, getState());
		enterRule(_localctx, 452, RULE_serverPrincipalPermission_);
		try {
			setState(2653);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPERSONATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2645);
				match(IMPERSONATE);
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2646);
				match(ALTER);
				setState(2647);
				match(ANY);
				setState(2651);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LOGIN:
					{
					setState(2648);
					match(LOGIN);
					}
					break;
				case SERVER:
					{
					setState(2649);
					match(SERVER);
					setState(2650);
					match(ROLE);
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

	public static class DatabasePermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode TRACE() { return getToken(SQLServerStatementParser.TRACE, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode DATABASE() { return getToken(SQLServerStatementParser.DATABASE, 0); }
		public TerminalNode DATASPACE() { return getToken(SQLServerStatementParser.DATASPACE, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLServerStatementParser.SCHEMA, 0); }
		public TerminalNode SERVICE() { return getToken(SQLServerStatementParser.SERVICE, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public TerminalNode CERTIFICATE() { return getToken(SQLServerStatementParser.CERTIFICATE, 0); }
		public TerminalNode CONTRACT() { return getToken(SQLServerStatementParser.CONTRACT, 0); }
		public TerminalNode ASSEMBLY() { return getToken(SQLServerStatementParser.ASSEMBLY, 0); }
		public TerminalNode CONNECTION() { return getToken(SQLServerStatementParser.CONNECTION, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public TerminalNode COLUMN() { return getToken(SQLServerStatementParser.COLUMN, 0); }
		public TerminalNode MASTER() { return getToken(SQLServerStatementParser.MASTER, 0); }
		public TerminalNode DEFINITION() { return getToken(SQLServerStatementParser.DEFINITION, 0); }
		public TerminalNode EXTERNAL() { return getToken(SQLServerStatementParser.EXTERNAL, 0); }
		public TerminalNode FULLTEXT() { return getToken(SQLServerStatementParser.FULLTEXT, 0); }
		public TerminalNode CATALOG() { return getToken(SQLServerStatementParser.CATALOG, 0); }
		public TerminalNode MASK() { return getToken(SQLServerStatementParser.MASK, 0); }
		public TerminalNode MESSAGE() { return getToken(SQLServerStatementParser.MESSAGE, 0); }
		public TerminalNode TYPE() { return getToken(SQLServerStatementParser.TYPE, 0); }
		public TerminalNode REMOTE() { return getToken(SQLServerStatementParser.REMOTE, 0); }
		public TerminalNode BINDING() { return getToken(SQLServerStatementParser.BINDING, 0); }
		public TerminalNode ROUTE() { return getToken(SQLServerStatementParser.ROUTE, 0); }
		public TerminalNode EVENT() { return getToken(SQLServerStatementParser.EVENT, 0); }
		public TerminalNode SESSION() { return getToken(SQLServerStatementParser.SESSION, 0); }
		public TerminalNode SECURITY() { return getToken(SQLServerStatementParser.SECURITY, 0); }
		public TerminalNode POLICY() { return getToken(SQLServerStatementParser.POLICY, 0); }
		public TerminalNode SYMMETRIC() { return getToken(SQLServerStatementParser.SYMMETRIC, 0); }
		public TerminalNode ASYMMETRIC() { return getToken(SQLServerStatementParser.ASYMMETRIC, 0); }
		public TerminalNode ENCRYPTION() { return getToken(SQLServerStatementParser.ENCRYPTION, 0); }
		public TerminalNode DATA() { return getToken(SQLServerStatementParser.DATA, 0); }
		public TerminalNode SOURCE() { return getToken(SQLServerStatementParser.SOURCE, 0); }
		public TerminalNode FILE() { return getToken(SQLServerStatementParser.FILE, 0); }
		public TerminalNode FORMAT() { return getToken(SQLServerStatementParser.FORMAT, 0); }
		public TerminalNode LIBRARY() { return getToken(SQLServerStatementParser.LIBRARY, 0); }
		public TerminalNode AUDIT() { return getToken(SQLServerStatementParser.AUDIT, 0); }
		public TerminalNode DDL() { return getToken(SQLServerStatementParser.DDL, 0); }
		public TerminalNode TRIGGER() { return getToken(SQLServerStatementParser.TRIGGER, 0); }
		public TerminalNode NOTIFICATION() { return getToken(SQLServerStatementParser.NOTIFICATION, 0); }
		public TerminalNode SCOPED() { return getToken(SQLServerStatementParser.SCOPED, 0); }
		public TerminalNode CONFIGURATION() { return getToken(SQLServerStatementParser.CONFIGURATION, 0); }
		public TerminalNode APPLICATION() { return getToken(SQLServerStatementParser.APPLICATION, 0); }
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SQLServerStatementParser.VIEW, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public TerminalNode AGGREGATE() { return getToken(SQLServerStatementParser.AGGREGATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SQLServerStatementParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(SQLServerStatementParser.PROCEDURE, 0); }
		public TerminalNode QUEUE() { return getToken(SQLServerStatementParser.QUEUE, 0); }
		public TerminalNode RULE() { return getToken(SQLServerStatementParser.RULE, 0); }
		public TerminalNode SYNONYM() { return getToken(SQLServerStatementParser.SYNONYM, 0); }
		public TerminalNode XML() { return getToken(SQLServerStatementParser.XML, 0); }
		public TerminalNode COLLECTION() { return getToken(SQLServerStatementParser.COLLECTION, 0); }
		public TerminalNode STATE() { return getToken(SQLServerStatementParser.STATE, 0); }
		public TerminalNode SERVER() { return getToken(SQLServerStatementParser.SERVER, 0); }
		public TerminalNode EXECUTE() { return getToken(SQLServerStatementParser.EXECUTE, 0); }
		public TerminalNode SCRIPT() { return getToken(SQLServerStatementParser.SCRIPT, 0); }
		public TerminalNode CONNECT() { return getToken(SQLServerStatementParser.CONNECT, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public TerminalNode KILL() { return getToken(SQLServerStatementParser.KILL, 0); }
		public TerminalNode BACKUP() { return getToken(SQLServerStatementParser.BACKUP, 0); }
		public TerminalNode LOG() { return getToken(SQLServerStatementParser.LOG, 0); }
		public TerminalNode AUTHENTICATE() { return getToken(SQLServerStatementParser.AUTHENTICATE, 0); }
		public TerminalNode SHOWPLAN() { return getToken(SQLServerStatementParser.SHOWPLAN, 0); }
		public TerminalNode SUBSCRIBE() { return getToken(SQLServerStatementParser.SUBSCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SQLServerStatementParser.QUERY, 0); }
		public TerminalNode NOTIFICATIONS() { return getToken(SQLServerStatementParser.NOTIFICATIONS, 0); }
		public TerminalNode UNMASK() { return getToken(SQLServerStatementParser.UNMASK, 0); }
		public TerminalNode CHECKPOINT() { return getToken(SQLServerStatementParser.CHECKPOINT, 0); }
		public TerminalNode ADMINISTER() { return getToken(SQLServerStatementParser.ADMINISTER, 0); }
		public TerminalNode BULK() { return getToken(SQLServerStatementParser.BULK, 0); }
		public TerminalNode OPERATIONS() { return getToken(SQLServerStatementParser.OPERATIONS, 0); }
		public DatabasePermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databasePermission_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDatabasePermission_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabasePermission_Context databasePermission_() throws RecognitionException {
		DatabasePermission_Context _localctx = new DatabasePermission_Context(_ctx, getState());
		enterRule(_localctx, 454, RULE_databasePermission_);
		int _la;
		try {
			setState(2808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2655);
				match(ALTER);
				setState(2656);
				match(TRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2657);
				match(ALTER);
				setState(2658);
				match(ANY);
				setState(2718);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(2659);
					match(DATABASE);
					setState(2669);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
					case 1:
						{
						setState(2660);
						match(AUDIT);
						}
						break;
					case 2:
						{
						setState(2661);
						match(DDL);
						setState(2662);
						match(TRIGGER);
						}
						break;
					case 3:
						{
						setState(2663);
						match(EVENT);
						setState(2664);
						match(NOTIFICATION);
						}
						break;
					case 4:
						{
						setState(2665);
						match(EVENT);
						setState(2666);
						match(SESSION);
						}
						break;
					case 5:
						{
						setState(2667);
						match(SCOPED);
						setState(2668);
						match(CONFIGURATION);
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(2671);
					match(DATASPACE);
					}
					break;
				case 3:
					{
					setState(2672);
					match(SCHEMA);
					}
					break;
				case 4:
					{
					setState(2673);
					match(SERVICE);
					setState(2675);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AUDIT) {
						{
						setState(2674);
						match(AUDIT);
						}
					}

					}
					break;
				case 5:
					{
					setState(2677);
					match(USER);
					}
					break;
				case 6:
					{
					setState(2679);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==APPLICATION) {
						{
						setState(2678);
						match(APPLICATION);
						}
					}

					setState(2681);
					match(ROLE);
					}
					break;
				case 7:
					{
					setState(2682);
					match(CERTIFICATE);
					}
					break;
				case 8:
					{
					setState(2683);
					match(CONTRACT);
					}
					break;
				case 9:
					{
					setState(2684);
					match(ASSEMBLY);
					}
					break;
				case 10:
					{
					setState(2685);
					match(CONNECTION);
					}
					break;
				case 11:
					{
					setState(2690);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SYMMETRIC:
						{
						setState(2686);
						match(SYMMETRIC);
						}
						break;
					case ASYMMETRIC:
						{
						setState(2687);
						match(ASYMMETRIC);
						}
						break;
					case COLUMN:
						{
						setState(2688);
						match(COLUMN);
						setState(2689);
						match(ENCRYPTION);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2692);
					match(KEY);
					}
					break;
				case 12:
					{
					setState(2693);
					match(COLUMN);
					setState(2694);
					match(MASTER);
					setState(2695);
					match(KEY);
					setState(2696);
					match(DEFINITION);
					}
					break;
				case 13:
					{
					setState(2697);
					match(EXTERNAL);
					setState(2703);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DATA:
						{
						setState(2698);
						match(DATA);
						setState(2699);
						match(SOURCE);
						}
						break;
					case FILE:
						{
						setState(2700);
						match(FILE);
						setState(2701);
						match(FORMAT);
						}
						break;
					case LIBRARY:
						{
						setState(2702);
						match(LIBRARY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case 14:
					{
					setState(2705);
					match(FULLTEXT);
					setState(2706);
					match(CATALOG);
					}
					break;
				case 15:
					{
					setState(2707);
					match(MASK);
					}
					break;
				case 16:
					{
					setState(2708);
					match(MESSAGE);
					setState(2709);
					match(TYPE);
					}
					break;
				case 17:
					{
					setState(2710);
					match(REMOTE);
					setState(2711);
					match(SERVICE);
					setState(2712);
					match(BINDING);
					}
					break;
				case 18:
					{
					setState(2713);
					match(ROUTE);
					}
					break;
				case 19:
					{
					setState(2714);
					match(EVENT);
					setState(2715);
					match(SESSION);
					}
					break;
				case 20:
					{
					setState(2716);
					match(SECURITY);
					setState(2717);
					match(POLICY);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2720);
				match(CREATE);
				setState(2755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
				case 1:
					{
					setState(2721);
					match(DATABASE);
					}
					break;
				case 2:
					{
					setState(2722);
					match(DATABASE);
					setState(2723);
					match(DDL);
					setState(2724);
					match(EVENT);
					setState(2725);
					match(NOTIFICATION);
					}
					break;
				case 3:
					{
					setState(2726);
					match(SCHEMA);
					}
					break;
				case 4:
					{
					setState(2727);
					match(TABLE);
					}
					break;
				case 5:
					{
					setState(2728);
					match(VIEW);
					}
					break;
				case 6:
					{
					setState(2729);
					match(SERVICE);
					}
					break;
				case 7:
					{
					setState(2730);
					match(TYPE);
					}
					break;
				case 8:
					{
					setState(2731);
					match(DEFAULT);
					}
					break;
				case 9:
					{
					setState(2732);
					match(AGGREGATE);
					}
					break;
				case 10:
					{
					setState(2733);
					match(ASSEMBLY);
					}
					break;
				case 11:
					{
					setState(2734);
					_la = _input.LA(1);
					if ( !(_la==SYMMETRIC || _la==ASYMMETRIC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2735);
					match(KEY);
					}
					break;
				case 12:
					{
					setState(2736);
					match(CERTIFICATE);
					}
					break;
				case 13:
					{
					setState(2737);
					match(CONTRACT);
					}
					break;
				case 14:
					{
					setState(2738);
					match(FULLTEXT);
					setState(2739);
					match(CATALOG);
					}
					break;
				case 15:
					{
					setState(2740);
					match(FUNCTION);
					}
					break;
				case 16:
					{
					setState(2741);
					match(MESSAGE);
					setState(2742);
					match(TYPE);
					}
					break;
				case 17:
					{
					setState(2743);
					match(PROCEDURE);
					}
					break;
				case 18:
					{
					setState(2744);
					match(QUEUE);
					}
					break;
				case 19:
					{
					setState(2745);
					match(REMOTE);
					setState(2746);
					match(SERVICE);
					setState(2747);
					match(BINDING);
					}
					break;
				case 20:
					{
					setState(2748);
					match(ROLE);
					}
					break;
				case 21:
					{
					setState(2749);
					match(ROUTE);
					}
					break;
				case 22:
					{
					setState(2750);
					match(RULE);
					}
					break;
				case 23:
					{
					setState(2751);
					match(SYNONYM);
					}
					break;
				case 24:
					{
					setState(2752);
					match(XML);
					setState(2753);
					match(SCHEMA);
					setState(2754);
					match(COLLECTION);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2757);
				match(CREATE);
				setState(2758);
				match(ANY);
				setState(2762);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATABASE:
					{
					setState(2759);
					match(DATABASE);
					}
					break;
				case EXTERNAL:
					{
					setState(2760);
					match(EXTERNAL);
					setState(2761);
					match(LIBRARY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2764);
				match(VIEW);
				setState(2770);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATABASE:
				case SERVER:
					{
					setState(2765);
					_la = _input.LA(1);
					if ( !(_la==DATABASE || _la==SERVER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2766);
					match(STATE);
					}
					break;
				case DDL:
					{
					setState(2767);
					match(DDL);
					setState(2768);
					match(EVENT);
					setState(2769);
					match(NOTIFICATION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2772);
				match(VIEW);
				setState(2773);
				match(ANY);
				setState(2779);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLUMN:
					{
					setState(2774);
					match(COLUMN);
					setState(2775);
					_la = _input.LA(1);
					if ( !(_la==ENCRYPTION || _la==MASTER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2776);
					match(KEY);
					setState(2777);
					match(DEFINITION);
					}
					break;
				case DEFINITION:
					{
					setState(2778);
					match(DEFINITION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2781);
				match(EXECUTE);
				setState(2782);
				match(ANY);
				setState(2783);
				match(EXTERNAL);
				setState(2784);
				match(SCRIPT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2785);
				match(CONNECT);
				setState(2787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REPLICATION) {
					{
					setState(2786);
					match(REPLICATION);
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2789);
				match(KILL);
				setState(2790);
				match(DATABASE);
				setState(2791);
				match(CONNECTION);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2792);
				match(BACKUP);
				setState(2793);
				_la = _input.LA(1);
				if ( !(_la==DATABASE || _la==LOG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2794);
				match(AUTHENTICATE);
				setState(2796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SERVER) {
					{
					setState(2795);
					match(SERVER);
					}
				}

				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2798);
				match(SHOWPLAN);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2799);
				match(SUBSCRIBE);
				setState(2800);
				match(QUERY);
				setState(2801);
				match(NOTIFICATIONS);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2802);
				match(UNMASK);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2803);
				match(CHECKPOINT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2804);
				match(ADMINISTER);
				setState(2805);
				match(DATABASE);
				setState(2806);
				match(BULK);
				setState(2807);
				match(OPERATIONS);
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

	public static class DatabasePrincipalPermission_Context extends ParserRuleContext {
		public TerminalNode IMPERSONATE() { return getToken(SQLServerStatementParser.IMPERSONATE, 0); }
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public TerminalNode APPLICATION() { return getToken(SQLServerStatementParser.APPLICATION, 0); }
		public DatabasePrincipalPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databasePrincipalPermission_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDatabasePrincipalPermission_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabasePrincipalPermission_Context databasePrincipalPermission_() throws RecognitionException {
		DatabasePrincipalPermission_Context _localctx = new DatabasePrincipalPermission_Context(_ctx, getState());
		enterRule(_localctx, 456, RULE_databasePrincipalPermission_);
		int _la;
		try {
			setState(2820);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPERSONATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2810);
				match(IMPERSONATE);
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2811);
				match(ALTER);
				setState(2812);
				match(ANY);
				setState(2818);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case USER:
					{
					setState(2813);
					match(USER);
					}
					break;
				case ROLE:
				case APPLICATION:
					{
					setState(2815);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==APPLICATION) {
						{
						setState(2814);
						match(APPLICATION);
						}
					}

					setState(2817);
					match(ROLE);
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

	public static class SchemaPermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLServerStatementParser.SCHEMA, 0); }
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode SEQUENCE() { return getToken(SQLServerStatementParser.SEQUENCE, 0); }
		public TerminalNode VIEW() { return getToken(SQLServerStatementParser.VIEW, 0); }
		public TerminalNode CHANGE() { return getToken(SQLServerStatementParser.CHANGE, 0); }
		public TerminalNode TRACKING() { return getToken(SQLServerStatementParser.TRACKING, 0); }
		public SchemaPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaPermission_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSchemaPermission_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaPermission_Context schemaPermission_() throws RecognitionException {
		SchemaPermission_Context _localctx = new SchemaPermission_Context(_ctx, getState());
		enterRule(_localctx, 458, RULE_schemaPermission_);
		try {
			setState(2830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2822);
				match(ALTER);
				setState(2823);
				match(ANY);
				setState(2824);
				match(SCHEMA);
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2825);
				match(CREATE);
				setState(2826);
				match(SEQUENCE);
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 3);
				{
				setState(2827);
				match(VIEW);
				setState(2828);
				match(CHANGE);
				setState(2829);
				match(TRACKING);
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

	public static class ServiceBrokerPermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode CONTRACT() { return getToken(SQLServerStatementParser.CONTRACT, 0); }
		public TerminalNode MESSAGE() { return getToken(SQLServerStatementParser.MESSAGE, 0); }
		public TerminalNode TYPE() { return getToken(SQLServerStatementParser.TYPE, 0); }
		public TerminalNode REMOTE() { return getToken(SQLServerStatementParser.REMOTE, 0); }
		public TerminalNode SERVICE() { return getToken(SQLServerStatementParser.SERVICE, 0); }
		public TerminalNode BINDING() { return getToken(SQLServerStatementParser.BINDING, 0); }
		public TerminalNode ROUTE() { return getToken(SQLServerStatementParser.ROUTE, 0); }
		public ServiceBrokerPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceBrokerPermission_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitServiceBrokerPermission_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceBrokerPermission_Context serviceBrokerPermission_() throws RecognitionException {
		ServiceBrokerPermission_Context _localctx = new ServiceBrokerPermission_Context(_ctx, getState());
		enterRule(_localctx, 460, RULE_serviceBrokerPermission_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2832);
			match(ALTER);
			setState(2833);
			match(ANY);
			setState(2842);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTRACT:
				{
				setState(2834);
				match(CONTRACT);
				}
				break;
			case MESSAGE:
				{
				setState(2835);
				match(MESSAGE);
				setState(2836);
				match(TYPE);
				}
				break;
			case REMOTE:
				{
				setState(2837);
				match(REMOTE);
				setState(2838);
				match(SERVICE);
				setState(2839);
				match(BINDING);
				}
				break;
			case ROUTE:
				{
				setState(2840);
				match(ROUTE);
				}
				break;
			case SERVICE:
				{
				setState(2841);
				match(SERVICE);
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

	public static class EndpointPermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode ENDPOINT() { return getToken(SQLServerStatementParser.ENDPOINT, 0); }
		public EndpointPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endpointPermission_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitEndpointPermission_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndpointPermission_Context endpointPermission_() throws RecognitionException {
		EndpointPermission_Context _localctx = new EndpointPermission_Context(_ctx, getState());
		enterRule(_localctx, 462, RULE_endpointPermission_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2844);
			match(ALTER);
			setState(2845);
			match(ANY);
			setState(2846);
			match(ENDPOINT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CertificatePermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode CERTIFICATE() { return getToken(SQLServerStatementParser.CERTIFICATE, 0); }
		public CertificatePermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_certificatePermission_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCertificatePermission_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CertificatePermission_Context certificatePermission_() throws RecognitionException {
		CertificatePermission_Context _localctx = new CertificatePermission_Context(_ctx, getState());
		enterRule(_localctx, 464, RULE_certificatePermission_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2848);
			match(ALTER);
			setState(2849);
			match(ANY);
			setState(2850);
			match(CERTIFICATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymmetricKeyPermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode SYMMETRIC() { return getToken(SQLServerStatementParser.SYMMETRIC, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public SymmetricKeyPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symmetricKeyPermission_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSymmetricKeyPermission_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymmetricKeyPermission_Context symmetricKeyPermission_() throws RecognitionException {
		SymmetricKeyPermission_Context _localctx = new SymmetricKeyPermission_Context(_ctx, getState());
		enterRule(_localctx, 466, RULE_symmetricKeyPermission_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2852);
			match(ALTER);
			setState(2853);
			match(ANY);
			setState(2854);
			match(SYMMETRIC);
			setState(2855);
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

	public static class AsymmetricKeyPermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode ASYMMETRIC() { return getToken(SQLServerStatementParser.ASYMMETRIC, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public AsymmetricKeyPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asymmetricKeyPermission_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAsymmetricKeyPermission_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsymmetricKeyPermission_Context asymmetricKeyPermission_() throws RecognitionException {
		AsymmetricKeyPermission_Context _localctx = new AsymmetricKeyPermission_Context(_ctx, getState());
		enterRule(_localctx, 468, RULE_asymmetricKeyPermission_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2857);
			match(ALTER);
			setState(2858);
			match(ANY);
			setState(2859);
			match(ASYMMETRIC);
			setState(2860);
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

	public static class AssemblyPermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode ASSEMBLY() { return getToken(SQLServerStatementParser.ASSEMBLY, 0); }
		public AssemblyPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyPermission_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAssemblyPermission_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyPermission_Context assemblyPermission_() throws RecognitionException {
		AssemblyPermission_Context _localctx = new AssemblyPermission_Context(_ctx, getState());
		enterRule(_localctx, 470, RULE_assemblyPermission_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2862);
			match(ALTER);
			setState(2863);
			match(ANY);
			setState(2864);
			match(ASSEMBLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AvailabilityGroupPermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode AVAILABILITY() { return getToken(SQLServerStatementParser.AVAILABILITY, 0); }
		public TerminalNode GROUP() { return getToken(SQLServerStatementParser.GROUP, 0); }
		public TerminalNode CONNECT() { return getToken(SQLServerStatementParser.CONNECT, 0); }
		public AvailabilityGroupPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availabilityGroupPermission_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAvailabilityGroupPermission_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvailabilityGroupPermission_Context availabilityGroupPermission_() throws RecognitionException {
		AvailabilityGroupPermission_Context _localctx = new AvailabilityGroupPermission_Context(_ctx, getState());
		enterRule(_localctx, 472, RULE_availabilityGroupPermission_);
		try {
			setState(2871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2866);
				match(ALTER);
				setState(2867);
				match(ANY);
				setState(2868);
				match(AVAILABILITY);
				setState(2869);
				match(GROUP);
				}
				break;
			case CONNECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2870);
				match(CONNECT);
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

	public static class FullTextPermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode FULLTEXT() { return getToken(SQLServerStatementParser.FULLTEXT, 0); }
		public TerminalNode CATALOG() { return getToken(SQLServerStatementParser.CATALOG, 0); }
		public FullTextPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullTextPermission_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitFullTextPermission_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullTextPermission_Context fullTextPermission_() throws RecognitionException {
		FullTextPermission_Context _localctx = new FullTextPermission_Context(_ctx, getState());
		enterRule(_localctx, 474, RULE_fullTextPermission_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2873);
			match(ALTER);
			setState(2874);
			match(ANY);
			setState(2875);
			match(FULLTEXT);
			setState(2876);
			match(CATALOG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public List<TerminalNode> COLON_() { return getTokens(SQLServerStatementParser.COLON_); }
		public TerminalNode COLON_(int i) {
			return getToken(SQLServerStatementParser.COLON_, i);
		}
		public Class_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitClass_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_Context class_() throws RecognitionException {
		Class_Context _localctx = new Class_Context(_ctx, getState());
		enterRule(_localctx, 476, RULE_class_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2878);
			match(IDENTIFIER_);
			setState(2879);
			match(COLON_);
			setState(2880);
			match(COLON_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_Context extends ParserRuleContext {
		public List<TerminalNode> COLON_() { return getTokens(SQLServerStatementParser.COLON_); }
		public TerminalNode COLON_(int i) {
			return getToken(SQLServerStatementParser.COLON_, i);
		}
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public TerminalNode DATABASE() { return getToken(SQLServerStatementParser.DATABASE, 0); }
		public TerminalNode OBJECT() { return getToken(SQLServerStatementParser.OBJECT, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLServerStatementParser.SCHEMA, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public ClassType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitClassType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_Context classType_() throws RecognitionException {
		ClassType_Context _localctx = new ClassType_Context(_ctx, getState());
		enterRule(_localctx, 478, RULE_classType_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2882);
			_la = _input.LA(1);
			if ( !(_la==SCHEMA || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (USER - 202)) | (1L << (ROLE - 202)) | (1L << (DATABASE - 202)) | (1L << (LOGIN - 202)) | (1L << (OBJECT - 202)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2883);
			match(COLON_);
			setState(2884);
			match(COLON_);
			}
		}
		catch (RecognitionException re) {
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitRoleClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoleClause_Context roleClause_() throws RecognitionException {
		RoleClause_Context _localctx = new RoleClause_Context(_ctx, getState());
		enterRule(_localctx, 480, RULE_roleClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2886);
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

	public static class CreateUserContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCreateUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_createUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2888);
			match(CREATE);
			setState(2889);
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
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_dropUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2891);
			match(DROP);
			setState(2892);
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
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_alterUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2894);
			match(ALTER);
			setState(2895);
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
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCreateRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_createRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2897);
			match(CREATE);
			setState(2898);
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
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_dropRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2900);
			match(DROP);
			setState(2901);
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
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public AlterRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRole; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterRoleContext alterRole() throws RecognitionException {
		AlterRoleContext _localctx = new AlterRoleContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_alterRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2903);
			match(ALTER);
			setState(2904);
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

	public static class CreateLoginContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public CreateLoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createLogin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCreateLogin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateLoginContext createLogin() throws RecognitionException {
		CreateLoginContext _localctx = new CreateLoginContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_createLogin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2906);
			match(CREATE);
			setState(2907);
			match(LOGIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropLoginContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public DropLoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropLogin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropLogin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropLoginContext dropLogin() throws RecognitionException {
		DropLoginContext _localctx = new DropLoginContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_dropLogin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2909);
			match(DROP);
			setState(2910);
			match(LOGIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterLoginContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public AlterLoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterLogin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterLogin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterLoginContext alterLogin() throws RecognitionException {
		AlterLoginContext _localctx = new AlterLoginContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_alterLogin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2912);
			match(ALTER);
			setState(2913);
			match(LOGIN);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode CALL() { return getToken(SQLServerStatementParser.CALL, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2915);
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
		case 55:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 58:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 61:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 62:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u019d\u0b68\4\2\t"+
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
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2\u0217\n\2\3\2\5\2\u021a\n\2\3\3\3\3\3\3\3\3\5"+
		"\3\u0220\n\3\3\3\5\3\u0223\n\3\3\3\3\3\5\3\u0227\n\3\3\4\5\4\u022a\n\4"+
		"\3\4\3\4\3\4\3\4\7\4\u0230\n\4\f\4\16\4\u0233\13\4\3\5\5\5\u0236\n\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\5\6\u023e\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7"+
		"\b\u0248\n\b\f\b\16\b\u024b\13\b\3\t\3\t\3\t\3\t\7\t\u0251\n\t\f\t\16"+
		"\t\u0254\13\t\3\t\3\t\3\t\3\t\5\t\u025a\n\t\3\n\3\n\5\n\u025e\n\n\3\13"+
		"\3\13\3\13\5\13\u0263\n\13\3\13\5\13\u0266\n\13\3\f\5\f\u0269\n\f\3\f"+
		"\5\f\u026c\n\f\3\f\3\f\5\f\u0270\n\f\3\f\5\f\u0273\n\f\3\f\5\f\u0276\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0281\n\r\3\16\3\16\5\16\u0285"+
		"\n\16\3\16\3\16\3\16\5\16\u028a\n\16\7\16\u028c\n\16\f\16\16\16\u028f"+
		"\13\16\3\17\3\17\3\20\3\20\3\20\5\20\u0296\n\20\3\20\7\20\u0299\n\20\f"+
		"\20\16\20\u029c\13\20\3\21\3\21\5\21\u02a0\n\21\3\21\3\21\5\21\u02a4\n"+
		"\21\3\21\5\21\u02a7\n\21\3\21\5\21\u02aa\n\21\3\21\5\21\u02ad\n\21\3\21"+
		"\5\21\u02b0\n\21\3\22\3\22\3\23\3\23\5\23\u02b6\n\23\3\23\3\23\7\23\u02ba"+
		"\n\23\f\23\16\23\u02bd\13\23\3\24\3\24\3\24\5\24\u02c2\n\24\3\24\5\24"+
		"\u02c5\n\24\3\24\5\24\u02c8\n\24\3\24\5\24\u02cb\n\24\3\25\3\25\5\25\u02cf"+
		"\n\25\3\25\3\25\5\25\u02d3\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\5\26\u02df\n\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\7\32\u02ec\n\32\f\32\16\32\u02ef\13\32\3\33\3\33\7\33\u02f3"+
		"\n\33\f\33\16\33\u02f6\13\33\3\34\3\34\5\34\u02fa\n\34\3\34\5\34\u02fd"+
		"\n\34\3\34\3\34\5\34\u0301\n\34\3\34\3\34\5\34\u0305\n\34\3\34\3\34\3"+
		"\34\3\34\5\34\u030b\n\34\3\35\5\35\u030e\n\35\3\35\5\35\u0311\n\35\3\35"+
		"\3\35\3\35\3\35\5\35\u0317\n\35\3\35\5\35\u031a\n\35\3\35\3\35\5\35\u031e"+
		"\n\35\3\35\3\35\3\35\5\35\u0323\n\35\5\35\u0325\n\35\3\36\3\36\3\36\3"+
		"\36\5\36\u032b\n\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \7 \u0335\n \f \16 \u0338"+
		"\13 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\5$\u034a\n$\3"+
		"%\3%\3&\5&\u034f\n&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u035a\n\'\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\3,\3,\5,\u0366\n,\3-\3-\3.\3.\3/\3/\3/\5/\u036f"+
		"\n/\3/\3/\3\60\3\60\3\60\5\60\u0376\n\60\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\7\63\u0382\n\63\f\63\16\63\u0385\13\63\3\63\3\63"+
		"\3\64\5\64\u038a\n\64\3\64\3\64\3\64\7\64\u038f\n\64\f\64\16\64\u0392"+
		"\13\64\3\64\5\64\u0395\n\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\5"+
		"\67\u039f\n\67\5\67\u03a1\n\67\3\67\3\67\38\58\u03a6\n8\38\38\39\39\3"+
		"9\39\39\39\39\39\39\59\u03b3\n9\39\39\39\39\79\u03b9\n9\f9\169\u03bc\13"+
		"9\3:\3:\3;\3;\3<\3<\3<\3<\3<\3<\5<\u03c8\n<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\7<\u03d7\n<\f<\16<\u03da\13<\3=\3=\3>\3>\5>\u03e0\n>\3>"+
		"\3>\3>\3>\3>\5>\u03e7\n>\3>\3>\3>\3>\3>\7>\u03ee\n>\f>\16>\u03f1\13>\3"+
		">\3>\3>\3>\5>\u03f7\n>\3>\3>\3>\3>\3>\3>\3>\5>\u0400\n>\3>\3>\3>\3>\5"+
		">\u0406\n>\3>\5>\u0409\n>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\7?\u042c\n?\f"+
		"?\16?\u042f\13?\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0439\n@\3@\3@\3@\3@\7@\u043f"+
		"\n@\f@\16@\u0442\13@\3@\3@\3@\5@\u0447\n@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0451"+
		"\n@\3@\3@\3@\7@\u0456\n@\f@\16@\u0459\13@\3A\3A\3A\5A\u045e\nA\3B\3B\3"+
		"B\5B\u0463\nB\3B\3B\3B\7B\u0468\nB\fB\16B\u046b\13B\3B\5B\u046e\nB\3B"+
		"\3B\3C\3C\3D\3D\3E\3E\5E\u0478\nE\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G"+
		"\7G\u0486\nG\fG\16G\u0489\13G\3G\3G\5G\u048d\nG\3G\3G\3H\3H\3H\3H\3H\7"+
		"H\u0496\nH\fH\16H\u0499\13H\3H\5H\u049c\nH\3H\3H\3I\3I\3I\3I\3I\5I\u04a5"+
		"\nI\3J\3J\5J\u04a9\nJ\3J\6J\u04ac\nJ\rJ\16J\u04ad\3J\5J\u04b1\nJ\3K\3"+
		"K\3K\3K\3K\3L\3L\3L\3M\3M\3M\3M\5M\u04bf\nM\3N\3N\3N\3N\3N\7N\u04c6\n"+
		"N\fN\16N\u04c9\13N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u04d4\nN\5N\u04d6\nN"+
		"\3O\3O\3O\5O\u04db\nO\3O\5O\u04de\nO\3P\3P\3P\3P\3P\3P\3P\5P\u04e7\nP"+
		"\3P\3P\3P\5P\u04ec\nP\3Q\3Q\3R\3R\3R\3R\5R\u04f4\nR\3R\3R\3S\3S\3S\3S"+
		"\3S\3S\3S\3S\5S\u0500\nS\3S\3S\3T\3T\3T\3T\3T\5T\u0509\nT\3T\3T\3T\3T"+
		"\5T\u050f\nT\3U\3U\3U\3V\3V\3V\5V\u0517\nV\3V\5V\u051a\nV\3V\5V\u051d"+
		"\nV\3V\3V\3W\3W\3W\3W\3W\7W\u0526\nW\fW\16W\u0529\13W\3X\3X\3X\3Y\3Y\5"+
		"Y\u0530\nY\3Z\3Z\3Z\3Z\3Z\3[\3[\5[\u0539\n[\3\\\3\\\3\\\3\\\3\\\3\\\5"+
		"\\\u0541\n\\\3]\3]\3]\3]\3]\3]\5]\u0549\n]\3^\3^\5^\u054d\n^\3_\3_\3_"+
		"\3_\3_\3_\3_\3_\3_\3_\3_\5_\u055a\n_\5_\u055c\n_\3`\3`\3`\3`\3a\3a\3a"+
		"\5a\u0565\na\3b\3b\3b\3c\3c\3d\3d\3d\3e\3e\3e\3e\3e\3e\3f\3f\3f\7f\u0578"+
		"\nf\ff\16f\u057b\13f\3g\3g\5g\u057f\ng\3h\3h\3h\3h\3i\3i\3i\3i\3i\3i\5"+
		"i\u058b\ni\3i\3i\3i\3i\3i\3i\3j\3j\3j\3j\3j\5j\u0598\nj\3k\3k\3l\3l\3"+
		"l\7l\u059f\nl\fl\16l\u05a2\13l\3m\3m\3n\3n\3n\3n\3n\3n\3o\3o\3o\3o\3o"+
		"\3o\3o\3o\3p\3p\3p\3p\3p\3p\7p\u05ba\np\fp\16p\u05bd\13p\3q\3q\3q\3q\5"+
		"q\u05c3\nq\3q\3q\3q\3r\3r\3r\5r\u05cb\nr\3r\3r\3s\3s\3s\5s\u05d2\ns\3"+
		"s\3s\3s\3s\3t\3t\3t\3t\3u\3u\5u\u05de\nu\3v\3v\3v\3v\3w\3w\3w\3w\7w\u05e8"+
		"\nw\fw\16w\u05eb\13w\3w\3w\5w\u05ef\nw\3w\3w\3x\3x\3x\3x\3x\5x\u05f8\n"+
		"x\3y\3y\3y\7y\u05fd\ny\fy\16y\u0600\13y\3y\3y\5y\u0604\ny\3z\3z\3z\3z"+
		"\3z\3z\3z\3z\3z\3z\3z\3z\3z\5z\u0613\nz\3z\3z\3z\3z\3z\3z\3z\3z\5z\u061d"+
		"\nz\3z\3z\3z\3z\3z\3z\3z\3z\3z\5z\u0628\nz\3z\5z\u062b\nz\3z\3z\3z\3z"+
		"\3z\3z\3z\3z\7z\u0635\nz\fz\16z\u0638\13z\3z\5z\u063b\nz\3{\3{\3{\3{\3"+
		"{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3|\3|\5|\u064d\n|\3|\3|\3|\5|\u0652\n|\3"+
		"}\3}\5}\u0656\n}\3}\3}\5}\u065a\n}\3~\5~\u065d\n~\3~\5~\u0660\n~\3~\5"+
		"~\u0663\n~\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\7\u0080\u066f\n\u0080\f\u0080\16\u0080\u0672\13\u0080"+
		"\3\u0080\3\u0080\5\u0080\u0676\n\u0080\3\u0081\3\u0081\3\u0081\5\u0081"+
		"\u067b\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083"+
		"\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\5\u0085\u068b"+
		"\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087"+
		"\3\u0087\5\u0087\u0696\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\7\u0087\u069e\n\u0087\f\u0087\16\u0087\u06a1\13\u0087\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u06a9\n\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u06b0\n\u0089\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\5\u008a\u06b6\n\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008b\3\u008b\3\u008b\5\u008b\u06bf\n\u008b\3\u008b\5\u008b\u06c2\n"+
		"\u008b\3\u008b\5\u008b\u06c5\n\u008b\3\u008b\5\u008b\u06c8\n\u008b\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\7\u008c\u06cf\n\u008c\f\u008c\16\u008c"+
		"\u06d2\13\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\5\u008d\u06d9"+
		"\n\u008d\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f"+
		"\u06e2\n\u008f\3\u0090\3\u0090\3\u0090\7\u0090\u06e7\n\u0090\f\u0090\16"+
		"\u0090\u06ea\13\u0090\5\u0090\u06ec\n\u0090\3\u0091\3\u0091\3\u0091\3"+
		"\u0091\3\u0091\3\u0091\5\u0091\u06f4\n\u0091\5\u0091\u06f6\n\u0091\3\u0091"+
		"\5\u0091\u06f9\n\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0093\3\u0093\5\u0093\u0703\n\u0093\3\u0093\3\u0093\3\u0093\5\u0093"+
		"\u0708\n\u0093\3\u0094\3\u0094\3\u0094\5\u0094\u070d\n\u0094\3\u0095\3"+
		"\u0095\5\u0095\u0711\n\u0095\3\u0096\5\u0096\u0714\n\u0096\3\u0096\3\u0096"+
		"\5\u0096\u0718\n\u0096\3\u0096\5\u0096\u071b\n\u0096\3\u0097\3\u0097\3"+
		"\u0097\5\u0097\u0720\n\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3"+
		"\u0099\5\u0099\u0728\n\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\7"+
		"\u0099\u072f\n\u0099\f\u0099\16\u0099\u0732\13\u0099\3\u009a\3\u009a\3"+
		"\u009a\3\u009a\3\u009a\5\u009a\u0739\n\u009a\3\u009a\5\u009a\u073c\n\u009a"+
		"\3\u009a\5\u009a\u073f\n\u009a\3\u009b\5\u009b\u0742\n\u009b\3\u009b\3"+
		"\u009b\3\u009b\3\u009b\5\u009b\u0748\n\u009b\3\u009b\3\u009b\5\u009b\u074c"+
		"\n\u009b\3\u009c\3\u009c\3\u009c\3\u009c\7\u009c\u0752\n\u009c\f\u009c"+
		"\16\u009c\u0755\13\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u076a\n\u009e\5\u009e\u076c\n"+
		"\u009e\3\u009f\3\u009f\3\u009f\5\u009f\u0771\n\u009f\5\u009f\u0773\n\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u077a\n\u009f\5\u009f"+
		"\u077c\n\u009f\3\u009f\3\u009f\5\u009f\u0780\n\u009f\3\u00a0\3\u00a0\3"+
		"\u00a0\3\u00a0\7\u00a0\u0786\n\u00a0\f\u00a0\16\u00a0\u0789\13\u00a0\3"+
		"\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\5\u00a1\u0796\n\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u079f\n\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\5\u00a1\u07ae\n\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1"+
		"\u07b4\n\u00a1\3\u00a1\3\u00a1\5\u00a1\u07b8\n\u00a1\3\u00a1\3\u00a1\3"+
		"\u00a1\5\u00a1\u07bd\n\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\7\u00a2\u07c3"+
		"\n\u00a2\f\u00a2\16\u00a2\u07c6\13\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\5\u00a3\u07ce\n\u00a3\3\u00a3\5\u00a3\u07d1\n\u00a3\3"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\5\u00a5\u07e7\n\u00a5\5\u00a5\u07e9\n\u00a5\3\u00a6\3"+
		"\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6"+
		"\u07f4\n\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u07fb\n"+
		"\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u0802\n\u00a8\3"+
		"\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\7\u00a8\u080a\n\u00a8\f"+
		"\u00a8\16\u00a8\u080d\13\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9\5\u00a9"+
		"\u0813\n\u00a9\3\u00a9\5\u00a9\u0816\n\u00a9\3\u00aa\3\u00aa\3\u00aa\3"+
		"\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0821\n\u00aa\3"+
		"\u00ab\3\u00ab\5\u00ab\u0825\n\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u082a"+
		"\n\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0830\n\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\5\u00ac\u0835\n\u00ac\3\u00ac\5\u00ac\u0838\n\u00ac\3"+
		"\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\7\u00ae\u0841\n"+
		"\u00ae\f\u00ae\16\u00ae\u0844\13\u00ae\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\5\u00af\u084c\n\u00af\3\u00b0\3\u00b0\5\u00b0\u0850\n"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\7\u00b1\u085b\n\u00b1\f\u00b1\16\u00b1\u085e\13\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\5\u00b2\u086a\n\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3"+
		"\u0871\n\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u087d\n\u00b4\3\u00b4\5\u00b4\u0880\n"+
		"\u00b4\3\u00b4\3\u00b4\5\u00b4\u0884\n\u00b4\3\u00b4\3\u00b4\5\u00b4\u0888"+
		"\n\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5"+
		"\u0891\n\u00b5\3\u00b6\5\u00b6\u0894\n\u00b6\3\u00b6\5\u00b6\u0897\n\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\7\u00b6\u089c\n\u00b6\f\u00b6\16\u00b6\u089f"+
		"\13\u00b6\3\u00b7\3\u00b7\5\u00b7\u08a3\n\u00b7\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\7\u00b8\u08aa\n\u00b8\f\u00b8\16\u00b8\u08ad\13\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9"+
		"\u08c0\n\u00b9\5\u00b9\u08c2\n\u00b9\3\u00ba\3\u00ba\3\u00bb\3\u00bb\5"+
		"\u00bb\u08c8\n\u00bb\3\u00bb\3\u00bb\3\u00bb\7\u00bb\u08cd\n\u00bb\f\u00bb"+
		"\16\u00bb\u08d0\13\u00bb\3\u00bc\3\u00bc\5\u00bc\u08d4\n\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\7\u00bc\u08d9\n\u00bc\f\u00bc\16\u00bc\u08dc\13\u00bc"+
		"\3\u00bd\5\u00bd\u08df\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd"+
		"\u08e5\n\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u08eb\n\u00be\3"+
		"\u00bf\3\u00bf\3\u00bf\5\u00bf\u08f0\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3"+
		"\u00bf\5\u00bf\u08f6\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5"+
		"\u00bf\u08fd\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0903\n\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u090c"+
		"\n\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0913\n\u00c2"+
		"\5\u00c2\u0915\n\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u091b\n"+
		"\u00c3\3\u00c3\5\u00c3\u091e\n\u00c3\3\u00c3\5\u00c3\u0921\n\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c4\5\u00c4\u0926\n\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c5\5\u00c5\u092d\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c6"+
		"\3\u00c6\3\u00c6\5\u00c6\u0936\n\u00c6\3\u00c7\3\u00c7\3\u00c7\5\u00c7"+
		"\u093b\n\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\5\u00c9\u0944\n\u00c9\5\u00c9\u0946\n\u00c9\3\u00ca\3\u00ca\3\u00ca\5"+
		"\u00ca\u094b\n\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3"+
		"\u00cb\5\u00cb\u0954\n\u00cb\5\u00cb\u0956\n\u00cb\3\u00cb\5\u00cb\u0959"+
		"\n\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc"+
		"\u096b\n\u00cc\5\u00cc\u096d\n\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0977\n\u00cd\3\u00cd\3\u00cd\3"+
		"\u00ce\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0989\n\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d3"+
		"\3\u00d3\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\5\u00d6\u099f\n\u00d6\3\u00d7\3\u00d7\5\u00d7\u09a3\n\u00d7\3"+
		"\u00d7\3\u00d7\3\u00d7\5\u00d7\u09a8\n\u00d7\3\u00d8\3\u00d8\3\u00d8\5"+
		"\u00d8\u09ad\n\u00d8\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u09b2\n\u00d9\3\u00da"+
		"\3\u00da\3\u00da\5\u00da\u09b7\n\u00da\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\3\u00dc\3\u00dc\5\u00dc\u09bf\n\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc"+
		"\u09c4\n\u00dc\7\u00dc\u09c6\n\u00dc\f\u00dc\16\u00dc\u09c9\13\u00dc\3"+
		"\u00dd\5\u00dd\u09cc\n\u00dd\3\u00dd\3\u00dd\3\u00de\3\u00de\3\u00de\7"+
		"\u00de\u09d3\n\u00de\f\u00de\16\u00de\u09d6\13\u00de\3\u00df\5\u00df\u09d9"+
		"\n\u00df\3\u00df\3\u00df\3\u00e0\3\u00e0\5\u00e0\u09df\n\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u09f0\n\u00e0\3\u00e1"+
		"\3\u00e1\5\u00e1\u09f4\n\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\5\u00e1\u09fb\n\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\5\u00e1\u0a05\n\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u0a11\n\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\5\u00e3\u0a26\n\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u0a34"+
		"\n\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u0a56\n\u00e3"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\5\u00e4\u0a5e\n\u00e4"+
		"\5\u00e4\u0a60\n\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5"+
		"\u0a70\n\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0a76\n\u00e5\3"+
		"\u00e5\3\u00e5\5\u00e5\u0a7a\n\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3"+
		"\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0a85\n\u00e5\3\u00e5\3"+
		"\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\5\u00e5\u0a92\n\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5"+
		"\u0aa1\n\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\5\u00e5\u0ac6\n\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\5\u00e5\u0acd\n\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\5\u00e5\u0ad5\n\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\5\u00e5\u0ade\n\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\5\u00e5\u0ae6\n\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\5\u00e5\u0aef\n\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0afb\n\u00e5"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\5\u00e6\u0b02\n\u00e6\3\u00e6"+
		"\5\u00e6\u0b05\n\u00e6\5\u00e6\u0b07\n\u00e6\3\u00e7\3\u00e7\3\u00e7\3"+
		"\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0b11\n\u00e7\3\u00e8\3"+
		"\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8"+
		"\5\u00e8\u0b1d\n\u00e8\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00ea\3\u00ea"+
		"\3\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0b3a\n\u00ee\3\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f1\3\u00f1\3\u00f1"+
		"\3\u00f1\3\u00f2\3\u00f2\3\u00f3\3\u00f3\3\u00f3\3\u00f4\3\u00f4\3\u00f4"+
		"\3\u00f5\3\u00f5\3\u00f5\3\u00f6\3\u00f6\3\u00f6\3\u00f7\3\u00f7\3\u00f7"+
		"\3\u00f8\3\u00f8\3\u00f8\3\u00f9\3\u00f9\3\u00f9\3\u00fa\3\u00fa\3\u00fa"+
		"\3\u00fb\3\u00fb\3\u00fb\3\u00fc\3\u00fc\3\u00fc\2\6pv|~\u00fd\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150"+
		"\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168"+
		"\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180"+
		"\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198"+
		"\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0"+
		"\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8"+
		"\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0"+
		"\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\2/"+
		"\4\2NNpp\4\2XX\\\\\4\2WWZ[\3\2\u0085\u0087\3\2kl\37\2\66\66FGyz~\177\u0083"+
		"\u0083\u0088\u0089\u008b\u008b\u008d\u008d\u0092\u0097\u009a\u009b\u009d"+
		"\u009d\u009f\u00a0\u00a2\u00a4\u00a7\u00a8\u00ab\u00ab\u00ae\u00ae\u00b9"+
		"\u00b9\u00bb\u00c0\u00c3\u00c4\u00cd\u00ce\u00d1\u00d5\u00d7\u00d8\u00da"+
		"\u00e5\u00e7\u00ec\u00ee\u00f6\u00f8\u010d\u0114\u0185\u0187\u0187\u018d"+
		"\u018d\3\2\u0199\u019a\4\2\4\5fg\4\2\6\6ii\4\2jl\u00c2\u00c2\3\2pq\3\2"+
		"\30\35\5\2\6\7\17\20\u00b9\u00b9\3\2\u0093\u0097\3\2\u00c0\u00c1\4\2\u00a7"+
		"\u00a7\u0187\u0187\3\2vw\4\2\u00d8\u00d8\u00e3\u00e3\t\2\u0081\u0081\u0085"+
		"\u0086\u00ac\u00ad\u00af\u00b7\u00b9\u00b9\u012c\u012c\u0189\u0199\4\2"+
		"\u00c1\u00c1\u0102\u0102\4\2\u0164\u0164\u0175\u0175\7\2\u00c0\u00c0\u00d7"+
		"\u00d7\u00f7\u00f7\u00fc\u00fc\u0161\u0161\n\2\u00fa\u00fa\u0106\u0106"+
		"\u015d\u015e\u0164\u0164\u016d\u016e\u0172\u0173\u0178\u0178\u0184\u0184"+
		"\4\2``\u00f9\u00f9\5\2\u00d3\u00d3\u00f7\u00f7\u0109\u0109\4\2\u00ce\u00ce"+
		"\u00e6\u00e6\4\2\u00e1\u00e1\u0101\u0101\3\2\u00d4\u00d5\3\2\61\62\4\2"+
		"jj\u0098\u0098\5\2\u00c0\u00c0\u00f7\u00f7\u00fc\u00fc\4\2\u00ee\u00ef"+
		"\u00fd\u00fd\3\2\u0170\u0171\3\2Z[\4\2\u00c6\u00c6\u00f6\u00f6\3\2\u009a"+
		"\u009b\5\2\u008a\u008a\u008c\u008e\u00db\u00de\5\2<<\u009b\u009b\u00d2"+
		"\u00d2\4\2\u00cf\u00cf\u010c\u010c\4\2\u00da\u00da\u0117\u0117\3\2\u011a"+
		"\u011b\4\2\u00da\u00da\u011c\u011c\3\2\u013d\u013e\4\2\u00da\u00da\u0155"+
		"\u0155\7\2\67\67\u00cc\u00cd\u00da\u00da\u00f2\u00f2\u00f8\u00f8\2\u0c98"+
		"\2\u0216\3\2\2\2\4\u021b\3\2\2\2\6\u0229\3\2\2\2\b\u0235\3\2\2\2\n\u0239"+
		"\3\2\2\2\f\u023f\3\2\2\2\16\u0243\3\2\2\2\20\u0259\3\2\2\2\22\u025d\3"+
		"\2\2\2\24\u025f\3\2\2\2\26\u0268\3\2\2\2\30\u0280\3\2\2\2\32\u0282\3\2"+
		"\2\2\34\u0290\3\2\2\2\36\u0292\3\2\2\2 \u029d\3\2\2\2\"\u02b1\3\2\2\2"+
		"$\u02b5\3\2\2\2&\u02ca\3\2\2\2(\u02cc\3\2\2\2*\u02de\3\2\2\2,\u02e0\3"+
		"\2\2\2.\u02e2\3\2\2\2\60\u02e5\3\2\2\2\62\u02e8\3\2\2\2\64\u02f0\3\2\2"+
		"\2\66\u030a\3\2\2\28\u0324\3\2\2\2:\u032a\3\2\2\2<\u032c\3\2\2\2>\u032f"+
		"\3\2\2\2@\u0339\3\2\2\2B\u033c\3\2\2\2D\u0340\3\2\2\2F\u0349\3\2\2\2H"+
		"\u034b\3\2\2\2J\u034e\3\2\2\2L\u0359\3\2\2\2N\u035b\3\2\2\2P\u035d\3\2"+
		"\2\2R\u035f\3\2\2\2T\u0361\3\2\2\2V\u0365\3\2\2\2X\u0367\3\2\2\2Z\u0369"+
		"\3\2\2\2\\\u036e\3\2\2\2^\u0375\3\2\2\2`\u0379\3\2\2\2b\u037b\3\2\2\2"+
		"d\u037d\3\2\2\2f\u0389\3\2\2\2h\u0396\3\2\2\2j\u0398\3\2\2\2l\u039a\3"+
		"\2\2\2n\u03a5\3\2\2\2p\u03b2\3\2\2\2r\u03bd\3\2\2\2t\u03bf\3\2\2\2v\u03c1"+
		"\3\2\2\2x\u03db\3\2\2\2z\u0408\3\2\2\2|\u040a\3\2\2\2~\u0450\3\2\2\2\u0080"+
		"\u045d\3\2\2\2\u0082\u045f\3\2\2\2\u0084\u0471\3\2\2\2\u0086\u0473\3\2"+
		"\2\2\u0088\u0477\3\2\2\2\u008a\u0479\3\2\2\2\u008c\u0480\3\2\2\2\u008e"+
		"\u0490\3\2\2\2\u0090\u04a4\3\2\2\2\u0092\u04a6\3\2\2\2\u0094\u04b2\3\2"+
		"\2\2\u0096\u04b7\3\2\2\2\u0098\u04be\3\2\2\2\u009a\u04c0\3\2\2\2\u009c"+
		"\u04da\3\2\2\2\u009e\u04df\3\2\2\2\u00a0\u04ed\3\2\2\2\u00a2\u04ef\3\2"+
		"\2\2\u00a4\u04f7\3\2\2\2\u00a6\u0503\3\2\2\2\u00a8\u0510\3\2\2\2\u00aa"+
		"\u0513\3\2\2\2\u00ac\u0520\3\2\2\2\u00ae\u052a\3\2\2\2\u00b0\u052f\3\2"+
		"\2\2\u00b2\u0531\3\2\2\2\u00b4\u0538\3\2\2\2\u00b6\u0540\3\2\2\2\u00b8"+
		"\u0548\3\2\2\2\u00ba\u054a\3\2\2\2\u00bc\u055b\3\2\2\2\u00be\u055d\3\2"+
		"\2\2\u00c0\u0561\3\2\2\2\u00c2\u0566\3\2\2\2\u00c4\u0569\3\2\2\2\u00c6"+
		"\u056b\3\2\2\2\u00c8\u056e\3\2\2\2\u00ca\u0574\3\2\2\2\u00cc\u057e\3\2"+
		"\2\2\u00ce\u0580\3\2\2\2\u00d0\u0584\3\2\2\2\u00d2\u0592\3\2\2\2\u00d4"+
		"\u0599\3\2\2\2\u00d6\u059b\3\2\2\2\u00d8\u05a3\3\2\2\2\u00da\u05a5\3\2"+
		"\2\2\u00dc\u05ab\3\2\2\2\u00de\u05b3\3\2\2\2\u00e0\u05be\3\2\2\2\u00e2"+
		"\u05c7\3\2\2\2\u00e4\u05ce\3\2\2\2\u00e6\u05d7\3\2\2\2\u00e8\u05dd\3\2"+
		"\2\2\u00ea\u05df\3\2\2\2\u00ec\u05e3\3\2\2\2\u00ee\u05f7\3\2\2\2\u00f0"+
		"\u05f9\3\2\2\2\u00f2\u063a\3\2\2\2\u00f4\u063c\3\2\2\2\u00f6\u064c\3\2"+
		"\2\2\u00f8\u0655\3\2\2\2\u00fa\u065c\3\2\2\2\u00fc\u0664\3\2\2\2\u00fe"+
		"\u0666\3\2\2\2\u0100\u067a\3\2\2\2\u0102\u067c\3\2\2\2\u0104\u0682\3\2"+
		"\2\2\u0106\u0685\3\2\2\2\u0108\u0688\3\2\2\2\u010a\u068c\3\2\2\2\u010c"+
		"\u0695\3\2\2\2\u010e\u06a8\3\2\2\2\u0110\u06af\3\2\2\2\u0112\u06b1\3\2"+
		"\2\2\u0114\u06bb\3\2\2\2\u0116\u06c9\3\2\2\2\u0118\u06d8\3\2\2\2\u011a"+
		"\u06da\3\2\2\2\u011c\u06dd\3\2\2\2\u011e\u06eb\3\2\2\2\u0120\u06ed\3\2"+
		"\2\2\u0122\u06fa\3\2\2\2\u0124\u0702\3\2\2\2\u0126\u0709\3\2\2\2\u0128"+
		"\u0710\3\2\2\2\u012a\u0713\3\2\2\2\u012c\u071c\3\2\2\2\u012e\u0721\3\2"+
		"\2\2\u0130\u0727\3\2\2\2\u0132\u0733\3\2\2\2\u0134\u074b\3\2\2\2\u0136"+
		"\u074d\3\2\2\2\u0138\u0758\3\2\2\2\u013a\u076b\3\2\2\2\u013c\u0772\3\2"+
		"\2\2\u013e\u0781\3\2\2\2\u0140\u07bc\3\2\2\2\u0142\u07be\3\2\2\2\u0144"+
		"\u07d0\3\2\2\2\u0146\u07d6\3\2\2\2\u0148\u07e8\3\2\2\2\u014a\u07ea\3\2"+
		"\2\2\u014c\u07fa\3\2\2\2\u014e\u07fc\3\2\2\2\u0150\u0812\3\2\2\2\u0152"+
		"\u0820\3\2\2\2\u0154\u0824\3\2\2\2\u0156\u082b\3\2\2\2\u0158\u0839\3\2"+
		"\2\2\u015a\u083d\3\2\2\2\u015c\u084b\3\2\2\2\u015e\u084f\3\2\2\2\u0160"+
		"\u0856\3\2\2\2\u0162\u0869\3\2\2\2\u0164\u086b\3\2\2\2\u0166\u0875\3\2"+
		"\2\2\u0168\u0889\3\2\2\2\u016a\u0893\3\2\2\2\u016c\u08a0\3\2\2\2\u016e"+
		"\u08a4\3\2\2\2\u0170\u08c1\3\2\2\2\u0172\u08c3\3\2\2\2\u0174\u08c5\3\2"+
		"\2\2\u0176\u08d1\3\2\2\2\u0178\u08de\3\2\2\2\u017a\u08e6\3\2\2\2\u017c"+
		"\u08ec\3\2\2\2\u017e\u08fe\3\2\2\2\u0180\u0906\3\2\2\2\u0182\u090d\3\2"+
		"\2\2\u0184\u0916\3\2\2\2\u0186\u0925\3\2\2\2\u0188\u092c\3\2\2\2\u018a"+
		"\u0935\3\2\2\2\u018c\u0937\3\2\2\2\u018e\u093c\3\2\2\2\u0190\u093f\3\2"+
		"\2\2\u0192\u094a\3\2\2\2\u0194\u094c\3\2\2\2\u0196\u096c\3\2\2\2\u0198"+
		"\u096e\3\2\2\2\u019a\u097a\3\2\2\2\u019c\u097d\3\2\2\2\u019e\u0988\3\2"+
		"\2\2\u01a0\u098e\3\2\2\2\u01a2\u0990\3\2\2\2\u01a4\u0993\3\2\2\2\u01a6"+
		"\u0995\3\2\2\2\u01a8\u0997\3\2\2\2\u01aa\u099a\3\2\2\2\u01ac\u09a0\3\2"+
		"\2\2\u01ae\u09a9\3\2\2\2\u01b0\u09ae\3\2\2\2\u01b2\u09b3\3\2\2\2\u01b4"+
		"\u09b8\3\2\2\2\u01b6\u09bc\3\2\2\2\u01b8\u09cb\3\2\2\2\u01ba\u09cf\3\2"+
		"\2\2\u01bc\u09d8\3\2\2\2\u01be\u09ef\3\2\2\2\u01c0\u0a04\3\2\2\2\u01c2"+
		"\u0a06\3\2\2\2\u01c4\u0a55\3\2\2\2\u01c6\u0a5f\3\2\2\2\u01c8\u0afa\3\2"+
		"\2\2\u01ca\u0b06\3\2\2\2\u01cc\u0b10\3\2\2\2\u01ce\u0b12\3\2\2\2\u01d0"+
		"\u0b1e\3\2\2\2\u01d2\u0b22\3\2\2\2\u01d4\u0b26\3\2\2\2\u01d6\u0b2b\3\2"+
		"\2\2\u01d8\u0b30\3\2\2\2\u01da\u0b39\3\2\2\2\u01dc\u0b3b\3\2\2\2\u01de"+
		"\u0b40\3\2\2\2\u01e0\u0b44\3\2\2\2\u01e2\u0b48\3\2\2\2\u01e4\u0b4a\3\2"+
		"\2\2\u01e6\u0b4d\3\2\2\2\u01e8\u0b50\3\2\2\2\u01ea\u0b53\3\2\2\2\u01ec"+
		"\u0b56\3\2\2\2\u01ee\u0b59\3\2\2\2\u01f0\u0b5c\3\2\2\2\u01f2\u0b5f\3\2"+
		"\2\2\u01f4\u0b62\3\2\2\2\u01f6\u0b65\3\2\2\2\u01f8\u0217\5\34\17\2\u01f9"+
		"\u0217\5\4\3\2\u01fa\u0217\5\n\6\2\u01fb\u0217\5\24\13\2\u01fc\u0217\5"+
		"\u00dco\2\u01fd\u0217\5\u00e0q\2\u01fe\u0217\5\u00e4s\2\u01ff\u0217\5"+
		"\u00dan\2\u0200\u0217\5\u00dep\2\u0201\u0217\5\u00e2r\2\u0202\u0217\5"+
		"\u00e6t\2\u0203\u0217\5\u019c\u00cf\2\u0204\u0217\5\u01a2\u00d2\2\u0205"+
		"\u0217\5\u019e\u00d0\2\u0206\u0217\5\u01a4\u00d3\2\u0207\u0217\5\u01a6"+
		"\u00d4\2\u0208\u0217\5\u01a8\u00d5\2\u0209\u0217\5\u01aa\u00d6\2\u020a"+
		"\u0217\5\u01ac\u00d7\2\u020b\u0217\5\u01ae\u00d8\2\u020c\u0217\5\u01e4"+
		"\u00f3\2\u020d\u0217\5\u01e6\u00f4\2\u020e\u0217\5\u01e8\u00f5\2\u020f"+
		"\u0217\5\u01ea\u00f6\2\u0210\u0217\5\u01ec\u00f7\2\u0211\u0217\5\u01ee"+
		"\u00f8\2\u0212\u0217\5\u01f0\u00f9\2\u0213\u0217\5\u01f2\u00fa\2\u0214"+
		"\u0217\5\u01f4\u00fb\2\u0215\u0217\5\u01f6\u00fc\2\u0216\u01f8\3\2\2\2"+
		"\u0216\u01f9\3\2\2\2\u0216\u01fa\3\2\2\2\u0216\u01fb\3\2\2\2\u0216\u01fc"+
		"\3\2\2\2\u0216\u01fd\3\2\2\2\u0216\u01fe\3\2\2\2\u0216\u01ff\3\2\2\2\u0216"+
		"\u0200\3\2\2\2\u0216\u0201\3\2\2\2\u0216\u0202\3\2\2\2\u0216\u0203\3\2"+
		"\2\2\u0216\u0204\3\2\2\2\u0216\u0205\3\2\2\2\u0216\u0206\3\2\2\2\u0216"+
		"\u0207\3\2\2\2\u0216\u0208\3\2\2\2\u0216\u0209\3\2\2\2\u0216\u020a\3\2"+
		"\2\2\u0216\u020b\3\2\2\2\u0216\u020c\3\2\2\2\u0216\u020d\3\2\2\2\u0216"+
		"\u020e\3\2\2\2\u0216\u020f\3\2\2\2\u0216\u0210\3\2\2\2\u0216\u0211\3\2"+
		"\2\2\u0216\u0212\3\2\2\2\u0216\u0213\3\2\2\2\u0216\u0214\3\2\2\2\u0216"+
		"\u0215\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u021a\7+\2\2\u0219\u0218\3\2"+
		"\2\2\u0219\u021a\3\2\2\2\u021a\3\3\2\2\2\u021b\u021c\7\60\2\2\u021c\u021d"+
		"\7J\2\2\u021d\u0222\5\\/\2\u021e\u0220\7_\2\2\u021f\u021e\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\5*\26\2\u0222\u021f\3\2"+
		"\2\2\u0222\u0223\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0227\5\6\4\2\u0225"+
		"\u0227\5\b\5\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227\5\3\2\2\2"+
		"\u0228\u022a\5d\63\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b"+
		"\3\2\2\2\u022b\u022c\7K\2\2\u022c\u0231\5\20\t\2\u022d\u022e\7%\2\2\u022e"+
		"\u0230\5\20\t\2\u022f\u022d\3\2\2\2\u0230\u0233\3\2\2\2\u0231\u022f\3"+
		"\2\2\2\u0231\u0232\3\2\2\2\u0232\7\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0236"+
		"\5d\63\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237"+
		"\u0238\5\34\17\2\u0238\t\3\2\2\2\u0239\u023a\7\61\2\2\u023a\u023b\5\62"+
		"\32\2\u023b\u023d\5\16\b\2\u023c\u023e\5<\37\2\u023d\u023c\3\2\2\2\u023d"+
		"\u023e\3\2\2\2\u023e\13\3\2\2\2\u023f\u0240\5^\60\2\u0240\u0241\7\30\2"+
		"\2\u0241\u0242\5\22\n\2\u0242\r\3\2\2\2\u0243\u0244\7;\2\2\u0244\u0249"+
		"\5\f\7\2\u0245\u0246\7%\2\2\u0246\u0248\5\f\7\2\u0247\u0245\3\2\2\2\u0248"+
		"\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\17\3\2\2"+
		"\2\u024b\u0249\3\2\2\2\u024c\u024d\7\37\2\2\u024d\u0252\5\22\n\2\u024e"+
		"\u024f\7%\2\2\u024f\u0251\5\22\n\2\u0250\u024e\3\2\2\2\u0251\u0254\3\2"+
		"\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254"+
		"\u0252\3\2\2\2\u0255\u0256\7 \2\2\u0256\u025a\3\2\2\2\u0257\u0258\7\37"+
		"\2\2\u0258\u025a\7 \2\2\u0259\u024c\3\2\2\2\u0259\u0257\3\2\2\2\u025a"+
		"\21\3\2\2\2\u025b\u025e\5p9\2\u025c\u025e\7\u0098\2\2\u025d\u025b\3\2"+
		"\2\2\u025d\u025c\3\2\2\2\u025e\23\3\2\2\2\u025f\u0262\7\62\2\2\u0260\u0263"+
		"\5\26\f\2\u0261\u0263\5\30\r\2\u0262\u0260\3\2\2\2\u0262\u0261\3\2\2\2"+
		"\u0263\u0265\3\2\2\2\u0264\u0266\5<\37\2\u0265\u0264\3\2\2\2\u0265\u0266"+
		"\3\2\2\2\u0266\25\3\2\2\2\u0267\u0269\7T\2\2\u0268\u0267\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u026c\7\37\2\2\u026b\u026a\3"+
		"\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026f\5\\/\2\u026e"+
		"\u0270\7 \2\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0275\3\2"+
		"\2\2\u0271\u0273\7_\2\2\u0272\u0271\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0276\5*\26\2\u0275\u0272\3\2\2\2\u0275\u0276\3\2"+
		"\2\2\u0276\27\3\2\2\2\u0277\u0278\5\32\16\2\u0278\u0279\7T\2\2\u0279\u027a"+
		"\5\62\32\2\u027a\u0281\3\2\2\2\u027b\u027c\7T\2\2\u027c\u027d\5\32\16"+
		"\2\u027d\u027e\7]\2\2\u027e\u027f\5\62\32\2\u027f\u0281\3\2\2\2\u0280"+
		"\u0277\3\2\2\2\u0280\u027b\3\2\2\2\u0281\31\3\2\2\2\u0282\u0284\5\\/\2"+
		"\u0283\u0285\7\25\2\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u028d"+
		"\3\2\2\2\u0286\u0287\7%\2\2\u0287\u0289\5\\/\2\u0288\u028a\7\25\2\2\u0289"+
		"\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\3\2\2\2\u028b\u0286\3\2"+
		"\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e"+
		"\33\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0291\5\36\20\2\u0291\35\3\2\2\2"+
		"\u0292\u029a\5 \21\2\u0293\u0295\7M\2\2\u0294\u0296\t\2\2\2\u0295\u0294"+
		"\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299\5 \21\2\u0298"+
		"\u0293\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2"+
		"\2\2\u029b\37\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u029f\7/\2\2\u029e\u02a0"+
		"\5\"\22\2\u029f\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2"+
		"\u02a1\u02a3\5$\23\2\u02a2\u02a4\5\60\31\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4"+
		"\3\2\2\2\u02a4\u02a6\3\2\2\2\u02a5\u02a7\5<\37\2\u02a6\u02a5\3\2\2\2\u02a6"+
		"\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02aa\5> \2\u02a9\u02a8\3\2\2"+
		"\2\u02a9\u02aa\3\2\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02ad\5@!\2\u02ac\u02ab"+
		"\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02af\3\2\2\2\u02ae\u02b0\5\u009aN"+
		"\2\u02af\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0!\3\2\2\2\u02b1\u02b2"+
		"\t\2\2\2\u02b2#\3\2\2\2\u02b3\u02b6\5,\27\2\u02b4\u02b6\5&\24\2\u02b5"+
		"\u02b3\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b6\u02bb\3\2\2\2\u02b7\u02b8\7%"+
		"\2\2\u02b8\u02ba\5&\24\2\u02b9\u02b7\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb"+
		"\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc%\3\2\2\2\u02bd\u02bb\3\2\2\2"+
		"\u02be\u02c2\5(\25\2\u02bf\u02c2\5^\60\2\u02c0\u02c2\5p9\2\u02c1\u02be"+
		"\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c0\3\2\2\2\u02c2\u02c7\3\2\2\2\u02c3"+
		"\u02c5\7_\2\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\3\2"+
		"\2\2\u02c6\u02c8\5*\26\2\u02c7\u02c4\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8"+
		"\u02cb\3\2\2\2\u02c9\u02cb\5.\30\2\u02ca\u02c1\3\2\2\2\u02ca\u02c9\3\2"+
		"\2\2\u02cb\'\3\2\2\2\u02cc\u02ce\7\u00bf\2\2\u02cd\u02cf\7\37\2\2\u02ce"+
		"\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\5p"+
		"9\2\u02d1\u02d3\7 \2\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4"+
		"\3\2\2\2\u02d4\u02d5\7\u0185\2\2\u02d5\u02d6\7\37\2\2\u02d6\u02d7\7 \2"+
		"\2\u02d7\u02d8\7\u00fb\2\2\u02d8\u02d9\7\37\2\2\u02d9\u02da\5\u009aN\2"+
		"\u02da\u02db\7 \2\2\u02db)\3\2\2\2\u02dc\u02df\5V,\2\u02dd\u02df\7\u019a"+
		"\2\2\u02de\u02dc\3\2\2\2\u02de\u02dd\3\2\2\2\u02df+\3\2\2\2\u02e0\u02e1"+
		"\7\21\2\2\u02e1-\3\2\2\2\u02e2\u02e3\5V,\2\u02e3\u02e4\7\25\2\2\u02e4"+
		"/\3\2\2\2\u02e5\u02e6\7T\2\2\u02e6\u02e7\5\62\32\2\u02e7\61\3\2\2\2\u02e8"+
		"\u02ed\5\64\33\2\u02e9\u02ea\7%\2\2\u02ea\u02ec\5\64\33\2\u02eb\u02e9"+
		"\3\2\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"\63\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f4\5\66\34\2\u02f1\u02f3\58\35"+
		"\2\u02f2\u02f1\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5"+
		"\3\2\2\2\u02f5\65\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02fc\5\\/\2\u02f8"+
		"\u02fa\7_\2\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2"+
		"\2\2\u02fb\u02fd\5*\26\2\u02fc\u02f9\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd"+
		"\u030b\3\2\2\2\u02fe\u0300\5B\"\2\u02ff\u0301\7_\2\2\u0300\u02ff\3\2\2"+
		"\2\u0300\u0301\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0304\5*\26\2\u0303\u0305"+
		"\5d\63\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u030b\3\2\2\2\u0306"+
		"\u0307\7\37\2\2\u0307\u0308\5\62\32\2\u0308\u0309\7 \2\2\u0309\u030b\3"+
		"\2\2\2\u030a\u02f7\3\2\2\2\u030a\u02fe\3\2\2\2\u030a\u0306\3\2\2\2\u030b"+
		"\67\3\2\2\2\u030c\u030e\7U\2\2\u030d\u030c\3\2\2\2\u030d\u030e\3\2\2\2"+
		"\u030e\u0310\3\2\2\2\u030f\u0311\t\3\2\2\u0310\u030f\3\2\2\2\u0310\u0311"+
		"\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\7V\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u0316\5\66\34\2\u0315\u0317\5:\36\2\u0316\u0315\3\2\2\2\u0316\u0317\3"+
		"\2\2\2\u0317\u0325\3\2\2\2\u0318\u031a\7U\2\2\u0319\u0318\3\2\2\2\u0319"+
		"\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031d\t\4\2\2\u031c\u031e\7Y"+
		"\2\2\u031d\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u0320\7V\2\2\u0320\u0322\5\66\34\2\u0321\u0323\5:\36\2\u0322\u0321\3"+
		"\2\2\2\u0322\u0323\3\2\2\2\u0323\u0325\3\2\2\2\u0324\u030d\3\2\2\2\u0324"+
		"\u0319\3\2\2\2\u03259\3\2\2\2\u0326\u0327\7`\2\2\u0327\u032b\5p9\2\u0328"+
		"\u0329\7]\2\2\u0329\u032b\5d\63\2\u032a\u0326\3\2\2\2\u032a\u0328\3\2"+
		"\2\2\u032b;\3\2\2\2\u032c\u032d\7^\2\2\u032d\u032e\5p9\2\u032e=\3\2\2"+
		"\2\u032f\u0330\7t\2\2\u0330\u0331\7u\2\2\u0331\u0336\5\u009cO\2\u0332"+
		"\u0333\7%\2\2\u0333\u0335\5\u009cO\2\u0334\u0332\3\2\2\2\u0335\u0338\3"+
		"\2\2\2\u0336\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337?\3\2\2\2\u0338\u0336"+
		"\3\2\2\2\u0339\u033a\7x\2\2\u033a\u033b\5p9\2\u033bA\3\2\2\2\u033c\u033d"+
		"\7\37\2\2\u033d\u033e\5\36\20\2\u033e\u033f\7 \2\2\u033fC\3\2\2\2\u0340"+
		"\u0341\7)\2\2\u0341E\3\2\2\2\u0342\u034a\5H%\2\u0343\u034a\5J&\2\u0344"+
		"\u034a\5L\'\2\u0345\u034a\5N(\2\u0346\u034a\5P)\2\u0347\u034a\5R*\2\u0348"+
		"\u034a\5T+\2\u0349\u0342\3\2\2\2\u0349\u0343\3\2\2\2\u0349\u0344\3\2\2"+
		"\2\u0349\u0345\3\2\2\2\u0349\u0346\3\2\2\2\u0349\u0347\3\2\2\2\u0349\u0348"+
		"\3\2\2\2\u034aG\3\2\2\2\u034b\u034c\7\u019a\2\2\u034cI\3\2\2\2\u034d\u034f"+
		"\7\20\2\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350\3\2\2\2"+
		"\u0350\u0351\7\u019b\2\2\u0351K\3\2\2\2\u0352\u0353\t\5\2\2\u0353\u035a"+
		"\7\u019a\2\2\u0354\u0355\7!\2\2\u0355\u0356\5V,\2\u0356\u0357\7\u019a"+
		"\2\2\u0357\u0358\7\"\2\2\u0358\u035a\3\2\2\2\u0359\u0352\3\2\2\2\u0359"+
		"\u0354\3\2\2\2\u035aM\3\2\2\2\u035b\u035c\7\u019c\2\2\u035cO\3\2\2\2\u035d"+
		"\u035e\7\u019d\2\2\u035eQ\3\2\2\2\u035f\u0360\t\6\2\2\u0360S\3\2\2\2\u0361"+
		"\u0362\7j\2\2\u0362U\3\2\2\2\u0363\u0366\7\u0199\2\2\u0364\u0366\5X-\2"+
		"\u0365\u0363\3\2\2\2\u0365\u0364\3\2\2\2\u0366W\3\2\2\2\u0367\u0368\t"+
		"\7\2\2\u0368Y\3\2\2\2\u0369\u036a\5V,\2\u036a[\3\2\2\2\u036b\u036c\5`"+
		"\61\2\u036c\u036d\7\24\2\2\u036d\u036f\3\2\2\2\u036e\u036b\3\2\2\2\u036e"+
		"\u036f\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0371\5b\62\2\u0371]\3\2\2\2"+
		"\u0372\u0373\5`\61\2\u0373\u0374\7\24\2\2\u0374\u0376\3\2\2\2\u0375\u0372"+
		"\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\5b\62\2\u0378"+
		"_\3\2\2\2\u0379\u037a\5V,\2\u037aa\3\2\2\2\u037b\u037c\5V,\2\u037cc\3"+
		"\2\2\2\u037d\u037e\7\37\2\2\u037e\u0383\5\u00ba^\2\u037f\u0380\7%\2\2"+
		"\u0380\u0382\5\u00ba^\2\u0381\u037f\3\2\2\2\u0382\u0385\3\2\2\2\u0383"+
		"\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0386\3\2\2\2\u0385\u0383\3\2"+
		"\2\2\u0386\u0387\7 \2\2\u0387e\3\2\2\2\u0388\u038a\7\37\2\2\u0389\u0388"+
		"\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u0390\5\\/\2\u038c"+
		"\u038d\7%\2\2\u038d\u038f\5\\/\2\u038e\u038c\3\2\2\2\u038f\u0392\3\2\2"+
		"\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390"+
		"\3\2\2\2\u0393\u0395\7 \2\2\u0394\u0393\3\2\2\2\u0394\u0395\3\2\2\2\u0395"+
		"g\3\2\2\2\u0396\u0397\5V,\2\u0397i\3\2\2\2\u0398\u0399\t\b\2\2\u0399k"+
		"\3\2\2\2\u039a\u03a0\7\37\2\2\u039b\u039e\7\u019b\2\2\u039c\u039d\7%\2"+
		"\2\u039d\u039f\7\u019b\2\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f"+
		"\u03a1\3\2\2\2\u03a0\u039b\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a2\3\2"+
		"\2\2\u03a2\u03a3\7 \2\2\u03a3m\3\2\2\2\u03a4\u03a6\7@\2\2\u03a5\u03a4"+
		"\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8\7C\2\2\u03a8"+
		"o\3\2\2\2\u03a9\u03aa\b9\1\2\u03aa\u03ab\5t;\2\u03ab\u03ac\5p9\5\u03ac"+
		"\u03b3\3\2\2\2\u03ad\u03ae\7\37\2\2\u03ae\u03af\5p9\2\u03af\u03b0\7 \2"+
		"\2\u03b0\u03b3\3\2\2\2\u03b1\u03b3\5v<\2\u03b2\u03a9\3\2\2\2\u03b2\u03ad"+
		"\3\2\2\2\u03b2\u03b1\3\2\2\2\u03b3\u03ba\3\2\2\2\u03b4\u03b5\f\6\2\2\u03b5"+
		"\u03b6\5r:\2\u03b6\u03b7\5p9\7\u03b7\u03b9\3\2\2\2\u03b8\u03b4\3\2\2\2"+
		"\u03b9\u03bc\3\2\2\2\u03ba\u03b8\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bbq\3"+
		"\2\2\2\u03bc\u03ba\3\2\2\2\u03bd\u03be\t\t\2\2\u03bes\3\2\2\2\u03bf\u03c0"+
		"\t\n\2\2\u03c0u\3\2\2\2\u03c1\u03c2\b<\1\2\u03c2\u03c3\5z>\2\u03c3\u03d8"+
		"\3\2\2\2\u03c4\u03c5\f\7\2\2\u03c5\u03c7\7h\2\2\u03c6\u03c8\7i\2\2\u03c7"+
		"\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03d7\t\13"+
		"\2\2\u03ca\u03cb\f\6\2\2\u03cb\u03cc\7\26\2\2\u03cc\u03d7\5z>\2\u03cd"+
		"\u03ce\f\5\2\2\u03ce\u03cf\5x=\2\u03cf\u03d0\5z>\2\u03d0\u03d7\3\2\2\2"+
		"\u03d1\u03d2\f\4\2\2\u03d2\u03d3\5x=\2\u03d3\u03d4\t\f\2\2\u03d4\u03d5"+
		"\5B\"\2\u03d5\u03d7\3\2\2\2\u03d6\u03c4\3\2\2\2\u03d6\u03ca\3\2\2\2\u03d6"+
		"\u03cd\3\2\2\2\u03d6\u03d1\3\2\2\2\u03d7\u03da\3\2\2\2\u03d8\u03d6\3\2"+
		"\2\2\u03d8\u03d9\3\2\2\2\u03d9w\3\2\2\2\u03da\u03d8\3\2\2\2\u03db\u03dc"+
		"\t\r\2\2\u03dcy\3\2\2\2\u03dd\u03df\5|?\2\u03de\u03e0\7i\2\2\u03df\u03de"+
		"\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\7o\2\2\u03e2"+
		"\u03e3\5B\"\2\u03e3\u0409\3\2\2\2\u03e4\u03e6\5|?\2\u03e5\u03e7\7i\2\2"+
		"\u03e6\u03e5\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9"+
		"\7o\2\2\u03e9\u03ea\7\37\2\2\u03ea\u03ef\5p9\2\u03eb\u03ec\7%\2\2\u03ec"+
		"\u03ee\5p9\2\u03ed\u03eb\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03ed\3\2\2"+
		"\2\u03ef\u03f0\3\2\2\2\u03f0\u03f2\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2\u03f3"+
		"\7 \2\2\u03f3\u0409\3\2\2\2\u03f4\u03f6\5|?\2\u03f5\u03f7\7i\2\2\u03f6"+
		"\u03f5\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\7n"+
		"\2\2\u03f9\u03fa\5|?\2\u03fa\u03fb\7f\2\2\u03fb\u03fc\5z>\2\u03fc\u0409"+
		"\3\2\2\2\u03fd\u03ff\5|?\2\u03fe\u0400\7i\2\2\u03ff\u03fe\3\2\2\2\u03ff"+
		"\u0400\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402\7r\2\2\u0402\u0405\5~@"+
		"\2\u0403\u0404\7\u00ba\2\2\u0404\u0406\5~@\2\u0405\u0403\3\2\2\2\u0405"+
		"\u0406\3\2\2\2\u0406\u0409\3\2\2\2\u0407\u0409\5|?\2\u0408\u03dd\3\2\2"+
		"\2\u0408\u03e4\3\2\2\2\u0408\u03f4\3\2\2\2\u0408\u03fd\3\2\2\2\u0408\u0407"+
		"\3\2\2\2\u0409{\3\2\2\2\u040a\u040b\b?\1\2\u040b\u040c\5~@\2\u040c\u042d"+
		"\3\2\2\2\u040d\u040e\f\r\2\2\u040e\u040f\7\b\2\2\u040f\u042c\5|?\16\u0410"+
		"\u0411\f\f\2\2\u0411\u0412\7\t\2\2\u0412\u042c\5|?\r\u0413\u0414\f\13"+
		"\2\2\u0414\u0415\7\n\2\2\u0415\u042c\5|?\f\u0416\u0417\f\n\2\2\u0417\u0418"+
		"\7\13\2\2\u0418\u042c\5|?\13\u0419\u041a\f\t\2\2\u041a\u041b\7\17\2\2"+
		"\u041b\u042c\5|?\n\u041c\u041d\f\b\2\2\u041d\u041e\7\20\2\2\u041e\u042c"+
		"\5|?\t\u041f\u0420\f\7\2\2\u0420\u0421\7\21\2\2\u0421\u042c\5|?\b\u0422"+
		"\u0423\f\6\2\2\u0423\u0424\7\22\2\2\u0424\u042c\5|?\7\u0425\u0426\f\5"+
		"\2\2\u0426\u0427\7\r\2\2\u0427\u042c\5|?\6\u0428\u0429\f\4\2\2\u0429\u042a"+
		"\7\f\2\2\u042a\u042c\5|?\5\u042b\u040d\3\2\2\2\u042b\u0410\3\2\2\2\u042b"+
		"\u0413\3\2\2\2\u042b\u0416\3\2\2\2\u042b\u0419\3\2\2\2\u042b\u041c\3\2"+
		"\2\2\u042b\u041f\3\2\2\2\u042b\u0422\3\2\2\2\u042b\u0425\3\2\2\2\u042b"+
		"\u0428\3\2\2\2\u042c\u042f\3\2\2\2\u042d\u042b\3\2\2\2\u042d\u042e\3\2"+
		"\2\2\u042e}\3\2\2\2\u042f\u042d\3\2\2\2\u0430\u0431\b@\1\2\u0431\u0451"+
		"\5\u0080A\2\u0432\u0451\5D#\2\u0433\u0451\5F$\2\u0434\u0451\5^\60\2\u0435"+
		"\u0436\t\16\2\2\u0436\u0451\5~@\b\u0437\u0439\7\u00c0\2\2\u0438\u0437"+
		"\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u043b\7\37\2\2"+
		"\u043b\u0440\5p9\2\u043c\u043d\7%\2\2\u043d\u043f\5p9\2\u043e\u043c\3"+
		"\2\2\2\u043f\u0442\3\2\2\2\u0440\u043e\3\2\2\2\u0440\u0441\3\2\2\2\u0441"+
		"\u0443\3\2\2\2\u0442\u0440\3\2\2\2\u0443\u0444\7 \2\2\u0444\u0451\3\2"+
		"\2\2\u0445\u0447\7m\2\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447"+
		"\u0448\3\2\2\2\u0448\u0451\5B\"\2\u0449\u044a\7!\2\2\u044a\u044b\5V,\2"+
		"\u044b\u044c\5p9\2\u044c\u044d\7\"\2\2\u044d\u0451\3\2\2\2\u044e\u0451"+
		"\5\u0092J\2\u044f\u0451\5\u0098M\2\u0450\u0430\3\2\2\2\u0450\u0432\3\2"+
		"\2\2\u0450\u0433\3\2\2\2\u0450\u0434\3\2\2\2\u0450\u0435\3\2\2\2\u0450"+
		"\u0438\3\2\2\2\u0450\u0446\3\2\2\2\u0450\u0449\3\2\2\2\u0450\u044e\3\2"+
		"\2\2\u0450\u044f\3\2\2\2\u0451\u0457\3\2\2\2\u0452\u0453\f\t\2\2\u0453"+
		"\u0454\7\5\2\2\u0454\u0456\5~@\n\u0455\u0452\3\2\2\2\u0456\u0459\3\2\2"+
		"\2\u0457\u0455\3\2\2\2\u0457\u0458\3\2\2\2\u0458\177\3\2\2\2\u0459\u0457"+
		"\3\2\2\2\u045a\u045e\5\u0082B\2\u045b\u045e\5\u0088E\2\u045c\u045e\5\u008e"+
		"H\2\u045d\u045a\3\2\2\2\u045d\u045b\3\2\2\2\u045d\u045c\3\2\2\2\u045e"+
		"\u0081\3\2\2\2\u045f\u0460\5\u0084C\2\u0460\u0462\7\37\2\2\u0461\u0463"+
		"\5\u0086D\2\u0462\u0461\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u046d\3\2\2"+
		"\2\u0464\u0469\5p9\2\u0465\u0466\7%\2\2\u0466\u0468\5p9\2\u0467\u0465"+
		"\3\2\2\2\u0468\u046b\3\2\2\2\u0469\u0467\3\2\2\2\u0469\u046a\3\2\2\2\u046a"+
		"\u046e\3\2\2\2\u046b\u0469\3\2\2\2\u046c\u046e\7\21\2\2\u046d\u0464\3"+
		"\2\2\2\u046d\u046c\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u046f\3\2\2\2\u046f"+
		"\u0470\7 \2\2\u0470\u0083\3\2\2\2\u0471\u0472\t\17\2\2\u0472\u0085\3\2"+
		"\2\2\u0473\u0474\7N\2\2\u0474\u0087\3\2\2\2\u0475\u0478\5\u008aF\2\u0476"+
		"\u0478\5\u008cG\2\u0477\u0475\3\2\2\2\u0477\u0476\3\2\2\2\u0478\u0089"+
		"\3\2\2\2\u0479\u047a\7Q\2\2\u047a\u047b\7\37\2\2\u047b\u047c\5p9\2\u047c"+
		"\u047d\7_\2\2\u047d\u047e\5\u009eP\2\u047e\u047f\7 \2\2\u047f\u008b\3"+
		"\2\2\2\u0480\u0481\7\u0081\2\2\u0481\u0482\7\37\2\2\u0482\u0487\5p9\2"+
		"\u0483\u0484\7%\2\2\u0484\u0486\5p9\2\u0485\u0483\3\2\2\2\u0486\u0489"+
		"\3\2\2\2\u0487\u0485\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u048c\3\2\2\2\u0489"+
		"\u0487\3\2\2\2\u048a\u048b\7]\2\2\u048b\u048d\5\u00d4k\2\u048c\u048a\3"+
		"\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f\7 \2\2\u048f"+
		"\u008d\3\2\2\2\u0490\u0491\5\u0090I\2\u0491\u049b\7\37\2\2\u0492\u0497"+
		"\5p9\2\u0493\u0494\7%\2\2\u0494\u0496\5p9\2\u0495\u0493\3\2\2\2\u0496"+
		"\u0499\3\2\2\2\u0497\u0495\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u049c\3\2"+
		"\2\2\u0499\u0497\3\2\2\2\u049a\u049c\7\21\2\2\u049b\u0492\3\2\2\2\u049b"+
		"\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\7 "+
		"\2\2\u049e\u008f\3\2\2\2\u049f\u04a5\5V,\2\u04a0\u04a5\7a\2\2\u04a1\u04a5"+
		"\7\u0088\2\2\u04a2\u04a5\7\u0089\2\2\u04a3\u04a5\7\u0084\2\2\u04a4\u049f"+
		"\3\2\2\2\u04a4\u04a0\3\2\2\2\u04a4\u04a1\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a4"+
		"\u04a3\3\2\2\2\u04a5\u0091\3\2\2\2\u04a6\u04a8\7O\2\2\u04a7\u04a9\5~@"+
		"\2\u04a8\u04a7\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04ab\3\2\2\2\u04aa\u04ac"+
		"\5\u0094K\2\u04ab\u04aa\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ab\3\2\2"+
		"\2\u04ad\u04ae\3\2\2\2\u04ae\u04b0\3\2\2\2\u04af\u04b1\5\u0096L\2\u04b0"+
		"\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u0093\3\2\2\2\u04b2\u04b3\7P"+
		"\2\2\u04b3\u04b4\5p9\2\u04b4\u04b5\7c\2\2\u04b5\u04b6\5p9\2\u04b6\u0095"+
		"\3\2\2\2\u04b7\u04b8\7b\2\2\u04b8\u04b9\5p9\2\u04b9\u0097\3\2\2\2\u04ba"+
		"\u04bf\5\u00a8U\2\u04bb\u04bf\5\u00a2R\2\u04bc\u04bf\5\u00a4S\2\u04bd"+
		"\u04bf\5\u00a6T\2\u04be\u04ba\3\2\2\2\u04be\u04bb\3\2\2\2\u04be\u04bc"+
		"\3\2\2\2\u04be\u04bd\3\2\2\2\u04bf\u0099\3\2\2\2\u04c0\u04c1\7s\2\2\u04c1"+
		"\u04c2\7u\2\2\u04c2\u04c7\5\u009cO\2\u04c3\u04c4\7%\2\2\u04c4\u04c6\5"+
		"\u009cO\2\u04c5\u04c3\3\2\2\2\u04c6\u04c9\3\2\2\2\u04c7\u04c5\3\2\2\2"+
		"\u04c7\u04c8\3\2\2\2\u04c8\u04d5\3\2\2\2\u04c9\u04c7\3\2\2\2\u04ca\u04cb"+
		"\7z\2\2\u04cb\u04cc\5p9\2\u04cc\u04d3\t\20\2\2\u04cd\u04ce\7\u0186\2\2"+
		"\u04ce\u04cf\t\21\2\2\u04cf\u04d0\5p9\2\u04d0\u04d1\t\20\2\2\u04d1\u04d2"+
		"\7\u0188\2\2\u04d2\u04d4\3\2\2\2\u04d3\u04cd\3\2\2\2\u04d3\u04d4\3\2\2"+
		"\2\u04d4\u04d6\3\2\2\2\u04d5\u04ca\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u009b"+
		"\3\2\2\2\u04d7\u04db\5^\60\2\u04d8\u04db\5J&\2\u04d9\u04db\5p9\2\u04da"+
		"\u04d7\3\2\2\2\u04da\u04d8\3\2\2\2\u04da\u04d9\3\2\2\2\u04db\u04dd\3\2"+
		"\2\2\u04dc\u04de\t\22\2\2\u04dd\u04dc\3\2\2\2\u04dd\u04de\3\2\2\2\u04de"+
		"\u009d\3\2\2\2\u04df\u04eb\5\u00a0Q\2\u04e0\u04ec\5l\67\2\u04e1\u04e2"+
		"\7\37\2\2\u04e2\u04e3\7\u0093\2\2\u04e3\u04ec\7 \2\2\u04e4\u04e6\7\37"+
		"\2\2\u04e5\u04e7\t\23\2\2\u04e6\u04e5\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7"+
		"\u04e8\3\2\2\2\u04e8\u04e9\5\u00d4k\2\u04e9\u04ea\7 \2\2\u04ea\u04ec\3"+
		"\2\2\2\u04eb\u04e0\3\2\2\2\u04eb\u04e1\3\2\2\2\u04eb\u04e4\3\2\2\2\u04eb"+
		"\u04ec\3\2\2\2\u04ec\u009f\3\2\2\2\u04ed\u04ee\t\24\2\2\u04ee\u00a1\3"+
		"\2\2\2\u04ef\u04f3\7\u0199\2\2\u04f0\u04f1\7L\2\2\u04f1\u04f2\7\u0086"+
		"\2\2\u04f2\u04f4\7\u010e\2\2\u04f3\u04f0\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4"+
		"\u04f5\3\2\2\2\u04f5\u04f6\7\u019a\2\2\u04f6\u00a3\3\2\2\2\u04f7\u04f8"+
		"\7Q\2\2\u04f8\u04f9\7\37\2\2\u04f9\u04fa\5p9\2\u04fa\u04fb\7_\2\2\u04fb"+
		"\u04ff\5\u009eP\2\u04fc\u04fd\7\37\2\2\u04fd\u04fe\7\u019b\2\2\u04fe\u0500"+
		"\7 \2\2\u04ff\u04fc\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0501\3\2\2\2\u0501"+
		"\u0502\7 \2\2\u0502\u00a5\3\2\2\2\u0503\u0504\7\u00d9\2\2\u0504\u0508"+
		"\5\u009eP\2\u0505\u0506\7\37\2\2\u0506\u0507\7\u019b\2\2\u0507\u0509\7"+
		" \2\2\u0508\u0505\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050a\3\2\2\2\u050a"+
		"\u050b\7%\2\2\u050b\u050e\5p9\2\u050c\u050d\7%\2\2\u050d\u050f\7\u019b"+
		"\2\2\u050e\u050c\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u00a7\3\2\2\2\u0510"+
		"\u0511\5\u0080A\2\u0511\u0512\5\u00aaV\2\u0512\u00a9\3\2\2\2\u0513\u0514"+
		"\7\u00fb\2\2\u0514\u0516\7\37\2\2\u0515\u0517\5\u00acW\2\u0516\u0515\3"+
		"\2\2\2\u0516\u0517\3\2\2\2\u0517\u0519\3\2\2\2\u0518\u051a\5\u009aN\2"+
		"\u0519\u0518\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051c\3\2\2\2\u051b\u051d"+
		"\5\u00aeX\2\u051c\u051b\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051e\3\2\2"+
		"\2\u051e\u051f\7 \2\2\u051f\u00ab\3\2\2\2\u0520\u0521\7\u00bd\2\2\u0521"+
		"\u0522\7u\2\2\u0522\u0527\5p9\2\u0523\u0524\7%\2\2\u0524\u0526\5p9\2\u0525"+
		"\u0523\3\2\2\2\u0526\u0529\3\2\2\2\u0527\u0525\3\2\2\2\u0527\u0528\3\2"+
		"\2\2\u0528\u00ad\3\2\2\2\u0529\u0527\3\2\2\2\u052a\u052b\t\25\2\2\u052b"+
		"\u052c\5\u00b0Y\2\u052c\u00af\3\2\2\2\u052d\u0530\5\u00b6\\\2\u052e\u0530"+
		"\5\u00b2Z\2\u052f\u052d\3\2\2\2\u052f\u052e\3\2\2\2\u0530\u00b1\3\2\2"+
		"\2\u0531\u0532\7n\2\2\u0532\u0533\5\u00b4[\2\u0533\u0534\7f\2\2\u0534"+
		"\u0535\5\u00b4[\2\u0535\u00b3\3\2\2\2\u0536\u0539\5\u00b6\\\2\u0537\u0539"+
		"\5\u00b8]\2\u0538\u0536\3\2\2\2\u0538\u0537\3\2\2\2\u0539\u00b5\3\2\2"+
		"\2\u053a\u053b\7\u00f0\2\2\u053b\u0541\7\u0100\2\2\u053c\u053d\7\u019b"+
		"\2\2\u053d\u0541\7\u0100\2\2\u053e\u053f\7\u0099\2\2\u053f\u0541\7\u00c0"+
		"\2\2\u0540\u053a\3\2\2\2\u0540\u053c\3\2\2\2\u0540\u053e\3\2\2\2\u0541"+
		"\u00b7\3\2\2\2\u0542\u0543\7\u00f0\2\2\u0543\u0549\7\u00ea\2\2\u0544\u0545"+
		"\7\u019b\2\2\u0545\u0549\7\u00ea\2\2\u0546\u0547\7\u0099\2\2\u0547\u0549"+
		"\7\u00c0\2\2\u0548\u0542\3\2\2\2\u0548\u0544\3\2\2\2\u0548\u0546\3\2\2"+
		"\2\u0549\u00b9\3\2\2\2\u054a\u054c\5^\60\2\u054b\u054d\t\22\2\2\u054c"+
		"\u054b\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u00bb\3\2\2\2\u054e\u054f\7\u00e9"+
		"\2\2\u054f\u0550\7\30\2\2\u0550\u055c\7\u019b\2\2\u0551\u055c\5\u00c2"+
		"b\2\u0552\u0553\t\26\2\2\u0553\u055c\5\u00c0a\2\u0554\u0555\7\u00f4\2"+
		"\2\u0555\u0556\7\30\2\2\u0556\u055c\7\u019b\2\2\u0557\u0559\5\u00be`\2"+
		"\u0558\u055a\5\u00c8e\2\u0559\u0558\3\2\2\2\u0559\u055a\3\2\2\2\u055a"+
		"\u055c\3\2\2\2\u055b\u054e\3\2\2\2\u055b\u0551\3\2\2\2\u055b\u0552\3\2"+
		"\2\2\u055b\u0554\3\2\2\2\u055b\u0557\3\2\2\2\u055c\u00bd\3\2\2\2\u055d"+
		"\u055e\7\u0166\2\2\u055e\u055f\7\30\2\2\u055f\u0560\t\27\2\2\u0560\u00bf"+
		"\3\2\2\2\u0561\u0562\7\30\2\2\u0562\u0564\7\u019b\2\2\u0563\u0565\7\u00df"+
		"\2\2\u0564\u0563\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u00c1\3\2\2\2\u0566"+
		"\u0567\5\u00c4c\2\u0567\u0568\5\u00c6d\2\u0568\u00c3\3\2\2\2\u0569\u056a"+
		"\t\30\2\2\u056a\u00c5\3\2\2\2\u056b\u056c\7\30\2\2\u056c\u056d\t\31\2"+
		"\2\u056d\u00c7\3\2\2\2\u056e\u056f\7`\2\2\u056f\u0570\7\u00be\2\2\u0570"+
		"\u0571\7\37\2\2\u0571\u0572\5\u00caf\2\u0572\u0573\7 \2\2\u0573\u00c9"+
		"\3\2\2\2\u0574\u0579\5\u00ccg\2\u0575\u0576\7%\2\2\u0576\u0578\5\u00cc"+
		"g\2\u0577\u0575\3\2\2\2\u0578\u057b\3\2\2\2\u0579\u0577\3\2\2\2\u0579"+
		"\u057a\3\2\2\2\u057a\u00cb\3\2\2\2\u057b\u0579\3\2\2\2\u057c\u057f\7\u019b"+
		"\2\2\u057d\u057f\5\u00ceh\2\u057e\u057c\3\2\2\2\u057e\u057d\3\2\2\2\u057f"+
		"\u00cd\3\2\2\2\u0580\u0581\7\u019b\2\2\u0581\u0582\7e\2\2\u0582\u0583"+
		"\7\u019b\2\2\u0583\u00cf\3\2\2\2\u0584\u0585\7\u016c\2\2\u0585\u0586\7"+
		"\37\2\2\u0586\u0587\7\u0175\2\2\u0587\u0588\7\30\2\2\u0588\u058a\7\u019b"+
		"\2\2\u0589\u058b\7\u00df\2\2\u058a\u0589\3\2\2\2\u058a\u058b\3\2\2\2\u058b"+
		"\u058c\3\2\2\2\u058c\u058d\7%\2\2\u058d\u058e\7\u015c\2\2\u058e\u058f"+
		"\7\30\2\2\u058f\u0590\t\32\2\2\u0590\u0591\7 \2\2\u0591\u00d1\3\2\2\2"+
		"\u0592\u0597\7`\2\2\u0593\u0594\7\37\2\2\u0594\u0595\5\u00d0i\2\u0595"+
		"\u0596\7 \2\2\u0596\u0598\3\2\2\2\u0597\u0593\3\2\2\2\u0597\u0598\3\2"+
		"\2\2\u0598\u00d3\3\2\2\2\u0599\u059a\7\u0199\2\2\u059a\u00d5\3\2\2\2\u059b"+
		"\u05a0\5\u00d4k\2\u059c\u059d\7%\2\2\u059d\u059f\5\u00d4k\2\u059e\u059c"+
		"\3\2\2\2\u059f\u05a2\3\2\2\2\u05a0\u059e\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1"+
		"\u00d7\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a3\u05a4\7\3\2\2\u05a4\u00d9\3\2"+
		"\2\2\u05a5\u05a6\7\63\2\2\u05a6\u05a7\7<\2\2\u05a7\u05a8\5\\/\2\u05a8"+
		"\u05a9\5\u00e8u\2\u05a9\u05aa\5\u00eav\2\u05aa\u00db\3\2\2\2\u05ab\u05ac"+
		"\7\63\2\2\u05ac\u05ad\5\u0150\u00a9\2\u05ad\u05ae\7>\2\2\u05ae\u05af\5"+
		"h\65\2\u05af\u05b0\7`\2\2\u05b0\u05b1\5\\/\2\u05b1\u05b2\5d\63\2\u05b2"+
		"\u00dd\3\2\2\2\u05b3\u05b4\7\64\2\2\u05b4\u05b5\7<\2\2\u05b5\u05b6\5\\"+
		"/\2\u05b6\u05bb\5\u0152\u00aa\2\u05b7\u05b8\7%\2\2\u05b8\u05ba\5\u0152"+
		"\u00aa\2\u05b9\u05b7\3\2\2\2\u05ba\u05bd\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bb"+
		"\u05bc\3\2\2\2\u05bc\u00df\3\2\2\2\u05bd\u05bb\3\2\2\2\u05be\u05bf\7\64"+
		"\2\2\u05bf\u05c2\7>\2\2\u05c0\u05c3\5h\65\2\u05c1\u05c3\7p\2\2\u05c2\u05c0"+
		"\3\2\2\2\u05c2\u05c1\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c5\7`\2\2\u05c5"+
		"\u05c6\5\\/\2\u05c6\u00e1\3\2\2\2\u05c7\u05c8\7\65\2\2\u05c8\u05ca\7<"+
		"\2\2\u05c9\u05cb\5\u019a\u00ce\2\u05ca\u05c9\3\2\2\2\u05ca\u05cb\3\2\2"+
		"\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd\5f\64\2\u05cd\u00e3\3\2\2\2\u05ce\u05cf"+
		"\7\65\2\2\u05cf\u05d1\7>\2\2\u05d0\u05d2\5\u019a\u00ce\2\u05d1\u05d0\3"+
		"\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d4\5h\65\2\u05d4"+
		"\u05d5\7`\2\2\u05d5\u05d6\5\\/\2\u05d6\u00e5\3\2\2\2\u05d7\u05d8\7\66"+
		"\2\2\u05d8\u05d9\7<\2\2\u05d9\u05da\5\\/\2\u05da\u00e7\3\2\2\2\u05db\u05dc"+
		"\7_\2\2\u05dc\u05de\7\u00e8\2\2\u05dd\u05db\3\2\2\2\u05dd\u05de\3\2\2"+
		"\2\u05de\u00e9\3\2\2\2\u05df\u05e0\5\u00ecw\2\u05e0\u05e1\5\u013a\u009e"+
		"\2\u05e1\u05e2\5\u013c\u009f\2\u05e2\u00eb\3\2\2\2\u05e3\u05e4\7\37\2"+
		"\2\u05e4\u05e9\5\u00eex\2\u05e5\u05e6\7%\2\2\u05e6\u05e8\5\u00eex\2\u05e7"+
		"\u05e5\3\2\2\2\u05e8\u05eb\3\2\2\2\u05e9\u05e7\3\2\2\2\u05e9\u05ea\3\2"+
		"\2\2\u05ea\u05ee\3\2\2\2\u05eb\u05e9\3\2\2\2\u05ec\u05ed\7%\2\2\u05ed"+
		"\u05ef\5\u0138\u009d\2\u05ee\u05ec\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f0"+
		"\3\2\2\2\u05f0\u05f1\7 \2\2\u05f1\u00ed\3\2\2\2\u05f2\u05f8\5\u00f0y\2"+
		"\u05f3\u05f8\5\u0120\u0091\2\u05f4\u05f8\5\u0122\u0092\2\u05f5\u05f8\5"+
		"\u0124\u0093\2\u05f6\u05f8\5\u0132\u009a\2\u05f7\u05f2\3\2\2\2\u05f7\u05f3"+
		"\3\2\2\2\u05f7\u05f4\3\2\2\2\u05f7\u05f5\3\2\2\2\u05f7\u05f6\3\2\2\2\u05f8"+
		"\u00ef\3\2\2\2\u05f9\u05fa\5^\60\2\u05fa\u05fe\5\u009eP\2\u05fb\u05fd"+
		"\5\u00f2z\2\u05fc\u05fb\3\2\2\2\u05fd\u0600\3\2\2\2\u05fe\u05fc\3\2\2"+
		"\2\u05fe\u05ff\3\2\2\2\u05ff\u0601\3\2\2\2\u0600\u05fe\3\2\2\2\u0601\u0603"+
		"\5\u011e\u0090\2\u0602\u0604\5\u0114\u008b\2\u0603\u0602\3\2\2\2\u0603"+
		"\u0604\3\2\2\2\u0604\u00f1\3\2\2\2\u0605\u063b\7\u00e7\2\2\u0606\u0607"+
		"\7\u00d6\2\2\u0607\u063b\5j\66\2\u0608\u063b\7\u010a\2\2\u0609\u060a\7"+
		"\u00f3\2\2\u060a\u060b\7L\2\2\u060b\u060c\7\37\2\2\u060c\u060d\7F\2\2"+
		"\u060d\u060e\7\30\2\2\u060e\u060f\7\u019a\2\2\u060f\u063b\7 \2\2\u0610"+
		"\u0611\7?\2\2\u0611\u0613\5\u00d4k\2\u0612\u0610\3\2\2\2\u0612\u0613\3"+
		"\2\2\2\u0613\u0614\3\2\2\2\u0614\u0615\7\u0098\2\2\u0615\u063b\5p9\2\u0616"+
		"\u061c\7\u00ed\2\2\u0617\u0618\7\37\2\2\u0618\u0619\7\u019b\2\2\u0619"+
		"\u061a\7%\2\2\u061a\u061b\7\u019b\2\2\u061b\u061d\7 \2\2\u061c\u0617\3"+
		"\2\2\2\u061c\u061d\3\2\2\2\u061d\u063b\3\2\2\2\u061e\u061f\7i\2\2\u061f"+
		"\u0620\7d\2\2\u0620\u063b\7\u0105\2\2\u0621\u0622\7\u00c7\2\2\u0622\u0623"+
		"\7\u00c4\2\2\u0623\u0624\7_\2\2\u0624\u0625\7\u00c0\2\2\u0625\u0627\t"+
		"\33\2\2\u0626\u0628\7\u00bb\2\2\u0627\u0626\3\2\2\2\u0627\u0628\3\2\2"+
		"\2\u0628\u063b\3\2\2\2\u0629\u062b\7i\2\2\u062a\u0629\3\2\2\2\u062a\u062b"+
		"\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u063b\7j\2\2\u062d\u063b\7\u0107\2"+
		"\2\u062e\u062f\7\u00e5\2\2\u062f\u0630\7L\2\2\u0630\u063b\5\u00f4{\2\u0631"+
		"\u0636\5\u00f6|\2\u0632\u0633\7%\2\2\u0633\u0635\5\u00f6|\2\u0634\u0632"+
		"\3\2\2\2\u0635\u0638\3\2\2\2\u0636\u0634\3\2\2\2\u0636\u0637\3\2\2\2\u0637"+
		"\u063b\3\2\2\2\u0638\u0636\3\2\2\2\u0639\u063b\5\u0114\u008b\2\u063a\u0605"+
		"\3\2\2\2\u063a\u0606\3\2\2\2\u063a\u0608\3\2\2\2\u063a\u0609\3\2\2\2\u063a"+
		"\u0612\3\2\2\2\u063a\u0616\3\2\2\2\u063a\u061e\3\2\2\2\u063a\u0621\3\2"+
		"\2\2\u063a\u062a\3\2\2\2\u063a\u062d\3\2\2\2\u063a\u062e\3\2\2\2\u063a"+
		"\u0631\3\2\2\2\u063a\u0639\3\2\2\2\u063b\u00f3\3\2\2\2\u063c\u063d\7\37"+
		"\2\2\u063d\u063e\7\u0162\2\2\u063e\u063f\7\30\2\2\u063f\u0640\5\u00d4"+
		"k\2\u0640\u0641\7%\2\2\u0641\u0642\7\u0168\2\2\u0642\u0643\7\30\2\2\u0643"+
		"\u0644\t\34\2\2\u0644\u0645\7%\2\2\u0645\u0646\7\u00d1\2\2\u0646\u0647"+
		"\7\30\2\2\u0647\u0648\7\u019a\2\2\u0648\u0649\7 \2\2\u0649\u00f5\3\2\2"+
		"\2\u064a\u064b\7?\2\2\u064b\u064d\5\u00d4k\2\u064c\u064a\3\2\2\2\u064c"+
		"\u064d\3\2\2\2\u064d\u0651\3\2\2\2\u064e\u0652\5\u00f8}\2\u064f\u0652"+
		"\5\u010c\u0087\2\u0650\u0652\5\u0112\u008a\2\u0651\u064e\3\2\2\2\u0651"+
		"\u064f\3\2\2\2\u0651\u0650\3\2\2\2\u0652\u00f7\3\2\2\2\u0653\u0656\5n"+
		"8\2\u0654\u0656\7A\2\2\u0655\u0653\3\2\2\2\u0655\u0654\3\2\2\2\u0656\u0659"+
		"\3\2\2\2\u0657\u065a\5\u00fa~\2\u0658\u065a\5\u0108\u0085\2\u0659\u0657"+
		"\3\2\2\2\u0659\u0658\3\2\2\2\u065a\u00f9\3\2\2\2\u065b\u065d\5\u00fc\177"+
		"\2\u065c\u065b\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065f\3\2\2\2\u065e\u0660"+
		"\5\u00fe\u0080\2\u065f\u065e\3\2\2\2\u065f\u0660\3\2\2\2\u0660\u0662\3"+
		"\2\2\2\u0661\u0663\5\u0100\u0081\2\u0662\u0661\3\2\2\2\u0662\u0663\3\2"+
		"\2\2\u0663\u00fb\3\2\2\2\u0664\u0665\t\35\2\2\u0665\u00fd\3\2\2\2\u0666"+
		"\u0675\7L\2\2\u0667\u0668\7\u00e9\2\2\u0668\u0669\7\30\2\2\u0669\u0676"+
		"\7\u019b\2\2\u066a\u066b\7\37\2\2\u066b\u0670\5\u00bc_\2\u066c\u066d\7"+
		"%\2\2\u066d\u066f\5\u00bc_\2\u066e\u066c\3\2\2\2\u066f\u0672\3\2\2\2\u0670"+
		"\u066e\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u0673\3\2\2\2\u0672\u0670\3\2"+
		"\2\2\u0673\u0674\7 \2\2\u0674\u0676\3\2\2\2\u0675\u0667\3\2\2\2\u0675"+
		"\u066a\3\2\2\2\u0676\u00ff\3\2\2\2\u0677\u067b\5\u0102\u0082\2\u0678\u067b"+
		"\5\u0104\u0083\2\u0679\u067b\5\u0106\u0084\2\u067a\u0677\3\2\2\2\u067a"+
		"\u0678\3\2\2\2\u067a\u0679\3\2\2\2\u067b\u0101\3\2\2\2\u067c\u067d\7`"+
		"\2\2\u067d\u067e\5Z.\2\u067e\u067f\7\37\2\2\u067f\u0680\5^\60\2\u0680"+
		"\u0681\7 \2\2\u0681\u0103\3\2\2\2\u0682\u0683\7`\2\2\u0683\u0684\5\u00d4"+
		"k\2\u0684\u0105\3\2\2\2\u0685\u0686\7`\2\2\u0686\u0687\7\u019a\2\2\u0687"+
		"\u0107\3\2\2\2\u0688\u068a\7\u00d4\2\2\u0689\u068b\5\u010a\u0086\2\u068a"+
		"\u0689\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u0109\3\2\2\2\u068c\u068d\7L"+
		"\2\2\u068d\u068e\7\37\2\2\u068e\u068f\7\u0160\2\2\u068f\u0690\7\30\2\2"+
		"\u0690\u0691\7\u019b\2\2\u0691\u0692\7 \2\2\u0692\u010b\3\2\2\2\u0693"+
		"\u0694\7B\2\2\u0694\u0696\7C\2\2\u0695\u0693\3\2\2\2\u0695\u0696\3\2\2"+
		"\2\u0696\u0697\3\2\2\2\u0697\u0698\7\u00cb\2\2\u0698\u0699\5\\/\2\u0699"+
		"\u069a\7\37\2\2\u069a\u069b\5^\60\2\u069b\u069f\7 \2\2\u069c\u069e\5\u010e"+
		"\u0088\2\u069d\u069c\3\2\2\2\u069e\u06a1\3\2\2\2\u069f\u069d\3\2\2\2\u069f"+
		"\u06a0\3\2\2\2\u06a0\u010d\3\2\2\2\u06a1\u069f\3\2\2\2\u06a2\u06a3\7`"+
		"\2\2\u06a3\u06a4\t\36\2\2\u06a4\u06a9\5\u0110\u0089\2\u06a5\u06a6\7i\2"+
		"\2\u06a6\u06a7\7d\2\2\u06a7\u06a9\7\u0105\2\2\u06a8\u06a2\3\2\2\2\u06a8"+
		"\u06a5\3\2\2\2\u06a9\u010f\3\2\2\2\u06aa\u06ab\7\u00c8\2\2\u06ab\u06b0"+
		"\7\u00d0\2\2\u06ac\u06b0\7\u00c5\2\2\u06ad\u06ae\7;\2\2\u06ae\u06b0\t"+
		"\37\2\2\u06af\u06aa\3\2\2\2\u06af\u06ac\3\2\2\2\u06af\u06ad\3\2\2\2\u06b0"+
		"\u0111\3\2\2\2\u06b1\u06b5\7\u00c6\2\2\u06b2\u06b3\7i\2\2\u06b3\u06b4"+
		"\7d\2\2\u06b4\u06b6\7\u0105\2\2\u06b5\u06b2\3\2\2\2\u06b5\u06b6\3\2\2"+
		"\2\u06b6\u06b7\3\2\2\2\u06b7\u06b8\7\37\2\2\u06b8\u06b9\5p9\2\u06b9\u06ba"+
		"\7 \2\2\u06ba\u0113\3\2\2\2\u06bb\u06bc\7>\2\2\u06bc\u06be\5h\65\2\u06bd"+
		"\u06bf\5\u00fc\177\2\u06be\u06bd\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c1"+
		"\3\2\2\2\u06c0\u06c2\5\u0116\u008c\2\u06c1\u06c0\3\2\2\2\u06c1\u06c2\3"+
		"\2\2\2\u06c2\u06c4\3\2\2\2\u06c3\u06c5\5\u0118\u008d\2\u06c4\u06c3\3\2"+
		"\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c7\3\2\2\2\u06c6\u06c8\5\u011c\u008f"+
		"\2\u06c7\u06c6\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8\u0115\3\2\2\2\u06c9\u06ca"+
		"\7L\2\2\u06ca\u06cb\7\37\2\2\u06cb\u06d0\5\u00bc_\2\u06cc\u06cd\7%\2\2"+
		"\u06cd\u06cf\5\u00bc_\2\u06ce\u06cc\3\2\2\2\u06cf\u06d2\3\2\2\2\u06d0"+
		"\u06ce\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d3\3\2\2\2\u06d2\u06d0\3\2"+
		"\2\2\u06d3\u06d4\7 \2\2\u06d4\u0117\3\2\2\2\u06d5\u06d9\5\u0102\u0082"+
		"\2\u06d6\u06d9\5\u0104\u0083\2\u06d7\u06d9\5\u011a\u008e\2\u06d8\u06d5"+
		"\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d8\u06d7\3\2\2\2\u06d9\u0119\3\2\2\2\u06da"+
		"\u06db\7`\2\2\u06db\u06dc\7\u0098\2\2\u06dc\u011b\3\2\2\2\u06dd\u06e1"+
		"\7\u017a\2\2\u06de\u06e2\5\u00d4k\2\u06df\u06e2\5Z.\2\u06e0\u06e2\7\u019a"+
		"\2\2\u06e1\u06de\3\2\2\2\u06e1\u06df\3\2\2\2\u06e1\u06e0\3\2\2\2\u06e2"+
		"\u011d\3\2\2\2\u06e3\u06e8\5\u00f6|\2\u06e4\u06e5\7%\2\2\u06e5\u06e7\5"+
		"\u00f6|\2\u06e6\u06e4\3\2\2\2\u06e7\u06ea\3\2\2\2\u06e8\u06e6\3\2\2\2"+
		"\u06e8\u06e9\3\2\2\2\u06e9\u06ec\3\2\2\2\u06ea\u06e8\3\2\2\2\u06eb\u06e3"+
		"\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u011f\3\2\2\2\u06ed\u06ee\5^\60\2\u06ee"+
		"\u06ef\7_\2\2\u06ef\u06f5\5p9\2\u06f0\u06f3\7\u00ff\2\2\u06f1\u06f2\7"+
		"i\2\2\u06f2\u06f4\7j\2\2\u06f3\u06f1\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4"+
		"\u06f6\3\2\2\2\u06f5\u06f0\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u06f8\3\2"+
		"\2\2\u06f7\u06f9\5\u00f6|\2\u06f8\u06f7\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9"+
		"\u0121\3\2\2\2\u06fa\u06fb\5\u00d4k\2\u06fb\u06fc\7\u0199\2\2\u06fc\u06fd"+
		"\7\u0163\2\2\u06fd\u06fe\7d\2\2\u06fe\u06ff\7\u015f\2\2\u06ff\u0123\3"+
		"\2\2\2\u0700\u0701\7?\2\2\u0701\u0703\5\u00d4k\2\u0702\u0700\3\2\2\2\u0702"+
		"\u0703\3\2\2\2\u0703\u0707\3\2\2\2\u0704\u0708\5\u0126\u0094\2\u0705\u0708"+
		"\5\u0130\u0099\2\u0706\u0708\5\u0112\u008a\2\u0707\u0704\3\2\2\2\u0707"+
		"\u0705\3\2\2\2\u0707\u0706\3\2\2\2\u0708\u0125\3\2\2\2\u0709\u070c\5\u0128"+
		"\u0095\2\u070a\u070d\5\u012a\u0096\2\u070b\u070d\5\u012c\u0097\2\u070c"+
		"\u070a\3\2\2\2\u070c\u070b\3\2\2\2\u070d\u0127\3\2\2\2\u070e\u0711\5n"+
		"8\2\u070f\u0711\7A\2\2\u0710\u070e\3\2\2\2\u0710\u070f\3\2\2\2\u0711\u0129"+
		"\3\2\2\2\u0712\u0714\5\u00fc\177\2\u0713\u0712\3\2\2\2\u0713\u0714\3\2"+
		"\2\2\u0714\u0715\3\2\2\2\u0715\u0717\5d\63\2\u0716\u0718\5\u00fe\u0080"+
		"\2\u0717\u0716\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u071a\3\2\2\2\u0719\u071b"+
		"\5\u0100\u0081\2\u071a\u0719\3\2\2\2\u071a\u071b\3\2\2\2\u071b\u012b\3"+
		"\2\2\2\u071c\u071f\7\u00d5\2\2\u071d\u0720\5d\63\2\u071e\u0720\5\u012e"+
		"\u0098\2\u071f\u071d\3\2\2\2\u071f\u071e\3\2\2\2\u0720\u012d\3\2\2\2\u0721"+
		"\u0722\7\u00eb\2\2\u0722\u0723\5d\63\2\u0723\u0724\5\u010a\u0086\2\u0724"+
		"\u012f\3\2\2\2\u0725\u0726\7B\2\2\u0726\u0728\7C\2\2\u0727\u0725\3\2\2"+
		"\2\u0727\u0728\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u072a\5d\63\2\u072a\u072b"+
		"\7\u00cb\2\2\u072b\u072c\5\\/\2\u072c\u0730\5d\63\2\u072d\u072f\5\u010e"+
		"\u0088\2\u072e\u072d\3\2\2\2\u072f\u0732\3\2\2\2\u0730\u072e\3\2\2\2\u0730"+
		"\u0731\3\2\2\2\u0731\u0131\3\2\2\2\u0732\u0730\3\2\2\2\u0733\u0734\7>"+
		"\2\2\u0734\u0735\5h\65\2\u0735\u0738\5\u0134\u009b\2\u0736\u0737\7L\2"+
		"\2\u0737\u0739\5\u0136\u009c\2\u0738\u0736\3\2\2\2\u0738\u0739\3\2\2\2"+
		"\u0739\u073b\3\2\2\2\u073a\u073c\5\u0118\u008d\2\u073b\u073a\3\2\2\2\u073b"+
		"\u073c\3\2\2\2\u073c\u073e\3\2\2\2\u073d\u073f\5\u011c\u008f\2\u073e\u073d"+
		"\3\2\2\2\u073e\u073f\3\2\2\2\u073f\u0133\3\2\2\2\u0740\u0742\5\u00fc\177"+
		"\2\u0741\u0740\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u074c"+
		"\5d\63\2\u0744\u0745\7\u00d4\2\2\u0745\u074c\7\u00d7\2\2\u0746\u0748\7"+
		"\u00d5\2\2\u0747\u0746\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u0749\3\2\2\2"+
		"\u0749\u074a\7\u00d7\2\2\u074a\u074c\5d\63\2\u074b\u0741\3\2\2\2\u074b"+
		"\u0744\3\2\2\2\u074b\u0747\3\2\2\2\u074c\u0135\3\2\2\2\u074d\u074e\7\37"+
		"\2\2\u074e\u0753\5\u00bc_\2\u074f\u0750\7%\2\2\u0750\u0752\5\u00bc_\2"+
		"\u0751\u074f\3\2\2\2\u0752\u0755\3\2\2\2\u0753\u0751\3\2\2\2\u0753\u0754"+
		"\3\2\2\2\u0754\u0756\3\2\2\2\u0755\u0753\3\2\2\2\u0756\u0757\7 \2\2\u0757"+
		"\u0137\3\2\2\2\u0758\u0759\7\u00fe\2\2\u0759\u075a\7d\2\2\u075a\u075b"+
		"\7\u0169\2\2\u075b\u075c\7\37\2\2\u075c\u075d\5^\60\2\u075d\u075e\7%\2"+
		"\2\u075e\u075f\5^\60\2\u075f\u0760\7 \2\2\u0760\u0139\3\2\2\2\u0761\u0769"+
		"\7`\2\2\u0762\u0763\5Z.\2\u0763\u0764\7\37\2\2\u0764\u0765\5^\60\2\u0765"+
		"\u0766\7 \2\2\u0766\u076a\3\2\2\2\u0767\u076a\5\u00d4k\2\u0768\u076a\7"+
		"\u019a\2\2\u0769\u0762\3\2\2\2\u0769\u0767\3\2\2\2\u0769\u0768\3\2\2\2"+
		"\u076a\u076c\3\2\2\2\u076b\u0761\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u013b"+
		"\3\2\2\2\u076d\u0770\7\u016b\2\2\u076e\u0771\5\u00d4k\2\u076f\u0771\7"+
		"\u019a\2\2\u0770\u076e\3\2\2\2\u0770\u076f\3\2\2\2\u0771\u0773\3\2\2\2"+
		"\u0772\u076d\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u077b\3\2\2\2\u0774\u0775"+
		"\7\u017a\2\2\u0775\u077a\5Z.\2\u0776\u0777\5\u00d4k\2\u0777\u0778\7\u019a"+
		"\2\2\u0778\u077a\3\2\2\2\u0779\u0774\3\2\2\2\u0779\u0776\3\2\2\2\u077a"+
		"\u077c\3\2\2\2\u077b\u0779\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u077f\3\2"+
		"\2\2\u077d\u077e\7L\2\2\u077e\u0780\5\u013e\u00a0\2\u077f\u077d\3\2\2"+
		"\2\u077f\u0780\3\2\2\2\u0780\u013d\3\2\2\2\u0781\u0782\7\37\2\2\u0782"+
		"\u0787\5\u0140\u00a1\2\u0783\u0784\7%\2\2\u0784\u0786\5\u0140\u00a1\2"+
		"\u0785\u0783\3\2\2\2\u0786\u0789\3\2\2\2\u0787\u0785\3\2\2\2\u0787\u0788"+
		"\3\2\2\2\u0788\u078a\3\2\2\2\u0789\u0787\3\2\2\2\u078a\u078b\7 \2\2\u078b"+
		"\u013f\3\2\2\2\u078c\u078d\7\u0166\2\2\u078d\u078e\7\30\2\2\u078e\u0795"+
		"\t \2\2\u078f\u0790\7`\2\2\u0790\u0791\7\u00be\2\2\u0791\u0792\7\37\2"+
		"\2\u0792\u0793\5\u00caf\2\u0793\u0794\7 \2\2\u0794\u0796\3\2\2\2\u0795"+
		"\u078f\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u07bd\3\2\2\2\u0797\u0798\7\u017c"+
		"\2\2\u0798\u0799\7\30\2\2\u0799\u07bd\5\u00d4k\2\u079a\u079b\7\u017b\2"+
		"\2\u079b\u079e\7\30\2\2\u079c\u079f\5j\66\2\u079d\u079f\7\u0165\2\2\u079e"+
		"\u079c\3\2\2\2\u079e\u079d\3\2\2\2\u079f\u07bd\3\2\2\2\u07a0\u07a1\7\u017e"+
		"\2\2\u07a1\u07a2\7\30\2\2\u07a2\u07bd\5\u00d4k\2\u07a3\u07a4\7\u017f\2"+
		"\2\u07a4\u07a5\7\30\2\2\u07a5\u07bd\5\u00d4k\2\u07a6\u07a7\7\u017d\2\2"+
		"\u07a7\u07a8\7\30\2\2\u07a8\u07bd\5\u00d4k\2\u07a9\u07aa\7\u016a\2\2\u07aa"+
		"\u07ab\7\30\2\2\u07ab\u07ad\7`\2\2\u07ac\u07ae\5\u0198\u00cd\2\u07ad\u07ac"+
		"\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07bd\3\2\2\2\u07af\u07b0\7\u0179\2"+
		"\2\u07b0\u07b7\7\30\2\2\u07b1\u07b3\7`\2\2\u07b2\u07b4\5\u0142\u00a2\2"+
		"\u07b3\u07b2\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u07b8\3\2\2\2\u07b5\u07b6"+
		"\7\u00f9\2\2\u07b6\u07b8\5\u0146\u00a4\2\u07b7\u07b1\3\2\2\2\u07b7\u07b5"+
		"\3\2\2\2\u07b8\u07bd\3\2\2\2\u07b9\u07bd\5\u0148\u00a5\2\u07ba\u07bd\5"+
		"\u014a\u00a6\2\u07bb\u07bd\5\u014c\u00a7\2\u07bc\u078c\3\2\2\2\u07bc\u0797"+
		"\3\2\2\2\u07bc\u079a\3\2\2\2\u07bc\u07a0\3\2\2\2\u07bc\u07a3\3\2\2\2\u07bc"+
		"\u07a6\3\2\2\2\u07bc\u07a9\3\2\2\2\u07bc\u07af\3\2\2\2\u07bc\u07b9\3\2"+
		"\2\2\u07bc\u07ba\3\2\2\2\u07bc\u07bb\3\2\2\2\u07bd\u0141\3\2\2\2\u07be"+
		"\u07bf\7\37\2\2\u07bf\u07c4\5\u0142\u00a2\2\u07c0\u07c1\7%\2\2\u07c1\u07c3"+
		"\5\u0142\u00a2\2\u07c2\u07c0\3\2\2\2\u07c3\u07c6\3\2\2\2\u07c4\u07c2\3"+
		"\2\2\2\u07c4\u07c5\3\2\2\2\u07c5\u07c7\3\2\2\2\u07c6\u07c4\3\2\2\2\u07c7"+
		"\u07c8\7 \2\2\u07c8\u0143\3\2\2\2\u07c9\u07ca\7\u0180\2\2\u07ca\u07cd"+
		"\7\30\2\2\u07cb\u07ce\7j\2\2\u07cc\u07ce\5\u0080A\2\u07cd\u07cb\3\2\2"+
		"\2\u07cd\u07cc\3\2\2\2\u07ce\u07cf\3\2\2\2\u07cf\u07d1\7%\2\2\u07d0\u07c9"+
		"\3\2\2\2\u07d0\u07d1\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2\u07d3\7\u0177\2"+
		"\2\u07d3\u07d4\7\30\2\2\u07d4\u07d5\t!\2\2\u07d5\u0145\3\2\2\2\u07d6\u07d7"+
		"\7\37\2\2\u07d7\u07d8\7\u0177\2\2\u07d8\u07d9\7\30\2\2\u07d9\u07da\7\u00fd"+
		"\2\2\u07da\u07db\7 \2\2\u07db\u0147\3\2\2\2\u07dc\u07dd\7\u0176\2\2\u07dd"+
		"\u07de\7\30\2\2\u07de\u07e9\7`\2\2\u07df\u07e0\7\u00e4\2\2\u07e0\u07e1"+
		"\7\30\2\2\u07e1\u07e9\t\"\2\2\u07e2\u07e3\7\u016a\2\2\u07e3\u07e4\7\30"+
		"\2\2\u07e4\u07e6\7`\2\2\u07e5\u07e7\5\u0198\u00cd\2\u07e6\u07e5\3\2\2"+
		"\2\u07e6\u07e7\3\2\2\2\u07e7\u07e9\3\2\2\2\u07e8\u07dc\3\2\2\2\u07e8\u07df"+
		"\3\2\2\2\u07e8\u07e2\3\2\2\2\u07e9\u0149\3\2\2\2\u07ea\u07eb\7\u00e2\2"+
		"\2\u07eb\u07f3\7\30\2\2\u07ec\u07ed\7\u00eb\2\2\u07ed\u07ee\7\37\2\2\u07ee"+
		"\u07ef\5^\60\2\u07ef\u07f0\7 \2\2\u07f0\u07f4\3\2\2\2\u07f1\u07f4\7\u016f"+
		"\2\2\u07f2\u07f4\7\u0104\2\2\u07f3\u07ec\3\2\2\2\u07f3\u07f1\3\2\2\2\u07f3"+
		"\u07f2\3\2\2\2\u07f4\u014b\3\2\2\2\u07f5\u07f6\7\u00d4\2\2\u07f6\u07f7"+
		"\7\u00d7\2\2\u07f7\u07fb\7>\2\2\u07f8\u07fb\7\u00ec\2\2\u07f9\u07fb\5"+
		"\u014e\u00a8\2\u07fa\u07f5\3\2\2\2\u07fa\u07f8\3\2\2\2\u07fa\u07f9\3\2"+
		"\2\2\u07fb\u014d\3\2\2\2\u07fc\u07fd\7\u00bd\2\2\u07fd\u07fe\7\37\2\2"+
		"\u07fe\u07ff\5^\60\2\u07ff\u0801\7\u0102\2\2\u0800\u0802\t#\2\2\u0801"+
		"\u0800\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0804\7d"+
		"\2\2\u0804\u0805\7K\2\2\u0805\u0806\7\37\2\2\u0806\u080b\5~@\2\u0807\u0808"+
		"\7%\2\2\u0808\u080a\5~@\2\u0809\u0807\3\2\2\2\u080a\u080d\3\2\2\2\u080b"+
		"\u0809\3\2\2\2\u080b\u080c\3\2\2\2\u080c\u080e\3\2\2\2\u080d\u080b\3\2"+
		"\2\2\u080e\u080f\7 \2\2\u080f\u0810\7 \2\2\u0810\u014f\3\2\2\2\u0811\u0813"+
		"\7A\2\2\u0812\u0811\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0815\3\2\2\2\u0814"+
		"\u0816\5\u00fc\177\2\u0815\u0814\3\2\2\2\u0815\u0816\3\2\2\2\u0816\u0151"+
		"\3\2\2\2\u0817\u0821\5\u0154\u00ab\2\u0818\u0821\5\u0156\u00ac\2\u0819"+
		"\u0821\5\u0168\u00b5\2\u081a\u0821\5\u0178\u00bd\2\u081b\u0821\5\u017a"+
		"\u00be\2\u081c\u0821\5\u017c\u00bf\2\u081d\u0821\5\u017e\u00c0\2\u081e"+
		"\u0821\5\u0196\u00cc\2\u081f\u0821\7\u0103\2\2\u0820\u0817\3\2\2\2\u0820"+
		"\u0818\3\2\2\2\u0820\u0819\3\2\2\2\u0820\u081a\3\2\2\2\u0820\u081b\3\2"+
		"\2\2\u0820\u081c\3\2\2\2\u0820\u081d\3\2\2\2\u0820\u081e\3\2\2\2\u0820"+
		"\u081f\3\2\2\2\u0821\u0153\3\2\2\2\u0822\u0823\7L\2\2\u0823\u0825\t$\2"+
		"\2\u0824\u0822\3\2\2\2\u0824\u0825\3\2\2\2\u0825\u0826\3\2\2\2\u0826\u0829"+
		"\7:\2\2\u0827\u082a\5\u015a\u00ae\2\u0828\u082a\5\u0162\u00b2\2\u0829"+
		"\u0827\3\2\2\2\u0829\u0828\3\2\2\2\u082a\u0155\3\2\2\2\u082b\u082c\5\u0158"+
		"\u00ad\2\u082c\u082f\5\u009eP\2\u082d\u082e\7\u00d6\2\2\u082e\u0830\5"+
		"j\66\2\u082f\u082d\3\2\2\2\u082f\u0830\3\2\2\2\u0830\u0834\3\2\2\2\u0831"+
		"\u0835\7j\2\2\u0832\u0833\7i\2\2\u0833\u0835\7j\2\2\u0834\u0831\3\2\2"+
		"\2\u0834\u0832\3\2\2\2\u0834\u0835\3\2\2\2\u0835\u0837\3\2\2\2\u0836\u0838"+
		"\7\u010a\2\2\u0837\u0836\3\2\2\2\u0837\u0838\3\2\2\2\u0838\u0157\3\2\2"+
		"\2\u0839\u083a\7\64\2\2\u083a\u083b\7=\2\2\u083b\u083c\5^\60\2\u083c\u0159"+
		"\3\2\2\2\u083d\u0842\5\u015c\u00af\2\u083e\u083f\7%\2\2\u083f\u0841\5"+
		"\u015c\u00af\2\u0840\u083e\3\2\2\2\u0841\u0844\3\2\2\2\u0842\u0840\3\2"+
		"\2\2\u0842\u0843\3\2\2\2\u0843\u015b\3\2\2\2\u0844\u0842\3\2\2\2\u0845"+
		"\u084c\5\u00f0y\2\u0846\u084c\5\u0120\u0091\2\u0847\u084c\5\u0122\u0092"+
		"\2\u0848\u084c\5\u0124\u0093\2\u0849\u084c\5\u018c\u00c7\2\u084a\u084c"+
		"\5\u015e\u00b0\2\u084b\u0845\3\2\2\2\u084b\u0846\3\2\2\2\u084b\u0847\3"+
		"\2\2\2\u084b\u0848\3\2\2\2\u084b\u0849\3\2\2\2\u084b\u084a\3\2\2\2\u084c"+
		"\u015d\3\2\2\2\u084d\u084e\7?\2\2\u084e\u0850\5\u00d4k\2\u084f\u084d\3"+
		"\2\2\2\u084f\u0850\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u0852\7\u0098\2\2"+
		"\u0852\u0853\5~@\2\u0853\u0854\7d\2\2\u0854\u0855\5^\60\2\u0855\u015f"+
		"\3\2\2\2\u0856\u0857\7\37\2\2\u0857\u085c\5\u00ba^\2\u0858\u0859\7%\2"+
		"\2\u0859\u085b\5\u00ba^\2\u085a\u0858\3\2\2\2\u085b\u085e\3\2\2\2\u085c"+
		"\u085a\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u085f\3\2\2\2\u085e\u085c\3\2"+
		"\2\2\u085f\u0860\7 \2\2\u0860\u0161\3\2\2\2\u0861\u0862\5\u0164\u00b3"+
		"\2\u0862\u0863\7%\2\2\u0863\u0864\5\u0138\u009d\2\u0864\u086a\3\2\2\2"+
		"\u0865\u0866\5\u0138\u009d\2\u0866\u0867\7%\2\2\u0867\u0868\5\u0164\u00b3"+
		"\2\u0868\u086a\3\2\2\2\u0869\u0861\3\2\2\2\u0869\u0865\3\2\2\2\u086a\u0163"+
		"\3\2\2\2\u086b\u086c\5\u0166\u00b4\2\u086c\u086d\7\u0098\2\2\u086d\u0870"+
		"\5~@\2\u086e\u086f\7L\2\2\u086f\u0871\7K\2\2\u0870\u086e\3\2\2\2\u0870"+
		"\u0871\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u0873\7%\2\2\u0873\u0874\5\u0166"+
		"\u00b4\2\u0874\u0165\3\2\2\2\u0875\u0876\5^\60\2\u0876\u0877\5\u00a0Q"+
		"\2\u0877\u0878\7\u00c7\2\2\u0878\u0879\7\u00c4\2\2\u0879\u087a\7_\2\2"+
		"\u087a\u087c\7\u00c0\2\2\u087b\u087d\t\33\2\2\u087c\u087b\3\2\2\2\u087c"+
		"\u087d\3\2\2\2\u087d\u087f\3\2\2\2\u087e\u0880\7\u00bb\2\2\u087f\u087e"+
		"\3\2\2\2\u087f\u0880\3\2\2\2\u0880\u0883\3\2\2\2\u0881\u0882\7i\2\2\u0882"+
		"\u0884\7j\2\2\u0883\u0881\3\2\2\2\u0883\u0884\3\2\2\2\u0884\u0887\3\2"+
		"\2\2\u0885\u0886\7?\2\2\u0886\u0888\5\u00d4k\2\u0887\u0885\3\2\2\2\u0887"+
		"\u0888\3\2\2\2\u0888\u0167\3\2\2\2\u0889\u0890\7\65\2\2\u088a\u0891\5"+
		"\u016a\u00b6\2\u088b\u0891\5\u0174\u00bb\2\u088c\u0891\5\u0176\u00bc\2"+
		"\u088d\u088e\7\u00fe\2\2\u088e\u088f\7d\2\2\u088f\u0891\7\u0169\2\2\u0890"+
		"\u088a\3\2\2\2\u0890\u088b\3\2\2\2\u0890\u088c\3\2\2\2\u0890\u088d\3\2"+
		"\2\2\u0891\u0169\3\2\2\2\u0892\u0894\7?\2\2\u0893\u0892\3\2\2\2\u0893"+
		"\u0894\3\2\2\2\u0894\u0896\3\2\2\2\u0895\u0897\5\u019a\u00ce\2\u0896\u0895"+
		"\3\2\2\2\u0896\u0897\3\2\2\2\u0897\u0898\3\2\2\2\u0898\u089d\5\u016c\u00b7"+
		"\2\u0899\u089a\7%\2\2\u089a\u089c\5\u016c\u00b7\2\u089b\u0899\3\2\2\2"+
		"\u089c\u089f\3\2\2\2\u089d\u089b\3\2\2\2\u089d\u089e\3\2\2\2\u089e\u016b"+
		"\3\2\2\2\u089f\u089d\3\2\2\2\u08a0\u08a2\5\u00d4k\2\u08a1\u08a3\5\u016e"+
		"\u00b8\2\u08a2\u08a1\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3\u016d\3\2\2\2\u08a4"+
		"\u08a5\7L\2\2\u08a5\u08a6\7\37\2\2\u08a6\u08ab\5\u0170\u00b9\2\u08a7\u08a8"+
		"\7%\2\2\u08a8\u08aa\5\u0170\u00b9\2\u08a9\u08a7\3\2\2\2\u08aa\u08ad\3"+
		"\2\2\2\u08ab\u08a9\3\2\2\2\u08ab\u08ac\3\2\2\2\u08ac\u08ae\3\2\2\2\u08ad"+
		"\u08ab\3\2\2\2\u08ae\u08af\7 \2\2\u08af\u016f\3\2\2\2\u08b0\u08b1\7\u00f4"+
		"\2\2\u08b1\u08b2\7\30\2\2\u08b2\u08c2\7\u019b\2\2\u08b3\u08b4\7\u00fa"+
		"\2\2\u08b4\u08b5\7\30\2\2\u08b5\u08c2\5\u0172\u00ba\2\u08b6\u08b7\7\u00f5"+
		"\2\2\u08b7\u08bf\7e\2\2\u08b8\u08b9\5Z.\2\u08b9\u08ba\7\37\2\2\u08ba\u08bb"+
		"\5^\60\2\u08bb\u08bc\7 \2\2\u08bc\u08c0\3\2\2\2\u08bd\u08c0\5\u00d4k\2"+
		"\u08be\u08c0\7\u019a\2\2\u08bf\u08b8\3\2\2\2\u08bf\u08bd\3\2\2\2\u08bf"+
		"\u08be\3\2\2\2\u08c0\u08c2\3\2\2\2\u08c1\u08b0\3\2\2\2\u08c1\u08b3\3\2"+
		"\2\2\u08c1\u08b6\3\2\2\2\u08c2\u0171\3\2\2\2\u08c3\u08c4\t\31\2\2\u08c4"+
		"\u0173\3\2\2\2\u08c5\u08c7\7=\2\2\u08c6\u08c8\5\u019a\u00ce\2\u08c7\u08c6"+
		"\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08ce\5^\60\2\u08ca"+
		"\u08cb\7%\2\2\u08cb\u08cd\5^\60\2\u08cc\u08ca\3\2\2\2\u08cd\u08d0\3\2"+
		"\2\2\u08ce\u08cc\3\2\2\2\u08ce\u08cf\3\2\2\2\u08cf\u0175\3\2\2\2\u08d0"+
		"\u08ce\3\2\2\2\u08d1\u08d3\7>\2\2\u08d2\u08d4\5\u019a\u00ce\2\u08d3\u08d2"+
		"\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5\u08da\5h\65\2\u08d6"+
		"\u08d7\7%\2\2\u08d7\u08d9\5h\65\2\u08d8\u08d6\3\2\2\2\u08d9\u08dc\3\2"+
		"\2\2\u08da\u08d8\3\2\2\2\u08da\u08db\3\2\2\2\u08db\u0177\3\2\2\2\u08dc"+
		"\u08da\3\2\2\2\u08dd\u08df\7L\2\2\u08de\u08dd\3\2\2\2\u08de\u08df\3\2"+
		"\2\2\u08df\u08e0\3\2\2\2\u08e0\u08e1\t$\2\2\u08e1\u08e4\7?\2\2\u08e2\u08e5"+
		"\7p\2\2\u08e3\u08e5\5\u00d6l\2\u08e4\u08e2\3\2\2\2\u08e4\u08e3\3\2\2\2"+
		"\u08e5\u0179\3\2\2\2\u08e6\u08e7\t%\2\2\u08e7\u08ea\7G\2\2\u08e8\u08eb"+
		"\7p\2\2\u08e9\u08eb\5\u00d6l\2\u08ea\u08e8\3\2\2\2\u08ea\u08e9\3\2\2\2"+
		"\u08eb\u017b\3\2\2\2\u08ec\u08ef\7\u010b\2\2\u08ed\u08ee\7\u00bd\2\2\u08ee"+
		"\u08f0\5p9\2\u08ef\u08ed\3\2\2\2\u08ef\u08f0\3\2\2\2\u08f0\u08f1\3\2\2"+
		"\2\u08f1\u08f2\7e\2\2\u08f2\u08f5\5\\/\2\u08f3\u08f4\7\u00bd\2\2\u08f4"+
		"\u08f6\5p9\2\u08f5\u08f3\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f6\u08fc\3\2\2"+
		"\2\u08f7\u08f8\7L\2\2\u08f8\u08f9\7\37\2\2\u08f9\u08fa\5\u00d0i\2\u08fa"+
		"\u08fb\7 \2\2\u08fb\u08fd\3\2\2\2\u08fc\u08f7\3\2\2\2\u08fc\u08fd\3\2"+
		"\2\2\u08fd\u017d\3\2\2\2\u08fe\u08ff\7;\2\2\u08ff\u0902\7\37\2\2\u0900"+
		"\u0903\5\u0180\u00c1\2\u0901\u0903\5\u0182\u00c2\2\u0902\u0900\3\2\2\2"+
		"\u0902\u0901\3\2\2\2\u0903\u0904\3\2\2\2\u0904\u0905\7 \2\2\u0905\u017f"+
		"\3\2\2\2\u0906\u0907\7\u017a\2\2\u0907\u090b\7\30\2\2\u0908\u090c\5Z."+
		"\2\u0909\u090c\5\u00d4k\2\u090a\u090c\7\u019a\2\2\u090b\u0908\3\2\2\2"+
		"\u090b\u0909\3\2\2\2\u090b\u090a\3\2\2\2\u090c\u0181\3\2\2\2\u090d\u090e"+
		"\7\u016a\2\2\u090e\u0914\7\30\2\2\u090f\u0915\7\u00f9\2\2\u0910\u0912"+
		"\7`\2\2\u0911\u0913\5\u0184\u00c3\2\u0912\u0911\3\2\2\2\u0912\u0913\3"+
		"\2\2\2\u0913\u0915\3\2\2\2\u0914\u090f\3\2\2\2\u0914\u0910\3\2\2\2\u0915"+
		"\u0183\3\2\2\2\u0916\u091a\7\37\2\2\u0917\u0918\7\u0182\2\2\u0918\u0919"+
		"\7\30\2\2\u0919\u091b\5\\/\2\u091a\u0917\3\2\2\2\u091a\u091b\3\2\2\2\u091b"+
		"\u091d\3\2\2\2\u091c\u091e\5\u0186\u00c4\2\u091d\u091c\3\2\2\2\u091d\u091e"+
		"\3\2\2\2\u091e\u0920\3\2\2\2\u091f\u0921\5\u0188\u00c5\2\u0920\u091f\3"+
		"\2\2\2\u0920\u0921\3\2\2\2\u0921\u0922\3\2\2\2\u0922\u0923\7 \2\2\u0923"+
		"\u0185\3\2\2\2\u0924\u0926\7%\2\2\u0925\u0924\3\2\2\2\u0925\u0926\3\2"+
		"\2\2\u0926\u0927\3\2\2\2\u0927\u0928\7\u0167\2\2\u0928\u0929\7\30\2\2"+
		"\u0929\u092a\5\u0172\u00ba\2\u092a\u0187\3\2\2\2\u092b\u092d\7%\2\2\u092c"+
		"\u092b\3\2\2\2\u092c\u092d\3\2\2\2\u092d\u092e\3\2\2\2\u092e\u092f\7\u0181"+
		"\2\2\u092f\u0930\7\30\2\2\u0930\u0931\5\u018a\u00c6\2\u0931\u0189\3\2"+
		"\2\2\u0932\u0936\7\u00f1\2\2\u0933\u0934\7\u019b\2\2\u0934\u0936\t&\2"+
		"\2\u0935\u0932\3\2\2\2\u0935\u0933\3\2\2\2\u0936\u018b\3\2\2\2\u0937\u093a"+
		"\5\u018e\u00c8\2\u0938\u093b\5\u0190\u00c9\2\u0939\u093b\5\u0194\u00cb"+
		"\2\u093a\u0938\3\2\2\2\u093a\u0939\3\2\2\2\u093b\u018d\3\2\2\2\u093c\u093d"+
		"\7>\2\2\u093d\u093e\5h\65\2\u093e\u018f\3\2\2\2\u093f\u0945\7\u00d5\2"+
		"\2\u0940\u0946\5\u012e\u0098\2\u0941\u0943\5\u0160\u00b1\2\u0942\u0944"+
		"\5\u0192\u00ca\2\u0943\u0942\3\2\2\2\u0943\u0944\3\2\2\2\u0944\u0946\3";
	private static final String _serializedATNSegment1 =
		"\2\2\2\u0945\u0940\3\2\2\2\u0945\u0941\3\2\2\2\u0946\u0191\3\2\2\2\u0947"+
		"\u0948\7`\2\2\u0948\u094b\5\u00d4k\2\u0949\u094b\7\u0098\2\2\u094a\u0947"+
		"\3\2\2\2\u094a\u0949\3\2\2\2\u094b\u0193\3\2\2\2\u094c\u094d\7\u00d4\2"+
		"\2\u094d\u0955\7\u00d7\2\2\u094e\u094f\7L\2\2\u094f\u0950\7\u0164\2\2"+
		"\u0950\u0951\7\30\2\2\u0951\u0953\7\u019b\2\2\u0952\u0954\7\u00df\2\2"+
		"\u0953\u0952\3\2\2\2\u0953\u0954\3\2\2\2\u0954\u0956\3\2\2\2\u0955\u094e"+
		"\3\2\2\2\u0955\u0956\3\2\2\2\u0956\u0958\3\2\2\2\u0957\u0959\5\u0118\u008d"+
		"\2\u0958\u0957\3\2\2\2\u0958\u0959\3\2\2\2\u0959\u0195\3\2\2\2\u095a\u095b"+
		"\7;\2\2\u095b\u095c\7\37\2\2\u095c\u095d\7\u0183\2\2\u095d\u095e\7\30"+
		"\2\2\u095e\u095f\t\'\2\2\u095f\u096d\7 \2\2\u0960\u0961\7\u0176\2\2\u0961"+
		"\u0962\7\30\2\2\u0962\u096d\7`\2\2\u0963\u0964\7\u00e4\2\2\u0964\u0965"+
		"\7\30\2\2\u0965\u096d\t\"\2\2\u0966\u0967\7\u016a\2\2\u0967\u0968\7\30"+
		"\2\2\u0968\u096a\7`\2\2\u0969\u096b\5\u0198\u00cd\2\u096a\u0969\3\2\2"+
		"\2\u096a\u096b\3\2\2\2\u096b\u096d\3\2\2\2\u096c\u095a\3\2\2\2\u096c\u0960"+
		"\3\2\2\2\u096c\u0963\3\2\2\2\u096c\u0966\3\2\2\2\u096d\u0197\3\2\2\2\u096e"+
		"\u096f\7\37\2\2\u096f\u0970\7\u0182\2\2\u0970\u0971\7\30\2\2\u0971\u0976"+
		"\5\\/\2\u0972\u0973\7%\2\2\u0973\u0974\7\u0167\2\2\u0974\u0975\7\30\2"+
		"\2\u0975\u0977\5\u0172\u00ba\2\u0976\u0972\3\2\2\2\u0976\u0977\3\2\2\2"+
		"\u0977\u0978\3\2\2\2\u0978\u0979\7 \2\2\u0979\u0199\3\2\2\2\u097a\u097b"+
		"\7a\2\2\u097b\u097c\7m\2\2\u097c\u019b\3\2\2\2\u097d\u097e\7;\2\2\u097e"+
		"\u097f\7\u00cf\2\2\u097f\u019d\3\2\2\2\u0980\u0981\7a\2\2\u0981\u0982"+
		"\7*\2\2\u0982\u0983\7*\2\2\u0983\u0984\7\u010d\2\2\u0984\u0985\7\32\2"+
		"\2\u0985\u0986\7\u019b\2\2\u0986\u0987\7|\2\2\u0987\u0989\7\u010c\2\2"+
		"\u0988\u0980\3\2\2\2\u0988\u0989\3\2\2\2\u0989\u098a\3\2\2\2\u098a\u098b"+
		"\7;\2\2\u098b\u098c\7\u0174\2\2\u098c\u098d\5\u01a0\u00d1\2\u098d\u019f"+
		"\3\2\2\2\u098e\u098f\t\31\2\2\u098f\u01a1\3\2\2\2\u0990\u0991\7{\2\2\u0991"+
		"\u0992\t(\2\2\u0992\u01a3\3\2\2\2\u0993\u0994\7|\2\2\u0994\u01a5\3\2\2"+
		"\2\u0995\u0996\7}\2\2\u0996\u01a7\3\2\2\2\u0997\u0998\7\u0108\2\2\u0998"+
		"\u0999\t(\2\2\u0999\u01a9\3\2\2\2\u099a\u099e\78\2\2\u099b\u099f\5\u01b0"+
		"\u00d9\2\u099c\u099f\5\u01b2\u00da\2\u099d\u099f\5\u01e2\u00f2\2\u099e"+
		"\u099b\3\2\2\2\u099e\u099c\3\2\2\2\u099e\u099d\3\2\2\2\u099f\u01ab\3\2"+
		"\2\2\u09a0\u09a7\79\2\2\u09a1\u09a3\5\u01b4\u00db\2\u09a2\u09a1\3\2\2"+
		"\2\u09a2\u09a3\3\2\2\2\u09a3\u09a4\3\2\2\2\u09a4\u09a8\5\u01b0\u00d9\2"+
		"\u09a5\u09a8\5\u01b2\u00da\2\u09a6\u09a8\5\u01e2\u00f2\2\u09a7\u09a2\3"+
		"\2\2\2\u09a7\u09a5\3\2\2\2\u09a7\u09a6\3\2\2\2\u09a8\u01ad\3\2\2\2\u09a9"+
		"\u09ac\7\u00e0\2\2\u09aa\u09ad\5\u01b0\u00d9\2\u09ab\u09ad\5\u01b2\u00da"+
		"\2\u09ac\u09aa\3\2\2\2\u09ac\u09ab\3\2\2\2\u09ad\u01af\3\2\2\2\u09ae\u09b1"+
		"\5\u01b6\u00dc\2\u09af\u09b0\7`\2\2\u09b0\u09b2\5\u01b8\u00dd\2\u09b1"+
		"\u09af\3\2\2\2\u09b1\u09b2\3\2\2\2\u09b2\u01b1\3\2\2\2\u09b3\u09b6\5\u01ba"+
		"\u00de\2\u09b4\u09b5\7`\2\2\u09b5\u09b7\5\u01bc\u00df\2\u09b6\u09b4\3"+
		"\2\2\2\u09b6\u09b7\3\2\2\2\u09b7\u01b3\3\2\2\2\u09b8\u09b9\78\2\2\u09b9"+
		"\u09ba\7\u00c9\2\2\u09ba\u09bb\7d\2\2\u09bb\u01b5\3\2\2\2\u09bc\u09be"+
		"\5\u01be\u00e0\2\u09bd\u09bf\5d\63\2\u09be\u09bd\3\2\2\2\u09be\u09bf\3"+
		"\2\2\2\u09bf\u09c7\3\2\2\2\u09c0\u09c1\7%\2\2\u09c1\u09c3\5\u01be\u00e0"+
		"\2\u09c2\u09c4\5d\63\2\u09c3\u09c2\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u09c6"+
		"\3\2\2\2\u09c5\u09c0\3\2\2\2\u09c6\u09c9\3\2\2\2\u09c7\u09c5\3\2\2\2\u09c7"+
		"\u09c8\3\2\2\2\u09c8\u01b7\3\2\2\2\u09c9\u09c7\3\2\2\2\u09ca\u09cc\5\u01de"+
		"\u00f0\2\u09cb\u09ca\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u09cd\3\2\2\2\u09cd"+
		"\u09ce\5\\/\2\u09ce\u01b9\3\2\2\2\u09cf\u09d4\5\u01be\u00e0\2\u09d0\u09d1"+
		"\7%\2\2\u09d1\u09d3\5\u01be\u00e0\2\u09d2\u09d0\3\2\2\2\u09d3\u09d6\3"+
		"\2\2\2\u09d4\u09d2\3\2\2\2\u09d4\u09d5\3\2\2\2\u09d5\u01bb\3\2\2\2\u09d6"+
		"\u09d4\3\2\2\2\u09d7\u09d9\5\u01e0\u00f1\2\u09d8\u09d7\3\2\2\2\u09d8\u09d9"+
		"\3\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09db\5\\/\2\u09db\u01bd\3\2\2\2\u09dc"+
		"\u09de\7p\2\2\u09dd\u09df\7\u00ca\2\2\u09de\u09dd\3\2\2\2\u09de\u09df"+
		"\3\2\2\2\u09df\u09f0\3\2\2\2\u09e0\u09f0\5\u01c0\u00e1\2\u09e1\u09f0\5"+
		"\u01c2\u00e2\2\u09e2\u09f0\5\u01c4\u00e3\2\u09e3\u09f0\5\u01c6\u00e4\2"+
		"\u09e4\u09f0\5\u01c8\u00e5\2\u09e5\u09f0\5\u01ca\u00e6\2\u09e6\u09f0\5"+
		"\u01cc\u00e7\2\u09e7\u09f0\5\u01ce\u00e8\2\u09e8\u09f0\5\u01d0\u00e9\2"+
		"\u09e9\u09f0\5\u01d2\u00ea\2\u09ea\u09f0\5\u01d4\u00eb\2\u09eb\u09f0\5"+
		"\u01d6\u00ec\2\u09ec\u09f0\5\u01d8\u00ed\2\u09ed\u09f0\5\u01da\u00ee\2"+
		"\u09ee\u09f0\5\u01dc\u00ef\2\u09ef\u09dc\3\2\2\2\u09ef\u09e0\3\2\2\2\u09ef"+
		"\u09e1\3\2\2\2\u09ef\u09e2\3\2\2\2\u09ef\u09e3\3\2\2\2\u09ef\u09e4\3\2"+
		"\2\2\u09ef\u09e5\3\2\2\2\u09ef\u09e6\3\2\2\2\u09ef\u09e7\3\2\2\2\u09ef"+
		"\u09e8\3\2\2\2\u09ef\u09e9\3\2\2\2\u09ef\u09ea\3\2\2\2\u09ef\u09eb\3\2"+
		"\2\2\u09ef\u09ec\3\2\2\2\u09ef\u09ed\3\2\2\2\u09ef\u09ee\3\2\2\2\u09f0"+
		"\u01bf\3\2\2\2\u09f1\u09f3\7\u0114\2\2\u09f2\u09f4\7\u011c\2\2\u09f3\u09f2"+
		"\3\2\2\2\u09f3\u09f4\3\2\2\2\u09f4\u0a05\3\2\2\2\u09f5\u09f6\7\u0115\2"+
		"\2\u09f6\u0a05\7\u0116\2\2\u09f7\u0a05\7\64\2\2\u09f8\u09fa\7I\2\2\u09f9"+
		"\u09fb\7q\2\2\u09fa\u09f9\3\2\2\2\u09fa\u09fb\3\2\2\2\u09fb\u09fc\3\2"+
		"\2\2\u09fc\u0a05\7\u0117\2\2\u09fd\u0a05\7\u00cb\2\2\u09fe\u0a05\7/\2"+
		"\2\u09ff\u0a05\7\60\2\2\u0a00\u0a05\7\61\2\2\u0a01\u0a05\7\62\2\2\u0a02"+
		"\u0a05\7\u010f\2\2\u0a03\u0a05\7\u011d\2\2\u0a04\u09f1\3\2\2\2\u0a04\u09f5"+
		"\3\2\2\2\u0a04\u09f7\3\2\2\2\u0a04\u09f8\3\2\2\2\u0a04\u09fd\3\2\2\2\u0a04"+
		"\u09fe\3\2\2\2\u0a04\u09ff\3\2\2\2\u0a04\u0a00\3\2\2\2\u0a04\u0a01\3\2"+
		"\2\2\u0a04\u0a02\3\2\2\2\u0a04\u0a03\3\2\2\2\u0a05\u01c1\3\2\2\2\u0a06"+
		"\u0a07\7I\2\2\u0a07\u0a08\7\u011e\2\2\u0a08\u0a09\7\u0120\2\2\u0a09\u01c3"+
		"\3\2\2\2\u0a0a\u0a10\7\64\2\2\u0a0b\u0a11\7\u0121\2\2\u0a0c\u0a11\7\u0122"+
		"\2\2\u0a0d\u0a11\7\u011f\2\2\u0a0e\u0a0f\7\u011c\2\2\u0a0f\u0a11\7\u0123"+
		"\2\2\u0a10\u0a0b\3\2\2\2\u0a10\u0a0c\3\2\2\2\u0a10\u0a0d\3\2\2\2\u0a10"+
		"\u0a0e\3\2\2\2\u0a11\u0a56\3\2\2\2\u0a12\u0a13\7\64\2\2\u0a13\u0a25\7"+
		"q\2\2\u0a14\u0a15\7\u0124\2\2\u0a15\u0a26\7t\2\2\u0a16\u0a26\7\u0112\2"+
		"\2\u0a17\u0a26\7\u0125\2\2\u0a18\u0a26\7\u00da\2\2\u0a19\u0a26\7\u0126"+
		"\2\2\u0a1a\u0a1b\7\u0127\2\2\u0a1b\u0a26\7\u0128\2\2\u0a1c\u0a1d\7\u0127"+
		"\2\2\u0a1d\u0a26\7\u0110\2\2\u0a1e\u0a1f\7\u0129\2\2\u0a1f\u0a26\7\u011c"+
		"\2\2\u0a20\u0a26\7\u00f2\2\2\u0a21\u0a22\7\u011c\2\2\u0a22\u0a26\7\u012a"+
		"\2\2\u0a23\u0a24\7\u011c\2\2\u0a24\u0a26\7\u00cd\2\2\u0a25\u0a14\3\2\2"+
		"\2\u0a25\u0a16\3\2\2\2\u0a25\u0a17\3\2\2\2\u0a25\u0a18\3\2\2\2\u0a25\u0a19"+
		"\3\2\2\2\u0a25\u0a1a\3\2\2\2\u0a25\u0a1c\3\2\2\2\u0a25\u0a1e\3\2\2\2\u0a25"+
		"\u0a20\3\2\2\2\u0a25\u0a21\3\2\2\2\u0a25\u0a23\3\2\2\2\u0a26\u0a56\3\2"+
		"\2\2\u0a27\u0a33\7\63\2\2\u0a28\u0a29\7\u0124\2\2\u0a29\u0a34\7t\2\2\u0a2a"+
		"\u0a2b\7\u012b\2\2\u0a2b\u0a2c\7\u0127\2\2\u0a2c\u0a34\7\u0128\2\2\u0a2d"+
		"\u0a34\7\u0126\2\2\u0a2e\u0a2f\7\u011c\2\2\u0a2f\u0a34\7\u00cd\2\2\u0a30"+
		"\u0a31\7\u011f\2\2\u0a31\u0a32\7\u0127\2\2\u0a32\u0a34\7\u0128\2\2\u0a33"+
		"\u0a28\3\2\2\2\u0a33\u0a2a\3\2\2\2\u0a33\u0a2d\3\2\2\2\u0a33\u0a2e\3\2"+
		"\2\2\u0a33\u0a30\3\2\2\2\u0a34\u0a56\3\2\2\2\u0a35\u0a36\7\63\2\2\u0a36"+
		"\u0a37\7q\2\2\u0a37\u0a56\7\u00da\2\2\u0a38\u0a39\7I\2\2\u0a39\u0a3a\7"+
		"\u011c\2\2\u0a3a\u0a56\7\u0123\2\2\u0a3b\u0a3c\7I\2\2\u0a3c\u0a3d\7q\2"+
		"\2\u0a3d\u0a56\t)\2\2\u0a3e\u0a3f\7\u0111\2\2\u0a3f\u0a40\7q\2\2\u0a40"+
		"\u0a56\7\u00da\2\2\u0a41\u0a42\7\u0111\2\2\u0a42\u0a56\7\u00a2\2\2\u0a43"+
		"\u0a44\7\u012d\2\2\u0a44\u0a45\7q\2\2\u0a45\u0a56\7\u00f2\2\2\u0a46\u0a47"+
		"\7/\2\2\u0a47\u0a48\7p\2\2\u0a48\u0a49\7\u00cc\2\2\u0a49\u0a56\7\u012e"+
		"\2\2\u0a4a\u0a4b\7\u012f\2\2\u0a4b\u0a56\7\u011c\2\2\u0a4c\u0a4d\7\u0130"+
		"\2\2\u0a4d\u0a4e\7\u0131\2\2\u0a4e\u0a56\7\u0119\2\2\u0a4f\u0a50\7\u0132"+
		"\2\2\u0a50\u0a51\7\u0133\2\2\u0a51\u0a56\7\u0134\2\2\u0a52\u0a53\7\u0135"+
		"\2\2\u0a53\u0a56\7\u0119\2\2\u0a54\u0a56\7\u0136\2\2\u0a55\u0a0a\3\2\2"+
		"\2\u0a55\u0a12\3\2\2\2\u0a55\u0a27\3\2\2\2\u0a55\u0a35\3\2\2\2\u0a55\u0a38"+
		"\3\2\2\2\u0a55\u0a3b\3\2\2\2\u0a55\u0a3e\3\2\2\2\u0a55\u0a41\3\2\2\2\u0a55"+
		"\u0a43\3\2\2\2\u0a55\u0a46\3\2\2\2\u0a55\u0a4a\3\2\2\2\u0a55\u0a4c\3\2"+
		"\2\2\u0a55\u0a4f\3\2\2\2\u0a55\u0a52\3\2\2\2\u0a55\u0a54\3\2\2\2\u0a56"+
		"\u01c5\3\2\2\2\u0a57\u0a60\7\u012d\2\2\u0a58\u0a59\7\64\2\2\u0a59\u0a5d"+
		"\7q\2\2\u0a5a\u0a5e\7\u00f2\2\2\u0a5b\u0a5c\7\u011c\2\2\u0a5c\u0a5e\7"+
		"\u00cd\2\2\u0a5d\u0a5a\3\2\2\2\u0a5d\u0a5b\3\2\2\2\u0a5e\u0a60\3\2\2\2"+
		"\u0a5f\u0a57\3\2\2\2\u0a5f\u0a58\3\2\2\2\u0a60\u01c7\3\2\2\2\u0a61\u0a62"+
		"\7\64\2\2\u0a62\u0afb\7\u011f\2\2\u0a63\u0a64\7\64\2\2\u0a64\u0aa0\7q"+
		"\2\2\u0a65\u0a6f\7\u00da\2\2\u0a66\u0a70\7\u012a\2\2\u0a67\u0a68\7\u012b"+
		"\2\2\u0a68\u0a70\7G\2\2\u0a69\u0a6a\7\u0127\2\2\u0a6a\u0a70\7\u0128\2"+
		"\2\u0a6b\u0a6c\7\u0127\2\2\u0a6c\u0a70\7\u0110\2\2\u0a6d\u0a6e\7\u0137"+
		"\2\2\u0a6e\u0a70\7\u0138\2\2\u0a6f\u0a66\3\2\2\2\u0a6f\u0a67\3\2\2\2\u0a6f"+
		"\u0a69\3\2\2\2\u0a6f\u0a6b\3\2\2\2\u0a6f\u0a6d\3\2\2\2\u0a6f\u0a70\3\2"+
		"\2\2\u0a70\u0aa1\3\2\2\2\u0a71\u0aa1\7\u0139\2\2\u0a72\u0aa1\7\67\2\2"+
		"\u0a73\u0a75\7\u013a\2\2\u0a74\u0a76\7\u012a\2\2\u0a75\u0a74\3\2\2\2\u0a75"+
		"\u0a76\3\2\2\2\u0a76\u0aa1\3\2\2\2\u0a77\u0aa1\7\u00cc\2\2\u0a78\u0a7a"+
		"\7\u0118\2\2\u0a79\u0a78\3\2\2\2\u0a79\u0a7a\3\2\2\2\u0a7a\u0a7b\3\2\2"+
		"\2\u0a7b\u0aa1\7\u00cd\2\2\u0a7c\u0aa1\7\u013b\2\2\u0a7d\u0aa1\7\u013c"+
		"\2\2\u0a7e\u0aa1\7\u0119\2\2\u0a7f\u0aa1\7\u0112\2\2\u0a80\u0a85\7\u011a"+
		"\2\2\u0a81\u0a85\7\u011b\2\2\u0a82\u0a83\7=\2\2\u0a83\u0a85\7\u013d\2"+
		"\2\u0a84\u0a80\3\2\2\2\u0a84\u0a81\3\2\2\2\u0a84\u0a82\3\2\2\2\u0a85\u0a86"+
		"\3\2\2\2\u0a86\u0aa1\7C\2\2\u0a87\u0a88\7=\2\2\u0a88\u0a89\7\u013e\2\2"+
		"\u0a89\u0a8a\7C\2\2\u0a8a\u0aa1\7\u0117\2\2\u0a8b\u0a91\7\u0130\2\2\u0a8c"+
		"\u0a8d\7\u013f\2\2\u0a8d\u0a92\7\u0140\2\2\u0a8e\u0a8f\7\u0141\2\2\u0a8f"+
		"\u0a92\7\u0142\2\2\u0a90\u0a92\7\u0143\2\2\u0a91\u0a8c\3\2\2\2\u0a91\u0a8e"+
		"\3\2\2\2\u0a91\u0a90\3\2\2\2\u0a92\u0aa1\3\2\2\2\u0a93\u0a94\7\u0144\2"+
		"\2\u0a94\u0aa1\7\u0113\2\2\u0a95\u0aa1\7\u0145\2\2\u0a96\u0a97\7\u0147"+
		"\2\2\u0a97\u0aa1\7\u00ae\2\2\u0a98\u0a99\7\u0148\2\2\u0a99\u0a9a\7\u013a"+
		"\2\2\u0a9a\u0aa1\7\u0149\2\2\u0a9b\u0aa1\7\u014a\2\2\u0a9c\u0a9d\7\u0127"+
		"\2\2\u0a9d\u0aa1\7\u0110\2\2\u0a9e\u0a9f\7\u014b\2\2\u0a9f\u0aa1\7\u014c"+
		"\2\2\u0aa0\u0a65\3\2\2\2\u0aa0\u0a71\3\2\2\2\u0aa0\u0a72\3\2\2\2\u0aa0"+
		"\u0a73\3\2\2\2\u0aa0\u0a77\3\2\2\2\u0aa0\u0a79\3\2\2\2\u0aa0\u0a7c\3\2"+
		"\2\2\u0aa0\u0a7d\3\2\2\2\u0aa0\u0a7e\3\2\2\2\u0aa0\u0a7f\3\2\2\2\u0aa0"+
		"\u0a84\3\2\2\2\u0aa0\u0a87\3\2\2\2\u0aa0\u0a8b\3\2\2\2\u0aa0\u0a93\3\2"+
		"\2\2\u0aa0\u0a95\3\2\2\2\u0aa0\u0a96\3\2\2\2\u0aa0\u0a98\3\2\2\2\u0aa0"+
		"\u0a9b\3\2\2\2\u0aa0\u0a9c\3\2\2\2\u0aa0\u0a9e\3\2\2\2\u0aa1\u0afb\3\2"+
		"\2\2\u0aa2\u0ac5\7\63\2\2\u0aa3\u0ac6\7\u00da\2\2\u0aa4\u0aa5\7\u00da"+
		"\2\2\u0aa5\u0aa6\7\u012b\2\2\u0aa6\u0aa7\7\u0127\2\2\u0aa7\u0ac6\7\u0128"+
		"\2\2\u0aa8\u0ac6\7\67\2\2\u0aa9\u0ac6\7<\2\2\u0aaa\u0ac6\7I\2\2\u0aab"+
		"\u0ac6\7\u013a\2\2\u0aac\u0ac6\7\u00ae\2\2\u0aad\u0ac6\7\u0098\2\2\u0aae"+
		"\u0ac6\7\u014d\2\2\u0aaf\u0ac6\7\u0119\2\2\u0ab0\u0ab1\t*\2\2\u0ab1\u0ac6"+
		"\7C\2\2\u0ab2\u0ac6\7\u013b\2\2\u0ab3\u0ac6\7\u013c\2\2\u0ab4\u0ab5\7"+
		"\u0144\2\2\u0ab5\u0ac6\7\u0113\2\2\u0ab6\u0ac6\7F\2\2\u0ab7\u0ab8\7\u0147"+
		"\2\2\u0ab8\u0ac6\7\u00ae\2\2\u0ab9\u0ac6\7H\2\2\u0aba\u0ac6\7\u014e\2"+
		"\2\u0abb\u0abc\7\u0148\2\2\u0abc\u0abd\7\u013a\2\2\u0abd\u0ac6\7\u0149"+
		"\2\2\u0abe\u0ac6\7\u00cd\2\2\u0abf\u0ac6\7\u014a\2\2\u0ac0\u0ac6\7\u014f"+
		"\2\2\u0ac1\u0ac6\7\u0150\2\2\u0ac2\u0ac3\7\u012c\2\2\u0ac3\u0ac4\7\67"+
		"\2\2\u0ac4\u0ac6\7\u0151\2\2\u0ac5\u0aa3\3\2\2\2\u0ac5\u0aa4\3\2\2\2\u0ac5"+
		"\u0aa8\3\2\2\2\u0ac5\u0aa9\3\2\2\2\u0ac5\u0aaa\3\2\2\2\u0ac5\u0aab\3\2"+
		"\2\2\u0ac5\u0aac\3\2\2\2\u0ac5\u0aad\3\2\2\2\u0ac5\u0aae\3\2\2\2\u0ac5"+
		"\u0aaf\3\2\2\2\u0ac5\u0ab0\3\2\2\2\u0ac5\u0ab2\3\2\2\2\u0ac5\u0ab3\3\2"+
		"\2\2\u0ac5\u0ab4\3\2\2\2\u0ac5\u0ab6\3\2\2\2\u0ac5\u0ab7\3\2\2\2\u0ac5"+
		"\u0ab9\3\2\2\2\u0ac5\u0aba\3\2\2\2\u0ac5\u0abb\3\2\2\2\u0ac5\u0abe\3\2"+
		"\2\2\u0ac5\u0abf\3\2\2\2\u0ac5\u0ac0\3\2\2\2\u0ac5\u0ac1\3\2\2\2\u0ac5"+
		"\u0ac2\3\2\2\2\u0ac6\u0afb\3\2\2\2\u0ac7\u0ac8\7\63\2\2\u0ac8\u0acc\7"+
		"q\2\2\u0ac9\u0acd\7\u00da\2\2\u0aca\u0acb\7\u0130\2\2\u0acb\u0acd\7\u0143"+
		"\2\2\u0acc\u0ac9\3\2\2\2\u0acc\u0aca\3\2\2\2\u0acd\u0afb\3\2\2\2\u0ace"+
		"\u0ad4\7I\2\2\u0acf\u0ad0\t+\2\2\u0ad0\u0ad5\7\u0123\2\2\u0ad1\u0ad2\7"+
		"\u012b\2\2\u0ad2\u0ad3\7\u0127\2\2\u0ad3\u0ad5\7\u0128\2\2\u0ad4\u0acf"+
		"\3\2\2\2\u0ad4\u0ad1\3\2\2\2\u0ad5\u0afb\3\2\2\2\u0ad6\u0ad7\7I\2\2\u0ad7"+
		"\u0add\7q\2\2\u0ad8\u0ad9\7=\2\2\u0ad9\u0ada\t,\2\2\u0ada\u0adb\7C\2\2"+
		"\u0adb\u0ade\7\u0117\2\2\u0adc\u0ade\7\u0117\2\2\u0add\u0ad8\3\2\2\2\u0add"+
		"\u0adc\3\2\2\2\u0ade\u0afb\3\2\2\2\u0adf\u0ae0\7\u010f\2\2\u0ae0\u0ae1"+
		"\7q\2\2\u0ae1\u0ae2\7\u0130\2\2\u0ae2\u0afb\7\u0152\2\2\u0ae3\u0ae5\7"+
		"\u0111\2\2\u0ae4\u0ae6\7\u0105\2\2\u0ae5\u0ae4\3\2\2\2\u0ae5\u0ae6\3\2"+
		"\2\2\u0ae6\u0afb\3\2\2\2\u0ae7\u0ae8\7\u0153\2\2\u0ae8\u0ae9\7\u00da\2"+
		"\2\u0ae9\u0afb\7\u0112\2\2\u0aea\u0aeb\7\u0154\2\2\u0aeb\u0afb\t-\2\2"+
		"\u0aec\u0aee\7\u012f\2\2\u0aed\u0aef\7\u011c\2\2\u0aee\u0aed\3\2\2\2\u0aee"+
		"\u0aef\3\2\2\2\u0aef\u0afb\3\2\2\2\u0af0\u0afb\7\u0156\2\2\u0af1\u0af2"+
		"\7\u0157\2\2\u0af2\u0af3\7\u0158\2\2\u0af3\u0afb\7\u0159\2\2\u0af4\u0afb"+
		"\7\u0146\2\2\u0af5\u0afb\7\u015a\2\2\u0af6\u0af7\7\u0132\2\2\u0af7\u0af8"+
		"\7\u00da\2\2\u0af8\u0af9\7\u0133\2\2\u0af9\u0afb\7\u0134\2\2\u0afa\u0a61"+
		"\3\2\2\2\u0afa\u0a63\3\2\2\2\u0afa\u0aa2\3\2\2\2\u0afa\u0ac7\3\2\2\2\u0afa"+
		"\u0ace\3\2\2\2\u0afa\u0ad6\3\2\2\2\u0afa\u0adf\3\2\2\2\u0afa\u0ae3\3\2"+
		"\2\2\u0afa\u0ae7\3\2\2\2\u0afa\u0aea\3\2\2\2\u0afa\u0aec\3\2\2\2\u0afa"+
		"\u0af0\3\2\2\2\u0afa\u0af1\3\2\2\2\u0afa\u0af4\3\2\2\2\u0afa\u0af5\3\2"+
		"\2\2\u0afa\u0af6\3\2\2\2\u0afb\u01c9\3\2\2\2\u0afc\u0b07\7\u012d\2\2\u0afd"+
		"\u0afe\7\64\2\2\u0afe\u0b04\7q\2\2\u0aff\u0b05\7\u00cc\2\2\u0b00\u0b02"+
		"\7\u0118\2\2\u0b01\u0b00\3\2\2\2\u0b01\u0b02\3\2\2\2\u0b02\u0b03\3\2\2"+
		"\2\u0b03\u0b05\7\u00cd\2\2\u0b04\u0aff\3\2\2\2\u0b04\u0b01\3\2\2\2\u0b05"+
		"\u0b07\3\2\2\2\u0b06\u0afc\3\2\2\2\u0b06\u0afd\3\2\2\2\u0b07\u01cb\3\2"+
		"\2\2\u0b08\u0b09\7\64\2\2\u0b09\u0b0a\7q\2\2\u0b0a\u0b11\7\67\2\2\u0b0b"+
		"\u0b0c\7\63\2\2\u0b0c\u0b11\7\u015b\2\2\u0b0d\u0b0e\7I\2\2\u0b0e\u0b0f"+
		"\7\u011e\2\2\u0b0f\u0b11\7\u0120\2\2\u0b10\u0b08\3\2\2\2\u0b10\u0b0b\3"+
		"\2\2\2\u0b10\u0b0d\3\2\2\2\u0b11\u01cd\3\2\2\2\u0b12\u0b13\7\64\2\2\u0b13"+
		"\u0b1c\7q\2\2\u0b14\u0b1d\7\u013c\2\2\u0b15\u0b16\7\u0147\2\2\u0b16\u0b1d"+
		"\7\u00ae\2\2\u0b17\u0b18\7\u0148\2\2\u0b18\u0b19\7\u013a\2\2\u0b19\u0b1d"+
		"\7\u0149\2\2\u0b1a\u0b1d\7\u014a\2\2\u0b1b\u0b1d\7\u013a\2\2\u0b1c\u0b14"+
		"\3\2\2\2\u0b1c\u0b15\3\2\2\2\u0b1c\u0b17\3\2\2\2\u0b1c\u0b1a\3\2\2\2\u0b1c"+
		"\u0b1b\3\2\2\2\u0b1d\u01cf\3\2\2\2\u0b1e\u0b1f\7\64\2\2\u0b1f\u0b20\7"+
		"q\2\2\u0b20\u0b21\7\u0126\2\2\u0b21\u01d1\3\2\2\2\u0b22\u0b23\7\64\2\2"+
		"\u0b23\u0b24\7q\2\2\u0b24\u0b25\7\u013b\2\2\u0b25\u01d3\3\2\2\2\u0b26"+
		"\u0b27\7\64\2\2\u0b27\u0b28\7q\2\2\u0b28\u0b29\7\u011a\2\2\u0b29\u0b2a"+
		"\7C\2\2\u0b2a\u01d5\3\2\2\2\u0b2b\u0b2c\7\64\2\2\u0b2c\u0b2d\7q\2\2\u0b2d"+
		"\u0b2e\7\u011b\2\2\u0b2e\u0b2f\7C\2\2\u0b2f\u01d7\3\2\2\2\u0b30\u0b31"+
		"\7\64\2\2\u0b31\u0b32\7q\2\2\u0b32\u0b33\7\u0119\2\2\u0b33\u01d9\3\2\2"+
		"\2\u0b34\u0b35\7\64\2\2\u0b35\u0b36\7q\2\2\u0b36\u0b37\7\u0124\2\2\u0b37"+
		"\u0b3a\7t\2\2\u0b38\u0b3a\7\u0111\2\2\u0b39\u0b34\3\2\2\2\u0b39\u0b38"+
		"\3\2\2\2\u0b3a\u01db\3\2\2\2\u0b3b\u0b3c\7\64\2\2\u0b3c\u0b3d\7q\2\2\u0b3d"+
		"\u0b3e\7\u0144\2\2\u0b3e\u0b3f\7\u0113\2\2\u0b3f\u01dd\3\2\2\2\u0b40\u0b41"+
		"\7\u0199\2\2\u0b41\u0b42\7\16\2\2\u0b42\u0b43\7\16\2\2\u0b43\u01df\3\2"+
		"\2\2\u0b44\u0b45\t.\2\2\u0b45\u0b46\7\16\2\2\u0b46\u0b47\7\16\2\2\u0b47"+
		"\u01e1\3\2\2\2\u0b48\u0b49\5\u00d6l\2\u0b49\u01e3\3\2\2\2\u0b4a\u0b4b"+
		"\7\63\2\2\u0b4b\u0b4c\7\u00cc\2\2\u0b4c\u01e5\3\2\2\2\u0b4d\u0b4e\7\65"+
		"\2\2\u0b4e\u0b4f\7\u00cc\2\2\u0b4f\u01e7\3\2\2\2\u0b50\u0b51\7\64\2\2"+
		"\u0b51\u0b52\7\u00cc\2\2\u0b52\u01e9\3\2\2\2\u0b53\u0b54\7\63\2\2\u0b54"+
		"\u0b55\7\u00cd\2\2\u0b55\u01eb\3\2\2\2\u0b56\u0b57\7\65\2\2\u0b57\u0b58"+
		"\7\u00cd\2\2\u0b58\u01ed\3\2\2\2\u0b59\u0b5a\7\64\2\2\u0b5a\u0b5b\7\u00cd"+
		"\2\2\u0b5b\u01ef\3\2\2\2\u0b5c\u0b5d\7\63\2\2\u0b5d\u0b5e\7\u00f2\2\2"+
		"\u0b5e\u01f1\3\2\2\2\u0b5f\u0b60\7\65\2\2\u0b60\u0b61\7\u00f2\2\2\u0b61"+
		"\u01f3\3\2\2\2\u0b62\u0b63\7\64\2\2\u0b63\u0b64\7\u00f2\2\2\u0b64\u01f5"+
		"\3\2\2\2\u0b65\u0b66\7\u009c\2\2\u0b66\u01f7\3\2\2\2\u013c\u0216\u0219"+
		"\u021f\u0222\u0226\u0229\u0231\u0235\u023d\u0249\u0252\u0259\u025d\u0262"+
		"\u0265\u0268\u026b\u026f\u0272\u0275\u0280\u0284\u0289\u028d\u0295\u029a"+
		"\u029f\u02a3\u02a6\u02a9\u02ac\u02af\u02b5\u02bb\u02c1\u02c4\u02c7\u02ca"+
		"\u02ce\u02d2\u02de\u02ed\u02f4\u02f9\u02fc\u0300\u0304\u030a\u030d\u0310"+
		"\u0316\u0319\u031d\u0322\u0324\u032a\u0336\u0349\u034e\u0359\u0365\u036e"+
		"\u0375\u0383\u0389\u0390\u0394\u039e\u03a0\u03a5\u03b2\u03ba\u03c7\u03d6"+
		"\u03d8\u03df\u03e6\u03ef\u03f6\u03ff\u0405\u0408\u042b\u042d\u0438\u0440"+
		"\u0446\u0450\u0457\u045d\u0462\u0469\u046d\u0477\u0487\u048c\u0497\u049b"+
		"\u04a4\u04a8\u04ad\u04b0\u04be\u04c7\u04d3\u04d5\u04da\u04dd\u04e6\u04eb"+
		"\u04f3\u04ff\u0508\u050e\u0516\u0519\u051c\u0527\u052f\u0538\u0540\u0548"+
		"\u054c\u0559\u055b\u0564\u0579\u057e\u058a\u0597\u05a0\u05bb\u05c2\u05ca"+
		"\u05d1\u05dd\u05e9\u05ee\u05f7\u05fe\u0603\u0612\u061c\u0627\u062a\u0636"+
		"\u063a\u064c\u0651\u0655\u0659\u065c\u065f\u0662\u0670\u0675\u067a\u068a"+
		"\u0695\u069f\u06a8\u06af\u06b5\u06be\u06c1\u06c4\u06c7\u06d0\u06d8\u06e1"+
		"\u06e8\u06eb\u06f3\u06f5\u06f8\u0702\u0707\u070c\u0710\u0713\u0717\u071a"+
		"\u071f\u0727\u0730\u0738\u073b\u073e\u0741\u0747\u074b\u0753\u0769\u076b"+
		"\u0770\u0772\u0779\u077b\u077f\u0787\u0795\u079e\u07ad\u07b3\u07b7\u07bc"+
		"\u07c4\u07cd\u07d0\u07e6\u07e8\u07f3\u07fa\u0801\u080b\u0812\u0815\u0820"+
		"\u0824\u0829\u082f\u0834\u0837\u0842\u084b\u084f\u085c\u0869\u0870\u087c"+
		"\u087f\u0883\u0887\u0890\u0893\u0896\u089d\u08a2\u08ab\u08bf\u08c1\u08c7"+
		"\u08ce\u08d3\u08da\u08de\u08e4\u08ea\u08ef\u08f5\u08fc\u0902\u090b\u0912"+
		"\u0914\u091a\u091d\u0920\u0925\u092c\u0935\u093a\u0943\u0945\u094a\u0953"+
		"\u0955\u0958\u096a\u096c\u0976\u0988\u099e\u09a2\u09a7\u09ac\u09b1\u09b6"+
		"\u09be\u09c3\u09c7\u09cb\u09d4\u09d8\u09de\u09ef\u09f3\u09fa\u0a04\u0a10"+
		"\u0a25\u0a33\u0a55\u0a5d\u0a5f\u0a6f\u0a75\u0a79\u0a84\u0a91\u0aa0\u0ac5"+
		"\u0acc\u0ad4\u0add\u0ae5\u0aee\u0afa\u0b01\u0b04\u0b06\u0b10\u0b1c\u0b39";
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
// Generated from org\apache\shardingsphere\sql\parser\autogen\SQLServerStatement.g4 by ANTLR 4.7.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLServerStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLServerStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(SQLServerStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(SQLServerStatementParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertValuesClause(SQLServerStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertSelectClause(SQLServerStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(SQLServerStatementParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SQLServerStatementParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAssignmentsClause(SQLServerStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValues(SQLServerStatementParser.AssignmentValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValue(SQLServerStatementParser.AssignmentValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(SQLServerStatementParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableClause(SQLServerStatementParser.SingleTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleTablesClause(SQLServerStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#multipleTableNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleTableNames(SQLServerStatementParser.MultipleTableNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(SQLServerStatementParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#unionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionClause(SQLServerStatementParser.UnionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(SQLServerStatementParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuplicateSpecification(SQLServerStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#projections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjections(SQLServerStatementParser.ProjectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(SQLServerStatementParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#top}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop(SQLServerStatementParser.TopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(SQLServerStatementParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedShorthand(SQLServerStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedShorthand(SQLServerStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SQLServerStatementParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReferences(SQLServerStatementParser.TableReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(SQLServerStatementParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFactor(SQLServerStatementParser.TableFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinedTable(SQLServerStatementParser.JoinedTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinSpecification(SQLServerStatementParser.JoinSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(SQLServerStatementParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(SQLServerStatementParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(SQLServerStatementParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(SQLServerStatementParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterMarker(SQLServerStatementParser.ParameterMarkerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(SQLServerStatementParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiterals(SQLServerStatementParser.StringLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiterals(SQLServerStatementParser.NumberLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTimeLiterals(SQLServerStatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiterals(SQLServerStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitValueLiterals(SQLServerStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiterals(SQLServerStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValueLiterals(SQLServerStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SQLServerStatementParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnreservedWord(SQLServerStatementParser.UnreservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(SQLServerStatementParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SQLServerStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(SQLServerStatementParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwner(SQLServerStatementParser.OwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SQLServerStatementParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNames(SQLServerStatementParser.ColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNames(SQLServerStatementParser.TableNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(SQLServerStatementParser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#collationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollationName(SQLServerStatementParser.CollationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeLength(SQLServerStatementParser.DataTypeLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKey(SQLServerStatementParser.PrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SQLServerStatementParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(SQLServerStatementParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#notOperator_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOperator_(SQLServerStatementParser.NotOperator_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanPrimary(SQLServerStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SQLServerStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(SQLServerStatementParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpr(SQLServerStatementParser.BitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(SQLServerStatementParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SQLServerStatementParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(SQLServerStatementParser.AggregationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunctionName(SQLServerStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct(SQLServerStatementParser.DistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialFunction(SQLServerStatementParser.SpecialFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#castFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastFunction(SQLServerStatementParser.CastFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#charFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFunction(SQLServerStatementParser.CharFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunction(SQLServerStatementParser.RegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#regularFunctionName_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunctionName_(SQLServerStatementParser.RegularFunctionName_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(SQLServerStatementParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#caseWhen_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseWhen_(SQLServerStatementParser.CaseWhen_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#caseElse_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseElse_(SQLServerStatementParser.CaseElse_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#privateExprOfDb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivateExprOfDb(SQLServerStatementParser.PrivateExprOfDbContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(SQLServerStatementParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByItem(SQLServerStatementParser.OrderByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(SQLServerStatementParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeName(SQLServerStatementParser.DataTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#atTimeZoneExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtTimeZoneExpr(SQLServerStatementParser.AtTimeZoneExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#castExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpr(SQLServerStatementParser.CastExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#convertExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvertExpr(SQLServerStatementParser.ConvertExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#windowedFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowedFunction(SQLServerStatementParser.WindowedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#overClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverClause(SQLServerStatementParser.OverClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#partitionByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionByClause(SQLServerStatementParser.PartitionByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#rowRangeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowRangeClause(SQLServerStatementParser.RowRangeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#windowFrameExtent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrameExtent(SQLServerStatementParser.WindowFrameExtentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#windowFrameBetween}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrameBetween(SQLServerStatementParser.WindowFrameBetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#windowFrameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrameBound(SQLServerStatementParser.WindowFrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#windowFramePreceding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFramePreceding(SQLServerStatementParser.WindowFramePrecedingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#windowFrameFollowing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrameFollowing(SQLServerStatementParser.WindowFrameFollowingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnNameWithSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNameWithSort(SQLServerStatementParser.ColumnNameWithSortContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#indexOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOption(SQLServerStatementParser.IndexOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#compressionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompressionOption(SQLServerStatementParser.CompressionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#eqTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqTime(SQLServerStatementParser.EqTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#eqOnOffOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOnOffOption(SQLServerStatementParser.EqOnOffOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#eqKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqKey(SQLServerStatementParser.EqKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#eqOnOff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOnOff(SQLServerStatementParser.EqOnOffContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onPartitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnPartitionClause(SQLServerStatementParser.OnPartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#partitionExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionExpressions(SQLServerStatementParser.PartitionExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#partitionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionExpression(SQLServerStatementParser.PartitionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#numberRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberRange(SQLServerStatementParser.NumberRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#lowPriorityLockWait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowPriorityLockWait(SQLServerStatementParser.LowPriorityLockWaitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onLowPriorLockWait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnLowPriorLockWait(SQLServerStatementParser.OnLowPriorLockWaitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#ignoredIdentifier_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoredIdentifier_(SQLServerStatementParser.IgnoredIdentifier_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#ignoredIdentifiers_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoredIdentifiers_(SQLServerStatementParser.IgnoredIdentifiers_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#matchNone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchNone(SQLServerStatementParser.MatchNoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(SQLServerStatementParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndex(SQLServerStatementParser.CreateIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(SQLServerStatementParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndex(SQLServerStatementParser.AlterIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(SQLServerStatementParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndex(SQLServerStatementParser.DropIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(SQLServerStatementParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#fileTableClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileTableClause_(SQLServerStatementParser.FileTableClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinitionClause(SQLServerStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createTableDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableDefinitions(SQLServerStatementParser.CreateTableDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createTableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableDefinition(SQLServerStatementParser.CreateTableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(SQLServerStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnDefinitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinitionOption(SQLServerStatementParser.ColumnDefinitionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#encryptedOptions_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncryptedOptions_(SQLServerStatementParser.EncryptedOptions_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnConstraint(SQLServerStatementParser.ColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#primaryKeyConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyConstraint(SQLServerStatementParser.PrimaryKeyConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#diskTablePrimaryKeyConstraintOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiskTablePrimaryKeyConstraintOption(SQLServerStatementParser.DiskTablePrimaryKeyConstraintOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#clusterOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClusterOption_(SQLServerStatementParser.ClusterOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#primaryKeyWithClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyWithClause(SQLServerStatementParser.PrimaryKeyWithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#primaryKeyOnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyOnClause(SQLServerStatementParser.PrimaryKeyOnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onSchemaColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnSchemaColumn(SQLServerStatementParser.OnSchemaColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onFileGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnFileGroup(SQLServerStatementParser.OnFileGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnString(SQLServerStatementParser.OnStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#memoryTablePrimaryKeyConstraintOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemoryTablePrimaryKeyConstraintOption(SQLServerStatementParser.MemoryTablePrimaryKeyConstraintOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#withBucket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithBucket(SQLServerStatementParser.WithBucketContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnForeignKeyConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnForeignKeyConstraint(SQLServerStatementParser.ColumnForeignKeyConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#foreignKeyOnAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyOnAction(SQLServerStatementParser.ForeignKeyOnActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#foreignKeyOn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyOn(SQLServerStatementParser.ForeignKeyOnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#checkConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckConstraint(SQLServerStatementParser.CheckConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnIndex(SQLServerStatementParser.ColumnIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#withIndexOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithIndexOption_(SQLServerStatementParser.WithIndexOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#indexOnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOnClause(SQLServerStatementParser.IndexOnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnDefault(SQLServerStatementParser.OnDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#fileStreamOn_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileStreamOn_(SQLServerStatementParser.FileStreamOn_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnConstraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnConstraints(SQLServerStatementParser.ColumnConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#computedColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputedColumnDefinition(SQLServerStatementParser.ComputedColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnSetDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnSetDefinition(SQLServerStatementParser.ColumnSetDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraint(SQLServerStatementParser.TableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tablePrimaryConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePrimaryConstraint(SQLServerStatementParser.TablePrimaryConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#primaryKeyUnique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyUnique(SQLServerStatementParser.PrimaryKeyUniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#diskTablePrimaryConstraintOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiskTablePrimaryConstraintOption(SQLServerStatementParser.DiskTablePrimaryConstraintOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#memoryTablePrimaryConstraintOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemoryTablePrimaryConstraintOption(SQLServerStatementParser.MemoryTablePrimaryConstraintOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#hashWithBucket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashWithBucket(SQLServerStatementParser.HashWithBucketContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableForeignKeyConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableForeignKeyConstraint(SQLServerStatementParser.TableForeignKeyConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIndex(SQLServerStatementParser.TableIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#indexNameOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexNameOption_(SQLServerStatementParser.IndexNameOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#indexOptions_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOptions_(SQLServerStatementParser.IndexOptions_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#periodClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriodClause(SQLServerStatementParser.PeriodClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#partitionScheme_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionScheme_(SQLServerStatementParser.PartitionScheme_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#fileGroup_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileGroup_(SQLServerStatementParser.FileGroup_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptions(SQLServerStatementParser.TableOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOption(SQLServerStatementParser.TableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableStretchOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableStretchOptions(SQLServerStatementParser.TableStretchOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableStretchOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableStretchOption(SQLServerStatementParser.TableStretchOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#migrationState_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMigrationState_(SQLServerStatementParser.MigrationState_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#tableOperationOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOperationOption(SQLServerStatementParser.TableOperationOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#distributionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistributionOption(SQLServerStatementParser.DistributionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dataWareHouseTableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataWareHouseTableOption(SQLServerStatementParser.DataWareHouseTableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dataWareHousePartitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataWareHousePartitionOption(SQLServerStatementParser.DataWareHousePartitionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createIndexSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndexSpecification_(SQLServerStatementParser.CreateIndexSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDefinitionClause(SQLServerStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumnSpecification(SQLServerStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyColumnSpecification(SQLServerStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterColumnOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterColumnOperation(SQLServerStatementParser.AlterColumnOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterColumnAddOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterColumnAddOptions(SQLServerStatementParser.AlterColumnAddOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterColumnAddOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterColumnAddOption(SQLServerStatementParser.AlterColumnAddOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#constraintForColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintForColumn(SQLServerStatementParser.ConstraintForColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#columnNameWithSortsWithParen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNameWithSortsWithParen(SQLServerStatementParser.ColumnNameWithSortsWithParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#generatedColumnNamesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratedColumnNamesClause(SQLServerStatementParser.GeneratedColumnNamesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#generatedColumnNameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratedColumnNameClause(SQLServerStatementParser.GeneratedColumnNameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#generatedColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratedColumnName(SQLServerStatementParser.GeneratedColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterDrop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDrop(SQLServerStatementParser.AlterDropContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterTableDropConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableDropConstraint(SQLServerStatementParser.AlterTableDropConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropConstraintName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropConstraintName(SQLServerStatementParser.DropConstraintNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropConstraintWithClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropConstraintWithClause(SQLServerStatementParser.DropConstraintWithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropConstraintOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropConstraintOption(SQLServerStatementParser.DropConstraintOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onOffOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnOffOption_(SQLServerStatementParser.OnOffOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropColumnSpecification(SQLServerStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropIndexSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndexSpecification(SQLServerStatementParser.DropIndexSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterCheckConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterCheckConstraint(SQLServerStatementParser.AlterCheckConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTrigger(SQLServerStatementParser.AlterTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterSwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSwitch(SQLServerStatementParser.AlterSwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSet(SQLServerStatementParser.AlterSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#setFileStreamClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetFileStreamClause(SQLServerStatementParser.SetFileStreamClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#setSystemVersionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSystemVersionClause(SQLServerStatementParser.SetSystemVersionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterSetOnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSetOnClause(SQLServerStatementParser.AlterSetOnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dataConsistencyCheckClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataConsistencyCheckClause_(SQLServerStatementParser.DataConsistencyCheckClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#historyRetentionPeriodClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHistoryRetentionPeriodClause_(SQLServerStatementParser.HistoryRetentionPeriodClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#historyRetentionPeriod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHistoryRetentionPeriod(SQLServerStatementParser.HistoryRetentionPeriodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterTableTableIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableTableIndex(SQLServerStatementParser.AlterTableTableIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#indexWithName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexWithName(SQLServerStatementParser.IndexWithNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#indexNonClusterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexNonClusterClause(SQLServerStatementParser.IndexNonClusterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterTableIndexOnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableIndexOnClause(SQLServerStatementParser.AlterTableIndexOnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#indexClusterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexClusterClause(SQLServerStatementParser.IndexClusterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterTableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableOption(SQLServerStatementParser.AlterTableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onHistoryTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnHistoryTableClause(SQLServerStatementParser.OnHistoryTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#ifExist_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExist_(SQLServerStatementParser.IfExist_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTransaction(SQLServerStatementParser.SetTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#setImplicitTransactions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetImplicitTransactions(SQLServerStatementParser.SetImplicitTransactionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#implicitTransactionsValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitTransactionsValue(SQLServerStatementParser.ImplicitTransactionsValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginTransaction(SQLServerStatementParser.BeginTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#commit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit(SQLServerStatementParser.CommitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#rollback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback(SQLServerStatementParser.RollbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#savepoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint(SQLServerStatementParser.SavepointContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#grant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant(SQLServerStatementParser.GrantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#revoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke(SQLServerStatementParser.RevokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#deny}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeny(SQLServerStatementParser.DenyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#classPrivilegesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassPrivilegesClause(SQLServerStatementParser.ClassPrivilegesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#classTypePrivilegesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTypePrivilegesClause(SQLServerStatementParser.ClassTypePrivilegesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#optionForClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionForClause_(SQLServerStatementParser.OptionForClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#classPrivileges_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassPrivileges_(SQLServerStatementParser.ClassPrivileges_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onClassClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnClassClause(SQLServerStatementParser.OnClassClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#classTypePrivileges_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTypePrivileges_(SQLServerStatementParser.ClassTypePrivileges_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#onClassTypeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnClassTypeClause(SQLServerStatementParser.OnClassTypeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#privilegeType_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeType_(SQLServerStatementParser.PrivilegeType_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#basicPermission_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicPermission_(SQLServerStatementParser.BasicPermission_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#objectPermission_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPermission_(SQLServerStatementParser.ObjectPermission_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#serverPermission_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServerPermission_(SQLServerStatementParser.ServerPermission_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#serverPrincipalPermission_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServerPrincipalPermission_(SQLServerStatementParser.ServerPrincipalPermission_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#databasePermission_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabasePermission_(SQLServerStatementParser.DatabasePermission_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#databasePrincipalPermission_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabasePrincipalPermission_(SQLServerStatementParser.DatabasePrincipalPermission_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#schemaPermission_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaPermission_(SQLServerStatementParser.SchemaPermission_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#serviceBrokerPermission_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceBrokerPermission_(SQLServerStatementParser.ServiceBrokerPermission_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#endpointPermission_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndpointPermission_(SQLServerStatementParser.EndpointPermission_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#certificatePermission_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCertificatePermission_(SQLServerStatementParser.CertificatePermission_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#symmetricKeyPermission_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymmetricKeyPermission_(SQLServerStatementParser.SymmetricKeyPermission_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#asymmetricKeyPermission_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsymmetricKeyPermission_(SQLServerStatementParser.AsymmetricKeyPermission_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#assemblyPermission_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyPermission_(SQLServerStatementParser.AssemblyPermission_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#availabilityGroupPermission_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvailabilityGroupPermission_(SQLServerStatementParser.AvailabilityGroupPermission_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#fullTextPermission_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullTextPermission_(SQLServerStatementParser.FullTextPermission_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#class_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_(SQLServerStatementParser.Class_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#classType_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_(SQLServerStatementParser.ClassType_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#roleClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleClause_(SQLServerStatementParser.RoleClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUser(SQLServerStatementParser.CreateUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUser(SQLServerStatementParser.DropUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUser(SQLServerStatementParser.AlterUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRole(SQLServerStatementParser.CreateRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRole(SQLServerStatementParser.DropRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRole(SQLServerStatementParser.AlterRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#createLogin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLogin(SQLServerStatementParser.CreateLoginContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#dropLogin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropLogin(SQLServerStatementParser.DropLoginContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#alterLogin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterLogin(SQLServerStatementParser.AlterLoginContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLServerStatementParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(SQLServerStatementParser.CallContext ctx);
}
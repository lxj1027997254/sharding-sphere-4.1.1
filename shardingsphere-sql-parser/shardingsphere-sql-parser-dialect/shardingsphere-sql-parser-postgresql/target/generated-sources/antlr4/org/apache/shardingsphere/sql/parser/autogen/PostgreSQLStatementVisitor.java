// Generated from org\apache\shardingsphere\sql\parser\autogen\PostgreSQLStatement.g4 by ANTLR 4.7.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PostgreSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PostgreSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(PostgreSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(PostgreSQLStatementParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertValuesClause(PostgreSQLStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertSelectClause(PostgreSQLStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(PostgreSQLStatementParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateSpecification_(PostgreSQLStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PostgreSQLStatementParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAssignmentsClause(PostgreSQLStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValues(PostgreSQLStatementParser.AssignmentValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValue(PostgreSQLStatementParser.AssignmentValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(PostgreSQLStatementParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#deleteSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteSpecification_(PostgreSQLStatementParser.DeleteSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableClause(PostgreSQLStatementParser.SingleTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleTablesClause(PostgreSQLStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#multipleTableNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleTableNames(PostgreSQLStatementParser.MultipleTableNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(PostgreSQLStatementParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#unionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionClause(PostgreSQLStatementParser.UnionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(PostgreSQLStatementParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuplicateSpecification(PostgreSQLStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#projections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjections(PostgreSQLStatementParser.ProjectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(PostgreSQLStatementParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(PostgreSQLStatementParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedShorthand(PostgreSQLStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedShorthand(PostgreSQLStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(PostgreSQLStatementParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReferences(PostgreSQLStatementParser.TableReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(PostgreSQLStatementParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFactor(PostgreSQLStatementParser.TableFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinedTable(PostgreSQLStatementParser.JoinedTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinSpecification(PostgreSQLStatementParser.JoinSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(PostgreSQLStatementParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(PostgreSQLStatementParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(PostgreSQLStatementParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(PostgreSQLStatementParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#limitRowCountSyntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitRowCountSyntax(PostgreSQLStatementParser.LimitRowCountSyntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitRowCount(PostgreSQLStatementParser.LimitRowCountContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#limitOffsetSyntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitOffsetSyntax(PostgreSQLStatementParser.LimitOffsetSyntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitOffset(PostgreSQLStatementParser.LimitOffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(PostgreSQLStatementParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterMarker(PostgreSQLStatementParser.ParameterMarkerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(PostgreSQLStatementParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiterals(PostgreSQLStatementParser.StringLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiterals(PostgreSQLStatementParser.NumberLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiterals(PostgreSQLStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitValueLiterals(PostgreSQLStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiterals(PostgreSQLStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValueLiterals(PostgreSQLStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#literalsType_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralsType_(PostgreSQLStatementParser.LiteralsType_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PostgreSQLStatementParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#unicodeEscapes_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnicodeEscapes_(PostgreSQLStatementParser.UnicodeEscapes_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#uescape_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUescape_(PostgreSQLStatementParser.Uescape_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnreservedWord(PostgreSQLStatementParser.UnreservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(PostgreSQLStatementParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(PostgreSQLStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(PostgreSQLStatementParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwner(PostgreSQLStatementParser.OwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(PostgreSQLStatementParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNames(PostgreSQLStatementParser.TableNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#columnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNames(PostgreSQLStatementParser.ColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#collationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollationName(PostgreSQLStatementParser.CollationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(PostgreSQLStatementParser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKey(PostgreSQLStatementParser.PrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PostgreSQLStatementParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(PostgreSQLStatementParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#notOperator_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOperator_(PostgreSQLStatementParser.NotOperator_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanPrimary(PostgreSQLStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(PostgreSQLStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(PostgreSQLStatementParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpr(PostgreSQLStatementParser.BitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(PostgreSQLStatementParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PostgreSQLStatementParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(PostgreSQLStatementParser.AggregationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunctionName(PostgreSQLStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct(PostgreSQLStatementParser.DistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#filterClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterClause_(PostgreSQLStatementParser.FilterClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFunction(PostgreSQLStatementParser.WindowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#windowDefinition_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDefinition_(PostgreSQLStatementParser.WindowDefinition_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#pratitionClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPratitionClause_(PostgreSQLStatementParser.PratitionClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#frameClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameClause_(PostgreSQLStatementParser.FrameClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#frameStart_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameStart_(PostgreSQLStatementParser.FrameStart_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#frameEnd_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameEnd_(PostgreSQLStatementParser.FrameEnd_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#frameBetween_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBetween_(PostgreSQLStatementParser.FrameBetween_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialFunction(PostgreSQLStatementParser.SpecialFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#castFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastFunction(PostgreSQLStatementParser.CastFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#charFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFunction(PostgreSQLStatementParser.CharFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunction(PostgreSQLStatementParser.RegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#regularFunctionName_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunctionName_(PostgreSQLStatementParser.RegularFunctionName_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(PostgreSQLStatementParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#caseWhen_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseWhen_(PostgreSQLStatementParser.CaseWhen_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#caseElse_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseElse_(PostgreSQLStatementParser.CaseElse_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(PostgreSQLStatementParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByItem(PostgreSQLStatementParser.OrderByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(PostgreSQLStatementParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeName(PostgreSQLStatementParser.DataTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeLength(PostgreSQLStatementParser.DataTypeLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#characterSet_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterSet_(PostgreSQLStatementParser.CharacterSet_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#collateClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateClause_(PostgreSQLStatementParser.CollateClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#ignoredIdentifier_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoredIdentifier_(PostgreSQLStatementParser.IgnoredIdentifier_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#ignoredIdentifiers_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoredIdentifiers_(PostgreSQLStatementParser.IgnoredIdentifiers_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(PostgreSQLStatementParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndex(PostgreSQLStatementParser.CreateIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(PostgreSQLStatementParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndex(PostgreSQLStatementParser.AlterIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(PostgreSQLStatementParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndex(PostgreSQLStatementParser.DropIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(PostgreSQLStatementParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createTableSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableSpecification_(PostgreSQLStatementParser.CreateTableSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableNotExistClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNotExistClause_(PostgreSQLStatementParser.TableNotExistClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinitionClause(PostgreSQLStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinition(PostgreSQLStatementParser.CreateDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(PostgreSQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnConstraint(PostgreSQLStatementParser.ColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#constraintClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintClause(PostgreSQLStatementParser.ConstraintClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#columnConstraintOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnConstraintOption(PostgreSQLStatementParser.ColumnConstraintOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#checkOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckOption(PostgreSQLStatementParser.CheckOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#defaultExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultExpr(PostgreSQLStatementParser.DefaultExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#sequenceOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceOptions(PostgreSQLStatementParser.SequenceOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#sequenceOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceOption(PostgreSQLStatementParser.SequenceOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#indexParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexParameters(PostgreSQLStatementParser.IndexParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(PostgreSQLStatementParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#constraintOptionalParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintOptionalParam(PostgreSQLStatementParser.ConstraintOptionalParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#likeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeOption(PostgreSQLStatementParser.LikeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraint(PostgreSQLStatementParser.TableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableConstraintOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraintOption(PostgreSQLStatementParser.TableConstraintOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#inheritClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritClause_(PostgreSQLStatementParser.InheritClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createIndexSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndexSpecification_(PostgreSQLStatementParser.CreateIndexSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#concurrentlyClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrentlyClause_(PostgreSQLStatementParser.ConcurrentlyClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#indexNotExistClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexNotExistClause_(PostgreSQLStatementParser.IndexNotExistClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#onlyClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyClause_(PostgreSQLStatementParser.OnlyClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableExistClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExistClause_(PostgreSQLStatementParser.TableExistClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#asteriskClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsteriskClause_(PostgreSQLStatementParser.AsteriskClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDefinitionClause(PostgreSQLStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterIndexDefinitionClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndexDefinitionClause_(PostgreSQLStatementParser.AlterIndexDefinitionClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#renameIndexSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameIndexSpecification(PostgreSQLStatementParser.RenameIndexSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterIndexDependsOnExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndexDependsOnExtension(PostgreSQLStatementParser.AlterIndexDependsOnExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterIndexSetTableSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndexSetTableSpace(PostgreSQLStatementParser.AlterIndexSetTableSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableNamesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNamesClause(PostgreSQLStatementParser.TableNamesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableNameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNameClause(PostgreSQLStatementParser.TableNameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterTableActions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableActions(PostgreSQLStatementParser.AlterTableActionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterTableAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableAction(PostgreSQLStatementParser.AlterTableActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumnSpecification(PostgreSQLStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropColumnSpecification(PostgreSQLStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#columnExistClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExistClause_(PostgreSQLStatementParser.ColumnExistClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyColumnSpecification(PostgreSQLStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#modifyColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyColumn(PostgreSQLStatementParser.ModifyColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterColumnSetOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterColumnSetOption(PostgreSQLStatementParser.AlterColumnSetOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#attributeOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeOptions(PostgreSQLStatementParser.AttributeOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#attributeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeOption(PostgreSQLStatementParser.AttributeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddConstraintSpecification(PostgreSQLStatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableConstraintUsingIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraintUsingIndex(PostgreSQLStatementParser.TableConstraintUsingIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#storageParameterWithValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageParameterWithValue(PostgreSQLStatementParser.StorageParameterWithValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#storageParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageParameter(PostgreSQLStatementParser.StorageParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#renameColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameColumnSpecification(PostgreSQLStatementParser.RenameColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#renameConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameConstraint(PostgreSQLStatementParser.RenameConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#renameTableSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTableSpecification_(PostgreSQLStatementParser.RenameTableSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#indexExistClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexExistClause_(PostgreSQLStatementParser.IndexExistClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#indexNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexNames(PostgreSQLStatementParser.IndexNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTransaction(PostgreSQLStatementParser.SetTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginTransaction(PostgreSQLStatementParser.BeginTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#commit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit(PostgreSQLStatementParser.CommitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#rollback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback(PostgreSQLStatementParser.RollbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#savepoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint(PostgreSQLStatementParser.SavepointContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#grant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant(PostgreSQLStatementParser.GrantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#revoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke(PostgreSQLStatementParser.RevokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeClause(PostgreSQLStatementParser.PrivilegeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#roleClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleClause_(PostgreSQLStatementParser.RoleClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#optionForClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionForClause_(PostgreSQLStatementParser.OptionForClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#privileges_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivileges_(PostgreSQLStatementParser.Privileges_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#privilegeType_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeType_(PostgreSQLStatementParser.PrivilegeType_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnObjectClause(PostgreSQLStatementParser.OnObjectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUser(PostgreSQLStatementParser.CreateUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUser(PostgreSQLStatementParser.DropUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUser(PostgreSQLStatementParser.AlterUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRole(PostgreSQLStatementParser.CreateRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRole(PostgreSQLStatementParser.DropRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRole(PostgreSQLStatementParser.AlterRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(PostgreSQLStatementParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(PostgreSQLStatementParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#runtimeScope_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuntimeScope_(PostgreSQLStatementParser.RuntimeScope_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#timeZoneClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeZoneClause_(PostgreSQLStatementParser.TimeZoneClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#configurationParameterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigurationParameterClause(PostgreSQLStatementParser.ConfigurationParameterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#resetParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetParameter(PostgreSQLStatementParser.ResetParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(PostgreSQLStatementParser.CallContext ctx);
}
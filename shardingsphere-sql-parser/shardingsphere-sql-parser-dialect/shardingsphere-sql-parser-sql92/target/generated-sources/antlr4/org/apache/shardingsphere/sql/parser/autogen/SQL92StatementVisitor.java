// Generated from org\apache\shardingsphere\sql\parser\autogen\SQL92Statement.g4 by ANTLR 4.7.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQL92StatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQL92StatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(SQL92StatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(SQL92StatementParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertValuesClause(SQL92StatementParser.InsertValuesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertSelectClause(SQL92StatementParser.InsertSelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(SQL92StatementParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SQL92StatementParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAssignmentsClause(SQL92StatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValues(SQL92StatementParser.AssignmentValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValue(SQL92StatementParser.AssignmentValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#blobValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlobValue(SQL92StatementParser.BlobValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(SQL92StatementParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableClause(SQL92StatementParser.SingleTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(SQL92StatementParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#unionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionClause(SQL92StatementParser.UnionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(SQL92StatementParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSpecification(SQL92StatementParser.SelectSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuplicateSpecification(SQL92StatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#projections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjections(SQL92StatementParser.ProjectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(SQL92StatementParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(SQL92StatementParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedShorthand(SQL92StatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedShorthand(SQL92StatementParser.QualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SQL92StatementParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#tableReferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReferences(SQL92StatementParser.TableReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscapedTableReference(SQL92StatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(SQL92StatementParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#tableFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFactor(SQL92StatementParser.TableFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#joinedTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinedTable(SQL92StatementParser.JoinedTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinSpecification(SQL92StatementParser.JoinSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(SQL92StatementParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(SQL92StatementParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(SQL92StatementParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(SQL92StatementParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitRowCount(SQL92StatementParser.LimitRowCountContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#limitOffset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitOffset(SQL92StatementParser.LimitOffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(SQL92StatementParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterMarker(SQL92StatementParser.ParameterMarkerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(SQL92StatementParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiterals(SQL92StatementParser.StringLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiterals(SQL92StatementParser.NumberLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTimeLiterals(SQL92StatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiterals(SQL92StatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitValueLiterals(SQL92StatementParser.BitValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiterals(SQL92StatementParser.BooleanLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValueLiterals(SQL92StatementParser.NullValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SQL92StatementParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnreservedWord(SQL92StatementParser.UnreservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SQL92StatementParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(SQL92StatementParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SQL92StatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(SQL92StatementParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#viewName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewName(SQL92StatementParser.ViewNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwner(SQL92StatementParser.OwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SQL92StatementParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#columnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNames(SQL92StatementParser.ColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#tableNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNames(SQL92StatementParser.TableNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#characterSetName_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterSetName_(SQL92StatementParser.CharacterSetName_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SQL92StatementParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(SQL92StatementParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#notOperator_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOperator_(SQL92StatementParser.NotOperator_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanPrimary(SQL92StatementParser.BooleanPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SQL92StatementParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(SQL92StatementParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#bitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpr(SQL92StatementParser.BitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(SQL92StatementParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SQL92StatementParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(SQL92StatementParser.AggregationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunctionName(SQL92StatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct(SQL92StatementParser.DistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#specialFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialFunction(SQL92StatementParser.SpecialFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#castFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastFunction(SQL92StatementParser.CastFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#convertFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvertFunction(SQL92StatementParser.ConvertFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#positionFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionFunction(SQL92StatementParser.PositionFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#substringFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstringFunction(SQL92StatementParser.SubstringFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#extractFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractFunction(SQL92StatementParser.ExtractFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#trimFunction_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimFunction_(SQL92StatementParser.TrimFunction_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#regularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunction(SQL92StatementParser.RegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#regularFunctionName_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunctionName_(SQL92StatementParser.RegularFunctionName_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#matchExpression_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchExpression_(SQL92StatementParser.MatchExpression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(SQL92StatementParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#caseWhen_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseWhen_(SQL92StatementParser.CaseWhen_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#caseElse_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseElse_(SQL92StatementParser.CaseElse_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalExpression(SQL92StatementParser.IntervalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#intervalUnit_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalUnit_(SQL92StatementParser.IntervalUnit_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(SQL92StatementParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#orderByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByItem(SQL92StatementParser.OrderByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(SQL92StatementParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeName(SQL92StatementParser.DataTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeLength(SQL92StatementParser.DataTypeLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#characterSet_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterSet_(SQL92StatementParser.CharacterSet_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#collateClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateClause_(SQL92StatementParser.CollateClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#ignoredIdentifier_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoredIdentifier_(SQL92StatementParser.IgnoredIdentifier_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#dropBehaviour_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropBehaviour_(SQL92StatementParser.DropBehaviour_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(SQL92StatementParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(SQL92StatementParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(SQL92StatementParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#createDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(SQL92StatementParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(SQL92StatementParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#createView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(SQL92StatementParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#dropView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropView(SQL92StatementParser.DropViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#createTableSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableSpecification_(SQL92StatementParser.CreateTableSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinitionClause(SQL92StatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#createDatabaseSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabaseSpecification_(SQL92StatementParser.CreateDatabaseSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#createDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinition(SQL92StatementParser.CreateDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(SQL92StatementParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#dataTypeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeOption(SQL92StatementParser.DataTypeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#checkConstraintDefinition_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckConstraintDefinition_(SQL92StatementParser.CheckConstraintDefinition_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#referenceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceDefinition(SQL92StatementParser.ReferenceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#referenceOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceOption_(SQL92StatementParser.ReferenceOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#keyParts_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyParts_(SQL92StatementParser.KeyParts_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#keyPart_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyPart_(SQL92StatementParser.KeyPart_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#constraintDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintDefinition(SQL92StatementParser.ConstraintDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#primaryKeyOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyOption(SQL92StatementParser.PrimaryKeyOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#primaryKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKey(SQL92StatementParser.PrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#uniqueOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueOption_(SQL92StatementParser.UniqueOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#foreignKeyOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyOption(SQL92StatementParser.ForeignKeyOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#createLikeClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLikeClause_(SQL92StatementParser.CreateLikeClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDefinitionClause(SQL92StatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumnSpecification(SQL92StatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyColumnSpecification(SQL92StatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropColumnSpecification(SQL92StatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddConstraintSpecification(SQL92StatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#dropConstraintSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropConstraintSpecification(SQL92StatementParser.DropConstraintSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#setTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTransaction(SQL92StatementParser.SetTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#commit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit(SQL92StatementParser.CommitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#rollback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback(SQL92StatementParser.RollbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#levelOfIsolation_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelOfIsolation_(SQL92StatementParser.LevelOfIsolation_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#grant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant(SQL92StatementParser.GrantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#revoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke(SQL92StatementParser.RevokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeClause(SQL92StatementParser.PrivilegeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#privileges_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivileges_(SQL92StatementParser.Privileges_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#privilegeType_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeType_(SQL92StatementParser.PrivilegeType_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#grantee_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantee_(SQL92StatementParser.Grantee_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnObjectClause(SQL92StatementParser.OnObjectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#objectType_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectType_(SQL92StatementParser.ObjectType_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQL92StatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeLevel(SQL92StatementParser.PrivilegeLevelContext ctx);
}
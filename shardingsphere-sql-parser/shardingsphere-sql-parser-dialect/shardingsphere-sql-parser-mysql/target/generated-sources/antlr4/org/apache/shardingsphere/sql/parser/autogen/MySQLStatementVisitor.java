// Generated from org\apache\shardingsphere\sql\parser\autogen\MySQLStatement.g4 by ANTLR 4.7.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MySQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MySQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(MySQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(MySQLStatementParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#insertSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertSpecification_(MySQLStatementParser.InsertSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertValuesClause(MySQLStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertSelectClause(MySQLStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#onDuplicateKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnDuplicateKeyClause(MySQLStatementParser.OnDuplicateKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#replace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplace(MySQLStatementParser.ReplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#replaceSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceSpecification_(MySQLStatementParser.ReplaceSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(MySQLStatementParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateSpecification_(MySQLStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MySQLStatementParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAssignmentsClause(MySQLStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValues(MySQLStatementParser.AssignmentValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValue(MySQLStatementParser.AssignmentValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#blobValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlobValue(MySQLStatementParser.BlobValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(MySQLStatementParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#deleteSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteSpecification_(MySQLStatementParser.DeleteSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableClause(MySQLStatementParser.SingleTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleTablesClause(MySQLStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#multipleTableNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleTableNames(MySQLStatementParser.MultipleTableNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(MySQLStatementParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(MySQLStatementParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(MySQLStatementParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#handlerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerStatement(MySQLStatementParser.HandlerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerOpenStatement(MySQLStatementParser.HandlerOpenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerReadIndexStatement(MySQLStatementParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerReadStatement(MySQLStatementParser.HandlerReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerCloseStatement(MySQLStatementParser.HandlerCloseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(MySQLStatementParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#loadDataStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadDataStatement(MySQLStatementParser.LoadDataStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadXmlStatement(MySQLStatementParser.LoadXmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#withClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithClause_(MySQLStatementParser.WithClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#cteClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCteClause_(MySQLStatementParser.CteClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#unionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionClause(MySQLStatementParser.UnionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(MySQLStatementParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSpecification(MySQLStatementParser.SelectSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuplicateSpecification(MySQLStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#projections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjections(MySQLStatementParser.ProjectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(MySQLStatementParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(MySQLStatementParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedShorthand(MySQLStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedShorthand(MySQLStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(MySQLStatementParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReferences(MySQLStatementParser.TableReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscapedTableReference(MySQLStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(MySQLStatementParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFactor(MySQLStatementParser.TableFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#partitionNames_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionNames_(MySQLStatementParser.PartitionNames_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#indexHintList_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHintList_(MySQLStatementParser.IndexHintList_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#indexHint_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHint_(MySQLStatementParser.IndexHint_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinedTable(MySQLStatementParser.JoinedTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinSpecification(MySQLStatementParser.JoinSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(MySQLStatementParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(MySQLStatementParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(MySQLStatementParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(MySQLStatementParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitRowCount(MySQLStatementParser.LimitRowCountContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitOffset(MySQLStatementParser.LimitOffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#windowClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowClause_(MySQLStatementParser.WindowClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#windowItem_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowItem_(MySQLStatementParser.WindowItem_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(MySQLStatementParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#selectLinesInto_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectLinesInto_(MySQLStatementParser.SelectLinesInto_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#selectFieldsInto_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFieldsInto_(MySQLStatementParser.SelectFieldsInto_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#selectIntoExpression_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectIntoExpression_(MySQLStatementParser.SelectIntoExpression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#lockClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockClause(MySQLStatementParser.LockClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterMarker(MySQLStatementParser.ParameterMarkerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(MySQLStatementParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiterals(MySQLStatementParser.StringLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiterals(MySQLStatementParser.NumberLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTimeLiterals(MySQLStatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiterals(MySQLStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitValueLiterals(MySQLStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiterals(MySQLStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValueLiterals(MySQLStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#characterSetName_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterSetName_(MySQLStatementParser.CharacterSetName_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#collationName_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollationName_(MySQLStatementParser.CollationName_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MySQLStatementParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnreservedWord(MySQLStatementParser.UnreservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MySQLStatementParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(MySQLStatementParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(MySQLStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(MySQLStatementParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(MySQLStatementParser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#userName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserName(MySQLStatementParser.UserNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#eventName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventName(MySQLStatementParser.EventNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#serverName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServerName(MySQLStatementParser.ServerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#wrapperName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrapperName(MySQLStatementParser.WrapperNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(MySQLStatementParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#viewName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewName(MySQLStatementParser.ViewNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwner(MySQLStatementParser.OwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(MySQLStatementParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#tableNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNames(MySQLStatementParser.TableNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#columnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNames(MySQLStatementParser.ColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#groupName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupName(MySQLStatementParser.GroupNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#shardLibraryName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShardLibraryName(MySQLStatementParser.ShardLibraryNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#componentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentName(MySQLStatementParser.ComponentNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#pluginName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluginName(MySQLStatementParser.PluginNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#hostName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostName(MySQLStatementParser.HostNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(MySQLStatementParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#cloneInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloneInstance(MySQLStatementParser.CloneInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#cloneDir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloneDir(MySQLStatementParser.CloneDirContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#channelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelName(MySQLStatementParser.ChannelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#logName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogName(MySQLStatementParser.LogNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#roleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleName(MySQLStatementParser.RoleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#engineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngineName(MySQLStatementParser.EngineNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#triggerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerName(MySQLStatementParser.TriggerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#triggerTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerTime(MySQLStatementParser.TriggerTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#userOrRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserOrRole(MySQLStatementParser.UserOrRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#partitionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionName(MySQLStatementParser.PartitionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#triggerEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerEvent(MySQLStatementParser.TriggerEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#triggerOrder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerOrder(MySQLStatementParser.TriggerOrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MySQLStatementParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(MySQLStatementParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#notOperator_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOperator_(MySQLStatementParser.NotOperator_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanPrimary(MySQLStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(MySQLStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(MySQLStatementParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpr(MySQLStatementParser.BitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(MySQLStatementParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(MySQLStatementParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(MySQLStatementParser.AggregationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunctionName(MySQLStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct(MySQLStatementParser.DistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#overClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverClause_(MySQLStatementParser.OverClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#windowSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowSpecification_(MySQLStatementParser.WindowSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#partitionClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionClause_(MySQLStatementParser.PartitionClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#frameClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameClause_(MySQLStatementParser.FrameClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#frameStart_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameStart_(MySQLStatementParser.FrameStart_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#frameEnd_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameEnd_(MySQLStatementParser.FrameEnd_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#frameBetween_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBetween_(MySQLStatementParser.FrameBetween_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialFunction(MySQLStatementParser.SpecialFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupConcatFunction(MySQLStatementParser.GroupConcatFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFunction(MySQLStatementParser.WindowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#castFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastFunction(MySQLStatementParser.CastFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvertFunction(MySQLStatementParser.ConvertFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionFunction(MySQLStatementParser.PositionFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstringFunction(MySQLStatementParser.SubstringFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractFunction(MySQLStatementParser.ExtractFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#charFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFunction(MySQLStatementParser.CharFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#trimFunction_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimFunction_(MySQLStatementParser.TrimFunction_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#valuesFunction_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesFunction_(MySQLStatementParser.ValuesFunction_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#weightStringFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeightStringFunction(MySQLStatementParser.WeightStringFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#levelClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelClause_(MySQLStatementParser.LevelClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#levelInWeightListElement_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelInWeightListElement_(MySQLStatementParser.LevelInWeightListElement_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunction(MySQLStatementParser.RegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#regularFunctionName_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunctionName_(MySQLStatementParser.RegularFunctionName_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#matchExpression_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchExpression_(MySQLStatementParser.MatchExpression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#matchSearchModifier_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchSearchModifier_(MySQLStatementParser.MatchSearchModifier_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(MySQLStatementParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#caseWhen_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseWhen_(MySQLStatementParser.CaseWhen_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#caseElse_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseElse_(MySQLStatementParser.CaseElse_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalExpression(MySQLStatementParser.IntervalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#intervalUnit_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalUnit_(MySQLStatementParser.IntervalUnit_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(MySQLStatementParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByItem(MySQLStatementParser.OrderByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(MySQLStatementParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeName(MySQLStatementParser.DataTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeLength(MySQLStatementParser.DataTypeLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#collectionOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionOptions(MySQLStatementParser.CollectionOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#characterSet_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterSet_(MySQLStatementParser.CharacterSet_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#collateClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateClause_(MySQLStatementParser.CollateClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#ignoredIdentifier_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoredIdentifier_(MySQLStatementParser.IgnoredIdentifier_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#ignoredIdentifiers_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoredIdentifiers_(MySQLStatementParser.IgnoredIdentifiers_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(MySQLStatementParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(MySQLStatementParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(MySQLStatementParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndex(MySQLStatementParser.DropIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(MySQLStatementParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndex(MySQLStatementParser.CreateIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(MySQLStatementParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabase(MySQLStatementParser.AlterDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createDatabaseSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabaseSpecification_(MySQLStatementParser.CreateDatabaseSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(MySQLStatementParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#alterInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterInstance(MySQLStatementParser.AlterInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#instanceAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceAction(MySQLStatementParser.InstanceActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateEvent(MySQLStatementParser.CreateEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#alterEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterEvent(MySQLStatementParser.AlterEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dropEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropEvent(MySQLStatementParser.DropEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(MySQLStatementParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFunction(MySQLStatementParser.AlterFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(MySQLStatementParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateProcedure(MySQLStatementParser.CreateProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterProcedure(MySQLStatementParser.AlterProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropProcedure(MySQLStatementParser.DropProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateServer(MySQLStatementParser.CreateServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#alterServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterServer(MySQLStatementParser.AlterServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dropServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropServer(MySQLStatementParser.DropServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(MySQLStatementParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#alterView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterView(MySQLStatementParser.AlterViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dropView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropView(MySQLStatementParser.DropViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTablespaceInnodb(MySQLStatementParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTablespaceNdb(MySQLStatementParser.CreateTablespaceNdbContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#alterTablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTablespace(MySQLStatementParser.AlterTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dropTablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablespace(MySQLStatementParser.DropTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLogfileGroup(MySQLStatementParser.CreateLogfileGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterLogfileGroup(MySQLStatementParser.AlterLogfileGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropLogfileGroup(MySQLStatementParser.DropLogfileGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTrigger(MySQLStatementParser.CreateTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createTableSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableSpecification_(MySQLStatementParser.CreateTableSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#tableNotExistClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNotExistClause_(MySQLStatementParser.TableNotExistClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinitionClause(MySQLStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinition(MySQLStatementParser.CreateDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(MySQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#storageOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageOption(MySQLStatementParser.StorageOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#generatedOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratedOption(MySQLStatementParser.GeneratedOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dataTypeGenericOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeGenericOption(MySQLStatementParser.DataTypeGenericOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#checkConstraintDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckConstraintDefinition(MySQLStatementParser.CheckConstraintDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#referenceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceDefinition(MySQLStatementParser.ReferenceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#referenceOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceOption_(MySQLStatementParser.ReferenceOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#indexDefinition_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexDefinition_(MySQLStatementParser.IndexDefinition_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#indexType_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexType_(MySQLStatementParser.IndexType_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#keyParts_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyParts_(MySQLStatementParser.KeyParts_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#keyPart_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyPart_(MySQLStatementParser.KeyPart_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#indexOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOption_(MySQLStatementParser.IndexOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#constraintDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintDefinition(MySQLStatementParser.ConstraintDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#primaryKeyOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyOption(MySQLStatementParser.PrimaryKeyOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKey(MySQLStatementParser.PrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#uniqueOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueOption_(MySQLStatementParser.UniqueOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#foreignKeyOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyOption(MySQLStatementParser.ForeignKeyOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createLikeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLikeClause(MySQLStatementParser.CreateLikeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createIndexSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndexSpecification_(MySQLStatementParser.CreateIndexSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDefinitionClause(MySQLStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSpecification(MySQLStatementParser.AlterSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#tableOptions_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptions_(MySQLStatementParser.TableOptions_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#tableOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOption_(MySQLStatementParser.TableOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumnSpecification(MySQLStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#firstOrAfterColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstOrAfterColumn(MySQLStatementParser.FirstOrAfterColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#addIndexSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddIndexSpecification(MySQLStatementParser.AddIndexSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddConstraintSpecification(MySQLStatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#changeColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeColumnSpecification(MySQLStatementParser.ChangeColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyColumnSpecification(MySQLStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropColumnSpecification(MySQLStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dropIndexSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndexSpecification(MySQLStatementParser.DropIndexSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dropPrimaryKeySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropPrimaryKeySpecification(MySQLStatementParser.DropPrimaryKeySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#renameColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameColumnSpecification(MySQLStatementParser.RenameColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#renameIndexSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameIndexSpecification(MySQLStatementParser.RenameIndexSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#renameTableSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTableSpecification(MySQLStatementParser.RenameTableSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#partitionDefinitions_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionDefinitions_(MySQLStatementParser.PartitionDefinitions_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#partitionDefinition_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionDefinition_(MySQLStatementParser.PartitionDefinition_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#partitionLessThanValue_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionLessThanValue_(MySQLStatementParser.PartitionLessThanValue_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#partitionValueList_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionValueList_(MySQLStatementParser.PartitionValueList_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#partitionDefinitionOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionDefinitionOption_(MySQLStatementParser.PartitionDefinitionOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#subpartitionDefinition_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartitionDefinition_(MySQLStatementParser.SubpartitionDefinition_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dropTableSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableSpecification_(MySQLStatementParser.DropTableSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#tableExistClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExistClause_(MySQLStatementParser.TableExistClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dropIndexSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndexSpecification_(MySQLStatementParser.DropIndexSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#ownerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwnerStatement(MySQLStatementParser.OwnerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#scheduleExpression_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleExpression_(MySQLStatementParser.ScheduleExpression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#timestampValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestampValue(MySQLStatementParser.TimestampValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#routineBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineBody(MySQLStatementParser.RoutineBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#serverOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServerOption_(MySQLStatementParser.ServerOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#routineOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineOption_(MySQLStatementParser.RoutineOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#procedureParameter_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureParameter_(MySQLStatementParser.ProcedureParameter_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#fileSizeLiteral_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileSizeLiteral_(MySQLStatementParser.FileSizeLiteral_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTransaction(MySQLStatementParser.SetTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#setAutoCommit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAutoCommit(MySQLStatementParser.SetAutoCommitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#scope_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope_(MySQLStatementParser.Scope_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#autoCommitValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoCommitValue(MySQLStatementParser.AutoCommitValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginTransaction(MySQLStatementParser.BeginTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#commit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit(MySQLStatementParser.CommitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#rollback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback(MySQLStatementParser.RollbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#savepoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint(MySQLStatementParser.SavepointContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#grant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant(MySQLStatementParser.GrantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#revoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke(MySQLStatementParser.RevokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#proxyClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProxyClause_(MySQLStatementParser.ProxyClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeClause(MySQLStatementParser.PrivilegeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#roleClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleClause_(MySQLStatementParser.RoleClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#allClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllClause_(MySQLStatementParser.AllClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#privileges_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivileges_(MySQLStatementParser.Privileges_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#privilegeType_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeType_(MySQLStatementParser.PrivilegeType_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnObjectClause(MySQLStatementParser.OnObjectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#objectType_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectType_(MySQLStatementParser.ObjectType_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeLevel(MySQLStatementParser.PrivilegeLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUser(MySQLStatementParser.CreateUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#alterUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUser(MySQLStatementParser.AlterUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dropUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUser(MySQLStatementParser.DropUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRole(MySQLStatementParser.CreateRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dropRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRole(MySQLStatementParser.DropRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#renameUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameUser(MySQLStatementParser.RenameUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#setDefaultRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetDefaultRole(MySQLStatementParser.SetDefaultRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#setRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetRole(MySQLStatementParser.SetRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#setPassword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetPassword(MySQLStatementParser.SetPasswordContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#authOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthOption_(MySQLStatementParser.AuthOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#withGrantOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithGrantOption_(MySQLStatementParser.WithGrantOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#userOrRoles_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserOrRoles_(MySQLStatementParser.UserOrRoles_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#roles_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoles_(MySQLStatementParser.Roles_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#grantOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantOption_(MySQLStatementParser.GrantOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#userAuthOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserAuthOption_(MySQLStatementParser.UserAuthOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#identifiedBy_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiedBy_(MySQLStatementParser.IdentifiedBy_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#identifiedWith_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiedWith_(MySQLStatementParser.IdentifiedWith_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#lockOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockOption_(MySQLStatementParser.LockOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#passwordOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordOption_(MySQLStatementParser.PasswordOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#resourceOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceOption_(MySQLStatementParser.ResourceOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#tlsOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTlsOption_(MySQLStatementParser.TlsOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#userFuncAuthOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserFuncAuthOption_(MySQLStatementParser.UserFuncAuthOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(MySQLStatementParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesc(MySQLStatementParser.DescContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showDatabases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabases(MySQLStatementParser.ShowDatabasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(MySQLStatementParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showTableStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTableStatus(MySQLStatementParser.ShowTableStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(MySQLStatementParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowIndex(MySQLStatementParser.ShowIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showCreateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTable(MySQLStatementParser.ShowCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showOther}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowOther(MySQLStatementParser.ShowOtherContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#fromSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromSchema(MySQLStatementParser.FromSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#fromTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromTable(MySQLStatementParser.FromTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showLike}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowLike(MySQLStatementParser.ShowLikeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showColumnLike_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumnLike_(MySQLStatementParser.ShowColumnLike_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showWhereClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowWhereClause_(MySQLStatementParser.ShowWhereClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFilter(MySQLStatementParser.ShowFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showProfileType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProfileType(MySQLStatementParser.ShowProfileTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#setVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVariable(MySQLStatementParser.SetVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showBinaryLogs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowBinaryLogs(MySQLStatementParser.ShowBinaryLogsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showBinlogEvents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowBinlogEvents(MySQLStatementParser.ShowBinlogEventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showCharacterSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCharacterSet(MySQLStatementParser.ShowCharacterSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showCollation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCollation(MySQLStatementParser.ShowCollationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showCreateDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateDatabase(MySQLStatementParser.ShowCreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showCreateEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateEvent(MySQLStatementParser.ShowCreateEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showCreateFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateFunction(MySQLStatementParser.ShowCreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showCreateProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateProcedure(MySQLStatementParser.ShowCreateProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showCreateTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTrigger(MySQLStatementParser.ShowCreateTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showCreateUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateUser(MySQLStatementParser.ShowCreateUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showCreateView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateView(MySQLStatementParser.ShowCreateViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowEngine(MySQLStatementParser.ShowEngineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showEngines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowEngines(MySQLStatementParser.ShowEnginesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showErrors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowErrors(MySQLStatementParser.ShowErrorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showEvents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowEvents(MySQLStatementParser.ShowEventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showFunctionCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctionCode(MySQLStatementParser.ShowFunctionCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showFunctionStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctionStatus(MySQLStatementParser.ShowFunctionStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showGrant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowGrant(MySQLStatementParser.ShowGrantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showMasterStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowMasterStatus(MySQLStatementParser.ShowMasterStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showOpenTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowOpenTables(MySQLStatementParser.ShowOpenTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showPlugins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPlugins(MySQLStatementParser.ShowPluginsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showPrivileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPrivileges(MySQLStatementParser.ShowPrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showProcedureCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProcedureCode(MySQLStatementParser.ShowProcedureCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showProcedureStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProcedureStatus(MySQLStatementParser.ShowProcedureStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showProcesslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProcesslist(MySQLStatementParser.ShowProcesslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showProfile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProfile(MySQLStatementParser.ShowProfileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showProfiles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProfiles(MySQLStatementParser.ShowProfilesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showRelaylogEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowRelaylogEvent(MySQLStatementParser.ShowRelaylogEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showSlavehost}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSlavehost(MySQLStatementParser.ShowSlavehostContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showSlaveStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSlaveStatus(MySQLStatementParser.ShowSlaveStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowStatus(MySQLStatementParser.ShowStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showTrriggers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTrriggers(MySQLStatementParser.ShowTrriggersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowVariables(MySQLStatementParser.ShowVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#showWarnings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowWarnings(MySQLStatementParser.ShowWarningsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#setCharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCharacter(MySQLStatementParser.SetCharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#setName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetName(MySQLStatementParser.SetNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#clone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClone(MySQLStatementParser.CloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#cloneAction_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloneAction_(MySQLStatementParser.CloneAction_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createUdf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUdf(MySQLStatementParser.CreateUdfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#installComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstallComponent(MySQLStatementParser.InstallComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#installPlugin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstallPlugin(MySQLStatementParser.InstallPluginContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#uninstallComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUninstallComponent(MySQLStatementParser.UninstallComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUninstallPlugin(MySQLStatementParser.UninstallPluginContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#analyzeTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzeTable(MySQLStatementParser.AnalyzeTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#checkTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckTable(MySQLStatementParser.CheckTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#checkTableOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckTableOption_(MySQLStatementParser.CheckTableOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#checksumTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecksumTable(MySQLStatementParser.ChecksumTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#optimizeTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimizeTable(MySQLStatementParser.OptimizeTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#repairTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepairTable(MySQLStatementParser.RepairTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#alterResourceGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterResourceGroup(MySQLStatementParser.AlterResourceGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#vcpuSpec_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVcpuSpec_(MySQLStatementParser.VcpuSpec_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#createResourceGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateResourceGroup(MySQLStatementParser.CreateResourceGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#dropResourceGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropResourceGroup(MySQLStatementParser.DropResourceGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#setResourceGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetResourceGroup(MySQLStatementParser.SetResourceGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#binlog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinlog(MySQLStatementParser.BinlogContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#cacheIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheIndex(MySQLStatementParser.CacheIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#tableIndexList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIndexList(MySQLStatementParser.TableIndexListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#partitionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionList(MySQLStatementParser.PartitionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#flush}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlush(MySQLStatementParser.FlushContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#flushOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlushOption_(MySQLStatementParser.FlushOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#tablesOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablesOption_(MySQLStatementParser.TablesOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#kill}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKill(MySQLStatementParser.KillContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#loadIndexInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadIndexInfo(MySQLStatementParser.LoadIndexInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#resetStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetStatement(MySQLStatementParser.ResetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#resetOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetOption_(MySQLStatementParser.ResetOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#resetPersist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetPersist(MySQLStatementParser.ResetPersistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#restart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestart(MySQLStatementParser.RestartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#shutdown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShutdown(MySQLStatementParser.ShutdownContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#changeMasterTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeMasterTo(MySQLStatementParser.ChangeMasterToContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#startSlave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartSlave(MySQLStatementParser.StartSlaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#stopSlave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopSlave(MySQLStatementParser.StopSlaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#threadTypes_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreadTypes_(MySQLStatementParser.ThreadTypes_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#threadType_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreadType_(MySQLStatementParser.ThreadType_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#utilOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtilOption_(MySQLStatementParser.UtilOption_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#connectionOptions_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnectionOptions_(MySQLStatementParser.ConnectionOptions_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#channelOption_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelOption_(MySQLStatementParser.ChannelOption_Context ctx);
}
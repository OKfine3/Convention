// Generated from D:/laboratory/Convention_lwj/AST_generator/src/main/resources/g4_files/Spesc.g4 by ANTLR 4.13.1
package edu.ustb.crypto.convention.spescParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SpescParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SpescVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SpescParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(SpescParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#packageDir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDir(SpescParser.PackageDirContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#dir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDir(SpescParser.DirContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#contractDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractDefinition(SpescParser.ContractDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#contractType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractType(SpescParser.ContractTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#conventionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConventionName(SpescParser.ConventionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#contractBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractBody(SpescParser.ContractBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#party}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParty(SpescParser.PartyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#asset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsset(SpescParser.AssetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(SpescParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyName(SpescParser.PropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(SpescParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(SpescParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#partyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartyName(SpescParser.PartyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#assetName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssetName(SpescParser.AssetNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SpescParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#additionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionName(SpescParser.AdditionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfo(SpescParser.InfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#right}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight(SpescParser.RightContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SpescParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#generalTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralTerm(SpescParser.GeneralTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#breachTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreachTerm(SpescParser.BreachTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#arbiTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArbiTerm(SpescParser.ArbiTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#generalTermDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralTermDeclaration(SpescParser.GeneralTermDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#duty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuty(SpescParser.DutyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#breachTermDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreachTermDeclaration(SpescParser.BreachTermDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#againstDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgainstDeclaration(SpescParser.AgainstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#controversy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControversy(SpescParser.ControversyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#institution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstitution(SpescParser.InstitutionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(SpescParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(SpescParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#actionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionName(SpescParser.ActionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#parametersList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersList(SpescParser.ParametersListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(SpescParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#whenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenStatement(SpescParser.WhenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(SpescParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#whereStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereStatement(SpescParser.WhereStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(SpescParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(SpescParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(SpescParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#timeUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeUnit(SpescParser.TimeUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(SpescParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(SpescParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#andChildExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndChildExpression(SpescParser.AndChildExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#notExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(SpescParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#timeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeExpression(SpescParser.TimeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#timePeriodExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimePeriodExpression(SpescParser.TimePeriodExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#timePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimePredicate(SpescParser.TimePredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#boundedTimePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundedTimePredicate(SpescParser.BoundedTimePredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#timeConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeConstant(SpescParser.TimeConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#timeConstantUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeConstantUnit(SpescParser.TimeConstantUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#timePointExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimePointExpression(SpescParser.TimePointExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#actionEnforcedTimeQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionEnforcedTimeQuery(SpescParser.ActionEnforcedTimeQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#termDuty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermDuty(SpescParser.TermDutyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#actionMultiplicity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionMultiplicity(SpescParser.ActionMultiplicityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#timeQueryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeQueryOperator(SpescParser.TimeQueryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#addTimeConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTimeConstant(SpescParser.AddTimeConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(SpescParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#timePredicateOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimePredicateOperator(SpescParser.TimePredicateOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#isOrNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsOrNot(SpescParser.IsOrNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(SpescParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(SpescParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#childExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildExpression(SpescParser.ChildExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(SpescParser.Assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(SpescParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_expression(SpescParser.Arithmetic_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#addSubExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpression(SpescParser.AddSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#mulDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpression(SpescParser.MulDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(SpescParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#comparativeRelationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparativeRelationExpression(SpescParser.ComparativeRelationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#atomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpression(SpescParser.AtomExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(SpescParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#rule_STRING}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_STRING(SpescParser.Rule_STRINGContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#rule_BOOLEAN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_BOOLEAN(SpescParser.Rule_BOOLEANContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#rule_INTEGER}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_INTEGER(SpescParser.Rule_INTEGERContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#rule_FLOAT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_FLOAT(SpescParser.Rule_FLOATContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#rule_DOUBLE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_DOUBLE(SpescParser.Rule_DOUBLEContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(SpescParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link SpescParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpr(SpescParser.ValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link SpescParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADD(SpescParser.ADDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link SpescParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarReference(SpescParser.VarReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SUBSTRACT}
	 * labeled alternative in {@link SpescParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSUBSTRACT(SpescParser.SUBSTRACTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULTIPLY}
	 * labeled alternative in {@link SpescParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULTIPLY(SpescParser.MULTIPLYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DIVIDE}
	 * labeled alternative in {@link SpescParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDIVIDE(SpescParser.DIVIDEContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#relationOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationOperator(SpescParser.RelationOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#ofOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOfOperator(SpescParser.OfOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#transferOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransferOperation(SpescParser.TransferOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#moneyExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoneyExpression(SpescParser.MoneyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#assetExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssetExpression(SpescParser.AssetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause(SpescParser.ClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#bindClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindClause(SpescParser.BindClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#factorBind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorBind(SpescParser.FactorBindContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#lo_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLo_type(SpescParser.Lo_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(SpescParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#itemLimitation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemLimitation(SpescParser.ItemLimitationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#itemLimitationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemLimitationName(SpescParser.ItemLimitationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#generalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralClause(SpescParser.GeneralClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#clauseDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseDeclaration(SpescParser.ClauseDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#cvDuty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvDuty(SpescParser.CvDutyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#mustFulfilObligation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustFulfilObligation(SpescParser.MustFulfilObligationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#canExerciseRight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCanExerciseRight(SpescParser.CanExerciseRightContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#breachClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreachClause(SpescParser.BreachClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#breachClauseDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreachClauseDeclaration(SpescParser.BreachClauseDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#legalRight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLegalRight(SpescParser.LegalRightContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#legalRightDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLegalRightDeclaration(SpescParser.LegalRightDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#rightContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightContent(SpescParser.RightContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#rightSubject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightSubject(SpescParser.RightSubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#possessTheRight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPossessTheRight(SpescParser.PossessTheRightContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#rightObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightObject(SpescParser.RightObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#onTheObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnTheObject(SpescParser.OnTheObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#lawSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLawSource(SpescParser.LawSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#accordTo}.
	 * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAccordTo(SpescParser.AccordToContext ctx);

    /**
     * Visit a parse tree produced by {@link SpescParser#rightOf}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRightOf(SpescParser.RightOfContext ctx);

    /**
     * Visit a parse tree produced by {@link SpescParser#includingRightName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIncludingRightName(SpescParser.IncludingRightNameContext ctx);

    /**
     * Visit a parse tree produced by {@link SpescParser#rightName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRightName(SpescParser.RightNameContext ctx);

    /**
     * Visit a parse tree produced by {@link SpescParser#lawName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLawName(SpescParser.LawNameContext ctx);

    /**
     * Visit a parse tree produced by {@link SpescParser#rightObjectName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRightObjectName(SpescParser.RightObjectNameContext ctx);

    /**
     * Visit a parse tree produced by {@link SpescParser#impldeclaration}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitImpldeclaration(SpescParser.ImpldeclarationContext ctx);

    /**
     * Visit a parse tree produced by {@link SpescParser#value}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
	T visitValue(SpescParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(SpescParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(SpescParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(SpescParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#jsonObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObject(SpescParser.JsonObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(SpescParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(SpescParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(SpescParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SpescParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#structObj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructObj(SpescParser.StructObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#structArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructArr(SpescParser.StructArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpescParser#keyPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyPair(SpescParser.KeyPairContext ctx);
}
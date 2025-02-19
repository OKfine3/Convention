// Generated from D:/laboratory/Convention_lwj/AST_generator/src/main/resources/g4_files/Spesc.g4 by ANTLR 4.13.1
package edu.ustb.crypto.convention.spescParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SpescParser}.
 */
public interface SpescListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SpescParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(SpescParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(SpescParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#packageDir}.
	 * @param ctx the parse tree
	 */
	void enterPackageDir(SpescParser.PackageDirContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#packageDir}.
	 * @param ctx the parse tree
	 */
	void exitPackageDir(SpescParser.PackageDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#dir}.
	 * @param ctx the parse tree
	 */
	void enterDir(SpescParser.DirContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#dir}.
	 * @param ctx the parse tree
	 */
	void exitDir(SpescParser.DirContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void enterContractDefinition(SpescParser.ContractDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void exitContractDefinition(SpescParser.ContractDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#contractType}.
	 * @param ctx the parse tree
	 */
	void enterContractType(SpescParser.ContractTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#contractType}.
	 * @param ctx the parse tree
	 */
	void exitContractType(SpescParser.ContractTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#conventionName}.
	 * @param ctx the parse tree
	 */
	void enterConventionName(SpescParser.ConventionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#conventionName}.
	 * @param ctx the parse tree
	 */
	void exitConventionName(SpescParser.ConventionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#contractBody}.
	 * @param ctx the parse tree
	 */
	void enterContractBody(SpescParser.ContractBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#contractBody}.
	 * @param ctx the parse tree
	 */
	void exitContractBody(SpescParser.ContractBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#party}.
	 * @param ctx the parse tree
	 */
	void enterParty(SpescParser.PartyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#party}.
	 * @param ctx the parse tree
	 */
	void exitParty(SpescParser.PartyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#asset}.
	 * @param ctx the parse tree
	 */
	void enterAsset(SpescParser.AssetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#asset}.
	 * @param ctx the parse tree
	 */
	void exitAsset(SpescParser.AssetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(SpescParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(SpescParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(SpescParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(SpescParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#partyName}.
	 * @param ctx the parse tree
	 */
	void enterPartyName(SpescParser.PartyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#partyName}.
	 * @param ctx the parse tree
	 */
	void exitPartyName(SpescParser.PartyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#assetName}.
	 * @param ctx the parse tree
	 */
	void enterAssetName(SpescParser.AssetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#assetName}.
	 * @param ctx the parse tree
	 */
	void exitAssetName(SpescParser.AssetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SpescParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SpescParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#additionName}.
	 * @param ctx the parse tree
	 */
	void enterAdditionName(SpescParser.AdditionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#additionName}.
	 * @param ctx the parse tree
	 */
	void exitAdditionName(SpescParser.AdditionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#info}.
	 * @param ctx the parse tree
	 */
	void enterInfo(SpescParser.InfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#info}.
	 * @param ctx the parse tree
	 */
	void exitInfo(SpescParser.InfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#right}.
	 * @param ctx the parse tree
	 */
	void enterRight(SpescParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#right}.
	 * @param ctx the parse tree
	 */
	void exitRight(SpescParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SpescParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SpescParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#generalTerm}.
	 * @param ctx the parse tree
	 */
	void enterGeneralTerm(SpescParser.GeneralTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#generalTerm}.
	 * @param ctx the parse tree
	 */
	void exitGeneralTerm(SpescParser.GeneralTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#breachTerm}.
	 * @param ctx the parse tree
	 */
	void enterBreachTerm(SpescParser.BreachTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#breachTerm}.
	 * @param ctx the parse tree
	 */
	void exitBreachTerm(SpescParser.BreachTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#arbiTerm}.
	 * @param ctx the parse tree
	 */
	void enterArbiTerm(SpescParser.ArbiTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#arbiTerm}.
	 * @param ctx the parse tree
	 */
	void exitArbiTerm(SpescParser.ArbiTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#generalTermDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGeneralTermDeclaration(SpescParser.GeneralTermDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#generalTermDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGeneralTermDeclaration(SpescParser.GeneralTermDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#duty}.
	 * @param ctx the parse tree
	 */
	void enterDuty(SpescParser.DutyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#duty}.
	 * @param ctx the parse tree
	 */
	void exitDuty(SpescParser.DutyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#breachTermDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBreachTermDeclaration(SpescParser.BreachTermDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#breachTermDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBreachTermDeclaration(SpescParser.BreachTermDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#againstDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAgainstDeclaration(SpescParser.AgainstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#againstDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAgainstDeclaration(SpescParser.AgainstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#controversy}.
	 * @param ctx the parse tree
	 */
	void enterControversy(SpescParser.ControversyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#controversy}.
	 * @param ctx the parse tree
	 */
	void exitControversy(SpescParser.ControversyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#institution}.
	 * @param ctx the parse tree
	 */
	void enterInstitution(SpescParser.InstitutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#institution}.
	 * @param ctx the parse tree
	 */
	void exitInstitution(SpescParser.InstitutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(SpescParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(SpescParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(SpescParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(SpescParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#actionName}.
	 * @param ctx the parse tree
	 */
	void enterActionName(SpescParser.ActionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#actionName}.
	 * @param ctx the parse tree
	 */
	void exitActionName(SpescParser.ActionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void enterParametersList(SpescParser.ParametersListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void exitParametersList(SpescParser.ParametersListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SpescParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SpescParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#whenStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhenStatement(SpescParser.WhenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#whenStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhenStatement(SpescParser.WhenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SpescParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SpescParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#whereStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhereStatement(SpescParser.WhereStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#whereStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhereStatement(SpescParser.WhereStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(SpescParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(SpescParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(SpescParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(SpescParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(SpescParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(SpescParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#timeUnit}.
	 * @param ctx the parse tree
	 */
	void enterTimeUnit(SpescParser.TimeUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#timeUnit}.
	 * @param ctx the parse tree
	 */
	void exitTimeUnit(SpescParser.TimeUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(SpescParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(SpescParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(SpescParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(SpescParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#andChildExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndChildExpression(SpescParser.AndChildExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#andChildExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndChildExpression(SpescParser.AndChildExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(SpescParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(SpescParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#timeExpression}.
	 * @param ctx the parse tree
	 */
	void enterTimeExpression(SpescParser.TimeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#timeExpression}.
	 * @param ctx the parse tree
	 */
	void exitTimeExpression(SpescParser.TimeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#timePeriodExpression}.
	 * @param ctx the parse tree
	 */
	void enterTimePeriodExpression(SpescParser.TimePeriodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#timePeriodExpression}.
	 * @param ctx the parse tree
	 */
	void exitTimePeriodExpression(SpescParser.TimePeriodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#timePredicate}.
	 * @param ctx the parse tree
	 */
	void enterTimePredicate(SpescParser.TimePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#timePredicate}.
	 * @param ctx the parse tree
	 */
	void exitTimePredicate(SpescParser.TimePredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#boundedTimePredicate}.
	 * @param ctx the parse tree
	 */
	void enterBoundedTimePredicate(SpescParser.BoundedTimePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#boundedTimePredicate}.
	 * @param ctx the parse tree
	 */
	void exitBoundedTimePredicate(SpescParser.BoundedTimePredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#timeConstant}.
	 * @param ctx the parse tree
	 */
	void enterTimeConstant(SpescParser.TimeConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#timeConstant}.
	 * @param ctx the parse tree
	 */
	void exitTimeConstant(SpescParser.TimeConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#timeConstantUnit}.
	 * @param ctx the parse tree
	 */
	void enterTimeConstantUnit(SpescParser.TimeConstantUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#timeConstantUnit}.
	 * @param ctx the parse tree
	 */
	void exitTimeConstantUnit(SpescParser.TimeConstantUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#timePointExpression}.
	 * @param ctx the parse tree
	 */
	void enterTimePointExpression(SpescParser.TimePointExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#timePointExpression}.
	 * @param ctx the parse tree
	 */
	void exitTimePointExpression(SpescParser.TimePointExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#actionEnforcedTimeQuery}.
	 * @param ctx the parse tree
	 */
	void enterActionEnforcedTimeQuery(SpescParser.ActionEnforcedTimeQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#actionEnforcedTimeQuery}.
	 * @param ctx the parse tree
	 */
	void exitActionEnforcedTimeQuery(SpescParser.ActionEnforcedTimeQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#termDuty}.
	 * @param ctx the parse tree
	 */
	void enterTermDuty(SpescParser.TermDutyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#termDuty}.
	 * @param ctx the parse tree
	 */
	void exitTermDuty(SpescParser.TermDutyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#actionMultiplicity}.
	 * @param ctx the parse tree
	 */
	void enterActionMultiplicity(SpescParser.ActionMultiplicityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#actionMultiplicity}.
	 * @param ctx the parse tree
	 */
	void exitActionMultiplicity(SpescParser.ActionMultiplicityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#timeQueryOperator}.
	 * @param ctx the parse tree
	 */
	void enterTimeQueryOperator(SpescParser.TimeQueryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#timeQueryOperator}.
	 * @param ctx the parse tree
	 */
	void exitTimeQueryOperator(SpescParser.TimeQueryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#addTimeConstant}.
	 * @param ctx the parse tree
	 */
	void enterAddTimeConstant(SpescParser.AddTimeConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#addTimeConstant}.
	 * @param ctx the parse tree
	 */
	void exitAddTimeConstant(SpescParser.AddTimeConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(SpescParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(SpescParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#timePredicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterTimePredicateOperator(SpescParser.TimePredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#timePredicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitTimePredicateOperator(SpescParser.TimePredicateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#isOrNot}.
	 * @param ctx the parse tree
	 */
	void enterIsOrNot(SpescParser.IsOrNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#isOrNot}.
	 * @param ctx the parse tree
	 */
	void exitIsOrNot(SpescParser.IsOrNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(SpescParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(SpescParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(SpescParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(SpescParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#childExpression}.
	 * @param ctx the parse tree
	 */
	void enterChildExpression(SpescParser.ChildExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#childExpression}.
	 * @param ctx the parse tree
	 */
	void exitChildExpression(SpescParser.ChildExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(SpescParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(SpescParser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(SpescParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(SpescParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expression(SpescParser.Arithmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expression(SpescParser.Arithmetic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpression(SpescParser.AddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpression(SpescParser.AddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpression(SpescParser.MulDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpression(SpescParser.MulDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(SpescParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(SpescParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#comparativeRelationExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparativeRelationExpression(SpescParser.ComparativeRelationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#comparativeRelationExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparativeRelationExpression(SpescParser.ComparativeRelationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpression(SpescParser.AtomExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpression(SpescParser.AtomExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(SpescParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(SpescParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#rule_STRING}.
	 * @param ctx the parse tree
	 */
	void enterRule_STRING(SpescParser.Rule_STRINGContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#rule_STRING}.
	 * @param ctx the parse tree
	 */
	void exitRule_STRING(SpescParser.Rule_STRINGContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#rule_BOOLEAN}.
	 * @param ctx the parse tree
	 */
	void enterRule_BOOLEAN(SpescParser.Rule_BOOLEANContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#rule_BOOLEAN}.
	 * @param ctx the parse tree
	 */
	void exitRule_BOOLEAN(SpescParser.Rule_BOOLEANContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#rule_INTEGER}.
	 * @param ctx the parse tree
	 */
	void enterRule_INTEGER(SpescParser.Rule_INTEGERContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#rule_INTEGER}.
	 * @param ctx the parse tree
	 */
	void exitRule_INTEGER(SpescParser.Rule_INTEGERContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#rule_FLOAT}.
	 * @param ctx the parse tree
	 */
	void enterRule_FLOAT(SpescParser.Rule_FLOATContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#rule_FLOAT}.
	 * @param ctx the parse tree
	 */
	void exitRule_FLOAT(SpescParser.Rule_FLOATContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#rule_DOUBLE}.
	 * @param ctx the parse tree
	 */
	void enterRule_DOUBLE(SpescParser.Rule_DOUBLEContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#rule_DOUBLE}.
	 * @param ctx the parse tree
	 */
	void exitRule_DOUBLE(SpescParser.Rule_DOUBLEContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(SpescParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(SpescParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link SpescParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpr(SpescParser.ValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link SpescParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpr(SpescParser.ValueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link SpescParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterADD(SpescParser.ADDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link SpescParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitADD(SpescParser.ADDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link SpescParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarReference(SpescParser.VarReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link SpescParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarReference(SpescParser.VarReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SUBSTRACT}
	 * labeled alternative in {@link SpescParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSUBSTRACT(SpescParser.SUBSTRACTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SUBSTRACT}
	 * labeled alternative in {@link SpescParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSUBSTRACT(SpescParser.SUBSTRACTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULTIPLY}
	 * labeled alternative in {@link SpescParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMULTIPLY(SpescParser.MULTIPLYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULTIPLY}
	 * labeled alternative in {@link SpescParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMULTIPLY(SpescParser.MULTIPLYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DIVIDE}
	 * labeled alternative in {@link SpescParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDIVIDE(SpescParser.DIVIDEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DIVIDE}
	 * labeled alternative in {@link SpescParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDIVIDE(SpescParser.DIVIDEContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#relationOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationOperator(SpescParser.RelationOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#relationOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationOperator(SpescParser.RelationOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#ofOperator}.
	 * @param ctx the parse tree
	 */
	void enterOfOperator(SpescParser.OfOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#ofOperator}.
	 * @param ctx the parse tree
	 */
	void exitOfOperator(SpescParser.OfOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#transferOperation}.
	 * @param ctx the parse tree
	 */
	void enterTransferOperation(SpescParser.TransferOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#transferOperation}.
	 * @param ctx the parse tree
	 */
	void exitTransferOperation(SpescParser.TransferOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#moneyExpression}.
	 * @param ctx the parse tree
	 */
	void enterMoneyExpression(SpescParser.MoneyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#moneyExpression}.
	 * @param ctx the parse tree
	 */
	void exitMoneyExpression(SpescParser.MoneyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#assetExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssetExpression(SpescParser.AssetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#assetExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssetExpression(SpescParser.AssetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(SpescParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(SpescParser.ClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#bindClause}.
	 * @param ctx the parse tree
	 */
	void enterBindClause(SpescParser.BindClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#bindClause}.
	 * @param ctx the parse tree
	 */
	void exitBindClause(SpescParser.BindClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#factorBind}.
	 * @param ctx the parse tree
	 */
	void enterFactorBind(SpescParser.FactorBindContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#factorBind}.
	 * @param ctx the parse tree
	 */
	void exitFactorBind(SpescParser.FactorBindContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#lo_type}.
	 * @param ctx the parse tree
	 */
	void enterLo_type(SpescParser.Lo_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#lo_type}.
	 * @param ctx the parse tree
	 */
	void exitLo_type(SpescParser.Lo_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(SpescParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(SpescParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#itemLimitation}.
	 * @param ctx the parse tree
	 */
	void enterItemLimitation(SpescParser.ItemLimitationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#itemLimitation}.
	 * @param ctx the parse tree
	 */
	void exitItemLimitation(SpescParser.ItemLimitationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#itemLimitationName}.
	 * @param ctx the parse tree
	 */
	void enterItemLimitationName(SpescParser.ItemLimitationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#itemLimitationName}.
	 * @param ctx the parse tree
	 */
	void exitItemLimitationName(SpescParser.ItemLimitationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#generalClause}.
	 * @param ctx the parse tree
	 */
	void enterGeneralClause(SpescParser.GeneralClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#generalClause}.
	 * @param ctx the parse tree
	 */
	void exitGeneralClause(SpescParser.GeneralClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#clauseDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClauseDeclaration(SpescParser.ClauseDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#clauseDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClauseDeclaration(SpescParser.ClauseDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#mustFulfilObligation}.
	 * @param ctx the parse tree
	 */
	void enterMustFulfilObligation(SpescParser.MustFulfilObligationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#mustFulfilObligation}.
	 * @param ctx the parse tree
	 */
	void exitMustFulfilObligation(SpescParser.MustFulfilObligationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#canExerciseRight}.
	 * @param ctx the parse tree
	 */
	void enterCanExerciseRight(SpescParser.CanExerciseRightContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#canExerciseRight}.
	 * @param ctx the parse tree
	 */
	void exitCanExerciseRight(SpescParser.CanExerciseRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#breachClause}.
	 * @param ctx the parse tree
	 */
	void enterBreachClause(SpescParser.BreachClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#breachClause}.
	 * @param ctx the parse tree
	 */
	void exitBreachClause(SpescParser.BreachClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#breachClauseDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBreachClauseDeclaration(SpescParser.BreachClauseDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#breachClauseDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBreachClauseDeclaration(SpescParser.BreachClauseDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#legalRight}.
	 * @param ctx the parse tree
	 */
	void enterLegalRight(SpescParser.LegalRightContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#legalRight}.
	 * @param ctx the parse tree
	 */
	void exitLegalRight(SpescParser.LegalRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#legalRightDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLegalRightDeclaration(SpescParser.LegalRightDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#legalRightDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLegalRightDeclaration(SpescParser.LegalRightDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#rightContent}.
	 * @param ctx the parse tree
	 */
	void enterRightContent(SpescParser.RightContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#rightContent}.
	 * @param ctx the parse tree
	 */
	void exitRightContent(SpescParser.RightContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#rightSubject}.
	 * @param ctx the parse tree
	 */
	void enterRightSubject(SpescParser.RightSubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#rightSubject}.
	 * @param ctx the parse tree
	 */
	void exitRightSubject(SpescParser.RightSubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#possessTheRight}.
	 * @param ctx the parse tree
	 */
	void enterPossessTheRight(SpescParser.PossessTheRightContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#possessTheRight}.
	 * @param ctx the parse tree
	 */
	void exitPossessTheRight(SpescParser.PossessTheRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#rightObject}.
	 * @param ctx the parse tree
	 */
	void enterRightObject(SpescParser.RightObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#rightObject}.
	 * @param ctx the parse tree
	 */
	void exitRightObject(SpescParser.RightObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#onTheObject}.
	 * @param ctx the parse tree
	 */
	void enterOnTheObject(SpescParser.OnTheObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#onTheObject}.
	 * @param ctx the parse tree
	 */
	void exitOnTheObject(SpescParser.OnTheObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#lawSource}.
	 * @param ctx the parse tree
	 */
	void enterLawSource(SpescParser.LawSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#lawSource}.
	 * @param ctx the parse tree
	 */
	void exitLawSource(SpescParser.LawSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#accordTo}.
	 * @param ctx the parse tree
	 */
	void enterAccordTo(SpescParser.AccordToContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#accordTo}.
	 * @param ctx the parse tree
	 */
	void exitAccordTo(SpescParser.AccordToContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#rightOf}.
	 * @param ctx the parse tree
	 */
	void enterRightOf(SpescParser.RightOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#rightOf}.
	 * @param ctx the parse tree
	 */
	void exitRightOf(SpescParser.RightOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#rightName}.
	 * @param ctx the parse tree
	 */
	void enterRightName(SpescParser.RightNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#rightName}.
	 * @param ctx the parse tree
	 */
	void exitRightName(SpescParser.RightNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#lawName}.
	 * @param ctx the parse tree
	 */
	void enterLawName(SpescParser.LawNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#lawName}.
	 * @param ctx the parse tree
	 */
	void exitLawName(SpescParser.LawNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#impldeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImpldeclaration(SpescParser.ImpldeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#impldeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImpldeclaration(SpescParser.ImpldeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SpescParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SpescParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(SpescParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(SpescParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(SpescParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(SpescParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(SpescParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(SpescParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void enterJsonObject(SpescParser.JsonObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void exitJsonObject(SpescParser.JsonObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(SpescParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(SpescParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(SpescParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(SpescParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(SpescParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(SpescParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SpescParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SpescParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#structObj}.
	 * @param ctx the parse tree
	 */
	void enterStructObj(SpescParser.StructObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#structObj}.
	 * @param ctx the parse tree
	 */
	void exitStructObj(SpescParser.StructObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#structArr}.
	 * @param ctx the parse tree
	 */
	void enterStructArr(SpescParser.StructArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#structArr}.
	 * @param ctx the parse tree
	 */
	void exitStructArr(SpescParser.StructArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpescParser#keyPair}.
	 * @param ctx the parse tree
	 */
	void enterKeyPair(SpescParser.KeyPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpescParser#keyPair}.
	 * @param ctx the parse tree
	 */
	void exitKeyPair(SpescParser.KeyPairContext ctx);
}
// Generated from Stexgrammar.g4 by ANTLR 4.3

	package at.andreasfend.stex.parser.antlr4;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StexgrammarParser}.
 */
public interface StexgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#functionlist}.
	 * @param ctx the parse tree
	 */
	void enterFunctionlist(@NotNull StexgrammarParser.FunctionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#functionlist}.
	 * @param ctx the parse tree
	 */
	void exitFunctionlist(@NotNull StexgrammarParser.FunctionlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void enterWhilestatement(@NotNull StexgrammarParser.WhilestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void exitWhilestatement(@NotNull StexgrammarParser.WhilestatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#deref}.
	 * @param ctx the parse tree
	 */
	void enterDeref(@NotNull StexgrammarParser.DerefContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#deref}.
	 * @param ctx the parse tree
	 */
	void exitDeref(@NotNull StexgrammarParser.DerefContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(@NotNull StexgrammarParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(@NotNull StexgrammarParser.FunctioncallContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#catchblock}.
	 * @param ctx the parse tree
	 */
	void enterCatchblock(@NotNull StexgrammarParser.CatchblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#catchblock}.
	 * @param ctx the parse tree
	 */
	void exitCatchblock(@NotNull StexgrammarParser.CatchblockContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull StexgrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull StexgrammarParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#trystatement}.
	 * @param ctx the parse tree
	 */
	void enterTrystatement(@NotNull StexgrammarParser.TrystatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#trystatement}.
	 * @param ctx the parse tree
	 */
	void exitTrystatement(@NotNull StexgrammarParser.TrystatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#throwstatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowstatement(@NotNull StexgrammarParser.ThrowstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#throwstatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowstatement(@NotNull StexgrammarParser.ThrowstatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#ref}.
	 * @param ctx the parse tree
	 */
	void enterRef(@NotNull StexgrammarParser.RefContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#ref}.
	 * @param ctx the parse tree
	 */
	void exitRef(@NotNull StexgrammarParser.RefContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#notoperation}.
	 * @param ctx the parse tree
	 */
	void enterNotoperation(@NotNull StexgrammarParser.NotoperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#notoperation}.
	 * @param ctx the parse tree
	 */
	void exitNotoperation(@NotNull StexgrammarParser.NotoperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull StexgrammarParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull StexgrammarParser.ArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull StexgrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull StexgrammarParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull StexgrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull StexgrammarParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#expressionop}.
	 * @param ctx the parse tree
	 */
	void enterExpressionop(@NotNull StexgrammarParser.ExpressionopContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#expressionop}.
	 * @param ctx the parse tree
	 */
	void exitExpressionop(@NotNull StexgrammarParser.ExpressionopContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#voidfunction}.
	 * @param ctx the parse tree
	 */
	void enterVoidfunction(@NotNull StexgrammarParser.VoidfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#voidfunction}.
	 * @param ctx the parse tree
	 */
	void exitVoidfunction(@NotNull StexgrammarParser.VoidfunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#arrayaccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayaccess(@NotNull StexgrammarParser.ArrayaccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#arrayaccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayaccess(@NotNull StexgrammarParser.ArrayaccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnstatement(@NotNull StexgrammarParser.ReturnstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnstatement(@NotNull StexgrammarParser.ReturnstatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#varstatement}.
	 * @param ctx the parse tree
	 */
	void enterVarstatement(@NotNull StexgrammarParser.VarstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#varstatement}.
	 * @param ctx the parse tree
	 */
	void exitVarstatement(@NotNull StexgrammarParser.VarstatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull StexgrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull StexgrammarParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull StexgrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull StexgrammarParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull StexgrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull StexgrammarParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#objectfield}.
	 * @param ctx the parse tree
	 */
	void enterObjectfield(@NotNull StexgrammarParser.ObjectfieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#objectfield}.
	 * @param ctx the parse tree
	 */
	void exitObjectfield(@NotNull StexgrammarParser.ObjectfieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#assignstatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignstatement(@NotNull StexgrammarParser.AssignstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#assignstatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignstatement(@NotNull StexgrammarParser.AssignstatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#elseblock}.
	 * @param ctx the parse tree
	 */
	void enterElseblock(@NotNull StexgrammarParser.ElseblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#elseblock}.
	 * @param ctx the parse tree
	 */
	void exitElseblock(@NotNull StexgrammarParser.ElseblockContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(@NotNull StexgrammarParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(@NotNull StexgrammarParser.ParamlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#operationtype}.
	 * @param ctx the parse tree
	 */
	void enterOperationtype(@NotNull StexgrammarParser.OperationtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#operationtype}.
	 * @param ctx the parse tree
	 */
	void exitOperationtype(@NotNull StexgrammarParser.OperationtypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(@NotNull StexgrammarParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(@NotNull StexgrammarParser.IfstatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#functioncallargs}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncallargs(@NotNull StexgrammarParser.FunctioncallargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#functioncallargs}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncallargs(@NotNull StexgrammarParser.FunctioncallargsContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#assignee}.
	 * @param ctx the parse tree
	 */
	void enterAssignee(@NotNull StexgrammarParser.AssigneeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#assignee}.
	 * @param ctx the parse tree
	 */
	void exitAssignee(@NotNull StexgrammarParser.AssigneeContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(@NotNull StexgrammarParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(@NotNull StexgrammarParser.OperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(@NotNull StexgrammarParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(@NotNull StexgrammarParser.OperandContext ctx);

	/**
	 * Enter a parse tree produced by {@link StexgrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull StexgrammarParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link StexgrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull StexgrammarParser.ObjectContext ctx);
}
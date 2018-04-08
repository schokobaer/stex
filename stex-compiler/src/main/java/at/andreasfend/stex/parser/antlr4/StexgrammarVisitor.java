// Generated from Stexgrammar.g4 by ANTLR 4.3

	package at.andreasfend.stex.parser.antlr4;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StexgrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StexgrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#initialisation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialisation(@NotNull StexgrammarParser.InitialisationContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#whilestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestatement(@NotNull StexgrammarParser.WhilestatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#deref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeref(@NotNull StexgrammarParser.DerefContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(@NotNull StexgrammarParser.FunctioncallContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#catchblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchblock(@NotNull StexgrammarParser.CatchblockContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull StexgrammarParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#trystatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrystatement(@NotNull StexgrammarParser.TrystatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#throwstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowstatement(@NotNull StexgrammarParser.ThrowstatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef(@NotNull StexgrammarParser.RefContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(@NotNull StexgrammarParser.ArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull StexgrammarParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull StexgrammarParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#expressionop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionop(@NotNull StexgrammarParser.ExpressionopContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#arrayaccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayaccess(@NotNull StexgrammarParser.ArrayaccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#returnstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstatement(@NotNull StexgrammarParser.ReturnstatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#varstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarstatement(@NotNull StexgrammarParser.VarstatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull StexgrammarParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull StexgrammarParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#objectfield}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectfield(@NotNull StexgrammarParser.ObjectfieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#assignstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignstatement(@NotNull StexgrammarParser.AssignstatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#elseblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseblock(@NotNull StexgrammarParser.ElseblockContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamlist(@NotNull StexgrammarParser.ParamlistContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(@NotNull StexgrammarParser.IfstatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#functioncallargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncallargs(@NotNull StexgrammarParser.FunctioncallargsContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#assignee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignee(@NotNull StexgrammarParser.AssigneeContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(@NotNull StexgrammarParser.OperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(@NotNull StexgrammarParser.OperandContext ctx);

	/**
	 * Visit a parse tree produced by {@link StexgrammarParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(@NotNull StexgrammarParser.ObjectContext ctx);
}
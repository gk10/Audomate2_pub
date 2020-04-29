// Generated from generate/sources/Audomate.g4 by ANTLR 4.8
package generate.sources;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AudomateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AudomateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AudomateParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(AudomateParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link AudomateParser#testing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTesting(AudomateParser.TestingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AudomateParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(AudomateParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AudomateParser#lists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLists(AudomateParser.ListsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AudomateParser#getindex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetindex(AudomateParser.GetindexContext ctx);
	/**
	 * Visit a parse tree produced by {@link AudomateParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(AudomateParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AudomateParser#printing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrinting(AudomateParser.PrintingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AudomateParser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath(AudomateParser.MathContext ctx);
	/**
	 * Visit a parse tree produced by {@link AudomateParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(AudomateParser.PrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AudomateParser#beep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeep(AudomateParser.BeepContext ctx);
	/**
	 * Visit a parse tree produced by {@link AudomateParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(AudomateParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AudomateParser#loops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoops(AudomateParser.LoopsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AudomateParser#inequality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInequality(AudomateParser.InequalityContext ctx);
	/**
	 * Visit a parse tree produced by {@link AudomateParser#creation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreation(AudomateParser.CreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AudomateParser#machine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMachine(AudomateParser.MachineContext ctx);
	/**
	 * Visit a parse tree produced by {@link AudomateParser#createTask}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTask(AudomateParser.CreateTaskContext ctx);
	/**
	 * Visit a parse tree produced by {@link AudomateParser#doTask}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoTask(AudomateParser.DoTaskContext ctx);
	/**
	 * Visit a parse tree produced by {@link AudomateParser#addPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddPart(AudomateParser.AddPartContext ctx);
}
// Generated from C:/Users/Rene/Desktop/projects/PostfixCalculator/src/main/resources\PostfixCalculator.g4 by ANTLR 4.5.3
package at.technikum.spko.postfixcalculator.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PostfixCalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PostfixCalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PostfixCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PostfixCalculatorParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostfixCalculatorParser#addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(PostfixCalculatorParser.AdditionContext ctx);
}
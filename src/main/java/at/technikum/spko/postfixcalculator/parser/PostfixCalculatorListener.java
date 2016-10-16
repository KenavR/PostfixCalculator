// Generated from C:/Users/Rene/Desktop/projects/PostfixCalculator/src/main/resources\PostfixCalculator.g4 by ANTLR 4.5.3
package at.technikum.spko.postfixcalculator.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PostfixCalculatorParser}.
 */
public interface PostfixCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PostfixCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PostfixCalculatorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PostfixCalculatorParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfixCalculatorParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(PostfixCalculatorParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfixCalculatorParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(PostfixCalculatorParser.AdditionContext ctx);
}
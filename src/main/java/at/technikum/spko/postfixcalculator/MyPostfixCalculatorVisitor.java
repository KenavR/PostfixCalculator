package at.technikum.spko.postfixcalculator;

import at.technikum.spko.postfixcalculator.parser.PostfixCalculatorBaseVisitor;
import at.technikum.spko.postfixcalculator.parser.PostfixCalculatorParser;

public class MyPostfixCalculatorVisitor extends PostfixCalculatorBaseVisitor<String>{
    @Override
    public String visitAddition(PostfixCalculatorParser.AdditionContext ctx) {
        return super.visitAddition(ctx);
    }
}

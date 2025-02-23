/*
package edu.ustb.crypto.convention.compile.visitor;

import edu.ustb.crypto.convention.spescParser.SpescBaseVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;


*/
/**
 * 处理 赋值表达式、关系表达式或算数表达式
 *
 * @auther lwj
 * @date 2025/2/23 15:03
 *//*

public class ChildExpressionVisitor extends SpescBaseVisitor<Object> {

    */
/*public Object visitChildExpression1(SpescParser.ChildExpressionContext ctx){
        if (ctx.assignment_expression() != null) {
            ctx.assignment_expression();
            return visitAssignment_expression(ctx.assignment_expression());
        } else if (ctx.relational_expression() != null) {
            return visitRelational_expression(ctx.relational_expression());
        } else if (ctx.arithmetic_expression() != null) {
            return visitArithmetic_expression(ctx.arithmetic_expression());
        }

        return null;
    }*//*



    @Override
    public Object visitChildExpression(SpescParser.ChildExpressionContext ctx) {
        // 访问不同类型的子表达式
        if (ctx.assignment_expression() != null) {
            return visitAssignment_expression(ctx.assignment_expression());
        } else if (ctx.relational_expression() != null) {
            return visitRelational_expression(ctx.relational_expression());
        } else if (ctx.arithmetic_expression() != null) {
            return visitArithmetic_expression(ctx.arithmetic_expression());
        }
        return null;
    }

    @Override
    public Object visitAssignment_expression(SpescParser.Assignment_expressionContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        Object assignedValue = visit(ctx.childExpression()); // 递归访问右边的子表达式
        System.out.println("Assignment: " + varName + " = " + assignedValue);
        return assignedValue; // 可以根据需要返回合适的值
    }

    @Override
    public Object visitRelational_expression(SpescParser.Relational_expressionContext ctx) {
        if(ctx.relationOperator() != null){
            Object left = visit(ctx.arithmetic_expression(0));
            String operator = ctx.relationOperator().getText();
            Object right = visit(ctx.arithmetic_expression(1));
            System.out.println("Relational Expression: " + left + " " + operator + " " + right);
        }

        Object left = visit(ctx.arithmetic_expression(0));
        return left;

        */
/*Object left = visit(ctx.arithmetic_expression(0)); // 访问左边的算数表达式
        if (ctx.relationOperator() != null) {
            String operator = ctx.relationOperator().getText();
            Object right = visitArithmetic_expression(ctx.arithmetic_expression(1)); // 访问右边的算数表达式
            System.out.println("Relational Expression: " + left + " " + operator + " " + right);
        }
        return left; *//*
// 可以根据需要返回合适的值
    }


    @Override
    public Object visitArithmetic_expression(SpescParser.Arithmetic_expressionContext ctx) {
        return visitAddSubExpression(ctx.addSubExpression()); // 访问加减表达式
    }

    @Override
    public Object visitAddSubExpression(SpescParser.AddSubExpressionContext ctx) {


        Object left = visitMulDivExpression(ctx.mulDivExpression(0));
        for (int i = 1; i < ctx.mulDivExpression().size(); i++) {
            String operator = ctx.getChild(i * 2 - 1).getText(); // 获取加减符号
            Object right = visitMulDivExpression(ctx.mulDivExpression(i)); // 访问右边的乘除表达式
            System.out.println("Add/Sub Expression: " + left + " " + operator + " " + right);
        }
        return left;

        //如果左边是变量名称
        */
/*if(visitMulDivExpression(ctx.mulDivExpression(0)) instanceof String){
            Object left=visitMulDivExpression(ctx.mulDivExpression(0));
            return left;
        }else {
            double left = (double) visitMulDivExpression(ctx.mulDivExpression(0)); // 访问左边的乘除表达式
            for (int i = 1; i < ctx.mulDivExpression().size(); i++) {
                String operator = ctx.getChild(i * 2 - 1).getText(); // 获取加减符号
                double right =  (double)  visitMulDivExpression(ctx.mulDivExpression(i)); // 访问右边的乘除表达式
                switch (operator){
                    case "+":left += right;break;
                    case "-":left -= right;break;
                }
                System.out.println("Add/Sub Expression: " + left + " " + operator + " " + right);
            }
            return left;
        }*//*

        // 返回结果可以根据需要调整
    }

    @Override
    public Object visitMulDivExpression(SpescParser.MulDivExpressionContext ctx) {
        Object left = visit(ctx.primaryExpression(0)); // 访问左边的原子表达式
        for (int i = 1; i < ctx.primaryExpression().size(); i++) {
            String operator = ctx.getChild(i * 2 - 1).getText(); // 获取乘除符号
            Object right = visit(ctx.primaryExpression(i)); // 访问右边的原子表达式
            System.out.println("Mul/Div Expression: " + left + " " + operator + " " + right);
        }
        return left;

        */
/*if(visitPrimaryExpression(ctx.primaryExpression(0)) instanceof String){
            Object left=visitPrimaryExpression(ctx.primaryExpression(0));
            return left;
        }else{
            double left = (double) visitPrimaryExpression(ctx.primaryExpression(0)); // 访问左边的原子表达式
            for (int i = 1; i < ctx.primaryExpression().size(); i++) {
                String operator = ctx.getChild(i * 2 - 1).getText(); // 获取乘除符号
                double right = (double) visitPrimaryExpression(ctx.primaryExpression(i)); // 访问右边的原子表达式

                switch (operator) {
                    case "*": left *= right; break;
                    case "/": left /= right; break;
                }

                System.out.println("Mul/Div Expression: " + left + " " + operator + " " + right);
            }
            return left;
        }*//*

    }

    @Override
    public Object visitPrimaryExpression(SpescParser.PrimaryExpressionContext ctx) {
        if (ctx.value() != null) {
            return visit(ctx.value()); // 访问常量值
        } else if (ctx.arithmetic_expression() != null) {
            return visit(ctx.arithmetic_expression()); // 递归访问括号内的算数表达式
        }
        return null;

    }

    @Override
    public Object visitValue(SpescParser.ValueContext ctx) {
        // 处理常量值的访问
        if (ctx.NUMBER() != null) {
            return Integer.parseInt(ctx.NUMBER().getText());
        } else if (ctx.IDENTIFIER() != null) {
            return ctx.IDENTIFIER().getText();
        } else if (ctx.TRUE() != null) {
            return true;
        } else if (ctx.FALSE() != null) {
            return false;
        }
        return null;
    }
}
*/

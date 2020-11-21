package datastructure;

import datastructure.stack.Expression;

public class ExpressionTester {
    public static void main(String[] args) {
        Expression expression = new Expression("(4+2)*3-5#");
        int result = expression.compute();
        System.out.println("运算结果为：" + result);
    }
}

package com.one.example01;

import java.util.Deque;
import java.util.LinkedList;

public class ExpressionContext {

    private Deque<Expression> numbers = new LinkedList<>();

    public long intercept(String expression) {
        String[] elements = expression.split(" ");
        int length = elements.length;

        for (int i = 0; i < (length + 1) / 2; ++i) {
            numbers.addLast(new NumberExpression(elements[i]));
        }

        for (int i =(length + 1) / 2; i < length; ++i) {
            Expression exp1 = numbers.pollFirst();
            Expression exp2 = numbers.pollFirst();

            Expression result = null;

            String operator = elements[i];

            if ("+".equals(operator)) {
                result = new AddExpression(exp1, exp2);
            } else if ("-".equals(operator)) {
                result = new ReduceExpression(exp1, exp2);
            } else if ("*".equals(operator)) {
                result = new MulExpression(exp1, exp2);
            } else {
                result = new DivExpression(exp1, exp2);
            }

            numbers.addFirst(result);
        }

        return numbers.pollFirst().interpret();
    }
}

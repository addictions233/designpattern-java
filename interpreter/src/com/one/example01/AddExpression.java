package com.one.example01;

public class AddExpression implements Expression{

    private Expression ex1;

    private Expression ex2;

    public AddExpression(Expression ex1, Expression ex2) {
        this.ex1 = ex1;
        this.ex2 = ex2;
    }

    @Override
    public long interpret() {
        return ex1.interpret() + ex2.interpret();
    }
}

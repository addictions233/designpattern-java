package com.one.example01;

public class Main {

    public static void main(String[] args) {
        ExpressionContext context = new ExpressionContext();
        long value = context.intercept("6 2 3 5 / + *");
        System.out.println(value);
    }
}

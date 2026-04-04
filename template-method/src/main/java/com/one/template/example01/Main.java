package com.one.template.example01;

public class Main {

    public static void main(String[] args) {

        ConcreteTemplateClassA templateClassA = new ConcreteTemplateClassA();
        templateClassA.run("x");

        System.out.println("------------------------------------");

        ComcreteTemplateClassB templateClassB = new ComcreteTemplateClassB();
        templateClassB.run("y");
    }
}

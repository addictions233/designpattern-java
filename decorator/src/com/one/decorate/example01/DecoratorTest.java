package com.one.decorate.example01;

import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    public void testDecorator() {
        Decorator decoratorA = new ConcreteDecoratorA(new ConcreteComponent());
        decoratorA.operation();

        System.out.println("===============================");

        Decorator decoratorB = new ConcreteDecoratorB(decoratorA);
        decoratorB.operation();

    }
}

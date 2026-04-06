package com.one.state.example;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        State stateA = new ConcreteStateA();
        stateA.handle(context);

        System.out.println("========================");

        State stateB = new ConcreteStateB();
        stateB.handle(context);
    }
}

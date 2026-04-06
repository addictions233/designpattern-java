package com.one.state.example;

public class ConcreteStateB implements State{
    @Override
    public void handle(Context context) {
        System.out.println("进入状态B..");
        context.setCurrentState(this);
    }
}

package com.one.state.example;

public class ConcreteStateA implements State{
    @Override
    public void handle(Context context) {
        System.out.println("进入状态A..");
        context.setCurrentState(this);
    }
}

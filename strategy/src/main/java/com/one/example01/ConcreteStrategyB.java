package com.one.example01;

public class ConcreteStrategyB implements Strategy{
    @Override
    public boolean support(String key) {
        return "y".equals(key);
    }

    @Override
    public void algorithm() {
        System.out.println("执行策略B");
    }
}

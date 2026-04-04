package com.one.example01;

/**
 * 具体的策略实现类
 */
public class ConcreteStrategyA implements Strategy{

    @Override
    public boolean support(String key) {
        return "x".equals(key);
    }

    @Override
    public void algorithm() {
        System.out.println("执行策略A");
    }
}

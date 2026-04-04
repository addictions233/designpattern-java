package com.one.example01;

import java.util.ArrayList;
import java.util.List;

/**
 * 上下文: 策略模式的本质是通过Context上下文类作为控制单元, 对不同的策略进行调度分配
 */
public class Context {

    private List<Strategy> list = new ArrayList<>();

    public Context() {
        list.add(new ConcreteStrategyA());
        list.add(new ConcreteStrategyB());
    }

    public void algorithm(String key) {
        for (Strategy strategy : list) {
            if (strategy.support(key)) {
                strategy.algorithm();
            }
        }
    }

}

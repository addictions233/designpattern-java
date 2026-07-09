package com.one.example01;

import java.util.ArrayList;
import java.util.List;

/**
 * 上下文: 策略模式的本质是通过Context上下文类作为控制单元, 对不同的策略进行调度分配
 */
public class Context {

    /**
     * 上下文对象中维持对所有策略的引用
     */
    private List<Strategy> list = new ArrayList<>();

    public Context() {
        list.add(new ConcreteStrategyA());
        list.add(new ConcreteStrategyB());
    }

    public void algorithm(String key) {
        for (Strategy strategy : list) {
            // 通过support方法选择不通的策略执行
            if (strategy.support(key)) {
                strategy.algorithm();
                return;
            }
        }
    }

}

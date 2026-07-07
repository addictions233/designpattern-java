package com.one.observer.example01;

/**
 * 观察者接口 (监听器接口)
 */
public interface EventListener {

    /**
     * 对观察结果进行处理的方法
     * @param result 摇号结果
     */
    void doEvent(LotteryResult result);
}

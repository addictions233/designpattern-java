package com.one.strategy;

/**
 * @author one
 * 策略模式的接口: 促销接口
 */
public interface PromotionStrategy {
    /**
     * 具体的策略实现类重写的方法
     */
    void doPromotion();
}

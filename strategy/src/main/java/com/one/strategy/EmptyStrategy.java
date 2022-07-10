package com.one.strategy;

/**
 * @author one
 * 无促销活动的实现类
 */
public class EmptyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无优惠活动,原价购买");
    }
}

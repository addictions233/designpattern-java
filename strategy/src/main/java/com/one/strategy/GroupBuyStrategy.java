package com.one.strategy;

/**
 * @author one
 * 团购的促销策略
 */
public class GroupBuyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("团购的促销策略");
    }
}

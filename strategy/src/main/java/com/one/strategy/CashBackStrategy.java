package com.one.strategy;

public class CashBackStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("使用返现的促销策略");
    }
}

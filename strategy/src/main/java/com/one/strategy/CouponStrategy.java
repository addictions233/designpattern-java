package com.one.strategy;

/**
 * @author one
 * 优惠券的促销策略
 */
public class CouponStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("使用优惠券的促销策略");
    }
}

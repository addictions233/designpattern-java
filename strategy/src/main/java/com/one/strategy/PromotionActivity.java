package com.one.strategy;

/**
 * @author one
 * 使用促销策略进行促销活动
 */
public class PromotionActivity {
    /**
     * 用成员变量保存促销活动中具体使用到的促销策略
     */
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute() {
        // 使用促销策略进行优化
        promotionStrategy.doPromotion();
        System.out.println("促销活动顺利结束");
    }
}

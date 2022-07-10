package com.one.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author one
 * 如果根据前端传参使用不同的对应策略,我们可以使用容器式单例将所有的策略存储起来,然后根据key值来去对应的促销策略
 */
public class PromotionStrategyFactory {
    /**
     * 使用容器保存所有的策略实现类
     */
    private static final Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP;

    static {
        PROMOTION_STRATEGY_MAP = new HashMap<>();
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON, new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASH_BACK, new CashBackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUP_BUY, new GroupBuyStrategy());
    }

    private static final PromotionStrategy NON_PROMOTION = new EmptyStrategy();

    private interface PromotionKey {
        String COUPON = "COUPON";
        String CASH_BACK = "CASH_BACK";
        String GROUP_BUY = "GROUP_BUY";
    }

    /**
     * 提供静态方法通过key获取对应的策略对象
     * @param promotionKey key
     * @return 策略对象
     */
    public static PromotionStrategy getPromotion(String promotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }
}

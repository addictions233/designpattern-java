package com.one.strategy;

/**
 * @author one
 * @description TODO
 * @date 2024-11-8
 */
public class Main {

    public static void main(String[] args) {
        // 618促销发优惠券
        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
        // 双11促销进行返现优惠
        PromotionActivity activity11 = new PromotionActivity(new CashBackStrategy());

        activity618.execute();

        activity11.execute();

        System.out.println("=======================");

        // 使用工厂模式获取策略对象
        PromotionStrategy groupBuyStrategy = PromotionStrategyFactory.getPromotion("GROUP_BUY");
        // 将策略对象设置到上下文中
        PromotionActivity groupBuyActivity = new PromotionActivity(groupBuyStrategy);
        // 执行策略
        groupBuyActivity.execute();
    }
}

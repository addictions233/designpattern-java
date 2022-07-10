package com.one.test;

import com.one.strategy.CashBackStrategy;
import com.one.strategy.CouponStrategy;
import com.one.strategy.PromotionActivity;

/**
 * @author one
 * 测试促销策略的使用
 */
public class PromotionActivityTest {
    public static void main(String[] args) {
        // 618促销发优惠券
        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
        // 双11促销进行返现优惠
        PromotionActivity activity11 = new PromotionActivity(new CashBackStrategy());

        activity618.execute();

        activity11.execute();
    }
}

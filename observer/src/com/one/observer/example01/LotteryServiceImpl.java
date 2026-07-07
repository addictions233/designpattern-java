package com.one.observer.example01;

import java.util.Date;

/**
 * 具体的买房摇号业务处理类
 */
public class LotteryServiceImpl extends AbstractLotteryService{

    /**
     * 持有摇号算法类
     */
    private DrawHouseService drawHouseService;

    public LotteryServiceImpl(DrawHouseService drawHouseService) {
        this.drawHouseService = drawHouseService;
    }

    @Override
    protected LotteryResult lottery(String userId) {
        // 获取摇号结果
        String result = this.drawHouseService.lots(userId);
        return new LotteryResult(userId, result, new Date());
    }
}

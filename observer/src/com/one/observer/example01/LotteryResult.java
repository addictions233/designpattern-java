package com.one.observer.example01;

import java.util.Date;

/**
 * 买房摇号结果类
 */
public class LotteryResult {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 摇号结果
     */
    private String result;

    /**
     * 摇号时间
     */
    private Date lotteryTime;


    public LotteryResult(String userId, String result, Date lotteryTime) {
        this.userId = userId;
        this.result = result;
        this.lotteryTime = lotteryTime;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Date getLotteryTime() {
        return lotteryTime;
    }

    public void setLotteryTime(Date lotteryTime) {
        this.lotteryTime = lotteryTime;
    }

    @Override
    public String toString() {
        return "LotteryResult{" +
                "userId='" + userId + '\'' +
                ", result='" + result + '\'' +
                ", lotteryTime=" + lotteryTime +
                '}';
    }
}

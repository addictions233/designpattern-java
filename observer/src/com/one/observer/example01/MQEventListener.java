package com.one.observer.example01;

/**
 * 具体的观察者 (具体的监听器): 在MQ中对摇号结果进行保存
 */
public class MQEventListener implements EventListener{
    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("记录用户的摇号结果(MQ), 用户ID:" + result.getUserId() + ",摇号结果:" + result.getResult());
    }
}

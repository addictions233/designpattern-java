package com.one.observer.example01;

/**
 * 具体的观察者实现类 (具体的监听器): 发送摇号消息通知
 */
public class MessageEventListener implements EventListener{
    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("发送短信通知, 用户ID:" + result.getUserId() + ",您的摇号结果是:" + result.getResult());
    }
}

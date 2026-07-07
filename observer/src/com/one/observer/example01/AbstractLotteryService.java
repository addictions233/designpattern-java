package com.one.observer.example01;

/**
 * 抽象买房摇号业务处理类
 */
public abstract class AbstractLotteryService {

    /**
     * 这里采用组合复用原则, 持有事件管理器
     * 当然也可以采用继承的方式 (可组合, 可继承)
     */
    private EventManager eventManager;

    public AbstractLotteryService() {
        // 设置事件类型
        this.eventManager = new EventManager(EventManager.EventType.Message, EventManager.EventType.MQ);

        // 初始化所有的观察者 (即监听器)
        this.eventManager.subscribe(EventManager.EventType.Message, new MessageEventListener());
        this.eventManager.subscribe(EventManager.EventType.MQ, new MQEventListener());
    }

    /**
     * 获取摇号结果并发送通知
     * @param userId 用户ID
     */
    public void lotteryAndMsg(String userId) {
        LotteryResult lotteryResult = this.lottery(userId);

        // 发生事件之后, 通知所有的观察者
        this.eventManager.notifyListener(EventManager.EventType.Message, lotteryResult);
        this.eventManager.notifyListener(EventManager.EventType.MQ, lotteryResult);

        // 打印摇号结果
        System.out.println(lotteryResult);
    }


    protected abstract LotteryResult lottery(String userId);
}

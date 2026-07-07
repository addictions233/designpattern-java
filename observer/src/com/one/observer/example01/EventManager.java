package com.one.observer.example01;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 被观察者 (监听管理器)
 */
public class EventManager {


    /**
     * 通过枚举类定义观察者 (监听器类型)
     */
    public enum EventType {
        MQ, Message
    }

    /**
     * 在被观察者中使用集合保存所有的观察者
     */
    private Map<Enum<EventType>, List<EventListener>> listenerMap = new HashMap<>();

    /**
     * 构造方法
     * @param operations 支持的监听器类型
     */
    public EventManager(Enum<EventType>... operations) {
        for (Enum<EventType> operation : operations) {
            listenerMap.put(operation, new ArrayList<>());
        }
    }

    /**
     * 添加观察者 (添加监听器)
     * @param eventType 事件类型
     * @param listener 观察者
     */
    public void subscribe(Enum<EventType> eventType, EventListener listener) {
        this.listenerMap.get(eventType).add(listener);
    }

    /**
     * 移除观察者 (移除监听器)
     * @param eventType 事件类型
     * @param listener 观察者
     */
    public void unsubscribe(Enum<EventType> eventType, EventListener listener) {
        this.listenerMap.get(eventType).remove(listener);
    }

    /**
     * 当事件发生时, 通知所有的观察者 (即所有的监听器)
     * @param eventType 事件类型
     * @param lotteryResult 事件结果
     */
    public void notifyListener(Enum<EventType> eventType, LotteryResult lotteryResult) {
        for (EventListener eventListener : this.listenerMap.get(eventType)) {
            eventListener.doEvent(lotteryResult);
        }
    }


}

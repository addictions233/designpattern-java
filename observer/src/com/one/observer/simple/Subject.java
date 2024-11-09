package com.one.observer.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author one
 * @description 抽象主题（Subject）角色：也叫抽象目标类，它提供了一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，以及通知所有观察者的抽象方法。
 * @date 2024-11-9
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    /**
     * 添加观察者
     * @param observer
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者
     */
    public abstract void notifyObserver();
}

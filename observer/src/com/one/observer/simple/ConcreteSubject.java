package com.one.observer.simple;

/**
 * @author one
 * @description 具体主题（Concrete Subject）角色：也叫具体目标类，它实现抽象目标中的通知方法，当具体主题的内部状态发生改变时，通知所有注册过的观察者对象。
 * @date 2024-11-9
 */
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        System.out.println("具体的目标发生了变化");
        System.out.println("----------------------------");
        for (Observer observer : this.observers) {
            observer.respond();
        }
    }
}

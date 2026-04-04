package com.one.observer.simple;

/**
 * @author one
 * @description TODO
 * @date 2024-11-9
 */
public class Main {

    public static void main(String[] args) {
        // 创建目标类subject, 也就是被观察者 Observable
        Subject subject = new ConcreteSubject();

        // 创建具体的观察者Observer
        Observer obs1 = new ConcreteObserverA();
        Observer obs2 = new ConcreteObserverB();

        // 注册观察者, 可以添加多个
        subject.addObserver(obs1);
        subject.addObserver(obs2);

        // 当被观察者Observable内部发生改变, 通知所有的观察者Observer
        subject.notifyObserver();

    }
}

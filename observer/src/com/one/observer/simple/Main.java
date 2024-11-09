package com.one.observer.simple;

/**
 * @author one
 * @description TODO
 * @date 2024-11-9
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer obs1 = new ConcreteObserverA();
        Observer obs2 = new ConcreteObserverB();
        subject.addObserver(obs1);
        subject.addObserver(obs2);
        subject.notifyObserver();

    }
}

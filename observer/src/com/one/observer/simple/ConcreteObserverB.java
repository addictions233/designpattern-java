package com.one.observer.simple;

/**
 * @author one
 * @description 具体观察者（Concrete Observer）角色：实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态。
 * @date 2024-11-9
 */
public class ConcreteObserverB implements Observer{
    @Override
    public void respond() {
        System.out.println("得到通知,具体的观察者B做出了反应...");
    }
}

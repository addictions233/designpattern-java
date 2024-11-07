package com.one.mediator;

/**
 * @description: 抽象的同事类
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public abstract class Colleague {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract  void send();
}

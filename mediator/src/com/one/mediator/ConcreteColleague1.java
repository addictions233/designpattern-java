package com.one.mediator;

/**
 * @description: 具体同事类1
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public class ConcreteColleague1 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事1收到了请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事1发出了请求");
        super.mediator.relay(this);
    }
}

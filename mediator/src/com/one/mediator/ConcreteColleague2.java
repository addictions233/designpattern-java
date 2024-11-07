package com.one.mediator;

/**
 * @description: 具体的同事实现类2
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public class ConcreteColleague2 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类2收到了请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出了请求");
        super.mediator.relay(this);
    }
}

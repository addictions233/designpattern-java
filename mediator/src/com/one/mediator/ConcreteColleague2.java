package com.one.mediator;

/**
 * @description: 具体同事类（Concrete Colleague）角色：是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(String supportKey) {
        super(supportKey);
    }

    @Override
    public void receive(String msgKey) {
        System.out.println("具体同事类2收到了请求, msgKey:" + msgKey);
    }

    @Override
    public void send(String msgKey) {
        System.out.println("具体同事类2发出了请求:" + msgKey);
        super.mediator.relay(msgKey);
    }
}

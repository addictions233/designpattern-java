package com.one.mediator;

/**
 * @description: 抽象同事类（Colleague）角色：定义同事类的接口，保存中介者对象，提供同事对象交互的抽象方法，实现所有相互影响的同事类的公共功能。
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public abstract class Colleague {

    /**
     * 保存中介者对象
     */
    protected Mediator mediator;

    protected String supportKey;

    public Colleague(String supportKey) {
        this.supportKey = supportKey;
    }

    protected boolean support(String msgKey) {
        return supportKey.equals(msgKey);
    }

    /**
     * 定义设置中介对象的方法
     * @param mediator
     */
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 同事间交互的方法
     */
    public abstract void receive(String msgKey);

    public abstract  void send(String msgKey);
}

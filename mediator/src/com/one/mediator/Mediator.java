package com.one.mediator;

/**
 * @description: 抽象中介者（Mediator）角色：它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public abstract class Mediator {

    /**
     * 注册
     */
    public  abstract void register(Colleague colleague);

    /**
     * 转发
     */
    public  abstract void relay(Colleague colleague);
}

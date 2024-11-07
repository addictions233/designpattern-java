package com.one.mediator;

/**
 * @description: 抽象中介者
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

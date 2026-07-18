package com.one.example01;

/**
 * 抽象的中介者: 中介者简化了对象之间的交互, 它利用中介者和同事的一对多关系替代了原有的同事之间的多对多关系
 */
public abstract class Mediator {

    /**
     * 登记租客和出租房主
     * @param person
     */
    public abstract void register(Person person);

    /**
     * 中介进行联系的处理
     * @param message
     * @param person
     */
    public abstract void contact(String message, Person person);


}

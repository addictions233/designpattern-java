package com.one.example01;

/**
 * 租户和出租房租的统一抽象
 */
public abstract class Person {

    /**
     * 名称
     */
    protected String name;

    /**
     * 需要持有对中介者的引用,子类中需要使用到中介者
     */
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    /**
     * 与中介者联系的方法
     * @param message
     */
    public abstract void contact(String message);

    public abstract void getMessage(String message);
}

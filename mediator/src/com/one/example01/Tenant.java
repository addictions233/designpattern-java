package com.one.example01;

/**
 * 租房者
 */
public class Tenant extends Person {


    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void contact(String message) {
        mediator.contact(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("租房者:" + name + ",获取到的信息:" + message);
    }
}

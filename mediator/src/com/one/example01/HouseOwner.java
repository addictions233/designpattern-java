package com.one.example01;

/**
 * 出租房主
 */
public class HouseOwner extends Person{
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void contact(String message) {
        mediator.contact(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("出租房主:" + name + ",获取的消息是:" + message);
    }
}

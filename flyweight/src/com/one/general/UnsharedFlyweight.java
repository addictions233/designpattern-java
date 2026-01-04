package com.one.general;

/**
 * 非共享的具体享元类
 */
public class UnsharedFlyweight implements IFlyweight{

    private String innerState;

    public UnsharedFlyweight(String innerState) {
        this.innerState = innerState;
    }

    @Override
    public void operate(String externalState) {
        System.out.println("享元对象的内部状态:" + innerState + ",享元对象的外部状态:" + externalState);
    }
}

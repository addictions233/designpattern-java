package com.one.general;

/**
 * @author one
 * @description 抽象的具体实现
 * @date 2024-10-30
 */
public class ConcreteFlyweight implements IFlyweight{

    private String innerState;

    public ConcreteFlyweight(String innerState) {
        this.innerState = innerState;
    }

    @Override
    public void operate(String externalState) {
        System.out.println("object address:" + System.identityHashCode(this));
        System.out.println("innerState:" + innerState);
        System.out.println("externalState:" + externalState);
    }
}

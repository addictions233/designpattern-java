package com.one.general;

/**
 * @author one
 * @description 可共享的具体享元类: 在具体的享元类中要将内部状态和外部状态分开处理
 * @date 2024-10-30
 */
public class ConcreteFlyweight implements IFlyweight{

    /**
     * 内部状态: 同一个享元对象的内部状态是一致的
     */
    private String innerState;

    public ConcreteFlyweight(String innerState) {
        this.innerState = innerState;
    }

    /**
     * 外部状态在使用的时候, 通常是由外部设置, 不保存在享元对象中, 即使是同一个对象
     * @param externalState 外部状态
     */
    @Override
    public void operate(String externalState) {
        System.out.println("享元对象的内部状态:" + innerState + ",享元对象的外部状态:" + externalState);
    }
}

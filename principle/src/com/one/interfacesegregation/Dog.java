package com.one.interfacesegregation;

/**
 * @author one
 * @description 如果接口的功能过于雍总庞大, 其实现类就会存在一些空实现
 * @date 2024-9-16
 */
public class Dog implements IAnimalAction{
    @Override
    public void eat() {
        System.out.println("狗狗吃东西");
    }

    @Override
    public void fly() {
        // 由于狗不能飞, 只能是空实现
    }

    @Override
    public void swim() {
        System.out.println("狗狗在游泳");
    }
}

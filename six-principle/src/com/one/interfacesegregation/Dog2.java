package com.one.interfacesegregation;

/**
 * @author one
 * @description 一个类只应实现它需要的接口
 * @date 2024-9-16
 */
public class Dog2 implements IEatAnimalAction, ISwimAnimalAction{
    @Override
    public void eat() {
        System.out.println("狗狗吃东西");
    }

    @Override
    public void swim() {
        System.out.println("狗狗在游泳");
    }
}

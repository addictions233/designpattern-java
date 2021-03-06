package com.one.simplefactory;

/**
 * 简单工厂设计模式属于类的创建型模式,又叫静态工厂方法模式,
 * 通过专门定义一个类来负责创建其它类的实例,被创建的实例通常
 * 具有共同的父类
 */
public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Fruit apple = FruitFactory.getFruitInstance("apple");
        apple.get();  // 输出: 采集苹果
        Fruit banana = FruitFactory.getFruitInstance("banana");
        banana.get(); // 输出: 采集香蕉


        Fruit apple2 = FruitFactory.getFruitInstance2("com.beifeng.simplefactory.Apple");
        apple2.get();
        Fruit banana2 = FruitFactory.getFruitInstance2("com.beifeng.simplefactory.Banana");
        banana.get();
    }
}

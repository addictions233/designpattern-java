package com.one.factorymethod;

import com.one.domain.Fruit;
import sun.java2d.pipe.SpanIterator;

/**
 * @ClassName: Test
 * @Description: 工厂方法模式: 工厂方法模式和简单工厂模式虽然都是通过工厂来创建对象,但是工厂方法模式在设计上是符合 "开闭原则"和"单一职责"
 * @Author: one
 * @Date: 2022/05/24
 */
public class Main {
    public static void main(String[] args) {
        // 一个类通过其子类来指定创建哪个对象
        FruitFactory factory1 = new AppleFactory();
        // 遵循里氏替换原则,创建的子类对象可以覆盖父类对象
        Fruit fruit1 = factory1.create();
        fruit1.get(); // 输出: 采集苹果
        System.out.println("---------------------------");
        FruitFactory factory2 = new BananaFactory();
        Fruit fruit2 = factory2.create();
        fruit2.get();
    }
}

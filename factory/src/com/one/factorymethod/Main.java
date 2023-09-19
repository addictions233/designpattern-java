package com.one.factorymethod;

import com.one.domain.Fruit;

/**
 * @ClassName: Test
 * @Description: 工厂方法模式: 工厂方法模式和简单工厂模式虽然都是通过工厂来创建对象,但是工厂方法模式在设计上是符合 "开闭原则"和"单一职责"
 * @Author: one
 * @Date: 2022/05/24
 */
public class Main {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new AppleFactory();
        Fruit fruit = fruitFactory.create();
        fruit.get(); // 输出: 采集苹果
    }
}

package com.one.factorymethod;

import com.one.domain.Fruit;

/**
 * @ClassName: Test
 * @Description: 测试工厂方法模式
 * @Author: one
 * @Date: 2022/05/24
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new AppleFactory();
        Fruit fruit = fruitFactory.create();
        fruit.get(); // 输出: 采集苹果
    }
}

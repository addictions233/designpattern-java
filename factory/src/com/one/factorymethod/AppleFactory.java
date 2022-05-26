package com.one.factorymethod;

import com.one.domain.Apple;
import com.one.domain.Fruit;

/**
 * @ClassName: AppleFactory
 * @Description: 具体的工厂决定创建那种类型的对象,很好的体现了单一职责元素,一个工厂只创建一种类型的对象
 * @Author: one
 * @Date: 2022/05/24
 */
public class AppleFactory implements FruitFactory {
    /**
     * 工厂方法模式中用于创建对象
     *
     * @return Fruit
     */
    @Override
    public Fruit create() {
        return new Apple();
    }
}

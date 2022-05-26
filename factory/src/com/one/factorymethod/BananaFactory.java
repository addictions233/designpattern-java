package com.one.factorymethod;

import com.one.domain.Banana;
import com.one.domain.Fruit;

/**
 * @ClassName: BananaFactory
 * @Description: 一个工厂只创建一种类型的对象,如果用户要扩展新的类型的对象,只需要创建一个新的实例工厂
 * @Author: one
 * @Date: 2022/05/24
 */
public class BananaFactory implements FruitFactory {
    /**
     * 工厂方法模式中用于创建对象
     *
     * @return Fruit
     */
    @Override
    public Fruit create() {
        return new Banana();
    }
}

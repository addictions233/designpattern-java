package com.one.factorymethod;

import com.one.domain.Fruit;

/**
 * @InterfaceName: FruitFactory
 * @Description: 工厂方法模式(Factory Method Pattern):定义一个创建对象的接口,但让实现这个接口的类来决定具体实例化哪一个类,
 *      工厂方法让类的实例化推迟到子类中进行, 属于创建型设计模式
 *                优点: 1, 遵循单一职责原则,每个工厂都创建同一种类型的实例对象
 *                      2, 遵循开闭原则: 可扩展性强,如果要创建新的类型的对象,只需要新建一个工厂实现FruitFactory接口
 *                      3, 遵循里氏替换原则: 创建的子类对象可以完全覆盖父类对象
 *                缺点: 1, 如果实例对象的类型增多,那么类的数量会大大增多,增加了系统复杂程度
 * @Author: one
 * @Date: 2022/05/24
 */
public interface FruitFactory {
    /**
     * 工厂方法模式中用于创建对象
     * @return Fruit
     */
    Fruit create();
}

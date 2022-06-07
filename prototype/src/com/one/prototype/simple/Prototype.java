package com.one.prototype.simple;

/**
 * @InterfaceName: Prototype
 * @Description: 原型模式中提供的拷贝
 * @Author: one
 * @Date: 2022/06/04
 */
public interface Prototype {
    /**
     * 原型设计模式中的拷贝方法,类似于Object类中的clone()方法,子类需要重写该方法
     * @return Prototype
     */
    Prototype clone();
}

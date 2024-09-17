package com.one.abstractfactory;

/**
 * @InterfaceName: ICourseFactory
 * @Description: 抽象工厂模式: 就是工厂方法模式在多维度下的使用, 强调同一产品族的产品对象创建
 *         抽象工厂的作用: 声明创建抽象产品对象的接口
 *         抽象工厂模式和工厂方法模式的区别: 抽象工厂模式强调的同一个产品族的多个相关产品对象的创建
 *         而工厂方法模式强调同一产品等级结构的对象的创建
 * @Author: one
 * @Date: 2022/05/26
 */
public interface ICourseFactory {
    /**
     * 声明创建课程对象的接口
     * @return ICourse
     */
    ICourse createCourse();

    /**
     * 声明创建笔记对象的接口
     * @return INote
     */
    INote createNote();

}

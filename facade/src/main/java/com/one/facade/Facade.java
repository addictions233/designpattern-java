package com.one.facade;

/**
 * @author one
 * @description 学习门面设计模式: 将多个对象的功能封装到一个对象中
 * @date 2024-2-21
 */
public class Facade {
    /**
     * 优点: 1. 简化调用过程, 以防给子系统带来风险
     *       2. 遵循迪米特法则, 即最少知道原则
     * 缺点: 1. 不符合开闭原则, 一旦子系统发生变化, 门面类也要发生变化
     *       2. 门面模式违背了单一职责原则, 一个门面类承担了太多的职责
     */
    private SubSystemA a = new SubSystemA();
    private SubSystemB b = new SubSystemB();
    private SubSystemC c = new SubSystemC();

    public void methodA(){
        this.a.doSomethingA();
    }

    public void methodB(){
        this.b.doSomethingB();
    }

    public void methodC(){
        this.c.doSomethingC();
    }

}

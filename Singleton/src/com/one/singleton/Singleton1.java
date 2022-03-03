package com.one.singleton;
/**
 *  2, 懒汉模式
 *      懒汉模式的优点是在需要获取该类对象实例时才在创建本类对象,和饿汉模式相比节约内存
 *      但是在多线程下根本不能保证只创建一个对象,违背单例原则
 */
public class Singleton1 {
    /**
     * 只声明一个静态成员变量: 本类对象
     * 为什么成员变量不能定义为非静态的,因为非静态成员变量是创建对象时才存在的,而静态成员是随着类加载而加载,存在于方法区中
     * 且后面的静态方法也没法访问非静态成员
     */
    private static Singleton1 singleton1;

    /**
     * 私有构造方法
     */
    private Singleton1(){}

    /**
     * 获取本类对象的静态方法
     */
    public static Singleton1 getInstance(){
        // 先检查,后执行, 是典型的竞态条件存在线程安全问题
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}



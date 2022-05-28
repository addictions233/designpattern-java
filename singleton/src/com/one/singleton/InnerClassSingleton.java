package com.one.singleton;

/**
 * @ClassName: InnerClassSingleton
 * @Description: 使用静态内部类实现单例模式
 * @Author: one
 * @Date: 2022/05/28
 */
public class InnerClassSingleton {
    /**
     * 私有构造方法
     */
    private InnerClassSingleton() {

    }

    /**
     * 懒汉式单例,巧妙的利用了JVM的内部类加载特性
     * @return 实例对象
     */
    public static final InnerClassSingleton getInstance() {
        // 内部类的成员变量并不会在类加载时就初始化,但是在使用时必须初始化
        return LazyHolder.LAZY_INSTANCE;
    }

    /**
     * 静态内部类持有innerClassSingleton单例对象,
     * 静态内部类会先于外部类加载,但是内部类的成员变量并不会一开始就初始化,所以不算饿汉式
     * 只有当外部方法调用时才会执行LAZY_INSTANCE的初始化逻辑,所以算懒汉式单例
     */
    private static class LazyHolder{
        private static final InnerClassSingleton LAZY_INSTANCE = new InnerClassSingleton();
    }
}

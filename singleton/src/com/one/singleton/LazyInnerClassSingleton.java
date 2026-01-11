package com.one.singleton;

import java.io.Serializable;

/**
 * @ClassName: InnerClassSingleton
 * @Description: 使用静态内部类实现单例模式,性能最优的写法
 * @Author: one
 * @Date: 2022/05/28
 */
public class LazyInnerClassSingleton implements Serializable {
    /**
     * 私有构造方法,虽然私有了构造方法,但是可以使用反射强行创建对象,造成误用
     */
    private LazyInnerClassSingleton() {
        // 防止反射强行调用私有构造方法
        if (LazyHolder.LAZY_INSTANCE != null) {
            throw new RuntimeException("已经创建单例对象,无法调用构造方法");
        }
    }

    /**
     * 懒汉式单例,巧妙的利用了JVM的内部类加载特性
     * @return 实例对象
     */
    public static final LazyInnerClassSingleton getInstance() {
        // 内部类的成员变量并不会在类加载时就初始化,但是在使用时必须初始化
        return LazyHolder.LAZY_INSTANCE;
    }

    /**
     * 静态内部类持有innerClassSingleton单例对象,
     * 静态内部类会先于外部类加载,但是内部类的成员变量并不会一开始就初始化,所以不算饿汉式
     * 只有当外部方法调用时才会执行LAZY_INSTANCE的初始化逻辑,所以算懒汉式单例
     */
    private static class LazyHolder{

        // 在静态内部类中创建单例, 在装载内部类的时候, 才会创建单例对象
        private static final LazyInnerClassSingleton LAZY_INSTANCE = new LazyInnerClassSingleton();
    }

    /**
     * 加上readResolve方法,可以避免通过序列化和反序列化导致的破坏单例问题,
     * 通过读readObject()源码可以看到通过序列化创建的对象,先通过反射调用构造方法初始化对象,
     * 如果有readResolve方法,那么会调用readResolve方法获取对象替换原来反射创建的初始化对象
     * @return 单例对象
     */
    public Object readResolve() {
        return LazyHolder.LAZY_INSTANCE;
    }
}

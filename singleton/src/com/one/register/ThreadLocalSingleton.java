package com.one.register;

/**
 * @ClassName: ThreadLocalSingleton
 * @Description: 使用ThreadLocal实现线程内的单例, ThreadLocal本质上也是利用map对象存储对象,所以也算容器式单例
 * @Author: one
 * @Date: 2022/05/30
 */
public class ThreadLocalSingleton {
    private static ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal<ThreadLocalSingleton>() {
        /**
         * 重写initialValue()方法为ThreadLocal容器设置默认初始化值,默认为null
         * 一开始就在容器中设值,所以是懒汉式的
         * @return 容器中存储对象值
         */
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {

    }

    public static ThreadLocalSingleton getInstance() {
        return threadLocal.get();
    }
}

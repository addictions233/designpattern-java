package com.one.singleton;

/**
 * @ClassName: Singleton3
 * @Description: DCL 双检查锁代码实现  内存占用率高，效率高，线程安全，多线程操作原子性
 * @Author: one
 * @Date: 2021/10/21
 */
public class Singleton3{
    private static Singleton3 singleton3;

    private Singleton3(){}

    public static Singleton3 getInstance() {
        if (null == singleton3) {
            // 只有在创建对象时加锁,而不是在获取对象时加锁,降低了锁的粒度,提高并发访问效率
            synchronized (Singleton3.class) {
                // 双检查机制, 如果B线程已经创建了实例对象, A线程在获取到锁对象之后也不应该创建对象
                if (null == singleton3) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}

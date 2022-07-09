package com.one.singleton;

/**
 * @ClassName: Singleton3
 * @Description: DCL 双检查锁代码实现  内存占用率高，效率高，线程安全，多线程操作原子性
 * @Author: one
 * @Date: 2021/10/21
 */
public class DoubleCheckSingleton {
    /**
     * volatile解决指令重排的问题
     * 基于JVM初始化对象的过程(1,分配初始化对象的内存空间  2,初始化对象  3设置instance指向步骤1中的内存空间), 有可能在指令重排序后,
     * JVM的初始化对象的顺序变为了1,3,2 这样在多线程下,当某一线程进入第一次if判断发现单例对象不为空,得到第3步骤返回的一个半实例化的对象
     * 这样就返回一个空对象
     */
    private volatile static DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance() {
        if (null == doubleCheckSingleton) {
            // 只有在创建对象时加锁,而不是在获取对象时加锁,降低了锁的粒度,提高并发访问效率
            synchronized (DoubleCheckSingleton.class) {
                // 双检查机制, 如果B线程已经创建了实例对象, A线程在获取到锁对象之后也不应该创建对象
                if (null == doubleCheckSingleton) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}

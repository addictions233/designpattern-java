package com.one.singleton;
/**
 * @author one
 *   3, 为解决懒汉模式下多线程不安全创建多个多个对象,违背单例原则的解决方案:
 *        方案一:  用同步方法解决线程不安全问题  有明显缺点: 用Synchronized同步方法解决线程安全问题会造成效率低下问题
 *        方法二:  用双检查锁机制:  DCL双检查锁机制（DCL：double checked locking）
 *             注: 方法二是该方法单例模式的最佳实现方式。内存占用率高，效率高，线程安全，多线程操作原子性
 */
public class SyncSingleton {
    private static SyncSingleton syncSingleton;

    private SyncSingleton(){}

    /**
     * 静态方法获取对象实例,用synchronized同步方法实现线程安全
     *   1,对于普通同步方法，锁是当前实例对象。
     *   2,对于静态同步方法，锁是当前类的字节码对象,静态方法先于对象存在,所以没法用实例对象作为锁对象
     */
    public static synchronized SyncSingleton getInstance(){
        if(syncSingleton == null){
            syncSingleton = new SyncSingleton();
        }
        return syncSingleton;

    }
}


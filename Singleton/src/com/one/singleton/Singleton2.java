package com.one.singleton;
/*
    3, 为解决懒汉模式下多线程不安全创建多个多个对象,违背单例原则的解决方案:
         方案一:  用同步方法解决线程不安全问题  有明显缺点: 用Synchronized同步方法解决线程安全问题会造成效率低下问题
         方法二:  用双检查锁机制:  DCL双检查锁机制（DCL：double checked locking）
              注: 方法二是该方法单例模式的最佳实现方式。内存占用率高，效率高，线程安全，多线程操作原子性
 */
public class Singleton2 {
    private static Singleton2 singleton2;
    private Singleton2(){};

    /**
     * 静态方法获取对象实例,用synchronized同步方法实现线程安全
     *   对于普通同步方法，锁是当前实例对象。
     *   对于静态同步方法，锁是当前类的Class对象,静态方法先于对象存在,所以没法用实例对象作为锁对象
     * @return
     */
    public static synchronized Singleton2 getInstance(){
        if(singleton2 == null){
            singleton2 = new Singleton2();
            return singleton2;
        } else{
            return singleton2;
        }

    }
}

/*
    DCL 双检查锁代码实现  内存占用率高，效率高，线程安全，多线程操作原子性
 */
class Singleton3{
    private static Singleton3 singleton3;
    private Singleton3(){};
    public static Singleton3 getInstance(){
        if(singleton3 == null){
            /*
                静态方法内部的同步代码块锁对象也得用字节码对象,而不能用对象实例作为锁对象
             */
            synchronized (Singleton3.class){
                //双检查机制, 没有第二道检查还是会引发线程安全问题
                if(singleton3 == null){
                    singleton3 = new Singleton3();
                }
            }

        }
        return singleton3;
    }
}

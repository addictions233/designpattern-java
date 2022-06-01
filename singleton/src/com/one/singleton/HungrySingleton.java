package com.one.singleton;

/**
 *  单例设计模式就是只能创建一个该类对象,
 *      第一步: 将该类的单例对象定义为该类的一个成员变量
 *      第二步: 私有该类的构造方法,防止其它类创建本类对象
 *      第三步: 然后对外提供一个静态方法获取该类的对象
 *      优点:是不会在内存中多次创建该类对象,可以节约内存
 *      缺点:是多个线程共享同一对象数据,造成线程数据不安全,就是将变量定义为成员变量时,多个线程操作同一个对象,某个线程
 *      对成员变量进行了修改,而其他线程又不希望成员变量在使用时被修改,就可以将成员变量定义为方法内的局部变量,每个线程
 *      栈使用自己栈方法特有的局部变量,这样就不会造成线程数据不安全问题
 */

/**
 * @author one
 *   1,饿汉模式
 *   这种模式在类加载时就在静态成员变量中创建了本类对象,所以类启动加载比较慢,但是获取对象速度较快,
 */
public class HungrySingleton {
    /**
     * 第一步:定义一个私有静态成员变量: 本类对象, 在同一返回结果时也会用到这种使用方式,
     * 用final修饰,防止该对象被反射修改了
     */
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    /**
     * 第二步:私有构造方法,防止其它类创建本类对象
     */
    private HungrySingleton(){};

    /**
     * 第三步:对外提供获取该类对象实例的静态方法
     */
    public static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }
}




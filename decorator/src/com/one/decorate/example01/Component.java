package com.one.decorate.example01;

/**
 * 抽象构件（Component）角色 ：它是具体构件和抽象装饰类的共同父类,声明了在具体构件中实现的业务方法.
 * 它引进了可以使客户端以一致的方式处理未被装饰的对象以及装饰之后的对象,实现客户端的透明操作
 */
public abstract class Component {

    /**
     * 定义抽象方法
     */
    public abstract void operation();
}

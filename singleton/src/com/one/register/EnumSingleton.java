package com.one.register;

/**
 * @ClassName: EnumSingleton
 * @Description: 注册式单例: 枚举实现
 *                      1, 枚举是不能通过反射来创建对象的,所以jvm在底层避免了反射破坏单例的问题
 *                      2, 枚举单例如何防止反序列化破坏单例,读readObject方法可以看成,反序列化返回的对象就是
 *                         枚举类中查找到的枚举对象并将其返回
 * @Author: one
 * @Date: 2022/05/28
 */
public enum  EnumSingleton {
    /**
     * 枚举单例对象
     */
    INSTANCE("张三");

    private Object data;

    /**
     * 枚举类的构造器天然就是私有的,更不能用public修饰
     * @param data 属性值
     */
    EnumSingleton(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    /**
     * 如果我们不希望枚举式单例对象的属性值被随意修改就不要提供set方法,只提供get方法
     * @param data 枚举式单例对象的属性值
     */
    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return EnumSingleton.INSTANCE;
    }

}

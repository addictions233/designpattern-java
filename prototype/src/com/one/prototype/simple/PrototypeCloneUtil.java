package com.one.prototype.simple;

/**
 * @ClassName: PrototypeCloneUtil
 * @Description: 对原型对象进行拷贝的工厂
 * @Author: one
 * @Date: 2022/06/04
 */
public class PrototypeCloneUtil {
    /**
     * 提供一个简单工厂,获取原型对象拷贝之后生成的对象
     * @param prototype 原型对象
     * @return 拷贝之后的对象
     */
    public static Prototype clonePrototype(Prototype prototype) {
        return prototype.clone();
    }
}

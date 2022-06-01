package com.one.test;

import com.one.singleton.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName: ReflectSingletonTest
 * @Description: 使用反射破坏单例模式,创建多个对象
 * @Author: one
 * @Date: 2022/05/28
 */
public class ReflectSingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        LazyInnerClassSingleton instance1 = LazyInnerClassSingleton.getInstance();
        // 使用反射调用构造方法创建对象
        Constructor<LazyInnerClassSingleton> constructor = LazyInnerClassSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazyInnerClassSingleton instance2 = constructor.newInstance();
        System.out.println(instance1 == instance2); // 输出false
    }
}

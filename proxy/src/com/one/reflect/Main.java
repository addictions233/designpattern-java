package com.one.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName: Main
 * @Description: 测试newInstance()方法创建对象实例
 * @Author: one
 * @Date: 2020/12/14
 */
public class Main {
    public static void main(String[] args)  {

//        testReflect();
        try {
            //用java.lang.Class类中的newInstance()方法创建对象,这个调用无参构造器创建对象,没法调用有参构造器
            Class uClass = Class.forName("com.one.reflect.User2");
            Constructor constructor = uClass.getConstructor(String.class, int.class);
            User2 user2 = (User2)constructor.newInstance("张三",23);
            //利用反射机制来调用方法
            Method method = uClass.getMethod("say", String.class, int.class);
            //调用反射方法
            method.invoke(user2,user2.getName(),user2.getAge());
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    private static void testReflect() {
        try {
            //用java.lang.Class类中的newInstance()方法创建对象,这个调用无参构造器创建对象,没法调用有参构造器
            Class uClass = Class.forName("com.one.reflect.User");
            User user = (User)uClass.newInstance();
            user.say();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}

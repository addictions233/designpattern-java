package com.one.JDKproxy;

import java.lang.reflect.Method;

/**
 * @ClassName: Main
 * @Description: 测试JDK动态代理
 * @Author: one
 * @Date: 2020/12/14
 */
public class Main {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorldImpl();
//        JDKProxyExample example = new JDKProxyExample();
//        HelloWorld proxy =  (HelloWorld)example.getProxyObject(helloWorld);
//        proxy.sayHelloWorld();
//
        HelloWorld proxy =(HelloWorld)JDKProxyFactory.getProxy(helloWorld);
        //用 代理对象调用任何方法,都会进入到 invoke()方法中执行..
        //代理对象调用的方法传参数给 method, 方法中的参数传递给 args
        String string = proxy.toString();
        System.out.println("=======================打印proxy对象如下:================");
        System.out.println(string);
        System.out.println("=====================打印proxy对象中的方法如下:===================");
        Method[] methods = proxy.getClass().getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);    //public final void com.sun.proxy.$Proxy0.sayHelloWorld(java.lang.String)
        }
        System.out.println("==================下面的是调用invoke()方法的输出结果================");
        proxy.sayHelloWorld("张三");
//        helloWorld.sayHelloWorld("李四");
    }
}

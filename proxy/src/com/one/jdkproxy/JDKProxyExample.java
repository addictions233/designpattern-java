package com.one.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: JDKProxyExample
 * @Description: TODO
 * @Author: one
 * @Date: 2020/12/14
 */

/**
 * InvocationHandler接口:是代理实例的调用处理程序实现的接口。每个代理实例都具有一个关联的调用处理程序。
 * 对代理实例调用方法时，将对方法调用进行编码并将其指派到它的调用处理程序的 invoke 方法
 */
public class JDKProxyExample implements InvocationHandler {
    //接收目标对象
    private Object target;

    /**
     * Proxy类中的该方法主要用于获取代理对象，注意一定是针对接口进行代理
     * public static Object newProxyInstance(ClassLoader loader,
     *                                           Class<?>[] interfaces,
     *                                           InvocationHandler h)  throws IllegalArgumentException
     * @param target: 目标对象
     * @describ 获取目标对象的动态代理对象, 目标对象和代理对象实现相同的父接口
     */
    public Object getProxyObject(Object target){
        this.target = target; //对属性进行赋值
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),   //目标对象的类加载器
                target.getClass().getInterfaces(),  //目标对象的实现接口
                this);  //InvocationHandler h  调用处理器对象
    }


    /**
     * 实现InvocationHandler接口必须重写的代理方法: 真实调用的方法处理逻辑
     * public Object invoke(Object proxy,   //proxy:代理类
     *                      Method method,  //method：代理执行的方法
     *                      Object[] args); // args:方法参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("InvocationHandler中的invoke方法调用了....");
//        Object result = method.invoke(proxy, args);
        //利用反射动态的来反射方法，这就是动态代理和静态代理的区别
        Object result = method.invoke(target, args);
        System.out.println("真实对象调用的结果:"+result);
        return result;
    }
}

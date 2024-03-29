package com.one.jdkproxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: JDKProxyExample2
 * @Description: 使用静态工厂生产目标对象的动态代理对象
 * @Author: one
 * @Date: 2020/12/14
 */
public class JDKProxyFactory {
    /**
     * 通过jdk的动态代理生成代理对象
     *
     * @param target 目标对象
     * @return 代理对象
     */
    public static Object getProxy(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),

                new InvocationHandler() {
                    /**
                     * @param proxy 代理对象
                     * @param method 代理执行的方法
                     * @param args 方法参数
                     * @return 方法执行的结果
                     * @throws Throwable 异常信息
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //在这个方法中不能使用proxy代理对象,否则会出现循环调用,栈内存溢出
//                        System.out.println("InvocationHandler中的invoke方法调用了....");
//                        return method.invoke(target,args);
//                        ((HelloWorld)proxy).sayHelloWorld();
                        System.out.println("打印方法:");
                        System.out.println(method); //public abstract void com.one.JDKproxy.HelloWorld.sayHelloWorld(java.lang.String)
                        System.out.println("------------------------------");
                        System.out.println("打印参数:");
                        if(args!= null){
                            for (Object arg : args) {
                                System.out.println(arg);
                            }
                        }
                        System.out.println("------------------------------");
                        System.out.println("反射调用方法的结果:");
                        return method.invoke(target,args);
                    }
                });
    }
}

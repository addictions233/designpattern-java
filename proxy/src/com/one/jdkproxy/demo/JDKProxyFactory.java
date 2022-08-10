package com.one.jdkproxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: JDKProxyExample2
 * @Description: TODO
 * @Author: one
 * @Date: 2020/12/14
 */
public class JDKProxyFactory {
    public static Object getProxy(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),

                new InvocationHandler() {
                    /*
                           public Object invoke(Object proxy,   //proxy:代理类
                                                Method method,  //method：代理执行的方法
                                                Object[] args); // args:方法参数
                        */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //在这个方法中不能使用proxy对象
//                        System.out.println("InvocationHandler中的invoke方法调用了....");
//                        return method.invoke(target,args);
//                        ((HelloWorld)proxy).sayHelloWorld();
//                        proxy.toString(); //会报错,不能在这里使用proxy对象
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
                        return method.invoke(target,args);
                    }
                });
    }
}

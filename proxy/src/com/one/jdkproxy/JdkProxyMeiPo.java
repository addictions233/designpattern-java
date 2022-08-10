package com.one.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author one
 * @description TODO
 * @date 2022-8-10
 */
public class JdkProxyMeiPo implements InvocationHandler {

    /**
     * 被代理对象
     */
    private Person target;

    /**
     * 调用该方法使用jdk的动态代理生成target对象的代理对象
     *
     * @param person 目标对象
     * @return 获取目标对象的代理对象
     * @throws Exception 异常
     */
    public Object getInstance(Person person) throws Exception {
        this.target = person;
        Class<?> clazz = person.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    /**
     * 使用jdk的动态代理必须InvocationHandler接口
     *
     * @param proxy 生成的代理对象
     * @param method 切面方法
     * @param args 方法参数
     * @return 方法调用结果
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        // method.invoke(proxy,args) 错误写法
        // 利用反射来调用目标对象的方法,这是静态代理和动态代理的区别
        Object invoke = method.invoke(target, args);
        after();
        return invoke;
    }

    private void before() {
        System.out.println("我是媒婆, 我要给你找对象, 现在已经确认你的需求");
    }

    private void after() {
        System.out.println("已经成功帮你匹配到对象");
    }
}

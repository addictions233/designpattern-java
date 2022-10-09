package com.one.myproxy;

import java.lang.reflect.Method;

/**
 * @author one
 * @description 手动实现jdk动态代理,主要用到两个类, 一个是InvocationHandler接口, 一个是Proxy类
 * @date 2022-10-10
 */
public interface MyInvocationHandler {
    /**
     * invoke方法就是一个环绕通知,对于原有的切面进行增强
     *
     * @param proxy 生成的代理对象
     * @param method 切面方法
     * @param args 切面方法执行时的参数
     * @return 可以返回切面方法执行的结果,也可以对结果进行增强后返回
     * @throws Throwable 异常
     */
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}

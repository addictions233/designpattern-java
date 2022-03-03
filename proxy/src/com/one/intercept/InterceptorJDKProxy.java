package com.one.intercept;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: InterceptorJDKProxy
 * @Description: TODO
 * @Author: one
 * @Date: 2020/12/15
 */
public class InterceptorJDKProxy implements InvocationHandler {
    /*
        用来接收传入的目标对象target
     */
    private Object target;

    /*
        用来接收传入的拦截器interceptor的全限定类名
     */
    private String interceptorClass;

    /**
     *  带参构造器,对成员变量进行初始化赋值
     * @param target 目标对象
     * @param interceptorClass 拦截器类全限定类名
     */
    public InterceptorJDKProxy(Object target,String interceptorClass){
        this.target = target;
        this.interceptorClass = interceptorClass;
    }

    /**
     * 绑定目标对象和拦截器,返回代理对象
     * @param target
     * @param interceptorClass
     * @return
     */
    public Object bind(Object target,String interceptorClass){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    /**
     *  定义真实调用的代理方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}

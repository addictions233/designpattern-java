package com.one.intercept;

import java.lang.reflect.Method;

/**
 * @ClassName: Interceptor
 * @Description: 直接使用动态代理过于复杂,我们通知都是提供一个拦截器接口,共代码调用者实现
 * @Author: one
 * @Date: 2020/12/15
 */
public interface Interceptor {
     /**
      * @description 用于方法之前的判断
      * @param proxy 代理对象
      * @param target 目标对象(被代理对象)
      * @param method 调用的方法
      * @param args 调用方法时传递进来的参数
      * @return 当返回结果为true时,执行after方法, 当返回结果为false,执行around方法
      */
    public abstract boolean before(Object proxy, Object target, Method method, Object[] args);

    public abstract void around(Object proxy, Object target, Method method, Object[] args);

    public abstract  void after(Object proxy, Object target, Method method, Object[] args);
}

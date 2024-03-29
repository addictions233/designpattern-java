package com.one.intercept;

import java.lang.reflect.Method;

/**
 * @ClassName: MyInterceptor
 * @Description: TODO
 * @Author: one
 * @Date: 2020/12/15
 */
public class MyInterceptor implements Interceptor {
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("反射方法前逻辑");
        return false;// 不反射被代理对象原有方法
    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("反射方法后逻辑。");
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("取代了被代理对象的方法");
    }
}

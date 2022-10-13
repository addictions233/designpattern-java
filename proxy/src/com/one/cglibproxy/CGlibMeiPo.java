package com.one.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author one
 * @description 使用CGlib实现动态代理需要实现MethodInterceptor接口,使用CGlib实现动态代理不需要实现接口,代理对象
 *              是目标对象的子类对象, 所以代理对象能对父类的方法进行增强重写
 * @date 2022-10-14
 */
public class CGlibMeiPo implements MethodInterceptor {

    /**
     * 获取CGlib的动态代理对象
     *
     * @param clazz 目标对象的字节码对象
     * @return 代理对象
     */
    public Object getInstance(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);
        after();
        return result;
    }

    private void before() {
        System.out.println("我是媒婆, 我要给你找对象, 现在已经确认你的需求");
    }

    private void after() {
        System.out.println("已经成功帮你匹配到对象");
    }
}

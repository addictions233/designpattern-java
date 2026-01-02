package com.one.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getCglibProxy() {
        // 增强器类, 用来创建Cglib动态代理
        Enhancer enhancer = new Enhancer();
        // Cglib是基于继承实现的, 设置代理类父类的字节码对象
        enhancer.setSuperclass(target.getClass());
        // 设置回调: 对于代理类上所有的方法的调用, 都会调用Callback, 而Callback则需要实现intercept()方法进行拦截
        enhancer.setCallback(new MethodInterceptor() {
            /**
             *
             * @param proxy 代理对象
             * @param method 目标对象中的方法的Method实例
             * @param args  方法实际参数
             * @param methodProxy 代理对象中的方法的Method实例
             * @return 目标方法执行返回的结果
             */
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("开启事务");
                methodProxy.invokeSuper(proxy, args);
                System.out.println("提交事务");
                return null;
            }
        });
        // 创建动态代理对象并返回
        return enhancer.create();
    }
}

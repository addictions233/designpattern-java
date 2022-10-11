package com.one.dbroute.proxy;

import com.one.dbroute.DynamicDatasourceEntity;
import com.one.dbroute.Order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.time.Year;

/**
 * @author one
 * @description 使用动态代理实现数据源的切换
 * @date 2022-10-11
 */
public class OrderServiceDynamicProxy implements InvocationHandler {
    /**
     * 目标对象: 被代理对象
     */
    private Object target;

    /**
     * 使用jdk的动态代理生成目标对象的代理对象
     *
     * @param target 目标对象
     * @return 代理对象
     */
    public Object getProxy(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    /**
     * 动态代理对象调用方法, 最终都是调用InvocationHandler接口中的invoke方法
     *
     * @param proxy 代理对象
     * @param method 切面方法
     * @param args 切面方法的参数
     * @return 增强切面方法后返回的结果
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    private void before() {
        int year = Year.now().getValue();
        String dbRoute= "db_" + year;
        DynamicDatasourceEntity.set(dbRoute);
        System.out.println("使用了数据源:" + dbRoute);
    }

    private void after() {
        DynamicDatasourceEntity.restore();
    }
}

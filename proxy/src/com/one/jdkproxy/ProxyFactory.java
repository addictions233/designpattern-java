package com.one.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    /**
     * 保存目标对象
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 为目标对象生成代理对象
     * @return 代理对象
     */
    public Object getProxy() {
        // 使用JDK Proxy生成代理对象
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),  // 目标对象使用的类加载器
                target.getClass().getInterfaces(),   // 目标对象实现的接口
                new InvocationHandler() { // 构建事件处理器
                    /**
                     * 在invoke()方法中实现真正的代理逻辑
                     * @param proxy 生成的代理对象
                     * @param method 对应于代理对象上的调用的接口方法中的Method实例
                     * @param args 代理对象调用接口方法传递的实际参数
                     * @return 返回目标对象调用方法的返回值, 如果没有就返回null
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开启事务");
                        //执行目标对象方法
                        method.invoke(target, args);
                        System.out.println("提交事务");
                        return null;
                    }
                }
        );
    }
}

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

    /**
     * 对目标对象的方法进行增强, 生成的代理对象(目标对象的子类对象)调用findLove()方法时,就是调用的intercept()方法
     *
     * @param proxy 代理对象
     * @param method 目标对象中的方法
     * @param objects 方法参数
     * @param methodProxy 代理对象的方法
     * @return 方法执行结果
     * @throws Throwable
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        // cglib动态代理调用目标对象的方法与jdk动态代理有很大区别, jdk动态代理是直接利用目标对象反射进行调用的
        // 而cglib动态代理调用目标对象的方法是用的代理对象proxy,调用的代理方法methodProxy,而不是用的目标对象的方法method
        // 调用invokeSupper()方法其实是调用的FastClass的invoke()方法,而FastClass对象又是动态生成的字节码
        Object result = methodProxy.invokeSuper(proxy, objects);
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

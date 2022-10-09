package com.one.myproxy;

import com.one.jdkproxy.Person;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author one
 * @description TODO
 * @date 2022-10-10
 */
public class MyProxyMeiPo implements MyInvocationHandler{

    private Person target;

    public Object getInstance(Person person) {
        this.target = person;
        return MyProxy.newProxyInstance(new MyClassLoader(), person.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        // 利用反射来调用目标对象的方法,这是静态代理和动态代理的区别
        Object invoke = method.invoke(this.target, args);
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

package com.one.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author one
 * @description 使用jdk的动态代理需要实现InvocationHandler接口, 而生成的代理对象则是继承Proxy类,实现Person接口的代理对象
 *      JDK动态代理的实现原理:
 *          1, 拿到被代理类的引用对象, 并且获取它的所有接口(反射获取)
 *          2, JDK Proxy类重写生成一个新的类, 实现了被代理类所有的接口的方法
 *          3, 动态生成Java代码, 把增强逻辑加入到新生成的代码中
 *          4, 编译生成新的的java代码的class文件
 *          5, 加载并重写运行新的动态代理对象
 * @date 2022-8-10
 */
public class JdkProxyMeiPo implements InvocationHandler {

    /**
     * 被代理对象
     */
    private Person target;

    /**
     * 调用该方法使用jdk的动态代理: 生成目标对象的代理对象
     *
     * @param person 目标对象
     * @return 获取目标对象的代理对象
     * @throws Exception 异常
     */
    public Object getInstance(Person person) throws Exception {
        this.target = person;
        Class<?> clazz = person.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    /**
     * 使用jdk的动态代理必须InvocationHandler接口重写invoke方法, invoke方法本质上就是一个环绕通知,对原有的findLove()方法进行增强
     *
     * @param proxy 生成的代理对象 Proxy类的对象,即代理对象
     * @param method 切面方法  Class.forName("com.one.jdkproxy.Person").getMethod("findLove", new Class[0])
     * @param args 方法参数  findlove()方法的参数,这里是空参,传null
     * @return 方法调用结果
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
//        Object invoke =  method.invoke(proxy,args); // 错误写法, 如果用proxy对象会出现死循环调用方法, proxy对象也是有findLove()方法的
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

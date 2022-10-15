package com.one.jdkproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author one
 * @description 测试jdk的动态代理
 * @date 2022-8-10
 */
public class JdkProxyMeiPoTest {
    public static void main(String[] args) throws Exception {
        JdkProxyMeiPo meiPo = new JdkProxyMeiPo();
        Person person = (Person)meiPo.getInstance(new Girl());
        // 测试目标对象的findLove()方法
        person.findLove();

        /**
         * 将Person接口生成的代理对象,输出到E盘中
         * ProxyClassFactory是Proxy里的一个内部类，用来生成代理类，
         * 调用ProxyGenerator.generateProxyClass()方法来完成生成字节码的操作
         */
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
        FileOutputStream fileOutputStream = new FileOutputStream("E://proxy//$Proxy0.class");
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }
}

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
         */
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
        FileOutputStream fileOutputStream = new FileOutputStream("E://$Proxy0.class");
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }
}

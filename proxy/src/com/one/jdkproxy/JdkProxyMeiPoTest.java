package com.one.jdkproxy;

/**
 * @author one
 * @description 测试jdk的动态代理
 * @date 2022-8-10
 */
public class JdkProxyMeiPoTest {
    public static void main(String[] args) throws Exception {
        JdkProxyMeiPo meiPo = new JdkProxyMeiPo();
        Person person = (Person)meiPo.getInstance(new Girl());
        person.findLove();
    }
}

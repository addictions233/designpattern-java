package com.one.myproxy;

import com.one.jdkproxy.Girl;
import com.one.jdkproxy.Person;



/**
 * @author one
 * @description 测试jdk的动态代理
 * @date 2022-8-10
 */
public class MyProxyMeiPoTest {
    public static void main(String[] args) throws Exception {
        MyProxyMeiPo meiPo = new MyProxyMeiPo();
        Person person = (Person)meiPo.getInstance(new Girl());
        // 测试目标对象的findLove()方法
        person.findLove();


    }
}

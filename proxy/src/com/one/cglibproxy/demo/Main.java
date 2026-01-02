package com.one.cglibproxy.demo;


/**
 * @author one
 * @description 测试CGlib测试类
 * @date 2022-10-15
 */
public class Main {
    public static void main(String[] args) {
        // 使用cglib自带的工具输出生成的动态代理字节码对象
//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E://proxy//cglib" );
        HelloWorld helloWorld = (HelloWorld)new CglibProxy().getInstance(HelloWorldImpl.class);
        helloWorld.sayHelloWorld();
    }
}

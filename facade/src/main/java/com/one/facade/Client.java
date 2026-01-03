package com.one.facade;

public class Client {
    public static void main(String[] args) {
        // 客户端只需要和Facade交互, 就能使用子系统的功能
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
        facade.methodC();
    }
}
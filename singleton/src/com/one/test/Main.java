package com.one.test;

import com.one.singleton.Singleton3;

/**
 * @ClassName: Main
 * @Description: 单例设计模式测试类
 * @Author: one
 * @Date: 2022/05/08
 */
public class Main {
    public static void main(String[] args) {
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance1 == instance2);
    }
}

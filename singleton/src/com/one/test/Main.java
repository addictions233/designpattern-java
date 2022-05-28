package com.one.test;

import com.one.singleton.DoubleCheckSingleton;

/**
 * @ClassName: Main
 * @Description: 单例设计模式测试类
 * @Author: one
 * @Date: 2022/05/08
 */
public class Main {
    public static void main(String[] args) {
        DoubleCheckSingleton instance1 = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton instance2 = DoubleCheckSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}

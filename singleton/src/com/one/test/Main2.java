package com.one.test;

/**
 * @ClassName: Main2
 * @Description: 测试懒汉式的单例模式在多线程情况下的安全问题
 * @Author: one
 * @Date: 2022/05/27
 */
public class Main2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new GetInstanceRunnable());
        Thread thread2 = new Thread(new GetInstanceRunnable());

        thread1.start();
        thread2.start();
    }
}

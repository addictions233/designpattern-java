package com.one.test;

import com.one.register.ThreadLocalSingleton;

/**
 * @ClassName: ThreadLocalSingletonTest
 * @Description: ThreadLocal保证同一线程内获取的instance是同一个,即单例的
 * @Author: one
 * @Date: 2022/06/01
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + "====" + instance);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + "====" + instance);
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + "====" + instance);
            }
        });
        // 同一个线程内获取到的instance对象是相同的,单例的
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

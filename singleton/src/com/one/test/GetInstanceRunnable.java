package com.one.test;

import com.one.singleton.LazySingleton;

/**
 * @ClassName: GetInstanceRunnable
 * @Description: 使用多线程测试单例设计模式的线程安全性
 * @Author: one
 * @Date: 2022/05/27
 */
public class GetInstanceRunnable implements Runnable {
    @Override
    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "============" + instance);
    }
}

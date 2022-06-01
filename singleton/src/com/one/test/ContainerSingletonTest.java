package com.one.test;

import com.one.register.ContainerSingleton;

/**
 * @ClassName: ContainerSingletonTest
 * @Description: 测试容器式单例的线程安全性
 * @Author: one
 * @Date: 2022/06/01
 */
public class ContainerSingletonTest {
    public static void main(String[] args){
        Thread thread1 = new Thread(() -> {
            Object bean = null;
            try {
                bean = ContainerSingleton.getBean("com.one.pojo.Student");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(bean);
        });

        Thread thread2 = new Thread(() -> {
            Object bean = null;
            try {
                bean = ContainerSingleton.getBean("com.one.pojo.Student");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(bean);
        });

        thread1.start();
        thread2.start();
    }
}

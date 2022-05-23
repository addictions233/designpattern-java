package com.one.domain;

/**
 * @author one
 *  定义一个苹果类
 */
public class Apple implements Fruit {
    /**
     *  get() 采集方法
     */
    @Override
    public void get(){
        System.out.println("采集苹果");
    }
}

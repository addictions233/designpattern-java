package com.one.domain;

/**
 * @author one
 *  定义一个香蕉类
 */
public class Banana implements Fruit {
    /**
     *  get() 采集方法
     */
    @Override
    public void get(){
        System.out.println("采集香蕉");
    }
}

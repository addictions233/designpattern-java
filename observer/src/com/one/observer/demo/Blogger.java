package com.one.observer.demo;

import java.lang.reflect.Method;
import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName: Teacher
 * @Description: 博主监听问题(充当观察者),当有人在知乎论题提问时,通知博主
 *                     使用JDK自带的观察者设计模式: 观察者是实现java.util.Observer接口
 * @Author: one
 * @Date: 2022/05/08
 */
public class Blogger implements Observer {
    /**
     * 博主名称
     */
    private String name;

    public Blogger(String name) {
        this.name = name;
    }

    /**
     * 实现Observer接口重写的方法
     *
     * @param observable 被观察者对象, 这里就是zhiHu
     * @param arg 被观察者提供的参数, 这里是question对象
     */
    @Override
    public void update(Observable observable, Object arg) {
        ZhiHu zhiHu = (ZhiHu)observable;
        Question question = (Question)arg;
        // 为观察者(博主)发送消息
        System.out.println("===================================");
        System.out.println(name + "你好: \n  您收到了一个来自" + zhiHu.getName() + "的提问, \n  提问者:" + question.getUsername() + "\n  提问内容:" + question.getContent());
    }
}

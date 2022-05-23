package com.one.observer.demo;

import com.one.observer.demo.Blogger;
import com.one.observer.demo.Question;
import com.one.observer.demo.ZhiHu;

/**
 * @ClassName: ObserverTest
 * @Description: 观察者模式(Observer Pattern): 属于行为型模式,观察者模式也叫发布订阅者模式
 * 观察者模式定义了对象之间的一对多依赖,让多个观察者对象同时监听一个主体对象,
 * 当主体对象发生变化时,它的所有依赖者(观察者)都会收到通知并更新
 * @Author: one
 * @Date: 2022/05/08
 */
public class Main {
    public static void main(String[] args) {
        // 获取知乎论坛对象
        ZhiHu zhiHu = ZhiHu.getInstance();
        // 让观察者对象启动监听
        Blogger blogger = new Blogger("java大神");
        zhiHu.addObserver(blogger);

        // 被观察者触发通知事件
        // 创建问题对象
        Question question = new Question("小明", "观察者设计模式在哪些场景下使用?");
        zhiHu.publishQuestion(question);
    }
}

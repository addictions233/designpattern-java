package com.one.mediator;

/**
 * @description: 中介模式: 定义一个中介对象来简化原有对象之间的交互关系，降低系统中对象间的耦合度，使原有对象之间不必相互了解。
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public class Main {

    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1, c2;
        c1 = new ConcreteColleague1("key-1");
        c2 = new ConcreteColleague2("key-2");
        // 中介者对象注册具体的同事对象
        md.register(c1);
        md.register(c2);
        c1.send("key-2");
        System.out.println("-------------");
        c2.send("key-1");
    }
}

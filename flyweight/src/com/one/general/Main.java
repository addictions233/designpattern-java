package com.one.general;

/**
 * @author one
 * @description 测试享元模式
 * @date 2024-10-30
 */
public class Main {

    public static void main(String[] args) {
        // 达到对象公用的目的
        IFlyweight first = FlyweightFactory.getFlyweight("first");
        first.operate("你好");
        System.out.println("============================");
        IFlyweight second = FlyweightFactory.getFlyweight("second");
        second.operate("我好");
        System.out.println("=============================");
        IFlyweight third = FlyweightFactory.getFlyweight("first");
        third.operate("他好");
    }
}

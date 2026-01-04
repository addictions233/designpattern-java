package com.one.general;

/**
 * @author one
 * @description 测试享元模式
 * @date 2024-10-30
 */
public class Main {

    public static void main(String[] args) {
        // 测试共享的享元对象
        IFlyweight first = FlyweightFactory.getFlyweight("first");
        first.operate("你好");
        System.out.println("============================");
        IFlyweight second = FlyweightFactory.getFlyweight("second");
        second.operate("我好");
        System.out.println("=============================");
        IFlyweight third = FlyweightFactory.getFlyweight("first");
        third.operate("他好"); // 享元对象的内部状态是一致的, 但是外部状态则是不一致的
        // 达到对象公用的目的
        System.out.println(first == third); // 从享元池中获取, 保存单例, 所以地址值一样

        System.out.println("======================================");
        // 测试非共享的响应对象
        // 共享的享元对象直接从享元池中获取, 非共享的享元对象直接采用new创建
        IFlyweight u1 = new UnsharedFlyweight("u1");
        u1.operate("你好");
        IFlyweight u2 = new UnsharedFlyweight("u1");
        u2.operate("我好");
        System.out.println(u1 == u2); // 非共享的响应对象, 地址值不一样
    }
}

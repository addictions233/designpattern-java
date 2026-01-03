package com.one.example01;


import org.junit.jupiter.api.Test;

public class Client {

    @Test
    public void testFacade() {
        // 创建门面对象
        // 对于客户端来说, 外观模式屏蔽了子系统组件, 减少了客户端所需要处理的对象数目,实现了子系统和客户端的解耦
        SimpleApplicasFacade facade = new SimpleApplicasFacade();
        facade.say("打开家电");

        System.out.println("=================================");
        facade.say("关闭家电");
    }
}

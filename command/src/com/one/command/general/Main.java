package com.one.command.general;

/**
 * @author one
 * @description 命令模式: 实现命令的发送方和命令的执行方解耦
 * @date 2024-11-7
 */
public class Main {

    public static void main(String[] args) {
        Invoker invoker = new Invoker(new ConcreteCommandA());
        invoker.action();
        System.out.println("----------------------------------");

        Invoker invoker2 = new Invoker(new ConcreteCommandB());
        invoker2.action();
    }
}

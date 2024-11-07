package com.one.command.general;

/**
 * @author one
 * @description 具体的命令实现
 * @date 2024-11-7
 */
public class ConcreteCommandB implements ICommand{


    /**
     * 直接创建命令的接收者，不暴露给客户端,
     * 实现命令的调用者和执行者解耦
     */
    private Receiver receiver = new Receiver();

    @Override
    public void execute() {
        System.out.println("具体的命令B执行了...");
        receiver.action();
    }
}

package com.one.command.general;

/**
 * @author one
 * @description 命令调用者
 * @date 2024-11-7
 */
public class Invoker {

    /**
     * 调用者持有命令对象
     */
    private ICommand command;

    public Invoker(ICommand command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }

}

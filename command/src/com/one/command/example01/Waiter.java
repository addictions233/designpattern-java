package com.one.command.example01;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员: Invoker调用者角色
 */
public class Waiter {

    /**
     * 可以持有多个命令
     */
    private List<Command> commands;

    public Waiter() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    /**
     * Invoker调用者发起执行命令的入口方法
     */
    public void orderUp() {
        for (Command command : this.commands) {
            command.execute();
        }
    }
}

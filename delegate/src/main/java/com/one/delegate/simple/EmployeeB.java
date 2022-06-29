package com.one.delegate.simple;

/**
 * @ClassName: EmployeeB
 * @Description: 员工B
 * @Author: one
 * @Date: 2022/06/16
 */
public class EmployeeB implements IEmployee {
    /**
     * 员工能做的任务
     *
     * @param command 工作命令
     */
    @Override
    public void doing(String command) {
        System.out.println("我是员工B, 我擅长架构代码, 我写了" + command);
    }
}

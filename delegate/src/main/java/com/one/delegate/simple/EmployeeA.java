package com.one.delegate.simple;

/**
 * @ClassName: EmployeeA
 * @Description: 员工A
 * @Author: one
 * @Date: 2022/06/16
 */
public class EmployeeA implements IEmployee {
    /**
     * 员工能做的任务
     *
     * @param command 工作命令
     */
    @Override
    public void doing(String command) {
        System.out.println("我是员工A, 我擅长业务代码, 我写了" + command);
    }
}

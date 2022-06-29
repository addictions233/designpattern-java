package com.one.delegate.simple;

/**
 * @InterfaceName: IEmployee
 * @Description: 员工接口: 每个员工都能做一项工作任务
 * @Author: one
 * @Date: 2022/06/16
 */
public interface IEmployee {
    /**
     * 员工能做的任务
     * @param command 工作命令
     */
    void doing(String command);
}

package com.one.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Leader
 * @Description: Leader根据不同的任务类型委派给不同的员工
 * @Author: one
 * @Date: 2022/06/16
 */
public class Leader {
    /**
     * 委派模式需要委派者知道所有可以委派的对象,所以需要容器来存储这些对象,
     * 以便委派者接收到任务时,能够依据不同的委派对象安排任务
     */
    private static final Map<String, IEmployee> EMPLOYEE_MAP = new HashMap<>();

    static {
        EMPLOYEE_MAP.put("业务代码", new EmployeeA());
        EMPLOYEE_MAP.put("架构代码", new EmployeeB());
    }

    public void doing(String command) {
        EMPLOYEE_MAP.get(command).doing(command);
    }
}

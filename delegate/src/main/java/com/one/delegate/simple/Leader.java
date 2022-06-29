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
    private static Map<String, IEmployee> employeeMap = new HashMap<>();

    static {
        employeeMap.put("业务代码", new EmployeeA());
        employeeMap.put("架构代码", new EmployeeB());
    }

    public void doing(String command) {
        employeeMap.get(command).doing(command);
    }
}

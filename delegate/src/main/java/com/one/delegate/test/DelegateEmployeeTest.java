package com.one.delegate.test;

import com.one.delegate.simple.Boss;

/**
 * @ClassName: DelegateEmployeeTest
 * @Description: 测试简单委派模式
 * @Author: one
 * @Date: 2022/06/16
 */
public class DelegateEmployeeTest {
    public static void main(String[] args) {
//        new Boss().doSomething("业务代码");
        new Boss().doSomething("架构代码");
    }
}

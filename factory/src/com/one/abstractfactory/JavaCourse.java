package com.one.abstractfactory;

/**
 * @ClassName: JavaCourse
 * @Description: 具体产品对象: 将在具体工厂中被创建, 并提交外界使用
 * @Author: one
 * @Date: 2022/05/26
 */
public class JavaCourse implements ICourse {
    @Override
    public void teachCourse() {
        System.out.println("学习java课程");
    }
}

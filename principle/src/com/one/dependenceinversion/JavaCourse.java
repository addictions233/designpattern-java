package com.one.dependenceinversion;

/**
 * @author one
 * @description 面向接口编程
 * @date 2024-9-15
 */
public class JavaCourse implements ICourse{
    @Override
    public void study() {
        System.out.println("学习java课程");
    }
}

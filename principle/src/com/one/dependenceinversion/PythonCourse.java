package com.one.dependenceinversion;

/**
 * @author one
 * @description TODO
 * @date 2024-9-15
 */
public class PythonCourse implements ICourse{
    @Override
    public void study() {
        System.out.println("学习python课程");
    }
}

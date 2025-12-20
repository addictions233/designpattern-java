package com.one.dependenceinversion;

/**
 * @author one
 * @description 依赖倒置原则的反面例子: 面向实现编程,
 * @date 2024-9-15
 */
public class Jack {

    public void studyJavaCourse() {
        System.out.println("学习java课程");
    }

    public void studyPythonCourse() {
        System.out.println("学习python课程");
    }
}

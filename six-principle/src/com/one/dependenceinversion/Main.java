package com.one.dependenceinversion;

/**
 * @author one
 * @description TODO
 * @date 2024-9-15
 */
public class Main {

    public static void main(String[] args) {
        // v1版本: 面向实现编程
        Jack jack = new Jack();
        jack.studyJavaCourse();
        jack.studyPythonCourse();

        // v2版本: 面向接口编程, 功能是对接口的实现
        Geely geely = new Geely();
        geely.studyImoocCousre(new JavaCourse());
        geely.studyImoocCousre(new PythonCourse());

        // v3版本
        Geely geely1 = new Geely(new JavaCourse());
        geely1.studyImoocCourse();

        // v4版本
        geely1.setCourse(new PythonCourse());
        geely1.studyImoocCourse();
    }
}

package com.one.abstractfactory;

/**
 * @author one
 * @description 抽象工厂模式的测试使用类
 * @date 2023-9-20
 */
public class Main {
    public static void main(String[] args) {
        ICourseFactory factory1  =  new JavaCourseFactory();
        factory1.createCourse().teachCourse();
        factory1.createNote().takeNote();
        System.out.println("------------------------");
        ICourseFactory factory2 = new BigDataFactory();
        factory2.createCourse().teachCourse();
        factory2.createNote().takeNote();
    }
}

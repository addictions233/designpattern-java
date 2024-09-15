package com.one.openclose;

/**
 * @author one
 * @description TODO
 * @date 2024-9-15
 */
public class Main {

    public static void main(String[] args) {
        ICourse iCourse = new JavaCourse(1,"java课程", 1000.00);
        System.out.println("课程:" + iCourse.getName() + ",对应的价格是:" + iCourse.getPrice());
        // 使用继承类进行功能扩展, 不修改原有的接口和实现类
        ICourse iCourse1 = new JavaDiscountCourse(2,"java打折课程", 1000.00);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) iCourse1;
        System.out.println("课程:" + iCourse1.getName() + ",对应的价格是:" + iCourse1.getPrice() + ",原价格:" + javaDiscountCourse.getOriginPrice());
    }
}

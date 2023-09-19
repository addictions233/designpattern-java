package com.one.abstractfactory;

/**
 * @author one
 * @description TODO
 * @date 2023-9-20
 */
public class BigDataCourse implements ICourse{

    /**
     * 大数据具体课程对象
     */
    @Override
    public void teachCourse() {
        System.out.println("学习大数据课程");
    }
}

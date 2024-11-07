package com.one.template.course;

/**
 * @author one
 * @description TODO
 * @date 2022-12-12
 */
public class JavaCourse extends NetCourse{
    /**
     * 定义为抽象方法, 希望子类进行重写, 每个子类需要读这个方法实现定制化
     */
    @Override
    public void checkHomeWork() {
        System.out.println("检查Java课后作业");
    }

    /**
     * 虽然父类返回了false, 但是可以让子类进行重写, 进行调整
     *
     * @return boolean
     */
    @Override
    protected boolean needHomeWork() {
        return Boolean.TRUE;
    }
}

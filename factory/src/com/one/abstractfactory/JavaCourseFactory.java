package com.one.abstractfactory;

/**
 * @ClassName: JavaCourseFactory
 * @Description: 抽象工厂接口的具体实现工厂: 抽象工厂用来应对多功能,多维度的对象,
 *               缺点是当ICourseFactory工厂中想要添加新的功能对象,其所有的实现类都得实现该方法, 不符合开闭原则
 *               任务量太大,不适合频繁添加功能对象
 * @Author: one
 * @Date: 2022/05/26
 */
public class JavaCourseFactory implements ICourseFactory {

    /**
     * 创建java课程对象
     *
     * @return ICourse
     */
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    /**
     * 创建java笔记对象
     *
     * @return INote
     */
    @Override
    public INote createNote() {
        return new JavaNote();
    }

}

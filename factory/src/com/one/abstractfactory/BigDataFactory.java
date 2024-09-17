package com.one.abstractfactory;

/**
 * @author one
 * @description 抽象工厂接口的具体实现工厂: 实现抽象工厂, 并创建具体对象
 * @date 2023-9-20
 */
public class BigDataFactory implements ICourseFactory{
    @Override
    public ICourse createCourse() {
        return new BigDataCourse();
    }

    @Override
    public INote createNote() {
        return new BigDataNote();
    }
}

package com.one.abstractfactory;

/**
 * @InterfaceName: ICourseFactory
 * @Description: 抽象工厂就是工厂方法在多维度下的使用
 * @Author: one
 * @Date: 2022/05/26
 */
public interface ICourseFactory {
    /**
     * 创建课程对象
     * @return ICourse
     */
    ICourse createCourse();

    /**
     * 创建笔记对象
     * @return INote
     */
    INote createNote();

    /**
     * 创建视频对象
     * @return IVideo
     */
    IVideo createVideo();
}

package com.one.singleresponsibility;

/**
 * @author one
 * @description 接口按照单一职责进行拆分, 一个接口的修改只对该接口的实现影响, 不影响其他接口
 * @date 2024-9-16
 */
public class CourseImpl implements ICourseContent, ICourseManager{
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}

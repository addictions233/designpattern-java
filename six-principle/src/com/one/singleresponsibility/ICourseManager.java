package com.one.singleresponsibility;

/**
 * 对于接口按照单一职责进行拆分
 */
public interface ICourseManager {

    /**
     * 学习课程
     */
    void studyCourse();

    /**
     * 退课
     */
    void refundCourse();
}

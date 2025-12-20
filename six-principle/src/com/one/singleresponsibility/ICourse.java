package com.one.singleresponsibility;

/**
 * 当一个接口有多个职责, 考虑将接口按照单一职责进行拆分
 */
public interface ICourse {

    /**
     * 获取课程名称
     */
    String getCourseName();

    /**
     * 获取课程视频
     */
    byte[] getCourseVideo();

    /**
     * 学习课程
     */
    void studyCourse();

    /**
     * 退课
     */
    void refundCourse();
 }

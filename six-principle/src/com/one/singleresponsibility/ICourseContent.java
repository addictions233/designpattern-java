package com.one.singleresponsibility;

/**
 * 对于接口按照单一职责进行拆分
 */
public interface ICourseContent {

    /**
     * 获取课程名称
     */
    String getCourseName();

    /**
     * 获取课程视频
     */
    byte[] getCourseVideo();
}

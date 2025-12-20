package com.one.dependenceinversion;

/**
 * @author one
 * @description 面向接口编程
 * @date 2024-9-15
 */
public class Geely {

    private ICourse iCourse;

    public Geely(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public Geely() {
    }

    public void studyImoocCousre(ICourse iCourse) {
        iCourse.study();
    }

    public void studyImoocCourse() {
        this.iCourse.study();
    }

    public void setCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}

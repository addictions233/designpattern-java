package com.one.dimit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author one
 * @description TODO
 * @date 2024-9-16
 */
public class TeamLeader {

    public Integer checkNumberOfCourse(List<Course> courseList) {
        return courseList.size();
    }

    public Integer checkNumberOfCourse2() {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        return courseList.size();
    }
}

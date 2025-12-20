package com.one.dimit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author one
 * @description Boss向TeamLeader询问在线课程course的数量
 * @date 2024-9-16
 */
public class Boss {

    /**
     * 依据最少知道原则: Boss是将查询课程数量的任务交给TeamLeader的, 而不需要Boss自己创建Course对象, 这部分任务应该放到TeamLeader中
     * Boss知道TeamLeader, 不需要知道Course, 而TeamLeader才需要知道Course
     */
    public Integer commandCheckNumber(TeamLeader teamLeader) {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        return teamLeader.checkNumberOfCourse(courseList);
    }


    public Integer commandCheckNumber2(TeamLeader teamLeader) {
        return teamLeader.checkNumberOfCourse2();
    }
}

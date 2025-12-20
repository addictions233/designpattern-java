package com.one;

import com.one.course.PythonCourse;
import com.one.note.PythonNote;
import com.one.video.PythonVideo;

public class Main {

    public static void main(String[] args) {
        PythonCourse pythonCourse = new PythonCourse();
        pythonCourse.setVideo(new PythonVideo());
        pythonCourse.setNote(new PythonNote());
    }
}

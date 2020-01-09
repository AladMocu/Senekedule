package com.einjerjar.senekedule;

import java.util.ArrayList;

public class Course {
    int nrc;
    String code;
    String title;
    int maxStudents;
    int currentStudents;
    ArrayList<Teacher> teachers;
    ArrayList<ClassSchedule> schedules;

    public boolean overlaps(Course course) {
        for (ClassSchedule cs:schedules) {
            //return false;
        }
        return true;
    }
}

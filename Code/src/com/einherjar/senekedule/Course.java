package com.einherjar.senekedule;

import java.util.ArrayList;

public class Course {
    String nrc;
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

    public String toString()
    {
        return code+" : "+title+"\n";
    }

    public String getNRC() {
        return nrc;
    }
}

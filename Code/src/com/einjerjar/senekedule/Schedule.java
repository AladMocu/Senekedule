package com.einjerjar.senekedule;

import javax.xml.validation.SchemaFactoryLoader;
import java.util.ArrayList;

public class Schedule {

    ArrayList<Course> courses;
    int optCode;

    public Schedule()
    {
        courses= new ArrayList<>();
    }


    public boolean validate()
    {
        for (int i = 0; i <courses.size() ; i++) {
            for (int j = 0; j <courses.size() ; j++) {
                if(courses.get(i).overlaps(courses.get(i)))
                {
                    return false;
                }
            }

        }
        return true;
    }
}

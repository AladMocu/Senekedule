package com.einherjar.senekedule;

import java.util.ArrayList;

public class ClassPool {
    String code;
    ArrayList<Course> courses;


    public ClassPool(String code)
    {
        this.code=code;
        courses=new ArrayList<>();
    }

    public void AddToPool(Course c) throws Exception {
        if(!c.code.equals(code)) throw new Exception("Course do not match the pool");
        courses.add(c);
    }
    public boolean verify()
    {
        for (Course c:courses) {
            if(!c.code.equals(code))
            {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return courses.toString();
    }

    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)
        {
            return false;
        }
        return code.equals(((ClassPool)obj).getCode());
    }
}

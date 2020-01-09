package com.einherjar.senekedule;

import java.util.ArrayList;
import java.util.Optional;

public class Scheduler {

    ArrayList<ClassPool> pools;
    ArrayList<Course> allcourses;

    public Scheduler()
    {
     Loader loader= new Loader();
     pools=new ArrayList<>();
     ArrayList<Course> courses = loader.load();
     allcourses=new ArrayList<>();
        for (Course c:courses) {
            allcourses.add(c);
            try {
                getPoolbyCode(c.code).AddToPool(c);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public ClassPool getPoolbyCode(String code)
    {
        ClassPool testClassPool= new ClassPool(code);
        if(pools.contains(testClassPool))
        {
            return pools.get(pools.indexOf(testClassPool));
        }
        else{
            pools.add(testClassPool);
            return pools.get(pools.indexOf(testClassPool));
        }
    }



    public ArrayList<Schedule> getOptions(String... codes)
    {
        return new ArrayList<>();
    }

    public Course getCoursebynrc(String nrc) {
        Optional<Course> matchingObject = allcourses.stream().
                filter(p -> p.getNRC().equals(nrc)).
                findFirst();
        return matchingObject.orElse(null);
    }
}

package com.einherjar.senekedule;

import java.util.ArrayList;

public class Scheduler {

    ArrayList<ClassPool> pools;


    public Scheduler()
    {
     Loader loader= new Loader();
     loader.load();
    }

    public void loadData()
    {

    }


    public ArrayList<Schedule> getOptions(String... codes)
    {
        return new ArrayList<>();
    }
}

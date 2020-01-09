package com.einherjar.senekedule;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Loader {


    public void load()
    {
        String founderJson = "";
        try
        {
            founderJson = new String ( Files.readAllBytes( Paths.get("./data/cursosParsed.json") ) );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


        Gson gson = new GsonBuilder().setDateFormat("yyyy-mm-dd HH:mm:ss").create();

        Type founderListType = new TypeToken<ArrayList<Course>>(){}.getType();

        ArrayList<Course> founderList = gson.fromJson(founderJson, founderListType);

        System.out.println(founderList);
    }

}

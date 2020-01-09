package com.einherjar.deploy;

import com.einherjar.senekedule.Course;
import com.einherjar.senekedule.Schedule;
import com.einherjar.senekedule.Scheduler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.*;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EchoPostHandler implements HttpHandler {


    @Override
    public void handle(HttpExchange he) throws IOException {
        // parse request
        Map<String, Object> parameters = new HashMap<String, Object>();
        InputStreamReader isr = new InputStreamReader(he.getRequestBody(), "utf-8");
        BufferedReader br = new BufferedReader(isr);
        String query = br.readLine();
        Course c=parseQuery(query, parameters);
        // send response}
        System.err.println(c);
        String response = new GsonBuilder().setPrettyPrinting().create().toJson(c);
        he.sendResponseHeaders(200, response.length());
        OutputStream os = he.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }


    public Course parseQuery(String query, Map<String, Object> parameters) throws UnsupportedEncodingException {

        try {
            String nrc=query;
            return ServerCore.scheduler.getCoursebynrc(nrc);

        }catch (Exception e
        )
        {
            e.printStackTrace();
        }

    return null;
    }

}


package com.einherjar.deploy;


import com.einherjar.senekedule.Scheduler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class ServerCore {

    Scheduler scheduler;

    public ServerCore() throws IOException {
        scheduler= new Scheduler();
        int port = 9000;
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        System.out.println("server started at " + port);
        server.createContext("/", new RootHandler());
        server.createContext("/echoPost", new EchoPostHandler());
        server.setExecutor(null);
        server.start();
    }


    public static void main(String... args)
    {
        try {
            ServerCore core = new ServerCore();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

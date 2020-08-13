package com.venkat.interfaceBased.configuration;

import org.aeonbits.owner.ConfigFactory;


//http://owner.aeonbits.org/docs/loading-strategies/

public class MyApp {
    public static void main(String[] args) {
        ServerConfig cfg = ConfigFactory.create(ServerConfig.class);
        System.out.println("Server " + cfg.hostname() + ":" + cfg.port() +
                           " will run " + cfg.maxThreads());
    }
}
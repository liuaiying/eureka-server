package com.example.gconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class GConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GConfigServerApplication.class, args);
    }

}

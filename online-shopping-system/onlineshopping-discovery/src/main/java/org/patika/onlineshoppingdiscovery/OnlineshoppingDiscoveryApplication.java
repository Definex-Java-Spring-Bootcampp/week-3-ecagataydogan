package org.patika.onlineshoppingdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OnlineshoppingDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineshoppingDiscoveryApplication.class, args);
    }

}

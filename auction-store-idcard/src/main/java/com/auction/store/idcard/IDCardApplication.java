package com.auction.store.idcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class IDCardApplication {

    public static void main(String[] args) {
        SpringApplication.run(IDCardApplication.class, args);
    }
}

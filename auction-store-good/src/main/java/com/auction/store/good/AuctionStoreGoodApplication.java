package com.auction.store.good;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AuctionStoreGoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuctionStoreGoodApplication.class, args);
    }
}

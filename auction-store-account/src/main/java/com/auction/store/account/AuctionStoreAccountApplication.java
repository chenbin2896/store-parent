package com.auction.store.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AuctionStoreAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuctionStoreAccountApplication.class, args);
    }
}

package com.auction.store.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author User
 * @date 2019/10/2
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayApplication.class);
    }
}

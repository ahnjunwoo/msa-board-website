package com.duckking.msa.board.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class WebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsiteApplication.class, args);
    }
}

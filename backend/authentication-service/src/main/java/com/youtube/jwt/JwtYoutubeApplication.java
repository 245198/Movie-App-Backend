package com.youtube.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JwtYoutubeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtYoutubeApplication.class, args);
    }

}

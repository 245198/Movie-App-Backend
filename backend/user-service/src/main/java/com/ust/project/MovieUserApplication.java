package com.ust.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MovieUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieUserApplication.class, args);
	}

}

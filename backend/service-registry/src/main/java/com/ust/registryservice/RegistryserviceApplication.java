package com.ust.registryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryserviceApplication.class, args);
	}

}

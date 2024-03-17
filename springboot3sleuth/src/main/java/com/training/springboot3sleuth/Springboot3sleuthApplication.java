package com.training.springboot3sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class Springboot3sleuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot3sleuthApplication.class, args);
	}

}

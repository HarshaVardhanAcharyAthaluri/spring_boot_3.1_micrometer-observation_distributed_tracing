package com.training.springboot3sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Springboot3sleuth1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot3sleuth1Application.class, args);
	}

}

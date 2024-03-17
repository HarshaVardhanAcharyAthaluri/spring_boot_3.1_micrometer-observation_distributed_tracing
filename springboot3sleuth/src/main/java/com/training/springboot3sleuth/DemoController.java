package com.training.springboot3sleuth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchProperties.Restclient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {
	
	@Autowired
	RestTemplate rest;

	@GetMapping("/hello")
	public String greet() {
		return rest.getForObject("http://SPRINGBOOT3SLEUTH1/hello", String.class);
	}
}

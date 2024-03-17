package com.training.springboot3sleuth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/hello")
	public String greet() {
		return "Hello Iam Another Service";
	}
}

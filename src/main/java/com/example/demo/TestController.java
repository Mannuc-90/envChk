package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${system.env}")
	private String env;
	
	@GetMapping("/env")
	public String envChk() {
		return env;
	}
}

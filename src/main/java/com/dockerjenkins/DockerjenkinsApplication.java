package com.dockerjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerjenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerjenkinsApplication.class, args);
	}

	@GetMapping("hello")
	public String hello(){
		return "<h1>Hello docker!</h1>";
	}

}

package com.app.springbootdockerjenkinsintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerJenkinsIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerJenkinsIntegrationApplication.class, args);
	}

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to docker jenkins integration";
	}

}

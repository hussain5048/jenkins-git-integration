package com.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsGitIntegrationApplication {

	@PostConstruct
	public void test() {
		System.out.println("Application start..............");
	}
	
	public static void main(String[] args) {
		System.out.println("Application executed..............");
		SpringApplication.run(JenkinsGitIntegrationApplication.class, args);
	}

}

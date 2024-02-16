package com.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsGitIntegrationApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Test is running");
		assertEquals(true, true);

	}

}

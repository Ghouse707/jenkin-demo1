package com.ghouse.jenkins_demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsDemoApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("Test case of my program ghouse is executing111...");
		logger.info("Test case of my program ghouse22222222222...");

		assertEquals(true, true);

	}
}


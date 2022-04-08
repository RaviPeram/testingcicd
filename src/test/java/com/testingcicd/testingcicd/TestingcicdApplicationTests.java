package com.testingcicd.testingcicd;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestingcicdApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(TestingcicdApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("In Testing.....");
		logger.info("In Testing..2...");
		logger.info("In Testing..3...");
		logger.info("In Testing..4...");
		assert (true);
	}

}

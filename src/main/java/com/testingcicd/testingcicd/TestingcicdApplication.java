package com.testingcicd.testingcicd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingcicdApplication {

	public static Logger logger = LoggerFactory.getLogger(TestingcicdApplication.class);

	public static void main(String[] args) {
		logger.info("In logger Main method.....");
		logger.info("In logger Main test 2method.....");
		logger.info("In logger Main test 4....");
		SpringApplication.run(TestingcicdApplication.class, args);
	}

}

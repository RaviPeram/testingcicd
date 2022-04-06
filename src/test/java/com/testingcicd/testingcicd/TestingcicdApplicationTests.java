package com.testingcicd.testingcicd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestingcicdApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("In Testing.....");
		assert (true);
	}

}

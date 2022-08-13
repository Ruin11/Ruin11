package com.example.Springdeploy;

import static org.mockito.Answers.valueOf;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest
class SpringDeployApplicationTests {

	@Test
	void contextLoads() {

		System.getenv().forEach(

				(key, value)->System.out.println(key + "" + value)
		);
	}

}

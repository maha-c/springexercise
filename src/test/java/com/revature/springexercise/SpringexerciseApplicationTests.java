package com.revature.springexercise;

import com.revature.springexercise.repository.EmployeeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringexerciseApplicationTests {

	@Autowired
	private EmployeeRepo empRepo;
	@Test
	void contextLoads() {
		System.out.println(empRepo.findAll());
	}

}

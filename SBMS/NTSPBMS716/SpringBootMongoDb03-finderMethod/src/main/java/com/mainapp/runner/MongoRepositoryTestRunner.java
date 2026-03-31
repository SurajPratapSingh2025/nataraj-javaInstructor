package com.mainapp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mainapp.service.EmployeeService;

@Component
public class MongoRepositoryTestRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeService empService;
	
	@Override
	public void run(String... args) throws Exception {
		//show employee on custom salary range
//		List<EmployeeEntity> list = empService.showEmployeesBySalaryRange(10000.0, 300000.0);
//		list.forEach(System.out::println);
		
		//show employee on custom name
		empService.showEmployeeByEnames("rajesh","suraj").forEach(System.out::println);
	}

}

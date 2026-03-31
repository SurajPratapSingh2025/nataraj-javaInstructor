package com.mainapp.runner;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mainapp.entity.EmployeeEntity;
import com.mainapp.service.EmployeeService;

@Component
public class MongoRepositoryTestRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeService empService;

	@Override
	public void run(String... args) throws Exception {
		try {
			EmployeeEntity emp = new EmployeeEntity(new Random().nextInt(100000),"rajesh","hyd",90234.0,true);
			String msg = empService.registerEmployee(emp);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

	

}

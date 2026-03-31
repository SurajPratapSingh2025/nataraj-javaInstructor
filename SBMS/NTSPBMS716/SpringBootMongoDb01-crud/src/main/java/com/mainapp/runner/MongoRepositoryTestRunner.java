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
		//single data entry
//		try {
//			EmployeeEntity emp = new EmployeeEntity(1001,"maju","pat",60000.0,false);
//			String msg = empService.registerEmployee(emp);
//			System.out.println(msg);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		//multiple data entry
//		try {
//			EmployeeEntity emp1 = new EmployeeEntity(1002,"raju","hyd",90000.0,true);
//			EmployeeEntity emp2 = new EmployeeEntity(1003,"suresh","vizag",892572.0,false);
//			String[] idVal = empService.registerEmployees(List.of(emp1,emp2));
//			System.out.println("Saved docs id Values are "+Arrays.toString(idVal));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		//fetch all data
//		try {
//			empService.showAllEmployees().forEach(emp->System.out.println(emp));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		//fetch by id
//		try {
//			EmployeeEntity e = empService.findEmployeeById("69ca655d0fea8b4a6705e889");
//			System.out.println(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		//update by id
//		try {
//			String e = empService.updateEmployeeById("69ca655d0fea8b4a6705e889", 120000.0);
//			System.out.println(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		//delete by id
		try {
			String e = empService.deleteEmployeeById("69ca5adc51a41a7ca77f4864");
			System.out.println(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

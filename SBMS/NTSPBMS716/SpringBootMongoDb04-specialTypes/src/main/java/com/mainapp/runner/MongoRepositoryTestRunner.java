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
		try {
			//insert data
//			Properties props = new Properties();
//			props.put("voterId", 293298572);
//			props.put("aadharId", 802849022);
//			EmployeeEntity emp = new EmployeeEntity(1001,"raja","hyd",90000.0,
//					new String[] {"red","green","black"},
//					List.of("ravi","ramesh","aniket"),
//					Set.of(999999L,888888L,7777777L),
//					props,
//					Map.of(1234,"Jeevan Anand",3456,"Jeevan Umang")
//					);
//			String r = empService.registerEmployee(emp);
//			System.out.println(r);
			
			
			//read data
			empService.showAllEmployees().forEach(System.out::println);
			}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

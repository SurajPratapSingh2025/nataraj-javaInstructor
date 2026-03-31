package com.mainapp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mainapp.service.EmployeeService;

@Component
public class MongoTemplateTestRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeService empService;

	@Override
	public void run(String... args) throws Exception {
//		EmployeeEntity emp = new EmployeeEntity(1001,"raja","hyd",90000.0,true);
//		String idVal = empService.registerEmployee(emp);
//		System.out.println("id value: "+idVal);
		
//		EmployeeEntity emp1 = new EmployeeEntity(1002,"maju","hyd",50000.0,true);
//		EmployeeEntity emp2 = new EmployeeEntity(1003,"kaju","hyd",20000.0,false);
//		String msg = empService.registerBatchEmployees(List.of(emp1,emp2));
//		System.out.println(msg);
		
		//***************** mongoTemplate query mthod *********************
		
//		empService.findEmployeesBySalaryRange(10000.0, 200000.0).forEach(System.out::println);
		
//		empService.findEmployeesByAddrs("hyd").forEach(System.out::println);
		
//		System.out.println(empService.findEmployeeById("69cb17e7b533572023ee17fd"));
		
//		empService.findEmployeesByAddrsAndSalaryRange(10000.0, 100000.0, "hyd","vizag").forEach(System.out::println);
		
//		System.out.println(empService.findAndUpdateEmpDataByEno(1001,"newyork",99999.0));
		
//		System.out.println(empService.findAndUpdateEmpDataBySalaryRange(50000.0, 80000.0, "newjersey"));
		
		System.out.println(empService.saveOrUpdateEmpDataByEno(1001,"navi mumbai", 7777.0));
		
		
		
		
		
		
		
	}

}

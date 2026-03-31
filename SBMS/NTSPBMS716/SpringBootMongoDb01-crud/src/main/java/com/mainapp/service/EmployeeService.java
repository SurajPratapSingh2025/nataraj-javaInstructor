package com.mainapp.service;

import java.util.List;

import com.mainapp.entity.EmployeeEntity;

public interface EmployeeService {
	
	public String registerEmployee(EmployeeEntity emp);
	public String[] registerEmployees(List<EmployeeEntity> emps);
	public List<EmployeeEntity> showAllEmployees();
	public EmployeeEntity findEmployeeById(String id);
	public String updateEmployeeById(String id,double newSalary);
	public String deleteEmployeeById(String id);
}

package com.mainapp.service;

import java.util.List;

import com.mainapp.entity.EmployeeEntity;

public interface EmployeeService {
	
	public List<EmployeeEntity> showEmployeesBySalaryRange(double startSalary,double endSalary);
	public List<EmployeeEntity> showEmployeeByEnames(String...names);
	
	
	
	
	
}

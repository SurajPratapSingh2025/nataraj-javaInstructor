package com.mainapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mainapp.entity.EmployeeEntity;
import com.mainapp.repository.EmployeeRepository;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public String registerEmployee(EmployeeEntity emp) {
		Integer idVal = empRepo.save(emp).getEno();
		return "Employee is registered with the id value: "+idVal;
	}

	
	
	
	
	
	
	
	
	
	
}

package com.mainapp.service;

import java.util.List;

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
		String id = empRepo.save(emp).getId();
		return "Employee is registered with the id value: "+id;
	}

	@Override
	public List<EmployeeEntity> showAllEmployees() {
		List<EmployeeEntity> list = empRepo.findAll();
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
}

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
	public List<EmployeeEntity> showEmployeesBySalaryRange(double startSalary, double endSalary) {
		//use Repository
		List<EmployeeEntity> list = empRepo.findBySalaryBetween(startSalary, endSalary);
		return list;
	}

	@Override
	public List<EmployeeEntity> showEmployeeByEnames(String... names) {
		List<EmployeeEntity> list = empRepo.findByEnameIn(names);
		return list;
	}

	
	
	
	
}

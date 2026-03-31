package com.mainapp.service;

import java.util.List;
import java.util.Optional;

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
	public String[] registerEmployees(List<EmployeeEntity> emps) {
		List<EmployeeEntity> saveAll = empRepo.saveAll(emps);
		String idVal[] = new String[emps.size()];
		for(int i=0; i<idVal.length; ++i) {
			idVal[i]=saveAll.get(i).getId();
		}
		return idVal;
	}

	@Override
	public List<EmployeeEntity> showAllEmployees() {
		List<EmployeeEntity> list = empRepo.findAll();
		return list;
	}

	@Override
	public EmployeeEntity findEmployeeById(String id) {
		Optional<EmployeeEntity> opt = empRepo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new IllegalArgumentException("invalid id");
		}
		
	}

	@Override
	public String updateEmployeeById(String id, double newSalary) {
		//load the document
		Optional<EmployeeEntity> opt = empRepo.findById(id);
		if(opt.isPresent()) {
			//get the document
			EmployeeEntity emp = opt.get();
			emp.setSalary(newSalary);
			String idVal = empRepo.save(emp).getId();
			return idVal+" id document is updated with new salary";
		}
		return id+" id document is not found";
	}

	@Override
	public String deleteEmployeeById(String id) {
		Optional<EmployeeEntity> opt = empRepo.findById(id);
		if(opt.isPresent()) {
			empRepo.deleteById(id);
			return id+" id deleted succesfully";
		}else {
			throw new IllegalArgumentException("id not present");
		}
	}
	
	
	
	
	
	
	
	
}

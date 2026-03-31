package com.mainapp.service;

import java.util.List;

import com.mainapp.entity.EmployeeEntity;

public interface EmployeeService {
	
	public String registerEmployee(EmployeeEntity emp);
	public String registerBatchEmployees(List<EmployeeEntity> list);
	
	//***************** mongoTemplate query mthod *********************
	
	public List<EmployeeEntity> findEmployeesBySalaryRange(double start,double end);
	public List<EmployeeEntity> findEmployeesByAddrs(String addrs);
	public EmployeeEntity findEmployeeById(String id);
	public List<EmployeeEntity> findEmployeesByAddrsAndSalaryRange(double start,double end,String ...addrs);
	public String findAndUpdateEmpDataByEno(int eno,String newAddrs,double newSalary);
	public String findAndUpdateEmpDataBySalaryRange(double start,double end,String newAddrs);
	public String saveOrUpdateEmpDataByEno(int eno,String newAddrs,double newSalary);
	
	
	
	
	
	
	
	
}

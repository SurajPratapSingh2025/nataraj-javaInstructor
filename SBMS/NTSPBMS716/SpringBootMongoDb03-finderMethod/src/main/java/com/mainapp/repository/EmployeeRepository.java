package com.mainapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mainapp.entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeEntity,String>{
	
	public List<EmployeeEntity> findBySalaryBetween(double startSalary,double endSalary);
	public List<EmployeeEntity> findByEnameIn(String...names);

}

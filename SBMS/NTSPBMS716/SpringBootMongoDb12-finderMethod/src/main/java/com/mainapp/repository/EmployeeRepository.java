package com.mainapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mainapp.entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeEntity,String>{
	@Query(fields="{id:0,ename:1,eadd:1,eno:1)",value="{eadd:?0}")
	public List<Object[]> getEmpsDataByAddrs(String addrs);
	
	//@Query(fields="{}",value="{eadd:?0}")
	@Query(value="{eadd:?0}")
	public List<EmployeeEntity> getEmpsFullDataByAddrs(String addrs);
	
	@Query(value="{ename:?0,eadd:?1}")
	public List<EmployeeEntity> getEmpsFullDataByNameAndAddrs(String name,String addrs);
	
	@Query(value="{$or:[{{ename:?0},{eadd:?1}}]}")
	public List<EmployeeEntity> getEmpsFullDataByNameOrAddrs(String name,String addrs);
	
	@Query(fields="{id=0,eno:1,ename:1,eadd:1,salary:1}",value="{salary:{$gte:?0},salary:{$lte:?1}}")
	public List<Object[]> getEmpsFullDataBySalary(double start,double end);
	
	@Query(fields="{}",value="{ename:{'$regex':?0, '$options':'i'}}")
	//@Query(fields="{}",value="{ename:{'$regex':?0}}")
	public List<EmployeeEntity> getEmpsFullDataByEnameChars(String initialChars);
	
	@Query(fields="{}",value="{eadd:{$in:[?0,?1,?2]}}")
	public List<EmployeeEntity> getEmpsFullDataByAddrs(String addrs1,String addrs2,String addrs3);
	
	
	// ************************ Regular Expression Class *********************************
	
	@Query(value="{salary:{$gte:?0},salary:{$lte:?1}}",count=true)
	public List<Object[]> getEmpsCountBySalaryRange(double start,double end);
	
	@Query(value="{}",sort="{ename:-1}")
	public List<EmployeeEntity> getEmpsByNameSorting();
	
	@Query(value="{eadd:null}",delete=true)
	public int deleteEmployeesWithNoAddres();
	
	@Query(value="{salary:{$gte:?0},salary:{$lte:?1}}",exists=true)
	public boolean isEmpsFoundBySalaryRange(double start,double end);
	
	
	
	
	
	
	
	
	
	
	
}

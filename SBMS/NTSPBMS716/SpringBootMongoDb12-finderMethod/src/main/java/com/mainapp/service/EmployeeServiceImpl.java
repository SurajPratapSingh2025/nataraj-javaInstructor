package com.mainapp.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mainapp.entity.EmployeeEntity;
import com.mongodb.client.result.UpdateResult;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private MongoTemplate template;
	
	@Override
	public String registerEmployee(EmployeeEntity emp) {
//		String idVal = template.insert(emp).getId();
		String idVal = template.save(emp).getId();
		
		return idVal;
	}

	@Override
	public String registerBatchEmployees(List<EmployeeEntity> list) {
		Collection<EmployeeEntity> list1 = template.insertAll(list);
		return list1.size()+" number of employees are saved.";
	}

	@Override
	public List<EmployeeEntity> findEmployeesBySalaryRange(double start, double end) {
		Query query = new Query();
		query.addCriteria(Criteria.where("salary").gte(start).lte(end));
		List<EmployeeEntity> list = template.find(query, EmployeeEntity.class);
		return list;
	}

	@Override
	public List<EmployeeEntity> findEmployeesByAddrs(String addrs) {
		Query query = new Query();
		query.addCriteria(Criteria.where("eadd").is(addrs));
		List<EmployeeEntity> list = template.find(query, EmployeeEntity.class);
		return list;
	}

	@Override
	public EmployeeEntity findEmployeeById(String id) {
		return template.findById(id, EmployeeEntity.class);
	}

	@Override
	public List<EmployeeEntity> findEmployeesByAddrsAndSalaryRange(double start, double end, String... addrs) {
		Query query = new Query();
		query.addCriteria(Criteria.where("eadd").in(addrs).and("salary").gte(start).lte(end));
		List<EmployeeEntity> list = template.find(query, EmployeeEntity.class);
		return list;
	}

	@Override
	public String findAndUpdateEmpDataByEno(int eno, String newAddrs, double newSalary) {
		Query query = new Query();
		query.addCriteria(Criteria.where("eno").is(eno));
		Update update = new Update();
		update.set("eadd", newAddrs);
		update.set("salary", newSalary);
		EmployeeEntity emp = template.findAndModify(query,update,EmployeeEntity.class);
		return emp==null?"Employee not found":"Employee found & updated: "+emp;
	}

	@Override
	public String findAndUpdateEmpDataBySalaryRange(double start, double end, String newAddrs) {
		Query query = new Query();
		query.addCriteria(Criteria.where("salary").gte(start).lte(end));
		Update update = new Update();
		update.set("eadd", newAddrs);
		UpdateResult result = template.updateMulti(query,update,EmployeeEntity.class);
		return result.getModifiedCount()+" docs are updated.";
	}

	@Override
	public String saveOrUpdateEmpDataByEno(int eno, String newAddrs, double newSalary) {
		Query query = new Query();
		query.addCriteria(Criteria.where("eno").is(eno));
		Update update = new Update();
		update.set("eadd", newAddrs);
		update.set("salary", newSalary);
		update.setOnInsert("isVaccinated", true);
		update.setOnInsert("ename", "bond");
		update.setOnInsert("eno", eno);
		UpdateResult result = template.upsert(query, update, EmployeeEntity.class);
		if(result.getModifiedCount()==0)
			return "docs is inserted";
		else
			return "docs is updated";
	}
	
	
	
	
	
	
	
	

}

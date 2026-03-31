package com.mainapp.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Document(collection="employee")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class EmployeeEntity {
	@Id
	private String id;
	@NonNull
	private Integer eno;
	@NonNull
	private String ename;
	@NonNull
	private String eadd;
	@NonNull
	private Double salary;
	@NonNull
	private String[] favColors;
	@NonNull
	private List<String> friends;
	@NonNull
	private Set<Long> phoneNumber;
	@NonNull
	private Properties idDetails;
	@NonNull
	private Map<Integer,String> insurancePolicies;
	
}

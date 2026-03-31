package com.mainapp.entity;

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
	private boolean isVaccinated;
	
}

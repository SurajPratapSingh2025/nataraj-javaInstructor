package com.mainapp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document(collection="mdb_oto_person")
@Setter
@Getter
//@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class PersonEntity {
	
	@Id
	private String id;
	@NonNull
	private String pname;
	@NonNull
	private String paddrs;
	@NonNull
	private Integer age;
	private DrivingLicenseEntity licenseDetails;
	@Override
	public String toString() {
		return "PersonEntity [id=" + id + ", pname=" + pname + ", paddrs=" + paddrs + ", age=" + age + "]";
	}
	

}

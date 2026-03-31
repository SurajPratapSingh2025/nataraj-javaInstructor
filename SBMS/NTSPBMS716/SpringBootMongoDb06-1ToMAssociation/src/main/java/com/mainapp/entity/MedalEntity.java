package com.mainapp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document(collection="mdb_otm_medal")
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class MedalEntity {
	
	@Id
	@NonNull
	private Integer mid;
	@NonNull
	private String mname;
	@NonNull
	private String mevent;
	@NonNull
	private String mplace;
	@Override
	public String toString() {
		return "MedalEntity [mid=" + mid + ", mname=" + mname + ", mevent=" + mevent + ", mplace=" + mplace + "]";
	}
	
}

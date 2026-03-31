package com.mainapp.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document(collection="mdb_oto_drivinglicense")
@Setter
@Getter
//@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class DrivingLicenseEntity {
	@Id
	private String id;
	@NonNull
	private String type;
	@NonNull
	private LocalDate validFrom;
	@NonNull
	private LocalDate validTo;
	private PersonEntity personDetails;
	@Override
	public String toString() {
		return "DrivingLicenseEntity [id=" + id + ", type=" + type + ", validFrom=" + validFrom + ", validTo=" + validTo
				+ "]";
	}
	
}

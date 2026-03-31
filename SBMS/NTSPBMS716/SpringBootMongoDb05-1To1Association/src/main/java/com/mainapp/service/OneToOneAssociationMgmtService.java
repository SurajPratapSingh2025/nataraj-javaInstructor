package com.mainapp.service;

import java.util.List;

import com.mainapp.entity.DrivingLicenseEntity;
import com.mainapp.entity.PersonEntity;

public interface OneToOneAssociationMgmtService {
	
	public String saveDataUsingPerson(PersonEntity person);
	public String saveDataUsingDrivingLicense(DrivingLicenseEntity license);
	
	public List<PersonEntity> showDataUsingPerson();
	public List<DrivingLicenseEntity> showDataUsingDrivingLicense();
}

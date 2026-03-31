package com.mainapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mainapp.entity.DrivingLicenseEntity;
import com.mainapp.entity.PersonEntity;
import com.mainapp.repository.DrivingLicenseRepository;
import com.mainapp.repository.PersonRepository;

@Service
public class OneToOneAssociationMgmtServiceImpl implements OneToOneAssociationMgmtService{
	
	@Autowired
	private PersonRepository personRepo;
	@Autowired
	private DrivingLicenseRepository licenseRepo;
	
	@Override
	public String saveDataUsingPerson(PersonEntity person) {
		String idVal = personRepo.save(person).getId();
		return "Person object & its associated DrivingLicense object is saved with the id value: "+idVal;
	}

	@Override
	public String saveDataUsingDrivingLicense(DrivingLicenseEntity license) {
		String idVal = licenseRepo.save(license).getId();
		return "DrivingLicense object & its associated Person object is saved with the id value: "+idVal;
	}

	@Override
	public List<PersonEntity> showDataUsingPerson() {
		
		return personRepo.findAll();
	}

	@Override
	public List<DrivingLicenseEntity> showDataUsingDrivingLicense() {
		
		return licenseRepo.findAll();
	}

}

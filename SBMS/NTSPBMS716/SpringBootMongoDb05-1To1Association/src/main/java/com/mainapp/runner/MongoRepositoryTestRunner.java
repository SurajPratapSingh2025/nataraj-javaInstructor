package com.mainapp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mainapp.service.OneToOneAssociationMgmtService;

@Component
public class MongoRepositoryTestRunner implements CommandLineRunner {
	
	@Autowired
	private OneToOneAssociationMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		try {
			//saving data using parent
//			PersonEntity person = new PersonEntity("raja","hyd",40);
//			DrivingLicenseEntity license = new DrivingLicenseEntity("LMV",LocalDate.now(),LocalDate.of(2024,10,24));
//			//add child to the parent
//			person.setLicenseDetails(license);
//			//use service
//			System.out.println(service.saveDataUsingPerson(person));
			
			//saving data using child
//			PersonEntity person = new PersonEntity("raja1","hyd1",41);
//			DrivingLicenseEntity license = new DrivingLicenseEntity("LMV1",LocalDate.now(),LocalDate.of(2025,11,25));
//			//add parent to the child
//			license.setPersonDetails(person);
//			//use service
//			System.out.println(service.saveDataUsingDrivingLicense(license));
			
			
			//show data using parent
			service.showDataUsingPerson().forEach(person->{
				System.out.println("parent: "+person);
				System.out.println("child: "+person.getLicenseDetails());
			});
			//show data using child
			service.showDataUsingDrivingLicense().forEach(license->{
				System.out.println("child: "+license);
				System.out.println("parent: "+license.getPersonDetails());
			});
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

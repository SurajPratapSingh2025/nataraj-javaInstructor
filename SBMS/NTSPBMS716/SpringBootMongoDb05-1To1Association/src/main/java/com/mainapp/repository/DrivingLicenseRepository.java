package com.mainapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mainapp.entity.DrivingLicenseEntity;

@Repository
public interface DrivingLicenseRepository extends MongoRepository<DrivingLicenseEntity,String>{

}

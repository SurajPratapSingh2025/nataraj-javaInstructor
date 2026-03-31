package com.mainapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mainapp.entity.PersonEntity;
@Repository
public interface PersonRepository extends MongoRepository<PersonEntity,String>{

}

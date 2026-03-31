package com.mainapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mainapp.entity.SportEntity;

@Repository
public interface SportRepository extends MongoRepository<SportEntity,Integer>{

}

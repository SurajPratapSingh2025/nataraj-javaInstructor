package com.mainapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mainapp.entity.MedalEntity;

@Repository
public interface MedalRepository extends MongoRepository<MedalEntity,Integer>{

}

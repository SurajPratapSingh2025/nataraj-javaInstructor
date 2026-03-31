package com.mainapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mainapp.entity.PlayerEntity;

@Repository
public interface PlayerRepository extends MongoRepository<PlayerEntity,Integer> {

}

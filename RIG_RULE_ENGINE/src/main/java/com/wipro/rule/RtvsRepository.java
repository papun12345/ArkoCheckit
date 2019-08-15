package com.wipro.rule;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.rtvs.Rtvs;

public interface RtvsRepository extends MongoRepository<Rtvs, String>{

}

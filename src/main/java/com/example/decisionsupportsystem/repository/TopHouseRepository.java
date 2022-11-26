package com.example.decisionsupportsystem.repository;

import com.example.decisionsupportsystem.repository.entity.TopHouse;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopHouseRepository extends MongoRepository<TopHouse, String> {

    @Aggregation(
            "{ '$limit' : ?0 }"
    )
    TopHouse findAll(int limit);
}

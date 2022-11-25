package com.example.decisionsupportsystem.repository;

import com.example.decisionsupportsystem.repository.entity.House;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseRepository extends MongoRepository<House, String> {
    House getHouseByItemId(String id);

    @Aggregation(
            "{ '$limit' : ?0 }"
    )
    List<House> findAll(int limit);


}

package com.example.decisionsupportsystem.repository;

import com.example.decisionsupportsystem.repository.entity.Recommendation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendationRepository extends MongoRepository<Recommendation, String> {

    Recommendation getRecommendationByUserId(String userId);
}

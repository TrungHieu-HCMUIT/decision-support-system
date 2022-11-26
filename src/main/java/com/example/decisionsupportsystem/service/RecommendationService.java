package com.example.decisionsupportsystem.service;

import com.example.decisionsupportsystem.repository.RecommendationRepository;
import com.example.decisionsupportsystem.repository.entity.House;
import com.example.decisionsupportsystem.repository.entity.Recommendation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RecommendationService {

    private final RecommendationRepository repository;
    private final HouseService houseService;

    public List<House> getRecommendation(String userId) {
        Recommendation recommendation = repository.getRecommendationByUserId(userId);
        if (recommendation != null) {
            return recommendation.getHouseIds().stream()
                    .map(houseService::getHouse)
                    .toList();
        }
        return Collections.emptyList();
    }

}

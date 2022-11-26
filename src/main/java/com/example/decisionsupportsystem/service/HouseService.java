package com.example.decisionsupportsystem.service;

import com.example.decisionsupportsystem.repository.HouseRepository;
import com.example.decisionsupportsystem.repository.TopHouseRepository;
import com.example.decisionsupportsystem.repository.entity.House;
import com.example.decisionsupportsystem.repository.entity.TopHouse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HouseService {

    private final HouseRepository houseRepository;
    private final TopHouseRepository topHouseRepository;

    public House getHouse(String houseId) {
        return houseRepository.getHouseByItemId(houseId);
    }

    public List<House> getAllHouse() {
        return houseRepository.findAll(15);
    }

    public List<House> getTopHouse() {
        TopHouse topHouse = topHouseRepository.findAll(1);
        if (topHouse != null) {
            return topHouse.getTopItems().stream()
                    .map(this::getHouse)
                    .toList();
        }
        return Collections.emptyList();
    }

}

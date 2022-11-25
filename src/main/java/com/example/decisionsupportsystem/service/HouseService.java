package com.example.decisionsupportsystem.service;

import com.example.decisionsupportsystem.repository.HouseRepository;
import com.example.decisionsupportsystem.repository.entity.House;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HouseService {

    private final HouseRepository houseRepository;

    public House getHouse(String houseId) {
        return houseRepository.getHouseByItemId(houseId);
    }

    public List<House> getAllHouse() {
        return houseRepository.findAll(15);
    }

}

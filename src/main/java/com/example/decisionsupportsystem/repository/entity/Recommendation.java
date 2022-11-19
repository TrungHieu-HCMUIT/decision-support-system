package com.example.decisionsupportsystem.repository.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("recommendation")
@Getter
@Setter
public class Recommendation {
    @Id
    String id;

    String userId;
    List<String> houseIds;
}

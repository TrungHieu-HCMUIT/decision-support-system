package com.example.decisionsupportsystem.repository.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document("recommendation")
@Getter
@Setter
public class Recommendation {
    @Id
    String id;


    @Field("user_id")
    String userId;
    @Field("house_ids")
    List<String> houseIds;
}

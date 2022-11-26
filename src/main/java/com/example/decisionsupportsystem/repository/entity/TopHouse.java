package com.example.decisionsupportsystem.repository.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document("top_house")
@Getter
@Setter
public class TopHouse {
    @Id
    String id;

    @Field("top_items")
    List<String> topItems;

}

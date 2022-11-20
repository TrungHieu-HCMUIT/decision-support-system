package com.example.decisionsupportsystem.repository.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.ZonedDateTime;

@Document("event_log")
@Getter
@Setter
@Builder
public class EventLog {
    @Id
    String id;

    @Field("item_id")
    String itemId;
    @Field("user_id")
    String userId;
    @Field("event_type")
    String event;
    @Field("create_timestamp")
    String createdAt;
}

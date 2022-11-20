package com.example.decisionsupportsystem.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EventLogDto {
    @JsonProperty("item_id")
    String itemId;
    @JsonProperty("user_id")
    String userId;
    String event;
}

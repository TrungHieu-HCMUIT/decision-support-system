package com.example.decisionsupportsystem.service;

import com.example.decisionsupportsystem.controller.dto.EventLogDto;
import com.example.decisionsupportsystem.repository.EventLogRepository;
import com.example.decisionsupportsystem.repository.entity.EventLog;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class EventLogService {

    private final EventLogRepository repository;

    public EventLog logEvent(EventLogDto dto) {
        var event = EventLog.builder()
                .itemId(dto.getItemId())
                .userId(dto.getUserId())
                .event(dto.getEvent())
                .createdAt(new Date()).build();
        return repository.insert(event);
    }

}

package com.example.decisionsupportsystem.controller;

import com.example.decisionsupportsystem.controller.dto.EventLogDto;
import com.example.decisionsupportsystem.service.EventLogService;
import com.example.decisionsupportsystem.service.HouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("api")
public class EventLogController extends BaseController {

    private final EventLogService service;

    @PostMapping("log-event")
    ResponseEntity<Object> getHouse(@RequestBody EventLogDto dto) {
        service.logEvent(dto);
        return successResponse(true);
    }
}

package com.example.decisionsupportsystem.controller;

import com.example.decisionsupportsystem.service.HouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("api")
public class HouseController extends BaseController {

    private final HouseService service;

    @GetMapping("house/{id}")
    ResponseEntity<Object> getHouse(@PathVariable String id) {
        var result = service.getHouse(id);
        return successResponse(result);
    }

    @GetMapping("houses")
    ResponseEntity<Object> getAllHouse() {
        var result = service.getAllHouse();
        return successResponse(result);
    }
}

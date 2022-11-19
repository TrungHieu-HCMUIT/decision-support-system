package com.example.decisionsupportsystem.controller;

import com.example.decisionsupportsystem.service.RecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("api")
public class RecommendationController extends BaseController {

    private final RecommendationService service;

    @GetMapping("recommendation/{id}")
    ResponseEntity<Object> getRecommendation(@PathVariable String id) {
        var result = service.getRecommendation(id);
        return successResponse(result);
    }
}

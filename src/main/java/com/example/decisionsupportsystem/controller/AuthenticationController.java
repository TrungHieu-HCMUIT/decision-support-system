package com.example.decisionsupportsystem.controller;

import com.example.decisionsupportsystem.controller.dto.SignInDto;
import com.example.decisionsupportsystem.service.AuthenticationService;
import com.example.decisionsupportsystem.service.HouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("api")
public class AuthenticationController extends BaseController {

    private final AuthenticationService service;

    @PostMapping("auth")
    ResponseEntity<Object> signIn(@RequestBody SignInDto dto) {
        String result = service.signIn(dto);
        return successResponse(result);
    }
}

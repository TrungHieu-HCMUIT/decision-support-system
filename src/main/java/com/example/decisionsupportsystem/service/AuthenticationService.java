package com.example.decisionsupportsystem.service;

import com.example.decisionsupportsystem.controller.dto.SignInDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    public String signIn(SignInDto dto) {
        if (dto.getUsername().contains("hhkapplication@gmail.com") && dto.getPassword().contains("password123")) {
            return "006842a9-8da3-4e9a-9a23-68535983aee0";
        }
        return null;
    }
}

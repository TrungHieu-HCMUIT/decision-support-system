package com.example.decisionsupportsystem.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class BaseResponse<T> {
    private Integer statusCode;
    private Boolean success;
    private String message;
    private T data;

    public static BaseResponse<Object> error(HttpStatus statusCode, String message) {
        return new BaseResponse<>(statusCode.value(), false, message, null);
    }

    public static <T> BaseResponse<T> success(T t) {
        return new BaseResponse<>(HttpStatus.OK.value(), true, null, t);
    }

}

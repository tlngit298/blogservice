package com.lnt.blog.exception;

import com.lnt.blog.dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    ApiResponse<?> handlingUncategorizedException(Exception exception) {
        ApiResponse<?> response = new ApiResponse<>();
        response.setCode(ExceptionCode.UNCATEGORIZED_EXCEPTION.getCode());
        response.setMessage(ExceptionCode.UNCATEGORIZED_EXCEPTION.getMessage());
        return response;
    }
}

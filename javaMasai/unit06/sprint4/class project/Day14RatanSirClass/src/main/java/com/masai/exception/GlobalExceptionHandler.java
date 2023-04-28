package com.masai.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(InvalidNumberException.class)
    public ResponseEntity<String> exceptionHandler(InvalidNumberException ae){

        return new ResponseEntity<>(ae.getMessage(), HttpStatus.BAD_REQUEST);
    }
}

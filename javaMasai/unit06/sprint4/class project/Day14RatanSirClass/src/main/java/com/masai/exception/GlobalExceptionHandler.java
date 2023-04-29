package com.masai.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    //to handel specific exception
    @ExceptionHandler(InvalidNumberException.class)
    public ResponseEntity<MyErrorDetails> exceptionHandler(InvalidNumberException ae, WebRequest re){
        MyErrorDetails err = new MyErrorDetails();
        err.setTimestamp(LocalDateTime.now());
        err.setMessage(ae.getMessage());
        err.setDetails(re.getDescription(false));


        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
    //to handel any generic exception
    @ExceptionHandler(Exception.class)
    public ResponseEntity<MyErrorDetails> exceptionHandler2(Exception ae, WebRequest re){
        MyErrorDetails err = new MyErrorDetails();
        err.setTimestamp(LocalDateTime.now());
        err.setMessage(ae.getMessage());
        err.setDetails(re.getDescription(false));

        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<MyErrorDetails> exceptionHandler3(NoHandlerFoundException ne, WebRequest re){
        MyErrorDetails err = new MyErrorDetails();
        err.setTimestamp(LocalDateTime.now());
        err.setMessage(ne.getMessage());
        err.setDetails(re.getDescription(false));

        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
}

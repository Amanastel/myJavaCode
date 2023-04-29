package com.masai.exception;

public class InvalidNumberException extends RuntimeException{

    public InvalidNumberException() {

    }
    public InvalidNumberException(String message) {
        super(message);
    }
}

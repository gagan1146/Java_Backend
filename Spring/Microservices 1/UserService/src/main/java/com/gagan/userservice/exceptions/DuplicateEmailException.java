package com.gagan.userservice.exceptions;

public class DuplicateEmailException extends java.lang.IllegalArgumentException {
    public DuplicateEmailException(){
        super("Resource not found on server !!");
    }
    public DuplicateEmailException(String message){
        super(message);
    }
}

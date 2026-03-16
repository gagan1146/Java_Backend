package com.gagan.ratingservice.exceptions;

public class DuplicateDataException extends RuntimeException{
    public DuplicateDataException(){
        super("Resource not found on server !!");
    }
    public DuplicateDataException(String message){
        super(message);
    }
}

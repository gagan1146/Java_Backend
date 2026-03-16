package com.gagan.ratingservice.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException() {
        super("Rating Not Found");
    }
    public ResourceNotFoundException(String message) {
        super(message);
    }
}

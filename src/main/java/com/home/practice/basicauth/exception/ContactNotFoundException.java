package com.home.practice.basicauth.exception;

public class ContactNotFoundException extends RuntimeException { 

    public ContactNotFoundException(String id) {
        super("The id '" + id + "' does not exist in our records");
    }
    
}

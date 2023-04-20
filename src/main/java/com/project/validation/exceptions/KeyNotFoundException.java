package com.project.validation.exceptions;

public class KeyNotFoundException extends Exception{

    public KeyNotFoundException(String key){
        super(key + "<- key value not found");
    }
}

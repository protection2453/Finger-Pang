package com.example.exception;

@SuppressWarnings("serial")
public class IdPasswordNotMatchingException extends RuntimeException{
    public IdPasswordNotMatchingException(){
        super();
    }
    public IdPasswordNotMatchingException(String message){
        super(message);
    }
}

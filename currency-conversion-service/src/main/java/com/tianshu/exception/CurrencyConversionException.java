package com.tianshu.exception;

public class CurrencyConversionException extends RuntimeException{
    public CurrencyConversionException(String msg){
        super(msg);
    }

    public CurrencyConversionException() {

    }
}

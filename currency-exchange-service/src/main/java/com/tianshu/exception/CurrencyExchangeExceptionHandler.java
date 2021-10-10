package com.tianshu.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
public class CurrencyExchangeExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllException(Exception ex){
        ResponseException exception = new ResponseException(new Date(), ex.getMessage());

        return new ResponseEntity<>(exception, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(CurrencyExchangeException.class)
    public final ResponseEntity<Object> handleCurrencyExchangeException(Exception ex){
        ResponseException exception = new ResponseException(new Date(), ex.getMessage());

        return new ResponseEntity<>(exception, HttpStatus.NOT_FOUND);
    }
}

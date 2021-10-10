package com.tianshu.service;

import com.tianshu.domain.CurrencyConversion;
import com.tianshu.domain.CurrencyConversionRequest;
import com.tianshu.exception.CurrencyConversionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyConversionService {

    @Autowired
    private CurrencyExchangeProxy proxy;

    public CurrencyConversion getCurrencyConversion(CurrencyConversionRequest request){
        CurrencyConversion currencyConversion = proxy.getCurrencyExchange(request);

        if(currencyConversion == null)
            throw new CurrencyConversionException();

        return currencyConversion;
    }

}

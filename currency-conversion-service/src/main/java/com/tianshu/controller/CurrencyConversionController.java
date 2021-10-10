package com.tianshu.controller;

import com.tianshu.domain.CurrencyConversion;
import com.tianshu.domain.CurrencyConversionRequest;
import com.tianshu.service.CurrencyExchangeProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

    @Autowired
    private CurrencyExchangeProxy proxy;

    @PostMapping("currency-conversion")
    public CurrencyConversion getCurrencyConversion(@Valid @RequestBody CurrencyConversionRequest request){
        CurrencyConversion currencyConversion = proxy.getCurrencyExchange(request);

        BigDecimal quantity = request.getQuantity();
        BigDecimal conversionMultiple = currencyConversion.getConversionMultiple();
        currencyConversion.setTotalCalculatedAmount(quantity.multiply(conversionMultiple));

        return currencyConversion;

    }
}

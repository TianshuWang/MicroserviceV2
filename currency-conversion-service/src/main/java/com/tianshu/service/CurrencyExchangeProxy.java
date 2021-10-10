package com.tianshu.service;

import com.tianshu.domain.CurrencyConversion;
import com.tianshu.domain.CurrencyConversionRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "currency-exchange-service", url = "localhost:8100")
public interface CurrencyExchangeProxy {

    @PostMapping("/currency-exchange")
    public CurrencyConversion getCurrencyExchange(@RequestBody CurrencyConversionRequest request);
}

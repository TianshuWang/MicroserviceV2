package com.tianshu.controller;

import com.tianshu.dao.CurrencyExchangeRepository;
import com.tianshu.domain.CurrencyExchange;
import com.tianshu.domain.CurrencyExchangeRequest;
import com.tianshu.service.CurrencyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @Autowired
    private CurrencyExchangeService currencyExchangeService;

    @PostMapping("/currency-exchange")
    public CurrencyExchange getCurrencyExchange(@RequestBody CurrencyExchangeRequest request){
        CurrencyExchange currencyExchange = currencyExchangeService.getCurrencyExchange(request);
        currencyExchange.setPort(environment.getProperty("server.port"));

        return currencyExchange;
    }
}

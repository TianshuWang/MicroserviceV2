package com.tianshu.service;

import com.tianshu.dao.CurrencyExchangeRepository;
import com.tianshu.domain.CurrencyExchange;
import com.tianshu.exception.CurrencyExchangeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeService {

    @Autowired
    private CurrencyExchangeRepository repository;

    public CurrencyExchange getCurrencyExchange(String from,String to){
        CurrencyExchange currencyExchange = repository.findByFromAndTo(from,to);

        if(currencyExchange == null)
            throw new CurrencyExchangeException("Unable To Find Data For " + from + " To " + to);

        return currencyExchange;
    }
}

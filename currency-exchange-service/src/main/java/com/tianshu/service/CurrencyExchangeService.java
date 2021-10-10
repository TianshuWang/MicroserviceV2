package com.tianshu.service;

import com.tianshu.dao.CurrencyExchangeRepository;
import com.tianshu.domain.CurrencyExchange;
import com.tianshu.domain.CurrencyExchangeRequest;
import com.tianshu.exception.CurrencyExchangeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeService {

    @Autowired
    private CurrencyExchangeRepository repository;

    public CurrencyExchange getCurrencyExchange(CurrencyExchangeRequest request){
        CurrencyExchange currencyExchange = repository.findByFromAndTo(request.getFrom(),request.getTo());

        if(currencyExchange == null)
            throw new CurrencyExchangeException("Unable To Find Data For " + request.getFrom() + " To " + request.getTo());

        return currencyExchange;
    }
}

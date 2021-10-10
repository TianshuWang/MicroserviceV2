package com.tianshu.dao;

import com.tianshu.domain.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

    public CurrencyExchange findByFromAndTo(String from,String to);
}
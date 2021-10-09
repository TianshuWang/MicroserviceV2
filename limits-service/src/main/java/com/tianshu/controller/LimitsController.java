package com.tianshu.controller;

import com.tianshu.config.LimitsConfig;
import com.tianshu.domain.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private LimitsConfig config;

    @GetMapping("/limits")
    public Limits getLimits(){
        return new Limits(config.getMax(),config.getMin());
    }
}

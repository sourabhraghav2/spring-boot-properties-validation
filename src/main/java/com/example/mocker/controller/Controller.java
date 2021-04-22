package com.example.mocker.controller;

import com.example.mocker.properties.ConsulConfigurationProperties;
import com.example.mocker.properties.GeneralProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    ConsulConfigurationProperties consulConfigurationProperties;
    @Autowired
    GeneralProperties generalProperties;


    @GetMapping("/test")
    public String test() {
        return " working! " + consulConfigurationProperties.getAge().getMaxAge() + " "+
        consulConfigurationProperties.getAge().getMinAge()+" <br> "+generalProperties.getSomething();
    }
}

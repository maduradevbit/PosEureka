package com.propertyfileaccessservice.propertyfileaccessservice.controller;


import com.propertyfileaccessservice.propertyfileaccessservice.beans.PropertyAccessBean;
import com.propertyfileaccessservice.propertyfileaccessservice.beans.PropertyAccessValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/access")
public class propertyfileAccessController {

    @Autowired
    PropertyAccessBean propertyAccessBean;

    @GetMapping("/accessproperty")
    public PropertyAccessValue accessPeopertyValue(){
        return new PropertyAccessValue(propertyAccessBean.getKey1(),
                propertyAccessBean.getKey2());
    }
}

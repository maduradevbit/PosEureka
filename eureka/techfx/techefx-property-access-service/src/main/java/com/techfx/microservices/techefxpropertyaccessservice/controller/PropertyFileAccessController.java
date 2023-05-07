package com.techfx.microservices.techefxpropertyaccessservice.controller;


import com.techfx.microservices.techefxpropertyaccessservice.beans.PropertyAccessBean;
import com.techfx.microservices.techefxpropertyaccessservice.beans.PropertyAccessValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/access")
public class PropertyFileAccessController {

    @Autowired
    PropertyAccessBean propertyAccessBean;

    @GetMapping("accessPropertyFile")
    public PropertyAccessValue accessPropertyFile(){
        return new PropertyAccessValue(propertyAccessBean.getName(),propertyAccessBean.getDescription());
    }
}

package com.customerregistor.CUSTOMER.controller;

import com.customerregistor.CUSTOMER.dto.CustomerDTO;
import com.customerregistor.CUSTOMER.service.CustomerService;
import com.customerregistor.CUSTOMER.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @PostMapping

    public ResponseEntity<StandardResponse> saveCustomer(@RequestBody CustomerDTO customerDTO){



        String massage1 =customerService.saveCustomer(customerDTO);

        ResponseEntity<StandardResponse> responseEntity = new ResponseEntity<StandardResponse>(
                new StandardResponse(201, "succesfull saved", massage1), HttpStatus.CREATED
        );



        return responseEntity;



    }
}

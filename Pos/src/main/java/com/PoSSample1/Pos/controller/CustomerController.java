package com.PoSSample1.Pos.controller;


import com.PoSSample1.Pos.dto.CustomerDTO;
import com.PoSSample1.Pos.dto.CustomerUpdateDTO;
import com.PoSSample1.Pos.service.CustomerService;
import com.PoSSample1.Pos.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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



    @PutMapping
    public CustomerDTO updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO){
        return customerService.updateCustomer(customerUpdateDTO);

    }


}

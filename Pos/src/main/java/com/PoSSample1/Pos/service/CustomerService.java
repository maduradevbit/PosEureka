package com.PoSSample1.Pos.service;

import com.PoSSample1.Pos.dto.CustomerDTO;
import com.PoSSample1.Pos.dto.CustomerUpdateDTO;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.RequestBody;


public interface CustomerService {
    public String saveCustomer(CustomerDTO customerDTO);

    CustomerDTO updateCustomer(CustomerUpdateDTO customerUpdateDTO);
}

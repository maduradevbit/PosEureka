package com.customerregistor.CUSTOMER.service.impl;

import com.customerregistor.CUSTOMER.dto.CustomerDTO;
import com.customerregistor.CUSTOMER.entity.Customer;
import com.customerregistor.CUSTOMER.repo.CustomerRepo;
import com.customerregistor.CUSTOMER.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;


    @Autowired
    private ModelMapper modelMapper;


    @Override
    public String saveCustomer(CustomerDTO customerDTO) {
        Customer customer = modelMapper.map(customerDTO, Customer.class);
        customerRepo.save(customer);

        return customerDTO + "";
    }
}

package com.PoSSample1.Pos.service.impl;

import com.PoSSample1.Pos.dto.CustomerDTO;
import com.PoSSample1.Pos.dto.CustomerUpdateDTO;
import com.PoSSample1.Pos.entity.Customer;
import com.PoSSample1.Pos.exception.NotFoundException;
import com.PoSSample1.Pos.repo.CustomerRepo;
import com.PoSSample1.Pos.service.CustomerService;
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
    Customer customer=modelMapper.map(customerDTO,Customer.class);
        customerRepo.save(customer);

        return customerDTO +"";
    }

    @Override
    public CustomerDTO updateCustomer(CustomerUpdateDTO customerUpdateDTO) {
        if (customerRepo.existsById(customerUpdateDTO.getCustomer_id())) {
            Customer customer = modelMapper.map(customerUpdateDTO, Customer.class);
            customerRepo.save(customer);

            CustomerDTO customerDTO = modelMapper.map(customer, CustomerDTO.class);
            return customerDTO;
        } else {
            throw new NotFoundException("no  program in here for update");
        }

    }
}

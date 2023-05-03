package com.orderregistor.Order.service.impl;

import com.orderregistor.Order.dto.OrderDTO;
import com.orderregistor.Order.entity.Order;
import com.orderregistor.Order.repo.OrderRepo;
import com.orderregistor.Order.service.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public String saveOrder(OrderDTO orderDTO) {
        Order order = modelMapper.map(orderDTO, Order.class);
        orderRepo.save(order);

        return orderDTO + "";
    }
}

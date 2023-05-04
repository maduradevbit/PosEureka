package com.orderregistor.Order.controller;

import com.orderregistor.Order.dto.OrderDTO;
import com.orderregistor.Order.service.OrderService;
import com.orderregistor.Order.utill.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("api/v1/order")
public class OrderController {
    @Autowired
    private OrderService orderService;



    @PostMapping("/save-Order")

    public ResponseEntity<StandardResponse> saveOrder(@RequestBody OrderDTO orderDTO){


        String massage1 =orderService.saveOrder(orderDTO);

        ResponseEntity<StandardResponse> responseEntity = new ResponseEntity<StandardResponse>(
                new StandardResponse(201, "succesfull saved", massage1), HttpStatus.CREATED
        );



        return responseEntity;




    }


}

package com.orderregistor.Order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class OrderDTO {


    private int order_id;
    private String OrderType;
    private String payment_Method;
    private String amount;
    private boolean activeStatus;
}

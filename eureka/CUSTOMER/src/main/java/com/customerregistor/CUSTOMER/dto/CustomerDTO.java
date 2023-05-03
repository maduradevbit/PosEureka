package com.customerregistor.CUSTOMER.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class CustomerDTO {

    private int customer_id;
    private String name;
    private String address;
    private String contact;
    private boolean activeStatus;
}

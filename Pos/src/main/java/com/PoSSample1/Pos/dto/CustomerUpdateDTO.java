package com.PoSSample1.Pos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class CustomerUpdateDTO {

    private int customer_id;
    private String name;
    private String address;
    private String contact;
    private boolean activeStatus;
}

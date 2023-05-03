package com.PoSSample1.Pos.dto;

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

public class CustomerDTO {

    private int customer_id;
    private String name;
    private String address;
    private String contact;
    private boolean activeStatus;
}

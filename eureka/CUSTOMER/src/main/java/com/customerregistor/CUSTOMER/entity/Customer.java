package com.customerregistor.CUSTOMER.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;

@Entity

@Table(name = "customers")


@TypeDefs(
        {
                @TypeDef(name = "json",typeClass = JsonType.class)
        }
)



@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Customer {

    @Id
    @Column(name = "customer_id",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customer_id;

    @Column(name = "name",length = 45,nullable = false)
    private String name;


    @Column(name = "address",length = 45,nullable = false)
    private String address;


    @Column(name = "contact",length = 45,nullable = false)
    private String contact;


    @Column(name="active_Status",columnDefinition = "TINYINT default 0")
    private boolean activeStatus;


}
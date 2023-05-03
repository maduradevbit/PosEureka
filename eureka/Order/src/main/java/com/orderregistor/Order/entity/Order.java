package com.orderregistor.Order.entity;


import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;

@Entity

@Table(name = "orders")


@TypeDefs(
        {
                @TypeDef(name = "json",typeClass = JsonType.class)
        }
)



@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Order {
    @Id
    @Column(name = "order_id",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int order_id;

    @Column(name = "OrderType",length = 45,nullable = false)
    private String OrderType;


    @Column(name = "payment_Method",length = 45,nullable = false)
    private String payment_Method;


    @Column(name = "amount",length = 45,nullable = false)
    private String amount;


    @Column(name="active_Status",columnDefinition = "TINYINT default 0")
    private boolean activeStatus;

}

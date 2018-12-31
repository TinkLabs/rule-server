package com.tinklabs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @program: ruleserver
 * @description:
 * @author: Landin
 * @create: 2018-12-30 23:57
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {
    private String orderId;
    private String name;
    private String email;
    private String loyalityCardId;
    private long orderAmount;
    private Date orderDate;
    private String status;
}

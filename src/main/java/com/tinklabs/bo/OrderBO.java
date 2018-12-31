package com.tinklabs.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: ruleserver
 * @description:
 * @author: Landin
 * @create: 2018-12-30 22:57
 **/
@Data
@NoArgsConstructor
public class OrderBO {
    private long memberID;
    private long orderAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd",timezone = "GMT+8")
    private Date orderDate;
}

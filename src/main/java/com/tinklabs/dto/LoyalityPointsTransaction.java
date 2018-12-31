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
 * @create: 2018-12-31 00:02
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LoyalityPointsTransaction {
    private String transactionId;
    private long amount;
    private long pointsEarned;
    private Date transactionDatetime;
    private long loyalityCardId;
}

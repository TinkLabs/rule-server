package com.tinklabs.service;

import com.tinklabs.dto.Member;
import com.tinklabs.dto.Order;

/**
 * @program: ruleserver
 * @description:
 * @author: Landin
 * @create: 2018-12-30 23:24
 **/
public interface LoyalityPointCalculatorService {
    public long calculate(Member member, Order order);
}

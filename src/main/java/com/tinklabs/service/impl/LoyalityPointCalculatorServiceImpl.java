package com.tinklabs.service.impl;

import com.tinklabs.dto.Member;
import com.tinklabs.dto.Order;
import com.tinklabs.service.LoyalityPointCalculatorService;
import com.tinklabs.service.LoyalityRuleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: ruleserver
 * @description:
 * @author: Landin
 * @create: 2018-12-30 23:24
 **/
@Slf4j
@Service
public class LoyalityPointCalculatorServiceImpl implements LoyalityPointCalculatorService {
    @Autowired
    private LoyalityRuleService loyalityRuleService;

    public long calculate(Member member, Order order) {
        long loyalityPoints = 0;
        log.info("memberId: "+member.getMemberId()+" firstNanme: "+member.getMemberFirstName());
        loyalityPoints = Math.round(order.getOrderAmount() * loyalityRuleService.queryPercentageByRule(order));
        log.info("Loyality Points Calculated for Order: "+order.getOrderId()+" amount: "+order.getOrderAmount()+ " Points: "+loyalityPoints);
        return loyalityPoints;
    }
}

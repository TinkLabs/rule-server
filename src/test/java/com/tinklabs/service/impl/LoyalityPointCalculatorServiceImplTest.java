package com.tinklabs.service.impl;

import cn.hutool.core.date.DateTime;
import com.tinklabs.RuleserverApplication;
import com.tinklabs.dto.Member;
import com.tinklabs.dto.Order;
import com.tinklabs.service.LoyalityPointCalculatorService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: ruleserver
 * @description:
 * @author: Landin
 * @create: 2018-12-31 15:36
 **/
@RunWith(SpringRunner.class )
@SpringBootTest(classes = RuleserverApplication.class ,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class LoyalityPointCalculatorServiceImplTest {
    @Autowired
    private LoyalityPointCalculatorService loyalityPointCalculatorService;
    @Test
    public void testcalculate() {
        Order order = new Order();
        order.setOrderDate(new DateTime());
        order.setOrderAmount(500);
        Member member = new Member();
        member.setMemberId(100001l);
        long earnedPoints = loyalityPointCalculatorService.calculate(member,order);
        log.info("the order 's amount  is :" + order.getOrderAmount());
        log.info("the order 's earned points  is :" + earnedPoints);
    }
}

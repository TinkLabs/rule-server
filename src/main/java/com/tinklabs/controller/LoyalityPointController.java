package com.tinklabs.controller;

import cn.hutool.core.date.DateTime;
import com.tinklabs.bo.OrderBO;
import com.tinklabs.corecommonbase.response.RestResponse;
import com.tinklabs.dto.Member;
import com.tinklabs.dto.Order;
import com.tinklabs.entity.LoyalityRule;
import com.tinklabs.service.LoyalityPointCalculatorService;
import com.tinklabs.service.LoyalityRuleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @program: ruleserver
 * @description:
 * @author: Landin
 * @create: 2018-12-30 22:34
 **/
@RestController
@Slf4j
@RequestMapping("/loyalityPoint")
public class LoyalityPointController extends BaseController {
    @Autowired
    private LoyalityRuleService loyalityRuleService;
    @Autowired
    private LoyalityPointCalculatorService loyalityPointCalculatorService;
    @PostMapping(value = "/queryEstimatedEarnedPoints")
    public RestResponse<Long> queryEstimatedEarnedPoints(@Valid @RequestBody OrderBO orderBO){

        RestResponse<Long> restResponse = new RestResponse<>();
        Order order = new Order();
        order.setOrderDate(orderBO.getOrderDate());
        order.setOrderAmount(orderBO.getOrderAmount());
        Member member = new Member();
        member.setMemberId(orderBO.getMemberID());
        restResponse.setData(loyalityPointCalculatorService.calculate(member,order));

        return restResponse;

    }
}

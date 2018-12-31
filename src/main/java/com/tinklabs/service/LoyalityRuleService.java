package com.tinklabs.service;

import com.baomidou.mybatisplus.service.IService;
import com.tinklabs.dto.Order;
import com.tinklabs.entity.LoyalityRule;
import org.apache.ibatis.annotations.Param;

/**
 * @program: ruleserver
 * @description:
 * @author: Landin
 * @create: 2018-12-30 16:57
 **/
public interface LoyalityRuleService extends IService<LoyalityRule> {
    public float queryPercentageByRule(@Param("order") Order order);
}

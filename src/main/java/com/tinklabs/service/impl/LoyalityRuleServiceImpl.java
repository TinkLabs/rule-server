package com.tinklabs.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tinklabs.dto.Order;
import com.tinklabs.entity.LoyalityRule;
import com.tinklabs.mapper.LoyalityRuleMapper;
import com.tinklabs.service.LoyalityRuleService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @program: ruleserver
 * @description:
 * @author: Landin
 * @create: 2018-12-30 16:59
 **/
@Service
public class LoyalityRuleServiceImpl extends ServiceImpl<LoyalityRuleMapper, LoyalityRule> implements LoyalityRuleService {
    public float queryPercentageByRule(@Param("order") Order order){
        return baseMapper.queryPercentageByRule(order);
    }
}

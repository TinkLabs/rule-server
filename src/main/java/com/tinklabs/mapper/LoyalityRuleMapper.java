package com.tinklabs.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tinklabs.dto.Order;
import com.tinklabs.entity.LoyalityRule;
import org.apache.ibatis.annotations.Param;

/**
 * @program: ruleserver
 * @description:
 * @author: Landin
 * @create: 2018-12-30 16:53
 **/
public interface LoyalityRuleMapper extends BaseMapper<LoyalityRule> {
    public float queryPercentageByRule(@Param("order") Order order);
}

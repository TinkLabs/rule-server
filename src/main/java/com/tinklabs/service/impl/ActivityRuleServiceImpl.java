package com.tinklabs.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tinklabs.mapper.ActivityRuleMapper;
import com.tinklabs.entity.ActivityRule;
import com.tinklabs.service.ActivityRuleService;
import org.springframework.stereotype.Service;

@Service
public class ActivityRuleServiceImpl extends ServiceImpl<ActivityRuleMapper, ActivityRule> implements ActivityRuleService {
}

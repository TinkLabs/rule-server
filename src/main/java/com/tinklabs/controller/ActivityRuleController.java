package com.tinklabs.controller;

import cn.hutool.core.date.DateTime;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.tinklabs.bo.LoyalityRuleBO;
import com.tinklabs.corecommonbase.exception.BusinessException;
import com.tinklabs.entity.ActivityRule;
import com.tinklabs.entity.LoyalityRule;
import com.tinklabs.service.ActivityRuleService;
import com.tinklabs.service.LoyalityRuleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tinklabs.corecommonbase.response.RestResponse;

import javax.validation.Valid;


/**
 * @program: ruleserver
 * @description:
 * @author: Landin
 * @create: 2018-12-30 22:34
 **/
@RestController
@Slf4j
@RequestMapping("/rule")
public class ActivityRuleController extends BaseController{

    @Autowired
    private ActivityRuleService activityRuleService;
    @Autowired
    private LoyalityRuleService loyalityRuleService;


    @ResponseBody
    @RequestMapping("/hello")
    public RestResponse<String> hello() throws BusinessException {
        log.info("test trace id {}");
        return new RestResponse<>();
    }
    @GetMapping("/activityRule")
    public RestResponse<Page<ActivityRule>> getActivityRuleList(Page<ActivityRule> page){

        RestResponse<Page<ActivityRule>> result = new RestResponse<>();
        result.setData(activityRuleService.selectPage(page));
        return result;
    }
    @PostMapping(value = "/addLoyalityRule")
    public RestResponse<Boolean> addLoyalityRule(@Valid @RequestBody LoyalityRuleBO loyalityRuleBO){

        RestResponse<Boolean> restResponse = new RestResponse<>();
        LoyalityRule loyalityRule = new LoyalityRule();
        loyalityRule.setEffectiveBeginTime(loyalityRuleBO.getEffectiveBeginTime());
        loyalityRule.setEffectiveEndTime(loyalityRuleBO.getEffectiveEndTime());
        loyalityRule.setPercentage(loyalityRuleBO.getPercentage());
        loyalityRule.setPriority(loyalityRuleBO.getPriority());
        loyalityRule.setIsActive(loyalityRuleBO.getIsActive());
        loyalityRule.setCreateTime(new DateTime());

        restResponse.setData(loyalityRuleService.insert(loyalityRule));

        return restResponse;

    }
    @PutMapping(value = "/updateLoyalityRule")
    public RestResponse<Boolean> updateLoyalityRule(@Valid @RequestBody LoyalityRuleBO loyalityRuleBO){

        RestResponse<Boolean> restResponse = new RestResponse<>();
        LoyalityRule loyalityRule = new LoyalityRule();
        loyalityRule.setId(loyalityRuleBO.getId());
        loyalityRule.setEffectiveBeginTime(loyalityRuleBO.getEffectiveBeginTime());
        loyalityRule.setEffectiveEndTime(loyalityRuleBO.getEffectiveEndTime());
        loyalityRule.setPercentage(loyalityRuleBO.getPercentage());
        loyalityRule.setPriority(loyalityRuleBO.getPriority());
        loyalityRule.setIsActive(loyalityRuleBO.getIsActive());
        loyalityRule.setCreateTime(new DateTime());
        Wrapper<LoyalityRule> loyalityRuleWrapper = new EntityWrapper<LoyalityRule>();
        loyalityRuleWrapper.eq("id", loyalityRuleBO.getId());
        //loyalityRuleWrapper.eq("create_by", "admin");
        restResponse.setData(loyalityRuleService.update(loyalityRule,loyalityRuleWrapper));
        return restResponse;

    }
    @GetMapping("/queryLoyalityRuleList")
    public RestResponse<Page<LoyalityRule>> queryLoyalityRuleList(Page<LoyalityRule> page){

        RestResponse<Page<LoyalityRule>> result = new RestResponse<>();
        result.setData(loyalityRuleService.selectPage(page));
        return result;
    }
    @DeleteMapping(value = "/deleteLoyalityRule/{id}")
    public RestResponse<Boolean> deleteLoyalityRule(@PathVariable long id){

        RestResponse<Boolean> restResponse = new RestResponse<>();

        restResponse.setData(loyalityRuleService.deleteById(id));

        return restResponse;

    }

}

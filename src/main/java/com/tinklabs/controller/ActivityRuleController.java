package com.tinklabs.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.tinklabs.corecommonbase.exception.BusinessException;
import com.tinklabs.entity.ActivityRule;
import com.tinklabs.service.ActivityRuleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.tinklabs.corecommonbase.response.RestResponse;
/*
*
*
* */
@RestController
@Slf4j
@RequestMapping("/rule")
public class ActivityRuleController extends BaseController{

    @Autowired
    private ActivityRuleService activityRuleService;


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
}

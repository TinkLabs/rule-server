package com.tinklabs.controller;

import com.tinklabs.common.LocationCodeEnum;
import com.tinklabs.corecommonbase.exception.BusinessException;
import com.tinklabs.corecommonbase.response.RestResponse;
import com.tinklabs.service.CityService;
import com.tinklabs.vo.CityVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @description:
 * @author: Landin
 * @date: 2019-01-15
 **/
@RestController
@Slf4j
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;
    /**
    * description:
    * @return com.tinklabs.corecommonbase.response.RestResponse<java.util.List<com.tinklabs.vo.CityVo>>
    * @param localeCode, countryCode
    * @author Landin
    * @date 2019/1/16
    */
    @ResponseBody
    @GetMapping("/queryCityList")
    public RestResponse<List<CityVo>> queryCityList(String localeCode, String countryCode){
        if(StringUtils.isBlank(localeCode)){
            throw new BusinessException(LocationCodeEnum.LOCALE_CODE_EMPTY.getCode(),LocationCodeEnum.LOCALE_CODE_EMPTY.getMessage());
        }
        if(StringUtils.isBlank(countryCode)){
            throw new BusinessException(LocationCodeEnum.COUNTRY_CODE_EMPTY.getCode(),LocationCodeEnum.COUNTRY_CODE_EMPTY.getMessage());
        }
        RestResponse<List<CityVo>> result = new RestResponse<>();
        List<CityVo> cityList = cityService.queryCityList(localeCode, countryCode);
        result.setData(cityList);
        return result;
    }
}

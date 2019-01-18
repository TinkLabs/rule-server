package com.tinklabs.controller;

import com.tinklabs.common.LocationCodeEnum;
import com.tinklabs.corecommonbase.exception.BusinessException;
import com.tinklabs.corecommonbase.response.RestResponse;
import com.tinklabs.service.CountryService;
import com.tinklabs.vo.CountryVo;
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
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryService countryService;
    @ResponseBody
    @RequestMapping("/hello")
    public RestResponse<String> hello() throws BusinessException {
        RestResponse<String> result = new RestResponse<>();
        log.info("test trace id {}");
        result.setData("success.");
        return result;
    }
    /**
    * description:
    * @return com.tinklabs.corecommonbase.response.RestResponse<java.util.List<com.tinklabs.vo.CountryVo>>
    * @param localeCode
    * @author Landin
    * @date 2019/1/16
    */
    @ResponseBody
    @GetMapping("/queryCountryList")
    public RestResponse<List<CountryVo>> queryCountryList(String localeCode){
        if(StringUtils.isBlank(localeCode)){
            throw new BusinessException(LocationCodeEnum.LOCALE_CODE_EMPTY.getCode(),LocationCodeEnum.LOCALE_CODE_EMPTY.getMessage());
        }
        RestResponse<List<CountryVo>> result = new RestResponse<>();
        List<CountryVo> countryList = countryService.queryCountryList(localeCode);
        result.setData(countryList);
        return result;
    }
}

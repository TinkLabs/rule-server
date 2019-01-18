package com.tinklabs.service;

import com.tinklabs.vo.CountryVo;
import java.util.List;

/**
* description:
* @author Landin
* @date 2019/1/15
*/
public interface CountryService {
    /**
    * description:
    * @return java.util.List<com.tinklabs.vo.CountryVo>
    * @param localeCode
    * @author Landin
    * @date 2019/1/16
    */
    List<CountryVo> queryCountryList(String localeCode);
}

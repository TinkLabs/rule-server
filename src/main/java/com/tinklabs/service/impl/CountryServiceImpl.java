package com.tinklabs.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tinklabs.entity.Country;
import com.tinklabs.mapper.CountryMapper;
import com.tinklabs.service.CountryService;
import com.tinklabs.vo.CountryVo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: Landin
 * @date: 2019-01-15
 **/
@Service
public class CountryServiceImpl extends ServiceImpl<CountryMapper, Country> implements CountryService {
    @Resource
    private CountryMapper countryMapper;
    @Override
    public List<CountryVo> queryCountryList(String localeCode) {
//        Wrapper<Country> countryWrapper = new EntityWrapper<Country>();
//        countryWrapper.eq("locale_code",localeCode);
        return countryMapper.queryCountryList(localeCode);
    }
}

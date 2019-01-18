package com.tinklabs.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tinklabs.entity.City;
import com.tinklabs.mapper.CityMapper;
import com.tinklabs.service.CityService;
import com.tinklabs.vo.CityVo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: Landin
 * @date: 2019-01-15
 **/
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements CityService {
    @Resource
    private CityMapper cityMapper;

    @Override
    public List<CityVo> queryCityList(String localeCode, String countryCode) {
        return cityMapper.queryCityList(localeCode, countryCode);
    }

}

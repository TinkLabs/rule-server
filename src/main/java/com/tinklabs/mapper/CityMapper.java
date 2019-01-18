package com.tinklabs.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tinklabs.entity.City;
import com.tinklabs.vo.CityVo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @description:
 * @author: Landin
 * @date: 2019-01-16
 **/
public interface CityMapper extends BaseMapper<City> {
    List<CityVo> queryCityList(@Param("localeCode") String localeCode, @Param("countryCode")String countryCode);
}

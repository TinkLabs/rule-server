package com.tinklabs.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @description:
 * @author: Landin
 * @date: 2019-01-16
 **/
@Data
@NoArgsConstructor
@ToString
public class CityVo {
    private Integer geonameId;
    private String localeCode;
    private String continentCode;
    private String continentName;
    private String countryCode;
    private String countryName;
    private String subdivisionISOCode;
    private String subdivision1Name;
    private String subdivision2ISOCode;
    private String subdivision2Name;
    private String cityName;
    private String metroCode;
    private String timeZone;
}

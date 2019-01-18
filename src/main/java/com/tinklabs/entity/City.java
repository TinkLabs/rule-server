package com.tinklabs.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * @description:
 * @author: Landin
 * @date: 2019-01-16
 **/
@TableName("city_full")
public class City extends Model<City> {
    private static final long serialVersionUID = 1L;

    @TableId(value = "geoname_id")
    private Integer geonameId;
    @TableField("locale_code")
    private String localeCode;
    @TableField("continent_code")
    private String continentCode;
    @TableField("continent_name")
    private String continentName;
    @TableField("country_iso_Code")
    private String countryCode;
    @TableField("country_name")
    private String countryName;
    @TableField("subdivision_1_iso_code")
    private String subdivisionISOCode;
    @TableField("subdivision_1_name")
    private String subdivision1Name;
    @TableField("subdivision_2_iso_code")
    private String subdivision2ISOCode;
    @TableField("subdivision_2_name")
    private String subdivision2Name;
    @TableField("city_name")
    private String cityName;
    @TableField("metro_code")
    private String metroCode;
    @TableField("time_zone")
    private String timeZone;

    public Integer getGeonameId() {
        return geonameId;
    }

    public void setGeonameId(Integer geonameId) {
        this.geonameId = geonameId;
    }

    public String getLocaleCode() {
        return localeCode;
    }

    public void setLocaleCode(String localeCode) {
        this.localeCode = localeCode;
    }

    public String getContinentCode() {
        return continentCode;
    }

    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getSubdivisionISOCode() {
        return subdivisionISOCode;
    }

    public void setSubdivisionISOCode(String subdivisionISOCode) {
        this.subdivisionISOCode = subdivisionISOCode;
    }

    public String getSubdivision1Name() {
        return subdivision1Name;
    }

    public void setSubdivision1Name(String subdivision1Name) {
        this.subdivision1Name = subdivision1Name;
    }

    public String getSubdivision2ISOCode() {
        return subdivision2ISOCode;
    }

    public void setSubdivision2ISOCode(String subdivision2ISOCode) {
        this.subdivision2ISOCode = subdivision2ISOCode;
    }

    public String getSubdivision2Name() {
        return subdivision2Name;
    }

    public void setSubdivision2Name(String subdivision2Name) {
        this.subdivision2Name = subdivision2Name;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getMetroCode() {
        return metroCode;
    }

    public void setMetroCode(String metroCode) {
        this.metroCode = metroCode;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    protected Serializable pkVal() {
        return this.geonameId;
    }
}

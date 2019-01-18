package com.tinklabs.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * @description:
 * @author: Landin
 * @date: 2019-01-15
 **/
@TableName("country_full")
public class Country extends Model<Country> {
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

    public String getcountryCode() {
        return countryCode;
    }

    public void setcountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    protected Serializable pkVal() {
            return this.geonameId;
    }
}

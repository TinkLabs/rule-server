package com.tinklabs.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @description:
 * @author: Landin
 * @date: 2019-01-15
 **/
@Data
@NoArgsConstructor
@ToString
public class CurrencyVo {
    private String localeCode;
    private String currencyCode;
    private String currencyName;
    private String symbol;
    private String countryCode;
}

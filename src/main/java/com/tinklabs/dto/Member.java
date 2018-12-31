package com.tinklabs.dto;

import com.baomidou.mybatisplus.annotations.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @program: ruleserver
 * @description:
 * @author: Landin
 * @create: 2018-12-30 23:43
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Member {
    private Long memberId;
    private String memberFirstName;
    private String memberSurnameName;
    private String memberMiddleName;
    private Date memberSignupDate;
    private Date memberDateOfBirthDate;
    private Long occupationId;
    private Long countryOfResidenceId;
    private String memberTitle;
    private String memberGender;
    private String locale;
    private String currencyCodeId;
}

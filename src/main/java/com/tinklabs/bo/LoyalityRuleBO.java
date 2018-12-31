package com.tinklabs.bo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @program: ruleserver
 * @description:
 * @author: Landin
 * @create: 2018-12-30 19:41
 **/
@Data
@NoArgsConstructor
public class LoyalityRuleBO {
    private Long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd",timezone = "GMT+8")
    private Date effectiveBeginTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd",timezone = "GMT+8")
    private Date effectiveEndTime;
    @NotNull(message = "percentage not empty")
    private float percentage;
    private int priority;
    private String isActive;
    private String createBy;
    private Date createTime;
    private String updateBy;
    private Date updateTime;
}

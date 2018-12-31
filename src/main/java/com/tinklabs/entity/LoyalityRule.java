package com.tinklabs.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;
import java.util.Date;

/**
 * @program: ruleserver
 * @description:
 * @author: Landin
 * @create: 2018-12-30 16:32
 **/
public class LoyalityRule extends Model<LoyalityRule> {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    @TableField("effective_begin_time")
    private Date effectiveBeginTime;
    @TableField("effective_end_time")
    private Date effectiveEndTime;
    @TableField("percentage")
    private float percentage;
    @TableField("priority")
    private int priority;
    @TableField("is_active")
    private String isActive;
    @TableField("create_by")
    private String createBy;
    @TableField("create_time")
    private Date createTime;
    @TableField("update_by")
    private String updateBy;
    @TableField("update_time")
    private Date updateTime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getEffectiveBeginTime() {
        return effectiveBeginTime;
    }

    public void setEffectiveBeginTime(Date effectiveBeginTime) {
        this.effectiveBeginTime = effectiveBeginTime;
    }

    public Date getEffectiveEndTime() {
        return effectiveEndTime;
    }

    public void setEffectiveEndTime(Date effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}

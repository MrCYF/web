package com.fan.formal.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName("CRM_SCORE")
public class CrmScore {

    /**
     * 客户编码
     */
    @TableId(value = "PID", type = IdType.INPUT)
    private BigDecimal pid;

    /**
     * 业务类型。电子礼券：DZLQ
     */
    private String service;

    /**
     * 可用积分值
     */
    private BigDecimal score;

}

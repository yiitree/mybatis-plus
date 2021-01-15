package com.demo.mybatisplus.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author zr
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_aaa")
public class Aaa implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名
     */
    @JsonIgnore
    private String varchar1;

    /**
     * 年龄
     */
    private Integer int1;

    /**
     * 邮箱
     */
    private Long bigint1;

    /**
     * datetime
     */
    private LocalDateTime datatime1;

    /**
     * 时间戳
     */
    private LocalDateTime timestamp1;

    /**
     * 金钱
     */
    private BigDecimal decimal;

    private String char1;


}

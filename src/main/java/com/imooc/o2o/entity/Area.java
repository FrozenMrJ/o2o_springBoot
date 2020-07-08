package com.imooc.o2o.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 区域信息
 */
@Setter
@Getter
public class Area {
    // 主键ID
    private Integer areaId;
    // 名称
    private String areaName;
    // 权重，越大越排前显示
    private Integer priority;
    // 创建时间
    private Date createTime;
    // 更新时间
    private Date lastEditTime;
}

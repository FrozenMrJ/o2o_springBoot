package com.imooc.o2o.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 商品详情图实体类
 */
@Setter
@Getter
public class ProductImg {
    // 主键ID
    private Long productImgId;
    // 图片地址
    private String imgAddr;
    // 图片简介
    private String imgDesc;
    // 权重，越大越排前显示
    private Integer priority;
    // 创建时间
    private Date createTime;
    // 标明是属于哪个商品的图片
    private Long productId;
}

package com.imooc.o2o.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @ClassName ProductSellDaily
 * @Description 顾客消费的商品映射
 * @Author jinym
 * @Date 2020/7/8
 **/
@Getter
@Setter
public class ProductSellDaily {
    // 主键Id
    private Long productSellDailyId;
    // 哪天的销量，精确到天
    private Date createTime;
    // 销量
    private Integer total;
    // 商品信息实体类
    private Product product;
    // 店铺信息实体类
    private Shop shop;
}

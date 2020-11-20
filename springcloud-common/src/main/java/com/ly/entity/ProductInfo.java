package com.ly.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author White Liu
 * @Description 详情
 * @Date 2020/9/30 10:19
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductInfo {

    private Integer productId;//商品ID

    private String productName;//商品名

    private Double price;//商品价格

    private Integer stock;//库存


}

package com.ly.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author White Liu
 * @Description 详情
 * @Date 2020/9/30 10:14
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo {
    private Integer orderId;//订单ID

    private Integer uid;//用户ID
    private String uname;//用户名

    private Integer pid;//商品ID
    private String pname;//商品名称
    private Double pprice;//商品价格
    private Integer number;//购买数量
}

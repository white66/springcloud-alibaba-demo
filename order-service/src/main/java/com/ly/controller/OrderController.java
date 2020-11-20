package com.ly.controller;

import com.ly.entity.OrderInfo;
import com.ly.entity.ProductInfo;
import com.ly.service.OrderService;
import com.ly.service.ProductServiceFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author White Liu
 * @Description 详情
 * @Date 2020/9/29 15:27
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/order")
@Slf4j
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    ProductServiceFeign productService;
    @GetMapping("/createOrder/{productId}")
    public OrderInfo createOrder(@PathVariable("productId") Integer productId){
        log.info("接收到{}号商品的下单请求，查询商品微服务查询此商品信息",productId);
        //调用商品微服务，查询商品信息
        ProductInfo productInfo = productService.getProduct(productId);
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setPid(productInfo.getProductId());
        orderInfo.setPname(productInfo.getProductName());
        orderInfo.setPprice(productInfo.getPrice());
        return orderInfo;
    }
}

package com.ly.controller;

import com.alibaba.fastjson.JSON;
import com.ly.entity.OrderInfo;
import com.ly.entity.ProductInfo;
import com.ly.service.ProductService;
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
@RequestMapping("/api/product")
@Slf4j
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/{productId}")
    public ProductInfo getProduct(@PathVariable("productId") Integer productId){
        log.info("接收到OrderService的{}号商品的请求，查询商品微服务查询此商品信息",productId);
        ProductInfo productInfo = productService.getProduct(productId);
        log.info("查询到{}的商品信息", JSON.toJSONString(productInfo));
        return productInfo;
    }
}

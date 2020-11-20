package com.ly.service;

import com.ly.entity.ProductInfo;
import com.ly.service.fallback.ProductServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author White Liu
 * @Description 详情
 * @Date 2020/9/30 11:29
 * @Version 1.0
 */
@FeignClient(value = "product-service",fallbackFactory = ProductServiceFallback.class)
public interface ProductServiceFeign {

    @GetMapping("/api/product/{productId}")
    ProductInfo getProduct(@PathVariable("productId") Integer productId);
}

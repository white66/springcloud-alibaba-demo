package com.ly.service;

import com.ly.entity.ProductInfo;
import com.ly.entity.UserInfo;

import java.util.List;

/**
 * @Author White Liu
 * @Description 详情
 * @Date 2020/9/29 15:36
 * @Version 1.0
 */
public interface ProductService {
    ProductInfo getProduct(Integer productId);
}

package com.ly.service.impl;

import com.ly.entity.ProductInfo;
import com.ly.entity.UserInfo;
import com.ly.repository.ProductMapper;
import com.ly.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author White Liu
 * @Description 详情
 * @Date 2020/9/29 15:37
 * @Version 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;

    public ProductInfo getProduct(Integer productId) {
        ProductInfo productInfo = productMapper.getProduct(productId);
        return productInfo;
    }
}

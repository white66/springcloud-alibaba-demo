package com.ly.repository;

import com.ly.entity.ProductInfo;
import org.springframework.stereotype.Repository;


/**
 * @Author White Liu
 * @Description 详情
 * @Date 2020/9/29 15:38
 * @Version 1.0
 */
@Repository
public interface ProductMapper {
    ProductInfo getProduct(Integer productId);
}

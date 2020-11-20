package com.ly.service.fallback;

import com.ly.entity.ProductInfo;
import com.ly.service.ProductServiceFeign;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author White Liu
 * @Description 详情
 * @Date 2020/10/20 11:11
 * @Version 1.0
 */
@Component
@Slf4j
public class ProductServiceFallback implements FallbackFactory<ProductServiceFeign> {
    public ProductServiceFeign create(Throwable throwable) {
        return new ProductServiceFeign() {
            public ProductInfo getProduct(Integer productId) {
                log.error("服务容错");
                return new ProductInfo(-100, "没有该商品", 0.0, 0);
            }
        };
    }
}

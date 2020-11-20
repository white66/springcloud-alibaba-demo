package com.ly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author White Liu
 * @Description 详情
 * @Date 2020/9/28 10:16
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.ly.repository")
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);
    }
}

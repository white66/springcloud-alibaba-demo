package com.ly.repository;

import com.ly.entity.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author White Liu
 * @Description 详情
 * @Date 2020/9/29 15:38
 * @Version 1.0
 */
@Repository
public interface OrderMapper {
    List<UserInfo> userList();
}

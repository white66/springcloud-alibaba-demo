package com.ly.service.impl;

import com.ly.entity.UserInfo;
import com.ly.repository.UserMapper;
import com.ly.service.UserService;
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
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    public List<UserInfo> userList() {
        List<UserInfo> userInfoList = userMapper.userList();
        return userInfoList;
    }
}

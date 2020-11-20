package com.ly.controller;

import com.ly.entity.UserInfo;
import com.ly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author White Liu
 * @Description 详情
 * @Date 2020/9/29 15:27
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/userList")
    public List<UserInfo> userList(){
        List<UserInfo> userInfoList = userService.userList();
        return userInfoList;
    }
}

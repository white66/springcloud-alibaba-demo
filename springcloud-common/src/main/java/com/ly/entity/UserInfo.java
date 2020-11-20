package com.ly.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author White Liu
 * @Description 详情
 * @Date 2020/9/28 10:35
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo implements Serializable {
    private Integer userId;
    private String userName;
    private String passWord;
    private String email;
    private Integer phone;
}

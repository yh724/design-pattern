package com.jiayuan.proxy.staticProxy.impl;

import com.jiayuan.proxy.staticProxy.UserService;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/7 17:15<br/>
 */
public class UserServiceProxy implements UserService {

    private final UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public int delete(int userId) {
        System.out.println("开启事务");
        int delete = userService.delete(userId);
        System.out.println("提交事务");
        return delete;
    }
}

package com.jiayuan.proxy.staticProxy.impl;

import com.jiayuan.proxy.staticProxy.UserService;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/7 17:14<br/>
 */
public class UserServiceImpl implements UserService {
    @Override
    public int delete(int userId) {
        System.out.println("delete userId: " + userId);
        return 1;
    }
}

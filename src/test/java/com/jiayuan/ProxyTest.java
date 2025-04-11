package com.jiayuan;

import com.jiayuan.proxy.dynamicProxy.cglibProxy.CglibProxyFactory;
import com.jiayuan.proxy.dynamicProxy.jdkProxy.ProxyFactory;
import com.jiayuan.proxy.staticProxy.UserService;
import com.jiayuan.proxy.staticProxy.impl.UserServiceImpl;
import com.jiayuan.proxy.staticProxy.impl.UserServiceProxy;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/7 17:16<br/>
 */
public class ProxyTest {
    @Test
    public void testStandProxy() {
        // 1. 创建目标对象
        UserService userService = new UserServiceImpl();
        // 2. 创建代理对象
        UserService proxy = new UserServiceProxy(userService);
        // 3. 调用代理对象的方法
        proxy.delete(1);
    }

    @Test
    public void testJdkProxy() {
        UserService userService = new UserServiceImpl();
        ProxyFactory proxyFactory = new ProxyFactory(userService);
        int result = ((UserService) proxyFactory.getProxy()).delete(1);
        System.out.println("result: " + result);
    }

    @Test
    public void testCglibProxy() {
        UserService userService = new UserServiceImpl();
        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory(userService);
        int result = ((UserService) cglibProxyFactory.getProxy()).delete(1);
        System.out.println("result: " + result);
    }

    @Test
    public void test() {
        System.out.println(TimeUnit.MINUTES.toMillis(1));
    }
}

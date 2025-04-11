package com.jiayuan.proxy.dynamicProxy.jdkProxy;

import java.lang.reflect.Proxy;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/7 17:40<br/>
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("do before...");
            Object result = method.invoke(target, args);
            System.out.println("do after...");
            return result;
        });
    }
}

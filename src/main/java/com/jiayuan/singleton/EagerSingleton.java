package com.jiayuan.singleton;

/**
 * @author Jy-Jk<br/>
 * @description: 饿汉式单例模式<br />
 * @date: 2025/4/1 19:18<br/>
 */
public class EagerSingleton {

    private final static EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    public void func() {
        System.out.println("eager-singleton.");
    }
}

package com.jiayuan.singleton;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/1 19:51<br/>
 */
public class InnerSingleton {
    private InnerSingleton() {}

    private static class SingletonHolder {
        private static final InnerSingleton INSTANCE = new InnerSingleton();
    }

    public static InnerSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void func() {
        System.out.println("inner-singleton.");
    }

}

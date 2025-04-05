package com.jiayuan.singleton;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/1 19:57<br/>
 */
public enum EnumSingleton {
    INSTANCE;

    public void func() {
        System.out.println("enum-singleton.");
    }

}

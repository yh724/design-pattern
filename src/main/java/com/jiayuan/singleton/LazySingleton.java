package com.jiayuan.singleton;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/1 19:26<br/>
 */
public class LazySingleton {
    private static volatile LazySingleton INSTANCE;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }

    public void func() {
        System.out.println("lazy-singleton.");
    }
}

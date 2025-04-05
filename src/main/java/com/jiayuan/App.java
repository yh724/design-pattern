package com.jiayuan;

import com.jiayuan.singleton.EagerSingleton;
import com.jiayuan.singleton.EnumSingleton;
import com.jiayuan.singleton.InnerSingleton;
import com.jiayuan.singleton.LazySingleton;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/1 19:19<br/>
 */
public class App {
    public static void main(String[] args) {
        EagerSingleton instance = EagerSingleton.getInstance();
        instance.func();

        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.func();

        InnerSingleton innerSingleton = InnerSingleton.getInstance();
        innerSingleton.func();

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.func();
    }
}

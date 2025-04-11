package com.jiayuan.observer;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/10 17:40<br/>
 */
public class Body implements Observer{
    @Override
    public void update(Integer data) {
        if (data < 10) {
            System.out.println("温度<10°C, 冷死了。");
            return;
        }
        if (data > 30) {
            System.out.println("温度>30°C, 热死了");
            return;
        }
    }
}

package com.jiayuan.observer;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/10 17:38<br/>
 */
public class Reporter implements Observer {
    @Override
    public void update(Integer data) {
        System.out.println("温度发生变化, 当前温度：" + data + "°C");
    }
}

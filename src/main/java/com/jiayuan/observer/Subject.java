package com.jiayuan.observer;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/10 17:25<br/>
 */
public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notice(Integer data);

}

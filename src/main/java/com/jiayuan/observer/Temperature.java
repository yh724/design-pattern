package com.jiayuan.observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/10 17:35<br/>
 */
public class Temperature implements Subject{

    private List<Observer> observers = Lists.newArrayList();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notice(Integer data) {
        for (Observer ob : observers) {
            ob.update(data);
        }
    }
}

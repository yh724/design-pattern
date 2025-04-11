package com.jiayuan.adapter;

import java.util.concurrent.Callable;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/10 14:31<br/>
 */
public class ConsumerTask implements Callable<Integer> {
    @Override
    public Integer call() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return 26;
    }
}

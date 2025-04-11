package com.jiayuan.adapter;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/10 14:38<br/>
 */
public class ConsumerTaskAdapter implements Runnable {

    private final ConsumerTask consumerTask;

    public ConsumerTaskAdapter(ConsumerTask consumerTask) {
        this.consumerTask = consumerTask;
    }

    @Override
    public void run() {
        Integer call = consumerTask.call();
        System.out.println("ConsumerTaskAdapter run: " + call);
    }
}

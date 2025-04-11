package com.jiayuan.command;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/9 14:43<br/>
 */
public class Receiver {

    public void sendAsync(String message) {
        System.out.println("netty发送请求：" + message + "...");
    }

}

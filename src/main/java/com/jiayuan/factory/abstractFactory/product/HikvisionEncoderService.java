package com.jiayuan.factory.abstractFactory.product;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/4 22:57<br/>
 */
public class HikvisionEncoderService implements EncoderService{
    public boolean autoRegister() {
        System.out.println("海康编码器主动注册...");
        return true;
    }
}

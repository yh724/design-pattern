package com.jiayuan.factory.abstractFactory.product;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/4 22:56<br/>
 */
public class DahuaEncoderService implements EncoderService{
    public boolean autoRegister() {
        System.out.println("大华编码器主动注册...");
        return true;
    }
}

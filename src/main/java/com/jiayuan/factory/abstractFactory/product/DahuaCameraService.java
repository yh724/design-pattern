package com.jiayuan.factory.abstractFactory.product;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/4 22:55<br/>
 */
public class DahuaCameraService implements CameraService{
    public boolean goPreset() {
        System.out.println("大华摄像机转动预置位...");
        return true;
    }
}

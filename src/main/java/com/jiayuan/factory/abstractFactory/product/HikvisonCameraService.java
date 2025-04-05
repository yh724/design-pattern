package com.jiayuan.factory.abstractFactory.product;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/4 22:56<br/>
 */
public class HikvisonCameraService implements CameraService{
    public boolean goPreset() {
        System.out.println("海康摄像机转动预置位...");
        return true;
    }
}

package com.jiayuan.factory.abstractFactory.factory;

import com.jiayuan.factory.abstractFactory.product.CameraService;
import com.jiayuan.factory.abstractFactory.product.EncoderService;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/4 22:52<br/>
 */
public abstract class MonitorFactory {
    public abstract EncoderService createEncoderService();

    public abstract CameraService createCameraService();
}

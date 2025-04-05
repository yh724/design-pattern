package com.jiayuan.factory.abstractFactory.factory;

import com.jiayuan.factory.abstractFactory.product.CameraService;
import com.jiayuan.factory.abstractFactory.product.EncoderService;
import com.jiayuan.factory.abstractFactory.product.HikvisionEncoderService;
import com.jiayuan.factory.abstractFactory.product.HikvisonCameraService;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/4 22:58<br/>
 */
public class HikvisionMonitorFactory extends MonitorFactory {

    public EncoderService createEncoderService() {
        return new HikvisionEncoderService();
    }

    public CameraService createCameraService() {
        return new HikvisonCameraService();
    }
}

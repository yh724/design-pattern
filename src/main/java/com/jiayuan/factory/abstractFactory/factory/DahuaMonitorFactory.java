package com.jiayuan.factory.abstractFactory.factory;

import com.jiayuan.factory.abstractFactory.product.CameraService;
import com.jiayuan.factory.abstractFactory.product.DahuaCameraService;
import com.jiayuan.factory.abstractFactory.product.DahuaEncoderService;
import com.jiayuan.factory.abstractFactory.product.EncoderService;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/4 22:59<br/>
 */
public class DahuaMonitorFactory extends MonitorFactory{
    public EncoderService createEncoderService() {
        return new DahuaEncoderService();
    }

    public CameraService createCameraService() {
        return new DahuaCameraService();
    }
}

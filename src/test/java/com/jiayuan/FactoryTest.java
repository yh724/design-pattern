package com.jiayuan;

import com.jiayuan.factory.abstractFactory.factory.DahuaMonitorFactory;
import com.jiayuan.factory.abstractFactory.factory.HikvisionMonitorFactory;
import com.jiayuan.factory.abstractFactory.factory.MonitorFactory;
import com.jiayuan.factory.abstractFactory.product.CameraService;
import com.jiayuan.factory.abstractFactory.product.EncoderService;
import com.jiayuan.factory.factoryMethod.factory.CocacolaFactory;
import com.jiayuan.factory.factoryMethod.factory.Factory;
import com.jiayuan.factory.factoryMethod.factory.PesiColaFactory;
import com.jiayuan.factory.factoryMethod.product.Cola;
import com.jiayuan.templateMethod.AudioInspect;
import com.jiayuan.templateMethod.InspectMethod;
import com.jiayuan.templateMethod.RobotInspect;
import com.jiayuan.templateMethod.VideoInspect;
import org.junit.Test;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/3 11:38<br/>
 */
public class FactoryTest {

    @Test
    public void testSimpleFactoryClearly() {


    }

    @Test
    public void testFactoryMethod() {
        // 1.创建可口可乐工厂
        Factory cocacolaFactory = new CocacolaFactory();
        // 2.创建可口可乐
        Cola cocacola = cocacolaFactory.createCola();
        // 3.喝可口可乐
        cocacola.description();

        // 1.创建百事可乐工厂
        Factory pesiColaFactory = new PesiColaFactory();
        // 2.创建百事可乐
        Cola pesiCola = pesiColaFactory.createCola();
        // 3.喝百事可乐
        pesiCola.description();
    }

    @Test
    public void testAbstractFactory() {
        // 1.创建大华工厂
        MonitorFactory dahuaFactory = new DahuaMonitorFactory();
        // 2.创建大华编码器
        EncoderService dahuaEncoder = dahuaFactory.createEncoderService();
        // 3.创建大华摄像头
        CameraService dahuaCamera = dahuaFactory.createCameraService();
        // 4.使用大华编码器
        dahuaEncoder.autoRegister();
        // 5.使用大华摄像头
        dahuaCamera.goPreset();

        // 1.创建海康工厂
        MonitorFactory hikvisionFactory = new HikvisionMonitorFactory();
        // 2.创建海康编码器
        EncoderService hikvisionEncoder = hikvisionFactory.createEncoderService();
        // 3.创建海康摄像头
        CameraService hikvisionCamera = hikvisionFactory.createCameraService();
        // 4.使用海康编码器
        hikvisionEncoder.autoRegister();
        // 5.使用海康摄像头
        hikvisionCamera.goPreset();
    }

    @Test
    public void testTemplateMethod() {
        InspectMethod videoInspect = new VideoInspect();
        videoInspect.execute();
        System.out.println("============================");

        InspectMethod robotInspect = new RobotInspect();
        robotInspect.execute();
        System.out.println("============================");

        InspectMethod audioInspect = new AudioInspect();
        audioInspect.execute();
    }


}

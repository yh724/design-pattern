package com.jiayuan.facade.subSystem;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/8 15:26<br/>
 */
public class CameraDao {

    public String getCamera(String cameraCode) {
        System.out.println("查找摄像机" + cameraCode + "...");
        return "1号摄像机";
    }

}

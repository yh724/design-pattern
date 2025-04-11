package com.jiayuan.facade;

import com.jiayuan.facade.subSystem.CameraDao;
import com.jiayuan.facade.subSystem.FfmpegUtil;
import com.jiayuan.facade.subSystem.Windows;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/8 15:23<br/>
 */
public class VideoFacade {

    private CameraDao cameraDao = new CameraDao();

    private FfmpegUtil ffmpegUtil = new FfmpegUtil();

    private Windows windows = new Windows();

    public void play(String cameraCode) {
        String camera = cameraDao.getCamera(cameraCode);
        ffmpegUtil.openStream(camera);
        windows.play();
    }

}

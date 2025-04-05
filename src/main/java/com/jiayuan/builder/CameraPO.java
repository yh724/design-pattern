package com.jiayuan.builder;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/5 16:59<br/>
 */
public class CameraPO {
    private Integer id;

    private String cameraCode;

    private String cameraName;

    private String manufacturer;

    private String ip;

    private String port;

    private Integer channel;



    public static class Builder {
        private Integer id;
        private String cameraCode;
        private String cameraName;
        private String manufacturer;
        private String ip;
        private String port;
        private Integer channel;
    }

}

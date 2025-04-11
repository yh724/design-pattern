package com.jiayuan;

import com.jiayuan.facade.VideoFacade;
import org.junit.Test;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/8 15:31<br/>
 */
public class FacadeTest {
    @Test
    public void test() {
        VideoFacade videoFacade = new VideoFacade();
        videoFacade.play("110810000900000000");
    }
}

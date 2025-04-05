package com.jiayuan.templateMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/5 15:29<br/>
 */
public class AudioInspect extends InspectMethod{
    @Override
    protected List<Long> queryPoints() {
        System.out.println("查询音频巡视点位...");
        return new ArrayList<>();
    }

    @Override
    protected void doInspect(List<Long> points) {
        System.out.println("执行音频巡视点位...");
    }

    @Override
    protected void genResult() {
        System.out.println("生成音频巡视结果...");
    }

    @Override
    protected void uploadSuperior() {
        System.out.println("音频巡视结果上报主站...");
    }
}

package com.jiayuan.templateMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/5 15:29<br/>
 */
public class RobotInspect extends InspectMethod{
    @Override
    protected List<Long> queryPoints() {
        System.out.println("查询机器人巡视点位...");
        return new ArrayList<>();
    }

    @Override
    protected void doInspect(List<Long> points) {
        System.out.println("执行机器人巡视点位...");
    }

    @Override
    protected void genResult() {
        System.out.println("生成机器人巡视结果...");
    }

    @Override
    protected void uploadSuperior() {
        System.out.println("机器人巡视结果上报主站...");
    }
}

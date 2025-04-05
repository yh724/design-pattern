package com.jiayuan.templateMethod;

import java.util.List;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/5 15:28<br/>
 */
public abstract class InspectMethod {
    // 寻找需要巡视的点位列表
    protected abstract List<Long> queryPoints();

    // 执行巡视
    protected abstract void doInspect(List<Long> points);

    // 生成巡视结果
    protected abstract void genResult();

    // 结果上报上级平台
    protected abstract void uploadSuperior();

    public final void execute() {
        List<Long> points = this.queryPoints();
        doInspect(points);
        genResult();
        uploadSuperior();
    }
}

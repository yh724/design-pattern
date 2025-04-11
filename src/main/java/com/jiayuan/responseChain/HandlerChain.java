package com.jiayuan.responseChain;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/9 16:52<br/>
 */
public class HandlerChain {
    private List<Handler> handlers = Lists.newArrayList();

    public void addHandler(Handler handler) {
        this.handlers.add(handler);
    }

    public void process(Request request) {
        for (Handler handler : handlers) {
            Boolean success = handler.process(request);
            if (success != null) {
                System.out.println("处理结束！处理结果为：" + (success ? "同意" : "拒绝"));
                return;
            }
        }
        System.err.println("无法处理请求！");
    }
}

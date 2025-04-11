package com.jiayuan.responseChain;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/9 16:57<br/>
 */
public class CEOHandler implements Handler{
    @Override
    public Boolean process(Request request) {
        System.out.println("CEO审批中...");
        if (request.getAmount() < 1000000) {
            return true;
        }
        return null;
    }
}

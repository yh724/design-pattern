package com.jiayuan.responseChain;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/9 16:58<br/>
 */
public class LeaderHandler implements Handler{
    @Override
    public Boolean process(Request request) {
        System.out.println("Leader审批中...");
        if (request.getAmount() < 1000) {
            if (request.getName().equals("zs")) {
                return false;
            }
            return true;
        }
        return null;
    }
}

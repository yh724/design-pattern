package com.jiayuan.responseChain;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/9 16:50<br/>
 */
public interface Handler {
    Boolean process(Request request);
}

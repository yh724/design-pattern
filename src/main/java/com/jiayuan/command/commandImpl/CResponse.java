package com.jiayuan.command.commandImpl;

import com.jiayuan.command.Command;
import com.jiayuan.command.Receiver;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/9 14:40<br/>
 */
public class CResponse implements Command {
    private final Receiver receiver;

    public CResponse(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.sendAsync("通用响应返回");
    }
}

package com.jiayuan.command.commandImpl;

import com.jiayuan.command.Command;
import com.jiayuan.command.Receiver;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/9 14:42<br/>
 */
public class CModelSync implements Command {

    private final Receiver receiver;

    public CModelSync(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.sendAsync("模型同步请求");
    }
}

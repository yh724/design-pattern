package com.jiayuan;

import com.jiayuan.command.Command;
import com.jiayuan.command.Invoker;
import com.jiayuan.command.Receiver;
import com.jiayuan.command.commandImpl.CModelSync;
import com.jiayuan.command.commandImpl.CResponse;
import org.junit.Test;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/9 14:49<br/>
 */
public class CommandTest {
    @Test
    public void testCommand() {
        // 创建接收者
        Receiver receiver = new Receiver();

        // 创建命令对象
        Command cModelSync = new CModelSync(receiver);
        Command cResponse = new CResponse(receiver);

        // 执行第一个命令
        Invoker invoker = new Invoker(cModelSync);
        invoker.execute();

        // 执行第二个命令
        invoker.setCommand(cResponse);
        invoker.execute();
    }
}

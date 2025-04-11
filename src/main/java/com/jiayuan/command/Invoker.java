package com.jiayuan.command;

import lombok.Setter;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/9 14:49<br/>
 */
@Setter
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }


    public void execute() {
        command.execute();
    }
}

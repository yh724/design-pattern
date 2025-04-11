package com.jiayuan.state;

import org.checkerframework.checker.units.qual.C;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/11 10:13<br/>
 */
public class CloseState extends LiftState {
    @Override
    public void open() {
        super.context.setCurrentState(Context.openState);
        super.context.getCurrentState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭, 请注意...");
    }

    @Override
    public void run() {
        super.context.setCurrentState(Context.runState);
        super.context.getCurrentState().run();
    }

    @Override
    public void stop() {
        super.context.setCurrentState(Context.stopState);
        super.context.getCurrentState().stop();
    }
}

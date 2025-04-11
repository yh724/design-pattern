package com.jiayuan.state;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/11 10:15<br/>
 */
public class RunState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯正在运行, 请稍作等待...");
    }

    @Override
    public void stop() {
        super.context.setCurrentState(Context.stopState);
        super.context.getCurrentState().stop();
    }
}

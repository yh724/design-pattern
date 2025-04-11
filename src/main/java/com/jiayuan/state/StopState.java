package com.jiayuan.state;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/11 10:15<br/>
 */
public class StopState extends LiftState {
    @Override
    public void open() {
        super.context.setCurrentState(Context.openState);
        super.context.getCurrentState().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {
        System.out.println("电梯即将停止, 请做好准备...");
    }
}

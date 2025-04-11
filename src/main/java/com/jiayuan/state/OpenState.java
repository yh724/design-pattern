package com.jiayuan.state;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/11 10:03<br/>
 */
public class OpenState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯门开启，请有序上下电梯...");
    }

    @Override
    public void close() {
        super.context.setCurrentState(Context.closeState);
        super.context.getCurrentState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}

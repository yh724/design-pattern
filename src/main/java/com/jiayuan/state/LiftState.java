package com.jiayuan.state;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/11 9:40<br/>
 */
public abstract class LiftState {

    protected Context context;

    public LiftState() {
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}

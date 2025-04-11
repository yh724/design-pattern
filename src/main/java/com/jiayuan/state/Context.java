package com.jiayuan.state;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/11 9:40<br/>
 */
public class Context {
    public static LiftState openState = new OpenState();
    public static LiftState closeState = new CloseState();
    public static LiftState runState = new RunState();
    public static LiftState stopState = new StopState();

    private LiftState currentState;

    public LiftState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(LiftState currentState) {
        this.currentState = currentState;
        this.currentState.setContext(this);
    }

    public void open() {
        currentState.open();
    }

    public void close() {
        currentState.close();
    }

    public void run() {
        currentState.run();
    }

    public void stop() {
        currentState.stop();
    }
}

package com.jiayuan;

import com.jiayuan.state.*;
import org.junit.Test;

import java.util.List;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/11 10:22<br/>
 */
public class StateTest {
    @Test
    public void test() {
        Context context = new Context();
        LiftState[] states = new LiftState[] {new OpenState(), new StopState(), new RunState(), new StopState()};
        for (int i = 0; i < 4; i++) {
            System.out.println("current state：" + states[i]);
            context.setCurrentState(states[i]);
            context.open();
            context.close();
            context.run();
            context.stop();;
            System.out.println("================");
        }
    }
}

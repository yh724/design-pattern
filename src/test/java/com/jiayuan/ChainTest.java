package com.jiayuan;

import com.jiayuan.responseChain.*;
import org.junit.Test;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/9 17:03<br/>
 */
public class ChainTest {

    @Test
    public void test() {
        HandlerChain handlerChain = getHandlerChain();
        handlerChain.process(new Request("John Doe", 999));
        handlerChain.process(new Request("John Doe", 4999));
        handlerChain.process(new Request("John Doe", 50000));

        handlerChain.process(new Request("zs", 999));
        handlerChain.process(new Request("zs", 4999));
        handlerChain.process(new Request("zs", 50000));
        handlerChain.process(new Request("ls", 2000000));


    }

    private static HandlerChain getHandlerChain() {
        // 创建处理器链
        Handler handler1 = new LeaderHandler();
        Handler handler2 = new ManagerHandler();
        Handler handler3 = new CEOHandler();
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(handler1);
        handlerChain.addHandler(handler2);
        handlerChain.addHandler(handler3);
        return handlerChain;
    }
}

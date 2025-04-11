package com.jiayuan;

import com.jiayuan.adapter.ConsumerTask;
import com.jiayuan.adapter.ConsumerTaskAdapter;
import org.junit.Test;

/**
 * @author Jy-Jk<br/>
 * @description: ConsumeTask类型是Callable， 无法通过Thread对象运行，使用适配器模式可以将ConsumerTask转为Runnable执行<br/>
 * @date: 2025/4/10 14:40<br/>
 */
public class AdapterTest {
    @Test
    public void test() throws InterruptedException {
        ConsumerTask consumerTask = new ConsumerTask();
        ConsumerTaskAdapter consumerTaskAdapter = new ConsumerTaskAdapter(consumerTask);
        Thread thread = new Thread(consumerTaskAdapter);
        thread.start();
        Thread.sleep(2000);
    }
}

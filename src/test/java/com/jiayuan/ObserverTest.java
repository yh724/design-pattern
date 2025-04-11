package com.jiayuan;

import com.jiayuan.observer.Body;
import com.jiayuan.observer.Reporter;
import com.jiayuan.observer.Subject;
import com.jiayuan.observer.Temperature;
import org.junit.Test;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/10 17:42<br/>
 */
public class ObserverTest {
    @Test
    public void test() {
        Subject subject = new Temperature();
        subject.attach(new Reporter());
        subject.attach(new Body());

        subject.notice(5);
        subject.notice(15);
        subject.notice(35);
    }
}

package com.jiayuan;

import com.jiayuan.composite.File;
import com.jiayuan.composite.FileSysComponent;
import com.jiayuan.composite.Folder;
import org.junit.Test;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/10 16:00<br/>
 */
public class CompositeTest {

    @Test
    public void test() {
        FileSysComponent root = new Folder("/root");
        FileSysComponent etc = new Folder("/etc");
        FileSysComponent bin = new Folder("/bin");
        FileSysComponent nginx = new Folder("/nginx");
        FileSysComponent conf = new File("nginx.conf");

        root.add(etc);
        root.add(bin);
        etc.add(nginx);
        nginx.add(conf);

        root.show();
    }
}

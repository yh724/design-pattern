package com.jiayuan;

import com.jiayuan.prototype.Prototype;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/8 16:11<br/>
 */
public class PrototypeTest {
    @Test
    public void test() {
        Prototype father = new Prototype();
        ArrayList<String> childs = new ArrayList<>();
        father.setName("Jack");
        father.setAge(26);
        father.setChild(childs);

        childs.add("Jackson");
        System.out.println(father);

        Prototype wang = father.clone();
        childs.add("Wangson");
        System.out.println(wang);
        System.out.println(father);

    }
}

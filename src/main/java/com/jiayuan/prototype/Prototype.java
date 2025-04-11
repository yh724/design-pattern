package com.jiayuan.prototype;

import lombok.Data;

import java.util.ArrayList;

/**
 * @author Jy-Jk<br/>
 * @description: 原型模式在Java中的实现就是Cloneable接口和Object.clone()，注意Java中深拷贝和浅拷贝的区别<br/>
 * @date: 2025/4/8 16:07<br/>
 */
@Data
public class Prototype implements Cloneable {

    private String name;

    private Integer age;

    private ArrayList<String> child;

    @Override
    public Prototype clone() {
        Prototype clone = null;
        try {
            clone = (Prototype) super.clone();
            clone.setChild((ArrayList<String>) child.clone());
        } catch (Exception e) {
            System.out.println("clone failed.");
        }
        return clone;
    }
}

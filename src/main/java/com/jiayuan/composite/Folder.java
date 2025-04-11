package com.jiayuan.composite;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/10 15:54<br/>
 */
public class Folder implements FileSysComponent {

    private String name;

    public Folder(String name) {
        this.name = name;
    }

    private List<FileSysComponent> children = Lists.newArrayList();

    @Override
    public void show() {
        System.out.println("+ " + name);
        for (FileSysComponent child : children) {
            System.out.print("\t");
            child.show();
        }
    }

    @Override
    public void add(FileSysComponent component) {
        this.children.add(component);
    }
}

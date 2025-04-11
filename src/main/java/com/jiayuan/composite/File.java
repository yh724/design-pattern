package com.jiayuan.composite;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/10 15:58<br/>
 */
public class File implements FileSysComponent{

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.print("\t");
        System.out.println("- " + name);
    }

    @Override
    public void add(FileSysComponent component) {
        throw new UnsupportedOperationException("Cannot add to a file");
    }
}

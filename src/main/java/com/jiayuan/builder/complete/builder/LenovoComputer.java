package com.jiayuan.builder.complete.builder;

import com.jiayuan.builder.complete.Computer;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/7 15:21<br/>
 */
public class LenovoComputer implements ComputerBuilder {
    private final Computer computer = new Computer();

    public void cpu() {
        computer.setCpu("lenovo cpu.");
    }

    public void gpu() {
        computer.setGpu("lenovo gpu.");
    }

    public void ram() {
        computer.setRam("lenovo ram.");

    }

    public void storage() {
        computer.setStorage("lenovo storage.");
    }

    public Computer build() {
        return this.computer;
    }
}

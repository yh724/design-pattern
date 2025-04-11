package com.jiayuan.builder.complete.builder;

import com.jiayuan.builder.complete.Computer;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/7 15:21<br/>
 */
public class DellComputer implements ComputerBuilder {
    private final Computer computer = new Computer();

    public void cpu() {
        computer.setCpu("dell cpu.");
    }

    public void gpu() {
        computer.setGpu("dell gpu.");
    }

    public void ram() {
        computer.setRam("dell ram.");

    }

    public void storage() {
        computer.setStorage("dell storage.");
    }

    public Computer build() {
        return this.computer;
    }
}

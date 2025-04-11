package com.jiayuan.builder.complete;

import com.jiayuan.builder.complete.builder.ComputerBuilder;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/7 15:17<br/>
 */
public class Director {
    private ComputerBuilder computerBuilder;

    public Director(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void construct() {
        computerBuilder.cpu();
        computerBuilder.gpu();
        computerBuilder.ram();
        computerBuilder.storage();
    }

    public Computer build() {
        return computerBuilder.build();
    }
}

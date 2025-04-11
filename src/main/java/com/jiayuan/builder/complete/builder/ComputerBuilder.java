package com.jiayuan.builder.complete.builder;

import com.jiayuan.builder.complete.Computer;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/7 15:16<br/>
 */
public interface ComputerBuilder {
    void cpu();

    void gpu();

    void ram();

    void storage();

    Computer build();
}

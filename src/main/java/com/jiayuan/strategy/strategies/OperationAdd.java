package com.jiayuan.strategy.strategies;

import com.jiayuan.strategy.CalculateStrategy;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/10 11:02<br/>
 */
public class OperationAdd implements CalculateStrategy {
    @Override
    public int calculate(int i1, int i2) {
        return i1 + i2;
    }
}

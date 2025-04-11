package com.jiayuan.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/10 11:07<br/>
 */
@Data
@AllArgsConstructor
public class CalculationContext {
    private CalculateStrategy strategy;

    public int doCalculate(int i1, int i2) {
        return strategy.calculate(i1, i2);
    }
}

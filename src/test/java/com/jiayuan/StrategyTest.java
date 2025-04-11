package com.jiayuan;

import com.jiayuan.strategy.CalculationContext;
import com.jiayuan.strategy.strategies.OperationAdd;
import com.jiayuan.strategy.strategies.OperationDiv;
import com.jiayuan.strategy.strategies.OperationMul;
import com.jiayuan.strategy.strategies.OperationSub;
import org.junit.Test;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/10 11:09<br/>
 */
public class StrategyTest {

    @Test
    public void test() {
        int i1 = 10, i2 = 5;
        CalculationContext context = new CalculationContext(new OperationAdd());
        int result1 = context.doCalculate(i1, i2);
        System.out.println("i1 + i2 = " + result1);

        context.setStrategy(new OperationSub());
        int result2 = context.doCalculate(i1, i2);
        System.out.println("i1 - i2 = " + result2);

        context.setStrategy(new OperationMul());
        int result3 = context.doCalculate(i1, i2);
        System.out.println("i1 * i2 = " + result3);

        context.setStrategy(new OperationDiv());
        int result4 = context.doCalculate(i1, i2);
        System.out.println("i1 / i2 = " + result4);
    }
}

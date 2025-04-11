package com.jiayuan;

import com.jiayuan.builder.complete.Computer;
import com.jiayuan.builder.complete.Director;
import com.jiayuan.builder.complete.builder.ComputerBuilder;
import com.jiayuan.builder.complete.builder.DellComputer;
import com.jiayuan.builder.complete.builder.LenovoComputer;
import com.jiayuan.builder.simple.Phone;
import org.junit.Test;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/7 15:24<br/>
 */
public class BuilderTest {
    @Test
    public void testCompleteBuilder() {
        // 1.创建一个电脑构建器
        ComputerBuilder dellComputer = new DellComputer();
        // 2.创建一个导演
        Director director = new Director(dellComputer);
        // 3.导演开始构建电脑
        director.construct();
        // 4.获取构建好的电脑
        Computer computer = director.build();
        System.out.println(computer);

        // 1.创建一个电脑构建器
        ComputerBuilder lenovoComputerBuilder = new LenovoComputer();
        // 2.创建一个导演
        Director lenovoDirector = new Director(lenovoComputerBuilder);
        // 3.导演开始构建电脑
        lenovoDirector.construct();
        // 4.获取构建好的电脑
        Computer lenovoComputer = lenovoDirector.build();
        System.out.println(lenovoComputer);
    }

    @Test
    public void testSimpleBuilder() {
        // 1.创建一个手机构建器
        Phone.PhoneBuilder phoneBuilder = new Phone.PhoneBuilder();
        // 2.设置手机的属性
        Phone phone = phoneBuilder.brand("Apple")
                .cpu("A14")
                .ram("8GB")
                .storage("256GB")
                .price("$999")
                .build();
        // 4.打印手机信息
        System.out.println(phone);
    }
}

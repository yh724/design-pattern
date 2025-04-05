package com.jiayuan.factory.factoryMethod.factory;

import com.jiayuan.factory.factoryMethod.product.CocacolaCola;
import com.jiayuan.factory.factoryMethod.product.Cola;
import com.jiayuan.factory.factoryMethod.product.PesiCola;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/4 22:38<br/>
 */
public class PesiColaFactory extends Factory{
    public Cola createCola() {
        return new PesiCola();
    }
}

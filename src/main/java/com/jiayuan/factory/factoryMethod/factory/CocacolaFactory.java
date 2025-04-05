package com.jiayuan.factory.factoryMethod.factory;

import com.jiayuan.factory.factoryMethod.product.CocacolaCola;
import com.jiayuan.factory.factoryMethod.product.Cola;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/4 22:36<br/>
 */
public class CocacolaFactory extends Factory{
    public Cola createCola() {
        return new CocacolaCola();
    }
}

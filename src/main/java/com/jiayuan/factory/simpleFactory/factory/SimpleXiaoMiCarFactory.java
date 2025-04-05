package com.jiayuan.factory.simpleFactory.factory;

import com.jiayuan.factory.simpleFactory.product.XiaoMiCar;
import com.jiayuan.factory.simpleFactory.product.XiaoMiSu7;
import com.jiayuan.factory.simpleFactory.product.XiaoMiYu7;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/3 11:36<br/>
 */
public class SimpleXiaoMiCarFactory {

    public XiaoMiCar createXiaoMiCar(String type) {
        if ("su7".equals(type)) {
            return new XiaoMiSu7();
        } else if ("yu7".equals(type)) {
            return new XiaoMiYu7();
        } else {
            return null;
        }
    }


}

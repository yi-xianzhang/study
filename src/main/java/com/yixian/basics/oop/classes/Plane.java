package com.yixian.basics.oop.classes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 飞机
 * @create : 2022-06-26 17:24
 */
public class Plane implements Vehicles{

    private static final Logger LOGGER =
            LoggerFactory.getLogger(Vehicles.class);

    @Override
    public void work() {
        LOGGER.info("一般地,使用飞机[" + this.getClass().getTypeName() +
                "]作为交通工具，过火焰山");
    }

    protected Plane() {

    }
}

package com.yixian.basics.oop.classes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 马
 * @create : 2022-06-26 16:47
 */
public class Boat implements Vehicles{

    private static final Logger LOGGER =
            LoggerFactory.getLogger(Vehicles.class);


    @Override
    public void work() {
        LOGGER.info("过河时,使用船[" + this.getClass().getTypeName() +
                "]作为交通工具");
    }

    protected Boat() {

    }
}

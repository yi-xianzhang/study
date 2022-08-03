package com.yixian.basics.oop.classes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 交通工具工厂
 * @create : 2022-06-26 16:50
 */
public final class VehiclesFactory {

    private static Logger LOGGER = LoggerFactory.getLogger(Vehicles.class);

    private static Boat BOAT = null;

    private static final Horse HORSE = new Horse();

    private VehiclesFactory() {

    }

    public static final Vehicles getBoatInstance() {
        if (BOAT == null) {
            BOAT = new Boat();
        }
        return BOAT;
    }


    public static final Vehicles getHorseInstance() {
        return HORSE;
    }

    public static final Vehicles getPlaneInstance() {
        return new Plane() ;
    }
}

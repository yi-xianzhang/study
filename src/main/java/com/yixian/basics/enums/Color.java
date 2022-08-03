package com.yixian.basics.enums;

import org.apache.log4j.Logger;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 颜色枚举
 * @create : 2022-06-26 17:41
 */
@SuppressWarnings("all")
public enum Color implements Colorable {

    RED(255,0,0),

    BLUE(0,0,255),

    BLACK(0,0,0),

    YELLOW(255,255,0),

    GREEN(0,255,0);

    private static final Logger LOGGER = Logger.getLogger(Color.class);

    private int redValue;
    private int greenValue;
    private int blueValue;


    private Color(int redValue,int greenValue,int blueValue ) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        LOGGER.info("\t 枚举名为 : \t" + name() + "\t : \t" + this.toString());
    }

    @Override
    public String toString() {
        return "Color{" +
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue +
                '}';
    }
}

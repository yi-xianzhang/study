package com.yixian.basics.enums;

import org.junit.Test;

/**
 * 学习{@link Enum}类的方法的是用。
 * @program: JavaSeStudy
 * @description: 学习Enum类的方法
 * @author: zhang_hj
 * @create: 2022-06-26 10:18
 * @version: 1.0.0
 */
@SuppressWarnings("all")
public class EnumMethod {

    /**
     * 1 {@link Enum#name()}得到枚举常量的名称。
     */
    @Test
    public void nameTest() {
        System.out.println(" Education.PRIMARY.name() : " +
                Education.PRIMARY.name());
        System.out.println(" Education.MIDDLE.name() : " +
                Education.MIDDLE.name());
        System.out.println(" Education.HIGH.name() : " +
                Education.HIGH.name());
    }


    /**
     * 2 {@link Enum#ordinal()}得到枚举常量的次序编号，编号从0开始。
     */
    @Test
    public void ordinalTest() {
        System.out.println(" Education.PRIMARY.ordinal() : " +
                Education.PRIMARY.ordinal());
        System.out.println(" Education.MIDDLE.ordinal() : " +
                Education.MIDDLE.ordinal());
        System.out.println(" Education.HIGH.ordinal() : " +
                Education.HIGH.ordinal());
    }

    /**
     * 2 {@link Education#values()}的到枚举类的所有枚举常量，按照定义次序。
     */
    @Test
    public void valuesTest() {
        Education[] values = Education.values();
        System.out.println("---------------开始循环values的结果---------------");
        for (Education temp: values) {
            System.out.print("temp.name() : " + temp.name() + "   ");
            System.out.print(" , temp.ordinal() : " + temp.ordinal());
            System.out.println();
        }
        System.out.println("---------------values的结果循环结束---------------");
    }

    /**
     * 2 {@link Education#valueOf(String)}将字符串转换成一个已有的常量。
     * {@link Enum#valueOf(Class, String)}将字符串转换成一个已有的常量。
     *
     */
    @Test
    public void valueOfTest() {
        System.out.println("Education.valueOf(\"PRIMARY\") := " +
                Education.valueOf("PRIMARY"));
        System.out.println("Education.valueOf(\"MIDDLE\") := " +
                Education.valueOf("MIDDLE"));
        System.out.println("Education.valueOf(\"HIGH\")) : = " +
                Education.valueOf("HIGH"));
        System.out.println("Enum.valueOf(Education.class, \"PRIMARY\") : = " +
                Enum.valueOf(Education.class, "PRIMARY"));
        System.out.println("Enum.valueOf(Education.class, \"MIDDLE\") : = " +
                Enum.valueOf(Education.class, "MIDDLE"));
        System.out.println("Enum.valueOf(Education.class, \"HIGH\") : = " +
                Enum.valueOf(Education.class, "HIGH"));

    }

    /**
     * 3 {@link Enum#compareTo(Enum)}比较两个枚举常量的大小，比较的是位置号，
     * 参加{@link Enum#ordinal()}
     */
    @Test
    public void compareToTest() {
        System.out.println(" Education.PRIMARY.ordinal() : " +
                Education.PRIMARY.ordinal());
        System.out.println(" Education.MIDDLE.ordinal() : " +
                Education.MIDDLE.ordinal());
        System.out.println("Education.PRIMARY.compareTo(Education.MIDDLE) := " +
                Education.PRIMARY.compareTo(Education.MIDDLE) );
    }


}

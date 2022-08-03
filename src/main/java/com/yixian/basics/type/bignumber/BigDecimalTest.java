package com.yixian.basics.type.bignumber;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * {@link BigDecimal}类：大数据类型，
 * ---> {@link Number}抽象类。
 * ----> {@link Comparable<BigInteger>}类，用来比较大小。
 *
 * @author Administrator
 * @since 1.1
 */
@SuppressWarnings("all")
public class BigDecimalTest {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(BigIntegerTest.class);

    // ---------------------------- BigDecimal类方法 ----------------------------
    @Test
    public void staticMethodsOfThis() throws Exception {

    }

    // --------------------------- BigDecimal类构造器 ---------------------------

    @Test
    protected void constructorsOfThis() {

    }


    // -------------------------- BigDecimal类成员方法 --------------------------
    @Test
    public void instanceMethodsOfThis() throws Exception {
        // 基本运算，加减乘除
        addOfBigDecimal();
        subtractOfBigDecimal();
        multiplyOfBigDecimal();
        divideOfBigDecimal();
    }

    /**
     * {@link BigDecimal#add(BigDecimal)}加法
     */
    @Test
    public void addOfBigDecimal() {
        BigDecimal num1 = new BigDecimal("123456789012344");
        BigDecimal num2 = new BigDecimal("23");
        LOGGER.info("num1[" + num1.toString() + "].add(num2[" + num2.toString() +
                "]: = " + num1.add(num2).toString());
    }


    /**
     * {@link BigDecimal#subtract(BigDecimal)} 减法
     */
    @Test
    public void subtractOfBigDecimal() {
        BigDecimal num1 = new BigDecimal("123456789012344");
        BigDecimal num2 = new BigDecimal("23");
        LOGGER.info("num1[" + num1.toString() +
                "].subTract(num2[" + num2.toString() + "]: = " +
                num1.subtract(num2).toString());
    }

    /**
     * {@link BigDecimal#multiply(BigDecimal)}乘法
     */
    @Test
    public void multiplyOfBigDecimal() {
        BigDecimal num1 = new BigDecimal("123456789012344");
        BigDecimal num2 = new BigDecimal("23");
        LOGGER.info("num1[" + num1.toString() +
                "].multiply(num2[" + num2.toString() + "]: = " +
                num1.multiply(num2).toString());
    }


    /**
     * {@link BigDecimal#divide(BigDecimal)} 除法，可能抛出无限循环异常。
     */
    @Test
    public void divideOfBigDecimal() {
        BigDecimal num1 = new BigDecimal("1.00");
        BigDecimal num2 = new BigDecimal("3");
        LOGGER.info("num1[" + num1.toString() +
                "].divide(num2[" + num2.toString() + "]: = " +
                num1.divide(num2,BigDecimal.ROUND_CEILING).toString());
    }





}

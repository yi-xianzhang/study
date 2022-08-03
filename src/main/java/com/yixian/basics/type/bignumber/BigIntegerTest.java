package com.yixian.basics.type.bignumber;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.Random;

/**
 * {@link BigInteger}类：大数据类型，
 * ---> {@link Number}抽象类。
 * ----> {@link Comparable<BigInteger>}类，用来比较大小。
 *
 * @author Administrator
 * @since 1.1
 */
@SuppressWarnings("all")
public class BigIntegerTest {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(BigIntegerTest.class);

    // ---------------------------- BigInteger类方法 ----------------------------
    @Test
    public void staticMethodsOfThis() throws Exception {
        LOGGER.info("BigInteger.valueOf([long]12345678899L) := " +
                BigInteger.valueOf(12345678899L));
        for (int i = 0; i < 8000; i++) {
            LOGGER.info("BigInteger.probablePrime(4, new Random()) := " +
                    BigInteger.probablePrime(4, new Random()));
        }
    }

    // --------------------------- BigInteger类构造器 ---------------------------

    @Test
    protected void constructorsOfThis() {

    }


    // -------------------------- BigInteger类成员方法 --------------------------

    @Test
    public void instanceMethodsOfThis() throws Exception {
        BigInteger bigInteger = new BigInteger("12");
    }

    /**
     * {@link BigInteger#add(long)}加法
     */
    @Test
    public void addOfBigInteger() {
        BigInteger num1 = new BigInteger("123456789012344");
        BigInteger num2 = new BigInteger("23");
        LOGGER.info("num1[" + num1.toString() +
                "].add(num2[" + num2.toString() + "]: = " +
                num1.add(num2).toString());
    }


    /**
     * {@link BigInteger#add(long)}减法
     */
    @Test
    public void subtractOfBigInteger() {
        BigInteger num1 = new BigInteger("123456789012344");
        BigInteger num2 = new BigInteger("23");
        LOGGER.info("num1[" + num1.toString() +
                "].subTract(num2[" + num2.toString() + "]: = " +
                num1.subtract(num2).toString());
    }

    /**
     * {@link BigInteger#multiply(long)}乘法
     */
    @Test
    public void multiplyOfBigInteger() {
        BigInteger num1 = new BigInteger("123456789012344");
        BigInteger num2 = new BigInteger("23");
        LOGGER.info("num1[" + num1.toString() +
                "].multiply(num2[" + num2.toString() + "]: = " +
                num1.multiply(num2).toString());
    }


    /**
     * {@link BigInteger#multiply(long)}除法
     */
    @Test
    public void divideyOfBigInteger() {
        BigInteger num1 = new BigInteger("123456789012344");
        BigInteger num2 = new BigInteger("23");
        LOGGER.info("num1[" + num1.toString() +
                "].divide(num2[" + num2.toString() + "]: = " +
                num1.divide(num2).toString());
    }
}

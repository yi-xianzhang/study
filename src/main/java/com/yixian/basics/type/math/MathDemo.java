package com.yixian.basics.type.math;

import com.yixian.basics.type.sequence.StringTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * {@link Math}，数学运算相关的方法。
 * final 修饰，不能被继承，私有化构造方法，不能new 对象，但是可反射。
 * 类似这种的，是作为工具类的。
 */
@SuppressWarnings("all")
public class MathDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(StringTest.class);

    // ------------------------ Math 类的非静态成员方法学习 ------------------------

    /**
     * 学习{@link Math}的成员方法
     */
    @Test
    public void instanceMethodsOfThis() throws Exception {
        Method[] methods = Math.class.getMethods();
        boolean instanceMethodsFlag = false;
        for (Method m : methods) {
            if (!m.getName().contains("static")) {
                instanceMethodsFlag = true;
                break;
            }
        }
        if (instanceMethodsFlag) {
            LOGGER.info(Math.class.getName() + "类，无公共的非静态成员方法");
            return;
        }
        LOGGER.info(Math.class.getName() + "类，存在公共的非静态成员方法");
    }

    // --------------------------- Math 类的构造器学习 ---------------------------

    /**
     * 学习{@link Math}的构造器
     */
    @Test
    public void constructorsOfThis() {

        Constructor[] constructors = Math.class.getConstructors();
        for (Constructor m : constructors) {
            LOGGER.info(Math.class.getName() + "类，构造方法：" + m.getName());
        }
    }

    // -------------------------- Math 类的静态方法学习 --------------------------

    /**
     * 学习{@link Math}的静态方法
     */
    @Test
    public void staticMethodsOfThis() {
        powOfMath();
        ceilOfMath();
    }

    /**
     * {@link Math#pow(double, double)}求参数1的参数2次幂的值，并返回。
     */
    @Test
    public void powOfMath() {
        LOGGER.info("Math.pow(-3.5,4) = " + String.valueOf(Math.pow(-3.5, 4)));
        LOGGER.info("Math.pow(-2,4) = " + String.valueOf(Math.pow(-2, 4)));
    }

    /**
     * {@link Math#ceil(double)}求参数1的最大整数值，并返回。向上取整
     */
    @Test
    public void ceilOfMath() {
        LOGGER.info("Math.ceil(-3.0987) = " +
                String.valueOf(Math.ceil(-3.0987)));
        LOGGER.info("Math.ceil(4.789) = " + String.valueOf(Math.ceil(4.789)));
    }

    /**
     * {@link Math#floor(double)}求参数1的最小整数值，并返回。向上取整
     */
    @Test
    public void floorOfMath() {
        LOGGER.info("Math.floor(-3.0987) = " +
                String.valueOf(Math.floor(-3.0987)));
        LOGGER.info("Math.floor(4.789) = " +
                String.valueOf(Math.floor(4.789)));
    }

    /**
     * {@link Math#abs(double)}求参数1的绝对值
     */
    @Test
    public void absOfMath() {
        LOGGER.info("Math.abs(-3.0987)[求绝对值] = " +
                String.valueOf(Math.abs(-3.0987)));
        LOGGER.info("Math.abs(4.789)[求绝对值] = " +
                String.valueOf(Math.abs(4.789)));
    }

    /**
     * {@link Math#round(double)}四舍五入，取整
     */
    @Test
    public void roundOfMath() {
        LOGGER.info("Math.round(-3.0987)[四舍五入，取整] = " +
                String.valueOf(Math.round(-3.0987)));
        LOGGER.info("Math.round(4.789)[四舍五入，取整] = " +
                String.valueOf(Math.round(4.789)));
    }

    /**
     * {@link Math#sqrt(double)}开方，取得算术平方根
     */
    @Test
    public void sqrtOfMath() {
        LOGGER.info("Math.sqrt(-3.0987)[开方] = " +
                String.valueOf(Math.sqrt(-3.0987)));
        LOGGER.info("Math.sqrt(4.789)[开方] = " +
                String.valueOf(Math.sqrt(4.789)));
        LOGGER.info("Math.sqrt(4.789)[开方] = " +
                String.valueOf(Math.sqrt(0.25)));
        LOGGER.info("Math.sqrt(4.789)[开方] = " +
                String.valueOf(Math.sqrt(4)));
    }

    /**
     * {@link Math#random()}返回[0,1)的随机数。
     */
    @Test
    public void randomOfMath() {
        for (int i = 0; i < 10; i++) {
            LOGGER.info("Math.random()[生成随机数] = " +
                    String.valueOf(Math.random()));
        }

        int from = 2;
        int to = 7;
        for (int i = 0; i < 1000; i++) {
            LOGGER.info("生成" + from + " - " + to + "之间的随机数" +
                    String.valueOf(random(from,to)));
        }
    }


    /**
     * 获取from-to之间的随机整数，区间为[from,to]
     * @param from   起始位置
     * @param to     random
     * @return       结果
     */
    private long random (long from , long to) {
        return to + (int)(Math.random() * (from - to + 1));
    }

    /**
     * {@link Math#max(int, int)}
     * {@link Math#max(long, long)}
     * {@link Math#max(float, float)}
     * {@link Math#max(double, double)}
     * 获取两个数的最大值
     */
    @Test
    public void maxOfMath() {
        LOGGER.info("Math.max(7,0))[最大值] = " +
                String.valueOf(Math.max(7,0)));
        LOGGER.info("Math.max(7.90,0.89))[最大值] = " +
                String.valueOf(Math.max(7.90,0.89)));

        LOGGER.info("Math.max(-7.90,0.89))[最大值] = " +
                String.valueOf(Math.max(-7.90,0.89)));
        LOGGER.info("Math.max(-7.90,-0.89))[最大值] = " +
                String.valueOf(Math.max(-7.90,-0.89)));

    }

    /**
     * {@link Math#min(int, int)}
     * {@link Math#min(long, long)}
     * {@link Math#min(float, float)}
     * {@link Math#min(double, double)}
     * 获取两个数的最小值
     */
    @Test
    public void minOfMath() {
        LOGGER.info("Math.min(7,0))[最小值] = " +
                String.valueOf(Math.min(7,0)));
        LOGGER.info("Math.min(7.90,0.89))[最小值] = " +
                String.valueOf(Math.min(7.90,0.89)));

        LOGGER.info("Math.min(-7.90,0.89))[最小值] = " +
                String.valueOf(Math.min(-7.90,0.89)));
        LOGGER.info("Math.min(-7.90,-0.89))[最小值] = " +
                String.valueOf(Math.min(-7.90,-0.89)));

    }



}

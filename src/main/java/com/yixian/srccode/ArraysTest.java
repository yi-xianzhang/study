package com.yixian.srccode;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 数组工具类学习
 * @create : 2022-07-10 14:23
 *
 * {@link java.util.Arrays}
 */

@SuppressWarnings("all")
public class ArraysTest {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(ArraysTest.class);

    public static final Integer[] srcArray = {2,4,1,3,7,4,8,2,9,12,1,23};

    // ----------------------- Arrays 类的非静态成员方法学习 -----------------------

    /**
     * 学习{@link Arrays}的成员方法
     */
    @Test
    public void instanceMethodsOfThis() throws Exception {
        Method[] methods = Arrays.class.getMethods();
        boolean instanceMethodsFlag = false;
        for (Method m : methods) {
            if (!m.getName().contains("static")) {
                instanceMethodsFlag = true;
                break;
            }
        }
        if (instanceMethodsFlag) {
            LOGGER.info(Arrays.class.getName() + "类，无公共的非静态成员方法");
            return;
        }
        LOGGER.info(Arrays.class.getName() + "类，存在公共的非静态成员方法");
    }

    // --------------------------- Arrays 类的构造器学习 --------------------------

    /**
     * 学习{@link Arrays}的构造器
     */
    @Test
    public void constructorsOfThis() {

        Constructor[] constructors = Arrays.class.getConstructors();
        for (Constructor m : constructors) {
            LOGGER.info(Arrays.class.getName() + "类，构造方法：" + m.getName());
        }
    }

    // -------------------------- Arrays类的静态方法学习 --------------------------

    /**
     * 学习{@link Arrays}的静态方法
     */
    @Test
    public void staticMethodsOfThis() {
        toStringOfArrays();
    }

    /**
     * {@link Arrays#toString(Object[])}获取数组对象的字符串形式,
     * 此方法被重载过很多数组类型，此处主要探讨
     * {@link Arrays#toString(int[])}
     */
    @Test
    public void toStringOfArrays() {
        LOGGER.info("打印数组：" + Arrays.toString(srcArray));
    }

    /**
     * {@link Arrays#sort(Object[])}数组排序。
     */
    @Test
    public void sortOfArrays() {
        LOGGER.info("排序前：" + Arrays.toString(srcArray));
        Arrays.sort(srcArray);
        LOGGER.info("排序后：" + Arrays.toString(srcArray));
    }

    /**
     * {@link Arrays#binarySearch(Object[], Object)}二分查找，返回下标索引。
     * 使用时 必须保证数组有序。不存在，返回 负数。
     */
    @Test
    public void binarySearchofArrays() {
        LOGGER.info("排序前：" + Arrays.toString(srcArray));
        Arrays.sort(srcArray);
        LOGGER.info("排序后：" + Arrays.toString(srcArray));
        LOGGER.info("二分查找：" + Arrays.binarySearch(srcArray,4));
    }


    /**
     * {@link Arrays#copyOf(Object[], int)}
     */
    @Test
    public void copyOfOfArrays() {
        LOGGER.info("原数组：" + Arrays.toString(srcArray));
        LOGGER.info("使用Arrays.copyOf(srcArray,srcArray.length)拷贝后的数组：" +
                Arrays.toString(
                        Arrays.copyOf(srcArray,srcArray.length + 1)));
    }

    /**
     * {@link Arrays#asList(Object[])}将数组转成list。
     */
    @Test
    public void asListOfArrays() {
        List<Integer> integers = Arrays.asList(srcArray);
        LOGGER.info("打印结果：" + integers.toString());
        LOGGER.info("运行时类型：" + integers.getClass().getName());
    }


}

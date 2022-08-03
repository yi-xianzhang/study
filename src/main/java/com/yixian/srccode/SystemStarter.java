package com.yixian.srccode;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 类{@link System}学习
 * @create : 2022-07-10 19:23
 *
 * 1 类使用 final 关键字修饰，不能被继承。
 *
 *
 */
@SuppressWarnings("all")
public class SystemStarter {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SystemStarter.class);

    public static final Integer[] srcArray = {2,4,1,3,7,4,8,2,9,12,1,23};

    // ----------------------- Arrays 类的非静态成员方法学习 -----------------------

    /**
     * 学习{@link System}的成员方法
     */
    @Test
    public void instanceMethodsOfThis() throws Exception {
        Method[] methods = System.class.getMethods();
        boolean instanceMethodsFlag = false;
        for (Method m : methods) {
            if (!m.getName().contains("static")) {
                instanceMethodsFlag = true;
                break;
            }
        }
        if (instanceMethodsFlag) {
            LOGGER.info(System.class.getName() + "类，无公共的非静态成员方法");
            return;
        }
        LOGGER.info(System.class.getName() + "类，存在公共的非静态成员方法");
    }

    // --------------------------- System 类的构造器学习 --------------------------

    /**
     * 学习{@link Arrays}的构造器
     */
    @Test
    public void constructorsOfThis() {

        Constructor[] constructors = System.class.getConstructors();
        for (Constructor m : constructors) {
            LOGGER.info(System.class.getName() + "类，构造方法：" + m.getName());
        }
    }

    // -------------------------- System 类的静态方法学习 -------------------------

    /**
     * 学习{@link System}的静态方法
     */
    @Test
    public void staticMethodsOfThis() {

    }

    /**
     * {@link System#exit(int)} 退出当前程序。参数表示状态值。
     */
    @Test
    public void exitOfSystem() {
        LOGGER.info("System.exit()方法测试前打印");
        System.exit(0);
        LOGGER.info("System.exit()方法测试后打印");
    }

    /**
     * {@link System#arraycopy(Object, int, Object, int, int)}
     * 数组拷贝，基本类型和String为深拷贝，其余皆为浅拷贝。
     */
    @Test
    public void arraycopyOfSystem() {
        Integer[] dest = new Integer[3];
        LOGGER.info("拷贝前目标数组：" + Arrays.toString(dest));
        System.arraycopy(srcArray,0,dest,0,3);
        LOGGER.info("拷贝前源数组：" + Arrays.toString(srcArray));
        LOGGER.info("拷贝后目标数组：" + Arrays.toString(dest));
    }

    /**
     * {@link System#currentTimeMillis()}获取当前毫秒值。以1970-01-01为相对0毫秒。
     */
    @Test
    public void currentTimeMillisOfSystem() {
        LOGGER.info("获取当前毫秒值：" + System.currentTimeMillis());
    }
}

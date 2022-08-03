package com.yixian.higher.reflect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * @program: JavaSeStudy
 * @description:
 * @author: zhang_hj
 * @create: 2022-07-28 15:50
 * @version: 1.0.0
 */

@SuppressWarnings("all")
public class Methods {

    /**
     * 日志文件
     */
    private static final Logger LOGGER =
            LoggerFactory.getLogger(Methods.class);

    /**
     * 获取打印参数t的全部方法
     * @param t
     * @param flag  true 表示共有方法，false: 表示全部方法
     */
    private static <T> void getMethodMethodsOfClass(Class<T> t, boolean flag) {
        LOGGER.info("======" + t.toString() + ".getDeclaredMethods()[获取全部"+
                (flag ? "公共的(包含其父类)" : "(不包含其父类)") + "方法]开始=====");
        final Method[] declaredMethods = flag ? t.getMethods() :
                t.getDeclaredMethods();
        for (Method method: declaredMethods) {
            LOGGER.info(method.toString());
        }
        LOGGER.info("======" + t.toString() + ".getDeclaredMethods()[获取全部"+
                (flag ? "公共的(包含其父类)" : "") + "(不包含其父类)方法]结束=====");
    }

    public static <T> void getMethods(Class<T> t) {
        getMethodMethodsOfClass(t,true);
    }

    public static <T> void getDeclaredMethods(Class<T> t) {
        getMethodMethodsOfClass(t,false);
    }

    /**
     * 获取{@link Class}类的方法信息的获取。
     * @param t
     * @param <T>
     */
    public static <T> void getMethodMethodsOfClass(Class<T> t)
            throws NoSuchMethodException {

        LOGGER.info("t[" + t.toString() + "].getMethod(\"hashCode\")" +
                "[获取Class对象的参数名方法] :" +
                t.getMethod("hashCode").toString());
        LOGGER.info("t[" + t.toString() + "].getMethod(\"equals\" ,Object.class )" +
                "[获取Class对象的参数名方法] :" +
                t.getMethod("equals",Object.class).toString());
        LOGGER.info("t[" + t.toString() + "].getDeclaredMethod(\"getOptID\" ,Object.class )" +
                "[获取Class对象的参数名方法] :" +
                t.getDeclaredMethod("getOptId").toString());
        Methods.getMethods(t);
        Methods.getDeclaredMethods(t);
    }

}


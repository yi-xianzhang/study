package com.yixian.higher.reflect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

/**
 * @program: JavaSeStudy
 * @description:
 * @author: zhang_hj
 * @create: 2022-07-28 16:06
 * @version: 1.0.0
 */
@SuppressWarnings("all")
public class Fields {

    /**
     * 日志文件
     */
    private static final Logger LOGGER =
            LoggerFactory.getLogger(Fields.class);

    public static<T> void getFiledsMethodsOfClass(Class<T> t) throws NoSuchFieldException {
        LOGGER.info("t[" + t.toString() + "].getField(\"salaryPublic\")" +
                "[获取Class对象的参数名属性] :" +
                t.getField("salaryPublic"));
        LOGGER.info("t[" + t.toString() + "].getDeclaredField(\"salary\")" +
                "[获取Class对象的参数名属性] :" +
                t.getDeclaredField("salary"));
        getFileds(t);
        getDeclaredFileds(t);
    }

    /**
     * 获取打印参数t的全部方法
     * @param t
     * @param flag  true 表示共有方法，false: 表示全部方法
     */
    private static <T> void getFiledsMethodsOfClass(Class<T> t, boolean flag) {
        LOGGER.info("======" + t.toString() + ".getDeclaredMethods()[获取全部"+
                (flag ? "公共的(包含其父类)" : "(不包含其父类)") + "属性]开始=====");
        final Field[] fields = flag ? t.getFields() :
                t.getDeclaredFields();
        for (Field method: fields) {
            LOGGER.info(method.toString());
        }
        LOGGER.info("======" + t.toString() + ".getDeclaredMethods()[获取全部"+
                (flag ? "公共的(包含其父类)" : "") + "(不包含其父类)属性]结束=====");
    }

    public static <T> void getFileds(Class<T> t) {
        getFiledsMethodsOfClass(t,true);
    }

    public static <T> void getDeclaredFileds(Class<T> t) {
        getFiledsMethodsOfClass(t,false);
    }
}


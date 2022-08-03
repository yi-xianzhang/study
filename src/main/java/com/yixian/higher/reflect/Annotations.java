package com.yixian.higher.reflect;

import com.yixian.higher.reflect.base.Comment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: JavaSeStudy
 * @description: zhujie
 * @author: zhang_hj
 * @create: 2022-07-28 16:18
 * @version: 1.0.0
 */
@SuppressWarnings("all")
public class Annotations {

    /**
     * 日志文件
     */
    private static final Logger LOGGER =
            LoggerFactory.getLogger(Annotations.class);


    public static void getAnnotationsMethodOfClass(Class<?> tClass) {

        LOGGER.info("tClass[" + tClass + "].getAnnotation(Comment.class)" +
                "[获取Class对象的参数名注解] :" +
                tClass.getAnnotation(Comment.class));
        LOGGER.info("tClass[" + tClass + "].getDeclaredAnnotation(Comment.class)" +
                "[获取Class对象的参数名注解] :" +
                tClass.getDeclaredAnnotation(Comment.class));


        LOGGER.info("tClass[" + tClass + "].getAnnotatedSuperclass()" +
                "[] :" + tClass.getAnnotatedSuperclass().getClass());
    }


}




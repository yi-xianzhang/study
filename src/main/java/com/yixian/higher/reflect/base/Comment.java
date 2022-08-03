package com.yixian.higher.reflect.base;

import java.lang.annotation.*;

/**
 * @program: JavaSeStudy
 * @description: 自定义注解
 * @author: zhang_hj
 * @create: 2022-07-27 10:14
 * @version: 1.0.0
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR,
        ElementType.METHOD,ElementType.TYPE_PARAMETER})
public @interface Comment {
}


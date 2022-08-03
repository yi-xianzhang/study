package com.yixian.basics.annotation;

import java.lang.annotation.*;

/**
 * @program: JavaSeStudy
 * @description: 我的自定义注解
 * @author: zhang_hj
 * @create: 2022-06-26 11:53
 * @version: 1.0.0
 */

@Target(ElementType.FIELD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
}

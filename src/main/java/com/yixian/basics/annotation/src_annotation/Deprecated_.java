package com.yixian.basics.annotation.src_annotation;

/**
 * @program: JavaSeStudy
 * @description: @Deprecated注解的使用
 * @author: zhang_hj
 * @create: 2022-06-26 11:42
 * @version: 1.0.0
 */

@Deprecated
public class Deprecated_ {

    @Deprecated
    public int x = 10;

    @Deprecated
    public void say() {
        System.out.println("@Deprecated 修饰的方法执行");
    }

    public void say2() {
        System.out.println("未使用 @Deprecated 修饰的方法执行");
    }
}

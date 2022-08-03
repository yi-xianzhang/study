package com.yixian.higher.generics.base;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description :
 * @create : 2022-07-24 00:18
 */
@SuppressWarnings("all")
public class MyInterface<L,M,R> {

    public static <T> T test(T t) {
        return t;
    }

}

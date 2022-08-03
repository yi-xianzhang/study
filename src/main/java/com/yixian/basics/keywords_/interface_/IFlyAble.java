package com.yixian.basics.keywords_.interface_;

/**
 * @program: JavaSeStudy
 * @description:
 * @author: zhang_hj
 * @create: 2022-07-20 14:49
 * @version: 1.0.0
 */
@SuppressWarnings("all")
@FunctionalInterface
public interface IFlyAble<T> {

    /** 
     * 表示对象的飞行能力。
     * @param t  参数
     * @return   返回值
     */
    T fly();
}


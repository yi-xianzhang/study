package com.yixian.higher.generics.base;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : USB接口
 * @create : 2022-07-24 21:47
 */
public interface IUsb<U,R> {

    R get(U u);

    void hi(R r1,R r2, U u1, U u2);

    default R method(U u) {
        return get(u);
    }
}

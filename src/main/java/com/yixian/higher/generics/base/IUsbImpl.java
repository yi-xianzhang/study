package com.yixian.higher.generics.base;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description :
 * @create : 2022-07-24 21:53
 */
@SuppressWarnings("all")
public class IUsbImpl implements IUsb<String,Double>{

    @Override
    public Double get(String s) {
        return Double.parseDouble(s);
    }

    @Override
    public void hi(Double r1, Double r2, String u1, String u2) {

    }
}

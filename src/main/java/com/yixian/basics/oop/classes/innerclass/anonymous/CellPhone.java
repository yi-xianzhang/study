package com.yixian.basics.oop.classes.innerclass.anonymous;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 手机
 * @create : 2022-06-26 16:19
 */
public class CellPhone {

    public int testWork(Calculator calculator,int a,int b) {
        return calculator.work(a,b);
    }

    public static void main(String[] args) {
        @SuppressWarnings("all")
        int ret = new CellPhone().testWork(new Calculator() {
            @Override
            public int work(int a, int b) {
                return a + b;
            }
        }, 1, 2);

        int ret2 = new CellPhone().testWork(Integer::sum, 1, 2);
        System.out.println(ret);
        System.out.println(ret2);

    }
}

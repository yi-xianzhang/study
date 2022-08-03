package com.yixian.basics.extend_;

/**
 * @program: JavaSeStudy
 * @description:
 * @author: zhang_hj
 * @create: 2022-07-15 15:46
 * @version: 1.0.0
 */
public class Sub extends Base {

    {
        System.out.println("子类构造快");
    }


    private int a = getA();


    public Sub() {
        System.out.println("子类构造器");
    }

    public void test() {
        System.out.println(a);
    }

    public int getA() {
        System.out.println("属性初始化");
        return 123;
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.test();
    }
}


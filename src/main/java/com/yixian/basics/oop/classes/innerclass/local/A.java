package com.yixian.basics.oop.classes.innerclass.local;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description :
 * @create : 2022-06-26 16:34
 */
public class A {

   private static final Logger LOGGER = LoggerFactory.getLogger(A.class);

    private final String NAME;

    public A(String name) {
        this.NAME = name;
    }

    public String getName() {
        return NAME;
    }


    public void test() {

        class B {
            private final String NAME;

            public B(String name) {
                this.NAME = name;
            }

            public void show() {
                LOGGER.info("B的name = " + this.NAME);
                LOGGER.info("A的name = " + A.this.NAME);
            }
        }
        B b = new B("小猫");
        b.show();
    }

    public static void main(String[] args) {
        A a = new A("小狗");
        a.test();
    }
}

package com.yixian.basics.oop.classes.innerclass.anonymous;

/**
 * @program: JavaSeStudy
 * @description: 基类
 * @author: zhang_hj
 * @create: 2022-06-25 23:18
 * @version: 1.0.0
 */
public abstract class Base {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Base(String name) {
        this.name = name;
    }

    public abstract void method();
}

package com.yixian.basics.oop.polymorphic.dynamic_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 基类
 * @create : 2022-06-07 21:39
 */
public class Base {

	protected int age = 10;

	public int getAge() {
		return age;
	}

	public int sumByGet() {
		return getAge() + 10;
	}

	public int sumByProperty() {
		return age + 10;
	}
}


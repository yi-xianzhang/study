package com.yixian.basics.oop.polymorphic.pojo;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 基类，父类，超类
 * @create : 2022-06-06 20:05
 */
public class Base {

	public void say() {
		System.out.println(this.getClass().getTypeName() + " Base.say()...");
	}

	public void say(String name, int age) {
		System.out.println(this.getClass().getTypeName() +
			" Base.say(String name, String age)...");

	}
}


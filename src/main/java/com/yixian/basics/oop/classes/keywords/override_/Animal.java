package com.yixian.basics.oop.classes.keywords.override_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 基类
 * @create : 2022-06-05 23:48
 */
public class Animal {

	public void cry() {
		System.out.println(this.getClass().getTypeName() + ".test() : " +
			"动物叫");
	}

	public Object getInfo() {
		return this.getClass().getTypeName() + "动物";
	}

	protected void eat() {
		System.out.println(this.getClass().getTypeName() + ".test() : " +
			"动物吃");
	}

	protected void drink() {
		System.out.println(this.getClass().getTypeName() + ".test() : " +
			"动物喝");
	}
}


package com.yixian.basics.oop.classes.keywords.super_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 父类
 * @create : 2022-06-05 00:47
 */
public class Base {

	public int publicInt = 1;

	protected int protectedInt = 2;

	int detailInt = 3;

	private int privateInt = 4;

	public Base() {
		System.out.println(this.getClass().getTypeName() + ".Base()[public]" +
			"执行....");
	}

	protected Base(String name) {
		System.out.println(this.getClass().getTypeName() + ".Base()[protected]"+
			"执行....");
	}

	Base(String name,int age) {
		System.out.println(this.getClass().getTypeName() + ".Base()[detail]"+
			"执行....");
	}

	private Base(int age) {
		System.out.println(this.getClass().getTypeName() + ".Base()[private]"+
			"执行....");
	}

	public void publicMethod() {
		System.out.println(this.getClass().getTypeName() + ".publicMethod()" +
			"执行....");

	}

	protected void protectedMethod() {
		System.out.println(this.getClass().getTypeName() + ".protectedMethod" +
			"()执行....");
	}


	void detailMethod() {
		System.out.println(this.getClass().getTypeName() + ".detailMethod()" +
			"执行....");
	}

	private void privateMethod() {
		System.out.println(this.getClass().getTypeName() + ".privateMethod()" +
			"执行....");
	}


}


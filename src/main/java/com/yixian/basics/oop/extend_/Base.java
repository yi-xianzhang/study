package com.yixian.basics.oop.extend_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 父类
 * @create : 2022-06-05 00:47
 */
public class Base extends TopBase {

	public int publicInt = 1;

	protected int protectedInt = 2;

	int detailInt = 3;

	private int privateInt = 4;

	public Base() {
		System.out.println(this.getClass().getTypeName() + ".Base()执行....");
	}

	public Base(int publicInt, int protectedInt) {
		System.out.println(this.getClass().getTypeName() + ".Base(int publicInt," +
			" int protectedInt)执行....");
		this.publicInt = publicInt;
		this.protectedInt = protectedInt;
	}

	public void publicMethod() {
		System.out.println(this.getClass().getTypeName() + ".publicMethod()执行"+
			"....");
	}

	protected void protectedMethod() {
		System.out.println(this.getClass().getTypeName() + ".protectedMethod()" +
			"执行....");
	}


	void detailMethod() {
		System.out.println(this.getClass().getTypeName() + ".detailMethod()执行" +
			"....");
	}

	private void privateMethod() {
		System.out.println(this.getClass().getTypeName() + ".privateMethod()执行" +
			"....");
	}

	public int getPrivateInt() {
		System.out.println(this.getClass().getTypeName() + ".getPrivateInt()" +
			"执行....");
		return privateInt;
	}

	public void setPrivateInt(int privateInt) {
		this.privateInt = privateInt;
	}

	public void execPrivateMethod() {
		System.out.println(this.getClass().getTypeName() +
			".execPrivateMethod()执行....");
		this.privateMethod();
	}
}


package com.yixian.basics.variable;

/**
 * 变量作用域
 * 在Java的编程中，主要有两类变量： 成员变量和局部变量
 * 成员变量：作用域为整个类
 * 局部变量：作用域为定义它的代码块（必须先赋值在使用，包含方法和代码块）
 *
 * 变量赋值遵循就近原则
 */
public class VariableScope {

	/**
	 * 姓名, 变量随着对象的创建而创建，随对象的销毁而销毁
	 */
	private String name = "tony";   // 成员变量

	/**
	 * 年龄，变量随类的加载而创建，随类的销毁而销毁
	 */
	public static int age = 20;   // 成员变量

	public static final int DETAIL_AGE = 20;   // 成员变量



	{
		int num = 10;
	}

	/**
	 * 此方法中定义的变量为局部变量，生命周期随着方法的执行而创建，随方法的结束而销毁
	 */
	public void say() {
		int n = 10;
		String name = "jack";
	}

	public void eat() {
		System.out.println("在eat中使用, name = " + name);
		System.out.println("在eat中使用, age = " + age);
	}

	public void hi() {
		int x = 10;
	}

	public static void main(String[] args) {

	}
}



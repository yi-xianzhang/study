package com.yixian.basics.oop.extend_.exercise;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 练习一，看代码执行结果。
 * @create : 2022-06-05 03:48
 */
public class Exercise01 {

	public static void main(String[] args) {
		B b = new B();
	}
}

class A {
	A() {
		System.out.println("a");
	}

	A(String name) {
		System.out.println("a name");
	}
}

class B extends A {
	B() {
		this("abc");
		System.out.println("b");
	}

	B(String name) {
		System.out.println("b name");
	}
}


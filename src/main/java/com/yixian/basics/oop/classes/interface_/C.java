package com.yixian.basics.oop.classes.interface_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description :
 * @create : 2022-06-12 23:23
 */
public class C extends B implements A{
	public void pX() {
		System.out.println(super.x + " " + A.x);
	}

	public static void main(String[] args) {
		new C().pX();
	}
}

interface A {
	int x = 0;
}

class B {
	int x = 1;
}




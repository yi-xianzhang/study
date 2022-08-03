package com.yixian.basics.oop.extend_.exercise;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 练习二，看代码执行结果。
 * @create : 2022-06-05 03:48
 */
public class Exercise02 {

	public static void main(String[] args) {
		new CClass();
	}
}

class AClass {
	AClass() {
		System.out.println("我是A类");  // 1
	}
}

class BClass extends AClass {
	BClass() {
		System.out.println("我是B类的无参构造");
	}

	BClass(String name) {
		System.out.println(name + "我是B类的有参构造"); // 2
	}
}

class CClass extends BClass {
	public CClass() {
		this("hahah");
		System.out.println("我是C类的无参构造"); // 4
	}

	public CClass(String name) {
		super("hahah");
		System.out.println("我是C类的有参构造"); // 3
	}
}


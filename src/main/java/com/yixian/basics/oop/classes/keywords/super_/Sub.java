package com.yixian.basics.oop.classes.keywords.super_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 子类
 * @create : 2022-06-05 00:51
 */
public class Sub extends Base {

	public Sub() {
		super();
		System.out.println(this.getClass().getTypeName() + ".Sub()[public]" +
			"执行....");
	}

	protected Sub(String name) {
		super(name);
		System.out.println(this.getClass().getTypeName() + ".Sub()[protected]" +
			"执行....");
	}

	Sub(String name,int age) {
		super(name,age);
		System.out.println(this.getClass().getTypeName() + ".Sub()[detail]"+
			"执行....");
	}

	private Sub(int age) {
//		super(age);
		System.out.println(this.getClass().getTypeName() + ".Sub()[detail]"+
			"执行....");
	}

	/**
	 * 此处测试父类[超类、基类]的那些可以通过super访问的方法和属性
	 */
	public void getNotPrivateInfo() {
		// 属性
		System.out.println("super.detailInt = " + super.detailInt);
		System.out.println("super.publicInt = " + super.publicInt);
		System.out.println("super.protectedInt = " + super.protectedInt);
		// 方法
		super.detailMethod();
		super.protectedMethod();
		super.publicMethod();
	}


	/**
	 * 此处测试父类[超类、基类]的那些可以通过super访问的构造器
	 */
	public static void getNotPrivateConstructor() {
		new Sub();
		new Sub("jack");
		new Sub("jack",45);
	}


}


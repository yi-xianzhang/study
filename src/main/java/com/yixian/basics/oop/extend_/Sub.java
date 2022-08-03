package com.yixian.basics.oop.extend_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 子类
 * @create : 2022-06-05 00:51
 */
public class Sub extends Base {

	public Sub() {
		super(2,4); // 必须放在第一行
		System.out.println(this.getClass().getTypeName() + ".Sub()执行....");
	}

	public Sub(int protectedInt) {
		super(2,4); // 必须放在第一行
		System.out.println(this.getClass().getTypeName() + ".Sub(int " +
			"protectedInt)执行....");
		this.protectedInt = protectedInt;
	}

	/**
	 * 此处测试父类的那些方法和属性可以访问
	 * 经过测试，发现父类的非私有化的方法和属性均可直接访问
	 */
	public void notPrivateMethod() {

		// 属性
		System.out.println("this.detailInt = " + this.detailInt);
		System.out.println("this.publicInt = " + this.publicInt);
		System.out.println("this.protectedInt = " + this.protectedInt);

		// 方法
		this.detailMethod();
		this.protectedMethod();
		this.publicMethod();
	}

	/**
	 * 此处测试父类的那些私有方法和属性可以通过非私有的方法间接访问
	 */
	public void privateByNotPrivateMethod() {
		// 属性
		System.out.println("this.getPrivateInt = " + this.getPrivateInt());
		// 方法
		this.execPrivateMethod();
	}


}


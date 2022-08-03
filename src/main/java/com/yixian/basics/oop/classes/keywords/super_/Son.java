package com.yixian.basics.oop.classes.keywords.super_;

import com.yixian.basics.oop.extend_.ExtendsEssence;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 儿子
 * @create : 2022-06-05 05:37
 */
public class Son extends Father {

	private String name = "小头儿子";

	private int age = 10;




	@Override
	public void say() {
		System.out.println("Son say ----");
	}

	/**
	 * 父类[超类、基类]的name和age与子类[派生类]重名时，使用super和this的差别
	 * {@link Father#name}、{@link Father#age}与{@link Son#name}、{@link Son#age}
	 * 父类[超类、基类]的say和子类[派生类]say重名时，使用super和this的差别
	 * {@link Father#say()}与{@link Son#say()}
	 */
	public void sameMember() {

		System.out.println("================相同的属性================");
		/**
		 * 查找规则参见下记类 {@link ExtendsEssence}
		 */
		System.out.println("super.name = " + super.name);
		System.out.println("super.age = " + super.age);
		System.out.println("this.name = " + this.name);
		System.out.println("this.age = " + this.age);

		System.out.println("================相同的方法================");
		System.out.println("=========super.say()=========");
		super.say();
		System.out.println("=========this.say()=========");
		this.say();
		System.out.println("=========say()=========");
	}

	/**
	 * 父类[超类、基类]的hobby与子类[派生类]重名时，使用super和this的差别
	 * {@link Father#hobby}与{@link Son#hobby}
	 * 父类[超类、基类]的drink()和子类[派生类]重名时，使用super和this的差别
	 * {@link Father#drink()}与{@link Son#drink()}
	 */
	public void differentMember() {

		System.out.println("================不同的属性================");
		System.out.println("super.hobby = " + super.hobby);
		System.out.println("this.hobby = " + this.hobby);

		System.out.println("================不同的方法================");
		System.out.println("=========super.drink()=========");
		super.drink();
		System.out.println("=========this.drink()=========");
		this.drink();
		System.out.println("=========drink()=========");
		/**
		 * 寻找这个方法时{@link Son#drink()}
		 */
		drink();
	}




}


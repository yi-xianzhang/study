package com.yixian.basics.oop.classes.keywords.super_;

import org.junit.Test;

/**
 * super关键字的使用学习。
 * <p>
 * 1.释义 ：super 表示父类的引用，用于访问父类[超类、基类]的属性、方法、构造器。
 * 2.语法 :
 * (1). 访问父类[超类、基类]的属性，父类[超类、基类]的属性在子类可见。
 * 详细参见{@link SuperKeyWordsStarter#getNotPrivateInfoTestOfSub()}
 * <p>
 * (2). 访问父类[超类、基类]的方法，父类[超类、基类]的方法在子类可见。
 * 详细参见{@link SuperKeyWordsStarter#getNotPrivateInfoTestOfSub()}
 * <p>
 * (3). 访问父类[超类、基类]的构造器，父类[超类、基类]的构造器在子类可见。
 * 详细参见{@link SuperKeyWordsStarter#getNotPrivateConstructorTest()}
 * 3.细节 ：
 * (1).调用父类构造器的好处(分工明确,父类[超类、基类]属性由父类[超类、基类]初始化,
 * 子类[派生类]属性由子类[派生类]初始化)。
 * 参见{@link Computer#Computer(String, double, double)}、
 *     {@link PC#PC(String, double, double, String)}、
 *     {@link NotePad#NotePad(String, double, double, String)}参照。
 *
 * (2).子类[派生类]和父类[超类、基类]有方法和属性重名时，为了访问父类[超类、基类]
 * 的方法和属性，必须过super，
 * 具体参见{@link SuperKeyWordsStarter#sameMemberTest()}
 * 如果没有重名，使用super和this，直接访问效果一样,
 * 具体参见{@link SuperKeyWordsStarter#differentMemberTest()}
 *
 * (3).使用super访问遵循就近原则。
 *
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : super关键字
 * @create : 2022-06-05 00:45
 */
public  class SuperKeyWordsStarter {

	/**
	 * 语法(1)、(2)，参见{@link Sub#getNotPrivateInfo()}，
	 * 注意{@link Base}和{@link Sub}的关系
	 */
	@Test
	public void getNotPrivateInfoTestOfSub() {
		Sub sub = new Sub();
		sub.getNotPrivateInfo();
	}

	/**
	 * 语法(3)参见{@link Sub#getNotPrivateConstructor()}，
	 * 注意{@link Base}和{@link Sub}的关系
	 */
	@Test
	public void getNotPrivateConstructorTest() {
		Sub.getNotPrivateConstructor();
	}

	/**
	 * 细节(1)，参见{@link Son#sameMember()}，
	 * 注意{@link Father}和{@link Son}的关系
	 */
	@Test
	public void sameMemberTest() {
		new Son().sameMember();
	}

	/**
	 * 细节(2)，参见{@link Son#differentMember()}，
	 * 注意{@link Father}和{@link Son}的关系
	 */
	@Test
	public void differentMemberTest() {
		new Son().differentMember();
	}


}


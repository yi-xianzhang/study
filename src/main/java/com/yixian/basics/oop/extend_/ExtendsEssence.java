package com.yixian.basics.oop.extend_;

/**
 * 按照查找规则，先看子类是否有该属性，且可以访问，则返回信息，
 * 若子类没有这个属性，去父类查找看父类是否有该属性，且可以访问，则返回信息，
 * 若子类有这个属性，但不可以访问，报编译错误。
 * <p>
 * 若父类没有这个属性，，去父类的父类查找看类的父类是否有该属性，且可以访问，
 * 则返回信息，
 * 若父类有这个属性，但不可以访问，报编译错误。
 * <p>
 * ......
 * 直到顶级父类，查找看顶级父类{@link Object}是否有该属性，且可以访问，则返回信息，
 * 否则，报编译错误。
 *
 * 方法的亦同上
 *
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 类继承的本质，内存分析图详见下记路径
 * com\yiixan\basics\oop\threeharacteristics\extend_\类的继承内存分析图.png
 * @create : 2022-06-05 02:51
 */
public class ExtendsEssence {

	public static void main(String[] args) {
		System.out.println(" Son son = new Son(); ------------");
		// 访问大头孙子
		Son son = new Son();
		System.out.println(son.name);
		System.out.println(" GrandPa son2 = new Son(); ------------");
		// 访问大头爷爷,向上转型，多态详解
		GrandPa son2 = new Son();
		System.out.println(son2.name);
		System.out.println(son2.hobby);

		System.out.println(" Father son3 = new Son(); ------------");
		// 访问大头爸爸,向上转型，多态详解
		Father son3 = new Son();
		System.out.println(son3.name);
		System.out.println(son3.age);
		System.out.println(son3.hobby);

	}
}

class GrandPa {
	String name = "大头爷爷";
	String hobby = "旅游";
}

class Father extends GrandPa {
	String name = "大头爸爸";
	int age = 39;
}

class Son extends Father {
	String name = "大头孙子";
}


package com.yixian.basics.oop.classes.keywords.abstract_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 动物
 * @create : 2022-06-12 18:58
 */
public abstract class Animal {

	private String name;

	public Animal(String name) {
		this.name = name;
	}

	/**
	 * 父类方法不确定时，将方法设计为抽象方法。没有方法体。
	 */
	public abstract void eat();

//	public abstract void drink() {
//
//	}

}


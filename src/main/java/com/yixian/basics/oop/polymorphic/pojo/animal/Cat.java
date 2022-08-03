package com.yixian.basics.oop.polymorphic.pojo.animal;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 猫猫类
 * @create : 2022-06-06 19:27
 */
public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	public Cat() {
	}

	public void cry() {
		System.out.println(this.getClass().getTypeName() +
			"： Cat[对象].cry() 小猫喵喵叫.......");
	}


}


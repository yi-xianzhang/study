package com.yixian.basics.oop.polymorphic.pojo.animal;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 狗狗类
 * @create : 2022-06-06 19:28
 */
public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	public Dog() {
	}

	@Override
	public void cry() {
		System.out.println(this.getClass().getTypeName() +
			"： Dog[对象].cry() 小狗汪汪叫.......");
	}


}


package com.yixian.basics.oop.polymorphic;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 向上/下转型使用的猫猫类
 * @create : 2022-06-06 20:58
 */
public class CatByUseCast extends AnimalByUseCast {

	protected int count = 23;

	public CatByUseCast(String name, int age) {
		super(name,age);
	}

	public CatByUseCast() {
	}


	@Override
	public String toString() {
		return "CatByUseUpCast{" +
			"name='" + getName() + '\'' +
			", age=" + getAge() +
			"}";
	}

	@Override
	public boolean equals(Object o) {
		return super.equals(o);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	public void eat() {
		System.out.println(this.getClass().getTypeName() +
			"  CatByUseCast[对象].eat.....猫吃鱼.....");
	}

	public void catchMouse() {
		System.out.println(this.getClass().getTypeName() +
			"  CatByUseCast[对象].catchMouse.....抓老鼠.....");
	}

}


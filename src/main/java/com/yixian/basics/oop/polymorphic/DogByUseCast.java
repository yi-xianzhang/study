package com.yixian.basics.oop.polymorphic;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 向上/下转型使用的猫猫类
 * @create : 2022-06-06 20:58
 */
public class DogByUseCast extends AnimalByUseCast {

	public DogByUseCast(String name, int age) {
		super(name,age);
	}

	public DogByUseCast() {
	}


	@Override
	public String toString() {
		return "DogByUseCast{" +
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

	public void catchMouse() {
		System.out.println(this.getClass().getTypeName() +
			"  CatByUseCast[对象].catchMouse.....抓老鼠，多管闲事.....");
	}

}


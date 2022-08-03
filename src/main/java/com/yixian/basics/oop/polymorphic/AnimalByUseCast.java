package com.yixian.basics.oop.polymorphic;

import java.util.Objects;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 向上/下转型使用动物类
 * @create : 2022-06-06 20:58
 */
public class AnimalByUseCast {
	private String name;
	private int age;

	protected int count = 12;

	public AnimalByUseCast(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public AnimalByUseCast() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AnimalByUseCast animal = (AnimalByUseCast) o;
		return age == animal.age &&
			Objects.equals(name, animal.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public String toString() {
		return "Animal{" +
			"name='" + name + '\'' +
			", age=" + age +
			'}';
	}

	public void sleep() {
		System.out.println(this.getClass().getTypeName() +
			"  AnimalByUseCast[对象].sleep.....睡.....");
	}

	public void run() {
		System.out.println(this.getClass().getTypeName() +
			"  AnimalByUseCast[对象].run.....睡.....");
	}

	public void eat() {
		System.out.println(this.getClass().getTypeName() +
			"  AnimalByUseCast[对象].eat.....吃.....");
	}

	public void show() {
		System.out.println(this.getClass().getTypeName() +
			"  AnimalByUseCast[对象]show.....hello,你好.....");
	}
}


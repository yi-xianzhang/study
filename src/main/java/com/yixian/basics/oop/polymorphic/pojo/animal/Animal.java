package com.yixian.basics.oop.polymorphic.pojo.animal;

import java.util.Objects;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 动物类
 * @create : 2022-06-06 19:26
 */
public class Animal {

	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public Animal() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Animal animal = (Animal) o;
		return Objects.equals(name, animal.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		return "Animal{" +
			"name='" + name + '\'' +
			'}';
	}


	public void cry() {
		System.out.println(this.getClass().getTypeName() +
			"： Animal[对象].cry() 动物在叫.......");
	}
}


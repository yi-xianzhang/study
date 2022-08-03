package com.yixian.basics.oop.classes.keywords.override_.exercise;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 人类
 * @create : 2022-06-06 00:34
 */
public class Person {

	private String name;

	private short age;

	public Person(String name, short age) {
		this.name = name;
		this.age = age;
	}

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public String say() {
		return toString();
	}

	@Override
	public String toString() {
		return "Person{" +
			"name='" + name + '\'' +
			", age=" + age +
			'}';
	}
}


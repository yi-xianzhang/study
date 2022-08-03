package com.yixian.basics.oop.classes.keywords.override_.exercise;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 学生类
 * @create : 2022-06-06 00:37
 */
public class Student extends Person {

	private String id;

	private double score;

	public Student(String name, short age, String id, double score) {
		super(name, age);
		this.id = id;
		this.score = score;
	}

	public Student(String id, double score) {
		this.id = id;
		this.score = score;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "Student{" +
			"name='" + this.getName() + '\'' +
			", age=" + this.getAge() +
			",id='" + id + '\'' +
			", score=" + score +
			'}';
	}

	@Override
	public String say() {
		return toString();
	}
}


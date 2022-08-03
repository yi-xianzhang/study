package com.yixian.basics.oop.polymorphic.dynamic_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 学生类
 * @create : 2022-06-07 22:12
 */
public class Student extends Person{

	private double score;

	public Student(String name, int age, double score) {
		super(name, age);
		this.score = score;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student{" +
			"score=" + score +
			", name='" + this.getName() + '\'' +
			", age=" + this.getAge() +
			'}';
	}

	public String say() {
		return toString() + "学生说";
	}

	public String study() {
		return toString() + "学生学习";
	}
}


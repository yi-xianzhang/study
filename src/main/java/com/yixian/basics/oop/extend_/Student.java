package com.yixian.basics.oop.extend_;

import java.util.Objects;

/**
 * 学生类
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 学生类
 * @create : 2022-06-04 23:59
 */
public class Student implements Comparable<Student>{

	private String name;

	protected short age;

	protected double score;

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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public void testing() {

	}

	public void showInfo() {
		System.out.println(this.toString());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return age == student.age &&
			Double.compare(student.score, score) == 0 &&
			Objects.equals(name, student.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age, score);
	}

	@Override
	public String toString() {
		return "Student{" +
			"name='" + name + '\'' +
			", age=" + age +
			", score=" + score +
			'}';
	}

	public Student() {
	}

	public Student(String name, short age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}


	@Override
	public int compareTo(Student o) {
		if (o == null) {
			return 1;
		}
		return this.score > o.score ? 1 : (this.score == o.score ? 0 : -1);
	}
}


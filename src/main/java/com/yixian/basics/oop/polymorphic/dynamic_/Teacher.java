package com.yixian.basics.oop.polymorphic.dynamic_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 老师类
 * @create : 2022-06-07 22:14
 */
public class Teacher extends Person{


	private double salary;


	public Teacher(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teacher{" +
			"salary=" + salary +
			", name='" + getName() + '\'' +
			", age=" + getAge() +
			'}';
	}

	public String say() {
		return toString() + "老师说";
	}

	public String teach() {
		return toString() + "老师教书";
	}
}


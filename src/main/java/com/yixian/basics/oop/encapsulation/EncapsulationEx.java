package com.yixian.basics.oop.encapsulation;

import java.util.Objects;

/**
 * 封装类，一般地，将属性私有化, 并提供访问器和修改器
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 封装的典型案例
 * @create : 2022-06-04 22:37
 */
public class EncapsulationEx {

	private double salary;

	private byte age;

	private String name;


	public EncapsulationEx(double salary, byte age, String name)
		throws Exception {

		checkName(name);
		this.name = name;

		this.salary = salary;
		checkAge(age);
		this.age = age;
	}

	private void checkName(String name) throws Exception {

		Objects.requireNonNull(name,"要求name必须在2~6位之间");
		if (name.length() < 2 || name.length() > 6) {
			throw new Exception("要求name必须在2~6个字符之间");
		}

	}

	private void checkAge(byte age) throws Exception {
		if (age < 1 || age > 120) {
			throw new Exception("要求age必须在1~120之间");
		}
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) throws Exception {
		checkAge(age);
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		checkName(name);
		this.name = name;
	}

	@Override
	public String toString() {
		return "EncapsulationEx{" +
			"salary=" + salary +
			", age=" + age +
			", name='" + name + '\'' +
			'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		EncapsulationEx that = (EncapsulationEx) o;
		return Double.compare(that.salary, salary) == 0 &&
			age == that.age &&
			Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(salary, age, name);
	}
}


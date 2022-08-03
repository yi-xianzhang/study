package com.yixian.basics.oop.classes.keywords.abstract_.exercise;

import java.util.Objects;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 雇员类
 * @create : 2022-06-12 19:39
 */
public abstract class Employee {

	private String name;

	private String id;

	private double salary;

	public Employee(String name, String id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return Double.compare(employee.salary, salary) == 0 &&
			Objects.equals(name, employee.name) &&
			Objects.equals(id, employee.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, id, salary);
	}

	@Override
	public String toString() {
		return "Employee{" +
			"name='" + name + '\'' +
			", id='" + id + '\'' +
			", salary=" + salary +
			'}';
	}

	public abstract void  work();
}


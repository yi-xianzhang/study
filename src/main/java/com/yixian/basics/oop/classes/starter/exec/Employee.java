package com.yixian.basics.oop.classes.starter.exec;

/**
 * 雇员
 */
public class Employee {

	private String name;

	private String gender;

	private short age;

	private String job;

	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String name, String gender, short age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Employee() {
	}

	public Employee(String job, double salary) {
		this.job = job;
		this.salary = salary;
	}

	public Employee(String name, String gender, short age, String job,
	                double salary) {
		this(name,gender,age); // 必须放在第一行
		this.job = job;
		this.salary = salary;
	}

	public double method(double ... args) {
		return 0.0;
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee.method(
			employee.method(10.0 , 20.0) , 100));
	}
}

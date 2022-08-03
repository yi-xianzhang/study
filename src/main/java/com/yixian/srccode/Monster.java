package com.yixian.srccode;

/**
 * 妖怪
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description :
 * @create : 2022-06-12 01:43
 */
public class Monster {

	private String name;

	private String job;

	private double salary;

	public Monster(String name, String job, double salary) {
		this.name = name;
		this.job = job;
		this.salary = salary;
	}

	public Monster() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Monster{" +
			"name='" + name + '\'' +
			", job='" + job + '\'' +
			", salary=" + salary +
			'}';
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("---finalize-----");
	}
}


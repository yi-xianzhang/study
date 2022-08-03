package com.yixian.basics.oop.classes.keywords.abstract_.exercise;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 普通员工类
 * @create : 2022-06-12 19:45
 */
public class CommonEmployee extends Employee{

	public CommonEmployee() {
	}

	public CommonEmployee(String name, String id, double salary) {
		super(name,id,salary);
	}

	@Override
	public String toString() {
		return "CommonEmployee{" +
			"name='" + getName() + '\'' +
			", id='" + getId() + '\'' +
			", salary=" + getSalary() +
			'}';
	}

	@Override
	public void work() {
		System.out.println(this.toString() + "工作中....");
	}
}


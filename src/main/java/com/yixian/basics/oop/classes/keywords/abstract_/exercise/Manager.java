package com.yixian.basics.oop.classes.keywords.abstract_.exercise;

import java.util.Objects;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 经理类
 * @create : 2022-06-12 19:41
 */
public class Manager extends Employee{

	private double bonus;

	public Manager(double bonus) {
		this.bonus = bonus;
	}

	public Manager(String name, String id, double salary,double bonus) {
		super(name,id,salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Manager manager = (Manager) o;
		return Double.compare(manager.bonus, bonus) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), bonus);
	}

	@Override
	public String toString() {
		return "Manager{" +
			"name='" + getName() + '\'' +
			", id='" + getId() + '\'' +
			", salary=" + getSalary() +
			", bonus=" + bonus +
			'}';
	}

	@Override
	public void work() {
		System.out.println(this.toString() + "工作中");
	}
}


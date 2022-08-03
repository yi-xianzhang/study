package com.yixian.basics.oop.classes.keywords.static_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 学生类
 * @create : 2022-06-12 03:11
 */
public class Student {

	private String name;

	private static volatile double totalTuition = 0;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static double getTotalTuition() {
		return totalTuition;
	}

	public void payTuition(double tuition) {
		synchronized (this) {
			Student.totalTuition += tuition;
		}
	}
}


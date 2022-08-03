package com.yixian.basics.oop.extend_;

/**
 * {@link Student} 是此类的父类[超类，基类]
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 大学生类
 * @create : 2022-06-05 00:23
 */
public class Graduate extends Student {

	@Override
	public void testing() {
		System.out.println("大学生考试," + this.getName() + ",正在考高等数学，" +
			"成绩是：" + this.getScore());
	}

	@Override
	public String toString() {
		return "Graduate{" +
			"name='" + super.getName() + '\'' +
			", age=" + age +
			", score=" + score +
			'}';
	}
}


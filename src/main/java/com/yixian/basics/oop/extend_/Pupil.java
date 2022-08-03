package com.yixian.basics.oop.extend_;

/**
 * {@link Student} 是此类的父类[超类，基类]
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 小学生类
 * @create : 2022-06-05 00:23
 */
public class Pupil extends Student {

	@Override
	public void testing() {
		System.out.println("小学生考试," + this.getName() + ",正在考小学数学，成绩是：" +
			this.getScore());
	}

	@Override
	public String toString() {
		return "Pupil{" +
			"name='" + this.getName() + '\'' +
			", age=" + age +
			", score=" + score +
			'}';
	}
}


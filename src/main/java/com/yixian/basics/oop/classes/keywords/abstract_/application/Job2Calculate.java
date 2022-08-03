package com.yixian.basics.oop.classes.keywords.abstract_.application;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 执行计算任务
 * @create : 2022-06-12 20:54
 */
public class Job2Calculate extends AbstractTemplate{

	@Override
	public void job() {
		System.out.println("计算任务开始，计算1-100之积---");
		long sum = 1;
		for (int i = 1; i <= 7; i++) {
			sum *= i;
		}
		System.out.println("计算任结束，1-100之积 = " + sum);
	}
}


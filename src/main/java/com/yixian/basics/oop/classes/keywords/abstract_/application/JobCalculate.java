package com.yixian.basics.oop.classes.keywords.abstract_.application;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 执行计算任务
 * @create : 2022-06-12 20:54
 */
public class JobCalculate extends AbstractTemplate{

	@Override
	public void job() {
		System.out.println("计算任务开始，计算0-10000之和---");
		int sum = 0;
		for (int i = 0; i <= 1000;i++) {
			sum += i;
		}
		System.out.println("计算任结束，0-10000之和 = " + sum);
	}
}


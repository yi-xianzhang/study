package com.yixian.basics.oop.classes.keywords.abstract_.application;

import org.junit.Test;

/**
 * 抽象模板设计模式。
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 模版设计模式
 * @create : 2022-06-12 19:54
 */
public class ApplicationStarter {

	@Test
	public void exercise() {
		JobCalculate jobCalculate = new JobCalculate();
		jobCalculate.exec();
		Job2Calculate job2Calculate = new Job2Calculate();
		job2Calculate.exec();
	}

}


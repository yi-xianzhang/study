package com.yixian.basics.oop.classes.keywords.abstract_.application;

/**
 * 模版设计模式
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 抽象任务
 * @create : 2022-06-12 20:47
 */
public abstract class AbstractTemplate {

	public AbstractTemplate() {

	}

	public void exec() {
		// 获取开始时间
		Long startTime = System.currentTimeMillis();
		System.out.println("job开始执行,开始时间为 = " + startTime + "ms");
		this.job();
		// 获取结束时间
		Long endStart = System.currentTimeMillis();
		System.out.println("job执行结束,结束时间为 = " + startTime + "ms," +
			"共耗时" + (endStart - startTime) + "ms");
	}

	/**
	 * 实际的工作任务
	 */
	public abstract void job();
}


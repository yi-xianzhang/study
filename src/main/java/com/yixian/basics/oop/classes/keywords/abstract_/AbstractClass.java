package com.yixian.basics.oop.classes.keywords.abstract_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 抽象类
 * @create : 2022-06-12 19:09
 */
public abstract class AbstractClass {

	static {
		System.out.println("------AbstractClass静态初始化块------");
	}

	{
		System.out.println("------AbstractClass动态初始化块------");
	}

	private String property;

	public AbstractClass(String property) {
		this.property = property;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public void print() {
		System.out.println("--抽象类----");
	}
}


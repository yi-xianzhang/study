package com.yixian.basics.oop.classes.block.order;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 基类
 * @create : 2022-06-12 16:06
 */
@SuppressWarnings("all")
public class Base {

	static {
		System.out.println("------------Base静态代码块执行--------------");
		staticProperty = 5;
		getStaticProperty();
	}

	private static int staticProperty = getStaticProperty();

	private static int getStaticProperty() {
		System.out.println("------------Base静态属性初始化执行--------------");
		return 12;
	}

	public Base() {
		System.out.println("------------Base构造器执行--------------");
	}

	{
		System.out.println("------------Base普通代码块执行--------------");
	}

	private String name = getDefaultProperty();

	private String getDefaultProperty() {
		System.out.println("-----Base动态态属性初始化执行-------");
		return "ssss";
	}
}


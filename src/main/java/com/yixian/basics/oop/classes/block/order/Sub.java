package com.yixian.basics.oop.classes.block.order;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 子类
 * @create : 2022-06-12 16:06
 */
public class Sub extends Base {

	static {
		System.out.println("------------Sub静态代码块执行--------------");
	}

	private static int staticProperty = getStaticProperty();

	private static int getStaticProperty() {
		System.out.println("------------Sub静态属性初始化执行--------------");
		return 12;
	}

	public Sub() {
		System.out.println("------------Sub构造器执行--------------");
	}

	{
		System.out.println("------------Sub普通代码块执行--------------");
	}

	private String name = getDefaultProperty();

	private String getDefaultProperty() {
		System.out.println("-----Sub动态态属性初始化执行-------");
		return "ssss";
	}
}


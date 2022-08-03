package com.yixian.basics.oop.classes.block;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 子类
 * @create : 2022-06-12 10:30
 */
public class SubStaticBlock extends BaseStaticBlock {

	protected static int staticProperty = getStaticDefault();

	protected static int staticProperty2 = getStaticDefault2();


	static {
		System.out.println("-------SubStaticBlock的静态代码块执行-------");
	}

	public static void staticMethod() {
		System.out.println("-------SubStaticBlock.staticMethod-------");
	}

	public static int getStaticDefault() {
		System.out.println("-------SubStaticBlock.getStaticDefault-------");
		return 78;
	}

	public static int getStaticDefault2() {
		System.out.println("-------SubStaticBlock.getStaticDefault2-------");
		return 78;
	}

	{
		System.out.println("-------SubStaticBlock的动态态代码块执行-------");
	}
}


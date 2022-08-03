package com.yixian.basics.oop.classes.block;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 基类
 * @create : 2022-06-12 10:30
 */
@SuppressWarnings("all")
public class BaseStaticBlock {

	public BaseStaticBlock() {
		System.out.println("------BaseStaticBlock()构造方法调用-------");
	}

	public BaseStaticBlock(int age, String name) {
		this.age = age;
		this.name = name;
	}

	static {
		System.out.println("-------BaseStaticBlock的静态代码块执行-------");
	}

	private int age = getPropertyAge();

	private int getPropertyAge() {
		System.out.println("-------BaseStaticBlock.getPropertyAge-------");
		return 111111;
	}


	{
		System.out.println("-------BaseStaticBlock的动态代码块1执行-------");
	}


	private String name = getProperty();

	private String getProperty() {
		System.out.println("-------BaseStaticBlock.getProperty-------");
		return "111111";
	}

	protected static int staticProperty = getStaticDefault();

	protected static int staticProperty2 = getStaticDefault2();

	{
		System.out.println("-------BaseStaticBlock的动态态代码块2执行-------");
	}

	public static int getStaticDefault() {
		System.out.println("-------BaseStaticBlock.getStaticDefault-------");
		return 78;
	}

	public static int getStaticDefault2() {
		System.out.println("-------BaseStaticBlock.getStaticDefault2-------");
		return 78;
	}

}


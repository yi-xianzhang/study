package com.yixian.basics.oop.classes.block;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 代码块演示
 * @create : 2022-06-12 10:45
 */
public class BlockDemo {

	private String name;

	private double price;

	private String director;

	public BlockDemo(String name) {
		System.out.println("---------" + this.getClass().getTypeName() +
			".BlockDemo(String name) ---------");
		this.name = name;
	}

	public BlockDemo(String name, double price) {
		System.out.println("---------" + this.getClass().getTypeName() +
			".BlockDemo(String name, double price) ---------");
		this.name = name;
		this.price = price;
	}

	public BlockDemo(String name, double price, String director) {
		System.out.println("---------" + this.getClass().getTypeName() +
			".BlockDemo(String name, double price, String director) " +
			"---------");
		this.name = name;
		this.price = price;
		this.director = director;
	}

	static {
		System.out.println("-------Base的静态代码块执行-------");
	}

	{
		System.out.println("-------Base的普通代码块执行-------");
		System.out.println("------------AAA--------");
		System.out.println("------------BBB--------");
		System.out.println("------------CCC--------");
	}
}


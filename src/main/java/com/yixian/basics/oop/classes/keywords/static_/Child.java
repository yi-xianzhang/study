package com.yixian.basics.oop.classes.keywords.static_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 孩子类
 * @create : 2022-06-12 02:16
 */
public class Child {

	private String name;

	/**
	 * 静态成员，类变量
	 */
	protected static volatile int totalNum = 0;

	public Child(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void join() {
		System.out.println(name + "小孩加入游戏...");
		synchronized (this) {
			totalNum++;
		}
	}

	public static int getCount() {
		return totalNum;
	}

	public static String test() {
		return "";
	}
}


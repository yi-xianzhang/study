package com.yixian.basics.oop.classes.keywords.static_.application;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 饿汉式
 * @create : 2022-06-12 17:13
 */
public class HungrySingleton {

	private HungrySingleton() {
	}

	private static final HungrySingleton hungrySingleton =
		new HungrySingleton();

	public static HungrySingleton getInstance(){
		return hungrySingleton;
	}

}


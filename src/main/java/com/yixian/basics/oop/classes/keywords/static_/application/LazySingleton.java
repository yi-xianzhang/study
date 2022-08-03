package com.yixian.basics.oop.classes.keywords.static_.application;

/**
 * 懒汉式，非线程安全。
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 懒汉式
 * @create : 2022-06-12 17:13
 */
public class LazySingleton {

	private LazySingleton() {
	}

	private volatile static LazySingleton lazySingleton;

	/**
	 * 因为此处的赋值，非线程安全。
	 * @return
	 */
	public synchronized static LazySingleton getInstance() {
		while (lazySingleton == null) {
			lazySingleton = new LazySingleton();
			if (lazySingleton != null) {
				break;
			}
		}
		return lazySingleton;
	}

}


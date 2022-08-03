package com.yixian.basics.oop.classes.keywords.static_.application;

import org.junit.Test;

/**
 * 单例设计模式。
 *
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 单例模式
 * @create : 2022-06-12 17:08
 * 1. 懒汉式，私有化构造器，定义一个私有化的静态属性，在第一次调用时，通过暴露的方法将该
 * 私有化静态属性赋值并返回。参见{@link SingletonStarter#lazySingletonTest()}
 * <p>
 * 2. 饿汉式，私有化构造器，在类内部创建对象，赋值给类的私有化静态属性，对外暴露一个获取
 * 该类私有化静态属性的方法，可能造成资源浪费。
 * 参见{@link SingletonStarter#hungrySingletonTest()}
 *
 * 3.区别；
 * （1）. 创建对象的时机不同，前者在使用是才创建，后者在类加载时就创建了对象实例。
 * （2）. 前者存在线程安全的问题，后者不存在。
 *  (3). 饿汉式存在资源浪费的可能。
 *
 *  4. 其他使用案例：{@link Runtime},其为饿汉式。
 *
 */
public class SingletonStarter {

	/**
	 * 懒汉式
	 */
	@Test
	public void lazySingletonTest() {
		LazySingleton lazySingleton = LazySingleton.getInstance();
		LazySingleton lazySingleton2 = LazySingleton.getInstance();
		System.out.println(lazySingleton == lazySingleton2);
	}

	/**
	 * 饿汉式
	 */
	@Test
	public void hungrySingletonTest() {
		HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
		HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
		System.out.println(hungrySingleton1 == hungrySingleton2);
	}

}


package com.yixian.basics.oop.classes.innerclass.local;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 外部类
 * @create : 2022-06-13 22:16
 */
public class StaticOuterClass {

	private String name;

	private static final double PI = 3.14;

	public static void staticMethod() {

	}

	public void method() {
	}

	public static void test() {

		class LocalInnerClass {

			public void method() {
//				String name = StaticOuterClass.this.name;
//				StaticOuterClass.this.hashCode();
				double pi = StaticOuterClass.PI;
				StaticOuterClass.staticMethod();
			}

		}

		class LocalInnerClass2 {

//			public static void method() {
//			}
//
//			public static int age = 34;

		}
	}


}


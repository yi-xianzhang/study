package com.yixian.basics.oop.classes.innerclass.local;

/**
 * 局部内部类定义的位置。
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 局部内部类声明的位置
 * @create : 2022-06-13 23:27
 */
public class Location {

	{
		System.out.println("--- OuterClass... 动态初始化块------- ");

		class InitBlockClass {
		}
	}

	{
		System.out.println("--- OuterClass... 动态初始化块------- ");

		class InitBlockClass {
		}
	}

	static {
		System.out.println("--- OuterClass... 静态初始化块------- ");

		final class InitBlockClass {
		}
	}

	public void method() {
		class LocalInnerClass {
		}
	}

	public static void staticMethod() {
		class LocalInnerClass {

		}
	}

}


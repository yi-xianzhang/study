package com.yixian.basics.oop.classes.innerclass;

/**
 * 外部类
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 外部类
 * @create : 2022-06-13 21:37
 */
public class OuterClass {

	private int property = 10;

	private static int staticProperty = 45;


	static {
		System.out.println("----OuterClass...静态态初始化代码块----");
	}

	public OuterClass(int property) {
		System.out.println("----OuterClass...构造方法----");
		this.property = property;
	}

	{
		System.out.println("----动态初始化代码块----");
	}

	/**
	 * 方法
	 */
	public void publicMethod() {

		/**
		 * 匿名内部类
		 */
		InnerInterface innerInterface = new InnerInterface() {
			@Override
			public void test() {

			}
		};
	}

	protected void protectedMethod() {

		/**
		 * 局部内部类
		 */
		class LocalInnerClass {

		}
	}

	void defaultMethod() {

	}

	private void privateMethod() {

	}

	/**
	 * 动态内部类
	 */
	public class NotStaticInnerClassProperty {
		public  final Double PI = 3.14;

		public void method() {

		}
	}

	/**
	 * 静态成员内部类
	 */
	public static class StaticInnerClassProperty {
		public  final Double PI = 3.14;

		public static void method() {

		}

		static {
			System.out.println("----StaticInnerClassProperty..." +
				"静态态初始化代码块----");
		}
	}

	public interface InnerInterface {

		void test();
	}
}


package com.yixian.basics.oop.classes.innerclass.local;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 外部类
 * @create : 2022-06-13 22:16
 */
public class OuterClass {

	private String name;

	public OuterClass() {
	}

	public OuterClass(String name) {
		this.name = name;
	}

	public static final double PI = 3.14;

	public void test() {
		System.out.println("---OuterClass.test----");
		System.out.println("OuterClass.this" + this.hashCode());
	}

	public void method() {
		class LocalInnerClass {

			private String name = "局部内部类";

			public void method() {
				System.out.println("访问局部类属性： name = " + name);
				System.out.println("访问外部类属性： name = " +
					OuterClass.this.name);

				System.out.println(" ------内部类方法执行开始------");
				test();
				System.out.println(" ------内部类方法执行结束------");

				System.out.println(" ------外部类方法执行开始------");
				System.out.println("OuterClass.this" +
					OuterClass.this.hashCode());
				OuterClass.this.test();
				System.out.println(" ------外部类方法执行结束------");

				// 访问静态属性
				double pi = OuterClass.PI;
				OuterClass.staticMethod();
			}

			public void test() {
				System.out.println(" 局部内部类 LocalInnerClass.test ");
			}
		}
		LocalInnerClass localInnerClass = new LocalInnerClass();
		localInnerClass.method();
	}

	public static void staticMethod() {

	}


}


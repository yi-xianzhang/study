package com.yixian.basics.oop.classes.interface_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 接口的所使用案例
 * @create : 2022-06-12 21:45
 */
public interface Interface {

//	static {
//
//	}


	double PI = 3.14;

	int cal();

	default void method() {
		System.out.println("Interface.method() 执行" );
	}

//	default private void priavteMethod() {
//		System.out.println("Interface.method() 执行" );
//	}

//	default protected void protectedMethod() {
//		System.out.println("Interface.method() 执行");
//	}

	static void staticMethod() {
		System.out.println("Interface.staticMethod() 执行" );
	}

//	private static void staticPriavteMethod() {
//		System.out.println("Interface.staticMethod() 执行" );
//	}
//
//	protected static void staticPriavteMethod() {
//		System.out.println("Interface.staticMethod() 执行" );
//	}


}


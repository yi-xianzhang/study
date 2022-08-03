package com.yixian.basics.oop.classes.starter;

/**
 * 测试单一类的各种结构的执行顺序。
 */
public class JavaClassStudy {

	/**
	 * 静态方法
	 */
	public static int staticValue = staticValue();

	public static final int STATIC_FINAL = staticFinal();

	private int col = defaultFiledValue();

	private static int staticValue() {
		System.out.println("静态属性赋值时调用");
		return 11;
	}

	private static int staticFinal() {
		System.out.println("静态常量属性赋值时调用");
		return 22;
	}

	private int defaultFiledValue() {
		System.out.println("成员属性赋值时调用");
		return 22;
	}

	static {
		System.out.println("静态代码块执行");
	}

	{
		System.out.println("初始化代码块执行");
	}

	public JavaClassStudy() {
		System.out.println("构造方法执行");
	}

	public static void main(String[] args) {
		new JavaClassStudy();
	}
}

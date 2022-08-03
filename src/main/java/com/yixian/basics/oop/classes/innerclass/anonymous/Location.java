package com.yixian.basics.oop.classes.innerclass.anonymous;

/**
 * 匿名内部类定义的位置。
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 匿名内部类定义的位置
 * @create : 2022-06-15 21:52
 */
@SuppressWarnings("all")
public class Location {

	{
		AbstractBaseClass abstractBaseClass = new AbstractBaseClass() {
			@Override
			public void say() {

			}
		};
	}

	static {
		AbstractBaseClass abstractBaseClass = new AbstractBaseClass() {
			@Override
			public void say() {

			}
		};
	}


	public void method() {

		AbstractBaseClass abstractBaseClass = new AbstractBaseClass() {
			@Override
			public void say() {

			}
		};

	}

	public static void staticMethod() {

		AbstractBaseClass abstractBaseClass = new AbstractBaseClass() {
			@Override
			public void say() {
				System.out.println("抽象类的使用");
			}
		};
		abstractBaseClass.say();
		System.out.println(abstractBaseClass.getClass());
	}


	public static void main(String[] args) {
		staticMethod();
	}

}


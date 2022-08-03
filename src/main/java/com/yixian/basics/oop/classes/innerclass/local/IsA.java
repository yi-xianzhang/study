package com.yixian.basics.oop.classes.innerclass.local;

import java.util.List;

/**
 * 局部内部类的继承和实现。
 *
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 继承或者实现
 * @create : 2022-06-13 23:32
 */
public class IsA {

	public void method() {

		/**
		 * 局部内部类继承外部类报错。
		 */
		class OuterClassImpl extends IsA {

		}

		abstract class OuterClassImpl2 implements List {

		}

		class OuterClassExtends extends Object {

		}
	}


}


package com.yixian.basics.oop.classes.innerclass.local;

/**
 * 局部内部类的访问修饰符
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 局部内部类之访问修饰符
 * @create : 2022-06-13 23:25
 */
public class Modifier {

	public void method() {

		final class FinalClass {

		}

		/**
		 * 局部内部类，此类不存在默认的访问修饰符，
		 */
		class LocalInnerClass {

		}

		/**
		 * 如同方法的变量，不可使用 static 修饰
		 */
//		static class StaticTest {
//
//		}

		/**
		 * 如同方法的变量，不可使用 public 修饰
		 */
//		public class PublicTest {
//
//		}

		/**
		 * 如同方法的变量，不可使用 protected 修饰
		 */
//		protected class ProtectedTest {
//
//		}

		/**
		 * 如同方法的变量，不可使用 protected 修饰
		 */
//		private class PrivateTest {
//
//		}


	}
}


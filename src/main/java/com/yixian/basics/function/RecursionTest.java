package com.yixian.basics.function;

import org.junit.Test;

/**
 * 递归的使用练习。
 */
public final class RecursionTest {

	/**
	 * 递归方式求参数的阶乘。
	 *
	 * @param number int
	 * @return int
	 */
	public static int factorial(int number) {
		if (number <= 0) {
			return 1;
		}
		return factorial(number - 1) * number;
	}

	/**
	 * 求参数的阶乘的测试。
	 */
	@Test
	public void factorialTest() {
		System.out.println(factorial(6));
		System.out.println(factorial(5));
		System.out.println(factorial(4));
		System.out.println(factorial(3));
		System.out.println(factorial(2));
		System.out.println(factorial(1));
	}


	/**
	 * 初窥递归。
	 *
	 * @param n   canshu
	 */
	public static void recursion(int n) {
		if (n > 2) {
			recursion(n - 1);
		}
		System.out.println("n = " + n);
	}

	@Test
	public void recursionTest() {
		recursion(9);
	}

	/**
	 * 斐波那契数列的使用。
	 *
	 * @param number {@link Integer}
	 * @return int
	 */
	public static int fibonacciSequence(int number) {
		if (number <= 1) {
			return 1;
		}
		return fibonacciSequence(number - 1) +
			fibonacciSequence(number - 2);
	}

	/**
	 * 测试斐波那契数列的使用。
	 */
	@Test
	public void fibonacciSequenceTest() {
		for (int i = 0; i < 10; i++) {
			System.out.println("斐波那契fn(" + i + "） = " +
				fibonacciSequence(i));
		}
	}
}

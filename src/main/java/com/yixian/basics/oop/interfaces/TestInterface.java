package com.yixian.basics.oop.interfaces;


public interface TestInterface {

	double PI = 3.14;

	/**
	 * Applies this operator to the given operands.
	 *
	 * @param left  the first operand
	 * @param right the second operand
	 * @return the operator result
	 */
	int applyAsInt(int left, int right);

	boolean equals(Object obj);

	public String toString();


	public static int eat() {
		return 9;
	}
}

package com.yixian.basics.function;

/**
 * 方法的问题。</br>
 */
public class Functions {

	/**
	 * 方法的测试。</br>
	 *
	 * @return {@link Integer}
	 */
	public Integer getSum() {
		return 0;
	}

	/**
	 * 方法可变参数求多个参数之和
	 *
	 * @param args
	 */
	public Long sum(int... args) {
		if (args == null) {
			return 0L;
		}
		long sum = 0;

		for (int varTemp : args) {
			sum += varTemp;
		}
		return sum;
	}


}

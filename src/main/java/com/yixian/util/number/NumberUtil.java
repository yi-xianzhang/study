package com.yixian.util.number;

public final class NumberUtil {

	/**
	 * 判断一个数是否为偶数
	 *
	 * @param a
	 * @return
	 */
	public static final boolean even(long a) {
		return (a & 1) == 0;
	}

	/**
	 * 判断一个数是否为偶数
	 *
	 * @param a
	 * @return
	 */
	public static final boolean even(int a) {
		return (a & 1) == 0;
	}

	/**
	 * 判断一个数是否为偶数
	 *
	 * @param a
	 * @return
	 */
	public static final boolean even(short a) {
		return (a & 1) == 0;
	}

	/**
	 * 判断一个数是否为偶数
	 *
	 * @param a
	 * @return
	 */
	public static final boolean even(byte a) {
		return (a & 1) == 0;
	}

	/**
	 * 判断一个数是否为偶数
	 *
	 * @param a
	 * @return
	 */
	public static final boolean even(Long a) {
		return a == null ? false : (a.longValue() & 1) == 0;
	}

	/**
	 * 判断一个数是否为偶数
	 *
	 * @param a
	 * @return
	 */
	public static final boolean even(Integer a) {
		return a == null ? false : (a & 1) == 0;
	}

	/**
	 * 判断一个数是否为偶数
	 *
	 * @param a
	 * @return
	 */
	public static final boolean even(Short a) {
		return a == null ? false : (a & 1) == 0;
	}

	/**
	 * 判断一个数是否为偶数
	 *
	 * @param a
	 * @return
	 */
	public static final boolean even(Byte a) {
		return a == null ? false : (a & 1) == 0;
	}

	/**
	 * 判断一个数是否为奇数
	 *
	 * @param a
	 * @return
	 */
	public static final boolean oddNumber(long a) {
		return (a & 1) == 1;
	}


	/**
	 * 判断一个数是否为奇数
	 *
	 * @param a
	 * @return
	 */
	public static final boolean oddNumber(int a) {
		return (a & 1) == 1;
	}

	/**
	 * 判断一个数是否为奇数
	 *
	 * @param a
	 * @return
	 */
	public static final boolean oddNumber(short a) {
		return (a & 1) == 1;
	}

	/**
	 * 判断一个数是否为奇数
	 *
	 * @param a
	 * @return
	 */
	public static final boolean oddNumber(byte a) {
		return (a & 1) == 1;
	}

	/**
	 * 判断一个数是否为奇数
	 *
	 * @param a
	 * @return
	 */
	public static final boolean oddNumber(Long a) {
		return a == null ? false : (a.longValue() & 1) == 1;
	}


	/**
	 * 判断一个数是否为奇数
	 *
	 * @param a
	 * @return
	 */
	public static final boolean oddNumber(Integer a) {
		return a == null ? false : (a & 1) == 1;
	}

	/**
	 * 判断一个数是否为奇数
	 *
	 * @param a
	 * @return
	 */
	public static final boolean oddNumber(Short a) {
		return a == null ? false : (a & 1) == 1;
	}

	/**
	 * 判断一个数是否为奇数
	 *
	 * @param a
	 * @return
	 */
	public static final boolean oddNumber(Byte a) {
		return a == null ? false : (a & 1) == 1;
	}

	/**
	 * 判断一个数是否为2的幂数
	 *
	 * @param val
	 * @return
	 */
	public static final boolean isPowerOf2(long val) {
		return (val < 0 ? -val & (-val - 1) : val & (val - 1)) == 0;
	}

	/**
	 * 判断一个数是否为2的幂数
	 *
	 * @param val
	 * @return
	 */
	public static final boolean isPowerOf2(int val) {
		return (val < 0 ? -val & (-val - 1) : val & (val - 1)) == 0;
	}

	/**
	 * 判断一个数是否为2的幂数
	 *
	 * @param val
	 * @return
	 */
	public static final boolean isPowerOf2(short val) {
		return (val < 0 ? -val & (-val - 1) : val & (val - 1)) == 0;
	}

	/**
	 * 判断一个数是否为2的幂数
	 *
	 * @param val
	 * @return
	 */
	public static final boolean isPowerOf2(byte val) {
		return (val < 0 ? -val & (-val - 1) : val & (val - 1)) == 0;
	}

	/**
	 * 判断一个数是否为2的幂数
	 *
	 * @param val
	 * @return
	 */
	public static final boolean isPowerOf2(Long val) {
		return val == null ? false : (val < 0 ? -val & (-val - 1) : val & (val - 1)) == 0;
	}

	/**
	 * 判断一个数是否为2的幂数
	 *
	 * @param val
	 * @return
	 */
	public static final boolean isPowerOf2(Integer val) {
		return val == null ? false : (val < 0 ? -val & (-val - 1) : val & (val - 1)) == 0;
	}

	/**
	 * 判断一个数是否为2的幂数
	 *
	 * @param val
	 * @return
	 */
	public static final boolean isPowerOf2(Short val) {
		return val == null ? false : (val < 0 ? -val & (-val - 1) : val & (val - 1)) == 0;
	}

	/**
	 * 判断一个数是否为2的幂数
	 *
	 * @param val
	 * @return
	 */
	public static final boolean isPowerOf2(Byte val) {
		return val == null ? false : (val < 0 ? -val & (-val - 1) : val & (val - 1)) == 0;
	}

	/**
	 * 计算两个数的平均数
	 *
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static final long average(Long val1, Long val2) {
		return (val1 & val2) + (val1 ^ val2) >> 1;
	}

	/**
	 * 计算两个数的平均数
	 *
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static final int average(Integer val1, Integer val2) {
		return (val1 & val2) + (val1 ^ val2) >> 1;
	}

	/**
	 * 计算两个数的平均数
	 *
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static final short average(Short val1, Short val2) {
		return (short) ((val1 & val2) + (val1 ^ val2) >> 1);
	}

	/**
	 * 计算两个数的平均数
	 *
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static final byte average(Byte val1, Byte val2) {
		return (byte) ((val1 & val2) + (val1 ^ val2) >> 1);
	}

	/**
	 * 计算两个数的平均数
	 *
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static final long average(long val1, long val2) {
		return (val1 & val2) + (val1 ^ val2) >> 1;
	}

	/**
	 * 计算两个数的平均数
	 *
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static final int average(int val1, int val2) {
		return (val1 & val2) + (val1 ^ val2) >> 1;
	}

	/**
	 * 计算两个数的平均数
	 *
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static final short average(short val1, short val2) {
		return (short) ((val1 & val2) + (val1 ^ val2) >> 1);
	}

	/**
	 * 计算两个数的平均数
	 *
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static final byte average(byte val1, byte val2) {
		return (byte) ((val1 & val2) + (val1 ^ val2) >> 1);
	}

}

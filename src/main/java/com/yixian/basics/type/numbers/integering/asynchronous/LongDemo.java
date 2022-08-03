package com.yixian.basics.type.numbers.integering.asynchronous;

import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

/**
 * {@link Long}类：byte的包装器类型。
 * ---> {@link Number}抽象类。
 * ----> {@link Comparable<Long>}类，用来比较大小。
 *
 * @author Administrator
 * @since 1.1
 */
public class LongDemo extends AbstractTestTemplate<Long> {

	@Override
	protected void instanceMethodsOfThis() throws Exception {

	}

	@Override
	protected void staticMethodsOfThis() throws Exception {
		valueOf();
		getLong();
		decode();
		parseLong();
		toStringOfLong();
		numberOfLeadingZeros();
		toUnsignedString();
		toStringByRadix();
		System.out.println("Long.bitCount([long]2) :" + Long.bitCount(2));
		System.out.println("Long.compareUnsigned([long]12, [long]-34)" + Long.compareUnsigned(12, -34)
			+ ",first：" + (12 + Long.MIN_VALUE) + ",second：" + (-34 + Long.MIN_VALUE));
		System.out.println("Long.divideUnsigned([long]12, [long]23) : " + Long.divideUnsigned(230, 23));
		System.out.println("Long.highestOneBit([long]" + Long.MIN_VALUE + ") ：" + Long.highestOneBit(Long.MIN_VALUE));
		System.out.println("Long.highestOneBit([long]" + Long.MAX_VALUE + ") ：" + Long.highestOneBit(Long.MAX_VALUE));
		System.out.println("Long.lowestOneBit([long]1) ：" + Long.lowestOneBit(7));

		System.out.println("Long.remainderUnsigned([long]123, [long]123) : " + Long.remainderUnsigned(123, 123));
		System.out.println("Long.reverse([long]16) : " + Long.reverse(16));
		System.out.println("Long.reverseBytes([long]16) : " + Long.reverseBytes(16));
		System.out.println("Long.signum([long]123) : " + Long.signum(-123));
		System.out.println("Long.sum([long]" + Long.MAX_VALUE + ", [long]" + Long.MAX_VALUE + ") : "
			+ Long.sum(Long.MAX_VALUE - (5), 9));
	}

	/**
	 * {@link Long#decode(String)}方法测试
	 */
	private void decode() {
		System.out.println("Long.decode([String]1234567) :" + Long.decode("1234567"));
	}

	/**
	 * {@link Long#parseLong(String)}方法测试
	 * {@link Long#parseLong(String)}方法测试
	 */
	private void parseLong() {
		System.out.println("Long.parseLong([String]1234567) :" + Long.parseLong("1234567"));
		System.out.println("Long.parseLong([String]1234567,[int]8) :" + Long.parseLong("1234567", 8));
	}

	/**
	 * {@link Long#valueOf(long)}方法测试
	 * {@link Long#valueOf(String)}方法测试
	 * {@link Long#valueOf(String, int)}方法测试
	 */
	private static void valueOf() {
		System.out.println("Long.valueOf([long]1234567890L)：" + Long.valueOf(1234567890L));
		System.out.println("Long.valueOf([String]1234567890) : " + Long.valueOf("1234567890"));
		System.out.println("Long.valueOf([String]12345671234567, [int]8) :" + Long.valueOf("12345671234567", 8));
	}

	/**
	 * {@link Long#toString(long)}方法测试
	 * {@link Long#toString(long, int)}方法测试
	 */
	private static void toStringOfLong() {
		System.out.println("Long.toString([String]1233746575L) : " + Long.toString(-1233746575L));
		System.out.println("Long.toString([long]122334566, (int)8)" + Long.toString(122334566, 8));
	}

	/**
	 * {@link Long#toBinaryString(long)}方法测试,2进制
	 * {@link Long#toOctalString(long)}方法测试,8进制
	 * {@link Long#toUnsignedString(long)}方法测试,10进制
	 * {@link Long#toHexString(long)}方法测试,16进制
	 */
	private static void toStringByRadix() {
		System.out.println("Long.toBinaryString([long]45):" + Long.toBinaryString(45));
		System.out.println("Long.toOctalString([long]45):" + Long.toOctalString(45));
		System.out.println("Long.toHexString([long]45):" + Long.toHexString(45));
		System.out.println("Long.toBinaryString([long]45):" + Long.toBinaryString(-45));
		System.out.println("Long.toOctalString([long]45):" + Long.toOctalString(-45));
		System.out.println("Long.toHexString([long]45):" + Long.toHexString(-45));
	}

	/**
	 * {@link Long#toUnsignedString(long, int)}方法测试
	 */
	private static void toUnsignedString() {
		System.out.println("Long.toString([long]-1233746575L,[int]2) : " + Long.toUnsignedString(-1233746575L, 2));
		System.out.println("Long.toString([long]-1233746575L,[int]4) : " + Long.toUnsignedString(-1233746575L, 4));
		System.out.println("Long.toString([long]-1233746575L,[int]8) : " + Long.toUnsignedString(-1233746575L, 8));
		System.out.println("Long.toString([long]-1233746575L,[int]16) : " + Long.toUnsignedString(-1233746575L, 16));
		System.out.println("Long.toString([long]-1233746575L,[int]32) : " + Long.toUnsignedString(-1233746575L, 32));
		System.out.println("Long.toString([long]-1233746575L,[int]10) : " + Long.toUnsignedString(-1233746575L, 10));

		System.out.println("Long.toString([long]1233746575L,[int]2) : " + Long.toUnsignedString(1233746575L, 2));
		System.out.println("Long.toString([long]1233746575L,[int]4) : " + Long.toUnsignedString(1233746575L, 4));
		System.out.println("Long.toString([long]1233746575L,[int]8) : " + Long.toUnsignedString(1233746575L, 8));
		System.out.println("Long.toString([long]1233746575L,[int]16) : " + Long.toUnsignedString(1233746575L, 16));
		System.out.println("Long.toString([long]1233746575L,[int]32) : " + Long.toUnsignedString(1233746575L, 32));
		System.out.println("Long.toString([long]1233746575L,[int]10) : " + Long.toUnsignedString(1233746575L, 10));
	}

	/**
	 * {@link Long#numberOfLeadingZeros(long)}方法测试
	 */
	private static void numberOfLeadingZeros() {
		System.out.println("Long.numberOfLeadingZeros([long]23L)) ：" + Long.numberOfLeadingZeros(23L));
		System.out.println("Long.numberOfLeadingZeros([long]1L)) ：" + Long.numberOfLeadingZeros(1L));
		System.out.println("Long.numberOfLeadingZeros([long]234L)) ：" + Long.numberOfLeadingZeros(234L));
		System.out.println("Long.numberOfLeadingZeros([long]2345L)) ：" + Long.numberOfLeadingZeros(2345L));
		System.out.println("Long.numberOfLeadingZeros([long]23456L)) ：" + Long.numberOfLeadingZeros(23456L));
		System.out.println("Long.numberOfLeadingZeros([long]-23L)) ：" + Long.numberOfLeadingZeros(-23L));
		System.out.println("Long.numberOfLeadingZeros([long]-1L)) ：" + Long.numberOfLeadingZeros(-1L));
		System.out.println("Long.numberOfLeadingZeros([long]-234L)) ：" + Long.numberOfLeadingZeros(-234L));
		System.out.println("Long.numberOfLeadingZeros([long]-2345L)) ：" + Long.numberOfLeadingZeros(-2345L));
		System.out.println("Long.numberOfLeadingZeros([long]-23456L)) ：" + Long.numberOfLeadingZeros(-23456L));
	}

	/**
	 * {@link Long#getLong(String)}方法测试
	 * {@link Long#getLong(String, long)}方法测试
	 */
	private static void getLong() {
		System.out.println("Long.getLong([String]1213) :" + Long.getLong("1213"));
		System.out.println("Long.getLong([String]1213,123L) : " + Long.getLong("1223", 123L));
	}

	@Override
	protected void constructorsOfThis() {
		Long tlong = new Long(123);
	}

	public static void main(String[] args) throws Exception {
		TestTemplateUtil.execTemplate(new LongDemo());
	}
}

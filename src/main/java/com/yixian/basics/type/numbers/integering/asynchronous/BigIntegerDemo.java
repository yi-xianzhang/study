package com.yixian.basics.type.numbers.integering.asynchronous;

import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

import java.math.BigInteger;
import java.util.Random;

/**
 * {@link Byte}类：byte的包装器类型。
 * ---> {@link Number}抽象类。
 * ----> {@link Comparable<Byte>}类，用来比较大小。
 *
 * @author Administrator
 * @since 1.1
 */
public class BigIntegerDemo extends AbstractTestTemplate<BigInteger> {

	@Override
	protected void instanceMethodsOfThis() throws Exception {
		BigInteger bigInteger = new BigInteger("12");
		System.out.println(bigInteger);
	}

	@Override
	protected void staticMethodsOfThis() throws Exception {
		System.out.println("BigInteger.valueOf([long]12345678899L) : " + BigInteger.valueOf(12345678899L));
		System.out.println("BigInteger.probablePrime(12, new Random())" + BigInteger.probablePrime(12, new Random()));
	}

	@Override
	protected void constructorsOfThis() {

	}

	public static void main(String[] args) throws Exception {
		TestTemplateUtil.execTemplate(new BigIntegerDemo());
	}
}

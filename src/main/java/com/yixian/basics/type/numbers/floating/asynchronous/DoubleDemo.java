package com.yixian.basics.type.numbers.floating.asynchronous;

import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

/**
 * {@link Double}类：double的包装器类型。
 * ---> {@link Number}抽象类，
 * ----> {@link Comparable<Double>}类，用来比较大小。
 *
 * @author Administrator
 * @since 1.1
 */

public class DoubleDemo extends AbstractTestTemplate<Double> {

	@Override
	protected void instanceMethodsOfThis() throws Exception {

	}

	@Override
	protected void staticMethodsOfThis() throws Exception {
		System.out.println(Double.valueOf("34.34"));
	}

	@Override
	protected void constructorsOfThis() {

	}

	public static void main(String[] args) throws Exception {
		TestTemplateUtil.execTemplate(new DoubleDemo());
	}

}

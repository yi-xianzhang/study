package com.yixian.basics.type.wrapper.numbers.integering.synchronize;

import com.yixian.util.test.impl.AbstractTestTemplate;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 包装器{@link Integer}的线程安全类{@link AtomicInteger}。
 * 安全机制为CAS。
 */
public class AtomicIntegerDemo extends AbstractTestTemplate<AtomicInteger> {

	volatile AtomicInteger atomicInteger = new AtomicInteger(25);

	@Override
	protected void instanceMethodsOfThis() throws Exception {
	}

	@Override
	protected void staticMethodsOfThis() throws Exception {

	}

	@Override
	protected void constructorsOfThis() {
	}

}
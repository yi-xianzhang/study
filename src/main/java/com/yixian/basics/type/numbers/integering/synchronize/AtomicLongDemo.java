package com.yixian.basics.type.numbers.integering.synchronize;

import com.yixian.util.test.impl.AbstractTestTemplate;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 包装器{@link Long}的线程安全类{@link AtomicLong}。
 * 安全机制为CAS。
 */
public class AtomicLongDemo extends AbstractTestTemplate<AtomicLong> {

	volatile AtomicLong atomicInteger = new AtomicLong(25);

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
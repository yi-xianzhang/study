package com.yixian.util.test.impl;

import com.yixian.util.test.TestTemplate;

import java.lang.reflect.Constructor;

public abstract class AbstractTestTemplate<T> implements TestTemplate {

	private boolean instanceMethodsFlag = true;

	private boolean staticMethodsOfThisFlag = true;

	private boolean constructorsFlag = true;

	public boolean isInstanceMethodsFlag() {
		return instanceMethodsFlag;
	}

	public boolean isStaticMethodsOfThisFlag() {
		return staticMethodsOfThisFlag;
	}

	public boolean isConstructorsFlag() {
		return constructorsFlag;
	}

	public void setConstructorsFlag(boolean constructorsFlag) {
		this.constructorsFlag = constructorsFlag;
	}

	public void setInstanceMethodsFlag(boolean instanceMethodsFlag) {
		this.instanceMethodsFlag = instanceMethodsFlag;
	}

	public void setStaticMethodsOfThisFlag(boolean staticMethodsOfThisFlag) {
		this.staticMethodsOfThisFlag = staticMethodsOfThisFlag;
	}

	@Override
	public void instanceMethods() throws Exception {
		if (!instanceMethodsFlag)
			return;
		System.out.println("-----------------------Start------成员方法测试" +
			getClassType() + "--------------------------");
		instanceMethodsOfThis();
		System.out.println("-------------------------END------成员方法测试" +
			getClassType() + "--------------------------");
	}

	protected abstract void instanceMethodsOfThis() throws Exception;

	@Override
	public void staticMethods() throws Exception {
		if (!staticMethodsOfThisFlag)
			return;
		System.out.println("-----------------------Start------静态方法测试" +
			getClassType() + "--------------------------");
		staticMethodsOfThis();
		System.out.println("-------------------------END------静态方法测试" +
			getClassType() + "--------------------------");

	}

	/**
	 * 静态方法测试。
	 *
	 * @throws Exception
	 */
	protected abstract void staticMethodsOfThis() throws Exception;

	protected String getClassType() {

		String args = this.getClass().getTypeName().replaceAll(
			"Demo", "");
		return args;
	}

	@Override
	public void constructors()
		throws InstantiationException, IllegalAccessException {

		if (!constructorsFlag)
			return;
		System.out.println("--------------------------Start------构造器测试" +
			getClassType() + "-------------------------");
		constructorsOfThis();
		System.out.println("--------------------------END------构造器测试" +
			getClassType() + "---------------------------");

	}

	protected abstract void constructorsOfThis()
		throws IllegalAccessException, InstantiationException;

	protected boolean constructorsFlag(Class t) {

		Constructor[] constructors = t.getClass().getConstructors();
		if (constructors.length > 0) {
			return true;
		}
		return false;

	}

}

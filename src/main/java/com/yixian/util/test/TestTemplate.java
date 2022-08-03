package com.yixian.util.test;

public interface TestTemplate<T> {


	/**
	 * 静态方法测试。<br/>
	 */
	public void instanceMethods() throws Exception;

	/**
	 * 对象方法测试。<br/>
	 */
	public void staticMethods() throws Exception;

	public void constructors() throws Exception;

	default void testExec() throws Exception {
		staticMethods();
		constructors();
		instanceMethods();
	}

	default String getType(T t) {
		return t.getClass().getTypeName();
	}
}

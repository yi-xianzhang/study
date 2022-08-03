package com.yixian.util.aboutmethod;

public enum MethodType {

	/**
	 * 方法的修饰符为public
	 */
	PUBLIC_METHOD_TYPE(0, "public"),

	/**
	 * 方法的修饰符为 protected
	 */
	PROTECTED_METHOD_TYPE(1, "protected"),

	/**
	 * 方法的修饰符为 default
	 */
	DEFAULT_METHOD_TYPE(2, "default"),

	/**
	 * 方法的修饰符为 private
	 */
	PRIVATE_METHOD_TYPE(3, "private"),

	/**
	 * 方法的修饰符为 static
	 */
	STATIC_METHOD_TYPE(4, "static"),

	/**
	 * 方法的修饰符为 void
	 */
	VOID_METHOD_TYPE(5, "void"),

	/**
	 * 方法的修饰符为 native
	 */
	NATIVE_METHOD_TYPE(6, "native"),

	/**
	 * 方法的修饰符为 synchronized
	 */
	SYNCHRONIZED_METHOD_TYPE(7, "synchronized"),

	/**
	 * 方法的修饰符为 final
	 */
	FINAL_METHOD_TYPE(8, "final"),

	/**
	 * 方法的修饰符为 abstract
	 */
	ABSTRACT_METHOD_TYPE(9, "abstract");

	private final int code;

	private final String name;

	private MethodType(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getCode() {
		return code;
	}
}

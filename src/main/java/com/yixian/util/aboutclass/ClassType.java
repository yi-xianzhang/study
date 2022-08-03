package com.yixian.util.aboutclass;

public enum ClassType {

	/**
	 * 类型为类
	 */
	CLASS_TYPE("0", "class"),
	/**
	 * 类型为接口
	 */
	INTERFACE_TYPE("1", "interface"),

	/**
	 * 类型为接口
	 */
	ENUM_TYPE("2", "enum");

	private final String code;

	private final String name;

	private ClassType(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public boolean equals(ClassType classType) {
		if (classType == null) return false;
		return this.code.equals(classType.code);
	}
}

package com.yixian.basics.enums;

@SuppressWarnings("all")
public enum Education {

	PRIMARY(1, "初级"),

	MIDDLE(2, "中级"),

	HIGH(3, "高级");


	private final int code;


	private final String name;

	public static <T extends Enum<T>> T valueOf(Class<T> enumType,
	                                            String code) {
		return Enum.valueOf(enumType, code);
	}

	Education(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static Education getInstance(int code) {
		if (PRIMARY.code == code) {
			return PRIMARY;
		} else if (MIDDLE.code == code) {
			return MIDDLE;
		} else if (HIGH.code == code) {
			return HIGH;
		} else {
			throw new IllegalStateException("code参数值是" + code + "," +
				"而实际要求的是" + getValidCode());
		}
	}

	public static String getValidCode() {
		StringBuilder validCodes = new StringBuilder("{");
		validCodes.append(PRIMARY.code);
		validCodes.append(",").append(MIDDLE.code);
		validCodes.append(",").append(HIGH.code);
		validCodes.append("}");
		return validCodes.toString();
	}

	@Override
	public String toString() {
		return "Education{" +
				"code=" + code +
				", name='" + name + '\'' +
				'}';
	}
}

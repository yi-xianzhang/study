package com.yixian.basics.enums;

@SuppressWarnings("all")
public enum Gender {

	MALE(1, "男"),
	FEMALE(2, "女");

	private int code;
	private String name;

	Gender(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static Gender getInstance(int code) {
		if (MALE.code == code) {
			return MALE;
		} else if (FEMALE.code == code) {
			return FEMALE;
		} else {
			throw new IllegalStateException("code参数值是" + code +
				",而实际要求的是" + getValidCode());
		}
	}

	public static String getValidCode() {
		StringBuffer validCodes = new StringBuffer("{");
		validCodes.append(MALE.code);
		validCodes.append("," + FEMALE.code);
		validCodes.append("}");
		return validCodes.toString();
	}

	@Override
	public String toString() {
		return "Gender{" +
			"code=" + code +
			", name='" + name + '\'' +
			'}';
	}


}

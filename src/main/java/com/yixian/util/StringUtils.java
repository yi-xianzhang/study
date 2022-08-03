package com.yixian.util;

public final class StringUtils {

	/**
	 * 数字
	 */
	private final static char[] digital = "零一二三四五六七八九".toCharArray();

	/**
	 * 数字单位
	 */
	private final static char[] unit = "京兆亿万千百十".toCharArray();

	/**
	 * 参数str为null或者""时，返回true，否则，返回false
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		return str == null || str.trim().length() == 0;
	}

	/**
	 * 参数str为null或者""时，返回false，否则，返回true
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}

	/**
	 * 判断两个字符串是否相等。
	 *
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean stringEquals(String str1, String str2) {
		return contentEquals(str1, str2, false);
	}

	/**
	 * 判断两个字符串是否相等。
	 *
	 * @param str1
	 * @param str2
	 * @param trimFlag
	 * @return
	 */
	public static boolean contentEquals(String str1, String str2,
	                                    boolean trimFlag) {
		if (str1 == str2)
			return true;

		if (str1 == null || str2 == null)
			return false;

		if ((trimFlag && str1.trim().equals(str2.trim())) ||
			(!trimFlag && str1.equals(str2)))
			return true;
		return false;
	}


	/**
	 * 判断{@link String}型是否为空
	 *
	 * @param str {@link String}
	 * @return {@link Boolean} true: 空，false : 非空
	 */
	public static boolean isBlank(String str) {
		int strLen;
		if (str == null || (strLen = str.length()) == 0) {
			return true;
		}
		for (int i = 0; i < strLen; i++) {
			if ((Character.isWhitespace(str.charAt(i)) == false)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 判断{@link String}型是否为空
	 *
	 * @param str {@link String}
	 * @return {@link Boolean} false: 空，true : 非空
	 */
	public static boolean isNotBlank(String str) {
		return !isBlank(str);
	}

	/**
	 * 将数字转换成字符串，例如输入1，返回“一”。
	 *
	 * @param number    数字
	 * @return          {@link String}
	 */
	public static String numberConvert2Chinese(int number) {

		String srcBase = String.valueOf(number);
		StringBuffer result = new StringBuffer();
		return result.toString();
	}


}

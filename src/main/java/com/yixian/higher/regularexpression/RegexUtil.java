package com.yixian.higher.regularexpression;

/**
 * 正则表达式工具类。</br>
 *
 * @author Administrator
 */
public interface RegexUtil {

	/**
	 * 匹配数字
	 */
	String NUMBER_REGEX = "([1-9]\\d*\\.?\\d*)|(0\\.\\d*[1-9])";

	/**
	 * 匹配汉字，不包括符号
	 */
	String CH_CN_REGEX = "[\u4E00-\u9FA5]+";




}
